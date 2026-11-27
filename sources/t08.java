// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class t08 implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x08 b;

    public /* synthetic */ t08(x08 x08Var, byte b) {
        this.a = b;
        this.b = x08Var;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        x08 x08Var = this.b;
        switch (b) {
            case 0:
                x08Var.c(true);
                x08Var.R.N1(null, 0, true);
                break;
            default:
                x08Var.c(true);
                x08Var.R.finishFragment();
                break;
        }
    }
}
