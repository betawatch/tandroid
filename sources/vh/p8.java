package vh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z8 b;

    public /* synthetic */ p8(z8 z8Var, int i10) {
        this.a = i10;
        this.b = z8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z8 z8Var = this.b;
                x8 x8Var = z8Var.M;
                if (x8Var != null) {
                    long j10 = x8Var.a;
                    if (j10 > 0) {
                        z8Var.H = j10;
                        break;
                    }
                }
                break;
            case 1:
                t8 t8Var = this.b.a;
                if (t8Var != null) {
                    t8Var.K();
                    break;
                }
                break;
            default:
                t8 t8Var2 = this.b.a;
                if (t8Var2 != null) {
                    t8Var2.m();
                    break;
                }
                break;
        }
    }
}
