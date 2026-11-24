// default package

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t44 extends s44 implements dd3 {
    public final Executor c;

    public t44(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // dd3
    public final no3 a(long j, nob nobVar, sw2 sw2Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(nobVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
                if (bt5Var != null) {
                    bt5Var.cancel(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new mo3(scheduledFuture) : ha3.w.a(j, nobVar, sw2Var);
    }

    @Override // dd3
    public final void b(long j, na1 na1Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            rld rldVar = new rld(this, na1Var, (byte) 8);
            sw2 sw2Var = na1Var.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(rldVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
                if (bt5Var != null) {
                    bt5Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            na1Var.v(new ia1(scheduledFuture, (byte) 0));
        } else {
            ha3.w.b(j, na1Var);
        }
    }

    @Override // vw2
    public final void c(sw2 sw2Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
            if (bt5Var != null) {
                bt5Var.cancel(cancellationException);
            }
            xb3 xb3Var = ko3.a;
            xa3.c.c(sw2Var, runnable);
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
        return (obj instanceof t44) && ((t44) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // vw2
    public final String toString() {
        return this.c.toString();
    }
}
