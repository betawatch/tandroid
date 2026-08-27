package w3;

import d5.g0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final d5.y b = new d5.y(new byte[7], 7);
    public final d5.z c = new d5.z(Arrays.copyOf(v, 10));
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
    public final void b(d5.z zVar) {
        int i10;
        byte b10;
        int i11;
        this.f.getClass();
        int i12 = g0.a;
        while (zVar.a() > 0) {
            int i13 = this.h;
            d5.z zVar2 = this.c;
            int i14 = 0;
            d5.y yVar = this.b;
            int i15 = 4;
            int i16 = 1;
            if (i13 == 0) {
                byte[] bArr = zVar.a;
                int i17 = zVar.b;
                int i18 = zVar.c;
                while (true) {
                    if (i17 >= i18) {
                        zVar.C(i17);
                        break;
                    }
                    i10 = i17 + 1;
                    b10 = bArr[i17];
                    int i19 = b10 & 255;
                    if (this.j == 512 && ((65280 | (((byte) i19) & 255)) & 65526) == 65520) {
                        if (!this.l) {
                            int i20 = i17 - 1;
                            zVar.C(i17);
                            byte[] bArr2 = yVar.b;
                            if (zVar.a() >= i16) {
                                zVar.c(i14, i16, bArr2);
                                yVar.p(i15);
                                int i21 = yVar.i(i16);
                                int i22 = this.m;
                                if (i22 == -1 || i21 == i22) {
                                    if (this.n != -1) {
                                        byte[] bArr3 = yVar.b;
                                        if (zVar.a() < i16) {
                                            break;
                                        }
                                        zVar.c(i14, i16, bArr3);
                                        yVar.p(2);
                                        i11 = 4;
                                        if (yVar.i(4) == this.n) {
                                            zVar.C(i10);
                                        }
                                    } else {
                                        i11 = 4;
                                    }
                                    byte[] bArr4 = yVar.b;
                                    if (zVar.a() >= i11) {
                                        zVar.c(i14, i11, bArr4);
                                        yVar.p(14);
                                        int i23 = yVar.i(13);
                                        if (i23 >= 7) {
                                            byte[] bArr5 = zVar.a;
                                            int i24 = zVar.c;
                                            int i25 = i20 + i23;
                                            if (i25 >= i24) {
                                                break;
                                            }
                                            byte b11 = bArr5[i25];
                                            if (b11 != -1) {
                                                if (b11 == 73) {
                                                    int i26 = i25 + 1;
                                                    if (i26 != i24) {
                                                        if (bArr5[i26] == 68) {
                                                            int i27 = i25 + 2;
                                                            if (i27 != i24) {
                                                                if (bArr5[i27] == 51) {
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
                                                int i28 = i25 + 1;
                                                if (i28 != i24) {
                                                    byte b12 = bArr5[i28];
                                                    if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i21) {
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
                    int i29 = this.j;
                    int i30 = i19 | i29;
                    if (i30 == 329) {
                        this.j = 768;
                    } else if (i30 == 511) {
                        this.j = 512;
                    } else if (i30 == 836) {
                        this.j = 1024;
                    } else {
                        if (i30 == 1075) {
                            this.h = 2;
                            this.i = 3;
                            this.r = 0;
                            zVar2.C(0);
                            zVar.C(i10);
                            break;
                        }
                        if (i29 != 256) {
                            this.j = 256;
                            i14 = 0;
                            i15 = 4;
                            i16 = 1;
                        }
                    }
                    i17 = i10;
                    i14 = 0;
                    i15 = 4;
                    i16 = 1;
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
                zVar.C(i10);
            } else if (i13 != 1) {
                if (i13 == 2) {
                    byte[] bArr6 = zVar2.a;
                    int min = Math.min(zVar.a(), 10 - this.i);
                    zVar.c(this.i, min, bArr6);
                    int i31 = this.i + min;
                    this.i = i31;
                    if (i31 == 10) {
                        this.g.a(10, zVar2);
                        zVar2.C(6);
                        m3.w wVar = this.g;
                        int q6 = zVar2.q() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = wVar;
                        this.u = 0L;
                        this.r = q6;
                    }
                } else if (i13 == 3) {
                    int i32 = this.k ? 7 : 5;
                    byte[] bArr7 = yVar.b;
                    int min2 = Math.min(zVar.a(), i32 - this.i);
                    zVar.c(this.i, min2, bArr7);
                    int i33 = this.i + min2;
                    this.i = i33;
                    if (i33 == i32) {
                        yVar.p(0);
                        if (this.p) {
                            yVar.s(10);
                        } else {
                            int i34 = yVar.i(2) + 1;
                            if (i34 != 2) {
                                d5.a.K("AdtsReader", "Detected audio object type: " + i34 + ", but assuming AAC LC.");
                                i34 = 2;
                            }
                            yVar.s(5);
                            int i35 = yVar.i(3);
                            int i36 = this.n;
                            byte[] bArr8 = {(byte) (((i34 << 3) & 248) | ((i36 >> 1) & 7)), (byte) (((i35 << 3) & 120) | ((i36 << 7) & 128))};
                            j3.a h = j3.b.h(new d5.y(bArr8, 2), false);
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
                        yVar.s(4);
                        int i37 = yVar.i(13);
                        int i38 = i37 - 7;
                        if (this.k) {
                            i38 = i37 - 9;
                        }
                        m3.w wVar2 = this.f;
                        long j10 = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = wVar2;
                        this.u = j10;
                        this.r = i38;
                    }
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(zVar.a(), this.r - this.i);
                    this.t.a(min3, zVar);
                    int i39 = this.i + min3;
                    this.i = i39;
                    int i40 = this.r;
                    if (i39 == i40) {
                        long j11 = this.s;
                        if (j11 != -9223372036854775807L) {
                            this.t.e(j11, 1, i40, 0, null);
                            this.s += this.u;
                        }
                        this.h = 0;
                        this.i = 0;
                        this.j = 256;
                    }
                }
            } else if (zVar.a() != 0) {
                yVar.b[0] = zVar.a[zVar.b];
                yVar.p(2);
                int i41 = yVar.i(4);
                int i42 = this.n;
                if (i42 == -1 || i41 == i42) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = i41;
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
    public final void c() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.e = e0Var.e;
        e0Var.b();
        m3.w C = mVar.C(e0Var.d, 1);
        this.f = C;
        this.t = C;
        if (!this.a) {
            this.g = new m3.j();
            return;
        }
        e0Var.a();
        e0Var.b();
        m3.w C2 = mVar.C(e0Var.d, 5);
        this.g = C2;
        s0 s0Var = new s0();
        e0Var.b();
        s0Var.a = e0Var.e;
        s0Var.o = "application/id3";
        C2.c(new t0(s0Var));
    }

    @Override // w3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.s = j10;
        }
    }

    @Override // w3.h
    public final void d() {
    }
}
