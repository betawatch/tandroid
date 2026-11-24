// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class xsc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ zsc b;
    public final /* synthetic */ ysc c;
    public final /* synthetic */ osc d;

    public /* synthetic */ xsc(zsc zscVar, osc oscVar, ysc yscVar) {
        this.b = zscVar;
        this.d = oscVar;
        this.c = yscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        osc oscVar = this.d;
        ysc yscVar = this.c;
        zsc zscVar = this.b;
        switch (b) {
            case 0:
                if (oscVar == null) {
                    if (yscVar.e == null) {
                        zscVar.e(yscVar);
                        break;
                    } else {
                        zscVar.c(yscVar);
                        break;
                    }
                } else {
                    zscVar.a(yscVar, oscVar);
                    break;
                }
            default:
                zscVar.a(yscVar, oscVar);
                break;
        }
    }

    public /* synthetic */ xsc(zsc zscVar, ysc yscVar, osc oscVar) {
        this.b = zscVar;
        this.c = yscVar;
        this.d = oscVar;
    }
}
