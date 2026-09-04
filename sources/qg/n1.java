package qg;

import v7.z6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    @Override // qg.o1
    public final void a() {
        f1 f1Var = this.f;
        if (f1Var != null) {
            float f7 = (this.g * f1Var.d) + f1Var.b;
            float f10 = (this.h * f1Var.e) + f1Var.c;
            p1 p1Var = this.i;
            p1Var.c(f7, f10, true);
            float[] fArr = p1Var.p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.e = f12;
        }
    }

    @Override // qg.o1
    public final void b(float f7, float f10) {
        this.d = f7;
        this.e = f10;
        f1 f1Var = this.f;
        float f11 = ((-this.g) * f1Var.d) + f1Var.b;
        float f12 = ((-this.h) * f1Var.e) + f1Var.c;
        p1 p1Var = this.i;
        p1Var.c(f7, f10, false);
        p1Var.c(f11, f12, true);
        float[] fArr = p1Var.p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - f1Var.h;
        double cos = Math.cos(atan2) * z6.a(f7, f10, f13, f14);
        double sin = Math.sin(atan2) * z6.a(f7, f10, f13, f14);
        f1Var.d = ((float) Math.abs(cos)) / 2.0f;
        f1Var.e = ((float) Math.abs(sin)) / 2.0f;
        f1Var.b = (f7 + f13) / 2.0f;
        f1Var.c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < p1Var.m.size(); i10++) {
            ((o1) p1Var.m.get(i10)).a();
        }
    }
}
