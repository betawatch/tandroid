package uc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class t extends Thread {
    public final h a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final int d;
    public final d5.z e;
    public final d5.z f;

    public t(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, d5.z zVar, d5.z zVar2) {
        this.a = hVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i10;
        this.e = zVar;
        this.f = zVar2;
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
            d5.z zVar = this.e;
            if (zVar != null) {
                ((CountDownLatch) zVar.c).await(zVar.b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.a;
            synchronized (hVar) {
                z10 = ((Socket) hVar.c) != null;
            }
            if (z10) {
                return;
            }
            Socket createSocket = this.b.createSocket();
            int i10 = r.a;
            createSocket.connect(this.c, this.d);
            b(createSocket);
        } catch (Exception e) {
            a(e);
            if (0 != 0) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
