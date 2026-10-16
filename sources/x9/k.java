package x9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ ea.b d;
    public final /* synthetic */ n e;

    public k(n nVar, long j10, Throwable th2, Thread thread, ea.b bVar) {
        this.e = nVar;
        this.a = j10;
        this.b = th2;
        this.c = thread;
        this.d = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ca.c cVar;
        String str;
        long j10 = this.a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.c.a();
        com.google.firebase.messaging.m mVar = nVar.m;
        mVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        mVar.v(this.b, this.c, e, "crash", j11, true);
        try {
            cVar = nVar.g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ea.b bVar = this.d;
        nVar.c(false, bVar);
        new f(nVar.f);
        n.a(nVar, f.b, Boolean.FALSE);
        if (!nVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).getTask().onSuccessTask(executor, new n3.b(this, executor, e));
    }
}
