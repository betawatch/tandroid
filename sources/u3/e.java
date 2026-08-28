package u3;

import android.util.Pair;
import c2.b1;
import com.google.android.exoplayer2.upstream.w;
import d5.f0;
import d5.x;
import d5.y;
import g7.r6;
import h3.s0;
import h3.t0;
import h3.t1;
import j3.r0;
import j4.v0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o8.l0;
import o8.z;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e {
    public static final byte[] a;

    static {
        int i9 = f0.a;
        a = "OpusHead".getBytes(n8.d.c);
    }

    public static v0 a(int i9, y yVar) {
        yVar.C(i9 + 12);
        yVar.D(1);
        b(yVar);
        yVar.D(2);
        int r10 = yVar.r();
        if ((r10 & 128) != 0) {
            yVar.D(2);
        }
        if ((r10 & 64) != 0) {
            yVar.D(yVar.r());
        }
        if ((r10 & 32) != 0) {
            yVar.D(2);
        }
        yVar.D(1);
        b(yVar);
        String d = d5.q.d(yVar.r());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return new v0(d, null, -1L, -1L);
        }
        yVar.D(4);
        long s10 = yVar.s();
        long s11 = yVar.s();
        yVar.D(1);
        int b10 = b(yVar);
        long j10 = s11;
        byte[] bArr = new byte[b10];
        yVar.c(0, b10, bArr);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new v0(d, bArr, j10, s10 > 0 ? s10 : -1L);
    }

    public static int b(y yVar) {
        int r10 = yVar.r();
        int i9 = r10 & 127;
        while ((r10 & 128) == 128) {
            r10 = yVar.r();
            i9 = (i9 << 7) | (r10 & 127);
        }
        return i9;
    }

    public static Pair c(y yVar, int i9, int i10) {
        Integer num;
        p pVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z10;
        int i13 = yVar.b;
        while (i13 - i9 < i10) {
            yVar.C(i13);
            int e10 = yVar.e();
            g7.q.a("childAtomSize must be positive", e10 > 0);
            if (yVar.e() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = -1;
                Integer num3 = null;
                String str = null;
                int i16 = 0;
                while (i14 - i13 < e10) {
                    yVar.C(i14);
                    int e11 = yVar.e();
                    int e12 = yVar.e();
                    if (e12 == 1718775137) {
                        num3 = Integer.valueOf(yVar.e());
                    } else if (e12 == 1935894637) {
                        yVar.D(4);
                        str = yVar.p(4, n8.d.c);
                    } else if (e12 == 1935894633) {
                        i15 = i14;
                        i16 = e11;
                    }
                    i14 += e11;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    g7.q.a("frma atom is mandatory", num3 != null);
                    g7.q.a("schi atom is mandatory", i15 != -1);
                    int i17 = i15 + 8;
                    while (true) {
                        if (i17 - i15 >= i16) {
                            num = num3;
                            pVar = null;
                            break;
                        }
                        yVar.C(i17);
                        int e13 = yVar.e();
                        if (yVar.e() == 1952804451) {
                            int b10 = lc.k.b(yVar.e());
                            yVar.D(1);
                            if (b10 == 0) {
                                yVar.D(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int r10 = yVar.r();
                                i11 = r10 & 15;
                                i12 = (r10 & 240) >> 4;
                            }
                            if (yVar.r() == 1) {
                                num2 = num3;
                                z10 = true;
                            } else {
                                num2 = num3;
                                z10 = false;
                            }
                            int r11 = yVar.r();
                            byte[] bArr2 = new byte[16];
                            yVar.c(0, 16, bArr2);
                            if (z10 && r11 == 0) {
                                int r12 = yVar.r();
                                byte[] bArr3 = new byte[r12];
                                yVar.c(0, r12, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            pVar = new p(z10, str, r11, bArr2, i12, i11, bArr);
                        } else {
                            i17 += e13;
                        }
                    }
                    g7.q.a("tenc atom is mandatory", pVar != null);
                    int i18 = f0.a;
                    create = Pair.create(num, pVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += e10;
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
    public static r d(o oVar, a aVar, m3.q qVar) {
        d dVar;
        boolean z10;
        int i9;
        int i10;
        int i11;
        int a2;
        int i12;
        long j10;
        y yVar;
        long[] jArr;
        int i13;
        int[] iArr;
        long j11;
        int i14;
        long j12;
        int i15;
        int i16;
        long[] jArr2;
        t0 t0Var;
        int i17;
        int i18;
        int i19;
        int i20;
        int[] iArr2;
        int i21;
        boolean z11;
        long[] jArr3;
        long[] jArr4;
        int[] iArr3;
        int i22;
        long j13;
        long j14;
        int i23;
        int i24;
        long j15;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        t0 t0Var2 = oVar.f;
        b f10 = aVar.f(1937011578);
        if (f10 != null) {
            dVar = new w(f10, t0Var2);
        } else {
            b f11 = aVar.f(1937013298);
            if (f11 == null) {
                throw t1.a("Track has no sample table size information", null);
            }
            b1 b1Var = new b1();
            y yVar2 = f11.c;
            b1Var.e = yVar2;
            yVar2.C(12);
            b1Var.b = yVar2.u() & 255;
            b1Var.a = yVar2.u();
            dVar = b1Var;
        }
        int b10 = dVar.b();
        if (b10 == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b f12 = aVar.f(1937007471);
        if (f12 == null) {
            f12 = aVar.f(1668232756);
            f12.getClass();
            z10 = true;
        } else {
            z10 = false;
        }
        y yVar3 = f12.c;
        b f13 = aVar.f(1937011555);
        f13.getClass();
        y yVar4 = f13.c;
        b f14 = aVar.f(1937011827);
        f14.getClass();
        y yVar5 = f14.c;
        b f15 = aVar.f(1937011571);
        y yVar6 = f15 != null ? f15.c : null;
        b f16 = aVar.f(1668576371);
        y yVar7 = f16 != null ? f16.c : null;
        c cVar = new c(yVar4, yVar3, z10);
        yVar5.C(12);
        int u10 = yVar5.u() - 1;
        int u11 = yVar5.u();
        int u12 = yVar5.u();
        if (yVar7 != null) {
            yVar7.C(12);
            i9 = yVar7.u();
        } else {
            i9 = 0;
        }
        if (yVar6 != null) {
            yVar6.C(12);
            i10 = yVar6.u();
            if (i10 > 0) {
                i11 = yVar6.u() - 1;
                a2 = dVar.a();
                i12 = oVar.b;
                d dVar2 = dVar;
                j10 = oVar.c;
                yVar = yVar7;
                long[] jArr5 = oVar.i;
                jArr = oVar.h;
                i13 = i10;
                String str = t0Var2.B;
                long j16 = 0;
                if (a2 == -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && u10 == 0 && i9 == 0 && i13 == 0)) {
                    int i30 = cVar.a;
                    long[] jArr6 = new long[i30];
                    int[] iArr4 = new int[i30];
                    while (cVar.a()) {
                        int i31 = cVar.b;
                        long[] jArr7 = jArr6;
                        int[] iArr5 = iArr4;
                        jArr7[i31] = cVar.d;
                        iArr5[i31] = cVar.c;
                        jArr6 = jArr7;
                        iArr4 = iArr5;
                    }
                    long[] jArr8 = jArr6;
                    int[] iArr6 = iArr4;
                    long j17 = u12;
                    int i32 = 8192 / a2;
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < i30) {
                        i34 += f0.f(iArr6[i33], i32);
                        i33++;
                        a2 = a2;
                    }
                    int i35 = a2;
                    long[] jArr9 = new long[i34];
                    iArr2 = new int[i34];
                    long[] jArr10 = new long[i34];
                    iArr3 = new int[i34];
                    int i36 = 0;
                    int i37 = 0;
                    i22 = 0;
                    int i38 = 0;
                    while (i36 < i30) {
                        int i39 = iArr6[i36];
                        long j18 = jArr8[i36];
                        int i40 = i36;
                        int i41 = i39;
                        while (i41 > 0) {
                            int min = Math.min(i32, i41);
                            jArr9[i38] = j18;
                            int i42 = i41;
                            int i43 = i35 * min;
                            iArr2[i38] = i43;
                            i22 = Math.max(i22, i43);
                            jArr10[i38] = i37 * j17;
                            iArr3[i38] = 1;
                            j18 += iArr2[i38];
                            i37 += min;
                            i41 = i42 - min;
                            i38++;
                            i30 = i30;
                        }
                        i36 = i40 + 1;
                    }
                    jArr2 = jArr;
                    t0Var = t0Var2;
                    j11 = j10;
                    j13 = i37 * j17;
                    i17 = i12;
                    jArr3 = jArr9;
                    jArr4 = jArr10;
                } else {
                    long[] jArr11 = new long[b10];
                    iArr = new int[b10];
                    long[] jArr12 = new long[b10];
                    int[] iArr7 = new int[b10];
                    j11 = j10;
                    y yVar8 = yVar6;
                    int i44 = u12;
                    i14 = i13;
                    int i45 = u11;
                    long j19 = 0;
                    j12 = 0;
                    int i46 = 0;
                    i15 = 0;
                    i16 = 0;
                    jArr2 = jArr;
                    t0Var = t0Var2;
                    int i47 = i11;
                    int i48 = 0;
                    int i49 = i9;
                    int i50 = u10;
                    i17 = i12;
                    i18 = 0;
                    while (true) {
                        if (i18 < b10) {
                            i19 = i50;
                            i20 = i45;
                            iArr2 = iArr;
                            i21 = i15;
                            break;
                        }
                        j14 = j12;
                        i23 = i15;
                        boolean z12 = true;
                        while (i23 == 0) {
                            z12 = cVar.a();
                            if (!z12) {
                                break;
                            }
                            int i51 = i50;
                            long j20 = cVar.d;
                            i23 = cVar.c;
                            j14 = j20;
                            i50 = i51;
                            i45 = i45;
                            b10 = b10;
                        }
                        i24 = b10;
                        i19 = i50;
                        i20 = i45;
                        if (!z12) {
                            d5.a.K("AtomParsers", "Unexpected end of chunk data");
                            long[] copyOf = Arrays.copyOf(jArr11, i18);
                            iArr2 = Arrays.copyOf(iArr, i18);
                            jArr12 = Arrays.copyOf(jArr12, i18);
                            iArr7 = Arrays.copyOf(iArr7, i18);
                            b10 = i18;
                            jArr11 = copyOf;
                            i21 = i23;
                            break;
                        }
                        if (yVar != null) {
                            int i52 = i16;
                            while (i52 == 0 && i49 > 0) {
                                i52 = yVar.u();
                                i48 = yVar.e();
                                i49--;
                            }
                            i16 = i52 - 1;
                        }
                        jArr11[i18] = j14;
                        int c10 = dVar2.c();
                        iArr[i18] = c10;
                        if (c10 > i46) {
                            i46 = c10;
                        }
                        jArr12[i18] = j19 + i48;
                        iArr7[i18] = yVar8 == null ? 1 : 0;
                        if (i18 == i47) {
                            iArr7[i18] = 1;
                            i14--;
                            if (i14 > 0) {
                                yVar8.getClass();
                                i47 = yVar8.u() - 1;
                            }
                        }
                        j19 += i44;
                        i45 = i20 - 1;
                        if (i45 != 0 || i19 <= 0) {
                            i50 = i19;
                        } else {
                            int u13 = yVar5.u();
                            int e10 = yVar5.e();
                            i50 = i19 - 1;
                            i45 = u13;
                            i44 = e10;
                        }
                        long j21 = j14 + iArr[i18];
                        i15 = i23 - 1;
                        i18++;
                        j12 = j21;
                        b10 = i24;
                    }
                    long j22 = j19 + i48;
                    if (yVar != null) {
                        while (i49 > 0) {
                            if (yVar.u() != 0) {
                                z11 = false;
                                break;
                            }
                            yVar.e();
                            i49--;
                        }
                    }
                    z11 = true;
                    if (i14 == 0 || i20 != 0 || i21 != 0 || i19 != 0 || i16 != 0 || !z11) {
                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                        boolean z13 = z11;
                        r0.y(sb2, oVar.a, ": remainingSynchronizationSamples ", i14, ", remainingSamplesAtTimestampDelta ");
                        r0.y(sb2, i20, ", remainingSamplesInChunk ", i21, ", remainingTimestampDeltaChanges ");
                        sb2.append(i19);
                        sb2.append(", remainingSamplesAtTimestampOffset ");
                        sb2.append(i16);
                        sb2.append(z13 ? ", ctts invalid" : "");
                        d5.a.K("AtomParsers", sb2.toString());
                    }
                    jArr3 = jArr11;
                    jArr4 = jArr12;
                    iArr3 = iArr7;
                    i22 = i46;
                    j13 = j22;
                }
                int[] iArr8 = iArr2;
                long O = f0.O(j13, 1000000L, oVar.c);
                if (jArr2 != null) {
                    f0.P(jArr4, j11);
                    return new r(oVar, jArr3, iArr8, i22, jArr4, iArr3, O);
                }
                int i53 = i22;
                int i54 = b10;
                int i55 = i53;
                long j23 = j13;
                int[] iArr9 = iArr3;
                long j24 = j11;
                long[] jArr13 = jArr4;
                long[] jArr14 = jArr2;
                if (jArr14.length == 1) {
                    i25 = i17;
                    if (i25 != 1 || jArr13.length < 2) {
                        j15 = j23;
                    } else {
                        jArr5.getClass();
                        long j25 = jArr5[0];
                        long[] jArr15 = jArr3;
                        long O2 = f0.O(jArr14[0], oVar.c, oVar.d) + j25;
                        int length = jArr13.length - 1;
                        int h = f0.h(4, 0, length);
                        int h10 = f0.h(jArr13.length - 4, 0, length);
                        long j26 = jArr13[0];
                        if (j26 <= j25 && j25 < jArr13[h] && jArr13[h10] < O2 && O2 <= j23) {
                            long j27 = j23 - O2;
                            t0 t0Var3 = t0Var;
                            long O3 = f0.O(j25 - j26, t0Var3.P, oVar.c);
                            j15 = j23;
                            long O4 = f0.O(j27, t0Var3.P, oVar.c);
                            if (!(O3 == 0 && O4 == 0) && O3 <= 2147483647L && O4 <= 2147483647L) {
                                qVar.a = (int) O3;
                                qVar.b = (int) O4;
                                f0.P(jArr13, j24);
                                return new r(oVar, jArr15, iArr8, i55, jArr13, iArr9, f0.O(jArr14[0], 1000000L, oVar.d));
                            }
                            iArr9 = iArr9;
                            iArr8 = iArr8;
                            i55 = i55;
                            jArr3 = jArr15;
                        } else {
                            jArr3 = jArr15;
                            j15 = j23;
                            iArr8 = iArr8;
                            i55 = i55;
                        }
                    }
                } else {
                    j15 = j23;
                    i25 = i17;
                }
                int i56 = 1;
                if (jArr14.length == 1) {
                    if (jArr14[0] == 0) {
                        jArr5.getClass();
                        long j28 = jArr5[0];
                        for (int i57 = 0; i57 < jArr13.length; i57++) {
                            jArr13[i57] = f0.O(jArr13[i57] - j28, 1000000L, oVar.c);
                        }
                        return new r(oVar, jArr3, iArr8, i55, jArr13, iArr9, f0.O(j15 - j28, 1000000L, oVar.c));
                    }
                    i56 = 1;
                }
                boolean z14 = i25 == i56;
                int[] iArr10 = new int[jArr14.length];
                int[] iArr11 = new int[jArr14.length];
                jArr5.getClass();
                int i58 = 0;
                boolean z15 = false;
                int i59 = 0;
                int i60 = 0;
                while (i58 < jArr14.length) {
                    int[] iArr12 = iArr10;
                    int[] iArr13 = iArr11;
                    long j29 = jArr5[i58];
                    if (j29 != -1) {
                        i27 = i58;
                        boolean z16 = z15;
                        long O5 = f0.O(jArr14[i58], oVar.c, oVar.d);
                        i26 = i55;
                        iArr12[i27] = f0.e(jArr13, j29, true);
                        iArr13[i27] = f0.b(jArr13, j29 + O5, z14);
                        while (true) {
                            i28 = iArr12[i27];
                            i29 = iArr13[i27];
                            if (i28 >= i29 || (iArr9[i28] & 1) != 0) {
                                break;
                            }
                            iArr12[i27] = i28 + 1;
                        }
                        int i61 = (i29 - i28) + i59;
                        z15 = z16 | (i60 != i28);
                        i60 = i29;
                        i59 = i61;
                    } else {
                        i26 = i55;
                        i27 = i58;
                    }
                    i58 = i27 + 1;
                    iArr10 = iArr12;
                    iArr11 = iArr13;
                    i55 = i26;
                }
                int i62 = i55;
                int[] iArr14 = iArr10;
                int[] iArr15 = iArr11;
                boolean z17 = z15 | (i59 != i54);
                long[] jArr16 = z17 ? new long[i59] : jArr3;
                int[] iArr16 = z17 ? new int[i59] : iArr8;
                int i63 = z17 ? 0 : i62;
                int[] iArr17 = z17 ? new int[i59] : iArr9;
                long[] jArr17 = new long[i59];
                int i64 = i63;
                long j30 = 0;
                int i65 = 0;
                int i66 = 0;
                while (i65 < jArr14.length) {
                    long j31 = jArr5[i65];
                    int i67 = iArr14[i65];
                    long[] jArr18 = jArr14;
                    int i68 = iArr15[i65];
                    int i69 = i64;
                    if (z17) {
                        int i70 = i68 - i67;
                        System.arraycopy(jArr3, i67, jArr16, i66, i70);
                        System.arraycopy(iArr8, i67, iArr16, i66, i70);
                        System.arraycopy(iArr9, i67, iArr17, i66, i70);
                    }
                    i64 = i69;
                    while (i67 < i68) {
                        long[] jArr19 = jArr3;
                        int[] iArr18 = iArr8;
                        long O6 = f0.O(j30, 1000000L, oVar.d);
                        long j32 = jArr13[i67] - j31;
                        long[] jArr20 = jArr13;
                        int[] iArr19 = iArr9;
                        long j33 = j16;
                        jArr17[i66] = O6 + f0.O(Math.max(j33, j32), 1000000L, oVar.c);
                        if (z17 && iArr16[i66] > i64) {
                            i64 = iArr18[i67];
                        }
                        i66++;
                        i67++;
                        j16 = j33;
                        jArr3 = jArr19;
                        iArr8 = iArr18;
                        iArr9 = iArr19;
                        jArr13 = jArr20;
                    }
                    j30 += jArr18[i65];
                    i65++;
                    jArr3 = jArr3;
                    iArr8 = iArr8;
                    iArr9 = iArr9;
                    jArr13 = jArr13;
                    jArr14 = jArr18;
                }
                return new r(oVar, jArr16, iArr16, i64, jArr17, iArr17, f0.O(j30, 1000000L, oVar.d));
            }
            yVar6 = null;
        } else {
            i10 = 0;
        }
        i11 = -1;
        a2 = dVar.a();
        i12 = oVar.b;
        d dVar22 = dVar;
        j10 = oVar.c;
        yVar = yVar7;
        long[] jArr52 = oVar.i;
        jArr = oVar.h;
        i13 = i10;
        String str2 = t0Var2.B;
        long j162 = 0;
        if (a2 == -1) {
        }
        long[] jArr112 = new long[b10];
        iArr = new int[b10];
        long[] jArr122 = new long[b10];
        int[] iArr72 = new int[b10];
        j11 = j10;
        y yVar82 = yVar6;
        int i442 = u12;
        i14 = i13;
        int i452 = u11;
        long j192 = 0;
        j12 = 0;
        int i462 = 0;
        i15 = 0;
        i16 = 0;
        jArr2 = jArr;
        t0Var = t0Var2;
        int i472 = i11;
        int i482 = 0;
        int i492 = i9;
        int i502 = u10;
        i17 = i12;
        i18 = 0;
        while (true) {
            if (i18 < b10) {
            }
            long j212 = j14 + iArr[i18];
            i15 = i23 - 1;
            i18++;
            j12 = j212;
            b10 = i24;
        }
        long j222 = j192 + i482;
        if (yVar != null) {
        }
        z11 = true;
        if (i14 == 0) {
        }
        StringBuilder sb22 = new StringBuilder("Inconsistent stbl box for track ");
        boolean z132 = z11;
        r0.y(sb22, oVar.a, ": remainingSynchronizationSamples ", i14, ", remainingSamplesAtTimestampDelta ");
        r0.y(sb22, i20, ", remainingSamplesInChunk ", i21, ", remainingTimestampDeltaChanges ");
        sb22.append(i19);
        sb22.append(", remainingSamplesAtTimestampOffset ");
        sb22.append(i16);
        sb22.append(z132 ? ", ctts invalid" : "");
        d5.a.K("AtomParsers", sb22.toString());
        jArr3 = jArr112;
        jArr4 = jArr122;
        iArr3 = iArr72;
        i22 = i462;
        j13 = j222;
        int[] iArr82 = iArr2;
        long O7 = f0.O(j13, 1000000L, oVar.c);
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
    public static ArrayList e(a aVar, m3.q qVar, long j10, l3.c cVar, boolean z10, boolean z11, n8.e eVar) {
        long j11;
        int i9;
        int i10;
        b f10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        long[] jArr;
        long[] jArr2;
        n8.e eVar2;
        o oVar;
        Pair create;
        ArrayList arrayList3;
        a aVar2;
        Pair pair;
        int i12;
        int i13;
        p[] pVarArr;
        int i14;
        int i15;
        int i16;
        l3.c cVar2;
        int i17;
        String str;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        List list;
        int i24;
        int i25;
        l3.c cVar3;
        float f11;
        byte[] bArr;
        int i26;
        byte[] bArr2;
        int i27;
        String str2;
        String str3;
        int i28;
        int[] iArr;
        int[] iArr2;
        int i29;
        int e10;
        int i30;
        int i31;
        int i32;
        l3.c cVar4;
        String str4;
        String str5;
        int i33;
        String str6;
        int i34;
        int i35;
        int i36;
        v0 v0Var;
        List list2;
        int i37;
        String str7;
        int i38;
        int i39;
        String str8;
        String str9;
        String str10;
        int i40;
        int i41;
        int i42;
        String str11;
        v0 v0Var2;
        String str12;
        String str13;
        int i43;
        List y10;
        String str14;
        int i44;
        l3.c a2;
        long j12;
        l0 l0Var;
        o oVar2;
        ArrayList arrayList4;
        a aVar3 = aVar;
        l3.c cVar5 = cVar;
        ArrayList arrayList5 = aVar3.e;
        ArrayList arrayList6 = new ArrayList();
        int i45 = 0;
        while (i45 < arrayList5.size()) {
            a aVar4 = (a) arrayList5.get(i45);
            if (aVar4.b != 1953653099) {
                arrayList = arrayList5;
                arrayList4 = arrayList6;
                i11 = i45;
            } else {
                b f12 = aVar3.f(1836476516);
                f12.getClass();
                a e11 = aVar4.e(1835297121);
                e11.getClass();
                b f13 = e11.f(1751411826);
                f13.getClass();
                y yVar = f13.c;
                yVar.C(16);
                int e12 = yVar.e();
                int i46 = e12 == 1936684398 ? 1 : e12 == 1986618469 ? 2 : (e12 == 1952807028 || e12 == 1935832172 || e12 == 1937072756 || e12 == 1668047728) ? 3 : e12 == 1835365473 ? 5 : -1;
                if (i46 == -1) {
                    eVar2 = eVar;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i11 = i45;
                } else {
                    b f14 = aVar4.f(1953196132);
                    f14.getClass();
                    y yVar2 = f14.c;
                    yVar2.C(8);
                    int b10 = lc.k.b(yVar2.e());
                    yVar2.D(b10 == 0 ? 8 : 16);
                    int e13 = yVar2.e();
                    yVar2.D(4);
                    int i47 = yVar2.b;
                    int i48 = b10 == 0 ? 4 : 8;
                    int i49 = 0;
                    while (true) {
                        if (i49 >= i48) {
                            yVar2.D(i48);
                            break;
                        }
                        if (yVar2.a[i47 + i49] != -1) {
                            j11 = b10 == 0 ? yVar2.s() : yVar2.v();
                        } else {
                            i49++;
                        }
                    }
                    yVar2.D(16);
                    int e14 = yVar2.e();
                    int e15 = yVar2.e();
                    yVar2.D(4);
                    int e16 = yVar2.e();
                    int e17 = yVar2.e();
                    if (e14 == 0 && e15 == 65536) {
                        i9 = -65536;
                        if (e16 == -65536 && e17 == 0) {
                            i10 = 90;
                            long j13 = j10 == -9223372036854775807L ? j11 : j10;
                            y yVar3 = f12.c;
                            yVar3.C(8);
                            yVar3.D(lc.k.b(yVar3.e()) == 0 ? 8 : 16);
                            long s10 = yVar3.s();
                            long O = j13 != -9223372036854775807L ? f0.O(j13, 1000000L, s10) : -9223372036854775807L;
                            a e18 = e11.e(1835626086);
                            e18.getClass();
                            a e19 = e18.e(1937007212);
                            e19.getClass();
                            b f15 = e11.f(1835296868);
                            f15.getClass();
                            y yVar4 = f15.c;
                            yVar4.C(8);
                            int b11 = lc.k.b(yVar4.e());
                            yVar4.D(b11 == 0 ? 8 : 16);
                            long s11 = yVar4.s();
                            yVar4.D(b11 == 0 ? 4 : 8);
                            int w8 = yVar4.w();
                            Pair create2 = Pair.create(Long.valueOf(s11), "" + ((char) (((w8 >> 10) & 31) + 96)) + ((char) (((w8 >> 5) & 31) + 96)) + ((char) ((w8 & 31) + 96)));
                            f10 = e19.f(1937011556);
                            if (f10 == null) {
                                throw t1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                            }
                            y yVar5 = f10.c;
                            String str15 = (String) create2.second;
                            yVar5.C(12);
                            int e20 = yVar5.e();
                            p[] pVarArr2 = new p[e20];
                            long j14 = O;
                            int i50 = 0;
                            t0 t0Var = null;
                            int i51 = 0;
                            int i52 = 0;
                            while (i50 < e20) {
                                int i53 = yVar5.b;
                                int e21 = yVar5.e();
                                ArrayList arrayList7 = arrayList5;
                                int i54 = e13;
                                String str16 = "childAtomSize must be positive";
                                g7.q.a("childAtomSize must be positive", e21 > 0);
                                int e22 = yVar5.e();
                                int i55 = i45;
                                if (e22 == 1635148593 || e22 == 1635148595 || e22 == 1701733238 || e22 == 1831958048 || e22 == 1836070006 || e22 == 1752589105 || e22 == 1751479857 || e22 == 1932670515 || e22 == 1211250227 || e22 == 1987063864 || e22 == 1987063865 || e22 == 1635135537 || e22 == 1685479798 || e22 == 1685479729 || e22 == 1685481573 || e22 == 1685481521) {
                                    int i56 = i10;
                                    arrayList3 = arrayList6;
                                    String str17 = "childAtomSize must be positive";
                                    aVar2 = aVar4;
                                    pair = create2;
                                    i12 = i46;
                                    i13 = e20;
                                    pVarArr = pVarArr2;
                                    i14 = i50;
                                    yVar5.C(i53 + 16);
                                    yVar5.D(16);
                                    int w10 = yVar5.w();
                                    int w11 = yVar5.w();
                                    yVar5.D(50);
                                    int i57 = yVar5.b;
                                    if (e22 == 1701733238) {
                                        i15 = i53;
                                        i16 = e21;
                                        Pair c10 = c(yVar5, i15, i16);
                                        if (c10 != null) {
                                            e22 = ((Integer) c10.first).intValue();
                                            cVar2 = cVar == null ? null : cVar.a(((p) c10.second).b);
                                            pVarArr[i14] = (p) c10.second;
                                        } else {
                                            cVar2 = cVar;
                                        }
                                        yVar5.C(i57);
                                    } else {
                                        i15 = i53;
                                        i16 = e21;
                                        cVar2 = cVar;
                                    }
                                    int i58 = i57;
                                    i17 = i15;
                                    str = str15;
                                    String str18 = e22 == 1831958048 ? "video/mpeg" : e22 == 1211250227 ? "video/3gpp" : null;
                                    int i59 = i52;
                                    List list3 = null;
                                    int i60 = -1;
                                    int i61 = -1;
                                    float f16 = 1.0f;
                                    String str19 = null;
                                    byte[] bArr3 = null;
                                    ByteBuffer byteBuffer = null;
                                    boolean z12 = false;
                                    v0 v0Var3 = null;
                                    int i62 = -1;
                                    int i63 = -1;
                                    while (true) {
                                        if (i58 - i17 >= i16) {
                                            i18 = i61;
                                            break;
                                        }
                                        yVar5.C(i58);
                                        int i64 = yVar5.b;
                                        int i65 = i58;
                                        int e23 = yVar5.e();
                                        i18 = i61;
                                        if (e23 == 0 && yVar5.b - i17 == i16) {
                                            break;
                                        }
                                        g7.q.a(str17, e23 > 0);
                                        int e24 = yVar5.e();
                                        String str20 = str17;
                                        if (e24 == 1635148611) {
                                            g7.q.a(null, str18 == null);
                                            yVar5.C(i64 + 8);
                                            e5.a a3 = e5.a.a(yVar5);
                                            list3 = a3.a;
                                            i27 = a3.b;
                                            if (!z12) {
                                                f16 = a3.e;
                                            }
                                            str2 = a3.f;
                                            str3 = MediaController.VIDEO_MIME_TYPE;
                                        } else if (e24 == 1752589123) {
                                            g7.q.a(null, str18 == null);
                                            yVar5.C(i64 + 8);
                                            e5.f a10 = e5.f.a(yVar5);
                                            list3 = a10.a;
                                            i27 = a10.b;
                                            if (!z12) {
                                                f16 = a10.c;
                                            }
                                            str2 = a10.d;
                                            str3 = "video/hevc";
                                        } else {
                                            if (e24 == 1685480259 || e24 == 1685485123) {
                                                i23 = e22;
                                                list = list3;
                                                i24 = i60;
                                                i25 = i16;
                                                cVar3 = cVar2;
                                                f11 = f16;
                                                bArr = bArr3;
                                                e5.c a11 = e5.c.a(yVar5);
                                                if (a11 != null) {
                                                    str19 = a11.b;
                                                    str18 = "video/dolby-vision";
                                                }
                                            } else {
                                                if (e24 == 1987076931) {
                                                    g7.q.a(null, str18 == null);
                                                    i23 = e22;
                                                    i25 = i16;
                                                    str18 = e22 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                } else {
                                                    if (e24 == 1635135811) {
                                                        g7.q.a(null, str18 == null);
                                                        str18 = "video/av01";
                                                    } else if (e24 == 1668050025) {
                                                        ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        order.position(21);
                                                        order.putShort(yVar5.o());
                                                        order.putShort(yVar5.o());
                                                        byteBuffer = order;
                                                    } else {
                                                        if (e24 == 1835295606) {
                                                            ByteBuffer order2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                            short o6 = yVar5.o();
                                                            short o9 = yVar5.o();
                                                            i23 = e22;
                                                            short o10 = yVar5.o();
                                                            i25 = i16;
                                                            short o11 = yVar5.o();
                                                            cVar3 = cVar2;
                                                            short o12 = yVar5.o();
                                                            list = list3;
                                                            short o13 = yVar5.o();
                                                            i24 = i60;
                                                            short o14 = yVar5.o();
                                                            bArr = bArr3;
                                                            short o15 = yVar5.o();
                                                            long s12 = yVar5.s();
                                                            long s13 = yVar5.s();
                                                            f11 = f16;
                                                            order2.position(1);
                                                            order2.putShort(o12);
                                                            order2.putShort(o13);
                                                            order2.putShort(o6);
                                                            order2.putShort(o9);
                                                            order2.putShort(o10);
                                                            order2.putShort(o11);
                                                            order2.putShort(o14);
                                                            order2.putShort(o15);
                                                            order2.putShort((short) (s12 / 10000));
                                                            order2.putShort((short) (s13 / 10000));
                                                            byteBuffer = order2;
                                                        } else {
                                                            i23 = e22;
                                                            list = list3;
                                                            i24 = i60;
                                                            i25 = i16;
                                                            cVar3 = cVar2;
                                                            f11 = f16;
                                                            bArr = bArr3;
                                                            if (e24 == 1681012275) {
                                                                g7.q.a(null, str18 == null);
                                                                str18 = "video/3gpp";
                                                            } else {
                                                                if (e24 == 1702061171) {
                                                                    g7.q.a(null, str18 == null);
                                                                    v0 a12 = a(i64, yVar5);
                                                                    String str21 = (String) a12.c;
                                                                    byte[] bArr4 = (byte[]) a12.d;
                                                                    if (bArr4 != null) {
                                                                        list = z.y(bArr4);
                                                                    }
                                                                    v0Var3 = a12;
                                                                    str18 = str21;
                                                                    list3 = list;
                                                                    i60 = i24;
                                                                    bArr3 = bArr;
                                                                } else if (e24 == 1885434736) {
                                                                    yVar5.C(i64 + 8);
                                                                    f11 = yVar5.u() / yVar5.u();
                                                                    list3 = list;
                                                                    i60 = i24;
                                                                    bArr3 = bArr;
                                                                    z12 = true;
                                                                    i58 = i65 + e23;
                                                                    i61 = i18;
                                                                    str17 = str20;
                                                                    e22 = i23;
                                                                    i16 = i25;
                                                                    cVar2 = cVar3;
                                                                    f16 = f11;
                                                                } else if (e24 == 1937126244) {
                                                                    int i66 = i64 + 8;
                                                                    while (true) {
                                                                        if (i66 - i64 >= e23) {
                                                                            bArr2 = null;
                                                                            break;
                                                                        }
                                                                        yVar5.C(i66);
                                                                        int e25 = yVar5.e();
                                                                        if (yVar5.e() == 1886547818) {
                                                                            bArr2 = Arrays.copyOfRange(yVar5.a, i66, e25 + i66);
                                                                            break;
                                                                        }
                                                                        i66 += e25;
                                                                    }
                                                                    bArr3 = bArr2;
                                                                    list3 = list;
                                                                    i60 = i24;
                                                                } else if (e24 == 1936995172) {
                                                                    int r10 = yVar5.r();
                                                                    yVar5.D(3);
                                                                    if (r10 == 0) {
                                                                        int r11 = yVar5.r();
                                                                        if (r11 == 0) {
                                                                            i24 = 0;
                                                                        } else if (r11 == 1) {
                                                                            i24 = 1;
                                                                        } else if (r11 == 2) {
                                                                            i24 = 2;
                                                                        } else if (r11 == 3) {
                                                                            i24 = 3;
                                                                        }
                                                                    }
                                                                    list3 = list;
                                                                    i60 = i24;
                                                                    bArr3 = bArr;
                                                                    i58 = i65 + e23;
                                                                    i61 = i18;
                                                                    str17 = str20;
                                                                    e22 = i23;
                                                                    i16 = i25;
                                                                    cVar2 = cVar3;
                                                                    f16 = f11;
                                                                } else if (e24 == 1668246642) {
                                                                    int e26 = yVar5.e();
                                                                    if (e26 == 1852009592 || e26 == 1852009571) {
                                                                        int w12 = yVar5.w();
                                                                        int w13 = yVar5.w();
                                                                        yVar5.D(2);
                                                                        boolean z13 = e23 == 19 && (yVar5.r() & 128) != 0;
                                                                        int a13 = e5.b.a(w12);
                                                                        int i67 = z13 ? 1 : 2;
                                                                        if (w13 != 1) {
                                                                            if (w13 == 16) {
                                                                                i26 = 6;
                                                                            } else if (w13 == 18) {
                                                                                i26 = 7;
                                                                            } else if (w13 != 6 && w13 != 7) {
                                                                                i26 = -1;
                                                                            }
                                                                            i18 = a13;
                                                                            i62 = i26;
                                                                            i63 = i67;
                                                                        }
                                                                        i26 = 3;
                                                                        i18 = a13;
                                                                        i62 = i26;
                                                                        i63 = i67;
                                                                    } else {
                                                                        d5.a.K("AtomParsers", "Unsupported color type: " + lc.k.a(e26));
                                                                    }
                                                                }
                                                                i58 = i65 + e23;
                                                                i61 = i18;
                                                                str17 = str20;
                                                                e22 = i23;
                                                                i16 = i25;
                                                                cVar2 = cVar3;
                                                                f16 = f11;
                                                            }
                                                        }
                                                        list3 = list;
                                                        i60 = i24;
                                                        bArr3 = bArr;
                                                        i58 = i65 + e23;
                                                        i61 = i18;
                                                        str17 = str20;
                                                        e22 = i23;
                                                        i16 = i25;
                                                        cVar2 = cVar3;
                                                        f16 = f11;
                                                    }
                                                    i23 = e22;
                                                    i25 = i16;
                                                }
                                                cVar3 = cVar2;
                                                f11 = f16;
                                                i58 = i65 + e23;
                                                i61 = i18;
                                                str17 = str20;
                                                e22 = i23;
                                                i16 = i25;
                                                cVar2 = cVar3;
                                                f16 = f11;
                                            }
                                            list3 = list;
                                            i60 = i24;
                                            bArr3 = bArr;
                                            i58 = i65 + e23;
                                            i61 = i18;
                                            str17 = str20;
                                            e22 = i23;
                                            i16 = i25;
                                            cVar2 = cVar3;
                                            f16 = f11;
                                        }
                                        str19 = str2;
                                        i23 = e22;
                                        i25 = i16;
                                        i59 = i27;
                                        str18 = str3;
                                        cVar3 = cVar2;
                                        f11 = f16;
                                        i58 = i65 + e23;
                                        i61 = i18;
                                        str17 = str20;
                                        e22 = i23;
                                        i16 = i25;
                                        cVar2 = cVar3;
                                        f16 = f11;
                                    }
                                    List list4 = list3;
                                    int i68 = i60;
                                    i19 = i16;
                                    l3.c cVar6 = cVar2;
                                    float f17 = f16;
                                    byte[] bArr5 = bArr3;
                                    if (str18 == null) {
                                        i20 = i56;
                                    } else {
                                        s0 s0Var = new s0();
                                        s0Var.a = Integer.toString(i54);
                                        s0Var.o = str18;
                                        s0Var.h = str19;
                                        s0Var.t = w10;
                                        s0Var.u = w11;
                                        s0Var.x = f17;
                                        i20 = i56;
                                        s0Var.w = i20;
                                        s0Var.y = bArr5;
                                        s0Var.z = i68;
                                        s0Var.q = list4;
                                        s0Var.r = cVar6;
                                        int i69 = i18;
                                        if (i69 == -1) {
                                            i22 = i63;
                                            i21 = i62;
                                            if (i22 == -1) {
                                                if (i21 == -1) {
                                                }
                                            }
                                        } else {
                                            i21 = i62;
                                            i22 = i63;
                                        }
                                        s0Var.A = new e5.b(i69, i22, i21, byteBuffer != null ? byteBuffer.array() : null);
                                        if (v0Var3 != null) {
                                            v0 v0Var4 = v0Var3;
                                            s0Var.f = r6.d(v0Var4.a);
                                            s0Var.g = r6.d(v0Var4.b);
                                        }
                                        t0Var = new t0(s0Var);
                                    }
                                    i52 = i59;
                                } else {
                                    i12 = i46;
                                    if (e22 == 1836069985 || e22 == 1701733217 || e22 == 1633889587 || e22 == 1700998451 || e22 == 1633889588 || e22 == 1835823201 || e22 == 1685353315 || e22 == 1685353317 || e22 == 1685353320 || e22 == 1685353324 || e22 == 1685353336 || e22 == 1935764850 || e22 == 1935767394 || e22 == 1819304813 || e22 == 1936684916 || e22 == 1953984371 || e22 == 778924082 || e22 == 778924083 || e22 == 1835557169 || e22 == 1835560241 || e22 == 1634492771 || e22 == 1634492791 || e22 == 1970037111 || e22 == 1332770163 || e22 == 1716281667) {
                                        i13 = e20;
                                        pVarArr = pVarArr2;
                                        int[] iArr3 = j3.b.f;
                                        int[] iArr4 = j3.b.d;
                                        yVar5.C(i53 + 16);
                                        if (z11) {
                                            i28 = yVar5.w();
                                            yVar5.D(6);
                                        } else {
                                            yVar5.D(8);
                                            i28 = 0;
                                        }
                                        if (i28 == 0 || i28 == 1) {
                                            iArr = iArr4;
                                            int w14 = yVar5.w();
                                            yVar5.D(6);
                                            byte[] bArr6 = yVar5.a;
                                            iArr2 = iArr3;
                                            int i70 = yVar5.b;
                                            int i71 = i70 + 1;
                                            yVar5.b = i71;
                                            int i72 = (bArr6[i70] & 255) << 8;
                                            yVar5.b = i70 + 2;
                                            i29 = i72 | (bArr6[i71] & 255);
                                            yVar5.b = i70 + 4;
                                            yVar5.C(i70);
                                            e10 = yVar5.e();
                                            if (i28 == 1) {
                                                yVar5.D(16);
                                            }
                                            i30 = w14;
                                        } else if (i28 == 2) {
                                            yVar5.D(16);
                                            iArr = iArr4;
                                            i29 = (int) Math.round(Double.longBitsToDouble(yVar5.l()));
                                            i30 = yVar5.u();
                                            yVar5.D(20);
                                            iArr2 = iArr3;
                                            e10 = 0;
                                        } else {
                                            i32 = i10;
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            i14 = i50;
                                            i17 = i53;
                                            i31 = e21;
                                            str = str15;
                                            i20 = i32;
                                            i19 = i31;
                                        }
                                        int i73 = yVar5.b;
                                        int i74 = i30;
                                        if (e22 == 1701733217) {
                                            Pair c11 = c(yVar5, i53, e21);
                                            if (c11 != null) {
                                                int intValue = ((Integer) c11.first).intValue();
                                                if (cVar5 == null) {
                                                    i44 = intValue;
                                                    a2 = null;
                                                } else {
                                                    i44 = intValue;
                                                    a2 = cVar5.a(((p) c11.second).b);
                                                }
                                                pVarArr[i50] = (p) c11.second;
                                                cVar4 = a2;
                                                e22 = i44;
                                            } else {
                                                cVar4 = cVar5;
                                            }
                                            yVar5.C(i73);
                                        } else {
                                            cVar4 = cVar5;
                                        }
                                        int i75 = i29;
                                        String str22 = "audio/ac3";
                                        i14 = i50;
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
                                                    i33 = 2;
                                                } else if (e22 == 1953984371) {
                                                    i33 = TLObject.FLAG_28;
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
                                                    i33 = -1;
                                                    str5 = null;
                                                }
                                                i32 = i10;
                                                arrayList3 = arrayList6;
                                                aVar2 = aVar4;
                                                pair = create2;
                                                i17 = i53;
                                                str6 = str5;
                                                i34 = i75;
                                                i35 = i74;
                                                i36 = i73;
                                                List list5 = null;
                                                String str23 = null;
                                                v0Var = null;
                                                while (i36 - i17 < e21) {
                                                    yVar5.C(i36);
                                                    int e27 = yVar5.e();
                                                    int i76 = e21;
                                                    g7.q.a(str16, e27 > 0);
                                                    int e28 = yVar5.e();
                                                    List list6 = list5;
                                                    if (e28 == 1835557187) {
                                                        int i77 = e27 - 13;
                                                        byte[] bArr7 = new byte[i77];
                                                        i38 = i33;
                                                        yVar5.C(i36 + 13);
                                                        yVar5.c(0, i77, bArr7);
                                                        list6 = z.y(bArr7);
                                                        str11 = str16;
                                                        str10 = str22;
                                                        i42 = e27;
                                                    } else {
                                                        i38 = i33;
                                                        if (e28 == 1702061171) {
                                                            i39 = e27;
                                                            str8 = str16;
                                                            str9 = str23;
                                                            str10 = str22;
                                                            i40 = 1702061171;
                                                        } else if (z11 && e28 == 2002876005) {
                                                            i39 = e27;
                                                            str8 = str16;
                                                            str9 = str23;
                                                            str10 = str22;
                                                            i40 = 1702061171;
                                                        } else {
                                                            if (e28 == 1684103987) {
                                                                yVar5.C(i36 + 8);
                                                                String num = Integer.toString(i54);
                                                                x xVar = new x();
                                                                xVar.o(yVar5);
                                                                int i78 = iArr[xVar.i(2)];
                                                                str13 = str23;
                                                                xVar.s(8);
                                                                int i79 = iArr2[xVar.i(3)];
                                                                int i80 = xVar.i(1) != 0 ? i79 + 1 : i79;
                                                                str12 = str16;
                                                                int i81 = j3.b.g[xVar.i(5)] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                xVar.c();
                                                                yVar5.C(xVar.f());
                                                                s0 s0Var2 = new s0();
                                                                s0Var2.a = num;
                                                                s0Var2.o = str22;
                                                                s0Var2.B = i80;
                                                                s0Var2.C = i78;
                                                                s0Var2.r = cVar4;
                                                                s0Var2.c = str15;
                                                                s0Var2.f = i81;
                                                                s0Var2.g = i81;
                                                                t0Var = new t0(s0Var2);
                                                                i43 = e27;
                                                                str10 = str22;
                                                            } else {
                                                                str12 = str16;
                                                                str13 = str23;
                                                                if (e28 == 1684366131) {
                                                                    yVar5.C(i36 + 8);
                                                                    String num2 = Integer.toString(i54);
                                                                    x xVar2 = new x();
                                                                    xVar2.o(yVar5);
                                                                    int i82 = xVar2.i(13) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                    xVar2.s(3);
                                                                    int i83 = iArr[xVar2.i(2)];
                                                                    str10 = str22;
                                                                    xVar2.s(10);
                                                                    int i84 = iArr2[xVar2.i(3)];
                                                                    if (xVar2.i(1) != 0) {
                                                                        i84++;
                                                                    }
                                                                    xVar2.s(3);
                                                                    int i85 = xVar2.i(4);
                                                                    xVar2.s(1);
                                                                    int i86 = i84;
                                                                    if (i85 > 0) {
                                                                        xVar2.t(6);
                                                                        i84 = xVar2.i(1) != 0 ? i86 + 2 : i86;
                                                                        xVar2.s(1);
                                                                    }
                                                                    i43 = e27;
                                                                    if (xVar2.b() > 7) {
                                                                        xVar2.s(7);
                                                                        if (xVar2.i(1) != 0) {
                                                                            str14 = "audio/eac3-joc";
                                                                            xVar2.c();
                                                                            yVar5.C(xVar2.f());
                                                                            s0 s0Var3 = new s0();
                                                                            s0Var3.a = num2;
                                                                            s0Var3.o = str14;
                                                                            s0Var3.B = i84;
                                                                            s0Var3.C = i83;
                                                                            s0Var3.r = cVar4;
                                                                            s0Var3.c = str15;
                                                                            s0Var3.g = i82;
                                                                            t0Var = new t0(s0Var3);
                                                                        }
                                                                    }
                                                                    str14 = "audio/eac3";
                                                                    xVar2.c();
                                                                    yVar5.C(xVar2.f());
                                                                    s0 s0Var32 = new s0();
                                                                    s0Var32.a = num2;
                                                                    s0Var32.o = str14;
                                                                    s0Var32.B = i84;
                                                                    s0Var32.C = i83;
                                                                    s0Var32.r = cVar4;
                                                                    s0Var32.c = str15;
                                                                    s0Var32.g = i82;
                                                                    t0Var = new t0(s0Var32);
                                                                } else {
                                                                    i43 = e27;
                                                                    str10 = str22;
                                                                    if (e28 == 1684103988) {
                                                                        yVar5.C(i36 + 8);
                                                                        String num3 = Integer.toString(i54);
                                                                        yVar5.D(1);
                                                                        int i87 = ((yVar5.r() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                        s0 s0Var4 = new s0();
                                                                        s0Var4.a = num3;
                                                                        s0Var4.o = "audio/ac4";
                                                                        s0Var4.B = 2;
                                                                        s0Var4.C = i87;
                                                                        s0Var4.r = cVar4;
                                                                        s0Var4.c = str15;
                                                                        t0Var = new t0(s0Var4);
                                                                    } else if (e28 == 1684892784) {
                                                                        if (e10 <= 0) {
                                                                            throw t1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + e10, null);
                                                                        }
                                                                        i34 = e10;
                                                                        str23 = str13;
                                                                        str11 = str12;
                                                                        i42 = i43;
                                                                        i35 = 2;
                                                                    } else if (e28 == 1684305011) {
                                                                        s0 s0Var5 = new s0();
                                                                        s0Var5.a = Integer.toString(i54);
                                                                        s0Var5.o = str6;
                                                                        s0Var5.B = i35;
                                                                        s0Var5.C = i34;
                                                                        s0Var5.r = cVar4;
                                                                        s0Var5.c = str15;
                                                                        t0Var = new t0(s0Var5);
                                                                    } else {
                                                                        if (e28 == 1682927731) {
                                                                            int i88 = i43 - 8;
                                                                            byte[] bArr8 = a;
                                                                            byte[] copyOf = Arrays.copyOf(bArr8, bArr8.length + i88);
                                                                            yVar5.C(i36 + 8);
                                                                            yVar5.c(bArr8.length, i88, copyOf);
                                                                            y10 = j3.b.a(copyOf);
                                                                        } else if (e28 == 1684425825) {
                                                                            byte[] bArr9 = new byte[i43 - 8];
                                                                            bArr9[0] = 102;
                                                                            bArr9[1] = 76;
                                                                            bArr9[2] = 97;
                                                                            bArr9[3] = 67;
                                                                            yVar5.C(i36 + 12);
                                                                            yVar5.c(4, i43 - 12, bArr9);
                                                                            y10 = z.y(bArr9);
                                                                        } else {
                                                                            if (e28 == 1634492771) {
                                                                                int i89 = i43 - 12;
                                                                                byte[] bArr10 = new byte[i89];
                                                                                yVar5.C(i36 + 12);
                                                                                yVar5.c(0, i89, bArr10);
                                                                                y yVar6 = new y(bArr10);
                                                                                yVar6.C(9);
                                                                                int r12 = yVar6.r();
                                                                                yVar6.C(20);
                                                                                Pair create3 = Pair.create(Integer.valueOf(yVar6.u()), Integer.valueOf(r12));
                                                                                int intValue2 = ((Integer) create3.first).intValue();
                                                                                i35 = ((Integer) create3.second).intValue();
                                                                                list6 = z.y(bArr10);
                                                                                i34 = intValue2;
                                                                                str23 = str13;
                                                                                str11 = str12;
                                                                                i42 = i43;
                                                                            }
                                                                            str23 = str13;
                                                                            str11 = str12;
                                                                            i42 = i43;
                                                                        }
                                                                        list6 = y10;
                                                                        str23 = str13;
                                                                        str11 = str12;
                                                                        i42 = i43;
                                                                    }
                                                                    str23 = str13;
                                                                    str11 = str12;
                                                                    i42 = i43;
                                                                }
                                                            }
                                                            str23 = str13;
                                                            str11 = str12;
                                                            i42 = i43;
                                                        }
                                                        if (e28 != i40) {
                                                            i41 = yVar5.b;
                                                            g7.q.a(null, i41 >= i36);
                                                            while (true) {
                                                                i42 = i39;
                                                                if (i41 - i36 >= i42) {
                                                                    str11 = str8;
                                                                    i41 = -1;
                                                                    break;
                                                                }
                                                                yVar5.C(i41);
                                                                int e29 = yVar5.e();
                                                                str11 = str8;
                                                                g7.q.a(str11, e29 > 0);
                                                                if (yVar5.e() == 1702061171) {
                                                                    break;
                                                                }
                                                                i41 += e29;
                                                                str8 = str11;
                                                                i39 = i42;
                                                            }
                                                        } else {
                                                            i41 = i36;
                                                            str11 = str8;
                                                            i42 = i39;
                                                        }
                                                        if (i41 != -1) {
                                                            v0Var2 = a(i41, yVar5);
                                                            str6 = (String) v0Var2.c;
                                                            byte[] bArr11 = (byte[]) v0Var2.d;
                                                            if (bArr11 != null) {
                                                                if (MediaController.AUDIO_MIME_TYPE.equals(str6)) {
                                                                    j3.a h = j3.b.h(new x(bArr11, bArr11.length), false);
                                                                    i34 = h.a;
                                                                    i35 = h.b;
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
                                                    i36 += i42;
                                                    str16 = str11;
                                                    list5 = list6;
                                                    i33 = i38;
                                                    e21 = i76;
                                                    str22 = str10;
                                                }
                                                list2 = list5;
                                                i37 = i33;
                                                str7 = str23;
                                                i31 = e21;
                                                if (t0Var == null && str6 != null) {
                                                    s0 s0Var6 = new s0();
                                                    s0Var6.a = Integer.toString(i54);
                                                    s0Var6.o = str6;
                                                    s0Var6.h = str7;
                                                    s0Var6.B = i35;
                                                    s0Var6.C = i34;
                                                    s0Var6.D = i37;
                                                    s0Var6.q = list2;
                                                    s0Var6.r = cVar4;
                                                    s0Var6.c = str15;
                                                    if (v0Var != null) {
                                                        v0 v0Var5 = v0Var;
                                                        s0Var6.f = r6.d(v0Var5.a);
                                                        s0Var6.g = r6.d(v0Var5.b);
                                                    }
                                                    t0Var = new t0(s0Var6);
                                                }
                                                str = str15;
                                                i20 = i32;
                                                i19 = i31;
                                            }
                                            str5 = str4;
                                        }
                                        i33 = -1;
                                        i32 = i10;
                                        arrayList3 = arrayList6;
                                        aVar2 = aVar4;
                                        pair = create2;
                                        i17 = i53;
                                        str6 = str5;
                                        i34 = i75;
                                        i35 = i74;
                                        i36 = i73;
                                        List list52 = null;
                                        String str232 = null;
                                        v0Var = null;
                                        while (i36 - i17 < e21) {
                                        }
                                        list2 = list52;
                                        i37 = i33;
                                        str7 = str232;
                                        i31 = e21;
                                        if (t0Var == null) {
                                            s0 s0Var62 = new s0();
                                            s0Var62.a = Integer.toString(i54);
                                            s0Var62.o = str6;
                                            s0Var62.h = str7;
                                            s0Var62.B = i35;
                                            s0Var62.C = i34;
                                            s0Var62.D = i37;
                                            s0Var62.q = list2;
                                            s0Var62.r = cVar4;
                                            s0Var62.c = str15;
                                            if (v0Var != null) {
                                            }
                                            t0Var = new t0(s0Var62);
                                        }
                                        str = str15;
                                        i20 = i32;
                                        i19 = i31;
                                    } else {
                                        if (e22 == 1414810956 || e22 == 1954034535 || e22 == 2004251764 || e22 == 1937010800 || e22 == 1664495672) {
                                            yVar5.C(i53 + 16);
                                            String str24 = "application/ttml+xml";
                                            if (e22 != 1414810956) {
                                                if (e22 == 1954034535) {
                                                    int i90 = e21 - 16;
                                                    byte[] bArr12 = new byte[i90];
                                                    yVar5.c(0, i90, bArr12);
                                                    l0Var = z.y(bArr12);
                                                    str24 = "application/x-quicktime-tx3g";
                                                    i13 = e20;
                                                    j12 = Long.MAX_VALUE;
                                                } else if (e22 == 2004251764) {
                                                    str24 = "application/x-mp4-vtt";
                                                } else if (e22 == 1937010800) {
                                                    i13 = e20;
                                                    l0Var = null;
                                                    j12 = 0;
                                                } else {
                                                    if (e22 != 1664495672) {
                                                        throw new IllegalStateException();
                                                    }
                                                    str24 = "application/x-mp4-cea-608";
                                                    i13 = e20;
                                                    j12 = Long.MAX_VALUE;
                                                    l0Var = null;
                                                    i51 = 1;
                                                }
                                                s0 s0Var7 = new s0();
                                                pVarArr = pVarArr2;
                                                s0Var7.a = Integer.toString(i54);
                                                s0Var7.o = str24;
                                                s0Var7.c = str15;
                                                s0Var7.s = j12;
                                                s0Var7.q = l0Var;
                                                i20 = i10;
                                                t0Var = new t0(s0Var7);
                                                arrayList3 = arrayList6;
                                                aVar2 = aVar4;
                                                pair = create2;
                                                str = str15;
                                            }
                                            i13 = e20;
                                            j12 = Long.MAX_VALUE;
                                            l0Var = null;
                                            s0 s0Var72 = new s0();
                                            pVarArr = pVarArr2;
                                            s0Var72.a = Integer.toString(i54);
                                            s0Var72.o = str24;
                                            s0Var72.c = str15;
                                            s0Var72.s = j12;
                                            s0Var72.q = l0Var;
                                            i20 = i10;
                                            t0Var = new t0(s0Var72);
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            str = str15;
                                        } else {
                                            if (e22 == 1835365492) {
                                                yVar5.C(i53 + 16);
                                                if (e22 == 1835365492) {
                                                    yVar5.m();
                                                    String m10 = yVar5.m();
                                                    if (m10 != null) {
                                                        s0 s0Var8 = new s0();
                                                        s0Var8.a = Integer.toString(i54);
                                                        s0Var8.o = m10;
                                                        t0Var = new t0(s0Var8);
                                                    }
                                                }
                                            } else if (e22 == 1667329389) {
                                                s0 s0Var9 = new s0();
                                                s0Var9.a = Integer.toString(i54);
                                                s0Var9.o = "application/x-camera-motion";
                                                i20 = i10;
                                                arrayList3 = arrayList6;
                                                t0Var = new t0(s0Var9);
                                                aVar2 = aVar4;
                                                pair = create2;
                                                str = str15;
                                                i13 = e20;
                                                pVarArr = pVarArr2;
                                            }
                                            i20 = i10;
                                            arrayList3 = arrayList6;
                                            aVar2 = aVar4;
                                            pair = create2;
                                            str = str15;
                                            i13 = e20;
                                            pVarArr = pVarArr2;
                                        }
                                        i14 = i50;
                                        i17 = i53;
                                        i19 = e21;
                                    }
                                }
                                yVar5.C(i17 + i19);
                                i50 = i14 + 1;
                                i10 = i20;
                                arrayList5 = arrayList7;
                                e13 = i54;
                                i45 = i55;
                                e20 = i13;
                                str15 = str;
                                arrayList6 = arrayList3;
                                create2 = pair;
                                aVar4 = aVar2;
                                i46 = i12;
                                pVarArr2 = pVarArr;
                                cVar5 = cVar;
                            }
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            int i91 = e13;
                            i11 = i45;
                            a aVar5 = aVar4;
                            Pair pair2 = create2;
                            int i92 = i46;
                            p[] pVarArr3 = pVarArr2;
                            if (z10) {
                                aVar4 = aVar5;
                            } else {
                                aVar4 = aVar5;
                                a e30 = aVar4.e(1701082227);
                                if (e30 != null) {
                                    b f18 = e30.f(1701606260);
                                    if (f18 == null) {
                                        create = null;
                                    } else {
                                        y yVar7 = f18.c;
                                        yVar7.C(8);
                                        int b12 = lc.k.b(yVar7.e());
                                        int u10 = yVar7.u();
                                        long[] jArr3 = new long[u10];
                                        long[] jArr4 = new long[u10];
                                        for (int i93 = 0; i93 < u10; i93++) {
                                            jArr3[i93] = b12 == 1 ? yVar7.v() : yVar7.s();
                                            jArr4[i93] = b12 == 1 ? yVar7.l() : yVar7.e();
                                            if (yVar7.o() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            yVar7.D(2);
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
                                            oVar = new o(i91, i92, ((Long) pair2.first).longValue(), s10, j14, t0Var, i51, pVarArr3, i52, jArr, jArr2);
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
                                                r d = d(oVar2, e33, qVar);
                                                arrayList4 = arrayList2;
                                                arrayList4.add(d);
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
                        i9 = -65536;
                    }
                    if (e14 == 0 && e15 == i9) {
                        if (e16 == 65536 && e17 == 0) {
                            i10 = 270;
                            if (j10 == -9223372036854775807L) {
                            }
                            y yVar32 = f12.c;
                            yVar32.C(8);
                            yVar32.D(lc.k.b(yVar32.e()) == 0 ? 8 : 16);
                            long s102 = yVar32.s();
                            if (j13 != -9223372036854775807L) {
                            }
                            a e182 = e11.e(1835626086);
                            e182.getClass();
                            a e192 = e182.e(1937007212);
                            e192.getClass();
                            b f152 = e11.f(1835296868);
                            f152.getClass();
                            y yVar42 = f152.c;
                            yVar42.C(8);
                            int b112 = lc.k.b(yVar42.e());
                            yVar42.D(b112 == 0 ? 8 : 16);
                            long s112 = yVar42.s();
                            yVar42.D(b112 == 0 ? 4 : 8);
                            int w82 = yVar42.w();
                            Pair create22 = Pair.create(Long.valueOf(s112), "" + ((char) (((w82 >> 10) & 31) + 96)) + ((char) (((w82 >> 5) & 31) + 96)) + ((char) ((w82 & 31) + 96)));
                            f10 = e192.f(1937011556);
                            if (f10 == null) {
                            }
                        } else {
                            i9 = -65536;
                        }
                    }
                    i10 = (e14 == i9 && e15 == 0 && e16 == 0 && e17 == i9) ? 180 : 0;
                    if (j10 == -9223372036854775807L) {
                    }
                    y yVar322 = f12.c;
                    yVar322.C(8);
                    yVar322.D(lc.k.b(yVar322.e()) == 0 ? 8 : 16);
                    long s1022 = yVar322.s();
                    if (j13 != -9223372036854775807L) {
                    }
                    a e1822 = e11.e(1835626086);
                    e1822.getClass();
                    a e1922 = e1822.e(1937007212);
                    e1922.getClass();
                    b f1522 = e11.f(1835296868);
                    f1522.getClass();
                    y yVar422 = f1522.c;
                    yVar422.C(8);
                    int b1122 = lc.k.b(yVar422.e());
                    yVar422.D(b1122 == 0 ? 8 : 16);
                    long s1122 = yVar422.s();
                    yVar422.D(b1122 == 0 ? 4 : 8);
                    int w822 = yVar422.w();
                    Pair create222 = Pair.create(Long.valueOf(s1122), "" + ((char) (((w822 >> 10) & 31) + 96)) + ((char) (((w822 >> 5) & 31) + 96)) + ((char) ((w822 & 31) + 96)));
                    f10 = e1922.f(1937011556);
                    if (f10 == null) {
                    }
                }
                oVar = null;
                oVar2 = (o) eVar2.apply(oVar);
                if (oVar2 != null) {
                }
            }
            i45 = i11 + 1;
            aVar3 = aVar;
            cVar5 = cVar;
            arrayList6 = arrayList4;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }
}
