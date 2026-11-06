package y2;

import a8.ia;
import a8.ua;
import a8.wa;
import ab.b0;
import android.os.SystemClock;
import b3.o;
import c8.ba;
import e2.s0;
import e2.u;
import h2.m0;
import j$.util.DesugarCollections;
import j2.c0;
import j2.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l2.v0;
import o2.p;
import sg.i0;
import x2.b1;
import x2.c1;
import x2.e1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i implements c1, e1, b3.j, b3.m {
    public final b1[] D;
    public final i0 E;
    public f F;
    public u G;
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
    public final u[] c;
    public final boolean[] d;
    public final o2.l e;
    public final o2.b f;
    public final wa h;
    public final pb.b n;
    public final o r;
    public final ca.i s;
    public final ArrayList w;
    public final List x;
    public final b1 y;

    public i(int i7, int[] iArr, u[] uVarArr, o2.l lVar, o2.b bVar, h6.m mVar, long j3, q2.m mVar2, q2.j jVar, pb.b bVar2, wa waVar, boolean z9, long j10, c3.a aVar) {
        this.a = i7;
        this.b = iArr;
        this.c = uVarArr;
        this.e = lVar;
        this.f = bVar;
        this.h = waVar;
        this.n = bVar2;
        this.r = aVar != null ? new o(aVar) : new o("ChunkSampleStream");
        this.s = new ca.i(10);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.D = new b1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        b1[] b1VarArr = new b1[i10];
        mVar2.getClass();
        b1 b1Var = new b1(mVar, mVar2, jVar);
        this.y = b1Var;
        iArr2[0] = i7;
        b1VarArr[0] = b1Var;
        int i11 = 0;
        while (i11 < length) {
            b1 b1Var2 = new b1(mVar, null, null);
            this.D[i11] = b1Var2;
            int i12 = i11 + 1;
            b1VarArr[i12] = b1Var2;
            iArr2[i12] = this.b[i11];
            i11 = i12;
        }
        this.E = new i0(11, iArr2, b1VarArr);
        this.I = j3;
        this.J = j3;
        this.M = z9;
        if (!z9 || j10 == -9223372036854775807L) {
            return;
        }
        this.M = false;
        this.N = j10 < j3;
    }

    @Override // b3.j
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        f fVar = (f) lVar;
        if (i7 == 0) {
            long j11 = fVar.a;
            uVar = new x2.u(fVar.b, j3);
        } else {
            long j12 = fVar.a;
            j2.m mVar = fVar.b;
            c0 c0Var = fVar.r;
            uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        }
        this.h.t(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i7);
    }

    @Override // x2.c1
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
    @Override // x2.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(v0 v0Var) {
        long j3;
        List list;
        ca.i iVar;
        long j10;
        boolean z9;
        List list2;
        List list3;
        l lVar;
        long j11;
        long j12;
        o oVar;
        ca.i iVar2;
        List list4;
        boolean z10;
        long j13;
        long j14;
        int i7;
        Object jVar;
        p2.j jVar2;
        long j15;
        boolean z11;
        boolean z12;
        if (this.P) {
            return false;
        }
        o oVar2 = this.r;
        if (oVar2.d() || oVar2.c()) {
            return false;
        }
        boolean v = v();
        if (v) {
            list = Collections.EMPTY_LIST;
            j3 = this.I;
        } else {
            j3 = t().n;
            list = this.x;
        }
        List list5 = list;
        o2.l lVar2 = this.e;
        o2.j[] jVarArr = lVar2.i;
        x2.b bVar = lVar2.m;
        ca.i iVar3 = this.s;
        if (bVar != null) {
            z9 = v;
            iVar = iVar3;
            j10 = -9223372036854775807L;
        } else {
            iVar = iVar3;
            long j16 = v0Var.a;
            long j17 = j3 - j16;
            j10 = -9223372036854775807L;
            z9 = v;
            long S = m0.S(lVar2.k.b(lVar2.l).b) + m0.S(lVar2.k.a) + j3;
            o2.o oVar3 = lVar2.h;
            if (oVar3 != null) {
                p pVar = oVar3.e;
                p2.c cVar = pVar.f;
                o2.f fVar = pVar.b;
                if (!cVar.d) {
                    list2 = list5;
                    z11 = false;
                } else if (pVar.n) {
                    list2 = list5;
                    z11 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = pVar.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= S) {
                        z11 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        o2.h hVar = fVar.a;
                        long j18 = hVar.M;
                        if (j18 == -9223372036854775807L || j18 < longValue) {
                            hVar.M = longValue;
                        }
                        z11 = true;
                    }
                    if (z11 && pVar.h) {
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
            long S2 = m0.S(m0.C(lVar2.f));
            p2.c cVar2 = lVar2.k;
            long j19 = cVar2.a;
            long S3 = j19 == -9223372036854775807L ? -9223372036854775807L : S2 - m0.S(j19 + cVar2.b(lVar2.l).b);
            if (list2.isEmpty()) {
                list3 = list2;
                lVar = null;
            } else {
                list3 = list2;
                lVar = (l) rf.b.g(1, list3);
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
                pb.b bVar2 = m.C;
                if (iVar4 == null) {
                    mVarArr[i10] = bVar2;
                } else {
                    iVar4.getClass();
                    long e10 = iVar4.e(j23, S2) + j22;
                    long b10 = jVar3.b(S2);
                    if (lVar != null) {
                        j15 = lVar.b();
                    } else {
                        o2.i iVar5 = jVar3.d;
                        iVar5.getClass();
                        j15 = m0.j(iVar5.o(j3, j23) + j22, e10, b10);
                    }
                    long j24 = j15;
                    if (j24 < e10) {
                        mVarArr[i10] = bVar2;
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
                j12 = Math.max(0L, Math.min(j27 == -9223372036854775807L ? -9223372036854775807L : S2 - m0.S(j27 + cVar3.b(lVar2.l).b), d) - j25);
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
            p2.b bVar3 = b11.c;
            e eVar = b11.a;
            p2.m mVar = b11.b;
            if (eVar != null) {
                p2.j jVar4 = eVar.s == null ? mVar.h : null;
                if (iVar6 == null) {
                    list4 = list3;
                    jVar2 = mVar.f();
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
                        p2.j a10 = jVar4.a(jVar2, bVar3.a);
                        if (a10 != null) {
                            jVar4 = a10;
                        }
                    } else {
                        jVar2.getClass();
                        jVar4 = jVar2;
                    }
                    iVar2.c = new k(hVar3, ba.a(mVar, bVar3.a, jVar4, 0), n10, o4, r10, b11.a);
                    z12 = iVar2.b;
                    f fVar2 = (f) iVar2.c;
                    iVar2.c = null;
                    iVar2.b = false;
                    if (z12) {
                        this.I = j10;
                        this.P = true;
                        return true;
                    }
                    if (fVar2 == null) {
                        return false;
                    }
                    this.F = fVar2;
                    boolean z13 = fVar2 instanceof a;
                    i0 i0Var = this.E;
                    if (z13) {
                        a aVar = (a) fVar2;
                        if (z9) {
                            long j31 = aVar.h;
                            long j32 = this.I;
                            if (j31 < j32) {
                                this.y.t = j32;
                                for (b1 b1Var : this.D) {
                                    b1Var.t = this.I;
                                }
                                this.N = this.M;
                            }
                            this.M = false;
                            this.I = -9223372036854775807L;
                        }
                        aVar.y = i0Var;
                        b1[] b1VarArr = (b1[]) i0Var.c;
                        int[] iArr = new int[b1VarArr.length];
                        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
                            b1 b1Var2 = b1VarArr[i11];
                            iArr[i11] = b1Var2.q + b1Var2.p;
                        }
                        aVar.D = iArr;
                        this.w.add(aVar);
                    } else if (fVar2 instanceof k) {
                        ((k) fVar2).w = i0Var;
                    }
                    oVar.f(fVar2, this, this.n.X0(fVar2.c));
                    return true;
                }
            } else {
                list4 = list3;
            }
            p2.c cVar4 = lVar2.k;
            boolean z14 = cVar4.d && lVar2.l == cVar4.m.size() + (-1);
            boolean z15 = (z14 && j29 == -9223372036854775807L) ? false : true;
            if (b11.c() == j28) {
                iVar2.b = z15;
            } else {
                iVar6.getClass();
                boolean z16 = z15;
                long e11 = iVar6.e(j29, S2) + j30;
                long b12 = b11.b(S2);
                if (z14) {
                    long d10 = b11.d(b12);
                    z10 = z16 & ((d10 - b11.e(b12)) + d10 >= j29);
                } else {
                    z10 = z16;
                }
                if (lVar != null) {
                    j14 = lVar.b();
                    j13 = b12;
                } else {
                    iVar6.getClass();
                    j13 = b12;
                    j14 = m0.j(iVar6.o(j3, j29) + j30, e11, j13);
                }
                long j33 = j14;
                if (j33 < e11) {
                    lVar2.m = new x2.b();
                } else {
                    if (j33 <= j13) {
                        long j34 = j3;
                        if (!lVar2.n || j33 < j13) {
                            if (!z10 || b11.e(j33) < j29) {
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
                                long e12 = b11.e(j33);
                                iVar6.getClass();
                                p2.j h = iVar6.h(j33 - j30);
                                if (eVar == null) {
                                    jVar = new n(hVar4, ba.a(mVar, bVar3.a, h, b11.f(j33, j26) ? 0 : 8), n11, o10, r11, e12, b11.d(j33), j33, i13, n11);
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
                                        p2.j a11 = h.a(iVar6.h((j33 + i14) - j30), bVar3.a);
                                        if (a11 == null) {
                                            break;
                                        }
                                        i15++;
                                        i14++;
                                        i12 = i7;
                                        h = a11;
                                        min = i16;
                                    }
                                    long j36 = (j33 + i15) - 1;
                                    long d11 = b11.d(j36);
                                    long j37 = (i7 == 0 || j29 > d11) ? -9223372036854775807L : j29;
                                    j2.m a12 = ba.a(mVar, bVar3.a, h, b11.f(j36, j26) ? 0 : 8);
                                    long j38 = -mVar.c;
                                    if (s0.k(n11.s)) {
                                        j38 += e12;
                                    }
                                    jVar = new j(hVar4, a12, n11, o10, r11, e12, d11, j35, j37, j33, i15, j38, b11.a);
                                }
                                iVar2.c = jVar;
                            } else {
                                iVar2.b = true;
                            }
                        }
                    }
                    iVar2.b = z10;
                }
            }
            z12 = iVar2.b;
            f fVar22 = (f) iVar2.c;
            iVar2.c = null;
            iVar2.b = false;
            if (z12) {
            }
        }
        oVar = oVar2;
        iVar2 = iVar;
        z12 = iVar2.b;
        f fVar222 = (f) iVar2.c;
        iVar2.c = null;
        iVar2.b = false;
        if (z12) {
        }
    }

    @Override // b3.m
    public final void d() {
        b1 b1Var = this.y;
        b1Var.G(true);
        q2.g gVar = b1Var.h;
        if (gVar != null) {
            gVar.c(b1Var.e);
            b1Var.h = null;
            b1Var.g = null;
        }
        for (b1 b1Var2 : this.D) {
            b1Var2.G(true);
            q2.g gVar2 = b1Var2.h;
            if (gVar2 != null) {
                gVar2.c(b1Var2.e);
                b1Var2.h = null;
                b1Var2.g = null;
            }
        }
        for (o2.j jVar : this.e.i) {
            e eVar = jVar.a;
            if (eVar != null) {
                eVar.a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            o2.b bVar = (o2.b) hVar;
            synchronized (bVar) {
                o2.o oVar = (o2.o) bVar.D.remove(this);
                if (oVar != null) {
                    b1 b1Var3 = oVar.a;
                    b1Var3.G(true);
                    q2.g gVar3 = b1Var3.h;
                    if (gVar3 != null) {
                        gVar3.c(b1Var3.e);
                        b1Var3.h = null;
                        b1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // x2.e1
    public final long e() {
        if (v()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return t().n;
    }

    @Override // x2.c1
    public final boolean f() {
        return !v() && this.y.A(this.P);
    }

    @Override // x2.e1
    public final boolean g() {
        return this.r.d();
    }

    @Override // x2.c1
    public final int l(long j3) {
        if (v() || w() || this.O) {
            return 0;
        }
        boolean z9 = this.P;
        b1 b1Var = this.y;
        int x10 = b1Var.x(j3, z9);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - b1Var.v());
        }
        b1Var.L(x10);
        x();
        return x10;
    }

    @Override // x2.c1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        if (v() || w() || this.O) {
            return -3;
        }
        a aVar = this.L;
        b1 b1Var = this.y;
        if (aVar != null && aVar.d(0) <= b1Var.v()) {
            return -3;
        }
        x();
        return b1Var.F(bVar, hVar, i7, this.P);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028d  */
    @Override // b3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        pb.b bVar;
        ArrayList arrayList;
        x2.u uVar;
        boolean z12;
        boolean z13;
        long j11;
        boolean z14;
        b3.i iVar;
        boolean a10;
        f fVar = (f) lVar;
        c0 c0Var = fVar.r;
        u uVar2 = fVar.d;
        long j12 = fVar.h;
        long j13 = c0Var.b;
        boolean z15 = fVar instanceof a;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size() - 1;
        if (j13 != 0 && z15 && u(size)) {
            z9 = false;
            z10 = false;
        } else {
            z9 = true;
            z10 = false;
        }
        j2.m mVar = fVar.b;
        c0 c0Var2 = fVar.r;
        x2.u uVar3 = new x2.u(mVar, c0Var2.c, c0Var2.d, j3, j10, j13);
        m0.h0(j12);
        m0.h0(fVar.n);
        f5.u uVar4 = new f5.u(iOException, i7, 2);
        o2.l lVar2 = this.e;
        o2.j[] jVarArr = lVar2.i;
        b0 b0Var = lVar2.b;
        pb.b bVar2 = this.n;
        if (z9) {
            z11 = z15;
            o2.o oVar = lVar2.h;
            if (oVar != null) {
                long j14 = oVar.d;
                boolean z16 = j14 != -9223372036854775807L && j14 < j12;
                p pVar = oVar.e;
                if (pVar.f.d) {
                    if (!pVar.n) {
                        if (z16) {
                            if (pVar.h) {
                                pVar.n = true;
                                pVar.h = false;
                                o2.h hVar = pVar.b.a;
                                hVar.D.removeCallbacks(hVar.w);
                                hVar.C();
                            }
                        }
                    }
                    bVar = bVar2;
                    arrayList = arrayList2;
                    z12 = z9;
                    uVar = uVar3;
                    z13 = true;
                    z14 = true;
                    if (z14) {
                        if (z12) {
                            if (z11) {
                                ia.p(s(size) == fVar ? z13 : false);
                                if (arrayList.isEmpty()) {
                                    this.I = this.J;
                                }
                            }
                            iVar = o.e;
                            if (iVar == null) {
                                bVar.getClass();
                                long a12 = pb.b.a1(uVar4);
                                iVar = a12 != -9223372036854775807L ? new b3.i(0, a12, false) : o.f;
                            }
                            b3.i iVar2 = iVar;
                            a10 = iVar2.a();
                            this.h.q(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
                            if (!a10) {
                                this.F = null;
                                bVar.getClass();
                                this.f.d(this);
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
            if (!lVar2.k.d && (fVar instanceof l) && (iOException instanceof y) && ((y) iOException).c == 404) {
                o2.j jVar = jVarArr[lVar2.j.b(uVar2)];
                long c10 = jVar.c();
                if (c10 != -1 && c10 != 0) {
                    o2.i iVar3 = jVar.d;
                    iVar3.getClass();
                    if (((l) fVar).b() > ((iVar3.u() + jVar.f) + c10) - 1) {
                        lVar2.n = true;
                        bVar = bVar2;
                        arrayList = arrayList2;
                        z12 = z9;
                        uVar = uVar3;
                        z13 = true;
                        z14 = true;
                        if (z14) {
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
            o2.j jVar2 = jVarArr[lVar2.j.b(uVar2)];
            p2.m mVar2 = jVar2.b;
            p2.b bVar3 = jVar2.c;
            p2.b s5 = b0Var.s(mVar2.b);
            if (s5 == null || bVar3.equals(s5)) {
                a3.u uVar5 = lVar2.j;
                h9.i0 i0Var = jVar2.b.b;
                boolean z17 = z9;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bVar = bVar2;
                int length = uVar5.length();
                arrayList = arrayList2;
                uVar = uVar3;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (uVar5.a(i11, elapsedRealtime)) {
                        i10++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < i0Var.size(); i12++) {
                    hashSet.add(Integer.valueOf(((p2.b) i0Var.get(i12)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList h = b0Var.h(i0Var);
                z12 = z17;
                for (int i13 = 0; i13 < h.size(); i13++) {
                    hashSet2.add(Integer.valueOf(((p2.b) h.get(i13)).c));
                }
                b3.h hVar2 = new b3.h(size2, size2 - hashSet2.size(), length, i10);
                if (hVar2.a(2) || hVar2.a(1)) {
                    bVar.getClass();
                    b3.i V0 = pb.b.V0(hVar2, uVar4);
                    if (V0 != null) {
                        long j15 = V0.b;
                        int i14 = V0.a;
                        if (hVar2.a(i14)) {
                            if (i14 == 2) {
                                a3.u uVar6 = lVar2.j;
                                z14 = uVar6.p(uVar6.b(uVar2), j15);
                                z13 = true;
                            } else {
                                z13 = true;
                                if (i14 == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j15;
                                    String str = bVar3.b;
                                    HashMap hashMap = (HashMap) b0Var.b;
                                    if (hashMap.containsKey(str)) {
                                        Long l10 = (Long) hashMap.get(str);
                                        String str2 = m0.a;
                                        j11 = Math.max(elapsedRealtime2, l10.longValue());
                                    } else {
                                        j11 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j11));
                                    int i15 = bVar3.c;
                                    if (i15 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i15);
                                        HashMap hashMap2 = (HashMap) b0Var.c;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l11 = (Long) hashMap2.get(valueOf);
                                            String str3 = m0.a;
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, l11.longValue());
                                        }
                                        hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                    }
                                    z14 = true;
                                }
                                z14 = false;
                            }
                            if (z14) {
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
            bVar = bVar2;
            arrayList = arrayList2;
            z12 = z9;
            uVar = uVar3;
            z13 = true;
            z14 = true;
            if (z14) {
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
        z11 = z15;
        bVar = bVar2;
        arrayList = arrayList2;
        z12 = z9;
        uVar = uVar3;
        z13 = true;
        z14 = false;
        if (z14) {
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

    @Override // b3.j
    public final void o1(b3.l lVar, long j3, long j10) {
        f fVar = (f) lVar;
        this.F = null;
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
                    jVarArr[b10] = new o2.j(jVar.e, mVar, jVar.c, jVar.a, jVar.f, new ua(a10, mVar.c, 6));
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
        c0 c0Var = fVar.r;
        x2.u uVar = new x2.u(mVar2, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.n.getClass();
        this.h.p(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        this.f.d(this);
    }

    @Override // x2.e1
    public final long p() {
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.I;
        }
        long j3 = this.J;
        a t6 = t();
        if (!t6.c()) {
            ArrayList arrayList = this.w;
            t6 = arrayList.size() > 1 ? (a) jg.g.i(2, arrayList) : null;
        }
        if (t6 != null) {
            j3 = Math.max(j3, t6.n);
        }
        return Math.max(j3, this.y.s());
    }

    @Override // b3.j
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        f fVar = (f) lVar;
        this.F = null;
        this.L = null;
        long j11 = fVar.a;
        j2.m mVar = fVar.b;
        c0 c0Var = fVar.r;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.n.getClass();
        this.h.o(uVar, fVar.c, this.a, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z9) {
            return;
        }
        if (v()) {
            this.y.G(false);
            for (b1 b1Var : this.D) {
                b1Var.G(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.w;
            s(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.I = this.J;
            }
        }
        this.f.d(this);
    }

    @Override // x2.e1
    public final void r(long j3) {
        o oVar = this.r;
        if (oVar.c() || v()) {
            return;
        }
        boolean d = oVar.d();
        List list = this.x;
        o2.l lVar = this.e;
        ArrayList arrayList = this.w;
        if (d) {
            f fVar = this.F;
            fVar.getClass();
            boolean z9 = fVar instanceof a;
            if (z9 && u(arrayList.size() - 1)) {
                return;
            }
            if (lVar.m == null ? lVar.j.k(j3, fVar, list) : false) {
                oVar.b();
                if (z9) {
                    this.L = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (lVar.m != null || lVar.j.length() < 2) ? list.size() : lVar.j.j(j3, list);
        if (size < arrayList.size()) {
            ia.p(!oVar.d());
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
                long j10 = t().n;
                a s5 = s(size);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
                this.P = false;
                this.h.A(s5.h, this.a, j10);
            }
        }
        if (this.y.z()) {
            this.P = true;
        }
    }

    public final a s(int i7) {
        ArrayList arrayList = this.w;
        a aVar = (a) arrayList.get(i7);
        m0.X(i7, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i10 = 0;
        this.y.o(aVar.d(0));
        while (true) {
            b1[] b1VarArr = this.D;
            if (i10 >= b1VarArr.length) {
                return aVar;
            }
            b1 b1Var = b1VarArr[i10];
            i10++;
            b1Var.o(aVar.d(i10));
        }
    }

    public final a t() {
        return (a) jg.g.i(1, this.w);
    }

    public final boolean u(int i7) {
        int v;
        a aVar = (a) this.w.get(i7);
        if (this.y.v() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            b1[] b1VarArr = this.D;
            if (i10 >= b1VarArr.length) {
                return false;
            }
            v = b1VarArr[i10].v();
            i10++;
        } while (v <= aVar.d(i10));
        return true;
    }

    public final boolean v() {
        return this.I != -9223372036854775807L;
    }

    public final boolean w() {
        return ((!this.M && !this.N) || this.P || this.r.c()) ? false : true;
    }

    public final void x() {
        int y10 = y(this.y.v(), this.K - 1);
        while (true) {
            int i7 = this.K;
            if (i7 > y10) {
                return;
            }
            this.K = i7 + 1;
            a aVar = (a) this.w.get(i7);
            u uVar = aVar.d;
            if (!uVar.equals(this.G)) {
                this.h.j(this.a, uVar, aVar.e, aVar.f, aVar.h);
            }
            this.G = uVar;
        }
    }

    public final int y(int i7, int i10) {
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

    public final void z(o2.b bVar) {
        this.H = bVar;
        b1 b1Var = this.y;
        b1Var.l();
        q2.g gVar = b1Var.h;
        if (gVar != null) {
            gVar.c(b1Var.e);
            b1Var.h = null;
            b1Var.g = null;
        }
        for (b1 b1Var2 : this.D) {
            b1Var2.l();
            q2.g gVar2 = b1Var2.h;
            if (gVar2 != null) {
                gVar2.c(b1Var2.e);
                b1Var2.h = null;
                b1Var2.g = null;
            }
        }
        this.r.e(this);
    }
}
