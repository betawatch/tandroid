package pg;

import v7.a7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o1 extends r1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ s1 g;

    public /* synthetic */ o1(s1 s1Var, int i10) {
        this.f = i10;
        this.g = s1Var;
    }

    @Override // pg.r1
    public final void a() {
        switch (this.f) {
            case 0:
                s1 s1Var = this.g;
                i1 i1Var = s1Var.h;
                double atan2 = Math.atan2(i1Var.c - i1Var.j, i1Var.b - i1Var.i) + 3.141592653589793d;
                i1 i1Var2 = s1Var.h;
                double d = i1Var2.k / 5.5f;
                float cos = i1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = s1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                i1 i1Var3 = this.g.h;
                float f7 = i1Var3.b + i1Var3.d;
                float f10 = i1Var3.c;
                this.d = f7;
                this.e = f10;
                break;
            case 2:
                s1 s1Var2 = this.g;
                i1 i1Var4 = s1Var2.h;
                float min = Math.min(i1Var4.d, i1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + s1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + s1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                i1 i1Var5 = this.g.h;
                float f11 = i1Var5.b;
                float abs = i1Var5.c - Math.abs(i1Var5.e);
                this.d = f11;
                this.e = abs;
                break;
            case 4:
                i1 i1Var6 = this.g.h;
                float f12 = i1Var6.i;
                float f13 = i1Var6.j;
                i1Var6.i = f12;
                i1Var6.j = f13;
                this.d = f12;
                this.e = f13;
                break;
            default:
                i1 i1Var7 = this.g.h;
                this.d = i1Var7.b;
                this.e = i1Var7.c;
                break;
        }
    }

    @Override // pg.r1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                s1 s1Var = this.g;
                i1 i1Var = s1Var.h;
                double atan2 = Math.atan2(i1Var.c - i1Var.j, i1Var.b - i1Var.i) + 1.5707963267948966d;
                i1 i1Var2 = s1Var.h;
                float a2 = (a7.a(i1Var2.b, i1Var2.c, i1Var2.i, i1Var2.j) * 5.5f) / 2.0f;
                i1 i1Var3 = s1Var.h;
                float f11 = i1Var3.b;
                float f12 = i1Var3.c;
                s1Var.getClass();
                i1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f7;
                this.e = f10;
                i1 i1Var4 = this.g.h;
                float a10 = a7.a(i1Var4.b, i1Var4.c, f7, f10);
                i1Var4.e = a10;
                i1Var4.d = a10;
                break;
            case 2:
                s1 s1Var2 = this.g;
                i1 i1Var5 = s1Var2.h;
                float a11 = a7.a(i1Var5.b, i1Var5.c, f7, f10);
                i1Var5.e = a11;
                i1Var5.d = a11;
                s1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f10, f7 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                s1 s1Var3 = this.g;
                s1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f10, f7 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i10 = 0; i10 < s1Var3.m.size(); i10++) {
                    r1 r1Var = (r1) s1Var3.m.get(i10);
                    if (r1Var instanceof q1) {
                        r1Var.a();
                    }
                }
                break;
            case 4:
                i1 i1Var6 = this.g.h;
                i1Var6.i = f7;
                i1Var6.j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = i1Var6.c;
                float f14 = i1Var6.e;
                float f15 = f13 - f14;
                if (f10 > f15 && f10 < f13 + f14) {
                    float f16 = i1Var6.b;
                    if (f7 <= f16) {
                        float f17 = f16 - i1Var6.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + i1Var6.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = i1Var6.b;
                float f21 = i1Var6.d;
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
                i1Var6.i = f19;
                i1Var6.j = this.e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    s1 s1Var4 = this.g;
                    if (i11 >= s1Var4.m.size()) {
                        i1 i1Var7 = s1Var4.h;
                        i1Var7.b = f7;
                        i1Var7.c = f10;
                        this.d = f7;
                        this.e = f10;
                        break;
                    } else {
                        r1 r1Var2 = (r1) s1Var4.m.get(i11);
                        if (r1Var2 != this) {
                            r1Var2.a();
                        }
                        i11++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(s1 s1Var, int i10, boolean z10) {
        super(0);
        this.f = i10;
        this.g = s1Var;
    }
}
