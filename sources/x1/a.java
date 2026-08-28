package x1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import d7.p;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.d;
import org.telegram.ui.fm;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public static Handler f;
    public final /* synthetic */ d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b a = new b(this, new p(this, 10));

    public a(d dVar) {
        this.e = dVar;
    }

    public final void a() {
        d dVar = this.e;
        Iterator it = dVar.j.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (((m) it.next()).d(dVar)) {
                i9++;
            }
        }
        try {
            dVar.i.tryAcquire(i9, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new fm(8, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b();
    }
}
