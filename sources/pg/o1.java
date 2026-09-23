package pg;

import v7.z6;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o1 extends p1 {
    public final g1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ q1 i;

    public o1(q1 q1Var, g1 g1Var, boolean z10, boolean z11) {
        this.i = q1Var;
        this.b = false;
        this.f = g1Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // pg.p1
    public final void a() {
        g1 g1Var = this.f;
        if (g1Var != null) {
            float f7 = (this.g * g1Var.d) + g1Var.b;
            float f10 = (this.h * g1Var.e) + g1Var.c;
            q1 q1Var = this.i;
            q1Var.c(f7, f10, true);
            float[] fArr = q1Var.p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.e = f12;
        }
    }

    @Override // pg.p1
    public final void b(float f7, float f10) {
        this.d = f7;
        this.e = f10;
        g1 g1Var = this.f;
        float f11 = ((-this.g) * g1Var.d) + g1Var.b;
        float f12 = ((-this.h) * g1Var.e) + g1Var.c;
        q1 q1Var = this.i;
        q1Var.c(f7, f10, false);
        q1Var.c(f11, f12, true);
        float[] fArr = q1Var.p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - g1Var.h;
        double cos = Math.cos(atan2) * z6.a(f7, f10, f13, f14);
        double sin = Math.sin(atan2) * z6.a(f7, f10, f13, f14);
        g1Var.d = ((float) Math.abs(cos)) / 2.0f;
        g1Var.e = ((float) Math.abs(sin)) / 2.0f;
        g1Var.b = (f7 + f13) / 2.0f;
        g1Var.c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < q1Var.m.size(); i10++) {
            ((p1) q1Var.m.get(i10)).a();
        }
    }
}
