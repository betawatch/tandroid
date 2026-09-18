package pg;

import v7.z6;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class p1 extends q1 {
    public final h1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ r1 i;

    public p1(r1 r1Var, h1 h1Var, boolean z10, boolean z11) {
        this.i = r1Var;
        this.b = false;
        this.f = h1Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // pg.q1
    public final void a() {
        h1 h1Var = this.f;
        if (h1Var != null) {
            float f7 = (this.g * h1Var.d) + h1Var.b;
            float f10 = (this.h * h1Var.e) + h1Var.c;
            r1 r1Var = this.i;
            r1Var.c(f7, f10, true);
            float[] fArr = r1Var.p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.e = f12;
        }
    }

    @Override // pg.q1
    public final void b(float f7, float f10) {
        this.d = f7;
        this.e = f10;
        h1 h1Var = this.f;
        float f11 = ((-this.g) * h1Var.d) + h1Var.b;
        float f12 = ((-this.h) * h1Var.e) + h1Var.c;
        r1 r1Var = this.i;
        r1Var.c(f7, f10, false);
        r1Var.c(f11, f12, true);
        float[] fArr = r1Var.p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - h1Var.h;
        double cos = Math.cos(atan2) * z6.a(f7, f10, f13, f14);
        double sin = Math.sin(atan2) * z6.a(f7, f10, f13, f14);
        h1Var.d = ((float) Math.abs(cos)) / 2.0f;
        h1Var.e = ((float) Math.abs(sin)) / 2.0f;
        h1Var.b = (f7 + f13) / 2.0f;
        h1Var.c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < r1Var.m.size(); i10++) {
            ((q1) r1Var.m.get(i10)).a();
        }
    }
}
