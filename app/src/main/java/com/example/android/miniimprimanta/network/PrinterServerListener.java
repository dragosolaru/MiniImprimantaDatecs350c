package com.example.android.miniimprimanta.network;

import java.net.Socket;

public interface PrinterServerListener {
    public void onConnect(Socket socket);
}
