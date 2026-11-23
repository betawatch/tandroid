package zd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
