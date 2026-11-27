// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
