// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qa1 implements ra1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ qa1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ra1
    public final void a(Throwable th) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((ur4) obj).invoke(th);
                break;
            default:
                ((ep3) obj).dispose();
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
                return "CancelHandler.UserSupplied[" + ((ur4) obj).getClass().getSimpleName() + '@' + l93.a(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ep3) obj) + ']';
        }
    }
}
