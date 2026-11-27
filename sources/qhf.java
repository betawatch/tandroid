// default package

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qhf extends dhf implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public qhf(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // dhf, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a3.j(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        uhf uhfVar = new uhf(Executors.callable(runnable, null));
        return new fhf(uhfVar, this.b.schedule(uhfVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        phf phfVar = new phf(runnable);
        return new fhf(phfVar, this.b.scheduleAtFixedRate(phfVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        phf phfVar = new phf(runnable);
        return new fhf(phfVar, this.b.scheduleWithFixedDelay(phfVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        uhf uhfVar = new uhf(callable);
        return new fhf(uhfVar, this.b.schedule(uhfVar, j, timeUnit));
    }
}
