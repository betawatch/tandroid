// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tf5 implements s84 {
    public u84 b;
    public vb3 c;
    public vh2 d;
    public sh7 e;
    public int g;
    public long h;
    public int i;
    public final yw7 a = new yw7(16);
    public long j = -1;
    public byte f = 0;

    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        while (true) {
            byte b = this.f;
            if (b == 0) {
                int i = this.i;
                yw7 yw7Var = this.a;
                if (i == 0) {
                    if (!((vb3) t84Var).c(yw7Var.a, 0, 8, true)) {
                        u84 u84Var = this.b;
                        u84Var.getClass();
                        u84Var.B();
                        this.b.f0(new od0(-9223372036854775807L));
                        this.f = (byte) 4;
                        return -1;
                    }
                    this.i = 8;
                    yw7Var.N(0);
                    this.h = yw7Var.C();
                    this.g = yw7Var.m();
                }
                long j = this.h;
                if (j == 1) {
                    ((vb3) t84Var).c(yw7Var.a, 8, 8, false);
                    this.i += 8;
                    j = yw7Var.G();
                    this.h = j;
                }
                if (this.g == 1836086884) {
                    long j2 = ((vb3) t84Var).d;
                    this.j = j2;
                    long j3 = this.i;
                    hh7 hh7Var = new hh7(0L, j2 - j3, -9223372036854775807L, j2, j - j3);
                    u84 u84Var2 = this.b;
                    u84Var2.getClass();
                    yzb c0 = u84Var2.c0(1024, 4);
                    fo4 fo4Var = new fo4();
                    fo4Var.r = wf7.n("image/heic");
                    fo4Var.l = new nf7(hh7Var);
                    mlb.w(fo4Var, c0);
                    this.f = (byte) 2;
                } else {
                    this.f = (byte) 1;
                }
            } else if (b == 1) {
                ((vb3) t84Var).m((int) (this.h - this.i), false);
                this.i = 0;
                this.f = (byte) 0;
            } else {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 4) {
                            return -1;
                        }
                        rjb.h();
                        return 0;
                    }
                    if (this.d == null || t84Var != this.c) {
                        vb3 vb3Var = (vb3) t84Var;
                        this.c = vb3Var;
                        this.d = new vh2(vb3Var, this.j);
                    }
                    sh7 sh7Var = this.e;
                    sh7Var.getClass();
                    int b2 = sh7Var.b(this.d, u21Var);
                    if (b2 == 1) {
                        u21Var.a += this.j;
                    }
                    return b2;
                }
                if (this.e == null) {
                    this.e = new sh7(tcb.B, 8);
                }
                vh2 vh2Var = new vh2((vb3) t84Var, this.j);
                this.d = vh2Var;
                if (this.e.c(vh2Var)) {
                    sh7 sh7Var2 = this.e;
                    long j4 = this.j;
                    u84 u84Var3 = this.b;
                    u84Var3.getClass();
                    sh7Var2.f(new vh2(j4, u84Var3, (byte) 8));
                    this.f = (byte) 3;
                } else {
                    u84 u84Var4 = this.b;
                    u84Var4.getClass();
                    u84Var4.B();
                    this.b.f0(new od0(-9223372036854775807L));
                    this.f = (byte) 4;
                }
            }
        }
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        return ile.a((vb3) t84Var, true);
    }

    @Override // s84
    public final void d(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                sh7 sh7Var = this.e;
                sh7Var.getClass();
                sh7Var.d(j, j2);
                return;
            }
            return;
        }
        this.f = (byte) 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.b = u84Var;
    }

    @Override // s84
    public final void release() {
        sh7 sh7Var = this.e;
        if (sh7Var != null) {
            sh7Var.getClass();
            this.e = null;
        }
    }

    @Override // s84
    public final s84 a() {
        return this;
    }
}
