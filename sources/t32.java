// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t32 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v32 b;

    public /* synthetic */ t32(v32 v32Var, byte b) {
        this.a = b;
        this.b = v32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v32 v32Var = this.b;
        switch (b) {
            case 0:
                if (v32Var.f != null) {
                    v32Var.w = mlb.l(new StringBuilder("+"), v32Var.f.phone, r58.f());
                    v32Var.s = v32Var.f;
                    gm.c3(new t32(v32Var, (byte) 1));
                    break;
                }
                break;
            default:
                v32Var.c.l(v32Var.w, false);
                break;
        }
    }
}
