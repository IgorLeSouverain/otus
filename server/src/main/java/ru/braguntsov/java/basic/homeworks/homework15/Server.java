package ru.braguntsov.java.basic.homeworks.homework15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private int port;
    private List<ClientHandler> clients;

    public Server(int port) {
        this.port = port;
        this.clients = new ArrayList<>();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.printf("Сервер запущен на порту: %d, ожидаем подключения клиентов\n", port);
            while (true) {
                Socket socket = serverSocket.accept();
                clients.add(new ClientHandler(socket, this));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public synchronized void subscribe(ClientHandler clientHandler) {
        clients.add(clientHandler);
    }

    public synchronized void unsubscribe(ClientHandler clientHandler) {
        clients.remove(clientHandler);
    }

    public synchronized void broadcastMessage(String message) {
        for (ClientHandler c : clients) {
            c.sendMessage(message);
        }
    }

    public synchronized void sendMessageToUser(String message) {
        for (ClientHandler c : clients) {
            if (c.getUsername().equals(message.split(" ")[1])) {
                c.sendMessage(message.replace("/w " + message.split(" ")[1] + " ", ""));
            }
        }
    }
}
