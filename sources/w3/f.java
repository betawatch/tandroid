package w3;

import h3.s0;
import h3.t0;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements h {
    public final String b;
    public String c;
    public m3.w d;
    public int f;
    public int g;
    public long h;
    public t0 i;
    public int j;
    public final d5.y a = new d5.y(new byte[18]);
    public int e = 0;
    public long k = -9223372036854775807L;

    public f(String str) {
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026d  */
    @Override // w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(d5.y yVar) {
        char c10;
        char c11;
        int i9;
        byte b10;
        boolean z10;
        int i10;
        int i11;
        int i12;
        byte b11;
        int i13;
        byte b12;
        d5.x xVar;
        d5.a.j(this.d);
        while (yVar.a() > 0) {
            int i14 = this.e;
            int i15 = 8;
            int i16 = 2;
            d5.y yVar2 = this.a;
            if (i14 == 0) {
                while (yVar.a() > 0) {
                    int i17 = this.g << 8;
                    this.g = i17;
                    int r10 = i17 | yVar.r();
                    this.g = r10;
                    if (r10 == 2147385345 || r10 == -25230976 || r10 == 536864768 || r10 == -14745368) {
                        byte[] bArr = yVar2.a;
                        bArr[0] = (byte) ((r10 >> 24) & 255);
                        bArr[1] = (byte) ((r10 >> 16) & 255);
                        bArr[2] = (byte) ((r10 >> 8) & 255);
                        bArr[3] = (byte) (r10 & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i14 == 1) {
                byte[] bArr2 = yVar2.a;
                int min = Math.min(yVar.a(), 18 - this.f);
                yVar.c(this.f, min, bArr2);
                int i18 = this.f + min;
                this.f = i18;
                if (i18 == 18) {
                    byte[] bArr3 = yVar2.a;
                    if (this.i == null) {
                        String str = this.c;
                        c10 = 0;
                        if (bArr3[0] == Byte.MAX_VALUE) {
                            xVar = new d5.x(bArr3, bArr3.length);
                            c11 = '\b';
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b13 = copyOf[0];
                            if (b13 == -2 || b13 == -1) {
                                for (int i19 = 0; i19 < copyOf.length - 1; i19 += 2) {
                                    byte b14 = copyOf[i19];
                                    int i20 = i19 + 1;
                                    copyOf[i19] = copyOf[i20];
                                    copyOf[i20] = b14;
                                }
                            }
                            d5.x xVar2 = new d5.x(copyOf, copyOf.length);
                            if (copyOf[0] == 31) {
                                d5.x xVar3 = new d5.x(copyOf, copyOf.length);
                                while (xVar3.b() >= 16) {
                                    xVar3.s(i16);
                                    int i21 = xVar3.i(14) & 16383;
                                    int min2 = Math.min(8 - xVar2.d, 14);
                                    int i22 = xVar2.d;
                                    int i23 = (8 - i22) - min2;
                                    byte[] bArr4 = xVar2.b;
                                    int i24 = xVar2.c;
                                    byte b15 = (byte) (bArr4[i24] & ((65280 >> i22) | ((1 << i23) - 1)));
                                    bArr4[i24] = b15;
                                    int i25 = 14 - min2;
                                    bArr4[i24] = (byte) (b15 | ((i21 >>> i25) << i23));
                                    int i26 = i24 + 1;
                                    while (i25 > i15) {
                                        xVar2.b[i26] = (byte) (i21 >>> (i25 - 8));
                                        i25 -= 8;
                                        i26++;
                                        i15 = 8;
                                    }
                                    byte[] bArr5 = xVar2.b;
                                    byte b16 = (byte) (bArr5[i26] & ((1 << r4) - 1));
                                    bArr5[i26] = b16;
                                    bArr5[i26] = (byte) (((i21 & ((1 << i25) - 1)) << (8 - i25)) | b16);
                                    xVar2.s(14);
                                    xVar2.a();
                                    i15 = 8;
                                    i16 = 2;
                                }
                            }
                            c11 = '\b';
                            xVar2.n(copyOf.length, copyOf);
                            xVar = xVar2;
                        }
                        xVar.s(60);
                        int i27 = j3.b.j[xVar.i(6)];
                        int i28 = j3.b.k[xVar.i(4)];
                        int i29 = xVar.i(5);
                        int i30 = i29 >= 29 ? -1 : (j3.b.l[i29] * MediaDataController.MAX_STYLE_RUNS_COUNT) / 2;
                        xVar.s(10);
                        int i31 = i27 + (xVar.i(2) > 0 ? 1 : 0);
                        s0 s0Var = new s0();
                        s0Var.a = str;
                        s0Var.o = "audio/vnd.dts";
                        s0Var.f = i30;
                        s0Var.B = i31;
                        s0Var.C = i28;
                        s0Var.r = null;
                        s0Var.c = this.b;
                        t0 t0Var = new t0(s0Var);
                        this.i = t0Var;
                        this.d.c(t0Var);
                    } else {
                        c10 = 0;
                        c11 = '\b';
                    }
                    byte b17 = bArr3[c10];
                    if (b17 != -2) {
                        if (b17 == -1) {
                            i13 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b12 = bArr3[9];
                        } else if (b17 != 31) {
                            i9 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b10 = bArr3[7];
                        } else {
                            i13 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            b12 = bArr3[c11];
                        }
                        i10 = (i13 | ((b12 & 60) >> 2)) + 1;
                        z10 = true;
                        if (z10) {
                            i10 = (i10 * 16) / 14;
                        }
                        this.j = i10;
                        if (b17 == -2) {
                            if (b17 == -1) {
                                i11 = (bArr3[4] & 7) << 4;
                                b11 = bArr3[7];
                            } else if (b17 != 31) {
                                i11 = (bArr3[4] & 1) << 6;
                                i12 = bArr3[5] & 252;
                            } else {
                                i11 = (bArr3[5] & 7) << 4;
                                b11 = bArr3[6];
                            }
                            i12 = b11 & 60;
                        } else {
                            i11 = (bArr3[5] & 1) << 6;
                            i12 = bArr3[4] & 252;
                        }
                        this.h = (int) ((((((i12 >> 2) | i11) + 1) * 32) * 1000000) / this.i.P);
                        yVar2.C(0);
                        this.d.a(18, yVar2);
                        this.e = 2;
                    } else {
                        i9 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b10 = bArr3[6];
                    }
                    i10 = (i9 | ((b10 & 240) >> 4)) + 1;
                    z10 = false;
                    if (z10) {
                    }
                    this.j = i10;
                    if (b17 == -2) {
                    }
                    this.h = (int) ((((((i12 >> 2) | i11) + 1) * 32) * 1000000) / this.i.P);
                    yVar2.C(0);
                    this.d.a(18, yVar2);
                    this.e = 2;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException();
                }
                int min3 = Math.min(yVar.a(), this.j - this.f);
                this.d.a(min3, yVar);
                int i32 = this.f + min3;
                this.f = i32;
                int i33 = this.j;
                if (i32 == i33) {
                    long j10 = this.k;
                    if (j10 != -9223372036854775807L) {
                        this.d.e(j10, 1, i33, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
            }
        }
    }

    @Override // w3.h
    public final void h() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    @Override // w3.h
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.c = d0Var.e;
        d0Var.b();
        this.d = mVar.I(d0Var.d, 1);
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.k = j10;
        }
    }

    @Override // w3.h
    public final void i() {
    }
}
