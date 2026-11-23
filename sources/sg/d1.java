package sg;

import a8.x9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d1 extends e1 {
    public final w0 f;
    public final float g;
    public final float h;
    public final /* synthetic */ f1 i;

    public d1(f1 f1Var, w0 w0Var, boolean z10, boolean z11) {
        this.i = f1Var;
        this.b = false;
        this.f = w0Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // sg.e1
    public final void a() {
        w0 w0Var = this.f;
        if (w0Var != null) {
            float f10 = (this.g * w0Var.d) + w0Var.b;
            float f11 = (this.h * w0Var.e) + w0Var.c;
            f1 f1Var = this.i;
            f1Var.c(f10, f11, true);
            float[] fArr = f1Var.p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override // sg.e1
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        w0 w0Var = this.f;
        float f12 = ((-this.g) * w0Var.d) + w0Var.b;
        float f13 = ((-this.h) * w0Var.e) + w0Var.c;
        f1 f1Var = this.i;
        f1Var.c(f10, f11, false);
        f1Var.c(f12, f13, true);
        float[] fArr = f1Var.p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - w0Var.h;
        double cos = Math.cos(atan2) * x9.a(f10, f11, f14, f15);
        double sin = Math.sin(atan2) * x9.a(f10, f11, f14, f15);
        w0Var.d = ((float) Math.abs(cos)) / 2.0f;
        w0Var.e = ((float) Math.abs(sin)) / 2.0f;
        w0Var.b = (f10 + f14) / 2.0f;
        w0Var.c = (f11 + f15) / 2.0f;
        for (int i7 = 0; i7 < f1Var.m.size(); i7++) {
            ((e1) f1Var.m.get(i7)).a();
        }
    }
}
