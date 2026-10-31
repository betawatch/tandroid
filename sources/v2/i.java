package v2;

import android.os.SystemClock;
import android.support.v4.media.session.a0;
import b2.u;
import b2.v0;
import b2.x;
import c3.g0;
import e2.l0;
import e9.n0;
import g2.c0;
import g2.y;
import i2.w0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l2.o;
import l2.p;
import u2.c1;
import u2.d1;
import u2.f1;
import v7.t6;
import x2.q;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i implements d1, f1, y2.g, y2.j {
    public final c1[] D;
    public final u9.b E;
    public f F;
    public x G;
    public h H;
    public long I;
    public long J;
    public int K;
    public a L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final int a;
    public final int[] b;
    public final x[] c;
    public final boolean[] d;
    public final l2.l e;
    public final l2.b f;
    public final a5.a h;
    public final hb.a n;
    public final y2.l r;
    public final u s;
    public final ArrayList w;
    public final List x;
    public final c1 y;

    public i(int i10, int[] iArr, x[] xVarArr, l2.l lVar, l2.b bVar, a0 a0Var, long j10, n2.m mVar, n2.j jVar, hb.a aVar, a5.a aVar2, boolean z10, long j11, z2.a aVar3) {
        this.a = i10;
        this.b = iArr;
        this.c = xVarArr;
        this.e = lVar;
        this.f = bVar;
        this.h = aVar2;
        this.n = aVar;
        this.r = aVar3 != null ? new y2.l(aVar3) : new y2.l("ChunkSampleStream");
        this.s = new u(6);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.D = new c1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c1[] c1VarArr = new c1[i11];
        mVar.getClass();
        c1 c1Var = new c1(a0Var, mVar, jVar);
        this.y = c1Var;
        iArr2[0] = i10;
        c1VarArr[0] = c1Var;
        int i12 = 0;
        while (i12 < length) {
            c1 c1Var2 = new c1(a0Var, null, null);
            this.D[i12] = c1Var2;
            int i13 = i12 + 1;
            c1VarArr[i13] = c1Var2;
            iArr2[i13] = this.b[i12];
            i12 = i13;
        }
        this.E = new u9.b(1, iArr2, c1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (!z10 || j11 == -9223372036854775807L) {
            return;
        }
        this.M = false;
        this.N = j11 < j10;
    }

    public final void A() {
        int B = B(this.y.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 > B) {
                return;
            }
            this.K = i10 + 1;
            a aVar = (a) this.w.get(i10);
            x xVar = aVar.d;
            if (!xVar.equals(this.G)) {
                this.h.l(this.a, xVar, aVar.e, aVar.f, aVar.h);
            }
            this.G = xVar;
        }
    }

    public final int B(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.w;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).d(0) <= i10);
        return i11 - 1;
    }

    public final void C(l2.b bVar) {
        this.H = bVar;
        c1 c1Var = this.y;
        c1Var.l();
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.D) {
            c1Var2.l();
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        this.r.e(this);
    }

    @Override // y2.g
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.a;
        g2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        u2.u uVar = new u2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.n.getClass();
        this.h.p(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (y()) {
            this.y.G(false);
            for (c1 c1Var : this.D) {
                c1Var.G(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.w;
            v(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
        }
        this.f.r(this);
    }

    @Override // u2.d1
    public final void a() {
        y2.l lVar = this.r;
        lVar.a();
        this.y.C();
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
        c1 c1Var = this.y;
        c1Var.G(true);
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.D) {
            c1Var2.G(true);
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        for (l2.j jVar : this.e.i) {
            e eVar = jVar.a;
            if (eVar != null) {
                eVar.a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            l2.b bVar = (l2.b) hVar;
            synchronized (bVar) {
                o oVar = (o) bVar.D.remove(this);
                if (oVar != null) {
                    c1 c1Var3 = oVar.a;
                    c1Var3.G(true);
                    n2.g gVar3 = c1Var3.h;
                    if (gVar3 != null) {
                        gVar3.a(c1Var3.e);
                        c1Var3.h = null;
                        c1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // u2.f1
    public final long c() {
        if (y()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    @Override // u2.f1
    public final boolean d() {
        return this.r.d();
    }

    @Override // u2.d1
    public final boolean e() {
        return !y() && this.y.A(this.P);
    }

    @Override // u2.d1
    public final int i(long j10) {
        if (y() || z() || this.O) {
            return 0;
        }
        boolean z10 = this.P;
        c1 c1Var = this.y;
        int x10 = c1Var.x(j10, z10);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x10);
        A();
        return x10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028f  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        hb.a aVar;
        ArrayList arrayList;
        u2.u uVar;
        boolean z13;
        boolean z14;
        long j12;
        boolean z15;
        k4.d dVar;
        boolean a2;
        f fVar = (f) iVar;
        c0 c0Var = fVar.r;
        x xVar = fVar.d;
        long j13 = fVar.h;
        long j14 = c0Var.b;
        boolean z16 = fVar instanceof a;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size() - 1;
        if (j14 != 0 && z16 && x(size)) {
            z10 = false;
            z11 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        g2.n nVar = fVar.b;
        c0 c0Var2 = fVar.r;
        u2.u uVar2 = new u2.u(nVar, c0Var2.c, c0Var2.d, j10, j11, j14);
        l0.h0(j13);
        l0.h0(fVar.n);
        c5.x xVar2 = new c5.x(iOException, i10, 20);
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.i;
        xa.n nVar2 = lVar.b;
        hb.a aVar2 = this.n;
        if (z10) {
            z12 = z16;
            o oVar = lVar.h;
            if (oVar != null) {
                long j15 = oVar.d;
                boolean z17 = j15 != -9223372036854775807L && j15 < j13;
                p pVar = oVar.e;
                if (pVar.f.d) {
                    if (!pVar.n) {
                        if (z17) {
                            if (pVar.h) {
                                pVar.n = true;
                                pVar.h = false;
                                l2.h hVar = (l2.h) pVar.b.b;
                                hVar.D.removeCallbacks(hVar.w);
                                hVar.C();
                            }
                        }
                    }
                    aVar = aVar2;
                    arrayList = arrayList2;
                    z13 = z10;
                    uVar = uVar2;
                    z14 = true;
                    z15 = true;
                    if (z15) {
                        if (z13) {
                            if (z12) {
                                t6.p(v(size) == fVar ? z14 : false);
                                if (arrayList.isEmpty()) {
                                    this.I = this.J;
                                }
                            }
                            dVar = y2.l.e;
                            if (dVar == null) {
                                aVar.getClass();
                                long t02 = hb.a.t0(xVar2);
                                dVar = t02 != -9223372036854775807L ? new k4.d(0, t02, false) : y2.l.f;
                            }
                            k4.d dVar2 = dVar;
                            a2 = dVar2.a();
                            this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                            if (!a2) {
                                this.F = null;
                                aVar.getClass();
                                this.f.r(this);
                            }
                            return dVar2;
                        }
                        e2.a.l("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    dVar = null;
                    if (dVar == null) {
                    }
                    k4.d dVar22 = dVar;
                    a2 = dVar22.a();
                    this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                    if (!a2) {
                    }
                    return dVar22;
                }
            }
            if (!lVar.k.d && (fVar instanceof l) && (iOException instanceof y) && ((y) iOException).c == 404) {
                l2.j jVar = jVarArr[lVar.j.s(xVar)];
                long c10 = jVar.c();
                if (c10 != -1 && c10 != 0) {
                    l2.i iVar2 = jVar.d;
                    iVar2.getClass();
                    if (((l) fVar).a() > ((iVar2.u() + jVar.f) + c10) - 1) {
                        lVar.n = true;
                        aVar = aVar2;
                        arrayList = arrayList2;
                        z13 = z10;
                        uVar = uVar2;
                        z14 = true;
                        z15 = true;
                        if (z15) {
                        }
                        dVar = null;
                        if (dVar == null) {
                        }
                        k4.d dVar222 = dVar;
                        a2 = dVar222.a();
                        this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                        if (!a2) {
                        }
                        return dVar222;
                    }
                }
            }
            l2.j jVar2 = jVarArr[lVar.j.s(xVar)];
            m2.m mVar = jVar2.b;
            m2.b bVar = jVar2.c;
            m2.b W = nVar2.W(mVar.b);
            if (W == null || bVar.equals(W)) {
                q qVar = lVar.j;
                n0 n0Var = jVar2.b.b;
                boolean z18 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar = aVar2;
                int length = qVar.length();
                arrayList = arrayList2;
                uVar = uVar2;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (qVar.a(i12, elapsedRealtime)) {
                        i11++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i13 = 0; i13 < n0Var.size(); i13++) {
                    hashSet.add(Integer.valueOf(((m2.b) n0Var.get(i13)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList k10 = nVar2.k(n0Var);
                z13 = z18;
                for (int i14 = 0; i14 < k10.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((m2.b) k10.get(i14)).c));
                }
                li.c0 c0Var3 = new li.c0(size2, size2 - hashSet2.size(), length, i11);
                if (c0Var3.a(2) || c0Var3.a(1)) {
                    aVar.getClass();
                    k4.d p02 = hb.a.p0(c0Var3, xVar2);
                    if (p02 != null) {
                        long j16 = p02.b;
                        int i15 = p02.a;
                        if (c0Var3.a(i15)) {
                            if (i15 == 2) {
                                q qVar2 = lVar.j;
                                z15 = qVar2.o(qVar2.s(xVar), j16);
                                z14 = true;
                            } else {
                                z14 = true;
                                if (i15 == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j16;
                                    String str = bVar.b;
                                    HashMap hashMap = (HashMap) nVar2.a;
                                    if (hashMap.containsKey(str)) {
                                        Long l4 = (Long) hashMap.get(str);
                                        String str2 = l0.a;
                                        j12 = Math.max(elapsedRealtime2, l4.longValue());
                                    } else {
                                        j12 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j12));
                                    int i16 = bVar.c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i16);
                                        HashMap hashMap2 = (HashMap) nVar2.b;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l10 = (Long) hashMap2.get(valueOf);
                                            String str3 = l0.a;
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, l10.longValue());
                                        }
                                        hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                    }
                                    z15 = true;
                                }
                                z15 = false;
                            }
                            if (z15) {
                            }
                            dVar = null;
                            if (dVar == null) {
                            }
                            k4.d dVar2222 = dVar;
                            a2 = dVar2222.a();
                            this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                            if (!a2) {
                            }
                            return dVar2222;
                        }
                    }
                }
            }
            aVar = aVar2;
            arrayList = arrayList2;
            z13 = z10;
            uVar = uVar2;
            z14 = true;
            z15 = true;
            if (z15) {
            }
            dVar = null;
            if (dVar == null) {
            }
            k4.d dVar22222 = dVar;
            a2 = dVar22222.a();
            this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
            if (!a2) {
            }
            return dVar22222;
        }
        z12 = z16;
        aVar = aVar2;
        arrayList = arrayList2;
        z13 = z10;
        uVar = uVar2;
        z14 = true;
        z15 = false;
        if (z15) {
        }
        dVar = null;
        if (dVar == null) {
        }
        k4.d dVar222222 = dVar;
        a2 = dVar222222.a();
        this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
        if (!a2) {
        }
        return dVar222222;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03fd  */
    @Override // u2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(w0 w0Var) {
        long j10;
        List list;
        u uVar;
        long j11;
        boolean z10;
        List list2;
        List list3;
        l lVar;
        long j12;
        long j13;
        y2.l lVar2;
        u uVar2;
        List list4;
        boolean z11;
        long j14;
        long j15;
        int i10;
        Object jVar;
        m2.j jVar2;
        long j16;
        boolean z12;
        boolean z13;
        if (this.P) {
            return false;
        }
        y2.l lVar3 = this.r;
        if (lVar3.d() || lVar3.c()) {
            return false;
        }
        boolean y3 = y();
        if (y3) {
            list = Collections.EMPTY_LIST;
            j10 = this.I;
        } else {
            j10 = w().n;
            list = this.x;
        }
        List list5 = list;
        l2.l lVar4 = this.e;
        l2.j[] jVarArr = lVar4.i;
        u2.b bVar = lVar4.m;
        u uVar3 = this.s;
        if (bVar != null) {
            z10 = y3;
            uVar = uVar3;
            j11 = -9223372036854775807L;
        } else {
            uVar = uVar3;
            long j17 = w0Var.a;
            long j18 = j10 - j17;
            j11 = -9223372036854775807L;
            z10 = y3;
            long S = l0.S(lVar4.k.b(lVar4.l).b) + l0.S(lVar4.k.a) + j10;
            o oVar = lVar4.h;
            if (oVar != null) {
                p pVar = oVar.e;
                m2.c cVar = pVar.f;
                l2.f fVar = pVar.b;
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
                        l2.h hVar = (l2.h) fVar.b;
                        long j19 = hVar.M;
                        if (j19 == -9223372036854775807L || j19 < longValue) {
                            hVar.M = longValue;
                        }
                        z12 = true;
                    }
                    if (z12 && pVar.h) {
                        pVar.n = true;
                        pVar.h = false;
                        l2.h hVar2 = (l2.h) fVar.b;
                        hVar2.D.removeCallbacks(hVar2.w);
                        hVar2.C();
                    }
                }
            } else {
                list2 = list5;
            }
            long S2 = l0.S(l0.C(lVar4.f));
            m2.c cVar2 = lVar4.k;
            long j20 = cVar2.a;
            long S3 = j20 == -9223372036854775807L ? -9223372036854775807L : S2 - l0.S(j20 + cVar2.b(lVar4.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                lVar = null;
            } else {
                list3 = list2;
                lVar = (l) sc.e.g(1, list3);
            }
            int length = lVar4.j.length();
            m[] mVarArr = new m[length];
            int i11 = 0;
            while (i11 < length) {
                l2.j[] jVarArr2 = jVarArr;
                l2.j jVar3 = jVarArr2[i11];
                long j21 = j17;
                l2.i iVar = jVar3.d;
                long j22 = S3;
                long j23 = jVar3.f;
                long j24 = jVar3.e;
                t7.u uVar4 = m.v;
                if (iVar == null) {
                    mVarArr[i11] = uVar4;
                } else {
                    iVar.getClass();
                    long e = iVar.e(j24, S2) + j23;
                    long b10 = jVar3.b(S2);
                    if (lVar != null) {
                        j16 = lVar.a();
                    } else {
                        l2.i iVar2 = jVar3.d;
                        iVar2.getClass();
                        j16 = l0.j(iVar2.o(j10, j24) + j23, e, b10);
                    }
                    long j25 = j16;
                    if (j25 < e) {
                        mVarArr[i11] = uVar4;
                    } else {
                        mVarArr[i11] = new l2.k(lVar4.b(i11), j25, b10);
                    }
                }
                i11++;
                jVarArr = jVarArr2;
                j17 = j21;
                S3 = j22;
            }
            l2.j[] jVarArr3 = jVarArr;
            long j26 = j17;
            long j27 = S3;
            if (!lVar4.k.d || jVarArr3[0].c() == 0) {
                j12 = 0;
                j13 = -9223372036854775807L;
            } else {
                long d = jVarArr3[0].d(jVarArr3[0].b(S2));
                m2.c cVar3 = lVar4.k;
                long j28 = cVar3.a;
                j12 = 0;
                j13 = Math.max(0L, Math.min(j28 == -9223372036854775807L ? -9223372036854775807L : S2 - l0.S(j28 + cVar3.b(lVar4.l).b), d) - j26);
            }
            lVar2 = lVar3;
            long j29 = j12;
            uVar2 = uVar;
            lVar4.j.k(j26, j18, j13, list3, mVarArr);
            int c10 = lVar4.j.c();
            SystemClock.elapsedRealtime();
            l2.j b11 = lVar4.b(c10);
            long j30 = b11.e;
            long j31 = b11.f;
            l2.i iVar3 = b11.d;
            m2.b bVar2 = b11.c;
            e eVar = b11.a;
            m2.m mVar = b11.b;
            if (eVar != null) {
                m2.j jVar4 = eVar.s == null ? mVar.h : null;
                if (iVar3 == null) {
                    list4 = list3;
                    jVar2 = mVar.h();
                } else {
                    list4 = list3;
                    jVar2 = null;
                }
                if (jVar4 != null || jVar2 != null) {
                    g2.h hVar3 = lVar4.e;
                    x m10 = lVar4.j.m();
                    int n10 = lVar4.j.n();
                    Object q6 = lVar4.j.q();
                    if (jVar4 != null) {
                        m2.j a2 = jVar4.a(jVar2, bVar2.a);
                        if (a2 != null) {
                            jVar4 = a2;
                        }
                    } else {
                        jVar2.getClass();
                        jVar4 = jVar2;
                    }
                    uVar2.c = new k(hVar3, w7.k.a(mVar, bVar2.a, jVar4, 0), m10, n10, q6, b11.a);
                    z13 = uVar2.b;
                    f fVar2 = (f) uVar2.c;
                    uVar2.c = null;
                    uVar2.b = false;
                    if (z13) {
                        this.I = j11;
                        this.P = true;
                        return true;
                    }
                    if (fVar2 == null) {
                        return false;
                    }
                    this.F = fVar2;
                    boolean z14 = fVar2 instanceof a;
                    u9.b bVar3 = this.E;
                    if (z14) {
                        a aVar = (a) fVar2;
                        if (z10) {
                            long j32 = aVar.h;
                            long j33 = this.I;
                            if (j32 < j33) {
                                this.y.t = j33;
                                for (c1 c1Var : this.D) {
                                    c1Var.t = this.I;
                                }
                                this.N = this.M;
                            }
                            this.M = false;
                            this.I = -9223372036854775807L;
                        }
                        aVar.y = bVar3;
                        c1[] c1VarArr = (c1[]) bVar3.c;
                        int[] iArr = new int[c1VarArr.length];
                        for (int i12 = 0; i12 < c1VarArr.length; i12++) {
                            c1 c1Var2 = c1VarArr[i12];
                            iArr[i12] = c1Var2.q + c1Var2.p;
                        }
                        aVar.D = iArr;
                        this.w.add(aVar);
                    } else if (fVar2 instanceof k) {
                        ((k) fVar2).w = bVar3;
                    }
                    lVar2.f(fVar2, this, this.n.q0(fVar2.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            m2.c cVar4 = lVar4.k;
            boolean z15 = cVar4.d && lVar4.l == cVar4.m.size() + (-1);
            boolean z16 = (z15 && j30 == -9223372036854775807L) ? false : true;
            if (b11.c() == j29) {
                uVar2.b = z16;
            } else {
                iVar3.getClass();
                boolean z17 = z16;
                long e7 = iVar3.e(j30, S2) + j31;
                long b12 = b11.b(S2);
                if (z15) {
                    long d10 = b11.d(b12);
                    z11 = z17 & ((d10 - b11.e(b12)) + d10 >= j30);
                } else {
                    z11 = z17;
                }
                if (lVar != null) {
                    j15 = lVar.a();
                    j14 = b12;
                } else {
                    iVar3.getClass();
                    j14 = b12;
                    j15 = l0.j(iVar3.o(j10, j30) + j31, e7, j14);
                }
                long j34 = j15;
                if (j34 < e7) {
                    lVar4.m = new u2.b();
                } else {
                    if (j34 <= j14) {
                        long j35 = j10;
                        if (!lVar4.n || j34 < j14) {
                            if (!z11 || b11.e(j34) < j30) {
                                int min = (int) Math.min(lVar4.g, (j14 - j34) + 1);
                                int i13 = (j30 > (-9223372036854775807L) ? 1 : (j30 == (-9223372036854775807L) ? 0 : -1));
                                if (i13 != 0) {
                                    while (min > 1 && b11.e((min + j34) - 1) >= j30) {
                                        min--;
                                    }
                                }
                                long j36 = list4.isEmpty() ? j35 : -9223372036854775807L;
                                g2.h hVar4 = lVar4.e;
                                int i14 = lVar4.d;
                                x m11 = lVar4.j.m();
                                int n11 = lVar4.j.n();
                                Object q10 = lVar4.j.q();
                                long e10 = b11.e(j34);
                                iVar3.getClass();
                                m2.j g10 = iVar3.g(j34 - j31);
                                if (eVar == null) {
                                    jVar = new n(hVar4, w7.k.a(mVar, bVar2.a, g10, b11.f(j34, j27) ? 0 : 8), m11, n11, q10, e10, b11.d(j34), j34, i14, m11);
                                } else {
                                    int i15 = 1;
                                    int i16 = 1;
                                    while (true) {
                                        if (i15 >= min) {
                                            i10 = i13;
                                            break;
                                        }
                                        int i17 = min;
                                        i10 = i13;
                                        iVar3.getClass();
                                        m2.j a10 = g10.a(iVar3.g((j34 + i15) - j31), bVar2.a);
                                        if (a10 == null) {
                                            break;
                                        }
                                        i16++;
                                        i15++;
                                        i13 = i10;
                                        g10 = a10;
                                        min = i17;
                                    }
                                    long j37 = (j34 + i16) - 1;
                                    long d11 = b11.d(j37);
                                    long j38 = (i10 == 0 || j30 > d11) ? -9223372036854775807L : j30;
                                    g2.n a11 = w7.k.a(mVar, bVar2.a, g10, b11.f(j37, j27) ? 0 : 8);
                                    long j39 = -mVar.c;
                                    if (v0.k(m11.s)) {
                                        j39 += e10;
                                    }
                                    jVar = new j(hVar4, a11, m11, n11, q10, e10, d11, j36, j38, j34, i16, j39, b11.a);
                                }
                                uVar2.c = jVar;
                            } else {
                                uVar2.b = true;
                            }
                        }
                    }
                    uVar2.b = z11;
                }
            }
            z13 = uVar2.b;
            f fVar22 = (f) uVar2.c;
            uVar2.c = null;
            uVar2.b = false;
            if (z13) {
            }
        }
        lVar2 = lVar3;
        uVar2 = uVar;
        z13 = uVar2.b;
        f fVar222 = (f) uVar2.c;
        uVar2.c = null;
        uVar2.b = false;
        if (z13) {
        }
    }

    @Override // y2.g
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.a;
            uVar = new u2.u(fVar.b, j10);
        } else {
            long j13 = fVar.a;
            g2.n nVar = fVar.b;
            c0 c0Var = fVar.r;
            uVar = new u2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        }
        this.h.u(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i10);
    }

    @Override // y2.g
    public final void o(y2.i iVar, long j10, long j11) {
        f fVar = (f) iVar;
        this.F = null;
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.i;
        if (fVar instanceof k) {
            int s10 = lVar.j.s(((k) fVar).d);
            l2.j jVar = jVarArr[s10];
            if (jVar.d == null) {
                e eVar = jVar.a;
                eVar.getClass();
                c3.j a2 = eVar.a();
                if (a2 != null) {
                    m2.m mVar = jVar.b;
                    jVarArr[s10] = new l2.j(jVar.e, mVar, jVar.c, jVar.a, jVar.f, new g0(a2, mVar.c, 4));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j12 = oVar.d;
            if (j12 == -9223372036854775807L || fVar.n > j12) {
                oVar.d = fVar.n;
            }
            oVar.e.h = true;
        }
        long j13 = fVar.a;
        g2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        u2.u uVar = new u2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.n.getClass();
        this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        this.f.r(this);
    }

    @Override // u2.d1
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        if (y() || z() || this.O) {
            return -3;
        }
        a aVar = this.L;
        c1 c1Var = this.y;
        if (aVar != null && aVar.d(0) <= c1Var.v()) {
            return -3;
        }
        A();
        return c1Var.F(bVar, hVar, i10, this.P);
    }

    @Override // u2.f1
    public final long s() {
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.I;
        }
        long j10 = this.J;
        a w9 = w();
        if (!w9.c()) {
            ArrayList arrayList = this.w;
            w9 = arrayList.size() > 1 ? (a) i0.a.g(2, arrayList) : null;
        }
        if (w9 != null) {
            j10 = Math.max(j10, w9.n);
        }
        return Math.max(j10, this.y.s());
    }

    @Override // u2.f1
    public final void u(long j10) {
        y2.l lVar = this.r;
        if (lVar.c() || y()) {
            return;
        }
        boolean d = lVar.d();
        List list = this.x;
        l2.l lVar2 = this.e;
        ArrayList arrayList = this.w;
        if (d) {
            f fVar = this.F;
            fVar.getClass();
            boolean z10 = fVar instanceof a;
            if (z10 && x(arrayList.size() - 1)) {
                return;
            }
            if (lVar2.m == null ? lVar2.j.d(j10, fVar, list) : false) {
                lVar.b();
                if (z10) {
                    this.L = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (lVar2.m != null || lVar2.j.length() < 2) ? list.size() : lVar2.j.i(j10, list);
        if (size < arrayList.size()) {
            t6.p(!lVar.d());
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
                long j11 = w().n;
                a v = v(size);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
                this.P = false;
                this.h.B(v.h, this.a, j11);
            }
        }
        if (this.y.z()) {
            this.P = true;
        }
    }

    public final a v(int i10) {
        ArrayList arrayList = this.w;
        a aVar = (a) arrayList.get(i10);
        l0.X(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.y.o(aVar.d(0));
        while (true) {
            c1[] c1VarArr = this.D;
            if (i11 >= c1VarArr.length) {
                return aVar;
            }
            c1 c1Var = c1VarArr[i11];
            i11++;
            c1Var.o(aVar.d(i11));
        }
    }

    public final a w() {
        return (a) i0.a.g(1, this.w);
    }

    public final boolean x(int i10) {
        int v;
        a aVar = (a) this.w.get(i10);
        if (this.y.v() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c1[] c1VarArr = this.D;
            if (i11 >= c1VarArr.length) {
                return false;
            }
            v = c1VarArr[i11].v();
            i11++;
        } while (v <= aVar.d(i11));
        return true;
    }

    public final boolean y() {
        return this.I != -9223372036854775807L;
    }

    public final boolean z() {
        return ((!this.M && !this.N) || this.P || this.r.c()) ? false : true;
    }
}
