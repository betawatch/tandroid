// default package

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ox implements Runnable {
    public static Handler f;
    public final /* synthetic */ m8d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final vg7 a = new vg7(this, new ug7(this, 0));

    public ox(m8d m8dVar) {
        this.e = m8dVar;
    }

    public final void a() {
        m8d m8dVar = this.e;
        Iterator it = m8dVar.j.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((m05) it.next()).a(m8dVar)) {
                i++;
            }
        }
        try {
            m8dVar.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (ox.class) {
            handler = f;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                f = handler;
            }
        }
        handler.post(new iqd((Object) this, obj, false, (byte) 7));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a();
    }
}
