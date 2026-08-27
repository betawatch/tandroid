package yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k1 extends n1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ o1 g;

    public /* synthetic */ k1(o1 o1Var, int i10) {
        this.f = i10;
        this.g = o1Var;
    }

    @Override // yf.n1
    public final void a() {
        switch (this.f) {
            case 0:
                o1 o1Var = this.g;
                e1 e1Var = o1Var.h;
                double atan2 = Math.atan2(e1Var.c - e1Var.j, e1Var.b - e1Var.i) + 3.141592653589793d;
                e1 e1Var2 = o1Var.h;
                double d = e1Var2.k / 5.5f;
                float cos = e1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = o1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                e1 e1Var3 = this.g.h;
                float f10 = e1Var3.b + e1Var3.d;
                float f11 = e1Var3.c;
                this.d = f10;
                this.e = f11;
                break;
            case 2:
                o1 o1Var2 = this.g;
                e1 e1Var4 = o1Var2.h;
                float min = Math.min(e1Var4.d, e1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + o1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + o1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                e1 e1Var5 = this.g.h;
                float f12 = e1Var5.b;
                float abs = e1Var5.c - Math.abs(e1Var5.e);
                this.d = f12;
                this.e = abs;
                break;
            case 4:
                e1 e1Var6 = this.g.h;
                float f13 = e1Var6.i;
                float f14 = e1Var6.j;
                e1Var6.i = f13;
                e1Var6.j = f14;
                this.d = f13;
                this.e = f14;
                break;
            default:
                e1 e1Var7 = this.g.h;
                this.d = e1Var7.b;
                this.e = e1Var7.c;
                break;
        }
    }

    @Override // yf.n1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                o1 o1Var = this.g;
                e1 e1Var = o1Var.h;
                double atan2 = Math.atan2(e1Var.c - e1Var.j, e1Var.b - e1Var.i) + 1.5707963267948966d;
                e1 e1Var2 = o1Var.h;
                float a2 = (h7.y.a(e1Var2.b, e1Var2.c, e1Var2.i, e1Var2.j) * 5.5f) / 2.0f;
                e1 e1Var3 = o1Var.h;
                float f12 = e1Var3.b;
                float f13 = e1Var3.c;
                o1Var.getClass();
                e1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.e = f11;
                e1 e1Var4 = this.g.h;
                float a3 = h7.y.a(e1Var4.b, e1Var4.c, f10, f11);
                e1Var4.e = a3;
                e1Var4.d = a3;
                break;
            case 2:
                o1 o1Var2 = this.g;
                e1 e1Var5 = o1Var2.h;
                float a10 = h7.y.a(e1Var5.b, e1Var5.c, f10, f11);
                e1Var5.e = a10;
                e1Var5.d = a10;
                o1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f11, f10 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                o1 o1Var3 = this.g;
                o1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f11, f10 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i10 = 0; i10 < o1Var3.m.size(); i10++) {
                    n1 n1Var = (n1) o1Var3.m.get(i10);
                    if (n1Var instanceof m1) {
                        n1Var.a();
                    }
                }
                break;
            case 4:
                e1 e1Var6 = this.g.h;
                e1Var6.i = f10;
                e1Var6.j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = e1Var6.c;
                float f15 = e1Var6.e;
                float f16 = f14 - f15;
                if (f11 > f16 && f11 < f14 + f15) {
                    float f17 = e1Var6.b;
                    if (f10 <= f17) {
                        float f18 = f17 - e1Var6.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + e1Var6.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = e1Var6.b;
                float f22 = e1Var6.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && f11 > f16) {
                        this.e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.e = f23;
                        }
                    }
                }
                e1Var6.i = f20;
                e1Var6.j = this.e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    o1 o1Var4 = this.g;
                    if (i11 >= o1Var4.m.size()) {
                        e1 e1Var7 = o1Var4.h;
                        e1Var7.b = f10;
                        e1Var7.c = f11;
                        this.d = f10;
                        this.e = f11;
                        break;
                    } else {
                        n1 n1Var2 = (n1) o1Var4.m.get(i11);
                        if (n1Var2 != this) {
                            n1Var2.a();
                        }
                        i11++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(o1 o1Var, int i10, boolean z10) {
        super(0);
        this.f = i10;
        this.g = o1Var;
    }
}
