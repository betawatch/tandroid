package zh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ d3(j3 j3Var, int i10) {
        this.a = i10;
        this.b = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                j3 j3Var = this.b;
                t3 t3Var = j3Var.a;
                if (!j3Var.u) {
                    j3Var.v = false;
                    if (j3Var.o) {
                        j3Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - j3Var.m) / 1000.0f, 0.25f);
                        float f7 = j3Var.n + min;
                        j3Var.n = f7;
                        float f10 = j3Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, j3Var.t));
                        float f11 = j3Var.k.f(min, j3Var.n > AndroidUtilities.lerp(0.1f, 1.0f, j3Var.t));
                        float f12 = j3Var.i.f(min, j3Var.j.b(0.5f));
                        float f13 = j3Var.h.f(min, j3Var.j.b(0.5f) && j3Var.i.b(0.5f));
                        j3Var.m = currentTimeMillis;
                        if (j3Var.j.c() && j3Var.i.c() && j3Var.h.c() && !j3Var.p) {
                            j3Var.p = true;
                            AndroidUtilities.runOnUIThread(new d3(j3Var, 2));
                        }
                        if (j3Var.j.c() && j3Var.i.c() && j3Var.h.b(0.25f) && !j3Var.q) {
                            j3Var.q = true;
                            AndroidUtilities.runOnUIThread(new d3(j3Var, 3));
                        }
                        o3 o3Var = j3Var.b;
                        if (o3Var != null) {
                            f3 f3Var = j3Var.h;
                            e3 e3Var = f3Var.b;
                            float f14 = f3Var.e - f13;
                            float f15 = f14 - 1.0f;
                            e3 e3Var2 = f3Var.i;
                            boolean z10 = e3Var == e3Var2;
                            e3 e3Var3 = f3Var.c;
                            boolean z11 = e3Var3 == e3Var2;
                            e3 e3Var4 = f3Var.d;
                            o3Var.a(e3Var, f15, z10, e3Var3, f14, z11, e3Var4, f14 + 1.0f, e3Var4 == e3Var2);
                        }
                        o3 o3Var2 = j3Var.c;
                        if (o3Var2 != null) {
                            f3 f3Var2 = j3Var.i;
                            e3 e3Var5 = f3Var2.b;
                            float f16 = f3Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            e3 e3Var6 = f3Var2.i;
                            boolean z12 = e3Var5 == e3Var6;
                            e3 e3Var7 = f3Var2.c;
                            boolean z13 = e3Var7 == e3Var6;
                            e3 e3Var8 = f3Var2.d;
                            o3Var2.a(e3Var5, f17, z12, e3Var7, f16, z13, e3Var8, f16 + 1.0f, e3Var8 == e3Var6);
                        }
                        o3 o3Var3 = j3Var.d;
                        if (o3Var3 != null) {
                            f3 f3Var3 = j3Var.k;
                            e3 e3Var9 = f3Var3.b;
                            float f18 = f3Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            e3 e3Var10 = f3Var3.i;
                            boolean z14 = e3Var9 == e3Var10;
                            e3 e3Var11 = f3Var3.c;
                            boolean z15 = e3Var11 == e3Var10;
                            e3 e3Var12 = f3Var3.d;
                            o3Var3.a(e3Var9, f19, z14, e3Var11, f18, z15, e3Var12, f18 + 1.0f, e3Var12 == e3Var10);
                        }
                        t3Var.g(0, ((i3) j3Var.i.c).c, true);
                        m3 m3Var = t3Var.c;
                        f3 f3Var4 = j3Var.h;
                        e3 e3Var13 = f3Var4.b;
                        h3 h3Var = (h3) e3Var13;
                        float f20 = f3Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        e3 e3Var14 = f3Var4.i;
                        boolean z16 = e3Var13 == e3Var14;
                        e3 e3Var15 = f3Var4.c;
                        h3 h3Var2 = (h3) e3Var15;
                        boolean z17 = e3Var15 == e3Var14;
                        e3 e3Var16 = f3Var4.d;
                        h3 h3Var3 = (h3) e3Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = e3Var16 == e3Var14;
                        f3 f3Var5 = j3Var.j;
                        g3 g3Var = (g3) f3Var5.b;
                        float f23 = f3Var5.e - f10;
                        g3 g3Var2 = (g3) f3Var5.c;
                        g3 g3Var3 = (g3) f3Var5.d;
                        m3Var.a = h3Var;
                        m3Var.b = h3Var2;
                        m3Var.c = h3Var3;
                        m3Var.d = f21;
                        m3Var.e = f20;
                        m3Var.f = f22;
                        m3Var.h = z16;
                        m3Var.n = z17;
                        m3Var.r = z18;
                        m3Var.s = g3Var;
                        m3Var.v = g3Var2;
                        m3Var.w = g3Var3;
                        m3Var.x = f23 - 1.0f;
                        m3Var.y = f23;
                        m3Var.E = f23 + 1.0f;
                        m3Var.invalidate();
                        j3Var.u = false;
                        j3Var.b();
                        break;
                    }
                }
                break;
            case 2:
                j3 j3Var2 = this.b;
                j3Var2.o = false;
                j3Var2.a.c.c();
                b1 b1Var = j3Var2.r;
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
