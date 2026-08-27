package v3;

import d5.z;
import e0.i0;
import h3.s0;
import h3.t0;
import h3.t1;
import h7.t;
import j3.o0;
import java.util.ArrayList;
import java.util.Arrays;
import m3.y;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends i {
    public i0 n;
    public int o;
    public boolean p;
    public o0 q;
    public y r;

    @Override // v3.i
    public final void a(long j10) {
        this.g = j10;
        this.p = j10 != 0;
        o0 o0Var = this.q;
        this.o = o0Var != null ? o0Var.e : 0;
    }

    @Override // v3.i
    public final long b(z zVar) {
        byte b10 = zVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        i0 i0Var = this.n;
        d5.a.j(i0Var);
        int i10 = i0Var.a;
        o0 o0Var = (o0) i0Var.b;
        int i11 = !((d5.c[]) i0Var.e)[(b10 >> 1) & (255 >>> (8 - i10))].a ? o0Var.e : o0Var.f;
        long j10 = this.p ? (this.o + i11) / 4 : 0;
        byte[] bArr = zVar.a;
        int length = bArr.length;
        int i12 = zVar.c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            zVar.A(copyOf.length, copyOf);
        } else {
            zVar.B(i12);
        }
        byte[] bArr2 = zVar.a;
        int i13 = zVar.c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.p = true;
        this.o = i11;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v51, types: [byte[], java.io.Serializable] */
    @Override // v3.i
    public final boolean c(z zVar, long j10, i6 i6Var) {
        i0 i0Var;
        int i10;
        int i11;
        if (this.n != null) {
            ((t0) i6Var.b).getClass();
            return false;
        }
        o0 o0Var = this.q;
        if (o0Var == null) {
            t.c(1, zVar, false);
            zVar.j();
            int r10 = zVar.r();
            int j11 = zVar.j();
            int g10 = zVar.g();
            if (g10 <= 0) {
                g10 = -1;
            }
            int g11 = zVar.g();
            int i12 = g11 > 0 ? g11 : -1;
            zVar.g();
            int r11 = zVar.r();
            int pow = (int) Math.pow(2.0d, r11 & 15);
            int pow2 = (int) Math.pow(2.0d, (r11 & 240) >> 4);
            zVar.r();
            ?? copyOf = Arrays.copyOf(zVar.a, zVar.c);
            o0 o0Var2 = new o0();
            o0Var2.a = r10;
            o0Var2.b = j11;
            o0Var2.c = g10;
            o0Var2.d = i12;
            o0Var2.e = pow;
            o0Var2.f = pow2;
            o0Var2.g = copyOf;
            this.q = o0Var2;
        } else {
            y yVar = this.r;
            if (yVar == null) {
                this.r = t.b(zVar, true, true);
            } else {
                int i13 = zVar.c;
                byte[] bArr = new byte[i13];
                System.arraycopy(zVar.a, 0, bArr, 0, i13);
                int i14 = o0Var.a;
                int i15 = 5;
                t.c(5, zVar, false);
                int r12 = zVar.r() + 1;
                d5.y yVar2 = new d5.y(zVar.a);
                yVar2.s(zVar.b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 >= r12) {
                        o0 o0Var3 = o0Var;
                        int i18 = 6;
                        int i19 = yVar2.i(6) + 1;
                        for (int i20 = 0; i20 < i19; i20++) {
                            if (yVar2.i(16) != 0) {
                                throw t1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i21 = 1;
                        int i22 = yVar2.i(6) + 1;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 < i22) {
                                int i25 = yVar2.i(i17);
                                if (i25 == 0) {
                                    int i26 = 8;
                                    yVar2.s(8);
                                    yVar2.s(16);
                                    yVar2.s(16);
                                    yVar2.s(6);
                                    yVar2.s(8);
                                    int i27 = yVar2.i(4) + 1;
                                    int i28 = 0;
                                    while (i28 < i27) {
                                        yVar2.s(i26);
                                        i28++;
                                        i26 = 8;
                                    }
                                } else {
                                    if (i25 != i21) {
                                        throw t1.a("floor type greater than 1 not decodable: " + i25, null);
                                    }
                                    int i29 = yVar2.i(5);
                                    int[] iArr = new int[i29];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < i29; i31++) {
                                        int i32 = yVar2.i(4);
                                        iArr[i31] = i32;
                                        if (i32 > i30) {
                                            i30 = i32;
                                        }
                                    }
                                    int i33 = i30 + 1;
                                    int[] iArr2 = new int[i33];
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        iArr2[i34] = yVar2.i(i24) + 1;
                                        int i35 = yVar2.i(2);
                                        int i36 = 8;
                                        if (i35 > 0) {
                                            yVar2.s(8);
                                        }
                                        int i37 = 0;
                                        for (int i38 = 1; i37 < (i38 << i35); i38 = 1) {
                                            yVar2.s(i36);
                                            i37++;
                                            i36 = 8;
                                        }
                                        i34++;
                                        i24 = 3;
                                    }
                                    yVar2.s(2);
                                    int i39 = yVar2.i(4);
                                    int i40 = 0;
                                    int i41 = 0;
                                    for (int i42 = 0; i42 < i29; i42++) {
                                        i40 += iArr2[iArr[i42]];
                                        while (i41 < i40) {
                                            yVar2.s(i39);
                                            i41++;
                                        }
                                    }
                                }
                                i23++;
                                i18 = 6;
                                i17 = 16;
                                i21 = 1;
                            } else {
                                int i43 = yVar2.i(i18) + 1;
                                int i44 = 0;
                                while (i44 < i43) {
                                    if (yVar2.i(16) > 2) {
                                        throw t1.a("residueType greater than 2 is not decodable", null);
                                    }
                                    yVar2.s(24);
                                    yVar2.s(24);
                                    yVar2.s(24);
                                    int i45 = yVar2.i(i18) + 1;
                                    int i46 = 8;
                                    yVar2.s(8);
                                    int[] iArr3 = new int[i45];
                                    for (int i47 = 0; i47 < i45; i47++) {
                                        iArr3[i47] = ((yVar2.h() ? yVar2.i(5) : 0) * 8) + yVar2.i(3);
                                    }
                                    int i48 = 0;
                                    while (i48 < i45) {
                                        int i49 = 0;
                                        while (i49 < i46) {
                                            if ((iArr3[i48] & (1 << i49)) != 0) {
                                                yVar2.s(i46);
                                            }
                                            i49++;
                                            i46 = 8;
                                        }
                                        i48++;
                                        i46 = 8;
                                    }
                                    i44++;
                                    i18 = 6;
                                }
                                int i50 = yVar2.i(i18) + 1;
                                for (int i51 = 0; i51 < i50; i51++) {
                                    int i52 = yVar2.i(16);
                                    if (i52 != 0) {
                                        d5.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i52);
                                    } else {
                                        int i53 = yVar2.h() ? yVar2.i(4) + 1 : 1;
                                        if (yVar2.h()) {
                                            int i54 = yVar2.i(8) + 1;
                                            for (int i55 = 0; i55 < i54; i55++) {
                                                int i56 = i14 - 1;
                                                int i57 = 0;
                                                for (int i58 = i56; i58 > 0; i58 >>>= 1) {
                                                    i57++;
                                                }
                                                yVar2.s(i57);
                                                int i59 = 0;
                                                while (i56 > 0) {
                                                    i59++;
                                                    i56 >>>= 1;
                                                }
                                                yVar2.s(i59);
                                            }
                                        }
                                        if (yVar2.i(2) != 0) {
                                            throw t1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i53 > 1) {
                                            for (int i60 = 0; i60 < i14; i60++) {
                                                yVar2.s(4);
                                            }
                                        }
                                        for (int i61 = 0; i61 < i53; i61++) {
                                            yVar2.s(8);
                                            yVar2.s(8);
                                            yVar2.s(8);
                                        }
                                    }
                                }
                                int i62 = yVar2.i(6);
                                int i63 = i62 + 1;
                                d5.c[] cVarArr = new d5.c[i63];
                                for (int i64 = 0; i64 < i63; i64++) {
                                    boolean h = yVar2.h();
                                    yVar2.i(16);
                                    yVar2.i(16);
                                    yVar2.i(8);
                                    d5.c cVar = new d5.c();
                                    cVar.a = h;
                                    cVarArr[i64] = cVar;
                                }
                                if (!yVar2.h()) {
                                    throw t1.a("framing bit after modes not set as expected", null);
                                }
                                int i65 = 0;
                                while (i62 > 0) {
                                    i65++;
                                    i62 >>>= 1;
                                }
                                i0Var = new i0(o0Var3, yVar, bArr, cVarArr, i65);
                            }
                        }
                    } else {
                        if (yVar2.i(24) != 5653314) {
                            throw t1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((yVar2.d * 8) + yVar2.e), null);
                        }
                        int i66 = yVar2.i(16);
                        int i67 = yVar2.i(24);
                        long[] jArr = new long[i67];
                        long j12 = 0;
                        if (yVar2.h()) {
                            i10 = r12;
                            int i68 = yVar2.i(5) + 1;
                            int i69 = 0;
                            while (i69 < i67) {
                                int i70 = 0;
                                for (int i71 = i67 - i69; i71 > 0; i71 >>>= 1) {
                                    i70++;
                                }
                                int i72 = yVar2.i(i70);
                                int i73 = 0;
                                while (i73 < i72 && i69 < i67) {
                                    int i74 = i69;
                                    jArr[i74] = i68;
                                    i69 = i74 + 1;
                                    i73++;
                                    o0Var = o0Var;
                                }
                                i68++;
                                i69 = i69;
                                o0Var = o0Var;
                            }
                        } else {
                            boolean h10 = yVar2.h();
                            int i75 = 0;
                            while (i75 < i67) {
                                if (!h10) {
                                    i11 = r12;
                                    jArr[i75] = yVar2.i(5) + 1;
                                } else if (yVar2.h()) {
                                    i11 = r12;
                                    jArr[i75] = yVar2.i(i15) + 1;
                                } else {
                                    i11 = r12;
                                    jArr[i75] = 0;
                                }
                                i75++;
                                r12 = i11;
                                i15 = 5;
                            }
                            i10 = r12;
                        }
                        o0 o0Var4 = o0Var;
                        int i76 = yVar2.i(4);
                        if (i76 > 2) {
                            throw t1.a("lookup type greater than 2 not decodable: " + i76, null);
                        }
                        if (i76 == 1 || i76 == 2) {
                            yVar2.s(32);
                            yVar2.s(32);
                            int i77 = yVar2.i(4) + 1;
                            yVar2.s(1);
                            if (i76 != 1) {
                                j12 = i67 * i66;
                            } else if (i66 != 0) {
                                j12 = (long) Math.floor(Math.pow(i67, 1.0d / i66));
                            }
                            yVar2.s((int) (i77 * j12));
                        }
                        i16++;
                        r12 = i10;
                        o0Var = o0Var4;
                        i15 = 5;
                    }
                }
            }
        }
        i0Var = null;
        this.n = i0Var;
        if (i0Var == null) {
            return true;
        }
        o0 o0Var5 = (o0) i0Var.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) o0Var5.g);
        arrayList.add((byte[]) i0Var.d);
        z3.c a2 = t.a(p8.z.v(((y) i0Var.c).a));
        s0 s0Var = new s0();
        s0Var.o = "audio/vorbis";
        s0Var.f = o0Var5.d;
        s0Var.g = o0Var5.c;
        s0Var.B = o0Var5.a;
        s0Var.C = o0Var5.b;
        s0Var.q = arrayList;
        s0Var.i = a2;
        i6Var.b = new t0(s0Var);
        return true;
    }

    @Override // v3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
