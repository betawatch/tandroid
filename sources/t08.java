// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
