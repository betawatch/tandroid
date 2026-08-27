package w3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u implements f0 {
    public final h a;
    public final d5.y b = new d5.y(new byte[10], 10);
    public int c = 0;
    public int d;
    public d5.f0 e;
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

    @Override // w3.f0
    public final void a(d5.f0 f0Var, m3.m mVar, e0 e0Var) {
        this.e = f0Var;
        this.a.e(mVar, e0Var);
    }

    @Override // w3.f0
    public final void b(int i10, d5.z zVar) {
        int i11;
        d5.a.j(this.e);
        int i12 = i10 & 1;
        h hVar = this.a;
        int i13 = 2;
        int i14 = 0;
        if (i12 != 0) {
            int i15 = this.c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    d5.a.K("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        d5.a.K("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    hVar.d();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i16 = i10;
        while (zVar.a() > 0) {
            int i17 = this.c;
            if (i17 != 0) {
                d5.y yVar = this.b;
                if (i17 != 1) {
                    if (i17 == i13) {
                        if (d(zVar, yVar.b, Math.min(10, this.i)) && d(zVar, null, this.i)) {
                            yVar.p(i14);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                yVar.s(4);
                                yVar.s(1);
                                yVar.s(1);
                                long i18 = (yVar.i(15) << 15) | (yVar.i(3) << 30) | yVar.i(15);
                                yVar.s(1);
                                if (!this.h && this.g) {
                                    yVar.s(4);
                                    yVar.s(1);
                                    yVar.s(1);
                                    yVar.s(1);
                                    this.e.b((yVar.i(3) << 30) | (yVar.i(15) << 15) | yVar.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i18);
                            }
                            i16 |= this.k ? 4 : 0;
                            hVar.f(i16, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i17 != 3) {
                            throw new IllegalStateException();
                        }
                        int a2 = zVar.a();
                        int i19 = this.j;
                        int i20 = i19 == -1 ? 0 : a2 - i19;
                        if (i20 > 0) {
                            a2 -= i20;
                            zVar.B(zVar.b + a2);
                        }
                        hVar.b(zVar);
                        int i21 = this.j;
                        if (i21 != -1) {
                            int i22 = i21 - a2;
                            this.j = i22;
                            if (i22 == 0) {
                                hVar.d();
                                this.c = 1;
                                this.d = i14;
                            }
                        }
                    }
                } else if (d(zVar, yVar.b, 9)) {
                    yVar.p(0);
                    int i23 = yVar.i(24);
                    if (i23 != 1) {
                        com.google.android.recaptcha.internal.a.s(i23, "Unexpected start code prefix: ", "PesReader");
                        this.j = -1;
                        i11 = 0;
                    } else {
                        yVar.s(8);
                        int i24 = yVar.i(16);
                        yVar.s(5);
                        this.k = yVar.h();
                        yVar.s(2);
                        this.f = yVar.h();
                        this.g = yVar.h();
                        yVar.s(6);
                        int i25 = yVar.i(8);
                        this.i = i25;
                        if (i24 == 0) {
                            this.j = -1;
                        } else {
                            int i26 = (i24 - 3) - i25;
                            this.j = i26;
                            if (i26 < 0) {
                                d5.a.K("PesReader", "Found negative packet payload size: " + this.j);
                                this.j = -1;
                            }
                        }
                        i11 = 2;
                    }
                    this.c = i11;
                    this.d = 0;
                }
            } else {
                zVar.D(zVar.a());
            }
            i13 = 2;
            i14 = 0;
        }
    }

    @Override // w3.f0
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(d5.z zVar, byte[] bArr, int i10) {
        int min = Math.min(zVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zVar.D(min);
        } else {
            zVar.c(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        return i11 == i10;
    }
}
