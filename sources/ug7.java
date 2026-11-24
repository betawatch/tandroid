// default package

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ug7 extends dke implements ScheduledFuture, t76, Future {
    public final t2 b;
    public final ScheduledFuture c;

    public ug7(t2 t2Var, ScheduledFuture scheduledFuture) {
        this.b = t2Var;
        this.c = scheduledFuture;
    }

    @Override // t76
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean e = e(z);
        if (e) {
            this.c.cancel(z);
        }
        return e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override // dke
    public final Object d() {
        return this.b;
    }

    public final boolean e(boolean z) {
        return this.b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
