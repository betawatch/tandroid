package z9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ ha.c d;
    public final /* synthetic */ m e;

    public k(m mVar, long j10, Throwable th2, Thread thread, ha.c cVar) {
        this.e = mVar;
        this.a = j10;
        this.b = th2;
        this.c = thread;
        this.d = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        fa.f fVar;
        String str;
        long j10 = this.a;
        long j11 = j10 / 1000;
        m mVar = this.e;
        String g7 = mVar.g();
        if (g7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.c.a();
        x xVar = mVar.m;
        xVar.getClass();
        String concat = "Persisting fatal event for session ".concat(g7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        xVar.g(this.b, this.c, "crash", new ba.c(g7, j11, ed.p.a), true);
        try {
            fVar = mVar.g;
            str = ".ae" + j10;
            fVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File((File) fVar.d, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ha.c cVar = this.d;
        mVar.c(false, cVar, false);
        mVar.d(new e().a, Boolean.FALSE);
        return !mVar.b.a() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).getTask().onSuccessTask(mVar.e.a, new z6.c(this, g7));
    }
}
