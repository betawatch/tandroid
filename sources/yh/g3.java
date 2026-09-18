package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ g3(m3 m3Var, int i10) {
        this.a = i10;
        this.b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                m3 m3Var = this.b;
                x3 x3Var = m3Var.a;
                if (!m3Var.u) {
                    m3Var.v = false;
                    if (m3Var.o) {
                        m3Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - m3Var.m) / 1000.0f, 0.25f);
                        float f7 = m3Var.n + min;
                        m3Var.n = f7;
                        float f10 = m3Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, m3Var.t));
                        float f11 = m3Var.k.f(min, m3Var.n > AndroidUtilities.lerp(0.1f, 1.0f, m3Var.t));
                        float f12 = m3Var.i.f(min, m3Var.j.b(0.5f));
                        float f13 = m3Var.h.f(min, m3Var.j.b(0.5f) && m3Var.i.b(0.5f));
                        m3Var.m = currentTimeMillis;
                        if (m3Var.j.c() && m3Var.i.c() && m3Var.h.c() && !m3Var.p) {
                            m3Var.p = true;
                            AndroidUtilities.runOnUIThread(new g3(m3Var, 2));
                        }
                        if (m3Var.j.c() && m3Var.i.c() && m3Var.h.b(0.25f) && !m3Var.q) {
                            m3Var.q = true;
                            AndroidUtilities.runOnUIThread(new g3(m3Var, 3));
                        }
                        r3 r3Var = m3Var.b;
                        if (r3Var != null) {
                            i3 i3Var = m3Var.h;
                            h3 h3Var = i3Var.b;
                            float f14 = i3Var.e - f13;
                            float f15 = f14 - 1.0f;
                            h3 h3Var2 = i3Var.i;
                            boolean z10 = h3Var == h3Var2;
                            h3 h3Var3 = i3Var.c;
                            boolean z11 = h3Var3 == h3Var2;
                            h3 h3Var4 = i3Var.d;
                            r3Var.a(h3Var, f15, z10, h3Var3, f14, z11, h3Var4, f14 + 1.0f, h3Var4 == h3Var2);
                        }
                        r3 r3Var2 = m3Var.c;
                        if (r3Var2 != null) {
                            i3 i3Var2 = m3Var.i;
                            h3 h3Var5 = i3Var2.b;
                            float f16 = i3Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            h3 h3Var6 = i3Var2.i;
                            boolean z12 = h3Var5 == h3Var6;
                            h3 h3Var7 = i3Var2.c;
                            boolean z13 = h3Var7 == h3Var6;
                            h3 h3Var8 = i3Var2.d;
                            r3Var2.a(h3Var5, f17, z12, h3Var7, f16, z13, h3Var8, f16 + 1.0f, h3Var8 == h3Var6);
                        }
                        r3 r3Var3 = m3Var.d;
                        if (r3Var3 != null) {
                            i3 i3Var3 = m3Var.k;
                            h3 h3Var9 = i3Var3.b;
                            float f18 = i3Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            h3 h3Var10 = i3Var3.i;
                            boolean z14 = h3Var9 == h3Var10;
                            h3 h3Var11 = i3Var3.c;
                            boolean z15 = h3Var11 == h3Var10;
                            h3 h3Var12 = i3Var3.d;
                            r3Var3.a(h3Var9, f19, z14, h3Var11, f18, z15, h3Var12, f18 + 1.0f, h3Var12 == h3Var10);
                        }
                        x3Var.g(0, ((l3) m3Var.i.c).c, true);
                        p3 p3Var = x3Var.c;
                        i3 i3Var4 = m3Var.h;
                        h3 h3Var13 = i3Var4.b;
                        k3 k3Var = (k3) h3Var13;
                        float f20 = i3Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        h3 h3Var14 = i3Var4.i;
                        boolean z16 = h3Var13 == h3Var14;
                        h3 h3Var15 = i3Var4.c;
                        k3 k3Var2 = (k3) h3Var15;
                        boolean z17 = h3Var15 == h3Var14;
                        h3 h3Var16 = i3Var4.d;
                        k3 k3Var3 = (k3) h3Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = h3Var16 == h3Var14;
                        i3 i3Var5 = m3Var.j;
                        j3 j3Var = (j3) i3Var5.b;
                        float f23 = i3Var5.e - f10;
                        j3 j3Var2 = (j3) i3Var5.c;
                        j3 j3Var3 = (j3) i3Var5.d;
                        p3Var.a = k3Var;
                        p3Var.b = k3Var2;
                        p3Var.c = k3Var3;
                        p3Var.d = f21;
                        p3Var.e = f20;
                        p3Var.f = f22;
                        p3Var.h = z16;
                        p3Var.n = z17;
                        p3Var.r = z18;
                        p3Var.s = j3Var;
                        p3Var.v = j3Var2;
                        p3Var.w = j3Var3;
                        p3Var.x = f23 - 1.0f;
                        p3Var.y = f23;
                        p3Var.E = f23 + 1.0f;
                        p3Var.invalidate();
                        m3Var.u = false;
                        m3Var.b();
                        break;
                    }
                }
                break;
            case 2:
                m3 m3Var2 = this.b;
                m3Var2.o = false;
                m3Var2.a.c.c();
                b1 b1Var = m3Var2.r;
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
