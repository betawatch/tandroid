package w3;

import h3.s0;
import h3.t0;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final d5.z a = new d5.z(new byte[18]);
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
    public final void b(d5.z zVar) {
        char c10;
        char c11;
        int i10;
        byte b10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        byte b11;
        int i14;
        byte b12;
        d5.y yVar;
        d5.a.j(this.d);
        while (zVar.a() > 0) {
            int i15 = this.e;
            int i16 = 8;
            int i17 = 2;
            d5.z zVar2 = this.a;
            if (i15 == 0) {
                while (zVar.a() > 0) {
                    int i18 = this.g << 8;
                    this.g = i18;
                    int r10 = i18 | zVar.r();
                    this.g = r10;
                    if (r10 == 2147385345 || r10 == -25230976 || r10 == 536864768 || r10 == -14745368) {
                        byte[] bArr = zVar2.a;
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
            } else if (i15 == 1) {
                byte[] bArr2 = zVar2.a;
                int min = Math.min(zVar.a(), 18 - this.f);
                zVar.c(this.f, min, bArr2);
                int i19 = this.f + min;
                this.f = i19;
                if (i19 == 18) {
                    byte[] bArr3 = zVar2.a;
                    if (this.i == null) {
                        String str = this.c;
                        c10 = 0;
                        if (bArr3[0] == Byte.MAX_VALUE) {
                            yVar = new d5.y(bArr3, bArr3.length);
                            c11 = '\b';
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b13 = copyOf[0];
                            if (b13 == -2 || b13 == -1) {
                                for (int i20 = 0; i20 < copyOf.length - 1; i20 += 2) {
                                    byte b14 = copyOf[i20];
                                    int i21 = i20 + 1;
                                    copyOf[i20] = copyOf[i21];
                                    copyOf[i21] = b14;
                                }
                            }
                            d5.y yVar2 = new d5.y(copyOf, copyOf.length);
                            if (copyOf[0] == 31) {
                                d5.y yVar3 = new d5.y(copyOf, copyOf.length);
                                while (yVar3.b() >= 16) {
                                    yVar3.s(i17);
                                    int i22 = yVar3.i(14) & 16383;
                                    int min2 = Math.min(8 - yVar2.d, 14);
                                    int i23 = yVar2.d;
                                    int i24 = (8 - i23) - min2;
                                    byte[] bArr4 = yVar2.b;
                                    int i25 = yVar2.c;
                                    byte b15 = (byte) (bArr4[i25] & ((65280 >> i23) | ((1 << i24) - 1)));
                                    bArr4[i25] = b15;
                                    int i26 = 14 - min2;
                                    bArr4[i25] = (byte) (b15 | ((i22 >>> i26) << i24));
                                    int i27 = i25 + 1;
                                    while (i26 > i16) {
                                        yVar2.b[i27] = (byte) (i22 >>> (i26 - 8));
                                        i26 -= 8;
                                        i27++;
                                        i16 = 8;
                                    }
                                    byte[] bArr5 = yVar2.b;
                                    byte b16 = (byte) (bArr5[i27] & ((1 << r4) - 1));
                                    bArr5[i27] = b16;
                                    bArr5[i27] = (byte) (((i22 & ((1 << i26) - 1)) << (8 - i26)) | b16);
                                    yVar2.s(14);
                                    yVar2.a();
                                    i16 = 8;
                                    i17 = 2;
                                }
                            }
                            c11 = '\b';
                            yVar2.n(copyOf.length, copyOf);
                            yVar = yVar2;
                        }
                        yVar.s(60);
                        int i28 = j3.b.j[yVar.i(6)];
                        int i29 = j3.b.k[yVar.i(4)];
                        int i30 = yVar.i(5);
                        int i31 = i30 >= 29 ? -1 : (j3.b.l[i30] * MediaDataController.MAX_STYLE_RUNS_COUNT) / 2;
                        yVar.s(10);
                        int i32 = i28 + (yVar.i(2) > 0 ? 1 : 0);
                        s0 s0Var = new s0();
                        s0Var.a = str;
                        s0Var.o = "audio/vnd.dts";
                        s0Var.f = i31;
                        s0Var.B = i32;
                        s0Var.C = i29;
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
                            i14 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b12 = bArr3[9];
                        } else if (b17 != 31) {
                            i10 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b10 = bArr3[7];
                        } else {
                            i14 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            b12 = bArr3[c11];
                        }
                        i11 = (i14 | ((b12 & 60) >> 2)) + 1;
                        z10 = true;
                        if (z10) {
                            i11 = (i11 * 16) / 14;
                        }
                        this.j = i11;
                        if (b17 == -2) {
                            if (b17 == -1) {
                                i12 = (bArr3[4] & 7) << 4;
                                b11 = bArr3[7];
                            } else if (b17 != 31) {
                                i12 = (bArr3[4] & 1) << 6;
                                i13 = bArr3[5] & 252;
                            } else {
                                i12 = (bArr3[5] & 7) << 4;
                                b11 = bArr3[6];
                            }
                            i13 = b11 & 60;
                        } else {
                            i12 = (bArr3[5] & 1) << 6;
                            i13 = bArr3[4] & 252;
                        }
                        this.h = (int) ((((((i13 >> 2) | i12) + 1) * 32) * 1000000) / this.i.P);
                        zVar2.C(0);
                        this.d.a(18, zVar2);
                        this.e = 2;
                    } else {
                        i10 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b10 = bArr3[6];
                    }
                    i11 = (i10 | ((b10 & 240) >> 4)) + 1;
                    z10 = false;
                    if (z10) {
                    }
                    this.j = i11;
                    if (b17 == -2) {
                    }
                    this.h = (int) ((((((i13 >> 2) | i12) + 1) * 32) * 1000000) / this.i.P);
                    zVar2.C(0);
                    this.d.a(18, zVar2);
                    this.e = 2;
                }
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException();
                }
                int min3 = Math.min(zVar.a(), this.j - this.f);
                this.d.a(min3, zVar);
                int i33 = this.f + min3;
                this.f = i33;
                int i34 = this.j;
                if (i33 == i34) {
                    long j10 = this.k;
                    if (j10 != -9223372036854775807L) {
                        this.d.e(j10, 1, i34, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
            }
        }
    }

    @Override // w3.h
    public final void c() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.c = e0Var.e;
        e0Var.b();
        this.d = mVar.C(e0Var.d, 1);
    }

    @Override // w3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.k = j10;
        }
    }

    @Override // w3.h
    public final void d() {
    }
}
