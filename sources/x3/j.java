package x3;

import e0.i0;
import f5.v;
import f5.w;
import i7.w5;
import j3.s0;
import j3.t0;
import j3.t1;
import java.util.ArrayList;
import java.util.Arrays;
import l3.p0;
import o3.y;
import q8.z;
import v5.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends i {
    public i0 n;
    public int o;
    public boolean p;
    public p0 q;
    public y r;

    @Override // x3.i
    public final void a(long j10) {
        this.g = j10;
        this.p = j10 != 0;
        p0 p0Var = this.q;
        this.o = p0Var != null ? p0Var.e : 0;
    }

    @Override // x3.i
    public final long b(w wVar) {
        byte b10 = wVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        i0 i0Var = this.n;
        f5.a.j(i0Var);
        int i10 = i0Var.a;
        p0 p0Var = (p0) i0Var.b;
        int i11 = !((f5.c[]) i0Var.e)[(b10 >> 1) & (255 >>> (8 - i10))].a ? p0Var.e : p0Var.f;
        long j10 = this.p ? (this.o + i11) / 4 : 0;
        byte[] bArr = wVar.a;
        int length = bArr.length;
        int i12 = wVar.c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            wVar.A(copyOf.length, copyOf);
        } else {
            wVar.B(i12);
        }
        byte[] bArr2 = wVar.a;
        int i13 = wVar.c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.p = true;
        this.o = i11;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v51, types: [byte[], java.io.Serializable] */
    @Override // x3.i
    public final boolean c(w wVar, long j10, n nVar) {
        i0 i0Var;
        int i10;
        int i11;
        if (this.n != null) {
            ((t0) nVar.b).getClass();
            return false;
        }
        p0 p0Var = this.q;
        if (p0Var == null) {
            w5.c(1, wVar, false);
            wVar.j();
            int r6 = wVar.r();
            int j11 = wVar.j();
            int g10 = wVar.g();
            if (g10 <= 0) {
                g10 = -1;
            }
            int g11 = wVar.g();
            int i12 = g11 > 0 ? g11 : -1;
            wVar.g();
            int r9 = wVar.r();
            int pow = (int) Math.pow(2.0d, r9 & 15);
            int pow2 = (int) Math.pow(2.0d, (r9 & 240) >> 4);
            wVar.r();
            ?? copyOf = Arrays.copyOf(wVar.a, wVar.c);
            p0 p0Var2 = new p0();
            p0Var2.a = r6;
            p0Var2.b = j11;
            p0Var2.c = g10;
            p0Var2.d = i12;
            p0Var2.e = pow;
            p0Var2.f = pow2;
            p0Var2.g = copyOf;
            this.q = p0Var2;
        } else {
            y yVar = this.r;
            if (yVar == null) {
                this.r = w5.b(wVar, true, true);
            } else {
                int i13 = wVar.c;
                byte[] bArr = new byte[i13];
                System.arraycopy(wVar.a, 0, bArr, 0, i13);
                int i14 = p0Var.a;
                int i15 = 5;
                w5.c(5, wVar, false);
                int r10 = wVar.r() + 1;
                v vVar = new v(wVar.a);
                vVar.s(wVar.b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 >= r10) {
                        p0 p0Var3 = p0Var;
                        int i18 = 6;
                        int i19 = vVar.i(6) + 1;
                        for (int i20 = 0; i20 < i19; i20++) {
                            if (vVar.i(16) != 0) {
                                throw t1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i21 = 1;
                        int i22 = vVar.i(6) + 1;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 < i22) {
                                int i25 = vVar.i(i17);
                                if (i25 == 0) {
                                    int i26 = 8;
                                    vVar.s(8);
                                    vVar.s(16);
                                    vVar.s(16);
                                    vVar.s(6);
                                    vVar.s(8);
                                    int i27 = vVar.i(4) + 1;
                                    int i28 = 0;
                                    while (i28 < i27) {
                                        vVar.s(i26);
                                        i28++;
                                        i26 = 8;
                                    }
                                } else {
                                    if (i25 != i21) {
                                        throw t1.a("floor type greater than 1 not decodable: " + i25, null);
                                    }
                                    int i29 = vVar.i(5);
                                    int[] iArr = new int[i29];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < i29; i31++) {
                                        int i32 = vVar.i(4);
                                        iArr[i31] = i32;
                                        if (i32 > i30) {
                                            i30 = i32;
                                        }
                                    }
                                    int i33 = i30 + 1;
                                    int[] iArr2 = new int[i33];
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        iArr2[i34] = vVar.i(i24) + 1;
                                        int i35 = vVar.i(2);
                                        int i36 = 8;
                                        if (i35 > 0) {
                                            vVar.s(8);
                                        }
                                        int i37 = 0;
                                        for (int i38 = 1; i37 < (i38 << i35); i38 = 1) {
                                            vVar.s(i36);
                                            i37++;
                                            i36 = 8;
                                        }
                                        i34++;
                                        i24 = 3;
                                    }
                                    vVar.s(2);
                                    int i39 = vVar.i(4);
                                    int i40 = 0;
                                    int i41 = 0;
                                    for (int i42 = 0; i42 < i29; i42++) {
                                        i40 += iArr2[iArr[i42]];
                                        while (i41 < i40) {
                                            vVar.s(i39);
                                            i41++;
                                        }
                                    }
                                }
                                i23++;
                                i18 = 6;
                                i17 = 16;
                                i21 = 1;
                            } else {
                                int i43 = vVar.i(i18) + 1;
                                int i44 = 0;
                                while (i44 < i43) {
                                    if (vVar.i(16) > 2) {
                                        throw t1.a("residueType greater than 2 is not decodable", null);
                                    }
                                    vVar.s(24);
                                    vVar.s(24);
                                    vVar.s(24);
                                    int i45 = vVar.i(i18) + 1;
                                    int i46 = 8;
                                    vVar.s(8);
                                    int[] iArr3 = new int[i45];
                                    for (int i47 = 0; i47 < i45; i47++) {
                                        iArr3[i47] = ((vVar.h() ? vVar.i(5) : 0) * 8) + vVar.i(3);
                                    }
                                    int i48 = 0;
                                    while (i48 < i45) {
                                        int i49 = 0;
                                        while (i49 < i46) {
                                            if ((iArr3[i48] & (1 << i49)) != 0) {
                                                vVar.s(i46);
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
                                int i50 = vVar.i(i18) + 1;
                                for (int i51 = 0; i51 < i50; i51++) {
                                    int i52 = vVar.i(16);
                                    if (i52 != 0) {
                                        f5.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i52);
                                    } else {
                                        int i53 = vVar.h() ? vVar.i(4) + 1 : 1;
                                        if (vVar.h()) {
                                            int i54 = vVar.i(8) + 1;
                                            for (int i55 = 0; i55 < i54; i55++) {
                                                int i56 = i14 - 1;
                                                int i57 = 0;
                                                for (int i58 = i56; i58 > 0; i58 >>>= 1) {
                                                    i57++;
                                                }
                                                vVar.s(i57);
                                                int i59 = 0;
                                                while (i56 > 0) {
                                                    i59++;
                                                    i56 >>>= 1;
                                                }
                                                vVar.s(i59);
                                            }
                                        }
                                        if (vVar.i(2) != 0) {
                                            throw t1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i53 > 1) {
                                            for (int i60 = 0; i60 < i14; i60++) {
                                                vVar.s(4);
                                            }
                                        }
                                        for (int i61 = 0; i61 < i53; i61++) {
                                            vVar.s(8);
                                            vVar.s(8);
                                            vVar.s(8);
                                        }
                                    }
                                }
                                int i62 = vVar.i(6);
                                int i63 = i62 + 1;
                                f5.c[] cVarArr = new f5.c[i63];
                                for (int i64 = 0; i64 < i63; i64++) {
                                    boolean h = vVar.h();
                                    vVar.i(16);
                                    vVar.i(16);
                                    vVar.i(8);
                                    f5.c cVar = new f5.c();
                                    cVar.a = h;
                                    cVarArr[i64] = cVar;
                                }
                                if (!vVar.h()) {
                                    throw t1.a("framing bit after modes not set as expected", null);
                                }
                                int i65 = 0;
                                while (i62 > 0) {
                                    i65++;
                                    i62 >>>= 1;
                                }
                                i0Var = new i0(p0Var3, yVar, bArr, cVarArr, i65);
                            }
                        }
                    } else {
                        if (vVar.i(24) != 5653314) {
                            throw t1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((vVar.d * 8) + vVar.e), null);
                        }
                        int i66 = vVar.i(16);
                        int i67 = vVar.i(24);
                        long[] jArr = new long[i67];
                        long j12 = 0;
                        if (vVar.h()) {
                            i10 = r10;
                            int i68 = vVar.i(5) + 1;
                            int i69 = 0;
                            while (i69 < i67) {
                                int i70 = 0;
                                for (int i71 = i67 - i69; i71 > 0; i71 >>>= 1) {
                                    i70++;
                                }
                                int i72 = vVar.i(i70);
                                int i73 = 0;
                                while (i73 < i72 && i69 < i67) {
                                    int i74 = i69;
                                    jArr[i74] = i68;
                                    i69 = i74 + 1;
                                    i73++;
                                    p0Var = p0Var;
                                }
                                i68++;
                                i69 = i69;
                                p0Var = p0Var;
                            }
                        } else {
                            boolean h10 = vVar.h();
                            int i75 = 0;
                            while (i75 < i67) {
                                if (!h10) {
                                    i11 = r10;
                                    jArr[i75] = vVar.i(5) + 1;
                                } else if (vVar.h()) {
                                    i11 = r10;
                                    jArr[i75] = vVar.i(i15) + 1;
                                } else {
                                    i11 = r10;
                                    jArr[i75] = 0;
                                }
                                i75++;
                                r10 = i11;
                                i15 = 5;
                            }
                            i10 = r10;
                        }
                        p0 p0Var4 = p0Var;
                        int i76 = vVar.i(4);
                        if (i76 > 2) {
                            throw t1.a("lookup type greater than 2 not decodable: " + i76, null);
                        }
                        if (i76 == 1 || i76 == 2) {
                            vVar.s(32);
                            vVar.s(32);
                            int i77 = vVar.i(4) + 1;
                            vVar.s(1);
                            if (i76 != 1) {
                                j12 = i67 * i66;
                            } else if (i66 != 0) {
                                j12 = (long) Math.floor(Math.pow(i67, 1.0d / i66));
                            }
                            vVar.s((int) (i77 * j12));
                        }
                        i16++;
                        r10 = i10;
                        p0Var = p0Var4;
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
        p0 p0Var5 = (p0) i0Var.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) p0Var5.g);
        arrayList.add((byte[]) i0Var.d);
        b4.c a2 = w5.a(z.v(((y) i0Var.c).a));
        s0 s0Var = new s0();
        s0Var.o = "audio/vorbis";
        s0Var.f = p0Var5.d;
        s0Var.g = p0Var5.c;
        s0Var.B = p0Var5.a;
        s0Var.C = p0Var5.b;
        s0Var.q = arrayList;
        s0Var.i = a2;
        nVar.b = new t0(s0Var);
        return true;
    }

    @Override // x3.i
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
