package xf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n1 extends o1 {
    public final f1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ p1 i;

    public n1(p1 p1Var, f1 f1Var, boolean z10, boolean z11) {
        this.i = p1Var;
        this.b = false;
        this.f = f1Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // xf.o1
    public final void a() {
        f1 f1Var = this.f;
        if (f1Var != null) {
            float f10 = (this.g * f1Var.d) + f1Var.b;
            float f11 = (this.h * f1Var.e) + f1Var.c;
            p1 p1Var = this.i;
            p1Var.c(f10, f11, true);
            float[] fArr = p1Var.p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override // xf.o1
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        f1 f1Var = this.f;
        float f12 = ((-this.g) * f1Var.d) + f1Var.b;
        float f13 = ((-this.h) * f1Var.e) + f1Var.c;
        p1 p1Var = this.i;
        p1Var.c(f10, f11, false);
        p1Var.c(f12, f13, true);
        float[] fArr = p1Var.p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - f1Var.h;
        double cos = Math.cos(atan2) * g7.w.a(f10, f11, f14, f15);
        double sin = Math.sin(atan2) * g7.w.a(f10, f11, f14, f15);
        f1Var.d = ((float) Math.abs(cos)) / 2.0f;
        f1Var.e = ((float) Math.abs(sin)) / 2.0f;
        f1Var.b = (f10 + f14) / 2.0f;
        f1Var.c = (f11 + f15) / 2.0f;
        for (int i9 = 0; i9 < p1Var.m.size(); i9++) {
            ((o1) p1Var.m.get(i9)).a();
        }
    }
}
