// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wg2 b;

    public /* synthetic */ wf2(wg2 wg2Var, byte b) {
        this.a = b;
        this.b = wg2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wg2 wg2Var = this.b;
        switch (b) {
            case 0:
                wg2Var.u0();
                break;
            default:
                wg2Var.getMessagesController().a3(0, wg2Var.N, true);
                break;
        }
    }
}
