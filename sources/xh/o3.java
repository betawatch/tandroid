package xh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ o3(p3 p3Var, int i10) {
        this.a = i10;
        this.b = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p3 p3Var = this.b;
                if (p3Var.x) {
                    p3Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}
