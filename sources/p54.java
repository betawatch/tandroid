// default package

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class p54 extends o54 implements vd3 {
    public final Executor c;

    public p54(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // vd3
    public final ep3 a(long j, nsb nsbVar, mx2 mx2Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(nsbVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
                if (ev5Var != null) {
                    ev5Var.cancel(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new dp3(scheduledFuture) : ab3.w.a(j, nsbVar, mx2Var);
    }

    @Override // vd3
    public final void b(long j, va1 va1Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            iqd iqdVar = new iqd(this, va1Var, (byte) 8);
            mx2 mx2Var = va1Var.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(iqdVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
                if (ev5Var != null) {
                    ev5Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            va1Var.v(new qa1(scheduledFuture, (byte) 0));
        } else {
            ab3.w.b(j, va1Var);
        }
    }

    @Override // px2
    public final void c(mx2 mx2Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
            if (ev5Var != null) {
                ev5Var.cancel(cancellationException);
            }
            qc3 qc3Var = bp3.a;
            qb3.c.c(mx2Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p54) && ((p54) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // px2
    public final String toString() {
        return this.c.toString();
    }
}
