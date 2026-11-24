// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wp3 implements xp3 {
    public final ScheduledFuture a;

    public wp3(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // xp3
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
