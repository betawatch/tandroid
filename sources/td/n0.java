package td;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n0 implements o0 {
    public final ScheduledFuture a;

    public n0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // td.o0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
