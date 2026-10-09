package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ActionBar.b5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ da.c d;
    public final /* synthetic */ m e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.c cVar) {
        this.e = mVar;
        this.a = j3;
        this.b = th2;
        this.c = thread;
        this.d = cVar;
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
        mVar.c.C();
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
        da.c cVar2 = this.d;
        mVar.c(false, cVar2);
        new f(mVar.f);
        m.a(mVar, f.b, Boolean.FALSE);
        if (!mVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.e.b;
        return ((TaskCompletionSource) ((AtomicReference) cVar2.i).get()).getTask().onSuccessTask(executor, new b5(this, executor, e7));
    }
}
