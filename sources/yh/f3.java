package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ f3(l3 l3Var, int i10) {
        this.a = i10;
        this.b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                l3 l3Var = this.b;
                w3 w3Var = l3Var.a;
                if (!l3Var.u) {
                    l3Var.v = false;
                    if (l3Var.o) {
                        l3Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - l3Var.m) / 1000.0f, 0.25f);
                        float f7 = l3Var.n + min;
                        l3Var.n = f7;
                        float f10 = l3Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, l3Var.t));
                        float f11 = l3Var.k.f(min, l3Var.n > AndroidUtilities.lerp(0.1f, 1.0f, l3Var.t));
                        float f12 = l3Var.i.f(min, l3Var.j.b(0.5f));
                        float f13 = l3Var.h.f(min, l3Var.j.b(0.5f) && l3Var.i.b(0.5f));
                        l3Var.m = currentTimeMillis;
                        if (l3Var.j.c() && l3Var.i.c() && l3Var.h.c() && !l3Var.p) {
                            l3Var.p = true;
                            AndroidUtilities.runOnUIThread(new f3(l3Var, 2));
                        }
                        if (l3Var.j.c() && l3Var.i.c() && l3Var.h.b(0.25f) && !l3Var.q) {
                            l3Var.q = true;
                            AndroidUtilities.runOnUIThread(new f3(l3Var, 3));
                        }
                        q3 q3Var = l3Var.b;
                        if (q3Var != null) {
                            h3 h3Var = l3Var.h;
                            g3 g3Var = h3Var.b;
                            float f14 = h3Var.e - f13;
                            float f15 = f14 - 1.0f;
                            g3 g3Var2 = h3Var.i;
                            boolean z10 = g3Var == g3Var2;
                            g3 g3Var3 = h3Var.c;
                            boolean z11 = g3Var3 == g3Var2;
                            g3 g3Var4 = h3Var.d;
                            q3Var.a(g3Var, f15, z10, g3Var3, f14, z11, g3Var4, f14 + 1.0f, g3Var4 == g3Var2);
                        }
                        q3 q3Var2 = l3Var.c;
                        if (q3Var2 != null) {
                            h3 h3Var2 = l3Var.i;
                            g3 g3Var5 = h3Var2.b;
                            float f16 = h3Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            g3 g3Var6 = h3Var2.i;
                            boolean z12 = g3Var5 == g3Var6;
                            g3 g3Var7 = h3Var2.c;
                            boolean z13 = g3Var7 == g3Var6;
                            g3 g3Var8 = h3Var2.d;
                            q3Var2.a(g3Var5, f17, z12, g3Var7, f16, z13, g3Var8, f16 + 1.0f, g3Var8 == g3Var6);
                        }
                        q3 q3Var3 = l3Var.d;
                        if (q3Var3 != null) {
                            h3 h3Var3 = l3Var.k;
                            g3 g3Var9 = h3Var3.b;
                            float f18 = h3Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            g3 g3Var10 = h3Var3.i;
                            boolean z14 = g3Var9 == g3Var10;
                            g3 g3Var11 = h3Var3.c;
                            boolean z15 = g3Var11 == g3Var10;
                            g3 g3Var12 = h3Var3.d;
                            q3Var3.a(g3Var9, f19, z14, g3Var11, f18, z15, g3Var12, f18 + 1.0f, g3Var12 == g3Var10);
                        }
                        w3Var.g(0, ((k3) l3Var.i.c).c, true);
                        o3 o3Var = w3Var.c;
                        h3 h3Var4 = l3Var.h;
                        g3 g3Var13 = h3Var4.b;
                        j3 j3Var = (j3) g3Var13;
                        float f20 = h3Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        g3 g3Var14 = h3Var4.i;
                        boolean z16 = g3Var13 == g3Var14;
                        g3 g3Var15 = h3Var4.c;
                        j3 j3Var2 = (j3) g3Var15;
                        boolean z17 = g3Var15 == g3Var14;
                        g3 g3Var16 = h3Var4.d;
                        j3 j3Var3 = (j3) g3Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = g3Var16 == g3Var14;
                        h3 h3Var5 = l3Var.j;
                        i3 i3Var = (i3) h3Var5.b;
                        float f23 = h3Var5.e - f10;
                        i3 i3Var2 = (i3) h3Var5.c;
                        i3 i3Var3 = (i3) h3Var5.d;
                        o3Var.a = j3Var;
                        o3Var.b = j3Var2;
                        o3Var.c = j3Var3;
                        o3Var.d = f21;
                        o3Var.e = f20;
                        o3Var.f = f22;
                        o3Var.h = z16;
                        o3Var.n = z17;
                        o3Var.r = z18;
                        o3Var.s = i3Var;
                        o3Var.v = i3Var2;
                        o3Var.w = i3Var3;
                        o3Var.x = f23 - 1.0f;
                        o3Var.y = f23;
                        o3Var.E = f23 + 1.0f;
                        o3Var.invalidate();
                        l3Var.u = false;
                        l3Var.b();
                        break;
                    }
                }
                break;
            case 2:
                l3 l3Var2 = this.b;
                l3Var2.o = false;
                l3Var2.a.c.c();
                b1 b1Var = l3Var2.r;
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
