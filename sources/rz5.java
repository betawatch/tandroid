// default package

import java.util.Collections;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rz5 implements av3 {
    public final String a;
    public final int b;
    public final ey7 c;
    public final zd1 d;
    public x1c e;
    public String f;
    public ko4 g;
    public byte h;
    public int i;
    public int j;
    public short k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public rz5(String str, int i) {
        this.a = str;
        this.b = i;
        ey7 ey7Var = new ey7(1024);
        this.c = ey7Var;
        byte[] bArr = ey7Var.a;
        this.d = new zd1(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019d, code lost:
    
        if (r23.m != false) goto L67;
     */
    /* JADX WARN: Type inference failed for: r1v31, types: [int, short] */
    @Override // av3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ey7 ey7Var) {
        int f;
        boolean e;
        this.e.getClass();
        while (ey7Var.a() > 0) {
            byte b = this.h;
            if (b != 0) {
                if (b != 1) {
                    ey7 ey7Var2 = this.c;
                    zd1 zd1Var = this.d;
                    if (b == 2) {
                        int A = ((this.k & (-225)) << 8) | ey7Var.A();
                        this.j = A;
                        if (A > ey7Var2.a.length) {
                            ey7Var2.K(A);
                            byte[] bArr = ey7Var2.a;
                            zd1Var.j(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = (byte) 3;
                    } else {
                        if (b != 3) {
                            grb.g();
                            return;
                        }
                        int min = Math.min(ey7Var.a(), this.j - this.i);
                        ey7Var.k(this.i, min, zd1Var.b);
                        int i = this.i + min;
                        this.i = i;
                        if (i == this.j) {
                            zd1Var.l(0);
                            if (!zd1Var.e()) {
                                this.m = true;
                                int f2 = zd1Var.f(1);
                                int f3 = f2 == 1 ? zd1Var.f(1) : 0;
                                this.n = f3;
                                if (f3 != 0) {
                                    throw hy7.a(null, null);
                                }
                                if (f2 == 1) {
                                    zd1Var.f((zd1Var.f(2) + 1) << 3);
                                }
                                if (!zd1Var.e()) {
                                    throw hy7.a(null, null);
                                }
                                this.o = zd1Var.f(6);
                                int f4 = zd1Var.f(4);
                                int f5 = zd1Var.f(3);
                                if (f4 != 0 || f5 != 0) {
                                    throw hy7.a(null, null);
                                }
                                if (f2 == 0) {
                                    int i2 = (zd1Var.c << 3) + zd1Var.d;
                                    int b2 = zd1Var.b();
                                    h1 j = jn2.j(zd1Var, true);
                                    this.v = j.c;
                                    this.s = j.a;
                                    this.u = j.b;
                                    int b3 = b2 - zd1Var.b();
                                    zd1Var.l(i2);
                                    byte[] bArr2 = new byte[(b3 + 7) / 8];
                                    zd1Var.g(b3, bArr2);
                                    jo4 jo4Var = new jo4();
                                    jo4Var.a = this.f;
                                    jo4Var.r = eg7.n("video/mp2t");
                                    jo4Var.s = eg7.n("audio/mp4a-latm");
                                    jo4Var.k = this.v;
                                    jo4Var.M = this.u;
                                    jo4Var.O = this.s;
                                    jo4Var.v = Collections.singletonList(bArr2);
                                    jo4Var.d = this.a;
                                    jo4Var.f = this.b;
                                    ko4 ko4Var = new ko4(jo4Var);
                                    if (!ko4Var.equals(this.g)) {
                                        this.g = ko4Var;
                                        this.t = 1024000000 / ko4Var.P;
                                        this.e.g(ko4Var);
                                    }
                                } else {
                                    int b4 = zd1Var.b();
                                    h1 j2 = jn2.j(zd1Var, true);
                                    this.v = j2.c;
                                    this.s = j2.a;
                                    this.u = j2.b;
                                    zd1Var.n(zd1Var.f((zd1Var.f(2) + 1) << 3) - (b4 - zd1Var.b()));
                                }
                                int f6 = zd1Var.f(3);
                                this.p = f6;
                                if (f6 == 0) {
                                    zd1Var.n(8);
                                } else if (f6 == 1) {
                                    zd1Var.n(9);
                                } else if (f6 == 3 || f6 == 4 || f6 == 5) {
                                    zd1Var.n(6);
                                } else {
                                    if (f6 != 6 && f6 != 7) {
                                        grb.g();
                                        return;
                                    }
                                    zd1Var.n(1);
                                }
                                boolean e2 = zd1Var.e();
                                this.q = e2;
                                this.r = 0L;
                                if (e2) {
                                    if (f2 == 1) {
                                        this.r = zd1Var.f((zd1Var.f(2) + 1) << 3);
                                    } else {
                                        do {
                                            e = zd1Var.e();
                                            this.r = (this.r << 8) + zd1Var.f(8);
                                        } while (e);
                                    }
                                }
                                if (zd1Var.e()) {
                                    zd1Var.n(8);
                                }
                            }
                            if (this.n != 0) {
                                throw hy7.a(null, null);
                            }
                            if (this.o != 0) {
                                throw hy7.a(null, null);
                            }
                            if (this.p != 0) {
                                throw hy7.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                f = zd1Var.f(8);
                                i3 += f;
                            } while (f == 255);
                            int i4 = (zd1Var.c << 3) + zd1Var.d;
                            if ((i4 & 7) == 0) {
                                ey7Var2.N(i4 >> 3);
                            } else {
                                zd1Var.g(i3 << 3, ey7Var2.a);
                                ey7Var2.N(0);
                            }
                            this.e.e(i3, ey7Var2);
                            yve.p(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                zd1Var.n((int) this.r);
                            }
                            this.h = (byte) 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    ?? A2 = ey7Var.A();
                    if ((A2 & jn7.A3) == 224) {
                        this.k = A2;
                        this.h = (byte) 2;
                    } else if (A2 != 86) {
                        this.h = (byte) 0;
                    }
                }
            } else if (ey7Var.A() == 86) {
                this.h = (byte) 1;
            }
        }
    }

    @Override // av3
    public final void d() {
        this.h = (byte) 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // av3
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.e = g84Var.e0(l6cVar.d, 1);
        l6cVar.b();
        this.f = l6cVar.e;
    }

    @Override // av3
    public final void e() {
    }

    @Override // av3
    public final void f() {
    }
}
