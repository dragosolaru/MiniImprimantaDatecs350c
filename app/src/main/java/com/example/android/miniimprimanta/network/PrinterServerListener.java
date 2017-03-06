package com.example.android.miniimprimanta.network;

import java.net.Socket;

public interface PrinterServerListener {
    void onConnect(Socket socket);
}
