package sg;

import a8.r9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d1 extends g1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ h1 g;

    public /* synthetic */ d1(h1 h1Var, int i7) {
        this.f = i7;
        this.g = h1Var;
    }

    @Override // sg.g1
    public final void a() {
        switch (this.f) {
            case 0:
                h1 h1Var = this.g;
                y0 y0Var = h1Var.h;
                double atan2 = Math.atan2(y0Var.c - y0Var.j, y0Var.b - y0Var.i) + 3.141592653589793d;
                y0 y0Var2 = h1Var.h;
                double d = y0Var2.k / 5.5f;
                float cos = y0Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = h1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                y0 y0Var3 = this.g.h;
                float f10 = y0Var3.b + y0Var3.d;
                float f11 = y0Var3.c;
                this.d = f10;
                this.e = f11;
                break;
            case 2:
                h1 h1Var2 = this.g;
                y0 y0Var4 = h1Var2.h;
                float min = Math.min(y0Var4.d, y0Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + h1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + h1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                y0 y0Var5 = this.g.h;
                float f12 = y0Var5.b;
                float abs = y0Var5.c - Math.abs(y0Var5.e);
                this.d = f12;
                this.e = abs;
                break;
            case 4:
                y0 y0Var6 = this.g.h;
                float f13 = y0Var6.i;
                float f14 = y0Var6.j;
                y0Var6.i = f13;
                y0Var6.j = f14;
                this.d = f13;
                this.e = f14;
                break;
            default:
                y0 y0Var7 = this.g.h;
                this.d = y0Var7.b;
                this.e = y0Var7.c;
                break;
        }
    }

    @Override // sg.g1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                h1 h1Var = this.g;
                y0 y0Var = h1Var.h;
                double atan2 = Math.atan2(y0Var.c - y0Var.j, y0Var.b - y0Var.i) + 1.5707963267948966d;
                y0 y0Var2 = h1Var.h;
                float a10 = (r9.a(y0Var2.b, y0Var2.c, y0Var2.i, y0Var2.j) * 5.5f) / 2.0f;
                y0 y0Var3 = h1Var.h;
                float f12 = y0Var3.b;
                float f13 = y0Var3.c;
                h1Var.getClass();
                y0Var3.k = Math.min(a10, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.e = f11;
                y0 y0Var4 = this.g.h;
                float a11 = r9.a(y0Var4.b, y0Var4.c, f10, f11);
                y0Var4.e = a11;
                y0Var4.d = a11;
                break;
            case 2:
                h1 h1Var2 = this.g;
                y0 y0Var5 = h1Var2.h;
                float a12 = r9.a(y0Var5.b, y0Var5.c, f10, f11);
                y0Var5.e = a12;
                y0Var5.d = a12;
                h1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f11, f10 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                h1 h1Var3 = this.g;
                h1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f11, f10 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i7 = 0; i7 < h1Var3.m.size(); i7++) {
                    g1 g1Var = (g1) h1Var3.m.get(i7);
                    if (g1Var instanceof f1) {
                        g1Var.a();
                    }
                }
                break;
            case 4:
                y0 y0Var6 = this.g.h;
                y0Var6.i = f10;
                y0Var6.j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = y0Var6.c;
                float f15 = y0Var6.e;
                float f16 = f14 - f15;
                if (f11 > f16 && f11 < f14 + f15) {
                    float f17 = y0Var6.b;
                    if (f10 <= f17) {
                        float f18 = f17 - y0Var6.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + y0Var6.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = y0Var6.b;
                float f22 = y0Var6.d;
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
                y0Var6.i = f20;
                y0Var6.j = this.e;
                break;
            default:
                int i10 = 0;
                while (true) {
                    h1 h1Var4 = this.g;
                    if (i10 >= h1Var4.m.size()) {
                        y0 y0Var7 = h1Var4.h;
                        y0Var7.b = f10;
                        y0Var7.c = f11;
                        this.d = f10;
                        this.e = f11;
                        break;
                    } else {
                        g1 g1Var2 = (g1) h1Var4.m.get(i10);
                        if (g1Var2 != this) {
                            g1Var2.a();
                        }
                        i10++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(h1 h1Var, int i7, boolean z9) {
        super(0);
        this.f = i7;
        this.g = h1Var;
    }
}
