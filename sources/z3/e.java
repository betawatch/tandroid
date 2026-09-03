package z3;

import android.util.Pair;
import c2.a1;
import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.u6;
import k7.y7;
import l3.p0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import s8.i0;
import s8.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class e {
    public static final byte[] a;

    static {
        int i10 = d0.a;
        a = "OpusHead".getBytes(r8.d.c);
    }

    public static a4.c a(int i10, w wVar) {
        wVar.F(i10 + 12);
        wVar.G(1);
        b(wVar);
        wVar.G(2);
        int u10 = wVar.u();
        if ((u10 & 128) != 0) {
            wVar.G(2);
        }
        if ((u10 & 64) != 0) {
            wVar.G(wVar.u());
        }
        if ((u10 & 32) != 0) {
            wVar.G(2);
        }
        wVar.G(1);
        b(wVar);
        String d = h5.o.d(wVar.u());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return new a4.c(d, null, -1L, -1L);
        }
        wVar.G(4);
        long v = wVar.v();
        long v10 = wVar.v();
        wVar.G(1);
        int b10 = b(wVar);
        long j10 = v10;
        byte[] bArr = new byte[b10];
        wVar.e(0, b10, bArr);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new a4.c(d, bArr, j10, v > 0 ? v : -1L);
    }

    public static int b(w wVar) {
        int u10 = wVar.u();
        int i10 = u10 & 127;
        while ((u10 & 128) == 128) {
            u10 = wVar.u();
            i10 = (i10 << 7) | (u10 & 127);
        }
        return i10;
    }

    public static f2.c c(w wVar) {
        long j10;
        wVar.F(8);
        if (n3.a.f(wVar.g()) == 0) {
            j10 = wVar.v();
            wVar.G(4);
        } else {
            long o10 = wVar.o();
            wVar.G(8);
            j10 = o10;
        }
        return new f2.c(new e4.c(new m3.a((j10 - 2082844800) * 1000)), wVar.v(), 13);
    }

    public static Pair d(w wVar, int i10, int i11) {
        Integer num;
        p pVar;
        Pair create;
        int i12;
        int i13;
        Integer num2;
        boolean z4;
        int i14 = wVar.b;
        while (i14 - i10 < i11) {
            wVar.F(i14);
            int g10 = wVar.g();
            u6.a("childAtomSize must be positive", g10 > 0);
            if (wVar.g() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                int i17 = 0;
                while (i15 - i14 < g10) {
                    wVar.F(i15);
                    int g11 = wVar.g();
                    int g12 = wVar.g();
                    if (g12 == 1718775137) {
                        num3 = Integer.valueOf(wVar.g());
                    } else if (g12 == 1935894637) {
                        wVar.G(4);
                        str = wVar.s(4, r8.d.c);
                    } else if (g12 == 1935894633) {
                        i16 = i15;
                        i17 = g11;
                    }
                    i15 += g11;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    u6.a("frma atom is mandatory", num3 != null);
                    u6.a("schi atom is mandatory", i16 != -1);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 >= i17) {
                            num = num3;
                            pVar = null;
                            break;
                        }
                        wVar.F(i18);
                        int g13 = wVar.g();
                        if (wVar.g() == 1952804451) {
                            int f10 = n3.a.f(wVar.g());
                            wVar.G(1);
                            if (f10 == 0) {
                                wVar.G(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int u10 = wVar.u();
                                i12 = u10 & 15;
                                i13 = (u10 & 240) >> 4;
                            }
                            if (wVar.u() == 1) {
                                num2 = num3;
                                z4 = true;
                            } else {
                                num2 = num3;
                                z4 = false;
                            }
                            int u11 = wVar.u();
                            byte[] bArr2 = new byte[16];
                            wVar.e(0, 16, bArr2);
                            if (z4 && u11 == 0) {
                                int u12 = wVar.u();
                                byte[] bArr3 = new byte[u12];
                                wVar.e(0, u12, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            pVar = new p(z4, str, u11, bArr2, i13, i12, bArr);
                        } else {
                            i18 += g13;
                        }
                    }
                    u6.a("tenc atom is mandatory", pVar != null);
                    int i19 = d0.a;
                    create = Pair.create(num, pVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += g10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ed A[ADDED_TO_REGION, LOOP:12: B:231:0x02ed->B:234:0x02f7, LOOP_START, PHI: r16
      0x02ed: PHI (r16v4 int) = (r16v2 int), (r16v5 int) binds: [B:230:0x02eb, B:234:0x02f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0371  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r e(o oVar, a aVar, r3.p pVar) {
        a1 a1Var;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int a2;
        long j10;
        int i13;
        w wVar;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        n0 n0Var;
        long j11;
        long j12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long[] jArr3;
        int i20;
        long[] jArr4;
        long[] jArr5;
        int[] iArr2;
        int i21;
        int[] iArr3;
        long j13;
        boolean z10;
        o oVar2;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        long[] jArr6;
        int i22;
        int[] iArr7;
        long j14;
        int i23;
        long j15;
        o oVar3;
        int i24;
        long[] jArr7;
        long[] jArr8;
        int[] iArr8;
        int i25;
        int[] iArr9;
        int i26;
        int i27;
        int i28;
        n0 n0Var2 = oVar.f;
        b j16 = aVar.j(1937011578);
        if (j16 != null) {
            p2.g gVar = new p2.g();
            w wVar2 = j16.c;
            gVar.c = wVar2;
            wVar2.F(12);
            int x10 = wVar2.x();
            if ("audio/raw".equals(n0Var2.C)) {
                int x11 = d0.x(n0Var2.R, n0Var2.P);
                if (x10 == 0 || x10 % x11 != 0) {
                    h5.a.K("AtomParsers", "Audio sample size mismatch. stsd sample size: " + x11 + ", stsz sample size: " + x10);
                    x10 = x11;
                }
            }
            if (x10 == 0) {
                x10 = -1;
            }
            gVar.a = x10;
            gVar.b = wVar2.x();
            a1Var = gVar;
        } else {
            b j17 = aVar.j(1937013298);
            if (j17 == null) {
                throw r1.a("Track has no sample table size information", null);
            }
            a1 a1Var2 = new a1();
            w wVar3 = j17.c;
            a1Var2.e = wVar3;
            wVar3.F(12);
            a1Var2.b = wVar3.x() & 255;
            a1Var2.a = wVar3.x();
            a1Var = a1Var2;
        }
        int b10 = a1Var.b();
        if (b10 == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b j18 = aVar.j(1937007471);
        if (j18 == null) {
            j18 = aVar.j(1668232756);
            j18.getClass();
            z4 = true;
        } else {
            z4 = false;
        }
        w wVar4 = j18.c;
        b j19 = aVar.j(1937011555);
        j19.getClass();
        w wVar5 = j19.c;
        b j20 = aVar.j(1937011827);
        j20.getClass();
        w wVar6 = j20.c;
        b j21 = aVar.j(1937011571);
        w wVar7 = j21 != null ? j21.c : null;
        b j22 = aVar.j(1668576371);
        w wVar8 = j22 != null ? j22.c : null;
        c cVar = new c(wVar5, wVar4, z4);
        wVar6.F(12);
        int x12 = wVar6.x() - 1;
        int x13 = wVar6.x();
        int x14 = wVar6.x();
        if (wVar8 != null) {
            wVar8.F(12);
            i10 = wVar8.x();
        } else {
            i10 = 0;
        }
        if (wVar7 != null) {
            wVar7.F(12);
            i11 = wVar7.x();
            if (i11 > 0) {
                i12 = wVar7.x() - 1;
                a2 = a1Var.a();
                j10 = oVar.c;
                i13 = oVar.b;
                wVar = wVar8;
                long[] jArr9 = oVar.i;
                jArr = oVar.h;
                a1 a1Var3 = a1Var;
                String str = n0Var2.C;
                long j23 = 0;
                if (a2 == -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && x12 == 0 && i10 == 0 && i11 == 0)) {
                    int i29 = cVar.a;
                    long[] jArr10 = new long[i29];
                    int[] iArr10 = new int[i29];
                    while (cVar.a()) {
                        int i30 = cVar.b;
                        long[] jArr11 = jArr10;
                        jArr11[i30] = cVar.d;
                        iArr10[i30] = cVar.c;
                        jArr10 = jArr11;
                        a2 = a2;
                    }
                    int i31 = a2;
                    long[] jArr12 = jArr10;
                    long j24 = x14;
                    int i32 = 8192 / i31;
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < i29) {
                        i34 += d0.f(iArr10[i33], i32);
                        i33++;
                        j24 = j24;
                    }
                    long j25 = j24;
                    long[] jArr13 = new long[i34];
                    int[] iArr11 = new int[i34];
                    jArr5 = new long[i34];
                    iArr7 = new int[i34];
                    int i35 = 0;
                    int i36 = 0;
                    i22 = 0;
                    int i37 = 0;
                    while (i35 < i29) {
                        int i38 = iArr10[i35];
                        long j26 = jArr12[i35];
                        int i39 = i37;
                        int i40 = i29;
                        int i41 = i22;
                        int i42 = i39;
                        int i43 = i35;
                        int i44 = i38;
                        while (i44 > 0) {
                            int min = Math.min(i32, i44);
                            jArr13[i42] = j26;
                            int i45 = i44;
                            int i46 = i31 * min;
                            iArr11[i42] = i46;
                            int max = Math.max(i41, i46);
                            jArr5[i42] = i36 * j25;
                            iArr7[i42] = 1;
                            j26 += iArr11[i42];
                            i36 += min;
                            i44 = i45 - min;
                            i42++;
                            i41 = max;
                        }
                        i35 = i43 + 1;
                        int i47 = i42;
                        i22 = i41;
                        i29 = i40;
                        i37 = i47;
                    }
                    jArr3 = jArr;
                    oVar2 = oVar;
                    n0Var = n0Var2;
                    i17 = i13;
                    j13 = j25 * i36;
                    j11 = j10;
                    jArr6 = jArr13;
                    iArr6 = iArr11;
                } else {
                    jArr2 = new long[b10];
                    iArr = new int[b10];
                    long[] jArr14 = new long[b10];
                    int[] iArr12 = new int[b10];
                    n0Var = n0Var2;
                    j11 = j10;
                    int i48 = x14;
                    int i49 = i12;
                    long j27 = 0;
                    j12 = 0;
                    int i50 = 0;
                    i14 = 0;
                    i15 = 0;
                    i16 = x12;
                    i17 = i13;
                    w wVar9 = wVar7;
                    i18 = x13;
                    i19 = 0;
                    jArr3 = jArr;
                    int i51 = 0;
                    while (true) {
                        if (i19 < b10) {
                            int[] iArr13 = iArr;
                            i20 = i51;
                            jArr4 = jArr2;
                            jArr5 = jArr14;
                            iArr2 = iArr12;
                            i21 = i14;
                            iArr3 = iArr13;
                            break;
                        }
                        j14 = j12;
                        i23 = i14;
                        boolean z11 = true;
                        while (i23 == 0) {
                            z11 = cVar.a();
                            if (!z11) {
                                break;
                            }
                            j14 = cVar.d;
                            i23 = cVar.c;
                            i51 = i51;
                        }
                        int i52 = i51;
                        if (!z11) {
                            h5.a.K("AtomParsers", "Unexpected end of chunk data");
                            long[] copyOf = Arrays.copyOf(jArr2, i19);
                            iArr3 = Arrays.copyOf(iArr, i19);
                            long[] copyOf2 = Arrays.copyOf(jArr14, i19);
                            iArr2 = Arrays.copyOf(iArr12, i19);
                            jArr4 = copyOf;
                            jArr5 = copyOf2;
                            b10 = i19;
                            i21 = i23;
                            i20 = i52;
                            break;
                        }
                        i51 = i52;
                        if (wVar != null) {
                            int i53 = i15;
                            while (i53 == 0 && i10 > 0) {
                                i53 = wVar.x();
                                i51 = wVar.g();
                                i10--;
                            }
                            i15 = i53 - 1;
                        }
                        jArr2[i19] = j14;
                        int c3 = a1Var3.c();
                        iArr[i19] = c3;
                        if (c3 > i50) {
                            i50 = c3;
                        }
                        long[] jArr15 = jArr2;
                        int[] iArr14 = iArr;
                        jArr14[i19] = j27 + i51;
                        iArr12[i19] = wVar9 == null ? 1 : 0;
                        if (i19 == i49) {
                            iArr12[i19] = 1;
                            i11--;
                            if (i11 > 0) {
                                wVar9.getClass();
                                i49 = wVar9.x() - 1;
                            }
                        }
                        j27 += i48;
                        i18--;
                        if (i18 == 0 && i16 > 0) {
                            i16--;
                            i18 = wVar6.x();
                            i48 = wVar6.g();
                        }
                        long j28 = j14 + iArr14[i19];
                        i14 = i23 - 1;
                        i19++;
                        j12 = j28;
                        iArr = iArr14;
                        jArr2 = jArr15;
                    }
                    j13 = j27 + i20;
                    if (wVar != null) {
                        while (i10 > 0) {
                            if (wVar.x() != 0) {
                                z10 = false;
                                break;
                            }
                            wVar.g();
                            i10--;
                        }
                    }
                    z10 = true;
                    if (i11 != 0 && i18 == 0 && i21 == 0 && i16 == 0 && i15 == 0 && z10) {
                        oVar2 = oVar;
                        iArr4 = iArr3;
                        iArr5 = iArr2;
                    } else {
                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                        oVar2 = oVar;
                        iArr4 = iArr3;
                        boolean z12 = z10;
                        iArr5 = iArr2;
                        l.d.w(sb, oVar2.a, ": remainingSynchronizationSamples ", i11, ", remainingSamplesAtTimestampDelta ");
                        l.d.w(sb, i18, ", remainingSamplesInChunk ", i21, ", remainingTimestampDeltaChanges ");
                        sb.append(i16);
                        sb.append(", remainingSamplesAtTimestampOffset ");
                        sb.append(i15);
                        sb.append(z12 ? ", ctts invalid" : "");
                        h5.a.K("AtomParsers", sb.toString());
                    }
                    iArr6 = iArr4;
                    jArr6 = jArr4;
                    i22 = i50;
                    iArr7 = iArr5;
                }
                long N = d0.N(j13, 1000000L, oVar2.c);
                if (jArr3 != null) {
                    d0.O(jArr5, j11);
                    return new r(oVar2, jArr6, iArr6, i22, jArr5, iArr7, N);
                }
                long[] jArr16 = jArr6;
                int i54 = b10;
                long j29 = j13;
                long[] jArr17 = jArr5;
                int[] iArr15 = iArr7;
                int i55 = i22;
                long[] jArr18 = jArr3;
                long j30 = j11;
                if (jArr18.length == 1) {
                    i24 = i17;
                    if (i24 != 1 || jArr17.length < 2) {
                        j15 = j29;
                    } else {
                        jArr9.getClass();
                        long j31 = jArr9[0];
                        int[] iArr16 = iArr6;
                        long N2 = d0.N(jArr18[0], oVar2.c, oVar2.d) + j31;
                        int length = jArr17.length - 1;
                        int h = d0.h(4, 0, length);
                        int h9 = d0.h(jArr17.length - 4, 0, length);
                        long j32 = jArr17[0];
                        if (j32 <= j31 && j31 < jArr17[h] && jArr17[h9] < N2 && N2 <= j29) {
                            long j33 = j29 - N2;
                            n0 n0Var3 = n0Var;
                            j15 = j29;
                            long N3 = d0.N(j31 - j32, n0Var3.Q, oVar2.c);
                            long N4 = d0.N(j33, n0Var3.Q, oVar2.c);
                            if (!(N3 == 0 && N4 == 0) && N3 <= 2147483647L && N4 <= 2147483647L) {
                                pVar.a = (int) N3;
                                pVar.b = (int) N4;
                                d0.O(jArr17, j30);
                                return new r(oVar2, jArr16, iArr16, i55, jArr17, iArr15, d0.N(jArr18[0], 1000000L, oVar2.d));
                            }
                            iArr6 = iArr16;
                            iArr15 = iArr15;
                        } else {
                            iArr6 = iArr16;
                            j15 = j29;
                        }
                        i55 = i55;
                    }
                    oVar3 = oVar2;
                } else {
                    j15 = j29;
                    oVar3 = oVar2;
                    i24 = i17;
                }
                int i56 = 1;
                if (jArr18.length == 1) {
                    if (jArr18[0] == 0) {
                        jArr9.getClass();
                        long j34 = jArr9[0];
                        for (int i57 = 0; i57 < jArr17.length; i57++) {
                            jArr17[i57] = d0.N(jArr17[i57] - j34, 1000000L, oVar3.c);
                        }
                        return new r(oVar3, jArr16, iArr6, i55, jArr17, iArr15, d0.N(j15 - j34, 1000000L, oVar3.c));
                    }
                    i56 = 1;
                }
                boolean z13 = i24 == i56;
                int[] iArr17 = new int[jArr18.length];
                int[] iArr18 = new int[jArr18.length];
                jArr9.getClass();
                int i58 = 0;
                boolean z14 = false;
                int i59 = 0;
                int i60 = 0;
                while (i58 < jArr18.length) {
                    int i61 = i58;
                    boolean z15 = z14;
                    long j35 = jArr9[i61];
                    if (j35 != -1) {
                        iArr9 = iArr6;
                        i26 = i55;
                        long N5 = d0.N(jArr18[i61], oVar3.c, oVar3.d);
                        i25 = i61;
                        int i62 = 1;
                        iArr17[i25] = d0.e(jArr17, j35, true);
                        iArr18[i25] = d0.b(jArr17, j35 + N5, z13);
                        while (true) {
                            i27 = iArr17[i25];
                            i28 = iArr18[i25];
                            if (i27 >= i28 || (iArr15[i27] & i62) != 0) {
                                break;
                            }
                            iArr17[i25] = i27 + 1;
                            i62 = 1;
                        }
                        i59 = (i28 - i27) + i59;
                        z14 = z15 | (i60 != i27);
                        i60 = i28;
                    } else {
                        i25 = i61;
                        iArr9 = iArr6;
                        i26 = i55;
                        z14 = z15;
                    }
                    i58 = i25 + 1;
                    i55 = i26;
                    iArr6 = iArr9;
                }
                int[] iArr19 = iArr6;
                int i63 = i55;
                boolean z16 = z14 | (i59 != i54);
                long[] jArr19 = z16 ? new long[i59] : jArr16;
                int[] iArr20 = z16 ? new int[i59] : iArr19;
                int i64 = z16 ? 0 : i63;
                int[] iArr21 = z16 ? new int[i59] : iArr15;
                long[] jArr20 = new long[i59];
                long j36 = 0;
                int i65 = 0;
                int i66 = 0;
                while (i65 < jArr18.length) {
                    long j37 = jArr9[i65];
                    boolean z17 = z16;
                    int i67 = iArr17[i65];
                    long[] jArr21 = jArr18;
                    int i68 = iArr18[i65];
                    if (z17) {
                        jArr8 = jArr17;
                        int i69 = i68 - i67;
                        System.arraycopy(jArr16, i67, jArr19, i66, i69);
                        jArr7 = jArr19;
                        iArr8 = iArr19;
                        System.arraycopy(iArr8, i67, iArr20, i66, i69);
                        System.arraycopy(iArr15, i67, iArr21, i66, i69);
                    } else {
                        jArr7 = jArr19;
                        jArr8 = jArr17;
                        iArr8 = iArr19;
                    }
                    int i70 = i64;
                    while (i67 < i68) {
                        int i71 = i68;
                        int[] iArr22 = iArr8;
                        long N6 = d0.N(j36, 1000000L, oVar3.d);
                        long N7 = d0.N(jArr8[i67] - j37, 1000000L, oVar3.c);
                        int i72 = i67;
                        long j38 = j23;
                        if (i24 != 1) {
                            N7 = Math.max(j38, N7);
                        }
                        jArr20[i66] = N6 + N7;
                        if (z17 && iArr20[i66] > i70) {
                            i70 = iArr22[i72];
                        }
                        i66++;
                        j23 = j38;
                        i67 = i72 + 1;
                        iArr8 = iArr22;
                        oVar3 = oVar;
                        i68 = i71;
                    }
                    iArr19 = iArr8;
                    j36 += jArr21[i65];
                    i65++;
                    i64 = i70;
                    jArr17 = jArr8;
                    jArr19 = jArr7;
                    jArr18 = jArr21;
                    oVar3 = oVar;
                    z16 = z17;
                }
                return new r(oVar, jArr19, iArr20, i64, jArr20, iArr21, d0.N(j36, 1000000L, oVar.d));
            }
            wVar7 = null;
        } else {
            i11 = 0;
        }
        i12 = -1;
        a2 = a1Var.a();
        j10 = oVar.c;
        i13 = oVar.b;
        wVar = wVar8;
        long[] jArr92 = oVar.i;
        jArr = oVar.h;
        a1 a1Var32 = a1Var;
        String str2 = n0Var2.C;
        long j232 = 0;
        if (a2 == -1) {
        }
        jArr2 = new long[b10];
        iArr = new int[b10];
        long[] jArr142 = new long[b10];
        int[] iArr122 = new int[b10];
        n0Var = n0Var2;
        j11 = j10;
        int i482 = x14;
        int i492 = i12;
        long j272 = 0;
        j12 = 0;
        int i502 = 0;
        i14 = 0;
        i15 = 0;
        i16 = x12;
        i17 = i13;
        w wVar92 = wVar7;
        i18 = x13;
        i19 = 0;
        jArr3 = jArr;
        int i512 = 0;
        while (true) {
            if (i19 < b10) {
            }
            long j282 = j14 + iArr14[i19];
            i14 = i23 - 1;
            i19++;
            j12 = j282;
            iArr = iArr14;
            jArr2 = jArr15;
        }
        j13 = j272 + i20;
        if (wVar != null) {
        }
        z10 = true;
        if (i11 != 0) {
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
        oVar2 = oVar;
        iArr4 = iArr3;
        boolean z122 = z10;
        iArr5 = iArr2;
        l.d.w(sb2, oVar2.a, ": remainingSynchronizationSamples ", i11, ", remainingSamplesAtTimestampDelta ");
        l.d.w(sb2, i18, ", remainingSamplesInChunk ", i21, ", remainingTimestampDeltaChanges ");
        sb2.append(i16);
        sb2.append(", remainingSamplesAtTimestampOffset ");
        sb2.append(i15);
        sb2.append(z122 ? ", ctts invalid" : "");
        h5.a.K("AtomParsers", sb2.toString());
        iArr6 = iArr4;
        jArr6 = jArr4;
        i22 = i502;
        iArr7 = iArr5;
        long N8 = d0.N(j13, 1000000L, oVar2.c);
        if (jArr3 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        if (r11 == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0e77  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0e7c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0e50  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0e54  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0eb0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(a aVar, r3.p pVar, long j10, o3.g gVar, boolean z4, boolean z10, r8.e eVar) {
        long j11;
        long j12;
        int i10;
        int i11;
        long j13;
        long j14;
        b j15;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        long[] jArr;
        long[] jArr2;
        r8.e eVar2;
        o oVar;
        Pair create;
        ArrayList arrayList3;
        a aVar2;
        Pair pair;
        int i13;
        int i14;
        p[] pVarArr;
        int i15;
        int i16;
        int i17;
        o3.g gVar2;
        int i18;
        String str;
        List list;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f10;
        byte[] bArr;
        int i25;
        byte[] bArr2;
        int i26;
        String str2;
        int i27;
        int i28;
        int i29;
        String str3;
        int i30;
        int[] iArr;
        int[] iArr2;
        int i31;
        int g10;
        int i32;
        int i33;
        int i34;
        o3.g gVar3;
        String str4;
        String str5;
        int i35;
        String str6;
        int i36;
        int i37;
        int i38;
        a4.c cVar;
        List list2;
        int i39;
        String str7;
        int i40;
        int i41;
        String str8;
        String str9;
        String str10;
        int i42;
        int i43;
        int i44;
        String str11;
        a4.c cVar2;
        String str12;
        String str13;
        int i45;
        List x10;
        String str14;
        int i46;
        o3.g a2;
        long j16;
        i0 i0Var;
        o oVar2;
        ArrayList arrayList4;
        a aVar3 = aVar;
        o3.g gVar4 = gVar;
        ArrayList arrayList5 = aVar3.e;
        ArrayList arrayList6 = new ArrayList();
        int i47 = 0;
        while (i47 < arrayList5.size()) {
            a aVar4 = (a) arrayList5.get(i47);
            if (aVar4.b != 1953653099) {
                arrayList = arrayList5;
                arrayList4 = arrayList6;
                i12 = i47;
            } else {
                b j17 = aVar3.j(1836476516);
                j17.getClass();
                a i48 = aVar4.i(1835297121);
                i48.getClass();
                b j18 = i48.j(1751411826);
                j18.getClass();
                w wVar = j18.c;
                wVar.F(16);
                int g11 = wVar.g();
                int i49 = g11 == 1936684398 ? 1 : g11 == 1986618469 ? 2 : (g11 == 1952807028 || g11 == 1935832172 || g11 == 1937072756 || g11 == 1668047728) ? 3 : g11 == 1835365473 ? 5 : -1;
                if (i49 == -1) {
                    eVar2 = eVar;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i12 = i47;
                } else {
                    b j19 = aVar4.j(1953196132);
                    j19.getClass();
                    w wVar2 = j19.c;
                    wVar2.F(8);
                    int f11 = n3.a.f(wVar2.g());
                    wVar2.G(f11 == 0 ? 8 : 16);
                    int g12 = wVar2.g();
                    wVar2.G(4);
                    int i50 = wVar2.b;
                    int i51 = f11 == 0 ? 4 : 8;
                    int i52 = 0;
                    while (true) {
                        j11 = -9223372036854775807L;
                        if (i52 >= i51) {
                            wVar2.G(i51);
                            break;
                        }
                        if (wVar2.a[i50 + i52] != -1) {
                            j12 = f11 == 0 ? wVar2.v() : wVar2.y();
                        } else {
                            i52++;
                        }
                    }
                    j12 = -9223372036854775807L;
                    wVar2.G(16);
                    int g13 = wVar2.g();
                    int g14 = wVar2.g();
                    wVar2.G(4);
                    int g15 = wVar2.g();
                    int g16 = wVar2.g();
                    if (g13 == 0 && g14 == 65536) {
                        i10 = -65536;
                        if (g15 == -65536 && g16 == 0) {
                            i11 = 90;
                            j13 = j10 == -9223372036854775807L ? j12 : j10;
                            long j20 = c(j17.c).b;
                            if (j13 == -9223372036854775807L) {
                                j14 = j20;
                            } else {
                                j14 = j20;
                                j11 = d0.N(j13, 1000000L, j14);
                            }
                            a i53 = i48.i(1835626086);
                            i53.getClass();
                            a i54 = i53.i(1937007212);
                            i54.getClass();
                            b j21 = i48.j(1835296868);
                            j21.getClass();
                            w wVar3 = j21.c;
                            wVar3.F(8);
                            int f12 = n3.a.f(wVar3.g());
                            wVar3.G(f12 == 0 ? 8 : 16);
                            long v = wVar3.v();
                            wVar3.G(f12 == 0 ? 4 : 8);
                            int z11 = wVar3.z();
                            Pair create2 = Pair.create(Long.valueOf(v), "" + ((char) (((z11 >> 10) & 31) + 96)) + ((char) (((z11 >> 5) & 31) + 96)) + ((char) ((z11 & 31) + 96)));
                            j15 = i54.j(1937011556);
                            if (j15 == null) {
                                throw r1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                            }
                            w wVar4 = j15.c;
                            String str15 = (String) create2.second;
                            wVar4.F(12);
                            int g17 = wVar4.g();
                            p[] pVarArr2 = new p[g17];
                            long j22 = j11;
                            int i55 = 0;
                            n0 n0Var = null;
                            int i56 = 0;
                            int i57 = 0;
                            while (i55 < g17) {
                                int i58 = wVar4.b;
                                int g18 = wVar4.g();
                                ArrayList arrayList7 = arrayList5;
                                int i59 = g12;
                                String str16 = "childAtomSize must be positive";
                                u6.a("childAtomSize must be positive", g18 > 0);
                                int g19 = wVar4.g();
                                int i60 = i47;
                                if (g19 == 1635148593 || g19 == 1635148595 || g19 == 1701733238 || g19 == 1831958048 || g19 == 1836070006 || g19 == 1752589105 || g19 == 1751479857 || g19 == 1932670515 || g19 == 1211250227 || g19 == 1987063864 || g19 == 1987063865 || g19 == 1635135537 || g19 == 1685479798 || g19 == 1685479729 || g19 == 1685481573 || g19 == 1685481521) {
                                    int i61 = i11;
                                    arrayList3 = arrayList6;
                                    String str17 = "childAtomSize must be positive";
                                    aVar2 = aVar4;
                                    pair = create2;
                                    i13 = i49;
                                    i14 = g17;
                                    pVarArr = pVarArr2;
                                    i15 = i55;
                                    wVar4.F(i58 + 16);
                                    wVar4.G(16);
                                    int z12 = wVar4.z();
                                    int z13 = wVar4.z();
                                    wVar4.G(50);
                                    int i62 = wVar4.b;
                                    if (g19 == 1701733238) {
                                        i16 = i58;
                                        i17 = g18;
                                        Pair d = d(wVar4, i16, i17);
                                        if (d != null) {
                                            g19 = ((Integer) d.first).intValue();
                                            gVar2 = gVar == null ? null : gVar.a(((p) d.second).b);
                                            pVarArr[i15] = (p) d.second;
                                        } else {
                                            gVar2 = gVar;
                                        }
                                        wVar4.F(i62);
                                    } else {
                                        i16 = i58;
                                        i17 = g18;
                                        gVar2 = gVar;
                                    }
                                    int i63 = i62;
                                    i18 = i16;
                                    str = str15;
                                    o3.g gVar5 = gVar2;
                                    String str18 = g19 == 1831958048 ? "video/mpeg" : g19 == 1211250227 ? "video/3gpp" : null;
                                    int i64 = i57;
                                    List list3 = null;
                                    int i65 = -1;
                                    float f13 = 1.0f;
                                    int i66 = -1;
                                    String str19 = null;
                                    byte[] bArr3 = null;
                                    int i67 = -1;
                                    ByteBuffer byteBuffer = null;
                                    boolean z14 = false;
                                    a4.c cVar3 = null;
                                    int i68 = -1;
                                    while (true) {
                                        if (i63 - i18 >= i17) {
                                            list = list3;
                                            break;
                                        }
                                        wVar4.F(i63);
                                        int i69 = wVar4.b;
                                        int i70 = i63;
                                        int g20 = wVar4.g();
                                        list = list3;
                                        if (g20 == 0 && wVar4.b - i18 == i17) {
                                            break;
                                        }
                                        u6.a(str17, g20 > 0);
                                        int g21 = wVar4.g();
                                        String str20 = str17;
                                        if (g21 == 1635148611) {
                                            u6.a(null, str18 == null);
                                            wVar4.F(i69 + 8);
                                            i5.a a10 = i5.a.a(wVar4);
                                            list3 = a10.a;
                                            i26 = a10.b;
                                            if (!z14) {
                                                f13 = a10.h;
                                            }
                                            str2 = a10.i;
                                            i27 = a10.e;
                                            i28 = a10.f;
                                            i29 = a10.g;
                                            str3 = MediaController.VIDEO_MIME_TYPE;
                                        } else if (g21 == 1752589123) {
                                            u6.a(null, str18 == null);
                                            wVar4.F(i69 + 8);
                                            i5.f a11 = i5.f.a(wVar4);
                                            list3 = a11.a;
                                            i26 = a11.b;
                                            if (!z14) {
                                                f13 = a11.f;
                                            }
                                            str2 = a11.g;
                                            i27 = a11.c;
                                            i28 = a11.d;
                                            i29 = a11.e;
                                            str3 = "video/hevc";
                                        } else {
                                            if (g21 == 1685480259 || g21 == 1685485123) {
                                                i21 = z12;
                                                i22 = g19;
                                                i23 = z13;
                                                i24 = i17;
                                                f10 = f13;
                                                bArr = bArr3;
                                                i25 = i67;
                                                i5.c a12 = i5.c.a(wVar4);
                                                if (a12 != null) {
                                                    str19 = a12.a;
                                                    str18 = "video/dolby-vision";
                                                }
                                            } else {
                                                if (g21 == 1987076931) {
                                                    u6.a(null, str18 == null);
                                                    String str21 = g19 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                    wVar4.F(i69 + 12);
                                                    wVar4.G(2);
                                                    boolean z15 = (wVar4.u() & 1) != 0;
                                                    int u10 = wVar4.u();
                                                    int u11 = wVar4.u();
                                                    i65 = i5.b.b(u10);
                                                    int i71 = z15 ? 1 : 2;
                                                    i66 = i5.b.c(u11);
                                                    i21 = z12;
                                                    i22 = g19;
                                                    i23 = z13;
                                                    i68 = i71;
                                                    i24 = i17;
                                                    str18 = str21;
                                                    list3 = list;
                                                } else {
                                                    if (g21 == 1635135811) {
                                                        u6.a(null, str18 == null);
                                                        str18 = "video/av01";
                                                    } else if (g21 == 1668050025) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        byteBuffer2.position(21);
                                                        byteBuffer2.putShort(wVar4.r());
                                                        byteBuffer2.putShort(wVar4.r());
                                                        byteBuffer = byteBuffer2;
                                                    } else {
                                                        if (g21 == 1835295606) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                            }
                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                            short r10 = wVar4.r();
                                                            short r11 = wVar4.r();
                                                            i22 = g19;
                                                            short r12 = wVar4.r();
                                                            i24 = i17;
                                                            short r13 = wVar4.r();
                                                            i25 = i67;
                                                            short r14 = wVar4.r();
                                                            bArr = bArr3;
                                                            short r15 = wVar4.r();
                                                            f10 = f13;
                                                            short r16 = wVar4.r();
                                                            i23 = z13;
                                                            short r17 = wVar4.r();
                                                            long v10 = wVar4.v();
                                                            long v11 = wVar4.v();
                                                            i21 = z12;
                                                            byteBuffer3.position(1);
                                                            byteBuffer3.putShort(r14);
                                                            byteBuffer3.putShort(r15);
                                                            byteBuffer3.putShort(r10);
                                                            byteBuffer3.putShort(r11);
                                                            byteBuffer3.putShort(r12);
                                                            byteBuffer3.putShort(r13);
                                                            byteBuffer3.putShort(r16);
                                                            byteBuffer3.putShort(r17);
                                                            byteBuffer3.putShort((short) (v10 / 10000));
                                                            byteBuffer3.putShort((short) (v11 / 10000));
                                                            byteBuffer = byteBuffer3;
                                                        } else {
                                                            i21 = z12;
                                                            i22 = g19;
                                                            i23 = z13;
                                                            i24 = i17;
                                                            f10 = f13;
                                                            bArr = bArr3;
                                                            i25 = i67;
                                                            if (g21 == 1681012275) {
                                                                u6.a(null, str18 == null);
                                                                str18 = "video/3gpp";
                                                            } else {
                                                                if (g21 == 1702061171) {
                                                                    u6.a(null, str18 == null);
                                                                    a4.c a13 = a(i69, wVar4);
                                                                    String str22 = (String) a13.c;
                                                                    byte[] bArr4 = (byte[]) a13.d;
                                                                    list3 = bArr4 != null ? v.x(bArr4) : list;
                                                                    cVar3 = a13;
                                                                    str18 = str22;
                                                                    i67 = i25;
                                                                    bArr3 = bArr;
                                                                } else if (g21 == 1885434736) {
                                                                    wVar4.F(i69 + 8);
                                                                    f13 = wVar4.x() / wVar4.x();
                                                                    list3 = list;
                                                                    i67 = i25;
                                                                    bArr3 = bArr;
                                                                    z14 = true;
                                                                } else if (g21 == 1937126244) {
                                                                    int i72 = i69 + 8;
                                                                    while (true) {
                                                                        if (i72 - i69 >= g20) {
                                                                            bArr2 = null;
                                                                            break;
                                                                        }
                                                                        wVar4.F(i72);
                                                                        int g22 = wVar4.g();
                                                                        if (wVar4.g() == 1886547818) {
                                                                            bArr2 = Arrays.copyOfRange(wVar4.a, i72, g22 + i72);
                                                                            break;
                                                                        }
                                                                        i72 += g22;
                                                                    }
                                                                    bArr3 = bArr2;
                                                                    list3 = list;
                                                                    i67 = i25;
                                                                } else if (g21 == 1936995172) {
                                                                    int u12 = wVar4.u();
                                                                    wVar4.G(3);
                                                                    if (u12 == 0) {
                                                                        int u13 = wVar4.u();
                                                                        if (u13 == 0) {
                                                                            i25 = 0;
                                                                        } else if (u13 == 1) {
                                                                            i25 = 1;
                                                                        } else if (u13 == 2) {
                                                                            i25 = 2;
                                                                        } else if (u13 == 3) {
                                                                            i25 = 3;
                                                                        }
                                                                    }
                                                                } else if (g21 == 1668246642 && i65 == -1 && i66 == -1) {
                                                                    int g23 = wVar4.g();
                                                                    if (g23 == 1852009592 || g23 == 1852009571) {
                                                                        int z16 = wVar4.z();
                                                                        int z17 = wVar4.z();
                                                                        wVar4.G(2);
                                                                        boolean z18 = g20 == 19 && (wVar4.u() & 128) != 0;
                                                                        int b10 = i5.b.b(z16);
                                                                        int i73 = z18 ? 1 : 2;
                                                                        i65 = b10;
                                                                        i66 = i5.b.c(z17);
                                                                        i68 = i73;
                                                                    } else {
                                                                        h5.a.K("AtomParsers", "Unsupported color type: " + n3.a.c(g23));
                                                                    }
                                                                }
                                                                f13 = f10;
                                                            }
                                                        }
                                                        list3 = list;
                                                        i67 = i25;
                                                        bArr3 = bArr;
                                                        f13 = f10;
                                                    }
                                                    i21 = z12;
                                                    i22 = g19;
                                                    i23 = z13;
                                                    i24 = i17;
                                                    list3 = list;
                                                }
                                                i63 = i70 + g20;
                                                str17 = str20;
                                                g19 = i22;
                                                i17 = i24;
                                                z13 = i23;
                                                z12 = i21;
                                            }
                                            list3 = list;
                                            i67 = i25;
                                            bArr3 = bArr;
                                            f13 = f10;
                                            i63 = i70 + g20;
                                            str17 = str20;
                                            g19 = i22;
                                            i17 = i24;
                                            z13 = i23;
                                            z12 = i21;
                                        }
                                        i21 = z12;
                                        i22 = g19;
                                        i23 = z13;
                                        i64 = i26;
                                        i24 = i17;
                                        i68 = i28;
                                        str18 = str3;
                                        str19 = str2;
                                        i65 = i27;
                                        i66 = i29;
                                        i63 = i70 + g20;
                                        str17 = str20;
                                        g19 = i22;
                                        i17 = i24;
                                        z13 = i23;
                                        z12 = i21;
                                    }
                                    int i74 = z12;
                                    int i75 = z13;
                                    i19 = i17;
                                    float f14 = f13;
                                    byte[] bArr5 = bArr3;
                                    int i76 = i67;
                                    if (str18 == null) {
                                        i20 = i61;
                                    } else {
                                        m0 m0Var = new m0();
                                        m0Var.a = Integer.toString(i59);
                                        m0Var.o = str18;
                                        m0Var.h = str19;
                                        m0Var.t = i74;
                                        m0Var.u = i75;
                                        m0Var.x = f14;
                                        i20 = i61;
                                        m0Var.w = i20;
                                        m0Var.y = bArr5;
                                        m0Var.z = i76;
                                        m0Var.q = list;
                                        m0Var.r = gVar5;
                                        int i77 = i68;
                                        if (i65 != -1 || i77 != -1 || i66 != -1 || byteBuffer != null) {
                                            m0Var.A = new i5.b(i65, i77, i66, byteBuffer != null ? byteBuffer.array() : null);
                                        }
                                        if (cVar3 != null) {
                                            a4.c cVar4 = cVar3;
                                            m0Var.f = y7.c(cVar4.a);
                                            m0Var.g = y7.c(cVar4.b);
                                        }
                                        n0Var = new n0(m0Var);
                                    }
                                    i57 = i64;
                                } else {
                                    i13 = i49;
                                    if (g19 == 1836069985 || g19 == 1701733217 || g19 == 1633889587 || g19 == 1700998451 || g19 == 1633889588 || g19 == 1835823201 || g19 == 1685353315 || g19 == 1685353317 || g19 == 1685353320 || g19 == 1685353324 || g19 == 1685353336 || g19 == 1935764850 || g19 == 1935767394 || g19 == 1819304813 || g19 == 1936684916 || g19 == 1953984371 || g19 == 778924082 || g19 == 778924083 || g19 == 1835557169 || g19 == 1835560241 || g19 == 1634492771 || g19 == 1634492791 || g19 == 1970037111 || g19 == 1332770163 || g19 == 1716281667) {
                                        i14 = g17;
                                        pVarArr = pVarArr2;
                                        int[] iArr3 = l3.a.f;
                                        int[] iArr4 = l3.a.d;
                                        wVar4.F(i58 + 16);
                                        if (z10) {
                                            int z19 = wVar4.z();
                                            wVar4.G(6);
                                            i30 = z19;
                                        } else {
                                            wVar4.G(8);
                                            i30 = 0;
                                        }
                                        if (i30 == 0 || i30 == 1) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            int z20 = wVar4.z();
                                            wVar4.G(6);
                                            byte[] bArr6 = wVar4.a;
                                            i31 = z20;
                                            int i78 = wVar4.b;
                                            int i79 = i78 + 1;
                                            wVar4.b = i79;
                                            int i80 = (bArr6[i78] & 255) << 8;
                                            wVar4.b = i78 + 2;
                                            int i81 = i80 | (bArr6[i79] & 255);
                                            wVar4.b = i78 + 4;
                                            wVar4.F(i78);
                                            g10 = wVar4.g();
                                            if (i30 == 1) {
                                                wVar4.G(16);
                                            }
                                            i32 = i81;
                                        } else if (i30 == 2) {
                                            wVar4.G(16);
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            i32 = (int) Math.round(Double.longBitsToDouble(wVar4.o()));
                                            int x11 = wVar4.x();
                                            wVar4.G(20);
                                            i31 = x11;
                                            g10 = 0;
                                        } else {
                                            i34 = i11;
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            i15 = i55;
                                            i18 = i58;
                                            i33 = g18;
                                            str = str15;
                                            i20 = i34;
                                            i19 = i33;
                                        }
                                        int i82 = wVar4.b;
                                        int i83 = i32;
                                        if (g19 == 1701733217) {
                                            Pair d10 = d(wVar4, i58, g18);
                                            if (d10 != null) {
                                                int intValue = ((Integer) d10.first).intValue();
                                                if (gVar4 == null) {
                                                    i46 = intValue;
                                                    a2 = null;
                                                } else {
                                                    i46 = intValue;
                                                    a2 = gVar4.a(((p) d10.second).b);
                                                }
                                                pVarArr[i55] = (p) d10.second;
                                                gVar3 = a2;
                                                g19 = i46;
                                            } else {
                                                gVar3 = gVar4;
                                            }
                                            wVar4.F(i82);
                                        } else {
                                            gVar3 = gVar4;
                                        }
                                        int[] iArr5 = iArr;
                                        String str23 = "audio/ac3";
                                        i15 = i55;
                                        if (g19 == 1633889587) {
                                            str5 = "audio/ac3";
                                        } else if (g19 == 1700998451) {
                                            str5 = "audio/eac3";
                                        } else if (g19 == 1633889588) {
                                            str5 = "audio/ac4";
                                        } else {
                                            if (g19 == 1685353315) {
                                                str4 = "audio/vnd.dts";
                                            } else if (g19 == 1685353320 || g19 == 1685353324) {
                                                str4 = "audio/vnd.dts.hd";
                                            } else if (g19 == 1685353317) {
                                                str4 = "audio/vnd.dts.hd;profile=lbr";
                                            } else if (g19 == 1685353336) {
                                                str4 = "audio/vnd.dts.uhd;profile=p2";
                                            } else if (g19 == 1935764850) {
                                                str4 = "audio/3gpp";
                                            } else if (g19 == 1935767394) {
                                                str4 = "audio/amr-wb";
                                            } else {
                                                str5 = "audio/raw";
                                                if (g19 == 1819304813 || g19 == 1936684916) {
                                                    i35 = 2;
                                                } else if (g19 == 1953984371) {
                                                    i35 = TLObject.FLAG_28;
                                                } else if (g19 == 778924082 || g19 == 778924083) {
                                                    str4 = "audio/mpeg";
                                                } else if (g19 == 1835557169) {
                                                    str4 = "audio/mha1";
                                                } else if (g19 == 1835560241) {
                                                    str4 = "audio/mhm1";
                                                } else if (g19 == 1634492771) {
                                                    str4 = "audio/alac";
                                                } else if (g19 == 1634492791) {
                                                    str4 = "audio/g711-alaw";
                                                } else if (g19 == 1970037111) {
                                                    str4 = "audio/g711-mlaw";
                                                } else if (g19 == 1332770163) {
                                                    str4 = "audio/opus";
                                                } else if (g19 == 1716281667) {
                                                    str4 = "audio/flac";
                                                } else if (g19 == 1835823201) {
                                                    str4 = "audio/true-hd";
                                                } else {
                                                    i35 = -1;
                                                    str5 = null;
                                                }
                                                i34 = i11;
                                                arrayList3 = arrayList6;
                                                aVar2 = aVar4;
                                                pair = create2;
                                                i18 = i58;
                                                str6 = str5;
                                                i36 = i82;
                                                i37 = i31;
                                                i38 = i83;
                                                List list4 = null;
                                                String str24 = null;
                                                cVar = null;
                                                while (i36 - i18 < g18) {
                                                    wVar4.F(i36);
                                                    int g24 = wVar4.g();
                                                    int i84 = g18;
                                                    u6.a(str16, g24 > 0);
                                                    int g25 = wVar4.g();
                                                    List list5 = list4;
                                                    if (g25 == 1835557187) {
                                                        int i85 = g24 - 13;
                                                        byte[] bArr7 = new byte[i85];
                                                        i40 = i35;
                                                        wVar4.F(i36 + 13);
                                                        wVar4.e(0, i85, bArr7);
                                                        list5 = v.x(bArr7);
                                                        str11 = str16;
                                                        str10 = str23;
                                                        i44 = g24;
                                                    } else {
                                                        i40 = i35;
                                                        if (g25 == 1702061171) {
                                                            i41 = g24;
                                                            str8 = str16;
                                                            str9 = str24;
                                                            str10 = str23;
                                                            i42 = 1702061171;
                                                        } else if (z10 && g25 == 2002876005) {
                                                            i41 = g24;
                                                            str8 = str16;
                                                            str9 = str24;
                                                            str10 = str23;
                                                            i42 = 1702061171;
                                                        } else {
                                                            if (g25 == 1684103987) {
                                                                wVar4.F(i36 + 8);
                                                                String num = Integer.toString(i59);
                                                                h5.v vVar = new h5.v();
                                                                vVar.o(wVar4);
                                                                int i86 = iArr2[vVar.i(2)];
                                                                str13 = str24;
                                                                vVar.s(8);
                                                                int i87 = iArr5[vVar.i(3)];
                                                                int i88 = vVar.i(1) != 0 ? i87 + 1 : i87;
                                                                str12 = str16;
                                                                int i89 = l3.a.g[vVar.i(5)] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                vVar.c();
                                                                wVar4.F(vVar.f());
                                                                m0 m0Var2 = new m0();
                                                                m0Var2.a = num;
                                                                m0Var2.o = str23;
                                                                m0Var2.B = i88;
                                                                m0Var2.C = i86;
                                                                m0Var2.r = gVar3;
                                                                m0Var2.c = str15;
                                                                m0Var2.f = i89;
                                                                m0Var2.g = i89;
                                                                n0Var = new n0(m0Var2);
                                                                i45 = g24;
                                                                str10 = str23;
                                                            } else {
                                                                str12 = str16;
                                                                str13 = str24;
                                                                if (g25 == 1684366131) {
                                                                    wVar4.F(i36 + 8);
                                                                    String num2 = Integer.toString(i59);
                                                                    h5.v vVar2 = new h5.v();
                                                                    vVar2.o(wVar4);
                                                                    int i90 = vVar2.i(13) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                    vVar2.s(3);
                                                                    int i91 = iArr2[vVar2.i(2)];
                                                                    str10 = str23;
                                                                    vVar2.s(10);
                                                                    int i92 = iArr5[vVar2.i(3)];
                                                                    if (vVar2.i(1) != 0) {
                                                                        i92++;
                                                                    }
                                                                    vVar2.s(3);
                                                                    int i93 = vVar2.i(4);
                                                                    vVar2.s(1);
                                                                    int i94 = i92;
                                                                    if (i93 > 0) {
                                                                        vVar2.s(6);
                                                                        if (vVar2.i(1) != 0) {
                                                                            i94 += 2;
                                                                        }
                                                                        vVar2.s(1);
                                                                        i92 = i94;
                                                                    }
                                                                    i45 = g24;
                                                                    if (vVar2.b() > 7) {
                                                                        vVar2.s(7);
                                                                        if (vVar2.i(1) != 0) {
                                                                            str14 = "audio/eac3-joc";
                                                                            vVar2.c();
                                                                            wVar4.F(vVar2.f());
                                                                            m0 m0Var3 = new m0();
                                                                            m0Var3.a = num2;
                                                                            m0Var3.o = str14;
                                                                            m0Var3.B = i92;
                                                                            m0Var3.C = i91;
                                                                            m0Var3.r = gVar3;
                                                                            m0Var3.c = str15;
                                                                            m0Var3.g = i90;
                                                                            n0Var = new n0(m0Var3);
                                                                        }
                                                                    }
                                                                    str14 = "audio/eac3";
                                                                    vVar2.c();
                                                                    wVar4.F(vVar2.f());
                                                                    m0 m0Var32 = new m0();
                                                                    m0Var32.a = num2;
                                                                    m0Var32.o = str14;
                                                                    m0Var32.B = i92;
                                                                    m0Var32.C = i91;
                                                                    m0Var32.r = gVar3;
                                                                    m0Var32.c = str15;
                                                                    m0Var32.g = i90;
                                                                    n0Var = new n0(m0Var32);
                                                                } else {
                                                                    i45 = g24;
                                                                    str10 = str23;
                                                                    if (g25 == 1684103988) {
                                                                        wVar4.F(i36 + 8);
                                                                        String num3 = Integer.toString(i59);
                                                                        wVar4.G(1);
                                                                        int i95 = ((wVar4.u() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                        m0 m0Var4 = new m0();
                                                                        m0Var4.a = num3;
                                                                        m0Var4.o = "audio/ac4";
                                                                        m0Var4.B = 2;
                                                                        m0Var4.C = i95;
                                                                        m0Var4.r = gVar3;
                                                                        m0Var4.c = str15;
                                                                        n0Var = new n0(m0Var4);
                                                                    } else if (g25 != 1684892784) {
                                                                        if (g25 == 1684305011 || g25 == 1969517683) {
                                                                            m0 m0Var5 = new m0();
                                                                            m0Var5.a = Integer.toString(i59);
                                                                            m0Var5.o = str6;
                                                                            m0Var5.B = i37;
                                                                            m0Var5.C = i38;
                                                                            m0Var5.r = gVar3;
                                                                            m0Var5.c = str15;
                                                                            n0Var = new n0(m0Var5);
                                                                        } else {
                                                                            if (g25 == 1682927731) {
                                                                                int i96 = i45 - 8;
                                                                                byte[] bArr8 = a;
                                                                                byte[] copyOf = Arrays.copyOf(bArr8, bArr8.length + i96);
                                                                                wVar4.F(i36 + 8);
                                                                                wVar4.e(bArr8.length, i96, copyOf);
                                                                                x10 = l3.a.a(copyOf);
                                                                            } else if (g25 == 1684425825) {
                                                                                byte[] bArr9 = new byte[i45 - 8];
                                                                                bArr9[0] = 102;
                                                                                bArr9[1] = 76;
                                                                                bArr9[2] = 97;
                                                                                bArr9[3] = 67;
                                                                                wVar4.F(i36 + 12);
                                                                                wVar4.e(4, i45 - 12, bArr9);
                                                                                x10 = v.x(bArr9);
                                                                            } else if (g25 == 1634492771) {
                                                                                int i97 = i45 - 12;
                                                                                byte[] bArr10 = new byte[i97];
                                                                                wVar4.F(i36 + 12);
                                                                                wVar4.e(0, i97, bArr10);
                                                                                w wVar5 = new w(bArr10);
                                                                                wVar5.F(9);
                                                                                int u14 = wVar5.u();
                                                                                wVar5.F(20);
                                                                                Pair create3 = Pair.create(Integer.valueOf(wVar5.x()), Integer.valueOf(u14));
                                                                                int intValue2 = ((Integer) create3.first).intValue();
                                                                                i37 = ((Integer) create3.second).intValue();
                                                                                list5 = v.x(bArr10);
                                                                                i38 = intValue2;
                                                                            }
                                                                            list5 = x10;
                                                                            str24 = str13;
                                                                            str11 = str12;
                                                                            i44 = i45;
                                                                        }
                                                                        str24 = str13;
                                                                        str11 = str12;
                                                                        i44 = i45;
                                                                    } else {
                                                                        if (g10 <= 0) {
                                                                            throw r1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + g10, null);
                                                                        }
                                                                        i38 = g10;
                                                                        str24 = str13;
                                                                        str11 = str12;
                                                                        i44 = i45;
                                                                        i37 = 2;
                                                                    }
                                                                    str24 = str13;
                                                                    str11 = str12;
                                                                    i44 = i45;
                                                                }
                                                            }
                                                            str24 = str13;
                                                            str11 = str12;
                                                            i44 = i45;
                                                        }
                                                        if (g25 != i42) {
                                                            i43 = wVar4.b;
                                                            u6.a(null, i43 >= i36);
                                                            while (true) {
                                                                i44 = i41;
                                                                if (i43 - i36 >= i44) {
                                                                    str11 = str8;
                                                                    i43 = -1;
                                                                    break;
                                                                }
                                                                wVar4.F(i43);
                                                                int g26 = wVar4.g();
                                                                str11 = str8;
                                                                u6.a(str11, g26 > 0);
                                                                if (wVar4.g() == 1702061171) {
                                                                    break;
                                                                }
                                                                i43 += g26;
                                                                str8 = str11;
                                                                i41 = i44;
                                                            }
                                                        } else {
                                                            i43 = i36;
                                                            str11 = str8;
                                                            i44 = i41;
                                                        }
                                                        if (i43 != -1) {
                                                            cVar2 = a(i43, wVar4);
                                                            str6 = (String) cVar2.c;
                                                            byte[] bArr11 = (byte[]) cVar2.d;
                                                            if (bArr11 != null) {
                                                                if (MediaController.AUDIO_MIME_TYPE.equals(str6)) {
                                                                    p0 h = l3.a.h(new h5.v(bArr11, bArr11.length), false);
                                                                    i38 = h.a;
                                                                    i37 = h.b;
                                                                    str24 = (String) h.c;
                                                                } else {
                                                                    str24 = str9;
                                                                }
                                                                list5 = v.x(bArr11);
                                                                cVar = cVar2;
                                                            }
                                                        } else {
                                                            cVar2 = cVar;
                                                        }
                                                        str24 = str9;
                                                        cVar = cVar2;
                                                    }
                                                    i36 += i44;
                                                    str16 = str11;
                                                    list4 = list5;
                                                    i35 = i40;
                                                    g18 = i84;
                                                    str23 = str10;
                                                }
                                                list2 = list4;
                                                i39 = i35;
                                                str7 = str24;
                                                i33 = g18;
                                                if (n0Var == null && str6 != null) {
                                                    m0 m0Var6 = new m0();
                                                    m0Var6.a = Integer.toString(i59);
                                                    m0Var6.o = str6;
                                                    m0Var6.h = str7;
                                                    m0Var6.B = i37;
                                                    m0Var6.C = i38;
                                                    m0Var6.D = i39;
                                                    m0Var6.q = list2;
                                                    m0Var6.r = gVar3;
                                                    m0Var6.c = str15;
                                                    if (cVar != null) {
                                                        a4.c cVar5 = cVar;
                                                        m0Var6.f = y7.c(cVar5.a);
                                                        m0Var6.g = y7.c(cVar5.b);
                                                    }
                                                    n0Var = new n0(m0Var6);
                                                }
                                                str = str15;
                                                i20 = i34;
                                                i19 = i33;
                                            }
                                            str5 = str4;
                                        }
                                        i35 = -1;
                                        i34 = i11;
                                        arrayList3 = arrayList6;
                                        aVar2 = aVar4;
                                        pair = create2;
                                        i18 = i58;
                                        str6 = str5;
                                        i36 = i82;
                                        i37 = i31;
                                        i38 = i83;
                                        List list42 = null;
                                        String str242 = null;
                                        cVar = null;
                                        while (i36 - i18 < g18) {
                                        }
                                        list2 = list42;
                                        i39 = i35;
                                        str7 = str242;
                                        i33 = g18;
                                        if (n0Var == null) {
                                            m0 m0Var62 = new m0();
                                            m0Var62.a = Integer.toString(i59);
                                            m0Var62.o = str6;
                                            m0Var62.h = str7;
                                            m0Var62.B = i37;
                                            m0Var62.C = i38;
                                            m0Var62.D = i39;
                                            m0Var62.q = list2;
                                            m0Var62.r = gVar3;
                                            m0Var62.c = str15;
                                            if (cVar != null) {
                                            }
                                            n0Var = new n0(m0Var62);
                                        }
                                        str = str15;
                                        i20 = i34;
                                        i19 = i33;
                                    } else {
                                        if (g19 == 1414810956 || g19 == 1954034535 || g19 == 2004251764 || g19 == 1937010800 || g19 == 1664495672) {
                                            wVar4.F(i58 + 16);
                                            String str25 = "application/ttml+xml";
                                            if (g19 != 1414810956) {
                                                if (g19 == 1954034535) {
                                                    int i98 = g18 - 16;
                                                    byte[] bArr12 = new byte[i98];
                                                    wVar4.e(0, i98, bArr12);
                                                    i0Var = v.x(bArr12);
                                                    str25 = "application/x-quicktime-tx3g";
                                                    i14 = g17;
                                                    j16 = Long.MAX_VALUE;
                                                } else if (g19 == 2004251764) {
                                                    str25 = "application/x-mp4-vtt";
                                                } else if (g19 == 1937010800) {
                                                    i14 = g17;
                                                    i0Var = null;
                                                    j16 = 0;
                                                } else {
                                                    if (g19 != 1664495672) {
                                                        throw new IllegalStateException();
                                                    }
                                                    str25 = "application/x-mp4-cea-608";
                                                    i14 = g17;
                                                    j16 = Long.MAX_VALUE;
                                                    i0Var = null;
                                                    i56 = 1;
                                                }
                                                m0 m0Var7 = new m0();
                                                pVarArr = pVarArr2;
                                                m0Var7.a = Integer.toString(i59);
                                                m0Var7.o = str25;
                                                m0Var7.c = str15;
                                                m0Var7.s = j16;
                                                m0Var7.q = i0Var;
                                                i20 = i11;
                                                n0Var = new n0(m0Var7);
                                                arrayList3 = arrayList6;
                                                aVar2 = aVar4;
                                                pair = create2;
                                                str = str15;
                                            }
                                            i14 = g17;
                                            j16 = Long.MAX_VALUE;
                                            i0Var = null;
                                            m0 m0Var72 = new m0();
                                            pVarArr = pVarArr2;
                                            m0Var72.a = Integer.toString(i59);
                                            m0Var72.o = str25;
                                            m0Var72.c = str15;
                                            m0Var72.s = j16;
                                            m0Var72.q = i0Var;
                                            i20 = i11;
                                            n0Var = new n0(m0Var72);
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            str = str15;
                                        } else {
                                            if (g19 == 1835365492) {
                                                wVar4.F(i58 + 16);
                                                if (g19 == 1835365492) {
                                                    wVar4.p();
                                                    String p10 = wVar4.p();
                                                    if (p10 != null) {
                                                        m0 m0Var8 = new m0();
                                                        m0Var8.a = Integer.toString(i59);
                                                        m0Var8.o = p10;
                                                        n0Var = new n0(m0Var8);
                                                    }
                                                }
                                            } else if (g19 == 1667329389) {
                                                m0 m0Var9 = new m0();
                                                m0Var9.a = Integer.toString(i59);
                                                m0Var9.o = "application/x-camera-motion";
                                                i20 = i11;
                                                arrayList3 = arrayList6;
                                                n0Var = new n0(m0Var9);
                                                aVar2 = aVar4;
                                                pair = create2;
                                                str = str15;
                                                i14 = g17;
                                                pVarArr = pVarArr2;
                                            }
                                            i20 = i11;
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            str = str15;
                                            i14 = g17;
                                            pVarArr = pVarArr2;
                                        }
                                        i15 = i55;
                                        i18 = i58;
                                        i19 = g18;
                                    }
                                }
                                wVar4.F(i18 + i19);
                                i55 = i15 + 1;
                                i11 = i20;
                                arrayList5 = arrayList7;
                                g12 = i59;
                                i47 = i60;
                                g17 = i14;
                                str15 = str;
                                arrayList6 = arrayList3;
                                create2 = pair;
                                aVar4 = aVar2;
                                i49 = i13;
                                pVarArr2 = pVarArr;
                                gVar4 = gVar;
                            }
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            int i99 = g12;
                            i12 = i47;
                            a aVar5 = aVar4;
                            Pair pair2 = create2;
                            int i100 = i49;
                            p[] pVarArr3 = pVarArr2;
                            if (z4) {
                                aVar4 = aVar5;
                            } else {
                                aVar4 = aVar5;
                                a i101 = aVar4.i(1701082227);
                                if (i101 != null) {
                                    b j23 = i101.j(1701606260);
                                    if (j23 == null) {
                                        create = null;
                                    } else {
                                        w wVar6 = j23.c;
                                        wVar6.F(8);
                                        int f15 = n3.a.f(wVar6.g());
                                        int x12 = wVar6.x();
                                        long[] jArr3 = new long[x12];
                                        long[] jArr4 = new long[x12];
                                        for (int i102 = 0; i102 < x12; i102++) {
                                            jArr3[i102] = f15 == 1 ? wVar6.y() : wVar6.v();
                                            jArr4[i102] = f15 == 1 ? wVar6.o() : wVar6.g();
                                            if (wVar6.r() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            wVar6.G(2);
                                        }
                                        create = Pair.create(jArr3, jArr4);
                                    }
                                    if (create != null) {
                                        jArr = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        if (n0Var != null) {
                                            eVar2 = eVar;
                                        } else {
                                            eVar2 = eVar;
                                            oVar = new o(i99, i100, ((Long) pair2.first).longValue(), j14, j22, n0Var, i56, pVarArr3, i57, jArr, jArr2);
                                            oVar2 = (o) eVar2.apply(oVar);
                                            if (oVar2 != null) {
                                                arrayList4 = arrayList2;
                                            } else {
                                                a i103 = aVar4.i(1835297121);
                                                i103.getClass();
                                                a i104 = i103.i(1835626086);
                                                i104.getClass();
                                                a i105 = i104.i(1937007212);
                                                i105.getClass();
                                                r e6 = e(oVar2, i105, pVar);
                                                arrayList4 = arrayList2;
                                                arrayList4.add(e6);
                                            }
                                        }
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (n0Var != null) {
                            }
                        }
                    } else {
                        i10 = -65536;
                    }
                    if (g13 == 0 && g14 == i10) {
                        if (g15 == 65536 && g16 == 0) {
                            i11 = 270;
                            if (j10 == -9223372036854775807L) {
                            }
                            long j202 = c(j17.c).b;
                            if (j13 == -9223372036854775807L) {
                            }
                            a i532 = i48.i(1835626086);
                            i532.getClass();
                            a i542 = i532.i(1937007212);
                            i542.getClass();
                            b j212 = i48.j(1835296868);
                            j212.getClass();
                            w wVar32 = j212.c;
                            wVar32.F(8);
                            int f122 = n3.a.f(wVar32.g());
                            wVar32.G(f122 == 0 ? 8 : 16);
                            long v12 = wVar32.v();
                            wVar32.G(f122 == 0 ? 4 : 8);
                            int z112 = wVar32.z();
                            Pair create22 = Pair.create(Long.valueOf(v12), "" + ((char) (((z112 >> 10) & 31) + 96)) + ((char) (((z112 >> 5) & 31) + 96)) + ((char) ((z112 & 31) + 96)));
                            j15 = i542.j(1937011556);
                            if (j15 == null) {
                            }
                        } else {
                            i10 = -65536;
                        }
                    }
                    i11 = (g13 == i10 && g14 == 0 && g15 == 0 && g16 == i10) ? 180 : 0;
                    if (j10 == -9223372036854775807L) {
                    }
                    long j2022 = c(j17.c).b;
                    if (j13 == -9223372036854775807L) {
                    }
                    a i5322 = i48.i(1835626086);
                    i5322.getClass();
                    a i5422 = i5322.i(1937007212);
                    i5422.getClass();
                    b j2122 = i48.j(1835296868);
                    j2122.getClass();
                    w wVar322 = j2122.c;
                    wVar322.F(8);
                    int f1222 = n3.a.f(wVar322.g());
                    wVar322.G(f1222 == 0 ? 8 : 16);
                    long v122 = wVar322.v();
                    wVar322.G(f1222 == 0 ? 4 : 8);
                    int z1122 = wVar322.z();
                    Pair create222 = Pair.create(Long.valueOf(v122), "" + ((char) (((z1122 >> 10) & 31) + 96)) + ((char) (((z1122 >> 5) & 31) + 96)) + ((char) ((z1122 & 31) + 96)));
                    j15 = i5422.j(1937011556);
                    if (j15 == null) {
                    }
                }
                oVar = null;
                oVar2 = (o) eVar2.apply(oVar);
                if (oVar2 != null) {
                }
            }
            i47 = i12 + 1;
            aVar3 = aVar;
            gVar4 = gVar;
            arrayList6 = arrayList4;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }
}
