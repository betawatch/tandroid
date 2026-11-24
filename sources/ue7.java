// default package

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ue7 extends re7 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public ue7(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // re7, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z2.g(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        i2c i2cVar = new i2c(Executors.callable(runnable, null));
        return new se7(i2cVar, this.b.schedule(i2cVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        te7 te7Var = new te7(runnable);
        return new se7(te7Var, this.b.scheduleAtFixedRate(te7Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        te7 te7Var = new te7(runnable);
        return new se7(te7Var, this.b.scheduleWithFixedDelay(te7Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        i2c i2cVar = new i2c(callable);
        return new se7(i2cVar, this.b.schedule(i2cVar, j, timeUnit));
    }
}
