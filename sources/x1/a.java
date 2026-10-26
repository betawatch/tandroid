package x1;

import a8.gg;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b6.d;
import com.google.android.gms.common.api.m;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import t9.i;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public static Handler f;
    public final /* synthetic */ d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b a = new b(this, new gg(this, 7));

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
        handler.post(new i(6, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b();
    }
}
