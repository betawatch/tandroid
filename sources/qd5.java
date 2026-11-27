// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qd5 implements rv9 {
    public final /* synthetic */ rd5 a;

    public qd5(rd5 rd5Var) {
        this.a = rd5Var;
    }

    @Override // rv9
    public final boolean C1(int i) {
        return true;
    }

    @Override // rv9
    public final zh6 D0() {
        return this.a.x.Y1;
    }

    @Override // rv9
    public final zh6 Z0() {
        return null;
    }

    @Override // rv9
    public final void p(int i) {
        rd5 rd5Var = this.a;
        sd5 sd5Var = rd5Var.x;
        if (i < 0 || i != rd5Var.n || rd5Var.h) {
            return;
        }
        int i2 = rd5Var.f - 1;
        boolean z = sd5Var.t1.getVisibility() == 0;
        rd5Var.f();
        if (rd5Var.f > i2) {
            sd5Var.K0(i2);
        }
        if (rd5Var.d.e() || !sd5Var.n1.T0()) {
            return;
        }
        sd5Var.t1.e(false, z);
    }

    @Override // rv9
    public final void X1(ArrayList arrayList) {
    }
}
