// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s9a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ daa b;

    public /* synthetic */ s9a(daa daaVar, byte b) {
        this.a = b;
        this.b = daaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        daa daaVar = this.b;
        switch (b) {
            case 0:
                daaVar.c0();
                break;
            case 1:
                l11.u(daaVar.getParentActivity(), jb6.M0(2131752091, null));
                break;
            default:
                daaVar.c.g3.O(true);
                break;
        }
    }
}
