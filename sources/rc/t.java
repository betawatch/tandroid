package rc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class t extends Thread {
    public final h a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final int d;
    public final f5.u e;
    public final f5.u f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i7, f5.u uVar, f5.u uVar2) {
        this.a = hVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i7;
        this.e = uVar;
        this.f = uVar2;
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
        boolean z9;
        Socket socket = null;
        try {
            f5.u uVar = this.e;
            if (uVar != null) {
                ((CountDownLatch) uVar.c).await(uVar.b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.a;
            synchronized (hVar) {
                z9 = ((Socket) hVar.c) != null;
            }
            if (z9) {
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
