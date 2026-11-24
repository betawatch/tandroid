// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xh8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ai8 b;

    public /* synthetic */ xh8(ai8 ai8Var, byte b) {
        this.a = b;
        this.b = ai8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ai8 ai8Var = this.b;
        switch (b) {
            case 0:
                ai8Var.a(true);
                break;
            default:
                ai8Var.d();
                break;
        }
    }
}
