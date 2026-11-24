// default package

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pz2 implements Executor {
    public final ExecutorService a;
    public final Object b = new Object();
    public Task c = Tasks.forResult(null);

    public pz2(ExecutorService executorService) {
        this.a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.b) {
            continueWithTask = this.c.continueWithTask(this.a, new ce(runnable, (byte) 6));
            this.c = continueWithTask;
        }
        return continueWithTask;
    }

    public final Task b(by2 by2Var) {
        Task continueWithTask;
        synchronized (this.b) {
            continueWithTask = this.c.continueWithTask(this.a, new vu2(by2Var, (byte) 3));
            this.c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
