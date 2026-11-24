// default package

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class se7 extends cie implements ScheduledFuture, t56, Future {
    public final t2 b;
    public final ScheduledFuture c;

    public se7(t2 t2Var, ScheduledFuture scheduledFuture) {
        this.b = t2Var;
        this.c = scheduledFuture;
    }

    @Override // t56
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

    @Override // cie
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
