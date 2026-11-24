// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ uz(e00 e00Var, byte b) {
        this.a = b;
        this.b = e00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e00 e00Var = this.b;
        switch (b) {
            case 0:
                e00Var.onBackPressed();
                break;
            default:
                e00Var.a1();
                break;
        }
    }
}
