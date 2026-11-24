// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v31 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b31 b;

    public /* synthetic */ v31(b31 b31Var, byte b) {
        this.a = b;
        this.b = b31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b31 b31Var = this.b;
        switch (b) {
            case 0:
                b31Var.performHapticFeedback(3, 2);
                break;
            default:
                b31Var.performHapticFeedback(3, 2);
                break;
        }
    }
}
