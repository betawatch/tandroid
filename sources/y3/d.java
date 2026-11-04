package y3;

import android.util.Pair;
import b8.od;
import b8.zb;
import c3.x;
import d2.r0;
import d2.s0;
import d2.u0;
import d2.v;
import d2.v0;
import e3.w;
import g2.k0;
import g2.n0;
import g2.y;
import g9.f0;
import g9.i0;
import g9.s1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.i9;
import w2.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static final byte[] a;

    static {
        String str = n0.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(y yVar) {
        int i3 = yVar.b;
        yVar.O(4);
        if (yVar.m() != 1751411826) {
            i3 += 4;
        }
        yVar.N(i3);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r38v11 java.util.List), method size: 3236
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static void b(g2.y r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, d2.s r56, g2.k0 r57, int r58) {
        /*
            Method dump skipped, instructions count: 3236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.d.b(g2.y, int, int, int, int, java.lang.String, boolean, d2.s, g2.k0, int):void");
    }

    public static z0 c(int i3, y yVar) {
        yVar.N(i3 + 12);
        yVar.O(1);
        d(yVar);
        yVar.O(2);
        int A = yVar.A();
        if ((A & 128) != 0) {
            yVar.O(2);
        }
        if ((A & 64) != 0) {
            yVar.O(yVar.A());
        }
        if ((A & 32) != 0) {
            yVar.O(2);
        }
        yVar.O(1);
        d(yVar);
        String e10 = u0.e(yVar.A());
        if ("audio/mpeg".equals(e10) || "audio/vnd.dts".equals(e10) || "audio/vnd.dts.hd".equals(e10)) {
            return new z0(e10, null, -1L, -1L);
        }
        yVar.O(4);
        long C = yVar.C();
        long C2 = yVar.C();
        yVar.O(1);
        int d = d(yVar);
        long j10 = C2;
        byte[] bArr = new byte[d];
        yVar.k(0, d, bArr);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new z0(e10, bArr, j10, C > 0 ? C : -1L);
    }

    public static int d(y yVar) {
        int A = yVar.A();
        int i3 = A & hs.L1;
        while ((A & 128) == 128) {
            A = yVar.A();
            i3 = (i3 << 7) | (A & hs.L1);
        }
        return i3;
    }

    public static int e(int i3) {
        return (i3 >> 24) & hs.e4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = r14.m();
        r10 = r14.m();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.k(0, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r11 = new h2.a(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        com.google.android.recaptcha.internal.a.q("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s0 f(h2.c cVar) {
        h2.d e10 = cVar.e(1751411826);
        h2.d e11 = cVar.e(1801812339);
        h2.d e12 = cVar.e(1768715124);
        if (e10 == null || e11 == null || e12 == null) {
            return null;
        }
        y yVar = e10.c;
        yVar.N(16);
        if (yVar.m() != 1835299937) {
            return null;
        }
        y yVar2 = e11.c;
        yVar2.N(12);
        int m10 = yVar2.m();
        String[] strArr = new String[m10];
        for (int i3 = 0; i3 < m10; i3++) {
            int m11 = yVar2.m();
            yVar2.O(4);
            strArr[i3] = yVar2.y(m11 - 8, StandardCharsets.UTF_8);
        }
        y yVar3 = e12.c;
        yVar3.N(8);
        ArrayList arrayList = new ArrayList();
        while (yVar3.a() > 8) {
            int i10 = yVar3.b;
            int m12 = yVar3.m();
            int m13 = yVar3.m() - 1;
            if (m13 < 0 || m13 >= m10) {
                com.google.android.recaptcha.internal.a.o(m13, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                String str = strArr[m13];
                int i11 = i10 + m12;
                while (true) {
                    int i12 = yVar3.b;
                    if (i12 >= i11) {
                        break;
                    }
                    int m14 = yVar3.m();
                    if (yVar3.m() == 1684108385) {
                        break;
                    }
                    yVar3.N(i12 + m14);
                }
                h2.a aVar = null;
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            yVar3.N(i10 + m12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new s0(arrayList);
    }

    public static h2.f g(y yVar) {
        long u10;
        long u11;
        yVar.N(8);
        if (e(yVar.m()) == 0) {
            u10 = yVar.C();
            u11 = yVar.C();
        } else {
            u10 = yVar.u();
            u11 = yVar.u();
        }
        return new h2.f(u10, u11, yVar.C());
    }

    public static Pair h(y yVar, int i3, int i10) {
        Integer num;
        s sVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z10;
        int i13 = yVar.b;
        while (i13 - i3 < i10) {
            yVar.N(i13);
            int m10 = yVar.m();
            e3.b.b("childAtomSize must be positive", m10 > 0);
            if (yVar.m() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                while (i14 - i13 < m10) {
                    yVar.N(i14);
                    int m11 = yVar.m();
                    int m12 = yVar.m();
                    if (m12 == 1718775137) {
                        num3 = Integer.valueOf(yVar.m());
                    } else if (m12 == 1935894637) {
                        yVar.O(4);
                        str = yVar.y(4, StandardCharsets.UTF_8);
                    } else if (m12 == 1935894633) {
                        i16 = i14;
                        i15 = m11;
                    }
                    i14 += m11;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    e3.b.b("frma atom is mandatory", num3 != null);
                    e3.b.b("schi atom is mandatory", i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = num3;
                            sVar = null;
                            break;
                        }
                        yVar.N(i17);
                        int m13 = yVar.m();
                        if (yVar.m() == 1952804451) {
                            int e10 = e(yVar.m());
                            yVar.O(1);
                            if (e10 == 0) {
                                yVar.O(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int A = yVar.A();
                                i11 = A & 15;
                                i12 = (A & hs.P3) >> 4;
                            }
                            if (yVar.A() == 1) {
                                num2 = num3;
                                z10 = true;
                            } else {
                                num2 = num3;
                                z10 = false;
                            }
                            int A2 = yVar.A();
                            byte[] bArr2 = new byte[16];
                            yVar.k(0, 16, bArr2);
                            if (z10 && A2 == 0) {
                                int A3 = yVar.A();
                                byte[] bArr3 = new byte[A3];
                                yVar.k(0, A3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            sVar = new s(z10, str, A2, bArr2, i12, i11, bArr);
                        } else {
                            i17 += m13;
                        }
                    }
                    e3.b.b("tenc atom is mandatory", sVar != null);
                    String str2 = n0.a;
                    create = Pair.create(num, sVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += m10;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:394:0x00e5, code lost:
    
        if (r11 == 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:688:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0ad9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList i(h2.c cVar, w wVar, long j10, d2.s sVar, boolean z10, boolean z11, f9.k kVar, boolean z12) {
        long j11;
        long j12;
        long j13;
        ArrayList arrayList;
        int i3;
        int i10;
        int i11;
        long j14;
        long j15;
        long a02;
        int i12;
        int i13;
        int i14;
        long j16;
        int i15;
        int i16;
        String str;
        h2.d e10;
        long[] jArr;
        long[] jArr2;
        v vVar;
        v vVar2;
        f9.k kVar2;
        r rVar;
        h2.c d;
        Pair create;
        int i17;
        d2.s sVar2;
        String str2;
        int i18;
        y yVar;
        k0 k0Var;
        int i19;
        int i20;
        int i21;
        k0 k0Var2;
        y yVar2;
        d2.s sVar3;
        boolean z13;
        int i22;
        y yVar3;
        s1 s1Var;
        long j17;
        c cVar2;
        boolean z14;
        int i23;
        int i24;
        int i25;
        boolean z15;
        ArrayList arrayList2;
        int i26;
        long[] jArr3;
        long[] jArr4;
        int i27;
        int[] iArr;
        long j18;
        boolean z16;
        int i28;
        ArrayList arrayList3;
        int i29;
        int[] iArr2;
        int i30;
        long j19;
        int[] iArr3;
        int i31;
        int i32;
        int i33;
        int i34;
        long j20;
        long[] jArr5;
        long j21;
        long j22;
        u uVar;
        ArrayList arrayList4;
        boolean z17;
        int[] iArr4;
        int i35;
        int i36;
        u uVar2;
        long a03;
        h2.c cVar3 = cVar;
        ArrayList arrayList5 = new ArrayList();
        int i37 = 0;
        for (ArrayList arrayList6 = cVar3.e; i37 < arrayList6.size(); arrayList6 = arrayList) {
            h2.c cVar4 = (h2.c) arrayList6.get(i37);
            if (cVar4.b != 1953653099) {
                arrayList = arrayList6;
                arrayList4 = arrayList5;
                i3 = i37;
            } else {
                h2.d e11 = cVar3.e(1836476516);
                e11.getClass();
                h2.c d10 = cVar4.d(1835297121);
                d10.getClass();
                h2.d e12 = d10.e(1751411826);
                e12.getClass();
                y yVar4 = e12.c;
                yVar4.N(16);
                int m10 = yVar4.m();
                int i38 = 0;
                int i39 = m10 == 1936684398 ? 1 : m10 == 1986618469 ? 2 : (m10 == 1952807028 || m10 == 1935832172 || m10 == 1937072756 || m10 == 1668047728 || m10 == 1937072752) ? 3 : m10 == 1835365473 ? 5 : -1;
                int i40 = 1;
                if (i39 == -1) {
                    arrayList = arrayList6;
                    i3 = i37;
                    rVar = null;
                    j11 = 0;
                    kVar2 = kVar;
                } else {
                    j11 = 0;
                    h2.d e13 = cVar4.e(1953196132);
                    e13.getClass();
                    y yVar5 = e13.c;
                    yVar5.N(8);
                    int e14 = e(yVar5.m());
                    yVar5.O(e14 != 0 ? 16 : 8);
                    int m11 = yVar5.m();
                    yVar5.O(4);
                    int i41 = yVar5.b;
                    int i42 = e14 == 0 ? 4 : 8;
                    int i43 = 0;
                    while (true) {
                        j12 = -9223372036854775807L;
                        if (i43 >= i42) {
                            yVar5.O(i42);
                            break;
                        }
                        if (yVar5.a[i41 + i43] != -1) {
                            j13 = e14 == 0 ? yVar5.C() : yVar5.G();
                        } else {
                            i43++;
                        }
                    }
                    j13 = -9223372036854775807L;
                    yVar5.O(10);
                    int H = yVar5.H();
                    yVar5.O(4);
                    int m12 = yVar5.m();
                    int m13 = yVar5.m();
                    yVar5.O(4);
                    int m14 = yVar5.m();
                    arrayList = arrayList6;
                    int m15 = yVar5.m();
                    i3 = i37;
                    if (m12 == 0 && m13 == 65536) {
                        i10 = i39;
                        if ((m14 == -65536 || m14 == 65536) && m15 == 0) {
                            i11 = 90;
                            yVar5.O(16);
                            short x10 = yVar5.x();
                            yVar5.O(2);
                            short x11 = yVar5.x();
                            j14 = j10 != -9223372036854775807L ? j13 : j10;
                            long j23 = g(e11.c).c;
                            if (j14 != -9223372036854775807L) {
                                j15 = j23;
                                a02 = -9223372036854775807L;
                            } else {
                                String str3 = n0.a;
                                j15 = j23;
                                a02 = n0.a0(j14, 1000000L, j15, RoundingMode.DOWN);
                            }
                            h2.c d11 = d10.d(1835626086);
                            d11.getClass();
                            h2.c d12 = d11.d(1937007212);
                            d12.getClass();
                            h2.d e15 = d10.e(1835296868);
                            e15.getClass();
                            y yVar6 = e15.c;
                            yVar6.N(8);
                            int e16 = e(yVar6.m());
                            yVar6.O(e16 != 0 ? 8 : 16);
                            long C = yVar6.C();
                            int i44 = yVar6.b;
                            i12 = e16 != 0 ? 4 : 8;
                            i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    i14 = i11;
                                    j16 = a02;
                                    yVar6.O(i12);
                                    break;
                                }
                                i14 = i11;
                                j16 = a02;
                                if (yVar6.a[i44 + i13] != -1) {
                                    long C2 = e16 == 0 ? yVar6.C() : yVar6.G();
                                    if (C2 != 0) {
                                        String str4 = n0.a;
                                        j12 = n0.a0(C2, 1000000L, C, RoundingMode.DOWN);
                                    }
                                } else {
                                    i13++;
                                    i11 = i14;
                                    a02 = j16;
                                }
                            }
                            long j24 = j12;
                            int H2 = yVar6.H();
                            char[] cArr = {(char) (((H2 >> 10) & 31) + 96), (char) (((H2 >> 5) & 31) + 96), (char) ((H2 & 31) + 96)};
                            i16 = 0;
                            for (i15 = 3; i16 < i15; i15 = 3) {
                                char c2 = cArr[i16];
                                if (c2 < 'a' || c2 > 'z') {
                                    str = null;
                                    break;
                                }
                                i16++;
                            }
                            str = new String(cArr);
                            e10 = d12.e(1937011556);
                            if (e10 != null) {
                                g2.a.l("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            } else {
                                y yVar7 = e10.c;
                                yVar7.N(12);
                                int m16 = yVar7.m();
                                k0 k0Var3 = new k0(m16, 5);
                                int i45 = 0;
                                while (i45 < m16) {
                                    int i46 = yVar7.b;
                                    int m17 = yVar7.m();
                                    long j25 = j24;
                                    e3.b.b("childAtomSize must be positive", m17 > 0 ? i40 : i38);
                                    int m18 = yVar7.m();
                                    if (m18 == 1635148593 || m18 == 1635148595 || m18 == 1701733238 || m18 == 1831958048 || m18 == 1836070006 || m18 == 1752589105 || m18 == 1751479857 || m18 == 1987470129 || m18 == 1987471665 || m18 == 1932670515 || m18 == 1211250227 || m18 == 1748121139 || m18 == 1987063864 || m18 == 1987063865 || m18 == 1635135537 || m18 == 1685479798 || m18 == 1685479729 || m18 == 1685481573 || m18 == 1685481521 || m18 == 1634760241 || m18 == 1684108849 || m18 == 1634743416 || m18 == 1634743400 || m18 == 1634755432 || m18 == 1634755438 || m18 == 1634755443) {
                                        i17 = m16;
                                        sVar2 = sVar;
                                        str2 = str;
                                        i18 = m18;
                                        yVar = yVar7;
                                        k0Var = k0Var3;
                                        i19 = i45;
                                        i20 = i46;
                                        i21 = i14;
                                    } else if (m18 == 1634755439) {
                                        sVar2 = sVar;
                                        str2 = str;
                                        i18 = m18;
                                        yVar = yVar7;
                                        i17 = m16;
                                        k0Var = k0Var3;
                                        i19 = i45;
                                        i20 = i46;
                                        i21 = i14;
                                    } else {
                                        if (m18 == 1836069985 || m18 == 1701733217 || m18 == 1633889587 || m18 == 1700998451 || m18 == 1633889588 || m18 == 1835823201 || m18 == 1685353315 || m18 == 1685353317 || m18 == 1685353320 || m18 == 1685353324 || m18 == 1685353336 || m18 == 1935764850 || m18 == 1935767394 || m18 == 1819304813 || m18 == 1936684916 || m18 == 1953984371 || m18 == 778924082 || m18 == 778924083 || m18 == 1835557169 || m18 == 1835560241 || m18 == 1634492771 || m18 == 1634492791 || m18 == 1970037111 || m18 == 1332770163 || m18 == 1716281667 || m18 == 1767992678 || m18 == 1768973165) {
                                            i17 = m16;
                                            sVar3 = sVar;
                                            z13 = z11;
                                            str2 = str;
                                            i22 = m18;
                                            yVar = yVar7;
                                            k0Var = k0Var3;
                                            i19 = i45;
                                            i20 = i46;
                                        } else if (m18 == 1718641517) {
                                            sVar3 = sVar;
                                            z13 = z11;
                                            str2 = str;
                                            i22 = m18;
                                            yVar = yVar7;
                                            i17 = m16;
                                            k0Var = k0Var3;
                                            i19 = i45;
                                            i20 = i46;
                                        } else {
                                            if (m18 == 1414810956 || m18 == 1954034535 || m18 == 2004251764 || m18 == 1937010800 || m18 == 1664495672 || m18 == 1836070003) {
                                                yVar7.N(i46 + 16);
                                                String str5 = "application/ttml+xml";
                                                if (m18 != 1414810956) {
                                                    if (m18 == 1954034535) {
                                                        int i47 = m17 - 16;
                                                        byte[] bArr = new byte[i47];
                                                        yVar7.k(i38, i47, bArr);
                                                        s1Var = i0.u(bArr);
                                                        str5 = "application/x-quicktime-tx3g";
                                                        yVar3 = yVar7;
                                                        i17 = m16;
                                                        i19 = i45;
                                                        i20 = i46;
                                                        j17 = Long.MAX_VALUE;
                                                        if (str5 != null) {
                                                            d2.u uVar3 = new d2.u();
                                                            uVar3.a = Integer.toString(m11);
                                                            uVar3.r = u0.n(str5);
                                                            uVar3.d = str;
                                                            uVar3.w = j17;
                                                            uVar3.u = s1Var;
                                                            k0Var3.d = new v(uVar3);
                                                        }
                                                        str2 = str;
                                                        k0Var2 = k0Var3;
                                                        i21 = i14;
                                                        yVar2 = yVar3;
                                                    } else if (m18 == 2004251764) {
                                                        str5 = "application/x-mp4-vtt";
                                                    } else if (m18 == 1937010800) {
                                                        yVar3 = yVar7;
                                                        i17 = m16;
                                                        i19 = i45;
                                                        i20 = i46;
                                                        j17 = 0;
                                                        s1Var = null;
                                                        if (str5 != null) {
                                                        }
                                                        str2 = str;
                                                        k0Var2 = k0Var3;
                                                        i21 = i14;
                                                        yVar2 = yVar3;
                                                    } else if (m18 == 1664495672) {
                                                        k0Var3.b = i40;
                                                        str5 = "application/x-mp4-cea-608";
                                                    } else {
                                                        if (m18 != 1836070003) {
                                                            throw new IllegalStateException();
                                                        }
                                                        int i48 = yVar7.b;
                                                        yVar7.O(4);
                                                        if (yVar7.m() == 1702061171) {
                                                            byte[] bArr2 = (byte[]) c(i48, yVar7).d;
                                                            if (bArr2 == null || bArr2.length != 64) {
                                                                yVar3 = yVar7;
                                                                i17 = m16;
                                                                i19 = i45;
                                                                i20 = i46;
                                                                str2 = str;
                                                                k0Var2 = k0Var3;
                                                                i21 = i14;
                                                                yVar2 = yVar3;
                                                            } else {
                                                                zb.p(bArr2.length == 64);
                                                                ArrayList arrayList7 = new ArrayList(16);
                                                                yVar3 = yVar7;
                                                                int i49 = 0;
                                                                while (i49 < bArr2.length - 3) {
                                                                    byte[] bArr3 = bArr2;
                                                                    int i50 = i45;
                                                                    int c10 = od.c(bArr2[i49], bArr3[i49 + 1], bArr3[i49 + 2], bArr3[i49 + 3]);
                                                                    int i51 = (c10 >> 16) & hs.e4;
                                                                    int i52 = ((c10 >> 8) & hs.e4) - 128;
                                                                    int i53 = (c10 & hs.e4) - 128;
                                                                    arrayList7.add(String.format("%06x", Integer.valueOf(n0.i(((i53 * 17790) / 10000) + i51, 0, hs.e4) | (n0.i((i51 - ((i53 * 3455) / 10000)) - ((i52 * 7169) / 10000), 0, hs.e4) << 8) | (n0.i(((i52 * 14075) / 10000) + i51, 0, hs.e4) << 16))));
                                                                    i49 += 4;
                                                                    bArr2 = bArr3;
                                                                    i46 = i46;
                                                                    i45 = i50;
                                                                    m16 = m16;
                                                                }
                                                                i17 = m16;
                                                                i19 = i45;
                                                                i20 = i46;
                                                                StringBuilder m19 = com.google.android.recaptcha.internal.a.m("size: ", x10, "x", x11, "\npalette: ");
                                                                m19.append(new com.google.android.gms.internal.clearcut.e(", ").b(arrayList7));
                                                                m19.append("\n");
                                                                String sb2 = m19.toString();
                                                                String str6 = n0.a;
                                                                s1Var = i0.u(sb2.getBytes(StandardCharsets.UTF_8));
                                                                str5 = "application/vobsub";
                                                            }
                                                        } else {
                                                            yVar3 = yVar7;
                                                            i17 = m16;
                                                            i19 = i45;
                                                            i20 = i46;
                                                            s1Var = null;
                                                            str5 = null;
                                                        }
                                                        j17 = Long.MAX_VALUE;
                                                        if (str5 != null) {
                                                        }
                                                        str2 = str;
                                                        k0Var2 = k0Var3;
                                                        i21 = i14;
                                                        yVar2 = yVar3;
                                                    }
                                                }
                                                yVar3 = yVar7;
                                                i17 = m16;
                                                i19 = i45;
                                                i20 = i46;
                                                j17 = Long.MAX_VALUE;
                                                s1Var = null;
                                                if (str5 != null) {
                                                }
                                                str2 = str;
                                                k0Var2 = k0Var3;
                                                i21 = i14;
                                                yVar2 = yVar3;
                                            } else {
                                                if (m18 == 1835365492) {
                                                    yVar7.N(i46 + 16);
                                                    if (m18 == 1835365492) {
                                                        yVar7.v();
                                                        String v = yVar7.v();
                                                        if (v != null) {
                                                            d2.u uVar4 = new d2.u();
                                                            uVar4.a = Integer.toString(m11);
                                                            uVar4.r = u0.n(v);
                                                            k0Var3.d = new v(uVar4);
                                                        }
                                                    }
                                                } else if (m18 == 1667329389) {
                                                    d2.u uVar5 = new d2.u();
                                                    uVar5.a = Integer.toString(m11);
                                                    uVar5.r = u0.n("application/x-camera-motion");
                                                    k0Var3.d = new v(uVar5);
                                                }
                                                str2 = str;
                                                yVar2 = yVar7;
                                                i17 = m16;
                                                k0Var2 = k0Var3;
                                                i19 = i45;
                                                i20 = i46;
                                                i21 = i14;
                                            }
                                            yVar2.N(i20 + m17);
                                            i45 = i19 + 1;
                                            yVar7 = yVar2;
                                            k0Var3 = k0Var2;
                                            str = str2;
                                            i14 = i21;
                                            m16 = i17;
                                            j24 = j25;
                                            i38 = 0;
                                            i40 = 1;
                                        }
                                        b(yVar, i22, i20, m17, m11, str2, z13, sVar3, k0Var, i19);
                                        i21 = i14;
                                        yVar2 = yVar;
                                        k0Var2 = k0Var;
                                        yVar2.N(i20 + m17);
                                        i45 = i19 + 1;
                                        yVar7 = yVar2;
                                        k0Var3 = k0Var2;
                                        str = str2;
                                        i14 = i21;
                                        m16 = i17;
                                        j24 = j25;
                                        i38 = 0;
                                        i40 = 1;
                                    }
                                    k(yVar, i18, i20, m17, m11, str2, i21, sVar2, k0Var, i19);
                                    yVar2 = yVar;
                                    k0Var2 = k0Var;
                                    yVar2.N(i20 + m17);
                                    i45 = i19 + 1;
                                    yVar7 = yVar2;
                                    k0Var3 = k0Var2;
                                    str = str2;
                                    i14 = i21;
                                    m16 = i17;
                                    j24 = j25;
                                    i38 = 0;
                                    i40 = 1;
                                }
                                long j26 = j24;
                                k0 k0Var4 = k0Var3;
                                if (!z10 && (d = cVar4.d(1701082227)) != null) {
                                    h2.d e17 = d.e(1701606260);
                                    if (e17 == null) {
                                        create = null;
                                    } else {
                                        y yVar8 = e17.c;
                                        yVar8.N(8);
                                        int e18 = e(yVar8.m());
                                        int E = yVar8.E();
                                        long[] jArr6 = new long[E];
                                        long[] jArr7 = new long[E];
                                        for (int i54 = 0; i54 < E; i54++) {
                                            jArr6[i54] = e18 == 1 ? yVar8.G() : yVar8.C();
                                            jArr7[i54] = e18 == 1 ? yVar8.u() : yVar8.m();
                                            if (yVar8.x() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            yVar8.O(2);
                                        }
                                        create = Pair.create(jArr6, jArr7);
                                    }
                                    if (create != null) {
                                        jArr = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        vVar = (v) k0Var4.d;
                                        if (vVar != null) {
                                            if (H != 0) {
                                                h2.b bVar = new h2.b(H);
                                                d2.u a10 = vVar.a();
                                                s0 s0Var = ((v) k0Var4.d).l;
                                                a10.k = s0Var != null ? s0Var.a(bVar) : new s0(bVar);
                                                vVar2 = new v(a10);
                                            } else {
                                                vVar2 = vVar;
                                            }
                                            r rVar2 = new r(m11, i10, C, j15, j16, j26, vVar2, k0Var4.b, (s[]) k0Var4.c, k0Var4.a, jArr, jArr2);
                                            kVar2 = kVar;
                                            rVar = rVar2;
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                vVar = (v) k0Var4.d;
                                if (vVar != null) {
                                }
                            }
                            kVar2 = kVar;
                            rVar = null;
                        }
                    } else {
                        i10 = i39;
                    }
                    i11 = (m12 == 0 && m13 == -65536 && (m14 == 65536 || m14 == -65536) && m15 == 0) ? hs.t4 : ((m12 == -65536 || m12 == 65536) && m13 == 0 && m14 == 0 && m15 == -65536) ? hs.K2 : 0;
                    yVar5.O(16);
                    short x102 = yVar5.x();
                    yVar5.O(2);
                    short x112 = yVar5.x();
                    if (j10 != -9223372036854775807L) {
                    }
                    long j232 = g(e11.c).c;
                    if (j14 != -9223372036854775807L) {
                    }
                    h2.c d112 = d10.d(1835626086);
                    d112.getClass();
                    h2.c d122 = d112.d(1937007212);
                    d122.getClass();
                    h2.d e152 = d10.e(1835296868);
                    e152.getClass();
                    y yVar62 = e152.c;
                    yVar62.N(8);
                    int e162 = e(yVar62.m());
                    yVar62.O(e162 != 0 ? 8 : 16);
                    long C3 = yVar62.C();
                    int i442 = yVar62.b;
                    if (e162 != 0) {
                    }
                    i13 = 0;
                    while (true) {
                        if (i13 < i12) {
                        }
                        i13++;
                        i11 = i14;
                        a02 = j16;
                    }
                    long j242 = j12;
                    int H22 = yVar62.H();
                    char[] cArr2 = {(char) (((H22 >> 10) & 31) + 96), (char) (((H22 >> 5) & 31) + 96), (char) ((H22 & 31) + 96)};
                    i16 = 0;
                    while (i16 < i15) {
                    }
                    str = new String(cArr2);
                    e10 = d122.e(1937011556);
                    if (e10 != null) {
                    }
                    kVar2 = kVar;
                    rVar = null;
                }
                r rVar3 = (r) kVar2.apply(rVar);
                if (rVar3 == null) {
                    arrayList4 = arrayList5;
                } else {
                    v vVar3 = rVar3.g;
                    h2.c d13 = cVar4.d(1835297121);
                    d13.getClass();
                    h2.c d14 = d13.d(1835626086);
                    d14.getClass();
                    h2.c d15 = d14.d(1937007212);
                    d15.getClass();
                    h2.d e19 = d15.e(1937011578);
                    if (e19 != null) {
                        cVar2 = new d4.d(e19, vVar3);
                    } else {
                        h2.d e20 = d15.e(1937013298);
                        if (e20 == null) {
                            throw v0.a(null, "Track has no sample table size information");
                        }
                        g2.t tVar = new g2.t();
                        y yVar9 = e20.c;
                        tVar.e = yVar9;
                        yVar9.N(12);
                        tVar.b = yVar9.E() & hs.e4;
                        tVar.a = yVar9.E();
                        cVar2 = tVar;
                    }
                    int b10 = cVar2.b();
                    if (b10 == 0) {
                        arrayList4 = arrayList5;
                        uVar = new u(rVar3, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (rVar3.b == 2) {
                            long j27 = rVar3.f;
                            if (j27 > j11) {
                                d2.u a11 = vVar3.a();
                                a11.C = b10 / (j27 / 1000000.0f);
                                rVar3 = rVar3.a(new v(a11));
                            }
                        }
                        v vVar4 = rVar3.g;
                        h2.d e21 = d15.e(1937007471);
                        if (e21 == null) {
                            e21 = d15.e(1668232756);
                            e21.getClass();
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        y yVar10 = e21.c;
                        h2.d e22 = d15.e(1937011555);
                        e22.getClass();
                        y yVar11 = e22.c;
                        h2.d e23 = d15.e(1937011827);
                        e23.getClass();
                        y yVar12 = e23.c;
                        h2.d e24 = d15.e(1937011571);
                        y yVar13 = e24 != null ? e24.c : null;
                        h2.d e25 = d15.e(1668576371);
                        y yVar14 = e25 != null ? e25.c : null;
                        a aVar = new a(yVar11, yVar10, z14);
                        yVar12.N(12);
                        int E2 = yVar12.E() - 1;
                        int E3 = yVar12.E();
                        int E4 = yVar12.E();
                        if (yVar14 != null) {
                            yVar14.N(12);
                            i23 = yVar14.E();
                        } else {
                            i23 = 0;
                        }
                        if (yVar13 != null) {
                            yVar13.N(12);
                            i24 = yVar13.E();
                            if (i24 > 0) {
                                i25 = yVar13.E() - 1;
                                int a12 = cVar2.a();
                                y yVar15 = yVar14;
                                String str7 = vVar4.s;
                                z15 = a12 == -1 && ("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && E2 == 0 && i23 == 0 && i24 == 0;
                                ArrayList arrayList8 = new ArrayList();
                                boolean z18 = yVar13 != null;
                                if (z15) {
                                    long[] jArr8 = z12 ? new long[0] : new long[b10];
                                    c cVar5 = cVar2;
                                    int[] iArr5 = z12 ? new int[0] : new int[b10];
                                    long[] jArr9 = z12 ? new long[0] : new long[b10];
                                    int i55 = i24;
                                    int[] iArr6 = z12 ? new int[0] : new int[b10];
                                    arrayList2 = arrayList5;
                                    int i56 = i25;
                                    int i57 = E2;
                                    long j28 = j11;
                                    long j29 = j28;
                                    long j30 = j29;
                                    int i58 = 0;
                                    int i59 = 0;
                                    int i60 = 0;
                                    y yVar16 = yVar13;
                                    int i61 = i23;
                                    int i62 = 0;
                                    int i63 = E4;
                                    int i64 = E3;
                                    int i65 = i55;
                                    int i66 = 0;
                                    while (true) {
                                        if (i62 >= b10) {
                                            i26 = i65;
                                            jArr3 = jArr8;
                                            jArr4 = jArr9;
                                            i27 = i66;
                                            iArr = iArr5;
                                            break;
                                        }
                                        boolean z19 = true;
                                        while (i66 == 0) {
                                            z19 = aVar.a();
                                            if (!z19) {
                                                break;
                                            }
                                            int i67 = i65;
                                            long j31 = aVar.d;
                                            i66 = aVar.c;
                                            j30 = j31;
                                            i65 = i67;
                                            i63 = i63;
                                            b10 = b10;
                                        }
                                        int i68 = b10;
                                        i26 = i65;
                                        int i69 = i63;
                                        if (z19) {
                                            if (yVar15 != null) {
                                                while (i60 == 0 && i61 > 0) {
                                                    i60 = yVar15.E();
                                                    i59 = yVar15.m();
                                                    i61--;
                                                }
                                                i60--;
                                            }
                                            int c11 = cVar5.c();
                                            long j32 = c11;
                                            j29 += j32;
                                            if (c11 > i58) {
                                                i58 = c11;
                                            }
                                            if (z12) {
                                                iArr3 = iArr5;
                                            } else {
                                                jArr8[i62] = j30;
                                                iArr5[i62] = c11;
                                                iArr3 = iArr5;
                                                jArr9[i62] = j28 + i59;
                                                iArr6[i62] = yVar16 == null ? 1 : 0;
                                                if (i62 == i56) {
                                                    iArr6[i62] = 1;
                                                    arrayList8.add(Integer.valueOf(i62));
                                                }
                                            }
                                            if (yVar16 == null || i62 != i56) {
                                                i31 = i26;
                                                i32 = i69;
                                                i33 = i58;
                                                i34 = i56;
                                            } else {
                                                i31 = i26 - 1;
                                                if (i31 > 0) {
                                                    i56 = yVar16.E() - 1;
                                                }
                                                i34 = i56;
                                                i32 = i69;
                                                i33 = i58;
                                            }
                                            j28 += i32;
                                            i64--;
                                            if (i64 == 0 && i57 > 0) {
                                                i57--;
                                                i64 = yVar12.E();
                                                i32 = yVar12.m();
                                            }
                                            j30 += j32;
                                            i66--;
                                            i62++;
                                            i65 = i31;
                                            i63 = i32;
                                            iArr5 = iArr3;
                                            i56 = i34;
                                            i58 = i33;
                                            b10 = i68;
                                        } else {
                                            g2.a.l("BoxParsers", "Unexpected end of chunk data");
                                            if (z12) {
                                                jArr3 = jArr8;
                                                jArr4 = jArr9;
                                                b10 = i62;
                                                i27 = i66;
                                                iArr = iArr5;
                                            } else {
                                                long[] copyOf = Arrays.copyOf(jArr8, i62);
                                                int[] copyOf2 = Arrays.copyOf(iArr5, i62);
                                                jArr3 = copyOf;
                                                jArr4 = Arrays.copyOf(jArr9, i62);
                                                iArr6 = Arrays.copyOf(iArr6, i62);
                                                b10 = i62;
                                                i27 = i66;
                                                iArr = copyOf2;
                                            }
                                        }
                                    }
                                    j18 = j28 + i59;
                                    if (yVar15 != null) {
                                        while (i61 > 0) {
                                            if (yVar15.E() != 0) {
                                                z16 = false;
                                                break;
                                            }
                                            yVar15.m();
                                            i61--;
                                        }
                                    }
                                    z16 = true;
                                    if (i26 == 0 && i64 == 0 && i27 == 0 && i57 == 0 && i60 == 0 && z16) {
                                        i28 = i58;
                                        arrayList3 = arrayList8;
                                    } else {
                                        StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                        i28 = i58;
                                        boolean z20 = z16;
                                        arrayList3 = arrayList8;
                                        com.google.android.recaptcha.internal.a.r(sb3, rVar3.a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                        com.google.android.recaptcha.internal.a.r(sb3, i64, ", remainingSamplesInChunk ", i27, ", remainingTimestampDeltaChanges ");
                                        sb3.append(i57);
                                        sb3.append(", remainingSamplesAtTimestampOffset ");
                                        sb3.append(i60);
                                        sb3.append(!z20 ? ", ctts invalid" : "");
                                        g2.a.l("BoxParsers", sb3.toString());
                                    }
                                    i29 = b10;
                                    iArr2 = iArr6;
                                    i30 = i28;
                                    j19 = j29;
                                } else {
                                    int i70 = aVar.a;
                                    long[] jArr10 = new long[i70];
                                    int[] iArr7 = new int[i70];
                                    while (aVar.a()) {
                                        int i71 = aVar.b;
                                        jArr10[i71] = aVar.d;
                                        iArr7[i71] = aVar.c;
                                    }
                                    long j33 = E4;
                                    int i72 = TLObject.FLAG_13 / a12;
                                    int i73 = 0;
                                    for (int i74 = 0; i74 < i70; i74++) {
                                        i73 += n0.g(iArr7[i74], i72);
                                    }
                                    jArr3 = new long[i73];
                                    iArr = new int[i73];
                                    jArr4 = new long[i73];
                                    int[] iArr8 = new int[i73];
                                    int i75 = 0;
                                    int i76 = 0;
                                    int i77 = 0;
                                    int i78 = 0;
                                    int i79 = 0;
                                    while (i75 < i70) {
                                        int i80 = iArr7[i75];
                                        long j34 = jArr10[i75];
                                        int i81 = i79;
                                        int i82 = i75;
                                        int i83 = i78;
                                        int i84 = i81;
                                        int i85 = i70;
                                        int i86 = i80;
                                        while (i86 > 0) {
                                            int min = Math.min(i72, i86);
                                            jArr3[i84] = j34;
                                            int i87 = i86;
                                            int i88 = a12 * min;
                                            iArr[i84] = i88;
                                            i83 = Math.max(i83, i88);
                                            long j35 = j33;
                                            jArr4[i84] = j35 * i76;
                                            iArr8[i84] = 1;
                                            j34 += iArr[i84];
                                            i76 += min;
                                            i84++;
                                            i77 += i88;
                                            i86 = i87 - min;
                                            j33 = j35;
                                        }
                                        int i89 = i82 + 1;
                                        i79 = i84;
                                        i78 = i83;
                                        i75 = i89;
                                        i70 = i85;
                                    }
                                    j18 = j33 * i76;
                                    j19 = i77;
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
                                    i29 = i73;
                                    iArr2 = iArr8;
                                    i30 = i78;
                                }
                                long j36 = j18;
                                long[] jArr11 = jArr3;
                                int[] iArr9 = iArr;
                                j20 = rVar3.f;
                                if (j20 > j11) {
                                    long a04 = n0.a0(j19 * 8, 1000000L, j20, RoundingMode.HALF_DOWN);
                                    if (a04 > j11 && a04 < 2147483647L) {
                                        d2.u a13 = vVar4.a();
                                        a13.h = (int) a04;
                                        rVar3 = rVar3.a(new v(a13));
                                    }
                                }
                                int i90 = rVar3.b;
                                long j37 = rVar3.c;
                                v vVar5 = rVar3.g;
                                long[] jArr12 = rVar3.j;
                                jArr5 = rVar3.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long a05 = n0.a0(j36, 1000000L, j37, roundingMode);
                                int[] f10 = od.f(arrayList3);
                                if (jArr5 != null) {
                                    if (!z12) {
                                        n0.Z(jArr4, j37);
                                    }
                                    uVar2 = new u(rVar3, jArr11, iArr9, i30, jArr4, iArr2, f10, z18, a05, i29);
                                } else {
                                    long[] jArr13 = jArr4;
                                    if (z12) {
                                        jArr12.getClass();
                                        if (jArr5.length == 1 && jArr5[0] == j11) {
                                            a03 = n0.a0(j36 - jArr12[0], 1000000L, rVar3.c, roundingMode);
                                        } else {
                                            long j38 = j11;
                                            for (int i91 = 0; i91 < jArr5.length; i91++) {
                                                if (jArr12[i91] != -1) {
                                                    j38 += jArr5[i91];
                                                }
                                            }
                                            a03 = n0.a0(j38, 1000000L, rVar3.d, RoundingMode.DOWN);
                                        }
                                        uVar2 = new u(rVar3, jArr11, iArr9, i30, jArr13, iArr2, f10, z18, a03, i29);
                                    } else {
                                        if (jArr5.length == 1 && i90 == 1 && jArr13.length >= 2) {
                                            jArr12.getClass();
                                            long j39 = jArr12[0];
                                            j22 = -1;
                                            long a06 = j39 + n0.a0(jArr5[0], rVar3.c, rVar3.d, roundingMode);
                                            int length = jArr13.length - 1;
                                            if (jArr13[0] <= j39 && j39 < jArr13[n0.i(4, 0, length)] && jArr13[n0.i(jArr13.length + (-4), 0, length)] < a06 && a06 <= 2 + j36) {
                                                long max = Math.max(j11, j36 - a06);
                                                j21 = j36;
                                                long a07 = n0.a0(j39 - jArr13[0], vVar5.L, rVar3.c, roundingMode);
                                                long a08 = n0.a0(max, vVar5.L, rVar3.c, roundingMode);
                                                if ((a07 != j11 || a08 != j11) && a07 <= 2147483647L && a08 <= 2147483647L) {
                                                    wVar.a = (int) a07;
                                                    wVar.b = (int) a08;
                                                    n0.Z(jArr13, j37);
                                                    uVar2 = new u(rVar3, jArr11, iArr9, i30, jArr13, iArr2, f10, z18, n0.a0(jArr5[0], 1000000L, rVar3.d, roundingMode), i29);
                                                }
                                            } else {
                                                j21 = j36;
                                            }
                                        } else {
                                            j21 = j36;
                                            j22 = -1;
                                        }
                                        int i92 = 1;
                                        if (jArr5.length == 1) {
                                            if (jArr5[0] == 0) {
                                                jArr12.getClass();
                                                long j40 = jArr12[0];
                                                for (int i93 = 0; i93 < jArr13.length; i93++) {
                                                    jArr13[i93] = n0.a0(jArr13[i93] - j40, 1000000L, rVar3.c, RoundingMode.DOWN);
                                                }
                                                uVar2 = new u(rVar3, jArr11, iArr9, i30, jArr13, iArr2, f10, z18, n0.a0(j21 - j40, 1000000L, rVar3.c, RoundingMode.DOWN), i29);
                                            } else {
                                                i92 = 1;
                                            }
                                        }
                                        int[] iArr10 = iArr2;
                                        int i94 = i29;
                                        boolean z21 = i90 == i92;
                                        int[] iArr11 = new int[jArr5.length];
                                        int[] iArr12 = new int[jArr5.length];
                                        jArr12.getClass();
                                        int i95 = 0;
                                        boolean z22 = false;
                                        int i96 = 0;
                                        int i97 = 0;
                                        while (i97 < jArr5.length) {
                                            int[] iArr13 = iArr11;
                                            long j41 = jArr12[i97];
                                            if (j41 != j22) {
                                                iArr4 = iArr12;
                                                boolean z23 = z22;
                                                long a09 = n0.a0(jArr5[i97], rVar3.c, rVar3.d, RoundingMode.DOWN) + j41;
                                                i35 = i97;
                                                iArr13[i35] = n0.f(jArr13, j41, true);
                                                int b11 = n0.b(jArr13, a09, z21);
                                                int i98 = b11 - 1;
                                                z17 = z21;
                                                int i99 = 0;
                                                while (b11 < jArr13.length) {
                                                    if (jArr13[b11] >= a09) {
                                                        i99++;
                                                        if (i99 > vVar5.u) {
                                                            break;
                                                        }
                                                    } else {
                                                        i98 = b11;
                                                    }
                                                    b11++;
                                                }
                                                iArr4[i35] = i98 + 1;
                                                int i100 = iArr13[i35];
                                                while (true) {
                                                    i36 = iArr13[i35];
                                                    if (i36 <= 0 || (iArr10[i36] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr13[i35] = i36 - 1;
                                                }
                                                if (i36 == 0 && (iArr10[0] & 1) == 0) {
                                                    iArr13[i35] = i100;
                                                    while (true) {
                                                        int i101 = iArr13[i35];
                                                        if (i101 >= iArr4[i35] || (iArr10[i101] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr13[i35] = i101 + 1;
                                                    }
                                                }
                                                int i102 = iArr4[i35];
                                                int i103 = iArr13[i35];
                                                int i104 = (i102 - i103) + i96;
                                                z22 = z23 | (i95 != i103);
                                                i96 = i104;
                                                i95 = i102;
                                            } else {
                                                z17 = z21;
                                                iArr4 = iArr12;
                                                i35 = i97;
                                            }
                                            i97 = i35 + 1;
                                            iArr11 = iArr13;
                                            iArr12 = iArr4;
                                            z21 = z17;
                                        }
                                        int[] iArr14 = iArr11;
                                        int[] iArr15 = iArr12;
                                        boolean z24 = z22 | (i96 != i94);
                                        long[] jArr14 = z24 ? new long[i96] : jArr11;
                                        int[] iArr16 = z24 ? new int[i96] : iArr9;
                                        int i105 = z24 ? 0 : i30;
                                        int[] iArr17 = z24 ? new int[i96] : iArr10;
                                        ArrayList arrayList9 = z24 ? new ArrayList() : arrayList3;
                                        long[] jArr15 = new long[i96];
                                        int i106 = i105;
                                        int i107 = 0;
                                        boolean z25 = false;
                                        int i108 = 0;
                                        long j42 = 0;
                                        while (i108 < jArr5.length) {
                                            long j43 = jArr12[i108];
                                            int i109 = iArr14[i108];
                                            long[] jArr16 = jArr5;
                                            int i110 = iArr15[i108];
                                            long[] jArr17 = jArr15;
                                            if (z24) {
                                                int i111 = i110 - i109;
                                                System.arraycopy(jArr11, i109, jArr14, i107, i111);
                                                System.arraycopy(iArr9, i109, iArr16, i107, i111);
                                                System.arraycopy(iArr10, i109, iArr17, i107, i111);
                                            }
                                            while (i109 < i110) {
                                                int i112 = i107;
                                                int i113 = i109;
                                                long j44 = rVar3.d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long a010 = n0.a0(j42, 1000000L, j44, roundingMode2);
                                                long a011 = n0.a0(jArr13[i113] - j43, 1000000L, rVar3.c, roundingMode2);
                                                if (a011 < 0) {
                                                    z25 = true;
                                                }
                                                jArr17[i112] = a010 + a011;
                                                if (z24 && iArr16[i112] > i106) {
                                                    i106 = iArr9[i113];
                                                }
                                                if (z24 && !z18 && (iArr17[i112] & 1) != 0) {
                                                    arrayList9.add(Integer.valueOf(i112));
                                                }
                                                i107 = i112 + 1;
                                                i109 = i113 + 1;
                                            }
                                            j42 += jArr16[i108];
                                            i108++;
                                            i107 = i107;
                                            jArr5 = jArr16;
                                            jArr15 = jArr17;
                                        }
                                        long[] jArr18 = jArr15;
                                        long a012 = n0.a0(j42, 1000000L, rVar3.d, RoundingMode.DOWN);
                                        if (z25) {
                                            d2.u a14 = vVar5.a();
                                            a14.x = true;
                                            rVar3 = rVar3.a(new v(a14));
                                        }
                                        uVar = new u(rVar3, jArr14, iArr16, i106, jArr18, iArr17, od.f(arrayList9), z18, a012, jArr14.length);
                                        arrayList4 = arrayList2;
                                        arrayList4.add(uVar);
                                        i37 = i3 + 1;
                                        cVar3 = cVar;
                                        arrayList5 = arrayList4;
                                    }
                                }
                                uVar = uVar2;
                                arrayList4 = arrayList2;
                            } else {
                                yVar13 = null;
                            }
                        } else {
                            i24 = 0;
                        }
                        i25 = -1;
                        int a122 = cVar2.a();
                        y yVar152 = yVar14;
                        String str72 = vVar4.s;
                        if (a122 == -1) {
                        }
                        ArrayList arrayList82 = new ArrayList();
                        if (yVar13 != null) {
                        }
                        if (z15) {
                        }
                        long j362 = j18;
                        long[] jArr112 = jArr3;
                        int[] iArr92 = iArr;
                        j20 = rVar3.f;
                        if (j20 > j11) {
                        }
                        int i902 = rVar3.b;
                        long j372 = rVar3.c;
                        v vVar52 = rVar3.g;
                        long[] jArr122 = rVar3.j;
                        jArr5 = rVar3.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long a052 = n0.a0(j362, 1000000L, j372, roundingMode3);
                        int[] f102 = od.f(arrayList3);
                        if (jArr5 != null) {
                        }
                        uVar = uVar2;
                        arrayList4 = arrayList2;
                    }
                    arrayList4.add(uVar);
                    i37 = i3 + 1;
                    cVar3 = cVar;
                    arrayList5 = arrayList4;
                }
            }
            i37 = i3 + 1;
            cVar3 = cVar;
            arrayList5 = arrayList4;
        }
        return arrayList5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        r1.N(r9);
        r1.O(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
    
        r9 = new s3.k(r0, r8, r1.w(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024c, code lost:
    
        g2.a.b("MetadataUtil", "Skipped unknown metadata entry: " + ad.l.a(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
    
        r1.N(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0077, code lost:
    
        r0 = s3.j.a(y3.q.g(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0080, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        r9 = new s3.n("TCON", r12, g9.i0.u(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008c, code lost:
    
        g2.a.l("MetadataUtil", "Failed to parse standard genre code");
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
    
        r9 = y3.q.d(r13, r1);
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
    
        r9 = y3.q.k(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ee, code lost:
    
        if (r0 != 4280916) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f0, code lost:
    
        r9 = y3.q.k(r13, r1, "TPE1");
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
    
        r9 = y3.q.k(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0206, code lost:
    
        if (r0 != 6384738) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0208, code lost:
    
        r9 = y3.q.k(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0212, code lost:
    
        if (r0 != 7108978) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0214, code lost:
    
        r9 = y3.q.k(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x021e, code lost:
    
        if (r0 != 6776174) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0220, code lost:
    
        r9 = y3.q.k(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0228, code lost:
    
        if (r0 != 6779504) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022a, code lost:
    
        r9 = y3.q.k(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0234, code lost:
    
        if (r0 != 7173742) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0236, code lost:
    
        r9 = y3.q.k(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0241, code lost:
    
        if (r0 != 7173737) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0243, code lost:
    
        r9 = y3.q.h(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0264, code lost:
    
        r9 = y3.q.k(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x026c, code lost:
    
        r9 = y3.q.k(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0287, code lost:
    
        if (r6.isEmpty() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x028b, code lost:
    
        r12 = new d2.s0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.m() + r13;
        r13 = r1.m();
        r0 = (r13 >> 24) & org.telegram.messenger.hs.e4;
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
    
        r9 = y3.q.f(r13, r1, "TPOS");
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
    
        r9 = y3.q.f(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r9 = y3.q.h(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r9 = y3.q.h(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r9 = y3.q.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        r9 = y3.q.k(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        r9 = y3.q.k(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        r9 = y3.q.k(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r9 = y3.q.k(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        r9 = y3.q.k(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        r9 = y3.q.k(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        r9 = y3.q.h(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r9 = y3.q.h(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r9 = y3.q.k(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r9 = y3.q.k(r13, r1, "TVSHOW");
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
    public static s0 j(h2.d dVar) {
        int i3;
        boolean z10;
        s0 s0Var;
        s0 s0Var2;
        int i10;
        y yVar = dVar.c;
        int i11 = 8;
        yVar.N(8);
        boolean z11 = false;
        s0 s0Var3 = new s0(new r0[0]);
        while (yVar.a() >= i11) {
            int i12 = yVar.b;
            int m10 = yVar.m();
            int m11 = yVar.m();
            String str = null;
            if (m11 == 1835365473) {
                yVar.N(i12);
                int i13 = i12 + m10;
                yVar.O(i11);
                a(yVar);
                while (true) {
                    int i14 = yVar.b;
                    if (i14 >= i13) {
                        break;
                    }
                    int m12 = yVar.m();
                    if (yVar.m() == 1768715124) {
                        break;
                    }
                    yVar.N(i14 + m12);
                    i11 = 8;
                    z11 = false;
                    str = null;
                }
                s0 s0Var4 = null;
                s0Var3 = s0Var3.b(s0Var4);
                i3 = 8;
            } else if (m11 == 1936553057) {
                yVar.N(i12);
                int i15 = i12 + m10;
                yVar.O(12);
                while (true) {
                    int i16 = yVar.b;
                    if (i16 >= i15) {
                        i3 = 8;
                        break;
                    }
                    int m13 = yVar.m();
                    if (yVar.m() != 1935766900) {
                        yVar.N(i16 + m13);
                    } else if (m13 < 16) {
                        s0Var2 = null;
                        i3 = 8;
                    } else {
                        yVar.O(4);
                        int i17 = -1;
                        int i18 = 0;
                        for (int i19 = 0; i19 < 2; i19++) {
                            int A = yVar.A();
                            int A2 = yVar.A();
                            if (A == 0) {
                                i17 = A2;
                            } else if (A == 1) {
                                i18 = A2;
                            }
                        }
                        if (i17 == 12) {
                            i10 = hs.P3;
                        } else if (i17 == 13) {
                            i10 = 120;
                        } else if (i17 != 21) {
                            i10 = -2147483647;
                        } else {
                            i3 = 8;
                            if (yVar.a() >= 8 && yVar.b + 8 <= i15) {
                                int m14 = yVar.m();
                                int m15 = yVar.m();
                                if (m14 >= 12 && m15 == 1936877170) {
                                    i10 = yVar.B();
                                    if (i10 != -2147483647) {
                                        s0Var2 = new s0(new t3.c(i10, i18));
                                    }
                                }
                            }
                            i10 = -2147483647;
                            if (i10 != -2147483647) {
                            }
                        }
                        i3 = 8;
                        if (i10 != -2147483647) {
                        }
                    }
                }
                s0Var2 = null;
                s0Var3 = s0Var3.b(s0Var2);
            } else {
                i3 = 8;
                if (m11 == -1451722374) {
                    short x10 = yVar.x();
                    yVar.O(2);
                    String y9 = yVar.y(x10, StandardCharsets.UTF_8);
                    int max = Math.max(y9.lastIndexOf(43), y9.lastIndexOf(45));
                    try {
                        try {
                            h2.e eVar = new h2.e(Float.parseFloat(y9.substring(0, max)), Float.parseFloat(y9.substring(max, y9.length() - 1)));
                            r0[] r0VarArr = new r0[1];
                            z10 = false;
                            try {
                                r0VarArr[0] = eVar;
                                s0Var = new s0(r0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                s0Var = null;
                                s0Var3 = s0Var3.b(s0Var);
                                yVar.N(i12 + m10);
                                i11 = i3;
                                z11 = z10;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z10 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z10 = false;
                    }
                    s0Var3 = s0Var3.b(s0Var);
                    yVar.N(i12 + m10);
                    i11 = i3;
                    z11 = z10;
                }
            }
            z10 = false;
            yVar.N(i12 + m10);
            i11 = i3;
            z11 = z10;
        }
        return s0Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0b34, code lost:
    
        if (r10 == null) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0b36, code lost:
    
        r0 = r10.a;
        r1 = "video/dolby-vision";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0b3f, code lost:
    
        if (r1 != null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b41, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0b42, code lost:
    
        r2 = new d2.u();
        r2.a = java.lang.Integer.toString(r62);
        r2.r = d2.u0.n(r1);
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
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0b85, code lost:
    
        if (r16 == null) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0b87, code lost:
    
        r29 = r16.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0b90, code lost:
    
        r2.H = new d2.n(r8, r30, r9, r29, r31, r32);
        r10 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0ba5, code lost:
    
        if (r10 == null) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0ba7, code lost:
    
        r2.h = b8.od.e(r10.a);
        r2.i = b8.od.e(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0bcc, code lost:
    
        r66.d = new d2.v(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0bd3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0bb8, code lost:
    
        r10 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0bba, code lost:
    
        if (r10 == null) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0bbc, code lost:
    
        r2.h = b8.od.e(r10.a);
        r2.i = b8.od.e(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0b8e, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0b3b, code lost:
    
        r0 = r18;
        r1 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0977, code lost:
    
        if (r1 != 3) goto L424;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(y yVar, int i3, int i10, int i11, int i12, String str, int i13, d2.s sVar, k0 k0Var, int i14) {
        int i15;
        int i16;
        float f10;
        int i17;
        int i18;
        int i19;
        int i20;
        String str2;
        int i21;
        d2.s sVar2;
        int i22;
        com.google.android.gms.internal.clearcut.e eVar;
        int i23;
        String str3;
        int i24;
        d2.s sVar3;
        int i25;
        int i26;
        float f11;
        za.p pVar;
        String str4;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int j10;
        int i35;
        int i36;
        int i37;
        int i38;
        d2.n nVar;
        d2.n nVar2;
        int i39;
        String str5;
        int i40;
        b bVar;
        String str6;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45 = i10;
        int i46 = i11;
        d2.s sVar4 = sVar;
        yVar.N(i45 + 16);
        yVar.O(16);
        int H = yVar.H();
        int H2 = yVar.H();
        yVar.O(50);
        int i47 = yVar.b;
        int i48 = i3;
        if (i48 == 1701733238) {
            Pair h = h(yVar, i45, i46);
            if (h != null) {
                i48 = ((Integer) h.first).intValue();
                sVar4 = sVar4 == null ? null : sVar4.a(((s) h.second).b);
                ((s[]) k0Var.c)[i14] = (s) h.second;
            }
            yVar.N(i47);
        }
        String str7 = "video/3gpp";
        String str8 = i48 == 1831958048 ? "video/mpeg" : i48 == 1211250227 ? "video/3gpp" : (i48 == 1634743416 || i48 == 1634743400 || i48 == 1634755432 || i48 == 1634755438 || i48 == 1634755443 || i48 == 1634755439) ? "video/prores" : null;
        float f12 = 1.0f;
        int i49 = 8;
        List list = null;
        ByteBuffer byteBuffer = null;
        com.google.android.gms.internal.clearcut.e eVar2 = null;
        String str9 = null;
        byte[] bArr = null;
        int i50 = -1;
        int i51 = -1;
        int i52 = -1;
        int i53 = -1;
        int i54 = -1;
        boolean z10 = false;
        int i55 = -1;
        int i56 = -1;
        int i57 = -1;
        int i58 = 8;
        int i59 = 8;
        x xVar = null;
        z0 z0Var = null;
        za.p pVar2 = null;
        while (true) {
            if (i47 - i45 >= i46) {
                i15 = H;
                i16 = H2;
                f10 = f12;
                i17 = i55;
                i18 = i56;
                i19 = i58;
                i20 = i59;
                str2 = str8;
                i21 = i57;
                sVar2 = sVar4;
                i22 = i50;
                eVar = eVar2;
                break;
            }
            yVar.N(i47);
            int i60 = yVar.b;
            int m10 = yVar.m();
            if (m10 == 0 && yVar.b - i45 == i46) {
                i15 = H;
                i16 = H2;
                f10 = f12;
                eVar = eVar2;
                i17 = i55;
                i18 = i56;
                i19 = i58;
                i20 = i59;
                str2 = str8;
                i21 = i57;
                sVar2 = sVar4;
                i22 = i50;
                break;
            }
            String str10 = "childAtomSize must be positive";
            e3.b.b("childAtomSize must be positive", m10 > 0);
            int m11 = yVar.m();
            if (m11 == 1635148611) {
                e3.b.b(null, str8 == null);
                yVar.N(i60 + 8);
                e3.d a10 = e3.d.a(yVar);
                list = a10.a;
                k0Var.a = a10.b;
                if (!z10) {
                    f12 = a10.k;
                }
                String str11 = a10.l;
                int i61 = a10.j;
                int i62 = a10.g;
                int i63 = a10.h;
                str9 = str11;
                int i64 = a10.i;
                i58 = a10.e;
                sVar3 = sVar4;
                i25 = H;
                i26 = H2;
                i23 = i47;
                i55 = i62;
                i27 = i48;
                str3 = str7;
                i56 = i63;
                f11 = f12;
                i24 = i64;
                i29 = i49;
                i30 = a10.f;
                i51 = i61;
                str8 = "video/avc";
            } else {
                i23 = i47;
                if (m11 == 1752589123) {
                    e3.b.b(null, str8 == null);
                    yVar.N(i60 + 8);
                    e3.x a11 = e3.x.a(yVar, false, null);
                    List list2 = a11.a;
                    k0Var.a = a11.b;
                    if (!z10) {
                        f12 = a11.l;
                    }
                    int i65 = a11.m;
                    int i66 = a11.c;
                    String str12 = a11.n;
                    int i67 = a11.k;
                    if (i67 != -1) {
                        i50 = i67;
                    }
                    int i68 = a11.d;
                    int i69 = a11.e;
                    int i70 = a11.h;
                    int i71 = a11.i;
                    int i72 = a11.j;
                    int i73 = a11.f;
                    int i74 = a11.g;
                    sVar3 = sVar4;
                    pVar2 = a11.o;
                    i25 = H;
                    i26 = H2;
                    i27 = i48;
                    str3 = str7;
                    f11 = f12;
                    list = list2;
                    i55 = i70;
                    i56 = i71;
                    i24 = i72;
                    i58 = i73;
                    i29 = i49;
                    i52 = i66;
                    str9 = str12;
                    i54 = i69;
                    i53 = i68;
                    i30 = i74;
                    i51 = i65;
                    str8 = "video/hevc";
                } else {
                    str3 = str7;
                    if (m11 == 1818785347) {
                        e3.b.b("lhvC must follow hvcC atom", "video/hevc".equals(str8));
                        za.p pVar3 = pVar2;
                        e3.b.b("must have at least two layers", pVar3 != null && ((i0) pVar3.a).size() >= 2);
                        yVar.N(i60 + 8);
                        pVar3.getClass();
                        e3.x a12 = e3.x.a(yVar, true, pVar3);
                        e3.b.b("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", k0Var.a == a12.b);
                        int i75 = a12.h;
                        int i76 = i55;
                        if (i75 != -1) {
                            e3.b.b("colorSpace must be the same for both views", i76 == i75);
                        }
                        int i77 = a12.i;
                        int i78 = i56;
                        if (i77 != -1) {
                            e3.b.b("colorRange must be the same for both views", i78 == i77);
                        }
                        int i79 = a12.j;
                        if (i79 != -1) {
                            i44 = i57;
                            e3.b.b("colorTransfer must be the same for both views", i44 == i79);
                        } else {
                            i44 = i57;
                        }
                        int i80 = i58;
                        int i81 = i44;
                        e3.b.b("bitdepthLuma must be the same for both views", i80 == a12.f);
                        int i82 = i59;
                        e3.b.b("bitdepthChroma must be the same for both views", i82 == a12.g);
                        if (list != null) {
                            f0 p10 = i0.p();
                            p10.d(list);
                            p10.d(a12.a);
                            list = p10.f();
                        } else {
                            e3.b.b("initializationData must be already set from hvcC atom", false);
                        }
                        pVar2 = pVar3;
                        sVar3 = sVar4;
                        i25 = H;
                        i26 = H2;
                        str8 = "video/mv-hevc";
                        i55 = i76;
                        i27 = i48;
                        i56 = i78;
                        i58 = i80;
                        f11 = f12;
                        i24 = i81;
                        i30 = i82;
                        i29 = i49;
                        str9 = a12.n;
                    } else {
                        int i83 = i55;
                        int i84 = i56;
                        i24 = i57;
                        int i85 = i58;
                        int i86 = i59;
                        za.p pVar4 = pVar2;
                        int i87 = 7;
                        int i88 = 4;
                        if (m11 == 1987470147) {
                            e3.b.b(null, str8 == null);
                            yVar.N(i60 + 8);
                            try {
                                if (yVar.m() != 0) {
                                    throw v0.a(null, "Unsupported VVC version");
                                }
                                int A = yVar.A();
                                int i89 = ((A >> 1) & 3) + 1;
                                str6 = "L";
                                if ((A & 1) != 0) {
                                    yVar.O(1);
                                    int A2 = (yVar.A() >> 4) & 7;
                                    i42 = (yVar.A() >> 5) & 7;
                                    int A3 = yVar.A() & 63;
                                    int A4 = yVar.A();
                                    int i90 = (A4 >> 1) & hs.L1;
                                    str6 = (A4 & 1) != 0 ? "H" : "L";
                                    i43 = yVar.A();
                                    yVar.O(A3);
                                    if (A2 > 1) {
                                        int A5 = yVar.A();
                                        int i91 = 1;
                                        int i92 = 0;
                                        while (true) {
                                            int i93 = A2;
                                            if (i92 >= i93 - 1) {
                                                break;
                                            }
                                            if (((A5 >> (7 - i92)) & 1) != 0) {
                                                yVar.O(i91);
                                            }
                                            i92++;
                                            A2 = i93;
                                            i91 = 1;
                                        }
                                    }
                                    yVar.O(yVar.A() * 4);
                                    yVar.O(6);
                                    i41 = i90;
                                } else {
                                    i41 = 0;
                                    i42 = 0;
                                    i43 = 0;
                                }
                                int A6 = yVar.A();
                                int i94 = i42;
                                int i95 = yVar.b;
                                sVar3 = sVar4;
                                f11 = f12;
                                int i96 = 0;
                                int i97 = 0;
                                while (i96 < A6) {
                                    int i98 = i96;
                                    int A7 = yVar.A() & 31;
                                    int i99 = H2;
                                    int H3 = (A7 == 13 || A7 == 12) ? 1 : yVar.H();
                                    int i100 = 0;
                                    while (i100 < H3) {
                                        int i101 = H3;
                                        int H4 = yVar.H();
                                        i97 = H4 + 4 + i97;
                                        yVar.O(H4);
                                        i100++;
                                        H3 = i101;
                                    }
                                    i96 = i98 + 1;
                                    H2 = i99;
                                }
                                i26 = H2;
                                yVar.N(i95);
                                byte[] bArr2 = new byte[i97];
                                int i102 = 0;
                                int i103 = 0;
                                while (i102 < A6) {
                                    int A8 = yVar.A() & 31;
                                    int i104 = i102;
                                    int H5 = (A8 == 13 || A8 == 12) ? 1 : yVar.H();
                                    int i105 = i103;
                                    int i106 = 0;
                                    while (i106 < H5) {
                                        int i107 = H5;
                                        int H6 = yVar.H();
                                        System.arraycopy(h2.o.a, 0, bArr2, i105, i88);
                                        int i108 = i105 + 4;
                                        yVar.k(i108, H6, bArr2);
                                        i105 = i108 + H6;
                                        i106++;
                                        H5 = i107;
                                        A6 = A6;
                                        H = H;
                                        i88 = 4;
                                    }
                                    i102 = i104 + 1;
                                    i103 = i105;
                                    i88 = 4;
                                }
                                i25 = H;
                                Locale locale = Locale.US;
                                String str13 = "vvc1." + i41 + "." + str6 + i43;
                                s1 u10 = i0.u(bArr2);
                                i58 = i94 + 8;
                                k0Var.a = i89;
                                i29 = i49;
                                str9 = str13;
                                pVar2 = pVar4;
                                str8 = "video/vvc";
                                i55 = i83;
                                i27 = i48;
                                i56 = i84;
                                i30 = i58;
                                i51 = 16;
                                list = u10;
                            } catch (ArrayIndexOutOfBoundsException e10) {
                                throw v0.a(e10, "Error parsing VVC configuration");
                            }
                        } else {
                            sVar3 = sVar4;
                            i25 = H;
                            i26 = H2;
                            f11 = f12;
                            if (m11 == 1986361461) {
                                yVar.N(i60 + 8);
                                int i109 = yVar.b;
                                b bVar2 = null;
                                while (i109 - i60 < m10) {
                                    yVar.N(i109);
                                    int m12 = yVar.m();
                                    e3.b.b(str10, m12 > 0);
                                    if (yVar.m() == 1702454643) {
                                        yVar.N(i109 + 8);
                                        int i110 = yVar.b;
                                        while (true) {
                                            if (i110 - i109 >= m12) {
                                                str5 = str10;
                                                i40 = i109;
                                                bVar = null;
                                                break;
                                            }
                                            yVar.N(i110);
                                            int m13 = yVar.m();
                                            e3.b.b(str10, m13 > 0);
                                            if (yVar.m() == 1937011305) {
                                                yVar.O(4);
                                                int A9 = yVar.A();
                                                str5 = str10;
                                                i40 = i109;
                                                bVar = new b(new ha.a((A9 & 1) == 1, (A9 & 2) == 2, (A9 & 8) == i49));
                                            } else {
                                                i110 += m13;
                                                i49 = 8;
                                            }
                                        }
                                        bVar2 = bVar;
                                    } else {
                                        str5 = str10;
                                        i40 = i109;
                                    }
                                    i109 = i40 + m12;
                                    str10 = str5;
                                    i49 = 8;
                                }
                                i9 i9Var = bVar2 == null ? null : new i9(bVar2, 29);
                                if (i9Var != null) {
                                    ha.a aVar = (ha.a) ((b) i9Var.b).a;
                                    if (pVar4 == null || ((i0) pVar4.a).size() < 2) {
                                        i39 = i50;
                                        if (i39 == -1) {
                                            i50 = aVar.c ? 5 : 4;
                                            pVar2 = pVar4;
                                        }
                                        i50 = i39;
                                        pVar2 = pVar4;
                                    } else {
                                        e3.b.b("both eye views must be marked as available", aVar.a && aVar.b);
                                        e3.b.b("for MV-HEVC, eye_views_reversed must be set to false", !aVar.c);
                                    }
                                }
                                i39 = i50;
                                i50 = i39;
                                pVar2 = pVar4;
                            } else {
                                int i111 = i50;
                                if (m11 == 1685480259 || m11 == 1685485123 || m11 == 1685485379) {
                                    pVar = pVar4;
                                    str4 = str8;
                                    i27 = i48;
                                    i28 = i24;
                                    i29 = 8;
                                    eVar2 = com.google.android.gms.internal.clearcut.e.c(yVar);
                                } else {
                                    int i112 = 11;
                                    if (m11 == 1987076931) {
                                        e3.b.b(null, str8 == null);
                                        String str14 = i48 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        yVar.N(i60 + 12);
                                        byte A10 = (byte) yVar.A();
                                        byte A11 = (byte) yVar.A();
                                        int A12 = yVar.A();
                                        i30 = A12 >> 4;
                                        byte b10 = (byte) ((A12 >> 1) & 7);
                                        if (str14.equals("video/x-vnd.on2.vp9")) {
                                            byte[] bArr3 = g2.h.a;
                                            list = i0.u(new byte[]{1, 1, A10, 2, 1, A11, 3, 1, (byte) i30, 4, 1, b10});
                                        }
                                        boolean z11 = (A12 & 1) != 0;
                                        int A13 = yVar.A();
                                        int A14 = yVar.A();
                                        i55 = d2.n.f(A13);
                                        i56 = z11 ? 1 : 2;
                                        str8 = str14;
                                        pVar2 = pVar4;
                                        i50 = i111;
                                        i24 = d2.n.g(A14);
                                        i27 = i48;
                                        i58 = i30;
                                        i29 = 8;
                                    } else if (m11 == 1635135811) {
                                        int i113 = m10 - 8;
                                        byte[] bArr4 = new byte[i113];
                                        yVar.k(0, i113, bArr4);
                                        list = i0.u(bArr4);
                                        yVar.N(i60 + 8);
                                        byte[] bArr5 = yVar.a;
                                        c4.f fVar = new c4.f(bArr5, bArr5.length);
                                        fVar.J(yVar.b * 8);
                                        fVar.M(1);
                                        int j11 = fVar.j(3);
                                        fVar.L(6);
                                        boolean i114 = fVar.i();
                                        boolean i115 = fVar.i();
                                        int i116 = -1;
                                        if (j11 == 2 && i114) {
                                            i31 = i115 ? 12 : 10;
                                            i32 = i115 ? 12 : 10;
                                        } else if (j11 <= 2) {
                                            int i117 = i114 ? 10 : 8;
                                            i32 = i114 ? 10 : 8;
                                            i31 = i117;
                                        } else {
                                            i31 = -1;
                                            i32 = -1;
                                        }
                                        fVar.L(13);
                                        fVar.K();
                                        int j12 = fVar.j(4);
                                        if (j12 != 1) {
                                            g2.a.g("BoxParsers", "Unsupported obu_type: " + j12);
                                            nVar2 = new d2.n(-1, -1, -1, null, i31, i32);
                                        } else if (fVar.i()) {
                                            g2.a.g("BoxParsers", "Unsupported obu_extension_flag");
                                            nVar2 = new d2.n(-1, -1, -1, null, i31, i32);
                                        } else {
                                            boolean i118 = fVar.i();
                                            fVar.K();
                                            if (!i118 || fVar.j(8) <= 127) {
                                                int j13 = fVar.j(3);
                                                fVar.K();
                                                if (fVar.i()) {
                                                    g2.a.g("BoxParsers", "Unsupported reduced_still_picture_header");
                                                    nVar2 = new d2.n(-1, -1, -1, null, i31, i32);
                                                } else if (fVar.i()) {
                                                    g2.a.g("BoxParsers", "Unsupported timing_info_present_flag");
                                                    nVar2 = new d2.n(-1, -1, -1, null, i31, i32);
                                                } else if (fVar.i()) {
                                                    g2.a.g("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                    nVar2 = new d2.n(-1, -1, -1, null, i31, i32);
                                                } else {
                                                    int i119 = 5;
                                                    int j14 = fVar.j(5);
                                                    int i120 = 0;
                                                    while (i120 <= j14) {
                                                        fVar.L(12);
                                                        if (fVar.j(i119) > i87) {
                                                            fVar.K();
                                                        }
                                                        i120++;
                                                        i119 = 5;
                                                        i87 = 7;
                                                    }
                                                    int j15 = fVar.j(4);
                                                    int j16 = fVar.j(4);
                                                    fVar.L(j15 + 1);
                                                    fVar.L(j16 + 1);
                                                    if (fVar.i()) {
                                                        i33 = 7;
                                                        fVar.L(7);
                                                    } else {
                                                        i33 = 7;
                                                    }
                                                    fVar.L(i33);
                                                    boolean i121 = fVar.i();
                                                    if (i121) {
                                                        fVar.L(2);
                                                    }
                                                    if (fVar.i()) {
                                                        j10 = 2;
                                                        i34 = 1;
                                                    } else {
                                                        i34 = 1;
                                                        j10 = fVar.j(1);
                                                    }
                                                    if (j10 > 0 && !fVar.i()) {
                                                        fVar.L(i34);
                                                    }
                                                    if (i121) {
                                                        i35 = 3;
                                                        fVar.L(3);
                                                    } else {
                                                        i35 = 3;
                                                    }
                                                    fVar.L(i35);
                                                    boolean i122 = fVar.i();
                                                    if (j13 == 2 && i122) {
                                                        fVar.K();
                                                    }
                                                    boolean z12 = j13 != 1 && fVar.i();
                                                    if (fVar.i()) {
                                                        int j17 = fVar.j(8);
                                                        int j18 = fVar.j(8);
                                                        int j19 = (!z12 && j17 == 1 && j18 == 13 && fVar.j(8) == 0) ? 1 : fVar.j(1);
                                                        int f13 = d2.n.f(j17);
                                                        int i123 = j19 == 1 ? 1 : 2;
                                                        i36 = f13;
                                                        i37 = i31;
                                                        i38 = d2.n.g(j18);
                                                        i116 = i123;
                                                    } else {
                                                        i36 = -1;
                                                        i37 = i31;
                                                        i38 = -1;
                                                    }
                                                    nVar = new d2.n(i36, i116, i38, null, i37, i32);
                                                    int i124 = nVar.e;
                                                    int i125 = nVar.f;
                                                    int i126 = nVar.a;
                                                    int i127 = nVar.b;
                                                    i24 = nVar.c;
                                                    pVar2 = pVar4;
                                                    i50 = i111;
                                                    i58 = i124;
                                                    i30 = i125;
                                                    i55 = i126;
                                                    i56 = i127;
                                                    i27 = i48;
                                                    i29 = 8;
                                                    str8 = "video/av01";
                                                }
                                            } else {
                                                g2.a.g("BoxParsers", "Excessive obu_size");
                                                nVar2 = new d2.n(-1, -1, -1, null, i31, i32);
                                            }
                                        }
                                        nVar = nVar2;
                                        int i1242 = nVar.e;
                                        int i1252 = nVar.f;
                                        int i1262 = nVar.a;
                                        int i1272 = nVar.b;
                                        i24 = nVar.c;
                                        pVar2 = pVar4;
                                        i50 = i111;
                                        i58 = i1242;
                                        i30 = i1252;
                                        i55 = i1262;
                                        i56 = i1272;
                                        i27 = i48;
                                        i29 = 8;
                                        str8 = "video/av01";
                                    } else if (m11 == 1668050025) {
                                        if (byteBuffer == null) {
                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer2 = byteBuffer;
                                        byteBuffer2.position(21);
                                        byteBuffer2.putShort(yVar.x());
                                        byteBuffer2.putShort(yVar.x());
                                        byteBuffer = byteBuffer2;
                                        pVar2 = pVar4;
                                        i50 = i111;
                                    } else {
                                        if (m11 == 1835295606) {
                                            if (byteBuffer == null) {
                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                            }
                                            ByteBuffer byteBuffer3 = byteBuffer;
                                            short x10 = yVar.x();
                                            short x11 = yVar.x();
                                            short x12 = yVar.x();
                                            short x13 = yVar.x();
                                            short x14 = yVar.x();
                                            short x15 = yVar.x();
                                            pVar = pVar4;
                                            short x16 = yVar.x();
                                            str4 = str8;
                                            short x17 = yVar.x();
                                            long C = yVar.C();
                                            long C2 = yVar.C();
                                            i27 = i48;
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
                                            pVar = pVar4;
                                            str4 = str8;
                                            i27 = i48;
                                            if (m11 == 1681012275) {
                                                e3.b.b(null, str4 == null);
                                                pVar2 = pVar;
                                                str8 = str3;
                                            } else if (m11 == 1702061171) {
                                                e3.b.b(null, str4 == null);
                                                z0 c2 = c(i60, yVar);
                                                String str15 = (String) c2.c;
                                                byte[] bArr6 = (byte[]) c2.d;
                                                if (bArr6 != null) {
                                                    list = i0.u(bArr6);
                                                }
                                                z0Var = c2;
                                                str8 = str15;
                                                pVar2 = pVar;
                                            } else if (m11 == 1651798644) {
                                                yVar.N(i60 + 8);
                                                yVar.O(4);
                                                xVar = new x(yVar.C(), yVar.C());
                                            } else if (m11 == 1885434736) {
                                                yVar.N(i60 + 8);
                                                f11 = yVar.E() / yVar.E();
                                                pVar2 = pVar;
                                                i56 = i84;
                                                i30 = i86;
                                                str8 = str4;
                                                i29 = 8;
                                                z10 = true;
                                                i50 = i111;
                                                i55 = i83;
                                                i58 = i85;
                                            } else if (m11 == 1937126244) {
                                                int i128 = i60 + 8;
                                                while (true) {
                                                    if (i128 - i60 >= m10) {
                                                        bArr = null;
                                                        break;
                                                    }
                                                    yVar.N(i128);
                                                    int m14 = yVar.m();
                                                    if (yVar.m() == 1886547818) {
                                                        bArr = Arrays.copyOfRange(yVar.a, i128, m14 + i128);
                                                        break;
                                                    }
                                                    i128 += m14;
                                                }
                                            } else if (m11 == 1936995172) {
                                                int A15 = yVar.A();
                                                int i129 = 3;
                                                yVar.O(3);
                                                if (A15 == 0) {
                                                    int A16 = yVar.A();
                                                    if (A16 == 0) {
                                                        i129 = 0;
                                                    } else if (A16 == 1) {
                                                        i129 = 1;
                                                    } else if (A16 == 2) {
                                                        i129 = 2;
                                                    }
                                                    pVar2 = pVar;
                                                    i56 = i84;
                                                    i30 = i86;
                                                    str8 = str4;
                                                    i29 = 8;
                                                    i50 = i129;
                                                    i55 = i83;
                                                    i58 = i85;
                                                }
                                                i129 = i111;
                                                pVar2 = pVar;
                                                i56 = i84;
                                                i30 = i86;
                                                str8 = str4;
                                                i29 = 8;
                                                i50 = i129;
                                                i55 = i83;
                                                i58 = i85;
                                            } else if (m11 == 1634760259) {
                                                int i130 = m10 - 12;
                                                byte[] bArr7 = new byte[i130];
                                                yVar.N(i60 + 12);
                                                int i131 = 0;
                                                yVar.k(0, i130, bArr7);
                                                byte[] bArr8 = g2.h.a;
                                                zb.c(i130, "Invalid APV CSD length: %s", i130 >= 17);
                                                byte b11 = bArr7[0];
                                                zb.c(b11, "Invalid APV CSD version: %s", b11 == 1);
                                                int i132 = bArr7[5] & 255;
                                                int i133 = bArr7[6] & 255;
                                                int i134 = bArr7[7] & 255;
                                                String str16 = n0.a;
                                                Locale locale2 = Locale.US;
                                                StringBuilder m15 = com.google.android.recaptcha.internal.a.m("apv1.apvf", i132, ".apvl", i133, ".apvb");
                                                m15.append(i134);
                                                str9 = m15.toString();
                                                s1 u11 = i0.u(bArr7);
                                                y yVar2 = new y(bArr7);
                                                c4.f fVar2 = new c4.f(bArr7, i130);
                                                i29 = 8;
                                                fVar2.J(yVar2.b * 8);
                                                fVar2.M(1);
                                                int j20 = fVar2.j(8);
                                                int i135 = 0;
                                                int i136 = -1;
                                                int i137 = -1;
                                                i30 = -1;
                                                i55 = -1;
                                                i58 = -1;
                                                while (i135 < j20) {
                                                    fVar2.M(1);
                                                    int j21 = fVar2.j(8);
                                                    int i138 = i30;
                                                    int i139 = i137;
                                                    int i140 = i136;
                                                    int i141 = i131;
                                                    while (i141 < j21) {
                                                        fVar2.L(6);
                                                        boolean i142 = fVar2.i();
                                                        fVar2.K();
                                                        fVar2.M(i112);
                                                        fVar2.L(4);
                                                        i58 = fVar2.j(4) + 8;
                                                        fVar2.M(1);
                                                        if (i142) {
                                                            int j22 = fVar2.j(8);
                                                            int j23 = fVar2.j(8);
                                                            fVar2.M(1);
                                                            boolean i143 = fVar2.i();
                                                            int f14 = d2.n.f(j22);
                                                            int i144 = i143 ? 1 : 2;
                                                            i139 = d2.n.g(j23);
                                                            i55 = f14;
                                                            i140 = i144;
                                                        }
                                                        i141++;
                                                        i138 = i58;
                                                        i112 = 11;
                                                    }
                                                    i135++;
                                                    i136 = i140;
                                                    i137 = i139;
                                                    i30 = i138;
                                                    i112 = 11;
                                                    i131 = 0;
                                                }
                                                str8 = "video/apv";
                                                list = u11;
                                                i56 = i136;
                                                i24 = i137;
                                                pVar2 = pVar;
                                                i50 = i111;
                                            } else {
                                                i29 = 8;
                                                if (m11 == 1668246642) {
                                                    i28 = i24;
                                                    if (i83 == -1 && i28 == -1) {
                                                        int m16 = yVar.m();
                                                        if (m16 == 1852009592 || m16 == 1852009571) {
                                                            int H7 = yVar.H();
                                                            int H8 = yVar.H();
                                                            yVar.O(2);
                                                            boolean z13 = m10 == 19 && (yVar.A() & 128) != 0;
                                                            int f15 = d2.n.f(H7);
                                                            i56 = z13 ? 1 : 2;
                                                            i24 = d2.n.g(H8);
                                                            pVar2 = pVar;
                                                            i30 = i86;
                                                            str8 = str4;
                                                            i55 = f15;
                                                            i50 = i111;
                                                            i58 = i85;
                                                        } else {
                                                            g2.a.l("BoxParsers", "Unsupported color type: " + ad.l.a(m16));
                                                        }
                                                    }
                                                } else {
                                                    i28 = i24;
                                                }
                                            }
                                            i56 = i84;
                                            i58 = i85;
                                            i30 = i86;
                                            i29 = 8;
                                            i50 = i111;
                                            i55 = i83;
                                        }
                                        pVar2 = pVar;
                                        i56 = i84;
                                        i30 = i86;
                                        str8 = str4;
                                        i29 = 8;
                                        i50 = i111;
                                        i55 = i83;
                                        i58 = i85;
                                    }
                                }
                                i24 = i28;
                                pVar2 = pVar;
                                i56 = i84;
                                i30 = i86;
                                str8 = str4;
                                i50 = i111;
                                i55 = i83;
                                i58 = i85;
                            }
                            i27 = i48;
                            i56 = i84;
                            i58 = i85;
                            i30 = i86;
                            i29 = 8;
                            i55 = i83;
                        }
                    }
                }
            }
            i47 = i23 + m10;
            i45 = i10;
            i46 = i11;
            i49 = i29;
            str7 = str3;
            sVar4 = sVar3;
            i48 = i27;
            i57 = i24;
            f12 = f11;
            H2 = i26;
            H = i25;
            i59 = i30;
        }
    }
}
