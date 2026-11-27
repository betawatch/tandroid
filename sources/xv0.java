// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv0 implements h22, nu4, fd {
    public final /* synthetic */ xw0 a;

    public /* synthetic */ xv0(xw0 xw0Var) {
        this.a = xw0Var;
    }

    @Override // h22
    public final void e(boolean z) {
        xw0 xw0Var = this.a;
        if (xw0Var.f0 && z) {
            return;
        }
        xw0Var.m(true);
    }

    @Override // nu4
    public final Object h(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= hl.L(20.0f));
    }

    @Override // fd
    public final void w(id idVar, int i) {
        this.a.m(false);
    }
}
