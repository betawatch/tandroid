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
import td.z1;
import th.m1;
import x7.g8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p {
    public final Context a;
    public final s b;
    public final g8 c;
    public u9.b d;
    public u9.b e;
    public n f;
    public final v g;
    public final ca.c h;
    public final t9.a i;
    public final t9.a j;
    public final ExecutorService k;
    public final xa.n l;
    public final j m;
    public final u9.a n;
    public final n2.u o;

    public p(l9.h hVar, v vVar, u9.a aVar, s sVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, n2.u uVar) {
        this.b = sVar;
        hVar.a();
        this.a = hVar.a;
        this.g = vVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = cVar;
        xa.n nVar = new xa.n();
        nVar.b = Tasks.forResult(null);
        nVar.c = new Object();
        nVar.d = new ThreadLocal();
        nVar.a = executorService;
        executorService.execute(new u0.b(nVar, 3));
        this.l = nVar;
        this.m = jVar;
        this.o = uVar;
        System.currentTimeMillis();
        this.c = new g8();
    }

    public static Task a(p pVar, ea.d dVar) {
        Task forException;
        o oVar;
        xa.n nVar = pVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) nVar.d).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        pVar.d.b();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                pVar.i.a(new m1(20));
                pVar.f.g();
                if (dVar.d().b.a) {
                    if (!pVar.f.d(dVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    forException = pVar.f.h(((TaskCompletionSource) ((AtomicReference) dVar.i).get()).getTask());
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
            nVar.Y(oVar);
            return forException;
        } catch (Throwable th2) {
            nVar.Y(new o(pVar, 0));
            throw th2;
        }
    }

    public final void b(ea.d dVar) {
        Future<?> submit = this.k.submit(new z1(this, dVar, false, 12));
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
