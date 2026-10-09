package v2;

import android.net.Uri;
import android.os.SystemClock;
import b2.p;
import b2.r0;
import b2.s;
import c3.b0;
import e2.d0;
import e6.n;
import e9.i0;
import i2.s0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l2.o;
import n4.x;
import org.telegram.ui.ActionBar.b5;
import sc.v;
import u2.a1;
import u2.b1;
import u2.d1;
import u2.t;
import x2.r;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h implements b1, d1, y2.g, y2.j {
    public final b5 E;
    public e F;
    public s G;
    public g H;
    public long I;
    public long J;
    public int K;
    public a L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final int a;
    public final int[] b;
    public final s[] c;
    public final boolean[] d;
    public final l2.l e;
    public final l2.b f;
    public final a5.a h;
    public final rb.a n;
    public final y2.l r = new y2.l("ChunkSampleStream");
    public final p s = new p(7);
    public final ArrayList v;
    public final List w;
    public final a1 x;
    public final a1[] y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.l lVar, l2.b bVar, y2.d dVar, long j3, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, boolean z10) {
        this.a = i10;
        this.b = iArr;
        this.c = sVarArr;
        this.e = lVar;
        this.f = bVar;
        this.h = aVar2;
        this.n = aVar;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new a1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        mVar.getClass();
        a1 a1Var = new a1(dVar, mVar, jVar);
        this.x = a1Var;
        int i12 = 0;
        iArr2[0] = i10;
        a1VarArr[0] = a1Var;
        while (i12 < length) {
            a1 a1Var2 = new a1(dVar, null, null);
            this.y[i12] = a1Var2;
            int i13 = i12 + 1;
            a1VarArr[i13] = a1Var2;
            iArr2[i13] = this.b[i12];
            i12 = i13;
        }
        this.E = new b5(17, iArr2, a1VarArr);
        this.I = j3;
        this.J = j3;
    }

    @Override // y2.g
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) iVar;
        if (i10 == 0) {
            long j11 = eVar.a;
            tVar = new t(eVar.b);
        } else {
            long j12 = eVar.a;
            Uri uri = eVar.r.c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.u(tVar2, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, i10);
    }

    @Override // y2.g
    public final void F(y2.i iVar, long j3, long j10) {
        e eVar = (e) iVar;
        this.F = null;
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.i;
        if (eVar instanceof j) {
            int s10 = lVar.j.s(((j) eVar).d);
            l2.j jVar = jVarArr[s10];
            if (jVar.d == null) {
                d dVar = jVar.a;
                e2.d.h(dVar);
                b0 b0Var = dVar.n;
                c3.j jVar2 = b0Var instanceof c3.j ? (c3.j) b0Var : null;
                if (jVar2 != null) {
                    m2.m mVar = jVar.b;
                    jVarArr[s10] = new l2.j(jVar.e, mVar, jVar.c, jVar.a, jVar.f, new n(jVar2, mVar.c, 4));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || eVar.n > j11) {
                oVar.d = eVar.n;
            }
            oVar.e.h = true;
        }
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        t tVar = new t(j10);
        this.n.getClass();
        this.h.q(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        this.f.D(this);
    }

    @Override // y2.g
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        e eVar = (e) iVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.a;
        Uri uri = eVar.r.c;
        t tVar = new t(j10);
        this.n.getClass();
        this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z10) {
            return;
        }
        if (v()) {
            this.x.D(false);
            for (a1 a1Var : this.y) {
                a1Var.D(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.v;
            m(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
        }
        this.f.D(this);
    }

    @Override // u2.b1
    public final void a() {
        y2.l lVar = this.r;
        lVar.a();
        this.x.z();
        if (lVar.d()) {
            return;
        }
        l2.l lVar2 = this.e;
        u2.b bVar = lVar2.m;
        if (bVar != null) {
            throw bVar;
        }
        lVar2.a.a();
    }

    @Override // y2.j
    public final void b() {
        a1 a1Var = this.x;
        a1Var.D(true);
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.e);
            a1Var.h = null;
            a1Var.g = null;
        }
        for (a1 a1Var2 : this.y) {
            a1Var2.D(true);
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.e);
                a1Var2.h = null;
                a1Var2.g = null;
            }
        }
        for (l2.j jVar : this.e.i) {
            d dVar = jVar.a;
            if (dVar != null) {
                dVar.a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                o oVar = (o) bVar.y.remove(this);
                if (oVar != null) {
                    a1 a1Var3 = oVar.a;
                    a1Var3.D(true);
                    n2.g gVar4 = a1Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(a1Var3.e);
                        a1Var3.h = null;
                        a1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // u2.d1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.d1
    public final long d() {
        if (v()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return t().n;
    }

    @Override // u2.b1
    public final boolean e() {
        return !v() && this.x.x(this.O);
    }

    @Override // u2.b1
    public final int f(x xVar, h2.h hVar, int i10) {
        if (v()) {
            return -3;
        }
        a aVar = this.L;
        a1 a1Var = this.x;
        if (aVar != null && aVar.d(0) <= a1Var.t()) {
            return -3;
        }
        w();
        return a1Var.C(xVar, hVar, i10, this.O);
    }

    @Override // u2.b1
    public final int j(long j3) {
        if (v()) {
            return 0;
        }
        boolean z10 = this.O;
        a1 a1Var = this.x;
        int v = a1Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - a1Var.t());
        }
        a1Var.H(v);
        w();
        return v;
    }

    public final a m(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.U(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.x.n(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.y;
            if (i11 >= a1VarArr.length) {
                return aVar;
            }
            a1 a1Var = a1VarArr[i11];
            i11++;
            a1Var.n(aVar.d(i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03fb  */
    @Override // u2.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(s0 s0Var) {
        long j3;
        List list;
        p pVar;
        long j10;
        boolean z10;
        List list2;
        List list3;
        k kVar;
        long j11;
        long j12;
        y2.l lVar;
        p pVar2;
        List list4;
        boolean z11;
        long j13;
        long i10;
        int i11;
        Object iVar;
        m2.j jVar;
        rb.a aVar;
        long j14;
        long i12;
        boolean z12;
        boolean z13;
        if (this.O) {
            return false;
        }
        y2.l lVar2 = this.r;
        if (lVar2.d() || lVar2.c()) {
            return false;
        }
        boolean v = v();
        if (v) {
            list = Collections.EMPTY_LIST;
            j3 = this.I;
        } else {
            j3 = t().n;
            list = this.w;
        }
        List list5 = list;
        l2.l lVar3 = this.e;
        l2.j[] jVarArr = lVar3.i;
        u2.b bVar = lVar3.m;
        p pVar3 = this.s;
        if (bVar != null) {
            z10 = v;
            pVar = pVar3;
            j10 = -9223372036854775807L;
        } else {
            pVar = pVar3;
            long j15 = s0Var.a;
            long j16 = j3 - j15;
            j10 = -9223372036854775807L;
            z10 = v;
            long P = d0.P(lVar3.k.b(lVar3.l).b) + d0.P(lVar3.k.a) + j3;
            o oVar = lVar3.h;
            if (oVar != null) {
                l2.p pVar4 = oVar.e;
                m2.c cVar = pVar4.f;
                l2.f fVar = pVar4.b;
                if (!cVar.d) {
                    list2 = list5;
                    z12 = false;
                } else if (pVar4.n) {
                    list2 = list5;
                    z12 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = pVar4.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= P) {
                        z12 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        l2.h hVar = (l2.h) fVar.b;
                        long j17 = hVar.N;
                        if (j17 == -9223372036854775807L || j17 < longValue) {
                            hVar.N = longValue;
                        }
                        z12 = true;
                    }
                    if (z12 && pVar4.h) {
                        pVar4.n = true;
                        pVar4.h = false;
                        l2.h hVar2 = (l2.h) fVar.b;
                        hVar2.D.removeCallbacks(hVar2.w);
                        hVar2.A();
                    }
                }
            } else {
                list2 = list5;
            }
            long P2 = d0.P(d0.z(lVar3.f));
            m2.c cVar2 = lVar3.k;
            long j18 = cVar2.a;
            long P3 = j18 == -9223372036854775807L ? -9223372036854775807L : P2 - d0.P(j18 + cVar2.b(lVar3.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                kVar = null;
            } else {
                list3 = list2;
                kVar = (k) v.h(1, list3);
            }
            int length = lVar3.j.length();
            l[] lVarArr = new l[length];
            int i13 = 0;
            while (i13 < length) {
                l2.j[] jVarArr2 = jVarArr;
                l2.j jVar2 = jVarArr2[i13];
                long j19 = j15;
                l2.i iVar2 = jVar2.d;
                rb.a aVar2 = l.B;
                if (iVar2 == null) {
                    lVarArr[i13] = aVar2;
                    j14 = P3;
                } else {
                    long b10 = jVar2.b(P2);
                    long c10 = jVar2.c(P2);
                    if (kVar != null) {
                        i12 = kVar.b();
                        aVar = aVar2;
                        j14 = P3;
                    } else {
                        l2.i iVar3 = jVar2.d;
                        e2.d.h(iVar3);
                        aVar = aVar2;
                        j14 = P3;
                        i12 = d0.i(iVar3.n(j3, jVar2.e) + jVar2.f, b10, c10);
                    }
                    long j20 = i12;
                    if (j20 < b10) {
                        lVarArr[i13] = aVar;
                    } else {
                        lVarArr[i13] = new l2.k(lVar3.b(i13), j20, c10);
                    }
                }
                i13++;
                jVarArr = jVarArr2;
                j15 = j19;
                P3 = j14;
            }
            l2.j[] jVarArr3 = jVarArr;
            long j21 = j15;
            long j22 = P3;
            if (!lVar3.k.d || jVarArr3[0].d() == 0) {
                j11 = 0;
                j12 = -9223372036854775807L;
            } else {
                long e7 = jVarArr3[0].e(jVarArr3[0].c(P2));
                m2.c cVar3 = lVar3.k;
                long j23 = cVar3.a;
                j11 = 0;
                j12 = Math.max(0L, Math.min(j23 == -9223372036854775807L ? -9223372036854775807L : P2 - d0.P(j23 + cVar3.b(lVar3.l).b), e7) - j21);
            }
            lVar = lVar2;
            long j24 = j11;
            pVar2 = pVar;
            lVar3.j.k(j21, j16, j12, list3, lVarArr);
            int c11 = lVar3.j.c();
            SystemClock.elapsedRealtime();
            l2.j b11 = lVar3.b(c11);
            long j25 = b11.e;
            long j26 = b11.f;
            l2.i iVar4 = b11.d;
            m2.b bVar2 = b11.c;
            d dVar = b11.a;
            m2.m mVar = b11.b;
            if (dVar != null) {
                m2.j jVar3 = dVar.r == null ? mVar.h : null;
                if (iVar4 == null) {
                    list4 = list3;
                    jVar = mVar.e();
                } else {
                    list4 = list3;
                    jVar = null;
                }
                if (jVar3 != null || jVar != null) {
                    g2.h hVar3 = lVar3.e;
                    s m10 = lVar3.j.m();
                    int n10 = lVar3.j.n();
                    Object q6 = lVar3.j.q();
                    if (jVar3 != null) {
                        m2.j a2 = jVar3.a(jVar, bVar2.a);
                        if (a2 != null) {
                            jVar3 = a2;
                        }
                    } else {
                        jVar.getClass();
                        jVar3 = jVar;
                    }
                    pVar2.c = new j(hVar3, w7.k.a(mVar, bVar2.a, jVar3, 0), m10, n10, q6, b11.a);
                    z13 = pVar2.b;
                    e eVar = (e) pVar2.c;
                    pVar2.c = null;
                    pVar2.b = false;
                    if (z13) {
                        this.I = j10;
                        this.O = true;
                        return true;
                    }
                    if (eVar == null) {
                        return false;
                    }
                    this.F = eVar;
                    boolean z14 = eVar instanceof a;
                    b5 b5Var = this.E;
                    if (z14) {
                        a aVar3 = (a) eVar;
                        if (z10) {
                            long j27 = aVar3.h;
                            long j28 = this.I;
                            if (j27 < j28) {
                                this.x.t = j28;
                                for (a1 a1Var : this.y) {
                                    a1Var.t = this.I;
                                }
                                if (this.M) {
                                    s sVar = aVar3.d;
                                    this.N = !r0.a(sVar.r, sVar.k);
                                }
                            }
                            this.M = false;
                            this.I = -9223372036854775807L;
                        }
                        aVar3.x = b5Var;
                        a1[] a1VarArr = (a1[]) b5Var.b;
                        int[] iArr = new int[a1VarArr.length];
                        for (int i14 = 0; i14 < a1VarArr.length; i14++) {
                            a1 a1Var2 = a1VarArr[i14];
                            iArr[i14] = a1Var2.q + a1Var2.p;
                        }
                        aVar3.y = iArr;
                        this.v.add(aVar3);
                    } else if (eVar instanceof j) {
                        ((j) eVar).v = b5Var;
                    }
                    lVar.f(eVar, this, this.n.m3(eVar.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            m2.c cVar4 = lVar3.k;
            boolean z15 = cVar4.d && lVar3.l == cVar4.m.size() + (-1);
            boolean z16 = (z15 && j25 == -9223372036854775807L) ? false : true;
            if (b11.d() == j24) {
                pVar2.b = z16;
            } else {
                boolean z17 = z16;
                long b12 = b11.b(P2);
                long c12 = b11.c(P2);
                if (z15) {
                    long e10 = b11.e(c12);
                    z11 = z17 & ((e10 - b11.f(c12)) + e10 >= j25);
                } else {
                    z11 = z17;
                }
                if (kVar != null) {
                    i10 = kVar.b();
                    j13 = c12;
                } else {
                    e2.d.h(iVar4);
                    j13 = c12;
                    i10 = d0.i(iVar4.n(j3, j25) + j26, b12, j13);
                }
                long j29 = i10;
                if (j29 < b12) {
                    lVar3.m = new u2.b();
                } else {
                    if (j29 <= j13) {
                        long j30 = j3;
                        if (!lVar3.n || j29 < j13) {
                            if (!z11 || b11.f(j29) < j25) {
                                int min = (int) Math.min(lVar3.g, (j13 - j29) + 1);
                                int i15 = (j25 > (-9223372036854775807L) ? 1 : (j25 == (-9223372036854775807L) ? 0 : -1));
                                if (i15 != 0) {
                                    while (min > 1 && b11.f((min + j29) - 1) >= j25) {
                                        min--;
                                    }
                                }
                                long j31 = list4.isEmpty() ? j30 : -9223372036854775807L;
                                g2.h hVar4 = lVar3.e;
                                int i16 = lVar3.d;
                                s m11 = lVar3.j.m();
                                int n11 = lVar3.j.n();
                                Object q10 = lVar3.j.q();
                                long f7 = b11.f(j29);
                                e2.d.h(iVar4);
                                m2.j k10 = iVar4.k(j29 - j26);
                                if (dVar == null) {
                                    iVar = new m(hVar4, w7.k.a(mVar, bVar2.a, k10, b11.g(j29, j22) ? 0 : 8), m11, n11, q10, f7, b11.e(j29), j29, i16, m11);
                                } else {
                                    int i17 = 1;
                                    int i18 = 1;
                                    while (true) {
                                        if (i17 >= min) {
                                            i11 = i15;
                                            break;
                                        }
                                        int i19 = min;
                                        i11 = i15;
                                        e2.d.h(iVar4);
                                        m2.j a10 = k10.a(iVar4.k((j29 + i17) - j26), bVar2.a);
                                        if (a10 == null) {
                                            break;
                                        }
                                        i18++;
                                        i17++;
                                        i15 = i11;
                                        k10 = a10;
                                        min = i19;
                                    }
                                    long j32 = (j29 + i18) - 1;
                                    long e11 = b11.e(j32);
                                    long j33 = (i11 == 0 || j25 > e11) ? -9223372036854775807L : j25;
                                    g2.m a11 = w7.k.a(mVar, bVar2.a, k10, b11.g(j32, j22) ? 0 : 8);
                                    long j34 = -mVar.c;
                                    if (r0.k(m11.r)) {
                                        j34 += f7;
                                    }
                                    iVar = new i(hVar4, a11, m11, n11, q10, f7, e11, j31, j33, j29, i18, j34, b11.a);
                                }
                                pVar2.c = iVar;
                            } else {
                                pVar2.b = true;
                            }
                        }
                    }
                    pVar2.b = z11;
                }
            }
            z13 = pVar2.b;
            e eVar2 = (e) pVar2.c;
            pVar2.c = null;
            pVar2.b = false;
            if (z13) {
            }
        }
        lVar = lVar2;
        pVar2 = pVar;
        z13 = pVar2.b;
        e eVar22 = (e) pVar2.c;
        pVar2.c = null;
        pVar2.b = false;
        if (z13) {
        }
    }

    @Override // u2.d1
    public final long q() {
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.I;
        }
        long j3 = this.J;
        a t10 = t();
        if (!t10.c()) {
            ArrayList arrayList = this.v;
            t10 = arrayList.size() > 1 ? (a) hg.c.g(2, arrayList) : null;
        }
        if (t10 != null) {
            j3 = Math.max(j3, t10.n);
        }
        return Math.max(j3, this.x.q());
    }

    @Override // u2.d1
    public final void s(long j3) {
        y2.l lVar = this.r;
        if (lVar.c() || v()) {
            return;
        }
        boolean d = lVar.d();
        List list = this.w;
        l2.l lVar2 = this.e;
        ArrayList arrayList = this.v;
        if (d) {
            e eVar = this.F;
            eVar.getClass();
            boolean z10 = eVar instanceof a;
            if (z10 && u(arrayList.size() - 1)) {
                return;
            }
            if (lVar2.m == null ? lVar2.j.d(j3, eVar, list) : false) {
                lVar.b();
                if (z10) {
                    this.L = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (lVar2.m != null || lVar2.j.length() < 2) ? list.size() : lVar2.j.i(j3, list);
        if (size < arrayList.size()) {
            e2.d.g(!lVar.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!u(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j10 = t().n;
            a m10 = m(size);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
            this.O = false;
            this.h.A(this.a, m10.h, j10);
        }
    }

    public final a t() {
        return (a) hg.c.g(1, this.v);
    }

    public final boolean u(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a1[] a1VarArr = this.y;
            if (i11 >= a1VarArr.length) {
                return false;
            }
            t10 = a1VarArr[i11].t();
            i11++;
        } while (t10 <= aVar.d(i11));
        return true;
    }

    public final boolean v() {
        return this.I != -9223372036854775807L;
    }

    public final void w() {
        int x10 = x(this.x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 > x10) {
                return;
            }
            this.K = i10 + 1;
            a aVar = (a) this.v.get(i10);
            s sVar = aVar.d;
            if (!sVar.equals(this.G)) {
                this.h.l(this.a, sVar, aVar.e, aVar.f, aVar.h);
            }
            this.G = sVar;
        }
    }

    public final int x(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).d(0) <= i10);
        return i11 - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0285  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d y(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        t tVar;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        rb.a aVar;
        boolean z12;
        long j11;
        boolean z13;
        k4.d dVar;
        boolean a2;
        e eVar = (e) iVar;
        g2.b0 b0Var = eVar.r;
        s sVar = eVar.d;
        long j12 = eVar.h;
        long j13 = b0Var.b;
        boolean z14 = eVar instanceof a;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        boolean z15 = (j13 != 0 && z14 && u(size)) ? false : true;
        Uri uri = eVar.r.c;
        t tVar2 = new t(j10);
        d0.d0(j12);
        d0.d0(eVar.n);
        c5.b0 b0Var2 = new c5.b0(iOException, i10, 15);
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.i;
        com.google.firebase.messaging.s sVar2 = lVar.b;
        rb.a aVar2 = this.n;
        if (z15) {
            tVar = tVar2;
            o oVar = lVar.h;
            if (oVar != null) {
                long j14 = oVar.d;
                boolean z16 = j14 != -9223372036854775807L && j14 < j12;
                l2.p pVar = oVar.e;
                if (pVar.f.d) {
                    if (!pVar.n) {
                        if (z16) {
                            if (pVar.h) {
                                pVar.n = true;
                                pVar.h = false;
                                l2.h hVar = (l2.h) pVar.b.b;
                                hVar.D.removeCallbacks(hVar.w);
                                hVar.A();
                            }
                        }
                    }
                    z11 = z15;
                    arrayList = arrayList2;
                    aVar = aVar2;
                    z10 = z14;
                    z12 = true;
                    z13 = true;
                    if (z13) {
                        if (z11) {
                            if (z10) {
                                e2.d.g(m(size) == eVar ? z12 : false);
                                if (arrayList.isEmpty()) {
                                    this.I = this.J;
                                }
                            }
                            dVar = y2.l.e;
                            if (dVar == null) {
                                aVar.getClass();
                                long n32 = rb.a.n3(b0Var2);
                                dVar = n32 != -9223372036854775807L ? new k4.d(0, n32, false) : y2.l.f;
                            }
                            k4.d dVar2 = dVar;
                            a2 = dVar2.a();
                            rb.a aVar3 = aVar;
                            this.h.r(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                                this.F = null;
                                aVar3.getClass();
                                this.f.D(this);
                            }
                            return dVar2;
                        }
                        e2.a.n("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    dVar = null;
                    if (dVar == null) {
                    }
                    k4.d dVar22 = dVar;
                    a2 = dVar22.a();
                    rb.a aVar32 = aVar;
                    this.h.r(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                    if (!a2) {
                    }
                    return dVar22;
                }
            }
            if (!lVar.k.d && (eVar instanceof k) && (iOException instanceof g2.x) && ((g2.x) iOException).d == 404) {
                l2.j jVar = jVarArr[lVar.j.s(sVar)];
                long d = jVar.d();
                if (d != -1 && d != 0) {
                    l2.i iVar2 = jVar.d;
                    e2.d.h(iVar2);
                    if (((k) eVar).b() > ((iVar2.u() + jVar.f) + d) - 1) {
                        lVar.n = true;
                        z11 = z15;
                        arrayList = arrayList2;
                        aVar = aVar2;
                        z10 = z14;
                        z12 = true;
                        z13 = true;
                        if (z13) {
                        }
                        dVar = null;
                        if (dVar == null) {
                        }
                        k4.d dVar222 = dVar;
                        a2 = dVar222.a();
                        rb.a aVar322 = aVar;
                        this.h.r(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                        if (!a2) {
                        }
                        return dVar222;
                    }
                }
            }
            l2.j jVar2 = jVarArr[lVar.j.s(sVar)];
            m2.m mVar = jVar2.b;
            m2.b bVar = jVar2.c;
            m2.b j15 = sVar2.j(mVar.b);
            if (j15 == null || bVar.equals(j15)) {
                r rVar = lVar.j;
                i0 i0Var = jVar2.b.b;
                z10 = z14;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                z11 = z15;
                int length = rVar.length();
                arrayList = arrayList2;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (rVar.a(i12, elapsedRealtime)) {
                        i11++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i13 = 0; i13 < i0Var.size(); i13++) {
                    hashSet.add(Integer.valueOf(((m2.b) i0Var.get(i13)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList a10 = sVar2.a(i0Var);
                aVar = aVar2;
                for (int i14 = 0; i14 < a10.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((m2.b) a10.get(i14)).c));
                }
                ki.x xVar = new ki.x(size2, size2 - hashSet2.size(), length, i11);
                if (xVar.b(2) || xVar.b(1)) {
                    aVar.getClass();
                    k4.d l32 = rb.a.l3(xVar, b0Var2);
                    if (l32 != null) {
                        long j16 = l32.b;
                        int i15 = l32.a;
                        if (xVar.b(i15)) {
                            if (i15 == 2) {
                                r rVar2 = lVar.j;
                                z13 = rVar2.o(rVar2.s(sVar), j16);
                                z12 = true;
                            } else {
                                z12 = true;
                                if (i15 == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j16;
                                    String str = bVar.b;
                                    HashMap hashMap = (HashMap) sVar2.b;
                                    if (hashMap.containsKey(str)) {
                                        Long l4 = (Long) hashMap.get(str);
                                        String str2 = d0.a;
                                        j11 = Math.max(elapsedRealtime2, l4.longValue());
                                    } else {
                                        j11 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j11));
                                    int i16 = bVar.c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i16);
                                        HashMap hashMap2 = (HashMap) sVar2.c;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l10 = (Long) hashMap2.get(valueOf);
                                            String str3 = d0.a;
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, l10.longValue());
                                        }
                                        hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                    }
                                    z13 = true;
                                }
                                z13 = false;
                            }
                            if (z13) {
                            }
                            dVar = null;
                            if (dVar == null) {
                            }
                            k4.d dVar2222 = dVar;
                            a2 = dVar2222.a();
                            rb.a aVar3222 = aVar;
                            this.h.r(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                            }
                            return dVar2222;
                        }
                    }
                }
            }
            z11 = z15;
            arrayList = arrayList2;
            aVar = aVar2;
            z10 = z14;
            z12 = true;
            z13 = true;
            if (z13) {
            }
            dVar = null;
            if (dVar == null) {
            }
            k4.d dVar22222 = dVar;
            a2 = dVar22222.a();
            rb.a aVar32222 = aVar;
            this.h.r(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
            if (!a2) {
            }
            return dVar22222;
        }
        tVar = tVar2;
        z11 = z15;
        arrayList = arrayList2;
        aVar = aVar2;
        z10 = z14;
        z12 = true;
        z13 = false;
        if (z13) {
        }
        dVar = null;
        if (dVar == null) {
        }
        k4.d dVar222222 = dVar;
        a2 = dVar222222.a();
        rb.a aVar322222 = aVar;
        this.h.r(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
        if (!a2) {
        }
        return dVar222222;
    }

    public final void z(l2.b bVar) {
        this.H = bVar;
        a1 a1Var = this.x;
        a1Var.k();
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.e);
            a1Var.h = null;
            a1Var.g = null;
        }
        for (a1 a1Var2 : this.y) {
            a1Var2.k();
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.e);
                a1Var2.h = null;
                a1Var2.g = null;
            }
        }
        this.r.e(this);
    }
}
