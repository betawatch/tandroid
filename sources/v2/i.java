package v2;

import android.os.SystemClock;
import b2.t;
import b2.v0;
import b2.w;
import c5.c0;
import e2.m0;
import e9.n0;
import g2.b0;
import g2.x;
import i2.o1;
import i2.u0;
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
import si.o0;
import si.z;
import u2.e1;
import u2.f1;
import u2.h1;
import u2.v;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class i implements f1, h1, y2.g, y2.j {
    public final n2.e E;
    public f F;
    public w G;
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
    public final w[] c;
    public final boolean[] d;
    public final l2.l e;
    public final l2.b f;
    public final a5.a h;
    public final oa.d n;
    public final y2.l r;
    public final t s;
    public final ArrayList v;
    public final List w;
    public final e1 x;
    public final e1[] y;

    public i(int i10, int[] iArr, w[] wVarArr, l2.l lVar, l2.b bVar, androidx.biometric.e eVar, long j10, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, boolean z10, long j11, z2.a aVar2) {
        this.a = i10;
        this.b = iArr;
        this.c = wVarArr;
        this.e = lVar;
        this.f = bVar;
        this.h = aVar;
        this.n = dVar;
        this.r = aVar2 != null ? new y2.l(aVar2) : new y2.l("ChunkSampleStream");
        this.s = new t(6);
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new e1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        e1[] e1VarArr = new e1[i11];
        nVar.getClass();
        e1 e1Var = new e1(eVar, nVar, kVar);
        this.x = e1Var;
        iArr2[0] = i10;
        e1VarArr[0] = e1Var;
        int i12 = 0;
        while (i12 < length) {
            e1 e1Var2 = new e1(eVar, null, null);
            this.y[i12] = e1Var2;
            int i13 = i12 + 1;
            e1VarArr[i13] = e1Var2;
            iArr2[i13] = this.b[i12];
            i12 = i13;
        }
        this.E = new n2.e(20, iArr2, e1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (!z10 || j11 == -9223372036854775807L) {
            return;
        }
        this.M = false;
        this.N = j11 < j10;
    }

    public final boolean A() {
        return ((!this.M && !this.N) || this.P || this.r.c()) ? false : true;
    }

    public final void B() {
        int C = C(this.x.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 > C) {
                return;
            }
            this.K = i10 + 1;
            a aVar = (a) this.v.get(i10);
            w wVar = aVar.d;
            if (!wVar.equals(this.G)) {
                this.h.m(this.a, wVar, aVar.e, aVar.f, aVar.h);
            }
            this.G = wVar;
        }
    }

    public final int C(int i10, int i11) {
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

    public final void D(l2.b bVar) {
        this.H = bVar;
        e1 e1Var = this.x;
        e1Var.l();
        n2.h hVar = e1Var.h;
        if (hVar != null) {
            hVar.a(e1Var.e);
            e1Var.h = null;
            e1Var.g = null;
        }
        for (e1 e1Var2 : this.y) {
            e1Var2.l();
            n2.h hVar2 = e1Var2.h;
            if (hVar2 != null) {
                hVar2.a(e1Var2.e);
                e1Var2.h = null;
                e1Var2.g = null;
            }
        }
        this.r.e(this);
    }

    @Override // u2.f1
    public final void a() {
        y2.l lVar = this.r;
        lVar.a();
        this.x.C();
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
        e1 e1Var = this.x;
        e1Var.G(true);
        n2.h hVar = e1Var.h;
        if (hVar != null) {
            hVar.a(e1Var.e);
            e1Var.h = null;
            e1Var.g = null;
        }
        for (e1 e1Var2 : this.y) {
            e1Var2.G(true);
            n2.h hVar2 = e1Var2.h;
            if (hVar2 != null) {
                hVar2.a(e1Var2.e);
                e1Var2.h = null;
                e1Var2.g = null;
            }
        }
        for (l2.j jVar : this.e.i) {
            e eVar = jVar.a;
            if (eVar != null) {
                eVar.a.release();
            }
        }
        h hVar3 = this.H;
        if (hVar3 != null) {
            l2.b bVar = (l2.b) hVar3;
            synchronized (bVar) {
                o oVar = (o) bVar.y.remove(this);
                if (oVar != null) {
                    e1 e1Var3 = oVar.a;
                    e1Var3.G(true);
                    n2.h hVar4 = e1Var3.h;
                    if (hVar4 != null) {
                        hVar4.a(e1Var3.e);
                        e1Var3.h = null;
                        e1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // u2.h1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.h1
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028f  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        oa.d dVar;
        ArrayList arrayList;
        v vVar;
        boolean z13;
        boolean z14;
        long j12;
        boolean z15;
        k4.d dVar2;
        boolean a2;
        f fVar = (f) iVar;
        b0 b0Var = fVar.r;
        w wVar = fVar.d;
        long j13 = fVar.h;
        long j14 = b0Var.b;
        boolean z16 = fVar instanceof a;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        if (j14 != 0 && z16 && x(size)) {
            z10 = false;
            z11 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        g2.m mVar = fVar.b;
        b0 b0Var2 = fVar.r;
        v vVar2 = new v(mVar, b0Var2.c, b0Var2.d, j10, j11, j14);
        m0.h0(j13);
        m0.h0(fVar.n);
        c0 c0Var = new c0(iOException, i10, 17);
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.i;
        qi.e eVar = lVar.b;
        oa.d dVar3 = this.n;
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
                    dVar = dVar3;
                    arrayList = arrayList2;
                    z13 = z10;
                    vVar = vVar2;
                    z14 = true;
                    z15 = true;
                    if (z15) {
                        if (z13) {
                            if (z12) {
                                u6.p(v(size) == fVar ? z14 : false);
                                if (arrayList.isEmpty()) {
                                    this.I = this.J;
                                }
                            }
                            dVar2 = y2.l.e;
                            if (dVar2 == null) {
                                dVar.getClass();
                                long z32 = oa.d.z3(c0Var);
                                dVar2 = z32 != -9223372036854775807L ? new k4.d(0, z32, false) : y2.l.f;
                            }
                            k4.d dVar4 = dVar2;
                            a2 = dVar4.a();
                            this.h.s(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                            if (!a2) {
                                this.F = null;
                                dVar.getClass();
                                this.f.b(this);
                            }
                            return dVar4;
                        }
                        e2.a.l("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    dVar2 = null;
                    if (dVar2 == null) {
                    }
                    k4.d dVar42 = dVar2;
                    a2 = dVar42.a();
                    this.h.s(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                    if (!a2) {
                    }
                    return dVar42;
                }
            }
            if (!lVar.k.d && (fVar instanceof l) && (iOException instanceof x) && ((x) iOException).c == 404) {
                l2.j jVar = jVarArr[lVar.j.s(wVar)];
                long c10 = jVar.c();
                if (c10 != -1 && c10 != 0) {
                    l2.i iVar2 = jVar.d;
                    iVar2.getClass();
                    if (((l) fVar).b() > ((iVar2.w() + jVar.f) + c10) - 1) {
                        lVar.n = true;
                        dVar = dVar3;
                        arrayList = arrayList2;
                        z13 = z10;
                        vVar = vVar2;
                        z14 = true;
                        z15 = true;
                        if (z15) {
                        }
                        dVar2 = null;
                        if (dVar2 == null) {
                        }
                        k4.d dVar422 = dVar2;
                        a2 = dVar422.a();
                        this.h.s(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                        if (!a2) {
                        }
                        return dVar422;
                    }
                }
            }
            l2.j jVar2 = jVarArr[lVar.j.s(wVar)];
            m2.m mVar2 = jVar2.b;
            m2.b bVar = jVar2.c;
            m2.b G = eVar.G(mVar2.b);
            if (G == null || bVar.equals(G)) {
                x2.p pVar2 = lVar.j;
                n0 n0Var = jVar2.b.b;
                boolean z18 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                dVar = dVar3;
                int length = pVar2.length();
                arrayList = arrayList2;
                vVar = vVar2;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (pVar2.a(i12, elapsedRealtime)) {
                        i11++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i13 = 0; i13 < n0Var.size(); i13++) {
                    hashSet.add(Integer.valueOf(((m2.b) n0Var.get(i13)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList g10 = eVar.g(n0Var);
                z13 = z18;
                for (int i14 = 0; i14 < g10.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((m2.b) g10.get(i14)).c));
                }
                z zVar = new z(size2, size2 - hashSet2.size(), length, i11);
                if (zVar.a(2) || zVar.a(1)) {
                    dVar.getClass();
                    k4.d x32 = oa.d.x3(zVar, c0Var);
                    if (x32 != null) {
                        long j16 = x32.b;
                        int i15 = x32.a;
                        if (zVar.a(i15)) {
                            if (i15 == 2) {
                                x2.p pVar3 = lVar.j;
                                z15 = pVar3.o(pVar3.s(wVar), j16);
                                z14 = true;
                            } else {
                                z14 = true;
                                if (i15 == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j16;
                                    String str = bVar.b;
                                    HashMap hashMap = (HashMap) eVar.a;
                                    if (hashMap.containsKey(str)) {
                                        Long l4 = (Long) hashMap.get(str);
                                        String str2 = m0.a;
                                        j12 = Math.max(elapsedRealtime2, l4.longValue());
                                    } else {
                                        j12 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j12));
                                    int i16 = bVar.c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i16);
                                        HashMap hashMap2 = (HashMap) eVar.b;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l10 = (Long) hashMap2.get(valueOf);
                                            String str3 = m0.a;
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
                            dVar2 = null;
                            if (dVar2 == null) {
                            }
                            k4.d dVar4222 = dVar2;
                            a2 = dVar4222.a();
                            this.h.s(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                            if (!a2) {
                            }
                            return dVar4222;
                        }
                    }
                }
            }
            dVar = dVar3;
            arrayList = arrayList2;
            z13 = z10;
            vVar = vVar2;
            z14 = true;
            z15 = true;
            if (z15) {
            }
            dVar2 = null;
            if (dVar2 == null) {
            }
            k4.d dVar42222 = dVar2;
            a2 = dVar42222.a();
            this.h.s(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
            if (!a2) {
            }
            return dVar42222;
        }
        z12 = z16;
        dVar = dVar3;
        arrayList = arrayList2;
        z13 = z10;
        vVar = vVar2;
        z14 = true;
        z15 = false;
        if (z15) {
        }
        dVar2 = null;
        if (dVar2 == null) {
        }
        k4.d dVar422222 = dVar2;
        a2 = dVar422222.a();
        this.h.s(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
        if (!a2) {
        }
        return dVar422222;
    }

    @Override // u2.f1
    public final boolean f() {
        return !y() && this.x.A(this.P);
    }

    @Override // u2.f1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        if (y() || A() || this.O) {
            return -3;
        }
        a aVar = this.L;
        e1 e1Var = this.x;
        if (aVar != null && aVar.d(0) <= e1Var.v()) {
            return -3;
        }
        B();
        return e1Var.F(bVar, hVar, i10, this.P);
    }

    @Override // y2.g
    public final void j(y2.i iVar, long j10, long j11, int i10) {
        v vVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.a;
            vVar = new v(fVar.b, j10);
        } else {
            long j13 = fVar.a;
            g2.m mVar = fVar.b;
            b0 b0Var = fVar.r;
            vVar = new v(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        this.h.v(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i10);
    }

    @Override // y2.g
    public final void k(y2.i iVar, long j10, long j11) {
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
                    jVarArr[s10] = new l2.j(jVar.e, mVar, jVar.c, jVar.a, jVar.f, new ad.d(a2, mVar.c, 5));
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
        g2.m mVar2 = fVar.b;
        b0 b0Var = fVar.r;
        v vVar = new v(mVar2, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.n.getClass();
        this.h.r(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        this.f.b(this);
    }

    @Override // u2.f1
    public final int m(long j10) {
        if (y() || A() || this.O) {
            return 0;
        }
        boolean z10 = this.P;
        e1 e1Var = this.x;
        int x10 = e1Var.x(j10, z10);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - e1Var.v());
        }
        e1Var.L(x10);
        B();
        return x10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03fd  */
    @Override // u2.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(u0 u0Var) {
        long j10;
        List list;
        t tVar;
        long j11;
        boolean z10;
        List list2;
        List list3;
        l lVar;
        long j12;
        long j13;
        y2.l lVar2;
        t tVar2;
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
            list = this.w;
        }
        List list5 = list;
        l2.l lVar4 = this.e;
        l2.j[] jVarArr = lVar4.i;
        u2.b bVar = lVar4.m;
        t tVar3 = this.s;
        if (bVar != null) {
            z10 = y3;
            tVar = tVar3;
            j11 = -9223372036854775807L;
        } else {
            tVar = tVar3;
            long j17 = u0Var.a;
            long j18 = j10 - j17;
            j11 = -9223372036854775807L;
            z10 = y3;
            long S = m0.S(lVar4.k.b(lVar4.l).b) + m0.S(lVar4.k.a) + j10;
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
            long S2 = m0.S(m0.C(lVar4.f));
            m2.c cVar2 = lVar4.k;
            long j20 = cVar2.a;
            long S3 = j20 == -9223372036854775807L ? -9223372036854775807L : S2 - m0.S(j20 + cVar2.b(lVar4.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                lVar = null;
            } else {
                list3 = list2;
                lVar = (l) o0.g(1, list3);
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
                pb.a aVar = m.B;
                if (iVar == null) {
                    mVarArr[i11] = aVar;
                } else {
                    iVar.getClass();
                    long e = iVar.e(j24, S2) + j23;
                    long b10 = jVar3.b(S2);
                    if (lVar != null) {
                        j16 = lVar.b();
                    } else {
                        l2.i iVar2 = jVar3.d;
                        iVar2.getClass();
                        j16 = m0.j(iVar2.n(j10, j24) + j23, e, b10);
                    }
                    long j25 = j16;
                    if (j25 < e) {
                        mVarArr[i11] = aVar;
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
                j13 = Math.max(0L, Math.min(j28 == -9223372036854775807L ? -9223372036854775807L : S2 - m0.S(j28 + cVar3.b(lVar4.l).b), d) - j26);
            }
            lVar2 = lVar3;
            long j29 = j12;
            tVar2 = tVar;
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
                    w m10 = lVar4.j.m();
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
                    tVar2.c = new k(hVar3, w7.l.a(mVar, bVar2.a, jVar4, 0), m10, n10, q6, b11.a);
                    z13 = tVar2.b;
                    f fVar2 = (f) tVar2.c;
                    tVar2.c = null;
                    tVar2.b = false;
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
                    n2.e eVar2 = this.E;
                    if (z14) {
                        a aVar2 = (a) fVar2;
                        if (z10) {
                            long j32 = aVar2.h;
                            long j33 = this.I;
                            if (j32 < j33) {
                                this.x.t = j33;
                                for (e1 e1Var : this.y) {
                                    e1Var.t = this.I;
                                }
                                this.N = this.M;
                            }
                            this.M = false;
                            this.I = -9223372036854775807L;
                        }
                        aVar2.x = eVar2;
                        e1[] e1VarArr = (e1[]) eVar2.c;
                        int[] iArr = new int[e1VarArr.length];
                        for (int i12 = 0; i12 < e1VarArr.length; i12++) {
                            e1 e1Var2 = e1VarArr[i12];
                            iArr[i12] = e1Var2.q + e1Var2.p;
                        }
                        aVar2.y = iArr;
                        this.v.add(aVar2);
                    } else if (fVar2 instanceof k) {
                        ((k) fVar2).v = eVar2;
                    }
                    lVar2.f(fVar2, this, this.n.y3(fVar2.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            m2.c cVar4 = lVar4.k;
            boolean z15 = cVar4.d && lVar4.l == cVar4.m.size() + (-1);
            boolean z16 = (z15 && j30 == -9223372036854775807L) ? false : true;
            if (b11.c() == j29) {
                tVar2.b = z16;
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
                    j15 = lVar.b();
                    j14 = b12;
                } else {
                    iVar3.getClass();
                    j14 = b12;
                    j15 = m0.j(iVar3.n(j10, j30) + j31, e7, j14);
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
                                w m11 = lVar4.j.m();
                                int n11 = lVar4.j.n();
                                Object q10 = lVar4.j.q();
                                long e10 = b11.e(j34);
                                iVar3.getClass();
                                m2.j g10 = iVar3.g(j34 - j31);
                                if (eVar == null) {
                                    jVar = new n(hVar4, w7.l.a(mVar, bVar2.a, g10, b11.f(j34, j27) ? 0 : 8), m11, n11, q10, e10, b11.d(j34), j34, i14, m11);
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
                                    g2.m a11 = w7.l.a(mVar, bVar2.a, g10, b11.f(j37, j27) ? 0 : 8);
                                    long j39 = -mVar.c;
                                    if (v0.k(m11.s)) {
                                        j39 += e10;
                                    }
                                    jVar = new j(hVar4, a11, m11, n11, q10, e10, d11, j36, j38, j34, i16, j39, b11.a);
                                }
                                tVar2.c = jVar;
                            } else {
                                tVar2.b = true;
                            }
                        }
                    }
                    tVar2.b = z11;
                }
            }
            z13 = tVar2.b;
            f fVar22 = (f) tVar2.c;
            tVar2.c = null;
            tVar2.b = false;
            if (z13) {
            }
        }
        lVar2 = lVar3;
        tVar2 = tVar;
        z13 = tVar2.b;
        f fVar222 = (f) tVar2.c;
        tVar2.c = null;
        tVar2.b = false;
        if (z13) {
        }
    }

    @Override // u2.h1
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
            ArrayList arrayList = this.v;
            w9 = arrayList.size() > 1 ? (a) o1.i(2, arrayList) : null;
        }
        if (w9 != null) {
            j10 = Math.max(j10, w9.n);
        }
        return Math.max(j10, this.x.s());
    }

    @Override // u2.h1
    public final void u(long j10) {
        y2.l lVar = this.r;
        if (lVar.c() || y()) {
            return;
        }
        boolean d = lVar.d();
        List list = this.w;
        l2.l lVar2 = this.e;
        ArrayList arrayList = this.v;
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
            u6.p(!lVar.d());
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
                this.h.C(this.a, v.h, j11);
            }
        }
        if (this.x.z()) {
            this.P = true;
        }
    }

    public final a v(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        m0.X(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.x.o(aVar.d(0));
        while (true) {
            e1[] e1VarArr = this.y;
            if (i11 >= e1VarArr.length) {
                return aVar;
            }
            e1 e1Var = e1VarArr[i11];
            i11++;
            e1Var.o(aVar.d(i11));
        }
    }

    public final a w() {
        return (a) o1.i(1, this.v);
    }

    public final boolean x(int i10) {
        int v;
        a aVar = (a) this.v.get(i10);
        if (this.x.v() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            e1[] e1VarArr = this.y;
            if (i11 >= e1VarArr.length) {
                return false;
            }
            v = e1VarArr[i11].v();
            i11++;
        } while (v <= aVar.d(i11));
        return true;
    }

    public final boolean y() {
        return this.I != -9223372036854775807L;
    }

    @Override // y2.g
    public final void z(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.a;
        g2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        v vVar = new v(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.n.getClass();
        this.h.q(vVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (y()) {
            this.x.G(false);
            for (e1 e1Var : this.y) {
                e1Var.G(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.v;
            v(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
        }
        this.f.b(this);
    }
}
