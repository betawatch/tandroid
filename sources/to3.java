// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class to3 extends Thread {
    public volatile Handler a;
    public final Object b = new Object();
    public ArrayList c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int e = -1000;

    public to3(String str) {
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                this.a.removeCallbacks(runnable);
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((so3) this.c.get(size)).b == runnable) {
                    this.c.remove(size);
                }
            }
        }
    }

    public final Handler b() {
        try {
            this.d.await();
        } catch (Exception e) {
            cc4.g(e, false);
        }
        return this.a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j) {
        Handler handler = this.a;
        if (handler != null) {
            return j <= 0 ? handler.post(runnable) : handler.postDelayed(runnable, j);
        }
        long max = Math.max(0L, j) + SystemClock.uptimeMillis();
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                return this.a.postAtTime(runnable, max);
            }
            arrayList.add(new so3(0, max, runnable));
            return true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new ro3());
        synchronized (this.b) {
            for (int i = 0; i < this.c.size(); i++) {
                so3 so3Var = (so3) this.c.get(i);
                boolean z = so3Var.a;
                if (!z) {
                    handler.postAtTime(so3Var.b, so3Var.c);
                } else if (z) {
                    handler.postAtFrontOfQueue(so3Var.b);
                } else {
                    handler.sendMessageAtTime(null, so3Var.c);
                }
            }
            this.c = null;
            this.a = handler;
        }
        this.d.countDown();
        int i2 = this.e;
        if (i2 != -1000) {
            Process.setThreadPriority(i2);
        }
        Looper.loop();
    }
}
