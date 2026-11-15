package y2;

import a8.ja;
import a8.va;
import a8.xa;
import android.os.SystemClock;
import b3.o;
import c8.aa;
import e2.u;
import f5.v;
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
import o2.p;
import sg.h0;
import x2.a1;
import x2.b1;
import x2.d1;
import x2.t;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class i implements b1, d1, b3.j, b3.m {
    public final a1[] E;
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
    public final o r;
    public final ca.i s;
    public final ArrayList w;
    public final List x;
    public final a1 y;

    public i(int i7, int[] iArr, u[] uVarArr, o2.l lVar, o2.b bVar, h6.m mVar, long j3, q2.n nVar, q2.k kVar, qb.a aVar, xa xaVar, boolean z10, long j10, c3.a aVar2) {
        this.a = i7;
        this.b = iArr;
        this.c = uVarArr;
        this.e = lVar;
        this.f = bVar;
        this.h = xaVar;
        this.n = aVar;
        this.r = aVar2 != null ? new o(aVar2) : new o("ChunkSampleStream");
        this.s = new ca.i(10);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new a1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        a1[] a1VarArr = new a1[i10];
        nVar.getClass();
        a1 a1Var = new a1(mVar, nVar, kVar);
        this.y = a1Var;
        iArr2[0] = i7;
        a1VarArr[0] = a1Var;
        int i11 = 0;
        while (i11 < length) {
            a1 a1Var2 = new a1(mVar, null, null);
            this.E[i11] = a1Var2;
            int i12 = i11 + 1;
            a1VarArr[i12] = a1Var2;
            iArr2[i12] = this.b[i11];
            i11 = i12;
        }
        this.F = new h0(11, iArr2, a1VarArr);
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
                this.h.i(this.a, uVar, aVar.e, aVar.f, aVar.h);
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
        a1 a1Var = this.y;
        a1Var.l();
        q2.h hVar = a1Var.h;
        if (hVar != null) {
            hVar.c(a1Var.e);
            a1Var.h = null;
            a1Var.g = null;
        }
        for (a1 a1Var2 : this.E) {
            a1Var2.l();
            q2.h hVar2 = a1Var2.h;
            if (hVar2 != null) {
                hVar2.c(a1Var2.e);
                a1Var2.h = null;
                a1Var2.g = null;
            }
        }
        this.r.e(this);
    }

    @Override // x2.b1
    public final void a() {
        o oVar = this.r;
        oVar.a();
        this.y.C();
        if (oVar.d()) {
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
    @Override // x2.d1
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
        o oVar;
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
        o oVar2 = this.r;
        if (oVar2.d() || oVar2.c()) {
            return false;
        }
        boolean z14 = z();
        if (z14) {
            list = Collections.EMPTY_LIST;
            j3 = this.J;
        } else {
            j3 = x().n;
            list = this.x;
        }
        List list5 = list;
        o2.l lVar2 = this.e;
        o2.j[] jVarArr = lVar2.i;
        x2.b bVar = lVar2.m;
        ca.i iVar3 = this.s;
        if (bVar != null) {
            z10 = z14;
            iVar = iVar3;
            j10 = -9223372036854775807L;
        } else {
            iVar = iVar3;
            long j16 = s0Var.a;
            long j17 = j3 - j16;
            j10 = -9223372036854775807L;
            z10 = z14;
            long S = l0.S(lVar2.k.b(lVar2.l).b) + l0.S(lVar2.k.a) + j3;
            o2.o oVar3 = lVar2.h;
            if (oVar3 != null) {
                p pVar = oVar3.e;
                p2.c cVar = pVar.f;
                o2.f fVar = pVar.b;
                if (!cVar.d) {
                    list2 = list5;
                    z12 = false;
                } else if (pVar.n) {
                    list2 = list5;
                    z12 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = pVar.e.ceilingEntry(Long.valueOf(cVar.h));
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
                    if (z12 && pVar.h) {
                        pVar.n = true;
                        pVar.h = false;
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
                lVar = (l) r.b.h(1, list3);
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
                    long y10 = iVar4.y(j23, S2) + j22;
                    long b10 = jVar3.b(S2);
                    if (lVar != null) {
                        j15 = lVar.b();
                    } else {
                        o2.i iVar5 = jVar3.d;
                        iVar5.getClass();
                        j15 = l0.j(iVar5.L(j3, j23) + j22, y10, b10);
                    }
                    long j24 = j15;
                    if (j24 < y10) {
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
            oVar = oVar2;
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
                    iVar2.c = new k(hVar3, aa.a(mVar, bVar2.a, jVar4, 0), n10, o4, r10, b11.a);
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
                    boolean z15 = fVar2 instanceof a;
                    h0 h0Var = this.F;
                    if (z15) {
                        a aVar = (a) fVar2;
                        if (z10) {
                            long j31 = aVar.h;
                            long j32 = this.J;
                            if (j31 < j32) {
                                this.y.t = j32;
                                for (a1 a1Var : this.E) {
                                    a1Var.t = this.J;
                                }
                                this.O = this.N;
                            }
                            this.N = false;
                            this.J = -9223372036854775807L;
                        }
                        aVar.y = h0Var;
                        a1[] a1VarArr = (a1[]) h0Var.c;
                        int[] iArr = new int[a1VarArr.length];
                        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
                            a1 a1Var2 = a1VarArr[i11];
                            iArr[i11] = a1Var2.q + a1Var2.p;
                        }
                        aVar.E = iArr;
                        this.w.add(aVar);
                    } else if (fVar2 instanceof k) {
                        ((k) fVar2).w = h0Var;
                    }
                    oVar.f(fVar2, this, this.n.R4(fVar2.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            p2.c cVar4 = lVar2.k;
            boolean z16 = cVar4.d && lVar2.l == cVar4.m.size() + (-1);
            boolean z17 = (z16 && j29 == -9223372036854775807L) ? false : true;
            if (b11.c() == j28) {
                iVar2.b = z17;
            } else {
                iVar6.getClass();
                boolean z18 = z17;
                long y11 = iVar6.y(j29, S2) + j30;
                long b12 = b11.b(S2);
                if (z16) {
                    long d10 = b11.d(b12);
                    z11 = z18 & ((d10 - b11.e(b12)) + d10 >= j29);
                } else {
                    z11 = z18;
                }
                if (lVar != null) {
                    j14 = lVar.b();
                    j13 = b12;
                } else {
                    iVar6.getClass();
                    j13 = b12;
                    j14 = l0.j(iVar6.L(j3, j29) + j30, y11, j13);
                }
                long j33 = j14;
                if (j33 < y11) {
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
                                p2.j E = iVar6.E(j33 - j30);
                                if (eVar == null) {
                                    jVar = new n(hVar4, aa.a(mVar, bVar2.a, E, b11.f(j33, j26) ? 0 : 8), n11, o10, r11, e10, b11.d(j33), j33, i13, n11);
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
                                        p2.j a11 = E.a(iVar6.E((j33 + i14) - j30), bVar2.a);
                                        if (a11 == null) {
                                            break;
                                        }
                                        i15++;
                                        i14++;
                                        i12 = i7;
                                        E = a11;
                                        min = i16;
                                    }
                                    long j36 = (j33 + i15) - 1;
                                    long d11 = b11.d(j36);
                                    long j37 = (i7 == 0 || j29 > d11) ? -9223372036854775807L : j29;
                                    j2.m a12 = aa.a(mVar, bVar2.a, E, b11.f(j36, j26) ? 0 : 8);
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
        oVar = oVar2;
        iVar2 = iVar;
        z13 = iVar2.b;
        f fVar222 = (f) iVar2.c;
        iVar2.c = null;
        iVar2.b = false;
        if (z13) {
        }
    }

    @Override // b3.m
    public final void d() {
        a1 a1Var = this.y;
        a1Var.G(true);
        q2.h hVar = a1Var.h;
        if (hVar != null) {
            hVar.c(a1Var.e);
            a1Var.h = null;
            a1Var.g = null;
        }
        for (a1 a1Var2 : this.E) {
            a1Var2.G(true);
            q2.h hVar2 = a1Var2.h;
            if (hVar2 != null) {
                hVar2.c(a1Var2.e);
                a1Var2.h = null;
                a1Var2.g = null;
            }
        }
        for (o2.j jVar : this.e.i) {
            e eVar = jVar.a;
            if (eVar != null) {
                eVar.a.release();
            }
        }
        h hVar3 = this.I;
        if (hVar3 != null) {
            o2.b bVar = (o2.b) hVar3;
            synchronized (bVar) {
                o2.o oVar = (o2.o) bVar.E.remove(this);
                if (oVar != null) {
                    a1 a1Var3 = oVar.a;
                    a1Var3.G(true);
                    q2.h hVar4 = a1Var3.h;
                    if (hVar4 != null) {
                        hVar4.c(a1Var3.e);
                        a1Var3.h = null;
                        a1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // x2.d1
    public final long e() {
        if (z()) {
            return this.J;
        }
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        return x().n;
    }

    @Override // x2.b1
    public final boolean f() {
        return !z() && this.y.A(this.Q);
    }

    @Override // x2.d1
    public final boolean g() {
        return this.r.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028c  */
    @Override // b3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        qb.a aVar;
        ArrayList arrayList;
        t tVar;
        boolean z13;
        boolean z14;
        boolean z15;
        long j11;
        b3.i iVar;
        boolean a10;
        f fVar = (f) lVar;
        b0 b0Var = fVar.r;
        u uVar = fVar.d;
        long j12 = fVar.h;
        long j13 = b0Var.b;
        boolean z16 = fVar instanceof a;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size() - 1;
        if (j13 != 0 && z16 && y(size)) {
            z10 = false;
            z11 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        j2.m mVar = fVar.b;
        b0 b0Var2 = fVar.r;
        t tVar2 = new t(mVar, b0Var2.c, b0Var2.d, j3, j10, j13);
        l0.h0(j12);
        l0.h0(fVar.n);
        v vVar = new v(iOException, i7, 1);
        o2.l lVar2 = this.e;
        o2.j[] jVarArr = lVar2.i;
        xi.e eVar = lVar2.b;
        qb.a aVar2 = this.n;
        if (z10) {
            z12 = z16;
            o2.o oVar = lVar2.h;
            if (oVar != null) {
                long j14 = oVar.d;
                boolean z17 = j14 != -9223372036854775807L && j14 < j12;
                p pVar = oVar.e;
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
                    tVar = tVar2;
                    z15 = true;
                    z14 = true;
                    if (z15) {
                        if (z13) {
                            if (z12) {
                                ja.p(v(size) == fVar ? z14 : false);
                                if (arrayList.isEmpty()) {
                                    this.J = this.K;
                                }
                            }
                            iVar = o.e;
                            if (iVar == null) {
                                aVar.getClass();
                                long S4 = qb.a.S4(vVar);
                                iVar = S4 != -9223372036854775807L ? new b3.i(0, S4, false) : o.f;
                            }
                            b3.i iVar2 = iVar;
                            a10 = iVar2.a();
                            this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                            if (!a10) {
                                this.G = null;
                                aVar.getClass();
                                this.f.f0(this);
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
                    this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                    if (!a10) {
                    }
                    return iVar22;
                }
            }
            if (!lVar2.k.d && (fVar instanceof l) && (iOException instanceof x) && ((x) iOException).c == 404) {
                o2.j jVar = jVarArr[lVar2.j.b(uVar)];
                long c10 = jVar.c();
                if (c10 != -1 && c10 != 0) {
                    o2.i iVar3 = jVar.d;
                    iVar3.getClass();
                    if (((l) fVar).b() > ((iVar3.k0() + jVar.f) + c10) - 1) {
                        lVar2.n = true;
                        aVar = aVar2;
                        arrayList = arrayList2;
                        z13 = z10;
                        tVar = tVar2;
                        z15 = true;
                        z14 = true;
                        if (z15) {
                        }
                        iVar = null;
                        if (iVar == null) {
                        }
                        b3.i iVar222 = iVar;
                        a10 = iVar222.a();
                        this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                        if (!a10) {
                        }
                        return iVar222;
                    }
                }
            }
            o2.j jVar2 = jVarArr[lVar2.j.b(uVar)];
            p2.m mVar2 = jVar2.b;
            p2.b bVar = jVar2.c;
            p2.b I = eVar.I(mVar2.b);
            if (I == null || bVar.equals(I)) {
                a3.u uVar2 = lVar2.j;
                i0 i0Var = jVar2.b.b;
                boolean z18 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar = aVar2;
                int length = uVar2.length();
                arrayList = arrayList2;
                tVar = tVar2;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (uVar2.a(i11, elapsedRealtime)) {
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
                    b3.i Q4 = qb.a.Q4(hVar2, vVar);
                    if (Q4 != null) {
                        long j15 = Q4.b;
                        int i15 = Q4.a;
                        if (hVar2.a(i15)) {
                            if (i15 == 2) {
                                a3.u uVar3 = lVar2.j;
                                z15 = uVar3.p(uVar3.b(uVar), j15);
                                z14 = true;
                                if (z15) {
                                }
                                iVar = null;
                                if (iVar == null) {
                                }
                                b3.i iVar2222 = iVar;
                                a10 = iVar2222.a();
                                this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                                if (!a10) {
                                }
                                return iVar2222;
                            }
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
                                if (z15) {
                                }
                                iVar = null;
                                if (iVar == null) {
                                }
                                b3.i iVar22222 = iVar;
                                a10 = iVar22222.a();
                                this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                                if (!a10) {
                                }
                                return iVar22222;
                            }
                            z15 = false;
                            if (z15) {
                            }
                            iVar = null;
                            if (iVar == null) {
                            }
                            b3.i iVar222222 = iVar;
                            a10 = iVar222222.a();
                            this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                            if (!a10) {
                            }
                            return iVar222222;
                        }
                    }
                    z14 = true;
                    z15 = false;
                    if (z15) {
                    }
                    iVar = null;
                    if (iVar == null) {
                    }
                    b3.i iVar2222222 = iVar;
                    a10 = iVar2222222.a();
                    this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                    if (!a10) {
                    }
                    return iVar2222222;
                }
            }
            aVar = aVar2;
            arrayList = arrayList2;
            z13 = z10;
            tVar = tVar2;
            z15 = true;
            z14 = true;
            if (z15) {
            }
            iVar = null;
            if (iVar == null) {
            }
            b3.i iVar22222222 = iVar;
            a10 = iVar22222222.a();
            this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
            if (!a10) {
            }
            return iVar22222222;
        }
        z12 = z16;
        aVar = aVar2;
        arrayList = arrayList2;
        z13 = z10;
        tVar = tVar2;
        z15 = false;
        z14 = true;
        if (z15) {
        }
        iVar = null;
        if (iVar == null) {
        }
        b3.i iVar222222222 = iVar;
        a10 = iVar222222222.a();
        this.h.p(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
        if (!a10) {
        }
        return iVar222222222;
    }

    @Override // b3.j
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        f fVar = (f) lVar;
        this.G = null;
        this.M = null;
        long j11 = fVar.a;
        j2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        t tVar = new t(mVar, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.n.getClass();
        this.h.n(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (z()) {
            this.y.G(false);
            for (a1 a1Var : this.E) {
                a1Var.G(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.w;
            v(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.J = this.K;
            }
        }
        this.f.f0(this);
    }

    @Override // x2.b1
    public final int n(long j3) {
        if (z() || A() || this.P) {
            return 0;
        }
        boolean z10 = this.Q;
        a1 a1Var = this.y;
        int x10 = a1Var.x(j3, z10);
        a aVar = this.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - a1Var.v());
        }
        a1Var.L(x10);
        B();
        return x10;
    }

    @Override // x2.b1
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        if (z() || A() || this.P) {
            return -3;
        }
        a aVar2 = this.M;
        a1 a1Var = this.y;
        if (aVar2 != null && aVar2.d(0) <= a1Var.v()) {
            return -3;
        }
        B();
        return a1Var.F(aVar, hVar, i7, this.Q);
    }

    @Override // b3.j
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        t tVar;
        f fVar = (f) lVar;
        if (i7 == 0) {
            long j11 = fVar.a;
            tVar = new t(fVar.b, j3);
        } else {
            long j12 = fVar.a;
            j2.m mVar = fVar.b;
            b0 b0Var = fVar.r;
            tVar = new t(mVar, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        }
        this.h.s(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i7);
    }

    @Override // x2.d1
    public final long s() {
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.J;
        }
        long j3 = this.K;
        a x10 = x();
        if (!x10.c()) {
            ArrayList arrayList = this.w;
            x10 = arrayList.size() > 1 ? (a) i5.c.h(2, arrayList) : null;
        }
        if (x10 != null) {
            j3 = Math.max(j3, x10.n);
        }
        return Math.max(j3, this.y.s());
    }

    @Override // x2.d1
    public final void u(long j3) {
        o oVar = this.r;
        if (oVar.c() || z()) {
            return;
        }
        boolean d = oVar.d();
        List list = this.x;
        o2.l lVar = this.e;
        ArrayList arrayList = this.w;
        if (d) {
            f fVar = this.G;
            fVar.getClass();
            boolean z10 = fVar instanceof a;
            if (z10 && y(arrayList.size() - 1)) {
                return;
            }
            if (lVar.m == null ? lVar.j.k(j3, fVar, list) : false) {
                oVar.b();
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
            ja.p(!oVar.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!y(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size != -1) {
                long j10 = x().n;
                a v = v(size);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
                this.Q = false;
                this.h.z(v.h, this.a, j10);
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
            a1[] a1VarArr = this.E;
            if (i10 >= a1VarArr.length) {
                return aVar;
            }
            a1 a1Var = a1VarArr[i10];
            i10++;
            a1Var.o(aVar.d(i10));
        }
    }

    @Override // b3.j
    public final void w(b3.l lVar, long j3, long j10) {
        f fVar = (f) lVar;
        this.G = null;
        o2.l lVar2 = this.e;
        o2.j[] jVarArr = lVar2.i;
        if (fVar instanceof k) {
            int b10 = lVar2.j.b(((k) fVar).d);
            o2.j jVar = jVarArr[b10];
            if (jVar.d == null) {
                e eVar = jVar.a;
                eVar.getClass();
                f3.j a10 = eVar.a();
                if (a10 != null) {
                    p2.m mVar = jVar.b;
                    jVarArr[b10] = new o2.j(jVar.e, mVar, jVar.c, jVar.a, jVar.f, new va(a10, mVar.c, 6));
                }
            }
        }
        o2.o oVar = lVar2.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || fVar.n > j11) {
                oVar.d = fVar.n;
            }
            oVar.e.h = true;
        }
        long j12 = fVar.a;
        j2.m mVar2 = fVar.b;
        b0 b0Var = fVar.r;
        t tVar = new t(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.n.getClass();
        this.h.o(tVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        this.f.f0(this);
    }

    public final a x() {
        return (a) i5.c.h(1, this.w);
    }

    public final boolean y(int i7) {
        int v;
        a aVar = (a) this.w.get(i7);
        if (this.y.v() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            a1[] a1VarArr = this.E;
            if (i10 >= a1VarArr.length) {
                return false;
            }
            v = a1VarArr[i10].v();
            i10++;
        } while (v <= aVar.d(i10));
        return true;
    }

    public final boolean z() {
        return this.J != -9223372036854775807L;
    }
}
