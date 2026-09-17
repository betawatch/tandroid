package zd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class n0 implements o0 {
    public final ScheduledFuture a;

    public n0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // zd.o0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
