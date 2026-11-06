package zd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
