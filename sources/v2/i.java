package v2;

import a8.h0;
import a8.lg;
import a8.ng;
import a8.vd;
import a8.yb;
import android.os.SystemClock;
import b2.u;
import b2.x;
import d5.z;
import e2.n0;
import f9.i0;
import g2.b0;
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
import org.telegram.ui.Components.b10;
import u2.c1;
import u2.d1;
import u2.f1;
import u7.s;
import vi.y;
import x2.q;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i implements d1, f1, y2.g, y2.j {
    public final m4.c E;
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
    public final l2.k e;
    public final l2.b f;
    public final ng h;
    public final s n;
    public final y2.l r;
    public final u s;
    public final ArrayList v;
    public final List w;
    public final c1 x;
    public final c1[] y;

    public i(int i10, int[] iArr, x[] xVarArr, l2.k kVar, l2.b bVar, h0 h0Var, long j10, n2.m mVar, n2.j jVar, s sVar, ng ngVar, boolean z10, long j11, z2.a aVar) {
        this.a = i10;
        this.b = iArr;
        this.c = xVarArr;
        this.e = kVar;
        this.f = bVar;
        this.h = ngVar;
        this.n = sVar;
        this.r = aVar != null ? new y2.l(aVar) : new y2.l("ChunkSampleStream");
        this.s = new u(6);
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new c1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c1[] c1VarArr = new c1[i11];
        mVar.getClass();
        c1 c1Var = new c1(h0Var, mVar, jVar);
        this.x = c1Var;
        iArr2[0] = i10;
        c1VarArr[0] = c1Var;
        int i12 = 0;
        while (i12 < length) {
            c1 c1Var2 = new c1(h0Var, null, null);
            this.y[i12] = c1Var2;
            int i13 = i12 + 1;
            c1VarArr[i13] = c1Var2;
            iArr2[i13] = this.b[i12];
            i12 = i13;
        }
        this.E = new m4.c(22, iArr2, c1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (!z10 || j11 == -9223372036854775807L) {
            return;
        }
        this.M = false;
        this.N = j11 < j10;
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

    @Override // y2.g
    public final void B(y2.i iVar, long j10, long j11) {
        f fVar = (f) iVar;
        this.F = null;
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.i;
        if (fVar instanceof k) {
            int s10 = kVar.j.s(((k) fVar).d);
            l2.i iVar2 = iVarArr[s10];
            if (iVar2.d == null) {
                e eVar = iVar2.a;
                eVar.getClass();
                c3.j a2 = eVar.a();
                if (a2 != null) {
                    m2.m mVar = iVar2.b;
                    iVarArr[s10] = new l2.i(iVar2.e, mVar, iVar2.c, iVar2.a, iVar2.f, new lg(a2, mVar.c, 6));
                }
            }
        }
        l2.n nVar = kVar.h;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || fVar.n > j12) {
                nVar.d = fVar.n;
            }
            nVar.e.h = true;
        }
        long j13 = fVar.a;
        g2.m mVar2 = fVar.b;
        b0 b0Var = fVar.r;
        u2.u uVar = new u2.u(mVar2, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.n.getClass();
        this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        this.f.u(this);
    }

    public final void C(l2.b bVar) {
        this.H = bVar;
        c1 c1Var = this.x;
        c1Var.l();
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.y) {
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

    @Override // y2.j
    public final void a() {
        c1 c1Var = this.x;
        c1Var.G(true);
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.g = null;
        }
        for (c1 c1Var2 : this.y) {
            c1Var2.G(true);
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.g = null;
            }
        }
        for (l2.i iVar : this.e.i) {
            e eVar = iVar.a;
            if (eVar != null) {
                eVar.a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            l2.b bVar = (l2.b) hVar;
            synchronized (bVar) {
                l2.n nVar = (l2.n) bVar.y.remove(this);
                if (nVar != null) {
                    c1 c1Var3 = nVar.a;
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
    public final long b() {
        if (v()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return t().n;
    }

    @Override // u2.f1
    public final boolean c() {
        return this.r.c();
    }

    @Override // u2.d1
    public final void d() {
        y2.l lVar = this.r;
        lVar.d();
        this.x.C();
        if (lVar.c()) {
            return;
        }
        l2.k kVar = this.e;
        u2.b bVar = kVar.m;
        if (bVar != null) {
            throw bVar;
        }
        kVar.a.d();
    }

    @Override // u2.d1
    public final boolean e() {
        return !v() && this.x.A(this.P);
    }

    @Override // u2.d1
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        if (v() || x() || this.O) {
            return -3;
        }
        a aVar = this.L;
        c1 c1Var = this.x;
        if (aVar != null && aVar.d(0) <= c1Var.v()) {
            return -3;
        }
        y();
        return c1Var.F(sVar, hVar, i10, this.P);
    }

    @Override // u2.d1
    public final int j(long j10) {
        if (v() || x() || this.O) {
            return 0;
        }
        boolean z10 = this.P;
        c1 c1Var = this.x;
        int x9 = c1Var.x(j10, z10);
        a aVar = this.L;
        if (aVar != null) {
            x9 = Math.min(x9, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x9);
        y();
        return x9;
    }

    @Override // y2.g
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.a;
        g2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.n.getClass();
        this.h.p(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (v()) {
            this.x.G(false);
            for (c1 c1Var : this.y) {
                c1Var.G(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.v;
            n(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
        }
        this.f.u(this);
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
        if (lVar3.c() || lVar3.b()) {
            return false;
        }
        boolean v = v();
        if (v) {
            list = Collections.EMPTY_LIST;
            j10 = this.I;
        } else {
            j10 = t().n;
            list = this.w;
        }
        List list5 = list;
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.i;
        u2.b bVar = kVar.m;
        u uVar3 = this.s;
        if (bVar != null) {
            z10 = v;
            uVar = uVar3;
            j11 = -9223372036854775807L;
        } else {
            uVar = uVar3;
            long j17 = w0Var.a;
            long j18 = j10 - j17;
            j11 = -9223372036854775807L;
            z10 = v;
            long S = n0.S(kVar.k.b(kVar.l).b) + n0.S(kVar.k.a) + j10;
            l2.n nVar = kVar.h;
            if (nVar != null) {
                o oVar = nVar.e;
                m2.c cVar = oVar.f;
                a4.l lVar4 = oVar.b;
                if (!cVar.d) {
                    list2 = list5;
                    z12 = false;
                } else if (oVar.n) {
                    list2 = list5;
                    z12 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = oVar.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= S) {
                        z12 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        l2.g gVar = (l2.g) lVar4.b;
                        long j19 = gVar.M;
                        if (j19 == -9223372036854775807L || j19 < longValue) {
                            gVar.M = longValue;
                        }
                        z12 = true;
                    }
                    if (z12 && oVar.h) {
                        oVar.n = true;
                        oVar.h = false;
                        l2.g gVar2 = (l2.g) lVar4.b;
                        gVar2.D.removeCallbacks(gVar2.w);
                        gVar2.C();
                    }
                }
            } else {
                list2 = list5;
            }
            long S2 = n0.S(n0.C(kVar.f));
            m2.c cVar2 = kVar.k;
            long j20 = cVar2.a;
            long S3 = j20 == -9223372036854775807L ? -9223372036854775807L : S2 - n0.S(j20 + cVar2.b(kVar.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                lVar = null;
            } else {
                list3 = list2;
                lVar = (l) b10.h(1, list3);
            }
            int length = kVar.j.length();
            m[] mVarArr = new m[length];
            int i11 = 0;
            while (i11 < length) {
                l2.i[] iVarArr2 = iVarArr;
                l2.i iVar = iVarArr2[i11];
                long j21 = j17;
                l2.h hVar = iVar.d;
                long j22 = S3;
                long j23 = iVar.f;
                long j24 = iVar.e;
                tb.a aVar = m.B;
                if (hVar == null) {
                    mVarArr[i11] = aVar;
                } else {
                    hVar.getClass();
                    long g7 = hVar.g(j24, S2) + j23;
                    long b10 = iVar.b(S2);
                    if (lVar != null) {
                        j16 = lVar.a();
                    } else {
                        l2.h hVar2 = iVar.d;
                        hVar2.getClass();
                        j16 = n0.j(hVar2.t(j10, j24) + j23, g7, b10);
                    }
                    long j25 = j16;
                    if (j25 < g7) {
                        mVarArr[i11] = aVar;
                    } else {
                        mVarArr[i11] = new l2.j(kVar.b(i11), j25, b10);
                    }
                }
                i11++;
                iVarArr = iVarArr2;
                j17 = j21;
                S3 = j22;
            }
            l2.i[] iVarArr3 = iVarArr;
            long j26 = j17;
            long j27 = S3;
            if (!kVar.k.d || iVarArr3[0].c() == 0) {
                j12 = 0;
                j13 = -9223372036854775807L;
            } else {
                long d = iVarArr3[0].d(iVarArr3[0].b(S2));
                m2.c cVar3 = kVar.k;
                long j28 = cVar3.a;
                j12 = 0;
                j13 = Math.max(0L, Math.min(j28 == -9223372036854775807L ? -9223372036854775807L : S2 - n0.S(j28 + cVar3.b(kVar.l).b), d) - j26);
            }
            lVar2 = lVar3;
            long j29 = j12;
            uVar2 = uVar;
            kVar.j.k(j26, j18, j13, list3, mVarArr);
            int c10 = kVar.j.c();
            SystemClock.elapsedRealtime();
            l2.i b11 = kVar.b(c10);
            long j30 = b11.e;
            long j31 = b11.f;
            l2.h hVar3 = b11.d;
            m2.b bVar2 = b11.c;
            e eVar = b11.a;
            m2.m mVar = b11.b;
            if (eVar != null) {
                m2.j jVar3 = eVar.s == null ? mVar.h : null;
                if (hVar3 == null) {
                    list4 = list3;
                    jVar2 = mVar.d();
                } else {
                    list4 = list3;
                    jVar2 = null;
                }
                if (jVar3 != null || jVar2 != null) {
                    g2.h hVar4 = kVar.e;
                    x m10 = kVar.j.m();
                    int n10 = kVar.j.n();
                    Object q5 = kVar.j.q();
                    if (jVar3 != null) {
                        m2.j a2 = jVar3.a(jVar2, bVar2.a);
                        if (a2 != null) {
                            jVar3 = a2;
                        }
                    } else {
                        jVar2.getClass();
                        jVar3 = jVar2;
                    }
                    uVar2.c = new k(hVar4, vd.a(mVar, bVar2.a, jVar3, 0), m10, n10, q5, b11.a);
                    z13 = uVar2.b;
                    f fVar = (f) uVar2.c;
                    uVar2.c = null;
                    uVar2.b = false;
                    if (z13) {
                        this.I = j11;
                        this.P = true;
                        return true;
                    }
                    if (fVar == null) {
                        return false;
                    }
                    this.F = fVar;
                    boolean z14 = fVar instanceof a;
                    m4.c cVar4 = this.E;
                    if (z14) {
                        a aVar2 = (a) fVar;
                        if (z10) {
                            long j32 = aVar2.h;
                            long j33 = this.I;
                            if (j32 < j33) {
                                this.x.t = j33;
                                for (c1 c1Var : this.y) {
                                    c1Var.t = this.I;
                                }
                                this.N = this.M;
                            }
                            this.M = false;
                            this.I = -9223372036854775807L;
                        }
                        aVar2.x = cVar4;
                        c1[] c1VarArr = (c1[]) cVar4.c;
                        int[] iArr = new int[c1VarArr.length];
                        for (int i12 = 0; i12 < c1VarArr.length; i12++) {
                            c1 c1Var2 = c1VarArr[i12];
                            iArr[i12] = c1Var2.q + c1Var2.p;
                        }
                        aVar2.y = iArr;
                        this.v.add(aVar2);
                    } else if (fVar instanceof k) {
                        ((k) fVar).v = cVar4;
                    }
                    lVar2.f(fVar, this, this.n.B0(fVar.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            m2.c cVar5 = kVar.k;
            boolean z15 = cVar5.d && kVar.l == cVar5.m.size() + (-1);
            boolean z16 = (z15 && j30 == -9223372036854775807L) ? false : true;
            if (b11.c() == j29) {
                uVar2.b = z16;
            } else {
                hVar3.getClass();
                boolean z17 = z16;
                long g10 = hVar3.g(j30, S2) + j31;
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
                    hVar3.getClass();
                    j14 = b12;
                    j15 = n0.j(hVar3.t(j10, j30) + j31, g10, j14);
                }
                long j34 = j15;
                if (j34 < g10) {
                    kVar.m = new u2.b();
                } else {
                    if (j34 <= j14) {
                        long j35 = j10;
                        if (!kVar.n || j34 < j14) {
                            if (!z11 || b11.e(j34) < j30) {
                                int min = (int) Math.min(kVar.g, (j14 - j34) + 1);
                                int i13 = (j30 > (-9223372036854775807L) ? 1 : (j30 == (-9223372036854775807L) ? 0 : -1));
                                if (i13 != 0) {
                                    while (min > 1 && b11.e((min + j34) - 1) >= j30) {
                                        min--;
                                    }
                                }
                                long j36 = list4.isEmpty() ? j35 : -9223372036854775807L;
                                g2.h hVar5 = kVar.e;
                                int i14 = kVar.d;
                                x m11 = kVar.j.m();
                                int n11 = kVar.j.n();
                                Object q9 = kVar.j.q();
                                long e = b11.e(j34);
                                hVar3.getClass();
                                m2.j l4 = hVar3.l(j34 - j31);
                                if (eVar == null) {
                                    jVar = new n(hVar5, vd.a(mVar, bVar2.a, l4, b11.f(j34, j27) ? 0 : 8), m11, n11, q9, e, b11.d(j34), j34, i14, m11);
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
                                        hVar3.getClass();
                                        m2.j a10 = l4.a(hVar3.l((j34 + i15) - j31), bVar2.a);
                                        if (a10 == null) {
                                            break;
                                        }
                                        i16++;
                                        i15++;
                                        i13 = i10;
                                        l4 = a10;
                                        min = i17;
                                    }
                                    long j37 = (j34 + i16) - 1;
                                    long d11 = b11.d(j37);
                                    long j38 = (i10 == 0 || j30 > d11) ? -9223372036854775807L : j30;
                                    g2.m a11 = vd.a(mVar, bVar2.a, l4, b11.f(j37, j27) ? 0 : 8);
                                    long j39 = -mVar.c;
                                    if (b2.w0.k(m11.s)) {
                                        j39 += e;
                                    }
                                    jVar = new j(hVar5, a11, m11, n11, q9, e, d11, j36, j38, j34, i16, j39, b11.a);
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
            f fVar2 = (f) uVar2.c;
            uVar2.c = null;
            uVar2.b = false;
            if (z13) {
            }
        }
        lVar2 = lVar3;
        uVar2 = uVar;
        z13 = uVar2.b;
        f fVar22 = (f) uVar2.c;
        uVar2.c = null;
        uVar2.b = false;
        if (z13) {
        }
    }

    public final a n(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        n0.X(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.x.o(aVar.d(0));
        while (true) {
            c1[] c1VarArr = this.y;
            if (i11 >= c1VarArr.length) {
                return aVar;
            }
            c1 c1Var = c1VarArr[i11];
            i11++;
            c1Var.o(aVar.d(i11));
        }
    }

    @Override // u2.f1
    public final long q() {
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.I;
        }
        long j10 = this.J;
        a t10 = t();
        if (!t10.c()) {
            ArrayList arrayList = this.v;
            t10 = arrayList.size() > 1 ? (a) ic.a.g(2, arrayList) : null;
        }
        if (t10 != null) {
            j10 = Math.max(j10, t10.n);
        }
        return Math.max(j10, this.x.s());
    }

    @Override // u2.f1
    public final void s(long j10) {
        y2.l lVar = this.r;
        if (lVar.b() || v()) {
            return;
        }
        boolean c10 = lVar.c();
        List list = this.w;
        l2.k kVar = this.e;
        ArrayList arrayList = this.v;
        if (c10) {
            f fVar = this.F;
            fVar.getClass();
            boolean z10 = fVar instanceof a;
            if (z10 && u(arrayList.size() - 1)) {
                return;
            }
            if (kVar.m == null ? kVar.j.d(j10, fVar, list) : false) {
                lVar.a();
                if (z10) {
                    this.L = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (kVar.m != null || kVar.j.length() < 2) ? list.size() : kVar.j.i(j10, list);
        if (size < arrayList.size()) {
            yb.p(!lVar.c());
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
            if (size != -1) {
                long j11 = t().n;
                a n10 = n(size);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
                this.P = false;
                this.h.C(this.a, n10.h, j11);
            }
        }
        if (this.x.z()) {
            this.P = true;
        }
    }

    public final a t() {
        return (a) ic.a.g(1, this.v);
    }

    public final boolean u(int i10) {
        int v;
        a aVar = (a) this.v.get(i10);
        if (this.x.v() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c1[] c1VarArr = this.y;
            if (i11 >= c1VarArr.length) {
                return false;
            }
            v = c1VarArr[i11].v();
            i11++;
        } while (v <= aVar.d(i11));
        return true;
    }

    public final boolean v() {
        return this.I != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028f  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        s sVar;
        ArrayList arrayList;
        u2.u uVar;
        boolean z13;
        boolean z14;
        long j12;
        boolean z15;
        k4.d dVar;
        boolean a2;
        f fVar = (f) iVar;
        b0 b0Var = fVar.r;
        x xVar = fVar.d;
        long j13 = fVar.h;
        long j14 = b0Var.b;
        boolean z16 = fVar instanceof a;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        if (j14 != 0 && z16 && u(size)) {
            z10 = false;
            z11 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        g2.m mVar = fVar.b;
        b0 b0Var2 = fVar.r;
        u2.u uVar2 = new u2.u(mVar, b0Var2.c, b0Var2.d, j10, j11, j14);
        n0.h0(j13);
        n0.h0(fVar.n);
        z zVar = new z(iOException, i10, 17);
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.i;
        ti.e eVar = kVar.b;
        s sVar2 = this.n;
        if (z10) {
            z12 = z16;
            l2.n nVar = kVar.h;
            if (nVar != null) {
                long j15 = nVar.d;
                boolean z17 = j15 != -9223372036854775807L && j15 < j13;
                o oVar = nVar.e;
                if (oVar.f.d) {
                    if (!oVar.n) {
                        if (z17) {
                            if (oVar.h) {
                                oVar.n = true;
                                oVar.h = false;
                                l2.g gVar = (l2.g) oVar.b.b;
                                gVar.D.removeCallbacks(gVar.w);
                                gVar.C();
                            }
                        }
                    }
                    sVar = sVar2;
                    arrayList = arrayList2;
                    z13 = z10;
                    uVar = uVar2;
                    z14 = true;
                    z15 = true;
                    if (z15) {
                        if (z13) {
                            if (z12) {
                                yb.p(n(size) == fVar ? z14 : false);
                                if (arrayList.isEmpty()) {
                                    this.I = this.J;
                                }
                            }
                            dVar = y2.l.e;
                            if (dVar == null) {
                                sVar.getClass();
                                long H0 = s.H0(zVar);
                                dVar = H0 != -9223372036854775807L ? new k4.d(0, H0, false) : y2.l.f;
                            }
                            k4.d dVar2 = dVar;
                            a2 = dVar2.a();
                            this.h.r(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
                            if (!a2) {
                                this.F = null;
                                sVar.getClass();
                                this.f.u(this);
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
            if (!kVar.k.d && (fVar instanceof l) && (iOException instanceof g2.x) && ((g2.x) iOException).c == 404) {
                l2.i iVar2 = iVarArr[kVar.j.s(xVar)];
                long c10 = iVar2.c();
                if (c10 != -1 && c10 != 0) {
                    l2.h hVar = iVar2.d;
                    hVar.getClass();
                    if (((l) fVar).a() > ((hVar.R() + iVar2.f) + c10) - 1) {
                        kVar.n = true;
                        sVar = sVar2;
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
            l2.i iVar3 = iVarArr[kVar.j.s(xVar)];
            m2.m mVar2 = iVar3.b;
            m2.b bVar = iVar3.c;
            m2.b t10 = eVar.t(mVar2.b);
            if (t10 == null || bVar.equals(t10)) {
                q qVar = kVar.j;
                i0 i0Var = iVar3.b.b;
                boolean z18 = z10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                sVar = sVar2;
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
                for (int i13 = 0; i13 < i0Var.size(); i13++) {
                    hashSet.add(Integer.valueOf(((m2.b) i0Var.get(i13)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList b10 = eVar.b(i0Var);
                z13 = z18;
                for (int i14 = 0; i14 < b10.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((m2.b) b10.get(i14)).c));
                }
                y yVar = new y(size2, size2 - hashSet2.size(), length, i11);
                if (yVar.a(2) || yVar.a(1)) {
                    sVar.getClass();
                    k4.d z02 = s.z0(yVar, zVar);
                    if (z02 != null) {
                        long j16 = z02.b;
                        int i15 = z02.a;
                        if (yVar.a(i15)) {
                            if (i15 == 2) {
                                q qVar2 = kVar.j;
                                z15 = qVar2.o(qVar2.s(xVar), j16);
                                z14 = true;
                            } else {
                                z14 = true;
                                if (i15 == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j16;
                                    String str = bVar.b;
                                    HashMap hashMap = (HashMap) eVar.b;
                                    if (hashMap.containsKey(str)) {
                                        Long l4 = (Long) hashMap.get(str);
                                        String str2 = n0.a;
                                        j12 = Math.max(elapsedRealtime2, l4.longValue());
                                    } else {
                                        j12 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j12));
                                    int i16 = bVar.c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i16);
                                        HashMap hashMap2 = (HashMap) eVar.c;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l10 = (Long) hashMap2.get(valueOf);
                                            String str3 = n0.a;
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
            sVar = sVar2;
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
        sVar = sVar2;
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

    public final boolean x() {
        return ((!this.M && !this.N) || this.P || this.r.b()) ? false : true;
    }

    public final void y() {
        int A = A(this.x.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 > A) {
                return;
            }
            this.K = i10 + 1;
            a aVar = (a) this.v.get(i10);
            x xVar = aVar.d;
            if (!xVar.equals(this.G)) {
                this.h.l(this.a, xVar, aVar.e, aVar.f, aVar.h);
            }
            this.G = xVar;
        }
    }

    @Override // y2.g
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.a;
            uVar = new u2.u(fVar.b, j10);
        } else {
            long j13 = fVar.a;
            g2.m mVar = fVar.b;
            b0 b0Var = fVar.r;
            uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        this.h.u(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i10);
    }
}
