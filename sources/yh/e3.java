package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ e3(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                k3 k3Var = this.b;
                v3 v3Var = k3Var.a;
                if (!k3Var.u) {
                    k3Var.v = false;
                    if (k3Var.o) {
                        k3Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - k3Var.m) / 1000.0f, 0.25f);
                        float f7 = k3Var.n + min;
                        k3Var.n = f7;
                        float f10 = k3Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, k3Var.t));
                        float f11 = k3Var.k.f(min, k3Var.n > AndroidUtilities.lerp(0.1f, 1.0f, k3Var.t));
                        float f12 = k3Var.i.f(min, k3Var.j.b(0.5f));
                        float f13 = k3Var.h.f(min, k3Var.j.b(0.5f) && k3Var.i.b(0.5f));
                        k3Var.m = currentTimeMillis;
                        if (k3Var.j.c() && k3Var.i.c() && k3Var.h.c() && !k3Var.p) {
                            k3Var.p = true;
                            AndroidUtilities.runOnUIThread(new e3(k3Var, 2));
                        }
                        if (k3Var.j.c() && k3Var.i.c() && k3Var.h.b(0.25f) && !k3Var.q) {
                            k3Var.q = true;
                            AndroidUtilities.runOnUIThread(new e3(k3Var, 3));
                        }
                        p3 p3Var = k3Var.b;
                        if (p3Var != null) {
                            g3 g3Var = k3Var.h;
                            f3 f3Var = g3Var.b;
                            float f14 = g3Var.e - f13;
                            float f15 = f14 - 1.0f;
                            f3 f3Var2 = g3Var.i;
                            boolean z10 = f3Var == f3Var2;
                            f3 f3Var3 = g3Var.c;
                            boolean z11 = f3Var3 == f3Var2;
                            f3 f3Var4 = g3Var.d;
                            p3Var.a(f3Var, f15, z10, f3Var3, f14, z11, f3Var4, f14 + 1.0f, f3Var4 == f3Var2);
                        }
                        p3 p3Var2 = k3Var.c;
                        if (p3Var2 != null) {
                            g3 g3Var2 = k3Var.i;
                            f3 f3Var5 = g3Var2.b;
                            float f16 = g3Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            f3 f3Var6 = g3Var2.i;
                            boolean z12 = f3Var5 == f3Var6;
                            f3 f3Var7 = g3Var2.c;
                            boolean z13 = f3Var7 == f3Var6;
                            f3 f3Var8 = g3Var2.d;
                            p3Var2.a(f3Var5, f17, z12, f3Var7, f16, z13, f3Var8, f16 + 1.0f, f3Var8 == f3Var6);
                        }
                        p3 p3Var3 = k3Var.d;
                        if (p3Var3 != null) {
                            g3 g3Var3 = k3Var.k;
                            f3 f3Var9 = g3Var3.b;
                            float f18 = g3Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            f3 f3Var10 = g3Var3.i;
                            boolean z14 = f3Var9 == f3Var10;
                            f3 f3Var11 = g3Var3.c;
                            boolean z15 = f3Var11 == f3Var10;
                            f3 f3Var12 = g3Var3.d;
                            p3Var3.a(f3Var9, f19, z14, f3Var11, f18, z15, f3Var12, f18 + 1.0f, f3Var12 == f3Var10);
                        }
                        v3Var.g(0, ((j3) k3Var.i.c).c, true);
                        n3 n3Var = v3Var.c;
                        g3 g3Var4 = k3Var.h;
                        f3 f3Var13 = g3Var4.b;
                        i3 i3Var = (i3) f3Var13;
                        float f20 = g3Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        f3 f3Var14 = g3Var4.i;
                        boolean z16 = f3Var13 == f3Var14;
                        f3 f3Var15 = g3Var4.c;
                        i3 i3Var2 = (i3) f3Var15;
                        boolean z17 = f3Var15 == f3Var14;
                        f3 f3Var16 = g3Var4.d;
                        i3 i3Var3 = (i3) f3Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = f3Var16 == f3Var14;
                        g3 g3Var5 = k3Var.j;
                        h3 h3Var = (h3) g3Var5.b;
                        float f23 = g3Var5.e - f10;
                        h3 h3Var2 = (h3) g3Var5.c;
                        h3 h3Var3 = (h3) g3Var5.d;
                        n3Var.a = i3Var;
                        n3Var.b = i3Var2;
                        n3Var.c = i3Var3;
                        n3Var.d = f21;
                        n3Var.e = f20;
                        n3Var.f = f22;
                        n3Var.h = z16;
                        n3Var.n = z17;
                        n3Var.r = z18;
                        n3Var.s = h3Var;
                        n3Var.v = h3Var2;
                        n3Var.w = h3Var3;
                        n3Var.x = f23 - 1.0f;
                        n3Var.y = f23;
                        n3Var.E = f23 + 1.0f;
                        n3Var.invalidate();
                        k3Var.u = false;
                        k3Var.b();
                        break;
                    }
                }
                break;
            case 2:
                k3 k3Var2 = this.b;
                k3Var2.o = false;
                k3Var2.a.c.c();
                b1 b1Var = k3Var2.r;
                if (b1Var != null) {
                    b1Var.run();
                    break;
                }
                break;
            default:
                b1 b1Var2 = this.b.s;
                if (b1Var2 != null) {
                    b1Var2.run();
                    break;
                }
                break;
        }
    }
}
