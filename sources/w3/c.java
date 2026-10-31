package w3;

import a3.z;
import android.util.Pair;
import b2.t0;
import b2.u0;
import b2.v0;
import b2.w0;
import c3.w;
import e2.j0;
import e2.l0;
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
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import u2.z0;
import v7.c8;
import v7.t6;
import vh.w3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    static {
        String str = l0.a;
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
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static void b(e2.x r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, b2.t r56, e2.j0 r57, int r58) {
        /*
            Method dump skipped, instructions count: 3236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.c.b(e2.x, int, int, int, int, java.lang.String, boolean, b2.t, e2.j0, int):void");
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
        int i10 = A & zs.L1;
        while ((A & 128) == 128) {
            A = xVar.A();
            i10 = (i10 << 7) | (A & zs.L1);
        }
        return i10;
    }

    public static int e(int i10) {
        return (i10 >> 24) & zs.e4;
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
    
        c3.i0.q("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u0 f(f2.d dVar) {
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
                a1.g.w(m13, "Skipped metadata with unknown key index: ", "BoxParsers");
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
        return new u0(arrayList);
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
                                i13 = (A & zs.P3) >> 4;
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
                    String str2 = l0.a;
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

    /* JADX WARN: Code restructure failed: missing block: B:394:0x00e5, code lost:
    
        if (r11 == 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:688:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0ada  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList i(f2.d dVar, w wVar, long j10, b2.t tVar, boolean z10, boolean z11, d9.k kVar, boolean z12) {
        long j11;
        long j12;
        long j13;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        long j14;
        long j15;
        long a02;
        int i13;
        int i14;
        int i15;
        long j16;
        int i16;
        int i17;
        String str;
        f2.e e;
        long[] jArr;
        long[] jArr2;
        b2.x xVar;
        b2.x xVar2;
        d9.k kVar2;
        q qVar;
        f2.d d;
        Pair create;
        int i18;
        b2.t tVar2;
        String str2;
        int i19;
        x xVar3;
        j0 j0Var;
        int i20;
        int i21;
        int i22;
        j0 j0Var2;
        x xVar4;
        b2.t tVar3;
        boolean z13;
        int i23;
        x xVar5;
        x1 x1Var;
        long j17;
        b bVar;
        boolean z14;
        int i24;
        int i25;
        int i26;
        boolean z15;
        ArrayList arrayList2;
        int i27;
        long[] jArr3;
        long[] jArr4;
        int i28;
        int[] iArr;
        long j18;
        boolean z16;
        int i29;
        ArrayList arrayList3;
        int i30;
        int[] iArr2;
        int i31;
        long j19;
        int[] iArr3;
        int i32;
        int i33;
        int i34;
        int i35;
        long j20;
        long[] jArr5;
        long j21;
        long j22;
        t tVar4;
        ArrayList arrayList4;
        boolean z17;
        int[] iArr4;
        int i36;
        int i37;
        t tVar5;
        long a03;
        f2.d dVar2 = dVar;
        ArrayList arrayList5 = new ArrayList();
        int i38 = 0;
        for (ArrayList arrayList6 = dVar2.e; i38 < arrayList6.size(); arrayList6 = arrayList) {
            f2.d dVar3 = (f2.d) arrayList6.get(i38);
            if (dVar3.b != 1953653099) {
                arrayList = arrayList6;
                arrayList4 = arrayList5;
                i10 = i38;
            } else {
                f2.e e7 = dVar2.e(1836476516);
                e7.getClass();
                f2.d d10 = dVar3.d(1835297121);
                d10.getClass();
                f2.e e10 = d10.e(1751411826);
                e10.getClass();
                x xVar6 = e10.c;
                xVar6.N(16);
                int m10 = xVar6.m();
                int i39 = 0;
                int i40 = m10 == 1936684398 ? 1 : m10 == 1986618469 ? 2 : (m10 == 1952807028 || m10 == 1935832172 || m10 == 1937072756 || m10 == 1668047728 || m10 == 1937072752) ? 3 : m10 == 1835365473 ? 5 : -1;
                int i41 = 1;
                if (i40 == -1) {
                    arrayList = arrayList6;
                    i10 = i38;
                    qVar = null;
                    j11 = 0;
                    kVar2 = kVar;
                } else {
                    j11 = 0;
                    f2.e e11 = dVar3.e(1953196132);
                    e11.getClass();
                    x xVar7 = e11.c;
                    xVar7.N(8);
                    int e12 = e(xVar7.m());
                    xVar7.O(e12 != 0 ? 16 : 8);
                    int m11 = xVar7.m();
                    xVar7.O(4);
                    int i42 = xVar7.b;
                    int i43 = e12 == 0 ? 4 : 8;
                    int i44 = 0;
                    while (true) {
                        j12 = -9223372036854775807L;
                        if (i44 >= i43) {
                            xVar7.O(i43);
                            break;
                        }
                        if (xVar7.a[i42 + i44] != -1) {
                            j13 = e12 == 0 ? xVar7.C() : xVar7.G();
                        } else {
                            i44++;
                        }
                    }
                    j13 = -9223372036854775807L;
                    xVar7.O(10);
                    int H = xVar7.H();
                    xVar7.O(4);
                    int m12 = xVar7.m();
                    int m13 = xVar7.m();
                    xVar7.O(4);
                    int m14 = xVar7.m();
                    arrayList = arrayList6;
                    int m15 = xVar7.m();
                    i10 = i38;
                    if (m12 == 0 && m13 == 65536) {
                        i11 = i40;
                        if ((m14 == -65536 || m14 == 65536) && m15 == 0) {
                            i12 = 90;
                            xVar7.O(16);
                            short x10 = xVar7.x();
                            xVar7.O(2);
                            short x11 = xVar7.x();
                            j14 = j10 != -9223372036854775807L ? j13 : j10;
                            long j23 = g(e7.c).c;
                            if (j14 != -9223372036854775807L) {
                                j15 = j23;
                                a02 = -9223372036854775807L;
                            } else {
                                String str3 = l0.a;
                                j15 = j23;
                                a02 = l0.a0(j14, 1000000L, j15, RoundingMode.DOWN);
                            }
                            f2.d d11 = d10.d(1835626086);
                            d11.getClass();
                            f2.d d12 = d11.d(1937007212);
                            d12.getClass();
                            f2.e e13 = d10.e(1835296868);
                            e13.getClass();
                            x xVar8 = e13.c;
                            xVar8.N(8);
                            int e14 = e(xVar8.m());
                            xVar8.O(e14 != 0 ? 8 : 16);
                            long C = xVar8.C();
                            int i45 = xVar8.b;
                            i13 = e14 != 0 ? 4 : 8;
                            i14 = 0;
                            while (true) {
                                if (i14 < i13) {
                                    i15 = i12;
                                    j16 = a02;
                                    xVar8.O(i13);
                                    break;
                                }
                                i15 = i12;
                                j16 = a02;
                                if (xVar8.a[i45 + i14] != -1) {
                                    long C2 = e14 == 0 ? xVar8.C() : xVar8.G();
                                    if (C2 != 0) {
                                        String str4 = l0.a;
                                        j12 = l0.a0(C2, 1000000L, C, RoundingMode.DOWN);
                                    }
                                } else {
                                    i14++;
                                    i12 = i15;
                                    a02 = j16;
                                }
                            }
                            long j24 = j12;
                            int H2 = xVar8.H();
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
                            e = d12.e(1937011556);
                            if (e != null) {
                                e2.a.l("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            } else {
                                x xVar9 = e.c;
                                xVar9.N(12);
                                int m16 = xVar9.m();
                                j0 j0Var3 = new j0(m16, 5);
                                int i46 = 0;
                                while (i46 < m16) {
                                    int i47 = xVar9.b;
                                    int m17 = xVar9.m();
                                    long j25 = j24;
                                    c3.b.b("childAtomSize must be positive", m17 > 0 ? i41 : i39);
                                    int m18 = xVar9.m();
                                    if (m18 == 1635148593 || m18 == 1635148595 || m18 == 1701733238 || m18 == 1831958048 || m18 == 1836070006 || m18 == 1752589105 || m18 == 1751479857 || m18 == 1987470129 || m18 == 1987471665 || m18 == 1932670515 || m18 == 1211250227 || m18 == 1748121139 || m18 == 1987063864 || m18 == 1987063865 || m18 == 1635135537 || m18 == 1685479798 || m18 == 1685479729 || m18 == 1685481573 || m18 == 1685481521 || m18 == 1634760241 || m18 == 1684108849 || m18 == 1634743416 || m18 == 1634743400 || m18 == 1634755432 || m18 == 1634755438 || m18 == 1634755443) {
                                        i18 = m16;
                                        tVar2 = tVar;
                                        str2 = str;
                                        i19 = m18;
                                        xVar3 = xVar9;
                                        j0Var = j0Var3;
                                        i20 = i46;
                                        i21 = i47;
                                        i22 = i15;
                                    } else if (m18 == 1634755439) {
                                        tVar2 = tVar;
                                        str2 = str;
                                        i19 = m18;
                                        xVar3 = xVar9;
                                        i18 = m16;
                                        j0Var = j0Var3;
                                        i20 = i46;
                                        i21 = i47;
                                        i22 = i15;
                                    } else {
                                        if (m18 == 1836069985 || m18 == 1701733217 || m18 == 1633889587 || m18 == 1700998451 || m18 == 1633889588 || m18 == 1835823201 || m18 == 1685353315 || m18 == 1685353317 || m18 == 1685353320 || m18 == 1685353324 || m18 == 1685353336 || m18 == 1935764850 || m18 == 1935767394 || m18 == 1819304813 || m18 == 1936684916 || m18 == 1953984371 || m18 == 778924082 || m18 == 778924083 || m18 == 1835557169 || m18 == 1835560241 || m18 == 1634492771 || m18 == 1634492791 || m18 == 1970037111 || m18 == 1332770163 || m18 == 1716281667 || m18 == 1767992678 || m18 == 1768973165) {
                                            i18 = m16;
                                            tVar3 = tVar;
                                            z13 = z11;
                                            str2 = str;
                                            i23 = m18;
                                            xVar3 = xVar9;
                                            j0Var = j0Var3;
                                            i20 = i46;
                                            i21 = i47;
                                        } else if (m18 == 1718641517) {
                                            tVar3 = tVar;
                                            z13 = z11;
                                            str2 = str;
                                            i23 = m18;
                                            xVar3 = xVar9;
                                            i18 = m16;
                                            j0Var = j0Var3;
                                            i20 = i46;
                                            i21 = i47;
                                        } else {
                                            if (m18 == 1414810956 || m18 == 1954034535 || m18 == 2004251764 || m18 == 1937010800 || m18 == 1664495672 || m18 == 1836070003) {
                                                xVar9.N(i47 + 16);
                                                String str5 = "application/ttml+xml";
                                                if (m18 != 1414810956) {
                                                    if (m18 == 1954034535) {
                                                        int i48 = m17 - 16;
                                                        byte[] bArr = new byte[i48];
                                                        xVar9.k(i39, i48, bArr);
                                                        x1Var = n0.y(bArr);
                                                        str5 = "application/x-quicktime-tx3g";
                                                        xVar5 = xVar9;
                                                        i18 = m16;
                                                        i20 = i46;
                                                        i21 = i47;
                                                        j17 = Long.MAX_VALUE;
                                                        if (str5 != null) {
                                                            b2.w wVar2 = new b2.w();
                                                            wVar2.a = Integer.toString(m11);
                                                            wVar2.r = v0.n(str5);
                                                            wVar2.d = str;
                                                            wVar2.w = j17;
                                                            wVar2.u = x1Var;
                                                            j0Var3.d = new b2.x(wVar2);
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i22 = i15;
                                                        xVar4 = xVar5;
                                                    } else if (m18 == 2004251764) {
                                                        str5 = "application/x-mp4-vtt";
                                                    } else if (m18 == 1937010800) {
                                                        xVar5 = xVar9;
                                                        i18 = m16;
                                                        i20 = i46;
                                                        i21 = i47;
                                                        j17 = 0;
                                                        x1Var = null;
                                                        if (str5 != null) {
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i22 = i15;
                                                        xVar4 = xVar5;
                                                    } else if (m18 == 1664495672) {
                                                        j0Var3.b = i41;
                                                        str5 = "application/x-mp4-cea-608";
                                                    } else {
                                                        if (m18 != 1836070003) {
                                                            throw new IllegalStateException();
                                                        }
                                                        int i49 = xVar9.b;
                                                        xVar9.O(4);
                                                        if (xVar9.m() == 1702061171) {
                                                            byte[] bArr2 = (byte[]) c(i49, xVar9).d;
                                                            if (bArr2 == null || bArr2.length != 64) {
                                                                xVar5 = xVar9;
                                                                i18 = m16;
                                                                i20 = i46;
                                                                i21 = i47;
                                                                str2 = str;
                                                                j0Var2 = j0Var3;
                                                                i22 = i15;
                                                                xVar4 = xVar5;
                                                            } else {
                                                                t6.p(bArr2.length == 64);
                                                                ArrayList arrayList7 = new ArrayList(16);
                                                                xVar5 = xVar9;
                                                                int i50 = 0;
                                                                while (i50 < bArr2.length - 3) {
                                                                    byte[] bArr3 = bArr2;
                                                                    int i51 = i46;
                                                                    int c11 = c8.c(bArr2[i50], bArr3[i50 + 1], bArr3[i50 + 2], bArr3[i50 + 3]);
                                                                    int i52 = (c11 >> 16) & zs.e4;
                                                                    int i53 = ((c11 >> 8) & zs.e4) - 128;
                                                                    int i54 = (c11 & zs.e4) - 128;
                                                                    arrayList7.add(String.format("%06x", Integer.valueOf(l0.i(((i54 * 17790) / 10000) + i52, 0, zs.e4) | (l0.i((i52 - ((i54 * 3455) / 10000)) - ((i53 * 7169) / 10000), 0, zs.e4) << 8) | (l0.i(((i53 * 14075) / 10000) + i52, 0, zs.e4) << 16))));
                                                                    i50 += 4;
                                                                    bArr2 = bArr3;
                                                                    i47 = i47;
                                                                    i46 = i51;
                                                                    m16 = m16;
                                                                }
                                                                i18 = m16;
                                                                i20 = i46;
                                                                i21 = i47;
                                                                StringBuilder m19 = i0.a.m("size: ", x10, "x", x11, "\npalette: ");
                                                                m19.append(new com.google.android.gms.internal.clearcut.e(", ", 1).b(arrayList7));
                                                                m19.append("\n");
                                                                String sb2 = m19.toString();
                                                                String str6 = l0.a;
                                                                x1Var = n0.y(sb2.getBytes(StandardCharsets.UTF_8));
                                                                str5 = "application/vobsub";
                                                            }
                                                        } else {
                                                            xVar5 = xVar9;
                                                            i18 = m16;
                                                            i20 = i46;
                                                            i21 = i47;
                                                            x1Var = null;
                                                            str5 = null;
                                                        }
                                                        j17 = Long.MAX_VALUE;
                                                        if (str5 != null) {
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i22 = i15;
                                                        xVar4 = xVar5;
                                                    }
                                                }
                                                xVar5 = xVar9;
                                                i18 = m16;
                                                i20 = i46;
                                                i21 = i47;
                                                j17 = Long.MAX_VALUE;
                                                x1Var = null;
                                                if (str5 != null) {
                                                }
                                                str2 = str;
                                                j0Var2 = j0Var3;
                                                i22 = i15;
                                                xVar4 = xVar5;
                                            } else {
                                                if (m18 == 1835365492) {
                                                    xVar9.N(i47 + 16);
                                                    if (m18 == 1835365492) {
                                                        xVar9.v();
                                                        String v = xVar9.v();
                                                        if (v != null) {
                                                            b2.w wVar3 = new b2.w();
                                                            wVar3.a = Integer.toString(m11);
                                                            wVar3.r = v0.n(v);
                                                            j0Var3.d = new b2.x(wVar3);
                                                        }
                                                    }
                                                } else if (m18 == 1667329389) {
                                                    b2.w wVar4 = new b2.w();
                                                    wVar4.a = Integer.toString(m11);
                                                    wVar4.r = v0.n("application/x-camera-motion");
                                                    j0Var3.d = new b2.x(wVar4);
                                                }
                                                str2 = str;
                                                xVar4 = xVar9;
                                                i18 = m16;
                                                j0Var2 = j0Var3;
                                                i20 = i46;
                                                i21 = i47;
                                                i22 = i15;
                                            }
                                            xVar4.N(i21 + m17);
                                            i46 = i20 + 1;
                                            xVar9 = xVar4;
                                            j0Var3 = j0Var2;
                                            str = str2;
                                            i15 = i22;
                                            m16 = i18;
                                            j24 = j25;
                                            i39 = 0;
                                            i41 = 1;
                                        }
                                        b(xVar3, i23, i21, m17, m11, str2, z13, tVar3, j0Var, i20);
                                        i22 = i15;
                                        xVar4 = xVar3;
                                        j0Var2 = j0Var;
                                        xVar4.N(i21 + m17);
                                        i46 = i20 + 1;
                                        xVar9 = xVar4;
                                        j0Var3 = j0Var2;
                                        str = str2;
                                        i15 = i22;
                                        m16 = i18;
                                        j24 = j25;
                                        i39 = 0;
                                        i41 = 1;
                                    }
                                    k(xVar3, i19, i21, m17, m11, str2, i22, tVar2, j0Var, i20);
                                    xVar4 = xVar3;
                                    j0Var2 = j0Var;
                                    xVar4.N(i21 + m17);
                                    i46 = i20 + 1;
                                    xVar9 = xVar4;
                                    j0Var3 = j0Var2;
                                    str = str2;
                                    i15 = i22;
                                    m16 = i18;
                                    j24 = j25;
                                    i39 = 0;
                                    i41 = 1;
                                }
                                long j26 = j24;
                                j0 j0Var4 = j0Var3;
                                if (!z10 && (d = dVar3.d(1701082227)) != null) {
                                    f2.e e15 = d.e(1701606260);
                                    if (e15 == null) {
                                        create = null;
                                    } else {
                                        x xVar10 = e15.c;
                                        xVar10.N(8);
                                        int e16 = e(xVar10.m());
                                        int E = xVar10.E();
                                        long[] jArr6 = new long[E];
                                        long[] jArr7 = new long[E];
                                        for (int i55 = 0; i55 < E; i55++) {
                                            jArr6[i55] = e16 == 1 ? xVar10.G() : xVar10.C();
                                            jArr7[i55] = e16 == 1 ? xVar10.u() : xVar10.m();
                                            if (xVar10.x() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            xVar10.O(2);
                                        }
                                        create = Pair.create(jArr6, jArr7);
                                    }
                                    if (create != null) {
                                        jArr = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        xVar = (b2.x) j0Var4.d;
                                        if (xVar != null) {
                                            if (H != 0) {
                                                f2.c cVar = new f2.c(H);
                                                b2.w a2 = xVar.a();
                                                u0 u0Var = ((b2.x) j0Var4.d).l;
                                                a2.k = u0Var != null ? u0Var.a(cVar) : new u0(cVar);
                                                xVar2 = new b2.x(a2);
                                            } else {
                                                xVar2 = xVar;
                                            }
                                            q qVar2 = new q(m11, i11, C, j15, j16, j26, xVar2, j0Var4.b, (r[]) j0Var4.c, j0Var4.a, jArr, jArr2);
                                            kVar2 = kVar;
                                            qVar = qVar2;
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                xVar = (b2.x) j0Var4.d;
                                if (xVar != null) {
                                }
                            }
                            kVar2 = kVar;
                            qVar = null;
                        }
                    } else {
                        i11 = i40;
                    }
                    i12 = (m12 == 0 && m13 == -65536 && (m14 == 65536 || m14 == -65536) && m15 == 0) ? zs.t4 : ((m12 == -65536 || m12 == 65536) && m13 == 0 && m14 == 0 && m15 == -65536) ? zs.K2 : 0;
                    xVar7.O(16);
                    short x102 = xVar7.x();
                    xVar7.O(2);
                    short x112 = xVar7.x();
                    if (j10 != -9223372036854775807L) {
                    }
                    long j232 = g(e7.c).c;
                    if (j14 != -9223372036854775807L) {
                    }
                    f2.d d112 = d10.d(1835626086);
                    d112.getClass();
                    f2.d d122 = d112.d(1937007212);
                    d122.getClass();
                    f2.e e132 = d10.e(1835296868);
                    e132.getClass();
                    x xVar82 = e132.c;
                    xVar82.N(8);
                    int e142 = e(xVar82.m());
                    xVar82.O(e142 != 0 ? 8 : 16);
                    long C3 = xVar82.C();
                    int i452 = xVar82.b;
                    if (e142 != 0) {
                    }
                    i14 = 0;
                    while (true) {
                        if (i14 < i13) {
                        }
                        i14++;
                        i12 = i15;
                        a02 = j16;
                    }
                    long j242 = j12;
                    int H22 = xVar82.H();
                    char[] cArr2 = {(char) (((H22 >> 10) & 31) + 96), (char) (((H22 >> 5) & 31) + 96), (char) ((H22 & 31) + 96)};
                    i17 = 0;
                    while (i17 < i16) {
                    }
                    str = new String(cArr2);
                    e = d122.e(1937011556);
                    if (e != null) {
                    }
                    kVar2 = kVar;
                    qVar = null;
                }
                q qVar3 = (q) kVar2.apply(qVar);
                if (qVar3 == null) {
                    arrayList4 = arrayList5;
                } else {
                    b2.x xVar11 = qVar3.g;
                    f2.d d13 = dVar3.d(1835297121);
                    d13.getClass();
                    f2.d d14 = d13.d(1835626086);
                    d14.getClass();
                    f2.d d15 = d14.d(1937007212);
                    d15.getClass();
                    f2.e e17 = d15.e(1937011578);
                    if (e17 != null) {
                        bVar = new b4.d(e17, xVar11);
                    } else {
                        f2.e e18 = d15.e(1937013298);
                        if (e18 == null) {
                            throw w0.a(null, "Track has no sample table size information");
                        }
                        e2.s sVar = new e2.s();
                        x xVar12 = e18.c;
                        sVar.e = xVar12;
                        xVar12.N(12);
                        sVar.b = xVar12.E() & zs.e4;
                        sVar.a = xVar12.E();
                        bVar = sVar;
                    }
                    int b10 = bVar.b();
                    if (b10 == 0) {
                        arrayList4 = arrayList5;
                        tVar4 = new t(qVar3, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (qVar3.b == 2) {
                            long j27 = qVar3.f;
                            if (j27 > j11) {
                                b2.w a10 = xVar11.a();
                                a10.C = b10 / (j27 / 1000000.0f);
                                qVar3 = qVar3.a(new b2.x(a10));
                            }
                        }
                        b2.x xVar13 = qVar3.g;
                        f2.e e19 = d15.e(1937007471);
                        if (e19 == null) {
                            e19 = d15.e(1668232756);
                            e19.getClass();
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        x xVar14 = e19.c;
                        f2.e e20 = d15.e(1937011555);
                        e20.getClass();
                        x xVar15 = e20.c;
                        f2.e e21 = d15.e(1937011827);
                        e21.getClass();
                        x xVar16 = e21.c;
                        f2.e e22 = d15.e(1937011571);
                        x xVar17 = e22 != null ? e22.c : null;
                        f2.e e23 = d15.e(1668576371);
                        x xVar18 = e23 != null ? e23.c : null;
                        a aVar = new a(xVar15, xVar14, z14);
                        xVar16.N(12);
                        int E2 = xVar16.E() - 1;
                        int E3 = xVar16.E();
                        int E4 = xVar16.E();
                        if (xVar18 != null) {
                            xVar18.N(12);
                            i24 = xVar18.E();
                        } else {
                            i24 = 0;
                        }
                        if (xVar17 != null) {
                            xVar17.N(12);
                            i25 = xVar17.E();
                            if (i25 > 0) {
                                i26 = xVar17.E() - 1;
                                int a11 = bVar.a();
                                x xVar19 = xVar18;
                                String str7 = xVar13.s;
                                z15 = a11 == -1 && ("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && E2 == 0 && i24 == 0 && i25 == 0;
                                ArrayList arrayList8 = new ArrayList();
                                boolean z18 = xVar17 != null;
                                if (z15) {
                                    long[] jArr8 = z12 ? new long[0] : new long[b10];
                                    b bVar2 = bVar;
                                    int[] iArr5 = z12 ? new int[0] : new int[b10];
                                    long[] jArr9 = z12 ? new long[0] : new long[b10];
                                    int i56 = i25;
                                    int[] iArr6 = z12 ? new int[0] : new int[b10];
                                    arrayList2 = arrayList5;
                                    int i57 = i26;
                                    int i58 = E2;
                                    long j28 = j11;
                                    long j29 = j28;
                                    long j30 = j29;
                                    int i59 = 0;
                                    int i60 = 0;
                                    int i61 = 0;
                                    x xVar20 = xVar17;
                                    int i62 = i24;
                                    int i63 = 0;
                                    int i64 = E4;
                                    int i65 = E3;
                                    int i66 = i56;
                                    int i67 = 0;
                                    while (true) {
                                        if (i63 >= b10) {
                                            i27 = i66;
                                            jArr3 = jArr8;
                                            jArr4 = jArr9;
                                            i28 = i67;
                                            iArr = iArr5;
                                            break;
                                        }
                                        boolean z19 = true;
                                        while (i67 == 0) {
                                            z19 = aVar.a();
                                            if (!z19) {
                                                break;
                                            }
                                            int i68 = i66;
                                            long j31 = aVar.d;
                                            i67 = aVar.c;
                                            j30 = j31;
                                            i66 = i68;
                                            i64 = i64;
                                            b10 = b10;
                                        }
                                        int i69 = b10;
                                        i27 = i66;
                                        int i70 = i64;
                                        if (z19) {
                                            if (xVar19 != null) {
                                                while (i61 == 0 && i62 > 0) {
                                                    i61 = xVar19.E();
                                                    i60 = xVar19.m();
                                                    i62--;
                                                }
                                                i61--;
                                            }
                                            int c12 = bVar2.c();
                                            long j32 = c12;
                                            j29 += j32;
                                            if (c12 > i59) {
                                                i59 = c12;
                                            }
                                            if (z12) {
                                                iArr3 = iArr5;
                                            } else {
                                                jArr8[i63] = j30;
                                                iArr5[i63] = c12;
                                                iArr3 = iArr5;
                                                jArr9[i63] = j28 + i60;
                                                iArr6[i63] = xVar20 == null ? 1 : 0;
                                                if (i63 == i57) {
                                                    iArr6[i63] = 1;
                                                    arrayList8.add(Integer.valueOf(i63));
                                                }
                                            }
                                            if (xVar20 == null || i63 != i57) {
                                                i32 = i27;
                                                i33 = i70;
                                                i34 = i59;
                                                i35 = i57;
                                            } else {
                                                i32 = i27 - 1;
                                                if (i32 > 0) {
                                                    i57 = xVar20.E() - 1;
                                                }
                                                i35 = i57;
                                                i33 = i70;
                                                i34 = i59;
                                            }
                                            j28 += i33;
                                            i65--;
                                            if (i65 == 0 && i58 > 0) {
                                                i58--;
                                                i65 = xVar16.E();
                                                i33 = xVar16.m();
                                            }
                                            j30 += j32;
                                            i67--;
                                            i63++;
                                            i66 = i32;
                                            i64 = i33;
                                            iArr5 = iArr3;
                                            i57 = i35;
                                            i59 = i34;
                                            b10 = i69;
                                        } else {
                                            e2.a.l("BoxParsers", "Unexpected end of chunk data");
                                            if (z12) {
                                                jArr3 = jArr8;
                                                jArr4 = jArr9;
                                                b10 = i63;
                                                i28 = i67;
                                                iArr = iArr5;
                                            } else {
                                                long[] copyOf = Arrays.copyOf(jArr8, i63);
                                                int[] copyOf2 = Arrays.copyOf(iArr5, i63);
                                                jArr3 = copyOf;
                                                jArr4 = Arrays.copyOf(jArr9, i63);
                                                iArr6 = Arrays.copyOf(iArr6, i63);
                                                b10 = i63;
                                                i28 = i67;
                                                iArr = copyOf2;
                                            }
                                        }
                                    }
                                    j18 = j28 + i60;
                                    if (xVar19 != null) {
                                        while (i62 > 0) {
                                            if (xVar19.E() != 0) {
                                                z16 = false;
                                                break;
                                            }
                                            xVar19.m();
                                            i62--;
                                        }
                                    }
                                    z16 = true;
                                    if (i27 == 0 && i65 == 0 && i28 == 0 && i58 == 0 && i61 == 0 && z16) {
                                        i29 = i59;
                                        arrayList3 = arrayList8;
                                    } else {
                                        StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                        i29 = i59;
                                        boolean z20 = z16;
                                        arrayList3 = arrayList8;
                                        i0.a.t(sb3, qVar3.a, ": remainingSynchronizationSamples ", i27, ", remainingSamplesAtTimestampDelta ");
                                        i0.a.t(sb3, i65, ", remainingSamplesInChunk ", i28, ", remainingTimestampDeltaChanges ");
                                        sb3.append(i58);
                                        sb3.append(", remainingSamplesAtTimestampOffset ");
                                        sb3.append(i61);
                                        sb3.append(!z20 ? ", ctts invalid" : "");
                                        e2.a.l("BoxParsers", sb3.toString());
                                    }
                                    i30 = b10;
                                    iArr2 = iArr6;
                                    i31 = i29;
                                    j19 = j29;
                                } else {
                                    int i71 = aVar.a;
                                    long[] jArr10 = new long[i71];
                                    int[] iArr7 = new int[i71];
                                    while (aVar.a()) {
                                        int i72 = aVar.b;
                                        jArr10[i72] = aVar.d;
                                        iArr7[i72] = aVar.c;
                                    }
                                    long j33 = E4;
                                    int i73 = TLObject.FLAG_13 / a11;
                                    int i74 = 0;
                                    for (int i75 = 0; i75 < i71; i75++) {
                                        i74 += l0.g(iArr7[i75], i73);
                                    }
                                    jArr3 = new long[i74];
                                    iArr = new int[i74];
                                    jArr4 = new long[i74];
                                    int[] iArr8 = new int[i74];
                                    int i76 = 0;
                                    int i77 = 0;
                                    int i78 = 0;
                                    int i79 = 0;
                                    int i80 = 0;
                                    while (i76 < i71) {
                                        int i81 = iArr7[i76];
                                        long j34 = jArr10[i76];
                                        int i82 = i80;
                                        int i83 = i76;
                                        int i84 = i79;
                                        int i85 = i82;
                                        int i86 = i71;
                                        int i87 = i81;
                                        while (i87 > 0) {
                                            int min = Math.min(i73, i87);
                                            jArr3[i85] = j34;
                                            int i88 = i87;
                                            int i89 = a11 * min;
                                            iArr[i85] = i89;
                                            i84 = Math.max(i84, i89);
                                            long j35 = j33;
                                            jArr4[i85] = j35 * i77;
                                            iArr8[i85] = 1;
                                            j34 += iArr[i85];
                                            i77 += min;
                                            i85++;
                                            i78 += i89;
                                            i87 = i88 - min;
                                            j33 = j35;
                                        }
                                        int i90 = i83 + 1;
                                        i80 = i85;
                                        i79 = i84;
                                        i76 = i90;
                                        i71 = i86;
                                    }
                                    j18 = j33 * i77;
                                    j19 = i78;
                                    if (z12) {
                                        jArr3 = new long[0];
                                    }
                                    if (z12) {
                                        iArr = new int[0];
                                    }
                                    if (z12) {
                                        jArr4 = new long[0];
                                    }
                                    if (z12) {
                                        iArr8 = new int[0];
                                    }
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList8;
                                    i30 = i74;
                                    iArr2 = iArr8;
                                    i31 = i79;
                                }
                                long j36 = j18;
                                long[] jArr11 = jArr3;
                                int[] iArr9 = iArr;
                                j20 = qVar3.f;
                                if (j20 > j11) {
                                    long a04 = l0.a0(j19 * 8, 1000000L, j20, RoundingMode.HALF_DOWN);
                                    if (a04 > j11 && a04 < 2147483647L) {
                                        b2.w a12 = xVar13.a();
                                        a12.h = (int) a04;
                                        qVar3 = qVar3.a(new b2.x(a12));
                                    }
                                }
                                int i91 = qVar3.b;
                                long j37 = qVar3.c;
                                b2.x xVar21 = qVar3.g;
                                long[] jArr12 = qVar3.j;
                                jArr5 = qVar3.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long a05 = l0.a0(j36, 1000000L, j37, roundingMode);
                                int[] f7 = c8.f(arrayList3);
                                if (jArr5 != null) {
                                    if (!z12) {
                                        l0.Z(jArr4, j37);
                                    }
                                    tVar5 = new t(qVar3, jArr11, iArr9, i31, jArr4, iArr2, f7, z18, a05, i30);
                                } else {
                                    long[] jArr13 = jArr4;
                                    if (z12) {
                                        jArr12.getClass();
                                        if (jArr5.length == 1 && jArr5[0] == j11) {
                                            a03 = l0.a0(j36 - jArr12[0], 1000000L, qVar3.c, roundingMode);
                                        } else {
                                            long j38 = j11;
                                            for (int i92 = 0; i92 < jArr5.length; i92++) {
                                                if (jArr12[i92] != -1) {
                                                    j38 += jArr5[i92];
                                                }
                                            }
                                            a03 = l0.a0(j38, 1000000L, qVar3.d, RoundingMode.DOWN);
                                        }
                                        tVar5 = new t(qVar3, jArr11, iArr9, i31, jArr13, iArr2, f7, z18, a03, i30);
                                    } else {
                                        if (jArr5.length == 1 && i91 == 1 && jArr13.length >= 2) {
                                            jArr12.getClass();
                                            long j39 = jArr12[0];
                                            j22 = -1;
                                            long a06 = j39 + l0.a0(jArr5[0], qVar3.c, qVar3.d, roundingMode);
                                            int length = jArr13.length - 1;
                                            if (jArr13[0] <= j39 && j39 < jArr13[l0.i(4, 0, length)] && jArr13[l0.i(jArr13.length + (-4), 0, length)] < a06 && a06 <= 2 + j36) {
                                                long max = Math.max(j11, j36 - a06);
                                                j21 = j36;
                                                long a07 = l0.a0(j39 - jArr13[0], xVar21.L, qVar3.c, roundingMode);
                                                long a08 = l0.a0(max, xVar21.L, qVar3.c, roundingMode);
                                                if ((a07 != j11 || a08 != j11) && a07 <= 2147483647L && a08 <= 2147483647L) {
                                                    wVar.a = (int) a07;
                                                    wVar.b = (int) a08;
                                                    l0.Z(jArr13, j37);
                                                    tVar5 = new t(qVar3, jArr11, iArr9, i31, jArr13, iArr2, f7, z18, l0.a0(jArr5[0], 1000000L, qVar3.d, roundingMode), i30);
                                                }
                                            } else {
                                                j21 = j36;
                                            }
                                        } else {
                                            j21 = j36;
                                            j22 = -1;
                                        }
                                        int i93 = 1;
                                        if (jArr5.length == 1) {
                                            if (jArr5[0] == 0) {
                                                jArr12.getClass();
                                                long j40 = jArr12[0];
                                                for (int i94 = 0; i94 < jArr13.length; i94++) {
                                                    jArr13[i94] = l0.a0(jArr13[i94] - j40, 1000000L, qVar3.c, RoundingMode.DOWN);
                                                }
                                                tVar5 = new t(qVar3, jArr11, iArr9, i31, jArr13, iArr2, f7, z18, l0.a0(j21 - j40, 1000000L, qVar3.c, RoundingMode.DOWN), i30);
                                            } else {
                                                i93 = 1;
                                            }
                                        }
                                        int[] iArr10 = iArr2;
                                        int i95 = i30;
                                        boolean z21 = i91 == i93;
                                        int[] iArr11 = new int[jArr5.length];
                                        int[] iArr12 = new int[jArr5.length];
                                        jArr12.getClass();
                                        int i96 = 0;
                                        boolean z22 = false;
                                        int i97 = 0;
                                        int i98 = 0;
                                        while (i98 < jArr5.length) {
                                            int[] iArr13 = iArr11;
                                            long j41 = jArr12[i98];
                                            if (j41 != j22) {
                                                iArr4 = iArr12;
                                                boolean z23 = z22;
                                                long a09 = l0.a0(jArr5[i98], qVar3.c, qVar3.d, RoundingMode.DOWN) + j41;
                                                i36 = i98;
                                                iArr13[i36] = l0.f(jArr13, j41, true);
                                                int b11 = l0.b(jArr13, a09, z21);
                                                int i99 = b11 - 1;
                                                z17 = z21;
                                                int i100 = 0;
                                                while (b11 < jArr13.length) {
                                                    if (jArr13[b11] >= a09) {
                                                        i100++;
                                                        if (i100 > xVar21.u) {
                                                            break;
                                                        }
                                                    } else {
                                                        i99 = b11;
                                                    }
                                                    b11++;
                                                }
                                                iArr4[i36] = i99 + 1;
                                                int i101 = iArr13[i36];
                                                while (true) {
                                                    i37 = iArr13[i36];
                                                    if (i37 <= 0 || (iArr10[i37] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr13[i36] = i37 - 1;
                                                }
                                                if (i37 == 0 && (iArr10[0] & 1) == 0) {
                                                    iArr13[i36] = i101;
                                                    while (true) {
                                                        int i102 = iArr13[i36];
                                                        if (i102 >= iArr4[i36] || (iArr10[i102] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr13[i36] = i102 + 1;
                                                    }
                                                }
                                                int i103 = iArr4[i36];
                                                int i104 = iArr13[i36];
                                                int i105 = (i103 - i104) + i97;
                                                z22 = z23 | (i96 != i104);
                                                i97 = i105;
                                                i96 = i103;
                                            } else {
                                                z17 = z21;
                                                iArr4 = iArr12;
                                                i36 = i98;
                                            }
                                            i98 = i36 + 1;
                                            iArr11 = iArr13;
                                            iArr12 = iArr4;
                                            z21 = z17;
                                        }
                                        int[] iArr14 = iArr11;
                                        int[] iArr15 = iArr12;
                                        boolean z24 = z22 | (i97 != i95);
                                        long[] jArr14 = z24 ? new long[i97] : jArr11;
                                        int[] iArr16 = z24 ? new int[i97] : iArr9;
                                        int i106 = z24 ? 0 : i31;
                                        int[] iArr17 = z24 ? new int[i97] : iArr10;
                                        ArrayList arrayList9 = z24 ? new ArrayList() : arrayList3;
                                        long[] jArr15 = new long[i97];
                                        int i107 = i106;
                                        int i108 = 0;
                                        boolean z25 = false;
                                        int i109 = 0;
                                        long j42 = 0;
                                        while (i109 < jArr5.length) {
                                            long j43 = jArr12[i109];
                                            int i110 = iArr14[i109];
                                            long[] jArr16 = jArr5;
                                            int i111 = iArr15[i109];
                                            long[] jArr17 = jArr15;
                                            if (z24) {
                                                int i112 = i111 - i110;
                                                System.arraycopy(jArr11, i110, jArr14, i108, i112);
                                                System.arraycopy(iArr9, i110, iArr16, i108, i112);
                                                System.arraycopy(iArr10, i110, iArr17, i108, i112);
                                            }
                                            while (i110 < i111) {
                                                int i113 = i108;
                                                int i114 = i110;
                                                long j44 = qVar3.d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long a010 = l0.a0(j42, 1000000L, j44, roundingMode2);
                                                long a011 = l0.a0(jArr13[i114] - j43, 1000000L, qVar3.c, roundingMode2);
                                                if (a011 < 0) {
                                                    z25 = true;
                                                }
                                                jArr17[i113] = a010 + a011;
                                                if (z24 && iArr16[i113] > i107) {
                                                    i107 = iArr9[i114];
                                                }
                                                if (z24 && !z18 && (iArr17[i113] & 1) != 0) {
                                                    arrayList9.add(Integer.valueOf(i113));
                                                }
                                                i108 = i113 + 1;
                                                i110 = i114 + 1;
                                            }
                                            j42 += jArr16[i109];
                                            i109++;
                                            i108 = i108;
                                            jArr5 = jArr16;
                                            jArr15 = jArr17;
                                        }
                                        long[] jArr18 = jArr15;
                                        long a012 = l0.a0(j42, 1000000L, qVar3.d, RoundingMode.DOWN);
                                        if (z25) {
                                            b2.w a13 = xVar21.a();
                                            a13.x = true;
                                            qVar3 = qVar3.a(new b2.x(a13));
                                        }
                                        tVar4 = new t(qVar3, jArr14, iArr16, i107, jArr18, iArr17, c8.f(arrayList9), z18, a012, jArr14.length);
                                        arrayList4 = arrayList2;
                                        arrayList4.add(tVar4);
                                        i38 = i10 + 1;
                                        dVar2 = dVar;
                                        arrayList5 = arrayList4;
                                    }
                                }
                                tVar4 = tVar5;
                                arrayList4 = arrayList2;
                            } else {
                                xVar17 = null;
                            }
                        } else {
                            i25 = 0;
                        }
                        i26 = -1;
                        int a112 = bVar.a();
                        x xVar192 = xVar18;
                        String str72 = xVar13.s;
                        if (a112 == -1) {
                        }
                        ArrayList arrayList82 = new ArrayList();
                        if (xVar17 != null) {
                        }
                        if (z15) {
                        }
                        long j362 = j18;
                        long[] jArr112 = jArr3;
                        int[] iArr92 = iArr;
                        j20 = qVar3.f;
                        if (j20 > j11) {
                        }
                        int i912 = qVar3.b;
                        long j372 = qVar3.c;
                        b2.x xVar212 = qVar3.g;
                        long[] jArr122 = qVar3.j;
                        jArr5 = qVar3.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long a052 = l0.a0(j362, 1000000L, j372, roundingMode3);
                        int[] f72 = c8.f(arrayList3);
                        if (jArr5 != null) {
                        }
                        tVar4 = tVar5;
                        arrayList4 = arrayList2;
                    }
                    arrayList4.add(tVar4);
                    i38 = i10 + 1;
                    dVar2 = dVar;
                    arrayList5 = arrayList4;
                }
            }
            i38 = i10 + 1;
            dVar2 = dVar;
            arrayList5 = arrayList4;
        }
        return arrayList5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        r1.N(r9);
        r1.O(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
    
        r9 = new q3.l(r0, r8, r1.w(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024c, code lost:
    
        e2.a.b("MetadataUtil", "Skipped unknown metadata entry: " + f2.f.a(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
    
        r1.N(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0077, code lost:
    
        r0 = q3.k.a(w3.p.g(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0080, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        r9 = new q3.o("TCON", r12, e9.n0.y(r0));
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
    
        r12 = new b2.u0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.m() + r13;
        r13 = r1.m();
        r0 = (r13 >> 24) & org.telegram.messenger.zs.e4;
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
    public static u0 j(f2.e eVar) {
        int i10;
        boolean z10;
        u0 u0Var;
        u0 u0Var2;
        int i11;
        x xVar = eVar.c;
        int i12 = 8;
        xVar.N(8);
        boolean z11 = false;
        u0 u0Var3 = new u0(new t0[0]);
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
                u0 u0Var4 = null;
                u0Var3 = u0Var3.b(u0Var4);
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
                        u0Var2 = null;
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
                            i11 = zs.P3;
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
                                        u0Var2 = new u0(new r3.c(i11, i19));
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
                u0Var2 = null;
                u0Var3 = u0Var3.b(u0Var2);
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
                            t0[] t0VarArr = new t0[1];
                            z10 = false;
                            try {
                                t0VarArr[0] = gVar;
                                u0Var = new u0(t0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                u0Var = null;
                                u0Var3 = u0Var3.b(u0Var);
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
                    u0Var3 = u0Var3.b(u0Var);
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
        return u0Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0b32, code lost:
    
        if (r10 == null) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0b34, code lost:
    
        r0 = r10.a;
        r1 = "video/dolby-vision";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0b3d, code lost:
    
        if (r1 != null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b3f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0b40, code lost:
    
        r2 = new b2.w();
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
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0b83, code lost:
    
        if (r16 == null) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0b85, code lost:
    
        r29 = r16.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0b8e, code lost:
    
        r2.H = new b2.o(r8, r30, r9, r29, r31, r32);
        r10 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0ba3, code lost:
    
        if (r10 == null) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0ba5, code lost:
    
        r2.h = v7.c8.e(r10.a);
        r2.i = v7.c8.e(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0bca, code lost:
    
        r66.d = new b2.x(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0bd1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0bb6, code lost:
    
        r10 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0bb8, code lost:
    
        if (r10 == null) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0bba, code lost:
    
        r2.h = v7.c8.e(r10.a);
        r2.i = v7.c8.e(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0b8c, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0b39, code lost:
    
        r0 = r18;
        r1 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0975, code lost:
    
        if (r1 != 3) goto L424;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(x xVar, int i10, int i11, int i12, int i13, String str, int i14, b2.t tVar, j0 j0Var, int i15) {
        int i16;
        int i17;
        float f7;
        int i18;
        int i19;
        int i20;
        int i21;
        String str2;
        int i22;
        b2.t tVar2;
        int i23;
        f2.a aVar;
        int i24;
        String str3;
        int i25;
        b2.t tVar3;
        int i26;
        int i27;
        float f10;
        xa.n nVar;
        String str4;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        b2.o oVar;
        b2.o oVar2;
        int i41;
        String str5;
        int i42;
        w3 w3Var;
        String str6;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47 = i11;
        int i48 = i12;
        b2.t tVar4 = tVar;
        xVar.N(i47 + 16);
        xVar.O(16);
        int H = xVar.H();
        int H2 = xVar.H();
        xVar.O(50);
        int i49 = xVar.b;
        int i50 = i10;
        if (i50 == 1701733238) {
            Pair h = h(xVar, i47, i48);
            if (h != null) {
                i50 = ((Integer) h.first).intValue();
                tVar4 = tVar4 == null ? null : tVar4.a(((r) h.second).b);
                ((r[]) j0Var.c)[i15] = (r) h.second;
            }
            xVar.N(i49);
        }
        String str7 = "video/3gpp";
        String str8 = i50 == 1831958048 ? "video/mpeg" : i50 == 1211250227 ? "video/3gpp" : (i50 == 1634743416 || i50 == 1634743400 || i50 == 1634755432 || i50 == 1634755438 || i50 == 1634755443 || i50 == 1634755439) ? "video/prores" : null;
        float f11 = 1.0f;
        int i51 = 8;
        List list = null;
        ByteBuffer byteBuffer = null;
        f2.a aVar2 = null;
        String str9 = null;
        byte[] bArr = null;
        int i52 = -1;
        int i53 = -1;
        int i54 = -1;
        int i55 = -1;
        int i56 = -1;
        boolean z10 = false;
        int i57 = -1;
        int i58 = -1;
        int i59 = -1;
        int i60 = 8;
        int i61 = 8;
        z zVar = null;
        z0 z0Var = null;
        xa.n nVar2 = null;
        while (true) {
            if (i49 - i47 >= i48) {
                i16 = H;
                i17 = H2;
                f7 = f11;
                i18 = i57;
                i19 = i58;
                i20 = i60;
                i21 = i61;
                str2 = str8;
                i22 = i59;
                tVar2 = tVar4;
                i23 = i52;
                aVar = aVar2;
                break;
            }
            xVar.N(i49);
            int i62 = xVar.b;
            int m10 = xVar.m();
            if (m10 == 0 && xVar.b - i47 == i48) {
                i16 = H;
                i17 = H2;
                f7 = f11;
                aVar = aVar2;
                i18 = i57;
                i19 = i58;
                i20 = i60;
                i21 = i61;
                str2 = str8;
                i22 = i59;
                tVar2 = tVar4;
                i23 = i52;
                break;
            }
            String str10 = "childAtomSize must be positive";
            c3.b.b("childAtomSize must be positive", m10 > 0);
            int m11 = xVar.m();
            if (m11 == 1635148611) {
                c3.b.b(null, str8 == null);
                xVar.N(i62 + 8);
                c3.d a2 = c3.d.a(xVar);
                list = a2.a;
                j0Var.a = a2.b;
                if (!z10) {
                    f11 = a2.k;
                }
                String str11 = a2.l;
                int i63 = a2.j;
                int i64 = a2.g;
                int i65 = a2.h;
                str9 = str11;
                int i66 = a2.i;
                i60 = a2.e;
                tVar3 = tVar4;
                i26 = H;
                i27 = H2;
                i24 = i49;
                i57 = i64;
                i28 = i50;
                str3 = str7;
                i58 = i65;
                f10 = f11;
                i25 = i66;
                i30 = i51;
                i31 = a2.f;
                i53 = i63;
                str8 = "video/avc";
            } else {
                i24 = i49;
                if (m11 == 1752589123) {
                    c3.b.b(null, str8 == null);
                    xVar.N(i62 + 8);
                    c3.x a10 = c3.x.a(xVar, false, null);
                    List list2 = a10.a;
                    j0Var.a = a10.b;
                    if (!z10) {
                        f11 = a10.l;
                    }
                    int i67 = a10.m;
                    int i68 = a10.c;
                    String str12 = a10.n;
                    int i69 = a10.k;
                    if (i69 != -1) {
                        i52 = i69;
                    }
                    int i70 = a10.d;
                    int i71 = a10.e;
                    int i72 = a10.h;
                    int i73 = a10.i;
                    int i74 = a10.j;
                    int i75 = a10.f;
                    int i76 = a10.g;
                    tVar3 = tVar4;
                    nVar2 = a10.o;
                    i26 = H;
                    i27 = H2;
                    i28 = i50;
                    str3 = str7;
                    f10 = f11;
                    list = list2;
                    i57 = i72;
                    i58 = i73;
                    i25 = i74;
                    i60 = i75;
                    i30 = i51;
                    i54 = i68;
                    str9 = str12;
                    i56 = i71;
                    i55 = i70;
                    i31 = i76;
                    i53 = i67;
                    str8 = "video/hevc";
                } else {
                    str3 = str7;
                    if (m11 == 1818785347) {
                        c3.b.b("lhvC must follow hvcC atom", "video/hevc".equals(str8));
                        xa.n nVar3 = nVar2;
                        c3.b.b("must have at least two layers", nVar3 != null && ((n0) nVar3.a).size() >= 2);
                        xVar.N(i62 + 8);
                        nVar3.getClass();
                        c3.x a11 = c3.x.a(xVar, true, nVar3);
                        c3.b.b("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", j0Var.a == a11.b);
                        int i77 = a11.h;
                        int i78 = i57;
                        if (i77 != -1) {
                            c3.b.b("colorSpace must be the same for both views", i78 == i77);
                        }
                        int i79 = a11.i;
                        int i80 = i58;
                        if (i79 != -1) {
                            c3.b.b("colorRange must be the same for both views", i80 == i79);
                        }
                        int i81 = a11.j;
                        if (i81 != -1) {
                            i46 = i59;
                            c3.b.b("colorTransfer must be the same for both views", i46 == i81);
                        } else {
                            i46 = i59;
                        }
                        int i82 = i60;
                        int i83 = i46;
                        c3.b.b("bitdepthLuma must be the same for both views", i82 == a11.f);
                        int i84 = i61;
                        c3.b.b("bitdepthChroma must be the same for both views", i84 == a11.g);
                        if (list != null) {
                            k0 t10 = n0.t();
                            t10.d(list);
                            t10.d(a11.a);
                            list = t10.f();
                        } else {
                            c3.b.b("initializationData must be already set from hvcC atom", false);
                        }
                        nVar2 = nVar3;
                        tVar3 = tVar4;
                        i26 = H;
                        i27 = H2;
                        str8 = "video/mv-hevc";
                        i57 = i78;
                        i28 = i50;
                        i58 = i80;
                        i60 = i82;
                        f10 = f11;
                        i25 = i83;
                        i31 = i84;
                        i30 = i51;
                        str9 = a11.n;
                    } else {
                        int i85 = i57;
                        int i86 = i58;
                        i25 = i59;
                        int i87 = i60;
                        int i88 = i61;
                        xa.n nVar4 = nVar2;
                        int i89 = 7;
                        int i90 = 4;
                        if (m11 == 1987470147) {
                            c3.b.b(null, str8 == null);
                            xVar.N(i62 + 8);
                            try {
                                if (xVar.m() != 0) {
                                    throw w0.a(null, "Unsupported VVC version");
                                }
                                int A = xVar.A();
                                int i91 = ((A >> 1) & 3) + 1;
                                str6 = "L";
                                if ((A & 1) != 0) {
                                    xVar.O(1);
                                    int A2 = (xVar.A() >> 4) & 7;
                                    i44 = (xVar.A() >> 5) & 7;
                                    int A3 = xVar.A() & 63;
                                    int A4 = xVar.A();
                                    int i92 = (A4 >> 1) & zs.L1;
                                    str6 = (A4 & 1) != 0 ? "H" : "L";
                                    i45 = xVar.A();
                                    xVar.O(A3);
                                    if (A2 > 1) {
                                        int A5 = xVar.A();
                                        int i93 = 1;
                                        int i94 = 0;
                                        while (true) {
                                            int i95 = A2;
                                            if (i94 >= i95 - 1) {
                                                break;
                                            }
                                            if (((A5 >> (7 - i94)) & 1) != 0) {
                                                xVar.O(i93);
                                            }
                                            i94++;
                                            A2 = i95;
                                            i93 = 1;
                                        }
                                    }
                                    xVar.O(xVar.A() * 4);
                                    xVar.O(6);
                                    i43 = i92;
                                } else {
                                    i43 = 0;
                                    i44 = 0;
                                    i45 = 0;
                                }
                                int A6 = xVar.A();
                                int i96 = i44;
                                int i97 = xVar.b;
                                tVar3 = tVar4;
                                f10 = f11;
                                int i98 = 0;
                                int i99 = 0;
                                while (i98 < A6) {
                                    int i100 = i98;
                                    int A7 = xVar.A() & 31;
                                    int i101 = H2;
                                    int H3 = (A7 == 13 || A7 == 12) ? 1 : xVar.H();
                                    int i102 = 0;
                                    while (i102 < H3) {
                                        int i103 = H3;
                                        int H4 = xVar.H();
                                        i99 = H4 + 4 + i99;
                                        xVar.O(H4);
                                        i102++;
                                        H3 = i103;
                                    }
                                    i98 = i100 + 1;
                                    H2 = i101;
                                }
                                i27 = H2;
                                xVar.N(i97);
                                byte[] bArr2 = new byte[i99];
                                int i104 = 0;
                                int i105 = 0;
                                while (i104 < A6) {
                                    int A8 = xVar.A() & 31;
                                    int i106 = i104;
                                    int H5 = (A8 == 13 || A8 == 12) ? 1 : xVar.H();
                                    int i107 = i105;
                                    int i108 = 0;
                                    while (i108 < H5) {
                                        int i109 = H5;
                                        int H6 = xVar.H();
                                        System.arraycopy(f2.q.a, 0, bArr2, i107, i90);
                                        int i110 = i107 + 4;
                                        xVar.k(i110, H6, bArr2);
                                        i107 = i110 + H6;
                                        i108++;
                                        H5 = i109;
                                        A6 = A6;
                                        H = H;
                                        i90 = 4;
                                    }
                                    i104 = i106 + 1;
                                    i105 = i107;
                                    i90 = 4;
                                }
                                i26 = H;
                                Locale locale = Locale.US;
                                String str13 = "vvc1." + i43 + "." + str6 + i45;
                                x1 y3 = n0.y(bArr2);
                                i60 = i96 + 8;
                                j0Var.a = i91;
                                i30 = i51;
                                str9 = str13;
                                nVar2 = nVar4;
                                str8 = "video/vvc";
                                i57 = i85;
                                i28 = i50;
                                i58 = i86;
                                i31 = i60;
                                i53 = 16;
                                list = y3;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw w0.a(e, "Error parsing VVC configuration");
                            }
                        } else {
                            tVar3 = tVar4;
                            i26 = H;
                            i27 = H2;
                            f10 = f11;
                            if (m11 == 1986361461) {
                                xVar.N(i62 + 8);
                                int i111 = xVar.b;
                                w3 w3Var2 = null;
                                while (i111 - i62 < m10) {
                                    xVar.N(i111);
                                    int m12 = xVar.m();
                                    c3.b.b(str10, m12 > 0);
                                    if (xVar.m() == 1702454643) {
                                        xVar.N(i111 + 8);
                                        int i112 = xVar.b;
                                        while (true) {
                                            if (i112 - i111 >= m12) {
                                                str5 = str10;
                                                i42 = i111;
                                                w3Var = null;
                                                break;
                                            }
                                            xVar.N(i112);
                                            int m13 = xVar.m();
                                            c3.b.b(str10, m13 > 0);
                                            if (xVar.m() == 1937011305) {
                                                xVar.O(4);
                                                int A9 = xVar.A();
                                                str5 = str10;
                                                i42 = i111;
                                                w3Var = new w3(new ea.b((A9 & 1) == 1, (A9 & 2) == 2, (A9 & 8) == i51));
                                            } else {
                                                i112 += m13;
                                                i51 = 8;
                                            }
                                        }
                                        w3Var2 = w3Var;
                                    } else {
                                        str5 = str10;
                                        i42 = i111;
                                    }
                                    i111 = i42 + m12;
                                    str10 = str5;
                                    i51 = 8;
                                }
                                s9.g gVar = w3Var2 == null ? null : new s9.g(w3Var2);
                                if (gVar != null) {
                                    ea.b bVar = (ea.b) ((w3) gVar.a).a;
                                    if (nVar4 == null || ((n0) nVar4.a).size() < 2) {
                                        i41 = i52;
                                        if (i41 == -1) {
                                            i52 = bVar.c ? 5 : 4;
                                            nVar2 = nVar4;
                                        }
                                        i52 = i41;
                                        nVar2 = nVar4;
                                    } else {
                                        c3.b.b("both eye views must be marked as available", bVar.a && bVar.b);
                                        c3.b.b("for MV-HEVC, eye_views_reversed must be set to false", !bVar.c);
                                    }
                                }
                                i41 = i52;
                                i52 = i41;
                                nVar2 = nVar4;
                            } else {
                                int i113 = i52;
                                if (m11 == 1685480259 || m11 == 1685485123 || m11 == 1685485379) {
                                    nVar = nVar4;
                                    str4 = str8;
                                    i28 = i50;
                                    i29 = i25;
                                    i30 = 8;
                                    aVar2 = f2.a.a(xVar);
                                } else {
                                    int i114 = 11;
                                    if (m11 == 1987076931) {
                                        c3.b.b(null, str8 == null);
                                        String str14 = i50 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        xVar.N(i62 + 12);
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
                                        i57 = b2.o.f(A13);
                                        i58 = z11 ? 1 : 2;
                                        str8 = str14;
                                        nVar2 = nVar4;
                                        i52 = i113;
                                        i25 = b2.o.g(A14);
                                        i28 = i50;
                                        i60 = i31;
                                        i30 = 8;
                                    } else if (m11 == 1635135811) {
                                        int i115 = m10 - 8;
                                        byte[] bArr4 = new byte[i115];
                                        xVar.k(0, i115, bArr4);
                                        list = n0.y(bArr4);
                                        xVar.N(i62 + 8);
                                        byte[] bArr5 = xVar.a;
                                        a4.g gVar2 = new a4.g(bArr5, bArr5.length);
                                        gVar2.d0(xVar.b * 8);
                                        gVar2.g0(1);
                                        int i116 = gVar2.i(3);
                                        gVar2.f0(6);
                                        boolean h10 = gVar2.h();
                                        boolean h11 = gVar2.h();
                                        int i117 = -1;
                                        if (i116 == 2 && h10) {
                                            i32 = h11 ? 12 : 10;
                                            i33 = h11 ? 12 : 10;
                                        } else if (i116 <= 2) {
                                            int i118 = h10 ? 10 : 8;
                                            i33 = h10 ? 10 : 8;
                                            i32 = i118;
                                        } else {
                                            i32 = -1;
                                            i33 = -1;
                                        }
                                        gVar2.f0(13);
                                        gVar2.e0();
                                        int i119 = gVar2.i(4);
                                        if (i119 != 1) {
                                            e2.a.g("BoxParsers", "Unsupported obu_type: " + i119);
                                            oVar2 = new b2.o(-1, -1, -1, null, i32, i33);
                                        } else if (gVar2.h()) {
                                            e2.a.g("BoxParsers", "Unsupported obu_extension_flag");
                                            oVar2 = new b2.o(-1, -1, -1, null, i32, i33);
                                        } else {
                                            boolean h12 = gVar2.h();
                                            gVar2.e0();
                                            if (!h12 || gVar2.i(8) <= 127) {
                                                int i120 = gVar2.i(3);
                                                gVar2.e0();
                                                if (gVar2.h()) {
                                                    e2.a.g("BoxParsers", "Unsupported reduced_still_picture_header");
                                                    oVar2 = new b2.o(-1, -1, -1, null, i32, i33);
                                                } else if (gVar2.h()) {
                                                    e2.a.g("BoxParsers", "Unsupported timing_info_present_flag");
                                                    oVar2 = new b2.o(-1, -1, -1, null, i32, i33);
                                                } else if (gVar2.h()) {
                                                    e2.a.g("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                    oVar2 = new b2.o(-1, -1, -1, null, i32, i33);
                                                } else {
                                                    int i121 = 5;
                                                    int i122 = gVar2.i(5);
                                                    int i123 = 0;
                                                    while (i123 <= i122) {
                                                        gVar2.f0(12);
                                                        if (gVar2.i(i121) > i89) {
                                                            gVar2.e0();
                                                        }
                                                        i123++;
                                                        i121 = 5;
                                                        i89 = 7;
                                                    }
                                                    int i124 = gVar2.i(4);
                                                    int i125 = gVar2.i(4);
                                                    gVar2.f0(i124 + 1);
                                                    gVar2.f0(i125 + 1);
                                                    if (gVar2.h()) {
                                                        i34 = 7;
                                                        gVar2.f0(7);
                                                    } else {
                                                        i34 = 7;
                                                    }
                                                    gVar2.f0(i34);
                                                    boolean h13 = gVar2.h();
                                                    if (h13) {
                                                        gVar2.f0(2);
                                                    }
                                                    if (gVar2.h()) {
                                                        i36 = 2;
                                                        i35 = 1;
                                                    } else {
                                                        i35 = 1;
                                                        i36 = gVar2.i(1);
                                                    }
                                                    if (i36 > 0 && !gVar2.h()) {
                                                        gVar2.f0(i35);
                                                    }
                                                    if (h13) {
                                                        i37 = 3;
                                                        gVar2.f0(3);
                                                    } else {
                                                        i37 = 3;
                                                    }
                                                    gVar2.f0(i37);
                                                    boolean h14 = gVar2.h();
                                                    if (i120 == 2 && h14) {
                                                        gVar2.e0();
                                                    }
                                                    boolean z12 = i120 != 1 && gVar2.h();
                                                    if (gVar2.h()) {
                                                        int i126 = gVar2.i(8);
                                                        int i127 = gVar2.i(8);
                                                        int i128 = (!z12 && i126 == 1 && i127 == 13 && gVar2.i(8) == 0) ? 1 : gVar2.i(1);
                                                        int f12 = b2.o.f(i126);
                                                        int i129 = i128 == 1 ? 1 : 2;
                                                        i38 = f12;
                                                        i39 = i32;
                                                        i40 = b2.o.g(i127);
                                                        i117 = i129;
                                                    } else {
                                                        i38 = -1;
                                                        i39 = i32;
                                                        i40 = -1;
                                                    }
                                                    oVar = new b2.o(i38, i117, i40, null, i39, i33);
                                                    int i130 = oVar.e;
                                                    int i131 = oVar.f;
                                                    int i132 = oVar.a;
                                                    int i133 = oVar.b;
                                                    i25 = oVar.c;
                                                    nVar2 = nVar4;
                                                    i52 = i113;
                                                    i60 = i130;
                                                    i31 = i131;
                                                    i57 = i132;
                                                    i58 = i133;
                                                    i28 = i50;
                                                    i30 = 8;
                                                    str8 = "video/av01";
                                                }
                                            } else {
                                                e2.a.g("BoxParsers", "Excessive obu_size");
                                                oVar2 = new b2.o(-1, -1, -1, null, i32, i33);
                                            }
                                        }
                                        oVar = oVar2;
                                        int i1302 = oVar.e;
                                        int i1312 = oVar.f;
                                        int i1322 = oVar.a;
                                        int i1332 = oVar.b;
                                        i25 = oVar.c;
                                        nVar2 = nVar4;
                                        i52 = i113;
                                        i60 = i1302;
                                        i31 = i1312;
                                        i57 = i1322;
                                        i58 = i1332;
                                        i28 = i50;
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
                                        nVar2 = nVar4;
                                        i52 = i113;
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
                                            nVar = nVar4;
                                            short x16 = xVar.x();
                                            str4 = str8;
                                            short x17 = xVar.x();
                                            long C = xVar.C();
                                            long C2 = xVar.C();
                                            i28 = i50;
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
                                            nVar = nVar4;
                                            str4 = str8;
                                            i28 = i50;
                                            if (m11 == 1681012275) {
                                                c3.b.b(null, str4 == null);
                                                nVar2 = nVar;
                                                str8 = str3;
                                            } else if (m11 == 1702061171) {
                                                c3.b.b(null, str4 == null);
                                                z0 c10 = c(i62, xVar);
                                                String str15 = (String) c10.c;
                                                byte[] bArr6 = (byte[]) c10.d;
                                                if (bArr6 != null) {
                                                    list = n0.y(bArr6);
                                                }
                                                z0Var = c10;
                                                str8 = str15;
                                                nVar2 = nVar;
                                            } else if (m11 == 1651798644) {
                                                xVar.N(i62 + 8);
                                                xVar.O(4);
                                                zVar = new z(xVar.C(), xVar.C());
                                            } else if (m11 == 1885434736) {
                                                xVar.N(i62 + 8);
                                                f10 = xVar.E() / xVar.E();
                                                nVar2 = nVar;
                                                i58 = i86;
                                                i31 = i88;
                                                str8 = str4;
                                                i30 = 8;
                                                z10 = true;
                                                i52 = i113;
                                                i57 = i85;
                                                i60 = i87;
                                            } else if (m11 == 1937126244) {
                                                int i134 = i62 + 8;
                                                while (true) {
                                                    if (i134 - i62 >= m10) {
                                                        bArr = null;
                                                        break;
                                                    }
                                                    xVar.N(i134);
                                                    int m14 = xVar.m();
                                                    if (xVar.m() == 1886547818) {
                                                        bArr = Arrays.copyOfRange(xVar.a, i134, m14 + i134);
                                                        break;
                                                    }
                                                    i134 += m14;
                                                }
                                            } else if (m11 == 1936995172) {
                                                int A15 = xVar.A();
                                                int i135 = 3;
                                                xVar.O(3);
                                                if (A15 == 0) {
                                                    int A16 = xVar.A();
                                                    if (A16 == 0) {
                                                        i135 = 0;
                                                    } else if (A16 == 1) {
                                                        i135 = 1;
                                                    } else if (A16 == 2) {
                                                        i135 = 2;
                                                    }
                                                    nVar2 = nVar;
                                                    i58 = i86;
                                                    i31 = i88;
                                                    str8 = str4;
                                                    i30 = 8;
                                                    i52 = i135;
                                                    i57 = i85;
                                                    i60 = i87;
                                                }
                                                i135 = i113;
                                                nVar2 = nVar;
                                                i58 = i86;
                                                i31 = i88;
                                                str8 = str4;
                                                i30 = 8;
                                                i52 = i135;
                                                i57 = i85;
                                                i60 = i87;
                                            } else if (m11 == 1634760259) {
                                                int i136 = m10 - 12;
                                                byte[] bArr7 = new byte[i136];
                                                xVar.N(i62 + 12);
                                                int i137 = 0;
                                                xVar.k(0, i136, bArr7);
                                                byte[] bArr8 = e2.g.a;
                                                t6.c(i136, "Invalid APV CSD length: %s", i136 >= 17);
                                                byte b11 = bArr7[0];
                                                t6.c(b11, "Invalid APV CSD version: %s", b11 == 1);
                                                int i138 = bArr7[5] & 255;
                                                int i139 = bArr7[6] & 255;
                                                int i140 = bArr7[7] & 255;
                                                String str16 = l0.a;
                                                Locale locale2 = Locale.US;
                                                StringBuilder m15 = i0.a.m("apv1.apvf", i138, ".apvl", i139, ".apvb");
                                                m15.append(i140);
                                                str9 = m15.toString();
                                                x1 y10 = n0.y(bArr7);
                                                x xVar2 = new x(bArr7);
                                                a4.g gVar3 = new a4.g(bArr7, i136);
                                                i30 = 8;
                                                gVar3.d0(xVar2.b * 8);
                                                gVar3.g0(1);
                                                int i141 = gVar3.i(8);
                                                int i142 = 0;
                                                int i143 = -1;
                                                int i144 = -1;
                                                i31 = -1;
                                                i57 = -1;
                                                i60 = -1;
                                                while (i142 < i141) {
                                                    gVar3.g0(1);
                                                    int i145 = gVar3.i(8);
                                                    int i146 = i31;
                                                    int i147 = i144;
                                                    int i148 = i143;
                                                    int i149 = i137;
                                                    while (i149 < i145) {
                                                        gVar3.f0(6);
                                                        boolean h15 = gVar3.h();
                                                        gVar3.e0();
                                                        gVar3.g0(i114);
                                                        gVar3.f0(4);
                                                        i60 = gVar3.i(4) + 8;
                                                        gVar3.g0(1);
                                                        if (h15) {
                                                            int i150 = gVar3.i(8);
                                                            int i151 = gVar3.i(8);
                                                            gVar3.g0(1);
                                                            boolean h16 = gVar3.h();
                                                            int f13 = b2.o.f(i150);
                                                            int i152 = h16 ? 1 : 2;
                                                            i147 = b2.o.g(i151);
                                                            i57 = f13;
                                                            i148 = i152;
                                                        }
                                                        i149++;
                                                        i146 = i60;
                                                        i114 = 11;
                                                    }
                                                    i142++;
                                                    i143 = i148;
                                                    i144 = i147;
                                                    i31 = i146;
                                                    i114 = 11;
                                                    i137 = 0;
                                                }
                                                str8 = "video/apv";
                                                list = y10;
                                                i58 = i143;
                                                i25 = i144;
                                                nVar2 = nVar;
                                                i52 = i113;
                                            } else {
                                                i30 = 8;
                                                if (m11 == 1668246642) {
                                                    i29 = i25;
                                                    if (i85 == -1 && i29 == -1) {
                                                        int m16 = xVar.m();
                                                        if (m16 == 1852009592 || m16 == 1852009571) {
                                                            int H7 = xVar.H();
                                                            int H8 = xVar.H();
                                                            xVar.O(2);
                                                            boolean z13 = m10 == 19 && (xVar.A() & 128) != 0;
                                                            int f14 = b2.o.f(H7);
                                                            i58 = z13 ? 1 : 2;
                                                            i25 = b2.o.g(H8);
                                                            nVar2 = nVar;
                                                            i31 = i88;
                                                            str8 = str4;
                                                            i57 = f14;
                                                            i52 = i113;
                                                            i60 = i87;
                                                        } else {
                                                            e2.a.l("BoxParsers", "Unsupported color type: " + f2.f.a(m16));
                                                        }
                                                    }
                                                } else {
                                                    i29 = i25;
                                                }
                                            }
                                            i58 = i86;
                                            i60 = i87;
                                            i31 = i88;
                                            i30 = 8;
                                            i52 = i113;
                                            i57 = i85;
                                        }
                                        nVar2 = nVar;
                                        i58 = i86;
                                        i31 = i88;
                                        str8 = str4;
                                        i30 = 8;
                                        i52 = i113;
                                        i57 = i85;
                                        i60 = i87;
                                    }
                                }
                                i25 = i29;
                                nVar2 = nVar;
                                i58 = i86;
                                i31 = i88;
                                str8 = str4;
                                i52 = i113;
                                i57 = i85;
                                i60 = i87;
                            }
                            i28 = i50;
                            i58 = i86;
                            i60 = i87;
                            i31 = i88;
                            i30 = 8;
                            i57 = i85;
                        }
                    }
                }
            }
            i49 = i24 + m10;
            i47 = i11;
            i48 = i12;
            i51 = i30;
            str7 = str3;
            tVar4 = tVar3;
            i50 = i28;
            i59 = i25;
            f11 = f10;
            H2 = i27;
            H = i26;
            i61 = i31;
        }
    }
}
