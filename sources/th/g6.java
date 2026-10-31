package th;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ g6(h6 h6Var, int i10) {
        this.a = i10;
        this.b = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i6 i6Var = this.b.v;
                i6Var.s = 0;
                i6Var.requestLayout();
                j6 j6Var = i6Var.J;
                j6Var.L(j6Var.getWidth(), j6Var.getHeight());
                j6Var.requestLayout();
                break;
            case 1:
                i6 i6Var2 = this.b.v;
                i6Var2.s = 0;
                i6Var2.requestLayout();
                j6 j6Var2 = i6Var2.J;
                j6Var2.L(j6Var2.getWidth(), j6Var2.getHeight());
                j6Var2.requestLayout();
                break;
            case 2:
                h6 h6Var = this.b;
                h6Var.v.post(new g6(h6Var, 3));
                break;
            default:
                this.b.v.y = true;
                break;
        }
    }
}
