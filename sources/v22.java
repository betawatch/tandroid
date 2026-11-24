// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v22 implements ee, c32, ku4 {
    public final /* synthetic */ e32 a;

    public /* synthetic */ v22(e32 e32Var) {
        this.a = e32Var;
    }

    @Override // c32
    public final void e(boolean z) {
        e32 e32Var = this.a;
        if (e32Var.O()) {
            return;
        }
        e32Var.K.d(0.0f);
    }

    @Override // ku4
    public final Object l(Object obj) {
        return Boolean.valueOf(this.a.b.o3.getKeyboardHeight() >= gm.L(20.0f));
    }

    @Override // ee
    public final void r(he heVar, int i) {
        this.a.b.dismiss();
    }
}
