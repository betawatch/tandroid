// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z8b b;

    public /* synthetic */ yu7(z8b z8bVar, byte b) {
        this.a = b;
        this.b = z8bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z8b z8bVar = this.b;
        switch (b) {
            case 0:
                nv7 nv7Var = z8bVar.e2;
                if (nv7Var != null) {
                    nv7Var.I0();
                    break;
                }
                break;
            default:
                z8bVar.u2.q1.setVisibility(8);
                break;
        }
    }
}
