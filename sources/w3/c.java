package w3;

import a3.z;
import android.util.Pair;
import b2.s0;
import b2.t0;
import b2.v;
import b2.v0;
import b2.w0;
import c3.w;
import e2.j0;
import e2.m0;
import e2.x;
import e9.k0;
import e9.n0;
import e9.x1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import u2.z0;
import v7.b8;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    static {
        String str = m0.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(x xVar) {
        int i10 = xVar.b;
        xVar.O(4);
        if (xVar.m() != 1751411826) {
            i10 += 4;
        }
        xVar.N(i10);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r7v2 java.util.List), method size: 3238
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static void b(e2.x r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, b2.s r56, e2.j0 r57, int r58) {
        /*
            Method dump skipped, instructions count: 3238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.c.b(e2.x, int, int, int, int, java.lang.String, boolean, b2.s, e2.j0, int):void");
    }

    public static z0 c(int i10, x xVar) {
        xVar.N(i10 + 12);
        xVar.O(1);
        d(xVar);
        xVar.O(2);
        int A = xVar.A();
        if ((A & 128) != 0) {
            xVar.O(2);
        }
        if ((A & 64) != 0) {
            xVar.O(xVar.A());
        }
        if ((A & 32) != 0) {
            xVar.O(2);
        }
        xVar.O(1);
        d(xVar);
        String e = v0.e(xVar.A());
        if ("audio/mpeg".equals(e) || "audio/vnd.dts".equals(e) || "audio/vnd.dts.hd".equals(e)) {
            return new z0(e, null, -1L, -1L);
        }
        xVar.O(4);
        long C = xVar.C();
        long C2 = xVar.C();
        xVar.O(1);
        int d = d(xVar);
        long j10 = C2;
        byte[] bArr = new byte[d];
        xVar.k(0, d, bArr);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new z0(e, bArr, j10, C > 0 ? C : -1L);
    }

    public static int d(x xVar) {
        int A = xVar.A();
        int i10 = A & 127;
        while ((A & 128) == 128) {
            A = xVar.A();
            i10 = (i10 << 7) | (A & 127);
        }
        return i10;
    }

    public static int e(int i10) {
        return (i10 >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = r14.m();
        r10 = r14.m();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.k(0, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r11 = new f2.b(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        com.google.android.gms.internal.play_billing.k3.r("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t0 f(f2.d dVar) {
        f2.e e = dVar.e(1751411826);
        f2.e e7 = dVar.e(1801812339);
        f2.e e10 = dVar.e(1768715124);
        if (e == null || e7 == null || e10 == null) {
            return null;
        }
        x xVar = e.c;
        xVar.N(16);
        if (xVar.m() != 1835299937) {
            return null;
        }
        x xVar2 = e7.c;
        xVar2.N(12);
        int m10 = xVar2.m();
        String[] strArr = new String[m10];
        for (int i10 = 0; i10 < m10; i10++) {
            int m11 = xVar2.m();
            xVar2.O(4);
            strArr[i10] = xVar2.y(m11 - 8, StandardCharsets.UTF_8);
        }
        x xVar3 = e10.c;
        xVar3.N(8);
        ArrayList arrayList = new ArrayList();
        while (xVar3.a() > 8) {
            int i11 = xVar3.b;
            int m12 = xVar3.m();
            int m13 = xVar3.m() - 1;
            if (m13 < 0 || m13 >= m10) {
                a1.g.x(m13, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                String str = strArr[m13];
                int i12 = i11 + m12;
                while (true) {
                    int i13 = xVar3.b;
                    if (i13 >= i12) {
                        break;
                    }
                    int m14 = xVar3.m();
                    if (xVar3.m() == 1684108385) {
                        break;
                    }
                    xVar3.N(i13 + m14);
                }
                f2.b bVar = null;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            xVar3.N(i11 + m12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t0(arrayList);
    }

    public static f2.h g(x xVar) {
        long u10;
        long u11;
        xVar.N(8);
        if (e(xVar.m()) == 0) {
            u10 = xVar.C();
            u11 = xVar.C();
        } else {
            u10 = xVar.u();
            u11 = xVar.u();
        }
        return new f2.h(u10, u11, xVar.C());
    }

    public static Pair h(x xVar, int i10, int i11) {
        Integer num;
        r rVar;
        Pair create;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int i14 = xVar.b;
        while (i14 - i10 < i11) {
            xVar.N(i14);
            int m10 = xVar.m();
            c3.b.b("childAtomSize must be positive", m10 > 0);
            if (xVar.m() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer num3 = null;
                String str = null;
                while (i15 - i14 < m10) {
                    xVar.N(i15);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    if (m12 == 1718775137) {
                        num3 = Integer.valueOf(xVar.m());
                    } else if (m12 == 1935894637) {
                        xVar.O(4);
                        str = xVar.y(4, StandardCharsets.UTF_8);
                    } else if (m12 == 1935894633) {
                        i17 = i15;
                        i16 = m11;
                    }
                    i15 += m11;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    c3.b.b("frma atom is mandatory", num3 != null);
                    c3.b.b("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = num3;
                            rVar = null;
                            break;
                        }
                        xVar.N(i18);
                        int m13 = xVar.m();
                        if (xVar.m() == 1952804451) {
                            int e = e(xVar.m());
                            xVar.O(1);
                            if (e == 0) {
                                xVar.O(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int A = xVar.A();
                                i12 = A & 15;
                                i13 = (A & 240) >> 4;
                            }
                            if (xVar.A() == 1) {
                                num2 = num3;
                                z10 = true;
                            } else {
                                num2 = num3;
                                z10 = false;
                            }
                            int A2 = xVar.A();
                            byte[] bArr2 = new byte[16];
                            xVar.k(0, 16, bArr2);
                            if (z10 && A2 == 0) {
                                int A3 = xVar.A();
                                byte[] bArr3 = new byte[A3];
                                xVar.k(0, A3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            rVar = new r(z10, str, A2, bArr2, i13, i12, bArr);
                        } else {
                            i18 += m13;
                        }
                    }
                    c3.b.b("tenc atom is mandatory", rVar != null);
                    String str2 = m0.a;
                    create = Pair.create(num, rVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += m10;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:329:0x099f, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x00e5, code lost:
    
        if (r11 == 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:686:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList i(f2.d dVar, w wVar, long j10, b2.s sVar, boolean z10, boolean z11, d9.k kVar, boolean z12) {
        int i10;
        long j11;
        long j12;
        long j13;
        ArrayList arrayList;
        int i11;
        int i12;
        long j14;
        long j15;
        long a02;
        int e;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        f2.e e7;
        long[] jArr;
        long[] jArr2;
        b2.w wVar2;
        b2.w wVar3;
        d9.k kVar2;
        q qVar;
        f2.d d;
        Pair create;
        long j16;
        b2.s sVar2;
        x xVar;
        String str2;
        int i18;
        j0 j0Var;
        int i19;
        int i20;
        j0 j0Var2;
        b2.s sVar3;
        boolean z13;
        int i21;
        x xVar2;
        x1 x1Var;
        long j17;
        int i22;
        b bVar;
        boolean z14;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList2;
        q qVar2;
        long[] jArr3;
        int i26;
        boolean z15;
        long j18;
        q qVar3;
        int i27;
        int[] iArr;
        int[] iArr2;
        long j19;
        long j20;
        int i28;
        long[] jArr4;
        long j21;
        q qVar4;
        long[] jArr5;
        long j22;
        q qVar5;
        t tVar;
        ArrayList arrayList3;
        boolean z16;
        int i29;
        long[] jArr6;
        int i30;
        t tVar2;
        long a03;
        f2.d dVar2 = dVar;
        ArrayList arrayList4 = new ArrayList();
        int i31 = 0;
        for (ArrayList arrayList5 = dVar2.e; i31 < arrayList5.size(); arrayList5 = arrayList) {
            f2.d dVar3 = (f2.d) arrayList5.get(i31);
            if (dVar3.b != 1953653099) {
                arrayList = arrayList5;
                arrayList3 = arrayList4;
                i10 = i31;
            } else {
                f2.e e10 = dVar2.e(1836476516);
                e10.getClass();
                f2.d d10 = dVar3.d(1835297121);
                d10.getClass();
                f2.e e11 = d10.e(1751411826);
                e11.getClass();
                x xVar3 = e11.c;
                xVar3.N(16);
                int m10 = xVar3.m();
                int i32 = m10 == 1936684398 ? 1 : m10 == 1986618469 ? 2 : (m10 == 1952807028 || m10 == 1935832172 || m10 == 1937072756 || m10 == 1668047728 || m10 == 1937072752) ? 3 : m10 == 1835365473 ? 5 : -1;
                boolean z17 = true;
                i10 = i31;
                if (i32 == -1) {
                    arrayList = arrayList5;
                    qVar = null;
                    j11 = 0;
                    kVar2 = kVar;
                } else {
                    j11 = 0;
                    f2.e e12 = dVar3.e(1953196132);
                    e12.getClass();
                    x xVar4 = e12.c;
                    xVar4.N(8);
                    int e13 = e(xVar4.m());
                    xVar4.O(e13 != 0 ? 16 : 8);
                    int m11 = xVar4.m();
                    xVar4.O(4);
                    int i33 = xVar4.b;
                    int i34 = e13 == 0 ? 4 : 8;
                    int i35 = 0;
                    while (true) {
                        j12 = -9223372036854775807L;
                        if (i35 >= i34) {
                            xVar4.O(i34);
                            break;
                        }
                        if (xVar4.a[i33 + i35] != -1) {
                            j13 = e13 == 0 ? xVar4.C() : xVar4.G();
                        } else {
                            i35++;
                        }
                    }
                    j13 = -9223372036854775807L;
                    xVar4.O(10);
                    int H = xVar4.H();
                    xVar4.O(4);
                    int m12 = xVar4.m();
                    int m13 = xVar4.m();
                    xVar4.O(4);
                    int m14 = xVar4.m();
                    int m15 = xVar4.m();
                    arrayList = arrayList5;
                    if (m12 == 0 && m13 == 65536) {
                        i11 = i32;
                        if ((m14 == -65536 || m14 == 65536) && m15 == 0) {
                            i12 = 90;
                            xVar4.O(16);
                            short x10 = xVar4.x();
                            xVar4.O(2);
                            short x11 = xVar4.x();
                            j14 = j10 != -9223372036854775807L ? j13 : j10;
                            long j23 = g(e10.c).c;
                            if (j14 != -9223372036854775807L) {
                                j15 = j23;
                                a02 = -9223372036854775807L;
                            } else {
                                String str3 = m0.a;
                                j15 = j23;
                                a02 = m0.a0(j14, 1000000L, j15, RoundingMode.DOWN);
                            }
                            f2.d d11 = d10.d(1835626086);
                            d11.getClass();
                            f2.d d12 = d11.d(1937007212);
                            d12.getClass();
                            f2.e e14 = d10.e(1835296868);
                            e14.getClass();
                            x xVar5 = e14.c;
                            xVar5.N(8);
                            e = e(xVar5.m());
                            xVar5.O(e != 0 ? 8 : 16);
                            long C = xVar5.C();
                            int i36 = xVar5.b;
                            i13 = e != 0 ? 4 : 8;
                            i14 = 0;
                            while (true) {
                                if (i14 < i13) {
                                    i15 = i12;
                                    xVar5.O(i13);
                                    break;
                                }
                                i15 = i12;
                                i22 = e;
                                if (xVar5.a[i36 + i14] != -1) {
                                    long C2 = i22 == 0 ? xVar5.C() : xVar5.G();
                                    if (C2 != 0) {
                                        String str4 = m0.a;
                                        j12 = m0.a0(C2, 1000000L, C, RoundingMode.DOWN);
                                    }
                                } else {
                                    i14++;
                                    i12 = i15;
                                    e = i22;
                                }
                            }
                            long j24 = j12;
                            int H2 = xVar5.H();
                            char[] cArr = {(char) (((H2 >> 10) & 31) + 96), (char) (((H2 >> 5) & 31) + 96), (char) ((H2 & 31) + 96)};
                            i17 = 0;
                            for (i16 = 3; i17 < i16; i16 = 3) {
                                char c10 = cArr[i17];
                                if (c10 < 'a' || c10 > 'z') {
                                    str = null;
                                    break;
                                }
                                i17++;
                            }
                            str = new String(cArr);
                            e7 = d12.e(1937011556);
                            if (e7 != null) {
                                e2.a.l("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            } else {
                                x xVar6 = e7.c;
                                xVar6.N(12);
                                int m16 = xVar6.m();
                                j0 j0Var3 = new j0();
                                j0Var3.c = new r[m16];
                                j0Var3.b = 0;
                                int i37 = 0;
                                while (i37 < m16) {
                                    int i38 = m16;
                                    int i39 = xVar6.b;
                                    int m17 = xVar6.m();
                                    long j25 = a02;
                                    c3.b.b("childAtomSize must be positive", m17 > 0 ? z17 : false);
                                    int m18 = xVar6.m();
                                    if (m18 == 1635148593 || m18 == 1635148595 || m18 == 1701733238 || m18 == 1831958048 || m18 == 1836070006 || m18 == 1752589105 || m18 == 1751479857 || m18 == 1987470129 || m18 == 1987471665 || m18 == 1932670515 || m18 == 1211250227 || m18 == 1748121139 || m18 == 1987063864 || m18 == 1987063865 || m18 == 1635135537 || m18 == 1685479798 || m18 == 1685479729 || m18 == 1685481573 || m18 == 1685481521 || m18 == 1634760241 || m18 == 1684108849 || m18 == 1634743416 || m18 == 1634743400 || m18 == 1634755432 || m18 == 1634755438 || m18 == 1634755443) {
                                        j16 = j24;
                                        sVar2 = sVar;
                                        xVar = xVar6;
                                        str2 = str;
                                        i18 = m18;
                                        j0Var = j0Var3;
                                        i19 = i37;
                                        i20 = i15;
                                    } else if (m18 == 1634755439) {
                                        sVar2 = sVar;
                                        xVar = xVar6;
                                        str2 = str;
                                        i18 = m18;
                                        j0Var = j0Var3;
                                        j16 = j24;
                                        i19 = i37;
                                        i20 = i15;
                                    } else {
                                        if (m18 == 1836069985 || m18 == 1701733217 || m18 == 1633889587 || m18 == 1700998451 || m18 == 1633889588 || m18 == 1835823201 || m18 == 1685353315 || m18 == 1685353317 || m18 == 1685353320 || m18 == 1685353324 || m18 == 1685353336 || m18 == 1935764850 || m18 == 1935767394 || m18 == 1819304813 || m18 == 1936684916 || m18 == 1953984371 || m18 == 778924082 || m18 == 778924083 || m18 == 1835557169 || m18 == 1835560241 || m18 == 1634492771 || m18 == 1634492791 || m18 == 1970037111 || m18 == 1332770163 || m18 == 1716281667 || m18 == 1767992678 || m18 == 1768973165) {
                                            j16 = j24;
                                            sVar3 = sVar;
                                            z13 = z11;
                                            xVar = xVar6;
                                            str2 = str;
                                            i21 = m18;
                                            j0Var = j0Var3;
                                            i19 = i37;
                                        } else if (m18 == 1718641517) {
                                            sVar3 = sVar;
                                            z13 = z11;
                                            xVar = xVar6;
                                            str2 = str;
                                            i21 = m18;
                                            j0Var = j0Var3;
                                            j16 = j24;
                                            i19 = i37;
                                        } else {
                                            if (m18 == 1414810956 || m18 == 1954034535 || m18 == 2004251764 || m18 == 1937010800 || m18 == 1664495672 || m18 == 1836070003) {
                                                xVar6.N(i39 + 16);
                                                String str5 = "application/ttml+xml";
                                                if (m18 != 1414810956) {
                                                    if (m18 == 1954034535) {
                                                        int i40 = m17 - 16;
                                                        byte[] bArr = new byte[i40];
                                                        xVar6.k(0, i40, bArr);
                                                        x1Var = n0.y(bArr);
                                                        str5 = "application/x-quicktime-tx3g";
                                                        xVar2 = xVar6;
                                                        j16 = j24;
                                                        j17 = Long.MAX_VALUE;
                                                        if (str5 != null) {
                                                            v vVar = new v();
                                                            vVar.a = Integer.toString(m11);
                                                            vVar.r = v0.n(str5);
                                                            vVar.d = str;
                                                            vVar.w = j17;
                                                            vVar.u = x1Var;
                                                            j0Var3.d = new b2.w(vVar);
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i19 = i37;
                                                        i20 = i15;
                                                        xVar6 = xVar2;
                                                    } else if (m18 == 2004251764) {
                                                        str5 = "application/x-mp4-vtt";
                                                    } else if (m18 == 1937010800) {
                                                        xVar2 = xVar6;
                                                        j16 = j24;
                                                        j17 = 0;
                                                        x1Var = null;
                                                        if (str5 != null) {
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i19 = i37;
                                                        i20 = i15;
                                                        xVar6 = xVar2;
                                                    } else if (m18 == 1664495672) {
                                                        j0Var3.b = z17 ? 1 : 0;
                                                        str5 = "application/x-mp4-cea-608";
                                                    } else {
                                                        if (m18 != 1836070003) {
                                                            throw new IllegalStateException();
                                                        }
                                                        int i41 = xVar6.b;
                                                        xVar6.O(4);
                                                        if (xVar6.m() == 1702061171) {
                                                            byte[] bArr2 = (byte[]) c(i41, xVar6).d;
                                                            if (bArr2 == null || bArr2.length != 64) {
                                                                xVar2 = xVar6;
                                                                j16 = j24;
                                                                str2 = str;
                                                                j0Var2 = j0Var3;
                                                                i19 = i37;
                                                                i20 = i15;
                                                                xVar6 = xVar2;
                                                            } else {
                                                                u6.p(bArr2.length == 64);
                                                                ArrayList arrayList6 = new ArrayList(16);
                                                                xVar2 = xVar6;
                                                                int i42 = 0;
                                                                while (i42 < bArr2.length - 3) {
                                                                    byte[] bArr3 = bArr2;
                                                                    int i43 = i42;
                                                                    long j26 = j24;
                                                                    int c11 = b8.c(bArr2[i42], bArr3[i42 + 1], bArr3[i42 + 2], bArr3[i43 + 3]);
                                                                    int i44 = (c11 >> 16) & 255;
                                                                    int i45 = ((c11 >> 8) & 255) - 128;
                                                                    int i46 = (c11 & 255) - 128;
                                                                    arrayList6.add(String.format("%06x", Integer.valueOf(m0.i(((i46 * 17790) / 10000) + i44, 0, 255) | (m0.i(((i45 * 14075) / 10000) + i44, 0, 255) << 16) | (m0.i((i44 - ((i46 * 3455) / 10000)) - ((i45 * 7169) / 10000), 0, 255) << 8))));
                                                                    i42 = i43 + 4;
                                                                    bArr2 = bArr3;
                                                                    j24 = j26;
                                                                }
                                                                j16 = j24;
                                                                StringBuilder m19 = i2.e.m("size: ", x10, "x", x11, "\npalette: ");
                                                                m19.append(new d9.l(", ", 0).e(arrayList6));
                                                                m19.append("\n");
                                                                String sb2 = m19.toString();
                                                                String str6 = m0.a;
                                                                str5 = "application/vobsub";
                                                                x1Var = n0.y(sb2.getBytes(StandardCharsets.UTF_8));
                                                            }
                                                        } else {
                                                            xVar2 = xVar6;
                                                            j16 = j24;
                                                            x1Var = null;
                                                            str5 = null;
                                                        }
                                                        j17 = Long.MAX_VALUE;
                                                        if (str5 != null) {
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i19 = i37;
                                                        i20 = i15;
                                                        xVar6 = xVar2;
                                                    }
                                                }
                                                xVar2 = xVar6;
                                                j16 = j24;
                                                j17 = Long.MAX_VALUE;
                                                x1Var = null;
                                                if (str5 != null) {
                                                }
                                                str2 = str;
                                                j0Var2 = j0Var3;
                                                i19 = i37;
                                                i20 = i15;
                                                xVar6 = xVar2;
                                            } else {
                                                if (m18 == 1835365492) {
                                                    xVar6.N(i39 + 16);
                                                    if (m18 == 1835365492) {
                                                        xVar6.v();
                                                        String v = xVar6.v();
                                                        if (v != null) {
                                                            v vVar2 = new v();
                                                            vVar2.a = Integer.toString(m11);
                                                            vVar2.r = v0.n(v);
                                                            j0Var3.d = new b2.w(vVar2);
                                                        }
                                                    }
                                                } else if (m18 == 1667329389) {
                                                    v vVar3 = new v();
                                                    vVar3.a = Integer.toString(m11);
                                                    vVar3.r = v0.n("application/x-camera-motion");
                                                    j0Var3.d = new b2.w(vVar3);
                                                }
                                                str2 = str;
                                                j0Var2 = j0Var3;
                                                j16 = j24;
                                                i19 = i37;
                                                i20 = i15;
                                            }
                                            xVar6.N(i39 + m17);
                                            i37 = i19 + 1;
                                            j0Var3 = j0Var2;
                                            str = str2;
                                            i15 = i20;
                                            m16 = i38;
                                            a02 = j25;
                                            j24 = j16;
                                            z17 = true;
                                        }
                                        b(xVar, i21, i39, m17, m11, str2, z13, sVar3, j0Var, i19);
                                        i20 = i15;
                                        xVar6 = xVar;
                                        j0Var2 = j0Var;
                                        xVar6.N(i39 + m17);
                                        i37 = i19 + 1;
                                        j0Var3 = j0Var2;
                                        str = str2;
                                        i15 = i20;
                                        m16 = i38;
                                        a02 = j25;
                                        j24 = j16;
                                        z17 = true;
                                    }
                                    k(xVar, i18, i39, m17, m11, str2, i20, sVar2, j0Var, i19);
                                    xVar6 = xVar;
                                    j0Var2 = j0Var;
                                    xVar6.N(i39 + m17);
                                    i37 = i19 + 1;
                                    j0Var3 = j0Var2;
                                    str = str2;
                                    i15 = i20;
                                    m16 = i38;
                                    a02 = j25;
                                    j24 = j16;
                                    z17 = true;
                                }
                                long j27 = a02;
                                j0 j0Var4 = j0Var3;
                                long j28 = j24;
                                if (!z10 && (d = dVar3.d(1701082227)) != null) {
                                    f2.e e15 = d.e(1701606260);
                                    if (e15 == null) {
                                        create = null;
                                    } else {
                                        x xVar7 = e15.c;
                                        xVar7.N(8);
                                        int e16 = e(xVar7.m());
                                        int E = xVar7.E();
                                        long[] jArr7 = new long[E];
                                        long[] jArr8 = new long[E];
                                        for (int i47 = 0; i47 < E; i47++) {
                                            jArr7[i47] = e16 == 1 ? xVar7.G() : xVar7.C();
                                            jArr8[i47] = e16 == 1 ? xVar7.u() : xVar7.m();
                                            if (xVar7.x() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            xVar7.O(2);
                                        }
                                        create = Pair.create(jArr7, jArr8);
                                    }
                                    if (create != null) {
                                        long[] jArr9 = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        jArr = jArr9;
                                        wVar2 = (b2.w) j0Var4.d;
                                        if (wVar2 != null) {
                                            if (H != 0) {
                                                f2.c cVar = new f2.c(H);
                                                v a2 = wVar2.a();
                                                t0 t0Var = ((b2.w) j0Var4.d).l;
                                                a2.k = t0Var != null ? t0Var.a(cVar) : new t0(cVar);
                                                wVar3 = new b2.w(a2);
                                            } else {
                                                wVar3 = wVar2;
                                            }
                                            kVar2 = kVar;
                                            qVar = new q(m11, i11, C, j15, j27, j28, wVar3, j0Var4.b, (r[]) j0Var4.c, j0Var4.a, jArr, jArr2);
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                wVar2 = (b2.w) j0Var4.d;
                                if (wVar2 != null) {
                                }
                            }
                            kVar2 = kVar;
                            qVar = null;
                        }
                    } else {
                        i11 = i32;
                    }
                    i12 = (m12 == 0 && m13 == -65536 && (m14 == 65536 || m14 == -65536) && m15 == 0) ? 270 : ((m12 == -65536 || m12 == 65536) && m13 == 0 && m14 == 0 && m15 == -65536) ? 180 : 0;
                    xVar4.O(16);
                    short x102 = xVar4.x();
                    xVar4.O(2);
                    short x112 = xVar4.x();
                    if (j10 != -9223372036854775807L) {
                    }
                    long j232 = g(e10.c).c;
                    if (j14 != -9223372036854775807L) {
                    }
                    f2.d d112 = d10.d(1835626086);
                    d112.getClass();
                    f2.d d122 = d112.d(1937007212);
                    d122.getClass();
                    f2.e e142 = d10.e(1835296868);
                    e142.getClass();
                    x xVar52 = e142.c;
                    xVar52.N(8);
                    e = e(xVar52.m());
                    xVar52.O(e != 0 ? 8 : 16);
                    long C3 = xVar52.C();
                    int i362 = xVar52.b;
                    if (e != 0) {
                    }
                    i14 = 0;
                    while (true) {
                        if (i14 < i13) {
                        }
                        i14++;
                        i12 = i15;
                        e = i22;
                    }
                    long j242 = j12;
                    int H22 = xVar52.H();
                    char[] cArr2 = {(char) (((H22 >> 10) & 31) + 96), (char) (((H22 >> 5) & 31) + 96), (char) ((H22 & 31) + 96)};
                    i17 = 0;
                    while (i17 < i16) {
                    }
                    str = new String(cArr2);
                    e7 = d122.e(1937011556);
                    if (e7 != null) {
                    }
                    kVar2 = kVar;
                    qVar = null;
                }
                q qVar6 = (q) kVar2.apply(qVar);
                if (qVar6 == null) {
                    arrayList3 = arrayList4;
                } else {
                    b2.w wVar4 = qVar6.g;
                    f2.d d13 = dVar3.d(1835297121);
                    d13.getClass();
                    f2.d d14 = d13.d(1835626086);
                    d14.getClass();
                    f2.d d15 = d14.d(1937007212);
                    d15.getClass();
                    f2.e e17 = d15.e(1937011578);
                    if (e17 != null) {
                        bVar = new b4.d(e17, wVar4);
                    } else {
                        f2.e e18 = d15.e(1937013298);
                        if (e18 == null) {
                            throw w0.a(null, "Track has no sample table size information");
                        }
                        e2.s sVar4 = new e2.s();
                        x xVar8 = e18.c;
                        sVar4.e = xVar8;
                        xVar8.N(12);
                        sVar4.b = xVar8.E() & 255;
                        sVar4.a = xVar8.E();
                        bVar = sVar4;
                    }
                    int b10 = bVar.b();
                    if (b10 == 0) {
                        arrayList3 = arrayList4;
                        tVar = new t(qVar6, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (qVar6.b == 2) {
                            long j29 = qVar6.f;
                            if (j29 > j11) {
                                v a10 = wVar4.a();
                                a10.C = b10 / (j29 / 1000000.0f);
                                qVar6 = qVar6.a(new b2.w(a10));
                            }
                        }
                        b2.w wVar5 = qVar6.g;
                        f2.e e19 = d15.e(1937007471);
                        if (e19 == null) {
                            e19 = d15.e(1668232756);
                            e19.getClass();
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        x xVar9 = e19.c;
                        f2.e e20 = d15.e(1937011555);
                        e20.getClass();
                        x xVar10 = e20.c;
                        f2.e e21 = d15.e(1937011827);
                        e21.getClass();
                        x xVar11 = e21.c;
                        f2.e e22 = d15.e(1937011571);
                        x xVar12 = e22 != null ? e22.c : null;
                        f2.e e23 = d15.e(1668576371);
                        x xVar13 = e23 != null ? e23.c : null;
                        a aVar = new a(xVar10, xVar9, z14);
                        xVar11.N(12);
                        int E2 = xVar11.E() - 1;
                        int E3 = xVar11.E();
                        int E4 = xVar11.E();
                        if (xVar13 != null) {
                            xVar13.N(12);
                            i23 = xVar13.E();
                        } else {
                            i23 = 0;
                        }
                        if (xVar12 != null) {
                            xVar12.N(12);
                            int E5 = xVar12.E();
                            if (E5 > 0) {
                                i25 = E5;
                                i24 = xVar12.E() - 1;
                            } else {
                                i25 = E5;
                                i24 = -1;
                                xVar12 = null;
                            }
                        } else {
                            i24 = -1;
                            i25 = 0;
                        }
                        int a11 = bVar.a();
                        x xVar14 = xVar13;
                        String str7 = wVar5.s;
                        boolean z18 = a11 != -1 && ("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && E2 == 0 && i23 == 0 && i25 == 0;
                        ArrayList arrayList7 = new ArrayList();
                        boolean z19 = xVar12 == null;
                        if (z18) {
                            int i48 = aVar.a;
                            long[] jArr10 = new long[i48];
                            int[] iArr3 = new int[i48];
                            while (aVar.a()) {
                                int i49 = aVar.b;
                                jArr10[i49] = aVar.d;
                                iArr3[i49] = aVar.c;
                            }
                            long j30 = E4;
                            int i50 = 8192 / a11;
                            int i51 = 0;
                            for (int i52 = 0; i52 < i48; i52++) {
                                i51 += m0.g(iArr3[i52], i50);
                            }
                            jArr4 = new long[i51];
                            iArr = new int[i51];
                            jArr3 = new long[i51];
                            iArr2 = new int[i51];
                            int i53 = 0;
                            int i54 = 0;
                            int i55 = 0;
                            i28 = 0;
                            int i56 = 0;
                            while (i53 < i48) {
                                int i57 = iArr3[i53];
                                long j31 = jArr10[i53];
                                int i58 = i56;
                                int i59 = i53;
                                int i60 = i28;
                                int i61 = i58;
                                int i62 = i48;
                                int i63 = i57;
                                while (i63 > 0) {
                                    int min = Math.min(i50, i63);
                                    jArr4[i61] = j31;
                                    int i64 = i63;
                                    int i65 = a11 * min;
                                    iArr[i61] = i65;
                                    i60 = Math.max(i60, i65);
                                    long j32 = j30;
                                    jArr3[i61] = j32 * i54;
                                    iArr2[i61] = 1;
                                    j31 += iArr[i61];
                                    i54 += min;
                                    i61++;
                                    i55 += i65;
                                    i63 = i64 - min;
                                    j30 = j32;
                                }
                                int i66 = i59 + 1;
                                i56 = i61;
                                i28 = i60;
                                i53 = i66;
                                i48 = i62;
                            }
                            long j33 = i54 * j30;
                            j20 = i55;
                            if (z12) {
                                jArr4 = new long[0];
                            }
                            if (z12) {
                                iArr = new int[0];
                            }
                            if (z12) {
                                jArr3 = new long[0];
                            }
                            if (z12) {
                                iArr2 = new int[0];
                            }
                            arrayList2 = arrayList4;
                            j19 = j33;
                            i27 = i51;
                            qVar3 = qVar6;
                        } else {
                            long[] jArr11 = z12 ? new long[0] : new long[b10];
                            b bVar2 = bVar;
                            int[] iArr4 = z12 ? new int[0] : new int[b10];
                            int i67 = i24;
                            long[] jArr12 = z12 ? new long[0] : new long[b10];
                            int[] iArr5 = z12 ? new int[0] : new int[b10];
                            arrayList2 = arrayList4;
                            int i68 = i67;
                            int i69 = E2;
                            long j34 = j11;
                            long j35 = j34;
                            long j36 = j35;
                            int i70 = 0;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            x xVar15 = xVar12;
                            int i74 = i25;
                            int i75 = i23;
                            int i76 = E4;
                            int i77 = E3;
                            int i78 = 0;
                            while (true) {
                                if (i71 >= b10) {
                                    qVar2 = qVar6;
                                    jArr3 = jArr12;
                                    break;
                                }
                                boolean z20 = true;
                                while (i72 == 0) {
                                    z20 = aVar.a();
                                    if (!z20) {
                                        break;
                                    }
                                    j36 = aVar.d;
                                    i72 = aVar.c;
                                    qVar6 = qVar6;
                                    i70 = i70;
                                }
                                qVar2 = qVar6;
                                int i79 = i70;
                                if (z20) {
                                    i70 = i79;
                                    if (xVar14 != null) {
                                        while (i73 == 0 && i75 > 0) {
                                            i73 = xVar14.E();
                                            i70 = xVar14.m();
                                            i75--;
                                        }
                                        i73--;
                                    }
                                    int c12 = bVar2.c();
                                    int i80 = b10;
                                    int[] iArr6 = iArr4;
                                    long j37 = c12;
                                    j35 += j37;
                                    if (c12 > i78) {
                                        i78 = c12;
                                    }
                                    if (z12) {
                                        j21 = j37;
                                    } else {
                                        jArr11[i71] = j36;
                                        iArr6[i71] = c12;
                                        j21 = j37;
                                        jArr12[i71] = j34 + i70;
                                        iArr5[i71] = xVar15 == null ? 1 : 0;
                                        if (i71 == i68) {
                                            iArr5[i71] = 1;
                                            arrayList7.add(Integer.valueOf(i71));
                                        }
                                    }
                                    if (xVar15 != null && i71 == i68 && i74 - 1 > 0) {
                                        i68 = xVar15.E() - 1;
                                    }
                                    j34 += i76;
                                    i77--;
                                    if (i77 == 0 && i69 > 0) {
                                        i69--;
                                        i77 = xVar11.E();
                                        i76 = xVar11.m();
                                    }
                                    j36 += j21;
                                    i72--;
                                    i71++;
                                    b10 = i80;
                                    qVar6 = qVar2;
                                    iArr4 = iArr6;
                                } else {
                                    e2.a.l("BoxParsers", "Unexpected end of chunk data");
                                    if (z12) {
                                        b10 = i71;
                                        jArr3 = jArr12;
                                        i26 = i72;
                                        i70 = i79;
                                    } else {
                                        long[] copyOf = Arrays.copyOf(jArr11, i71);
                                        iArr4 = Arrays.copyOf(iArr4, i71);
                                        jArr3 = Arrays.copyOf(jArr12, i71);
                                        b10 = i71;
                                        iArr5 = Arrays.copyOf(iArr5, i71);
                                        i70 = i79;
                                        jArr11 = copyOf;
                                    }
                                }
                            }
                            long j38 = j34 + i70;
                            if (xVar14 != null) {
                                while (i75 > 0) {
                                    if (xVar14.E() != 0) {
                                        z15 = false;
                                        break;
                                    }
                                    xVar14.m();
                                    i75--;
                                }
                            }
                            z15 = true;
                            if (i74 == 0 && i77 == 0 && i26 == 0 && i69 == 0 && i73 == 0 && z15) {
                                j18 = j38;
                                qVar3 = qVar2;
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                j18 = j38;
                                qVar3 = qVar2;
                                boolean z21 = z15;
                                i2.e.w(sb3, qVar3.a, ": remainingSynchronizationSamples ", i74, ", remainingSamplesAtTimestampDelta ");
                                i2.e.w(sb3, i77, ", remainingSamplesInChunk ", i26, ", remainingTimestampDeltaChanges ");
                                sb3.append(i69);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(i73);
                                sb3.append(!z21 ? ", ctts invalid" : "");
                                e2.a.l("BoxParsers", sb3.toString());
                            }
                            i27 = b10;
                            iArr = iArr4;
                            iArr2 = iArr5;
                            j19 = j18;
                            j20 = j35;
                            i28 = i78;
                            jArr4 = jArr11;
                        }
                        long j39 = qVar3.f;
                        if (j39 > j11) {
                            long a04 = m0.a0(j20 * 8, 1000000L, j39, RoundingMode.HALF_DOWN);
                            if (a04 > j11 && a04 < 2147483647L) {
                                v a12 = wVar5.a();
                                a12.h = (int) a04;
                                qVar4 = qVar3.a(new b2.w(a12));
                                int i81 = qVar4.b;
                                long j40 = qVar4.c;
                                b2.w wVar6 = qVar4.g;
                                long[] jArr13 = qVar4.j;
                                jArr5 = qVar4.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long a05 = m0.a0(j19, 1000000L, j40, roundingMode);
                                int[] f7 = b8.f(arrayList7);
                                if (jArr5 != null) {
                                    if (!z12) {
                                        m0.Z(jArr3, j40);
                                    }
                                    tVar2 = new t(qVar4, jArr4, iArr, i28, jArr3, iArr2, f7, z19, a05, i27);
                                } else {
                                    q qVar7 = qVar4;
                                    long[] jArr14 = jArr4;
                                    int[] iArr7 = iArr;
                                    long[] jArr15 = jArr3;
                                    int[] iArr8 = iArr2;
                                    int i82 = i28;
                                    if (z12) {
                                        jArr13.getClass();
                                        if (jArr5.length == 1 && jArr5[0] == j11) {
                                            a03 = m0.a0(j19 - jArr13[0], 1000000L, qVar7.c, roundingMode);
                                        } else {
                                            long j41 = j11;
                                            for (int i83 = 0; i83 < jArr5.length; i83++) {
                                                if (jArr13[i83] != -1) {
                                                    j41 += jArr5[i83];
                                                }
                                            }
                                            a03 = m0.a0(j41, 1000000L, qVar7.d, RoundingMode.DOWN);
                                        }
                                        tVar2 = new t(qVar7, jArr14, iArr7, i82, jArr15, iArr8, f7, z19, a03, i27);
                                    } else {
                                        if (jArr5.length == 1 && i81 == 1 && jArr15.length >= 2) {
                                            jArr13.getClass();
                                            long j42 = jArr13[0];
                                            j22 = -1;
                                            long a06 = j42 + m0.a0(jArr5[0], qVar7.c, qVar7.d, roundingMode);
                                            int length = jArr15.length - 1;
                                            if (jArr15[0] <= j42 && j42 < jArr15[m0.i(4, 0, length)] && jArr15[m0.i(jArr15.length - 4, 0, length)] < a06 && a06 <= j19 + 2) {
                                                long max = Math.max(j11, j19 - a06);
                                                long a07 = m0.a0(j42 - jArr15[0], wVar6.L, qVar7.c, roundingMode);
                                                long a08 = m0.a0(max, wVar6.L, qVar7.c, roundingMode);
                                                if ((a07 != j11 || a08 != j11) && a07 <= 2147483647L && a08 <= 2147483647L) {
                                                    wVar.a = (int) a07;
                                                    wVar.b = (int) a08;
                                                    m0.Z(jArr15, j40);
                                                    tVar2 = new t(qVar7, jArr14, iArr7, i82, jArr15, iArr8, f7, z19, m0.a0(jArr5[0], 1000000L, qVar7.d, roundingMode), i27);
                                                }
                                            }
                                        } else {
                                            j22 = -1;
                                        }
                                        int i84 = 1;
                                        if (jArr5.length == 1) {
                                            if (jArr5[0] == 0) {
                                                jArr13.getClass();
                                                long j43 = jArr13[0];
                                                for (int i85 = 0; i85 < jArr15.length; i85++) {
                                                    jArr15[i85] = m0.a0(jArr15[i85] - j43, 1000000L, qVar7.c, RoundingMode.DOWN);
                                                }
                                                tVar2 = new t(qVar7, jArr14, iArr7, i82, jArr15, iArr8, f7, z19, m0.a0(j19 - j43, 1000000L, qVar7.c, RoundingMode.DOWN), i27);
                                            } else {
                                                i84 = 1;
                                            }
                                        }
                                        int i86 = i27;
                                        boolean z22 = i81 == i84;
                                        int[] iArr9 = new int[jArr5.length];
                                        int[] iArr10 = new int[jArr5.length];
                                        jArr13.getClass();
                                        int i87 = 0;
                                        int i88 = 0;
                                        int i89 = 0;
                                        boolean z23 = false;
                                        while (i89 < jArr5.length) {
                                            ArrayList arrayList8 = arrayList7;
                                            long j44 = jArr13[i89];
                                            if (j44 != j22) {
                                                i29 = i89;
                                                jArr6 = jArr13;
                                                long a09 = m0.a0(jArr5[i89], qVar7.c, qVar7.d, RoundingMode.DOWN) + j44;
                                                boolean z24 = z23;
                                                iArr9[i29] = m0.f(jArr15, j44, true);
                                                int b11 = m0.b(jArr15, a09, z22);
                                                int i90 = b11 - 1;
                                                z16 = z22;
                                                int i91 = 0;
                                                while (b11 < jArr15.length) {
                                                    if (jArr15[b11] >= a09) {
                                                        i91++;
                                                        if (i91 > wVar6.u) {
                                                            break;
                                                        }
                                                    } else {
                                                        i90 = b11;
                                                    }
                                                    b11++;
                                                }
                                                iArr10[i29] = i90 + 1;
                                                int i92 = iArr9[i29];
                                                while (true) {
                                                    i30 = iArr9[i29];
                                                    if (i30 <= 0 || (iArr8[i30] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr9[i29] = i30 - 1;
                                                }
                                                if (i30 == 0 && (iArr8[0] & 1) == 0) {
                                                    iArr9[i29] = i92;
                                                    while (true) {
                                                        int i93 = iArr9[i29];
                                                        if (i93 >= iArr10[i29] || (iArr8[i93] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr9[i29] = i93 + 1;
                                                    }
                                                }
                                                int i94 = iArr10[i29];
                                                int i95 = iArr9[i29];
                                                int i96 = (i94 - i95) + i87;
                                                boolean z25 = i88 != i95;
                                                i88 = i94;
                                                z23 = z24 | z25;
                                                i87 = i96;
                                            } else {
                                                z16 = z22;
                                                i29 = i89;
                                                jArr6 = jArr13;
                                            }
                                            i89 = i29 + 1;
                                            arrayList7 = arrayList8;
                                            jArr13 = jArr6;
                                            z22 = z16;
                                        }
                                        ArrayList arrayList9 = arrayList7;
                                        long[] jArr16 = jArr13;
                                        boolean z26 = z23 | (i87 != i86);
                                        long[] jArr17 = z26 ? new long[i87] : jArr14;
                                        int[] iArr11 = z26 ? new int[i87] : iArr7;
                                        if (z26) {
                                            i82 = 0;
                                        }
                                        int[] iArr12 = z26 ? new int[i87] : iArr8;
                                        ArrayList arrayList10 = z26 ? new ArrayList() : arrayList9;
                                        long[] jArr18 = new long[i87];
                                        int i97 = 0;
                                        boolean z27 = false;
                                        int i98 = 0;
                                        long j45 = 0;
                                        while (i97 < jArr5.length) {
                                            long j46 = jArr16[i97];
                                            int i99 = iArr9[i97];
                                            long[] jArr19 = jArr18;
                                            int i100 = iArr10[i97];
                                            b2.w wVar7 = wVar6;
                                            if (z26) {
                                                int i101 = i100 - i99;
                                                System.arraycopy(jArr14, i99, jArr17, i98, i101);
                                                System.arraycopy(iArr7, i99, iArr11, i98, i101);
                                                System.arraycopy(iArr8, i99, iArr12, i98, i101);
                                            }
                                            int i102 = i82;
                                            while (i99 < i100) {
                                                int i103 = i99;
                                                int i104 = i100;
                                                long j47 = qVar7.d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long a010 = m0.a0(j45, 1000000L, j47, roundingMode2);
                                                long a011 = m0.a0(jArr15[i103] - j46, 1000000L, qVar7.c, roundingMode2);
                                                if (a011 < 0) {
                                                    z27 = true;
                                                }
                                                jArr19[i98] = a010 + a011;
                                                if (z26 && iArr11[i98] > i102) {
                                                    i102 = iArr7[i103];
                                                }
                                                if (z26 && !z19 && (iArr12[i98] & 1) != 0) {
                                                    arrayList10.add(Integer.valueOf(i98));
                                                }
                                                i98++;
                                                i99 = i103 + 1;
                                                i100 = i104;
                                            }
                                            j45 += jArr5[i97];
                                            i97++;
                                            i82 = i102;
                                            wVar6 = wVar7;
                                            jArr18 = jArr19;
                                        }
                                        long[] jArr20 = jArr18;
                                        b2.w wVar8 = wVar6;
                                        long a012 = m0.a0(j45, 1000000L, qVar7.d, RoundingMode.DOWN);
                                        if (z27) {
                                            v a13 = wVar8.a();
                                            a13.x = true;
                                            qVar5 = qVar7.a(new b2.w(a13));
                                        } else {
                                            qVar5 = qVar7;
                                        }
                                        tVar = new t(qVar5, jArr17, iArr11, i82, jArr20, iArr12, b8.f(arrayList10), z19, a012, jArr17.length);
                                        arrayList3 = arrayList2;
                                        arrayList3.add(tVar);
                                        i31 = i10 + 1;
                                        dVar2 = dVar;
                                        arrayList4 = arrayList3;
                                    }
                                }
                                tVar = tVar2;
                                arrayList3 = arrayList2;
                            }
                        }
                        qVar4 = qVar3;
                        int i812 = qVar4.b;
                        long j402 = qVar4.c;
                        b2.w wVar62 = qVar4.g;
                        long[] jArr132 = qVar4.j;
                        jArr5 = qVar4.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long a052 = m0.a0(j19, 1000000L, j402, roundingMode3);
                        int[] f72 = b8.f(arrayList7);
                        if (jArr5 != null) {
                        }
                        tVar = tVar2;
                        arrayList3 = arrayList2;
                    }
                    arrayList3.add(tVar);
                    i31 = i10 + 1;
                    dVar2 = dVar;
                    arrayList4 = arrayList3;
                }
            }
            i31 = i10 + 1;
            dVar2 = dVar;
            arrayList4 = arrayList3;
        }
        return arrayList4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        r1.N(r9);
        r1.O(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
    
        r9 = new q3.k(r0, r8, r1.w(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024c, code lost:
    
        e2.a.b("MetadataUtil", "Skipped unknown metadata entry: " + f2.f.a(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
    
        r1.N(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0077, code lost:
    
        r0 = q3.j.a(w3.p.g(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0080, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        r9 = new q3.n("TCON", r12, e9.n0.y(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008c, code lost:
    
        e2.a.l("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0091, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027f, code lost:
    
        r1.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0282, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b9, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c0, code lost:
    
        if (r0 != 6516084) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c2, code lost:
    
        r9 = w3.p.d(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ca, code lost:
    
        if (r0 == 7233901) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cf, code lost:
    
        if (r0 != 7631467) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d6, code lost:
    
        if (r0 == 6516589) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01db, code lost:
    
        if (r0 != 7828084) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e2, code lost:
    
        if (r0 != 6578553) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e4, code lost:
    
        r9 = w3.p.k(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ee, code lost:
    
        if (r0 != 4280916) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f0, code lost:
    
        r9 = w3.p.k(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fa, code lost:
    
        if (r0 != 7630703) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.N(r7);
        r7 = r7 + r13;
        r1.O(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01fc, code lost:
    
        r9 = w3.p.k(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0206, code lost:
    
        if (r0 != 6384738) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0208, code lost:
    
        r9 = w3.p.k(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0212, code lost:
    
        if (r0 != 7108978) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0214, code lost:
    
        r9 = w3.p.k(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x021e, code lost:
    
        if (r0 != 6776174) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0220, code lost:
    
        r9 = w3.p.k(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0228, code lost:
    
        if (r0 != 6779504) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022a, code lost:
    
        r9 = w3.p.k(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0234, code lost:
    
        if (r0 != 7173742) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0236, code lost:
    
        r9 = w3.p.k(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0241, code lost:
    
        if (r0 != 7173737) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0243, code lost:
    
        r9 = w3.p.h(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0264, code lost:
    
        r9 = w3.p.k(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x026c, code lost:
    
        r9 = w3.p.k(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0287, code lost:
    
        if (r6.isEmpty() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x028b, code lost:
    
        r12 = new b2.t0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.m() + r13;
        r13 = r1.m();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r9 = w3.p.f(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        r1.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0274, code lost:
    
        if (r9 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0276, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0279, code lost:
    
        r3 = false;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        r9 = w3.p.f(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r9 = w3.p.h(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r9 = w3.p.h(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r9 = w3.p.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        r9 = w3.p.k(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        r9 = w3.p.k(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        r9 = w3.p.k(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r9 = w3.p.k(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        r9 = w3.p.k(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        r9 = w3.p.k(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        r9 = w3.p.h(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r9 = w3.p.h(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r9 = w3.p.k(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r9 = w3.p.k(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        if (r13 != 757935405) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
    
        if (r13 >= r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
    
        r14 = r1.m();
        r12 = r1.m();
        r1.O(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016e, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0170, code lost:
    
        r0 = r1.w(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017a, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
    
        r8 = r1.w(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0186, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0188, code lost:
    
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018a, code lost:
    
        r1.O(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0197, code lost:
    
        if (r9 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b0, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
    
        r1.N(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t0 j(f2.e eVar) {
        int i10;
        boolean z10;
        t0 t0Var;
        t0 t0Var2;
        int i11;
        x xVar = eVar.c;
        int i12 = 8;
        xVar.N(8);
        boolean z11 = false;
        t0 t0Var3 = new t0(new s0[0]);
        while (xVar.a() >= i12) {
            int i13 = xVar.b;
            int m10 = xVar.m();
            int m11 = xVar.m();
            String str = null;
            if (m11 == 1835365473) {
                xVar.N(i13);
                int i14 = i13 + m10;
                xVar.O(i12);
                a(xVar);
                while (true) {
                    int i15 = xVar.b;
                    if (i15 >= i14) {
                        break;
                    }
                    int m12 = xVar.m();
                    if (xVar.m() == 1768715124) {
                        break;
                    }
                    xVar.N(i15 + m12);
                    i12 = 8;
                    z11 = false;
                    str = null;
                }
                t0 t0Var4 = null;
                t0Var3 = t0Var3.b(t0Var4);
                i10 = 8;
            } else if (m11 == 1936553057) {
                xVar.N(i13);
                int i16 = i13 + m10;
                xVar.O(12);
                while (true) {
                    int i17 = xVar.b;
                    if (i17 >= i16) {
                        i10 = 8;
                        break;
                    }
                    int m13 = xVar.m();
                    if (xVar.m() != 1935766900) {
                        xVar.N(i17 + m13);
                    } else if (m13 < 16) {
                        t0Var2 = null;
                        i10 = 8;
                    } else {
                        xVar.O(4);
                        int i18 = -1;
                        int i19 = 0;
                        for (int i20 = 0; i20 < 2; i20++) {
                            int A = xVar.A();
                            int A2 = xVar.A();
                            if (A == 0) {
                                i18 = A2;
                            } else if (A == 1) {
                                i19 = A2;
                            }
                        }
                        if (i18 == 12) {
                            i11 = 240;
                        } else if (i18 == 13) {
                            i11 = 120;
                        } else if (i18 != 21) {
                            i11 = -2147483647;
                        } else {
                            i10 = 8;
                            if (xVar.a() >= 8 && xVar.b + 8 <= i16) {
                                int m14 = xVar.m();
                                int m15 = xVar.m();
                                if (m14 >= 12 && m15 == 1936877170) {
                                    i11 = xVar.B();
                                    if (i11 != -2147483647) {
                                        t0Var2 = new t0(new r3.c(i11, i19));
                                    }
                                }
                            }
                            i11 = -2147483647;
                            if (i11 != -2147483647) {
                            }
                        }
                        i10 = 8;
                        if (i11 != -2147483647) {
                        }
                    }
                }
                t0Var2 = null;
                t0Var3 = t0Var3.b(t0Var2);
            } else {
                i10 = 8;
                if (m11 == -1451722374) {
                    short x10 = xVar.x();
                    xVar.O(2);
                    String y3 = xVar.y(x10, StandardCharsets.UTF_8);
                    int max = Math.max(y3.lastIndexOf(43), y3.lastIndexOf(45));
                    try {
                        try {
                            f2.g gVar = new f2.g(Float.parseFloat(y3.substring(0, max)), Float.parseFloat(y3.substring(max, y3.length() - 1)));
                            s0[] s0VarArr = new s0[1];
                            z10 = false;
                            try {
                                s0VarArr[0] = gVar;
                                t0Var = new t0(s0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                t0Var = null;
                                t0Var3 = t0Var3.b(t0Var);
                                xVar.N(i13 + m10);
                                i12 = i10;
                                z11 = z10;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z10 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z10 = false;
                    }
                    t0Var3 = t0Var3.b(t0Var);
                    xVar.N(i13 + m10);
                    i12 = i10;
                    z11 = z10;
                }
            }
            z10 = false;
            xVar.N(i13 + m10);
            i12 = i10;
            z11 = z10;
        }
        return t0Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0b42, code lost:
    
        if (r10 == null) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0b44, code lost:
    
        r0 = r10.a;
        r1 = "video/dolby-vision";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0b4e, code lost:
    
        if (r1 != null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b50, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0b51, code lost:
    
        r2 = new b2.v();
        r2.a = java.lang.Integer.toString(r62);
        r2.r = b2.v0.n(r1);
        r2.j = r0;
        r2.y = r48;
        r2.z = r47;
        r2.A = r23;
        r2.B = r24;
        r2.E = r46;
        r2.D = r64;
        r2.F = r19;
        r2.G = r3;
        r2.u = r5;
        r2.t = r21;
        r2.I = r22;
        r2.v = r34;
        r2.d = r63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0b94, code lost:
    
        if (r16 == null) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0b96, code lost:
    
        r29 = r16.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0b9f, code lost:
    
        r2.H = new b2.n(r8, r30, r9, r29, r31, r32);
        r10 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0bb4, code lost:
    
        if (r10 == null) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0bb6, code lost:
    
        r2.h = v7.b8.e(r10.a);
        r2.i = v7.b8.e(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0bdb, code lost:
    
        r66.d = new b2.w(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0be2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0bc7, code lost:
    
        r10 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0bc9, code lost:
    
        if (r10 == null) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0bcb, code lost:
    
        r2.h = v7.b8.e(r10.a);
        r2.i = v7.b8.e(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0b9d, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0b4a, code lost:
    
        r0 = r18;
        r1 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0984, code lost:
    
        if (r1 != 3) goto L424;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(x xVar, int i10, int i11, int i12, int i13, String str, int i14, b2.s sVar, j0 j0Var, int i15) {
        int i16;
        int i17;
        float f7;
        int i18;
        int i19;
        int i20;
        int i21;
        String str2;
        int i22;
        b2.s sVar2;
        int i23;
        f2.a aVar;
        int i24;
        String str3;
        int i25;
        b2.s sVar3;
        int i26;
        int i27;
        float f10;
        qi.e eVar;
        String str4;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int g10;
        int i36;
        int i37;
        int i38;
        int i39;
        b2.n nVar;
        b2.n nVar2;
        int i40;
        String str5;
        int i41;
        le.b bVar;
        String str6;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46 = i11;
        int i47 = i12;
        b2.s sVar4 = sVar;
        xVar.N(i46 + 16);
        xVar.O(16);
        int H = xVar.H();
        int H2 = xVar.H();
        xVar.O(50);
        int i48 = xVar.b;
        int i49 = i10;
        if (i49 == 1701733238) {
            Pair h = h(xVar, i46, i47);
            if (h != null) {
                i49 = ((Integer) h.first).intValue();
                sVar4 = sVar4 == null ? null : sVar4.a(((r) h.second).b);
                ((r[]) j0Var.c)[i15] = (r) h.second;
            }
            xVar.N(i48);
        }
        String str7 = "video/3gpp";
        String str8 = i49 == 1831958048 ? "video/mpeg" : i49 == 1211250227 ? "video/3gpp" : (i49 == 1634743416 || i49 == 1634743400 || i49 == 1634755432 || i49 == 1634755438 || i49 == 1634755443 || i49 == 1634755439) ? "video/prores" : null;
        float f11 = 1.0f;
        int i50 = 8;
        List list = null;
        ByteBuffer byteBuffer = null;
        f2.a aVar2 = null;
        String str9 = null;
        byte[] bArr = null;
        int i51 = -1;
        int i52 = -1;
        int i53 = -1;
        int i54 = -1;
        int i55 = -1;
        boolean z10 = false;
        int i56 = -1;
        int i57 = -1;
        int i58 = -1;
        int i59 = 8;
        int i60 = 8;
        z zVar = null;
        z0 z0Var = null;
        qi.e eVar2 = null;
        while (true) {
            if (i48 - i46 >= i47) {
                i16 = H;
                i17 = H2;
                f7 = f11;
                i18 = i56;
                i19 = i57;
                i20 = i59;
                i21 = i60;
                str2 = str8;
                i22 = i58;
                sVar2 = sVar4;
                i23 = i51;
                aVar = aVar2;
                break;
            }
            xVar.N(i48);
            int i61 = xVar.b;
            int m10 = xVar.m();
            if (m10 == 0 && xVar.b - i46 == i47) {
                i16 = H;
                i17 = H2;
                f7 = f11;
                aVar = aVar2;
                i18 = i56;
                i19 = i57;
                i20 = i59;
                i21 = i60;
                str2 = str8;
                i22 = i58;
                sVar2 = sVar4;
                i23 = i51;
                break;
            }
            String str10 = "childAtomSize must be positive";
            c3.b.b("childAtomSize must be positive", m10 > 0);
            int m11 = xVar.m();
            if (m11 == 1635148611) {
                c3.b.b(null, str8 == null);
                xVar.N(i61 + 8);
                c3.d a2 = c3.d.a(xVar);
                list = a2.a;
                j0Var.a = a2.b;
                if (!z10) {
                    f11 = a2.k;
                }
                String str11 = a2.l;
                int i62 = a2.j;
                int i63 = a2.g;
                int i64 = a2.h;
                str9 = str11;
                int i65 = a2.i;
                i59 = a2.e;
                sVar3 = sVar4;
                i26 = H;
                i27 = H2;
                i24 = i48;
                i56 = i63;
                i28 = i49;
                str3 = str7;
                i57 = i64;
                f10 = f11;
                i25 = i65;
                i30 = i50;
                i31 = a2.f;
                i52 = i62;
                str8 = MediaController.VIDEO_MIME_TYPE;
            } else {
                i24 = i48;
                if (m11 == 1752589123) {
                    c3.b.b(null, str8 == null);
                    xVar.N(i61 + 8);
                    c3.x a10 = c3.x.a(xVar, false, null);
                    List list2 = a10.a;
                    j0Var.a = a10.b;
                    if (!z10) {
                        f11 = a10.l;
                    }
                    int i66 = a10.m;
                    int i67 = a10.c;
                    String str12 = a10.n;
                    int i68 = a10.k;
                    if (i68 != -1) {
                        i51 = i68;
                    }
                    int i69 = a10.d;
                    int i70 = a10.e;
                    int i71 = a10.h;
                    int i72 = a10.i;
                    int i73 = a10.j;
                    int i74 = a10.f;
                    int i75 = a10.g;
                    sVar3 = sVar4;
                    eVar2 = a10.o;
                    i26 = H;
                    i27 = H2;
                    i28 = i49;
                    str3 = str7;
                    f10 = f11;
                    list = list2;
                    i56 = i71;
                    i57 = i72;
                    i25 = i73;
                    i59 = i74;
                    i30 = i50;
                    i53 = i67;
                    str9 = str12;
                    i55 = i70;
                    i54 = i69;
                    i31 = i75;
                    i52 = i66;
                    str8 = "video/hevc";
                } else {
                    str3 = str7;
                    if (m11 == 1818785347) {
                        c3.b.b("lhvC must follow hvcC atom", "video/hevc".equals(str8));
                        qi.e eVar3 = eVar2;
                        c3.b.b("must have at least two layers", eVar3 != null && ((n0) eVar3.a).size() >= 2);
                        xVar.N(i61 + 8);
                        eVar3.getClass();
                        c3.x a11 = c3.x.a(xVar, true, eVar3);
                        c3.b.b("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", j0Var.a == a11.b);
                        int i76 = a11.h;
                        int i77 = i56;
                        if (i76 != -1) {
                            c3.b.b("colorSpace must be the same for both views", i77 == i76);
                        }
                        int i78 = a11.i;
                        int i79 = i57;
                        if (i78 != -1) {
                            c3.b.b("colorRange must be the same for both views", i79 == i78);
                        }
                        int i80 = a11.j;
                        if (i80 != -1) {
                            i45 = i58;
                            c3.b.b("colorTransfer must be the same for both views", i45 == i80);
                        } else {
                            i45 = i58;
                        }
                        int i81 = i59;
                        int i82 = i45;
                        c3.b.b("bitdepthLuma must be the same for both views", i81 == a11.f);
                        int i83 = i60;
                        c3.b.b("bitdepthChroma must be the same for both views", i83 == a11.g);
                        if (list != null) {
                            k0 t10 = n0.t();
                            t10.d(list);
                            t10.d(a11.a);
                            list = t10.f();
                        } else {
                            c3.b.b("initializationData must be already set from hvcC atom", false);
                        }
                        eVar2 = eVar3;
                        sVar3 = sVar4;
                        i26 = H;
                        i27 = H2;
                        str8 = "video/mv-hevc";
                        i56 = i77;
                        i28 = i49;
                        i57 = i79;
                        i59 = i81;
                        f10 = f11;
                        i25 = i82;
                        i31 = i83;
                        i30 = i50;
                        str9 = a11.n;
                    } else {
                        int i84 = i56;
                        int i85 = i57;
                        i25 = i58;
                        int i86 = i59;
                        int i87 = i60;
                        qi.e eVar4 = eVar2;
                        int i88 = 7;
                        int i89 = 4;
                        if (m11 == 1987470147) {
                            c3.b.b(null, str8 == null);
                            xVar.N(i61 + 8);
                            try {
                                if (xVar.m() != 0) {
                                    throw w0.a(null, "Unsupported VVC version");
                                }
                                int A = xVar.A();
                                int i90 = ((A >> 1) & 3) + 1;
                                str6 = "L";
                                if ((A & 1) != 0) {
                                    xVar.O(1);
                                    int A2 = (xVar.A() >> 4) & 7;
                                    i43 = (xVar.A() >> 5) & 7;
                                    int A3 = xVar.A() & 63;
                                    int A4 = xVar.A();
                                    int i91 = (A4 >> 1) & 127;
                                    str6 = (A4 & 1) != 0 ? "H" : "L";
                                    i44 = xVar.A();
                                    xVar.O(A3);
                                    if (A2 > 1) {
                                        int A5 = xVar.A();
                                        int i92 = 1;
                                        int i93 = 0;
                                        while (true) {
                                            int i94 = A2;
                                            if (i93 >= i94 - 1) {
                                                break;
                                            }
                                            if (((A5 >> (7 - i93)) & 1) != 0) {
                                                xVar.O(i92);
                                            }
                                            i93++;
                                            A2 = i94;
                                            i92 = 1;
                                        }
                                    }
                                    xVar.O(xVar.A() * 4);
                                    xVar.O(6);
                                    i42 = i91;
                                } else {
                                    i42 = 0;
                                    i43 = 0;
                                    i44 = 0;
                                }
                                int A6 = xVar.A();
                                int i95 = i43;
                                int i96 = xVar.b;
                                sVar3 = sVar4;
                                f10 = f11;
                                int i97 = 0;
                                int i98 = 0;
                                while (i97 < A6) {
                                    int i99 = i97;
                                    int A7 = xVar.A() & 31;
                                    int i100 = H2;
                                    int H3 = (A7 == 13 || A7 == 12) ? 1 : xVar.H();
                                    int i101 = 0;
                                    while (i101 < H3) {
                                        int i102 = H3;
                                        int H4 = xVar.H();
                                        i98 = H4 + 4 + i98;
                                        xVar.O(H4);
                                        i101++;
                                        H3 = i102;
                                    }
                                    i97 = i99 + 1;
                                    H2 = i100;
                                }
                                i27 = H2;
                                xVar.N(i96);
                                byte[] bArr2 = new byte[i98];
                                int i103 = 0;
                                int i104 = 0;
                                while (i103 < A6) {
                                    int A8 = xVar.A() & 31;
                                    int i105 = i103;
                                    int H5 = (A8 == 13 || A8 == 12) ? 1 : xVar.H();
                                    int i106 = i104;
                                    int i107 = 0;
                                    while (i107 < H5) {
                                        int i108 = H5;
                                        int H6 = xVar.H();
                                        System.arraycopy(f2.q.a, 0, bArr2, i106, i89);
                                        int i109 = i106 + 4;
                                        xVar.k(i109, H6, bArr2);
                                        i106 = i109 + H6;
                                        i107++;
                                        H5 = i108;
                                        A6 = A6;
                                        H = H;
                                        i89 = 4;
                                    }
                                    i103 = i105 + 1;
                                    i104 = i106;
                                    i89 = 4;
                                }
                                i26 = H;
                                Locale locale = Locale.US;
                                String str13 = "vvc1." + i42 + "." + str6 + i44;
                                x1 y3 = n0.y(bArr2);
                                i59 = i95 + 8;
                                j0Var.a = i90;
                                i30 = i50;
                                str9 = str13;
                                eVar2 = eVar4;
                                str8 = "video/vvc";
                                i56 = i84;
                                i28 = i49;
                                i57 = i85;
                                i31 = i59;
                                i52 = 16;
                                list = y3;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw w0.a(e, "Error parsing VVC configuration");
                            }
                        } else {
                            sVar3 = sVar4;
                            i26 = H;
                            i27 = H2;
                            f10 = f11;
                            if (m11 == 1986361461) {
                                xVar.N(i61 + 8);
                                int i110 = xVar.b;
                                le.b bVar2 = null;
                                while (i110 - i61 < m10) {
                                    xVar.N(i110);
                                    int m12 = xVar.m();
                                    c3.b.b(str10, m12 > 0);
                                    if (xVar.m() == 1702454643) {
                                        xVar.N(i110 + 8);
                                        int i111 = xVar.b;
                                        while (true) {
                                            if (i111 - i110 >= m12) {
                                                str5 = str10;
                                                i41 = i110;
                                                bVar = null;
                                                break;
                                            }
                                            xVar.N(i111);
                                            int m13 = xVar.m();
                                            c3.b.b(str10, m13 > 0);
                                            if (xVar.m() == 1937011305) {
                                                xVar.O(4);
                                                int A9 = xVar.A();
                                                str5 = str10;
                                                i41 = i110;
                                                bVar = new le.b(new bc.d((A9 & 1) == 1, (A9 & 2) == 2, (A9 & 8) == i50), 27);
                                            } else {
                                                i111 += m13;
                                                i50 = 8;
                                            }
                                        }
                                        bVar2 = bVar;
                                    } else {
                                        str5 = str10;
                                        i41 = i110;
                                    }
                                    i110 = i41 + m12;
                                    str10 = str5;
                                    i50 = 8;
                                }
                                k2.w0 w0Var = bVar2 == null ? null : new k2.w0(bVar2, 28);
                                if (w0Var != null) {
                                    bc.d dVar = (bc.d) ((le.b) w0Var.b).b;
                                    if (eVar4 == null || ((n0) eVar4.a).size() < 2) {
                                        i40 = i51;
                                        if (i40 == -1) {
                                            i51 = dVar.c ? 5 : 4;
                                            eVar2 = eVar4;
                                        }
                                        i51 = i40;
                                        eVar2 = eVar4;
                                    } else {
                                        c3.b.b("both eye views must be marked as available", dVar.a && dVar.b);
                                        c3.b.b("for MV-HEVC, eye_views_reversed must be set to false", !dVar.c);
                                    }
                                }
                                i40 = i51;
                                i51 = i40;
                                eVar2 = eVar4;
                            } else {
                                int i112 = i51;
                                if (m11 == 1685480259 || m11 == 1685485123 || m11 == 1685485379) {
                                    eVar = eVar4;
                                    str4 = str8;
                                    i28 = i49;
                                    i29 = i25;
                                    i30 = 8;
                                    aVar2 = f2.a.a(xVar);
                                } else {
                                    int i113 = 11;
                                    if (m11 == 1987076931) {
                                        c3.b.b(null, str8 == null);
                                        String str14 = i49 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        xVar.N(i61 + 12);
                                        byte A10 = (byte) xVar.A();
                                        byte A11 = (byte) xVar.A();
                                        int A12 = xVar.A();
                                        i31 = A12 >> 4;
                                        byte b10 = (byte) ((A12 >> 1) & 7);
                                        if (str14.equals("video/x-vnd.on2.vp9")) {
                                            byte[] bArr3 = e2.g.a;
                                            list = n0.y(new byte[]{1, 1, A10, 2, 1, A11, 3, 1, (byte) i31, 4, 1, b10});
                                        }
                                        boolean z11 = (A12 & 1) != 0;
                                        int A13 = xVar.A();
                                        int A14 = xVar.A();
                                        i56 = b2.n.f(A13);
                                        i57 = z11 ? 1 : 2;
                                        str8 = str14;
                                        eVar2 = eVar4;
                                        i51 = i112;
                                        i25 = b2.n.g(A14);
                                        i28 = i49;
                                        i59 = i31;
                                        i30 = 8;
                                    } else if (m11 == 1635135811) {
                                        int i114 = m10 - 8;
                                        byte[] bArr4 = new byte[i114];
                                        xVar.k(0, i114, bArr4);
                                        list = n0.y(bArr4);
                                        xVar.N(i61 + 8);
                                        byte[] bArr5 = xVar.a;
                                        a4.g gVar = new a4.g(bArr5, bArr5.length);
                                        gVar.m(xVar.b * 8);
                                        gVar.p(1);
                                        int g11 = gVar.g(3);
                                        gVar.o(6);
                                        boolean f12 = gVar.f();
                                        boolean f13 = gVar.f();
                                        int i115 = -1;
                                        if (g11 == 2 && f12) {
                                            i32 = f13 ? 12 : 10;
                                            i33 = f13 ? 12 : 10;
                                        } else if (g11 <= 2) {
                                            int i116 = f12 ? 10 : 8;
                                            i33 = f12 ? 10 : 8;
                                            i32 = i116;
                                        } else {
                                            i32 = -1;
                                            i33 = -1;
                                        }
                                        gVar.o(13);
                                        gVar.n();
                                        int g12 = gVar.g(4);
                                        if (g12 != 1) {
                                            e2.a.g("BoxParsers", "Unsupported obu_type: " + g12);
                                            nVar2 = new b2.n(-1, -1, -1, null, i32, i33);
                                        } else if (gVar.f()) {
                                            e2.a.g("BoxParsers", "Unsupported obu_extension_flag");
                                            nVar2 = new b2.n(-1, -1, -1, null, i32, i33);
                                        } else {
                                            boolean f14 = gVar.f();
                                            gVar.n();
                                            if (!f14 || gVar.g(8) <= 127) {
                                                int g13 = gVar.g(3);
                                                gVar.n();
                                                if (gVar.f()) {
                                                    e2.a.g("BoxParsers", "Unsupported reduced_still_picture_header");
                                                    nVar2 = new b2.n(-1, -1, -1, null, i32, i33);
                                                } else if (gVar.f()) {
                                                    e2.a.g("BoxParsers", "Unsupported timing_info_present_flag");
                                                    nVar2 = new b2.n(-1, -1, -1, null, i32, i33);
                                                } else if (gVar.f()) {
                                                    e2.a.g("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                    nVar2 = new b2.n(-1, -1, -1, null, i32, i33);
                                                } else {
                                                    int i117 = 5;
                                                    int g14 = gVar.g(5);
                                                    int i118 = 0;
                                                    while (i118 <= g14) {
                                                        gVar.o(12);
                                                        if (gVar.g(i117) > i88) {
                                                            gVar.n();
                                                        }
                                                        i118++;
                                                        i117 = 5;
                                                        i88 = 7;
                                                    }
                                                    int g15 = gVar.g(4);
                                                    int g16 = gVar.g(4);
                                                    gVar.o(g15 + 1);
                                                    gVar.o(g16 + 1);
                                                    if (gVar.f()) {
                                                        i34 = 7;
                                                        gVar.o(7);
                                                    } else {
                                                        i34 = 7;
                                                    }
                                                    gVar.o(i34);
                                                    boolean f15 = gVar.f();
                                                    if (f15) {
                                                        gVar.o(2);
                                                    }
                                                    if (gVar.f()) {
                                                        g10 = 2;
                                                        i35 = 1;
                                                    } else {
                                                        i35 = 1;
                                                        g10 = gVar.g(1);
                                                    }
                                                    if (g10 > 0 && !gVar.f()) {
                                                        gVar.o(i35);
                                                    }
                                                    if (f15) {
                                                        i36 = 3;
                                                        gVar.o(3);
                                                    } else {
                                                        i36 = 3;
                                                    }
                                                    gVar.o(i36);
                                                    boolean f16 = gVar.f();
                                                    if (g13 == 2 && f16) {
                                                        gVar.n();
                                                    }
                                                    boolean z12 = g13 != 1 && gVar.f();
                                                    if (gVar.f()) {
                                                        int g17 = gVar.g(8);
                                                        int g18 = gVar.g(8);
                                                        int g19 = (!z12 && g17 == 1 && g18 == 13 && gVar.g(8) == 0) ? 1 : gVar.g(1);
                                                        int f17 = b2.n.f(g17);
                                                        int i119 = g19 == 1 ? 1 : 2;
                                                        i37 = f17;
                                                        i38 = i32;
                                                        i39 = b2.n.g(g18);
                                                        i115 = i119;
                                                    } else {
                                                        i37 = -1;
                                                        i38 = i32;
                                                        i39 = -1;
                                                    }
                                                    nVar = new b2.n(i37, i115, i39, null, i38, i33);
                                                    int i120 = nVar.e;
                                                    int i121 = nVar.f;
                                                    int i122 = nVar.a;
                                                    int i123 = nVar.b;
                                                    i25 = nVar.c;
                                                    eVar2 = eVar4;
                                                    i51 = i112;
                                                    i59 = i120;
                                                    i31 = i121;
                                                    i56 = i122;
                                                    i57 = i123;
                                                    i28 = i49;
                                                    i30 = 8;
                                                    str8 = "video/av01";
                                                }
                                            } else {
                                                e2.a.g("BoxParsers", "Excessive obu_size");
                                                nVar2 = new b2.n(-1, -1, -1, null, i32, i33);
                                            }
                                        }
                                        nVar = nVar2;
                                        int i1202 = nVar.e;
                                        int i1212 = nVar.f;
                                        int i1222 = nVar.a;
                                        int i1232 = nVar.b;
                                        i25 = nVar.c;
                                        eVar2 = eVar4;
                                        i51 = i112;
                                        i59 = i1202;
                                        i31 = i1212;
                                        i56 = i1222;
                                        i57 = i1232;
                                        i28 = i49;
                                        i30 = 8;
                                        str8 = "video/av01";
                                    } else if (m11 == 1668050025) {
                                        if (byteBuffer == null) {
                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer2 = byteBuffer;
                                        byteBuffer2.position(21);
                                        byteBuffer2.putShort(xVar.x());
                                        byteBuffer2.putShort(xVar.x());
                                        byteBuffer = byteBuffer2;
                                        eVar2 = eVar4;
                                        i51 = i112;
                                    } else {
                                        if (m11 == 1835295606) {
                                            if (byteBuffer == null) {
                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                            }
                                            ByteBuffer byteBuffer3 = byteBuffer;
                                            short x10 = xVar.x();
                                            short x11 = xVar.x();
                                            short x12 = xVar.x();
                                            short x13 = xVar.x();
                                            short x14 = xVar.x();
                                            short x15 = xVar.x();
                                            eVar = eVar4;
                                            short x16 = xVar.x();
                                            str4 = str8;
                                            short x17 = xVar.x();
                                            long C = xVar.C();
                                            long C2 = xVar.C();
                                            i28 = i49;
                                            byteBuffer3.position(1);
                                            byteBuffer3.putShort(x14);
                                            byteBuffer3.putShort(x15);
                                            byteBuffer3.putShort(x10);
                                            byteBuffer3.putShort(x11);
                                            byteBuffer3.putShort(x12);
                                            byteBuffer3.putShort(x13);
                                            byteBuffer3.putShort(x16);
                                            byteBuffer3.putShort(x17);
                                            byteBuffer3.putShort((short) (C / 10000));
                                            byteBuffer3.putShort((short) (C2 / 10000));
                                            byteBuffer = byteBuffer3;
                                        } else {
                                            eVar = eVar4;
                                            str4 = str8;
                                            i28 = i49;
                                            if (m11 == 1681012275) {
                                                c3.b.b(null, str4 == null);
                                                eVar2 = eVar;
                                                str8 = str3;
                                            } else if (m11 == 1702061171) {
                                                c3.b.b(null, str4 == null);
                                                z0 c10 = c(i61, xVar);
                                                String str15 = (String) c10.c;
                                                byte[] bArr6 = (byte[]) c10.d;
                                                if (bArr6 != null) {
                                                    list = n0.y(bArr6);
                                                }
                                                z0Var = c10;
                                                str8 = str15;
                                                eVar2 = eVar;
                                            } else if (m11 == 1651798644) {
                                                xVar.N(i61 + 8);
                                                xVar.O(4);
                                                zVar = new z(xVar.C(), xVar.C());
                                            } else if (m11 == 1885434736) {
                                                xVar.N(i61 + 8);
                                                f10 = xVar.E() / xVar.E();
                                                eVar2 = eVar;
                                                i57 = i85;
                                                i31 = i87;
                                                str8 = str4;
                                                i30 = 8;
                                                z10 = true;
                                                i51 = i112;
                                                i56 = i84;
                                                i59 = i86;
                                            } else if (m11 == 1937126244) {
                                                int i124 = i61 + 8;
                                                while (true) {
                                                    if (i124 - i61 >= m10) {
                                                        bArr = null;
                                                        break;
                                                    }
                                                    xVar.N(i124);
                                                    int m14 = xVar.m();
                                                    if (xVar.m() == 1886547818) {
                                                        bArr = Arrays.copyOfRange(xVar.a, i124, m14 + i124);
                                                        break;
                                                    }
                                                    i124 += m14;
                                                }
                                            } else if (m11 == 1936995172) {
                                                int A15 = xVar.A();
                                                int i125 = 3;
                                                xVar.O(3);
                                                if (A15 == 0) {
                                                    int A16 = xVar.A();
                                                    if (A16 == 0) {
                                                        i125 = 0;
                                                    } else if (A16 == 1) {
                                                        i125 = 1;
                                                    } else if (A16 == 2) {
                                                        i125 = 2;
                                                    }
                                                    eVar2 = eVar;
                                                    i57 = i85;
                                                    i31 = i87;
                                                    str8 = str4;
                                                    i30 = 8;
                                                    i51 = i125;
                                                    i56 = i84;
                                                    i59 = i86;
                                                }
                                                i125 = i112;
                                                eVar2 = eVar;
                                                i57 = i85;
                                                i31 = i87;
                                                str8 = str4;
                                                i30 = 8;
                                                i51 = i125;
                                                i56 = i84;
                                                i59 = i86;
                                            } else if (m11 == 1634760259) {
                                                int i126 = m10 - 12;
                                                byte[] bArr7 = new byte[i126];
                                                xVar.N(i61 + 12);
                                                int i127 = 0;
                                                xVar.k(0, i126, bArr7);
                                                byte[] bArr8 = e2.g.a;
                                                u6.b(i126, "Invalid APV CSD length: %s", i126 >= 17);
                                                byte b11 = bArr7[0];
                                                u6.b(b11, "Invalid APV CSD version: %s", b11 == 1);
                                                int i128 = bArr7[5] & 255;
                                                int i129 = bArr7[6] & 255;
                                                int i130 = bArr7[7] & 255;
                                                String str16 = m0.a;
                                                Locale locale2 = Locale.US;
                                                StringBuilder m15 = i2.e.m("apv1.apvf", i128, ".apvl", i129, ".apvb");
                                                m15.append(i130);
                                                str9 = m15.toString();
                                                x1 y10 = n0.y(bArr7);
                                                x xVar2 = new x(bArr7);
                                                a4.g gVar2 = new a4.g(bArr7, i126);
                                                i30 = 8;
                                                gVar2.m(xVar2.b * 8);
                                                gVar2.p(1);
                                                int g20 = gVar2.g(8);
                                                int i131 = 0;
                                                int i132 = -1;
                                                int i133 = -1;
                                                i31 = -1;
                                                i56 = -1;
                                                i59 = -1;
                                                while (i131 < g20) {
                                                    gVar2.p(1);
                                                    int g21 = gVar2.g(8);
                                                    int i134 = i31;
                                                    int i135 = i133;
                                                    int i136 = i132;
                                                    int i137 = i127;
                                                    while (i137 < g21) {
                                                        gVar2.o(6);
                                                        boolean f18 = gVar2.f();
                                                        gVar2.n();
                                                        gVar2.p(i113);
                                                        gVar2.o(4);
                                                        i59 = gVar2.g(4) + 8;
                                                        gVar2.p(1);
                                                        if (f18) {
                                                            int g22 = gVar2.g(8);
                                                            int g23 = gVar2.g(8);
                                                            gVar2.p(1);
                                                            boolean f19 = gVar2.f();
                                                            int f20 = b2.n.f(g22);
                                                            int i138 = f19 ? 1 : 2;
                                                            i135 = b2.n.g(g23);
                                                            i56 = f20;
                                                            i136 = i138;
                                                        }
                                                        i137++;
                                                        i134 = i59;
                                                        i113 = 11;
                                                    }
                                                    i131++;
                                                    i132 = i136;
                                                    i133 = i135;
                                                    i31 = i134;
                                                    i113 = 11;
                                                    i127 = 0;
                                                }
                                                str8 = "video/apv";
                                                list = y10;
                                                i57 = i132;
                                                i25 = i133;
                                                eVar2 = eVar;
                                                i51 = i112;
                                            } else {
                                                i30 = 8;
                                                if (m11 == 1668246642) {
                                                    i29 = i25;
                                                    if (i84 == -1 && i29 == -1) {
                                                        int m16 = xVar.m();
                                                        if (m16 == 1852009592 || m16 == 1852009571) {
                                                            int H7 = xVar.H();
                                                            int H8 = xVar.H();
                                                            xVar.O(2);
                                                            boolean z13 = m10 == 19 && (xVar.A() & 128) != 0;
                                                            int f21 = b2.n.f(H7);
                                                            i57 = z13 ? 1 : 2;
                                                            i25 = b2.n.g(H8);
                                                            eVar2 = eVar;
                                                            i31 = i87;
                                                            str8 = str4;
                                                            i56 = f21;
                                                            i51 = i112;
                                                            i59 = i86;
                                                        } else {
                                                            e2.a.l("BoxParsers", "Unsupported color type: " + f2.f.a(m16));
                                                        }
                                                    }
                                                } else {
                                                    i29 = i25;
                                                }
                                            }
                                            i57 = i85;
                                            i59 = i86;
                                            i31 = i87;
                                            i30 = 8;
                                            i51 = i112;
                                            i56 = i84;
                                        }
                                        eVar2 = eVar;
                                        i57 = i85;
                                        i31 = i87;
                                        str8 = str4;
                                        i30 = 8;
                                        i51 = i112;
                                        i56 = i84;
                                        i59 = i86;
                                    }
                                }
                                i25 = i29;
                                eVar2 = eVar;
                                i57 = i85;
                                i31 = i87;
                                str8 = str4;
                                i51 = i112;
                                i56 = i84;
                                i59 = i86;
                            }
                            i28 = i49;
                            i57 = i85;
                            i59 = i86;
                            i31 = i87;
                            i30 = 8;
                            i56 = i84;
                        }
                    }
                }
            }
            i48 = i24 + m10;
            i46 = i11;
            i47 = i12;
            i50 = i30;
            str7 = str3;
            sVar4 = sVar3;
            i49 = i28;
            i58 = i25;
            f11 = f10;
            H2 = i27;
            H = i26;
            i60 = i31;
        }
    }
}
