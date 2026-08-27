package u3;

import android.util.Pair;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m3.t;
import m3.u;
import m3.w;
import m3.x;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m implements m3.k, t {
    public int i;
    public long j;
    public int k;
    public z l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final o f = new o();
    public final ArrayList g = new ArrayList();
    public final z d = new z(16);
    public final ArrayDeque e = new ArrayDeque();
    public final z a = new z(d5.a.d);
    public final z b = new z(4);
    public final z c = new z();
    public int m = -1;
    public m3.m q = m3.m.t;
    public l[] r = new l[0];

    public m(int i10) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        int i10;
        char c10;
        char c11;
        boolean z10;
        a aVar;
        while (true) {
            int i11 = this.h;
            ArrayDeque arrayDeque = this.e;
            z zVar = this.c;
            int i12 = 4;
            if (i11 != 0) {
                int i13 = 2;
                if (i11 != 1) {
                    if (i11 == 2) {
                        long position = lVar.getPosition();
                        if (this.m == -1) {
                            int i14 = -1;
                            int i15 = -1;
                            boolean z11 = true;
                            boolean z12 = true;
                            int i16 = 0;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            long j12 = Long.MAX_VALUE;
                            while (true) {
                                l[] lVarArr = this.r;
                                if (i16 >= lVarArr.length) {
                                    break;
                                }
                                l lVar2 = lVarArr[i16];
                                int i17 = lVar2.e;
                                s sVar = lVar2.b;
                                if (i17 != sVar.b) {
                                    long j13 = sVar.c[i17];
                                    long[][] jArr = this.s;
                                    int i18 = g0.a;
                                    long j14 = jArr[i16][i17];
                                    long j15 = j13 - position;
                                    boolean z13 = j15 < 0 || j15 >= 262144;
                                    if ((!z13 && z12) || (z13 == z12 && j15 < j12)) {
                                        z12 = z13;
                                        i15 = i16;
                                        j12 = j15;
                                        j11 = j14;
                                    }
                                    if (j14 < j10) {
                                        z11 = z13;
                                        i14 = i16;
                                        j10 = j14;
                                    }
                                }
                                i16++;
                            }
                            if (j10 == Long.MAX_VALUE || !z11 || j11 < j10 + 524288) {
                                i14 = i15;
                            }
                            this.m = i14;
                            if (i14 == -1) {
                                return -1;
                            }
                        }
                        l lVar3 = this.r[this.m];
                        w wVar = lVar3.c;
                        p pVar = lVar3.a;
                        s sVar2 = lVar3.b;
                        int i19 = lVar3.e;
                        long j16 = sVar2.c[i19];
                        int i20 = sVar2.d[i19];
                        x xVar = lVar3.d;
                        long j17 = (j16 - position) + this.n;
                        if (j17 < 0 || j17 >= 262144) {
                            nVar.a = j16;
                            return 1;
                        }
                        if (pVar.g == 1) {
                            j17 += 8;
                            i20 -= 8;
                        }
                        lVar.t((int) j17);
                        int i21 = pVar.j;
                        if (i21 == 0) {
                            if ("audio/ac4".equals(pVar.f.B)) {
                                if (this.o == 0) {
                                    j3.b.c(i20, zVar);
                                    wVar.a(7, zVar);
                                    this.o += 7;
                                }
                                i20 += 7;
                            } else if (xVar != null) {
                                xVar.c(lVar);
                            }
                            while (true) {
                                int i22 = this.o;
                                if (i22 >= i20) {
                                    break;
                                }
                                int b10 = wVar.b(lVar, i20 - i22, false);
                                this.n += b10;
                                this.o += b10;
                                this.p -= b10;
                            }
                        } else {
                            z zVar2 = this.b;
                            byte[] bArr = zVar2.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i23 = 4 - i21;
                            while (this.o < i20) {
                                int i24 = this.p;
                                if (i24 == 0) {
                                    lVar.readFully(bArr, i23, i21);
                                    this.n += i21;
                                    zVar2.C(0);
                                    int e9 = zVar2.e();
                                    if (e9 < 0) {
                                        throw t1.a("Invalid NAL length", null);
                                    }
                                    this.p = e9;
                                    z zVar3 = this.a;
                                    zVar3.C(0);
                                    wVar.a(4, zVar3);
                                    this.o += 4;
                                    i20 += i23;
                                } else {
                                    int b11 = wVar.b(lVar, i24, false);
                                    this.n += b11;
                                    this.o += b11;
                                    this.p -= b11;
                                }
                            }
                        }
                        int i25 = i20;
                        long j18 = sVar2.f[i19];
                        int i26 = sVar2.g[i19];
                        if (xVar != null) {
                            xVar.b(wVar, j18, i26, i25, 0, null);
                            if (i19 + 1 == sVar2.b) {
                                xVar.a(wVar, null);
                            }
                        } else {
                            wVar.e(j18, i26, i25, 0, null);
                        }
                        lVar3.e++;
                        this.m = -1;
                        this.n = 0;
                        this.o = 0;
                        this.p = 0;
                        return 0;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    o oVar = this.f;
                    ArrayList arrayList = oVar.a;
                    int i27 = oVar.b;
                    if (i27 != 0) {
                        if (i27 != 1) {
                            short s10 = 2816;
                            short s11 = 2192;
                            if (i27 == 2) {
                                long length = lVar.getLength();
                                int i28 = oVar.c - 20;
                                z zVar4 = new z(i28);
                                lVar.readFully(zVar4.a, 0, i28);
                                int i29 = 0;
                                while (i29 < i28 / 12) {
                                    zVar4.D(i13);
                                    byte[] bArr2 = zVar4.a;
                                    int i30 = zVar4.b;
                                    int i31 = i30 + 1;
                                    zVar4.b = i31;
                                    int i32 = bArr2[i30] & 255;
                                    zVar4.b = i30 + 2;
                                    short s12 = (short) (((bArr2[i31] & 255) << 8) | i32);
                                    if (s12 != s11 && s12 != s10) {
                                        if (s12 != 2817) {
                                            if (s12 != 2819 && s12 != 2820) {
                                                zVar4.D(8);
                                                i29++;
                                                s11 = 2192;
                                                i13 = 2;
                                                s10 = 2816;
                                            }
                                            arrayList.add(new n((length - oVar.c) - zVar4.g(), zVar4.g()));
                                            i29++;
                                            s11 = 2192;
                                            i13 = 2;
                                            s10 = 2816;
                                        }
                                    }
                                    arrayList.add(new n((length - oVar.c) - zVar4.g(), zVar4.g()));
                                    i29++;
                                    s11 = 2192;
                                    i13 = 2;
                                    s10 = 2816;
                                }
                                if (arrayList.isEmpty()) {
                                    nVar.a = 0L;
                                } else {
                                    oVar.b = 3;
                                    nVar.a = ((n) arrayList.get(0)).a;
                                }
                            } else {
                                if (i27 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position2 = lVar.getPosition();
                                int length2 = (int) ((lVar.getLength() - lVar.getPosition()) - oVar.c);
                                z zVar5 = new z(length2);
                                lVar.readFully(zVar5.a, 0, length2);
                                int i33 = 0;
                                while (i33 < arrayList.size()) {
                                    n nVar2 = (n) arrayList.get(i33);
                                    zVar5.C((int) (nVar2.a - position2));
                                    zVar5.D(i12);
                                    int g10 = zVar5.g();
                                    Charset charset = o8.d.c;
                                    String p6 = zVar5.p(g10, charset);
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
                                    int i34 = nVar2.b - (g10 + 8);
                                    if (c11 == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        List m10 = o.e.m(zVar5.p(i34, charset));
                                        for (int i35 = 0; i35 < m10.size(); i35++) {
                                            List m11 = o.d.m((CharSequence) m10.get(i35));
                                            if (m11.size() != 3) {
                                                throw t1.a(null, null);
                                            }
                                            try {
                                                arrayList2.add(new f4.c(Long.parseLong((String) m11.get(0)), Long.parseLong((String) m11.get(1)), 1 << (Integer.parseInt((String) m11.get(2)) - 1)));
                                            } catch (NumberFormatException e10) {
                                                throw t1.a(null, e10);
                                            }
                                        }
                                        this.g.add(new f4.d(arrayList2));
                                    } else if (c11 != 2816 && c11 != 2817 && c11 != 2819 && c11 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i33++;
                                    i12 = 4;
                                }
                                nVar.a = 0L;
                            }
                        } else {
                            z zVar6 = new z(8);
                            lVar.readFully(zVar6.a, 0, 8);
                            oVar.c = zVar6.g() + 8;
                            if (zVar6.e() != 1397048916) {
                                nVar.a = 0L;
                            } else {
                                nVar.a = lVar.getPosition() - (oVar.c - 12);
                                oVar.b = 2;
                            }
                        }
                        i10 = 1;
                    } else {
                        long length3 = lVar.getLength();
                        nVar.a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                        i10 = 1;
                        oVar.b = 1;
                    }
                    if (nVar.a != 0) {
                        return i10;
                    }
                    this.h = 0;
                    this.k = 0;
                    return i10;
                }
                long j19 = this.j - this.k;
                long position3 = lVar.getPosition() + j19;
                z zVar7 = this.l;
                if (zVar7 != null) {
                    lVar.readFully(zVar7.a, this.k, (int) j19);
                    if (this.i == 1718909296) {
                        zVar7.C(8);
                        int e11 = zVar7.e();
                        int i36 = e11 != 1751476579 ? e11 != 1903435808 ? 0 : 1 : 2;
                        if (i36 == 0) {
                            zVar7.D(4);
                            while (true) {
                                if (zVar7.a() <= 0) {
                                    i36 = 0;
                                    break;
                                }
                                int e12 = zVar7.e();
                                i36 = e12 != 1751476579 ? e12 != 1903435808 ? 0 : 1 : 2;
                                if (i36 != 0) {
                                    break;
                                }
                            }
                        }
                        this.v = i36;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).d.add(new b(this.i, zVar7));
                    }
                } else if (j19 < 262144) {
                    lVar.t((int) j19);
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
                int i37 = this.k;
                z zVar8 = this.d;
                if (i37 == 0) {
                    if (!lVar.d(zVar8.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    zVar8.C(0);
                    this.j = zVar8.s();
                    this.i = zVar8.e();
                }
                long j20 = this.j;
                if (j20 == 1) {
                    lVar.readFully(zVar8.a, 8, 8);
                    this.k += 8;
                    this.j = zVar8.v();
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
                int i38 = this.k;
                if (j21 < i38) {
                    throw t1.c("Atom size less than header length (unsupported).");
                }
                int i39 = this.i;
                if (i39 == 1836019574 || i39 == 1953653099 || i39 == 1835297121 || i39 == 1835626086 || i39 == 1937007212 || i39 == 1701082227 || i39 == 1835365473) {
                    long position4 = lVar.getPosition();
                    long j22 = this.j;
                    long j23 = this.k;
                    long j24 = (position4 + j22) - j23;
                    if (j22 != j23 && this.i == 1835365473) {
                        zVar.z(8);
                        lVar.b(0, 8, zVar.a);
                        byte[] bArr3 = e.a;
                        int i40 = zVar.b;
                        zVar.D(4);
                        if (zVar.e() != 1751411826) {
                            i40 += 4;
                        }
                        zVar.C(i40);
                        lVar.t(zVar.b);
                        lVar.q();
                    }
                    arrayDeque.push(new a(this.i, j24));
                    if (this.j == this.k) {
                        j(j24);
                    } else {
                        this.h = 0;
                        this.k = 0;
                    }
                } else if (i39 == 1835296868 || i39 == 1836476516 || i39 == 1751411826 || i39 == 1937011556 || i39 == 1937011827 || i39 == 1937011571 || i39 == 1668576371 || i39 == 1701606260 || i39 == 1937011555 || i39 == 1937011578 || i39 == 1937013298 || i39 == 1937007471 || i39 == 1668232756 || i39 == 1953196132 || i39 == 1718909296 || i39 == 1969517665 || i39 == 1801812339 || i39 == 1768715124) {
                    d5.a.i(i38 == 8);
                    d5.a.i(this.j <= 2147483647L);
                    z zVar9 = new z((int) this.j);
                    System.arraycopy(zVar8.a, 0, zVar9.a, 0, 8);
                    this.l = zVar9;
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
                o oVar = this.f;
                oVar.a.clear();
                oVar.b = 0;
                this.g.clear();
                return;
            }
        }
        for (l lVar : this.r) {
            s sVar = lVar.b;
            int e9 = g0.e(sVar.f, j11, false);
            while (true) {
                if (e9 < 0) {
                    e9 = -1;
                    break;
                } else if ((sVar.g[e9] & 1) != 0) {
                    break;
                } else {
                    e9--;
                }
            }
            if (e9 == -1) {
                e9 = sVar.a(j11);
            }
            lVar.e = e9;
            x xVar = lVar.d;
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
    public final m3.s h(long j10) {
        long j11;
        long j12;
        long j13;
        int i10;
        l[] lVarArr;
        int i11;
        long j14;
        int a2;
        l[] lVarArr2 = this.r;
        int length = lVarArr2.length;
        u uVar = u.c;
        if (length == 0) {
            return new m3.s(uVar, uVar);
        }
        int i12 = this.t;
        boolean z10 = false;
        int i13 = -1;
        long j15 = -1;
        if (i12 != -1) {
            s sVar = lVarArr2[i12].b;
            long[] jArr = sVar.f;
            int e9 = g0.e(jArr, j10, false);
            while (true) {
                if (e9 < 0) {
                    e9 = -1;
                    break;
                }
                if ((sVar.g[e9] & 1) != 0) {
                    break;
                }
                e9--;
            }
            if (e9 == -1) {
                e9 = sVar.a(j10);
            }
            long[] jArr2 = sVar.c;
            if (e9 == -1) {
                return new m3.s(uVar, uVar);
            }
            j12 = jArr[e9];
            j11 = jArr2[e9];
            if (j12 < j10 && e9 < sVar.b - 1 && (a2 = sVar.a(j10)) != -1 && a2 != e9) {
                j13 = jArr[a2];
                j15 = jArr2[a2];
                long j16 = j11;
                i10 = 0;
                while (true) {
                    lVarArr = this.r;
                    if (i10 < lVarArr.length) {
                        break;
                    }
                    if (i10 != this.t) {
                        s sVar2 = lVarArr[i10].b;
                        long[] jArr3 = sVar2.c;
                        int[] iArr = sVar2.g;
                        long[] jArr4 = sVar2.f;
                        int e10 = g0.e(jArr4, j12, z10);
                        while (true) {
                            if (e10 < 0) {
                                i11 = -1;
                                break;
                            }
                            if ((iArr[e10] & 1) != 0) {
                                i11 = e10;
                                break;
                            }
                            e10--;
                        }
                        if (i11 == i13) {
                            i11 = sVar2.a(j12);
                        }
                        if (i11 == i13) {
                            j14 = j15;
                        } else {
                            j14 = j15;
                            j16 = Math.min(jArr3[i11], j16);
                        }
                        if (j13 != -9223372036854775807L) {
                            z10 = false;
                            int e11 = g0.e(jArr4, j13, false);
                            while (true) {
                                if (e11 < 0) {
                                    e11 = -1;
                                    break;
                                }
                                if ((iArr[e11] & 1) != 0) {
                                    break;
                                }
                                e11--;
                            }
                            if (e11 == -1) {
                                e11 = sVar2.a(j13);
                            }
                            j15 = e11 == -1 ? j14 : Math.min(jArr3[e11], j14);
                        } else {
                            j15 = j14;
                            z10 = false;
                        }
                    }
                    i10++;
                    i13 = -1;
                }
                u uVar2 = new u(j12, j16);
                return j13 != -9223372036854775807L ? new m3.s(uVar2, uVar2) : new m3.s(uVar2, new u(j13, j15));
            }
        } else {
            j11 = Long.MAX_VALUE;
            j12 = j10;
        }
        j13 = -9223372036854775807L;
        long j162 = j11;
        i10 = 0;
        while (true) {
            lVarArr = this.r;
            if (i10 < lVarArr.length) {
            }
            i10++;
            i13 = -1;
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
    
        d5.a.n("MetadataUtil", "Skipped unknown metadata entry: " + mc.k.a(r9));
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
    
        r10 = new e4.n("TCON", null, p8.z.y(r9));
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
    /* JADX WARN: Removed duplicated region for block: B:267:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05a3 A[LOOP:10: B:300:0x05a0->B:302:0x05a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05f6 A[LOOP:12: B:336:0x05f3->B:338:0x05f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0613  */
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
        int i10;
        l[] lVarArr;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        z3.c cVar6;
        int i15;
        int i16;
        int i17;
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
                int i18 = 1751411826;
                int i19 = 4;
                int i20 = 1768715124;
                int i21 = 1835365473;
                int i22 = 8;
                if (f10 != null) {
                    byte[] bArr = e.a;
                    z zVar = f10.c;
                    zVar.C(8);
                    z3.c cVar9 = null;
                    z3.c cVar10 = null;
                    while (zVar.a() >= i22) {
                        int i23 = zVar.b;
                        int e9 = zVar.e();
                        int e10 = zVar.e();
                        if (e10 == i21) {
                            zVar.C(i23);
                            int i24 = i23 + e9;
                            zVar.D(i22);
                            int i25 = zVar.b;
                            zVar.D(i19);
                            if (zVar.e() != i18) {
                                i25 += 4;
                            }
                            zVar.C(i25);
                            while (true) {
                                int i26 = zVar.b;
                                if (i26 >= i24) {
                                    arrayDeque2 = arrayDeque3;
                                    break;
                                }
                                int e11 = zVar.e();
                                if (zVar.e() == i20) {
                                    break;
                                }
                                zVar.C(i26 + e11);
                                i22 = 8;
                                i20 = 1768715124;
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                            if (e10 == 1936553057) {
                                zVar.C(i23);
                                int i27 = i23 + e9;
                                zVar.D(12);
                                while (true) {
                                    int i28 = zVar.b;
                                    if (i28 >= i27) {
                                        break;
                                    }
                                    int e12 = zVar.e();
                                    if (zVar.e() != 1935766900) {
                                        zVar.C(i28 + e12);
                                    } else if (e12 >= 14) {
                                        zVar.D(5);
                                        int r10 = zVar.r();
                                        if (r10 == 12 || r10 == 13) {
                                            float f11 = r10 == 12 ? 240.0f : 120.0f;
                                            zVar.D(1);
                                            cVar10 = new z3.c(new f4.f(f11, zVar.r()));
                                        }
                                    }
                                }
                                cVar10 = null;
                            }
                        }
                        zVar.C(i23 + e9);
                        arrayDeque3 = arrayDeque2;
                        i21 = 1835365473;
                        i18 = 1751411826;
                        i22 = 8;
                        i19 = 4;
                        i20 = 1768715124;
                    }
                    arrayDeque = arrayDeque3;
                    Pair create = Pair.create(cVar9, cVar10);
                    cVar2 = (z3.c) create.first;
                    cVar = (z3.c) create.second;
                    if (cVar2 != null) {
                        qVar.b(cVar2);
                    }
                    i21 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    cVar = null;
                    cVar2 = null;
                }
                a e13 = aVar4.e(i21);
                if (e13 != null) {
                    byte[] bArr2 = e.a;
                    b f12 = e13.f(1751411826);
                    b f13 = e13.f(1801812339);
                    b f14 = e13.f(1768715124);
                    if (f12 != null && f13 != null && f14 != null) {
                        z zVar2 = f12.c;
                        zVar2.C(16);
                        if (zVar2.e() == 1835299937) {
                            z zVar3 = f13.c;
                            zVar3.C(12);
                            int e14 = zVar3.e();
                            String[] strArr = new String[e14];
                            for (int i29 = 0; i29 < e14; i29++) {
                                int e15 = zVar3.e();
                                zVar3.D(4);
                                strArr[i29] = zVar3.p(e15 - 8, o8.d.c);
                            }
                            z zVar4 = f14.c;
                            zVar4.C(8);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i30 = 8; zVar4.a() > i30; i30 = 8) {
                                int i31 = zVar4.b;
                                int e16 = zVar4.e();
                                int e17 = zVar4.e() - 1;
                                if (e17 < 0 || e17 >= e14) {
                                    cVar7 = cVar;
                                    cVar8 = cVar2;
                                    aVar2 = aVar4;
                                    com.google.android.recaptcha.internal.a.s(e17, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str = strArr[e17];
                                    int i32 = i31 + e16;
                                    while (true) {
                                        int i33 = zVar4.b;
                                        if (i33 >= i32) {
                                            cVar7 = cVar;
                                            cVar8 = cVar2;
                                            aVar2 = aVar4;
                                            aVar3 = null;
                                            break;
                                        }
                                        int e18 = zVar4.e();
                                        cVar7 = cVar;
                                        cVar8 = cVar2;
                                        if (zVar4.e() == 1684108385) {
                                            int e19 = zVar4.e();
                                            int e20 = zVar4.e();
                                            int i34 = e18 - 16;
                                            byte[] bArr3 = new byte[i34];
                                            aVar2 = aVar4;
                                            zVar4.c(0, i34, bArr3);
                                            aVar3 = new f4.a(str, bArr3, e20, e19);
                                            break;
                                        }
                                        zVar4.C(i33 + e18);
                                        cVar = cVar7;
                                        cVar2 = cVar8;
                                    }
                                    if (aVar3 != null) {
                                        arrayList3.add(aVar3);
                                    }
                                }
                                zVar4.C(i31 + e16);
                                cVar = cVar7;
                                cVar2 = cVar8;
                                aVar4 = aVar2;
                            }
                            cVar3 = cVar;
                            cVar4 = cVar2;
                            aVar = aVar4;
                            if (!arrayList3.isEmpty()) {
                                cVar5 = new z3.c(arrayList3);
                                ArrayList e21 = e.e(aVar, qVar, -9223372036854775807L, null, false, z10, new k(0));
                                size = e21.size();
                                int i35 = -1;
                                i10 = 0;
                                long j11 = -9223372036854775807L;
                                while (i10 < size) {
                                    s sVar = (s) e21.get(i10);
                                    int i36 = sVar.b;
                                    int i37 = sVar.e;
                                    if (i36 == 0) {
                                        cVar6 = cVar5;
                                        arrayList = e21;
                                        i13 = size;
                                    } else {
                                        p pVar = sVar.a;
                                        long j12 = pVar.e;
                                        t0 t0Var = pVar.f;
                                        arrayList = e21;
                                        int i38 = pVar.b;
                                        if (j12 == -9223372036854775807L) {
                                            j12 = sVar.h;
                                        }
                                        j11 = Math.max(j11, j12);
                                        i13 = size;
                                        l lVar = new l(pVar, sVar, this.q.C(i10, i38));
                                        int i39 = "audio/true-hd".equals(t0Var.B) ? i37 * 16 : i37 + 30;
                                        s0 a2 = t0Var.a();
                                        a2.p = i39;
                                        if (i38 != 2 || j12 <= 0) {
                                            i14 = 1;
                                        } else {
                                            int i40 = sVar.b;
                                            i14 = 1;
                                            if (i40 > 1) {
                                                a2.v = i40 / (j12 / 1000000.0f);
                                            }
                                        }
                                        if (i38 == i14 && (i16 = qVar.a) != -1 && (i17 = qVar.b) != -1) {
                                            a2.E = i16;
                                            a2.F = i17;
                                        }
                                        ArrayList arrayList4 = this.g;
                                        z3.c[] cVarArr = {cVar3, arrayList4.isEmpty() ? null : new z3.c(arrayList4)};
                                        z3.c cVar11 = new z3.c(new z3.b[0]);
                                        if (i38 == 1) {
                                            if (cVar4 != null) {
                                                cVar6 = cVar5;
                                                cVar11 = cVar4;
                                                for (i15 = 0; i15 < 2; i15++) {
                                                    cVar11 = cVar11.a(cVarArr[i15]);
                                                }
                                                if (cVar11.a.length > 0) {
                                                    a2.i = cVar11;
                                                }
                                                lVar.c.c(new t0(a2));
                                                if (i38 == 2 && i35 == -1) {
                                                    i35 = arrayList2.size();
                                                }
                                                arrayList2.add(lVar);
                                            }
                                            cVar6 = cVar5;
                                            while (i15 < 2) {
                                            }
                                            if (cVar11.a.length > 0) {
                                            }
                                            lVar.c.c(new t0(a2));
                                            if (i38 == 2) {
                                                i35 = arrayList2.size();
                                            }
                                            arrayList2.add(lVar);
                                        } else {
                                            if (i38 == 2 && cVar5 != null) {
                                                int i41 = 0;
                                                while (true) {
                                                    z3.b[] bVarArr = cVar5.a;
                                                    if (i41 >= bVarArr.length) {
                                                        break;
                                                    }
                                                    z3.b bVar = bVarArr[i41];
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
                                                    i41++;
                                                    cVar5 = cVar6;
                                                }
                                                while (i15 < 2) {
                                                }
                                                if (cVar11.a.length > 0) {
                                                }
                                                lVar.c.c(new t0(a2));
                                                if (i38 == 2) {
                                                }
                                                arrayList2.add(lVar);
                                            }
                                            cVar6 = cVar5;
                                            while (i15 < 2) {
                                            }
                                            if (cVar11.a.length > 0) {
                                            }
                                            lVar.c.c(new t0(a2));
                                            if (i38 == 2) {
                                            }
                                            arrayList2.add(lVar);
                                        }
                                    }
                                    i10++;
                                    e21 = arrayList;
                                    size = i13;
                                    cVar5 = cVar6;
                                }
                                long j13 = 0;
                                this.t = i35;
                                this.u = j11;
                                lVarArr = (l[]) arrayList2.toArray(new l[0]);
                                this.r = lVarArr;
                                long[][] jArr = new long[lVarArr.length][];
                                int[] iArr = new int[lVarArr.length];
                                long[] jArr2 = new long[lVarArr.length];
                                boolean[] zArr = new boolean[lVarArr.length];
                                for (i11 = 0; i11 < lVarArr.length; i11++) {
                                    jArr[i11] = new long[lVarArr[i11].b.b];
                                    jArr2[i11] = lVarArr[i11].b.f[0];
                                }
                                i12 = 0;
                                while (i12 < lVarArr.length) {
                                    long j14 = Long.MAX_VALUE;
                                    int i42 = -1;
                                    for (int i43 = 0; i43 < lVarArr.length; i43++) {
                                        if (!zArr[i43]) {
                                            long j15 = jArr2[i43];
                                            if (j15 <= j14) {
                                                i42 = i43;
                                                j14 = j15;
                                            }
                                        }
                                    }
                                    int i44 = iArr[i42];
                                    long[] jArr3 = jArr[i42];
                                    jArr3[i44] = j13;
                                    s sVar2 = lVarArr[i42].b;
                                    j13 += sVar2.d[i44];
                                    int i45 = i44 + 1;
                                    iArr[i42] = i45;
                                    if (i45 < jArr3.length) {
                                        jArr2[i42] = sVar2.f[i45];
                                    } else {
                                        zArr[i42] = true;
                                        i12++;
                                    }
                                }
                                this.s = jArr;
                                this.q.A();
                                this.q.n(this);
                                arrayDeque.clear();
                                this.h = 2;
                            }
                            cVar5 = null;
                            ArrayList e212 = e.e(aVar, qVar, -9223372036854775807L, null, false, z10, new k(0));
                            size = e212.size();
                            int i352 = -1;
                            i10 = 0;
                            long j112 = -9223372036854775807L;
                            while (i10 < size) {
                            }
                            long j132 = 0;
                            this.t = i352;
                            this.u = j112;
                            lVarArr = (l[]) arrayList2.toArray(new l[0]);
                            this.r = lVarArr;
                            long[][] jArr4 = new long[lVarArr.length][];
                            int[] iArr2 = new int[lVarArr.length];
                            long[] jArr22 = new long[lVarArr.length];
                            boolean[] zArr2 = new boolean[lVarArr.length];
                            while (i11 < lVarArr.length) {
                            }
                            i12 = 0;
                            while (i12 < lVarArr.length) {
                            }
                            this.s = jArr4;
                            this.q.A();
                            this.q.n(this);
                            arrayDeque.clear();
                            this.h = 2;
                        }
                    }
                }
                cVar3 = cVar;
                cVar4 = cVar2;
                aVar = aVar4;
                cVar5 = null;
                ArrayList e2122 = e.e(aVar, qVar, -9223372036854775807L, null, false, z10, new k(0));
                size = e2122.size();
                int i3522 = -1;
                i10 = 0;
                long j1122 = -9223372036854775807L;
                while (i10 < size) {
                }
                long j1322 = 0;
                this.t = i3522;
                this.u = j1122;
                lVarArr = (l[]) arrayList2.toArray(new l[0]);
                this.r = lVarArr;
                long[][] jArr42 = new long[lVarArr.length][];
                int[] iArr22 = new int[lVarArr.length];
                long[] jArr222 = new long[lVarArr.length];
                boolean[] zArr22 = new boolean[lVarArr.length];
                while (i11 < lVarArr.length) {
                }
                i12 = 0;
                while (i12 < lVarArr.length) {
                }
                this.s = jArr42;
                this.q.A();
                this.q.n(this);
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
