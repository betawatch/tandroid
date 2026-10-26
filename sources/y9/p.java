package y9;

import aa.b0;
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
import org.telegram.ui.Components.cy0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class p {
    public final Context a;
    public final s b;
    public final l c;
    public m4.c d;
    public m4.c e;
    public n f;
    public final v g;
    public final da.c h;
    public final u9.a i;
    public final u9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.q l;
    public final j m;
    public final v9.a n;
    public final t6.f o;

    public p(m9.h hVar, v vVar, v9.a aVar, s sVar, u9.a aVar2, u9.a aVar3, da.c cVar, ExecutorService executorService, j jVar, t6.f fVar) {
        this.b = sVar;
        hVar.a();
        this.a = hVar.a;
        this.g = vVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = cVar;
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q();
        qVar.b = Tasks.forResult(null);
        qVar.c = new Object();
        qVar.d = new ThreadLocal();
        qVar.a = executorService;
        executorService.execute(new cy0(qVar, 21));
        this.l = qVar;
        this.m = jVar;
        this.o = fVar;
        System.currentTimeMillis();
        this.c = new l();
    }

    public static Task a(p pVar, b0 b0Var) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.q qVar = pVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) qVar.d).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        pVar.d.b();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                pVar.i.a(new vg.d(12));
                pVar.f.g();
                if (b0Var.d().b.a) {
                    if (!pVar.f.d(b0Var)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    forException = pVar.f.h(((TaskCompletionSource) ((AtomicReference) b0Var.i).get()).getTask());
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
            qVar.F(oVar);
            return forException;
        } catch (Throwable th2) {
            qVar.F(new o(pVar, 0));
            throw th2;
        }
    }

    public final void b(b0 b0Var) {
        Future<?> submit = this.k.submit(new t9.i(14, this, b0Var));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }
}
