package w3;

import android.util.Pair;
import f5.d0;
import f5.v;
import f5.w;
import i7.h0;
import i7.p7;
import j3.s0;
import j3.t0;
import j3.t1;
import j7.l1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l4.v0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import q8.l0;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e {
    public static final byte[] a;

    static {
        int i10 = d0.a;
        a = "OpusHead".getBytes(p8.d.c);
    }

    public static v0 a(int i10, w wVar) {
        wVar.C(i10 + 12);
        wVar.D(1);
        b(wVar);
        wVar.D(2);
        int r6 = wVar.r();
        if ((r6 & 128) != 0) {
            wVar.D(2);
        }
        if ((r6 & 64) != 0) {
            wVar.D(wVar.r());
        }
        if ((r6 & 32) != 0) {
            wVar.D(2);
        }
        wVar.D(1);
        b(wVar);
        String d = f5.o.d(wVar.r());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return new v0(d, null, -1L, -1L);
        }
        wVar.D(4);
        long s10 = wVar.s();
        long s11 = wVar.s();
        wVar.D(1);
        int b10 = b(wVar);
        long j10 = s11;
        byte[] bArr = new byte[b10];
        wVar.c(0, b10, bArr);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new v0(d, bArr, j10, s10 > 0 ? s10 : -1L);
    }

    public static int b(w wVar) {
        int r6 = wVar.r();
        int i10 = r6 & 127;
        while ((r6 & 128) == 128) {
            r6 = wVar.r();
            i10 = (i10 << 7) | (r6 & 127);
        }
        return i10;
    }

    public static Pair c(w wVar, int i10, int i11) {
        Integer num;
        p pVar;
        Pair create;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int i14 = wVar.b;
        while (i14 - i10 < i11) {
            wVar.C(i14);
            int e10 = wVar.e();
            h0.a("childAtomSize must be positive", e10 > 0);
            if (wVar.e() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                int i17 = 0;
                while (i15 - i14 < e10) {
                    wVar.C(i15);
                    int e11 = wVar.e();
                    int e12 = wVar.e();
                    if (e12 == 1718775137) {
                        num3 = Integer.valueOf(wVar.e());
                    } else if (e12 == 1935894637) {
                        wVar.D(4);
                        str = wVar.p(4, p8.d.c);
                    } else if (e12 == 1935894633) {
                        i16 = i15;
                        i17 = e11;
                    }
                    i15 += e11;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    h0.a("frma atom is mandatory", num3 != null);
                    h0.a("schi atom is mandatory", i16 != -1);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 >= i17) {
                            num = num3;
                            pVar = null;
                            break;
                        }
                        wVar.C(i18);
                        int e13 = wVar.e();
                        if (wVar.e() == 1952804451) {
                            int b10 = nc.k.b(wVar.e());
                            wVar.D(1);
                            if (b10 == 0) {
                                wVar.D(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int r6 = wVar.r();
                                i12 = r6 & 15;
                                i13 = (r6 & 240) >> 4;
                            }
                            if (wVar.r() == 1) {
                                num2 = num3;
                                z10 = true;
                            } else {
                                num2 = num3;
                                z10 = false;
                            }
                            int r9 = wVar.r();
                            byte[] bArr2 = new byte[16];
                            wVar.c(0, 16, bArr2);
                            if (z10 && r9 == 0) {
                                int r10 = wVar.r();
                                byte[] bArr3 = new byte[r10];
                                wVar.c(0, r10, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            pVar = new p(z10, str, r9, bArr2, i13, i12, bArr);
                        } else {
                            i18 += e13;
                        }
                    }
                    h0.a("tenc atom is mandatory", pVar != null);
                    int i19 = d0.a;
                    create = Pair.create(num, pVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += e10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029c A[ADDED_TO_REGION, LOOP:12: B:211:0x029c->B:214:0x02a6, LOOP_START, PHI: r17
      0x029c: PHI (r17v4 int) = (r17v3 int), (r17v5 int) binds: [B:210:0x029a, B:214:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x028e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r d(o oVar, a aVar, o3.q qVar) {
        d dVar;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int a2;
        int i13;
        long j10;
        w wVar;
        long[] jArr;
        int i14;
        int[] iArr;
        long j11;
        int i15;
        long j12;
        int i16;
        int i17;
        long[] jArr2;
        t0 t0Var;
        int i18;
        int i19;
        int i20;
        int i21;
        int[] iArr2;
        int i22;
        boolean z11;
        long[] jArr3;
        long[] jArr4;
        int[] iArr3;
        int i23;
        long j13;
        long j14;
        int i24;
        int i25;
        long j15;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        t0 t0Var2 = oVar.f;
        b f9 = aVar.f(1937011578);
        if (f9 != null) {
            dVar = new com.google.android.exoplayer2.upstream.w(f9, t0Var2);
        } else {
            b f10 = aVar.f(1937013298);
            if (f10 == null) {
                throw t1.a("Track has no sample table size information", null);
            }
            a4.k kVar = new a4.k();
            w wVar2 = f10.c;
            kVar.e = wVar2;
            wVar2.C(12);
            kVar.b = wVar2.u() & 255;
            kVar.a = wVar2.u();
            dVar = kVar;
        }
        int b10 = dVar.b();
        if (b10 == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b f11 = aVar.f(1937007471);
        if (f11 == null) {
            f11 = aVar.f(1668232756);
            f11.getClass();
            z10 = true;
        } else {
            z10 = false;
        }
        w wVar3 = f11.c;
        b f12 = aVar.f(1937011555);
        f12.getClass();
        w wVar4 = f12.c;
        b f13 = aVar.f(1937011827);
        f13.getClass();
        w wVar5 = f13.c;
        b f14 = aVar.f(1937011571);
        w wVar6 = f14 != null ? f14.c : null;
        b f15 = aVar.f(1668576371);
        w wVar7 = f15 != null ? f15.c : null;
        c cVar = new c(wVar4, wVar3, z10);
        wVar5.C(12);
        int u10 = wVar5.u() - 1;
        int u11 = wVar5.u();
        int u12 = wVar5.u();
        if (wVar7 != null) {
            wVar7.C(12);
            i10 = wVar7.u();
        } else {
            i10 = 0;
        }
        if (wVar6 != null) {
            wVar6.C(12);
            i11 = wVar6.u();
            if (i11 > 0) {
                i12 = wVar6.u() - 1;
                a2 = dVar.a();
                i13 = oVar.b;
                d dVar2 = dVar;
                j10 = oVar.c;
                wVar = wVar7;
                long[] jArr5 = oVar.i;
                jArr = oVar.h;
                i14 = i11;
                String str = t0Var2.B;
                long j16 = 0;
                if (a2 == -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && u10 == 0 && i10 == 0 && i14 == 0)) {
                    int i31 = cVar.a;
                    long[] jArr6 = new long[i31];
                    int[] iArr4 = new int[i31];
                    while (cVar.a()) {
                        int i32 = cVar.b;
                        long[] jArr7 = jArr6;
                        int[] iArr5 = iArr4;
                        jArr7[i32] = cVar.d;
                        iArr5[i32] = cVar.c;
                        jArr6 = jArr7;
                        iArr4 = iArr5;
                    }
                    long[] jArr8 = jArr6;
                    int[] iArr6 = iArr4;
                    long j17 = u12;
                    int i33 = 8192 / a2;
                    int i34 = 0;
                    int i35 = 0;
                    while (i34 < i31) {
                        i35 += d0.f(iArr6[i34], i33);
                        i34++;
                        a2 = a2;
                    }
                    int i36 = a2;
                    long[] jArr9 = new long[i35];
                    iArr2 = new int[i35];
                    long[] jArr10 = new long[i35];
                    iArr3 = new int[i35];
                    int i37 = 0;
                    int i38 = 0;
                    i23 = 0;
                    int i39 = 0;
                    while (i37 < i31) {
                        int i40 = iArr6[i37];
                        long j18 = jArr8[i37];
                        int i41 = i37;
                        int i42 = i40;
                        while (i42 > 0) {
                            int min = Math.min(i33, i42);
                            jArr9[i39] = j18;
                            int i43 = i42;
                            int i44 = i36 * min;
                            iArr2[i39] = i44;
                            i23 = Math.max(i23, i44);
                            jArr10[i39] = i38 * j17;
                            iArr3[i39] = 1;
                            j18 += iArr2[i39];
                            i38 += min;
                            i42 = i43 - min;
                            i39++;
                            i31 = i31;
                        }
                        i37 = i41 + 1;
                    }
                    jArr2 = jArr;
                    t0Var = t0Var2;
                    j11 = j10;
                    j13 = i38 * j17;
                    i18 = i13;
                    jArr3 = jArr9;
                    jArr4 = jArr10;
                } else {
                    long[] jArr11 = new long[b10];
                    iArr = new int[b10];
                    long[] jArr12 = new long[b10];
                    int[] iArr7 = new int[b10];
                    j11 = j10;
                    w wVar8 = wVar6;
                    int i45 = u12;
                    i15 = i14;
                    int i46 = u11;
                    long j19 = 0;
                    j12 = 0;
                    int i47 = 0;
                    i16 = 0;
                    i17 = 0;
                    jArr2 = jArr;
                    t0Var = t0Var2;
                    int i48 = i12;
                    int i49 = 0;
                    int i50 = i10;
                    int i51 = u10;
                    i18 = i13;
                    i19 = 0;
                    while (true) {
                        if (i19 < b10) {
                            i20 = i51;
                            i21 = i46;
                            iArr2 = iArr;
                            i22 = i16;
                            break;
                        }
                        j14 = j12;
                        i24 = i16;
                        boolean z12 = true;
                        while (i24 == 0) {
                            z12 = cVar.a();
                            if (!z12) {
                                break;
                            }
                            int i52 = i51;
                            long j20 = cVar.d;
                            i24 = cVar.c;
                            j14 = j20;
                            i51 = i52;
                            i46 = i46;
                            b10 = b10;
                        }
                        i25 = b10;
                        i20 = i51;
                        i21 = i46;
                        if (!z12) {
                            f5.a.K("AtomParsers", "Unexpected end of chunk data");
                            long[] copyOf = Arrays.copyOf(jArr11, i19);
                            iArr2 = Arrays.copyOf(iArr, i19);
                            jArr12 = Arrays.copyOf(jArr12, i19);
                            iArr7 = Arrays.copyOf(iArr7, i19);
                            b10 = i19;
                            jArr11 = copyOf;
                            i22 = i24;
                            break;
                        }
                        if (wVar != null) {
                            int i53 = i17;
                            while (i53 == 0 && i50 > 0) {
                                i53 = wVar.u();
                                i49 = wVar.e();
                                i50--;
                            }
                            i17 = i53 - 1;
                        }
                        jArr11[i19] = j14;
                        int c3 = dVar2.c();
                        iArr[i19] = c3;
                        if (c3 > i47) {
                            i47 = c3;
                        }
                        jArr12[i19] = j19 + i49;
                        iArr7[i19] = wVar8 == null ? 1 : 0;
                        if (i19 == i48) {
                            iArr7[i19] = 1;
                            i15--;
                            if (i15 > 0) {
                                wVar8.getClass();
                                i48 = wVar8.u() - 1;
                            }
                        }
                        j19 += i45;
                        i46 = i21 - 1;
                        if (i46 != 0 || i20 <= 0) {
                            i51 = i20;
                        } else {
                            int u13 = wVar5.u();
                            int e10 = wVar5.e();
                            i51 = i20 - 1;
                            i46 = u13;
                            i45 = e10;
                        }
                        long j21 = j14 + iArr[i19];
                        i16 = i24 - 1;
                        i19++;
                        j12 = j21;
                        b10 = i25;
                    }
                    long j22 = j19 + i49;
                    if (wVar != null) {
                        while (i50 > 0) {
                            if (wVar.u() != 0) {
                                z11 = false;
                                break;
                            }
                            wVar.e();
                            i50--;
                        }
                    }
                    z11 = true;
                    if (i15 == 0 || i21 != 0 || i22 != 0 || i20 != 0 || i17 != 0 || !z11) {
                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                        boolean z13 = z11;
                        l1.w(sb2, oVar.a, ": remainingSynchronizationSamples ", i15, ", remainingSamplesAtTimestampDelta ");
                        l1.w(sb2, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                        sb2.append(i20);
                        sb2.append(", remainingSamplesAtTimestampOffset ");
                        sb2.append(i17);
                        sb2.append(z13 ? ", ctts invalid" : "");
                        f5.a.K("AtomParsers", sb2.toString());
                    }
                    jArr3 = jArr11;
                    jArr4 = jArr12;
                    iArr3 = iArr7;
                    i23 = i47;
                    j13 = j22;
                }
                int[] iArr8 = iArr2;
                long O = d0.O(j13, 1000000L, oVar.c);
                if (jArr2 != null) {
                    d0.P(jArr4, j11);
                    return new r(oVar, jArr3, iArr8, i23, jArr4, iArr3, O);
                }
                int i54 = i23;
                int i55 = b10;
                int i56 = i54;
                long j23 = j13;
                int[] iArr9 = iArr3;
                long j24 = j11;
                long[] jArr13 = jArr4;
                long[] jArr14 = jArr2;
                if (jArr14.length == 1) {
                    i26 = i18;
                    if (i26 != 1 || jArr13.length < 2) {
                        j15 = j23;
                    } else {
                        jArr5.getClass();
                        long j25 = jArr5[0];
                        long[] jArr15 = jArr3;
                        long O2 = d0.O(jArr14[0], oVar.c, oVar.d) + j25;
                        int length = jArr13.length - 1;
                        int h = d0.h(4, 0, length);
                        int h10 = d0.h(jArr13.length - 4, 0, length);
                        long j26 = jArr13[0];
                        if (j26 <= j25 && j25 < jArr13[h] && jArr13[h10] < O2 && O2 <= j23) {
                            long j27 = j23 - O2;
                            t0 t0Var3 = t0Var;
                            long O3 = d0.O(j25 - j26, t0Var3.P, oVar.c);
                            j15 = j23;
                            long O4 = d0.O(j27, t0Var3.P, oVar.c);
                            if (!(O3 == 0 && O4 == 0) && O3 <= 2147483647L && O4 <= 2147483647L) {
                                qVar.a = (int) O3;
                                qVar.b = (int) O4;
                                d0.P(jArr13, j24);
                                return new r(oVar, jArr15, iArr8, i56, jArr13, iArr9, d0.O(jArr14[0], 1000000L, oVar.d));
                            }
                            iArr9 = iArr9;
                            iArr8 = iArr8;
                            i56 = i56;
                            jArr3 = jArr15;
                        } else {
                            jArr3 = jArr15;
                            j15 = j23;
                            iArr8 = iArr8;
                            i56 = i56;
                        }
                    }
                } else {
                    j15 = j23;
                    i26 = i18;
                }
                int i57 = 1;
                if (jArr14.length == 1) {
                    if (jArr14[0] == 0) {
                        jArr5.getClass();
                        long j28 = jArr5[0];
                        for (int i58 = 0; i58 < jArr13.length; i58++) {
                            jArr13[i58] = d0.O(jArr13[i58] - j28, 1000000L, oVar.c);
                        }
                        return new r(oVar, jArr3, iArr8, i56, jArr13, iArr9, d0.O(j15 - j28, 1000000L, oVar.c));
                    }
                    i57 = 1;
                }
                boolean z14 = i26 == i57;
                int[] iArr10 = new int[jArr14.length];
                int[] iArr11 = new int[jArr14.length];
                jArr5.getClass();
                int i59 = 0;
                boolean z15 = false;
                int i60 = 0;
                int i61 = 0;
                while (i59 < jArr14.length) {
                    int[] iArr12 = iArr10;
                    int[] iArr13 = iArr11;
                    long j29 = jArr5[i59];
                    if (j29 != -1) {
                        i28 = i59;
                        boolean z16 = z15;
                        long O5 = d0.O(jArr14[i59], oVar.c, oVar.d);
                        i27 = i56;
                        iArr12[i28] = d0.e(jArr13, j29, true);
                        iArr13[i28] = d0.b(jArr13, j29 + O5, z14);
                        while (true) {
                            i29 = iArr12[i28];
                            i30 = iArr13[i28];
                            if (i29 >= i30 || (iArr9[i29] & 1) != 0) {
                                break;
                            }
                            iArr12[i28] = i29 + 1;
                        }
                        int i62 = (i30 - i29) + i60;
                        z15 = z16 | (i61 != i29);
                        i61 = i30;
                        i60 = i62;
                    } else {
                        i27 = i56;
                        i28 = i59;
                    }
                    i59 = i28 + 1;
                    iArr10 = iArr12;
                    iArr11 = iArr13;
                    i56 = i27;
                }
                int i63 = i56;
                int[] iArr14 = iArr10;
                int[] iArr15 = iArr11;
                boolean z17 = z15 | (i60 != i55);
                long[] jArr16 = z17 ? new long[i60] : jArr3;
                int[] iArr16 = z17 ? new int[i60] : iArr8;
                int i64 = z17 ? 0 : i63;
                int[] iArr17 = z17 ? new int[i60] : iArr9;
                long[] jArr17 = new long[i60];
                int i65 = i64;
                long j30 = 0;
                int i66 = 0;
                int i67 = 0;
                while (i66 < jArr14.length) {
                    long j31 = jArr5[i66];
                    int i68 = iArr14[i66];
                    long[] jArr18 = jArr14;
                    int i69 = iArr15[i66];
                    int i70 = i65;
                    if (z17) {
                        int i71 = i69 - i68;
                        System.arraycopy(jArr3, i68, jArr16, i67, i71);
                        System.arraycopy(iArr8, i68, iArr16, i67, i71);
                        System.arraycopy(iArr9, i68, iArr17, i67, i71);
                    }
                    i65 = i70;
                    while (i68 < i69) {
                        long[] jArr19 = jArr3;
                        int[] iArr18 = iArr8;
                        long O6 = d0.O(j30, 1000000L, oVar.d);
                        long j32 = jArr13[i68] - j31;
                        long[] jArr20 = jArr13;
                        int[] iArr19 = iArr9;
                        long j33 = j16;
                        jArr17[i67] = O6 + d0.O(Math.max(j33, j32), 1000000L, oVar.c);
                        if (z17 && iArr16[i67] > i65) {
                            i65 = iArr18[i68];
                        }
                        i67++;
                        i68++;
                        j16 = j33;
                        jArr3 = jArr19;
                        iArr8 = iArr18;
                        iArr9 = iArr19;
                        jArr13 = jArr20;
                    }
                    j30 += jArr18[i66];
                    i66++;
                    jArr3 = jArr3;
                    iArr8 = iArr8;
                    iArr9 = iArr9;
                    jArr13 = jArr13;
                    jArr14 = jArr18;
                }
                return new r(oVar, jArr16, iArr16, i65, jArr17, iArr17, d0.O(j30, 1000000L, oVar.d));
            }
            wVar6 = null;
        } else {
            i11 = 0;
        }
        i12 = -1;
        a2 = dVar.a();
        i13 = oVar.b;
        d dVar22 = dVar;
        j10 = oVar.c;
        wVar = wVar7;
        long[] jArr52 = oVar.i;
        jArr = oVar.h;
        i14 = i11;
        String str2 = t0Var2.B;
        long j162 = 0;
        if (a2 == -1) {
        }
        long[] jArr112 = new long[b10];
        iArr = new int[b10];
        long[] jArr122 = new long[b10];
        int[] iArr72 = new int[b10];
        j11 = j10;
        w wVar82 = wVar6;
        int i452 = u12;
        i15 = i14;
        int i462 = u11;
        long j192 = 0;
        j12 = 0;
        int i472 = 0;
        i16 = 0;
        i17 = 0;
        jArr2 = jArr;
        t0Var = t0Var2;
        int i482 = i12;
        int i492 = 0;
        int i502 = i10;
        int i512 = u10;
        i18 = i13;
        i19 = 0;
        while (true) {
            if (i19 < b10) {
            }
            long j212 = j14 + iArr[i19];
            i16 = i24 - 1;
            i19++;
            j12 = j212;
            b10 = i25;
        }
        long j222 = j192 + i492;
        if (wVar != null) {
        }
        z11 = true;
        if (i15 == 0) {
        }
        StringBuilder sb22 = new StringBuilder("Inconsistent stbl box for track ");
        boolean z132 = z11;
        l1.w(sb22, oVar.a, ": remainingSynchronizationSamples ", i15, ", remainingSamplesAtTimestampDelta ");
        l1.w(sb22, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
        sb22.append(i20);
        sb22.append(", remainingSamplesAtTimestampOffset ");
        sb22.append(i17);
        sb22.append(z132 ? ", ctts invalid" : "");
        f5.a.K("AtomParsers", sb22.toString());
        jArr3 = jArr112;
        jArr4 = jArr122;
        iArr3 = iArr72;
        i23 = i472;
        j13 = j222;
        int[] iArr82 = iArr2;
        long O7 = d0.O(j13, 1000000L, oVar.c);
        if (jArr2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r11 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0d53, code lost:
    
        if (r29 == null) goto L637;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0e5d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0e62  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0e36  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0e3a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0e96 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:658:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(a aVar, o3.q qVar, long j10, n3.c cVar, boolean z10, boolean z11, p8.e eVar) {
        long j11;
        int i10;
        int i11;
        b f9;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        long[] jArr;
        long[] jArr2;
        p8.e eVar2;
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
        n3.c cVar2;
        int i18;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        List list;
        int i25;
        int i26;
        n3.c cVar3;
        float f10;
        byte[] bArr;
        int i27;
        byte[] bArr2;
        int i28;
        String str2;
        String str3;
        int i29;
        int[] iArr;
        int[] iArr2;
        int i30;
        int e10;
        int i31;
        int i32;
        int i33;
        n3.c cVar4;
        String str4;
        String str5;
        int i34;
        String str6;
        int i35;
        int i36;
        int i37;
        v0 v0Var;
        List list2;
        int i38;
        String str7;
        int i39;
        int i40;
        String str8;
        String str9;
        String str10;
        int i41;
        int i42;
        int i43;
        String str11;
        v0 v0Var2;
        String str12;
        String str13;
        int i44;
        List y8;
        String str14;
        int i45;
        n3.c a2;
        long j12;
        l0 l0Var;
        o oVar2;
        ArrayList arrayList4;
        a aVar3 = aVar;
        n3.c cVar5 = cVar;
        ArrayList arrayList5 = aVar3.e;
        ArrayList arrayList6 = new ArrayList();
        int i46 = 0;
        while (i46 < arrayList5.size()) {
            a aVar4 = (a) arrayList5.get(i46);
            if (aVar4.b != 1953653099) {
                arrayList = arrayList5;
                arrayList4 = arrayList6;
                i12 = i46;
            } else {
                b f11 = aVar3.f(1836476516);
                f11.getClass();
                a e11 = aVar4.e(1835297121);
                e11.getClass();
                b f12 = e11.f(1751411826);
                f12.getClass();
                w wVar = f12.c;
                wVar.C(16);
                int e12 = wVar.e();
                int i47 = e12 == 1936684398 ? 1 : e12 == 1986618469 ? 2 : (e12 == 1952807028 || e12 == 1935832172 || e12 == 1937072756 || e12 == 1668047728) ? 3 : e12 == 1835365473 ? 5 : -1;
                if (i47 == -1) {
                    eVar2 = eVar;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i12 = i46;
                } else {
                    b f13 = aVar4.f(1953196132);
                    f13.getClass();
                    w wVar2 = f13.c;
                    wVar2.C(8);
                    int b10 = nc.k.b(wVar2.e());
                    wVar2.D(b10 == 0 ? 8 : 16);
                    int e13 = wVar2.e();
                    wVar2.D(4);
                    int i48 = wVar2.b;
                    int i49 = b10 == 0 ? 4 : 8;
                    int i50 = 0;
                    while (true) {
                        if (i50 >= i49) {
                            wVar2.D(i49);
                            break;
                        }
                        if (wVar2.a[i48 + i50] != -1) {
                            j11 = b10 == 0 ? wVar2.s() : wVar2.v();
                        } else {
                            i50++;
                        }
                    }
                    wVar2.D(16);
                    int e14 = wVar2.e();
                    int e15 = wVar2.e();
                    wVar2.D(4);
                    int e16 = wVar2.e();
                    int e17 = wVar2.e();
                    if (e14 == 0 && e15 == 65536) {
                        i10 = -65536;
                        if (e16 == -65536 && e17 == 0) {
                            i11 = 90;
                            long j13 = j10 == -9223372036854775807L ? j11 : j10;
                            w wVar3 = f11.c;
                            wVar3.C(8);
                            wVar3.D(nc.k.b(wVar3.e()) == 0 ? 8 : 16);
                            long s10 = wVar3.s();
                            long O = j13 != -9223372036854775807L ? d0.O(j13, 1000000L, s10) : -9223372036854775807L;
                            a e18 = e11.e(1835626086);
                            e18.getClass();
                            a e19 = e18.e(1937007212);
                            e19.getClass();
                            b f14 = e11.f(1835296868);
                            f14.getClass();
                            w wVar4 = f14.c;
                            wVar4.C(8);
                            int b11 = nc.k.b(wVar4.e());
                            wVar4.D(b11 == 0 ? 8 : 16);
                            long s11 = wVar4.s();
                            wVar4.D(b11 == 0 ? 4 : 8);
                            int w10 = wVar4.w();
                            Pair create2 = Pair.create(Long.valueOf(s11), "" + ((char) (((w10 >> 10) & 31) + 96)) + ((char) (((w10 >> 5) & 31) + 96)) + ((char) ((w10 & 31) + 96)));
                            f9 = e19.f(1937011556);
                            if (f9 == null) {
                                throw t1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                            }
                            w wVar5 = f9.c;
                            String str15 = (String) create2.second;
                            wVar5.C(12);
                            int e20 = wVar5.e();
                            p[] pVarArr2 = new p[e20];
                            long j14 = O;
                            int i51 = 0;
                            t0 t0Var = null;
                            int i52 = 0;
                            int i53 = 0;
                            while (i51 < e20) {
                                int i54 = wVar5.b;
                                int e21 = wVar5.e();
                                ArrayList arrayList7 = arrayList5;
                                int i55 = e13;
                                String str16 = "childAtomSize must be positive";
                                h0.a("childAtomSize must be positive", e21 > 0);
                                int e22 = wVar5.e();
                                int i56 = i46;
                                if (e22 == 1635148593 || e22 == 1635148595 || e22 == 1701733238 || e22 == 1831958048 || e22 == 1836070006 || e22 == 1752589105 || e22 == 1751479857 || e22 == 1932670515 || e22 == 1211250227 || e22 == 1987063864 || e22 == 1987063865 || e22 == 1635135537 || e22 == 1685479798 || e22 == 1685479729 || e22 == 1685481573 || e22 == 1685481521) {
                                    int i57 = i11;
                                    arrayList3 = arrayList6;
                                    String str17 = "childAtomSize must be positive";
                                    aVar2 = aVar4;
                                    pair = create2;
                                    i13 = i47;
                                    i14 = e20;
                                    pVarArr = pVarArr2;
                                    i15 = i51;
                                    wVar5.C(i54 + 16);
                                    wVar5.D(16);
                                    int w11 = wVar5.w();
                                    int w12 = wVar5.w();
                                    wVar5.D(50);
                                    int i58 = wVar5.b;
                                    if (e22 == 1701733238) {
                                        i16 = i54;
                                        i17 = e21;
                                        Pair c3 = c(wVar5, i16, i17);
                                        if (c3 != null) {
                                            e22 = ((Integer) c3.first).intValue();
                                            cVar2 = cVar == null ? null : cVar.a(((p) c3.second).b);
                                            pVarArr[i15] = (p) c3.second;
                                        } else {
                                            cVar2 = cVar;
                                        }
                                        wVar5.C(i58);
                                    } else {
                                        i16 = i54;
                                        i17 = e21;
                                        cVar2 = cVar;
                                    }
                                    int i59 = i58;
                                    i18 = i16;
                                    str = str15;
                                    String str18 = e22 == 1831958048 ? "video/mpeg" : e22 == 1211250227 ? "video/3gpp" : null;
                                    int i60 = i53;
                                    List list3 = null;
                                    int i61 = -1;
                                    int i62 = -1;
                                    float f15 = 1.0f;
                                    String str19 = null;
                                    byte[] bArr3 = null;
                                    ByteBuffer byteBuffer = null;
                                    boolean z12 = false;
                                    v0 v0Var3 = null;
                                    int i63 = -1;
                                    int i64 = -1;
                                    while (true) {
                                        if (i59 - i18 >= i17) {
                                            i19 = i62;
                                            break;
                                        }
                                        wVar5.C(i59);
                                        int i65 = wVar5.b;
                                        int i66 = i59;
                                        int e23 = wVar5.e();
                                        i19 = i62;
                                        if (e23 == 0 && wVar5.b - i18 == i17) {
                                            break;
                                        }
                                        h0.a(str17, e23 > 0);
                                        int e24 = wVar5.e();
                                        String str20 = str17;
                                        if (e24 == 1635148611) {
                                            h0.a(null, str18 == null);
                                            wVar5.C(i65 + 8);
                                            g5.a a10 = g5.a.a(wVar5);
                                            list3 = a10.a;
                                            i28 = a10.b;
                                            if (!z12) {
                                                f15 = a10.e;
                                            }
                                            str2 = a10.f;
                                            str3 = MediaController.VIDEO_MIME_TYPE;
                                        } else if (e24 == 1752589123) {
                                            h0.a(null, str18 == null);
                                            wVar5.C(i65 + 8);
                                            g5.f a11 = g5.f.a(wVar5);
                                            list3 = a11.a;
                                            i28 = a11.b;
                                            if (!z12) {
                                                f15 = a11.c;
                                            }
                                            str2 = a11.d;
                                            str3 = "video/hevc";
                                        } else {
                                            if (e24 == 1685480259 || e24 == 1685485123) {
                                                i24 = e22;
                                                list = list3;
                                                i25 = i61;
                                                i26 = i17;
                                                cVar3 = cVar2;
                                                f10 = f15;
                                                bArr = bArr3;
                                                g5.c d = g5.c.d(wVar5);
                                                if (d != null) {
                                                    str19 = d.a;
                                                    str18 = "video/dolby-vision";
                                                }
                                            } else {
                                                if (e24 == 1987076931) {
                                                    h0.a(null, str18 == null);
                                                    i24 = e22;
                                                    i26 = i17;
                                                    str18 = e22 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                } else {
                                                    if (e24 == 1635135811) {
                                                        h0.a(null, str18 == null);
                                                        str18 = "video/av01";
                                                    } else if (e24 == 1668050025) {
                                                        ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        order.position(21);
                                                        order.putShort(wVar5.o());
                                                        order.putShort(wVar5.o());
                                                        byteBuffer = order;
                                                    } else {
                                                        if (e24 == 1835295606) {
                                                            ByteBuffer order2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                            short o10 = wVar5.o();
                                                            short o11 = wVar5.o();
                                                            i24 = e22;
                                                            short o12 = wVar5.o();
                                                            i26 = i17;
                                                            short o13 = wVar5.o();
                                                            cVar3 = cVar2;
                                                            short o14 = wVar5.o();
                                                            list = list3;
                                                            short o15 = wVar5.o();
                                                            i25 = i61;
                                                            short o16 = wVar5.o();
                                                            bArr = bArr3;
                                                            short o17 = wVar5.o();
                                                            long s12 = wVar5.s();
                                                            long s13 = wVar5.s();
                                                            f10 = f15;
                                                            order2.position(1);
                                                            order2.putShort(o14);
                                                            order2.putShort(o15);
                                                            order2.putShort(o10);
                                                            order2.putShort(o11);
                                                            order2.putShort(o12);
                                                            order2.putShort(o13);
                                                            order2.putShort(o16);
                                                            order2.putShort(o17);
                                                            order2.putShort((short) (s12 / 10000));
                                                            order2.putShort((short) (s13 / 10000));
                                                            byteBuffer = order2;
                                                        } else {
                                                            i24 = e22;
                                                            list = list3;
                                                            i25 = i61;
                                                            i26 = i17;
                                                            cVar3 = cVar2;
                                                            f10 = f15;
                                                            bArr = bArr3;
                                                            if (e24 == 1681012275) {
                                                                h0.a(null, str18 == null);
                                                                str18 = "video/3gpp";
                                                            } else {
                                                                if (e24 == 1702061171) {
                                                                    h0.a(null, str18 == null);
                                                                    v0 a12 = a(i65, wVar5);
                                                                    String str21 = (String) a12.c;
                                                                    byte[] bArr4 = (byte[]) a12.d;
                                                                    if (bArr4 != null) {
                                                                        list = z.y(bArr4);
                                                                    }
                                                                    v0Var3 = a12;
                                                                    str18 = str21;
                                                                    list3 = list;
                                                                    i61 = i25;
                                                                    bArr3 = bArr;
                                                                } else if (e24 == 1885434736) {
                                                                    wVar5.C(i65 + 8);
                                                                    f10 = wVar5.u() / wVar5.u();
                                                                    list3 = list;
                                                                    i61 = i25;
                                                                    bArr3 = bArr;
                                                                    z12 = true;
                                                                    i59 = i66 + e23;
                                                                    i62 = i19;
                                                                    str17 = str20;
                                                                    e22 = i24;
                                                                    i17 = i26;
                                                                    cVar2 = cVar3;
                                                                    f15 = f10;
                                                                } else if (e24 == 1937126244) {
                                                                    int i67 = i65 + 8;
                                                                    while (true) {
                                                                        if (i67 - i65 >= e23) {
                                                                            bArr2 = null;
                                                                            break;
                                                                        }
                                                                        wVar5.C(i67);
                                                                        int e25 = wVar5.e();
                                                                        if (wVar5.e() == 1886547818) {
                                                                            bArr2 = Arrays.copyOfRange(wVar5.a, i67, e25 + i67);
                                                                            break;
                                                                        }
                                                                        i67 += e25;
                                                                    }
                                                                    bArr3 = bArr2;
                                                                    list3 = list;
                                                                    i61 = i25;
                                                                } else if (e24 == 1936995172) {
                                                                    int r6 = wVar5.r();
                                                                    wVar5.D(3);
                                                                    if (r6 == 0) {
                                                                        int r9 = wVar5.r();
                                                                        if (r9 == 0) {
                                                                            i25 = 0;
                                                                        } else if (r9 == 1) {
                                                                            i25 = 1;
                                                                        } else if (r9 == 2) {
                                                                            i25 = 2;
                                                                        } else if (r9 == 3) {
                                                                            i25 = 3;
                                                                        }
                                                                    }
                                                                    list3 = list;
                                                                    i61 = i25;
                                                                    bArr3 = bArr;
                                                                    i59 = i66 + e23;
                                                                    i62 = i19;
                                                                    str17 = str20;
                                                                    e22 = i24;
                                                                    i17 = i26;
                                                                    cVar2 = cVar3;
                                                                    f15 = f10;
                                                                } else if (e24 == 1668246642) {
                                                                    int e26 = wVar5.e();
                                                                    if (e26 == 1852009592 || e26 == 1852009571) {
                                                                        int w13 = wVar5.w();
                                                                        int w14 = wVar5.w();
                                                                        wVar5.D(2);
                                                                        boolean z13 = e23 == 19 && (wVar5.r() & 128) != 0;
                                                                        int a13 = g5.b.a(w13);
                                                                        int i68 = z13 ? 1 : 2;
                                                                        if (w14 != 1) {
                                                                            if (w14 == 16) {
                                                                                i27 = 6;
                                                                            } else if (w14 == 18) {
                                                                                i27 = 7;
                                                                            } else if (w14 != 6 && w14 != 7) {
                                                                                i27 = -1;
                                                                            }
                                                                            i19 = a13;
                                                                            i63 = i27;
                                                                            i64 = i68;
                                                                        }
                                                                        i27 = 3;
                                                                        i19 = a13;
                                                                        i63 = i27;
                                                                        i64 = i68;
                                                                    } else {
                                                                        f5.a.K("AtomParsers", "Unsupported color type: " + nc.k.a(e26));
                                                                    }
                                                                }
                                                                i59 = i66 + e23;
                                                                i62 = i19;
                                                                str17 = str20;
                                                                e22 = i24;
                                                                i17 = i26;
                                                                cVar2 = cVar3;
                                                                f15 = f10;
                                                            }
                                                        }
                                                        list3 = list;
                                                        i61 = i25;
                                                        bArr3 = bArr;
                                                        i59 = i66 + e23;
                                                        i62 = i19;
                                                        str17 = str20;
                                                        e22 = i24;
                                                        i17 = i26;
                                                        cVar2 = cVar3;
                                                        f15 = f10;
                                                    }
                                                    i24 = e22;
                                                    i26 = i17;
                                                }
                                                cVar3 = cVar2;
                                                f10 = f15;
                                                i59 = i66 + e23;
                                                i62 = i19;
                                                str17 = str20;
                                                e22 = i24;
                                                i17 = i26;
                                                cVar2 = cVar3;
                                                f15 = f10;
                                            }
                                            list3 = list;
                                            i61 = i25;
                                            bArr3 = bArr;
                                            i59 = i66 + e23;
                                            i62 = i19;
                                            str17 = str20;
                                            e22 = i24;
                                            i17 = i26;
                                            cVar2 = cVar3;
                                            f15 = f10;
                                        }
                                        str19 = str2;
                                        i24 = e22;
                                        i26 = i17;
                                        i60 = i28;
                                        str18 = str3;
                                        cVar3 = cVar2;
                                        f10 = f15;
                                        i59 = i66 + e23;
                                        i62 = i19;
                                        str17 = str20;
                                        e22 = i24;
                                        i17 = i26;
                                        cVar2 = cVar3;
                                        f15 = f10;
                                    }
                                    List list4 = list3;
                                    int i69 = i61;
                                    i20 = i17;
                                    n3.c cVar6 = cVar2;
                                    float f16 = f15;
                                    byte[] bArr5 = bArr3;
                                    if (str18 == null) {
                                        i21 = i57;
                                    } else {
                                        s0 s0Var = new s0();
                                        s0Var.a = Integer.toString(i55);
                                        s0Var.o = str18;
                                        s0Var.h = str19;
                                        s0Var.t = w11;
                                        s0Var.u = w12;
                                        s0Var.x = f16;
                                        i21 = i57;
                                        s0Var.w = i21;
                                        s0Var.y = bArr5;
                                        s0Var.z = i69;
                                        s0Var.q = list4;
                                        s0Var.r = cVar6;
                                        int i70 = i19;
                                        if (i70 == -1) {
                                            i23 = i64;
                                            i22 = i63;
                                            if (i23 == -1) {
                                                if (i22 == -1) {
                                                }
                                            }
                                        } else {
                                            i22 = i63;
                                            i23 = i64;
                                        }
                                        s0Var.A = new g5.b(i70, i23, i22, byteBuffer != null ? byteBuffer.array() : null);
                                        if (v0Var3 != null) {
                                            v0 v0Var4 = v0Var3;
                                            s0Var.f = p7.d(v0Var4.a);
                                            s0Var.g = p7.d(v0Var4.b);
                                        }
                                        t0Var = new t0(s0Var);
                                    }
                                    i53 = i60;
                                } else {
                                    i13 = i47;
                                    if (e22 == 1836069985 || e22 == 1701733217 || e22 == 1633889587 || e22 == 1700998451 || e22 == 1633889588 || e22 == 1835823201 || e22 == 1685353315 || e22 == 1685353317 || e22 == 1685353320 || e22 == 1685353324 || e22 == 1685353336 || e22 == 1935764850 || e22 == 1935767394 || e22 == 1819304813 || e22 == 1936684916 || e22 == 1953984371 || e22 == 778924082 || e22 == 778924083 || e22 == 1835557169 || e22 == 1835560241 || e22 == 1634492771 || e22 == 1634492791 || e22 == 1970037111 || e22 == 1332770163 || e22 == 1716281667) {
                                        i14 = e20;
                                        pVarArr = pVarArr2;
                                        int[] iArr3 = l3.b.f;
                                        int[] iArr4 = l3.b.d;
                                        wVar5.C(i54 + 16);
                                        if (z11) {
                                            i29 = wVar5.w();
                                            wVar5.D(6);
                                        } else {
                                            wVar5.D(8);
                                            i29 = 0;
                                        }
                                        if (i29 == 0 || i29 == 1) {
                                            iArr = iArr4;
                                            int w15 = wVar5.w();
                                            wVar5.D(6);
                                            byte[] bArr6 = wVar5.a;
                                            iArr2 = iArr3;
                                            int i71 = wVar5.b;
                                            int i72 = i71 + 1;
                                            wVar5.b = i72;
                                            int i73 = (bArr6[i71] & 255) << 8;
                                            wVar5.b = i71 + 2;
                                            i30 = i73 | (bArr6[i72] & 255);
                                            wVar5.b = i71 + 4;
                                            wVar5.C(i71);
                                            e10 = wVar5.e();
                                            if (i29 == 1) {
                                                wVar5.D(16);
                                            }
                                            i31 = w15;
                                        } else if (i29 == 2) {
                                            wVar5.D(16);
                                            iArr = iArr4;
                                            i30 = (int) Math.round(Double.longBitsToDouble(wVar5.l()));
                                            i31 = wVar5.u();
                                            wVar5.D(20);
                                            iArr2 = iArr3;
                                            e10 = 0;
                                        } else {
                                            i33 = i11;
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            i15 = i51;
                                            i18 = i54;
                                            i32 = e21;
                                            str = str15;
                                            i21 = i33;
                                            i20 = i32;
                                        }
                                        int i74 = wVar5.b;
                                        int i75 = i31;
                                        if (e22 == 1701733217) {
                                            Pair c6 = c(wVar5, i54, e21);
                                            if (c6 != null) {
                                                int intValue = ((Integer) c6.first).intValue();
                                                if (cVar5 == null) {
                                                    i45 = intValue;
                                                    a2 = null;
                                                } else {
                                                    i45 = intValue;
                                                    a2 = cVar5.a(((p) c6.second).b);
                                                }
                                                pVarArr[i51] = (p) c6.second;
                                                cVar4 = a2;
                                                e22 = i45;
                                            } else {
                                                cVar4 = cVar5;
                                            }
                                            wVar5.C(i74);
                                        } else {
                                            cVar4 = cVar5;
                                        }
                                        int i76 = i30;
                                        String str22 = "audio/ac3";
                                        i15 = i51;
                                        if (e22 == 1633889587) {
                                            str5 = "audio/ac3";
                                        } else if (e22 == 1700998451) {
                                            str5 = "audio/eac3";
                                        } else if (e22 == 1633889588) {
                                            str5 = "audio/ac4";
                                        } else {
                                            if (e22 == 1685353315) {
                                                str4 = "audio/vnd.dts";
                                            } else if (e22 == 1685353320 || e22 == 1685353324) {
                                                str4 = "audio/vnd.dts.hd";
                                            } else if (e22 == 1685353317) {
                                                str4 = "audio/vnd.dts.hd;profile=lbr";
                                            } else if (e22 == 1685353336) {
                                                str4 = "audio/vnd.dts.uhd;profile=p2";
                                            } else if (e22 == 1935764850) {
                                                str4 = "audio/3gpp";
                                            } else if (e22 == 1935767394) {
                                                str4 = "audio/amr-wb";
                                            } else {
                                                str5 = "audio/raw";
                                                if (e22 == 1819304813 || e22 == 1936684916) {
                                                    i34 = 2;
                                                } else if (e22 == 1953984371) {
                                                    i34 = TLObject.FLAG_28;
                                                } else if (e22 == 778924082 || e22 == 778924083) {
                                                    str4 = "audio/mpeg";
                                                } else if (e22 == 1835557169) {
                                                    str4 = "audio/mha1";
                                                } else if (e22 == 1835560241) {
                                                    str4 = "audio/mhm1";
                                                } else if (e22 == 1634492771) {
                                                    str4 = "audio/alac";
                                                } else if (e22 == 1634492791) {
                                                    str4 = "audio/g711-alaw";
                                                } else if (e22 == 1970037111) {
                                                    str4 = "audio/g711-mlaw";
                                                } else if (e22 == 1332770163) {
                                                    str4 = "audio/opus";
                                                } else if (e22 == 1716281667) {
                                                    str4 = "audio/flac";
                                                } else if (e22 == 1835823201) {
                                                    str4 = "audio/true-hd";
                                                } else {
                                                    i34 = -1;
                                                    str5 = null;
                                                }
                                                i33 = i11;
                                                arrayList3 = arrayList6;
                                                aVar2 = aVar4;
                                                pair = create2;
                                                i18 = i54;
                                                str6 = str5;
                                                i35 = i76;
                                                i36 = i75;
                                                i37 = i74;
                                                List list5 = null;
                                                String str23 = null;
                                                v0Var = null;
                                                while (i37 - i18 < e21) {
                                                    wVar5.C(i37);
                                                    int e27 = wVar5.e();
                                                    int i77 = e21;
                                                    h0.a(str16, e27 > 0);
                                                    int e28 = wVar5.e();
                                                    List list6 = list5;
                                                    if (e28 == 1835557187) {
                                                        int i78 = e27 - 13;
                                                        byte[] bArr7 = new byte[i78];
                                                        i39 = i34;
                                                        wVar5.C(i37 + 13);
                                                        wVar5.c(0, i78, bArr7);
                                                        list6 = z.y(bArr7);
                                                        str11 = str16;
                                                        str10 = str22;
                                                        i43 = e27;
                                                    } else {
                                                        i39 = i34;
                                                        if (e28 == 1702061171) {
                                                            i40 = e27;
                                                            str8 = str16;
                                                            str9 = str23;
                                                            str10 = str22;
                                                            i41 = 1702061171;
                                                        } else if (z11 && e28 == 2002876005) {
                                                            i40 = e27;
                                                            str8 = str16;
                                                            str9 = str23;
                                                            str10 = str22;
                                                            i41 = 1702061171;
                                                        } else {
                                                            if (e28 == 1684103987) {
                                                                wVar5.C(i37 + 8);
                                                                String num = Integer.toString(i55);
                                                                v vVar = new v();
                                                                vVar.o(wVar5);
                                                                int i79 = iArr[vVar.i(2)];
                                                                str13 = str23;
                                                                vVar.s(8);
                                                                int i80 = iArr2[vVar.i(3)];
                                                                int i81 = vVar.i(1) != 0 ? i80 + 1 : i80;
                                                                str12 = str16;
                                                                int i82 = l3.b.g[vVar.i(5)] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                vVar.c();
                                                                wVar5.C(vVar.f());
                                                                s0 s0Var2 = new s0();
                                                                s0Var2.a = num;
                                                                s0Var2.o = str22;
                                                                s0Var2.B = i81;
                                                                s0Var2.C = i79;
                                                                s0Var2.r = cVar4;
                                                                s0Var2.c = str15;
                                                                s0Var2.f = i82;
                                                                s0Var2.g = i82;
                                                                t0Var = new t0(s0Var2);
                                                                i44 = e27;
                                                                str10 = str22;
                                                            } else {
                                                                str12 = str16;
                                                                str13 = str23;
                                                                if (e28 == 1684366131) {
                                                                    wVar5.C(i37 + 8);
                                                                    String num2 = Integer.toString(i55);
                                                                    v vVar2 = new v();
                                                                    vVar2.o(wVar5);
                                                                    int i83 = vVar2.i(13) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                    vVar2.s(3);
                                                                    int i84 = iArr[vVar2.i(2)];
                                                                    str10 = str22;
                                                                    vVar2.s(10);
                                                                    int i85 = iArr2[vVar2.i(3)];
                                                                    if (vVar2.i(1) != 0) {
                                                                        i85++;
                                                                    }
                                                                    vVar2.s(3);
                                                                    int i86 = vVar2.i(4);
                                                                    vVar2.s(1);
                                                                    int i87 = i85;
                                                                    if (i86 > 0) {
                                                                        vVar2.t(6);
                                                                        i85 = vVar2.i(1) != 0 ? i87 + 2 : i87;
                                                                        vVar2.s(1);
                                                                    }
                                                                    i44 = e27;
                                                                    if (vVar2.b() > 7) {
                                                                        vVar2.s(7);
                                                                        if (vVar2.i(1) != 0) {
                                                                            str14 = "audio/eac3-joc";
                                                                            vVar2.c();
                                                                            wVar5.C(vVar2.f());
                                                                            s0 s0Var3 = new s0();
                                                                            s0Var3.a = num2;
                                                                            s0Var3.o = str14;
                                                                            s0Var3.B = i85;
                                                                            s0Var3.C = i84;
                                                                            s0Var3.r = cVar4;
                                                                            s0Var3.c = str15;
                                                                            s0Var3.g = i83;
                                                                            t0Var = new t0(s0Var3);
                                                                        }
                                                                    }
                                                                    str14 = "audio/eac3";
                                                                    vVar2.c();
                                                                    wVar5.C(vVar2.f());
                                                                    s0 s0Var32 = new s0();
                                                                    s0Var32.a = num2;
                                                                    s0Var32.o = str14;
                                                                    s0Var32.B = i85;
                                                                    s0Var32.C = i84;
                                                                    s0Var32.r = cVar4;
                                                                    s0Var32.c = str15;
                                                                    s0Var32.g = i83;
                                                                    t0Var = new t0(s0Var32);
                                                                } else {
                                                                    i44 = e27;
                                                                    str10 = str22;
                                                                    if (e28 == 1684103988) {
                                                                        wVar5.C(i37 + 8);
                                                                        String num3 = Integer.toString(i55);
                                                                        wVar5.D(1);
                                                                        int i88 = ((wVar5.r() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                        s0 s0Var4 = new s0();
                                                                        s0Var4.a = num3;
                                                                        s0Var4.o = "audio/ac4";
                                                                        s0Var4.B = 2;
                                                                        s0Var4.C = i88;
                                                                        s0Var4.r = cVar4;
                                                                        s0Var4.c = str15;
                                                                        t0Var = new t0(s0Var4);
                                                                    } else if (e28 == 1684892784) {
                                                                        if (e10 <= 0) {
                                                                            throw t1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + e10, null);
                                                                        }
                                                                        i35 = e10;
                                                                        str23 = str13;
                                                                        str11 = str12;
                                                                        i43 = i44;
                                                                        i36 = 2;
                                                                    } else if (e28 == 1684305011) {
                                                                        s0 s0Var5 = new s0();
                                                                        s0Var5.a = Integer.toString(i55);
                                                                        s0Var5.o = str6;
                                                                        s0Var5.B = i36;
                                                                        s0Var5.C = i35;
                                                                        s0Var5.r = cVar4;
                                                                        s0Var5.c = str15;
                                                                        t0Var = new t0(s0Var5);
                                                                    } else {
                                                                        if (e28 == 1682927731) {
                                                                            int i89 = i44 - 8;
                                                                            byte[] bArr8 = a;
                                                                            byte[] copyOf = Arrays.copyOf(bArr8, bArr8.length + i89);
                                                                            wVar5.C(i37 + 8);
                                                                            wVar5.c(bArr8.length, i89, copyOf);
                                                                            y8 = l3.b.a(copyOf);
                                                                        } else if (e28 == 1684425825) {
                                                                            byte[] bArr9 = new byte[i44 - 8];
                                                                            bArr9[0] = 102;
                                                                            bArr9[1] = 76;
                                                                            bArr9[2] = 97;
                                                                            bArr9[3] = 67;
                                                                            wVar5.C(i37 + 12);
                                                                            wVar5.c(4, i44 - 12, bArr9);
                                                                            y8 = z.y(bArr9);
                                                                        } else {
                                                                            if (e28 == 1634492771) {
                                                                                int i90 = i44 - 12;
                                                                                byte[] bArr10 = new byte[i90];
                                                                                wVar5.C(i37 + 12);
                                                                                wVar5.c(0, i90, bArr10);
                                                                                w wVar6 = new w(bArr10);
                                                                                wVar6.C(9);
                                                                                int r10 = wVar6.r();
                                                                                wVar6.C(20);
                                                                                Pair create3 = Pair.create(Integer.valueOf(wVar6.u()), Integer.valueOf(r10));
                                                                                int intValue2 = ((Integer) create3.first).intValue();
                                                                                i36 = ((Integer) create3.second).intValue();
                                                                                list6 = z.y(bArr10);
                                                                                i35 = intValue2;
                                                                                str23 = str13;
                                                                                str11 = str12;
                                                                                i43 = i44;
                                                                            }
                                                                            str23 = str13;
                                                                            str11 = str12;
                                                                            i43 = i44;
                                                                        }
                                                                        list6 = y8;
                                                                        str23 = str13;
                                                                        str11 = str12;
                                                                        i43 = i44;
                                                                    }
                                                                    str23 = str13;
                                                                    str11 = str12;
                                                                    i43 = i44;
                                                                }
                                                            }
                                                            str23 = str13;
                                                            str11 = str12;
                                                            i43 = i44;
                                                        }
                                                        if (e28 != i41) {
                                                            i42 = wVar5.b;
                                                            h0.a(null, i42 >= i37);
                                                            while (true) {
                                                                i43 = i40;
                                                                if (i42 - i37 >= i43) {
                                                                    str11 = str8;
                                                                    i42 = -1;
                                                                    break;
                                                                }
                                                                wVar5.C(i42);
                                                                int e29 = wVar5.e();
                                                                str11 = str8;
                                                                h0.a(str11, e29 > 0);
                                                                if (wVar5.e() == 1702061171) {
                                                                    break;
                                                                }
                                                                i42 += e29;
                                                                str8 = str11;
                                                                i40 = i43;
                                                            }
                                                        } else {
                                                            i42 = i37;
                                                            str11 = str8;
                                                            i43 = i40;
                                                        }
                                                        if (i42 != -1) {
                                                            v0Var2 = a(i42, wVar5);
                                                            str6 = (String) v0Var2.c;
                                                            byte[] bArr11 = (byte[]) v0Var2.d;
                                                            if (bArr11 != null) {
                                                                if (MediaController.AUDIO_MIME_TYPE.equals(str6)) {
                                                                    l3.a h = l3.b.h(new v(bArr11, bArr11.length), false);
                                                                    i35 = h.a;
                                                                    i36 = h.b;
                                                                    str23 = h.c;
                                                                } else {
                                                                    str23 = str9;
                                                                }
                                                                list6 = z.y(bArr11);
                                                                v0Var = v0Var2;
                                                            }
                                                        } else {
                                                            v0Var2 = v0Var;
                                                        }
                                                        str23 = str9;
                                                        v0Var = v0Var2;
                                                    }
                                                    i37 += i43;
                                                    str16 = str11;
                                                    list5 = list6;
                                                    i34 = i39;
                                                    e21 = i77;
                                                    str22 = str10;
                                                }
                                                list2 = list5;
                                                i38 = i34;
                                                str7 = str23;
                                                i32 = e21;
                                                if (t0Var == null && str6 != null) {
                                                    s0 s0Var6 = new s0();
                                                    s0Var6.a = Integer.toString(i55);
                                                    s0Var6.o = str6;
                                                    s0Var6.h = str7;
                                                    s0Var6.B = i36;
                                                    s0Var6.C = i35;
                                                    s0Var6.D = i38;
                                                    s0Var6.q = list2;
                                                    s0Var6.r = cVar4;
                                                    s0Var6.c = str15;
                                                    if (v0Var != null) {
                                                        v0 v0Var5 = v0Var;
                                                        s0Var6.f = p7.d(v0Var5.a);
                                                        s0Var6.g = p7.d(v0Var5.b);
                                                    }
                                                    t0Var = new t0(s0Var6);
                                                }
                                                str = str15;
                                                i21 = i33;
                                                i20 = i32;
                                            }
                                            str5 = str4;
                                        }
                                        i34 = -1;
                                        i33 = i11;
                                        arrayList3 = arrayList6;
                                        aVar2 = aVar4;
                                        pair = create2;
                                        i18 = i54;
                                        str6 = str5;
                                        i35 = i76;
                                        i36 = i75;
                                        i37 = i74;
                                        List list52 = null;
                                        String str232 = null;
                                        v0Var = null;
                                        while (i37 - i18 < e21) {
                                        }
                                        list2 = list52;
                                        i38 = i34;
                                        str7 = str232;
                                        i32 = e21;
                                        if (t0Var == null) {
                                            s0 s0Var62 = new s0();
                                            s0Var62.a = Integer.toString(i55);
                                            s0Var62.o = str6;
                                            s0Var62.h = str7;
                                            s0Var62.B = i36;
                                            s0Var62.C = i35;
                                            s0Var62.D = i38;
                                            s0Var62.q = list2;
                                            s0Var62.r = cVar4;
                                            s0Var62.c = str15;
                                            if (v0Var != null) {
                                            }
                                            t0Var = new t0(s0Var62);
                                        }
                                        str = str15;
                                        i21 = i33;
                                        i20 = i32;
                                    } else {
                                        if (e22 == 1414810956 || e22 == 1954034535 || e22 == 2004251764 || e22 == 1937010800 || e22 == 1664495672) {
                                            wVar5.C(i54 + 16);
                                            String str24 = "application/ttml+xml";
                                            if (e22 != 1414810956) {
                                                if (e22 == 1954034535) {
                                                    int i91 = e21 - 16;
                                                    byte[] bArr12 = new byte[i91];
                                                    wVar5.c(0, i91, bArr12);
                                                    l0Var = z.y(bArr12);
                                                    str24 = "application/x-quicktime-tx3g";
                                                    i14 = e20;
                                                    j12 = Long.MAX_VALUE;
                                                } else if (e22 == 2004251764) {
                                                    str24 = "application/x-mp4-vtt";
                                                } else if (e22 == 1937010800) {
                                                    i14 = e20;
                                                    l0Var = null;
                                                    j12 = 0;
                                                } else {
                                                    if (e22 != 1664495672) {
                                                        throw new IllegalStateException();
                                                    }
                                                    str24 = "application/x-mp4-cea-608";
                                                    i14 = e20;
                                                    j12 = Long.MAX_VALUE;
                                                    l0Var = null;
                                                    i52 = 1;
                                                }
                                                s0 s0Var7 = new s0();
                                                pVarArr = pVarArr2;
                                                s0Var7.a = Integer.toString(i55);
                                                s0Var7.o = str24;
                                                s0Var7.c = str15;
                                                s0Var7.s = j12;
                                                s0Var7.q = l0Var;
                                                i21 = i11;
                                                t0Var = new t0(s0Var7);
                                                arrayList3 = arrayList6;
                                                aVar2 = aVar4;
                                                pair = create2;
                                                str = str15;
                                            }
                                            i14 = e20;
                                            j12 = Long.MAX_VALUE;
                                            l0Var = null;
                                            s0 s0Var72 = new s0();
                                            pVarArr = pVarArr2;
                                            s0Var72.a = Integer.toString(i55);
                                            s0Var72.o = str24;
                                            s0Var72.c = str15;
                                            s0Var72.s = j12;
                                            s0Var72.q = l0Var;
                                            i21 = i11;
                                            t0Var = new t0(s0Var72);
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            str = str15;
                                        } else {
                                            if (e22 == 1835365492) {
                                                wVar5.C(i54 + 16);
                                                if (e22 == 1835365492) {
                                                    wVar5.m();
                                                    String m10 = wVar5.m();
                                                    if (m10 != null) {
                                                        s0 s0Var8 = new s0();
                                                        s0Var8.a = Integer.toString(i55);
                                                        s0Var8.o = m10;
                                                        t0Var = new t0(s0Var8);
                                                    }
                                                }
                                            } else if (e22 == 1667329389) {
                                                s0 s0Var9 = new s0();
                                                s0Var9.a = Integer.toString(i55);
                                                s0Var9.o = "application/x-camera-motion";
                                                i21 = i11;
                                                arrayList3 = arrayList6;
                                                t0Var = new t0(s0Var9);
                                                aVar2 = aVar4;
                                                pair = create2;
                                                str = str15;
                                                i14 = e20;
                                                pVarArr = pVarArr2;
                                            }
                                            i21 = i11;
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            str = str15;
                                            i14 = e20;
                                            pVarArr = pVarArr2;
                                        }
                                        i15 = i51;
                                        i18 = i54;
                                        i20 = e21;
                                    }
                                }
                                wVar5.C(i18 + i20);
                                i51 = i15 + 1;
                                i11 = i21;
                                arrayList5 = arrayList7;
                                e13 = i55;
                                i46 = i56;
                                e20 = i14;
                                str15 = str;
                                arrayList6 = arrayList3;
                                create2 = pair;
                                aVar4 = aVar2;
                                i47 = i13;
                                pVarArr2 = pVarArr;
                                cVar5 = cVar;
                            }
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            int i92 = e13;
                            i12 = i46;
                            a aVar5 = aVar4;
                            Pair pair2 = create2;
                            int i93 = i47;
                            p[] pVarArr3 = pVarArr2;
                            if (z10) {
                                aVar4 = aVar5;
                            } else {
                                aVar4 = aVar5;
                                a e30 = aVar4.e(1701082227);
                                if (e30 != null) {
                                    b f17 = e30.f(1701606260);
                                    if (f17 == null) {
                                        create = null;
                                    } else {
                                        w wVar7 = f17.c;
                                        wVar7.C(8);
                                        int b12 = nc.k.b(wVar7.e());
                                        int u10 = wVar7.u();
                                        long[] jArr3 = new long[u10];
                                        long[] jArr4 = new long[u10];
                                        for (int i94 = 0; i94 < u10; i94++) {
                                            jArr3[i94] = b12 == 1 ? wVar7.v() : wVar7.s();
                                            jArr4[i94] = b12 == 1 ? wVar7.l() : wVar7.e();
                                            if (wVar7.o() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            wVar7.D(2);
                                        }
                                        create = Pair.create(jArr3, jArr4);
                                    }
                                    if (create != null) {
                                        jArr = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        if (t0Var != null) {
                                            eVar2 = eVar;
                                        } else {
                                            eVar2 = eVar;
                                            oVar = new o(i92, i93, ((Long) pair2.first).longValue(), s10, j14, t0Var, i52, pVarArr3, i53, jArr, jArr2);
                                            oVar2 = (o) eVar2.apply(oVar);
                                            if (oVar2 != null) {
                                                arrayList4 = arrayList2;
                                            } else {
                                                a e31 = aVar4.e(1835297121);
                                                e31.getClass();
                                                a e32 = e31.e(1835626086);
                                                e32.getClass();
                                                a e33 = e32.e(1937007212);
                                                e33.getClass();
                                                r d10 = d(oVar2, e33, qVar);
                                                arrayList4 = arrayList2;
                                                arrayList4.add(d10);
                                            }
                                        }
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (t0Var != null) {
                            }
                        }
                    } else {
                        i10 = -65536;
                    }
                    if (e14 == 0 && e15 == i10) {
                        if (e16 == 65536 && e17 == 0) {
                            i11 = 270;
                            if (j10 == -9223372036854775807L) {
                            }
                            w wVar32 = f11.c;
                            wVar32.C(8);
                            wVar32.D(nc.k.b(wVar32.e()) == 0 ? 8 : 16);
                            long s102 = wVar32.s();
                            if (j13 != -9223372036854775807L) {
                            }
                            a e182 = e11.e(1835626086);
                            e182.getClass();
                            a e192 = e182.e(1937007212);
                            e192.getClass();
                            b f142 = e11.f(1835296868);
                            f142.getClass();
                            w wVar42 = f142.c;
                            wVar42.C(8);
                            int b112 = nc.k.b(wVar42.e());
                            wVar42.D(b112 == 0 ? 8 : 16);
                            long s112 = wVar42.s();
                            wVar42.D(b112 == 0 ? 4 : 8);
                            int w102 = wVar42.w();
                            Pair create22 = Pair.create(Long.valueOf(s112), "" + ((char) (((w102 >> 10) & 31) + 96)) + ((char) (((w102 >> 5) & 31) + 96)) + ((char) ((w102 & 31) + 96)));
                            f9 = e192.f(1937011556);
                            if (f9 == null) {
                            }
                        } else {
                            i10 = -65536;
                        }
                    }
                    i11 = (e14 == i10 && e15 == 0 && e16 == 0 && e17 == i10) ? 180 : 0;
                    if (j10 == -9223372036854775807L) {
                    }
                    w wVar322 = f11.c;
                    wVar322.C(8);
                    wVar322.D(nc.k.b(wVar322.e()) == 0 ? 8 : 16);
                    long s1022 = wVar322.s();
                    if (j13 != -9223372036854775807L) {
                    }
                    a e1822 = e11.e(1835626086);
                    e1822.getClass();
                    a e1922 = e1822.e(1937007212);
                    e1922.getClass();
                    b f1422 = e11.f(1835296868);
                    f1422.getClass();
                    w wVar422 = f1422.c;
                    wVar422.C(8);
                    int b1122 = nc.k.b(wVar422.e());
                    wVar422.D(b1122 == 0 ? 8 : 16);
                    long s1122 = wVar422.s();
                    wVar422.D(b1122 == 0 ? 4 : 8);
                    int w1022 = wVar422.w();
                    Pair create222 = Pair.create(Long.valueOf(s1122), "" + ((char) (((w1022 >> 10) & 31) + 96)) + ((char) (((w1022 >> 5) & 31) + 96)) + ((char) ((w1022 & 31) + 96)));
                    f9 = e1922.f(1937011556);
                    if (f9 == null) {
                    }
                }
                oVar = null;
                oVar2 = (o) eVar2.apply(oVar);
                if (oVar2 != null) {
                }
            }
            i46 = i12 + 1;
            aVar3 = aVar;
            cVar5 = cVar;
            arrayList6 = arrayList4;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }
}
