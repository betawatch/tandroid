package v3;

import d5.x;
import e0.i0;
import g7.t;
import h3.s0;
import h3.t0;
import h3.t1;
import j3.n0;
import java.util.ArrayList;
import java.util.Arrays;
import m3.y;
import o8.z;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends i {
    public i0 n;
    public int o;
    public boolean p;
    public n0 q;
    public y r;

    @Override // v3.i
    public final void a(long j10) {
        this.g = j10;
        this.p = j10 != 0;
        n0 n0Var = this.q;
        this.o = n0Var != null ? n0Var.e : 0;
    }

    @Override // v3.i
    public final long b(d5.y yVar) {
        byte b10 = yVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        i0 i0Var = this.n;
        d5.a.j(i0Var);
        int i9 = i0Var.a;
        n0 n0Var = (n0) i0Var.b;
        int i10 = !((d5.c[]) i0Var.e)[(b10 >> 1) & (255 >>> (8 - i9))].a ? n0Var.e : n0Var.f;
        long j10 = this.p ? (this.o + i10) / 4 : 0;
        byte[] bArr = yVar.a;
        int length = bArr.length;
        int i11 = yVar.c + 4;
        if (length < i11) {
            byte[] copyOf = Arrays.copyOf(bArr, i11);
            yVar.A(copyOf.length, copyOf);
        } else {
            yVar.B(i11);
        }
        byte[] bArr2 = yVar.a;
        int i12 = yVar.c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.p = true;
        this.o = i10;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v51, types: [byte[], java.io.Serializable] */
    @Override // v3.i
    public final boolean c(d5.y yVar, long j10, e3 e3Var) {
        i0 i0Var;
        int i9;
        int i10;
        if (this.n != null) {
            ((t0) e3Var.b).getClass();
            return false;
        }
        n0 n0Var = this.q;
        if (n0Var == null) {
            t.c(1, yVar, false);
            yVar.j();
            int r10 = yVar.r();
            int j11 = yVar.j();
            int g10 = yVar.g();
            if (g10 <= 0) {
                g10 = -1;
            }
            int g11 = yVar.g();
            int i11 = g11 > 0 ? g11 : -1;
            yVar.g();
            int r11 = yVar.r();
            int pow = (int) Math.pow(2.0d, r11 & 15);
            int pow2 = (int) Math.pow(2.0d, (r11 & 240) >> 4);
            yVar.r();
            ?? copyOf = Arrays.copyOf(yVar.a, yVar.c);
            n0 n0Var2 = new n0();
            n0Var2.a = r10;
            n0Var2.b = j11;
            n0Var2.c = g10;
            n0Var2.d = i11;
            n0Var2.e = pow;
            n0Var2.f = pow2;
            n0Var2.g = copyOf;
            this.q = n0Var2;
        } else {
            y yVar2 = this.r;
            if (yVar2 == null) {
                this.r = t.b(yVar, true, true);
            } else {
                int i12 = yVar.c;
                byte[] bArr = new byte[i12];
                System.arraycopy(yVar.a, 0, bArr, 0, i12);
                int i13 = n0Var.a;
                int i14 = 5;
                t.c(5, yVar, false);
                int r12 = yVar.r() + 1;
                x xVar = new x(yVar.a);
                xVar.s(yVar.b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 16;
                    if (i15 >= r12) {
                        n0 n0Var3 = n0Var;
                        int i17 = 6;
                        int i18 = xVar.i(6) + 1;
                        for (int i19 = 0; i19 < i18; i19++) {
                            if (xVar.i(16) != 0) {
                                throw t1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i20 = 1;
                        int i21 = xVar.i(6) + 1;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 < i21) {
                                int i24 = xVar.i(i16);
                                if (i24 == 0) {
                                    int i25 = 8;
                                    xVar.s(8);
                                    xVar.s(16);
                                    xVar.s(16);
                                    xVar.s(6);
                                    xVar.s(8);
                                    int i26 = xVar.i(4) + 1;
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        xVar.s(i25);
                                        i27++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (i24 != i20) {
                                        throw t1.a("floor type greater than 1 not decodable: " + i24, null);
                                    }
                                    int i28 = xVar.i(5);
                                    int[] iArr = new int[i28];
                                    int i29 = -1;
                                    for (int i30 = 0; i30 < i28; i30++) {
                                        int i31 = xVar.i(4);
                                        iArr[i30] = i31;
                                        if (i31 > i29) {
                                            i29 = i31;
                                        }
                                    }
                                    int i32 = i29 + 1;
                                    int[] iArr2 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr2[i33] = xVar.i(i23) + 1;
                                        int i34 = xVar.i(2);
                                        int i35 = 8;
                                        if (i34 > 0) {
                                            xVar.s(8);
                                        }
                                        int i36 = 0;
                                        for (int i37 = 1; i36 < (i37 << i34); i37 = 1) {
                                            xVar.s(i35);
                                            i36++;
                                            i35 = 8;
                                        }
                                        i33++;
                                        i23 = 3;
                                    }
                                    xVar.s(2);
                                    int i38 = xVar.i(4);
                                    int i39 = 0;
                                    int i40 = 0;
                                    for (int i41 = 0; i41 < i28; i41++) {
                                        i39 += iArr2[iArr[i41]];
                                        while (i40 < i39) {
                                            xVar.s(i38);
                                            i40++;
                                        }
                                    }
                                }
                                i22++;
                                i17 = 6;
                                i16 = 16;
                                i20 = 1;
                            } else {
                                int i42 = xVar.i(i17) + 1;
                                int i43 = 0;
                                while (i43 < i42) {
                                    if (xVar.i(16) > 2) {
                                        throw t1.a("residueType greater than 2 is not decodable", null);
                                    }
                                    xVar.s(24);
                                    xVar.s(24);
                                    xVar.s(24);
                                    int i44 = xVar.i(i17) + 1;
                                    int i45 = 8;
                                    xVar.s(8);
                                    int[] iArr3 = new int[i44];
                                    for (int i46 = 0; i46 < i44; i46++) {
                                        iArr3[i46] = ((xVar.h() ? xVar.i(5) : 0) * 8) + xVar.i(3);
                                    }
                                    int i47 = 0;
                                    while (i47 < i44) {
                                        int i48 = 0;
                                        while (i48 < i45) {
                                            if ((iArr3[i47] & (1 << i48)) != 0) {
                                                xVar.s(i45);
                                            }
                                            i48++;
                                            i45 = 8;
                                        }
                                        i47++;
                                        i45 = 8;
                                    }
                                    i43++;
                                    i17 = 6;
                                }
                                int i49 = xVar.i(i17) + 1;
                                for (int i50 = 0; i50 < i49; i50++) {
                                    int i51 = xVar.i(16);
                                    if (i51 != 0) {
                                        d5.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i51);
                                    } else {
                                        int i52 = xVar.h() ? xVar.i(4) + 1 : 1;
                                        if (xVar.h()) {
                                            int i53 = xVar.i(8) + 1;
                                            for (int i54 = 0; i54 < i53; i54++) {
                                                int i55 = i13 - 1;
                                                int i56 = 0;
                                                for (int i57 = i55; i57 > 0; i57 >>>= 1) {
                                                    i56++;
                                                }
                                                xVar.s(i56);
                                                int i58 = 0;
                                                while (i55 > 0) {
                                                    i58++;
                                                    i55 >>>= 1;
                                                }
                                                xVar.s(i58);
                                            }
                                        }
                                        if (xVar.i(2) != 0) {
                                            throw t1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i52 > 1) {
                                            for (int i59 = 0; i59 < i13; i59++) {
                                                xVar.s(4);
                                            }
                                        }
                                        for (int i60 = 0; i60 < i52; i60++) {
                                            xVar.s(8);
                                            xVar.s(8);
                                            xVar.s(8);
                                        }
                                    }
                                }
                                int i61 = xVar.i(6);
                                int i62 = i61 + 1;
                                d5.c[] cVarArr = new d5.c[i62];
                                for (int i63 = 0; i63 < i62; i63++) {
                                    boolean h = xVar.h();
                                    xVar.i(16);
                                    xVar.i(16);
                                    xVar.i(8);
                                    d5.c cVar = new d5.c();
                                    cVar.a = h;
                                    cVarArr[i63] = cVar;
                                }
                                if (!xVar.h()) {
                                    throw t1.a("framing bit after modes not set as expected", null);
                                }
                                int i64 = 0;
                                while (i61 > 0) {
                                    i64++;
                                    i61 >>>= 1;
                                }
                                i0Var = new i0(n0Var3, yVar2, bArr, cVarArr, i64);
                            }
                        }
                    } else {
                        if (xVar.i(24) != 5653314) {
                            throw t1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((xVar.d * 8) + xVar.e), null);
                        }
                        int i65 = xVar.i(16);
                        int i66 = xVar.i(24);
                        long[] jArr = new long[i66];
                        long j12 = 0;
                        if (xVar.h()) {
                            i9 = r12;
                            int i67 = xVar.i(5) + 1;
                            int i68 = 0;
                            while (i68 < i66) {
                                int i69 = 0;
                                for (int i70 = i66 - i68; i70 > 0; i70 >>>= 1) {
                                    i69++;
                                }
                                int i71 = xVar.i(i69);
                                int i72 = 0;
                                while (i72 < i71 && i68 < i66) {
                                    int i73 = i68;
                                    jArr[i73] = i67;
                                    i68 = i73 + 1;
                                    i72++;
                                    n0Var = n0Var;
                                }
                                i67++;
                                i68 = i68;
                                n0Var = n0Var;
                            }
                        } else {
                            boolean h10 = xVar.h();
                            int i74 = 0;
                            while (i74 < i66) {
                                if (!h10) {
                                    i10 = r12;
                                    jArr[i74] = xVar.i(5) + 1;
                                } else if (xVar.h()) {
                                    i10 = r12;
                                    jArr[i74] = xVar.i(i14) + 1;
                                } else {
                                    i10 = r12;
                                    jArr[i74] = 0;
                                }
                                i74++;
                                r12 = i10;
                                i14 = 5;
                            }
                            i9 = r12;
                        }
                        n0 n0Var4 = n0Var;
                        int i75 = xVar.i(4);
                        if (i75 > 2) {
                            throw t1.a("lookup type greater than 2 not decodable: " + i75, null);
                        }
                        if (i75 == 1 || i75 == 2) {
                            xVar.s(32);
                            xVar.s(32);
                            int i76 = xVar.i(4) + 1;
                            xVar.s(1);
                            if (i75 != 1) {
                                j12 = i66 * i65;
                            } else if (i65 != 0) {
                                j12 = (long) Math.floor(Math.pow(i66, 1.0d / i65));
                            }
                            xVar.s((int) (i76 * j12));
                        }
                        i15++;
                        r12 = i9;
                        n0Var = n0Var4;
                        i14 = 5;
                    }
                }
            }
        }
        i0Var = null;
        this.n = i0Var;
        if (i0Var == null) {
            return true;
        }
        n0 n0Var5 = (n0) i0Var.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) n0Var5.g);
        arrayList.add((byte[]) i0Var.d);
        z3.c a2 = t.a(z.v(((y) i0Var.c).a));
        s0 s0Var = new s0();
        s0Var.o = "audio/vorbis";
        s0Var.f = n0Var5.d;
        s0Var.g = n0Var5.c;
        s0Var.B = n0Var5.a;
        s0Var.C = n0Var5.b;
        s0Var.q = arrayList;
        s0Var.i = a2;
        e3Var.b = new t0(s0Var);
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
