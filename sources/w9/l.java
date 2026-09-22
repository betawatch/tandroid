package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.c.n();
        com.google.firebase.messaging.n nVar2 = nVar.m;
        nVar2.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar2.v(this.b, this.c, e, "crash", j10, true);
        try {
            cVar = nVar.g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
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
        return ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).getTask().onSuccessTask(executor, new m5.e(this, executor, e));
    }
}
