package yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m1 extends n1 {
    public final e1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ o1 i;

    public m1(o1 o1Var, e1 e1Var, boolean z10, boolean z11) {
        this.i = o1Var;
        this.b = false;
        this.f = e1Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // yf.n1
    public final void a() {
        e1 e1Var = this.f;
        if (e1Var != null) {
            float f10 = (this.g * e1Var.d) + e1Var.b;
            float f11 = (this.h * e1Var.e) + e1Var.c;
            o1 o1Var = this.i;
            o1Var.c(f10, f11, true);
            float[] fArr = o1Var.p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override // yf.n1
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        e1 e1Var = this.f;
        float f12 = ((-this.g) * e1Var.d) + e1Var.b;
        float f13 = ((-this.h) * e1Var.e) + e1Var.c;
        o1 o1Var = this.i;
        o1Var.c(f10, f11, false);
        o1Var.c(f12, f13, true);
        float[] fArr = o1Var.p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - e1Var.h;
        double cos = Math.cos(atan2) * h7.y.a(f10, f11, f14, f15);
        double sin = Math.sin(atan2) * h7.y.a(f10, f11, f14, f15);
        e1Var.d = ((float) Math.abs(cos)) / 2.0f;
        e1Var.e = ((float) Math.abs(sin)) / 2.0f;
        e1Var.b = (f10 + f14) / 2.0f;
        e1Var.c = (f11 + f15) / 2.0f;
        for (int i10 = 0; i10 < o1Var.m.size(); i10++) {
            ((n1) o1Var.m.get(i10)).a();
        }
    }
}
