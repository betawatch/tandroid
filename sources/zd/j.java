package zd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
