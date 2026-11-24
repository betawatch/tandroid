// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p58 implements m4c {
    public final rv3 a;
    public final ye1 b = new ye1(10, new byte[10]);
    public byte c = 0;
    public int d;
    public vqb e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public p58(rv3 rv3Var) {
        this.a = rv3Var;
    }

    @Override // m4c
    public final void a(int i, yw7 yw7Var) {
        int i2;
        byte b;
        long j;
        this.e.getClass();
        int i3 = i & 1;
        int i4 = -1;
        byte b2 = 2;
        int i5 = 0;
        byte b3 = 3;
        rv3 rv3Var = this.a;
        if (i3 != 0) {
            byte b4 = this.c;
            if (b4 != 0 && b4 != 1) {
                if (b4 == 2) {
                    ncd.f("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (b4 != 3) {
                        rjb.h();
                        return;
                    }
                    if (this.j != -1) {
                        ncd.f("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    rv3Var.e();
                }
            }
            if (yw7Var.c == 0) {
                rv3Var.f();
            }
            this.c = (byte) 1;
            this.d = 0;
        }
        int i6 = i;
        while (yw7Var.a() > 0) {
            byte b5 = this.c;
            if (b5 != 0) {
                ye1 ye1Var = this.b;
                if (b5 == 1) {
                    b = b3;
                    if (b(yw7Var, ye1Var.b, 9)) {
                        this.c = e() ? (byte) 2 : (byte) 0;
                        i2 = 0;
                        this.d = 0;
                    } else {
                        i2 = 0;
                    }
                } else if (b5 == b2) {
                    if (b(yw7Var, ye1Var.b, Math.min(10, this.i)) && b(yw7Var, null, this.i)) {
                        ye1Var.l(i5);
                        if (this.f) {
                            ye1Var.n(4);
                            ye1Var.n(1);
                            ye1Var.n(1);
                            long f = (ye1Var.f(b3) << 30) | (ye1Var.f(15) << 15) | ye1Var.f(15);
                            ye1Var.n(1);
                            if (!this.h && this.g) {
                                ye1Var.n(4);
                                ye1Var.n(1);
                                ye1Var.n(1);
                                ye1Var.n(1);
                                this.e.b((ye1Var.f(b3) << 30) | (ye1Var.f(15) << 15) | ye1Var.f(15));
                                this.h = true;
                            }
                            j = this.e.b(f);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i6 |= this.k ? 4 : 0;
                        rv3Var.g(i6, j);
                        this.c = (byte) 3;
                        this.d = 0;
                        b3 = 3;
                        i4 = -1;
                        b2 = 2;
                        i5 = 0;
                    } else {
                        b = b3;
                        i2 = i5;
                    }
                } else {
                    if (b5 != b3) {
                        rjb.h();
                        return;
                    }
                    int a = yw7Var.a();
                    int i7 = this.j;
                    int i8 = i7 == i4 ? i5 : a - i7;
                    if (i8 > 0) {
                        a -= i8;
                        yw7Var.M(yw7Var.b + a);
                    }
                    rv3Var.b(yw7Var);
                    int i9 = this.j;
                    if (i9 != i4) {
                        int i10 = i9 - a;
                        this.j = i10;
                        if (i10 == 0) {
                            rv3Var.e();
                            this.c = (byte) 1;
                            this.d = i5;
                        }
                    }
                    i2 = i5;
                    b = b3;
                }
            } else {
                i2 = i5;
                b = b3;
                yw7Var.O(yw7Var.a());
            }
            b3 = b;
            i5 = i2;
            i4 = -1;
            b2 = 2;
        }
    }

    public final boolean b(yw7 yw7Var, byte[] bArr, int i) {
        int min = Math.min(yw7Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yw7Var.O(min);
        } else {
            yw7Var.k(this.d, min, bArr);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // m4c
    public final void c(vqb vqbVar, u84 u84Var, l4c l4cVar) {
        this.e = vqbVar;
        this.a.h(u84Var, l4cVar);
    }

    @Override // m4c
    public final void d() {
        this.c = (byte) 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean e() {
        ye1 ye1Var = this.b;
        ye1Var.l(0);
        int f = ye1Var.f(24);
        if (f != 1) {
            b10.o(f, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        ye1Var.n(8);
        int f2 = ye1Var.f(16);
        ye1Var.n(5);
        this.k = ye1Var.e();
        ye1Var.n(2);
        this.f = ye1Var.e();
        this.g = ye1Var.e();
        ye1Var.n(6);
        int f3 = ye1Var.f(8);
        this.i = f3;
        if (f2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (f2 - 3) - f3;
        this.j = i;
        if (i < 0) {
            ncd.f("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
