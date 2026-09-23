package pg;

import v7.z6;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m1 extends p1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ q1 g;

    public /* synthetic */ m1(q1 q1Var, int i10) {
        this.f = i10;
        this.g = q1Var;
    }

    @Override // pg.p1
    public final void a() {
        switch (this.f) {
            case 0:
                q1 q1Var = this.g;
                g1 g1Var = q1Var.h;
                double atan2 = Math.atan2(g1Var.c - g1Var.j, g1Var.b - g1Var.i) + 3.141592653589793d;
                g1 g1Var2 = q1Var.h;
                double d = g1Var2.k / 5.5f;
                float cos = g1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = q1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                g1 g1Var3 = this.g.h;
                float f7 = g1Var3.b + g1Var3.d;
                float f10 = g1Var3.c;
                this.d = f7;
                this.e = f10;
                break;
            case 2:
                q1 q1Var2 = this.g;
                g1 g1Var4 = q1Var2.h;
                float min = Math.min(g1Var4.d, g1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + q1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + q1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                g1 g1Var5 = this.g.h;
                float f11 = g1Var5.b;
                float abs = g1Var5.c - Math.abs(g1Var5.e);
                this.d = f11;
                this.e = abs;
                break;
            case 4:
                g1 g1Var6 = this.g.h;
                float f12 = g1Var6.i;
                float f13 = g1Var6.j;
                g1Var6.i = f12;
                g1Var6.j = f13;
                this.d = f12;
                this.e = f13;
                break;
            default:
                g1 g1Var7 = this.g.h;
                this.d = g1Var7.b;
                this.e = g1Var7.c;
                break;
        }
    }

    @Override // pg.p1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                q1 q1Var = this.g;
                g1 g1Var = q1Var.h;
                double atan2 = Math.atan2(g1Var.c - g1Var.j, g1Var.b - g1Var.i) + 1.5707963267948966d;
                g1 g1Var2 = q1Var.h;
                float a2 = (z6.a(g1Var2.b, g1Var2.c, g1Var2.i, g1Var2.j) * 5.5f) / 2.0f;
                g1 g1Var3 = q1Var.h;
                float f11 = g1Var3.b;
                float f12 = g1Var3.c;
                q1Var.getClass();
                g1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f7;
                this.e = f10;
                g1 g1Var4 = this.g.h;
                float a10 = z6.a(g1Var4.b, g1Var4.c, f7, f10);
                g1Var4.e = a10;
                g1Var4.d = a10;
                break;
            case 2:
                q1 q1Var2 = this.g;
                g1 g1Var5 = q1Var2.h;
                float a11 = z6.a(g1Var5.b, g1Var5.c, f7, f10);
                g1Var5.e = a11;
                g1Var5.d = a11;
                q1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f10, f7 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                q1 q1Var3 = this.g;
                q1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f10, f7 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i10 = 0; i10 < q1Var3.m.size(); i10++) {
                    p1 p1Var = (p1) q1Var3.m.get(i10);
                    if (p1Var instanceof o1) {
                        p1Var.a();
                    }
                }
                break;
            case 4:
                g1 g1Var6 = this.g.h;
                g1Var6.i = f7;
                g1Var6.j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = g1Var6.c;
                float f14 = g1Var6.e;
                float f15 = f13 - f14;
                if (f10 > f15 && f10 < f13 + f14) {
                    float f16 = g1Var6.b;
                    if (f7 <= f16) {
                        float f17 = f16 - g1Var6.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + g1Var6.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = g1Var6.b;
                float f21 = g1Var6.d;
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
                g1Var6.i = f19;
                g1Var6.j = this.e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    q1 q1Var4 = this.g;
                    if (i11 >= q1Var4.m.size()) {
                        g1 g1Var7 = q1Var4.h;
                        g1Var7.b = f7;
                        g1Var7.c = f10;
                        this.d = f7;
                        this.e = f10;
                        break;
                    } else {
                        p1 p1Var2 = (p1) q1Var4.m.get(i11);
                        if (p1Var2 != this) {
                            p1Var2.a();
                        }
                        i11++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(q1 q1Var, int i10, boolean z10) {
        super(0);
        this.f = i10;
        this.g = q1Var;
    }
}
