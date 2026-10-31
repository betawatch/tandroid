package rh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ h3(n3 n3Var, int i10) {
        this.a = i10;
        this.b = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                n3 n3Var = this.b;
                y3 y3Var = n3Var.a;
                if (!n3Var.u) {
                    n3Var.v = false;
                    if (n3Var.o) {
                        n3Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - n3Var.m) / 1000.0f, 0.25f);
                        float f7 = n3Var.n + min;
                        n3Var.n = f7;
                        float f10 = n3Var.j.f(f7 > org.telegram.messenger.i0.T1(0.1f, 1.0f, n3Var.t), min);
                        float f11 = n3Var.k.f(n3Var.n > org.telegram.messenger.i0.T1(0.1f, 1.0f, n3Var.t), min);
                        float f12 = n3Var.i.f(n3Var.j.b(0.5f), min);
                        float f13 = n3Var.h.f(n3Var.j.b(0.5f) && n3Var.i.b(0.5f), min);
                        n3Var.m = currentTimeMillis;
                        if (n3Var.j.c() && n3Var.i.c() && n3Var.h.c() && !n3Var.p) {
                            n3Var.p = true;
                            org.telegram.messenger.i0.g3(new h3(n3Var, 2));
                        }
                        if (n3Var.j.c() && n3Var.i.c() && n3Var.h.b(0.25f) && !n3Var.q) {
                            n3Var.q = true;
                            org.telegram.messenger.i0.g3(new h3(n3Var, 3));
                        }
                        s3 s3Var = n3Var.b;
                        if (s3Var != null) {
                            j3 j3Var = n3Var.h;
                            i3 i3Var = j3Var.b;
                            float f14 = j3Var.e - f13;
                            float f15 = f14 - 1.0f;
                            i3 i3Var2 = j3Var.i;
                            boolean z10 = i3Var == i3Var2;
                            i3 i3Var3 = j3Var.c;
                            boolean z11 = i3Var3 == i3Var2;
                            i3 i3Var4 = j3Var.d;
                            s3Var.a(i3Var, f15, z10, i3Var3, f14, z11, i3Var4, f14 + 1.0f, i3Var4 == i3Var2);
                        }
                        s3 s3Var2 = n3Var.c;
                        if (s3Var2 != null) {
                            j3 j3Var2 = n3Var.i;
                            i3 i3Var5 = j3Var2.b;
                            float f16 = j3Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            i3 i3Var6 = j3Var2.i;
                            boolean z12 = i3Var5 == i3Var6;
                            i3 i3Var7 = j3Var2.c;
                            boolean z13 = i3Var7 == i3Var6;
                            i3 i3Var8 = j3Var2.d;
                            s3Var2.a(i3Var5, f17, z12, i3Var7, f16, z13, i3Var8, f16 + 1.0f, i3Var8 == i3Var6);
                        }
                        s3 s3Var3 = n3Var.d;
                        if (s3Var3 != null) {
                            j3 j3Var3 = n3Var.k;
                            i3 i3Var9 = j3Var3.b;
                            float f18 = j3Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            i3 i3Var10 = j3Var3.i;
                            boolean z14 = i3Var9 == i3Var10;
                            i3 i3Var11 = j3Var3.c;
                            boolean z15 = i3Var11 == i3Var10;
                            i3 i3Var12 = j3Var3.d;
                            s3Var3.a(i3Var9, f19, z14, i3Var11, f18, z15, i3Var12, f18 + 1.0f, i3Var12 == i3Var10);
                        }
                        y3Var.g(0, ((m3) n3Var.i.c).c, true);
                        q3 q3Var = y3Var.c;
                        j3 j3Var4 = n3Var.h;
                        i3 i3Var13 = j3Var4.b;
                        l3 l3Var = (l3) i3Var13;
                        float f20 = j3Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        i3 i3Var14 = j3Var4.i;
                        boolean z16 = i3Var13 == i3Var14;
                        i3 i3Var15 = j3Var4.c;
                        l3 l3Var2 = (l3) i3Var15;
                        boolean z17 = i3Var15 == i3Var14;
                        i3 i3Var16 = j3Var4.d;
                        l3 l3Var3 = (l3) i3Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = i3Var16 == i3Var14;
                        j3 j3Var5 = n3Var.j;
                        k3 k3Var = (k3) j3Var5.b;
                        float f23 = j3Var5.e - f10;
                        k3 k3Var2 = (k3) j3Var5.c;
                        k3 k3Var3 = (k3) j3Var5.d;
                        q3Var.a = l3Var;
                        q3Var.b = l3Var2;
                        q3Var.c = l3Var3;
                        q3Var.d = f21;
                        q3Var.e = f20;
                        q3Var.f = f22;
                        q3Var.h = z16;
                        q3Var.n = z17;
                        q3Var.r = z18;
                        q3Var.s = k3Var;
                        q3Var.w = k3Var2;
                        q3Var.x = k3Var3;
                        q3Var.y = f23 - 1.0f;
                        q3Var.D = f23;
                        q3Var.E = f23 + 1.0f;
                        q3Var.invalidate();
                        n3Var.u = false;
                        n3Var.b();
                        break;
                    }
                }
                break;
            case 2:
                n3 n3Var2 = this.b;
                n3Var2.o = false;
                n3Var2.a.c.c();
                w0 w0Var = n3Var2.r;
                if (w0Var != null) {
                    w0Var.run();
                    break;
                }
                break;
            default:
                w0 w0Var2 = this.b.s;
                if (w0Var2 != null) {
                    w0Var2.run();
                    break;
                }
                break;
        }
    }
}
