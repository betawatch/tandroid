package r9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.u;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class h extends c0.h implements ScheduledFuture {
    public final ScheduledFuture n;

    public h(g gVar) {
        this.n = gVar.a(new u(this, 22));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.n.compareTo(delayed);
    }

    @Override // c0.h
    public final void d() {
        ScheduledFuture scheduledFuture = this.n;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof c0.a) && ((c0.a) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.n.getDelay(timeUnit);
    }
}
