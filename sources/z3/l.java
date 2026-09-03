package z3;

import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.jb;
import r3.s;
import r3.t;
import r3.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l implements r3.k, s {
    public int i;
    public long j;
    public int k;
    public w l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final n f = new n();
    public final ArrayList g = new ArrayList();
    public final w d = new w(16);
    public final ArrayDeque e = new ArrayDeque();
    public final w a = new w(h5.a.d);
    public final w b = new w(4);
    public final w c = new w();
    public int m = -1;
    public r3.m q = r3.m.A;
    public k[] r = new k[0];

    public l(int i10) {
    }

    @Override // r3.s
    public final boolean c() {
        return true;
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j10 == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                n nVar = this.f;
                nVar.a.clear();
                nVar.b = 0;
                this.g.clear();
                return;
            }
        }
        for (k kVar : this.r) {
            r rVar = kVar.b;
            int e = d0.e(rVar.f, j11, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                } else if ((rVar.g[e] & 1) != 0) {
                    break;
                } else {
                    e--;
                }
            }
            if (e == -1) {
                e = rVar.a(j11);
            }
            kVar.e = e;
            r3.w wVar = kVar.d;
            if (wVar != null) {
                wVar.b = false;
                wVar.c = 0;
            }
        }
    }

    @Override // r3.k
    public final void e(r3.m mVar) {
        this.q = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4 A[EDGE_INSN: B:70:0x00e4->B:71:0x00e4 BREAK  A[LOOP:1: B:29:0x006b->B:58:0x00e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    @Override // r3.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r3.r f(long j10) {
        long j11;
        long j12;
        long j13;
        int i10;
        k[] kVarArr;
        int i11;
        long j14;
        int a2;
        k[] kVarArr2 = this.r;
        int length = kVarArr2.length;
        t tVar = t.c;
        if (length == 0) {
            return new r3.r(tVar, tVar);
        }
        int i12 = this.t;
        boolean z4 = false;
        int i13 = -1;
        long j15 = -1;
        if (i12 != -1) {
            r rVar = kVarArr2[i12].b;
            long[] jArr = rVar.f;
            int e = d0.e(jArr, j10, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                }
                if ((rVar.g[e] & 1) != 0) {
                    break;
                }
                e--;
            }
            if (e == -1) {
                e = rVar.a(j10);
            }
            long[] jArr2 = rVar.c;
            if (e == -1) {
                return new r3.r(tVar, tVar);
            }
            j12 = jArr[e];
            j11 = jArr2[e];
            if (j12 < j10 && e < rVar.b - 1 && (a2 = rVar.a(j10)) != -1 && a2 != e) {
                j13 = jArr[a2];
                j15 = jArr2[a2];
                long j16 = j11;
                i10 = 0;
                while (true) {
                    kVarArr = this.r;
                    if (i10 < kVarArr.length) {
                        break;
                    }
                    if (i10 != this.t) {
                        r rVar2 = kVarArr[i10].b;
                        long[] jArr3 = rVar2.c;
                        int[] iArr = rVar2.g;
                        long[] jArr4 = rVar2.f;
                        int e6 = d0.e(jArr4, j12, z4);
                        while (true) {
                            if (e6 < 0) {
                                i11 = -1;
                                break;
                            }
                            if ((iArr[e6] & 1) != 0) {
                                i11 = e6;
                                break;
                            }
                            e6--;
                        }
                        if (i11 == i13) {
                            i11 = rVar2.a(j12);
                        }
                        if (i11 == i13) {
                            j14 = j15;
                        } else {
                            j14 = j15;
                            j16 = Math.min(jArr3[i11], j16);
                        }
                        if (j13 != -9223372036854775807L) {
                            z4 = false;
                            int e10 = d0.e(jArr4, j13, false);
                            while (true) {
                                if (e10 < 0) {
                                    e10 = -1;
                                    break;
                                }
                                if ((iArr[e10] & 1) != 0) {
                                    break;
                                }
                                e10--;
                            }
                            if (e10 == -1) {
                                e10 = rVar2.a(j13);
                            }
                            j15 = e10 == -1 ? j14 : Math.min(jArr3[e10], j14);
                        } else {
                            j15 = j14;
                            z4 = false;
                        }
                    }
                    i10++;
                    i13 = -1;
                }
                t tVar2 = new t(j12, j16);
                return j13 != -9223372036854775807L ? new r3.r(tVar2, tVar2) : new r3.r(tVar2, new t(j13, j15));
            }
        } else {
            j11 = Long.MAX_VALUE;
            j12 = j10;
        }
        j13 = -9223372036854775807L;
        long j162 = j11;
        i10 = 0;
        while (true) {
            kVarArr = this.r;
            if (i10 < kVarArr.length) {
            }
            i10++;
            i13 = -1;
        }
        t tVar22 = new t(j12, j162);
        if (j13 != -9223372036854775807L) {
        }
    }

    @Override // r3.s
    public final long g() {
        return this.u;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // r3.k
    public final int h(r3.l lVar, jb jbVar) {
        int i10;
        w wVar;
        char c3;
        char c10;
        boolean z4;
        a aVar;
        while (true) {
            int i11 = this.h;
            ArrayDeque arrayDeque = this.e;
            w wVar2 = this.c;
            int i12 = 4;
            if (i11 != 0) {
                int i13 = 2;
                if (i11 != 1) {
                    if (i11 == 2) {
                        long position = lVar.getPosition();
                        if (this.m == -1) {
                            int i14 = -1;
                            int i15 = -1;
                            boolean z10 = true;
                            boolean z11 = true;
                            int i16 = 0;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            long j12 = Long.MAX_VALUE;
                            while (true) {
                                k[] kVarArr = this.r;
                                if (i16 >= kVarArr.length) {
                                    break;
                                }
                                k kVar = kVarArr[i16];
                                int i17 = kVar.e;
                                r rVar = kVar.b;
                                if (i17 != rVar.b) {
                                    long j13 = rVar.c[i17];
                                    long[][] jArr = this.s;
                                    int i18 = d0.a;
                                    long j14 = jArr[i16][i17];
                                    long j15 = j13 - position;
                                    boolean z12 = j15 < 0 || j15 >= 262144;
                                    if ((!z12 && z11) || (z12 == z11 && j15 < j12)) {
                                        z11 = z12;
                                        i15 = i16;
                                        j12 = j15;
                                        j11 = j14;
                                    }
                                    if (j14 < j10) {
                                        z10 = z12;
                                        i14 = i16;
                                        j10 = j14;
                                    }
                                }
                                i16++;
                            }
                            if (j10 == Long.MAX_VALUE || !z10 || j11 < j10 + 524288) {
                                i14 = i15;
                            }
                            this.m = i14;
                            if (i14 == -1) {
                                return -1;
                            }
                        }
                        k kVar2 = this.r[this.m];
                        v vVar = kVar2.c;
                        o oVar = kVar2.a;
                        r rVar2 = kVar2.b;
                        int i19 = kVar2.e;
                        long j16 = rVar2.c[i19];
                        int i20 = rVar2.d[i19];
                        r3.w wVar3 = kVar2.d;
                        long j17 = (j16 - position) + this.n;
                        if (j17 < 0 || j17 >= 262144) {
                            jbVar.a = j16;
                            return 1;
                        }
                        if (oVar.g == 1) {
                            j17 += 8;
                            i20 -= 8;
                        }
                        lVar.n((int) j17);
                        int i21 = oVar.j;
                        if (i21 == 0) {
                            if ("audio/ac4".equals(oVar.f.C)) {
                                if (this.o == 0) {
                                    l3.a.c(i20, wVar2);
                                    vVar.d(7, wVar2);
                                    this.o += 7;
                                }
                                i20 += 7;
                            } else if (wVar3 != null) {
                                wVar3.c(lVar);
                            }
                            while (true) {
                                int i22 = this.o;
                                if (i22 >= i20) {
                                    break;
                                }
                                int e = vVar.e(lVar, i20 - i22, false);
                                this.n += e;
                                this.o += e;
                                this.p -= e;
                            }
                        } else {
                            w wVar4 = this.b;
                            byte[] bArr = wVar4.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i23 = 4 - i21;
                            while (this.o < i20) {
                                int i24 = this.p;
                                if (i24 == 0) {
                                    lVar.readFully(bArr, i23, i21);
                                    this.n += i21;
                                    wVar4.F(0);
                                    int g10 = wVar4.g();
                                    if (g10 < 0) {
                                        throw r1.a("Invalid NAL length", null);
                                    }
                                    this.p = g10;
                                    w wVar5 = this.a;
                                    wVar5.F(0);
                                    vVar.d(4, wVar5);
                                    this.o += 4;
                                    i20 += i23;
                                } else {
                                    int e6 = vVar.e(lVar, i24, false);
                                    this.n += e6;
                                    this.o += e6;
                                    this.p -= e6;
                                }
                            }
                        }
                        int i25 = i20;
                        long j18 = rVar2.f[i19];
                        int i26 = rVar2.g[i19];
                        if (wVar3 != null) {
                            wVar3.b(vVar, j18, i26, i25, 0, null);
                            if (i19 + 1 == rVar2.b) {
                                wVar3.a(vVar, null);
                            }
                        } else {
                            vVar.c(j18, i26, i25, 0, null);
                        }
                        kVar2.e++;
                        this.m = -1;
                        this.n = 0;
                        this.o = 0;
                        this.p = 0;
                        return 0;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    n nVar = this.f;
                    ArrayList arrayList = nVar.a;
                    int i27 = nVar.b;
                    if (i27 != 0) {
                        if (i27 != 1) {
                            short s6 = 2816;
                            short s9 = 2192;
                            if (i27 == 2) {
                                long length = lVar.getLength();
                                int i28 = nVar.c - 20;
                                w wVar6 = new w(i28);
                                lVar.readFully(wVar6.a, 0, i28);
                                int i29 = 0;
                                while (i29 < i28 / 12) {
                                    wVar6.G(i13);
                                    short k10 = wVar6.k();
                                    if (k10 != s9 && k10 != s6) {
                                        if (k10 != 2817 && k10 != 2819) {
                                            if (k10 != 2820) {
                                                wVar6.G(8);
                                                wVar = wVar6;
                                                i29++;
                                                wVar6 = wVar;
                                                s9 = 2192;
                                                i13 = 2;
                                                s6 = 2816;
                                            }
                                        }
                                    }
                                    wVar = wVar6;
                                    arrayList.add(new m((length - nVar.c) - wVar.i(), wVar.i()));
                                    i29++;
                                    wVar6 = wVar;
                                    s9 = 2192;
                                    i13 = 2;
                                    s6 = 2816;
                                }
                                if (arrayList.isEmpty()) {
                                    jbVar.a = 0L;
                                } else {
                                    nVar.b = 3;
                                    jbVar.a = ((m) arrayList.get(0)).a;
                                }
                            } else {
                                if (i27 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position2 = lVar.getPosition();
                                int length2 = (int) ((lVar.getLength() - lVar.getPosition()) - nVar.c);
                                w wVar7 = new w(length2);
                                lVar.readFully(wVar7.a, 0, length2);
                                int i30 = 0;
                                while (i30 < arrayList.size()) {
                                    m mVar = (m) arrayList.get(i30);
                                    wVar7.F((int) (mVar.a - position2));
                                    wVar7.G(i12);
                                    int i31 = wVar7.i();
                                    Charset charset = r8.d.c;
                                    String s10 = wVar7.s(i31, charset);
                                    switch (s10.hashCode()) {
                                        case -1711564334:
                                            if (s10.equals("SlowMotion_Data")) {
                                                c3 = 0;
                                                break;
                                            }
                                            break;
                                        case -1332107749:
                                            if (s10.equals("Super_SlowMotion_Edit_Data")) {
                                                c3 = 1;
                                                break;
                                            }
                                            break;
                                        case -1251387154:
                                            if (s10.equals("Super_SlowMotion_Data")) {
                                                c3 = 2;
                                                break;
                                            }
                                            break;
                                        case -830665521:
                                            if (s10.equals("Super_SlowMotion_Deflickering_On")) {
                                                c3 = 3;
                                                break;
                                            }
                                            break;
                                        case 1760745220:
                                            if (s10.equals("Super_SlowMotion_BGM")) {
                                                c3 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    c3 = 65535;
                                    switch (c3) {
                                        case 0:
                                            c10 = 2192;
                                            break;
                                        case 1:
                                            c10 = 2819;
                                            break;
                                        case 2:
                                            c10 = 2816;
                                            break;
                                        case 3:
                                            c10 = 2820;
                                            break;
                                        case 4:
                                            c10 = 2817;
                                            break;
                                        default:
                                            throw r1.a("Invalid SEF name", null);
                                    }
                                    int i32 = mVar.b - (i31 + 8);
                                    if (c10 == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        List A = n.e.A(wVar7.s(i32, charset));
                                        for (int i33 = 0; i33 < A.size(); i33++) {
                                            List A2 = n.d.A((CharSequence) A.get(i33));
                                            if (A2.size() != 3) {
                                                throw r1.a(null, null);
                                            }
                                            try {
                                                arrayList2.add(new k4.c(Long.parseLong((String) A2.get(0)), Long.parseLong((String) A2.get(1)), 1 << (Integer.parseInt((String) A2.get(2)) - 1)));
                                            } catch (NumberFormatException e10) {
                                                throw r1.a(null, e10);
                                            }
                                        }
                                        this.g.add(new k4.d(arrayList2));
                                    } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i30++;
                                    i12 = 4;
                                }
                                jbVar.a = 0L;
                            }
                        } else {
                            w wVar8 = new w(8);
                            lVar.readFully(wVar8.a, 0, 8);
                            nVar.c = wVar8.i() + 8;
                            if (wVar8.g() != 1397048916) {
                                jbVar.a = 0L;
                            } else {
                                jbVar.a = lVar.getPosition() - (nVar.c - 12);
                                nVar.b = 2;
                            }
                        }
                        i10 = 1;
                    } else {
                        long length3 = lVar.getLength();
                        jbVar.a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                        i10 = 1;
                        nVar.b = 1;
                    }
                    if (jbVar.a != 0) {
                        return i10;
                    }
                    this.h = 0;
                    this.k = 0;
                    return i10;
                }
                long j19 = this.j - this.k;
                long position3 = lVar.getPosition() + j19;
                w wVar9 = this.l;
                if (wVar9 != null) {
                    lVar.readFully(wVar9.a, this.k, (int) j19);
                    if (this.i == 1718909296) {
                        wVar9.F(8);
                        int g11 = wVar9.g();
                        int i34 = g11 != 1751476579 ? g11 != 1903435808 ? 0 : 1 : 2;
                        if (i34 == 0) {
                            wVar9.G(4);
                            while (true) {
                                if (wVar9.a() <= 0) {
                                    i34 = 0;
                                    break;
                                }
                                int g12 = wVar9.g();
                                i34 = g12 != 1751476579 ? g12 != 1903435808 ? 0 : 1 : 2;
                                if (i34 != 0) {
                                    break;
                                }
                            }
                        }
                        this.v = i34;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).d.add(new b(this.i, wVar9));
                    }
                } else if (j19 < 262144) {
                    lVar.n((int) j19);
                } else {
                    jbVar.a = lVar.getPosition() + j19;
                    z4 = true;
                    j(position3);
                    if (z4 && this.h != 2) {
                        return 1;
                    }
                }
                z4 = false;
                j(position3);
                if (z4) {
                    return 1;
                }
                continue;
            } else {
                int i35 = this.k;
                w wVar10 = this.d;
                if (i35 == 0) {
                    if (!lVar.c(wVar10.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    wVar10.F(0);
                    this.j = wVar10.v();
                    this.i = wVar10.g();
                }
                long j20 = this.j;
                if (j20 == 1) {
                    lVar.readFully(wVar10.a, 8, 8);
                    this.k += 8;
                    this.j = wVar10.y();
                } else if (j20 == 0) {
                    long length4 = lVar.getLength();
                    if (length4 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        length4 = aVar.c;
                    }
                    if (length4 != -1) {
                        this.j = (length4 - lVar.getPosition()) + this.k;
                    }
                }
                long j21 = this.j;
                int i36 = this.k;
                if (j21 < i36) {
                    throw r1.c("Atom size less than header length (unsupported).");
                }
                int i37 = this.i;
                if (i37 == 1836019574 || i37 == 1953653099 || i37 == 1835297121 || i37 == 1835626086 || i37 == 1937007212 || i37 == 1701082227 || i37 == 1835365473) {
                    long position4 = lVar.getPosition();
                    long j22 = this.j;
                    long j23 = this.k;
                    long j24 = (position4 + j22) - j23;
                    if (j22 != j23 && this.i == 1835365473) {
                        wVar2.C(8);
                        lVar.b(0, 8, wVar2.a);
                        byte[] bArr2 = e.a;
                        int i38 = wVar2.b;
                        wVar2.G(4);
                        if (wVar2.g() != 1751411826) {
                            i38 += 4;
                        }
                        wVar2.F(i38);
                        lVar.n(wVar2.b);
                        lVar.m();
                    }
                    arrayDeque.push(new a(this.i, j24));
                    if (this.j == this.k) {
                        j(j24);
                    } else {
                        this.h = 0;
                        this.k = 0;
                    }
                } else if (i37 == 1835296868 || i37 == 1836476516 || i37 == 1751411826 || i37 == 1937011556 || i37 == 1937011827 || i37 == 1937011571 || i37 == 1668576371 || i37 == 1701606260 || i37 == 1937011555 || i37 == 1937011578 || i37 == 1937013298 || i37 == 1937007471 || i37 == 1668232756 || i37 == 1953196132 || i37 == 1718909296 || i37 == 1969517665 || i37 == 1801812339 || i37 == 1768715124) {
                    h5.a.i(i36 == 8);
                    h5.a.i(this.j <= 2147483647L);
                    w wVar11 = new w((int) this.j);
                    System.arraycopy(wVar10.a, 0, wVar11.a, 0, 8);
                    this.l = wVar11;
                    this.h = 1;
                } else {
                    long position5 = lVar.getPosition();
                    long j25 = this.k;
                    long j26 = position5 - j25;
                    if (this.i == 1836086884) {
                        new k4.b(0L, j26, -9223372036854775807L, j26 + j25, this.j - j25);
                    }
                    this.l = null;
                    this.h = 1;
                }
            }
        }
    }

    @Override // r3.k
    public final boolean i(r3.l lVar) {
        return j.j(lVar, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bf, code lost:
    
        if (r9 != 757935405) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c1, code lost:
    
        r12 = null;
        r14 = null;
        r0 = -1;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c5, code lost:
    
        r15 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c7, code lost:
    
        if (r15 >= r8) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c9, code lost:
    
        r21 = r7.g();
        r13 = r7.g();
        r32 = r4;
        r7.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01da, code lost:
    
        if (r13 != 1835360622) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01dc, code lost:
    
        r12 = r7.q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fc, code lost:
    
        r4 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e6, code lost:
    
        if (r13 != 1851878757) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e8, code lost:
    
        r14 = r7.q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f2, code lost:
    
        if (r13 != 1684108385) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f4, code lost:
    
        r0 = r15;
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f7, code lost:
    
        r7.G(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0200, code lost:
    
        r32 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0202, code lost:
    
        if (r12 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0204, code lost:
    
        if (r14 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0207, code lost:
    
        if (r0 != (-1)) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x020a, code lost:
    
        r7.F(r0);
        r7.G(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021d, code lost:
    
        r12 = new j4.k(r12, r14, r7.q(r9 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0220, code lost:
    
        r7.F(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021f, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0225, code lost:
    
        r32 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a2, code lost:
    
        h5.a.n("MetadataUtil", "Skipped unknown metadata entry: " + n3.a.c(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b5, code lost:
    
        r7.F(r8);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00c9, code lost:
    
        r9 = z3.j.i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00cd, code lost:
    
        if (r9 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00cf, code lost:
    
        r12 = z3.j.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00d3, code lost:
    
        if (r9 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00d5, code lost:
    
        r9 = r12[r9 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00db, code lost:
    
        if (r9 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00dd, code lost:
    
        r12 = new j4.n("TCON", null, s8.v.x(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00e8, code lost:
    
        h5.a.K("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ee, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00da, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02db, code lost:
    
        r7.F(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02de, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c0, code lost:
    
        r32 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0229, code lost:
    
        r4 = 16777215 & r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0230, code lost:
    
        if (r4 != 6516084) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0232, code lost:
    
        r12 = z3.j.b(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x023a, code lost:
    
        if (r4 == 7233901) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x023f, code lost:
    
        if (r4 != 7631467) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0246, code lost:
    
        if (r4 == 6516589) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x024b, code lost:
    
        if (r4 != 7828084) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0252, code lost:
    
        if (r4 != 6578553) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0254, code lost:
    
        r12 = z3.j.g(r9, "TDRC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x025e, code lost:
    
        if (r4 != 4280916) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0260, code lost:
    
        r12 = z3.j.g(r9, "TPE1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x026a, code lost:
    
        if (r4 != 7630703) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x026c, code lost:
    
        r12 = z3.j.g(r9, "TSSE", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0276, code lost:
    
        if (r4 != 6384738) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0278, code lost:
    
        r12 = z3.j.g(r9, "TALB", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0282, code lost:
    
        if (r4 != 7108978) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0284, code lost:
    
        r12 = z3.j.g(r9, "USLT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x028e, code lost:
    
        if (r4 != 6776174) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0290, code lost:
    
        r12 = z3.j.g(r9, "TCON", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0298, code lost:
    
        if (r4 != 6779504) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x029a, code lost:
    
        r12 = z3.j.g(r9, "TIT1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02ba, code lost:
    
        r12 = z3.j.g(r9, "TCOM", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02c2, code lost:
    
        r12 = z3.j.g(r9, "TIT2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02df, code lost:
    
        r31 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02e7, code lost:
    
        if (r3.isEmpty() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02e9, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02ed, code lost:
    
        r21 = new e4.c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r7.F(r4);
        r4 = r4 + r15;
        r7.G(r9);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r8 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r8 >= r4) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        r8 = r7.g() + r8;
        r9 = r7.g();
        r12 = (r9 >> 24) & 255;
        r31 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
    
        if (r12 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        if (r12 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r9 != 1735291493) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        if (r9 != 1684632427) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
    
        r12 = z3.j.d(r9, "TPOS", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        r7.F(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        r32 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02ca, code lost:
    
        if (r12 == null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02cc, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02cf, code lost:
    
        r0 = r31;
        r4 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        if (r9 != 1953655662) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010b, code lost:
    
        r12 = z3.j.d(r9, "TRCK", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if (r9 != 1953329263) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        r0 = z3.j.h(r9, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
    
        r7.F(r8);
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        if (r9 != 1668311404) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
    
        r0 = z3.j.h(r9, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0134, code lost:
    
        if (r9 != 1668249202) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0136, code lost:
    
        r12 = z3.j.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013e, code lost:
    
        if (r9 != 1631670868) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0140, code lost:
    
        r12 = z3.j.g(r9, "TPE2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014a, code lost:
    
        if (r9 != 1936682605) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014c, code lost:
    
        r12 = z3.j.g(r9, "TSOT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
    
        if (r9 != 1936679276) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0158, code lost:
    
        r12 = z3.j.g(r9, "TSO2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0162, code lost:
    
        if (r9 != 1936679282) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        r12 = z3.j.g(r9, "TSOA", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016e, code lost:
    
        if (r9 != 1936679265) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0170, code lost:
    
        r12 = z3.j.g(r9, "TSOP", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017b, code lost:
    
        if (r9 != 1936679791) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017d, code lost:
    
        r12 = z3.j.g(r9, "TSOC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0188, code lost:
    
        if (r9 != 1920233063) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018a, code lost:
    
        r12 = z3.j.h(r9, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0196, code lost:
    
        if (r9 != 1885823344) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        r0 = z3.j.h(r9, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r9 != 1936683886) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        r12 = z3.j.g(r9, "TVSHOWSORT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b2, code lost:
    
        if (r9 != 1953919848) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b4, code lost:
    
        r12 = z3.j.g(r9, "TVSHOW", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0656 A[LOOP:12: B:355:0x0653->B:357:0x0656, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0675  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j10) {
        ArrayDeque arrayDeque;
        e4.c cVar;
        e4.c cVar2;
        e4.c cVar3;
        e4.c cVar4;
        int size;
        int i10;
        k[] kVarArr;
        int i11;
        int i12;
        e4.c cVar5;
        ArrayList arrayList;
        int i13;
        int i14;
        e4.c cVar6;
        e4.c cVar7;
        int i15;
        int i16;
        int i17;
        k4.a aVar;
        ArrayDeque arrayDeque2;
        while (true) {
            ArrayDeque arrayDeque3 = this.e;
            if (arrayDeque3.isEmpty() || ((a) arrayDeque3.peek()).c != j10) {
                break;
            }
            a aVar2 = (a) arrayDeque3.pop();
            if (aVar2.b == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = this.v == 1;
                r3.p pVar = new r3.p();
                b k10 = aVar2.k(1969517665);
                int i18 = 1751411826;
                int i19 = 4;
                int i20 = 1768715124;
                int i21 = 1835365473;
                int i22 = 8;
                if (k10 != null) {
                    byte[] bArr = e.a;
                    w wVar = k10.c;
                    wVar.F(8);
                    cVar = null;
                    e4.c cVar8 = null;
                    cVar3 = null;
                    while (wVar.a() >= i22) {
                        int i23 = wVar.b;
                        int g10 = wVar.g();
                        int g11 = wVar.g();
                        if (g11 == i21) {
                            wVar.F(i23);
                            int i24 = i23 + g10;
                            wVar.G(i22);
                            int i25 = wVar.b;
                            wVar.G(i19);
                            if (wVar.g() != i18) {
                                i25 += 4;
                            }
                            wVar.F(i25);
                            while (true) {
                                int i26 = wVar.b;
                                if (i26 >= i24) {
                                    arrayDeque2 = arrayDeque3;
                                    break;
                                }
                                int g12 = wVar.g();
                                if (wVar.g() == i20) {
                                    break;
                                }
                                wVar.F(i26 + g12);
                                i22 = 8;
                                i20 = 1768715124;
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                            if (g11 == 1936553057) {
                                wVar.F(i23);
                                int i27 = i23 + g10;
                                wVar.G(12);
                                while (true) {
                                    int i28 = wVar.b;
                                    if (i28 >= i27) {
                                        break;
                                    }
                                    int g13 = wVar.g();
                                    if (wVar.g() != 1935766900) {
                                        wVar.F(i28 + g13);
                                    } else if (g13 >= 14) {
                                        wVar.G(5);
                                        int u10 = wVar.u();
                                        if (u10 == 12 || u10 == 13) {
                                            float f10 = u10 == 12 ? 240.0f : 120.0f;
                                            wVar.G(1);
                                            cVar = new e4.c(new k4.e(f10, wVar.u()));
                                        }
                                    }
                                }
                                cVar = null;
                            } else if (g11 == -1451722374) {
                                short r10 = wVar.r();
                                wVar.G(2);
                                String s6 = wVar.s(r10, r8.d.c);
                                int max = Math.max(s6.lastIndexOf(43), s6.lastIndexOf(45));
                                try {
                                    cVar3 = new e4.c(new m3.b(Float.parseFloat(s6.substring(0, max)), Float.parseFloat(s6.substring(max, s6.length() - 1))));
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    cVar3 = null;
                                }
                            }
                        }
                        wVar.F(i23 + g10);
                        arrayDeque3 = arrayDeque2;
                        i21 = 1835365473;
                        i18 = 1751411826;
                        i22 = 8;
                        i20 = 1768715124;
                        i19 = 4;
                    }
                    arrayDeque = arrayDeque3;
                    e4.c cVar9 = cVar8;
                    if (cVar9 != null) {
                        pVar.b(cVar9);
                    }
                    cVar2 = cVar9;
                } else {
                    arrayDeque = arrayDeque3;
                    cVar = null;
                    cVar2 = null;
                    cVar3 = null;
                }
                a j11 = aVar2.j(1835365473);
                if (j11 != null) {
                    byte[] bArr2 = e.a;
                    b k11 = j11.k(1751411826);
                    b k12 = j11.k(1801812339);
                    b k13 = j11.k(1768715124);
                    if (k11 != null && k12 != null && k13 != null) {
                        w wVar2 = k11.c;
                        wVar2.F(16);
                        if (wVar2.g() == 1835299937) {
                            w wVar3 = k12.c;
                            wVar3.F(12);
                            int g14 = wVar3.g();
                            String[] strArr = new String[g14];
                            for (int i29 = 0; i29 < g14; i29++) {
                                int g15 = wVar3.g();
                                wVar3.G(4);
                                strArr[i29] = wVar3.s(g15 - 8, r8.d.c);
                            }
                            w wVar4 = k13.c;
                            wVar4.F(8);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i30 = 8; wVar4.a() > i30; i30 = 8) {
                                int i31 = wVar4.b;
                                int g16 = wVar4.g();
                                int g17 = wVar4.g() - 1;
                                if (g17 < 0 || g17 >= g14) {
                                    i17 = g14;
                                    e2.c.q(g17, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str = strArr[g17];
                                    int i32 = i31 + g16;
                                    while (true) {
                                        int i33 = wVar4.b;
                                        if (i33 >= i32) {
                                            i17 = g14;
                                            aVar = null;
                                            break;
                                        }
                                        int g18 = wVar4.g();
                                        i17 = g14;
                                        if (wVar4.g() == 1684108385) {
                                            int g19 = wVar4.g();
                                            int g20 = wVar4.g();
                                            int i34 = g18 - 16;
                                            byte[] bArr3 = new byte[i34];
                                            wVar4.e(0, i34, bArr3);
                                            aVar = new k4.a(str, bArr3, g20, g19);
                                            break;
                                        }
                                        wVar4.F(i33 + g18);
                                        g14 = i17;
                                    }
                                    if (aVar != null) {
                                        arrayList3.add(aVar);
                                    }
                                }
                                wVar4.F(i31 + g16);
                                g14 = i17;
                            }
                            if (!arrayList3.isEmpty()) {
                                cVar4 = new e4.c(arrayList3);
                                b k14 = aVar2.k(1836476516);
                                k14.getClass();
                                e4.c cVar10 = (e4.c) e.c(k14.c).c;
                                ArrayList f11 = e.f(aVar2, pVar, -9223372036854775807L, null, false, z4, new y3.d());
                                size = f11.size();
                                int i35 = -1;
                                i10 = 0;
                                long j12 = -9223372036854775807L;
                                while (i10 < size) {
                                    r rVar = (r) f11.get(i10);
                                    int i36 = rVar.b;
                                    int i37 = rVar.e;
                                    if (i36 == 0) {
                                        cVar6 = cVar4;
                                        cVar5 = cVar10;
                                        arrayList = f11;
                                        i13 = size;
                                    } else {
                                        o oVar = rVar.a;
                                        long j13 = oVar.e;
                                        cVar5 = cVar10;
                                        n0 n0Var = oVar.f;
                                        arrayList = f11;
                                        int i38 = oVar.b;
                                        if (j13 == -9223372036854775807L) {
                                            j13 = rVar.h;
                                        }
                                        j12 = Math.max(j12, j13);
                                        i13 = size;
                                        k kVar = new k(oVar, rVar, this.q.d2(i10, i38));
                                        int i39 = "audio/true-hd".equals(n0Var.C) ? i37 * 16 : i37 + 30;
                                        m0 a2 = n0Var.a();
                                        a2.p = i39;
                                        if (i38 != 2 || j13 <= 0) {
                                            i14 = 1;
                                        } else {
                                            int i40 = rVar.b;
                                            i14 = 1;
                                            if (i40 > 1) {
                                                a2.v = i40 / (j13 / 1000000.0f);
                                            }
                                        }
                                        if (i38 == i14 && (i15 = pVar.a) != -1 && (i16 = pVar.b) != -1) {
                                            a2.E = i15;
                                            a2.F = i16;
                                        }
                                        ArrayList arrayList4 = this.g;
                                        e4.c[] cVarArr = {cVar, arrayList4.isEmpty() ? null : new e4.c(arrayList4), cVar3, cVar5};
                                        e4.c cVar11 = new e4.c(new e4.b[0]);
                                        if (i38 == 1 && cVar2 != null) {
                                            cVar11 = cVar2;
                                        }
                                        if (cVar4 != null) {
                                            int i41 = 0;
                                            while (true) {
                                                e4.b[] bVarArr = cVar4.a;
                                                if (i41 >= bVarArr.length) {
                                                    break;
                                                }
                                                e4.b bVar = bVarArr[i41];
                                                if (bVar instanceof k4.a) {
                                                    k4.a aVar3 = (k4.a) bVar;
                                                    cVar7 = cVar4;
                                                    if (!aVar3.a.equals("com.android.capture.fps")) {
                                                        cVar11 = cVar11.a(aVar3);
                                                    } else if (i38 == 2) {
                                                        cVar11 = cVar11.a(aVar3);
                                                    }
                                                } else {
                                                    cVar7 = cVar4;
                                                }
                                                i41++;
                                                cVar4 = cVar7;
                                            }
                                        }
                                        cVar6 = cVar4;
                                        for (int i42 = 0; i42 < 4; i42++) {
                                            e4.c cVar12 = cVarArr[i42];
                                            cVar11.getClass();
                                            if (cVar12 != null) {
                                                cVar11 = cVar11.a(cVar12.a);
                                            }
                                        }
                                        if (cVar11.a.length > 0) {
                                            a2.i = cVar11;
                                        }
                                        kVar.c.b(new n0(a2));
                                        if (i38 == 2 && i35 == -1) {
                                            i35 = arrayList2.size();
                                        }
                                        arrayList2.add(kVar);
                                    }
                                    i10++;
                                    cVar10 = cVar5;
                                    f11 = arrayList;
                                    size = i13;
                                    cVar4 = cVar6;
                                }
                                this.t = i35;
                                this.u = j12;
                                kVarArr = (k[]) arrayList2.toArray(new k[0]);
                                this.r = kVarArr;
                                long[][] jArr = new long[kVarArr.length][];
                                int[] iArr = new int[kVarArr.length];
                                long[] jArr2 = new long[kVarArr.length];
                                boolean[] zArr = new boolean[kVarArr.length];
                                for (i11 = 0; i11 < kVarArr.length; i11++) {
                                    jArr[i11] = new long[kVarArr[i11].b.b];
                                    jArr2[i11] = kVarArr[i11].b.f[0];
                                }
                                long j14 = 0;
                                i12 = 0;
                                while (i12 < kVarArr.length) {
                                    long j15 = Long.MAX_VALUE;
                                    int i43 = -1;
                                    for (int i44 = 0; i44 < kVarArr.length; i44++) {
                                        if (!zArr[i44]) {
                                            long j16 = jArr2[i44];
                                            if (j16 <= j15) {
                                                i43 = i44;
                                                j15 = j16;
                                            }
                                        }
                                    }
                                    int i45 = iArr[i43];
                                    long[] jArr3 = jArr[i43];
                                    jArr3[i45] = j14;
                                    r rVar2 = kVarArr[i43].b;
                                    long[] jArr4 = jArr2;
                                    j14 += rVar2.d[i45];
                                    int i46 = i45 + 1;
                                    iArr[i43] = i46;
                                    if (i46 < jArr3.length) {
                                        jArr4[i43] = rVar2.f[i46];
                                    } else {
                                        zArr[i43] = true;
                                        i12++;
                                    }
                                    jArr2 = jArr4;
                                }
                                this.s = jArr;
                                this.q.j1();
                                this.q.h2(this);
                                arrayDeque.clear();
                                this.h = 2;
                            }
                        }
                    }
                }
                cVar4 = null;
                b k142 = aVar2.k(1836476516);
                k142.getClass();
                e4.c cVar102 = (e4.c) e.c(k142.c).c;
                ArrayList f112 = e.f(aVar2, pVar, -9223372036854775807L, null, false, z4, new y3.d());
                size = f112.size();
                int i352 = -1;
                i10 = 0;
                long j122 = -9223372036854775807L;
                while (i10 < size) {
                }
                this.t = i352;
                this.u = j122;
                kVarArr = (k[]) arrayList2.toArray(new k[0]);
                this.r = kVarArr;
                long[][] jArr5 = new long[kVarArr.length][];
                int[] iArr2 = new int[kVarArr.length];
                long[] jArr22 = new long[kVarArr.length];
                boolean[] zArr2 = new boolean[kVarArr.length];
                while (i11 < kVarArr.length) {
                }
                long j142 = 0;
                i12 = 0;
                while (i12 < kVarArr.length) {
                }
                this.s = jArr5;
                this.q.j1();
                this.q.h2(this);
                arrayDeque.clear();
                this.h = 2;
            } else if (!arrayDeque3.isEmpty()) {
                ((a) arrayDeque3.peek()).e.add(aVar2);
            }
        }
        if (this.h != 2) {
            this.h = 0;
            this.k = 0;
        }
    }

    @Override // r3.k
    public final void release() {
    }
}
