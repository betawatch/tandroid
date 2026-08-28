package w3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u implements e0 {
    public final h a;
    public final d5.x b = new d5.x(new byte[10], 10);
    public int c = 0;
    public int d;
    public d5.e0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public u(h hVar) {
        this.a = hVar;
    }

    @Override // w3.e0
    public final void a(int i9, d5.y yVar) {
        int i10;
        d5.a.j(this.e);
        int i11 = i9 & 1;
        h hVar = this.a;
        int i12 = 2;
        int i13 = 0;
        if (i11 != 0) {
            int i14 = this.c;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    d5.a.K("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        d5.a.K("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    hVar.i();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i15 = i9;
        while (yVar.a() > 0) {
            int i16 = this.c;
            if (i16 != 0) {
                d5.x xVar = this.b;
                if (i16 != 1) {
                    if (i16 == i12) {
                        if (b(yVar, xVar.b, Math.min(10, this.i)) && b(yVar, null, this.i)) {
                            xVar.p(i13);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                xVar.s(4);
                                xVar.s(1);
                                xVar.s(1);
                                long i17 = (xVar.i(15) << 15) | (xVar.i(3) << 30) | xVar.i(15);
                                xVar.s(1);
                                if (!this.h && this.g) {
                                    xVar.s(4);
                                    xVar.s(1);
                                    xVar.s(1);
                                    xVar.s(1);
                                    this.e.b((xVar.i(3) << 30) | (xVar.i(15) << 15) | xVar.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i17);
                            }
                            i15 |= this.k ? 4 : 0;
                            hVar.k(i15, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        int a2 = yVar.a();
                        int i18 = this.j;
                        int i19 = i18 == -1 ? 0 : a2 - i18;
                        if (i19 > 0) {
                            a2 -= i19;
                            yVar.B(yVar.b + a2);
                        }
                        hVar.g(yVar);
                        int i20 = this.j;
                        if (i20 != -1) {
                            int i21 = i20 - a2;
                            this.j = i21;
                            if (i21 == 0) {
                                hVar.i();
                                this.c = 1;
                                this.d = i13;
                            }
                        }
                    }
                } else if (b(yVar, xVar.b, 9)) {
                    xVar.p(0);
                    int i22 = xVar.i(24);
                    if (i22 != 1) {
                        e2.c.t(i22, "Unexpected start code prefix: ", "PesReader");
                        this.j = -1;
                        i10 = 0;
                    } else {
                        xVar.s(8);
                        int i23 = xVar.i(16);
                        xVar.s(5);
                        this.k = xVar.h();
                        xVar.s(2);
                        this.f = xVar.h();
                        this.g = xVar.h();
                        xVar.s(6);
                        int i24 = xVar.i(8);
                        this.i = i24;
                        if (i23 == 0) {
                            this.j = -1;
                        } else {
                            int i25 = (i23 - 3) - i24;
                            this.j = i25;
                            if (i25 < 0) {
                                d5.a.K("PesReader", "Found negative packet payload size: " + this.j);
                                this.j = -1;
                            }
                        }
                        i10 = 2;
                    }
                    this.c = i10;
                    this.d = 0;
                }
            } else {
                yVar.D(yVar.a());
            }
            i12 = 2;
            i13 = 0;
        }
    }

    public final boolean b(d5.y yVar, byte[] bArr, int i9) {
        int min = Math.min(yVar.a(), i9 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.D(min);
        } else {
            yVar.c(this.d, min, bArr);
        }
        int i10 = this.d + min;
        this.d = i10;
        return i10 == i9;
    }

    @Override // w3.e0
    public final void e(d5.e0 e0Var, m3.m mVar, d0 d0Var) {
        this.e = e0Var;
        this.a.j(mVar, d0Var);
    }

    @Override // w3.e0
    public final void h() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.h();
    }
}
