package qg;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ z0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b.b.d;
                if (c1Var != null) {
                    c1Var.postRunnable(c1Var.w);
                    break;
                }
                break;
            case 1:
                c1 c1Var2 = this.b.b.d;
                if (c1Var2 != null) {
                    c1Var2.postRunnable(c1Var2.w);
                    break;
                }
                break;
            default:
                e1 e1Var = this.b.b;
                c1 c1Var3 = e1Var.d;
                c1Var3.getClass();
                c1Var3.postRunnable(new b1(c1Var3, 2));
                e1Var.d = null;
                break;
        }
    }
}
