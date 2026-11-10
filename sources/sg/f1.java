package sg;

import a8.r9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f1 extends g1 {
    public final y0 f;
    public final float g;
    public final float h;
    public final /* synthetic */ h1 i;

    public f1(h1 h1Var, y0 y0Var, boolean z9, boolean z10) {
        this.i = h1Var;
        this.b = false;
        this.f = y0Var;
        this.g = z9 ? -1.0f : 1.0f;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override // sg.g1
    public final void a() {
        y0 y0Var = this.f;
        if (y0Var != null) {
            float f10 = (this.g * y0Var.d) + y0Var.b;
            float f11 = (this.h * y0Var.e) + y0Var.c;
            h1 h1Var = this.i;
            h1Var.c(f10, f11, true);
            float[] fArr = h1Var.p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override // sg.g1
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        y0 y0Var = this.f;
        float f12 = ((-this.g) * y0Var.d) + y0Var.b;
        float f13 = ((-this.h) * y0Var.e) + y0Var.c;
        h1 h1Var = this.i;
        h1Var.c(f10, f11, false);
        h1Var.c(f12, f13, true);
        float[] fArr = h1Var.p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - y0Var.h;
        double cos = Math.cos(atan2) * r9.a(f10, f11, f14, f15);
        double sin = Math.sin(atan2) * r9.a(f10, f11, f14, f15);
        y0Var.d = ((float) Math.abs(cos)) / 2.0f;
        y0Var.e = ((float) Math.abs(sin)) / 2.0f;
        y0Var.b = (f10 + f14) / 2.0f;
        y0Var.c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < h1Var.m.size(); i7++) {
            ((g1) h1Var.m.get(i7)).a();
        }
    }
}
