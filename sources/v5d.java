// default package

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class v5d implements fg0 {
    public final WeakReference a;
    public final zn b;
    public final boolean c;

    public v5d(a6d a6dVar, zn znVar, boolean z) {
        this.a = new WeakReference(a6dVar);
        this.b = znVar;
        this.c = z;
    }

    @Override // fg0
    public final void a(ws2 ws2Var) {
        a6d a6dVar = (a6d) this.a.get();
        if (a6dVar == null) {
            return;
        }
        ReentrantLock reentrantLock = a6dVar.b;
        xve.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == a6dVar.a.o.h);
        reentrantLock.lock();
        try {
            if (a6dVar.i(0)) {
                if (!ws2Var.c()) {
                    a6dVar.e(ws2Var, this.b, this.c);
                }
                if (a6dVar.j()) {
                    a6dVar.b();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
