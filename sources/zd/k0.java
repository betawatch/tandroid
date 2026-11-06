package zd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class k0 implements l0 {
    public final ScheduledFuture a;

    public k0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // zd.l0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
