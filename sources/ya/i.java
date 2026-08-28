package ya;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.fm;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class i {
    public final com.google.firebase.messaging.l a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public i() {
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
        lVar.b = new Object();
        lVar.c = new ArrayDeque();
        lVar.d = new AtomicReference();
        this.a = lVar;
    }

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        x5.l.k(this.b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.a.t(new Runnable() { // from class: ya.q
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                i iVar = i.this;
                AtomicBoolean atomicBoolean = iVar.c;
                CancellationToken cancellationToken2 = cancellationToken;
                boolean isCancellationRequested = cancellationToken2.isCancellationRequested();
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                try {
                    if (isCancellationRequested) {
                        cancellationTokenSource2.cancel();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            iVar.b();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                            return;
                        }
                        Object call = callable2.call();
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                        } else {
                            taskCompletionSource2.setResult(call);
                        }
                    } catch (RuntimeException e10) {
                        throw new ua.a("Internal error has occurred when executing ML Kit tasks", e10);
                    }
                } catch (Exception e11) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e11);
                    }
                }
            }
        }, new Executor() { // from class: ya.p
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e10);
                    }
                    throw e10;
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public abstract void c();

    public final void d(Executor executor) {
        x5.l.k(this.b.get() > 0);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.t(new fm(this, taskCompletionSource, false, 11), executor);
        taskCompletionSource.getTask();
    }
}
