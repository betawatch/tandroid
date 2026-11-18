package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class t extends Thread {
    public final h a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final int d;
    public final b3.j e;
    public final b3.j f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, b3.j jVar, b3.j jVar2) {
        this.a = hVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i7;
        this.e = jVar;
        this.f = jVar2;
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            try {
                if (((CountDownLatch) this.f.c).getCount() == 0) {
                    return;
                }
                this.a.a(exc);
                ((CountDownLatch) this.f.c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        synchronized (this.a) {
            try {
                if (((CountDownLatch) this.f.c).getCount() == 0) {
                    return;
                }
                this.a.b(this, socket);
                ((CountDownLatch) this.f.c).countDown();
            } finally {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            b3.j jVar = this.e;
            if (jVar != null) {
                ((CountDownLatch) jVar.c).await(jVar.b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.a;
            synchronized (hVar) {
                z10 = ((Socket) hVar.c) != null;
            }
            if (z10) {
                return;
            }
            Socket createSocket = this.b.createSocket();
            int i7 = r.a;
            createSocket.connect(this.c, this.d);
            b(createSocket);
        } catch (Exception e10) {
            a(e10);
            if (0 != 0) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
