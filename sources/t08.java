// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
