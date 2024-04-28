package ru.braguntsov.java.basic.homeworks.homework13;

import javax.xml.crypto.Data;
import java.io.*;

public class ExampleClient implements AutoCloseable {
    private final DataInputStream dataInputStream;
    private final DataOutputStream dataOutputStream;

    public ExampleClient(InputStream dataInputStream, OutputStream dataOutputStream) {
        this.dataInputStream = new DataInputStream(dataInputStream);
        this.dataOutputStream = new DataOutputStream(dataOutputStream);
    }

    public void send(String userMessage) throws IOException {
        dataOutputStream.writeUTF(userMessage);
        dataOutputStream.flush();
        String result = dataInputStream.readUTF();
        System.out.println(result);
    }

    @Override
    public void close() throws Exception {
        dataInputStream.close();
        dataOutputStream.close();
    }
}
