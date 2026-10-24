package tc;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class h {
    public static final String[] e = {"Connection", "Upgrade"};
    public static final String[] f = {"Upgrade", "websocket"};
    public static final String[] g = {"Sec-WebSocket-Version", "13"};
    public Object a;
    public Serializable b;
    public Object c;
    public Serializable d;

    public synchronized void a(Exception exc) {
        try {
            CountDownLatch countDownLatch = (CountDownLatch) this.a;
            if (countDownLatch == null || ((ArrayList) this.b) == null) {
                throw new IllegalStateException("Cannot set exception before awaiting!");
            }
            if (((Exception) this.d) == null) {
                this.d = exc;
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(t tVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.a) == null || (arrayList = (ArrayList) this.b) == null) {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
        if (((Socket) this.c) == null) {
            this.c = socket;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                t tVar2 = (t) obj;
                if (tVar2 != tVar) {
                    tVar2.a(new InterruptedException());
                    tVar2.interrupt();
                }
            }
        } else {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        ((CountDownLatch) this.a).countDown();
    }
}
