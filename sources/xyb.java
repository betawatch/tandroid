// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xyb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mzb b;

    public /* synthetic */ xyb(mzb mzbVar, byte b) {
        this.a = b;
        this.b = mzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mzb mzbVar = this.b;
        switch (b) {
            case 0:
                if (mzbVar.i()) {
                    mzbVar.j();
                    break;
                }
                break;
            default:
                czb czbVar = mzbVar.K;
                czbVar.z1(true);
                azb azbVar = mzbVar.y;
                azbVar.z1(true);
                mzbVar.N.a(true, true);
                gm.V3(azbVar);
                gm.V3(czbVar);
                break;
        }
    }
}
