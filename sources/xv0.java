// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
