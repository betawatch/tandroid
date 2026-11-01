package td;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class j implements k {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // td.k
    public final void a(Throwable th2) {
        switch (this.a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((ld.l) this.b).invoke(th2);
                break;
            default:
                ((o0) this.b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ld.l) this.b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.b) + ']';
        }
    }
}
