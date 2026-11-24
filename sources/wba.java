// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wba extends yp {
    public final /* synthetic */ byte c;
    public final /* synthetic */ tca d;

    public /* synthetic */ wba(tca tcaVar, byte b) {
        this.c = b;
        this.d = tcaVar;
    }

    @Override // yp
    public final int i(int i) {
        byte b = this.c;
        tca tcaVar = this.d;
        switch (b) {
            case 0:
                if (i == 0) {
                    return tcaVar.C1.J;
                }
                return 1;
            case 1:
                qca qcaVar = tcaVar.H1;
                return (i == qcaVar.x || i == qcaVar.y || i == qcaVar.E || i == qcaVar.G || qcaVar.d(i) == 0) ? 4 : 1;
            default:
                if (i == 0) {
                    return tcaVar.D1.J;
                }
                return 1;
        }
    }
}
