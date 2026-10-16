package zh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ y2(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                e3 e3Var = this.b;
                o3 o3Var = e3Var.a;
                if (!e3Var.u) {
                    e3Var.v = false;
                    if (e3Var.o) {
                        e3Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - e3Var.m) / 1000.0f, 0.25f);
                        float f7 = e3Var.n + min;
                        e3Var.n = f7;
                        float f10 = e3Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, e3Var.t));
                        float f11 = e3Var.k.f(min, e3Var.n > AndroidUtilities.lerp(0.1f, 1.0f, e3Var.t));
                        float f12 = e3Var.i.f(min, e3Var.j.b(0.5f));
                        float f13 = e3Var.h.f(min, e3Var.j.b(0.5f) && e3Var.i.b(0.5f));
                        e3Var.m = currentTimeMillis;
                        if (e3Var.j.c() && e3Var.i.c() && e3Var.h.c() && !e3Var.p) {
                            e3Var.p = true;
                            AndroidUtilities.runOnUIThread(new y2(e3Var, 2));
                        }
                        if (e3Var.j.c() && e3Var.i.c() && e3Var.h.b(0.25f) && !e3Var.q) {
                            e3Var.q = true;
                            AndroidUtilities.runOnUIThread(new y2(e3Var, 3));
                        }
                        j3 j3Var = e3Var.b;
                        if (j3Var != null) {
                            a3 a3Var = e3Var.h;
                            z2 z2Var = a3Var.b;
                            float f14 = a3Var.e - f13;
                            float f15 = f14 - 1.0f;
                            z2 z2Var2 = a3Var.i;
                            boolean z10 = z2Var == z2Var2;
                            z2 z2Var3 = a3Var.c;
                            boolean z11 = z2Var3 == z2Var2;
                            z2 z2Var4 = a3Var.d;
                            j3Var.a(z2Var, f15, z10, z2Var3, f14, z11, z2Var4, f14 + 1.0f, z2Var4 == z2Var2);
                        }
                        j3 j3Var2 = e3Var.c;
                        if (j3Var2 != null) {
                            a3 a3Var2 = e3Var.i;
                            z2 z2Var5 = a3Var2.b;
                            float f16 = a3Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            z2 z2Var6 = a3Var2.i;
                            boolean z12 = z2Var5 == z2Var6;
                            z2 z2Var7 = a3Var2.c;
                            boolean z13 = z2Var7 == z2Var6;
                            z2 z2Var8 = a3Var2.d;
                            j3Var2.a(z2Var5, f17, z12, z2Var7, f16, z13, z2Var8, f16 + 1.0f, z2Var8 == z2Var6);
                        }
                        j3 j3Var3 = e3Var.d;
                        if (j3Var3 != null) {
                            a3 a3Var3 = e3Var.k;
                            z2 z2Var9 = a3Var3.b;
                            float f18 = a3Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            z2 z2Var10 = a3Var3.i;
                            boolean z14 = z2Var9 == z2Var10;
                            z2 z2Var11 = a3Var3.c;
                            boolean z15 = z2Var11 == z2Var10;
                            z2 z2Var12 = a3Var3.d;
                            j3Var3.a(z2Var9, f19, z14, z2Var11, f18, z15, z2Var12, f18 + 1.0f, z2Var12 == z2Var10);
                        }
                        o3Var.g(0, ((d3) e3Var.i.c).c, true);
                        h3 h3Var = o3Var.c;
                        a3 a3Var4 = e3Var.h;
                        z2 z2Var13 = a3Var4.b;
                        c3 c3Var = (c3) z2Var13;
                        float f20 = a3Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        z2 z2Var14 = a3Var4.i;
                        boolean z16 = z2Var13 == z2Var14;
                        z2 z2Var15 = a3Var4.c;
                        c3 c3Var2 = (c3) z2Var15;
                        boolean z17 = z2Var15 == z2Var14;
                        z2 z2Var16 = a3Var4.d;
                        c3 c3Var3 = (c3) z2Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = z2Var16 == z2Var14;
                        a3 a3Var5 = e3Var.j;
                        b3 b3Var = (b3) a3Var5.b;
                        float f23 = a3Var5.e - f10;
                        b3 b3Var2 = (b3) a3Var5.c;
                        b3 b3Var3 = (b3) a3Var5.d;
                        h3Var.a = c3Var;
                        h3Var.b = c3Var2;
                        h3Var.c = c3Var3;
                        h3Var.d = f21;
                        h3Var.e = f20;
                        h3Var.f = f22;
                        h3Var.h = z16;
                        h3Var.n = z17;
                        h3Var.r = z18;
                        h3Var.s = b3Var;
                        h3Var.v = b3Var2;
                        h3Var.w = b3Var3;
                        h3Var.x = f23 - 1.0f;
                        h3Var.y = f23;
                        h3Var.E = f23 + 1.0f;
                        h3Var.invalidate();
                        e3Var.u = false;
                        e3Var.b();
                        break;
                    }
                }
                break;
            case 2:
                e3 e3Var2 = this.b;
                e3Var2.o = false;
                e3Var2.a.c.c();
                a1 a1Var = e3Var2.r;
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
