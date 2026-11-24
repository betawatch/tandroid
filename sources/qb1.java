// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qb1 implements rb1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ qb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // rb1
    public final void a(Throwable th) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((rr4) obj).invoke(th);
                break;
            default:
                ((xp3) obj).dispose();
                break;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rr4) obj).getClass().getSimpleName() + '@' + ea3.a(this) + ']';
            default:
                return "DisposeOnCancel[" + ((xp3) obj) + ']';
        }
    }
}
