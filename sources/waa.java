// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class waa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xaa b;

    public /* synthetic */ waa(xaa xaaVar, byte b) {
        this.a = b;
        this.b = xaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xaa xaaVar = this.b;
        switch (b) {
            case 0:
                if (xaaVar.x) {
                    xaaVar.d();
                    break;
                }
                break;
            default:
                xaaVar.invalidateSelf();
                break;
        }
    }
}
