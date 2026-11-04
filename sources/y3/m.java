package y3;

import b8.zb;
import d2.r0;
import d2.s0;
import d2.u0;
import d2.v;
import d2.v0;
import e3.f0;
import e3.j0;
import e3.w;
import e3.z;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements e3.o {
    public long A;
    public e3.q B;
    public l[] C;
    public long[][] D;
    public int E;
    public n3.b F;
    public final b4.k a;
    public final int b;
    public final boolean c;
    public final y d;
    public final y e;
    public final y f;
    public final y g;
    public final ArrayDeque h;
    public final p i;
    public final ArrayList j;
    public s1 k;
    public int l;
    public int m;
    public long n;
    public int o;
    public y p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    public m(b4.k kVar, int i3) {
        this.a = kVar;
        this.b = i3;
        this.c = (i3 & 256) != 0;
        g0 g0Var = i0.b;
        this.k = s1.e;
        this.l = (i3 & 4) != 0 ? 3 : 0;
        this.i = new p();
        this.j = new ArrayList();
        this.g = new y(16);
        this.h = new ArrayDeque();
        this.d = new y(h2.o.a);
        this.e = new y(6);
        this.f = new y();
        this.q = -1;
        this.B = e3.q.k;
        this.C = new l[0];
    }

    @Override // e3.o
    public final boolean b(e3.p pVar) {
        s1 s1Var;
        f0 m10 = q.m(pVar, false, (this.b & 2) != 0);
        if (m10 != null) {
            s1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.b;
            s1Var = s1.e;
        }
        this.k = s1Var;
        return m10 == null;
    }

    @Override // e3.o
    public final void c(e3.q qVar) {
        if ((this.b & 16) == 0) {
            qVar = new b4.n(qVar, this.a);
        }
        this.B = qVar;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j10 == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            } else {
                p pVar = this.i;
                pVar.a.clear();
                pVar.b = 0;
                this.j.clear();
                return;
            }
        }
        for (l lVar : this.C) {
            u uVar = lVar.b;
            int a10 = uVar.a(j11);
            if (a10 == -1) {
                a10 = uVar.b(j11);
            }
            lVar.e = a10;
            j0 j0Var = lVar.d;
            if (j0Var != null) {
                j0Var.b = false;
                j0Var.c = 0;
            }
        }
    }

    @Override // e3.o
    public final List e() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x063c, code lost:
    
        throw d2.v0.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:163:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e A[EDGE_INSN: B:29:0x000e->B:5:0x000e BREAK  A[LOOP:0: B:8:0x0012->B:28:0x0012], SYNTHETIC] */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(e3.p pVar, e3.s sVar) {
        char c2;
        char c10;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        y yVar;
        char c11;
        char c12;
        boolean z10;
        h2.c cVar;
        boolean z11;
        boolean z12;
        if (!this.c || !this.z) {
            while (true) {
                int i14 = this.l;
                ArrayDeque arrayDeque = this.h;
                int i15 = this.b;
                y yVar2 = this.f;
                int i16 = 4;
                char c13 = 2;
                if (i14 == 0) {
                    int i17 = this.o;
                    y yVar3 = this.g;
                    if (i17 == 0) {
                        if (!pVar.d(yVar3.a, 0, 8, true)) {
                            if (this.E == 2 && (i15 & 2) != 0) {
                                e3.i0 i02 = this.B.i0(0, 4);
                                n3.b bVar = this.F;
                                s0 s0Var = bVar == null ? null : new s0(bVar);
                                d2.u uVar = new d2.u();
                                uVar.k = s0Var;
                                f1.w(uVar, i02);
                                this.B.L();
                                this.B.f(new e3.t(-9223372036854775807L));
                            }
                            z12 = false;
                            if (z12) {
                                break;
                            }
                        } else {
                            this.o = 8;
                            yVar3.N(0);
                            this.n = yVar3.C();
                            this.m = yVar3.m();
                        }
                    }
                    long j10 = this.n;
                    if (j10 == 1) {
                        pVar.readFully(yVar3.a, 8, 8);
                        this.o += 8;
                        this.n = yVar3.G();
                    } else if (j10 == 0) {
                        long length = pVar.getLength();
                        if (length == -1 && (cVar = (h2.c) arrayDeque.peek()) != null) {
                            length = cVar.c;
                        }
                        if (length != -1) {
                            this.n = (length - pVar.getPosition()) + this.o;
                        }
                    }
                    long j11 = this.n;
                    int i18 = this.o;
                    long j12 = i18;
                    if (j11 < j12) {
                        if (this.m != 1718773093 || i18 != 8) {
                            break;
                        }
                        this.n = j12;
                    }
                    int i19 = this.m;
                    if (i19 == 1836019574 || i19 == 1953653099 || i19 == 1835297121 || i19 == 1835626086 || i19 == 1937007212 || i19 == 1701082227 || i19 == 1835365473 || i19 == 1635284069) {
                        z11 = true;
                        long position = pVar.getPosition();
                        long j13 = this.n;
                        long j14 = this.o;
                        long j15 = (position + j13) - j14;
                        if (j13 != j14 && this.m == 1835365473) {
                            yVar2.K(8);
                            pVar.c(0, 8, yVar2.a);
                            d.a(yVar2);
                            pVar.u(yVar2.b);
                            pVar.o();
                        }
                        arrayDeque.push(new h2.c(this.m, j15));
                        if (this.n == this.o) {
                            g(j15);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i19 == 1835296868 || i19 == 1836476516 || i19 == 1751411826 || i19 == 1937011556 || i19 == 1937011827 || i19 == 1937011571 || i19 == 1668576371 || i19 == 1701606260 || i19 == 1937011555 || i19 == 1937011578 || i19 == 1937013298 || i19 == 1937007471 || i19 == 1668232756 || i19 == 1953196132 || i19 == 1718909296 || i19 == 1969517665 || i19 == 1801812339 || i19 == 1768715124) {
                        zb.p(i18 == 8);
                        zb.p(this.n <= 2147483647L);
                        y yVar4 = new y((int) this.n);
                        System.arraycopy(yVar3.a, 0, yVar4.a, 0, 8);
                        this.p = yVar4;
                        z11 = true;
                        this.l = 1;
                    } else {
                        long position2 = pVar.getPosition();
                        long j16 = this.o;
                        long j17 = position2 - j16;
                        if (this.m == 1836086884) {
                            this.F = new n3.b(0L, j17, -9223372036854775807L, j17 + j16, this.n - j16);
                        }
                        this.p = null;
                        this.l = 1;
                        z11 = true;
                    }
                    z12 = z11;
                    if (z12) {
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                throw new IllegalStateException();
                            }
                            p pVar2 = this.i;
                            ArrayList arrayList = pVar2.a;
                            int i20 = pVar2.b;
                            if (i20 != 0) {
                                if (i20 != 1) {
                                    short s6 = 2817;
                                    short s10 = 2816;
                                    short s11 = 2192;
                                    if (i20 == 2) {
                                        long length2 = pVar.getLength();
                                        int i21 = pVar2.c - 20;
                                        y yVar5 = new y(i21);
                                        pVar.readFully(yVar5.a, 0, i21);
                                        int i22 = 0;
                                        while (i22 < i21 / 12) {
                                            yVar5.O(2);
                                            short q10 = yVar5.q();
                                            if (q10 != s11 && q10 != s10 && q10 != s6 && q10 != 2819) {
                                                if (q10 != 2820) {
                                                    yVar5.O(8);
                                                    yVar = yVar5;
                                                    i22++;
                                                    yVar5 = yVar;
                                                    s6 = 2817;
                                                    s11 = 2192;
                                                    s10 = 2816;
                                                }
                                            }
                                            yVar = yVar5;
                                            arrayList.add(new o((length2 - pVar2.c) - yVar5.o(), yVar.o()));
                                            i22++;
                                            yVar5 = yVar;
                                            s6 = 2817;
                                            s11 = 2192;
                                            s10 = 2816;
                                        }
                                        if (arrayList.isEmpty()) {
                                            sVar.a = 0L;
                                        } else {
                                            pVar2.b = 3;
                                            sVar.a = ((o) arrayList.get(0)).a;
                                        }
                                    } else {
                                        if (i20 != 3) {
                                            throw new IllegalStateException();
                                        }
                                        long position3 = pVar.getPosition();
                                        int length3 = (int) ((pVar.getLength() - pVar.getPosition()) - pVar2.c);
                                        y yVar6 = new y(length3);
                                        pVar.readFully(yVar6.a, 0, length3);
                                        int i23 = 0;
                                        while (i23 < arrayList.size()) {
                                            o oVar = (o) arrayList.get(i23);
                                            yVar6.N((int) (oVar.a - position3));
                                            yVar6.O(i16);
                                            int o10 = yVar6.o();
                                            Charset charset = StandardCharsets.UTF_8;
                                            String y9 = yVar6.y(o10, charset);
                                            switch (y9.hashCode()) {
                                                case -1711564334:
                                                    if (y9.equals("SlowMotion_Data")) {
                                                        c11 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (y9.equals("Super_SlowMotion_Edit_Data")) {
                                                        c11 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (y9.equals("Super_SlowMotion_Data")) {
                                                        c11 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (y9.equals("Super_SlowMotion_Deflickering_On")) {
                                                        c11 = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (y9.equals("Super_SlowMotion_BGM")) {
                                                        c11 = 4;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            c11 = 65535;
                                            switch (c11) {
                                                case 0:
                                                    c12 = 2192;
                                                    break;
                                                case 1:
                                                    c12 = 2819;
                                                    break;
                                                case 2:
                                                    c12 = 2816;
                                                    break;
                                                case 3:
                                                    c12 = 2820;
                                                    break;
                                                case 4:
                                                    c12 = 2817;
                                                    break;
                                                default:
                                                    throw v0.a(null, "Invalid SEF name");
                                            }
                                            int i24 = oVar.b - (o10 + 8);
                                            if (c12 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List A = p.e.A(yVar6.y(i24, charset));
                                                for (int i25 = 0; i25 < A.size(); i25++) {
                                                    List A2 = p.d.A((CharSequence) A.get(i25));
                                                    if (A2.size() != 3) {
                                                        throw v0.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new t3.a(Long.parseLong((String) A2.get(0)), 1 << (Integer.parseInt((String) A2.get(2)) - 1), Long.parseLong((String) A2.get(1))));
                                                    } catch (NumberFormatException e10) {
                                                        throw v0.a(e10, null);
                                                    }
                                                }
                                                this.j.add(new t3.b(arrayList2));
                                            } else if (c12 != 2816 && c12 != 2817 && c12 != 2819 && c12 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i23++;
                                            i16 = 4;
                                        }
                                        sVar.a = 0L;
                                    }
                                } else {
                                    y yVar7 = new y(8);
                                    pVar.readFully(yVar7.a, 0, 8);
                                    pVar2.c = yVar7.o() + 8;
                                    if (yVar7.m() != 1397048916) {
                                        sVar.a = 0L;
                                    } else {
                                        sVar.a = pVar.getPosition() - (pVar2.c - 12);
                                        pVar2.b = 2;
                                    }
                                }
                                i13 = 1;
                            } else {
                                long length4 = pVar.getLength();
                                sVar.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                                i13 = 1;
                                pVar2.b = 1;
                            }
                            if (sVar.a != 0) {
                                return i13;
                            }
                            this.l = 0;
                            this.o = 0;
                            return i13;
                        }
                        long position4 = pVar.getPosition();
                        if (this.q == -1) {
                            boolean z13 = true;
                            int i26 = 0;
                            int i27 = -1;
                            int i28 = -1;
                            boolean z14 = true;
                            long j18 = Long.MAX_VALUE;
                            long j19 = Long.MAX_VALUE;
                            long j20 = Long.MAX_VALUE;
                            while (true) {
                                l[] lVarArr = this.C;
                                if (i26 >= lVarArr.length) {
                                    break;
                                }
                                l lVar = lVarArr[i26];
                                int i29 = lVar.e;
                                u uVar2 = lVar.b;
                                char c14 = c13;
                                if (i29 != uVar2.b) {
                                    long j21 = uVar2.c[i29];
                                    long[][] jArr = this.D;
                                    jArr.getClass();
                                    long j22 = jArr[i26][i29];
                                    long j23 = j21 - position4;
                                    boolean z15 = j23 < 0 || j23 >= 262144;
                                    if ((!z15 && z13) || (z15 == z13 && j23 < j20)) {
                                        z13 = z15;
                                        i28 = i26;
                                        j20 = j23;
                                        j19 = j22;
                                    }
                                    if (j22 < j18) {
                                        z14 = z15;
                                        i27 = i26;
                                        j18 = j22;
                                    }
                                }
                                i26++;
                                c13 = c14;
                            }
                            c2 = c13;
                            if (j18 == Long.MAX_VALUE || !z14 || j19 < j18 + 524288) {
                                i27 = i28;
                            }
                            this.q = i27;
                            if (i27 == -1) {
                                return -1;
                            }
                        } else {
                            c2 = 2;
                        }
                        l lVar2 = this.C[this.q];
                        e3.i0 i0Var = lVar2.c;
                        u uVar3 = lVar2.b;
                        r rVar = lVar2.a;
                        int i30 = lVar2.e;
                        long[] jArr2 = uVar3.c;
                        int[] iArr = uVar3.d;
                        long j24 = jArr2[i30] + this.A;
                        int i31 = iArr[i30];
                        j0 j0Var = lVar2.d;
                        long j25 = (j24 - position4) + this.r;
                        if (j25 < 0 || j25 >= 262144) {
                            sVar.a = j24;
                            return 1;
                        }
                        int i32 = rVar.h;
                        int i33 = rVar.k;
                        v vVar = rVar.g;
                        if (i32 == 1) {
                            j25 += 8;
                            i31 -= 8;
                        }
                        int i34 = i31;
                        pVar.u((int) j25);
                        String str = vVar.s;
                        String str2 = vVar.s;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i15 & 128) == 0 : (i15 & 32) == 0) {
                            c10 = 1;
                            this.u = true;
                        } else {
                            c10 = 1;
                        }
                        if (i33 != 0) {
                            y yVar8 = this.e;
                            byte[] bArr = yVar8.a;
                            bArr[0] = 0;
                            bArr[c10] = 0;
                            bArr[c2] = 0;
                            int i35 = 4 - i33;
                            int i36 = i34 + i35;
                            while (this.s < i36) {
                                int i37 = this.t;
                                if (i37 == 0) {
                                    if (this.u || h2.o.g(vVar) + i33 > iArr[i30] - this.r) {
                                        i11 = i33;
                                        i12 = 0;
                                    } else {
                                        i12 = h2.o.g(vVar);
                                        i11 = i33 + i12;
                                    }
                                    pVar.readFully(bArr, i35, i11);
                                    i10 = i36;
                                    this.r += i11;
                                    yVar8.N(0);
                                    int m10 = yVar8.m();
                                    if (m10 < 0) {
                                        throw v0.a(null, "Invalid NAL length");
                                    }
                                    this.t = m10 - i12;
                                    y yVar9 = this.d;
                                    yVar9.N(0);
                                    int i38 = i12;
                                    i0Var.e(4, yVar9);
                                    this.s += 4;
                                    if (i38 > 0) {
                                        i0Var.e(i38, yVar8);
                                        this.s += i38;
                                        if (h2.o.f(bArr, i38, vVar)) {
                                            this.u = true;
                                        }
                                    }
                                } else {
                                    i10 = i36;
                                    int a10 = i0Var.a(pVar, i37, false);
                                    this.r += a10;
                                    this.s += a10;
                                    this.t -= a10;
                                }
                                i36 = i10;
                            }
                            i3 = i36;
                        } else {
                            if ("audio/ac4".equals(str2)) {
                                if (this.s == 0) {
                                    e3.b.f(i34, yVar2);
                                    i0Var.e(7, yVar2);
                                    this.s += 7;
                                }
                                i34 += 7;
                            } else if (lVar2.f != null && Objects.equals(str2, "audio/mpeg")) {
                                v vVar2 = lVar2.f;
                                yVar2.K(4);
                                pVar.c(0, 4, yVar2.a);
                                pVar.o();
                                z zVar = new z();
                                e3.i0 i0Var2 = lVar2.c;
                                if (zVar.a(yVar2.m()) && !Objects.equals(vVar2.s, (String) zVar.g)) {
                                    d2.u a11 = vVar2.a();
                                    String str3 = (String) zVar.g;
                                    str3.getClass();
                                    a11.r = u0.n(str3);
                                    vVar2 = new v(a11);
                                }
                                i0Var2.g(vVar2);
                                lVar2.f = null;
                            } else if (j0Var != null) {
                                j0Var.c(pVar);
                            }
                            while (true) {
                                int i39 = this.s;
                                if (i39 >= i34) {
                                    break;
                                }
                                int a12 = i0Var.a(pVar, i34 - i39, false);
                                this.r += a12;
                                this.s += a12;
                                this.t -= a12;
                            }
                            i3 = i34;
                        }
                        long j26 = uVar3.f[i30];
                        int i40 = uVar3.g[i30];
                        if (!this.u) {
                            i40 |= 67108864;
                        }
                        int i41 = i40;
                        if (j0Var != null) {
                            j0Var.b(i0Var, j26, i41, i3, 0, null);
                            if (i30 + 1 == uVar3.b) {
                                j0Var.a(i0Var, null);
                            }
                        } else {
                            i0Var.d(j26, i41, i3, 0, null);
                        }
                        lVar2.e++;
                        this.q = -1;
                        this.r = 0;
                        this.s = 0;
                        this.t = 0;
                        this.u = false;
                        return 0;
                    }
                    long j27 = this.n - this.o;
                    long position5 = pVar.getPosition() + j27;
                    y yVar10 = this.p;
                    if (yVar10 != null) {
                        pVar.readFully(yVar10.a, this.o, (int) j27);
                        if (this.m == 1718909296) {
                            this.v = true;
                            yVar10.N(8);
                            int m11 = yVar10.m();
                            int i42 = m11 != 1751476579 ? m11 != 1903435808 ? 0 : 1 : 2;
                            if (i42 == 0) {
                                yVar10.O(4);
                                while (true) {
                                    if (yVar10.a() <= 0) {
                                        i42 = 0;
                                        break;
                                    }
                                    int m12 = yVar10.m();
                                    i42 = m12 != 1751476579 ? m12 != 1903435808 ? 0 : 1 : 2;
                                    if (i42 != 0) {
                                        break;
                                    }
                                }
                            }
                            this.E = i42;
                        } else if (!arrayDeque.isEmpty()) {
                            ((h2.c) arrayDeque.peek()).d.add(new h2.d(this.m, yVar10));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j27 < 262144) {
                            pVar.u((int) j27);
                        } else {
                            sVar.a = pVar.getPosition() + j27;
                            z10 = true;
                            g(position5);
                            if (this.w) {
                                this.y = true;
                                sVar.a = this.x;
                                this.w = false;
                                z10 = true;
                            }
                            if (!((z10 || this.l == 2) ? false : true)) {
                                return 1;
                            }
                        }
                    }
                    z10 = false;
                    g(position5);
                    if (this.w) {
                    }
                    if (!((z10 || this.l == 2) ? false : true)) {
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0130, code lost:
    
        if (((h2.a) r13).a.equals("auxiliary.tracks.offset") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (((h2.a) r3).a.equals("auxiliary.tracks.interleaved") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (((h2.a) r12).a.equals("auxiliary.tracks.map") != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j10) {
        char c2;
        int i3;
        ArrayList arrayList;
        s0 s0Var;
        ArrayDeque arrayDeque;
        boolean z10;
        boolean z11;
        s0 s0Var2;
        s0 s0Var3;
        boolean z12;
        ArrayList arrayList2;
        String str;
        s0 s0Var4;
        ArrayList arrayList3;
        int i10;
        l lVar;
        long j11;
        int i11;
        s0 s0Var5;
        l lVar2;
        ArrayList arrayList4;
        int i12;
        int i13;
        int i14;
        int i15;
        r0 r0Var;
        r0 r0Var2;
        r0 r0Var3;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            if (arrayDeque2.isEmpty() || ((h2.c) arrayDeque2.peek()).c != j10) {
                break;
            }
            h2.c cVar = (h2.c) arrayDeque2.pop();
            if (cVar.b == 1836019574) {
                h2.c d = cVar.d(1835365473);
                ArrayList arrayList5 = new ArrayList();
                char c10 = 3;
                long[][] jArr = null;
                boolean z13 = this.c;
                long j12 = 0;
                int i16 = this.b;
                if (d != null) {
                    s0Var = d.f(d);
                    if (this.y) {
                        s0Var.getClass();
                        r0[] r0VarArr = s0Var.a;
                        int length = r0VarArr.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                i3 = 0;
                                r0Var2 = null;
                                break;
                            }
                            r0 r0Var4 = r0VarArr[i17];
                            i3 = 0;
                            if (h2.a.class.isAssignableFrom(r0Var4.getClass())) {
                                r0Var2 = (r0) h2.a.class.cast(r0Var4);
                            }
                            r0Var2 = null;
                            if (r0Var2 != null) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        h2.a aVar = (h2.a) r0Var2;
                        if (aVar != null && aVar.b[i3] == 0) {
                            this.A = this.x + 16;
                        }
                        int length2 = r0VarArr.length;
                        int i18 = i3;
                        while (true) {
                            if (i18 >= length2) {
                                r0Var3 = null;
                                break;
                            }
                            r0 r0Var5 = r0VarArr[i18];
                            if (h2.a.class.isAssignableFrom(r0Var5.getClass())) {
                                r0Var3 = (r0) h2.a.class.cast(r0Var5);
                            }
                            r0Var3 = null;
                            if (r0Var3 != null) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        h2.a aVar2 = (h2.a) r0Var3;
                        aVar2.getClass();
                        ArrayList d10 = aVar2.d();
                        ArrayList arrayList6 = new ArrayList(d10.size());
                        int i19 = i3;
                        while (i19 < d10.size()) {
                            int intValue = ((Integer) d10.get(i19)).intValue();
                            i19 = com.google.android.recaptcha.internal.a.f(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? i3 : 4 : 3 : 2 : 1, i19, 1, arrayList6);
                        }
                        arrayList = arrayList6;
                        c2 = 3;
                    } else {
                        i3 = 0;
                        if (s0Var == null || (i16 & 64) == 0) {
                            c2 = 3;
                        } else {
                            r0[] r0VarArr2 = s0Var.a;
                            int length3 = r0VarArr2.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= length3) {
                                    c2 = c10;
                                    r0Var = null;
                                    break;
                                }
                                r0 r0Var6 = r0VarArr2[i20];
                                if (h2.a.class.isAssignableFrom(r0Var6.getClass())) {
                                    r0Var = (r0) h2.a.class.cast(r0Var6);
                                    c2 = c10;
                                } else {
                                    c2 = c10;
                                }
                                r0Var = null;
                                if (r0Var != null) {
                                    break;
                                }
                                i20++;
                                c10 = c2;
                            }
                            h2.a aVar3 = (h2.a) r0Var;
                            if (aVar3 != null) {
                                long G = new y(aVar3.b).G();
                                if (G > 0) {
                                    this.x = G;
                                    this.w = true;
                                    arrayDeque = arrayDeque2;
                                    z11 = z13;
                                    z10 = true;
                                    arrayDeque.clear();
                                    this.z = z10;
                                    if (!this.w && !z11) {
                                        this.l = 2;
                                    }
                                }
                            }
                        }
                        arrayList = arrayList5;
                    }
                } else {
                    c2 = 3;
                    i3 = 0;
                    arrayList = arrayList5;
                    s0Var = null;
                }
                ArrayList arrayList7 = new ArrayList();
                boolean z14 = this.E == 1 ? 1 : i3;
                w wVar = new w();
                h2.d e10 = cVar.e(1969517665);
                if (e10 != null) {
                    s0 j13 = d.j(e10);
                    wVar.b(j13);
                    s0Var2 = j13;
                } else {
                    s0Var2 = null;
                }
                h2.d e11 = cVar.e(1836476516);
                e11.getClass();
                r0[] r0VarArr3 = new r0[1];
                r0VarArr3[i3] = d.g(e11.c);
                s0 s0Var6 = new s0(r0VarArr3);
                if ((i16 & 1) != 0) {
                    s0Var3 = s0Var6;
                    z12 = 1;
                } else {
                    s0Var3 = s0Var6;
                    z12 = i3;
                }
                s0 s0Var7 = s0Var3;
                z11 = z13;
                ArrayList i21 = d.i(cVar, wVar, -9223372036854775807L, null, z12, z14, new u9.j(27), this.c);
                if (this.y) {
                    boolean z15 = arrayList.size() == i21.size() ? 1 : i3;
                    Locale locale = Locale.US;
                    zb.o("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + i21.size() + ")", z15);
                }
                String b10 = q.b(i21);
                int i22 = i3;
                int i23 = i22;
                long j14 = -9223372036854775807L;
                int i24 = -1;
                while (i22 < i21.size()) {
                    u uVar = (u) i21.get(i22);
                    int i25 = uVar.b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    long[] jArr2 = uVar.f;
                    int i26 = uVar.e;
                    r rVar = uVar.a;
                    if (i25 == 0) {
                        arrayList3 = arrayList;
                        arrayList2 = i21;
                        str = b10;
                        i10 = i22;
                        arrayList4 = arrayList7;
                        s0Var4 = s0Var2;
                    } else {
                        arrayList2 = i21;
                        str = b10;
                        e3.q qVar = this.B;
                        int i27 = i23 + 1;
                        s0Var4 = s0Var2;
                        int i28 = rVar.b;
                        ArrayList arrayList8 = arrayList7;
                        v vVar = rVar.g;
                        e3.i0 i02 = qVar.i0(i23, i28);
                        l lVar3 = new l(rVar, uVar, i02);
                        long j15 = rVar.e;
                        if (j15 == -9223372036854775807L) {
                            j15 = uVar.i;
                        }
                        i02.b(j15);
                        long max = Math.max(j14, j15);
                        String str2 = vVar.s;
                        String str3 = vVar.s;
                        int i29 = "audio/true-hd".equals(str2) ? i26 * 16 : i26 + 30;
                        d2.u a10 = vVar.a();
                        a10.s = i29;
                        if (i28 == 2) {
                            int i30 = vVar.f;
                            if ((i16 & 8) != 0) {
                                i30 |= i24 == -1 ? 1 : 2;
                            }
                            int i31 = i30;
                            if (this.y) {
                                i15 = i31 | 32768;
                                arrayList3 = arrayList;
                                a10.g = ((Integer) arrayList.get(i22)).intValue();
                            } else {
                                arrayList3 = arrayList;
                                i15 = i31;
                            }
                            a10.f = i15;
                        } else {
                            arrayList3 = arrayList;
                        }
                        int[] iArr = uVar.h;
                        boolean z16 = uVar.j;
                        if (!u0.m(str3) || jArr2.length <= 0) {
                            i10 = i22;
                            lVar = lVar3;
                        } else {
                            int min = Math.min(z16 ? uVar.b : iArr.length, 20);
                            zb.p(j15 != -9223372036854775807L ? 1 : i3);
                            i10 = i22;
                            lVar = lVar3;
                            long min2 = Math.min(j15, 10000000L);
                            int i32 = i3;
                            int i33 = i32;
                            int i34 = -1;
                            while (i32 < min) {
                                int i35 = z16 ? i32 : iArr[i32];
                                long j16 = jArr2[i35];
                                if (j16 > min2) {
                                    break;
                                }
                                if (j16 >= 0) {
                                    i14 = min;
                                    int i36 = uVar.d[i35];
                                    if (i36 > i33) {
                                        i33 = i36;
                                        i34 = i35;
                                    }
                                } else {
                                    i14 = min;
                                }
                                i32++;
                                min = i14;
                            }
                            if (i34 != -1) {
                                j11 = jArr2[i34];
                                if (j11 == -9223372036854775807L) {
                                    n3.c cVar2 = new n3.c(j11);
                                    i11 = 1;
                                    r0[] r0VarArr4 = new r0[1];
                                    r0VarArr4[i3] = cVar2;
                                    s0Var5 = new s0(r0VarArr4);
                                } else {
                                    i11 = 1;
                                    s0Var5 = null;
                                }
                                if (i28 == i11 && (i12 = wVar.a) != -1 && (i13 = wVar.b) != -1) {
                                    a10.M = i12;
                                    a10.N = i13;
                                }
                                s0 s0Var8 = vVar.l;
                                ArrayList arrayList9 = this.j;
                                s0[] s0VarArr = new s0[4];
                                s0VarArr[i3] = !arrayList9.isEmpty() ? null : new s0(arrayList9);
                                s0VarArr[i11] = s0Var4;
                                s0VarArr[2] = s0Var7;
                                s0VarArr[c2] = s0Var5;
                                q.l(i28, s0Var, a10, s0Var8, s0VarArr);
                                a10.q = u0.n(str);
                                if (Objects.equals(str3, "audio/mpeg")) {
                                    lVar2 = lVar;
                                    f1.w(a10, lVar2.c);
                                } else {
                                    lVar2 = lVar;
                                    lVar2.f = new v(a10);
                                }
                                if (i28 == 2 && i24 == -1) {
                                    i24 = arrayList8.size();
                                }
                                arrayList4 = arrayList8;
                                arrayList4.add(lVar2);
                                i23 = i27;
                                j14 = max;
                            }
                        }
                        j11 = -9223372036854775807L;
                        if (j11 == -9223372036854775807L) {
                        }
                        if (i28 == i11) {
                            a10.M = i12;
                            a10.N = i13;
                        }
                        s0 s0Var82 = vVar.l;
                        ArrayList arrayList92 = this.j;
                        s0[] s0VarArr2 = new s0[4];
                        s0VarArr2[i3] = !arrayList92.isEmpty() ? null : new s0(arrayList92);
                        s0VarArr2[i11] = s0Var4;
                        s0VarArr2[2] = s0Var7;
                        s0VarArr2[c2] = s0Var5;
                        q.l(i28, s0Var, a10, s0Var82, s0VarArr2);
                        a10.q = u0.n(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                        }
                        if (i28 == 2) {
                            i24 = arrayList8.size();
                        }
                        arrayList4 = arrayList8;
                        arrayList4.add(lVar2);
                        i23 = i27;
                        j14 = max;
                    }
                    i22 = i10 + 1;
                    arrayList7 = arrayList4;
                    arrayDeque2 = arrayDeque3;
                    i21 = arrayList2;
                    b10 = str;
                    s0Var2 = s0Var4;
                    arrayList = arrayList3;
                }
                arrayDeque = arrayDeque2;
                int i37 = -1;
                boolean z17 = true;
                l[] lVarArr = (l[]) arrayList7.toArray(new l[i3]);
                this.C = lVarArr;
                if (!z11) {
                    long[][] jArr3 = new long[lVarArr.length][];
                    int[] iArr2 = new int[lVarArr.length];
                    long[] jArr4 = new long[lVarArr.length];
                    boolean[] zArr = new boolean[lVarArr.length];
                    for (int i38 = 0; i38 < lVarArr.length; i38++) {
                        jArr3[i38] = new long[lVarArr[i38].b.b];
                        jArr4[i38] = lVarArr[i38].b.f[0];
                    }
                    int i39 = 0;
                    while (i39 < lVarArr.length) {
                        long j17 = Long.MAX_VALUE;
                        int i40 = i37;
                        for (int i41 = 0; i41 < lVarArr.length; i41++) {
                            if (!zArr[i41]) {
                                long j18 = jArr4[i41];
                                if (j18 <= j17) {
                                    i40 = i41;
                                    j17 = j18;
                                }
                            }
                        }
                        int i42 = iArr2[i40];
                        long[] jArr5 = jArr3[i40];
                        jArr5[i42] = j12;
                        u uVar2 = lVarArr[i40].b;
                        boolean z18 = z17;
                        long[][] jArr6 = jArr3;
                        j12 += uVar2.d[i42];
                        int i43 = i42 + 1;
                        iArr2[i40] = i43;
                        if (i43 < jArr5.length) {
                            jArr4[i40] = uVar2.f[i43];
                        } else {
                            zArr[i40] = z18;
                            i39++;
                        }
                        jArr3 = jArr6;
                        z17 = z18;
                        i37 = -1;
                    }
                    jArr = jArr3;
                }
                z10 = z17;
                this.D = jArr;
                this.B.L();
                this.B.f(new k(j14, this.C, i24));
                arrayDeque.clear();
                this.z = z10;
                if (!this.w) {
                    this.l = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((h2.c) arrayDeque2.peek()).e.add(cVar);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
