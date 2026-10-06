package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class l implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ da.b d;
    public final /* synthetic */ n e;

    public l(n nVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.e = nVar;
        this.a = j3;
        this.b = th2;
        this.c = thread;
        this.d = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.a;
        long j10 = j3 / 1000;
        n nVar = this.e;
        String e7 = nVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.c.o();
        com.google.firebase.messaging.n nVar2 = nVar.m;
        nVar2.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar2.v(this.b, this.c, e7, "crash", j10, true);
        try {
            cVar = nVar.g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(cVar.b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        nVar.c(false, bVar);
        new f(nVar.f);
        n.a(nVar, f.b, Boolean.FALSE);
        if (!nVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).getTask().onSuccessTask(executor, new o0.a(this, executor, e7));
    }
}
