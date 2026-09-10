package zh;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ p2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((l7) this.b.l.Q1).g(false);
                break;
            case 1:
                a3 a3Var = this.b.l;
                w2 w2Var = a3Var.Q1;
                if (w2Var != null) {
                    u7 u7Var = ((l7) w2Var).d;
                    u7Var.Z0 = false;
                    u7Var.P();
                }
                a3Var.f1(false);
                a3Var.h3 = true;
                a3Var.K0.D(true);
                break;
            case 2:
                a3 a3Var2 = this.b.l;
                a3Var2.U3 = true;
                a3Var2.setActive(false);
                break;
            default:
                a3 a3Var3 = this.b.l;
                a3Var3.U3 = true;
                a3Var3.setActive(false);
                break;
        }
    }
}
