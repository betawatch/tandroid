// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xh2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yh2 b;

    public /* synthetic */ xh2(yh2 yh2Var, byte b) {
        this.a = b;
        this.b = yh2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yh2 yh2Var = this.b;
        switch (b) {
            case 0:
                va vaVar = yh2Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    break;
                }
                break;
            default:
                va vaVar2 = yh2Var.a;
                if (vaVar2 != null) {
                    vaVar2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
