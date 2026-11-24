// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ do0 b;

    public /* synthetic */ zn0(do0 do0Var, byte b) {
        this.a = b;
        this.b = do0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        do0 do0Var = this.b;
        switch (b) {
            case 0:
                do0Var.dismiss();
                break;
            default:
                do0Var.onBackPressed();
                break;
        }
    }
}
