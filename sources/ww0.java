// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ww0 implements c32, ku4, ee {
    public final /* synthetic */ wx0 a;

    public /* synthetic */ ww0(wx0 wx0Var) {
        this.a = wx0Var;
    }

    @Override // c32
    public final void e(boolean z) {
        wx0 wx0Var = this.a;
        if (wx0Var.f0 && z) {
            return;
        }
        wx0Var.m(true);
    }

    @Override // ku4
    public final Object l(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= gm.L(20.0f));
    }

    @Override // ee
    public final void r(he heVar, int i) {
        this.a.m(false);
    }
}
