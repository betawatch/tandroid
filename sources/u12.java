// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u12 extends gb {
    public final /* synthetic */ v12 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(v12 v12Var, v12 v12Var2) {
        super(v12Var2);
        this.x = v12Var;
    }

    @Override // gb
    public final boolean b() {
        e34 e34Var;
        i22 i22Var = this.x.r0;
        if ((!i22Var.J || i22Var.r2) && i22Var.p3) {
            a22 a22Var = i22Var.v2;
            if (a22Var != i22Var.g2 && a22Var != i22Var.h2 && !i22Var.U0().m()) {
                return true;
            }
            a22 a22Var2 = i22Var.v2;
            v72 v72Var = i22Var.g2;
            if (a22Var2 == v72Var && ((e34Var = v72Var.F) == null || e34Var.getVisibility() != 0)) {
                return true;
            }
            a22 a22Var3 = i22Var.v2;
            v72 v72Var2 = i22Var.h2;
            if (a22Var3 == v72Var2) {
                e34 e34Var2 = v72Var2.F;
                return e34Var2 == null || e34Var2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // gb
    public final void e(float f, float f2, boolean z) {
        v12 v12Var = this.x;
        i22 i22Var = v12Var.r0;
        i22Var.i4 = f;
        float f3 = i22Var.a4;
        if (f3 > 0.0f) {
            f = td4.A(f3, i22Var.b4, (i22Var.v2 != i22Var.q2 || z) ? 1.0f - f2 : f2, f);
            i22Var.i4 = f;
        }
        i22Var.U2.setTranslationY(f);
        i22Var.X2.setTranslationY(i22Var.i4);
        r7 r7Var = i22Var.b3;
        if (r7Var != null) {
            r7Var.setTranslationY(i22Var.i4);
        }
        r7 r7Var2 = i22Var.Z2;
        if (r7Var2 != null) {
            r7Var2.setTranslationY(i22Var.X2.getTranslationY());
        }
        hg5 hg5Var = i22Var.a3;
        if (hg5Var != null) {
            hg5Var.setTranslationY(i22Var.X2.getTranslationY());
        }
        i22Var.c3.setTranslationY(i22Var.i4);
        i22Var.K1(0);
        i22Var.F0 = i22Var.v2 != i22Var.q2 ? i22Var.i4 : 0.0f;
        i22Var.c.invalidate();
        v12Var.invalidate();
        i22Var.A2.invalidate();
        i22Var.E1();
        a22 a22Var = i22Var.v2;
        if (a22Var != null) {
            a22Var.n(i22Var.i4, f2);
        }
    }

    @Override // gb
    public final void f() {
        i22 i22Var = this.x.r0;
        i22Var.H1(i22Var.v2, 0);
        i22Var.Z3 = i22Var.Y3[0];
        i22Var.v2.y();
        if (!(i22Var.v2 instanceof e32) || i22Var.A3) {
            return;
        }
        int L = i22Var.d ? gm.L(84.0f) : 0;
        for (int i = 0; i < i22Var.u2.size(); i++) {
            ((e32) i22Var.u2.valueAt(i)).setMeasureOffsetY(L);
        }
    }

    @Override // gb
    public final void g(int i, boolean z) {
        int i2;
        v12 v12Var = this.x;
        i22 i22Var = v12Var.r0;
        int i3 = i22Var.Z3;
        if (i3 <= 0 || i3 == (i2 = i22Var.Y3[0]) || !(z || i22Var.v2 == i22Var.q2)) {
            i22Var.a4 = -1.0f;
        } else {
            i22Var.a4 = i3;
            i22Var.b4 = i2;
        }
        v12Var.invalidate();
        if ((i22Var.v2 instanceof e32) && !i22Var.A3) {
            h12 h12Var = i22Var.u3;
            if (z) {
                h12Var.setVisibility(8);
            } else {
                h12Var.setVisibility(0);
            }
        }
        i22Var.v2.z(i, z);
    }
}
