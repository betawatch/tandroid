// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ufb implements bja, g94 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yfb b;

    public /* synthetic */ ufb(yfb yfbVar, byte b) {
        this.a = b;
        this.b = yfbVar;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        byte b = this.a;
        yfb yfbVar = this.b;
        switch (b) {
            case 1:
                yfbVar.H0();
                break;
            case 2:
                yfbVar.H0();
                break;
            default:
                yfbVar.X.setAlpha(f);
                break;
        }
    }

    @Override // g94
    public final void V(float f, int i) {
        byte b = this.a;
    }

    @Override // bja
    public final int b() {
        return this.b.b0;
    }

    private final void a(float f, int i) {
    }

    private final void c(float f, int i) {
    }

    private final void d(float f, int i) {
    }
}
