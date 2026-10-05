package zd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class j implements k {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // zd.k
    public final void a(Throwable th2) {
        switch (this.a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((rd.l) this.b).invoke(th2);
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
                return "CancelHandler.UserSupplied[" + ((rd.l) this.b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.b) + ']';
        }
    }
}
