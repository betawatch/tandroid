package rg;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ x0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b.b.d;
                if (a1Var != null) {
                    a1Var.postRunnable(a1Var.w);
                    break;
                }
                break;
            case 1:
                a1 a1Var2 = this.b.b.d;
                if (a1Var2 != null) {
                    a1Var2.postRunnable(a1Var2.w);
                    break;
                }
                break;
            default:
                c1 c1Var = this.b.b;
                a1 a1Var3 = c1Var.d;
                a1Var3.getClass();
                a1Var3.postRunnable(new z0(a1Var3, 2));
                c1Var.d = null;
                break;
        }
    }
}
