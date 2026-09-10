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
import n7.a1;
import og.u0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o {
    public final Context a;
    public final r b;
    public final u0 c;
    public a1 d;
    public a1 e;
    public m f;
    public final u g;
    public final ba.c h;
    public final s9.a i;
    public final s9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.s l;
    public final j m;
    public final t9.a n;
    public final l2.g o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l2.g gVar) {
        this.b = rVar;
        hVar.a();
        this.a = hVar.a;
        this.g = uVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = cVar;
        this.l = new com.google.firebase.messaging.s(executorService);
        this.m = jVar;
        this.o = gVar;
        System.currentTimeMillis();
        this.c = new u0();
    }

    public static Task a(o oVar, da.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.s sVar = oVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) sVar.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        oVar.d.C();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                oVar.i.a(new u2.c(12));
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
            sVar.o(nVar);
            return forException;
        } catch (Throwable th2) {
            sVar.o(new n(oVar, 0));
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
