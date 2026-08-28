package xf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l1 extends o1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ p1 g;

    public /* synthetic */ l1(p1 p1Var, int i9) {
        this.f = i9;
        this.g = p1Var;
    }

    @Override // xf.o1
    public final void a() {
        switch (this.f) {
            case 0:
                p1 p1Var = this.g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.c - f1Var.j, f1Var.b - f1Var.i) + 3.141592653589793d;
                f1 f1Var2 = p1Var.h;
                double d = f1Var2.k / 5.5f;
                float cos = f1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = p1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                f1 f1Var3 = this.g.h;
                float f10 = f1Var3.b + f1Var3.d;
                float f11 = f1Var3.c;
                this.d = f10;
                this.e = f11;
                break;
            case 2:
                p1 p1Var2 = this.g;
                f1 f1Var4 = p1Var2.h;
                float min = Math.min(f1Var4.d, f1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + p1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + p1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                f1 f1Var5 = this.g.h;
                float f12 = f1Var5.b;
                float abs = f1Var5.c - Math.abs(f1Var5.e);
                this.d = f12;
                this.e = abs;
                break;
            case 4:
                f1 f1Var6 = this.g.h;
                float f13 = f1Var6.i;
                float f14 = f1Var6.j;
                f1Var6.i = f13;
                f1Var6.j = f14;
                this.d = f13;
                this.e = f14;
                break;
            default:
                f1 f1Var7 = this.g.h;
                this.d = f1Var7.b;
                this.e = f1Var7.c;
                break;
        }
    }

    @Override // xf.o1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                p1 p1Var = this.g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.c - f1Var.j, f1Var.b - f1Var.i) + 1.5707963267948966d;
                f1 f1Var2 = p1Var.h;
                float a2 = (g7.w.a(f1Var2.b, f1Var2.c, f1Var2.i, f1Var2.j) * 5.5f) / 2.0f;
                f1 f1Var3 = p1Var.h;
                float f12 = f1Var3.b;
                float f13 = f1Var3.c;
                p1Var.getClass();
                f1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.e = f11;
                f1 f1Var4 = this.g.h;
                float a3 = g7.w.a(f1Var4.b, f1Var4.c, f10, f11);
                f1Var4.e = a3;
                f1Var4.d = a3;
                break;
            case 2:
                p1 p1Var2 = this.g;
                f1 f1Var5 = p1Var2.h;
                float a10 = g7.w.a(f1Var5.b, f1Var5.c, f10, f11);
                f1Var5.e = a10;
                f1Var5.d = a10;
                p1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f11, f10 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                p1 p1Var3 = this.g;
                p1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f11, f10 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i9 = 0; i9 < p1Var3.m.size(); i9++) {
                    o1 o1Var = (o1) p1Var3.m.get(i9);
                    if (o1Var instanceof n1) {
                        o1Var.a();
                    }
                }
                break;
            case 4:
                f1 f1Var6 = this.g.h;
                f1Var6.i = f10;
                f1Var6.j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = f1Var6.c;
                float f15 = f1Var6.e;
                float f16 = f14 - f15;
                if (f11 > f16 && f11 < f14 + f15) {
                    float f17 = f1Var6.b;
                    if (f10 <= f17) {
                        float f18 = f17 - f1Var6.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + f1Var6.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = f1Var6.b;
                float f22 = f1Var6.d;
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
                f1Var6.i = f20;
                f1Var6.j = this.e;
                break;
            default:
                int i10 = 0;
                while (true) {
                    p1 p1Var4 = this.g;
                    if (i10 >= p1Var4.m.size()) {
                        f1 f1Var7 = p1Var4.h;
                        f1Var7.b = f10;
                        f1Var7.c = f11;
                        this.d = f10;
                        this.e = f11;
                        break;
                    } else {
                        o1 o1Var2 = (o1) p1Var4.m.get(i10);
                        if (o1Var2 != this) {
                            o1Var2.a();
                        }
                        i10++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(p1 p1Var, int i9, boolean z10) {
        super(0);
        this.f = i9;
        this.g = p1Var;
    }
}
