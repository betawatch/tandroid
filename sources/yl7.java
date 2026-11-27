// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lm7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ r47 d;

    public /* synthetic */ yl7(int i, r47 r47Var, lm7 lm7Var) {
        this.a = (byte) 2;
        this.b = lm7Var;
        this.d = r47Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        r47 r47Var = this.d;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                lm7Var.J0(i, r47Var, true);
                break;
            case 1:
                lm7Var.J0(i, r47Var, false);
                break;
            default:
                hl.g(lm7Var.C0(r47Var));
                d31.b0(lm7Var).k(false).j();
                lm7Var.F0(lm7Var.n0(i, r47Var, "forward", "copy_link"));
                break;
        }
    }

    public /* synthetic */ yl7(lm7 lm7Var, int i, r47 r47Var, byte b) {
        this.a = b;
        this.b = lm7Var;
        this.c = i;
        this.d = r47Var;
    }
}
