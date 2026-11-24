// default package

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class we3 extends a4 implements ScheduledFuture {
    public final ScheduledFuture n;

    public we3(ve3 ve3Var) {
        this.n = ve3Var.a(new k6d((Object) this, (byte) 27));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.n.compareTo(delayed);
    }

    @Override // a4
    public final void d() {
        ScheduledFuture scheduledFuture = this.n;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof t3) && ((t3) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.n.getDelay(timeUnit);
    }
}
