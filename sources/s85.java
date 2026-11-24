// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s85 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t85 b;

    public /* synthetic */ s85(t85 t85Var, byte b) {
        this.a = b;
        this.b = t85Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t85 t85Var = this.b;
        switch (b) {
            case 0:
                sb sbVar = t85Var.b;
                if (sbVar != null) {
                    sbVar.setVisibility(0);
                }
                gm.d3(new s85(t85Var, (byte) 2), 16L);
                break;
            case 1:
                sb sbVar2 = t85Var.b;
                if (sbVar2 != null) {
                    sbVar2.setVisibility(4);
                    break;
                }
                break;
            default:
                t85Var.b();
                break;
        }
    }
}
