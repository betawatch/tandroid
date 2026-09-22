package zd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
