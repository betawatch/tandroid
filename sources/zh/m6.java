package zh;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    public /* synthetic */ m6(n6 n6Var, int i10) {
        this.a = i10;
        this.b = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o6 o6Var = this.b.v;
                o6Var.s = 0;
                o6Var.requestLayout();
                p6 p6Var = o6Var.J;
                p6Var.L(p6Var.getWidth(), p6Var.getHeight());
                p6Var.requestLayout();
                break;
            case 1:
                o6 o6Var2 = this.b.v;
                o6Var2.s = 0;
                o6Var2.requestLayout();
                p6 p6Var2 = o6Var2.J;
                p6Var2.L(p6Var2.getWidth(), p6Var2.getHeight());
                p6Var2.requestLayout();
                break;
            case 2:
                n6 n6Var = this.b;
                n6Var.v.post(new m6(n6Var, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
