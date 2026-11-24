// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wa2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ib2 b;

    public /* synthetic */ wa2(ib2 ib2Var, byte b) {
        this.a = b;
        this.b = ib2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ib2 ib2Var = this.b;
        switch (b) {
            case 0:
                he heVar = ib2Var.r;
                if (heVar != null) {
                    heVar.setOnCancelListener(new ct0(ib2Var, (byte) 6));
                    ib2Var.showDialog(ib2Var.r);
                    break;
                }
                break;
            case 1:
                ib2Var.getMessagesController().a3(0, ib2Var.F, true);
                break;
            default:
                ib2Var.getMessagesController().a3(0, ib2Var.F, true);
                break;
        }
    }
}
