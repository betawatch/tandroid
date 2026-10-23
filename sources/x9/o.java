package x9;

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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class o {
    public final Context a;
    public final r b;
    public final n2.e c;
    public mi.q d;
    public mi.q e;
    public m f;
    public final u g;
    public final ca.c h;
    public final t9.a i;
    public final t9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.r l;
    public final j m;
    public final u9.a n;
    public final te.b o;

    public o(l9.h hVar, u uVar, u9.a aVar, r rVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, te.b bVar) {
        this.b = rVar;
        hVar.a();
        this.a = hVar.a;
        this.g = uVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = cVar;
        this.l = new com.google.firebase.messaging.r(executorService);
        this.m = jVar;
        this.o = bVar;
        System.currentTimeMillis();
        this.c = new n2.e(27);
    }

    public static Task a(o oVar, ea.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.r rVar = oVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) rVar.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        oVar.d.C();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                oVar.i.a(new v0.k(9));
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
            rVar.v(nVar);
            return forException;
        } catch (Throwable th2) {
            rVar.v(new n(oVar, 0));
            throw th2;
        }
    }

    public final void b(ea.b bVar) {
        Future<?> submit = this.k.submit(new s9.i(14, this, bVar));
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
