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
import ki.e0;
import org.telegram.ui.Cells.f3;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class p {
    public final Context a;
    public final s b;
    public final m5.e c;
    public f3 d;
    public f3 e;
    public n f;
    public final v g;
    public final ba.c h;
    public final s9.a i;
    public final s9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.t l;
    public final j m;
    public final t9.a n;
    public final e0 o;

    public p(k9.h hVar, v vVar, t9.a aVar, s sVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, e0 e0Var) {
        this.b = sVar;
        hVar.a();
        this.a = hVar.a;
        this.g = vVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = cVar;
        this.l = new com.google.firebase.messaging.t(executorService);
        this.m = jVar;
        this.o = e0Var;
        System.currentTimeMillis();
        this.c = new m5.e(29, (byte) 0);
    }

    public static Task a(p pVar, da.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.t tVar = pVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        pVar.d.n();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                pVar.i.a(new s0.b(28));
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
            tVar.k(oVar);
            return forException;
        } catch (Throwable th2) {
            tVar.k(new o(pVar, 0));
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
