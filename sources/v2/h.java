package v2;

import android.net.Uri;
import android.os.SystemClock;
import b2.p;
import b2.r0;
import b2.s;
import e2.d0;
import e9.i0;
import g2.b0;
import g2.x;
import i2.q0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l2.q;
import n7.a1;
import org.telegram.ui.Cells.r6;
import u2.c1;
import u2.d1;
import u2.f1;
import u2.u;
import x2.r;
import y2.n;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h implements d1, f1, y2.i, y2.l {
    public final a1 E;
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
    public final l2.m e;
    public final l2.b f;
    public final a5.a h;
    public final rb.a n;
    public final n r = new n("ChunkSampleStream");
    public final p s = new p(7);
    public final ArrayList v;
    public final List w;
    public final c1 x;
    public final c1[] y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.m mVar, l2.b bVar, y2.d dVar, long j3, n2.n nVar, n2.j jVar, rb.a aVar, a5.a aVar2, boolean z10) {
        this.a = i10;
        this.b = iArr;
        this.c = sVarArr;
        this.e = mVar;
        this.f = bVar;
        this.h = aVar2;
        this.n = aVar;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new c1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c1[] c1VarArr = new c1[i11];
        nVar.getClass();
        c1 c1Var = new c1(dVar, nVar, jVar);
        this.x = c1Var;
        int i12 = 0;
        iArr2[0] = i10;
        c1VarArr[0] = c1Var;
        while (i12 < length) {
            c1 c1Var2 = new c1(dVar, null, null);
            this.y[i12] = c1Var2;
            int i13 = i12 + 1;
            c1VarArr[i13] = c1Var2;
            iArr2[i13] = this.b[i12];
            i12 = i13;
        }
        this.E = new a1(20, iArr2, c1VarArr);
        this.I = j3;
        this.J = j3;
    }

    public final int A(int i10, int i11) {
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

    public final void B(l2.b bVar) {
        this.H = bVar;
        c1 c1Var = this.x;
        c1Var.k();
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.y) {
            c1Var2.k();
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        this.r.e(this);
    }

    @Override // y2.i
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        e eVar = (e) kVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.a;
        Uri uri = eVar.r.c;
        u uVar = new u(j10);
        this.n.getClass();
        this.h.m(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z10) {
            return;
        }
        if (y()) {
            this.x.D(false);
            for (c1 c1Var : this.y) {
                c1Var.D(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.v;
            v(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
        }
        this.f.g(this);
    }

    @Override // u2.d1
    public final void a() {
        n nVar = this.r;
        nVar.a();
        this.x.z();
        if (nVar.d()) {
            return;
        }
        l2.m mVar = this.e;
        u2.b bVar = mVar.m;
        if (bVar != null) {
            throw bVar;
        }
        mVar.a.a();
    }

    @Override // y2.l
    public final void b() {
        c1 c1Var = this.x;
        c1Var.D(true);
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.y) {
            c1Var2.D(true);
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        for (l2.k kVar : this.e.i) {
            d dVar = kVar.a;
            if (dVar != null) {
                dVar.a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                l2.p pVar = (l2.p) bVar.y.remove(this);
                if (pVar != null) {
                    c1 c1Var3 = pVar.a;
                    c1Var3.D(true);
                    n2.g gVar4 = c1Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(c1Var3.e);
                        c1Var3.h = null;
                        c1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // u2.f1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.f1
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    @Override // u2.d1
    public final boolean e() {
        return !y() && this.x.x(this.O);
    }

    @Override // u2.d1
    public final int g(long j3) {
        if (y()) {
            return 0;
        }
        boolean z10 = this.O;
        c1 c1Var = this.x;
        int v = c1Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - c1Var.t());
        }
        c1Var.H(v);
        z();
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0283  */
    @Override // y2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        u uVar;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        rb.a aVar;
        long j11;
        boolean o9;
        k4.d dVar;
        boolean a2;
        e eVar = (e) kVar;
        b0 b0Var = eVar.r;
        s sVar = eVar.d;
        long j12 = eVar.h;
        long j13 = b0Var.b;
        boolean z12 = eVar instanceof a;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        boolean z13 = (j13 != 0 && z12 && x(size)) ? false : true;
        Uri uri = eVar.r.c;
        u uVar2 = new u(j10);
        d0.e0(j12);
        d0.e0(eVar.n);
        c5.b0 b0Var2 = new c5.b0(iOException, i10, 11);
        l2.m mVar = this.e;
        l2.k[] kVarArr = mVar.i;
        com.google.firebase.messaging.s sVar2 = mVar.b;
        rb.a aVar2 = this.n;
        if (z13) {
            uVar = uVar2;
            l2.p pVar = mVar.h;
            if (pVar != null) {
                long j14 = pVar.d;
                boolean z14 = j14 != -9223372036854775807L && j14 < j12;
                q qVar = pVar.e;
                if (qVar.f.d) {
                    if (!qVar.n) {
                        if (z14) {
                            if (qVar.h) {
                                qVar.n = true;
                                qVar.h = false;
                                l2.i iVar = (l2.i) qVar.b.b;
                                iVar.D.removeCallbacks(iVar.w);
                                iVar.A();
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
                            dVar = n.e;
                            if (dVar == null) {
                                aVar.getClass();
                                long p32 = rb.a.p3(b0Var2);
                                dVar = p32 != -9223372036854775807L ? new k4.d(0, p32, false) : n.f;
                            }
                            k4.d dVar2 = dVar;
                            a2 = dVar2.a();
                            this.h.p(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                                this.F = null;
                                aVar.getClass();
                                this.f.g(this);
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
                    this.h.p(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                    if (!a2) {
                    }
                    return dVar22;
                }
            }
            if (!mVar.k.d && (eVar instanceof k) && (iOException instanceof x) && ((x) iOException).d == 404) {
                l2.k kVar2 = kVarArr[mVar.j.s(sVar)];
                long d = kVar2.d();
                if (d != -1 && d != 0) {
                    l2.j jVar = kVar2.d;
                    e2.d.h(jVar);
                    if (((k) eVar).b() > ((jVar.J() + kVar2.f) + d) - 1) {
                        mVar.n = true;
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
                        this.h.p(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                        if (!a2) {
                        }
                        return dVar222;
                    }
                }
            }
            l2.k kVar3 = kVarArr[mVar.j.s(sVar)];
            m2.m mVar2 = kVar3.b;
            m2.b bVar = kVar3.c;
            m2.b m10 = sVar2.m(mVar2.b);
            if (m10 == null || bVar.equals(m10)) {
                r rVar = mVar.j;
                i0 i0Var = kVar3.b.b;
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
                ArrayList a10 = sVar2.a(i0Var);
                for (int i14 = 0; i14 < a10.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((m2.b) a10.get(i14)).c));
                }
                y2.g gVar = new y2.g(size2, size2 - hashSet2.size(), length, i11);
                if (gVar.a(2) || gVar.a(1)) {
                    aVar.getClass();
                    k4.d n32 = rb.a.n3(gVar, b0Var2);
                    if (n32 != null) {
                        long j15 = n32.b;
                        int i15 = n32.a;
                        if (gVar.a(i15)) {
                            if (i15 == 2) {
                                r rVar2 = mVar.j;
                                o9 = rVar2.o(rVar2.s(sVar), j15);
                                if (o9) {
                                }
                                dVar = null;
                                if (dVar == null) {
                                }
                                k4.d dVar2222 = dVar;
                                a2 = dVar2222.a();
                                this.h.p(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                                if (!a2) {
                                }
                                return dVar2222;
                            }
                            if (i15 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j15;
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
                                o9 = true;
                                if (o9) {
                                }
                                dVar = null;
                                if (dVar == null) {
                                }
                                k4.d dVar22222 = dVar;
                                a2 = dVar22222.a();
                                this.h.p(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
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
                            this.h.p(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
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
            this.h.p(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
            if (!a2) {
            }
            return dVar2222222;
        }
        uVar = uVar2;
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
        this.h.p(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
        if (!a2) {
        }
        return dVar22222222;
    }

    @Override // y2.i
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        e eVar = (e) kVar;
        if (i10 == 0) {
            long j11 = eVar.a;
            uVar = new u(eVar.b);
        } else {
            long j12 = eVar.a;
            Uri uri = eVar.r.c;
            uVar = new u(j10);
        }
        u uVar2 = uVar;
        this.h.r(uVar2, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03f0  */
    @Override // u2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(q0 q0Var) {
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
        n nVar;
        p pVar2;
        List list4;
        boolean z11;
        long j13;
        long i10;
        Object iVar;
        m2.j jVar;
        na.d dVar;
        long j14;
        long i11;
        boolean z12;
        boolean z13;
        if (this.O) {
            return false;
        }
        n nVar2 = this.r;
        if (nVar2.d() || nVar2.c()) {
            return false;
        }
        boolean y3 = y();
        if (y3) {
            list = Collections.EMPTY_LIST;
            j3 = this.I;
        } else {
            j3 = w().n;
            list = this.w;
        }
        List list5 = list;
        l2.m mVar = this.e;
        l2.k[] kVarArr = mVar.i;
        u2.b bVar = mVar.m;
        p pVar3 = this.s;
        if (bVar != null) {
            z10 = y3;
            pVar = pVar3;
            j10 = -9223372036854775807L;
        } else {
            pVar = pVar3;
            long j15 = q0Var.a;
            long j16 = j3 - j15;
            j10 = -9223372036854775807L;
            z10 = y3;
            long Q = d0.Q(mVar.k.b(mVar.l).b) + d0.Q(mVar.k.a) + j3;
            l2.p pVar4 = mVar.h;
            if (pVar4 != null) {
                q qVar = pVar4.e;
                m2.c cVar = qVar.f;
                a4.m mVar2 = qVar.b;
                if (!cVar.d) {
                    list2 = list5;
                    z12 = false;
                } else if (qVar.n) {
                    list2 = list5;
                    z12 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = qVar.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= Q) {
                        z12 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        l2.i iVar2 = (l2.i) mVar2.b;
                        long j17 = iVar2.N;
                        if (j17 == -9223372036854775807L || j17 < longValue) {
                            iVar2.N = longValue;
                        }
                        z12 = true;
                    }
                    if (z12 && qVar.h) {
                        qVar.n = true;
                        qVar.h = false;
                        l2.i iVar3 = (l2.i) mVar2.b;
                        iVar3.D.removeCallbacks(iVar3.w);
                        iVar3.A();
                    }
                }
            } else {
                list2 = list5;
            }
            long Q2 = d0.Q(d0.A(mVar.f));
            m2.c cVar2 = mVar.k;
            long j18 = cVar2.a;
            long Q3 = j18 == -9223372036854775807L ? -9223372036854775807L : Q2 - d0.Q(j18 + cVar2.b(mVar.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                kVar = null;
            } else {
                list3 = list2;
                kVar = (k) r6.g(1, list3);
            }
            int length = mVar.j.length();
            l[] lVarArr = new l[length];
            int i12 = 0;
            while (i12 < length) {
                l2.k[] kVarArr2 = kVarArr;
                l2.k kVar2 = kVarArr2[i12];
                long j19 = j15;
                l2.j jVar2 = kVar2.d;
                na.d dVar2 = l.B;
                if (jVar2 == null) {
                    lVarArr[i12] = dVar2;
                    j14 = Q3;
                } else {
                    long b10 = kVar2.b(Q2);
                    long c10 = kVar2.c(Q2);
                    if (kVar != null) {
                        i11 = kVar.b();
                        dVar = dVar2;
                        j14 = Q3;
                    } else {
                        l2.j jVar3 = kVar2.d;
                        e2.d.h(jVar3);
                        dVar = dVar2;
                        j14 = Q3;
                        i11 = d0.i(jVar3.w(j3, kVar2.e) + kVar2.f, b10, c10);
                    }
                    long j20 = i11;
                    if (j20 < b10) {
                        lVarArr[i12] = dVar;
                    } else {
                        lVarArr[i12] = new l2.l(mVar.b(i12), j20, c10);
                    }
                }
                i12++;
                kVarArr = kVarArr2;
                j15 = j19;
                Q3 = j14;
            }
            l2.k[] kVarArr3 = kVarArr;
            long j21 = j15;
            long j22 = Q3;
            if (!mVar.k.d || kVarArr3[0].d() == 0) {
                j11 = 0;
                j12 = -9223372036854775807L;
            } else {
                long e = kVarArr3[0].e(kVarArr3[0].c(Q2));
                m2.c cVar3 = mVar.k;
                long j23 = cVar3.a;
                j11 = 0;
                j12 = Math.max(0L, Math.min(j23 == -9223372036854775807L ? -9223372036854775807L : Q2 - d0.Q(j23 + cVar3.b(mVar.l).b), e) - j21);
            }
            nVar = nVar2;
            long j24 = j11;
            pVar2 = pVar;
            mVar.j.k(j21, j16, j12, list3, lVarArr);
            int c11 = mVar.j.c();
            SystemClock.elapsedRealtime();
            l2.k b11 = mVar.b(c11);
            long j25 = b11.e;
            long j26 = b11.f;
            l2.j jVar4 = b11.d;
            m2.b bVar2 = b11.c;
            d dVar3 = b11.a;
            m2.m mVar3 = b11.b;
            if (dVar3 != null) {
                m2.j jVar5 = dVar3.r == null ? mVar3.h : null;
                if (jVar4 == null) {
                    list4 = list3;
                    jVar = mVar3.e();
                } else {
                    list4 = list3;
                    jVar = null;
                }
                if (jVar5 != null || jVar != null) {
                    g2.h hVar = mVar.e;
                    s m10 = mVar.j.m();
                    int n10 = mVar.j.n();
                    Object q6 = mVar.j.q();
                    if (jVar5 != null) {
                        m2.j a2 = jVar5.a(jVar, bVar2.a);
                        if (a2 != null) {
                            jVar5 = a2;
                        }
                    } else {
                        jVar.getClass();
                        jVar5 = jVar;
                    }
                    pVar2.c = new j(hVar, w7.k.a(mVar3, bVar2.a, jVar5, 0), m10, n10, q6, b11.a);
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
                    a1 a1Var = this.E;
                    if (z14) {
                        a aVar = (a) eVar;
                        if (z10) {
                            long j27 = aVar.h;
                            long j28 = this.I;
                            if (j27 < j28) {
                                this.x.t = j28;
                                for (c1 c1Var : this.y) {
                                    c1Var.t = this.I;
                                }
                                if (this.M) {
                                    s sVar = aVar.d;
                                    this.N = !r0.a(sVar.r, sVar.k);
                                }
                            }
                            this.M = false;
                            this.I = -9223372036854775807L;
                        }
                        aVar.x = a1Var;
                        c1[] c1VarArr = (c1[]) a1Var.c;
                        int[] iArr = new int[c1VarArr.length];
                        for (int i13 = 0; i13 < c1VarArr.length; i13++) {
                            c1 c1Var2 = c1VarArr[i13];
                            iArr[i13] = c1Var2.q + c1Var2.p;
                        }
                        aVar.y = iArr;
                        this.v.add(aVar);
                    } else if (eVar instanceof j) {
                        ((j) eVar).v = a1Var;
                    }
                    nVar.f(eVar, this, this.n.o3(eVar.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            m2.c cVar4 = mVar.k;
            boolean z15 = cVar4.d && mVar.l == cVar4.m.size() + (-1);
            boolean z16 = (z15 && j25 == -9223372036854775807L) ? false : true;
            if (b11.d() == j24) {
                pVar2.b = z16;
            } else {
                boolean z17 = z16;
                long b12 = b11.b(Q2);
                long c12 = b11.c(Q2);
                if (z15) {
                    long e7 = b11.e(c12);
                    z11 = z17 & ((e7 - b11.f(c12)) + e7 >= j25);
                } else {
                    z11 = z17;
                }
                if (kVar != null) {
                    i10 = kVar.b();
                    j13 = c12;
                } else {
                    e2.d.h(jVar4);
                    j13 = c12;
                    i10 = d0.i(jVar4.w(j3, j25) + j26, b12, j13);
                }
                long j29 = i10;
                if (j29 < b12) {
                    mVar.m = new u2.b();
                } else {
                    if (j29 <= j13) {
                        long j30 = j3;
                        if (!mVar.n || j29 < j13) {
                            if (!z11 || b11.f(j29) < j25) {
                                int min = (int) Math.min(mVar.g, (j13 - j29) + 1);
                                if (j25 != -9223372036854775807L) {
                                    while (min > 1 && b11.f((min + j29) - 1) >= j25) {
                                        min--;
                                    }
                                }
                                long j31 = list4.isEmpty() ? j30 : -9223372036854775807L;
                                g2.h hVar2 = mVar.e;
                                int i14 = mVar.d;
                                s m11 = mVar.j.m();
                                int n11 = mVar.j.n();
                                Object q10 = mVar.j.q();
                                long f7 = b11.f(j29);
                                e2.d.h(jVar4);
                                m2.j m12 = jVar4.m(j29 - j26);
                                if (dVar3 == null) {
                                    iVar = new m(hVar2, w7.k.a(mVar3, bVar2.a, m12, b11.g(j29, j22) ? 0 : 8), m11, n11, q10, f7, b11.e(j29), j29, i14, m11);
                                } else {
                                    int i15 = 1;
                                    int i16 = 1;
                                    while (i15 < min) {
                                        e2.d.h(jVar4);
                                        m2.j a10 = m12.a(jVar4.m((j29 + i15) - j26), bVar2.a);
                                        if (a10 == null) {
                                            break;
                                        }
                                        i16++;
                                        i15++;
                                        m12 = a10;
                                    }
                                    long j32 = (j29 + i16) - 1;
                                    long e10 = b11.e(j32);
                                    long j33 = (j25 == -9223372036854775807L || j25 > e10) ? -9223372036854775807L : j25;
                                    g2.m a11 = w7.k.a(mVar3, bVar2.a, m12, b11.g(j32, j22) ? 0 : 8);
                                    long j34 = -mVar3.c;
                                    if (r0.k(m11.r)) {
                                        j34 += f7;
                                    }
                                    iVar = new i(hVar2, a11, m11, n11, q10, f7, e10, j31, j33, j29, i16, j34, b11.a);
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
        nVar = nVar2;
        pVar2 = pVar;
        z13 = pVar2.b;
        e eVar22 = (e) pVar2.c;
        pVar2.c = null;
        pVar2.b = false;
        if (z13) {
        }
    }

    @Override // y2.i
    public final void p(y2.k kVar, long j3, long j10) {
        e eVar = (e) kVar;
        this.F = null;
        l2.m mVar = this.e;
        l2.k[] kVarArr = mVar.i;
        if (eVar instanceof j) {
            int s10 = mVar.j.s(((j) eVar).d);
            l2.k kVar2 = kVarArr[s10];
            if (kVar2.d == null) {
                d dVar = kVar2.a;
                e2.d.h(dVar);
                c3.b0 b0Var = dVar.n;
                c3.j jVar = b0Var instanceof c3.j ? (c3.j) b0Var : null;
                if (jVar != null) {
                    m2.m mVar2 = kVar2.b;
                    kVarArr[s10] = new l2.k(kVar2.e, mVar2, kVar2.c, kVar2.a, kVar2.f, new e6.n(jVar, mVar2.c, 4));
                }
            }
        }
        l2.p pVar = mVar.h;
        if (pVar != null) {
            long j11 = pVar.d;
            if (j11 == -9223372036854775807L || eVar.n > j11) {
                pVar.d = eVar.n;
            }
            pVar.e.h = true;
        }
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        u uVar = new u(j10);
        this.n.getClass();
        this.h.o(uVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        this.f.g(this);
    }

    @Override // u2.f1
    public final long r() {
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.I;
        }
        long j3 = this.J;
        a w10 = w();
        if (!w10.c()) {
            ArrayList arrayList = this.v;
            w10 = arrayList.size() > 1 ? (a) hc.b.i(2, arrayList) : null;
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.n);
        }
        return Math.max(j3, this.x.q());
    }

    @Override // u2.d1
    public final int t(of.b bVar, h2.h hVar, int i10) {
        if (y()) {
            return -3;
        }
        a aVar = this.L;
        c1 c1Var = this.x;
        if (aVar != null && aVar.d(0) <= c1Var.t()) {
            return -3;
        }
        z();
        return c1Var.C(bVar, hVar, i10, this.O);
    }

    @Override // u2.f1
    public final void u(long j3) {
        n nVar = this.r;
        if (nVar.c() || y()) {
            return;
        }
        boolean d = nVar.d();
        List list = this.w;
        l2.m mVar = this.e;
        ArrayList arrayList = this.v;
        if (d) {
            e eVar = this.F;
            eVar.getClass();
            boolean z10 = eVar instanceof a;
            if (z10 && x(arrayList.size() - 1)) {
                return;
            }
            if (mVar.m == null ? mVar.j.d(j3, eVar, list) : false) {
                nVar.b();
                if (z10) {
                    this.L = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (mVar.m != null || mVar.j.length() < 2) ? list.size() : mVar.j.i(j3, list);
        if (size < arrayList.size()) {
            e2.d.g(!nVar.d());
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
            if (size == -1) {
                return;
            }
            long j10 = w().n;
            a v = v(size);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
            this.O = false;
            this.h.x(this.a, v.h, j10);
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
            c1[] c1VarArr = this.y;
            if (i11 >= c1VarArr.length) {
                return aVar;
            }
            c1 c1Var = c1VarArr[i11];
            i11++;
            c1Var.n(aVar.d(i11));
        }
    }

    public final a w() {
        return (a) hc.b.i(1, this.v);
    }

    public final boolean x(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c1[] c1VarArr = this.y;
            if (i11 >= c1VarArr.length) {
                return false;
            }
            t10 = c1VarArr[i11].t();
            i11++;
        } while (t10 <= aVar.d(i11));
        return true;
    }

    public final boolean y() {
        return this.I != -9223372036854775807L;
    }

    public final void z() {
        int A = A(this.x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 > A) {
                return;
            }
            this.K = i10 + 1;
            a aVar = (a) this.v.get(i10);
            s sVar = aVar.d;
            if (!sVar.equals(this.G)) {
                this.h.i(this.a, sVar, aVar.e, aVar.f, aVar.h);
            }
            this.G = sVar;
        }
    }
}
