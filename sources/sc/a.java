package sc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;
import p4.r;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final InputStream a;
    public final Socket b;
    public final /* synthetic */ j c;

    public a(j jVar, InputStream inputStream, Socket socket) {
        this.c = jVar;
        this.a = inputStream;
        this.b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.a;
        j jVar = this.c;
        Socket socket = this.b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d dVar = new d(jVar, new r(1), this.a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dVar.c();
            }
            j.d(outputStream);
        } catch (Exception e7) {
            e = e7;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                j.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            j.d(outputStream2);
            j.d(inputStream);
            j.d(socket);
            ((List) jVar.c.c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            j.d(outputStream2);
            j.d(inputStream);
            j.d(socket);
            ((List) jVar.c.c).remove(this);
            throw th;
        }
        j.d(inputStream);
        j.d(socket);
        ((List) jVar.c.c).remove(this);
    }
}
