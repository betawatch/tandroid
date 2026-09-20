package pg;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ y0(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b.a;
                if (d1Var != null) {
                    d1Var.b();
                    break;
                }
                break;
            case 1:
                e1 e1Var = this.b;
                e1Var.c.a(e1Var.r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                break;
            default:
                e1 e1Var2 = this.b;
                e1Var2.c.q(e1Var2.x);
                break;
        }
    }
}
