package z3;

import a8.ia;
import aa.c0;
import android.util.Pair;
import c8.e1;
import e2.p0;
import e2.q0;
import e2.s0;
import e2.t0;
import f3.w;
import h2.j0;
import h2.m0;
import h2.x;
import h9.f0;
import h9.i0;
import h9.t1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rt;
import y7.i6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    static {
        String str = m0.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(x xVar) {
        int i7 = xVar.b;
        xVar.O(4);
        if (xVar.m() != 1751411826) {
            i7 += 4;
        }
        xVar.N(i7);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static void b(h2.x r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, e2.r r56, h2.j0 r57, int r58) {
        /*
            Method dump skipped, instructions count: 3236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.c.b(h2.x, int, int, int, int, java.lang.String, boolean, e2.r, h2.j0, int):void");
    }

    public static a4.c c(int i7, x xVar) {
        xVar.N(i7 + 12);
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
        String e10 = s0.e(xVar.A());
        if ("audio/mpeg".equals(e10) || "audio/vnd.dts".equals(e10) || "audio/vnd.dts.hd".equals(e10)) {
            return new a4.c(e10, null, -1L, -1L);
        }
        xVar.O(4);
        long C = xVar.C();
        long C2 = xVar.C();
        xVar.O(1);
        int d = d(xVar);
        long j3 = C2;
        byte[] bArr = new byte[d];
        xVar.k(0, d, bArr);
        if (j3 <= 0) {
            j3 = -1;
        }
        return new a4.c(e10, bArr, j3, C > 0 ? C : -1L);
    }

    public static int d(x xVar) {
        int A = xVar.A();
        int i7 = A & qs.L1;
        while ((A & 128) == 128) {
            A = xVar.A();
            i7 = (i7 << 7) | (A & qs.L1);
        }
        return i7;
    }

    public static int e(int i7) {
        return (i7 >> 24) & qs.e4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = r14.m();
        r10 = r14.m();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.k(0, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r11 = new i2.a(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        com.google.android.recaptcha.internal.a.r("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q0 f(i2.c cVar) {
        i2.d e10 = cVar.e(1751411826);
        i2.d e11 = cVar.e(1801812339);
        i2.d e12 = cVar.e(1768715124);
        if (e10 == null || e11 == null || e12 == null) {
            return null;
        }
        x xVar = e10.c;
        xVar.N(16);
        if (xVar.m() != 1835299937) {
            return null;
        }
        x xVar2 = e11.c;
        xVar2.N(12);
        int m10 = xVar2.m();
        String[] strArr = new String[m10];
        for (int i7 = 0; i7 < m10; i7++) {
            int m11 = xVar2.m();
            xVar2.O(4);
            strArr[i7] = xVar2.y(m11 - 8, StandardCharsets.UTF_8);
        }
        x xVar3 = e12.c;
        xVar3.N(8);
        ArrayList arrayList = new ArrayList();
        while (xVar3.a() > 8) {
            int i10 = xVar3.b;
            int m12 = xVar3.m();
            int m13 = xVar3.m() - 1;
            if (m13 < 0 || m13 >= m10) {
                com.google.android.recaptcha.internal.a.o(m13, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                String str = strArr[m13];
                int i11 = i10 + m12;
                while (true) {
                    int i12 = xVar3.b;
                    if (i12 >= i11) {
                        break;
                    }
                    int m14 = xVar3.m();
                    if (xVar3.m() == 1684108385) {
                        break;
                    }
                    xVar3.N(i12 + m14);
                }
                i2.a aVar = null;
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            xVar3.N(i10 + m12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new q0(arrayList);
    }

    public static i2.f g(x xVar) {
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
        return new i2.f(u10, u11, xVar.C());
    }

    public static Pair h(x xVar, int i7, int i10) {
        Integer num;
        s sVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z9;
        int i13 = xVar.b;
        while (i13 - i7 < i10) {
            xVar.N(i13);
            int m10 = xVar.m();
            f3.b.b("childAtomSize must be positive", m10 > 0);
            if (xVar.m() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                while (i14 - i13 < m10) {
                    xVar.N(i14);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    if (m12 == 1718775137) {
                        num3 = Integer.valueOf(xVar.m());
                    } else if (m12 == 1935894637) {
                        xVar.O(4);
                        str = xVar.y(4, StandardCharsets.UTF_8);
                    } else if (m12 == 1935894633) {
                        i16 = i14;
                        i15 = m11;
                    }
                    i14 += m11;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    f3.b.b("frma atom is mandatory", num3 != null);
                    f3.b.b("schi atom is mandatory", i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = num3;
                            sVar = null;
                            break;
                        }
                        xVar.N(i17);
                        int m13 = xVar.m();
                        if (xVar.m() == 1952804451) {
                            int e10 = e(xVar.m());
                            xVar.O(1);
                            if (e10 == 0) {
                                xVar.O(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int A = xVar.A();
                                i11 = A & 15;
                                i12 = (A & qs.P3) >> 4;
                            }
                            if (xVar.A() == 1) {
                                num2 = num3;
                                z9 = true;
                            } else {
                                num2 = num3;
                                z9 = false;
                            }
                            int A2 = xVar.A();
                            byte[] bArr2 = new byte[16];
                            xVar.k(0, 16, bArr2);
                            if (z9 && A2 == 0) {
                                int A3 = xVar.A();
                                byte[] bArr3 = new byte[A3];
                                xVar.k(0, A3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            sVar = new s(z9, str, A2, bArr2, i12, i11, bArr);
                        } else {
                            i17 += m13;
                        }
                    }
                    f3.b.b("tenc atom is mandatory", sVar != null);
                    String str2 = m0.a;
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
    public static ArrayList i(i2.c cVar, w wVar, long j3, e2.r rVar, boolean z9, boolean z10, g9.k kVar, boolean z11) {
        long j10;
        long j11;
        long j12;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        long j13;
        long j14;
        long a02;
        int i12;
        int i13;
        int i14;
        long j15;
        int i15;
        int i16;
        String str;
        i2.d e10;
        long[] jArr;
        long[] jArr2;
        e2.u uVar;
        e2.u uVar2;
        g9.k kVar2;
        r rVar2;
        i2.c d;
        Pair create;
        int i17;
        e2.r rVar3;
        String str2;
        int i18;
        x xVar;
        j0 j0Var;
        int i19;
        int i20;
        int i21;
        j0 j0Var2;
        x xVar2;
        e2.r rVar4;
        boolean z12;
        int i22;
        x xVar3;
        t1 t1Var;
        long j16;
        b bVar;
        boolean z13;
        int i23;
        int i24;
        int i25;
        boolean z14;
        ArrayList arrayList2;
        int i26;
        long[] jArr3;
        long[] jArr4;
        int i27;
        int[] iArr;
        long j17;
        boolean z15;
        int i28;
        ArrayList arrayList3;
        int i29;
        int[] iArr2;
        int i30;
        long j18;
        int[] iArr3;
        int i31;
        int i32;
        int i33;
        int i34;
        long j19;
        long[] jArr5;
        long j20;
        long j21;
        u uVar3;
        ArrayList arrayList4;
        boolean z16;
        int[] iArr4;
        int i35;
        int i36;
        u uVar4;
        long a03;
        i2.c cVar2 = cVar;
        ArrayList arrayList5 = new ArrayList();
        int i37 = 0;
        for (ArrayList arrayList6 = cVar2.e; i37 < arrayList6.size(); arrayList6 = arrayList) {
            i2.c cVar3 = (i2.c) arrayList6.get(i37);
            if (cVar3.b != 1953653099) {
                arrayList = arrayList6;
                arrayList4 = arrayList5;
                i7 = i37;
            } else {
                i2.d e11 = cVar2.e(1836476516);
                e11.getClass();
                i2.c d2 = cVar3.d(1835297121);
                d2.getClass();
                i2.d e12 = d2.e(1751411826);
                e12.getClass();
                x xVar4 = e12.c;
                xVar4.N(16);
                int m10 = xVar4.m();
                int i38 = 0;
                int i39 = m10 == 1936684398 ? 1 : m10 == 1986618469 ? 2 : (m10 == 1952807028 || m10 == 1935832172 || m10 == 1937072756 || m10 == 1668047728 || m10 == 1937072752) ? 3 : m10 == 1835365473 ? 5 : -1;
                int i40 = 1;
                if (i39 == -1) {
                    arrayList = arrayList6;
                    i7 = i37;
                    rVar2 = null;
                    j10 = 0;
                    kVar2 = kVar;
                } else {
                    j10 = 0;
                    i2.d e13 = cVar3.e(1953196132);
                    e13.getClass();
                    x xVar5 = e13.c;
                    xVar5.N(8);
                    int e14 = e(xVar5.m());
                    xVar5.O(e14 != 0 ? 16 : 8);
                    int m11 = xVar5.m();
                    xVar5.O(4);
                    int i41 = xVar5.b;
                    int i42 = e14 == 0 ? 4 : 8;
                    int i43 = 0;
                    while (true) {
                        j11 = -9223372036854775807L;
                        if (i43 >= i42) {
                            xVar5.O(i42);
                            break;
                        }
                        if (xVar5.a[i41 + i43] != -1) {
                            j12 = e14 == 0 ? xVar5.C() : xVar5.G();
                        } else {
                            i43++;
                        }
                    }
                    j12 = -9223372036854775807L;
                    xVar5.O(10);
                    int H = xVar5.H();
                    xVar5.O(4);
                    int m12 = xVar5.m();
                    int m13 = xVar5.m();
                    xVar5.O(4);
                    int m14 = xVar5.m();
                    arrayList = arrayList6;
                    int m15 = xVar5.m();
                    i7 = i37;
                    if (m12 == 0 && m13 == 65536) {
                        i10 = i39;
                        if ((m14 == -65536 || m14 == 65536) && m15 == 0) {
                            i11 = 90;
                            xVar5.O(16);
                            short x10 = xVar5.x();
                            xVar5.O(2);
                            short x11 = xVar5.x();
                            j13 = j3 != -9223372036854775807L ? j12 : j3;
                            long j22 = g(e11.c).c;
                            if (j13 != -9223372036854775807L) {
                                j14 = j22;
                                a02 = -9223372036854775807L;
                            } else {
                                String str3 = m0.a;
                                j14 = j22;
                                a02 = m0.a0(j13, 1000000L, j14, RoundingMode.DOWN);
                            }
                            i2.c d10 = d2.d(1835626086);
                            d10.getClass();
                            i2.c d11 = d10.d(1937007212);
                            d11.getClass();
                            i2.d e15 = d2.e(1835296868);
                            e15.getClass();
                            x xVar6 = e15.c;
                            xVar6.N(8);
                            int e16 = e(xVar6.m());
                            xVar6.O(e16 != 0 ? 8 : 16);
                            long C = xVar6.C();
                            int i44 = xVar6.b;
                            i12 = e16 != 0 ? 4 : 8;
                            i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    i14 = i11;
                                    j15 = a02;
                                    xVar6.O(i12);
                                    break;
                                }
                                i14 = i11;
                                j15 = a02;
                                if (xVar6.a[i44 + i13] != -1) {
                                    long C2 = e16 == 0 ? xVar6.C() : xVar6.G();
                                    if (C2 != 0) {
                                        String str4 = m0.a;
                                        j11 = m0.a0(C2, 1000000L, C, RoundingMode.DOWN);
                                    }
                                } else {
                                    i13++;
                                    i11 = i14;
                                    a02 = j15;
                                }
                            }
                            long j23 = j11;
                            int H2 = xVar6.H();
                            char[] cArr = {(char) (((H2 >> 10) & 31) + 96), (char) (((H2 >> 5) & 31) + 96), (char) ((H2 & 31) + 96)};
                            i16 = 0;
                            for (i15 = 3; i16 < i15; i15 = 3) {
                                char c10 = cArr[i16];
                                if (c10 < 'a' || c10 > 'z') {
                                    str = null;
                                    break;
                                }
                                i16++;
                            }
                            str = new String(cArr);
                            e10 = d11.e(1937011556);
                            if (e10 != null) {
                                h2.a.l("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            } else {
                                x xVar7 = e10.c;
                                xVar7.N(12);
                                int m16 = xVar7.m();
                                j0 j0Var3 = new j0(m16, 5);
                                int i45 = 0;
                                while (i45 < m16) {
                                    int i46 = xVar7.b;
                                    int m17 = xVar7.m();
                                    long j24 = j23;
                                    f3.b.b("childAtomSize must be positive", m17 > 0 ? i40 : i38);
                                    int m18 = xVar7.m();
                                    if (m18 == 1635148593 || m18 == 1635148595 || m18 == 1701733238 || m18 == 1831958048 || m18 == 1836070006 || m18 == 1752589105 || m18 == 1751479857 || m18 == 1987470129 || m18 == 1987471665 || m18 == 1932670515 || m18 == 1211250227 || m18 == 1748121139 || m18 == 1987063864 || m18 == 1987063865 || m18 == 1635135537 || m18 == 1685479798 || m18 == 1685479729 || m18 == 1685481573 || m18 == 1685481521 || m18 == 1634760241 || m18 == 1684108849 || m18 == 1634743416 || m18 == 1634743400 || m18 == 1634755432 || m18 == 1634755438 || m18 == 1634755443) {
                                        i17 = m16;
                                        rVar3 = rVar;
                                        str2 = str;
                                        i18 = m18;
                                        xVar = xVar7;
                                        j0Var = j0Var3;
                                        i19 = i45;
                                        i20 = i46;
                                        i21 = i14;
                                    } else if (m18 == 1634755439) {
                                        rVar3 = rVar;
                                        str2 = str;
                                        i18 = m18;
                                        xVar = xVar7;
                                        i17 = m16;
                                        j0Var = j0Var3;
                                        i19 = i45;
                                        i20 = i46;
                                        i21 = i14;
                                    } else {
                                        if (m18 == 1836069985 || m18 == 1701733217 || m18 == 1633889587 || m18 == 1700998451 || m18 == 1633889588 || m18 == 1835823201 || m18 == 1685353315 || m18 == 1685353317 || m18 == 1685353320 || m18 == 1685353324 || m18 == 1685353336 || m18 == 1935764850 || m18 == 1935767394 || m18 == 1819304813 || m18 == 1936684916 || m18 == 1953984371 || m18 == 778924082 || m18 == 778924083 || m18 == 1835557169 || m18 == 1835560241 || m18 == 1634492771 || m18 == 1634492791 || m18 == 1970037111 || m18 == 1332770163 || m18 == 1716281667 || m18 == 1767992678 || m18 == 1768973165) {
                                            i17 = m16;
                                            rVar4 = rVar;
                                            z12 = z10;
                                            str2 = str;
                                            i22 = m18;
                                            xVar = xVar7;
                                            j0Var = j0Var3;
                                            i19 = i45;
                                            i20 = i46;
                                        } else if (m18 == 1718641517) {
                                            rVar4 = rVar;
                                            z12 = z10;
                                            str2 = str;
                                            i22 = m18;
                                            xVar = xVar7;
                                            i17 = m16;
                                            j0Var = j0Var3;
                                            i19 = i45;
                                            i20 = i46;
                                        } else {
                                            if (m18 == 1414810956 || m18 == 1954034535 || m18 == 2004251764 || m18 == 1937010800 || m18 == 1664495672 || m18 == 1836070003) {
                                                xVar7.N(i46 + 16);
                                                String str5 = "application/ttml+xml";
                                                if (m18 != 1414810956) {
                                                    if (m18 == 1954034535) {
                                                        int i47 = m17 - 16;
                                                        byte[] bArr = new byte[i47];
                                                        xVar7.k(i38, i47, bArr);
                                                        t1Var = i0.u(bArr);
                                                        str5 = "application/x-quicktime-tx3g";
                                                        xVar3 = xVar7;
                                                        i17 = m16;
                                                        i19 = i45;
                                                        i20 = i46;
                                                        j16 = Long.MAX_VALUE;
                                                        if (str5 != null) {
                                                            e2.t tVar = new e2.t();
                                                            tVar.a = Integer.toString(m11);
                                                            tVar.r = s0.n(str5);
                                                            tVar.d = str;
                                                            tVar.w = j16;
                                                            tVar.u = t1Var;
                                                            j0Var3.d = new e2.u(tVar);
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i21 = i14;
                                                        xVar2 = xVar3;
                                                    } else if (m18 == 2004251764) {
                                                        str5 = "application/x-mp4-vtt";
                                                    } else if (m18 == 1937010800) {
                                                        xVar3 = xVar7;
                                                        i17 = m16;
                                                        i19 = i45;
                                                        i20 = i46;
                                                        j16 = 0;
                                                        t1Var = null;
                                                        if (str5 != null) {
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i21 = i14;
                                                        xVar2 = xVar3;
                                                    } else if (m18 == 1664495672) {
                                                        j0Var3.b = i40;
                                                        str5 = "application/x-mp4-cea-608";
                                                    } else {
                                                        if (m18 != 1836070003) {
                                                            throw new IllegalStateException();
                                                        }
                                                        int i48 = xVar7.b;
                                                        xVar7.O(4);
                                                        if (xVar7.m() == 1702061171) {
                                                            byte[] bArr2 = (byte[]) c(i48, xVar7).d;
                                                            if (bArr2 == null || bArr2.length != 64) {
                                                                xVar3 = xVar7;
                                                                i17 = m16;
                                                                i19 = i45;
                                                                i20 = i46;
                                                                str2 = str;
                                                                j0Var2 = j0Var3;
                                                                i21 = i14;
                                                                xVar2 = xVar3;
                                                            } else {
                                                                ia.p(bArr2.length == 64);
                                                                ArrayList arrayList7 = new ArrayList(16);
                                                                xVar3 = xVar7;
                                                                int i49 = 0;
                                                                while (i49 < bArr2.length - 3) {
                                                                    byte[] bArr3 = bArr2;
                                                                    int i50 = i45;
                                                                    int c11 = e1.c(bArr2[i49], bArr3[i49 + 1], bArr3[i49 + 2], bArr3[i49 + 3]);
                                                                    int i51 = (c11 >> 16) & qs.e4;
                                                                    int i52 = ((c11 >> 8) & qs.e4) - 128;
                                                                    int i53 = (c11 & qs.e4) - 128;
                                                                    arrayList7.add(String.format("%06x", Integer.valueOf(m0.i(((i53 * 17790) / 10000) + i51, 0, qs.e4) | (m0.i((i51 - ((i53 * 3455) / 10000)) - ((i52 * 7169) / 10000), 0, qs.e4) << 8) | (m0.i(((i52 * 14075) / 10000) + i51, 0, qs.e4) << 16))));
                                                                    i49 += 4;
                                                                    bArr2 = bArr3;
                                                                    i46 = i46;
                                                                    i45 = i50;
                                                                    m16 = m16;
                                                                }
                                                                i17 = m16;
                                                                i19 = i45;
                                                                i20 = i46;
                                                                StringBuilder o4 = jg.g.o("size: ", x10, "x", x11, "\npalette: ");
                                                                o4.append(new g9.l(", ", 0).e(arrayList7));
                                                                o4.append("\n");
                                                                String sb2 = o4.toString();
                                                                String str6 = m0.a;
                                                                t1Var = i0.u(sb2.getBytes(StandardCharsets.UTF_8));
                                                                str5 = "application/vobsub";
                                                            }
                                                        } else {
                                                            xVar3 = xVar7;
                                                            i17 = m16;
                                                            i19 = i45;
                                                            i20 = i46;
                                                            t1Var = null;
                                                            str5 = null;
                                                        }
                                                        j16 = Long.MAX_VALUE;
                                                        if (str5 != null) {
                                                        }
                                                        str2 = str;
                                                        j0Var2 = j0Var3;
                                                        i21 = i14;
                                                        xVar2 = xVar3;
                                                    }
                                                }
                                                xVar3 = xVar7;
                                                i17 = m16;
                                                i19 = i45;
                                                i20 = i46;
                                                j16 = Long.MAX_VALUE;
                                                t1Var = null;
                                                if (str5 != null) {
                                                }
                                                str2 = str;
                                                j0Var2 = j0Var3;
                                                i21 = i14;
                                                xVar2 = xVar3;
                                            } else {
                                                if (m18 == 1835365492) {
                                                    xVar7.N(i46 + 16);
                                                    if (m18 == 1835365492) {
                                                        xVar7.v();
                                                        String v = xVar7.v();
                                                        if (v != null) {
                                                            e2.t tVar2 = new e2.t();
                                                            tVar2.a = Integer.toString(m11);
                                                            tVar2.r = s0.n(v);
                                                            j0Var3.d = new e2.u(tVar2);
                                                        }
                                                    }
                                                } else if (m18 == 1667329389) {
                                                    e2.t tVar3 = new e2.t();
                                                    tVar3.a = Integer.toString(m11);
                                                    tVar3.r = s0.n("application/x-camera-motion");
                                                    j0Var3.d = new e2.u(tVar3);
                                                }
                                                str2 = str;
                                                xVar2 = xVar7;
                                                i17 = m16;
                                                j0Var2 = j0Var3;
                                                i19 = i45;
                                                i20 = i46;
                                                i21 = i14;
                                            }
                                            xVar2.N(i20 + m17);
                                            i45 = i19 + 1;
                                            xVar7 = xVar2;
                                            j0Var3 = j0Var2;
                                            str = str2;
                                            i14 = i21;
                                            m16 = i17;
                                            j23 = j24;
                                            i38 = 0;
                                            i40 = 1;
                                        }
                                        b(xVar, i22, i20, m17, m11, str2, z12, rVar4, j0Var, i19);
                                        i21 = i14;
                                        xVar2 = xVar;
                                        j0Var2 = j0Var;
                                        xVar2.N(i20 + m17);
                                        i45 = i19 + 1;
                                        xVar7 = xVar2;
                                        j0Var3 = j0Var2;
                                        str = str2;
                                        i14 = i21;
                                        m16 = i17;
                                        j23 = j24;
                                        i38 = 0;
                                        i40 = 1;
                                    }
                                    k(xVar, i18, i20, m17, m11, str2, i21, rVar3, j0Var, i19);
                                    xVar2 = xVar;
                                    j0Var2 = j0Var;
                                    xVar2.N(i20 + m17);
                                    i45 = i19 + 1;
                                    xVar7 = xVar2;
                                    j0Var3 = j0Var2;
                                    str = str2;
                                    i14 = i21;
                                    m16 = i17;
                                    j23 = j24;
                                    i38 = 0;
                                    i40 = 1;
                                }
                                long j25 = j23;
                                j0 j0Var4 = j0Var3;
                                if (!z9 && (d = cVar3.d(1701082227)) != null) {
                                    i2.d e17 = d.e(1701606260);
                                    if (e17 == null) {
                                        create = null;
                                    } else {
                                        x xVar8 = e17.c;
                                        xVar8.N(8);
                                        int e18 = e(xVar8.m());
                                        int E = xVar8.E();
                                        long[] jArr6 = new long[E];
                                        long[] jArr7 = new long[E];
                                        for (int i54 = 0; i54 < E; i54++) {
                                            jArr6[i54] = e18 == 1 ? xVar8.G() : xVar8.C();
                                            jArr7[i54] = e18 == 1 ? xVar8.u() : xVar8.m();
                                            if (xVar8.x() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            xVar8.O(2);
                                        }
                                        create = Pair.create(jArr6, jArr7);
                                    }
                                    if (create != null) {
                                        jArr = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        uVar = (e2.u) j0Var4.d;
                                        if (uVar != null) {
                                            if (H != 0) {
                                                i2.b bVar2 = new i2.b(H);
                                                e2.t a10 = uVar.a();
                                                q0 q0Var = ((e2.u) j0Var4.d).l;
                                                a10.k = q0Var != null ? q0Var.a(bVar2) : new q0(bVar2);
                                                uVar2 = new e2.u(a10);
                                            } else {
                                                uVar2 = uVar;
                                            }
                                            r rVar5 = new r(m11, i10, C, j14, j15, j25, uVar2, j0Var4.b, (s[]) j0Var4.c, j0Var4.a, jArr, jArr2);
                                            kVar2 = kVar;
                                            rVar2 = rVar5;
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                uVar = (e2.u) j0Var4.d;
                                if (uVar != null) {
                                }
                            }
                            kVar2 = kVar;
                            rVar2 = null;
                        }
                    } else {
                        i10 = i39;
                    }
                    i11 = (m12 == 0 && m13 == -65536 && (m14 == 65536 || m14 == -65536) && m15 == 0) ? qs.t4 : ((m12 == -65536 || m12 == 65536) && m13 == 0 && m14 == 0 && m15 == -65536) ? qs.K2 : 0;
                    xVar5.O(16);
                    short x102 = xVar5.x();
                    xVar5.O(2);
                    short x112 = xVar5.x();
                    if (j3 != -9223372036854775807L) {
                    }
                    long j222 = g(e11.c).c;
                    if (j13 != -9223372036854775807L) {
                    }
                    i2.c d102 = d2.d(1835626086);
                    d102.getClass();
                    i2.c d112 = d102.d(1937007212);
                    d112.getClass();
                    i2.d e152 = d2.e(1835296868);
                    e152.getClass();
                    x xVar62 = e152.c;
                    xVar62.N(8);
                    int e162 = e(xVar62.m());
                    xVar62.O(e162 != 0 ? 8 : 16);
                    long C3 = xVar62.C();
                    int i442 = xVar62.b;
                    if (e162 != 0) {
                    }
                    i13 = 0;
                    while (true) {
                        if (i13 < i12) {
                        }
                        i13++;
                        i11 = i14;
                        a02 = j15;
                    }
                    long j232 = j11;
                    int H22 = xVar62.H();
                    char[] cArr2 = {(char) (((H22 >> 10) & 31) + 96), (char) (((H22 >> 5) & 31) + 96), (char) ((H22 & 31) + 96)};
                    i16 = 0;
                    while (i16 < i15) {
                    }
                    str = new String(cArr2);
                    e10 = d112.e(1937011556);
                    if (e10 != null) {
                    }
                    kVar2 = kVar;
                    rVar2 = null;
                }
                r rVar6 = (r) kVar2.apply(rVar2);
                if (rVar6 == null) {
                    arrayList4 = arrayList5;
                } else {
                    e2.u uVar5 = rVar6.g;
                    i2.c d12 = cVar3.d(1835297121);
                    d12.getClass();
                    i2.c d13 = d12.d(1835626086);
                    d13.getClass();
                    i2.c d14 = d13.d(1937007212);
                    d14.getClass();
                    i2.d e19 = d14.e(1937011578);
                    if (e19 != null) {
                        bVar = new cc.c(e19, uVar5);
                    } else {
                        i2.d e20 = d14.e(1937013298);
                        if (e20 == null) {
                            throw t0.a(null, "Track has no sample table size information");
                        }
                        h2.s sVar = new h2.s();
                        x xVar9 = e20.c;
                        sVar.e = xVar9;
                        xVar9.N(12);
                        sVar.b = xVar9.E() & qs.e4;
                        sVar.a = xVar9.E();
                        bVar = sVar;
                    }
                    int b10 = bVar.b();
                    if (b10 == 0) {
                        arrayList4 = arrayList5;
                        uVar3 = new u(rVar6, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (rVar6.b == 2) {
                            long j26 = rVar6.f;
                            if (j26 > j10) {
                                e2.t a11 = uVar5.a();
                                a11.C = b10 / (j26 / 1000000.0f);
                                rVar6 = rVar6.a(new e2.u(a11));
                            }
                        }
                        e2.u uVar6 = rVar6.g;
                        i2.d e21 = d14.e(1937007471);
                        if (e21 == null) {
                            e21 = d14.e(1668232756);
                            e21.getClass();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        x xVar10 = e21.c;
                        i2.d e22 = d14.e(1937011555);
                        e22.getClass();
                        x xVar11 = e22.c;
                        i2.d e23 = d14.e(1937011827);
                        e23.getClass();
                        x xVar12 = e23.c;
                        i2.d e24 = d14.e(1937011571);
                        x xVar13 = e24 != null ? e24.c : null;
                        i2.d e25 = d14.e(1668576371);
                        x xVar14 = e25 != null ? e25.c : null;
                        a aVar = new a(xVar11, xVar10, z13);
                        xVar12.N(12);
                        int E2 = xVar12.E() - 1;
                        int E3 = xVar12.E();
                        int E4 = xVar12.E();
                        if (xVar14 != null) {
                            xVar14.N(12);
                            i23 = xVar14.E();
                        } else {
                            i23 = 0;
                        }
                        if (xVar13 != null) {
                            xVar13.N(12);
                            i24 = xVar13.E();
                            if (i24 > 0) {
                                i25 = xVar13.E() - 1;
                                int a12 = bVar.a();
                                x xVar15 = xVar14;
                                String str7 = uVar6.s;
                                z14 = a12 == -1 && ("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && E2 == 0 && i23 == 0 && i24 == 0;
                                ArrayList arrayList8 = new ArrayList();
                                boolean z17 = xVar13 != null;
                                if (z14) {
                                    long[] jArr8 = z11 ? new long[0] : new long[b10];
                                    b bVar3 = bVar;
                                    int[] iArr5 = z11 ? new int[0] : new int[b10];
                                    long[] jArr9 = z11 ? new long[0] : new long[b10];
                                    int i55 = i24;
                                    int[] iArr6 = z11 ? new int[0] : new int[b10];
                                    arrayList2 = arrayList5;
                                    int i56 = i25;
                                    int i57 = E2;
                                    long j27 = j10;
                                    long j28 = j27;
                                    long j29 = j28;
                                    int i58 = 0;
                                    int i59 = 0;
                                    int i60 = 0;
                                    x xVar16 = xVar13;
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
                                        boolean z18 = true;
                                        while (i66 == 0) {
                                            z18 = aVar.a();
                                            if (!z18) {
                                                break;
                                            }
                                            int i67 = i65;
                                            long j30 = aVar.d;
                                            i66 = aVar.c;
                                            j29 = j30;
                                            i65 = i67;
                                            i63 = i63;
                                            b10 = b10;
                                        }
                                        int i68 = b10;
                                        i26 = i65;
                                        int i69 = i63;
                                        if (z18) {
                                            if (xVar15 != null) {
                                                while (i60 == 0 && i61 > 0) {
                                                    i60 = xVar15.E();
                                                    i59 = xVar15.m();
                                                    i61--;
                                                }
                                                i60--;
                                            }
                                            int c12 = bVar3.c();
                                            long j31 = c12;
                                            j28 += j31;
                                            if (c12 > i58) {
                                                i58 = c12;
                                            }
                                            if (z11) {
                                                iArr3 = iArr5;
                                            } else {
                                                jArr8[i62] = j29;
                                                iArr5[i62] = c12;
                                                iArr3 = iArr5;
                                                jArr9[i62] = j27 + i59;
                                                iArr6[i62] = xVar16 == null ? 1 : 0;
                                                if (i62 == i56) {
                                                    iArr6[i62] = 1;
                                                    arrayList8.add(Integer.valueOf(i62));
                                                }
                                            }
                                            if (xVar16 == null || i62 != i56) {
                                                i31 = i26;
                                                i32 = i69;
                                                i33 = i58;
                                                i34 = i56;
                                            } else {
                                                i31 = i26 - 1;
                                                if (i31 > 0) {
                                                    i56 = xVar16.E() - 1;
                                                }
                                                i34 = i56;
                                                i32 = i69;
                                                i33 = i58;
                                            }
                                            j27 += i32;
                                            i64--;
                                            if (i64 == 0 && i57 > 0) {
                                                i57--;
                                                i64 = xVar12.E();
                                                i32 = xVar12.m();
                                            }
                                            j29 += j31;
                                            i66--;
                                            i62++;
                                            i65 = i31;
                                            i63 = i32;
                                            iArr5 = iArr3;
                                            i56 = i34;
                                            i58 = i33;
                                            b10 = i68;
                                        } else {
                                            h2.a.l("BoxParsers", "Unexpected end of chunk data");
                                            if (z11) {
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
                                    j17 = j27 + i59;
                                    if (xVar15 != null) {
                                        while (i61 > 0) {
                                            if (xVar15.E() != 0) {
                                                z15 = false;
                                                break;
                                            }
                                            xVar15.m();
                                            i61--;
                                        }
                                    }
                                    z15 = true;
                                    if (i26 == 0 && i64 == 0 && i27 == 0 && i57 == 0 && i60 == 0 && z15) {
                                        i28 = i58;
                                        arrayList3 = arrayList8;
                                    } else {
                                        StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                        i28 = i58;
                                        boolean z19 = z15;
                                        arrayList3 = arrayList8;
                                        jg.g.x(sb3, rVar6.a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                        jg.g.x(sb3, i64, ", remainingSamplesInChunk ", i27, ", remainingTimestampDeltaChanges ");
                                        sb3.append(i57);
                                        sb3.append(", remainingSamplesAtTimestampOffset ");
                                        sb3.append(i60);
                                        sb3.append(!z19 ? ", ctts invalid" : "");
                                        h2.a.l("BoxParsers", sb3.toString());
                                    }
                                    i29 = b10;
                                    iArr2 = iArr6;
                                    i30 = i28;
                                    j18 = j28;
                                } else {
                                    int i70 = aVar.a;
                                    long[] jArr10 = new long[i70];
                                    int[] iArr7 = new int[i70];
                                    while (aVar.a()) {
                                        int i71 = aVar.b;
                                        jArr10[i71] = aVar.d;
                                        iArr7[i71] = aVar.c;
                                    }
                                    long j32 = E4;
                                    int i72 = TLObject.FLAG_13 / a12;
                                    int i73 = 0;
                                    for (int i74 = 0; i74 < i70; i74++) {
                                        i73 += m0.g(iArr7[i74], i72);
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
                                        long j33 = jArr10[i75];
                                        int i81 = i79;
                                        int i82 = i75;
                                        int i83 = i78;
                                        int i84 = i81;
                                        int i85 = i70;
                                        int i86 = i80;
                                        while (i86 > 0) {
                                            int min = Math.min(i72, i86);
                                            jArr3[i84] = j33;
                                            int i87 = i86;
                                            int i88 = a12 * min;
                                            iArr[i84] = i88;
                                            i83 = Math.max(i83, i88);
                                            long j34 = j32;
                                            jArr4[i84] = j34 * i76;
                                            iArr8[i84] = 1;
                                            j33 += iArr[i84];
                                            i76 += min;
                                            i84++;
                                            i77 += i88;
                                            i86 = i87 - min;
                                            j32 = j34;
                                        }
                                        int i89 = i82 + 1;
                                        i79 = i84;
                                        i78 = i83;
                                        i75 = i89;
                                        i70 = i85;
                                    }
                                    j17 = j32 * i76;
                                    j18 = i77;
                                    if (z11) {
                                        jArr3 = new long[0];
                                    }
                                    if (z11) {
                                        iArr = new int[0];
                                    }
                                    if (z11) {
                                        jArr4 = new long[0];
                                    }
                                    if (z11) {
                                        iArr8 = new int[0];
                                    }
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList8;
                                    i29 = i73;
                                    iArr2 = iArr8;
                                    i30 = i78;
                                }
                                long j35 = j17;
                                long[] jArr11 = jArr3;
                                int[] iArr9 = iArr;
                                j19 = rVar6.f;
                                if (j19 > j10) {
                                    long a04 = m0.a0(j18 * 8, 1000000L, j19, RoundingMode.HALF_DOWN);
                                    if (a04 > j10 && a04 < 2147483647L) {
                                        e2.t a13 = uVar6.a();
                                        a13.h = (int) a04;
                                        rVar6 = rVar6.a(new e2.u(a13));
                                    }
                                }
                                int i90 = rVar6.b;
                                long j36 = rVar6.c;
                                e2.u uVar7 = rVar6.g;
                                long[] jArr12 = rVar6.j;
                                jArr5 = rVar6.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long a05 = m0.a0(j35, 1000000L, j36, roundingMode);
                                int[] f10 = e1.f(arrayList3);
                                if (jArr5 != null) {
                                    if (!z11) {
                                        m0.Z(jArr4, j36);
                                    }
                                    uVar4 = new u(rVar6, jArr11, iArr9, i30, jArr4, iArr2, f10, z17, a05, i29);
                                } else {
                                    long[] jArr13 = jArr4;
                                    if (z11) {
                                        jArr12.getClass();
                                        if (jArr5.length == 1 && jArr5[0] == j10) {
                                            a03 = m0.a0(j35 - jArr12[0], 1000000L, rVar6.c, roundingMode);
                                        } else {
                                            long j37 = j10;
                                            for (int i91 = 0; i91 < jArr5.length; i91++) {
                                                if (jArr12[i91] != -1) {
                                                    j37 += jArr5[i91];
                                                }
                                            }
                                            a03 = m0.a0(j37, 1000000L, rVar6.d, RoundingMode.DOWN);
                                        }
                                        uVar4 = new u(rVar6, jArr11, iArr9, i30, jArr13, iArr2, f10, z17, a03, i29);
                                    } else {
                                        if (jArr5.length == 1 && i90 == 1 && jArr13.length >= 2) {
                                            jArr12.getClass();
                                            long j38 = jArr12[0];
                                            j21 = -1;
                                            long a06 = j38 + m0.a0(jArr5[0], rVar6.c, rVar6.d, roundingMode);
                                            int length = jArr13.length - 1;
                                            if (jArr13[0] <= j38 && j38 < jArr13[m0.i(4, 0, length)] && jArr13[m0.i(jArr13.length + (-4), 0, length)] < a06 && a06 <= 2 + j35) {
                                                long max = Math.max(j10, j35 - a06);
                                                j20 = j35;
                                                long a07 = m0.a0(j38 - jArr13[0], uVar7.L, rVar6.c, roundingMode);
                                                long a08 = m0.a0(max, uVar7.L, rVar6.c, roundingMode);
                                                if ((a07 != j10 || a08 != j10) && a07 <= 2147483647L && a08 <= 2147483647L) {
                                                    wVar.a = (int) a07;
                                                    wVar.b = (int) a08;
                                                    m0.Z(jArr13, j36);
                                                    uVar4 = new u(rVar6, jArr11, iArr9, i30, jArr13, iArr2, f10, z17, m0.a0(jArr5[0], 1000000L, rVar6.d, roundingMode), i29);
                                                }
                                            } else {
                                                j20 = j35;
                                            }
                                        } else {
                                            j20 = j35;
                                            j21 = -1;
                                        }
                                        int i92 = 1;
                                        if (jArr5.length == 1) {
                                            if (jArr5[0] == 0) {
                                                jArr12.getClass();
                                                long j39 = jArr12[0];
                                                for (int i93 = 0; i93 < jArr13.length; i93++) {
                                                    jArr13[i93] = m0.a0(jArr13[i93] - j39, 1000000L, rVar6.c, RoundingMode.DOWN);
                                                }
                                                uVar4 = new u(rVar6, jArr11, iArr9, i30, jArr13, iArr2, f10, z17, m0.a0(j20 - j39, 1000000L, rVar6.c, RoundingMode.DOWN), i29);
                                            } else {
                                                i92 = 1;
                                            }
                                        }
                                        int[] iArr10 = iArr2;
                                        int i94 = i29;
                                        boolean z20 = i90 == i92;
                                        int[] iArr11 = new int[jArr5.length];
                                        int[] iArr12 = new int[jArr5.length];
                                        jArr12.getClass();
                                        int i95 = 0;
                                        boolean z21 = false;
                                        int i96 = 0;
                                        int i97 = 0;
                                        while (i97 < jArr5.length) {
                                            int[] iArr13 = iArr11;
                                            long j40 = jArr12[i97];
                                            if (j40 != j21) {
                                                iArr4 = iArr12;
                                                boolean z22 = z21;
                                                long a09 = m0.a0(jArr5[i97], rVar6.c, rVar6.d, RoundingMode.DOWN) + j40;
                                                i35 = i97;
                                                iArr13[i35] = m0.f(jArr13, j40, true);
                                                int b11 = m0.b(jArr13, a09, z20);
                                                int i98 = b11 - 1;
                                                z16 = z20;
                                                int i99 = 0;
                                                while (b11 < jArr13.length) {
                                                    if (jArr13[b11] >= a09) {
                                                        i99++;
                                                        if (i99 > uVar7.u) {
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
                                                z21 = z22 | (i95 != i103);
                                                i96 = i104;
                                                i95 = i102;
                                            } else {
                                                z16 = z20;
                                                iArr4 = iArr12;
                                                i35 = i97;
                                            }
                                            i97 = i35 + 1;
                                            iArr11 = iArr13;
                                            iArr12 = iArr4;
                                            z20 = z16;
                                        }
                                        int[] iArr14 = iArr11;
                                        int[] iArr15 = iArr12;
                                        boolean z23 = z21 | (i96 != i94);
                                        long[] jArr14 = z23 ? new long[i96] : jArr11;
                                        int[] iArr16 = z23 ? new int[i96] : iArr9;
                                        int i105 = z23 ? 0 : i30;
                                        int[] iArr17 = z23 ? new int[i96] : iArr10;
                                        ArrayList arrayList9 = z23 ? new ArrayList() : arrayList3;
                                        long[] jArr15 = new long[i96];
                                        int i106 = i105;
                                        int i107 = 0;
                                        boolean z24 = false;
                                        int i108 = 0;
                                        long j41 = 0;
                                        while (i108 < jArr5.length) {
                                            long j42 = jArr12[i108];
                                            int i109 = iArr14[i108];
                                            long[] jArr16 = jArr5;
                                            int i110 = iArr15[i108];
                                            long[] jArr17 = jArr15;
                                            if (z23) {
                                                int i111 = i110 - i109;
                                                System.arraycopy(jArr11, i109, jArr14, i107, i111);
                                                System.arraycopy(iArr9, i109, iArr16, i107, i111);
                                                System.arraycopy(iArr10, i109, iArr17, i107, i111);
                                            }
                                            while (i109 < i110) {
                                                int i112 = i107;
                                                int i113 = i109;
                                                long j43 = rVar6.d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long a010 = m0.a0(j41, 1000000L, j43, roundingMode2);
                                                long a011 = m0.a0(jArr13[i113] - j42, 1000000L, rVar6.c, roundingMode2);
                                                if (a011 < 0) {
                                                    z24 = true;
                                                }
                                                jArr17[i112] = a010 + a011;
                                                if (z23 && iArr16[i112] > i106) {
                                                    i106 = iArr9[i113];
                                                }
                                                if (z23 && !z17 && (iArr17[i112] & 1) != 0) {
                                                    arrayList9.add(Integer.valueOf(i112));
                                                }
                                                i107 = i112 + 1;
                                                i109 = i113 + 1;
                                            }
                                            j41 += jArr16[i108];
                                            i108++;
                                            i107 = i107;
                                            jArr5 = jArr16;
                                            jArr15 = jArr17;
                                        }
                                        long[] jArr18 = jArr15;
                                        long a012 = m0.a0(j41, 1000000L, rVar6.d, RoundingMode.DOWN);
                                        if (z24) {
                                            e2.t a14 = uVar7.a();
                                            a14.x = true;
                                            rVar6 = rVar6.a(new e2.u(a14));
                                        }
                                        uVar3 = new u(rVar6, jArr14, iArr16, i106, jArr18, iArr17, e1.f(arrayList9), z17, a012, jArr14.length);
                                        arrayList4 = arrayList2;
                                        arrayList4.add(uVar3);
                                        i37 = i7 + 1;
                                        cVar2 = cVar;
                                        arrayList5 = arrayList4;
                                    }
                                }
                                uVar3 = uVar4;
                                arrayList4 = arrayList2;
                            } else {
                                xVar13 = null;
                            }
                        } else {
                            i24 = 0;
                        }
                        i25 = -1;
                        int a122 = bVar.a();
                        x xVar152 = xVar14;
                        String str72 = uVar6.s;
                        if (a122 == -1) {
                        }
                        ArrayList arrayList82 = new ArrayList();
                        if (xVar13 != null) {
                        }
                        if (z14) {
                        }
                        long j352 = j17;
                        long[] jArr112 = jArr3;
                        int[] iArr92 = iArr;
                        j19 = rVar6.f;
                        if (j19 > j10) {
                        }
                        int i902 = rVar6.b;
                        long j362 = rVar6.c;
                        e2.u uVar72 = rVar6.g;
                        long[] jArr122 = rVar6.j;
                        jArr5 = rVar6.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long a052 = m0.a0(j352, 1000000L, j362, roundingMode3);
                        int[] f102 = e1.f(arrayList3);
                        if (jArr5 != null) {
                        }
                        uVar3 = uVar4;
                        arrayList4 = arrayList2;
                    }
                    arrayList4.add(uVar3);
                    i37 = i7 + 1;
                    cVar2 = cVar;
                    arrayList5 = arrayList4;
                }
            }
            i37 = i7 + 1;
            cVar2 = cVar;
            arrayList5 = arrayList4;
        }
        return arrayList5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        r1.N(r9);
        r1.O(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
    
        r9 = new t3.k(r0, r8, r1.w(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024c, code lost:
    
        h2.a.b("MetadataUtil", "Skipped unknown metadata entry: " + dd.k.a(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
    
        r1.N(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0077, code lost:
    
        r0 = t3.j.a(z3.q.g(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0080, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        r9 = new t3.n("TCON", r12, h9.i0.u(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008c, code lost:
    
        h2.a.l("MetadataUtil", "Failed to parse standard genre code");
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
    
        r9 = z3.q.d(r13, r1);
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
    
        r9 = z3.q.k(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ee, code lost:
    
        if (r0 != 4280916) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f0, code lost:
    
        r9 = z3.q.k(r13, r1, "TPE1");
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
    
        r9 = z3.q.k(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0206, code lost:
    
        if (r0 != 6384738) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0208, code lost:
    
        r9 = z3.q.k(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0212, code lost:
    
        if (r0 != 7108978) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0214, code lost:
    
        r9 = z3.q.k(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x021e, code lost:
    
        if (r0 != 6776174) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0220, code lost:
    
        r9 = z3.q.k(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0228, code lost:
    
        if (r0 != 6779504) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022a, code lost:
    
        r9 = z3.q.k(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0234, code lost:
    
        if (r0 != 7173742) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0236, code lost:
    
        r9 = z3.q.k(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0241, code lost:
    
        if (r0 != 7173737) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0243, code lost:
    
        r9 = z3.q.h(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0264, code lost:
    
        r9 = z3.q.k(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x026c, code lost:
    
        r9 = z3.q.k(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0287, code lost:
    
        if (r6.isEmpty() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x028b, code lost:
    
        r12 = new e2.q0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.m() + r13;
        r13 = r1.m();
        r0 = (r13 >> 24) & org.telegram.messenger.qs.e4;
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
    
        r9 = z3.q.f(r13, r1, "TPOS");
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
    
        r9 = z3.q.f(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r9 = z3.q.h(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r9 = z3.q.h(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r9 = z3.q.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        r9 = z3.q.k(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        r9 = z3.q.k(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        r9 = z3.q.k(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r9 = z3.q.k(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        r9 = z3.q.k(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        r9 = z3.q.k(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        r9 = z3.q.h(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r9 = z3.q.h(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r9 = z3.q.k(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r9 = z3.q.k(r13, r1, "TVSHOW");
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
    public static q0 j(i2.d dVar) {
        int i7;
        boolean z9;
        q0 q0Var;
        q0 q0Var2;
        int i10;
        x xVar = dVar.c;
        int i11 = 8;
        xVar.N(8);
        boolean z10 = false;
        q0 q0Var3 = new q0(new p0[0]);
        while (xVar.a() >= i11) {
            int i12 = xVar.b;
            int m10 = xVar.m();
            int m11 = xVar.m();
            String str = null;
            if (m11 == 1835365473) {
                xVar.N(i12);
                int i13 = i12 + m10;
                xVar.O(i11);
                a(xVar);
                while (true) {
                    int i14 = xVar.b;
                    if (i14 >= i13) {
                        break;
                    }
                    int m12 = xVar.m();
                    if (xVar.m() == 1768715124) {
                        break;
                    }
                    xVar.N(i14 + m12);
                    i11 = 8;
                    z10 = false;
                    str = null;
                }
                q0 q0Var4 = null;
                q0Var3 = q0Var3.b(q0Var4);
                i7 = 8;
            } else if (m11 == 1936553057) {
                xVar.N(i12);
                int i15 = i12 + m10;
                xVar.O(12);
                while (true) {
                    int i16 = xVar.b;
                    if (i16 >= i15) {
                        i7 = 8;
                        break;
                    }
                    int m13 = xVar.m();
                    if (xVar.m() != 1935766900) {
                        xVar.N(i16 + m13);
                    } else if (m13 < 16) {
                        q0Var2 = null;
                        i7 = 8;
                    } else {
                        xVar.O(4);
                        int i17 = -1;
                        int i18 = 0;
                        for (int i19 = 0; i19 < 2; i19++) {
                            int A = xVar.A();
                            int A2 = xVar.A();
                            if (A == 0) {
                                i17 = A2;
                            } else if (A == 1) {
                                i18 = A2;
                            }
                        }
                        if (i17 == 12) {
                            i10 = qs.P3;
                        } else if (i17 == 13) {
                            i10 = 120;
                        } else if (i17 != 21) {
                            i10 = -2147483647;
                        } else {
                            i7 = 8;
                            if (xVar.a() >= 8 && xVar.b + 8 <= i15) {
                                int m14 = xVar.m();
                                int m15 = xVar.m();
                                if (m14 >= 12 && m15 == 1936877170) {
                                    i10 = xVar.B();
                                    if (i10 != -2147483647) {
                                        q0Var2 = new q0(new u3.c(i10, i18));
                                    }
                                }
                            }
                            i10 = -2147483647;
                            if (i10 != -2147483647) {
                            }
                        }
                        i7 = 8;
                        if (i10 != -2147483647) {
                        }
                    }
                }
                q0Var2 = null;
                q0Var3 = q0Var3.b(q0Var2);
            } else {
                i7 = 8;
                if (m11 == -1451722374) {
                    short x10 = xVar.x();
                    xVar.O(2);
                    String y10 = xVar.y(x10, StandardCharsets.UTF_8);
                    int max = Math.max(y10.lastIndexOf(43), y10.lastIndexOf(45));
                    try {
                        try {
                            i2.e eVar = new i2.e(Float.parseFloat(y10.substring(0, max)), Float.parseFloat(y10.substring(max, y10.length() - 1)));
                            p0[] p0VarArr = new p0[1];
                            z9 = false;
                            try {
                                p0VarArr[0] = eVar;
                                q0Var = new q0(p0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                q0Var = null;
                                q0Var3 = q0Var3.b(q0Var);
                                xVar.N(i12 + m10);
                                i11 = i7;
                                z10 = z9;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z9 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z9 = false;
                    }
                    q0Var3 = q0Var3.b(q0Var);
                    xVar.N(i12 + m10);
                    i11 = i7;
                    z10 = z9;
                }
            }
            z9 = false;
            xVar.N(i12 + m10);
            i11 = i7;
            z10 = z9;
        }
        return q0Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0b35, code lost:
    
        if (r10 == null) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0b37, code lost:
    
        r0 = r10.a;
        r1 = "video/dolby-vision";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0b40, code lost:
    
        if (r1 != null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b42, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0b43, code lost:
    
        r2 = new e2.t();
        r2.a = java.lang.Integer.toString(r62);
        r2.r = e2.s0.n(r1);
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
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0b86, code lost:
    
        if (r16 == null) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0b88, code lost:
    
        r29 = r16.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0b91, code lost:
    
        r2.H = new e2.m(r8, r30, r9, r29, r31, r32);
        r10 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0ba6, code lost:
    
        if (r10 == null) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0ba8, code lost:
    
        r2.h = c8.e1.e(r10.a);
        r2.i = c8.e1.e(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0bcd, code lost:
    
        r66.d = new e2.u(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0bd4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0bb9, code lost:
    
        r10 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0bbb, code lost:
    
        if (r10 == null) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0bbd, code lost:
    
        r2.h = c8.e1.e(r10.a);
        r2.i = c8.e1.e(r10.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0b8f, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0b3c, code lost:
    
        r0 = r18;
        r1 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0978, code lost:
    
        if (r1 != 3) goto L424;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(x xVar, int i7, int i10, int i11, int i12, String str, int i13, e2.r rVar, j0 j0Var, int i14) {
        int i15;
        int i16;
        float f10;
        int i17;
        int i18;
        int i19;
        int i20;
        String str2;
        int i21;
        e2.r rVar2;
        int i22;
        c0 c0Var;
        int i23;
        String str3;
        int i24;
        e2.r rVar3;
        int i25;
        int i26;
        float f11;
        ui.e eVar;
        String str4;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int j3;
        int i35;
        int i36;
        int i37;
        int i38;
        e2.m mVar;
        e2.m mVar2;
        i6 i6Var;
        int i39;
        int i40;
        String str5;
        int i41;
        rt rtVar;
        String str6;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46 = i10;
        int i47 = i11;
        e2.r rVar4 = rVar;
        xVar.N(i46 + 16);
        xVar.O(16);
        int H = xVar.H();
        int H2 = xVar.H();
        xVar.O(50);
        int i48 = xVar.b;
        int i49 = i7;
        if (i49 == 1701733238) {
            Pair h = h(xVar, i46, i47);
            if (h != null) {
                i49 = ((Integer) h.first).intValue();
                rVar4 = rVar4 == null ? null : rVar4.a(((s) h.second).b);
                ((s[]) j0Var.c)[i14] = (s) h.second;
            }
            xVar.N(i48);
        }
        String str7 = "video/3gpp";
        String str8 = i49 == 1831958048 ? "video/mpeg" : i49 == 1211250227 ? "video/3gpp" : (i49 == 1634743416 || i49 == 1634743400 || i49 == 1634755432 || i49 == 1634755438 || i49 == 1634755443 || i49 == 1634755439) ? "video/prores" : null;
        float f12 = 1.0f;
        int i50 = 8;
        List list = null;
        ByteBuffer byteBuffer = null;
        c0 c0Var2 = null;
        String str9 = null;
        byte[] bArr = null;
        int i51 = -1;
        int i52 = -1;
        int i53 = -1;
        int i54 = -1;
        int i55 = -1;
        boolean z9 = false;
        int i56 = -1;
        int i57 = -1;
        int i58 = -1;
        int i59 = 8;
        int i60 = 8;
        d3.x xVar2 = null;
        a4.c cVar = null;
        ui.e eVar2 = null;
        while (true) {
            if (i48 - i46 >= i47) {
                i15 = H;
                i16 = H2;
                f10 = f12;
                i17 = i56;
                i18 = i57;
                i19 = i59;
                i20 = i60;
                str2 = str8;
                i21 = i58;
                rVar2 = rVar4;
                i22 = i51;
                c0Var = c0Var2;
                break;
            }
            xVar.N(i48);
            int i61 = xVar.b;
            int m10 = xVar.m();
            if (m10 == 0 && xVar.b - i46 == i47) {
                i15 = H;
                i16 = H2;
                f10 = f12;
                c0Var = c0Var2;
                i17 = i56;
                i18 = i57;
                i19 = i59;
                i20 = i60;
                str2 = str8;
                i21 = i58;
                rVar2 = rVar4;
                i22 = i51;
                break;
            }
            String str10 = "childAtomSize must be positive";
            f3.b.b("childAtomSize must be positive", m10 > 0);
            int m11 = xVar.m();
            if (m11 == 1635148611) {
                f3.b.b(null, str8 == null);
                xVar.N(i61 + 8);
                f3.d a10 = f3.d.a(xVar);
                list = a10.a;
                j0Var.a = a10.b;
                if (!z9) {
                    f12 = a10.k;
                }
                String str11 = a10.l;
                int i62 = a10.j;
                int i63 = a10.g;
                int i64 = a10.h;
                str9 = str11;
                int i65 = a10.i;
                i59 = a10.e;
                rVar3 = rVar4;
                i25 = H;
                i26 = H2;
                i23 = i48;
                i56 = i63;
                i27 = i49;
                str3 = str7;
                i57 = i64;
                f11 = f12;
                i24 = i65;
                i29 = i50;
                i30 = a10.f;
                i52 = i62;
                str8 = "video/avc";
            } else {
                i23 = i48;
                if (m11 == 1752589123) {
                    f3.b.b(null, str8 == null);
                    xVar.N(i61 + 8);
                    f3.x a11 = f3.x.a(xVar, false, null);
                    List list2 = a11.a;
                    j0Var.a = a11.b;
                    if (!z9) {
                        f12 = a11.l;
                    }
                    int i66 = a11.m;
                    int i67 = a11.c;
                    String str12 = a11.n;
                    int i68 = a11.k;
                    if (i68 != -1) {
                        i51 = i68;
                    }
                    int i69 = a11.d;
                    int i70 = a11.e;
                    int i71 = a11.h;
                    int i72 = a11.i;
                    int i73 = a11.j;
                    int i74 = a11.f;
                    int i75 = a11.g;
                    rVar3 = rVar4;
                    eVar2 = a11.o;
                    i25 = H;
                    i26 = H2;
                    i27 = i49;
                    str3 = str7;
                    f11 = f12;
                    list = list2;
                    i56 = i71;
                    i57 = i72;
                    i24 = i73;
                    i59 = i74;
                    i29 = i50;
                    i53 = i67;
                    str9 = str12;
                    i55 = i70;
                    i54 = i69;
                    i30 = i75;
                    i52 = i66;
                    str8 = "video/hevc";
                } else {
                    str3 = str7;
                    if (m11 == 1818785347) {
                        f3.b.b("lhvC must follow hvcC atom", "video/hevc".equals(str8));
                        ui.e eVar3 = eVar2;
                        f3.b.b("must have at least two layers", eVar3 != null && ((i0) eVar3.b).size() >= 2);
                        xVar.N(i61 + 8);
                        eVar3.getClass();
                        f3.x a12 = f3.x.a(xVar, true, eVar3);
                        f3.b.b("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", j0Var.a == a12.b);
                        int i76 = a12.h;
                        int i77 = i56;
                        if (i76 != -1) {
                            f3.b.b("colorSpace must be the same for both views", i77 == i76);
                        }
                        int i78 = a12.i;
                        int i79 = i57;
                        if (i78 != -1) {
                            f3.b.b("colorRange must be the same for both views", i79 == i78);
                        }
                        int i80 = a12.j;
                        if (i80 != -1) {
                            i45 = i58;
                            f3.b.b("colorTransfer must be the same for both views", i45 == i80);
                        } else {
                            i45 = i58;
                        }
                        int i81 = i59;
                        int i82 = i45;
                        f3.b.b("bitdepthLuma must be the same for both views", i81 == a12.f);
                        int i83 = i60;
                        f3.b.b("bitdepthChroma must be the same for both views", i83 == a12.g);
                        if (list != null) {
                            f0 p10 = i0.p();
                            p10.d(list);
                            p10.d(a12.a);
                            list = p10.f();
                        } else {
                            f3.b.b("initializationData must be already set from hvcC atom", false);
                        }
                        eVar2 = eVar3;
                        rVar3 = rVar4;
                        i25 = H;
                        i26 = H2;
                        str8 = "video/mv-hevc";
                        i56 = i77;
                        i27 = i49;
                        i57 = i79;
                        i59 = i81;
                        f11 = f12;
                        i24 = i82;
                        i30 = i83;
                        i29 = i50;
                        str9 = a12.n;
                    } else {
                        int i84 = i56;
                        int i85 = i57;
                        i24 = i58;
                        int i86 = i59;
                        int i87 = i60;
                        ui.e eVar4 = eVar2;
                        int i88 = 7;
                        int i89 = 4;
                        if (m11 == 1987470147) {
                            f3.b.b(null, str8 == null);
                            xVar.N(i61 + 8);
                            try {
                                if (xVar.m() != 0) {
                                    throw t0.a(null, "Unsupported VVC version");
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
                                    int i91 = (A4 >> 1) & qs.L1;
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
                                rVar3 = rVar4;
                                f11 = f12;
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
                                i26 = H2;
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
                                        System.arraycopy(i2.o.a, 0, bArr2, i106, i89);
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
                                i25 = H;
                                Locale locale = Locale.US;
                                String str13 = "vvc1." + i42 + "." + str6 + i44;
                                t1 u10 = i0.u(bArr2);
                                i59 = i95 + 8;
                                j0Var.a = i90;
                                i29 = i50;
                                str9 = str13;
                                eVar2 = eVar4;
                                str8 = "video/vvc";
                                i56 = i84;
                                i27 = i49;
                                i57 = i85;
                                i30 = i59;
                                i52 = 16;
                                list = u10;
                            } catch (ArrayIndexOutOfBoundsException e10) {
                                throw t0.a(e10, "Error parsing VVC configuration");
                            }
                        } else {
                            rVar3 = rVar4;
                            i25 = H;
                            i26 = H2;
                            f11 = f12;
                            if (m11 == 1986361461) {
                                xVar.N(i61 + 8);
                                int i110 = xVar.b;
                                rt rtVar2 = null;
                                while (i110 - i61 < m10) {
                                    xVar.N(i110);
                                    int m12 = xVar.m();
                                    f3.b.b(str10, m12 > 0);
                                    if (xVar.m() == 1702454643) {
                                        xVar.N(i110 + 8);
                                        int i111 = xVar.b;
                                        while (true) {
                                            if (i111 - i110 >= m12) {
                                                str5 = str10;
                                                i41 = i110;
                                                rtVar = null;
                                                break;
                                            }
                                            xVar.N(i111);
                                            int m13 = xVar.m();
                                            f3.b.b(str10, m13 > 0);
                                            if (xVar.m() == 1937011305) {
                                                xVar.O(4);
                                                int A9 = xVar.A();
                                                str5 = str10;
                                                i41 = i110;
                                                rtVar = new rt(new ia.a((A9 & 1) == 1, (A9 & 2) == 2, (A9 & 8) == i50), 28);
                                            } else {
                                                i111 += m13;
                                                i50 = 8;
                                            }
                                        }
                                        rtVar2 = rtVar;
                                    } else {
                                        str5 = str10;
                                        i41 = i110;
                                    }
                                    i110 = i41 + m12;
                                    str10 = str5;
                                    i50 = 8;
                                }
                                if (rtVar2 == null) {
                                    i6Var = null;
                                    i39 = 2;
                                } else {
                                    i39 = 2;
                                    i6Var = new i6(rtVar2, 2);
                                }
                                if (i6Var != null) {
                                    ia.a aVar = (ia.a) ((rt) i6Var.b).b;
                                    if (eVar4 == null || ((i0) eVar4.b).size() < i39) {
                                        i40 = i51;
                                        if (i40 == -1) {
                                            i51 = aVar.c ? 5 : 4;
                                            eVar2 = eVar4;
                                        }
                                        i51 = i40;
                                        eVar2 = eVar4;
                                    } else {
                                        f3.b.b("both eye views must be marked as available", aVar.a && aVar.b);
                                        f3.b.b("for MV-HEVC, eye_views_reversed must be set to false", !aVar.c);
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
                                    i27 = i49;
                                    i28 = i24;
                                    i29 = 8;
                                    c0Var2 = c0.a(xVar);
                                } else {
                                    int i113 = 11;
                                    if (m11 == 1987076931) {
                                        f3.b.b(null, str8 == null);
                                        String str14 = i49 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        xVar.N(i61 + 12);
                                        byte A10 = (byte) xVar.A();
                                        byte A11 = (byte) xVar.A();
                                        int A12 = xVar.A();
                                        i30 = A12 >> 4;
                                        byte b10 = (byte) ((A12 >> 1) & 7);
                                        if (str14.equals("video/x-vnd.on2.vp9")) {
                                            byte[] bArr3 = h2.g.a;
                                            list = i0.u(new byte[]{1, 1, A10, 2, 1, A11, 3, 1, (byte) i30, 4, 1, b10});
                                        }
                                        boolean z10 = (A12 & 1) != 0;
                                        int A13 = xVar.A();
                                        int A14 = xVar.A();
                                        i56 = e2.m.f(A13);
                                        i57 = z10 ? 1 : 2;
                                        str8 = str14;
                                        eVar2 = eVar4;
                                        i51 = i112;
                                        i24 = e2.m.g(A14);
                                        i27 = i49;
                                        i59 = i30;
                                        i29 = 8;
                                    } else if (m11 == 1635135811) {
                                        int i114 = m10 - 8;
                                        byte[] bArr4 = new byte[i114];
                                        xVar.k(0, i114, bArr4);
                                        list = i0.u(bArr4);
                                        xVar.N(i61 + 8);
                                        byte[] bArr5 = xVar.a;
                                        d4.f fVar = new d4.f(bArr5, bArr5.length);
                                        fVar.J(xVar.b * 8);
                                        fVar.M(1);
                                        int j10 = fVar.j(3);
                                        fVar.L(6);
                                        boolean i115 = fVar.i();
                                        boolean i116 = fVar.i();
                                        int i117 = -1;
                                        if (j10 == 2 && i115) {
                                            i31 = i116 ? 12 : 10;
                                            i32 = i116 ? 12 : 10;
                                        } else if (j10 <= 2) {
                                            int i118 = i115 ? 10 : 8;
                                            i32 = i115 ? 10 : 8;
                                            i31 = i118;
                                        } else {
                                            i31 = -1;
                                            i32 = -1;
                                        }
                                        fVar.L(13);
                                        fVar.K();
                                        int j11 = fVar.j(4);
                                        if (j11 != 1) {
                                            h2.a.g("BoxParsers", "Unsupported obu_type: " + j11);
                                            mVar2 = new e2.m(-1, -1, -1, null, i31, i32);
                                        } else if (fVar.i()) {
                                            h2.a.g("BoxParsers", "Unsupported obu_extension_flag");
                                            mVar2 = new e2.m(-1, -1, -1, null, i31, i32);
                                        } else {
                                            boolean i119 = fVar.i();
                                            fVar.K();
                                            if (!i119 || fVar.j(8) <= 127) {
                                                int j12 = fVar.j(3);
                                                fVar.K();
                                                if (fVar.i()) {
                                                    h2.a.g("BoxParsers", "Unsupported reduced_still_picture_header");
                                                    mVar2 = new e2.m(-1, -1, -1, null, i31, i32);
                                                } else if (fVar.i()) {
                                                    h2.a.g("BoxParsers", "Unsupported timing_info_present_flag");
                                                    mVar2 = new e2.m(-1, -1, -1, null, i31, i32);
                                                } else if (fVar.i()) {
                                                    h2.a.g("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                    mVar2 = new e2.m(-1, -1, -1, null, i31, i32);
                                                } else {
                                                    int i120 = 5;
                                                    int j13 = fVar.j(5);
                                                    int i121 = 0;
                                                    while (i121 <= j13) {
                                                        fVar.L(12);
                                                        if (fVar.j(i120) > i88) {
                                                            fVar.K();
                                                        }
                                                        i121++;
                                                        i120 = 5;
                                                        i88 = 7;
                                                    }
                                                    int j14 = fVar.j(4);
                                                    int j15 = fVar.j(4);
                                                    fVar.L(j14 + 1);
                                                    fVar.L(j15 + 1);
                                                    if (fVar.i()) {
                                                        i33 = 7;
                                                        fVar.L(7);
                                                    } else {
                                                        i33 = 7;
                                                    }
                                                    fVar.L(i33);
                                                    boolean i122 = fVar.i();
                                                    if (i122) {
                                                        fVar.L(2);
                                                    }
                                                    if (fVar.i()) {
                                                        j3 = 2;
                                                        i34 = 1;
                                                    } else {
                                                        i34 = 1;
                                                        j3 = fVar.j(1);
                                                    }
                                                    if (j3 > 0 && !fVar.i()) {
                                                        fVar.L(i34);
                                                    }
                                                    if (i122) {
                                                        i35 = 3;
                                                        fVar.L(3);
                                                    } else {
                                                        i35 = 3;
                                                    }
                                                    fVar.L(i35);
                                                    boolean i123 = fVar.i();
                                                    if (j12 == 2 && i123) {
                                                        fVar.K();
                                                    }
                                                    boolean z11 = j12 != 1 && fVar.i();
                                                    if (fVar.i()) {
                                                        int j16 = fVar.j(8);
                                                        int j17 = fVar.j(8);
                                                        int j18 = (!z11 && j16 == 1 && j17 == 13 && fVar.j(8) == 0) ? 1 : fVar.j(1);
                                                        int f13 = e2.m.f(j16);
                                                        int i124 = j18 == 1 ? 1 : 2;
                                                        i36 = f13;
                                                        i37 = i31;
                                                        i38 = e2.m.g(j17);
                                                        i117 = i124;
                                                    } else {
                                                        i36 = -1;
                                                        i37 = i31;
                                                        i38 = -1;
                                                    }
                                                    mVar = new e2.m(i36, i117, i38, null, i37, i32);
                                                    int i125 = mVar.e;
                                                    int i126 = mVar.f;
                                                    int i127 = mVar.a;
                                                    int i128 = mVar.b;
                                                    i24 = mVar.c;
                                                    eVar2 = eVar4;
                                                    i51 = i112;
                                                    i59 = i125;
                                                    i30 = i126;
                                                    i56 = i127;
                                                    i57 = i128;
                                                    i27 = i49;
                                                    i29 = 8;
                                                    str8 = "video/av01";
                                                }
                                            } else {
                                                h2.a.g("BoxParsers", "Excessive obu_size");
                                                mVar2 = new e2.m(-1, -1, -1, null, i31, i32);
                                            }
                                        }
                                        mVar = mVar2;
                                        int i1252 = mVar.e;
                                        int i1262 = mVar.f;
                                        int i1272 = mVar.a;
                                        int i1282 = mVar.b;
                                        i24 = mVar.c;
                                        eVar2 = eVar4;
                                        i51 = i112;
                                        i59 = i1252;
                                        i30 = i1262;
                                        i56 = i1272;
                                        i57 = i1282;
                                        i27 = i49;
                                        i29 = 8;
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
                                            i27 = i49;
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
                                            i27 = i49;
                                            if (m11 == 1681012275) {
                                                f3.b.b(null, str4 == null);
                                                eVar2 = eVar;
                                                str8 = str3;
                                            } else if (m11 == 1702061171) {
                                                f3.b.b(null, str4 == null);
                                                a4.c c10 = c(i61, xVar);
                                                String str15 = (String) c10.c;
                                                byte[] bArr6 = (byte[]) c10.d;
                                                if (bArr6 != null) {
                                                    list = i0.u(bArr6);
                                                }
                                                cVar = c10;
                                                str8 = str15;
                                                eVar2 = eVar;
                                            } else if (m11 == 1651798644) {
                                                xVar.N(i61 + 8);
                                                xVar.O(4);
                                                xVar2 = new d3.x(xVar.C(), xVar.C());
                                            } else if (m11 == 1885434736) {
                                                xVar.N(i61 + 8);
                                                f11 = xVar.E() / xVar.E();
                                                eVar2 = eVar;
                                                i57 = i85;
                                                i30 = i87;
                                                str8 = str4;
                                                i29 = 8;
                                                z9 = true;
                                                i51 = i112;
                                                i56 = i84;
                                                i59 = i86;
                                            } else if (m11 == 1937126244) {
                                                int i129 = i61 + 8;
                                                while (true) {
                                                    if (i129 - i61 >= m10) {
                                                        bArr = null;
                                                        break;
                                                    }
                                                    xVar.N(i129);
                                                    int m14 = xVar.m();
                                                    if (xVar.m() == 1886547818) {
                                                        bArr = Arrays.copyOfRange(xVar.a, i129, m14 + i129);
                                                        break;
                                                    }
                                                    i129 += m14;
                                                }
                                            } else if (m11 == 1936995172) {
                                                int A15 = xVar.A();
                                                int i130 = 3;
                                                xVar.O(3);
                                                if (A15 == 0) {
                                                    int A16 = xVar.A();
                                                    if (A16 == 0) {
                                                        i130 = 0;
                                                    } else if (A16 == 1) {
                                                        i130 = 1;
                                                    } else if (A16 == 2) {
                                                        i130 = 2;
                                                    }
                                                    eVar2 = eVar;
                                                    i57 = i85;
                                                    i30 = i87;
                                                    str8 = str4;
                                                    i29 = 8;
                                                    i51 = i130;
                                                    i56 = i84;
                                                    i59 = i86;
                                                }
                                                i130 = i112;
                                                eVar2 = eVar;
                                                i57 = i85;
                                                i30 = i87;
                                                str8 = str4;
                                                i29 = 8;
                                                i51 = i130;
                                                i56 = i84;
                                                i59 = i86;
                                            } else if (m11 == 1634760259) {
                                                int i131 = m10 - 12;
                                                byte[] bArr7 = new byte[i131];
                                                xVar.N(i61 + 12);
                                                int i132 = 0;
                                                xVar.k(0, i131, bArr7);
                                                byte[] bArr8 = h2.g.a;
                                                ia.c(i131, "Invalid APV CSD length: %s", i131 >= 17);
                                                byte b11 = bArr7[0];
                                                ia.c(b11, "Invalid APV CSD version: %s", b11 == 1);
                                                int i133 = bArr7[5] & 255;
                                                int i134 = bArr7[6] & 255;
                                                int i135 = bArr7[7] & 255;
                                                String str16 = m0.a;
                                                Locale locale2 = Locale.US;
                                                StringBuilder o4 = jg.g.o("apv1.apvf", i133, ".apvl", i134, ".apvb");
                                                o4.append(i135);
                                                str9 = o4.toString();
                                                t1 u11 = i0.u(bArr7);
                                                x xVar3 = new x(bArr7);
                                                d4.f fVar2 = new d4.f(bArr7, i131);
                                                i29 = 8;
                                                fVar2.J(xVar3.b * 8);
                                                fVar2.M(1);
                                                int j19 = fVar2.j(8);
                                                int i136 = 0;
                                                int i137 = -1;
                                                int i138 = -1;
                                                i30 = -1;
                                                i56 = -1;
                                                i59 = -1;
                                                while (i136 < j19) {
                                                    fVar2.M(1);
                                                    int j20 = fVar2.j(8);
                                                    int i139 = i30;
                                                    int i140 = i138;
                                                    int i141 = i137;
                                                    int i142 = i132;
                                                    while (i142 < j20) {
                                                        fVar2.L(6);
                                                        boolean i143 = fVar2.i();
                                                        fVar2.K();
                                                        fVar2.M(i113);
                                                        fVar2.L(4);
                                                        i59 = fVar2.j(4) + 8;
                                                        fVar2.M(1);
                                                        if (i143) {
                                                            int j21 = fVar2.j(8);
                                                            int j22 = fVar2.j(8);
                                                            fVar2.M(1);
                                                            boolean i144 = fVar2.i();
                                                            int f14 = e2.m.f(j21);
                                                            int i145 = i144 ? 1 : 2;
                                                            i140 = e2.m.g(j22);
                                                            i56 = f14;
                                                            i141 = i145;
                                                        }
                                                        i142++;
                                                        i139 = i59;
                                                        i113 = 11;
                                                    }
                                                    i136++;
                                                    i137 = i141;
                                                    i138 = i140;
                                                    i30 = i139;
                                                    i113 = 11;
                                                    i132 = 0;
                                                }
                                                str8 = "video/apv";
                                                list = u11;
                                                i57 = i137;
                                                i24 = i138;
                                                eVar2 = eVar;
                                                i51 = i112;
                                            } else {
                                                i29 = 8;
                                                if (m11 == 1668246642) {
                                                    i28 = i24;
                                                    if (i84 == -1 && i28 == -1) {
                                                        int m15 = xVar.m();
                                                        if (m15 == 1852009592 || m15 == 1852009571) {
                                                            int H7 = xVar.H();
                                                            int H8 = xVar.H();
                                                            xVar.O(2);
                                                            boolean z12 = m10 == 19 && (xVar.A() & 128) != 0;
                                                            int f15 = e2.m.f(H7);
                                                            i57 = z12 ? 1 : 2;
                                                            i24 = e2.m.g(H8);
                                                            eVar2 = eVar;
                                                            i30 = i87;
                                                            str8 = str4;
                                                            i56 = f15;
                                                            i51 = i112;
                                                            i59 = i86;
                                                        } else {
                                                            h2.a.l("BoxParsers", "Unsupported color type: " + dd.k.a(m15));
                                                        }
                                                    }
                                                } else {
                                                    i28 = i24;
                                                }
                                            }
                                            i57 = i85;
                                            i59 = i86;
                                            i30 = i87;
                                            i29 = 8;
                                            i51 = i112;
                                            i56 = i84;
                                        }
                                        eVar2 = eVar;
                                        i57 = i85;
                                        i30 = i87;
                                        str8 = str4;
                                        i29 = 8;
                                        i51 = i112;
                                        i56 = i84;
                                        i59 = i86;
                                    }
                                }
                                i24 = i28;
                                eVar2 = eVar;
                                i57 = i85;
                                i30 = i87;
                                str8 = str4;
                                i51 = i112;
                                i56 = i84;
                                i59 = i86;
                            }
                            i27 = i49;
                            i57 = i85;
                            i59 = i86;
                            i30 = i87;
                            i29 = 8;
                            i56 = i84;
                        }
                    }
                }
            }
            i48 = i23 + m10;
            i46 = i10;
            i47 = i11;
            i50 = i29;
            str7 = str3;
            rVar4 = rVar3;
            i49 = i27;
            i58 = i24;
            f12 = f11;
            H2 = i26;
            H = i25;
            i60 = i30;
        }
    }
}
