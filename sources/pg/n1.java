package pg;

import v7.a7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class n1 extends q1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ r1 g;

    public /* synthetic */ n1(r1 r1Var, int i10) {
        this.f = i10;
        this.g = r1Var;
    }

    @Override // pg.q1
    public final void a() {
        switch (this.f) {
            case 0:
                r1 r1Var = this.g;
                h1 h1Var = r1Var.h;
                double atan2 = Math.atan2(h1Var.c - h1Var.j, h1Var.b - h1Var.i) + 3.141592653589793d;
                h1 h1Var2 = r1Var.h;
                double d = h1Var2.k / 5.5f;
                float cos = h1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = r1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                h1 h1Var3 = this.g.h;
                float f7 = h1Var3.b + h1Var3.d;
                float f10 = h1Var3.c;
                this.d = f7;
                this.e = f10;
                break;
            case 2:
                r1 r1Var2 = this.g;
                h1 h1Var4 = r1Var2.h;
                float min = Math.min(h1Var4.d, h1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + r1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + r1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                h1 h1Var5 = this.g.h;
                float f11 = h1Var5.b;
                float abs = h1Var5.c - Math.abs(h1Var5.e);
                this.d = f11;
                this.e = abs;
                break;
            case 4:
                h1 h1Var6 = this.g.h;
                float f12 = h1Var6.i;
                float f13 = h1Var6.j;
                h1Var6.i = f12;
                h1Var6.j = f13;
                this.d = f12;
                this.e = f13;
                break;
            default:
                h1 h1Var7 = this.g.h;
                this.d = h1Var7.b;
                this.e = h1Var7.c;
                break;
        }
    }

    @Override // pg.q1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                r1 r1Var = this.g;
                h1 h1Var = r1Var.h;
                double atan2 = Math.atan2(h1Var.c - h1Var.j, h1Var.b - h1Var.i) + 1.5707963267948966d;
                h1 h1Var2 = r1Var.h;
                float a2 = (a7.a(h1Var2.b, h1Var2.c, h1Var2.i, h1Var2.j) * 5.5f) / 2.0f;
                h1 h1Var3 = r1Var.h;
                float f11 = h1Var3.b;
                float f12 = h1Var3.c;
                r1Var.getClass();
                h1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f7;
                this.e = f10;
                h1 h1Var4 = this.g.h;
                float a10 = a7.a(h1Var4.b, h1Var4.c, f7, f10);
                h1Var4.e = a10;
                h1Var4.d = a10;
                break;
            case 2:
                r1 r1Var2 = this.g;
                h1 h1Var5 = r1Var2.h;
                float a11 = a7.a(h1Var5.b, h1Var5.c, f7, f10);
                h1Var5.e = a11;
                h1Var5.d = a11;
                r1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f10, f7 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                r1 r1Var3 = this.g;
                r1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f10, f7 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i10 = 0; i10 < r1Var3.m.size(); i10++) {
                    q1 q1Var = (q1) r1Var3.m.get(i10);
                    if (q1Var instanceof p1) {
                        q1Var.a();
                    }
                }
                break;
            case 4:
                h1 h1Var6 = this.g.h;
                h1Var6.i = f7;
                h1Var6.j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = h1Var6.c;
                float f14 = h1Var6.e;
                float f15 = f13 - f14;
                if (f10 > f15 && f10 < f13 + f14) {
                    float f16 = h1Var6.b;
                    if (f7 <= f16) {
                        float f17 = f16 - h1Var6.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + h1Var6.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = h1Var6.b;
                float f21 = h1Var6.d;
                if (f19 > f20 - f21 && f19 < f20 + f21) {
                    if (f10 <= f13 && f10 > f15) {
                        this.e = f15;
                    } else if (f10 > f13) {
                        float f22 = f13 + f14;
                        if (f10 < f22) {
                            this.e = f22;
                        }
                    }
                }
                h1Var6.i = f19;
                h1Var6.j = this.e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    r1 r1Var4 = this.g;
                    if (i11 >= r1Var4.m.size()) {
                        h1 h1Var7 = r1Var4.h;
                        h1Var7.b = f7;
                        h1Var7.c = f10;
                        this.d = f7;
                        this.e = f10;
                        break;
                    } else {
                        q1 q1Var2 = (q1) r1Var4.m.get(i11);
                        if (q1Var2 != this) {
                            q1Var2.a();
                        }
                        i11++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(r1 r1Var, int i10, boolean z10) {
        super(0);
        this.f = i10;
        this.g = r1Var;
    }
}
