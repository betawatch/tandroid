package qg;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
