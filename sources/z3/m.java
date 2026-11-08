package z3;

import a8.ia;
import e2.p0;
import e2.q0;
import e2.s0;
import e2.t0;
import f3.a0;
import f3.j0;
import f3.k0;
import f3.w;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class m implements f3.o {
    public long A;
    public f3.q B;
    public l[] C;
    public long[][] D;
    public int E;
    public o3.b F;
    public final c4.k a;
    public final int b;
    public final boolean c;
    public final x d;
    public final x e;
    public final x f;
    public final x g;
    public final ArrayDeque h;
    public final p i;
    public final ArrayList j;
    public t1 k;
    public int l;
    public int m;
    public long n;
    public int o;
    public x p;
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

    public m(c4.k kVar, int i7) {
        this.a = kVar;
        this.b = i7;
        this.c = (i7 & 256) != 0;
        g0 g0Var = i0.b;
        this.k = t1.e;
        this.l = (i7 & 4) != 0 ? 3 : 0;
        this.i = new p();
        this.j = new ArrayList();
        this.g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.a);
        this.e = new x(6);
        this.f = new x();
        this.q = -1;
        this.B = f3.q.q;
        this.C = new l[0];
    }

    @Override // f3.o
    public final boolean b(f3.p pVar) {
        t1 t1Var;
        f3.g0 m10 = q.m(pVar, false, (this.b & 2) != 0);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.b;
            t1Var = t1.e;
        }
        this.k = t1Var;
        return m10 == null;
    }

    @Override // f3.o
    public final void c(f3.q qVar) {
        if ((this.b & 16) == 0) {
            qVar = new ab.q(qVar, this.a);
        }
        this.B = qVar;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j3 == 0) {
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
            int a10 = uVar.a(j10);
            if (a10 == -1) {
                a10 = uVar.b(j10);
            }
            lVar.e = a10;
            k0 k0Var = lVar.d;
            if (k0Var != null) {
                k0Var.b = false;
                k0Var.c = 0;
            }
        }
    }

    @Override // f3.o
    public final List e() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x063c, code lost:
    
        throw e2.t0.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:163:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e A[EDGE_INSN: B:29:0x000e->B:5:0x000e BREAK  A[LOOP:0: B:8:0x0012->B:28:0x0012], SYNTHETIC] */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(f3.p pVar, f3.s sVar) {
        char c10;
        char c11;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        x xVar;
        char c12;
        char c13;
        boolean z9;
        i2.c cVar;
        boolean z10;
        boolean z11;
        if (!this.c || !this.z) {
            while (true) {
                int i14 = this.l;
                ArrayDeque arrayDeque = this.h;
                int i15 = this.b;
                x xVar2 = this.f;
                int i16 = 4;
                char c14 = 2;
                if (i14 == 0) {
                    int i17 = this.o;
                    x xVar3 = this.g;
                    if (i17 == 0) {
                        if (!pVar.c(xVar3.a, 0, 8, true)) {
                            if (this.E == 2 && (i15 & 2) != 0) {
                                j0 O1 = this.B.O1(0, 4);
                                o3.b bVar = this.F;
                                q0 q0Var = bVar == null ? null : new q0(bVar);
                                e2.t tVar = new e2.t();
                                tVar.k = q0Var;
                                f1.s(tVar, O1);
                                this.B.U0();
                                this.B.f(new f3.t(-9223372036854775807L));
                            }
                            z11 = false;
                            if (z11) {
                                break;
                            }
                        } else {
                            this.o = 8;
                            xVar3.N(0);
                            this.n = xVar3.C();
                            this.m = xVar3.m();
                        }
                    }
                    long j3 = this.n;
                    if (j3 == 1) {
                        pVar.readFully(xVar3.a, 8, 8);
                        this.o += 8;
                        this.n = xVar3.G();
                    } else if (j3 == 0) {
                        long length = pVar.getLength();
                        if (length == -1 && (cVar = (i2.c) arrayDeque.peek()) != null) {
                            length = cVar.c;
                        }
                        if (length != -1) {
                            this.n = (length - pVar.getPosition()) + this.o;
                        }
                    }
                    long j10 = this.n;
                    int i18 = this.o;
                    long j11 = i18;
                    if (j10 < j11) {
                        if (this.m != 1718773093 || i18 != 8) {
                            break;
                        }
                        this.n = j11;
                    }
                    int i19 = this.m;
                    if (i19 == 1836019574 || i19 == 1953653099 || i19 == 1835297121 || i19 == 1835626086 || i19 == 1937007212 || i19 == 1701082227 || i19 == 1835365473 || i19 == 1635284069) {
                        z10 = true;
                        long position = pVar.getPosition();
                        long j12 = this.n;
                        long j13 = this.o;
                        long j14 = (position + j12) - j13;
                        if (j12 != j13 && this.m == 1835365473) {
                            xVar2.K(8);
                            pVar.b(0, 8, xVar2.a);
                            c.a(xVar2);
                            pVar.s(xVar2.b);
                            pVar.q();
                        }
                        arrayDeque.push(new i2.c(this.m, j14));
                        if (this.n == this.o) {
                            g(j14);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i19 == 1835296868 || i19 == 1836476516 || i19 == 1751411826 || i19 == 1937011556 || i19 == 1937011827 || i19 == 1937011571 || i19 == 1668576371 || i19 == 1701606260 || i19 == 1937011555 || i19 == 1937011578 || i19 == 1937013298 || i19 == 1937007471 || i19 == 1668232756 || i19 == 1953196132 || i19 == 1718909296 || i19 == 1969517665 || i19 == 1801812339 || i19 == 1768715124) {
                        ia.p(i18 == 8);
                        ia.p(this.n <= 2147483647L);
                        x xVar4 = new x((int) this.n);
                        System.arraycopy(xVar3.a, 0, xVar4.a, 0, 8);
                        this.p = xVar4;
                        z10 = true;
                        this.l = 1;
                    } else {
                        long position2 = pVar.getPosition();
                        long j15 = this.o;
                        long j16 = position2 - j15;
                        if (this.m == 1836086884) {
                            this.F = new o3.b(0L, j16, -9223372036854775807L, j16 + j15, this.n - j15);
                        }
                        this.p = null;
                        this.l = 1;
                        z10 = true;
                    }
                    z11 = z10;
                    if (z11) {
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
                                    short s5 = 2817;
                                    short s9 = 2816;
                                    short s10 = 2192;
                                    if (i20 == 2) {
                                        long length2 = pVar.getLength();
                                        int i21 = pVar2.c - 20;
                                        x xVar5 = new x(i21);
                                        pVar.readFully(xVar5.a, 0, i21);
                                        int i22 = 0;
                                        while (i22 < i21 / 12) {
                                            xVar5.O(2);
                                            short q10 = xVar5.q();
                                            if (q10 != s10 && q10 != s9 && q10 != s5 && q10 != 2819) {
                                                if (q10 != 2820) {
                                                    xVar5.O(8);
                                                    xVar = xVar5;
                                                    i22++;
                                                    xVar5 = xVar;
                                                    s5 = 2817;
                                                    s10 = 2192;
                                                    s9 = 2816;
                                                }
                                            }
                                            xVar = xVar5;
                                            arrayList.add(new o((length2 - pVar2.c) - xVar5.o(), xVar.o()));
                                            i22++;
                                            xVar5 = xVar;
                                            s5 = 2817;
                                            s10 = 2192;
                                            s9 = 2816;
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
                                        x xVar6 = new x(length3);
                                        pVar.readFully(xVar6.a, 0, length3);
                                        int i23 = 0;
                                        while (i23 < arrayList.size()) {
                                            o oVar = (o) arrayList.get(i23);
                                            xVar6.N((int) (oVar.a - position3));
                                            xVar6.O(i16);
                                            int o4 = xVar6.o();
                                            Charset charset = StandardCharsets.UTF_8;
                                            String y10 = xVar6.y(o4, charset);
                                            switch (y10.hashCode()) {
                                                case -1711564334:
                                                    if (y10.equals("SlowMotion_Data")) {
                                                        c12 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (y10.equals("Super_SlowMotion_Edit_Data")) {
                                                        c12 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (y10.equals("Super_SlowMotion_Data")) {
                                                        c12 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (y10.equals("Super_SlowMotion_Deflickering_On")) {
                                                        c12 = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (y10.equals("Super_SlowMotion_BGM")) {
                                                        c12 = 4;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            c12 = 65535;
                                            switch (c12) {
                                                case 0:
                                                    c13 = 2192;
                                                    break;
                                                case 1:
                                                    c13 = 2819;
                                                    break;
                                                case 2:
                                                    c13 = 2816;
                                                    break;
                                                case 3:
                                                    c13 = 2820;
                                                    break;
                                                case 4:
                                                    c13 = 2817;
                                                    break;
                                                default:
                                                    throw t0.a(null, "Invalid SEF name");
                                            }
                                            int i24 = oVar.b - (o4 + 8);
                                            if (c13 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List z12 = p.e.z(xVar6.y(i24, charset));
                                                for (int i25 = 0; i25 < z12.size(); i25++) {
                                                    List z13 = p.d.z((CharSequence) z12.get(i25));
                                                    if (z13.size() != 3) {
                                                        throw t0.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new u3.a(Long.parseLong((String) z13.get(0)), 1 << (Integer.parseInt((String) z13.get(2)) - 1), Long.parseLong((String) z13.get(1))));
                                                    } catch (NumberFormatException e10) {
                                                        throw t0.a(e10, null);
                                                    }
                                                }
                                                this.j.add(new u3.b(arrayList2));
                                            } else if (c13 != 2816 && c13 != 2817 && c13 != 2819 && c13 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i23++;
                                            i16 = 4;
                                        }
                                        sVar.a = 0L;
                                    }
                                } else {
                                    x xVar7 = new x(8);
                                    pVar.readFully(xVar7.a, 0, 8);
                                    pVar2.c = xVar7.o() + 8;
                                    if (xVar7.m() != 1397048916) {
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
                            boolean z14 = true;
                            int i26 = 0;
                            int i27 = -1;
                            int i28 = -1;
                            boolean z15 = true;
                            long j17 = Long.MAX_VALUE;
                            long j18 = Long.MAX_VALUE;
                            long j19 = Long.MAX_VALUE;
                            while (true) {
                                l[] lVarArr = this.C;
                                if (i26 >= lVarArr.length) {
                                    break;
                                }
                                l lVar = lVarArr[i26];
                                int i29 = lVar.e;
                                u uVar = lVar.b;
                                char c15 = c14;
                                if (i29 != uVar.b) {
                                    long j20 = uVar.c[i29];
                                    long[][] jArr = this.D;
                                    jArr.getClass();
                                    long j21 = jArr[i26][i29];
                                    long j22 = j20 - position4;
                                    boolean z16 = j22 < 0 || j22 >= 262144;
                                    if ((!z16 && z14) || (z16 == z14 && j22 < j19)) {
                                        z14 = z16;
                                        i28 = i26;
                                        j19 = j22;
                                        j18 = j21;
                                    }
                                    if (j21 < j17) {
                                        z15 = z16;
                                        i27 = i26;
                                        j17 = j21;
                                    }
                                }
                                i26++;
                                c14 = c15;
                            }
                            c10 = c14;
                            if (j17 == Long.MAX_VALUE || !z15 || j18 < j17 + 524288) {
                                i27 = i28;
                            }
                            this.q = i27;
                            if (i27 == -1) {
                                return -1;
                            }
                        } else {
                            c10 = 2;
                        }
                        l lVar2 = this.C[this.q];
                        j0 j0Var = lVar2.c;
                        u uVar2 = lVar2.b;
                        r rVar = lVar2.a;
                        int i30 = lVar2.e;
                        long[] jArr2 = uVar2.c;
                        int[] iArr = uVar2.d;
                        long j23 = jArr2[i30] + this.A;
                        int i31 = iArr[i30];
                        k0 k0Var = lVar2.d;
                        long j24 = (j23 - position4) + this.r;
                        if (j24 < 0 || j24 >= 262144) {
                            sVar.a = j23;
                            return 1;
                        }
                        int i32 = rVar.h;
                        int i33 = rVar.k;
                        e2.u uVar3 = rVar.g;
                        if (i32 == 1) {
                            j24 += 8;
                            i31 -= 8;
                        }
                        int i34 = i31;
                        pVar.s((int) j24);
                        String str = uVar3.s;
                        String str2 = uVar3.s;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i15 & 128) == 0 : (i15 & 32) == 0) {
                            c11 = 1;
                            this.u = true;
                        } else {
                            c11 = 1;
                        }
                        if (i33 != 0) {
                            x xVar8 = this.e;
                            byte[] bArr = xVar8.a;
                            bArr[0] = 0;
                            bArr[c11] = 0;
                            bArr[c10] = 0;
                            int i35 = 4 - i33;
                            int i36 = i34 + i35;
                            while (this.s < i36) {
                                int i37 = this.t;
                                if (i37 == 0) {
                                    if (this.u || i2.o.g(uVar3) + i33 > iArr[i30] - this.r) {
                                        i11 = i33;
                                        i12 = 0;
                                    } else {
                                        i12 = i2.o.g(uVar3);
                                        i11 = i33 + i12;
                                    }
                                    pVar.readFully(bArr, i35, i11);
                                    i10 = i36;
                                    this.r += i11;
                                    xVar8.N(0);
                                    int m10 = xVar8.m();
                                    if (m10 < 0) {
                                        throw t0.a(null, "Invalid NAL length");
                                    }
                                    this.t = m10 - i12;
                                    x xVar9 = this.d;
                                    xVar9.N(0);
                                    int i38 = i12;
                                    j0Var.b(4, xVar9);
                                    this.s += 4;
                                    if (i38 > 0) {
                                        j0Var.b(i38, xVar8);
                                        this.s += i38;
                                        if (i2.o.f(bArr, i38, uVar3)) {
                                            this.u = true;
                                        }
                                    }
                                } else {
                                    i10 = i36;
                                    int e11 = j0Var.e(pVar, i37, false);
                                    this.r += e11;
                                    this.s += e11;
                                    this.t -= e11;
                                }
                                i36 = i10;
                            }
                            i7 = i36;
                        } else {
                            if ("audio/ac4".equals(str2)) {
                                if (this.s == 0) {
                                    f3.b.f(i34, xVar2);
                                    j0Var.b(7, xVar2);
                                    this.s += 7;
                                }
                                i34 += 7;
                            } else if (lVar2.f != null && Objects.equals(str2, "audio/mpeg")) {
                                e2.u uVar4 = lVar2.f;
                                xVar2.K(4);
                                pVar.b(0, 4, xVar2.a);
                                pVar.q();
                                a0 a0Var = new a0();
                                j0 j0Var2 = lVar2.c;
                                if (a0Var.a(xVar2.m()) && !Objects.equals(uVar4.s, (String) a0Var.g)) {
                                    e2.t a10 = uVar4.a();
                                    String str3 = (String) a0Var.g;
                                    str3.getClass();
                                    a10.r = s0.n(str3);
                                    uVar4 = new e2.u(a10);
                                }
                                j0Var2.g(uVar4);
                                lVar2.f = null;
                            } else if (k0Var != null) {
                                k0Var.c(pVar);
                            }
                            while (true) {
                                int i39 = this.s;
                                if (i39 >= i34) {
                                    break;
                                }
                                int e12 = j0Var.e(pVar, i34 - i39, false);
                                this.r += e12;
                                this.s += e12;
                                this.t -= e12;
                            }
                            i7 = i34;
                        }
                        long j25 = uVar2.f[i30];
                        int i40 = uVar2.g[i30];
                        if (!this.u) {
                            i40 |= 67108864;
                        }
                        int i41 = i40;
                        if (k0Var != null) {
                            k0Var.b(j0Var, j25, i41, i7, 0, null);
                            if (i30 + 1 == uVar2.b) {
                                k0Var.a(j0Var, null);
                            }
                        } else {
                            j0Var.c(j25, i41, i7, 0, null);
                        }
                        lVar2.e++;
                        this.q = -1;
                        this.r = 0;
                        this.s = 0;
                        this.t = 0;
                        this.u = false;
                        return 0;
                    }
                    long j26 = this.n - this.o;
                    long position5 = pVar.getPosition() + j26;
                    x xVar10 = this.p;
                    if (xVar10 != null) {
                        pVar.readFully(xVar10.a, this.o, (int) j26);
                        if (this.m == 1718909296) {
                            this.v = true;
                            xVar10.N(8);
                            int m11 = xVar10.m();
                            int i42 = m11 != 1751476579 ? m11 != 1903435808 ? 0 : 1 : 2;
                            if (i42 == 0) {
                                xVar10.O(4);
                                while (true) {
                                    if (xVar10.a() <= 0) {
                                        i42 = 0;
                                        break;
                                    }
                                    int m12 = xVar10.m();
                                    i42 = m12 != 1751476579 ? m12 != 1903435808 ? 0 : 1 : 2;
                                    if (i42 != 0) {
                                        break;
                                    }
                                }
                            }
                            this.E = i42;
                        } else if (!arrayDeque.isEmpty()) {
                            ((i2.c) arrayDeque.peek()).d.add(new i2.d(this.m, xVar10));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j26 < 262144) {
                            pVar.s((int) j26);
                        } else {
                            sVar.a = pVar.getPosition() + j26;
                            z9 = true;
                            g(position5);
                            if (this.w) {
                                this.y = true;
                                sVar.a = this.x;
                                this.w = false;
                                z9 = true;
                            }
                            if (!((z9 || this.l == 2) ? false : true)) {
                                return 1;
                            }
                        }
                    }
                    z9 = false;
                    g(position5);
                    if (this.w) {
                    }
                    if (!((z9 || this.l == 2) ? false : true)) {
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0132, code lost:
    
        if (((i2.a) r13).a.equals("auxiliary.tracks.offset") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (((i2.a) r13).a.equals("auxiliary.tracks.interleaved") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        if (((i2.a) r12).a.equals("auxiliary.tracks.map") != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0342  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j3) {
        char c10;
        int i7;
        ArrayList arrayList;
        q0 q0Var;
        ArrayDeque arrayDeque;
        boolean z9;
        boolean z10;
        q0 q0Var2;
        q0 q0Var3;
        boolean z11;
        ArrayList arrayList2;
        String str;
        q0 q0Var4;
        ArrayList arrayList3;
        int i10;
        l lVar;
        long j10;
        int i11;
        q0 q0Var5;
        l lVar2;
        ArrayList arrayList4;
        int i12;
        int i13;
        int i14;
        int i15;
        p0 p0Var;
        boolean z12;
        p0 p0Var2;
        p0 p0Var3;
        boolean z13;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            if (arrayDeque2.isEmpty() || ((i2.c) arrayDeque2.peek()).c != j3) {
                break;
            }
            i2.c cVar = (i2.c) arrayDeque2.pop();
            if (cVar.b == 1836019574) {
                i2.c d = cVar.d(1835365473);
                ArrayList arrayList5 = new ArrayList();
                char c11 = 3;
                long[][] jArr = null;
                boolean z14 = this.c;
                long j11 = 0;
                int i16 = this.b;
                if (d != null) {
                    q0Var = c.f(d);
                    if (this.y) {
                        q0Var.getClass();
                        p0[] p0VarArr = q0Var.a;
                        int length = p0VarArr.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                z12 = false;
                                p0Var2 = null;
                                break;
                            }
                            p0 p0Var4 = p0VarArr[i17];
                            if (i2.a.class.isAssignableFrom(p0Var4.getClass())) {
                                p0Var2 = (p0) i2.a.class.cast(p0Var4);
                                z13 = false;
                                z12 = false;
                            } else {
                                z13 = false;
                            }
                            p0Var2 = null;
                            z12 = z13;
                            if (p0Var2 != null) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        i2.a aVar = (i2.a) p0Var2;
                        if (aVar != null && aVar.b[z12 ? 1 : 0] == 0) {
                            this.A = this.x + 16;
                        }
                        int length2 = p0VarArr.length;
                        int i18 = z12 ? 1 : 0;
                        while (true) {
                            if (i18 >= length2) {
                                p0Var3 = null;
                                break;
                            }
                            p0 p0Var5 = p0VarArr[i18];
                            if (i2.a.class.isAssignableFrom(p0Var5.getClass())) {
                                p0Var3 = (p0) i2.a.class.cast(p0Var5);
                            }
                            p0Var3 = null;
                            if (p0Var3 != null) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        i2.a aVar2 = (i2.a) p0Var3;
                        aVar2.getClass();
                        ArrayList d2 = aVar2.d();
                        ArrayList arrayList6 = new ArrayList(d2.size());
                        int i19 = z12 ? 1 : 0;
                        while (i19 < d2.size()) {
                            int intValue = ((Integer) d2.get(i19)).intValue();
                            i19 = com.google.android.recaptcha.internal.a.f(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? z12 ? 1 : 0 : 4 : 3 : 2 : 1, i19, 1, arrayList6);
                        }
                        arrayList = arrayList6;
                        c10 = 3;
                        i7 = z12;
                    } else {
                        i7 = 0;
                        if (q0Var == null || (i16 & 64) == 0) {
                            c10 = 3;
                        } else {
                            p0[] p0VarArr2 = q0Var.a;
                            int length3 = p0VarArr2.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= length3) {
                                    c10 = c11;
                                    p0Var = null;
                                    break;
                                }
                                p0 p0Var6 = p0VarArr2[i20];
                                if (i2.a.class.isAssignableFrom(p0Var6.getClass())) {
                                    p0Var = (p0) i2.a.class.cast(p0Var6);
                                    c10 = c11;
                                } else {
                                    c10 = c11;
                                }
                                p0Var = null;
                                if (p0Var != null) {
                                    break;
                                }
                                i20++;
                                c11 = c10;
                            }
                            i2.a aVar3 = (i2.a) p0Var;
                            if (aVar3 != null) {
                                long G = new x(aVar3.b).G();
                                if (G > 0) {
                                    this.x = G;
                                    this.w = true;
                                    arrayDeque = arrayDeque2;
                                    z10 = z14;
                                    z9 = true;
                                    arrayDeque.clear();
                                    this.z = z9;
                                    if (!this.w && !z10) {
                                        this.l = 2;
                                    }
                                }
                            }
                        }
                        arrayList = arrayList5;
                    }
                } else {
                    c10 = 3;
                    i7 = 0;
                    arrayList = arrayList5;
                    q0Var = null;
                }
                ArrayList arrayList7 = new ArrayList();
                boolean z15 = this.E == 1 ? true : i7;
                w wVar = new w();
                i2.d e10 = cVar.e(1969517665);
                if (e10 != null) {
                    q0 j12 = c.j(e10);
                    wVar.b(j12);
                    q0Var2 = j12;
                } else {
                    q0Var2 = null;
                }
                i2.d e11 = cVar.e(1836476516);
                e11.getClass();
                p0[] p0VarArr3 = new p0[1];
                p0VarArr3[i7] = c.g(e11.c);
                q0 q0Var6 = new q0(p0VarArr3);
                if ((i16 & 1) != 0) {
                    q0Var3 = q0Var6;
                    z11 = true;
                } else {
                    q0Var3 = q0Var6;
                    z11 = i7;
                }
                q0 q0Var7 = q0Var3;
                z10 = z14;
                ArrayList i21 = c.i(cVar, wVar, -9223372036854775807L, null, z11, z15, new j(i7), this.c);
                if (this.y) {
                    boolean z16 = arrayList.size() == i21.size();
                    Locale locale = Locale.US;
                    ia.o("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + i21.size() + ")", z16);
                }
                String b10 = q.b(i21);
                long j13 = -9223372036854775807L;
                int i22 = 0;
                int i23 = 0;
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
                        q0Var4 = q0Var2;
                    } else {
                        arrayList2 = i21;
                        str = b10;
                        f3.q qVar = this.B;
                        int i27 = i23 + 1;
                        q0Var4 = q0Var2;
                        int i28 = rVar.b;
                        ArrayList arrayList8 = arrayList7;
                        e2.u uVar2 = rVar.g;
                        j0 O1 = qVar.O1(i23, i28);
                        l lVar3 = new l(rVar, uVar, O1);
                        long j14 = rVar.e;
                        if (j14 == -9223372036854775807L) {
                            j14 = uVar.i;
                        }
                        O1.d(j14);
                        long max = Math.max(j13, j14);
                        String str2 = uVar2.s;
                        String str3 = uVar2.s;
                        int i29 = "audio/true-hd".equals(str2) ? i26 * 16 : i26 + 30;
                        e2.t a10 = uVar2.a();
                        a10.s = i29;
                        if (i28 == 2) {
                            int i30 = uVar2.f;
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
                        boolean z17 = uVar.j;
                        if (!s0.m(str3) || jArr2.length <= 0) {
                            i10 = i22;
                            lVar = lVar3;
                        } else {
                            int min = Math.min(z17 ? uVar.b : iArr.length, 20);
                            ia.p(j14 != -9223372036854775807L);
                            i10 = i22;
                            lVar = lVar3;
                            long min2 = Math.min(j14, 10000000L);
                            int i32 = -1;
                            int i33 = 0;
                            int i34 = 0;
                            while (i33 < min) {
                                int i35 = z17 ? i33 : iArr[i33];
                                long j15 = jArr2[i35];
                                if (j15 > min2) {
                                    break;
                                }
                                if (j15 >= 0) {
                                    i14 = min;
                                    int i36 = uVar.d[i35];
                                    if (i36 > i34) {
                                        i34 = i36;
                                        i32 = i35;
                                    }
                                } else {
                                    i14 = min;
                                }
                                i33++;
                                min = i14;
                            }
                            if (i32 != -1) {
                                j10 = jArr2[i32];
                                if (j10 == -9223372036854775807L) {
                                    o3.c cVar2 = new o3.c(j10);
                                    i11 = 1;
                                    q0Var5 = new q0(cVar2);
                                } else {
                                    i11 = 1;
                                    q0Var5 = null;
                                }
                                if (i28 == i11 && (i12 = wVar.a) != -1 && (i13 = wVar.b) != -1) {
                                    a10.M = i12;
                                    a10.N = i13;
                                }
                                q0 q0Var8 = uVar2.l;
                                ArrayList arrayList9 = this.j;
                                q0[] q0VarArr = new q0[4];
                                q0VarArr[0] = !arrayList9.isEmpty() ? null : new q0(arrayList9);
                                q0VarArr[i11] = q0Var4;
                                q0VarArr[2] = q0Var7;
                                q0VarArr[c10] = q0Var5;
                                q.l(i28, q0Var, a10, q0Var8, q0VarArr);
                                a10.q = s0.n(str);
                                if (Objects.equals(str3, "audio/mpeg")) {
                                    lVar2 = lVar;
                                    f1.s(a10, lVar2.c);
                                } else {
                                    lVar2 = lVar;
                                    lVar2.f = new e2.u(a10);
                                }
                                if (i28 == 2 && i24 == -1) {
                                    i24 = arrayList8.size();
                                }
                                arrayList4 = arrayList8;
                                arrayList4.add(lVar2);
                                i23 = i27;
                                j13 = max;
                            }
                        }
                        j10 = -9223372036854775807L;
                        if (j10 == -9223372036854775807L) {
                        }
                        if (i28 == i11) {
                            a10.M = i12;
                            a10.N = i13;
                        }
                        q0 q0Var82 = uVar2.l;
                        ArrayList arrayList92 = this.j;
                        q0[] q0VarArr2 = new q0[4];
                        q0VarArr2[0] = !arrayList92.isEmpty() ? null : new q0(arrayList92);
                        q0VarArr2[i11] = q0Var4;
                        q0VarArr2[2] = q0Var7;
                        q0VarArr2[c10] = q0Var5;
                        q.l(i28, q0Var, a10, q0Var82, q0VarArr2);
                        a10.q = s0.n(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                        }
                        if (i28 == 2) {
                            i24 = arrayList8.size();
                        }
                        arrayList4 = arrayList8;
                        arrayList4.add(lVar2);
                        i23 = i27;
                        j13 = max;
                    }
                    i22 = i10 + 1;
                    arrayList7 = arrayList4;
                    arrayDeque2 = arrayDeque3;
                    i21 = arrayList2;
                    b10 = str;
                    q0Var2 = q0Var4;
                    arrayList = arrayList3;
                }
                arrayDeque = arrayDeque2;
                int i37 = -1;
                boolean z18 = true;
                l[] lVarArr = (l[]) arrayList7.toArray(new l[0]);
                this.C = lVarArr;
                if (!z10) {
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
                        long j16 = Long.MAX_VALUE;
                        int i40 = i37;
                        for (int i41 = 0; i41 < lVarArr.length; i41++) {
                            if (!zArr[i41]) {
                                long j17 = jArr4[i41];
                                if (j17 <= j16) {
                                    i40 = i41;
                                    j16 = j17;
                                }
                            }
                        }
                        int i42 = iArr2[i40];
                        long[] jArr5 = jArr3[i40];
                        jArr5[i42] = j11;
                        u uVar3 = lVarArr[i40].b;
                        boolean z19 = z18;
                        long[][] jArr6 = jArr3;
                        j11 += uVar3.d[i42];
                        int i43 = i42 + 1;
                        iArr2[i40] = i43;
                        if (i43 < jArr5.length) {
                            jArr4[i40] = uVar3.f[i43];
                        } else {
                            zArr[i40] = z19;
                            i39++;
                        }
                        jArr3 = jArr6;
                        z18 = z19;
                        i37 = -1;
                    }
                    jArr = jArr3;
                }
                z9 = z18;
                this.D = jArr;
                this.B.U0();
                this.B.f(new k(j13, this.C, i24));
                arrayDeque.clear();
                this.z = z9;
                if (!this.w) {
                    this.l = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((i2.c) arrayDeque2.peek()).e.add(cVar);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
