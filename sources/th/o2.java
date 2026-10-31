package th;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ o2(u2 u2Var, int i10) {
        this.a = i10;
        this.b = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((f7) this.b.x.z1).g(false);
                break;
            case 1:
                z2 z2Var = this.b.x;
                v2 v2Var = z2Var.z1;
                if (v2Var != null) {
                    o7 o7Var = ((f7) v2Var).d;
                    o7Var.Z0 = false;
                    o7Var.d0();
                }
                z2Var.d1(false);
                z2Var.Q2 = true;
                z2Var.t0.E(true);
                break;
            case 2:
                z2 z2Var2 = this.b.x;
                z2Var2.D3 = true;
                z2Var2.setActive(false);
                break;
            default:
                z2 z2Var3 = this.b.x;
                z2Var3.D3 = true;
                z2Var3.setActive(false);
                break;
        }
    }
}
