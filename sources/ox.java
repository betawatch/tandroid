// default package

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ox implements Runnable {
    public static Handler f;
    public final /* synthetic */ m8d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final ug7 a = new ug7(this, new tg7(this, 0));

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
