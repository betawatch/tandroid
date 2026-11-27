// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z02 extends hb {
    public final /* synthetic */ a12 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z02(a12 a12Var, a12 a12Var2) {
        super(a12Var2);
        this.x = a12Var;
    }

    @Override // hb
    public final boolean b() {
        o24 o24Var;
        n12 n12Var = this.x.l0;
        if ((!n12Var.J || n12Var.r2) && n12Var.p3) {
            f12 f12Var = n12Var.v2;
            if (f12Var != n12Var.g2 && f12Var != n12Var.h2 && !n12Var.V0().m()) {
                return true;
            }
            f12 f12Var2 = n12Var.v2;
            a72 a72Var = n12Var.g2;
            if (f12Var2 == a72Var && ((o24Var = a72Var.F) == null || o24Var.getVisibility() != 0)) {
                return true;
            }
            f12 f12Var3 = n12Var.v2;
            a72 a72Var2 = n12Var.h2;
            if (f12Var3 == a72Var2) {
                o24 o24Var2 = a72Var2.F;
                return o24Var2 == null || o24Var2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // hb
    public final void e(float f, float f2, boolean z) {
        a12 a12Var = this.x;
        n12 n12Var = a12Var.l0;
        n12Var.i4 = f;
        float f3 = n12Var.a4;
        if (f3 > 0.0f) {
            f = qd4.A(f3, n12Var.b4, (n12Var.v2 != n12Var.q2 || z) ? 1.0f - f2 : f2, f);
            n12Var.i4 = f;
        }
        n12Var.U2.setTranslationY(f);
        n12Var.X2.setTranslationY(n12Var.i4);
        s7 s7Var = n12Var.b3;
        if (s7Var != null) {
            s7Var.setTranslationY(n12Var.i4);
        }
        s7 s7Var2 = n12Var.Z2;
        if (s7Var2 != null) {
            s7Var2.setTranslationY(n12Var.X2.getTranslationY());
        }
        kg5 kg5Var = n12Var.a3;
        if (kg5Var != null) {
            kg5Var.setTranslationY(n12Var.X2.getTranslationY());
        }
        n12Var.c3.setTranslationY(n12Var.i4);
        n12Var.L1(0);
        n12Var.F0 = n12Var.v2 != n12Var.q2 ? n12Var.i4 : 0.0f;
        n12Var.c.invalidate();
        a12Var.invalidate();
        n12Var.A2.invalidate();
        n12Var.F1();
        f12 f12Var = n12Var.v2;
        if (f12Var != null) {
            f12Var.n(n12Var.i4, f2);
        }
    }

    @Override // hb
    public final void f() {
        n12 n12Var = this.x.l0;
        n12Var.I1(n12Var.v2, 0);
        n12Var.Z3 = n12Var.Y3[0];
        n12Var.v2.z();
        if (!(n12Var.v2 instanceof j22) || n12Var.A3) {
            return;
        }
        int L = n12Var.d ? hl.L(84.0f) : 0;
        for (int i = 0; i < n12Var.u2.size(); i++) {
            ((j22) n12Var.u2.valueAt(i)).setMeasureOffsetY(L);
        }
    }

    @Override // hb
    public final void g(int i, boolean z) {
        int i2;
        a12 a12Var = this.x;
        n12 n12Var = a12Var.l0;
        int i3 = n12Var.Z3;
        if (i3 <= 0 || i3 == (i2 = n12Var.Y3[0]) || !(z || n12Var.v2 == n12Var.q2)) {
            n12Var.a4 = -1.0f;
        } else {
            n12Var.a4 = i3;
            n12Var.b4 = i2;
        }
        a12Var.invalidate();
        if ((n12Var.v2 instanceof j22) && !n12Var.A3) {
            m02 m02Var = n12Var.u3;
            if (z) {
                m02Var.setVisibility(8);
            } else {
                m02Var.setVisibility(0);
            }
        }
        n12Var.v2.A(i, z);
    }
}
