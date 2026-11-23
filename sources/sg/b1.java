package sg;

import a8.x9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b1 extends e1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ f1 g;

    public /* synthetic */ b1(f1 f1Var, int i7) {
        this.f = i7;
        this.g = f1Var;
    }

    @Override // sg.e1
    public final void a() {
        switch (this.f) {
            case 0:
                f1 f1Var = this.g;
                w0 w0Var = f1Var.h;
                double atan2 = Math.atan2(w0Var.c - w0Var.j, w0Var.b - w0Var.i) + 3.141592653589793d;
                w0 w0Var2 = f1Var.h;
                double d = w0Var2.k / 5.5f;
                float cos = w0Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = f1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                w0 w0Var3 = this.g.h;
                float f10 = w0Var3.b + w0Var3.d;
                float f11 = w0Var3.c;
                this.d = f10;
                this.e = f11;
                break;
            case 2:
                f1 f1Var2 = this.g;
                w0 w0Var4 = f1Var2.h;
                float min = Math.min(w0Var4.d, w0Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + f1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + f1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                w0 w0Var5 = this.g.h;
                float f12 = w0Var5.b;
                float abs = w0Var5.c - Math.abs(w0Var5.e);
                this.d = f12;
                this.e = abs;
                break;
            case 4:
                w0 w0Var6 = this.g.h;
                float f13 = w0Var6.i;
                float f14 = w0Var6.j;
                w0Var6.i = f13;
                w0Var6.j = f14;
                this.d = f13;
                this.e = f14;
                break;
            default:
                w0 w0Var7 = this.g.h;
                this.d = w0Var7.b;
                this.e = w0Var7.c;
                break;
        }
    }

    @Override // sg.e1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                f1 f1Var = this.g;
                w0 w0Var = f1Var.h;
                double atan2 = Math.atan2(w0Var.c - w0Var.j, w0Var.b - w0Var.i) + 1.5707963267948966d;
                w0 w0Var2 = f1Var.h;
                float a10 = (x9.a(w0Var2.b, w0Var2.c, w0Var2.i, w0Var2.j) * 5.5f) / 2.0f;
                w0 w0Var3 = f1Var.h;
                float f12 = w0Var3.b;
                float f13 = w0Var3.c;
                f1Var.getClass();
                w0Var3.k = Math.min(a10, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.e = f11;
                w0 w0Var4 = this.g.h;
                float a11 = x9.a(w0Var4.b, w0Var4.c, f10, f11);
                w0Var4.e = a11;
                w0Var4.d = a11;
                break;
            case 2:
                f1 f1Var2 = this.g;
                w0 w0Var5 = f1Var2.h;
                float a12 = x9.a(w0Var5.b, w0Var5.c, f10, f11);
                w0Var5.e = a12;
                w0Var5.d = a12;
                f1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f11, f10 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                f1 f1Var3 = this.g;
                f1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f11, f10 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i7 = 0; i7 < f1Var3.m.size(); i7++) {
                    e1 e1Var = (e1) f1Var3.m.get(i7);
                    if (e1Var instanceof d1) {
                        e1Var.a();
                    }
                }
                break;
            case 4:
                w0 w0Var6 = this.g.h;
                w0Var6.i = f10;
                w0Var6.j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = w0Var6.c;
                float f15 = w0Var6.e;
                float f16 = f14 - f15;
                if (f11 > f16 && f11 < f14 + f15) {
                    float f17 = w0Var6.b;
                    if (f10 <= f17) {
                        float f18 = f17 - w0Var6.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + w0Var6.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = w0Var6.b;
                float f22 = w0Var6.d;
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
                w0Var6.i = f20;
                w0Var6.j = this.e;
                break;
            default:
                int i10 = 0;
                while (true) {
                    f1 f1Var4 = this.g;
                    if (i10 >= f1Var4.m.size()) {
                        w0 w0Var7 = f1Var4.h;
                        w0Var7.b = f10;
                        w0Var7.c = f11;
                        this.d = f10;
                        this.e = f11;
                        break;
                    } else {
                        e1 e1Var2 = (e1) f1Var4.m.get(i10);
                        if (e1Var2 != this) {
                            e1Var2.a();
                        }
                        i10++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(f1 f1Var, int i7, boolean z10) {
        super(0);
        this.f = i7;
        this.g = f1Var;
    }
}
