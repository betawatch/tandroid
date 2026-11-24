// default package

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wg7 extends tg7 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public wg7(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // tg7, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z2.g(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        i4c i4cVar = new i4c(Executors.callable(runnable, null));
        return new ug7(i4cVar, this.b.schedule(i4cVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        vg7 vg7Var = new vg7(runnable);
        return new ug7(vg7Var, this.b.scheduleAtFixedRate(vg7Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        vg7 vg7Var = new vg7(runnable);
        return new ug7(vg7Var, this.b.scheduleWithFixedDelay(vg7Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        i4c i4cVar = new i4c(callable);
        return new ug7(i4cVar, this.b.schedule(i4cVar, j, timeUnit));
    }
}
