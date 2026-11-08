package sg;

import a8.r9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g1 extends h1 {
    public final z0 f;
    public final float g;
    public final float h;
    public final /* synthetic */ i1 i;

    public g1(i1 i1Var, z0 z0Var, boolean z9, boolean z10) {
        this.i = i1Var;
        this.b = false;
        this.f = z0Var;
        this.g = z9 ? -1.0f : 1.0f;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override // sg.h1
    public final void a() {
        z0 z0Var = this.f;
        if (z0Var != null) {
            float f10 = (this.g * z0Var.d) + z0Var.b;
            float f11 = (this.h * z0Var.e) + z0Var.c;
            i1 i1Var = this.i;
            i1Var.c(f10, f11, true);
            float[] fArr = i1Var.p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override // sg.h1
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        z0 z0Var = this.f;
        float f12 = ((-this.g) * z0Var.d) + z0Var.b;
        float f13 = ((-this.h) * z0Var.e) + z0Var.c;
        i1 i1Var = this.i;
        i1Var.c(f10, f11, false);
        i1Var.c(f12, f13, true);
        float[] fArr = i1Var.p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - z0Var.h;
        double cos = Math.cos(atan2) * r9.a(f10, f11, f14, f15);
        double sin = Math.sin(atan2) * r9.a(f10, f11, f14, f15);
        z0Var.d = ((float) Math.abs(cos)) / 2.0f;
        z0Var.e = ((float) Math.abs(sin)) / 2.0f;
        z0Var.b = (f10 + f14) / 2.0f;
        z0Var.c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < i1Var.m.size(); i7++) {
            ((h1) i1Var.m.get(i7)).a();
        }
    }
}
