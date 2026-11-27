// default package

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yna extends Thread {
    public final u8a a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final short d;
    public final ed e;
    public final ed f;

    /* JADX WARN: Multi-variable type inference failed */
    public yna(u8a u8aVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i, ed edVar, ed edVar2) {
        this.a = u8aVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i;
        this.e = edVar;
        this.f = edVar2;
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            if (((CountDownLatch) this.f.c).getCount() == 0) {
                return;
            }
            this.a.H(exc);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    public final void b(Socket socket) {
        synchronized (this.a) {
            if (((CountDownLatch) this.f.c).getCount() == 0) {
                return;
            }
            this.a.J(this, socket);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        Socket socket = null;
        try {
            ed edVar = this.e;
            if (edVar != null) {
                ((CountDownLatch) edVar.c).await(edVar.b, TimeUnit.MILLISECONDS);
            }
            u8a u8aVar = this.a;
            synchronized (u8aVar) {
                z = ((Socket) u8aVar.c) != null;
            }
            if (z) {
                return;
            }
            Socket createSocket = this.b.createSocket();
            int i = as9.a;
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
