// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pb5 implements yr9 {
    public final /* synthetic */ qb5 a;

    public pb5(qb5 qb5Var) {
        this.a = qb5Var;
    }

    @Override // yr9
    public final vf6 O0() {
        return this.a.x.Y1;
    }

    @Override // yr9
    public final boolean U1(int i) {
        return true;
    }

    @Override // yr9
    public final void r(int i) {
        qb5 qb5Var = this.a;
        rb5 rb5Var = qb5Var.x;
        if (i < 0 || i != qb5Var.n || qb5Var.h) {
            return;
        }
        int i2 = qb5Var.f - 1;
        boolean z = rb5Var.t1.getVisibility() == 0;
        qb5Var.f();
        if (qb5Var.f > i2) {
            rb5Var.J0(i2);
        }
        if (qb5Var.d.e() || !rb5Var.n1.S0()) {
            return;
        }
        rb5Var.t1.e(false, z);
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
    }
}
