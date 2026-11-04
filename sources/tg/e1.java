package tg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e1 extends f1 {
    public final x0 f;
    public final float g;
    public final float h;
    public final /* synthetic */ g1 i;

    public e1(g1 g1Var, x0 x0Var, boolean z10, boolean z11) {
        this.i = g1Var;
        this.b = false;
        this.f = x0Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // tg.f1
    public final void a() {
        x0 x0Var = this.f;
        if (x0Var != null) {
            float f10 = (this.g * x0Var.d) + x0Var.b;
            float f11 = (this.h * x0Var.e) + x0Var.c;
            g1 g1Var = this.i;
            g1Var.c(f10, f11, true);
            float[] fArr = g1Var.p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override // tg.f1
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        x0 x0Var = this.f;
        float f12 = ((-this.g) * x0Var.d) + x0Var.b;
        float f13 = ((-this.h) * x0Var.e) + x0Var.c;
        g1 g1Var = this.i;
        g1Var.c(f10, f11, false);
        g1Var.c(f12, f13, true);
        float[] fArr = g1Var.p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - x0Var.h;
        double cos = Math.cos(atan2) * a7.h.a(f10, f11, f14, f15);
        double sin = Math.sin(atan2) * a7.h.a(f10, f11, f14, f15);
        x0Var.d = ((float) Math.abs(cos)) / 2.0f;
        x0Var.e = ((float) Math.abs(sin)) / 2.0f;
        x0Var.b = (f10 + f14) / 2.0f;
        x0Var.c = (f11 + f15) / 2.0f;
        for (int i3 = 0; i3 < g1Var.m.size(); i3++) {
            ((f1) g1Var.m.get(i3)).a();
        }
    }
}
