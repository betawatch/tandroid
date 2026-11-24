// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class wdc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ xab b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ wdc(xab xabVar, int i, long j) {
        this.b = xabVar;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        xab xabVar = this.b;
        switch (b) {
            case 0:
                ydc ydcVar = (ydc) xabVar.c;
                String str = hac.a;
                xa3 xa3Var = ((c74) ydcVar).a.s;
                tk R = xa3Var.R((rz6) xa3Var.d.e);
                xa3Var.V(R, 1018, new ua3(R, i, j));
                break;
            default:
                ydc ydcVar2 = (ydc) xabVar.c;
                String str2 = hac.a;
                xa3 xa3Var2 = ((c74) ydcVar2).a.s;
                tk R2 = xa3Var2.R((rz6) xa3Var2.d.e);
                xa3Var2.V(R2, 1021, new ua3(R2, j, i));
                break;
        }
    }

    public /* synthetic */ wdc(xab xabVar, long j, int i) {
        this.b = xabVar;
        this.c = j;
        this.d = i;
    }
}
