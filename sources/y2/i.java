package y2;

import a8.la;
import a8.va;
import a8.xa;
import android.os.SystemClock;
import b3.p;
import c8.ca;
import e2.u;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import j2.b0;
import j2.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l2.s0;
import o2.o;
import sg.h0;
import x2.c1;
import x2.d1;
import x2.f1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class i implements d1, f1, b3.k, b3.n {
    public final c1[] E;
    public final h0 F;
    public f G;
    public u H;
    public h I;
    public long J;
    public long K;
    public int L;
    public a M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final int a;
    public final int[] b;
    public final u[] c;
    public final boolean[] d;
    public final o2.l e;
    public final o2.b f;
    public final xa h;
    public final qb.a n;
    public final p r;
    public final ca.i s;
    public final ArrayList w;
    public final List x;
    public final c1 y;

    public i(int i7, int[] iArr, u[] uVarArr, o2.l lVar, o2.b bVar, h6.m mVar, long j3, q2.m mVar2, q2.j jVar, qb.a aVar, xa xaVar, boolean z10, long j10, c3.a aVar2) {
        this.a = i7;
        this.b = iArr;
        this.c = uVarArr;
        this.e = lVar;
        this.f = bVar;
        this.h = xaVar;
        this.n = aVar;
        this.r = aVar2 != null ? new p(aVar2) : new p("ChunkSampleStream");
        this.s = new ca.i(10);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new c1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        c1[] c1VarArr = new c1[i10];
        mVar2.getClass();
        c1 c1Var = new c1(mVar, mVar2, jVar);
        this.y = c1Var;
        iArr2[0] = i7;
        c1VarArr[0] = c1Var;
        int i11 = 0;
        while (i11 < length) {
            c1 c1Var2 = new c1(mVar, null, null);
            this.E[i11] = c1Var2;
            int i12 = i11 + 1;
            c1VarArr[i12] = c1Var2;
            iArr2[i12] = this.b[i11];
            i11 = i12;
        }
        this.F = new h0(11, iArr2, c1VarArr);
        this.J = j3;
        this.K = j3;
        this.N = z10;
        if (!z10 || j10 == -9223372036854775807L) {
            return;
        }
        this.N = false;
        this.O = j10 < j3;
    }

    public final boolean A() {
        return ((!this.N && !this.O) || this.Q || this.r.c()) ? false : true;
    }

    public final void B() {
        int C = C(this.y.v(), this.L - 1);
        while (true) {
            int i7 = this.L;
            if (i7 > C) {
                return;
            }
            this.L = i7 + 1;
            a aVar = (a) this.w.get(i7);
            u uVar = aVar.d;
            if (!uVar.equals(this.H)) {
                this.h.j(this.a, uVar, aVar.e, aVar.f, aVar.h);
            }
            this.H = uVar;
        }
    }

    public final int C(int i7, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.w;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i7);
        return i10 - 1;
    }

    public final void D(o2.b bVar) {
        this.I = bVar;
        c1 c1Var = this.y;
        c1Var.l();
        q2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.c(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.E) {
            c1Var2.l();
            q2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.c(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        this.r.e(this);
    }

    @Override // x2.d1
    public final void a() {
        p pVar = this.r;
        pVar.a();
        this.y.C();
        if (pVar.d()) {
            return;
        }
        o2.l lVar = this.e;
        x2.b bVar = lVar.m;
        if (bVar != null) {
            throw bVar;
        }
        lVar.a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03f9  */
    @Override // x2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(s0 s0Var) {
        long j3;
        List list;
        ca.i iVar;
        long j10;
        boolean z10;
        List list2;
        List list3;
        l lVar;
        long j11;
        long j12;
        p pVar;
        ca.i iVar2;
        List list4;
        boolean z11;
        long j13;
        long j14;
        int i7;
        Object jVar;
        p2.j jVar2;
        long j15;
        boolean z12;
        boolean z13;
        if (this.Q) {
            return false;
        }
        p pVar2 = this.r;
        if (pVar2.d() || pVar2.c()) {
            return false;
        }
        boolean y10 = y();
        if (y10) {
            list = Collections.EMPTY_LIST;
            j3 = this.J;
        } else {
            j3 = w().n;
            list = this.x;
        }
        List list5 = list;
        o2.l lVar2 = this.e;
        o2.j[] jVarArr = lVar2.i;
        x2.b bVar = lVar2.m;
        ca.i iVar3 = this.s;
        if (bVar != null) {
            z10 = y10;
            iVar = iVar3;
            j10 = -9223372036854775807L;
        } else {
            iVar = iVar3;
            long j16 = s0Var.a;
            long j17 = j3 - j16;
            j10 = -9223372036854775807L;
            z10 = y10;
            long S = l0.S(lVar2.k.b(lVar2.l).b) + l0.S(lVar2.k.a) + j3;
            o oVar = lVar2.h;
            if (oVar != null) {
                o2.p pVar3 = oVar.e;
                p2.c cVar = pVar3.f;
                o2.f fVar = pVar3.b;
                if (!cVar.d) {
                    list2 = list5;
                    z12 = false;
                } else if (pVar3.n) {
                    list2 = list5;
                    z12 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = pVar3.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= S) {
                        z12 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        o2.h hVar = fVar.a;
                        long j18 = hVar.M;
                        if (j18 == -9223372036854775807L || j18 < longValue) {
                            hVar.M = longValue;
                        }
                        z12 = true;
                    }
                    if (z12 && pVar3.h) {
                        pVar3.n = true;
                        pVar3.h = false;
                        o2.h hVar2 = fVar.a;
                        hVar2.D.removeCallbacks(hVar2.w);
                        hVar2.C();
                    }
                }
            } else {
                list2 = list5;
            }
            long S2 = l0.S(l0.C(lVar2.f));
            p2.c cVar2 = lVar2.k;
            long j19 = cVar2.a;
            long S3 = j19 == -9223372036854775807L ? -9223372036854775807L : S2 - l0.S(j19 + cVar2.b(lVar2.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                lVar = null;
            } else {
                list3 = list2;
                lVar = (l) p5.c.h(1, list3);
            }
            int length = lVar2.j.length();
            m[] mVarArr = new m[length];
            int i10 = 0;
            while (i10 < length) {
                o2.j[] jVarArr2 = jVarArr;
                o2.j jVar3 = jVarArr2[i10];
                long j20 = j16;
                o2.i iVar4 = jVar3.d;
                long j21 = S3;
                long j22 = jVar3.f;
                long j23 = jVar3.e;
                sa.d dVar = m.C;
                if (iVar4 == null) {
                    mVarArr[i10] = dVar;
                } else {
                    iVar4.getClass();
                    long h = iVar4.h(j23, S2) + j22;
                    long b10 = jVar3.b(S2);
                    if (lVar != null) {
                        j15 = lVar.b();
                    } else {
                        o2.i iVar5 = jVar3.d;
                        iVar5.getClass();
                        j15 = l0.j(iVar5.o(j3, j23) + j22, h, b10);
                    }
                    long j24 = j15;
                    if (j24 < h) {
                        mVarArr[i10] = dVar;
                    } else {
                        mVarArr[i10] = new o2.k(lVar2.b(i10), j24, b10);
                    }
                }
                i10++;
                jVarArr = jVarArr2;
                j16 = j20;
                S3 = j21;
            }
            o2.j[] jVarArr3 = jVarArr;
            long j25 = j16;
            long j26 = S3;
            if (!lVar2.k.d || jVarArr3[0].c() == 0) {
                j11 = 0;
                j12 = -9223372036854775807L;
            } else {
                long d = jVarArr3[0].d(jVarArr3[0].b(S2));
                p2.c cVar3 = lVar2.k;
                long j27 = cVar3.a;
                j11 = 0;
                j12 = Math.max(0L, Math.min(j27 == -9223372036854775807L ? -9223372036854775807L : S2 - l0.S(j27 + cVar3.b(lVar2.l).b), d) - j25);
            }
            pVar = pVar2;
            long j28 = j11;
            iVar2 = iVar;
            lVar2.j.e(j25, j17, j12, list3, mVarArr);
            int d2 = lVar2.j.d();
            SystemClock.elapsedRealtime();
            o2.j b11 = lVar2.b(d2);
            long j29 = b11.e;
            long j30 = b11.f;
            o2.i iVar6 = b11.d;
            p2.b bVar2 = b11.c;
            e eVar = b11.a;
            p2.m mVar = b11.b;
            if (eVar != null) {
                p2.j jVar4 = eVar.s == null ? mVar.h : null;
                if (iVar6 == null) {
                    list4 = list3;
                    jVar2 = mVar.d();
                } else {
                    list4 = list3;
                    jVar2 = null;
                }
                if (jVar4 != null || jVar2 != null) {
                    j2.h hVar3 = lVar2.e;
                    u n10 = lVar2.j.n();
                    int o4 = lVar2.j.o();
                    Object r10 = lVar2.j.r();
                    if (jVar4 != null) {
                        p2.j a10 = jVar4.a(jVar2, bVar2.a);
                        if (a10 != null) {
                            jVar4 = a10;
                        }
                    } else {
                        jVar2.getClass();
                        jVar4 = jVar2;
                    }
                    iVar2.c = new k(hVar3, ca.a(mVar, bVar2.a, jVar4, 0), n10, o4, r10, b11.a);
                    z13 = iVar2.b;
                    f fVar2 = (f) iVar2.c;
                    iVar2.c = null;
                    iVar2.b = false;
                    if (z13) {
                        this.J = j10;
                        this.Q = true;
                        return true;
                    }
                    if (fVar2 == null) {
                        return false;
                    }
                    this.G = fVar2;
                    boolean z14 = fVar2 instanceof a;
                    h0 h0Var = this.F;
                    if (z14) {
                        a aVar = (a) fVar2;
                        if (z10) {
                            long j31 = aVar.h;
                            long j32 = this.J;
                            if (j31 < j32) {
                                this.y.t = j32;
                                for (c1 c1Var : this.E) {
                                    c1Var.t = this.J;
                                }
                                this.O = this.N;
                            }
                            this.N = false;
                            this.J = -9223372036854775807L;
                        }
                        aVar.y = h0Var;
                        c1[] c1VarArr = (c1[]) h0Var.c;
                        int[] iArr = new int[c1VarArr.length];
                        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
                            c1 c1Var2 = c1VarArr[i11];
                            iArr[i11] = c1Var2.q + c1Var2.p;
                        }
                        aVar.E = iArr;
                        this.w.add(aVar);
                    } else if (fVar2 instanceof k) {
                        ((k) fVar2).w = h0Var;
                    }
                    pVar.f(fVar2, this, this.n.R4(fVar2.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            p2.c cVar4 = lVar2.k;
            boolean z15 = cVar4.d && lVar2.l == cVar4.m.size() + (-1);
            boolean z16 = (z15 && j29 == -9223372036854775807L) ? false : true;
            if (b11.c() == j28) {
                iVar2.b = z16;
            } else {
                iVar6.getClass();
                boolean z17 = z16;
                long h7 = iVar6.h(j29, S2) + j30;
                long b12 = b11.b(S2);
                if (z15) {
                    long d10 = b11.d(b12);
                    z11 = z17 & ((d10 - b11.e(b12)) + d10 >= j29);
                } else {
                    z11 = z17;
                }
                if (lVar != null) {
                    j14 = lVar.b();
                    j13 = b12;
                } else {
                    iVar6.getClass();
                    j13 = b12;
                    j14 = l0.j(iVar6.o(j3, j29) + j30, h7, j13);
                }
                long j33 = j14;
                if (j33 < h7) {
                    lVar2.m = new x2.b();
                } else {
                    if (j33 <= j13) {
                        long j34 = j3;
                        if (!lVar2.n || j33 < j13) {
                            if (!z11 || b11.e(j33) < j29) {
                                int min = (int) Math.min(lVar2.g, (j13 - j33) + 1);
                                int i12 = (j29 > (-9223372036854775807L) ? 1 : (j29 == (-9223372036854775807L) ? 0 : -1));
                                if (i12 != 0) {
                                    while (min > 1 && b11.e((min + j33) - 1) >= j29) {
                                        min--;
                                    }
                                }
                                long j35 = list4.isEmpty() ? j34 : -9223372036854775807L;
                                j2.h hVar4 = lVar2.e;
                                int i13 = lVar2.d;
                                u n11 = lVar2.j.n();
                                int o10 = lVar2.j.o();
                                Object r11 = lVar2.j.r();
                                long e10 = b11.e(j33);
                                iVar6.getClass();
                                p2.j k10 = iVar6.k(j33 - j30);
                                if (eVar == null) {
                                    jVar = new n(hVar4, ca.a(mVar, bVar2.a, k10, b11.f(j33, j26) ? 0 : 8), n11, o10, r11, e10, b11.d(j33), j33, i13, n11);
                                } else {
                                    int i14 = 1;
                                    int i15 = 1;
                                    while (true) {
                                        if (i14 >= min) {
                                            i7 = i12;
                                            break;
                                        }
                                        int i16 = min;
                                        i7 = i12;
                                        iVar6.getClass();
                                        p2.j a11 = k10.a(iVar6.k((j33 + i14) - j30), bVar2.a);
                                        if (a11 == null) {
                                            break;
                                        }
                                        i15++;
                                        i14++;
                                        i12 = i7;
                                        k10 = a11;
                                        min = i16;
                                    }
                                    long j36 = (j33 + i15) - 1;
                                    long d11 = b11.d(j36);
                                    long j37 = (i7 == 0 || j29 > d11) ? -9223372036854775807L : j29;
                                    j2.m a12 = ca.a(mVar, bVar2.a, k10, b11.f(j36, j26) ? 0 : 8);
                                    long j38 = -mVar.c;
                                    if (e2.s0.k(n11.s)) {
                                        j38 += e10;
                                    }
                                    jVar = new j(hVar4, a12, n11, o10, r11, e10, d11, j35, j37, j33, i15, j38, b11.a);
                                }
                                iVar2.c = jVar;
                            } else {
                                iVar2.b = true;
                            }
                        }
                    }
                    iVar2.b = z11;
                }
            }
            z13 = iVar2.b;
            f fVar22 = (f) iVar2.c;
            iVar2.c = null;
            iVar2.b = false;
            if (z13) {
            }
        }
        pVar = pVar2;
        iVar2 = iVar;
        z13 = iVar2.b;
        f fVar222 = (f) iVar2.c;
        iVar2.c = null;
        iVar2.b = false;
        if (z13) {
        }
    }

    @Override // b3.n
    public final void d() {
        c1 c1Var = this.y;
        c1Var.G(true);
        q2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.c(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.E) {
            c1Var2.G(true);
            q2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.c(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        for (o2.j jVar : this.e.i) {
            e eVar = jVar.a;
            if (eVar != null) {
                eVar.a.release();
            }
        }
        h hVar = this.I;
        if (hVar != null) {
            o2.b bVar = (o2.b) hVar;
            synchronized (bVar) {
                o oVar = (o) bVar.E.remove(this);
                if (oVar != null) {
                    c1 c1Var3 = oVar.a;
                    c1Var3.G(true);
                    q2.g gVar3 = c1Var3.h;
                    if (gVar3 != null) {
                        gVar3.c(c1Var3.e);
                        c1Var3.h = null;
                        c1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // x2.f1
    public final long e() {
        if (y()) {
            return this.J;
        }
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    @Override // x2.f1
    public final boolean g() {
        return this.r.d();
    }

    @Override // x2.d1
    public final boolean h() {
        return !y() && this.y.A(this.Q);
    }

    @Override // x2.d1
    public final int j(long j3) {
        if (y() || A() || this.P) {
            return 0;
        }
        boolean z10 = this.Q;
        c1 c1Var = this.y;
        int x10 = c1Var.x(j3, z10);
        a aVar = this.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x10);
        B();
        return x10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028b  */
    @Override // b3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        qb.a aVar;
        ArrayList arrayList;
        x2.u uVar;
        boolean z13;
        boolean z14;
        long j11;
        boolean z15;
        b3.i iVar;
        boolean a10;
        f fVar = (f) mVar;
        b0 b0Var = fVar.r;
        u uVar2 = fVar.d;
        long j12 = fVar.h;
        long j13 = b0Var.b;
        boolean z16 = fVar instanceof a;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size() - 1;
        if (j13 != 0 && z16 && x(size)) {
            z10 = false;
            z11 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        j2.m mVar2 = fVar.b;
        b0 b0Var2 = fVar.r;
        x2.u uVar3 = new x2.u(mVar2, b0Var2.c, b0Var2.d, j3, j10, j13);
        l0.h0(j12);
        l0.h0(fVar.n);
        b3.j jVar = new b3.j(iOException, i7, 0);
        o2.l lVar = this.e;
        o2.j[] jVarArr = lVar.i;
        xi.e eVar = lVar.b;
        qb.a aVar2 = this.n;
        if (z10) {
            z12 = z16;
            o oVar = lVar.h;
            if (oVar != null) {
                long j14 = oVar.d;
                boolean z17 = j14 != -9223372036854775807L && j14 < j12;
                o2.p pVar = oVar.e;
                if (pVar.f.d) {
                    if (!pVar.n) {
                        if (z17) {
                            if (pVar.h) {
                                pVar.n = true;
                                pVar.h = false;
                                o2.h hVar = pVar.b.a;
                                hVar.D.removeCallbacks(hVar.w);
                                hVar.C();
                            }
                        }
                    }
                    aVar = aVar2;
                    arrayList = arrayList2;
                    z13 = z10;
                    uVar = uVar3;
                    z14 = true;
                    z15 = true;
                    if (z15) {
                        if (z13) {
                            if (z12) {
                                la.p(v(size) == fVar ? z14 : false);
                                if (arrayList.isEmpty()) {
                                    this.J = this.K;
                                }
                            }
                            iVar = p.e;
                            if (iVar == null) {
                                aVar.getClass();
                                long S4 = qb.a.S4(jVar);
                                iVar = S4 != -9223372036854775807L ? new b3.i(0, S4, false) : p.f;
                            }
                            b3.i iVar2 = iVar;
                            a10 = iVar2.a();
                            this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                            if (!a10) {
                                this.G = null;
                                aVar.getClass();
                                this.f.c0(this);
                            }
                            return iVar2;
                        }
                        h2.a.l("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    iVar = null;
                    if (iVar == null) {
                    }
                    b3.i iVar22 = iVar;
                    a10 = iVar22.a();
                    this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                    if (!a10) {
                    }
                    return iVar22;
                }
            }
            if (!lVar.k.d && (fVar instanceof l) && (iOException instanceof x) && ((x) iOException).c == 404) {
                o2.j jVar2 = jVarArr[lVar.j.b(uVar2)];
                long c10 = jVar2.c();
                if (c10 != -1 && c10 != 0) {
                    o2.i iVar3 = jVar2.d;
                    iVar3.getClass();
                    if (((l) fVar).b() > ((iVar3.v() + jVar2.f) + c10) - 1) {
                        lVar.n = true;
                        aVar = aVar2;
                        arrayList = arrayList2;
                        z13 = z10;
                        uVar = uVar3;
                        z14 = true;
                        z15 = true;
                        if (z15) {
                        }
                        iVar = null;
                        if (iVar == null) {
                        }
                        b3.i iVar222 = iVar;
                        a10 = iVar222.a();
                        this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                        if (!a10) {
                        }
                        return iVar222;
                    }
                }
            }
            o2.j jVar3 = jVarArr[lVar.j.b(uVar2)];
            p2.m mVar3 = jVar3.b;
            p2.b bVar = jVar3.c;
            p2.b M = eVar.M(mVar3.b);
            if (M == null || bVar.equals(M)) {
                a3.u uVar4 = lVar.j;
                i0 i0Var = jVar3.b.b;
                boolean z18 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar = aVar2;
                int length = uVar4.length();
                arrayList = arrayList2;
                uVar = uVar3;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (uVar4.a(i11, elapsedRealtime)) {
                        i10++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < i0Var.size(); i12++) {
                    hashSet.add(Integer.valueOf(((p2.b) i0Var.get(i12)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList i13 = eVar.i(i0Var);
                z13 = z18;
                for (int i14 = 0; i14 < i13.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((p2.b) i13.get(i14)).c));
                }
                b3.h hVar2 = new b3.h(size2, size2 - hashSet2.size(), length, i10);
                if (hVar2.a(2) || hVar2.a(1)) {
                    aVar.getClass();
                    b3.i Q4 = qb.a.Q4(hVar2, jVar);
                    if (Q4 != null) {
                        long j15 = Q4.b;
                        int i15 = Q4.a;
                        if (hVar2.a(i15)) {
                            if (i15 == 2) {
                                a3.u uVar5 = lVar.j;
                                z15 = uVar5.p(uVar5.b(uVar2), j15);
                                z14 = true;
                            } else {
                                z14 = true;
                                if (i15 == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j15;
                                    String str = bVar.b;
                                    HashMap hashMap = (HashMap) eVar.a;
                                    if (hashMap.containsKey(str)) {
                                        Long l10 = (Long) hashMap.get(str);
                                        String str2 = l0.a;
                                        j11 = Math.max(elapsedRealtime2, l10.longValue());
                                    } else {
                                        j11 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j11));
                                    int i16 = bVar.c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i16);
                                        HashMap hashMap2 = (HashMap) eVar.b;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l11 = (Long) hashMap2.get(valueOf);
                                            String str3 = l0.a;
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, l11.longValue());
                                        }
                                        hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                    }
                                    z15 = true;
                                }
                                z15 = false;
                            }
                            if (z15) {
                            }
                            iVar = null;
                            if (iVar == null) {
                            }
                            b3.i iVar2222 = iVar;
                            a10 = iVar2222.a();
                            this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                            if (!a10) {
                            }
                            return iVar2222;
                        }
                    }
                }
            }
            aVar = aVar2;
            arrayList = arrayList2;
            z13 = z10;
            uVar = uVar3;
            z14 = true;
            z15 = true;
            if (z15) {
            }
            iVar = null;
            if (iVar == null) {
            }
            b3.i iVar22222 = iVar;
            a10 = iVar22222.a();
            this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
            if (!a10) {
            }
            return iVar22222;
        }
        z12 = z16;
        aVar = aVar2;
        arrayList = arrayList2;
        z13 = z10;
        uVar = uVar3;
        z14 = true;
        z15 = false;
        if (z15) {
        }
        iVar = null;
        if (iVar == null) {
        }
        b3.i iVar222222 = iVar;
        a10 = iVar222222.a();
        this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
        if (!a10) {
        }
        return iVar222222;
    }

    @Override // x2.d1
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        if (y() || A() || this.P) {
            return -3;
        }
        a aVar2 = this.M;
        c1 c1Var = this.y;
        if (aVar2 != null && aVar2.d(0) <= c1Var.v()) {
            return -3;
        }
        B();
        return c1Var.F(aVar, hVar, i7, this.Q);
    }

    @Override // b3.k
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        f fVar = (f) mVar;
        this.G = null;
        this.M = null;
        long j11 = fVar.a;
        j2.m mVar2 = fVar.b;
        b0 b0Var = fVar.r;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.n.getClass();
        this.h.o(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (y()) {
            this.y.G(false);
            for (c1 c1Var : this.E) {
                c1Var.G(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.w;
            v(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.J = this.K;
            }
        }
        this.f.c0(this);
    }

    @Override // x2.f1
    public final long r() {
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.J;
        }
        long j3 = this.K;
        a w10 = w();
        if (!w10.c()) {
            ArrayList arrayList = this.w;
            w10 = arrayList.size() > 1 ? (a) i5.c.h(2, arrayList) : null;
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.n);
        }
        return Math.max(j3, this.y.s());
    }

    @Override // b3.k
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        f fVar = (f) mVar;
        if (i7 == 0) {
            long j11 = fVar.a;
            uVar = new x2.u(fVar.b, j3);
        } else {
            long j12 = fVar.a;
            j2.m mVar2 = fVar.b;
            b0 b0Var = fVar.r;
            uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        }
        this.h.u(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i7);
    }

    @Override // x2.f1
    public final void u(long j3) {
        p pVar = this.r;
        if (pVar.c() || y()) {
            return;
        }
        boolean d = pVar.d();
        List list = this.x;
        o2.l lVar = this.e;
        ArrayList arrayList = this.w;
        if (d) {
            f fVar = this.G;
            fVar.getClass();
            boolean z10 = fVar instanceof a;
            if (z10 && x(arrayList.size() - 1)) {
                return;
            }
            if (lVar.m == null ? lVar.j.k(j3, fVar, list) : false) {
                pVar.b();
                if (z10) {
                    this.M = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (lVar.m != null || lVar.j.length() < 2) ? list.size() : lVar.j.j(j3, list);
        if (size < arrayList.size()) {
            la.p(!pVar.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!x(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size != -1) {
                long j10 = w().n;
                a v = v(size);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
                this.Q = false;
                this.h.B(v.h, this.a, j10);
            }
        }
        if (this.y.z()) {
            this.Q = true;
        }
    }

    public final a v(int i7) {
        ArrayList arrayList = this.w;
        a aVar = (a) arrayList.get(i7);
        l0.X(i7, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i10 = 0;
        this.y.o(aVar.d(0));
        while (true) {
            c1[] c1VarArr = this.E;
            if (i10 >= c1VarArr.length) {
                return aVar;
            }
            c1 c1Var = c1VarArr[i10];
            i10++;
            c1Var.o(aVar.d(i10));
        }
    }

    public final a w() {
        return (a) i5.c.h(1, this.w);
    }

    public final boolean x(int i7) {
        int v;
        a aVar = (a) this.w.get(i7);
        if (this.y.v() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            c1[] c1VarArr = this.E;
            if (i10 >= c1VarArr.length) {
                return false;
            }
            v = c1VarArr[i10].v();
            i10++;
        } while (v <= aVar.d(i10));
        return true;
    }

    public final boolean y() {
        return this.J != -9223372036854775807L;
    }

    @Override // b3.k
    public final void z(b3.m mVar, long j3, long j10) {
        f fVar = (f) mVar;
        this.G = null;
        o2.l lVar = this.e;
        o2.j[] jVarArr = lVar.i;
        if (fVar instanceof k) {
            int b10 = lVar.j.b(((k) fVar).d);
            o2.j jVar = jVarArr[b10];
            if (jVar.d == null) {
                e eVar = jVar.a;
                eVar.getClass();
                f3.j a10 = eVar.a();
                if (a10 != null) {
                    p2.m mVar2 = jVar.b;
                    jVarArr[b10] = new o2.j(jVar.e, mVar2, jVar.c, jVar.a, jVar.f, new va(a10, mVar2.c, 6));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || fVar.n > j11) {
                oVar.d = fVar.n;
            }
            oVar.e.h = true;
        }
        long j12 = fVar.a;
        j2.m mVar3 = fVar.b;
        b0 b0Var = fVar.r;
        x2.u uVar = new x2.u(mVar3, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.n.getClass();
        this.h.p(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        this.f.c0(this);
    }
}
