// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xb8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc8 b;

    public /* synthetic */ xb8(bc8 bc8Var, byte b) {
        this.a = b;
        this.b = bc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bc8 bc8Var = this.b;
        switch (b) {
            case 0:
                bc8Var.d();
                break;
            default:
                bc8Var.f();
                break;
        }
    }
}
