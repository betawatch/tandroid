package pg;

import v7.a7;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class q1 extends r1 {
    public final i1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ s1 i;

    public q1(s1 s1Var, i1 i1Var, boolean z10, boolean z11) {
        this.i = s1Var;
        this.b = false;
        this.f = i1Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // pg.r1
    public final void a() {
        i1 i1Var = this.f;
        if (i1Var != null) {
            float f7 = (this.g * i1Var.d) + i1Var.b;
            float f10 = (this.h * i1Var.e) + i1Var.c;
            s1 s1Var = this.i;
            s1Var.c(f7, f10, true);
            float[] fArr = s1Var.p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.e = f12;
        }
    }

    @Override // pg.r1
    public final void b(float f7, float f10) {
        this.d = f7;
        this.e = f10;
        i1 i1Var = this.f;
        float f11 = ((-this.g) * i1Var.d) + i1Var.b;
        float f12 = ((-this.h) * i1Var.e) + i1Var.c;
        s1 s1Var = this.i;
        s1Var.c(f7, f10, false);
        s1Var.c(f11, f12, true);
        float[] fArr = s1Var.p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - i1Var.h;
        double cos = Math.cos(atan2) * a7.a(f7, f10, f13, f14);
        double sin = Math.sin(atan2) * a7.a(f7, f10, f13, f14);
        i1Var.d = ((float) Math.abs(cos)) / 2.0f;
        i1Var.e = ((float) Math.abs(sin)) / 2.0f;
        i1Var.b = (f7 + f13) / 2.0f;
        i1Var.c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < s1Var.m.size(); i10++) {
            ((r1) s1Var.m.get(i10)).a();
        }
    }
}
