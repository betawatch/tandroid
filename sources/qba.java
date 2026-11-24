// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tca b;

    public /* synthetic */ qba(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tca tcaVar = this.b;
        switch (b) {
            case 0:
                tcaVar.v2 = true;
                oq4 oq4Var = tcaVar.t2;
                oq4Var.r.setText("");
                gm.E3(oq4Var.r);
                break;
            default:
                bo6 bo6Var = new bo6((byte) 21);
                if (!tcaVar.d) {
                    bo6Var.run();
                    break;
                } else {
                    oq4 oq4Var2 = tcaVar.t2;
                    if (oq4Var2 != null) {
                        gm.t1(oq4Var2.r);
                    }
                    gm.d3(bo6Var, 300L);
                    break;
                }
        }
    }
}
