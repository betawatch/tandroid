package z9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p {
    public final Context a;
    public final s b;
    public final ua.b c;
    public w9.b d;
    public w9.b e;
    public m f;
    public final v g;
    public final fa.f h;
    public final v9.a i;
    public final v9.a j;
    public final i k;
    public final w9.a l;
    public final nh m;
    public final aa.g n;

    public p(n9.h hVar, v vVar, w9.a aVar, s sVar, v9.a aVar2, v9.a aVar3, fa.f fVar, i iVar, nh nhVar, aa.g gVar) {
        this.b = sVar;
        hVar.a();
        this.a = hVar.a;
        this.g = vVar;
        this.l = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.h = fVar;
        this.k = iVar;
        this.m = nhVar;
        this.n = gVar;
        System.currentTimeMillis();
        this.c = new ua.b();
    }

    public final void a(ha.c cVar) {
        aa.g.a();
        aa.g.a();
        this.d.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.i.a(new j(1));
                this.f.i();
                if (!cVar.b().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f.f(cVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f.j(((TaskCompletionSource) ((AtomicReference) cVar.i).get()).getTask());
                c();
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(ha.c cVar) {
        Future<?> submit = this.n.a.a.submit(new n(this, cVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        aa.g.a();
        try {
            w9.b bVar = this.d;
            fa.f fVar = (fa.f) bVar.c;
            String str = (String) bVar.b;
            fVar.getClass();
            if (new File((File) fVar.d, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
