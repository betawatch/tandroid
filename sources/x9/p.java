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
import ji.w4;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class p {
    public final Context a;
    public final s b;
    public final n3.b c;
    public l d;
    public l e;
    public n f;
    public final v g;
    public final ca.c h;
    public final t9.a i;
    public final t9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.s l;
    public final j m;
    public final u9.a n;
    public final w4 o;

    public p(l9.h hVar, v vVar, u9.a aVar, s sVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, w4 w4Var) {
        this.b = sVar;
        hVar.a();
        this.a = hVar.a;
        this.g = vVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = cVar;
        this.l = new com.google.firebase.messaging.s(executorService);
        this.m = jVar;
        this.o = w4Var;
        System.currentTimeMillis();
        this.c = new n3.b(27);
    }

    public static Task a(p pVar, ea.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.s sVar = pVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) sVar.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        pVar.d.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                pVar.i.a(new t0.a(23));
                pVar.f.g();
                if (bVar.d().b.a) {
                    if (!pVar.f.d(bVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    forException = pVar.f.h(((TaskCompletionSource) ((AtomicReference) bVar.i).get()).getTask());
                    oVar = new o(pVar, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    oVar = new o(pVar, 0);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                forException = Tasks.forException(e);
                oVar = new o(pVar, 0);
            }
            sVar.v(oVar);
            return forException;
        } catch (Throwable th2) {
            sVar.v(new o(pVar, 0));
            throw th2;
        }
    }

    public final void b(ea.b bVar) {
        Future<?> submit = this.k.submit(new s9.j(14, this, bVar));
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
