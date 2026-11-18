package zd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class j implements k {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // zd.k
    public final void a(Throwable th2) {
        switch (this.a) {
            case 0:
                ((ScheduledFuture) this.b).cancel(false);
                break;
            case 1:
                ((rd.l) this.b).invoke(th2);
                break;
            default:
                ((l0) this.b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rd.l) this.b).getClass().getSimpleName() + '@' + b0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.b) + ']';
        }
    }
}
