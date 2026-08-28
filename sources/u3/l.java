package u3;

import android.util.Pair;
import d5.f0;
import d5.y;
import h3.s0;
import h3.t0;
import h3.t1;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m3.s;
import m3.t;
import m3.u;
import m3.w;
import m3.x;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements m3.k, t {
    public int i;
    public long j;
    public int k;
    public y l;
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
    public final y d = new y(16);
    public final ArrayDeque e = new ArrayDeque();
    public final y a = new y(d5.a.d);
    public final y b = new y(4);
    public final y c = new y();
    public int m = -1;
    public m3.m q = m3.m.t;
    public k[] r = new k[0];

    public l(int i9) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        int i9;
        char c10;
        char c11;
        boolean z10;
        a aVar;
        while (true) {
            int i10 = this.h;
            ArrayDeque arrayDeque = this.e;
            y yVar = this.c;
            int i11 = 4;
            if (i10 != 0) {
                int i12 = 2;
                if (i10 != 1) {
                    if (i10 == 2) {
                        long position = lVar.getPosition();
                        if (this.m == -1) {
                            int i13 = -1;
                            int i14 = -1;
                            boolean z11 = true;
                            boolean z12 = true;
                            int i15 = 0;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            long j12 = Long.MAX_VALUE;
                            while (true) {
                                k[] kVarArr = this.r;
                                if (i15 >= kVarArr.length) {
                                    break;
                                }
                                k kVar = kVarArr[i15];
                                int i16 = kVar.e;
                                r rVar = kVar.b;
                                if (i16 != rVar.b) {
                                    long j13 = rVar.c[i16];
                                    long[][] jArr = this.s;
                                    int i17 = f0.a;
                                    long j14 = jArr[i15][i16];
                                    long j15 = j13 - position;
                                    boolean z13 = j15 < 0 || j15 >= 262144;
                                    if ((!z13 && z12) || (z13 == z12 && j15 < j12)) {
                                        z12 = z13;
                                        i14 = i15;
                                        j12 = j15;
                                        j11 = j14;
                                    }
                                    if (j14 < j10) {
                                        z11 = z13;
                                        i13 = i15;
                                        j10 = j14;
                                    }
                                }
                                i15++;
                            }
                            if (j10 == Long.MAX_VALUE || !z11 || j11 < j10 + 524288) {
                                i13 = i14;
                            }
                            this.m = i13;
                            if (i13 == -1) {
                                return -1;
                            }
                        }
                        k kVar2 = this.r[this.m];
                        w wVar = kVar2.c;
                        o oVar = kVar2.a;
                        r rVar2 = kVar2.b;
                        int i18 = kVar2.e;
                        long j16 = rVar2.c[i18];
                        int i19 = rVar2.d[i18];
                        x xVar = kVar2.d;
                        long j17 = (j16 - position) + this.n;
                        if (j17 < 0 || j17 >= 262144) {
                            nVar.a = j16;
                            return 1;
                        }
                        if (oVar.g == 1) {
                            j17 += 8;
                            i19 -= 8;
                        }
                        lVar.u((int) j17);
                        int i20 = oVar.j;
                        if (i20 == 0) {
                            if ("audio/ac4".equals(oVar.f.B)) {
                                if (this.o == 0) {
                                    j3.b.c(i19, yVar);
                                    wVar.a(7, yVar);
                                    this.o += 7;
                                }
                                i19 += 7;
                            } else if (xVar != null) {
                                xVar.c(lVar);
                            }
                            while (true) {
                                int i21 = this.o;
                                if (i21 >= i19) {
                                    break;
                                }
                                int b10 = wVar.b(lVar, i19 - i21, false);
                                this.n += b10;
                                this.o += b10;
                                this.p -= b10;
                            }
                        } else {
                            y yVar2 = this.b;
                            byte[] bArr = yVar2.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i22 = 4 - i20;
                            while (this.o < i19) {
                                int i23 = this.p;
                                if (i23 == 0) {
                                    lVar.readFully(bArr, i22, i20);
                                    this.n += i20;
                                    yVar2.C(0);
                                    int e10 = yVar2.e();
                                    if (e10 < 0) {
                                        throw t1.a("Invalid NAL length", null);
                                    }
                                    this.p = e10;
                                    y yVar3 = this.a;
                                    yVar3.C(0);
                                    wVar.a(4, yVar3);
                                    this.o += 4;
                                    i19 += i22;
                                } else {
                                    int b11 = wVar.b(lVar, i23, false);
                                    this.n += b11;
                                    this.o += b11;
                                    this.p -= b11;
                                }
                            }
                        }
                        int i24 = i19;
                        long j18 = rVar2.f[i18];
                        int i25 = rVar2.g[i18];
                        if (xVar != null) {
                            xVar.b(wVar, j18, i25, i24, 0, null);
                            if (i18 + 1 == rVar2.b) {
                                xVar.a(wVar, null);
                            }
                        } else {
                            wVar.e(j18, i25, i24, 0, null);
                        }
                        kVar2.e++;
                        this.m = -1;
                        this.n = 0;
                        this.o = 0;
                        this.p = 0;
                        return 0;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    n nVar2 = this.f;
                    ArrayList arrayList = nVar2.a;
                    int i26 = nVar2.b;
                    if (i26 != 0) {
                        if (i26 != 1) {
                            short s10 = 2816;
                            short s11 = 2192;
                            if (i26 == 2) {
                                long length = lVar.getLength();
                                int i27 = nVar2.c - 20;
                                y yVar4 = new y(i27);
                                lVar.readFully(yVar4.a, 0, i27);
                                int i28 = 0;
                                while (i28 < i27 / 12) {
                                    yVar4.D(i12);
                                    byte[] bArr2 = yVar4.a;
                                    int i29 = yVar4.b;
                                    int i30 = i29 + 1;
                                    yVar4.b = i30;
                                    int i31 = bArr2[i29] & 255;
                                    yVar4.b = i29 + 2;
                                    short s12 = (short) (((bArr2[i30] & 255) << 8) | i31);
                                    if (s12 != s11 && s12 != s10) {
                                        if (s12 != 2817) {
                                            if (s12 != 2819 && s12 != 2820) {
                                                yVar4.D(8);
                                                i28++;
                                                s11 = 2192;
                                                i12 = 2;
                                                s10 = 2816;
                                            }
                                            arrayList.add(new m((length - nVar2.c) - yVar4.g(), yVar4.g()));
                                            i28++;
                                            s11 = 2192;
                                            i12 = 2;
                                            s10 = 2816;
                                        }
                                    }
                                    arrayList.add(new m((length - nVar2.c) - yVar4.g(), yVar4.g()));
                                    i28++;
                                    s11 = 2192;
                                    i12 = 2;
                                    s10 = 2816;
                                }
                                if (arrayList.isEmpty()) {
                                    nVar.a = 0L;
                                } else {
                                    nVar2.b = 3;
                                    nVar.a = ((m) arrayList.get(0)).a;
                                }
                            } else {
                                if (i26 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position2 = lVar.getPosition();
                                int length2 = (int) ((lVar.getLength() - lVar.getPosition()) - nVar2.c);
                                y yVar5 = new y(length2);
                                lVar.readFully(yVar5.a, 0, length2);
                                int i32 = 0;
                                while (i32 < arrayList.size()) {
                                    m mVar = (m) arrayList.get(i32);
                                    yVar5.C((int) (mVar.a - position2));
                                    yVar5.D(i11);
                                    int g10 = yVar5.g();
                                    Charset charset = n8.d.c;
                                    String p6 = yVar5.p(g10, charset);
                                    switch (p6.hashCode()) {
                                        case -1711564334:
                                            if (p6.equals("SlowMotion_Data")) {
                                                c10 = 0;
                                                break;
                                            }
                                            break;
                                        case -1332107749:
                                            if (p6.equals("Super_SlowMotion_Edit_Data")) {
                                                c10 = 1;
                                                break;
                                            }
                                            break;
                                        case -1251387154:
                                            if (p6.equals("Super_SlowMotion_Data")) {
                                                c10 = 2;
                                                break;
                                            }
                                            break;
                                        case -830665521:
                                            if (p6.equals("Super_SlowMotion_Deflickering_On")) {
                                                c10 = 3;
                                                break;
                                            }
                                            break;
                                        case 1760745220:
                                            if (p6.equals("Super_SlowMotion_BGM")) {
                                                c10 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    c10 = 65535;
                                    switch (c10) {
                                        case 0:
                                            c11 = 2192;
                                            break;
                                        case 1:
                                            c11 = 2819;
                                            break;
                                        case 2:
                                            c11 = 2816;
                                            break;
                                        case 3:
                                            c11 = 2820;
                                            break;
                                        case 4:
                                            c11 = 2817;
                                            break;
                                        default:
                                            throw t1.a("Invalid SEF name", null);
                                    }
                                    int i33 = mVar.b - (g10 + 8);
                                    if (c11 == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        List m10 = n.e.m(yVar5.p(i33, charset));
                                        for (int i34 = 0; i34 < m10.size(); i34++) {
                                            List m11 = n.d.m((CharSequence) m10.get(i34));
                                            if (m11.size() != 3) {
                                                throw t1.a(null, null);
                                            }
                                            try {
                                                arrayList2.add(new f4.c(Long.parseLong((String) m11.get(0)), Long.parseLong((String) m11.get(1)), 1 << (Integer.parseInt((String) m11.get(2)) - 1)));
                                            } catch (NumberFormatException e11) {
                                                throw t1.a(null, e11);
                                            }
                                        }
                                        this.g.add(new f4.d(arrayList2));
                                    } else if (c11 != 2816 && c11 != 2817 && c11 != 2819 && c11 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i32++;
                                    i11 = 4;
                                }
                                nVar.a = 0L;
                            }
                        } else {
                            y yVar6 = new y(8);
                            lVar.readFully(yVar6.a, 0, 8);
                            nVar2.c = yVar6.g() + 8;
                            if (yVar6.e() != 1397048916) {
                                nVar.a = 0L;
                            } else {
                                nVar.a = lVar.getPosition() - (nVar2.c - 12);
                                nVar2.b = 2;
                            }
                        }
                        i9 = 1;
                    } else {
                        long length3 = lVar.getLength();
                        nVar.a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                        i9 = 1;
                        nVar2.b = 1;
                    }
                    if (nVar.a != 0) {
                        return i9;
                    }
                    this.h = 0;
                    this.k = 0;
                    return i9;
                }
                long j19 = this.j - this.k;
                long position3 = lVar.getPosition() + j19;
                y yVar7 = this.l;
                if (yVar7 != null) {
                    lVar.readFully(yVar7.a, this.k, (int) j19);
                    if (this.i == 1718909296) {
                        yVar7.C(8);
                        int e12 = yVar7.e();
                        int i35 = e12 != 1751476579 ? e12 != 1903435808 ? 0 : 1 : 2;
                        if (i35 == 0) {
                            yVar7.D(4);
                            while (true) {
                                if (yVar7.a() <= 0) {
                                    i35 = 0;
                                    break;
                                }
                                int e13 = yVar7.e();
                                i35 = e13 != 1751476579 ? e13 != 1903435808 ? 0 : 1 : 2;
                                if (i35 != 0) {
                                    break;
                                }
                            }
                        }
                        this.v = i35;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).d.add(new b(this.i, yVar7));
                    }
                } else if (j19 < 262144) {
                    lVar.u((int) j19);
                } else {
                    nVar.a = lVar.getPosition() + j19;
                    z10 = true;
                    j(position3);
                    if (z10 && this.h != 2) {
                        return 1;
                    }
                }
                z10 = false;
                j(position3);
                if (z10) {
                    return 1;
                }
                continue;
            } else {
                int i36 = this.k;
                y yVar8 = this.d;
                if (i36 == 0) {
                    if (!lVar.d(yVar8.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    yVar8.C(0);
                    this.j = yVar8.s();
                    this.i = yVar8.e();
                }
                long j20 = this.j;
                if (j20 == 1) {
                    lVar.readFully(yVar8.a, 8, 8);
                    this.k += 8;
                    this.j = yVar8.v();
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
                int i37 = this.k;
                if (j21 < i37) {
                    throw t1.c("Atom size less than header length (unsupported).");
                }
                int i38 = this.i;
                if (i38 == 1836019574 || i38 == 1953653099 || i38 == 1835297121 || i38 == 1835626086 || i38 == 1937007212 || i38 == 1701082227 || i38 == 1835365473) {
                    long position4 = lVar.getPosition();
                    long j22 = this.j;
                    long j23 = this.k;
                    long j24 = (position4 + j22) - j23;
                    if (j22 != j23 && this.i == 1835365473) {
                        yVar.z(8);
                        lVar.c(0, 8, yVar.a);
                        byte[] bArr3 = e.a;
                        int i39 = yVar.b;
                        yVar.D(4);
                        if (yVar.e() != 1751411826) {
                            i39 += 4;
                        }
                        yVar.C(i39);
                        lVar.u(yVar.b);
                        lVar.t();
                    }
                    arrayDeque.push(new a(this.i, j24));
                    if (this.j == this.k) {
                        j(j24);
                    } else {
                        this.h = 0;
                        this.k = 0;
                    }
                } else if (i38 == 1835296868 || i38 == 1836476516 || i38 == 1751411826 || i38 == 1937011556 || i38 == 1937011827 || i38 == 1937011571 || i38 == 1668576371 || i38 == 1701606260 || i38 == 1937011555 || i38 == 1937011578 || i38 == 1937013298 || i38 == 1937007471 || i38 == 1668232756 || i38 == 1953196132 || i38 == 1718909296 || i38 == 1969517665 || i38 == 1801812339 || i38 == 1768715124) {
                    d5.a.i(i37 == 8);
                    d5.a.i(this.j <= 2147483647L);
                    y yVar9 = new y((int) this.j);
                    System.arraycopy(yVar8.a, 0, yVar9.a, 0, 8);
                    this.l = yVar9;
                    this.h = 1;
                } else {
                    long position5 = lVar.getPosition();
                    long j25 = this.k;
                    long j26 = position5 - j25;
                    if (this.i == 1836086884) {
                        new f4.b(0L, j26, -9223372036854775807L, j26 + j25, this.j - j25);
                    }
                    this.l = null;
                    this.h = 1;
                }
            }
        }
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.q = mVar;
    }

    @Override // m3.t
    public final boolean e() {
        return true;
    }

    @Override // m3.k
    public final boolean f(m3.l lVar) {
        return j.i(lVar, false, false);
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
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
            int e10 = f0.e(rVar.f, j11, false);
            while (true) {
                if (e10 < 0) {
                    e10 = -1;
                    break;
                } else if ((rVar.g[e10] & 1) != 0) {
                    break;
                } else {
                    e10--;
                }
            }
            if (e10 == -1) {
                e10 = rVar.a(j11);
            }
            kVar.e = e10;
            x xVar = kVar.d;
            if (xVar != null) {
                xVar.b = false;
                xVar.c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4 A[EDGE_INSN: B:70:0x00e4->B:71:0x00e4 BREAK  A[LOOP:1: B:29:0x006b->B:58:0x00e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    @Override // m3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s h(long j10) {
        long j11;
        long j12;
        long j13;
        int i9;
        k[] kVarArr;
        int i10;
        long j14;
        int a2;
        k[] kVarArr2 = this.r;
        int length = kVarArr2.length;
        u uVar = u.c;
        if (length == 0) {
            return new s(uVar, uVar);
        }
        int i11 = this.t;
        boolean z10 = false;
        int i12 = -1;
        long j15 = -1;
        if (i11 != -1) {
            r rVar = kVarArr2[i11].b;
            long[] jArr = rVar.f;
            int e10 = f0.e(jArr, j10, false);
            while (true) {
                if (e10 < 0) {
                    e10 = -1;
                    break;
                }
                if ((rVar.g[e10] & 1) != 0) {
                    break;
                }
                e10--;
            }
            if (e10 == -1) {
                e10 = rVar.a(j10);
            }
            long[] jArr2 = rVar.c;
            if (e10 == -1) {
                return new s(uVar, uVar);
            }
            j12 = jArr[e10];
            j11 = jArr2[e10];
            if (j12 < j10 && e10 < rVar.b - 1 && (a2 = rVar.a(j10)) != -1 && a2 != e10) {
                j13 = jArr[a2];
                j15 = jArr2[a2];
                long j16 = j11;
                i9 = 0;
                while (true) {
                    kVarArr = this.r;
                    if (i9 < kVarArr.length) {
                        break;
                    }
                    if (i9 != this.t) {
                        r rVar2 = kVarArr[i9].b;
                        long[] jArr3 = rVar2.c;
                        int[] iArr = rVar2.g;
                        long[] jArr4 = rVar2.f;
                        int e11 = f0.e(jArr4, j12, z10);
                        while (true) {
                            if (e11 < 0) {
                                i10 = -1;
                                break;
                            }
                            if ((iArr[e11] & 1) != 0) {
                                i10 = e11;
                                break;
                            }
                            e11--;
                        }
                        if (i10 == i12) {
                            i10 = rVar2.a(j12);
                        }
                        if (i10 == i12) {
                            j14 = j15;
                        } else {
                            j14 = j15;
                            j16 = Math.min(jArr3[i10], j16);
                        }
                        if (j13 != -9223372036854775807L) {
                            z10 = false;
                            int e12 = f0.e(jArr4, j13, false);
                            while (true) {
                                if (e12 < 0) {
                                    e12 = -1;
                                    break;
                                }
                                if ((iArr[e12] & 1) != 0) {
                                    break;
                                }
                                e12--;
                            }
                            if (e12 == -1) {
                                e12 = rVar2.a(j13);
                            }
                            j15 = e12 == -1 ? j14 : Math.min(jArr3[e12], j14);
                        } else {
                            j15 = j14;
                            z10 = false;
                        }
                    }
                    i9++;
                    i12 = -1;
                }
                u uVar2 = new u(j12, j16);
                return j13 != -9223372036854775807L ? new s(uVar2, uVar2) : new s(uVar2, new u(j13, j15));
            }
        } else {
            j11 = Long.MAX_VALUE;
            j12 = j10;
        }
        j13 = -9223372036854775807L;
        long j162 = j11;
        i9 = 0;
        while (true) {
            kVarArr = this.r;
            if (i9 < kVarArr.length) {
            }
            i9++;
            i12 = -1;
        }
        u uVar22 = new u(j12, j162);
        if (j13 != -9223372036854775807L) {
        }
    }

    @Override // m3.t
    public final long i() {
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bd, code lost:
    
        if (r9 != 757935405) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bf, code lost:
    
        r10 = null;
        r14 = null;
        r0 = -1;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c3, code lost:
    
        r15 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c5, code lost:
    
        if (r15 >= r8) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c7, code lost:
    
        r19 = r7.e();
        r13 = r7.e();
        r29 = r4;
        r7.D(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d8, code lost:
    
        if (r13 != 1835360622) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01da, code lost:
    
        r10 = r7.n(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fa, code lost:
    
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e4, code lost:
    
        if (r13 != 1851878757) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e6, code lost:
    
        r14 = r7.n(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f0, code lost:
    
        if (r13 != 1684108385) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f2, code lost:
    
        r0 = r15;
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f5, code lost:
    
        r7.D(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fe, code lost:
    
        r29 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0200, code lost:
    
        if (r10 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0202, code lost:
    
        if (r14 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0205, code lost:
    
        if (r0 != (-1)) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0208, code lost:
    
        r7.C(r0);
        r7.D(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021b, code lost:
    
        r10 = new e4.k(r10, r14, r7.n(r9 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021e, code lost:
    
        r7.C(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021d, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0223, code lost:
    
        r29 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a0, code lost:
    
        d5.a.n("MetadataUtil", "Skipped unknown metadata entry: " + lc.k.a(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b3, code lost:
    
        r7.C(r8);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00c7, code lost:
    
        r9 = u3.j.h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00cb, code lost:
    
        if (r9 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00cd, code lost:
    
        r10 = u3.j.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00d1, code lost:
    
        if (r9 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00d3, code lost:
    
        r9 = r10[r9 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00d9, code lost:
    
        if (r9 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00db, code lost:
    
        r10 = new e4.n("TCON", null, o8.z.y(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00e6, code lost:
    
        d5.a.K("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ec, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00d8, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0101, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d9, code lost:
    
        r7.C(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02dc, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00be, code lost:
    
        r29 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0227, code lost:
    
        r4 = 16777215 & r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x022e, code lost:
    
        if (r4 != 6516084) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0230, code lost:
    
        r10 = u3.j.b(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0238, code lost:
    
        if (r4 == 7233901) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x023d, code lost:
    
        if (r4 != 7631467) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0244, code lost:
    
        if (r4 == 6516589) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0249, code lost:
    
        if (r4 != 7828084) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0250, code lost:
    
        if (r4 != 6578553) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0252, code lost:
    
        r10 = u3.j.f(r9, "TDRC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x025c, code lost:
    
        if (r4 != 4280916) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x025e, code lost:
    
        r10 = u3.j.f(r9, "TPE1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0268, code lost:
    
        if (r4 != 7630703) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x026a, code lost:
    
        r10 = u3.j.f(r9, "TSSE", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0274, code lost:
    
        if (r4 != 6384738) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0276, code lost:
    
        r10 = u3.j.f(r9, "TALB", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0280, code lost:
    
        if (r4 != 7108978) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0282, code lost:
    
        r10 = u3.j.f(r9, "USLT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x028c, code lost:
    
        if (r4 != 6776174) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x028e, code lost:
    
        r10 = u3.j.f(r9, "TCON", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0296, code lost:
    
        if (r4 != 6779504) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0298, code lost:
    
        r10 = u3.j.f(r9, "TIT1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02b8, code lost:
    
        r10 = u3.j.f(r9, "TCOM", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02c0, code lost:
    
        r10 = u3.j.f(r9, "TIT2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02dd, code lost:
    
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02e5, code lost:
    
        if (r3.isEmpty() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02e7, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02eb, code lost:
    
        r19 = new z3.c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        r7.C(r4);
        r4 = r4 + r10;
        r7.D(r9);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        r8 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r8 >= r4) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        r8 = r7.e() + r8;
        r9 = r7.e();
        r15 = (r9 >> 24) & 255;
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r15 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        if (r15 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r9 != 1735291493) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (r9 != 1684632427) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        r10 = u3.j.d(r9, "TPOS", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        r7.C(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        r29 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02c8, code lost:
    
        if (r10 == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ca, code lost:
    
        r3.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02cd, code lost:
    
        r0 = r28;
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r9 != 1953655662) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        r10 = u3.j.d(r9, "TRCK", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0113, code lost:
    
        if (r9 != 1953329263) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0115, code lost:
    
        r0 = u3.j.g(r9, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011d, code lost:
    
        r7.C(r8);
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0125, code lost:
    
        if (r9 != 1668311404) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0127, code lost:
    
        r0 = u3.j.g(r9, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
    
        if (r9 != 1668249202) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
    
        r10 = u3.j.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013c, code lost:
    
        if (r9 != 1631670868) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013e, code lost:
    
        r10 = u3.j.f(r9, "TPE2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0148, code lost:
    
        if (r9 != 1936682605) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        r10 = u3.j.f(r9, "TSOT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
    
        if (r9 != 1936679276) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0156, code lost:
    
        r10 = u3.j.f(r9, "TSO2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0160, code lost:
    
        if (r9 != 1936679282) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0162, code lost:
    
        r10 = u3.j.f(r9, "TSOA", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        if (r9 != 1936679265) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016e, code lost:
    
        r10 = u3.j.f(r9, "TSOP", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0179, code lost:
    
        if (r9 != 1936679791) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017b, code lost:
    
        r10 = u3.j.f(r9, "TSOC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0186, code lost:
    
        if (r9 != 1920233063) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0188, code lost:
    
        r10 = u3.j.g(r9, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0194, code lost:
    
        if (r9 != 1885823344) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0196, code lost:
    
        r0 = u3.j.g(r9, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
    
        if (r9 != 1936683886) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
    
        r10 = u3.j.f(r9, "TVSHOWSORT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b0, code lost:
    
        if (r9 != 1953919848) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b2, code lost:
    
        r10 = u3.j.f(r9, "TVSHOW", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05a4 A[LOOP:10: B:300:0x05a1->B:302:0x05a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05f7 A[LOOP:12: B:336:0x05f4->B:338:0x05f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0614  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j10) {
        ArrayDeque arrayDeque;
        z3.c cVar;
        z3.c cVar2;
        z3.c cVar3;
        z3.c cVar4;
        a aVar;
        z3.c cVar5;
        int size;
        int i9;
        k[] kVarArr;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        z3.c cVar6;
        int i14;
        int i15;
        int i16;
        z3.c cVar7;
        z3.c cVar8;
        a aVar2;
        f4.a aVar3;
        ArrayDeque arrayDeque2;
        while (true) {
            ArrayDeque arrayDeque3 = this.e;
            if (arrayDeque3.isEmpty() || ((a) arrayDeque3.peek()).c != j10) {
                break;
            }
            a aVar4 = (a) arrayDeque3.pop();
            if (aVar4.b == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.v == 1;
                m3.q qVar = new m3.q();
                b f10 = aVar4.f(1969517665);
                int i17 = 1751411826;
                int i18 = 4;
                int i19 = 1768715124;
                int i20 = 1835365473;
                int i21 = 8;
                if (f10 != null) {
                    byte[] bArr = e.a;
                    y yVar = f10.c;
                    yVar.C(8);
                    z3.c cVar9 = null;
                    z3.c cVar10 = null;
                    while (yVar.a() >= i21) {
                        int i22 = yVar.b;
                        int e10 = yVar.e();
                        int e11 = yVar.e();
                        if (e11 == i20) {
                            yVar.C(i22);
                            int i23 = i22 + e10;
                            yVar.D(i21);
                            int i24 = yVar.b;
                            yVar.D(i18);
                            if (yVar.e() != i17) {
                                i24 += 4;
                            }
                            yVar.C(i24);
                            while (true) {
                                int i25 = yVar.b;
                                if (i25 >= i23) {
                                    arrayDeque2 = arrayDeque3;
                                    break;
                                }
                                int e12 = yVar.e();
                                if (yVar.e() == i19) {
                                    break;
                                }
                                yVar.C(i25 + e12);
                                i21 = 8;
                                i19 = 1768715124;
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                            if (e11 == 1936553057) {
                                yVar.C(i22);
                                int i26 = i22 + e10;
                                yVar.D(12);
                                while (true) {
                                    int i27 = yVar.b;
                                    if (i27 >= i26) {
                                        break;
                                    }
                                    int e13 = yVar.e();
                                    if (yVar.e() != 1935766900) {
                                        yVar.C(i27 + e13);
                                    } else if (e13 >= 14) {
                                        yVar.D(5);
                                        int r10 = yVar.r();
                                        if (r10 == 12 || r10 == 13) {
                                            float f11 = r10 == 12 ? 240.0f : 120.0f;
                                            yVar.D(1);
                                            cVar10 = new z3.c(new f4.e(f11, yVar.r()));
                                        }
                                    }
                                }
                                cVar10 = null;
                            }
                        }
                        yVar.C(i22 + e10);
                        arrayDeque3 = arrayDeque2;
                        i20 = 1835365473;
                        i17 = 1751411826;
                        i21 = 8;
                        i18 = 4;
                        i19 = 1768715124;
                    }
                    arrayDeque = arrayDeque3;
                    Pair create = Pair.create(cVar9, cVar10);
                    cVar2 = (z3.c) create.first;
                    cVar = (z3.c) create.second;
                    if (cVar2 != null) {
                        qVar.b(cVar2);
                    }
                    i20 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    cVar = null;
                    cVar2 = null;
                }
                a e14 = aVar4.e(i20);
                if (e14 != null) {
                    byte[] bArr2 = e.a;
                    b f12 = e14.f(1751411826);
                    b f13 = e14.f(1801812339);
                    b f14 = e14.f(1768715124);
                    if (f12 != null && f13 != null && f14 != null) {
                        y yVar2 = f12.c;
                        yVar2.C(16);
                        if (yVar2.e() == 1835299937) {
                            y yVar3 = f13.c;
                            yVar3.C(12);
                            int e15 = yVar3.e();
                            String[] strArr = new String[e15];
                            for (int i28 = 0; i28 < e15; i28++) {
                                int e16 = yVar3.e();
                                yVar3.D(4);
                                strArr[i28] = yVar3.p(e16 - 8, n8.d.c);
                            }
                            y yVar4 = f14.c;
                            yVar4.C(8);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i29 = 8; yVar4.a() > i29; i29 = 8) {
                                int i30 = yVar4.b;
                                int e17 = yVar4.e();
                                int e18 = yVar4.e() - 1;
                                if (e18 < 0 || e18 >= e15) {
                                    cVar7 = cVar;
                                    cVar8 = cVar2;
                                    aVar2 = aVar4;
                                    e2.c.t(e18, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str = strArr[e18];
                                    int i31 = i30 + e17;
                                    while (true) {
                                        int i32 = yVar4.b;
                                        if (i32 >= i31) {
                                            cVar7 = cVar;
                                            cVar8 = cVar2;
                                            aVar2 = aVar4;
                                            aVar3 = null;
                                            break;
                                        }
                                        int e19 = yVar4.e();
                                        cVar7 = cVar;
                                        cVar8 = cVar2;
                                        if (yVar4.e() == 1684108385) {
                                            int e20 = yVar4.e();
                                            int e21 = yVar4.e();
                                            int i33 = e19 - 16;
                                            byte[] bArr3 = new byte[i33];
                                            aVar2 = aVar4;
                                            yVar4.c(0, i33, bArr3);
                                            aVar3 = new f4.a(str, bArr3, e21, e20);
                                            break;
                                        }
                                        yVar4.C(i32 + e19);
                                        cVar = cVar7;
                                        cVar2 = cVar8;
                                    }
                                    if (aVar3 != null) {
                                        arrayList3.add(aVar3);
                                    }
                                }
                                yVar4.C(i30 + e17);
                                cVar = cVar7;
                                cVar2 = cVar8;
                                aVar4 = aVar2;
                            }
                            cVar3 = cVar;
                            cVar4 = cVar2;
                            aVar = aVar4;
                            if (!arrayList3.isEmpty()) {
                                cVar5 = new z3.c(arrayList3);
                                ArrayList e22 = e.e(aVar, qVar, -9223372036854775807L, null, false, z10, new s0.b(25));
                                size = e22.size();
                                int i34 = -1;
                                i9 = 0;
                                long j11 = -9223372036854775807L;
                                while (i9 < size) {
                                    r rVar = (r) e22.get(i9);
                                    int i35 = rVar.b;
                                    int i36 = rVar.e;
                                    if (i35 == 0) {
                                        cVar6 = cVar5;
                                        arrayList = e22;
                                        i12 = size;
                                    } else {
                                        o oVar = rVar.a;
                                        long j12 = oVar.e;
                                        t0 t0Var = oVar.f;
                                        arrayList = e22;
                                        int i37 = oVar.b;
                                        if (j12 == -9223372036854775807L) {
                                            j12 = rVar.h;
                                        }
                                        j11 = Math.max(j11, j12);
                                        i12 = size;
                                        k kVar = new k(oVar, rVar, this.q.I(i9, i37));
                                        int i38 = "audio/true-hd".equals(t0Var.B) ? i36 * 16 : i36 + 30;
                                        s0 a2 = t0Var.a();
                                        a2.p = i38;
                                        if (i37 != 2 || j12 <= 0) {
                                            i13 = 1;
                                        } else {
                                            int i39 = rVar.b;
                                            i13 = 1;
                                            if (i39 > 1) {
                                                a2.v = i39 / (j12 / 1000000.0f);
                                            }
                                        }
                                        if (i37 == i13 && (i15 = qVar.a) != -1 && (i16 = qVar.b) != -1) {
                                            a2.E = i15;
                                            a2.F = i16;
                                        }
                                        ArrayList arrayList4 = this.g;
                                        z3.c[] cVarArr = {cVar3, arrayList4.isEmpty() ? null : new z3.c(arrayList4)};
                                        z3.c cVar11 = new z3.c(new z3.b[0]);
                                        if (i37 == 1) {
                                            if (cVar4 != null) {
                                                cVar6 = cVar5;
                                                cVar11 = cVar4;
                                                for (i14 = 0; i14 < 2; i14++) {
                                                    cVar11 = cVar11.a(cVarArr[i14]);
                                                }
                                                if (cVar11.a.length > 0) {
                                                    a2.i = cVar11;
                                                }
                                                kVar.c.c(new t0(a2));
                                                if (i37 == 2 && i34 == -1) {
                                                    i34 = arrayList2.size();
                                                }
                                                arrayList2.add(kVar);
                                            }
                                            cVar6 = cVar5;
                                            while (i14 < 2) {
                                            }
                                            if (cVar11.a.length > 0) {
                                            }
                                            kVar.c.c(new t0(a2));
                                            if (i37 == 2) {
                                                i34 = arrayList2.size();
                                            }
                                            arrayList2.add(kVar);
                                        } else {
                                            if (i37 == 2 && cVar5 != null) {
                                                int i40 = 0;
                                                while (true) {
                                                    z3.b[] bVarArr = cVar5.a;
                                                    if (i40 >= bVarArr.length) {
                                                        break;
                                                    }
                                                    z3.b bVar = bVarArr[i40];
                                                    if (bVar instanceof f4.a) {
                                                        f4.a aVar5 = (f4.a) bVar;
                                                        cVar6 = cVar5;
                                                        if ("com.android.capture.fps".equals(aVar5.a)) {
                                                            cVar11 = new z3.c(aVar5);
                                                            break;
                                                        }
                                                    } else {
                                                        cVar6 = cVar5;
                                                    }
                                                    i40++;
                                                    cVar5 = cVar6;
                                                }
                                                while (i14 < 2) {
                                                }
                                                if (cVar11.a.length > 0) {
                                                }
                                                kVar.c.c(new t0(a2));
                                                if (i37 == 2) {
                                                }
                                                arrayList2.add(kVar);
                                            }
                                            cVar6 = cVar5;
                                            while (i14 < 2) {
                                            }
                                            if (cVar11.a.length > 0) {
                                            }
                                            kVar.c.c(new t0(a2));
                                            if (i37 == 2) {
                                            }
                                            arrayList2.add(kVar);
                                        }
                                    }
                                    i9++;
                                    e22 = arrayList;
                                    size = i12;
                                    cVar5 = cVar6;
                                }
                                long j13 = 0;
                                this.t = i34;
                                this.u = j11;
                                kVarArr = (k[]) arrayList2.toArray(new k[0]);
                                this.r = kVarArr;
                                long[][] jArr = new long[kVarArr.length][];
                                int[] iArr = new int[kVarArr.length];
                                long[] jArr2 = new long[kVarArr.length];
                                boolean[] zArr = new boolean[kVarArr.length];
                                for (i10 = 0; i10 < kVarArr.length; i10++) {
                                    jArr[i10] = new long[kVarArr[i10].b.b];
                                    jArr2[i10] = kVarArr[i10].b.f[0];
                                }
                                i11 = 0;
                                while (i11 < kVarArr.length) {
                                    long j14 = Long.MAX_VALUE;
                                    int i41 = -1;
                                    for (int i42 = 0; i42 < kVarArr.length; i42++) {
                                        if (!zArr[i42]) {
                                            long j15 = jArr2[i42];
                                            if (j15 <= j14) {
                                                i41 = i42;
                                                j14 = j15;
                                            }
                                        }
                                    }
                                    int i43 = iArr[i41];
                                    long[] jArr3 = jArr[i41];
                                    jArr3[i43] = j13;
                                    r rVar2 = kVarArr[i41].b;
                                    j13 += rVar2.d[i43];
                                    int i44 = i43 + 1;
                                    iArr[i41] = i44;
                                    if (i44 < jArr3.length) {
                                        jArr2[i41] = rVar2.f[i44];
                                    } else {
                                        zArr[i41] = true;
                                        i11++;
                                    }
                                }
                                this.s = jArr;
                                this.q.B();
                                this.q.y(this);
                                arrayDeque.clear();
                                this.h = 2;
                            }
                            cVar5 = null;
                            ArrayList e222 = e.e(aVar, qVar, -9223372036854775807L, null, false, z10, new s0.b(25));
                            size = e222.size();
                            int i342 = -1;
                            i9 = 0;
                            long j112 = -9223372036854775807L;
                            while (i9 < size) {
                            }
                            long j132 = 0;
                            this.t = i342;
                            this.u = j112;
                            kVarArr = (k[]) arrayList2.toArray(new k[0]);
                            this.r = kVarArr;
                            long[][] jArr4 = new long[kVarArr.length][];
                            int[] iArr2 = new int[kVarArr.length];
                            long[] jArr22 = new long[kVarArr.length];
                            boolean[] zArr2 = new boolean[kVarArr.length];
                            while (i10 < kVarArr.length) {
                            }
                            i11 = 0;
                            while (i11 < kVarArr.length) {
                            }
                            this.s = jArr4;
                            this.q.B();
                            this.q.y(this);
                            arrayDeque.clear();
                            this.h = 2;
                        }
                    }
                }
                cVar3 = cVar;
                cVar4 = cVar2;
                aVar = aVar4;
                cVar5 = null;
                ArrayList e2222 = e.e(aVar, qVar, -9223372036854775807L, null, false, z10, new s0.b(25));
                size = e2222.size();
                int i3422 = -1;
                i9 = 0;
                long j1122 = -9223372036854775807L;
                while (i9 < size) {
                }
                long j1322 = 0;
                this.t = i3422;
                this.u = j1122;
                kVarArr = (k[]) arrayList2.toArray(new k[0]);
                this.r = kVarArr;
                long[][] jArr42 = new long[kVarArr.length][];
                int[] iArr22 = new int[kVarArr.length];
                long[] jArr222 = new long[kVarArr.length];
                boolean[] zArr22 = new boolean[kVarArr.length];
                while (i10 < kVarArr.length) {
                }
                i11 = 0;
                while (i11 < kVarArr.length) {
                }
                this.s = jArr42;
                this.q.B();
                this.q.y(this);
                arrayDeque.clear();
                this.h = 2;
            } else if (!arrayDeque3.isEmpty()) {
                ((a) arrayDeque3.peek()).e.add(aVar4);
            }
        }
        if (this.h != 2) {
            this.h = 0;
            this.k = 0;
        }
    }

    @Override // m3.k
    public final void release() {
    }
}
