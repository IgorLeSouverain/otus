package ru.braguntsov.java.basic.homeworks.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        while (true) {
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            outputStream.writeUTF("Available math operation are: -, +, /, * \n Type two numbers and one math operand to calculate the result");
            String userInput = inputStream.readUTF();
            String result = transform(userInput);
            outputStream.writeUTF(result);
            outputStream.flush();
        }
    }
    public static String transform(String input) {
        String[] arr = input.split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);
        String operand = arr[2];
        switch (operand) {
            case "-" -> {
                return String.valueOf(num1 - num2);
            }
            case "+" -> {
                return String.valueOf(num1 + num2);
            }
            case "/" -> {
                return String.valueOf(num1 / num2);
            }
            case "*" -> {
                return String.valueOf(num1 * num2);
            }
        }
        return null;
    }
}
