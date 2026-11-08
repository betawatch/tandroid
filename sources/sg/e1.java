package sg;

import a8.r9;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e1 extends h1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ i1 g;

    public /* synthetic */ e1(i1 i1Var, int i7) {
        this.f = i7;
        this.g = i1Var;
    }

    @Override // sg.h1
    public final void a() {
        switch (this.f) {
            case 0:
                i1 i1Var = this.g;
                z0 z0Var = i1Var.h;
                double atan2 = Math.atan2(z0Var.c - z0Var.j, z0Var.b - z0Var.i) + 3.141592653589793d;
                z0 z0Var2 = i1Var.h;
                double d = z0Var2.k / 5.5f;
                float cos = z0Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = i1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                z0 z0Var3 = this.g.h;
                float f10 = z0Var3.b + z0Var3.d;
                float f11 = z0Var3.c;
                this.d = f10;
                this.e = f11;
                break;
            case 2:
                i1 i1Var2 = this.g;
                z0 z0Var4 = i1Var2.h;
                float min = Math.min(z0Var4.d, z0Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + i1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + i1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                z0 z0Var5 = this.g.h;
                float f12 = z0Var5.b;
                float abs = z0Var5.c - Math.abs(z0Var5.e);
                this.d = f12;
                this.e = abs;
                break;
            case 4:
                z0 z0Var6 = this.g.h;
                float f13 = z0Var6.i;
                float f14 = z0Var6.j;
                z0Var6.i = f13;
                z0Var6.j = f14;
                this.d = f13;
                this.e = f14;
                break;
            default:
                z0 z0Var7 = this.g.h;
                this.d = z0Var7.b;
                this.e = z0Var7.c;
                break;
        }
    }

    @Override // sg.h1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                i1 i1Var = this.g;
                z0 z0Var = i1Var.h;
                double atan2 = Math.atan2(z0Var.c - z0Var.j, z0Var.b - z0Var.i) + 1.5707963267948966d;
                z0 z0Var2 = i1Var.h;
                float a10 = (r9.a(z0Var2.b, z0Var2.c, z0Var2.i, z0Var2.j) * 5.5f) / 2.0f;
                z0 z0Var3 = i1Var.h;
                float f12 = z0Var3.b;
                float f13 = z0Var3.c;
                i1Var.getClass();
                z0Var3.k = Math.min(a10, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.e = f11;
                z0 z0Var4 = this.g.h;
                float a11 = r9.a(z0Var4.b, z0Var4.c, f10, f11);
                z0Var4.e = a11;
                z0Var4.d = a11;
                break;
            case 2:
                i1 i1Var2 = this.g;
                z0 z0Var5 = i1Var2.h;
                float a12 = r9.a(z0Var5.b, z0Var5.c, f10, f11);
                z0Var5.e = a12;
                z0Var5.d = a12;
                i1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f11, f10 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                i1 i1Var3 = this.g;
                i1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f11, f10 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i7 = 0; i7 < i1Var3.m.size(); i7++) {
                    h1 h1Var = (h1) i1Var3.m.get(i7);
                    if (h1Var instanceof g1) {
                        h1Var.a();
                    }
                }
                break;
            case 4:
                z0 z0Var6 = this.g.h;
                z0Var6.i = f10;
                z0Var6.j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = z0Var6.c;
                float f15 = z0Var6.e;
                float f16 = f14 - f15;
                if (f11 > f16 && f11 < f14 + f15) {
                    float f17 = z0Var6.b;
                    if (f10 <= f17) {
                        float f18 = f17 - z0Var6.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + z0Var6.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = z0Var6.b;
                float f22 = z0Var6.d;
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
                z0Var6.i = f20;
                z0Var6.j = this.e;
                break;
            default:
                int i10 = 0;
                while (true) {
                    i1 i1Var4 = this.g;
                    if (i10 >= i1Var4.m.size()) {
                        z0 z0Var7 = i1Var4.h;
                        z0Var7.b = f10;
                        z0Var7.c = f11;
                        this.d = f10;
                        this.e = f11;
                        break;
                    } else {
                        h1 h1Var2 = (h1) i1Var4.m.get(i10);
                        if (h1Var2 != this) {
                            h1Var2.a();
                        }
                        i10++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(i1 i1Var, int i7, boolean z9) {
        super(0);
        this.f = i7;
        this.g = i1Var;
    }
}
