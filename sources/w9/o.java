package w9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import n7.z0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class o {
    public final Context a;
    public final r b;
    public final o0.a c;
    public z0 d;
    public z0 e;
    public m f;
    public final u g;
    public final ba.c h;
    public final s9.a i;
    public final s9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.t l;
    public final j m;
    public final t9.a n;
    public final l.d o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l.d dVar) {
        this.b = rVar;
        hVar.a();
        this.a = hVar.a;
        this.g = uVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = cVar;
        this.l = new com.google.firebase.messaging.t(executorService);
        this.m = jVar;
        this.o = dVar;
        System.currentTimeMillis();
        this.c = new o0.a();
    }

    public static Task a(o oVar, da.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.t tVar = oVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        oVar.d.o();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                oVar.i.a(new s9.b(22));
                oVar.f.g();
                if (bVar.d().b.a) {
                    if (!oVar.f.d(bVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    forException = oVar.f.h(((TaskCompletionSource) ((AtomicReference) bVar.i).get()).getTask());
                    nVar = new n(oVar, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    nVar = new n(oVar, 0);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                forException = Tasks.forException(e);
                nVar = new n(oVar, 0);
            }
            tVar.k(nVar);
            return forException;
        } catch (Throwable th2) {
            tVar.k(new n(oVar, 0));
            throw th2;
        }
    }

    public final void b(da.b bVar) {
        Future<?> submit = this.k.submit(new u4.e(5, this, bVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e7) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e7);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }
}
