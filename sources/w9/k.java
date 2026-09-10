package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import og.u0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ da.b d;
    public final /* synthetic */ m e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.e = mVar;
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
        m mVar = this.e;
        String e = mVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.c.C();
        com.google.firebase.messaging.n nVar = mVar.m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.b, this.c, e, "crash", j10, true);
        try {
            cVar = mVar.g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        mVar.c(false, bVar);
        new f(mVar.f);
        m.a(mVar, f.b, Boolean.FALSE);
        if (!mVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.e.b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).getTask().onSuccessTask(executor, new u0(this, executor, e));
    }
}
