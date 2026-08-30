package q4;

import android.net.Uri;
import android.os.SystemClock;
import b4.e0;
import c2.u;
import g5.g0;
import g5.h0;
import g5.j0;
import g5.k0;
import g5.m0;
import g5.q;
import g5.u0;
import h5.d0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k7.x6;
import kh.a2;
import n7.qa;
import o3.o;
import o4.l0;
import o4.n0;
import o4.r;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.yh;
import p2.w;
import r3.s;
import r4.n;
import s8.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h implements l0, n0, h0, k0 {
    public final qa B;
    public e C;
    public j3.n0 D;
    public g E;
    public long F;
    public long G;
    public int H;
    public a I;
    public boolean J;
    public final int a;
    public final int[] b;
    public final j3.n0[] c;
    public final boolean[] d;
    public final r4.k e;
    public final r4.b f;
    public final e0 h;
    public final ab.a n;
    public final m0 r = new m0("ChunkSampleStream");
    public final u s = new u(6);
    public final ArrayList v;
    public final List w;
    public final o4.k0 x;
    public final o4.k0[] y;

    public h(int i10, int[] iArr, j3.n0[] n0VarArr, r4.k kVar, r4.b bVar, q qVar, long j10, o oVar, o3.l lVar, ab.a aVar, e0 e0Var) {
        this.a = i10;
        this.b = iArr;
        this.c = n0VarArr;
        this.e = kVar;
        this.f = bVar;
        this.h = e0Var;
        this.n = aVar;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new o4.k0[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        o4.k0[] k0VarArr = new o4.k0[i11];
        oVar.getClass();
        o4.k0 k0Var = new o4.k0(qVar, oVar, lVar);
        this.x = k0Var;
        int i12 = 0;
        iArr2[0] = i10;
        k0VarArr[0] = k0Var;
        while (i12 < length) {
            o4.k0 k0Var2 = new o4.k0(qVar, null, null);
            this.y[i12] = k0Var2;
            int i13 = i12 + 1;
            k0VarArr[i13] = k0Var2;
            iArr2[i13] = this.b[i12];
            i12 = i13;
        }
        this.B = new qa(iArr2, k0VarArr, false, 28);
        this.F = j10;
        this.G = j10;
    }

    @Override // g5.h0
    public final void A(j0 j0Var, long j10, long j11) {
        e eVar = (e) j0Var;
        this.C = null;
        boolean z4 = eVar instanceof j;
        r4.k kVar = this.e;
        if (z4) {
            int n10 = kVar.i.n(((j) eVar).d);
            r4.i[] iVarArr = kVar.h;
            r4.i iVar = iVarArr[n10];
            if (iVar.d == null) {
                d dVar = iVar.a;
                s sVar = dVar.n;
                r3.f fVar = sVar instanceof r3.f ? (r3.f) sVar : null;
                if (fVar != null) {
                    s4.m mVar = iVar.b;
                    iVarArr[n10] = new r4.i(iVar.e, mVar, iVar.c, dVar, iVar.f, new f2.c(fVar, mVar.c, 7));
                }
            }
        }
        n nVar = kVar.g;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || eVar.n > j12) {
                nVar.d = eVar.n;
            }
            nVar.e.h = true;
        }
        long j13 = eVar.a;
        Uri uri = eVar.r.c;
        o4.j jVar = new o4.j();
        this.n.getClass();
        this.h.n(jVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        this.f.Z(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (r9 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f9  */
    @Override // o4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(long j10) {
        long j11;
        List list;
        u uVar;
        long j12;
        List list2;
        List list3;
        k kVar;
        boolean z4;
        long j13;
        m0 m0Var;
        u uVar2;
        long j14;
        long j15;
        r4.h hVar;
        d dVar;
        List list4;
        long j16;
        long i10;
        Object iVar;
        s4.j jVar;
        boolean z10;
        boolean z11;
        if (this.J) {
            return false;
        }
        m0 m0Var2 = this.r;
        if (m0Var2.d() || m0Var2.c()) {
            return false;
        }
        boolean k10 = k();
        if (k10) {
            list = Collections.EMPTY_LIST;
            j11 = this.F;
        } else {
            j11 = i().n;
            list = this.w;
        }
        List list5 = list;
        r4.k kVar2 = this.e;
        r4.i[] iVarArr = kVar2.h;
        o4.b bVar = kVar2.l;
        u uVar3 = this.s;
        if (bVar != null) {
            uVar = uVar3;
            j12 = -9223372036854775807L;
        } else {
            long j17 = j11 - j10;
            uVar = uVar3;
            j12 = -9223372036854775807L;
            long G = d0.G(kVar2.j.b(kVar2.k).b) + d0.G(kVar2.j.a) + j11;
            n nVar = kVar2.g;
            if (nVar != null) {
                r4.o oVar = nVar.e;
                s4.c cVar = oVar.f;
                f1 f1Var = oVar.b;
                if (!cVar.d) {
                    list2 = list5;
                    z10 = false;
                } else if (oVar.n) {
                    list2 = list5;
                    z10 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = oVar.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= G) {
                        z10 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        r4.g gVar = (r4.g) f1Var.b;
                        long j18 = gVar.O;
                        if (j18 == -9223372036854775807L || j18 < longValue) {
                            gVar.O = longValue;
                        }
                        z10 = true;
                    }
                    if (z10 && oVar.h) {
                        oVar.n = true;
                        oVar.h = false;
                        r4.g gVar2 = (r4.g) f1Var.b;
                        gVar2.E.removeCallbacks(gVar2.x);
                        gVar2.v();
                    }
                }
            } else {
                list2 = list5;
            }
            long G2 = d0.G(d0.u(kVar2.f));
            s4.c cVar2 = kVar2.j;
            long j19 = cVar2.a;
            long G3 = j19 == -9223372036854775807L ? -9223372036854775807L : G2 - d0.G(j19 + cVar2.b(kVar2.k).b);
            if (list2.isEmpty()) {
                list3 = list2;
                kVar = null;
            } else {
                list3 = list2;
                kVar = (k) yh.k(1, list3);
            }
            int p10 = kVar2.i.p();
            long j20 = j17;
            l[] lVarArr = new l[p10];
            int i11 = 0;
            while (i11 < p10) {
                k kVar3 = kVar;
                r4.i iVar2 = iVarArr[i11];
                boolean z12 = k10;
                r4.h hVar2 = iVar2.d;
                int i12 = p10;
                long j21 = j20;
                long j22 = iVar2.f;
                long j23 = iVar2.e;
                db.a aVar = l.z;
                if (hVar2 == null) {
                    lVarArr[i11] = aVar;
                } else {
                    long j24 = hVar2.j(j23, G2) + j22;
                    long b10 = iVar2.b(G2);
                    long b11 = kVar3 != null ? kVar3.b() : d0.i(iVar2.d.q(j11, j23) + j22, j24, b10);
                    if (b11 < j24) {
                        lVarArr[i11] = aVar;
                    } else {
                        lVarArr[i11] = new r4.j(kVar2.b(i11), b11, b10);
                    }
                }
                i11++;
                kVar = kVar3;
                k10 = z12;
                p10 = i12;
                j20 = j21;
            }
            k kVar4 = kVar;
            z4 = k10;
            long j25 = j20;
            long j26 = 0;
            if (kVar2.j.d) {
                r4.i iVar3 = iVarArr[0];
                if (iVar3.d.U(iVar3.e) != 0) {
                    long c3 = iVarArr[0].c(iVarArr[0].b(G2));
                    s4.c cVar3 = kVar2.j;
                    long j27 = cVar3.a;
                    j26 = 0;
                    j13 = Math.max(0L, Math.min(j27 == -9223372036854775807L ? -9223372036854775807L : G2 - d0.G(j27 + cVar3.b(kVar2.k).b), c3) - j10);
                    m0Var = m0Var2;
                    uVar2 = uVar;
                    j14 = j26;
                    kVar2.i.v(j10, j25, j13, list3, lVarArr);
                    r4.i b12 = kVar2.b(kVar2.i.h());
                    long j28 = b12.f;
                    j15 = b12.e;
                    hVar = b12.d;
                    s4.b bVar2 = b12.c;
                    dVar = b12.a;
                    s4.m mVar = b12.b;
                    if (dVar == null) {
                        s4.j jVar2 = dVar.r == null ? mVar.h : null;
                        if (hVar == null) {
                            list4 = list3;
                            jVar = mVar.d();
                        } else {
                            list4 = list3;
                            jVar = null;
                        }
                        if (jVar2 != null || jVar != null) {
                            g5.m mVar2 = kVar2.e;
                            j3.n0 g10 = kVar2.i.g();
                            int k11 = kVar2.i.k();
                            Object j29 = kVar2.i.j();
                            if (jVar2 != null) {
                                s4.j a2 = jVar2.a(jVar, bVar2.a);
                                if (a2 != null) {
                                    jVar2 = a2;
                                }
                            } else {
                                jVar2 = jVar;
                            }
                            uVar2.c = new j(mVar2, x6.a(mVar, bVar2.a, jVar2, 0), g10, k11, j29, b12.a);
                            z11 = uVar2.b;
                            e eVar = (e) uVar2.c;
                            uVar2.c = null;
                            uVar2.b = false;
                            if (!z11) {
                                this.F = j12;
                                this.J = true;
                                return true;
                            }
                            if (eVar == null) {
                                return false;
                            }
                            this.C = eVar;
                            boolean z13 = eVar instanceof a;
                            qa qaVar = this.B;
                            if (z13) {
                                a aVar2 = (a) eVar;
                                if (z4) {
                                    long j30 = aVar2.h;
                                    long j31 = this.F;
                                    if (j30 != j31) {
                                        this.x.t = j31;
                                        for (o4.k0 k0Var : this.y) {
                                            k0Var.t = this.F;
                                        }
                                    }
                                    this.F = -9223372036854775807L;
                                }
                                aVar2.x = qaVar;
                                o4.k0[] k0VarArr = (o4.k0[]) qaVar.c;
                                int[] iArr = new int[k0VarArr.length];
                                for (int i13 = 0; i13 < k0VarArr.length; i13++) {
                                    o4.k0 k0Var2 = k0VarArr[i13];
                                    iArr[i13] = k0Var2.q + k0Var2.p;
                                }
                                aVar2.y = iArr;
                                this.v.add(aVar2);
                            } else if (eVar instanceof j) {
                                ((j) eVar).v = qaVar;
                            }
                            m0Var.f(eVar, this, this.n.n3(eVar.c));
                            this.h.t(new o4.j(eVar.b), eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
                            return true;
                        }
                    } else {
                        list4 = list3;
                    }
                    s4.c cVar4 = kVar2.j;
                    boolean z14 = !cVar4.d && kVar2.k == cVar4.m.size() + (-1);
                    boolean z15 = z14 || j15 != -9223372036854775807L;
                    if (hVar.U(j15) != j14) {
                        uVar2.b = z15;
                    } else {
                        long j32 = hVar.j(j15, G2) + j28;
                        long b13 = b12.b(G2);
                        if (z14) {
                            long c10 = b12.c(b13);
                            z15 &= (c10 - b12.d(b13)) + c10 >= j15;
                        }
                        if (kVar4 != null) {
                            i10 = kVar4.b();
                            j16 = b13;
                        } else {
                            j16 = b13;
                            i10 = d0.i(hVar.q(j11, j15) + j28, j32, j16);
                        }
                        long j33 = i10;
                        if (j33 < j32) {
                            kVar2.l = new o4.b();
                        } else {
                            if (j33 <= j16) {
                                long j34 = j11;
                                if (!kVar2.m || j33 < j16) {
                                    if (!z15 || b12.d(j33) < j15) {
                                        int min = (int) Math.min(1, (j16 - j33) + 1);
                                        if (j15 != -9223372036854775807L) {
                                            while (min > 1 && b12.d((min + j33) - 1) >= j15) {
                                                min--;
                                            }
                                        }
                                        long j35 = list4.isEmpty() ? j34 : -9223372036854775807L;
                                        g5.m mVar3 = kVar2.e;
                                        int i14 = kVar2.d;
                                        j3.n0 g11 = kVar2.i.g();
                                        int k12 = kVar2.i.k();
                                        Object j36 = kVar2.i.j();
                                        long d = b12.d(j33);
                                        s4.j l10 = hVar.l(j33 - j28);
                                        if (dVar == null) {
                                            iVar = new m(mVar3, x6.a(mVar, bVar2.a, l10, hVar.w() || (G3 > (-9223372036854775807L) ? 1 : (G3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b12.c(j33) > G3 ? 1 : (b12.c(j33) == G3 ? 0 : -1)) <= 0 ? 0 : 8), g11, k12, j36, d, b12.c(j33), j33, i14, g11);
                                        } else {
                                            int i15 = 1;
                                            int i16 = 1;
                                            while (i15 < min) {
                                                s4.j a10 = l10.a(hVar.l((j33 + i15) - j28), bVar2.a);
                                                if (a10 == null) {
                                                    break;
                                                }
                                                i16++;
                                                i15++;
                                                l10 = a10;
                                            }
                                            long j37 = (j33 + i16) - 1;
                                            long c11 = b12.c(j37);
                                            iVar = new i(mVar3, x6.a(mVar, bVar2.a, l10, hVar.w() || (G3 > (-9223372036854775807L) ? 1 : (G3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b12.c(j37) > G3 ? 1 : (b12.c(j37) == G3 ? 0 : -1)) <= 0 ? 0 : 8), g11, k12, j36, d, c11, j35, (j15 == -9223372036854775807L || j15 > c11) ? -9223372036854775807L : j15, j33, i16, -mVar.c, b12.a);
                                        }
                                        uVar2.c = iVar;
                                    } else {
                                        uVar2.b = true;
                                    }
                                }
                            }
                            uVar2.b = z15;
                        }
                    }
                    z11 = uVar2.b;
                    e eVar2 = (e) uVar2.c;
                    uVar2.c = null;
                    uVar2.b = false;
                    if (!z11) {
                    }
                }
            }
            j13 = -9223372036854775807L;
            m0Var = m0Var2;
            uVar2 = uVar;
            j14 = j26;
            kVar2.i.v(j10, j25, j13, list3, lVarArr);
            r4.i b122 = kVar2.b(kVar2.i.h());
            long j282 = b122.f;
            j15 = b122.e;
            hVar = b122.d;
            s4.b bVar22 = b122.c;
            dVar = b122.a;
            s4.m mVar4 = b122.b;
            if (dVar == null) {
            }
            s4.c cVar42 = kVar2.j;
            if (cVar42.d) {
            }
            if (z14) {
            }
            if (hVar.U(j15) != j14) {
            }
            z11 = uVar2.b;
            e eVar22 = (e) uVar2.c;
            uVar2.c = null;
            uVar2.b = false;
            if (!z11) {
            }
        }
        u uVar4 = uVar;
        m0Var = m0Var2;
        uVar2 = uVar4;
        z4 = k10;
        z11 = uVar2.b;
        e eVar222 = (e) uVar2.c;
        uVar2.c = null;
        uVar2.b = false;
        if (!z11) {
        }
    }

    @Override // o4.n0
    public final long X() {
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.F;
        }
        long j10 = this.G;
        a i10 = i();
        if (!i10.c()) {
            ArrayList arrayList = this.v;
            i10 = arrayList.size() > 1 ? (a) a2.i(2, arrayList) : null;
        }
        if (i10 != null) {
            j10 = Math.max(j10, i10.n);
        }
        return Math.max(j10, this.x.n());
    }

    @Override // o4.l0
    public final void a() {
        m0 m0Var = this.r;
        m0Var.a();
        this.x.w();
        if (m0Var.d()) {
            return;
        }
        r4.k kVar = this.e;
        o4.b bVar = kVar.l;
        if (bVar != null) {
            throw bVar;
        }
        kVar.a.a();
    }

    @Override // o4.n0
    public final boolean b() {
        return this.r.d();
    }

    @Override // g5.k0
    public final void c() {
        o4.k0 k0Var = this.x;
        k0Var.A(true);
        o3.i iVar = k0Var.h;
        if (iVar != null) {
            iVar.c(k0Var.e);
            k0Var.h = null;
            k0Var.g = null;
        }
        for (o4.k0 k0Var2 : this.y) {
            k0Var2.A(true);
            o3.i iVar2 = k0Var2.h;
            if (iVar2 != null) {
                iVar2.c(k0Var2.e);
                k0Var2.h = null;
                k0Var2.g = null;
            }
        }
        for (r4.i iVar3 : this.e.h) {
            d dVar = iVar3.a;
            if (dVar != null) {
                dVar.a.release();
            }
        }
        g gVar = this.E;
        if (gVar != null) {
            r4.b bVar = (r4.b) gVar;
            synchronized (bVar) {
                n nVar = (n) bVar.y.remove(this);
                if (nVar != null) {
                    o4.k0 k0Var3 = nVar.a;
                    k0Var3.A(true);
                    o3.i iVar4 = k0Var3.h;
                    if (iVar4 != null) {
                        iVar4.c(k0Var3.e);
                        k0Var3.h = null;
                        k0Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // o4.l0
    public final boolean d() {
        return !k() && this.x.u(this.J);
    }

    @Override // o4.l0
    public final int e(long j10) {
        if (k()) {
            return 0;
        }
        boolean z4 = this.J;
        o4.k0 k0Var = this.x;
        int s6 = k0Var.s(j10, z4);
        a aVar = this.I;
        if (aVar != null) {
            s6 = Math.min(s6, aVar.d(0) - k0Var.q());
        }
        k0Var.E(s6);
        n();
        return s6;
    }

    @Override // o4.l0
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        if (k()) {
            return -3;
        }
        a aVar = this.I;
        o4.k0 k0Var = this.x;
        if (aVar != null && aVar.d(0) <= k0Var.q()) {
            return -3;
        }
        n();
        return k0Var.z(bVar, iVar, i10, this.J);
    }

    @Override // o4.n0
    public final void f0(long j10) {
        m0 m0Var = this.r;
        if (m0Var.c() || k()) {
            return;
        }
        boolean d = m0Var.d();
        List list = this.w;
        r4.k kVar = this.e;
        ArrayList arrayList = this.v;
        if (d) {
            e eVar = this.C;
            eVar.getClass();
            boolean z4 = eVar instanceof a;
            if (z4 && j(arrayList.size() - 1)) {
                return;
            }
            if (kVar.l == null ? kVar.i.u(j10, eVar, list) : false) {
                m0Var.b();
                if (z4) {
                    this.I = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (kVar.l != null || kVar.i.p() < 2) ? list.size() : kVar.i.c(j10, list);
        if (size < arrayList.size()) {
            h5.a.i(!m0Var.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!j(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j11 = i().n;
            a g10 = g(size);
            if (arrayList.isEmpty()) {
                this.F = this.G;
            }
            this.J = false;
            this.h.A(new r(1, this.a, null, 3, null, d0.S(g10.h), d0.S(j11)));
        }
    }

    public final a g(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.L(i10, arrayList.size(), arrayList);
        this.H = Math.max(this.H, arrayList.size());
        int i11 = 0;
        this.x.k(aVar.d(0));
        while (true) {
            o4.k0[] k0VarArr = this.y;
            if (i11 >= k0VarArr.length) {
                return aVar;
            }
            o4.k0 k0Var = k0VarArr[i11];
            i11++;
            k0Var.k(aVar.d(i11));
        }
    }

    public final a i() {
        return (a) a2.i(1, this.v);
    }

    public final boolean j(int i10) {
        int q10;
        a aVar = (a) this.v.get(i10);
        if (this.x.q() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            o4.k0[] k0VarArr = this.y;
            if (i11 >= k0VarArr.length) {
                return false;
            }
            q10 = k0VarArr[i11].q();
            i11++;
        } while (q10 <= aVar.d(i11));
        return true;
    }

    public final boolean k() {
        return this.F != -9223372036854775807L;
    }

    @Override // o4.n0
    public final long l() {
        if (k()) {
            return this.F;
        }
        if (this.J) {
            return Long.MIN_VALUE;
        }
        return i().n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0283  */
    @Override // g5.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c4.e m(j0 j0Var, IOException iOException, int i10) {
        o4.j jVar;
        boolean z4;
        ArrayList arrayList;
        ab.a aVar;
        boolean z10;
        long j10;
        boolean d;
        c4.e eVar;
        boolean a2;
        e eVar2 = (e) j0Var;
        u0 u0Var = eVar2.r;
        j3.n0 n0Var = eVar2.d;
        long j11 = eVar2.h;
        long j12 = u0Var.b;
        boolean z11 = eVar2 instanceof a;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        boolean z12 = (j12 != 0 && z11 && j(size)) ? false : true;
        Uri uri = eVar2.r.c;
        o4.j jVar2 = new o4.j();
        d0.S(j11);
        d0.S(eVar2.n);
        w wVar = new w(iOException, i10, 4);
        r4.k kVar = this.e;
        r4.i[] iVarArr = kVar.h;
        com.google.firebase.messaging.r rVar = kVar.b;
        ab.a aVar2 = this.n;
        if (z12) {
            jVar = jVar2;
            n nVar = kVar.g;
            if (nVar != null) {
                long j13 = nVar.d;
                boolean z13 = j13 != -9223372036854775807L && j13 < j11;
                r4.o oVar = nVar.e;
                if (oVar.f.d) {
                    if (!oVar.n) {
                        if (z13) {
                            if (oVar.h) {
                                oVar.n = true;
                                oVar.h = false;
                                r4.g gVar = (r4.g) oVar.b.b;
                                gVar.E.removeCallbacks(gVar.x);
                                gVar.v();
                            }
                        }
                    }
                    z4 = z12;
                    z10 = z11;
                    arrayList = arrayList2;
                    aVar = aVar2;
                    d = true;
                    if (d) {
                        if (z4) {
                            if (z10) {
                                h5.a.i(g(size) == eVar2);
                                if (arrayList.isEmpty()) {
                                    this.F = this.G;
                                }
                            }
                            eVar = m0.e;
                            if (eVar == null) {
                                aVar.getClass();
                                long o32 = ab.a.o3(wVar);
                                eVar = o32 != -9223372036854775807L ? new c4.e(0, o32, false) : m0.f;
                            }
                            c4.e eVar3 = eVar;
                            a2 = eVar3.a();
                            this.h.q(jVar, eVar2.c, this.a, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a2);
                            if (!a2) {
                                this.C = null;
                                aVar.getClass();
                                this.f.Z(this);
                            }
                            return eVar3;
                        }
                        h5.a.K("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    eVar = null;
                    if (eVar == null) {
                    }
                    c4.e eVar32 = eVar;
                    a2 = eVar32.a();
                    this.h.q(jVar, eVar2.c, this.a, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a2);
                    if (!a2) {
                    }
                    return eVar32;
                }
            }
            if (!kVar.j.d && (eVar2 instanceof k) && (iOException instanceof g5.e0) && ((g5.e0) iOException).d == 404) {
                r4.i iVar = iVarArr[kVar.i.n(n0Var)];
                z4 = z12;
                long U = iVar.d.U(iVar.e);
                if (U != -1 && U != 0) {
                    if (((k) eVar2).b() > ((iVar.d.S() + iVar.f) + U) - 1) {
                        kVar.m = true;
                        z10 = z11;
                        arrayList = arrayList2;
                        aVar = aVar2;
                        d = true;
                        if (d) {
                        }
                        eVar = null;
                        if (eVar == null) {
                        }
                        c4.e eVar322 = eVar;
                        a2 = eVar322.a();
                        this.h.q(jVar, eVar2.c, this.a, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a2);
                        if (!a2) {
                        }
                        return eVar322;
                    }
                }
            } else {
                z4 = z12;
            }
            r4.i iVar2 = iVarArr[kVar.i.n(n0Var)];
            s4.m mVar = iVar2.b;
            s4.b bVar = iVar2.c;
            s4.b Q = rVar.Q(mVar.b);
            if (Q == null || bVar.equals(Q)) {
                f5.c cVar = kVar.i;
                v vVar = iVar2.b.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                int p10 = cVar.p();
                aVar = aVar2;
                int i11 = 0;
                for (int i12 = 0; i12 < p10; i12++) {
                    if (cVar.o(i12, elapsedRealtime)) {
                        i11++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i13 = 0; i13 < vVar.size(); i13++) {
                    hashSet.add(Integer.valueOf(((s4.b) vVar.get(i13)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList o10 = rVar.o(vVar);
                z10 = z11;
                for (int i14 = 0; i14 < o10.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((s4.b) o10.get(i14)).c));
                }
                g0 g0Var = new g0(size2, size2 - hashSet2.size(), p10, i11);
                if (g0Var.a(2) || g0Var.a(1)) {
                    aVar.getClass();
                    c4.e m32 = ab.a.m3(g0Var, wVar);
                    if (m32 != null) {
                        long j14 = m32.b;
                        int i15 = m32.a;
                        if (g0Var.a(i15)) {
                            if (i15 == 2) {
                                f5.c cVar2 = kVar.i;
                                d = cVar2.d(cVar2.n(n0Var), j14);
                                if (d) {
                                }
                                eVar = null;
                                if (eVar == null) {
                                }
                                c4.e eVar3222 = eVar;
                                a2 = eVar3222.a();
                                this.h.q(jVar, eVar2.c, this.a, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a2);
                                if (!a2) {
                                }
                                return eVar3222;
                            }
                            if (i15 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j14;
                                String str = bVar.b;
                                HashMap hashMap = (HashMap) rVar.b;
                                if (hashMap.containsKey(str)) {
                                    Long l10 = (Long) hashMap.get(str);
                                    int i16 = d0.a;
                                    j10 = Math.max(elapsedRealtime2, l10.longValue());
                                } else {
                                    j10 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j10));
                                int i17 = bVar.c;
                                if (i17 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i17);
                                    HashMap hashMap2 = (HashMap) rVar.c;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l11 = (Long) hashMap2.get(valueOf);
                                        int i18 = d0.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l11.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                d = true;
                                if (d) {
                                }
                                eVar = null;
                                if (eVar == null) {
                                }
                                c4.e eVar32222 = eVar;
                                a2 = eVar32222.a();
                                this.h.q(jVar, eVar2.c, this.a, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a2);
                                if (!a2) {
                                }
                                return eVar32222;
                            }
                            d = false;
                            if (d) {
                            }
                            eVar = null;
                            if (eVar == null) {
                            }
                            c4.e eVar322222 = eVar;
                            a2 = eVar322222.a();
                            this.h.q(jVar, eVar2.c, this.a, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a2);
                            if (!a2) {
                            }
                            return eVar322222;
                        }
                    }
                }
            }
            z10 = z11;
            arrayList = arrayList2;
            aVar = aVar2;
            d = true;
            if (d) {
            }
            eVar = null;
            if (eVar == null) {
            }
            c4.e eVar3222222 = eVar;
            a2 = eVar3222222.a();
            this.h.q(jVar, eVar2.c, this.a, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a2);
            if (!a2) {
            }
            return eVar3222222;
        }
        jVar = jVar2;
        z4 = z12;
        z10 = z11;
        arrayList = arrayList2;
        aVar = aVar2;
        d = false;
        if (d) {
        }
        eVar = null;
        if (eVar == null) {
        }
        c4.e eVar32222222 = eVar;
        a2 = eVar32222222.a();
        this.h.q(jVar, eVar2.c, this.a, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a2);
        if (!a2) {
        }
        return eVar32222222;
    }

    public final void n() {
        int o10 = o(this.x.q(), this.H - 1);
        while (true) {
            int i10 = this.H;
            if (i10 > o10) {
                return;
            }
            this.H = i10 + 1;
            a aVar = (a) this.v.get(i10);
            j3.n0 n0Var = aVar.d;
            if (!n0Var.equals(this.D)) {
                this.h.g(this.a, n0Var, aVar.e, aVar.f, aVar.h);
            }
            this.D = n0Var;
        }
    }

    public final int o(int i10, int i11) {
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

    public final void q(r4.b bVar) {
        this.E = bVar;
        o4.k0 k0Var = this.x;
        k0Var.i();
        o3.i iVar = k0Var.h;
        if (iVar != null) {
            iVar.c(k0Var.e);
            k0Var.h = null;
            k0Var.g = null;
        }
        for (o4.k0 k0Var2 : this.y) {
            k0Var2.i();
            o3.i iVar2 = k0Var2.h;
            if (iVar2 != null) {
                iVar2.c(k0Var2.e);
                k0Var2.h = null;
                k0Var2.g = null;
            }
        }
        this.r.e(this);
    }

    @Override // g5.h0
    public final void s(j0 j0Var, long j10, long j11, boolean z4) {
        e eVar = (e) j0Var;
        this.C = null;
        this.I = null;
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        o4.j jVar = new o4.j();
        this.n.getClass();
        this.h.l(jVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z4) {
            return;
        }
        if (k()) {
            this.x.A(false);
            for (o4.k0 k0Var : this.y) {
                k0Var.A(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.v;
            g(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.F = this.G;
            }
        }
        this.f.Z(this);
    }
}
