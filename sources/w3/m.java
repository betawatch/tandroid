package w3;

import b2.t0;
import b2.u0;
import b2.w;
import b2.w0;
import b2.x0;
import c3.f0;
import c3.i0;
import c3.j0;
import c3.z;
import com.google.android.gms.internal.play_billing.k3;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class m implements c3.o {
    public long A;
    public c3.q B;
    public l[] C;
    public long[][] D;
    public int E;
    public l3.b F;
    public final z3.l a;
    public final int b;
    public final boolean c;
    public final x d;
    public final x e;
    public final x f;
    public final x g;
    public final ArrayDeque h;
    public final p i;
    public final ArrayList j;
    public x1 k;
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

    public m(z3.l lVar, int i10) {
        this.a = lVar;
        this.b = i10;
        this.c = (i10 & 256) != 0;
        l0 l0Var = n0.b;
        this.k = x1.e;
        this.l = (i10 & 4) != 0 ? 3 : 0;
        this.i = new p();
        this.j = new ArrayList();
        this.g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.p.a);
        this.e = new x(6);
        this.f = new x();
        this.q = -1;
        this.B = c3.q.i;
        this.C = new l[0];
    }

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        x1 x1Var;
        f0 m10 = q.m(pVar, false, (this.b & 2) != 0);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.b;
            x1Var = x1.e;
        }
        this.k = x1Var;
        return m10 == null;
    }

    @Override // c3.o
    public final void c(c3.q qVar) {
        if ((this.b & 16) == 0) {
            qVar = new c2.b(qVar, this.a);
        }
        this.B = qVar;
    }

    @Override // c3.o
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
            int a2 = uVar.a(j11);
            if (a2 == -1) {
                a2 = uVar.b(j11);
            }
            lVar.e = a2;
            j0 j0Var = lVar.d;
            if (j0Var != null) {
                j0Var.b = false;
                j0Var.c = 0;
            }
        }
    }

    @Override // c3.o
    public final List e() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x063e, code lost:
    
        throw b2.x0.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:163:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e A[EDGE_INSN: B:29:0x000e->B:5:0x000e BREAK  A[LOOP:0: B:8:0x0012->B:28:0x0012], SYNTHETIC] */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(c3.p pVar, c3.s sVar) {
        char c10;
        char c11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        x xVar;
        char c12;
        char c13;
        boolean z10;
        f2.c cVar;
        boolean z11;
        boolean z12;
        if (!this.c || !this.z) {
            while (true) {
                int i15 = this.l;
                ArrayDeque arrayDeque = this.h;
                int i16 = this.b;
                x xVar2 = this.f;
                int i17 = 4;
                char c14 = 2;
                if (i15 == 0) {
                    int i18 = this.o;
                    x xVar3 = this.g;
                    if (i18 == 0) {
                        if (!pVar.d(xVar3.a, 0, 8, true)) {
                            if (this.E == 2 && (i16 & 2) != 0) {
                                i0 a02 = this.B.a0(0, 4);
                                l3.b bVar = this.F;
                                u0 u0Var = bVar == null ? null : new u0(bVar);
                                w wVar = new w();
                                wVar.k = u0Var;
                                i2.d.s(wVar, a02);
                                this.B.D();
                                this.B.K(new c3.t(-9223372036854775807L));
                            }
                            z12 = false;
                            if (z12) {
                                break;
                            }
                        } else {
                            this.o = 8;
                            xVar3.N(0);
                            this.n = xVar3.C();
                            this.m = xVar3.m();
                        }
                    }
                    long j10 = this.n;
                    if (j10 == 1) {
                        pVar.readFully(xVar3.a, 8, 8);
                        this.o += 8;
                        this.n = xVar3.G();
                    } else if (j10 == 0) {
                        long length = pVar.getLength();
                        if (length == -1 && (cVar = (f2.c) arrayDeque.peek()) != null) {
                            length = cVar.c;
                        }
                        if (length != -1) {
                            this.n = (length - pVar.getPosition()) + this.o;
                        }
                    }
                    long j11 = this.n;
                    int i19 = this.o;
                    long j12 = i19;
                    if (j11 < j12) {
                        if (this.m != 1718773093 || i19 != 8) {
                            break;
                        }
                        this.n = j12;
                    }
                    int i20 = this.m;
                    if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1701082227 || i20 == 1835365473 || i20 == 1635284069) {
                        z11 = true;
                        long position = pVar.getPosition();
                        long j13 = this.n;
                        long j14 = this.o;
                        long j15 = (position + j13) - j14;
                        if (j13 != j14 && this.m == 1835365473) {
                            xVar2.K(8);
                            pVar.a(0, 8, xVar2.a);
                            d.a(xVar2);
                            pVar.r(xVar2.b);
                            pVar.q();
                        }
                        arrayDeque.push(new f2.c(this.m, j15));
                        if (this.n == this.o) {
                            g(j15);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i20 == 1835296868 || i20 == 1836476516 || i20 == 1751411826 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1937011571 || i20 == 1668576371 || i20 == 1701606260 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1953196132 || i20 == 1718909296 || i20 == 1969517665 || i20 == 1801812339 || i20 == 1768715124) {
                        u6.p(i19 == 8);
                        u6.p(this.n <= 2147483647L);
                        x xVar4 = new x((int) this.n);
                        System.arraycopy(xVar3.a, 0, xVar4.a, 0, 8);
                        this.p = xVar4;
                        z11 = true;
                        this.l = 1;
                    } else {
                        long position2 = pVar.getPosition();
                        long j16 = this.o;
                        long j17 = position2 - j16;
                        if (this.m == 1836086884) {
                            this.F = new l3.b(0L, j17, -9223372036854775807L, j17 + j16, this.n - j16);
                        }
                        this.p = null;
                        this.l = 1;
                        z11 = true;
                    }
                    z12 = z11;
                    if (z12) {
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new IllegalStateException();
                            }
                            p pVar2 = this.i;
                            ArrayList arrayList = pVar2.a;
                            int i21 = pVar2.b;
                            if (i21 != 0) {
                                if (i21 != 1) {
                                    short s10 = 2817;
                                    short s11 = 2816;
                                    short s12 = 2192;
                                    if (i21 == 2) {
                                        long length2 = pVar.getLength();
                                        int i22 = pVar2.c - 20;
                                        x xVar5 = new x(i22);
                                        pVar.readFully(xVar5.a, 0, i22);
                                        int i23 = 0;
                                        while (i23 < i22 / 12) {
                                            xVar5.O(2);
                                            short q6 = xVar5.q();
                                            if (q6 != s12 && q6 != s11 && q6 != s10 && q6 != 2819) {
                                                if (q6 != 2820) {
                                                    xVar5.O(8);
                                                    xVar = xVar5;
                                                    i23++;
                                                    xVar5 = xVar;
                                                    s10 = 2817;
                                                    s12 = 2192;
                                                    s11 = 2816;
                                                }
                                            }
                                            xVar = xVar5;
                                            arrayList.add(new o((length2 - pVar2.c) - xVar5.o(), xVar.o()));
                                            i23++;
                                            xVar5 = xVar;
                                            s10 = 2817;
                                            s12 = 2192;
                                            s11 = 2816;
                                        }
                                        if (arrayList.isEmpty()) {
                                            sVar.a = 0L;
                                        } else {
                                            pVar2.b = 3;
                                            sVar.a = ((o) arrayList.get(0)).a;
                                        }
                                    } else {
                                        if (i21 != 3) {
                                            throw new IllegalStateException();
                                        }
                                        long position3 = pVar.getPosition();
                                        int length3 = (int) ((pVar.getLength() - pVar.getPosition()) - pVar2.c);
                                        x xVar6 = new x(length3);
                                        pVar.readFully(xVar6.a, 0, length3);
                                        int i24 = 0;
                                        while (i24 < arrayList.size()) {
                                            o oVar = (o) arrayList.get(i24);
                                            xVar6.N((int) (oVar.a - position3));
                                            xVar6.O(i17);
                                            int o10 = xVar6.o();
                                            Charset charset = StandardCharsets.UTF_8;
                                            String y3 = xVar6.y(o10, charset);
                                            switch (y3.hashCode()) {
                                                case -1711564334:
                                                    if (y3.equals("SlowMotion_Data")) {
                                                        c12 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (y3.equals("Super_SlowMotion_Edit_Data")) {
                                                        c12 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (y3.equals("Super_SlowMotion_Data")) {
                                                        c12 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (y3.equals("Super_SlowMotion_Deflickering_On")) {
                                                        c12 = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (y3.equals("Super_SlowMotion_BGM")) {
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
                                                    throw x0.a(null, "Invalid SEF name");
                                            }
                                            int i25 = oVar.b - (o10 + 8);
                                            if (c13 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List B = p.e.B(xVar6.y(i25, charset));
                                                for (int i26 = 0; i26 < B.size(); i26++) {
                                                    List B2 = p.d.B((CharSequence) B.get(i26));
                                                    if (B2.size() != 3) {
                                                        throw x0.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new r3.a(Long.parseLong((String) B2.get(0)), Long.parseLong((String) B2.get(1)), 1 << (Integer.parseInt((String) B2.get(2)) - 1)));
                                                    } catch (NumberFormatException e) {
                                                        throw x0.a(e, null);
                                                    }
                                                }
                                                this.j.add(new r3.b(arrayList2));
                                            } else if (c13 != 2816 && c13 != 2817 && c13 != 2819 && c13 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i24++;
                                            i17 = 4;
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
                                i14 = 1;
                            } else {
                                long length4 = pVar.getLength();
                                sVar.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                                i14 = 1;
                                pVar2.b = 1;
                            }
                            if (sVar.a != 0) {
                                return i14;
                            }
                            this.l = 0;
                            this.o = 0;
                            return i14;
                        }
                        long position4 = pVar.getPosition();
                        if (this.q == -1) {
                            boolean z13 = true;
                            int i27 = 0;
                            int i28 = -1;
                            int i29 = -1;
                            boolean z14 = true;
                            long j18 = Long.MAX_VALUE;
                            long j19 = Long.MAX_VALUE;
                            long j20 = Long.MAX_VALUE;
                            while (true) {
                                l[] lVarArr = this.C;
                                if (i27 >= lVarArr.length) {
                                    break;
                                }
                                l lVar = lVarArr[i27];
                                int i30 = lVar.e;
                                u uVar = lVar.b;
                                char c15 = c14;
                                if (i30 != uVar.b) {
                                    long j21 = uVar.c[i30];
                                    long[][] jArr = this.D;
                                    jArr.getClass();
                                    long j22 = jArr[i27][i30];
                                    long j23 = j21 - position4;
                                    boolean z15 = j23 < 0 || j23 >= 262144;
                                    if ((!z15 && z13) || (z15 == z13 && j23 < j20)) {
                                        z13 = z15;
                                        i29 = i27;
                                        j20 = j23;
                                        j19 = j22;
                                    }
                                    if (j22 < j18) {
                                        z14 = z15;
                                        i28 = i27;
                                        j18 = j22;
                                    }
                                }
                                i27++;
                                c14 = c15;
                            }
                            c10 = c14;
                            if (j18 == Long.MAX_VALUE || !z14 || j19 < j18 + 524288) {
                                i28 = i29;
                            }
                            this.q = i28;
                            if (i28 == -1) {
                                return -1;
                            }
                        } else {
                            c10 = 2;
                        }
                        l lVar2 = this.C[this.q];
                        i0 i0Var = lVar2.c;
                        u uVar2 = lVar2.b;
                        r rVar = lVar2.a;
                        int i31 = lVar2.e;
                        long[] jArr2 = uVar2.c;
                        int[] iArr = uVar2.d;
                        long j24 = jArr2[i31] + this.A;
                        int i32 = iArr[i31];
                        j0 j0Var = lVar2.d;
                        long j25 = (j24 - position4) + this.r;
                        if (j25 < 0 || j25 >= 262144) {
                            sVar.a = j24;
                            return 1;
                        }
                        int i33 = rVar.h;
                        int i34 = rVar.k;
                        b2.x xVar8 = rVar.g;
                        if (i33 == 1) {
                            j25 += 8;
                            i32 -= 8;
                        }
                        int i35 = i32;
                        pVar.r((int) j25);
                        String str = xVar8.s;
                        String str2 = xVar8.s;
                        if (!Objects.equals(str, MediaController.VIDEO_MIME_TYPE) ? !Objects.equals(str2, "video/hevc") || (i16 & 128) == 0 : (i16 & 32) == 0) {
                            c11 = 1;
                            this.u = true;
                        } else {
                            c11 = 1;
                        }
                        if (i34 != 0) {
                            x xVar9 = this.e;
                            byte[] bArr = xVar9.a;
                            bArr[0] = 0;
                            bArr[c11] = 0;
                            bArr[c10] = 0;
                            int i36 = 4 - i34;
                            int i37 = i35 + i36;
                            while (this.s < i37) {
                                int i38 = this.t;
                                if (i38 == 0) {
                                    if (this.u || f2.p.g(xVar8) + i34 > iArr[i31] - this.r) {
                                        i12 = i34;
                                        i13 = 0;
                                    } else {
                                        i13 = f2.p.g(xVar8);
                                        i12 = i34 + i13;
                                    }
                                    pVar.readFully(bArr, i36, i12);
                                    i11 = i37;
                                    this.r += i12;
                                    xVar9.N(0);
                                    int m10 = xVar9.m();
                                    if (m10 < 0) {
                                        throw x0.a(null, "Invalid NAL length");
                                    }
                                    this.t = m10 - i13;
                                    x xVar10 = this.d;
                                    xVar10.N(0);
                                    int i39 = i13;
                                    i0Var.d(4, xVar10);
                                    this.s += 4;
                                    if (i39 > 0) {
                                        i0Var.d(i39, xVar9);
                                        this.s += i39;
                                        if (f2.p.f(bArr, i39, xVar8)) {
                                            this.u = true;
                                        }
                                    }
                                } else {
                                    i11 = i37;
                                    int a2 = i0Var.a(pVar, i38, false);
                                    this.r += a2;
                                    this.s += a2;
                                    this.t -= a2;
                                }
                                i37 = i11;
                            }
                            i10 = i37;
                        } else {
                            if ("audio/ac4".equals(str2)) {
                                if (this.s == 0) {
                                    c3.b.f(i35, xVar2);
                                    i0Var.d(7, xVar2);
                                    this.s += 7;
                                }
                                i35 += 7;
                            } else if (lVar2.f != null && Objects.equals(str2, "audio/mpeg")) {
                                b2.x xVar11 = lVar2.f;
                                xVar2.K(4);
                                pVar.a(0, 4, xVar2.a);
                                pVar.q();
                                z zVar = new z();
                                i0 i0Var2 = lVar2.c;
                                if (zVar.a(xVar2.m()) && !Objects.equals(xVar11.s, (String) zVar.g)) {
                                    w a10 = xVar11.a();
                                    String str3 = (String) zVar.g;
                                    str3.getClass();
                                    a10.r = w0.n(str3);
                                    xVar11 = new b2.x(a10);
                                }
                                i0Var2.b(xVar11);
                                lVar2.f = null;
                            } else if (j0Var != null) {
                                j0Var.c(pVar);
                            }
                            while (true) {
                                int i40 = this.s;
                                if (i40 >= i35) {
                                    break;
                                }
                                int a11 = i0Var.a(pVar, i35 - i40, false);
                                this.r += a11;
                                this.s += a11;
                                this.t -= a11;
                            }
                            i10 = i35;
                        }
                        long j26 = uVar2.f[i31];
                        int i41 = uVar2.g[i31];
                        if (!this.u) {
                            i41 |= 67108864;
                        }
                        int i42 = i41;
                        if (j0Var != null) {
                            j0Var.b(i0Var, j26, i42, i10, 0, null);
                            if (i31 + 1 == uVar2.b) {
                                j0Var.a(i0Var, null);
                            }
                        } else {
                            i0Var.c(j26, i42, i10, 0, null);
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
                    x xVar12 = this.p;
                    if (xVar12 != null) {
                        pVar.readFully(xVar12.a, this.o, (int) j27);
                        if (this.m == 1718909296) {
                            this.v = true;
                            xVar12.N(8);
                            int m11 = xVar12.m();
                            int i43 = m11 != 1751476579 ? m11 != 1903435808 ? 0 : 1 : 2;
                            if (i43 == 0) {
                                xVar12.O(4);
                                while (true) {
                                    if (xVar12.a() <= 0) {
                                        i43 = 0;
                                        break;
                                    }
                                    int m12 = xVar12.m();
                                    i43 = m12 != 1751476579 ? m12 != 1903435808 ? 0 : 1 : 2;
                                    if (i43 != 0) {
                                        break;
                                    }
                                }
                            }
                            this.E = i43;
                        } else if (!arrayDeque.isEmpty()) {
                            ((f2.c) arrayDeque.peek()).d.add(new f2.d(this.m, xVar12));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j27 < 262144) {
                            pVar.r((int) j27);
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
    
        if (((f2.a) r13).a.equals("auxiliary.tracks.offset") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (((f2.a) r3).a.equals("auxiliary.tracks.interleaved") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (((f2.a) r12).a.equals("auxiliary.tracks.map") != false) goto L38;
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
        char c10;
        int i10;
        ArrayList arrayList;
        u0 u0Var;
        ArrayDeque arrayDeque;
        boolean z10;
        boolean z11;
        u0 u0Var2;
        u0 u0Var3;
        boolean z12;
        ArrayList arrayList2;
        String str;
        u0 u0Var4;
        ArrayList arrayList3;
        int i11;
        l lVar;
        long j11;
        int i12;
        u0 u0Var5;
        l lVar2;
        ArrayList arrayList4;
        int i13;
        int i14;
        int i15;
        int i16;
        t0 t0Var;
        t0 t0Var2;
        t0 t0Var3;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            if (arrayDeque2.isEmpty() || ((f2.c) arrayDeque2.peek()).c != j10) {
                break;
            }
            f2.c cVar = (f2.c) arrayDeque2.pop();
            if (cVar.b == 1836019574) {
                f2.c d = cVar.d(1835365473);
                ArrayList arrayList5 = new ArrayList();
                char c11 = 3;
                long[][] jArr = null;
                boolean z13 = this.c;
                long j12 = 0;
                int i17 = this.b;
                if (d != null) {
                    u0Var = d.f(d);
                    if (this.y) {
                        u0Var.getClass();
                        t0[] t0VarArr = u0Var.a;
                        int length = t0VarArr.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length) {
                                i10 = 0;
                                t0Var2 = null;
                                break;
                            }
                            t0 t0Var4 = t0VarArr[i18];
                            i10 = 0;
                            if (f2.a.class.isAssignableFrom(t0Var4.getClass())) {
                                t0Var2 = (t0) f2.a.class.cast(t0Var4);
                            }
                            t0Var2 = null;
                            if (t0Var2 != null) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        f2.a aVar = (f2.a) t0Var2;
                        if (aVar != null && aVar.b[i10] == 0) {
                            this.A = this.x + 16;
                        }
                        int length2 = t0VarArr.length;
                        int i19 = i10;
                        while (true) {
                            if (i19 >= length2) {
                                t0Var3 = null;
                                break;
                            }
                            t0 t0Var5 = t0VarArr[i19];
                            if (f2.a.class.isAssignableFrom(t0Var5.getClass())) {
                                t0Var3 = (t0) f2.a.class.cast(t0Var5);
                            }
                            t0Var3 = null;
                            if (t0Var3 != null) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        f2.a aVar2 = (f2.a) t0Var3;
                        aVar2.getClass();
                        ArrayList d10 = aVar2.d();
                        ArrayList arrayList6 = new ArrayList(d10.size());
                        int i20 = i10;
                        while (i20 < d10.size()) {
                            int intValue = ((Integer) d10.get(i20)).intValue();
                            i20 = k3.f(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? i10 : 4 : 3 : 2 : 1, i20, 1, arrayList6);
                        }
                        arrayList = arrayList6;
                        c10 = 3;
                    } else {
                        i10 = 0;
                        if (u0Var == null || (i17 & 64) == 0) {
                            c10 = 3;
                        } else {
                            t0[] t0VarArr2 = u0Var.a;
                            int length3 = t0VarArr2.length;
                            int i21 = 0;
                            while (true) {
                                if (i21 >= length3) {
                                    c10 = c11;
                                    t0Var = null;
                                    break;
                                }
                                t0 t0Var6 = t0VarArr2[i21];
                                if (f2.a.class.isAssignableFrom(t0Var6.getClass())) {
                                    t0Var = (t0) f2.a.class.cast(t0Var6);
                                    c10 = c11;
                                } else {
                                    c10 = c11;
                                }
                                t0Var = null;
                                if (t0Var != null) {
                                    break;
                                }
                                i21++;
                                c11 = c10;
                            }
                            f2.a aVar3 = (f2.a) t0Var;
                            if (aVar3 != null) {
                                long G = new x(aVar3.b).G();
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
                    c10 = 3;
                    i10 = 0;
                    arrayList = arrayList5;
                    u0Var = null;
                }
                ArrayList arrayList7 = new ArrayList();
                boolean z14 = this.E == 1 ? 1 : i10;
                c3.w wVar = new c3.w();
                f2.d e = cVar.e(1969517665);
                if (e != null) {
                    u0 j13 = d.j(e);
                    wVar.b(j13);
                    u0Var2 = j13;
                } else {
                    u0Var2 = null;
                }
                f2.d e7 = cVar.e(1836476516);
                e7.getClass();
                t0[] t0VarArr3 = new t0[1];
                t0VarArr3[i10] = d.g(e7.c);
                u0 u0Var6 = new u0(t0VarArr3);
                if ((i17 & 1) != 0) {
                    u0Var3 = u0Var6;
                    z12 = 1;
                } else {
                    u0Var3 = u0Var6;
                    z12 = i10;
                }
                u0 u0Var7 = u0Var3;
                z11 = z13;
                ArrayList i22 = d.i(cVar, wVar, -9223372036854775807L, null, z12, z14, new t0.a(21), this.c);
                if (this.y) {
                    boolean z15 = arrayList.size() == i22.size() ? 1 : i10;
                    Locale locale = Locale.US;
                    u6.o("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + i22.size() + ")", z15);
                }
                String b10 = q.b(i22);
                int i23 = i10;
                int i24 = i23;
                long j14 = -9223372036854775807L;
                int i25 = -1;
                while (i23 < i22.size()) {
                    u uVar = (u) i22.get(i23);
                    int i26 = uVar.b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    long[] jArr2 = uVar.f;
                    int i27 = uVar.e;
                    r rVar = uVar.a;
                    if (i26 == 0) {
                        arrayList3 = arrayList;
                        arrayList2 = i22;
                        str = b10;
                        i11 = i23;
                        arrayList4 = arrayList7;
                        u0Var4 = u0Var2;
                    } else {
                        arrayList2 = i22;
                        str = b10;
                        c3.q qVar = this.B;
                        int i28 = i24 + 1;
                        u0Var4 = u0Var2;
                        int i29 = rVar.b;
                        ArrayList arrayList8 = arrayList7;
                        b2.x xVar = rVar.g;
                        i0 a02 = qVar.a0(i24, i29);
                        l lVar3 = new l(rVar, uVar, a02);
                        long j15 = rVar.e;
                        if (j15 == -9223372036854775807L) {
                            j15 = uVar.i;
                        }
                        a02.e(j15);
                        long max = Math.max(j14, j15);
                        String str2 = xVar.s;
                        String str3 = xVar.s;
                        int i30 = "audio/true-hd".equals(str2) ? i27 * 16 : i27 + 30;
                        w a2 = xVar.a();
                        a2.s = i30;
                        if (i29 == 2) {
                            int i31 = xVar.f;
                            if ((i17 & 8) != 0) {
                                i31 |= i25 == -1 ? 1 : 2;
                            }
                            int i32 = i31;
                            if (this.y) {
                                i16 = i32 | 32768;
                                arrayList3 = arrayList;
                                a2.g = ((Integer) arrayList.get(i23)).intValue();
                            } else {
                                arrayList3 = arrayList;
                                i16 = i32;
                            }
                            a2.f = i16;
                        } else {
                            arrayList3 = arrayList;
                        }
                        int[] iArr = uVar.h;
                        boolean z16 = uVar.j;
                        if (!w0.m(str3) || jArr2.length <= 0) {
                            i11 = i23;
                            lVar = lVar3;
                        } else {
                            int min = Math.min(z16 ? uVar.b : iArr.length, 20);
                            u6.p(j15 != -9223372036854775807L ? 1 : i10);
                            i11 = i23;
                            lVar = lVar3;
                            long min2 = Math.min(j15, 10000000L);
                            int i33 = i10;
                            int i34 = i33;
                            int i35 = -1;
                            while (i33 < min) {
                                int i36 = z16 ? i33 : iArr[i33];
                                long j16 = jArr2[i36];
                                if (j16 > min2) {
                                    break;
                                }
                                if (j16 >= 0) {
                                    i15 = min;
                                    int i37 = uVar.d[i36];
                                    if (i37 > i34) {
                                        i34 = i37;
                                        i35 = i36;
                                    }
                                } else {
                                    i15 = min;
                                }
                                i33++;
                                min = i15;
                            }
                            if (i35 != -1) {
                                j11 = jArr2[i35];
                                if (j11 == -9223372036854775807L) {
                                    l3.c cVar2 = new l3.c(j11);
                                    i12 = 1;
                                    t0[] t0VarArr4 = new t0[1];
                                    t0VarArr4[i10] = cVar2;
                                    u0Var5 = new u0(t0VarArr4);
                                } else {
                                    i12 = 1;
                                    u0Var5 = null;
                                }
                                if (i29 == i12 && (i13 = wVar.a) != -1 && (i14 = wVar.b) != -1) {
                                    a2.M = i13;
                                    a2.N = i14;
                                }
                                u0 u0Var8 = xVar.l;
                                ArrayList arrayList9 = this.j;
                                u0[] u0VarArr = new u0[4];
                                u0VarArr[i10] = !arrayList9.isEmpty() ? null : new u0(arrayList9);
                                u0VarArr[i12] = u0Var4;
                                u0VarArr[2] = u0Var7;
                                u0VarArr[c10] = u0Var5;
                                q.l(i29, u0Var, a2, u0Var8, u0VarArr);
                                a2.q = w0.n(str);
                                if (Objects.equals(str3, "audio/mpeg")) {
                                    lVar2 = lVar;
                                    i2.d.s(a2, lVar2.c);
                                } else {
                                    lVar2 = lVar;
                                    lVar2.f = new b2.x(a2);
                                }
                                if (i29 == 2 && i25 == -1) {
                                    i25 = arrayList8.size();
                                }
                                arrayList4 = arrayList8;
                                arrayList4.add(lVar2);
                                i24 = i28;
                                j14 = max;
                            }
                        }
                        j11 = -9223372036854775807L;
                        if (j11 == -9223372036854775807L) {
                        }
                        if (i29 == i12) {
                            a2.M = i13;
                            a2.N = i14;
                        }
                        u0 u0Var82 = xVar.l;
                        ArrayList arrayList92 = this.j;
                        u0[] u0VarArr2 = new u0[4];
                        u0VarArr2[i10] = !arrayList92.isEmpty() ? null : new u0(arrayList92);
                        u0VarArr2[i12] = u0Var4;
                        u0VarArr2[2] = u0Var7;
                        u0VarArr2[c10] = u0Var5;
                        q.l(i29, u0Var, a2, u0Var82, u0VarArr2);
                        a2.q = w0.n(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                        }
                        if (i29 == 2) {
                            i25 = arrayList8.size();
                        }
                        arrayList4 = arrayList8;
                        arrayList4.add(lVar2);
                        i24 = i28;
                        j14 = max;
                    }
                    i23 = i11 + 1;
                    arrayList7 = arrayList4;
                    arrayDeque2 = arrayDeque3;
                    i22 = arrayList2;
                    b10 = str;
                    u0Var2 = u0Var4;
                    arrayList = arrayList3;
                }
                arrayDeque = arrayDeque2;
                int i38 = -1;
                boolean z17 = true;
                l[] lVarArr = (l[]) arrayList7.toArray(new l[i10]);
                this.C = lVarArr;
                if (!z11) {
                    long[][] jArr3 = new long[lVarArr.length][];
                    int[] iArr2 = new int[lVarArr.length];
                    long[] jArr4 = new long[lVarArr.length];
                    boolean[] zArr = new boolean[lVarArr.length];
                    for (int i39 = 0; i39 < lVarArr.length; i39++) {
                        jArr3[i39] = new long[lVarArr[i39].b.b];
                        jArr4[i39] = lVarArr[i39].b.f[0];
                    }
                    int i40 = 0;
                    while (i40 < lVarArr.length) {
                        long j17 = Long.MAX_VALUE;
                        int i41 = i38;
                        for (int i42 = 0; i42 < lVarArr.length; i42++) {
                            if (!zArr[i42]) {
                                long j18 = jArr4[i42];
                                if (j18 <= j17) {
                                    i41 = i42;
                                    j17 = j18;
                                }
                            }
                        }
                        int i43 = iArr2[i41];
                        long[] jArr5 = jArr3[i41];
                        jArr5[i43] = j12;
                        u uVar2 = lVarArr[i41].b;
                        boolean z18 = z17;
                        long[][] jArr6 = jArr3;
                        j12 += uVar2.d[i43];
                        int i44 = i43 + 1;
                        iArr2[i41] = i44;
                        if (i44 < jArr5.length) {
                            jArr4[i41] = uVar2.f[i44];
                        } else {
                            zArr[i41] = z18;
                            i40++;
                        }
                        jArr3 = jArr6;
                        z17 = z18;
                        i38 = -1;
                    }
                    jArr = jArr3;
                }
                z10 = z17;
                this.D = jArr;
                this.B.D();
                this.B.K(new k(j14, this.C, i25));
                arrayDeque.clear();
                this.z = z10;
                if (!this.w) {
                    this.l = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((f2.c) arrayDeque2.peek()).e.add(cVar);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }

    @Override // c3.o
    public final c3.o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
