package x2;

import a3.q;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import b8.ig;
import b8.kg;
import b8.se;
import b8.zb;
import d2.u0;
import d2.v;
import g2.n0;
import g9.i0;
import i2.c0;
import i2.y;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k2.p1;
import k2.v0;
import n2.o;
import n2.p;
import w2.c1;
import w2.d1;
import w2.f1;
import w2.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements d1, f1, a3.k, a3.n {
    public final c1[] E;
    public final ua.b F;
    public f G;
    public v H;
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
    public final v[] c;
    public final boolean[] d;
    public final n2.l e;
    public final n2.b f;
    public final kg h;
    public final kb.a n;
    public final q r;
    public final ba.i s;
    public final ArrayList w;
    public final List x;
    public final c1 y;

    public i(int i3, int[] iArr, v[] vVarArr, n2.l lVar, n2.b bVar, a0 a0Var, long j10, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar, boolean z10, long j11, b3.a aVar2) {
        this.a = i3;
        this.b = iArr;
        this.c = vVarArr;
        this.e = lVar;
        this.f = bVar;
        this.h = kgVar;
        this.n = aVar;
        this.r = aVar2 != null ? new q(aVar2) : new q("ChunkSampleStream");
        this.s = new ba.i(10);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new c1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        c1[] c1VarArr = new c1[i10];
        mVar.getClass();
        c1 c1Var = new c1(a0Var, mVar, jVar);
        this.y = c1Var;
        iArr2[0] = i3;
        c1VarArr[0] = c1Var;
        int i11 = 0;
        while (i11 < length) {
            c1 c1Var2 = new c1(a0Var, null, null);
            this.E[i11] = c1Var2;
            int i12 = i11 + 1;
            c1VarArr[i12] = c1Var2;
            iArr2[i12] = this.b[i11];
            i11 = i12;
        }
        this.F = new ua.b(3, iArr2, c1VarArr);
        this.J = j10;
        this.K = j10;
        this.N = z10;
        if (!z10 || j11 == -9223372036854775807L) {
            return;
        }
        this.N = false;
        this.O = j11 < j10;
    }

    public final int A(int i3, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.w;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i3);
        return i10 - 1;
    }

    public final void B(n2.b bVar) {
        this.I = bVar;
        c1 c1Var = this.y;
        c1Var.l();
        p2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.b(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.E) {
            c1Var2.l();
            p2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.b(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        this.r.e(this);
    }

    @Override // a3.k
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        u uVar;
        f fVar = (f) mVar;
        if (i3 == 0) {
            long j12 = fVar.a;
            uVar = new u(fVar.b, j10);
        } else {
            long j13 = fVar.a;
            i2.n nVar = fVar.b;
            c0 c0Var = fVar.r;
            uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        }
        this.h.u(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i3);
    }

    @Override // w2.d1
    public final void a() {
        q qVar = this.r;
        qVar.a();
        this.y.C();
        if (qVar.d()) {
            return;
        }
        n2.l lVar = this.e;
        w2.b bVar = lVar.m;
        if (bVar != null) {
            throw bVar;
        }
        lVar.a.a();
    }

    @Override // a3.n
    public final void b() {
        c1 c1Var = this.y;
        c1Var.G(true);
        p2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.b(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.E) {
            c1Var2.G(true);
            p2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.b(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        for (n2.j jVar : this.e.i) {
            e eVar = jVar.a;
            if (eVar != null) {
                eVar.a.release();
            }
        }
        h hVar = this.I;
        if (hVar != null) {
            n2.b bVar = (n2.b) hVar;
            synchronized (bVar) {
                o oVar = (o) bVar.E.remove(this);
                if (oVar != null) {
                    c1 c1Var3 = oVar.a;
                    c1Var3.G(true);
                    p2.g gVar3 = c1Var3.h;
                    if (gVar3 != null) {
                        gVar3.b(c1Var3.e);
                        c1Var3.h = null;
                        c1Var3.g = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03f9  */
    @Override // w2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(v0 v0Var) {
        long j10;
        List list;
        ba.i iVar;
        long j11;
        boolean z10;
        List list2;
        List list3;
        l lVar;
        long j12;
        long j13;
        q qVar;
        ba.i iVar2;
        List list4;
        boolean z11;
        long j14;
        long j15;
        int i3;
        Object jVar;
        o2.j jVar2;
        long j16;
        boolean z12;
        boolean z13;
        if (this.Q) {
            return false;
        }
        q qVar2 = this.r;
        if (qVar2.d() || qVar2.c()) {
            return false;
        }
        boolean x10 = x();
        if (x10) {
            list = Collections.EMPTY_LIST;
            j10 = this.J;
        } else {
            j10 = v().n;
            list = this.x;
        }
        List list5 = list;
        n2.l lVar2 = this.e;
        n2.j[] jVarArr = lVar2.i;
        w2.b bVar = lVar2.m;
        ba.i iVar3 = this.s;
        if (bVar != null) {
            z10 = x10;
            iVar = iVar3;
            j11 = -9223372036854775807L;
        } else {
            iVar = iVar3;
            long j17 = v0Var.a;
            long j18 = j10 - j17;
            j11 = -9223372036854775807L;
            z10 = x10;
            long S = n0.S(lVar2.k.b(lVar2.l).b) + n0.S(lVar2.k.a) + j10;
            o oVar = lVar2.h;
            if (oVar != null) {
                p pVar = oVar.e;
                o2.c cVar = pVar.f;
                n2.f fVar = pVar.b;
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
                        n2.h hVar = fVar.a;
                        long j19 = hVar.M;
                        if (j19 == -9223372036854775807L || j19 < longValue) {
                            hVar.M = longValue;
                        }
                        z12 = true;
                    }
                    if (z12 && pVar.h) {
                        pVar.n = true;
                        pVar.h = false;
                        n2.h hVar2 = fVar.a;
                        hVar2.D.removeCallbacks(hVar2.w);
                        hVar2.C();
                    }
                }
            } else {
                list2 = list5;
            }
            long S2 = n0.S(n0.C(lVar2.f));
            o2.c cVar2 = lVar2.k;
            long j20 = cVar2.a;
            long S3 = j20 == -9223372036854775807L ? -9223372036854775807L : S2 - n0.S(j20 + cVar2.b(lVar2.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                lVar = null;
            } else {
                list3 = list2;
                lVar = (l) t4.c.d(1, list3);
            }
            int length = lVar2.j.length();
            m[] mVarArr = new m[length];
            int i10 = 0;
            while (i10 < length) {
                n2.j[] jVarArr2 = jVarArr;
                n2.j jVar3 = jVarArr2[i10];
                long j21 = j17;
                n2.i iVar4 = jVar3.d;
                long j22 = S3;
                long j23 = jVar3.f;
                long j24 = jVar3.e;
                mb.b bVar2 = m.B;
                if (iVar4 == null) {
                    mVarArr[i10] = bVar2;
                } else {
                    iVar4.getClass();
                    long j25 = iVar4.j(j24, S2) + j23;
                    long b10 = jVar3.b(S2);
                    if (lVar != null) {
                        j16 = lVar.b();
                    } else {
                        n2.i iVar5 = jVar3.d;
                        iVar5.getClass();
                        j16 = n0.j(iVar5.s(j10, j24) + j23, j25, b10);
                    }
                    long j26 = j16;
                    if (j26 < j25) {
                        mVarArr[i10] = bVar2;
                    } else {
                        mVarArr[i10] = new n2.k(lVar2.b(i10), j26, b10);
                    }
                }
                i10++;
                jVarArr = jVarArr2;
                j17 = j21;
                S3 = j22;
            }
            n2.j[] jVarArr3 = jVarArr;
            long j27 = j17;
            long j28 = S3;
            if (!lVar2.k.d || jVarArr3[0].c() == 0) {
                j12 = 0;
                j13 = -9223372036854775807L;
            } else {
                long d = jVarArr3[0].d(jVarArr3[0].b(S2));
                o2.c cVar3 = lVar2.k;
                long j29 = cVar3.a;
                j12 = 0;
                j13 = Math.max(0L, Math.min(j29 == -9223372036854775807L ? -9223372036854775807L : S2 - n0.S(j29 + cVar3.b(lVar2.l).b), d) - j27);
            }
            qVar = qVar2;
            long j30 = j12;
            iVar2 = iVar;
            lVar2.j.d(j27, j18, j13, list3, mVarArr);
            int c2 = lVar2.j.c();
            SystemClock.elapsedRealtime();
            n2.j b11 = lVar2.b(c2);
            long j31 = b11.e;
            long j32 = b11.f;
            n2.i iVar6 = b11.d;
            o2.b bVar3 = b11.c;
            e eVar = b11.a;
            o2.m mVar = b11.b;
            if (eVar != null) {
                o2.j jVar4 = eVar.s == null ? mVar.h : null;
                if (iVar6 == null) {
                    list4 = list3;
                    jVar2 = mVar.d();
                } else {
                    list4 = list3;
                    jVar2 = null;
                }
                if (jVar4 != null || jVar2 != null) {
                    i2.h hVar3 = lVar2.e;
                    v n4 = lVar2.j.n();
                    int o10 = lVar2.j.o();
                    Object r5 = lVar2.j.r();
                    if (jVar4 != null) {
                        o2.j a10 = jVar4.a(jVar2, bVar3.a);
                        if (a10 != null) {
                            jVar4 = a10;
                        }
                    } else {
                        jVar2.getClass();
                        jVar4 = jVar2;
                    }
                    iVar2.c = new k(hVar3, se.a(mVar, bVar3.a, jVar4, 0), n4, o10, r5, b11.a);
                    z13 = iVar2.b;
                    f fVar2 = (f) iVar2.c;
                    iVar2.c = null;
                    iVar2.b = false;
                    if (z13) {
                        this.J = j11;
                        this.Q = true;
                        return true;
                    }
                    if (fVar2 == null) {
                        return false;
                    }
                    this.G = fVar2;
                    boolean z14 = fVar2 instanceof a;
                    ua.b bVar4 = this.F;
                    if (z14) {
                        a aVar = (a) fVar2;
                        if (z10) {
                            long j33 = aVar.h;
                            long j34 = this.J;
                            if (j33 < j34) {
                                this.y.t = j34;
                                for (c1 c1Var : this.E) {
                                    c1Var.t = this.J;
                                }
                                this.O = this.N;
                            }
                            this.N = false;
                            this.J = -9223372036854775807L;
                        }
                        aVar.y = bVar4;
                        c1[] c1VarArr = (c1[]) bVar4.c;
                        int[] iArr = new int[c1VarArr.length];
                        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
                            c1 c1Var2 = c1VarArr[i11];
                            iArr[i11] = c1Var2.q + c1Var2.p;
                        }
                        aVar.E = iArr;
                        this.w.add(aVar);
                    } else if (fVar2 instanceof k) {
                        ((k) fVar2).w = bVar4;
                    }
                    qVar.f(fVar2, this, this.n.F4(fVar2.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            o2.c cVar4 = lVar2.k;
            boolean z15 = cVar4.d && lVar2.l == cVar4.m.size() + (-1);
            boolean z16 = (z15 && j31 == -9223372036854775807L) ? false : true;
            if (b11.c() == j30) {
                iVar2.b = z16;
            } else {
                iVar6.getClass();
                boolean z17 = z16;
                long j35 = iVar6.j(j31, S2) + j32;
                long b12 = b11.b(S2);
                if (z15) {
                    long d10 = b11.d(b12);
                    z11 = z17 & ((d10 - b11.e(b12)) + d10 >= j31);
                } else {
                    z11 = z17;
                }
                if (lVar != null) {
                    j15 = lVar.b();
                    j14 = b12;
                } else {
                    iVar6.getClass();
                    j14 = b12;
                    j15 = n0.j(iVar6.s(j10, j31) + j32, j35, j14);
                }
                long j36 = j15;
                if (j36 < j35) {
                    lVar2.m = new w2.b();
                } else {
                    if (j36 <= j14) {
                        long j37 = j10;
                        if (!lVar2.n || j36 < j14) {
                            if (!z11 || b11.e(j36) < j31) {
                                int min = (int) Math.min(lVar2.g, (j14 - j36) + 1);
                                int i12 = (j31 > (-9223372036854775807L) ? 1 : (j31 == (-9223372036854775807L) ? 0 : -1));
                                if (i12 != 0) {
                                    while (min > 1 && b11.e((min + j36) - 1) >= j31) {
                                        min--;
                                    }
                                }
                                long j38 = list4.isEmpty() ? j37 : -9223372036854775807L;
                                i2.h hVar4 = lVar2.e;
                                int i13 = lVar2.d;
                                v n10 = lVar2.j.n();
                                int o11 = lVar2.j.o();
                                Object r9 = lVar2.j.r();
                                long e10 = b11.e(j36);
                                iVar6.getClass();
                                o2.j m10 = iVar6.m(j36 - j32);
                                if (eVar == null) {
                                    jVar = new n(hVar4, se.a(mVar, bVar3.a, m10, b11.f(j36, j28) ? 0 : 8), n10, o11, r9, e10, b11.d(j36), j36, i13, n10);
                                } else {
                                    int i14 = 1;
                                    int i15 = 1;
                                    while (true) {
                                        if (i14 >= min) {
                                            i3 = i12;
                                            break;
                                        }
                                        int i16 = min;
                                        i3 = i12;
                                        iVar6.getClass();
                                        o2.j a11 = m10.a(iVar6.m((j36 + i14) - j32), bVar3.a);
                                        if (a11 == null) {
                                            break;
                                        }
                                        i15++;
                                        i14++;
                                        i12 = i3;
                                        m10 = a11;
                                        min = i16;
                                    }
                                    long j39 = (j36 + i15) - 1;
                                    long d11 = b11.d(j39);
                                    long j40 = (i3 == 0 || j31 > d11) ? -9223372036854775807L : j31;
                                    i2.n a12 = se.a(mVar, bVar3.a, m10, b11.f(j39, j28) ? 0 : 8);
                                    long j41 = -mVar.c;
                                    if (u0.k(n10.s)) {
                                        j41 += e10;
                                    }
                                    jVar = new j(hVar4, a12, n10, o11, r9, e10, d11, j38, j40, j36, i15, j41, b11.a);
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
        qVar = qVar2;
        iVar2 = iVar;
        z13 = iVar2.b;
        f fVar222 = (f) iVar2.c;
        iVar2.c = null;
        iVar2.b = false;
        if (z13) {
        }
    }

    @Override // w2.f1
    public final boolean d() {
        return this.r.d();
    }

    @Override // w2.f1
    public final long e() {
        if (x()) {
            return this.J;
        }
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        return v().n;
    }

    @Override // w2.d1
    public final boolean f() {
        return !x() && this.y.A(this.Q);
    }

    @Override // a3.k
    public final void h(a3.m mVar, long j10, long j11) {
        f fVar = (f) mVar;
        this.G = null;
        n2.l lVar = this.e;
        n2.j[] jVarArr = lVar.i;
        if (fVar instanceof k) {
            int e10 = lVar.j.e(((k) fVar).d);
            n2.j jVar = jVarArr[e10];
            if (jVar.d == null) {
                e eVar = jVar.a;
                eVar.getClass();
                e3.j a10 = eVar.a();
                if (a10 != null) {
                    o2.m mVar2 = jVar.b;
                    jVarArr[e10] = new n2.j(jVar.e, mVar2, jVar.c, jVar.a, jVar.f, new ig(a10, mVar2.c, 5));
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
        i2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.n.getClass();
        this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        this.f.k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028c  */
    @Override // a3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        boolean z10;
        boolean z11;
        boolean z12;
        kb.a aVar;
        ArrayList arrayList;
        u uVar;
        boolean z13;
        boolean z14;
        boolean z15;
        long j12;
        a3.i iVar;
        boolean a10;
        f fVar = (f) mVar;
        c0 c0Var = fVar.r;
        v vVar = fVar.d;
        long j13 = fVar.h;
        long j14 = c0Var.b;
        boolean z16 = fVar instanceof a;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size() - 1;
        if (j14 != 0 && z16 && w(size)) {
            z10 = false;
            z11 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        i2.n nVar = fVar.b;
        c0 c0Var2 = fVar.r;
        u uVar2 = new u(nVar, c0Var2.c, c0Var2.d, j10, j11, j14);
        n0.h0(j13);
        n0.h0(fVar.n);
        e5.u uVar3 = new e5.u(iOException, i3, 1);
        n2.l lVar = this.e;
        n2.j[] jVarArr = lVar.i;
        za.p pVar = lVar.b;
        kb.a aVar2 = this.n;
        if (z10) {
            z12 = z16;
            o oVar = lVar.h;
            if (oVar != null) {
                long j15 = oVar.d;
                boolean z17 = j15 != -9223372036854775807L && j15 < j13;
                p pVar2 = oVar.e;
                if (pVar2.f.d) {
                    if (!pVar2.n) {
                        if (z17) {
                            if (pVar2.h) {
                                pVar2.n = true;
                                pVar2.h = false;
                                n2.h hVar = pVar2.b.a;
                                hVar.D.removeCallbacks(hVar.w);
                                hVar.C();
                            }
                        }
                    }
                    aVar = aVar2;
                    arrayList = arrayList2;
                    z13 = z10;
                    uVar = uVar2;
                    z15 = true;
                    z14 = true;
                    if (z15) {
                        if (z13) {
                            if (z12) {
                                zb.p(u(size) == fVar ? z14 : false);
                                if (arrayList.isEmpty()) {
                                    this.J = this.K;
                                }
                            }
                            iVar = q.e;
                            if (iVar == null) {
                                aVar.getClass();
                                long G4 = kb.a.G4(uVar3);
                                iVar = G4 != -9223372036854775807L ? new a3.i(0, G4, false) : q.f;
                            }
                            a3.i iVar2 = iVar;
                            a10 = iVar2.a();
                            this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                            if (!a10) {
                                this.G = null;
                                aVar.getClass();
                                this.f.k(this);
                            }
                            return iVar2;
                        }
                        g2.a.l("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    iVar = null;
                    if (iVar == null) {
                    }
                    a3.i iVar22 = iVar;
                    a10 = iVar22.a();
                    this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                    if (!a10) {
                    }
                    return iVar22;
                }
            }
            if (!lVar.k.d && (fVar instanceof l) && (iOException instanceof y) && ((y) iOException).c == 404) {
                n2.j jVar = jVarArr[lVar.j.e(vVar)];
                long c2 = jVar.c();
                if (c2 != -1 && c2 != 0) {
                    n2.i iVar3 = jVar.d;
                    iVar3.getClass();
                    if (((l) fVar).b() > ((iVar3.C() + jVar.f) + c2) - 1) {
                        lVar.n = true;
                        aVar = aVar2;
                        arrayList = arrayList2;
                        z13 = z10;
                        uVar = uVar2;
                        z15 = true;
                        z14 = true;
                        if (z15) {
                        }
                        iVar = null;
                        if (iVar == null) {
                        }
                        a3.i iVar222 = iVar;
                        a10 = iVar222.a();
                        this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                        if (!a10) {
                        }
                        return iVar222;
                    }
                }
            }
            n2.j jVar2 = jVarArr[lVar.j.e(vVar)];
            o2.m mVar2 = jVar2.b;
            o2.b bVar = jVar2.c;
            o2.b B = pVar.B(mVar2.b);
            if (B == null || bVar.equals(B)) {
                z2.p pVar3 = lVar.j;
                i0 i0Var = jVar2.b.b;
                boolean z18 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar = aVar2;
                int length = pVar3.length();
                arrayList = arrayList2;
                uVar = uVar2;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (pVar3.a(i11, elapsedRealtime)) {
                        i10++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < i0Var.size(); i12++) {
                    hashSet.add(Integer.valueOf(((o2.b) i0Var.get(i12)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList h = pVar.h(i0Var);
                z13 = z18;
                for (int i13 = 0; i13 < h.size(); i13++) {
                    hashSet2.add(Integer.valueOf(((o2.b) h.get(i13)).c));
                }
                a3.h hVar2 = new a3.h(size2, size2 - hashSet2.size(), length, i10);
                if (hVar2.a(2) || hVar2.a(1)) {
                    aVar.getClass();
                    a3.i D4 = kb.a.D4(hVar2, uVar3);
                    if (D4 != null) {
                        long j16 = D4.b;
                        int i14 = D4.a;
                        if (hVar2.a(i14)) {
                            if (i14 == 2) {
                                z2.p pVar4 = lVar.j;
                                z15 = pVar4.p(pVar4.e(vVar), j16);
                                z14 = true;
                                if (z15) {
                                }
                                iVar = null;
                                if (iVar == null) {
                                }
                                a3.i iVar2222 = iVar;
                                a10 = iVar2222.a();
                                this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                                if (!a10) {
                                }
                                return iVar2222;
                            }
                            z14 = true;
                            if (i14 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j16;
                                String str = bVar.b;
                                HashMap hashMap = (HashMap) pVar.a;
                                if (hashMap.containsKey(str)) {
                                    Long l10 = (Long) hashMap.get(str);
                                    String str2 = n0.a;
                                    j12 = Math.max(elapsedRealtime2, l10.longValue());
                                } else {
                                    j12 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j12));
                                int i15 = bVar.c;
                                if (i15 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i15);
                                    HashMap hashMap2 = (HashMap) pVar.b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l11 = (Long) hashMap2.get(valueOf);
                                        String str3 = n0.a;
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
                                a3.i iVar22222 = iVar;
                                a10 = iVar22222.a();
                                this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
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
                            a3.i iVar222222 = iVar;
                            a10 = iVar222222.a();
                            this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
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
                    a3.i iVar2222222 = iVar;
                    a10 = iVar2222222.a();
                    this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                    if (!a10) {
                    }
                    return iVar2222222;
                }
            }
            aVar = aVar2;
            arrayList = arrayList2;
            z13 = z10;
            uVar = uVar2;
            z15 = true;
            z14 = true;
            if (z15) {
            }
            iVar = null;
            if (iVar == null) {
            }
            a3.i iVar22222222 = iVar;
            a10 = iVar22222222.a();
            this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
            if (!a10) {
            }
            return iVar22222222;
        }
        z12 = z16;
        aVar = aVar2;
        arrayList = arrayList2;
        z13 = z10;
        uVar = uVar2;
        z15 = false;
        z14 = true;
        if (z15) {
        }
        iVar = null;
        if (iVar == null) {
        }
        a3.i iVar222222222 = iVar;
        a10 = iVar222222222.a();
        this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
        if (!a10) {
        }
        return iVar222222222;
    }

    @Override // w2.d1
    public final int m(long j10) {
        if (x() || y() || this.P) {
            return 0;
        }
        boolean z10 = this.Q;
        c1 c1Var = this.y;
        int x10 = c1Var.x(j10, z10);
        a aVar = this.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x10);
        z();
        return x10;
    }

    @Override // w2.d1
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        if (x() || y() || this.P) {
            return -3;
        }
        a aVar = this.M;
        c1 c1Var = this.y;
        if (aVar != null && aVar.d(0) <= c1Var.v()) {
            return -3;
        }
        z();
        return c1Var.F(bVar, hVar, i3, this.Q);
    }

    @Override // w2.f1
    public final long q() {
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.J;
        }
        long j10 = this.K;
        a v = v();
        if (!v.c()) {
            ArrayList arrayList = this.w;
            v = arrayList.size() > 1 ? (a) p1.h(2, arrayList) : null;
        }
        if (v != null) {
            j10 = Math.max(j10, v.n);
        }
        return Math.max(j10, this.y.s());
    }

    @Override // a3.k
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        f fVar = (f) mVar;
        this.G = null;
        this.M = null;
        long j12 = fVar.a;
        i2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.n.getClass();
        this.h.p(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (x()) {
            this.y.G(false);
            for (c1 c1Var : this.E) {
                c1Var.G(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.w;
            u(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.J = this.K;
            }
        }
        this.f.k(this);
    }

    @Override // w2.f1
    public final void t(long j10) {
        q qVar = this.r;
        if (qVar.c() || x()) {
            return;
        }
        boolean d = qVar.d();
        List list = this.x;
        n2.l lVar = this.e;
        ArrayList arrayList = this.w;
        if (d) {
            f fVar = this.G;
            fVar.getClass();
            boolean z10 = fVar instanceof a;
            if (z10 && w(arrayList.size() - 1)) {
                return;
            }
            if (lVar.m == null ? lVar.j.m(j10, fVar, list) : false) {
                qVar.b();
                if (z10) {
                    this.M = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (lVar.m != null || lVar.j.length() < 2) ? list.size() : lVar.j.j(j10, list);
        if (size < arrayList.size()) {
            zb.p(!qVar.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!w(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size != -1) {
                long j11 = v().n;
                a u10 = u(size);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
                this.Q = false;
                this.h.B(u10.h, this.a, j11);
            }
        }
        if (this.y.z()) {
            this.Q = true;
        }
    }

    public final a u(int i3) {
        ArrayList arrayList = this.w;
        a aVar = (a) arrayList.get(i3);
        n0.X(i3, arrayList.size(), arrayList);
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

    public final a v() {
        return (a) p1.h(1, this.w);
    }

    public final boolean w(int i3) {
        int v;
        a aVar = (a) this.w.get(i3);
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

    public final boolean x() {
        return this.J != -9223372036854775807L;
    }

    public final boolean y() {
        return ((!this.N && !this.O) || this.Q || this.r.c()) ? false : true;
    }

    public final void z() {
        int A = A(this.y.v(), this.L - 1);
        while (true) {
            int i3 = this.L;
            if (i3 > A) {
                return;
            }
            this.L = i3 + 1;
            a aVar = (a) this.w.get(i3);
            v vVar = aVar.d;
            if (!vVar.equals(this.H)) {
                this.h.k(this.a, vVar, aVar.e, aVar.f, aVar.h);
            }
            this.H = vVar;
        }
    }
}
