// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xdc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xab b;
    public final /* synthetic */ ia3 c;

    public /* synthetic */ xdc(xab xabVar, ia3 ia3Var, byte b) {
        this.a = b;
        this.b = xabVar;
        this.c = ia3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xab xabVar = this.b;
                ia3 ia3Var = this.c;
                ydc ydcVar = (ydc) xabVar.c;
                String str = hac.a;
                xa3 xa3Var = ((c74) ydcVar).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1015, new ua3(U, ia3Var, (byte) 17));
                break;
            default:
                xab xabVar2 = this.b;
                ia3 ia3Var2 = this.c;
                synchronized (ia3Var2) {
                }
                ydc ydcVar2 = (ydc) xabVar2.c;
                String str2 = hac.a;
                h74 h74Var = ((c74) ydcVar2).a;
                xa3 xa3Var2 = h74Var.s;
                tk R = xa3Var2.R((rz6) xa3Var2.d.e);
                xa3Var2.V(R, 1020, new wm2(R, ia3Var2, (byte) 18));
                h74Var.S = null;
                break;
        }
    }
}
