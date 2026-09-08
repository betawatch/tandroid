package v2;

import android.net.Uri;
import android.os.SystemClock;
import b2.p;
import b2.s;
import e2.d0;
import e9.i0;
import g2.b0;
import g2.x;
import i2.r0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import ji.u4;
import l2.n;
import l2.o;
import n4.y;
import org.telegram.ui.Cells.p6;
import u2.a1;
import u2.b1;
import u2.d1;
import u2.t;
import x2.r;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h implements b1, d1, y2.h, y2.k {
    public final o0.a E;
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
    public final l2.k e;
    public final l2.b f;
    public final a5.a h;
    public final rb.a n;
    public final y2.m r = new y2.m("ChunkSampleStream");
    public final p s = new p(7);
    public final ArrayList v;
    public final List w;
    public final a1 x;
    public final a1[] y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.k kVar, l2.b bVar, y2.d dVar, long j3, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, boolean z10) {
        this.a = i10;
        this.b = iArr;
        this.c = sVarArr;
        this.e = kVar;
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
        this.E = new o0.a(18, iArr2, a1VarArr);
        this.I = j3;
        this.J = j3;
    }

    public final void A() {
        int B = B(this.x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 > B) {
                return;
            }
            this.K = i10 + 1;
            a aVar = (a) this.v.get(i10);
            s sVar = aVar.d;
            if (!sVar.equals(this.G)) {
                this.h.j(this.a, sVar, aVar.e, aVar.f, aVar.h);
            }
            this.G = sVar;
        }
    }

    public final int B(int i10, int i11) {
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

    public final void C(l2.b bVar) {
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

    @Override // y2.k
    public final void a() {
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
        for (l2.i iVar : this.e.i) {
            d dVar = iVar.a;
            if (dVar != null) {
                dVar.a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                n nVar = (n) bVar.y.remove(this);
                if (nVar != null) {
                    a1 a1Var3 = nVar.a;
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

    @Override // u2.b1
    public final void b() {
        y2.m mVar = this.r;
        mVar.b();
        this.x.z();
        if (mVar.d()) {
            return;
        }
        l2.k kVar = this.e;
        u2.b bVar = kVar.m;
        if (bVar != null) {
            throw bVar;
        }
        kVar.a.b();
    }

    @Override // u2.d1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.d1
    public final long d() {
        if (z()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return x().n;
    }

    @Override // u2.b1
    public final boolean e() {
        return !z() && this.x.x(this.O);
    }

    @Override // u2.b1
    public final int f(y yVar, h2.h hVar, int i10) {
        if (z()) {
            return -3;
        }
        a aVar = this.L;
        a1 a1Var = this.x;
        if (aVar != null && aVar.d(0) <= a1Var.t()) {
            return -3;
        }
        A();
        return a1Var.C(yVar, hVar, i10, this.O);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0283  */
    @Override // y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d g(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        t tVar;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        rb.a aVar;
        long j11;
        boolean o9;
        k4.d dVar;
        boolean a2;
        e eVar = (e) jVar;
        b0 b0Var = eVar.r;
        s sVar = eVar.d;
        long j12 = eVar.h;
        long j13 = b0Var.b;
        boolean z12 = eVar instanceof a;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        boolean z13 = (j13 != 0 && z12 && y(size)) ? false : true;
        Uri uri = eVar.r.c;
        t tVar2 = new t(j10);
        d0.e0(j12);
        d0.e0(eVar.n);
        c5.b0 b0Var2 = new c5.b0(iOException, i10, 11);
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.i;
        fg.f fVar = kVar.b;
        rb.a aVar2 = this.n;
        if (z13) {
            tVar = tVar2;
            n nVar = kVar.h;
            if (nVar != null) {
                long j14 = nVar.d;
                boolean z14 = j14 != -9223372036854775807L && j14 < j12;
                o oVar = nVar.e;
                if (oVar.f.d) {
                    if (!oVar.n) {
                        if (z14) {
                            if (oVar.h) {
                                oVar.n = true;
                                oVar.h = false;
                                l2.g gVar = (l2.g) oVar.b.b;
                                gVar.D.removeCallbacks(gVar.w);
                                gVar.A();
                            }
                        }
                    }
                    z10 = z13;
                    z11 = z12;
                    arrayList = arrayList2;
                    aVar = aVar2;
                    o9 = true;
                    if (o9) {
                        if (z10) {
                            if (z11) {
                                e2.d.g(v(size) == eVar);
                                if (arrayList.isEmpty()) {
                                    this.I = this.J;
                                }
                            }
                            dVar = y2.m.e;
                            if (dVar == null) {
                                aVar.getClass();
                                long M3 = rb.a.M3(b0Var2);
                                dVar = M3 != -9223372036854775807L ? new k4.d(0, M3, false) : y2.m.f;
                            }
                            k4.d dVar2 = dVar;
                            a2 = dVar2.a();
                            this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                                this.F = null;
                                aVar.getClass();
                                this.f.b(this);
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
                    this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                    if (!a2) {
                    }
                    return dVar22;
                }
            }
            if (!kVar.k.d && (eVar instanceof k) && (iOException instanceof x) && ((x) iOException).d == 404) {
                l2.i iVar = iVarArr[kVar.j.s(sVar)];
                long d = iVar.d();
                if (d != -1 && d != 0) {
                    l2.h hVar = iVar.d;
                    e2.d.h(hVar);
                    if (((k) eVar).b() > ((hVar.u() + iVar.f) + d) - 1) {
                        kVar.n = true;
                        z10 = z13;
                        z11 = z12;
                        arrayList = arrayList2;
                        aVar = aVar2;
                        o9 = true;
                        if (o9) {
                        }
                        dVar = null;
                        if (dVar == null) {
                        }
                        k4.d dVar222 = dVar;
                        a2 = dVar222.a();
                        this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                        if (!a2) {
                        }
                        return dVar222;
                    }
                }
            }
            l2.i iVar2 = iVarArr[kVar.j.s(sVar)];
            m2.m mVar = iVar2.b;
            m2.b bVar = iVar2.c;
            m2.b P = fVar.P(mVar.b);
            if (P == null || bVar.equals(P)) {
                r rVar = kVar.j;
                i0 i0Var = iVar2.b.b;
                z10 = z13;
                z11 = z12;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int length = rVar.length();
                arrayList = arrayList2;
                aVar = aVar2;
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
                ArrayList f7 = fVar.f(i0Var);
                for (int i14 = 0; i14 < f7.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((m2.b) f7.get(i14)).c));
                }
                y2.g gVar2 = new y2.g(size2, size2 - hashSet2.size(), length, i11);
                if (gVar2.a(2) || gVar2.a(1)) {
                    aVar.getClass();
                    k4.d K3 = rb.a.K3(gVar2, b0Var2);
                    if (K3 != null) {
                        long j15 = K3.b;
                        int i15 = K3.a;
                        if (gVar2.a(i15)) {
                            if (i15 == 2) {
                                r rVar2 = kVar.j;
                                o9 = rVar2.o(rVar2.s(sVar), j15);
                                if (o9) {
                                }
                                dVar = null;
                                if (dVar == null) {
                                }
                                k4.d dVar2222 = dVar;
                                a2 = dVar2222.a();
                                this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                                if (!a2) {
                                }
                                return dVar2222;
                            }
                            if (i15 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j15;
                                String str = bVar.b;
                                HashMap hashMap = (HashMap) fVar.a;
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
                                    HashMap hashMap2 = (HashMap) fVar.b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l10 = (Long) hashMap2.get(valueOf);
                                        String str3 = d0.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l10.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                o9 = true;
                                if (o9) {
                                }
                                dVar = null;
                                if (dVar == null) {
                                }
                                k4.d dVar22222 = dVar;
                                a2 = dVar22222.a();
                                this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                                if (!a2) {
                                }
                                return dVar22222;
                            }
                            o9 = false;
                            if (o9) {
                            }
                            dVar = null;
                            if (dVar == null) {
                            }
                            k4.d dVar222222 = dVar;
                            a2 = dVar222222.a();
                            this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                            }
                            return dVar222222;
                        }
                    }
                }
            }
            z10 = z13;
            z11 = z12;
            arrayList = arrayList2;
            aVar = aVar2;
            o9 = true;
            if (o9) {
            }
            dVar = null;
            if (dVar == null) {
            }
            k4.d dVar2222222 = dVar;
            a2 = dVar2222222.a();
            this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
            if (!a2) {
            }
            return dVar2222222;
        }
        tVar = tVar2;
        z10 = z13;
        z11 = z12;
        arrayList = arrayList2;
        aVar = aVar2;
        o9 = false;
        if (o9) {
        }
        dVar = null;
        if (dVar == null) {
        }
        k4.d dVar22222222 = dVar;
        a2 = dVar22222222.a();
        this.h.p(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
        if (!a2) {
        }
        return dVar22222222;
    }

    @Override // y2.h
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) jVar;
        if (i10 == 0) {
            long j11 = eVar.a;
            tVar = new t(eVar.b);
        } else {
            long j12 = eVar.a;
            Uri uri = eVar.r.c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.r(tVar2, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, i10);
    }

    @Override // y2.h
    public final void i(y2.j jVar, long j3, long j10) {
        e eVar = (e) jVar;
        this.F = null;
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.i;
        if (eVar instanceof j) {
            int s10 = kVar.j.s(((j) eVar).d);
            l2.i iVar = iVarArr[s10];
            if (iVar.d == null) {
                d dVar = iVar.a;
                e2.d.h(dVar);
                c3.b0 b0Var = dVar.n;
                c3.j jVar2 = b0Var instanceof c3.j ? (c3.j) b0Var : null;
                if (jVar2 != null) {
                    m2.m mVar = iVar.b;
                    iVarArr[s10] = new l2.i(iVar.e, mVar, iVar.c, iVar.a, iVar.f, new e6.n(jVar2, mVar.c, 4));
                }
            }
        }
        n nVar = kVar.h;
        if (nVar != null) {
            long j11 = nVar.d;
            if (j11 == -9223372036854775807L || eVar.n > j11) {
                nVar.d = eVar.n;
            }
            nVar.e.h = true;
        }
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        t tVar = new t(j10);
        this.n.getClass();
        this.h.o(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        this.f.b(this);
    }

    @Override // u2.b1
    public final int m(long j3) {
        if (z()) {
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
        A();
        return v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03f0  */
    @Override // u2.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(r0 r0Var) {
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
        y2.m mVar;
        p pVar2;
        List list4;
        boolean z11;
        long j13;
        long i10;
        Object iVar;
        m2.j jVar;
        ob.a aVar;
        long j14;
        long i11;
        boolean z12;
        boolean z13;
        if (this.O) {
            return false;
        }
        y2.m mVar2 = this.r;
        if (mVar2.d() || mVar2.c()) {
            return false;
        }
        boolean z14 = z();
        if (z14) {
            list = Collections.EMPTY_LIST;
            j3 = this.I;
        } else {
            j3 = x().n;
            list = this.w;
        }
        List list5 = list;
        l2.k kVar2 = this.e;
        l2.i[] iVarArr = kVar2.i;
        u2.b bVar = kVar2.m;
        p pVar3 = this.s;
        if (bVar != null) {
            z10 = z14;
            pVar = pVar3;
            j10 = -9223372036854775807L;
        } else {
            pVar = pVar3;
            long j15 = r0Var.a;
            long j16 = j3 - j15;
            j10 = -9223372036854775807L;
            z10 = z14;
            long Q = d0.Q(kVar2.k.b(kVar2.l).b) + d0.Q(kVar2.k.a) + j3;
            n nVar = kVar2.h;
            if (nVar != null) {
                o oVar = nVar.e;
                m2.c cVar = oVar.f;
                u4 u4Var = oVar.b;
                if (!cVar.d) {
                    list2 = list5;
                    z12 = false;
                } else if (oVar.n) {
                    list2 = list5;
                    z12 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = oVar.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= Q) {
                        z12 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        l2.g gVar = (l2.g) u4Var.b;
                        long j17 = gVar.N;
                        if (j17 == -9223372036854775807L || j17 < longValue) {
                            gVar.N = longValue;
                        }
                        z12 = true;
                    }
                    if (z12 && oVar.h) {
                        oVar.n = true;
                        oVar.h = false;
                        l2.g gVar2 = (l2.g) u4Var.b;
                        gVar2.D.removeCallbacks(gVar2.w);
                        gVar2.A();
                    }
                }
            } else {
                list2 = list5;
            }
            long Q2 = d0.Q(d0.A(kVar2.f));
            m2.c cVar2 = kVar2.k;
            long j18 = cVar2.a;
            long Q3 = j18 == -9223372036854775807L ? -9223372036854775807L : Q2 - d0.Q(j18 + cVar2.b(kVar2.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                kVar = null;
            } else {
                list3 = list2;
                kVar = (k) p6.g(1, list3);
            }
            int length = kVar2.j.length();
            l[] lVarArr = new l[length];
            int i12 = 0;
            while (i12 < length) {
                l2.i[] iVarArr2 = iVarArr;
                l2.i iVar2 = iVarArr2[i12];
                long j19 = j15;
                l2.h hVar = iVar2.d;
                ob.a aVar2 = l.B;
                if (hVar == null) {
                    lVarArr[i12] = aVar2;
                    j14 = Q3;
                } else {
                    long b10 = iVar2.b(Q2);
                    long c10 = iVar2.c(Q2);
                    if (kVar != null) {
                        i11 = kVar.b();
                        aVar = aVar2;
                        j14 = Q3;
                    } else {
                        l2.h hVar2 = iVar2.d;
                        e2.d.h(hVar2);
                        aVar = aVar2;
                        j14 = Q3;
                        i11 = d0.i(hVar2.o(j3, iVar2.e) + iVar2.f, b10, c10);
                    }
                    long j20 = i11;
                    if (j20 < b10) {
                        lVarArr[i12] = aVar;
                    } else {
                        lVarArr[i12] = new l2.j(kVar2.b(i12), j20, c10);
                    }
                }
                i12++;
                iVarArr = iVarArr2;
                j15 = j19;
                Q3 = j14;
            }
            l2.i[] iVarArr3 = iVarArr;
            long j21 = j15;
            long j22 = Q3;
            if (!kVar2.k.d || iVarArr3[0].d() == 0) {
                j11 = 0;
                j12 = -9223372036854775807L;
            } else {
                long e7 = iVarArr3[0].e(iVarArr3[0].c(Q2));
                m2.c cVar3 = kVar2.k;
                long j23 = cVar3.a;
                j11 = 0;
                j12 = Math.max(0L, Math.min(j23 == -9223372036854775807L ? -9223372036854775807L : Q2 - d0.Q(j23 + cVar3.b(kVar2.l).b), e7) - j21);
            }
            mVar = mVar2;
            long j24 = j11;
            pVar2 = pVar;
            kVar2.j.k(j21, j16, j12, list3, lVarArr);
            int c11 = kVar2.j.c();
            SystemClock.elapsedRealtime();
            l2.i b11 = kVar2.b(c11);
            long j25 = b11.e;
            long j26 = b11.f;
            l2.h hVar3 = b11.d;
            m2.b bVar2 = b11.c;
            d dVar = b11.a;
            m2.m mVar3 = b11.b;
            if (dVar != null) {
                m2.j jVar2 = dVar.r == null ? mVar3.h : null;
                if (hVar3 == null) {
                    list4 = list3;
                    jVar = mVar3.h();
                } else {
                    list4 = list3;
                    jVar = null;
                }
                if (jVar2 != null || jVar != null) {
                    g2.h hVar4 = kVar2.e;
                    s m10 = kVar2.j.m();
                    int n10 = kVar2.j.n();
                    Object q6 = kVar2.j.q();
                    if (jVar2 != null) {
                        m2.j a2 = jVar2.a(jVar, bVar2.a);
                        if (a2 != null) {
                            jVar2 = a2;
                        }
                    } else {
                        jVar.getClass();
                        jVar2 = jVar;
                    }
                    pVar2.c = new j(hVar4, w7.k.a(mVar3, bVar2.a, jVar2, 0), m10, n10, q6, b11.a);
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
                    boolean z15 = eVar instanceof a;
                    o0.a aVar3 = this.E;
                    if (z15) {
                        a aVar4 = (a) eVar;
                        if (z10) {
                            long j27 = aVar4.h;
                            long j28 = this.I;
                            if (j27 < j28) {
                                this.x.t = j28;
                                for (a1 a1Var : this.y) {
                                    a1Var.t = this.I;
                                }
                                if (this.M) {
                                    s sVar = aVar4.d;
                                    this.N = !b2.r0.a(sVar.r, sVar.k);
                                }
                            }
                            this.M = false;
                            this.I = -9223372036854775807L;
                        }
                        aVar4.x = aVar3;
                        a1[] a1VarArr = (a1[]) aVar3.c;
                        int[] iArr = new int[a1VarArr.length];
                        for (int i13 = 0; i13 < a1VarArr.length; i13++) {
                            a1 a1Var2 = a1VarArr[i13];
                            iArr[i13] = a1Var2.q + a1Var2.p;
                        }
                        aVar4.y = iArr;
                        this.v.add(aVar4);
                    } else if (eVar instanceof j) {
                        ((j) eVar).v = aVar3;
                    }
                    mVar.f(eVar, this, this.n.L3(eVar.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            m2.c cVar4 = kVar2.k;
            boolean z16 = cVar4.d && kVar2.l == cVar4.m.size() + (-1);
            boolean z17 = (z16 && j25 == -9223372036854775807L) ? false : true;
            if (b11.d() == j24) {
                pVar2.b = z17;
            } else {
                boolean z18 = z17;
                long b12 = b11.b(Q2);
                long c12 = b11.c(Q2);
                if (z16) {
                    long e10 = b11.e(c12);
                    z11 = z18 & ((e10 - b11.f(c12)) + e10 >= j25);
                } else {
                    z11 = z18;
                }
                if (kVar != null) {
                    i10 = kVar.b();
                    j13 = c12;
                } else {
                    e2.d.h(hVar3);
                    j13 = c12;
                    i10 = d0.i(hVar3.o(j3, j25) + j26, b12, j13);
                }
                long j29 = i10;
                if (j29 < b12) {
                    kVar2.m = new u2.b();
                } else {
                    if (j29 <= j13) {
                        long j30 = j3;
                        if (!kVar2.n || j29 < j13) {
                            if (!z11 || b11.f(j29) < j25) {
                                int min = (int) Math.min(kVar2.g, (j13 - j29) + 1);
                                if (j25 != -9223372036854775807L) {
                                    while (min > 1 && b11.f((min + j29) - 1) >= j25) {
                                        min--;
                                    }
                                }
                                long j31 = list4.isEmpty() ? j30 : -9223372036854775807L;
                                g2.h hVar5 = kVar2.e;
                                int i14 = kVar2.d;
                                s m11 = kVar2.j.m();
                                int n11 = kVar2.j.n();
                                Object q10 = kVar2.j.q();
                                long f7 = b11.f(j29);
                                e2.d.h(hVar3);
                                m2.j g10 = hVar3.g(j29 - j26);
                                if (dVar == null) {
                                    iVar = new m(hVar5, w7.k.a(mVar3, bVar2.a, g10, b11.g(j29, j22) ? 0 : 8), m11, n11, q10, f7, b11.e(j29), j29, i14, m11);
                                } else {
                                    int i15 = 1;
                                    int i16 = 1;
                                    while (i15 < min) {
                                        e2.d.h(hVar3);
                                        m2.j a10 = g10.a(hVar3.g((j29 + i15) - j26), bVar2.a);
                                        if (a10 == null) {
                                            break;
                                        }
                                        i16++;
                                        i15++;
                                        g10 = a10;
                                    }
                                    long j32 = (j29 + i16) - 1;
                                    long e11 = b11.e(j32);
                                    long j33 = (j25 == -9223372036854775807L || j25 > e11) ? -9223372036854775807L : j25;
                                    g2.m a11 = w7.k.a(mVar3, bVar2.a, g10, b11.g(j32, j22) ? 0 : 8);
                                    long j34 = -mVar3.c;
                                    if (b2.r0.k(m11.r)) {
                                        j34 += f7;
                                    }
                                    iVar = new i(hVar5, a11, m11, n11, q10, f7, e11, j31, j33, j29, i16, j34, b11.a);
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
        mVar = mVar2;
        pVar2 = pVar;
        z13 = pVar2.b;
        e eVar22 = (e) pVar2.c;
        pVar2.c = null;
        pVar2.b = false;
        if (z13) {
        }
    }

    @Override // u2.d1
    public final long s() {
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.I;
        }
        long j3 = this.J;
        a x10 = x();
        if (!x10.c()) {
            ArrayList arrayList = this.v;
            x10 = arrayList.size() > 1 ? (a) i2.g.h(2, arrayList) : null;
        }
        if (x10 != null) {
            j3 = Math.max(j3, x10.n);
        }
        return Math.max(j3, this.x.q());
    }

    @Override // u2.d1
    public final void u(long j3) {
        y2.m mVar = this.r;
        if (mVar.c() || z()) {
            return;
        }
        boolean d = mVar.d();
        List list = this.w;
        l2.k kVar = this.e;
        ArrayList arrayList = this.v;
        if (d) {
            e eVar = this.F;
            eVar.getClass();
            boolean z10 = eVar instanceof a;
            if (z10 && y(arrayList.size() - 1)) {
                return;
            }
            if (kVar.m == null ? kVar.j.d(j3, eVar, list) : false) {
                mVar.a();
                if (z10) {
                    this.L = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (kVar.m != null || kVar.j.length() < 2) ? list.size() : kVar.j.i(j3, list);
        if (size < arrayList.size()) {
            e2.d.g(!mVar.d());
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
            if (size == -1) {
                return;
            }
            long j10 = x().n;
            a v = v(size);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
            this.O = false;
            this.h.y(this.a, v.h, j10);
        }
    }

    public final a v(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
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

    @Override // y2.h
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        e eVar = (e) jVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.a;
        Uri uri = eVar.r.c;
        t tVar = new t(j10);
        this.n.getClass();
        this.h.n(tVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z10) {
            return;
        }
        if (z()) {
            this.x.D(false);
            for (a1 a1Var : this.y) {
                a1Var.D(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.v;
            v(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
        }
        this.f.b(this);
    }

    public final a x() {
        return (a) i2.g.h(1, this.v);
    }

    public final boolean y(int i10) {
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

    public final boolean z() {
        return this.I != -9223372036854775807L;
    }
}
