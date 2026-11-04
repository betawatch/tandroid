package tg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 extends f1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ g1 g;

    public /* synthetic */ c1(g1 g1Var, int i3) {
        this.f = i3;
        this.g = g1Var;
    }

    @Override // tg.f1
    public final void a() {
        switch (this.f) {
            case 0:
                g1 g1Var = this.g;
                x0 x0Var = g1Var.h;
                double atan2 = Math.atan2(x0Var.c - x0Var.j, x0Var.b - x0Var.i) + 3.141592653589793d;
                x0 x0Var2 = g1Var.h;
                double d = x0Var2.k / 5.5f;
                float cos = x0Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = g1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                x0 x0Var3 = this.g.h;
                float f10 = x0Var3.b + x0Var3.d;
                float f11 = x0Var3.c;
                this.d = f10;
                this.e = f11;
                break;
            case 2:
                g1 g1Var2 = this.g;
                x0 x0Var4 = g1Var2.h;
                float min = Math.min(x0Var4.d, x0Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + g1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + g1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                x0 x0Var5 = this.g.h;
                float f12 = x0Var5.b;
                float abs = x0Var5.c - Math.abs(x0Var5.e);
                this.d = f12;
                this.e = abs;
                break;
            case 4:
                x0 x0Var6 = this.g.h;
                float f13 = x0Var6.i;
                float f14 = x0Var6.j;
                x0Var6.i = f13;
                x0Var6.j = f14;
                this.d = f13;
                this.e = f14;
                break;
            default:
                x0 x0Var7 = this.g.h;
                this.d = x0Var7.b;
                this.e = x0Var7.c;
                break;
        }
    }

    @Override // tg.f1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                g1 g1Var = this.g;
                x0 x0Var = g1Var.h;
                double atan2 = Math.atan2(x0Var.c - x0Var.j, x0Var.b - x0Var.i) + 1.5707963267948966d;
                x0 x0Var2 = g1Var.h;
                float a10 = (a7.h.a(x0Var2.b, x0Var2.c, x0Var2.i, x0Var2.j) * 5.5f) / 2.0f;
                x0 x0Var3 = g1Var.h;
                float f12 = x0Var3.b;
                float f13 = x0Var3.c;
                g1Var.getClass();
                x0Var3.k = Math.min(a10, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.e = f11;
                x0 x0Var4 = this.g.h;
                float a11 = a7.h.a(x0Var4.b, x0Var4.c, f10, f11);
                x0Var4.e = a11;
                x0Var4.d = a11;
                break;
            case 2:
                g1 g1Var2 = this.g;
                x0 x0Var5 = g1Var2.h;
                float a12 = a7.h.a(x0Var5.b, x0Var5.c, f10, f11);
                x0Var5.e = a12;
                x0Var5.d = a12;
                g1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f11, f10 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                g1 g1Var3 = this.g;
                g1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f11, f10 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i3 = 0; i3 < g1Var3.m.size(); i3++) {
                    f1 f1Var = (f1) g1Var3.m.get(i3);
                    if (f1Var instanceof e1) {
                        f1Var.a();
                    }
                }
                break;
            case 4:
                x0 x0Var6 = this.g.h;
                x0Var6.i = f10;
                x0Var6.j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = x0Var6.c;
                float f15 = x0Var6.e;
                float f16 = f14 - f15;
                if (f11 > f16 && f11 < f14 + f15) {
                    float f17 = x0Var6.b;
                    if (f10 <= f17) {
                        float f18 = f17 - x0Var6.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + x0Var6.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = x0Var6.b;
                float f22 = x0Var6.d;
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
                x0Var6.i = f20;
                x0Var6.j = this.e;
                break;
            default:
                int i10 = 0;
                while (true) {
                    g1 g1Var4 = this.g;
                    if (i10 >= g1Var4.m.size()) {
                        x0 x0Var7 = g1Var4.h;
                        x0Var7.b = f10;
                        x0Var7.c = f11;
                        this.d = f10;
                        this.e = f11;
                        break;
                    } else {
                        f1 f1Var2 = (f1) g1Var4.m.get(i10);
                        if (f1Var2 != this) {
                            f1Var2.a();
                        }
                        i10++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(g1 g1Var, int i3, boolean z10) {
        super(0);
        this.f = i3;
        this.g = g1Var;
    }
}
