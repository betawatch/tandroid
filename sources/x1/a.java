package x1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import h2.f;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.d;
import org.telegram.ui.az;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public static Handler f;
    public final /* synthetic */ d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b a = new b(this, new f(this, 10));

    public a(d dVar) {
        this.e = dVar;
    }

    public final void a() {
        d dVar = this.e;
        Iterator it = dVar.j.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((m) it.next()).d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new az(11, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b();
    }
}
