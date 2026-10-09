package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ z2(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                f3 f3Var = this.b;
                p3 p3Var = f3Var.a;
                if (!f3Var.u) {
                    f3Var.v = false;
                    if (f3Var.o) {
                        f3Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - f3Var.m) / 1000.0f, 0.25f);
                        float f7 = f3Var.n + min;
                        f3Var.n = f7;
                        float f10 = f3Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, f3Var.t));
                        float f11 = f3Var.k.f(min, f3Var.n > AndroidUtilities.lerp(0.1f, 1.0f, f3Var.t));
                        float f12 = f3Var.i.f(min, f3Var.j.b(0.5f));
                        float f13 = f3Var.h.f(min, f3Var.j.b(0.5f) && f3Var.i.b(0.5f));
                        f3Var.m = currentTimeMillis;
                        if (f3Var.j.c() && f3Var.i.c() && f3Var.h.c() && !f3Var.p) {
                            f3Var.p = true;
                            AndroidUtilities.runOnUIThread(new z2(f3Var, 2));
                        }
                        if (f3Var.j.c() && f3Var.i.c() && f3Var.h.b(0.25f) && !f3Var.q) {
                            f3Var.q = true;
                            AndroidUtilities.runOnUIThread(new z2(f3Var, 3));
                        }
                        k3 k3Var = f3Var.b;
                        if (k3Var != null) {
                            b3 b3Var = f3Var.h;
                            a3 a3Var = b3Var.b;
                            float f14 = b3Var.e - f13;
                            float f15 = f14 - 1.0f;
                            a3 a3Var2 = b3Var.i;
                            boolean z10 = a3Var == a3Var2;
                            a3 a3Var3 = b3Var.c;
                            boolean z11 = a3Var3 == a3Var2;
                            a3 a3Var4 = b3Var.d;
                            k3Var.a(a3Var, f15, z10, a3Var3, f14, z11, a3Var4, f14 + 1.0f, a3Var4 == a3Var2);
                        }
                        k3 k3Var2 = f3Var.c;
                        if (k3Var2 != null) {
                            b3 b3Var2 = f3Var.i;
                            a3 a3Var5 = b3Var2.b;
                            float f16 = b3Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            a3 a3Var6 = b3Var2.i;
                            boolean z12 = a3Var5 == a3Var6;
                            a3 a3Var7 = b3Var2.c;
                            boolean z13 = a3Var7 == a3Var6;
                            a3 a3Var8 = b3Var2.d;
                            k3Var2.a(a3Var5, f17, z12, a3Var7, f16, z13, a3Var8, f16 + 1.0f, a3Var8 == a3Var6);
                        }
                        k3 k3Var3 = f3Var.d;
                        if (k3Var3 != null) {
                            b3 b3Var3 = f3Var.k;
                            a3 a3Var9 = b3Var3.b;
                            float f18 = b3Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            a3 a3Var10 = b3Var3.i;
                            boolean z14 = a3Var9 == a3Var10;
                            a3 a3Var11 = b3Var3.c;
                            boolean z15 = a3Var11 == a3Var10;
                            a3 a3Var12 = b3Var3.d;
                            k3Var3.a(a3Var9, f19, z14, a3Var11, f18, z15, a3Var12, f18 + 1.0f, a3Var12 == a3Var10);
                        }
                        p3Var.g(0, ((e3) f3Var.i.c).c, true);
                        i3 i3Var = p3Var.c;
                        b3 b3Var4 = f3Var.h;
                        a3 a3Var13 = b3Var4.b;
                        d3 d3Var = (d3) a3Var13;
                        float f20 = b3Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        a3 a3Var14 = b3Var4.i;
                        boolean z16 = a3Var13 == a3Var14;
                        a3 a3Var15 = b3Var4.c;
                        d3 d3Var2 = (d3) a3Var15;
                        boolean z17 = a3Var15 == a3Var14;
                        a3 a3Var16 = b3Var4.d;
                        d3 d3Var3 = (d3) a3Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = a3Var16 == a3Var14;
                        b3 b3Var5 = f3Var.j;
                        c3 c3Var = (c3) b3Var5.b;
                        float f23 = b3Var5.e - f10;
                        c3 c3Var2 = (c3) b3Var5.c;
                        c3 c3Var3 = (c3) b3Var5.d;
                        i3Var.a = d3Var;
                        i3Var.b = d3Var2;
                        i3Var.c = d3Var3;
                        i3Var.d = f21;
                        i3Var.e = f20;
                        i3Var.f = f22;
                        i3Var.h = z16;
                        i3Var.n = z17;
                        i3Var.r = z18;
                        i3Var.s = c3Var;
                        i3Var.v = c3Var2;
                        i3Var.w = c3Var3;
                        i3Var.x = f23 - 1.0f;
                        i3Var.y = f23;
                        i3Var.E = f23 + 1.0f;
                        i3Var.invalidate();
                        f3Var.u = false;
                        f3Var.b();
                        break;
                    }
                }
                break;
            case 2:
                f3 f3Var2 = this.b;
                f3Var2.o = false;
                f3Var2.a.c.c();
                a1 a1Var = f3Var2.r;
                if (a1Var != null) {
                    a1Var.run();
                    break;
                }
                break;
            default:
                a1 a1Var2 = this.b.s;
                if (a1Var2 != null) {
                    a1Var2.run();
                    break;
                }
                break;
        }
    }
}
