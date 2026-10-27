package y9;

import aa.b0;
import aa.m0;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m4.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ b0 d;
    public final /* synthetic */ n e;

    public k(n nVar, long j10, Throwable th2, Thread thread, b0 b0Var) {
        this.e = nVar;
        this.a = j10;
        this.b = th2;
        this.c = thread;
        this.d = b0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        da.c cVar;
        String str;
        long j10 = this.a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.c.b();
        m0 m0Var = nVar.m;
        m0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        m0Var.t(this.b, this.c, e, "crash", j11, true);
        try {
            cVar = nVar.g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(cVar.b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        b0 b0Var = this.d;
        nVar.c(false, b0Var);
        new f(nVar.f);
        n.a(nVar, f.b, Boolean.FALSE);
        if (!nVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.a;
        return ((TaskCompletionSource) ((AtomicReference) b0Var.i).get()).getTask().onSuccessTask(executor, new w1(this, executor, e));
    }
}
