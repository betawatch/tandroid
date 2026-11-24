// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class se4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qf4 b;

    public /* synthetic */ se4(qf4 qf4Var, byte b) {
        this.a = b;
        this.b = qf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qf4 qf4Var = this.b;
        switch (b) {
            case 0:
                qf4Var.p0();
                break;
            default:
                qf4Var.o0();
                break;
        }
    }
}
