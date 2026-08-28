package w3;

import d5.f0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements h {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public m3.w f;
    public m3.w g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public m3.w t;
    public long u;
    public final d5.x b = new d5.x(new byte[7], 7);
    public final d5.y c = new d5.y(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public e(String str, boolean z10) {
        this.a = z10;
        this.d = str;
    }

    @Override // w3.h
    public final void g(d5.y yVar) {
        int i9;
        byte b10;
        int i10;
        this.f.getClass();
        int i11 = f0.a;
        while (yVar.a() > 0) {
            int i12 = this.h;
            d5.y yVar2 = this.c;
            int i13 = 0;
            d5.x xVar = this.b;
            int i14 = 4;
            int i15 = 1;
            if (i12 == 0) {
                byte[] bArr = yVar.a;
                int i16 = yVar.b;
                int i17 = yVar.c;
                while (true) {
                    if (i16 >= i17) {
                        yVar.C(i16);
                        break;
                    }
                    i9 = i16 + 1;
                    b10 = bArr[i16];
                    int i18 = b10 & 255;
                    if (this.j == 512 && ((65280 | (((byte) i18) & 255)) & 65526) == 65520) {
                        if (!this.l) {
                            int i19 = i16 - 1;
                            yVar.C(i16);
                            byte[] bArr2 = xVar.b;
                            if (yVar.a() >= i15) {
                                yVar.c(i13, i15, bArr2);
                                xVar.p(i14);
                                int i20 = xVar.i(i15);
                                int i21 = this.m;
                                if (i21 == -1 || i20 == i21) {
                                    if (this.n != -1) {
                                        byte[] bArr3 = xVar.b;
                                        if (yVar.a() < i15) {
                                            break;
                                        }
                                        yVar.c(i13, i15, bArr3);
                                        xVar.p(2);
                                        i10 = 4;
                                        if (xVar.i(4) == this.n) {
                                            yVar.C(i9);
                                        }
                                    } else {
                                        i10 = 4;
                                    }
                                    byte[] bArr4 = xVar.b;
                                    if (yVar.a() >= i10) {
                                        yVar.c(i13, i10, bArr4);
                                        xVar.p(14);
                                        int i22 = xVar.i(13);
                                        if (i22 >= 7) {
                                            byte[] bArr5 = yVar.a;
                                            int i23 = yVar.c;
                                            int i24 = i19 + i22;
                                            if (i24 >= i23) {
                                                break;
                                            }
                                            byte b11 = bArr5[i24];
                                            if (b11 != -1) {
                                                if (b11 == 73) {
                                                    int i25 = i24 + 1;
                                                    if (i25 != i23) {
                                                        if (bArr5[i25] == 68) {
                                                            int i26 = i24 + 2;
                                                            if (i26 != i23) {
                                                                if (bArr5[i26] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i27 = i24 + 1;
                                                if (i27 != i23) {
                                                    byte b12 = bArr5[i27];
                                                    if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i20) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    int i28 = this.j;
                    int i29 = i18 | i28;
                    if (i29 == 329) {
                        this.j = 768;
                    } else if (i29 == 511) {
                        this.j = 512;
                    } else if (i29 == 836) {
                        this.j = 1024;
                    } else {
                        if (i29 == 1075) {
                            this.h = 2;
                            this.i = 3;
                            this.r = 0;
                            yVar2.C(0);
                            yVar.C(i9);
                            break;
                        }
                        if (i28 != 256) {
                            this.j = 256;
                            i13 = 0;
                            i14 = 4;
                            i15 = 1;
                        }
                    }
                    i16 = i9;
                    i13 = 0;
                    i14 = 4;
                    i15 = 1;
                }
                this.o = (b10 & 8) >> 3;
                this.k = (b10 & 1) == 0;
                if (this.l) {
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.h = 1;
                    this.i = 0;
                }
                yVar.C(i9);
            } else if (i12 != 1) {
                if (i12 == 2) {
                    byte[] bArr6 = yVar2.a;
                    int min = Math.min(yVar.a(), 10 - this.i);
                    yVar.c(this.i, min, bArr6);
                    int i30 = this.i + min;
                    this.i = i30;
                    if (i30 == 10) {
                        this.g.a(10, yVar2);
                        yVar2.C(6);
                        m3.w wVar = this.g;
                        int q10 = yVar2.q() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = wVar;
                        this.u = 0L;
                        this.r = q10;
                    }
                } else if (i12 == 3) {
                    int i31 = this.k ? 7 : 5;
                    byte[] bArr7 = xVar.b;
                    int min2 = Math.min(yVar.a(), i31 - this.i);
                    yVar.c(this.i, min2, bArr7);
                    int i32 = this.i + min2;
                    this.i = i32;
                    if (i32 == i31) {
                        xVar.p(0);
                        if (this.p) {
                            xVar.s(10);
                        } else {
                            int i33 = xVar.i(2) + 1;
                            if (i33 != 2) {
                                d5.a.K("AdtsReader", "Detected audio object type: " + i33 + ", but assuming AAC LC.");
                                i33 = 2;
                            }
                            xVar.s(5);
                            int i34 = xVar.i(3);
                            int i35 = this.n;
                            byte[] bArr8 = {(byte) (((i33 << 3) & 248) | ((i35 >> 1) & 7)), (byte) (((i34 << 3) & 120) | ((i35 << 7) & 128))};
                            j3.a h = j3.b.h(new d5.x(bArr8, 2), false);
                            s0 s0Var = new s0();
                            s0Var.a = this.e;
                            s0Var.o = MediaController.AUDIO_MIME_TYPE;
                            s0Var.h = h.c;
                            s0Var.B = h.b;
                            s0Var.C = h.a;
                            s0Var.q = Collections.singletonList(bArr8);
                            s0Var.c = this.d;
                            t0 t0Var = new t0(s0Var);
                            this.q = 1024000000 / t0Var.P;
                            this.f.c(t0Var);
                            this.p = true;
                        }
                        xVar.s(4);
                        int i36 = xVar.i(13);
                        int i37 = i36 - 7;
                        if (this.k) {
                            i37 = i36 - 9;
                        }
                        m3.w wVar2 = this.f;
                        long j10 = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = wVar2;
                        this.u = j10;
                        this.r = i37;
                    }
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(yVar.a(), this.r - this.i);
                    this.t.a(min3, yVar);
                    int i38 = this.i + min3;
                    this.i = i38;
                    int i39 = this.r;
                    if (i38 == i39) {
                        long j11 = this.s;
                        if (j11 != -9223372036854775807L) {
                            this.t.e(j11, 1, i39, 0, null);
                            this.s += this.u;
                        }
                        this.h = 0;
                        this.i = 0;
                        this.j = 256;
                    }
                }
            } else if (yVar.a() != 0) {
                xVar.b[0] = yVar.a[yVar.b];
                xVar.p(2);
                int i40 = xVar.i(4);
                int i41 = this.n;
                if (i41 == -1 || i40 == i41) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = i40;
                    }
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.l = false;
                    this.h = 0;
                    this.i = 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // w3.h
    public final void h() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    @Override // w3.h
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.e = d0Var.e;
        d0Var.b();
        m3.w I = mVar.I(d0Var.d, 1);
        this.f = I;
        this.t = I;
        if (!this.a) {
            this.g = new m3.j();
            return;
        }
        d0Var.a();
        d0Var.b();
        m3.w I2 = mVar.I(d0Var.d, 5);
        this.g = I2;
        s0 s0Var = new s0();
        d0Var.b();
        s0Var.a = d0Var.e;
        s0Var.o = "application/id3";
        I2.c(new t0(s0Var));
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.s = j10;
        }
    }

    @Override // w3.h
    public final void i() {
    }
}
