// default package

import j$.util.Objects;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ps3 implements rv3 {
    public final yw7 a;
    public final String c;
    public final int d;
    public String e;
    public yzb f;
    public int h;
    public int i;
    public int j;
    public long k;
    public go4 l;
    public int m;
    public int n;
    public int o;
    public boolean r;
    public boolean u;
    public boolean v;
    public byte g = 0;
    public long s = -9223372036854775807L;
    public long t = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int p = -1;
    public int q = -1;

    public ps3(String str, int i, int i2) {
        this.a = new yw7(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(yw7 yw7Var, byte[] bArr, int i) {
        int min = Math.min(yw7Var.a(), i - this.h);
        yw7Var.k(this.h, min, bArr);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    @Override // rv3
    public final void b(yw7 yw7Var) {
        char c;
        char c2;
        int i;
        byte b;
        int i2;
        byte b2;
        long j;
        int i3;
        int i4;
        int i5;
        this.f.getClass();
        while (yw7Var.a() > 0) {
            byte b3 = this.g;
            long j2 = -9223372036854775807L;
            yw7 yw7Var2 = this.a;
            switch (b3) {
                case 0:
                    while (true) {
                        if (yw7Var.a() > 0) {
                            int i6 = this.j << 8;
                            this.j = i6;
                            int A = i6 | yw7Var.A();
                            this.j = A;
                            int b4 = c1d.b(A);
                            this.o = b4;
                            if (b4 != 0) {
                                c(this.j);
                                this.j = 0;
                                if (!this.v || this.o != 2) {
                                    int i7 = this.o;
                                    if (i7 == 1) {
                                        this.v = false;
                                    }
                                    if (i7 != 3 && i7 != 4) {
                                        if (i7 == 1) {
                                            this.g = (byte) 1;
                                            break;
                                        } else {
                                            this.g = (byte) 2;
                                            break;
                                        }
                                    } else {
                                        this.g = (byte) 4;
                                        break;
                                    }
                                } else {
                                    this.h = 0;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(yw7Var, yw7Var2.a, 18)) {
                        break;
                    } else {
                        this.u = true;
                        byte[] bArr = yw7Var2.a;
                        if (this.l == null) {
                            String str = this.e;
                            ye1 c3 = c1d.c(bArr);
                            c3.n(60);
                            int i8 = c1d.a[c3.f(6)];
                            int i9 = c1d.b[c3.f(4)];
                            c2 = 7;
                            int f = c3.f(5);
                            c = 5;
                            int i10 = f >= 29 ? -1 : (c1d.c[f] * 1000) / 2;
                            c3.n(10);
                            int i11 = i8 + (c3.f(2) > 0 ? 1 : 0);
                            fo4 fo4Var = new fo4();
                            fo4Var.a = str;
                            fo4Var.r = wf7.n("video/mp2t");
                            fo4Var.s = wf7.n("audio/vnd.dts");
                            fo4Var.i = i10;
                            fo4Var.M = i11;
                            fo4Var.O = i9;
                            fo4Var.w = null;
                            fo4Var.d = this.c;
                            fo4Var.f = this.d;
                            this.l = new go4(fo4Var);
                            this.r = true;
                        } else {
                            c = 5;
                            c2 = 7;
                        }
                        this.m = c1d.a(bArr);
                        byte b5 = bArr[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i = (bArr[4] & 7) << 4;
                                b2 = bArr[c2];
                            } else if (b5 != 31) {
                                i = (bArr[4] & 1) << 6;
                                b = bArr[c];
                            } else {
                                i = (bArr[c] & 7) << 4;
                                b2 = bArr[6];
                            }
                            i2 = b2 & 60;
                            this.k = ine.b(hac.Z(this.l.P, ((i | (i2 >> 2)) + 1) << 5));
                            yw7Var2.N(0);
                            this.f.e(18, yw7Var2);
                            this.g = (byte) 6;
                            break;
                        } else {
                            i = (bArr[c] & 1) << 6;
                            b = bArr[4];
                        }
                        i2 = b & 252;
                        this.k = ine.b(hac.Z(this.l.P, ((i | (i2 >> 2)) + 1) << 5));
                        yw7Var2.N(0);
                        this.f.e(18, yw7Var2);
                        this.g = (byte) 6;
                    }
                case 2:
                    if (a(yw7Var, yw7Var2.a, 7)) {
                        ye1 c4 = c1d.c(yw7Var2.a);
                        c4.n(42);
                        this.p = c4.f(c4.e() ? 12 : 8) + 1;
                        this.g = (byte) 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a(yw7Var, yw7Var2.a, this.p)) {
                        qs3 f2 = c1d.f(yw7Var2.a);
                        i(f2);
                        this.m = f2.d;
                        long j3 = f2.e;
                        if (j3 != -9223372036854775807L) {
                            this.k = j3;
                        }
                        yw7Var2.N(0);
                        this.f.e(this.p, yw7Var2);
                        this.g = (byte) 6;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a(yw7Var, yw7Var2.a, 6)) {
                        ye1 c5 = c1d.c(yw7Var2.a);
                        c5.n(32);
                        int g = c1d.g(c5, c1d.i) + 1;
                        this.q = g;
                        int i12 = this.h;
                        if (i12 > g) {
                            int i13 = i12 - g;
                            this.h = i12 - i13;
                            yw7Var.N(yw7Var.b - i13);
                        }
                        this.g = (byte) 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(yw7Var, yw7Var2.a, this.q)) {
                        byte[] bArr2 = yw7Var2.a;
                        ye1 c6 = c1d.c(bArr2);
                        int i14 = c6.f(32) == 1078008818 ? 1 : 0;
                        int g2 = c1d.g(c6, c1d.e);
                        int i15 = g2 + 1;
                        if (i14 == 0) {
                            j = -9223372036854775807L;
                            i3 = -2147483647;
                        } else {
                            if (!c6.e()) {
                                throw bx7.d("Only supports full channel mask-based audio presentation");
                            }
                            j = -9223372036854775807L;
                            int i16 = g2 - 1;
                            int i17 = ((bArr2[i16] << 8) & 65535) | (bArr2[g2] & 255);
                            String str2 = hac.a;
                            int i18 = 65535;
                            for (int i19 = 0; i19 < i16; i19++) {
                                byte b6 = bArr2[i19];
                                int i20 = (((i18 >> 12) & nm7.d4) ^ ((b6 & 255) >> 4)) & nm7.d4;
                                int[] iArr = hac.k;
                                int i21 = (((i18 << 4) & 65535) ^ iArr[i20]) & 65535;
                                i18 = (((i21 << 4) & 65535) ^ iArr[(((i21 >> 12) & nm7.d4) ^ (b6 & 15)) & nm7.d4]) & 65535;
                            }
                            if (i17 != i18) {
                                throw bx7.a("CRC check failed", null);
                            }
                            int f3 = c6.f(2);
                            if (f3 == 0) {
                                i4 = 512;
                            } else if (f3 == 1) {
                                i4 = 480;
                            } else {
                                if (f3 != 2) {
                                    throw bx7.a("Unsupported base duration index in DTS UHD header: " + f3, null);
                                }
                                i4 = 384;
                            }
                            int f4 = (c6.f(3) + 1) * i4;
                            int f5 = c6.f(2);
                            if (f5 == 0) {
                                i5 = 32000;
                            } else if (f5 == 1) {
                                i5 = 44100;
                            } else {
                                if (f5 != 2) {
                                    throw bx7.a("Unsupported clock rate index in DTS UHD header: " + f5, null);
                                }
                                i5 = 48000;
                            }
                            if (c6.e()) {
                                c6.n(36);
                            }
                            i3 = (1 << c6.f(2)) * i5;
                            j2 = hac.b0(f4, 1000000L, i5, RoundingMode.DOWN);
                        }
                        int i22 = i3;
                        int i23 = 0;
                        for (int i24 = 0; i24 < i14; i24++) {
                            i23 += c1d.g(c6, c1d.f);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i14 != 0) {
                            atomicInteger.set(c1d.g(c6, c1d.g));
                        }
                        int g3 = i23 + (atomicInteger.get() != 0 ? c1d.g(c6, c1d.h) : 0) + i15;
                        qs3 qs3Var = new qs3("audio/vnd.dts.uhd;profile=p2", 2, i22, g3, j2);
                        if (this.o == 3) {
                            i(qs3Var);
                        }
                        this.m = g3;
                        if (j2 == j) {
                            j2 = 0;
                        }
                        this.k = j2;
                        yw7Var2.N(0);
                        this.f.e(this.q, yw7Var2);
                        this.g = (byte) 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(yw7Var.a(), this.m - this.h);
                    this.f.e(min, yw7Var);
                    int i25 = this.h + min;
                    this.h = i25;
                    int i26 = this.m;
                    if (i25 != i26) {
                        break;
                    } else if (this.o == 1) {
                        this.n = i26;
                        this.h = 0;
                        this.i = 0;
                        this.g = (byte) 7;
                        break;
                    } else {
                        jte.p(this.s != -9223372036854775807L);
                        int i27 = this.m;
                        int i28 = this.o;
                        int i29 = i27 + (i28 == 2 ? this.n : 0);
                        long j4 = this.s;
                        this.f.a(j4, i28 == 4 ? 0 : 1, i29, 0, null);
                        this.s += this.k;
                        long j5 = this.t;
                        if (j5 != -9223372036854775807L) {
                            if (j5 != j4) {
                                this.s = j5;
                            }
                            this.t = -9223372036854775807L;
                        }
                        this.n = 0;
                        this.g = (byte) 0;
                        break;
                    }
                case 7:
                    while (yw7Var.a() > 0 && this.h < 4) {
                        int i30 = this.i << 8;
                        this.i = i30;
                        this.i = i30 | yw7Var.A();
                        this.h++;
                    }
                    if (this.h != 4) {
                        break;
                    } else if (c1d.b(this.i) == 2) {
                        c(this.i);
                        this.o = 2;
                        this.i = 0;
                        this.g = (byte) 2;
                        break;
                    } else {
                        if (this.r) {
                            yzb yzbVar = this.f;
                            go4 go4Var = this.l;
                            go4Var.getClass();
                            yzbVar.g(go4Var);
                            this.r = false;
                        }
                        jte.p(this.s != -9223372036854775807L);
                        long j6 = this.s;
                        this.f.a(j6, 1, this.n, 0, null);
                        this.s += this.k;
                        long j7 = this.t;
                        if (j7 != -9223372036854775807L) {
                            if (j7 != j6) {
                                this.s = j7;
                            }
                            this.t = -9223372036854775807L;
                        }
                        this.n = 0;
                        int i31 = this.i;
                        this.j = i31;
                        this.i = 0;
                        int b7 = c1d.b(i31);
                        this.o = b7;
                        if (b7 != 3 && b7 != 4) {
                            if (b7 == 1) {
                                c(this.j);
                                this.j = 0;
                                this.g = (byte) 1;
                                break;
                            } else {
                                this.h = 0;
                                this.g = (byte) 0;
                                break;
                            }
                        } else {
                            c(this.j);
                            this.j = 0;
                            this.g = (byte) 4;
                            break;
                        }
                    }
                default:
                    rjb.h();
                    return;
            }
        }
    }

    public final void c(int i) {
        byte[] bArr = this.a.a;
        bArr[0] = (byte) ((i >> 24) & nm7.d4);
        bArr[1] = (byte) ((i >> 16) & nm7.d4);
        bArr[2] = (byte) ((i >> 8) & nm7.d4);
        bArr[3] = (byte) (i & nm7.d4);
        this.h = 4;
    }

    @Override // rv3
    public final void d() {
        this.g = (byte) 0;
        this.h = 0;
        this.j = 0;
        this.i = 0;
        this.n = 0;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.b.set(0);
        this.r = false;
        this.v = this.u;
    }

    @Override // rv3
    public final void f() {
        if (this.g == 7) {
            this.f.getClass();
            if (this.r) {
                yzb yzbVar = this.f;
                go4 go4Var = this.l;
                go4Var.getClass();
                yzbVar.g(go4Var);
                this.r = false;
            }
            long j = this.s;
            if (j != -9223372036854775807L) {
                this.f.a(j, 1, this.n, 0, null);
                this.s += this.k;
            }
            this.n = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            this.g = (byte) 0;
        }
    }

    @Override // rv3
    public final void g(int i, long j) {
        if (j != -9223372036854775807L) {
            if (this.g != 0) {
                this.t = j;
            } else {
                this.s = j;
                this.t = -9223372036854775807L;
            }
        }
    }

    @Override // rv3
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.e = l4cVar.e;
        l4cVar.b();
        this.f = u84Var.c0(l4cVar.d, 1);
    }

    public final void i(qs3 qs3Var) {
        int i = qs3Var.b;
        int i2 = qs3Var.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        String str = qs3Var.a;
        if (str == null) {
            go4 go4Var = this.l;
            str = go4Var != null ? go4Var.t : null;
        }
        go4 go4Var2 = this.l;
        if (go4Var2 != null && !this.r && i2 == go4Var2.N && i == go4Var2.P && Objects.equals(str, go4Var2.t)) {
            return;
        }
        go4 go4Var3 = this.l;
        fo4 fo4Var = go4Var3 == null ? new fo4() : go4Var3.a();
        fo4Var.a = this.e;
        fo4Var.r = wf7.n("video/mp2t");
        fo4Var.s = wf7.n(str);
        fo4Var.M = i2;
        fo4Var.O = i;
        fo4Var.d = this.c;
        fo4Var.f = this.d;
        go4 go4Var4 = new go4(fo4Var);
        this.l = go4Var4;
        this.f.g(go4Var4);
        this.r = false;
    }

    @Override // rv3
    public final void e() {
    }
}
