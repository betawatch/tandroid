// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q29 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t29 b;

    public /* synthetic */ q29(t29 t29Var, byte b) {
        this.a = b;
        this.b = t29Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().y() != null && !this.b.a.getImageReceiver().y().l0 && !this.b.a.getImageReceiver().y().t()) {
                    this.b.a.getImageReceiver().y().start();
                }
                this.b.F = false;
                break;
            default:
                t29 t29Var = this.b;
                v29 v29Var = t29Var.Q;
                try {
                    t29Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                v29Var.n0 = v29Var.U.indexOf(t29Var.e);
                v29Var.m0 = t29Var.e;
                v29Var.invalidate();
                break;
        }
    }
}
