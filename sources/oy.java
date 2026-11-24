// default package

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oy implements Runnable {
    public static Handler f;
    public final /* synthetic */ x5d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final ng7 a = new ng7(this, new mg7(this, 0));

    public oy(x5d x5dVar) {
        this.e = x5dVar;
    }

    public final void a() {
        x5d x5dVar = this.e;
        Iterator it = x5dVar.j.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((h05) it.next()).a(x5dVar)) {
                i++;
            }
        }
        try {
            x5dVar.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (oy.class) {
            handler = f;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                f = handler;
            }
        }
        handler.post(new tnd((Object) this, obj, false, (byte) 7));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a();
    }
}
