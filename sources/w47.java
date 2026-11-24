// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w47 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f57 b;

    public /* synthetic */ w47(f57 f57Var, byte b) {
        this.a = b;
        this.b = f57Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f57 f57Var = this.b;
        switch (b) {
            case 0:
                boolean z = f57Var.d0.d.r;
                fv fvVar = f57Var.f;
                if (!z) {
                    fvVar.y0(fvVar.computeVerticalScrollRange() - (fvVar.computeVerticalScrollExtent() + fvVar.computeVerticalScrollOffset()), nm7.Y3, wb2.V);
                    break;
                } else {
                    fvVar.y0(-fvVar.computeVerticalScrollOffset(), nm7.Y3, wb2.V);
                    break;
                }
            default:
                f57Var.g(true, false);
                break;
        }
    }
}
