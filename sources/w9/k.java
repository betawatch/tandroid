package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n7.z0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        String e7 = mVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.c.p();
        com.google.firebase.messaging.n nVar = mVar.m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.b, this.c, e7, "crash", j10, true);
        try {
            cVar = mVar.g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
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
        return ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).getTask().onSuccessTask(executor, new z0(this, executor, e7));
    }
}
