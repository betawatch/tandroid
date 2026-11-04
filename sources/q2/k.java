package q2;

import android.net.Uri;
import android.support.v4.media.session.a0;
import android.util.SparseArray;
import b8.kg;
import b8.od;
import b8.zb;
import d2.o1;
import d2.s0;
import d2.u0;
import d2.v;
import g2.n0;
import g9.g0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.p1;
import k2.t1;
import k2.v0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nh;
import org.telegram.ui.hc1;
import r2.u;
import r2.w;
import w2.d0;
import w2.d1;
import w2.e0;
import w2.r1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k implements e0, u {
    public final int E;
    public final l2.k F;
    public final nh G = new nh(this, 12);
    public d0 H;
    public int I;
    public r1 J;
    public q[] K;
    public q[] L;
    public int M;
    public w2.n N;
    public final long O;
    public final c a;
    public final r2.d b;
    public final i9 c;
    public final i2.d0 d;
    public final p2.m e;
    public final p2.j f;
    public final kb.a h;
    public final kg n;
    public final a0 r;
    public final IdentityHashMap s;
    public final i9 w;
    public final ra.e x;
    public final boolean y;

    public k(c cVar, r2.d dVar, i9 i9Var, i2.d0 d0Var, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar, a0 a0Var, ra.e eVar, boolean z10, int i3, l2.k kVar) {
        this.a = cVar;
        this.b = dVar;
        this.c = i9Var;
        this.d = d0Var;
        this.e = mVar;
        this.f = jVar;
        this.h = aVar;
        this.n = kgVar;
        this.r = a0Var;
        this.x = eVar;
        this.y = z10;
        this.E = i3;
        this.F = kVar;
        eVar.getClass();
        g0 g0Var = i0.b;
        s1 s1Var = s1.e;
        this.N = new w2.n(s1Var, s1Var);
        this.s = new IdentityHashMap();
        this.w = new i9(13);
        this.K = new q[0];
        this.L = new q[0];
        this.O = Long.MIN_VALUE;
    }

    public static v h(v vVar, v vVar2, boolean z10) {
        s0 s0Var;
        int i3;
        String str;
        String str2;
        i0 i0Var;
        int i10;
        int i11;
        String str3;
        g0 g0Var = i0.b;
        s1 s1Var = s1.e;
        if (vVar2 != null) {
            str2 = vVar2.k;
            s0Var = vVar2.l;
            i10 = vVar2.K;
            i3 = vVar2.e;
            i11 = vVar2.f;
            str = vVar2.d;
            str3 = vVar2.b;
            i0Var = vVar2.c;
        } else {
            String w10 = n0.w(1, vVar.k);
            s0Var = vVar.l;
            if (z10) {
                i10 = vVar.K;
                i3 = vVar.e;
                i11 = vVar.f;
                str = vVar.d;
                str3 = vVar.b;
                str2 = w10;
                i0Var = vVar.c;
            } else {
                i3 = 0;
                str = null;
                str2 = w10;
                i0Var = s1Var;
                i10 = -1;
                i11 = 0;
                str3 = null;
            }
        }
        String d = u0.d(str2);
        int i12 = z10 ? vVar.h : -1;
        int i13 = z10 ? vVar.i : -1;
        d2.u uVar = new d2.u();
        uVar.a = vVar.a;
        uVar.b = str3;
        uVar.c = i0.q(i0Var);
        uVar.q = u0.n(vVar.r);
        uVar.r = u0.n(d);
        uVar.j = str2;
        uVar.k = s0Var;
        uVar.h = i12;
        uVar.i = i13;
        uVar.J = i10;
        uVar.e = i3;
        uVar.f = i11;
        uVar.d = str;
        return new v(uVar);
    }

    @Override // r2.u
    public final void a() {
        for (q qVar : this.K) {
            a3.q qVar2 = qVar.s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.E;
            if (!arrayList.isEmpty()) {
                j jVar = (j) g9.o.n(arrayList);
                int c2 = iVar.c(jVar);
                int i3 = jVar.F;
                if (c2 == 1) {
                    if (!jVar.g()) {
                        zb.p(i3 != -1);
                        r2.m b10 = iVar.g.b(jVar.y, false);
                        b10.getClass();
                        i0 i0Var = b10.r;
                        int i10 = (int) (jVar.s - b10.k);
                        jVar.b0 = i10 < 0 ? 0L : ((r2.h) (i10 < i0Var.size() ? ((r2.j) i0Var.get(i10)).y : b10.s).get(i3)).c;
                    }
                } else if (c2 == 0) {
                    qVar.I.post(new hc1(19, qVar, jVar));
                } else if (c2 == 2 && !qVar.k0 && qVar2.d()) {
                    qVar2.b();
                }
            }
        }
        this.H.k(this);
    }

    @Override // r2.u
    public final boolean b(Uri uri, e5.u uVar, boolean z10) {
        int i3;
        boolean z11;
        a3.i iVar;
        int u10;
        q[] qVarArr = this.K;
        int length = qVarArr.length;
        int i10 = 0;
        boolean z12 = false;
        while (i10 < length) {
            q qVar = qVarArr[i10];
            i iVar2 = qVar.d;
            w[] wVarArr = iVar2.e;
            r2.d dVar = iVar2.g;
            int length2 = wVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                w wVar = wVarArr[i11];
                r2.c cVar = (r2.c) dVar.d.get(uri);
                if (wVar.equals(cVar != null ? cVar.a : null)) {
                    if (z10) {
                        iVar = null;
                    } else {
                        a3.h a10 = iVar2.a(uri);
                        qVar.r.getClass();
                        iVar = kb.a.D4(a10, uVar);
                    }
                    iVar2.o = uri;
                    if (iVar != null) {
                        int i12 = iVar.a;
                        i3 = i10;
                        long j10 = iVar.b;
                        if (i12 == 1) {
                            r2.c cVar2 = (r2.c) dVar.d.get(uri);
                            if (cVar2 != null) {
                                z11 = r2.c.c(cVar2, uri, j10);
                            }
                        } else {
                            if (i12 != 2) {
                                throw new IllegalStateException(p1.i(i12, "Invalid fallback selection type: "));
                            }
                            int i13 = 0;
                            while (true) {
                                if (i13 >= wVarArr.length) {
                                    i13 = -1;
                                    break;
                                }
                                w wVar2 = wVarArr[i13];
                                r2.c cVar3 = (r2.c) dVar.d.get(uri);
                                if (wVar2.equals(cVar3 != null ? cVar3.a : null)) {
                                    break;
                                }
                                i13++;
                            }
                            if (i13 != -1 && (u10 = iVar2.r.u(i13)) != -1 && iVar2.r.p(u10, j10)) {
                                r2.c cVar4 = (r2.c) dVar.d.get(uri);
                                if (cVar4 != null ? r2.c.c(cVar4, uri, j10) : false) {
                                    z11 = true;
                                }
                            }
                        }
                    }
                } else {
                    i11++;
                }
            }
            i3 = i10;
            z11 = false;
            z12 |= z11;
            i10 = i3 + 1;
        }
        this.H.k(this);
        return z12;
    }

    @Override // w2.f1
    public final boolean c(v0 v0Var) {
        if (this.J != null) {
            return this.N.c(v0Var);
        }
        for (q qVar : this.K) {
            if (!qVar.U) {
                k2.u0 u0Var = new k2.u0();
                u0Var.a = qVar.g0;
                qVar.c(new v0(u0Var));
            }
        }
        return false;
    }

    @Override // w2.f1
    public final boolean d() {
        return this.N.d();
    }

    @Override // w2.f1
    public final long e() {
        return this.N.e();
    }

    public final q f(String str, int i3, w[] wVarArr, v[] vVarArr, v vVar, List list, Map map, long j10) {
        q qVar = new q(str, i3, this.G, new i(this.a, this.b, wVarArr, vVarArr, this.c, this.d, this.w, list, this.F), map, this.r, j10, vVar, this.e, this.f, this.h, this.n, this.E, null);
        long j11 = this.O;
        qVar.l0 = j11;
        if (qVar.T) {
            for (p pVar : qVar.M) {
                pVar.K(j11);
            }
        }
        return qVar;
    }

    @Override // w2.e0
    public final void g() {
        for (q qVar : this.K) {
            qVar.C();
            if (qVar.k0 && !qVar.U) {
                throw d2.v0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // w2.e0
    public final void i(d0 d0Var, long j10) {
        String str;
        c cVar;
        boolean z10;
        Map map;
        i0 i0Var;
        int i3;
        HashSet hashSet;
        int i10;
        HashSet hashSet2;
        i0 i0Var2;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        List list;
        this.H = d0Var;
        r2.d dVar = this.b;
        dVar.getClass();
        dVar.e.add(this);
        r2.p pVar = dVar.s;
        pVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        i0 c2 = dVar.c(0);
        c2.getClass();
        i0 c10 = dVar.c(2);
        c10.getClass();
        i0 c11 = dVar.c(3);
        c11.getClass();
        boolean isEmpty = c2.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.a;
        boolean z14 = this.y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z14;
            map = map3;
            i0Var = c11;
        } else {
            v vVar = pVar.j;
            List list2 = pVar.k;
            int size = c2.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < c2.size(); i14++) {
                v vVar2 = ((w) c2.get(i14)).a.a;
                int i15 = vVar2.A;
                String str2 = vVar2.k;
                if (i15 > 0 || n0.w(2, str2) != null) {
                    int i16 = i13;
                    iArr[i14] = 2;
                    i12++;
                    i13 = i16;
                } else if (n0.w(1, str2) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
            }
            int i17 = i13;
            if (i12 > 0) {
                z12 = false;
                i11 = i12;
                z11 = true;
            } else if (i17 < size) {
                int i18 = size - i17;
                z11 = false;
                i11 = i18;
                z12 = true;
            } else {
                z11 = false;
                z12 = false;
                i11 = size;
            }
            w[] wVarArr = new w[i11];
            v[] vVarArr = new v[i11];
            int[] iArr2 = new int[i11];
            int i19 = 0;
            boolean z15 = z11;
            int i20 = 0;
            while (i20 < c2.size()) {
                if (z15) {
                    list = list2;
                    if (iArr[i20] != 2) {
                        i20++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z12 || iArr[i20] != 1) {
                    w wVar = (w) c2.get(i20);
                    wVarArr[i19] = wVar;
                    vVarArr[i19] = wVar.a.a;
                    iArr2[i19] = i20;
                    i19++;
                }
                i20++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = vVarArr[0].k;
            int v = n0.v(2, str3);
            int i21 = 1;
            int v10 = n0.v(1, str3);
            boolean z16 = (v10 == 1 || (v10 == 0 && c10.isEmpty())) && v <= 1 && v10 + v > 0;
            if (z15 || v10 <= 0) {
                z13 = true;
                i21 = 0;
            } else {
                z13 = true;
            }
            z10 = z14;
            i0Var = c11;
            q f10 = f("main", i21, wVarArr, vVarArr, vVar, list3, map3, j10);
            arrayList3.add(f10);
            arrayList4.add(iArr2);
            if (z10 && z16) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    v[] vVarArr2 = new v[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        v vVar3 = vVarArr[i22];
                        String w10 = n0.w(2, vVar3.k);
                        String d = u0.d(w10);
                        v[] vVarArr3 = vVarArr;
                        d2.u uVar = new d2.u();
                        uVar.a = vVar3.a;
                        uVar.b = vVar3.b;
                        uVar.c = i0.q(vVar3.c);
                        uVar.q = u0.n(vVar3.r);
                        uVar.r = u0.n(d);
                        uVar.j = w10;
                        uVar.k = vVar3.l;
                        uVar.h = vVar3.h;
                        uVar.i = vVar3.i;
                        uVar.y = vVar3.z;
                        uVar.z = vVar3.A;
                        uVar.C = vVar3.D;
                        uVar.e = vVar3.e;
                        uVar.f = vVar3.f;
                        uVar.H = vVar3.I;
                        vVarArr2[i22] = new v(uVar);
                        i22++;
                        vVarArr = vVarArr3;
                        map3 = map3;
                    }
                    v[] vVarArr4 = vVarArr;
                    map = map3;
                    arrayList5.add(new o1("main", vVarArr2));
                    if (v10 > 0 && (vVar != null || c10.isEmpty())) {
                        d2.u a10 = h(vVarArr4[0], vVar, false).a();
                        a10.l = "main";
                        arrayList5.add(new o1("main:audio", new v(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String i24 = p1.i(i23, "main:cc:");
                            d2.u a11 = cVar2.b((v) list3.get(i23)).a();
                            a11.l = "main";
                            arrayList5.add(new o1(i24, new v(a11)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    v[] vVarArr5 = new v[i11];
                    for (int i25 = 0; i25 < i11; i25++) {
                        vVarArr5[i25] = h(vVarArr[i25], vVar, true);
                    }
                    arrayList5.add(new o1("main", vVarArr5));
                }
                d2.u uVar2 = new d2.u();
                str = "ID3";
                uVar2.a = str;
                uVar2.r = u0.n("application/id3");
                uVar2.l = "main";
                o1 o1Var = new o1("main:id3", new v(uVar2));
                arrayList5.add(o1Var);
                f10.D((o1[]) arrayList5.toArray(new o1[0]), arrayList5.indexOf(o1Var));
            } else {
                map = map3;
                str = "ID3";
                cVar = cVar2;
            }
        }
        ArrayList arrayList6 = new ArrayList(c10.size());
        ArrayList arrayList7 = new ArrayList(c10.size());
        ArrayList arrayList8 = new ArrayList(c10.size());
        HashSet hashSet3 = new HashSet();
        int i26 = 0;
        while (i26 < c10.size()) {
            String str4 = ((w) c10.get(i26)).a.c;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z17 = true;
                for (int i27 = 0; i27 < c10.size(); i27++) {
                    if (str4.equals(((w) c10.get(i27)).a.c)) {
                        w wVar2 = (w) c10.get(i27);
                        v vVar4 = wVar2.a.a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(wVar2);
                        arrayList7.add(vVar4);
                        z17 &= n0.v(1, vVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = n0.a;
                i10 = i26;
                hashSet2 = hashSet3;
                i0Var2 = c10;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q f11 = f(concat, 1, (w[]) arrayList6.toArray(new w[0]), (v[]) arrayList7.toArray(new v[0]), null, Collections.EMPTY_LIST, map2, j10);
                arrayList4.add(od.f(arrayList2));
                arrayList3.add(f11);
                if (z10 && z17) {
                    String q10 = t4.c.q(concat, ":id3");
                    d2.u uVar3 = new d2.u();
                    uVar3.a = str;
                    uVar3.r = u0.n("application/id3");
                    uVar3.l = concat;
                    f11.D(new o1[]{new o1(concat, (v[]) arrayList.toArray(new v[0])), new o1(q10, new v(uVar3))}, 1);
                }
            } else {
                hashSet2 = hashSet3;
                i10 = i26;
                i0Var2 = c10;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            }
            i26 = i10 + 1;
            arrayList7 = arrayList;
            c10 = i0Var2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.M = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(i0Var.size());
        ArrayList arrayList10 = new ArrayList(i0Var.size());
        ArrayList arrayList11 = new ArrayList(i0Var.size());
        HashSet hashSet4 = new HashSet();
        int i28 = 0;
        while (i28 < i0Var.size()) {
            i0 i0Var3 = i0Var;
            String str6 = ((w) i0Var3.get(i28)).a.c;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i29 = 0; i29 < i0Var3.size(); i29++) {
                    if (str6.equals(((w) i0Var3.get(i29)).a.c)) {
                        w wVar3 = (w) i0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(wVar3);
                        arrayList10.add(wVar3.a.a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                v[] vVarArr6 = (v[]) arrayList10.toArray(new v[0]);
                String str7 = n0.a;
                w[] wVarArr2 = (w[]) arrayList9.toArray(new w[0]);
                g0 g0Var = i0.b;
                i0Var = i0Var3;
                i3 = i28;
                hashSet = hashSet4;
                q f12 = f(concat2, 3, wVarArr2, vVarArr6, null, s1.e, map4, j10);
                arrayList4.add(od.f(arrayList11));
                arrayList3.add(f12);
                int length = vVarArr6.length;
                v[] vVarArr7 = new v[length];
                for (int i30 = 0; i30 < length; i30++) {
                    vVarArr7[i30] = cVar.b(vVarArr6[i30]);
                }
                f12.D(new o1[]{new o1(concat2, vVarArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i3 = i28;
                i0Var = i0Var3;
            }
            i28 = i3 + 1;
            hashSet4 = hashSet;
        }
        this.K = (q[]) arrayList3.toArray(new q[0]);
        this.I = this.K.length;
        for (int i31 = 0; i31 < this.M; i31++) {
            this.K[i31].d.l = true;
        }
        for (q qVar : this.K) {
            if (!qVar.U) {
                k2.u0 u0Var = new k2.u0();
                u0Var.a = qVar.g0;
                qVar.c(new v0(u0Var));
            }
        }
        this.L = this.K;
    }

    @Override // w2.e0
    public final long j(long j10) {
        q[] qVarArr = this.L;
        if (qVarArr.length > 0) {
            boolean F = qVarArr[0].F(j10, false);
            int i3 = 1;
            while (true) {
                q[] qVarArr2 = this.L;
                if (i3 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i3].F(j10, F);
                i3++;
            }
            if (F) {
                ((SparseArray) this.w.b).clear();
            }
        }
        return j10;
    }

    @Override // w2.e0
    public final void l(long j10) {
        for (q qVar : this.L) {
            if (qVar.T && !qVar.A()) {
                int length = qVar.M.length;
                for (int i3 = 0; i3 < length; i3++) {
                    qVar.M[i3].k(j10, qVar.e0[i3]);
                }
            }
        }
    }

    @Override // w2.e0
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // w2.e0
    public final r1 p() {
        r1 r1Var = this.J;
        r1Var.getClass();
        return r1Var;
    }

    @Override // w2.f1
    public final long q() {
        return this.N.q();
    }

    @Override // w2.e0
    public final long r(long j10, t1 t1Var) {
        q[] qVarArr = this.L;
        int length = qVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            q qVar = qVarArr[i3];
            if (qVar.R == 2) {
                i iVar = qVar.d;
                r2.d dVar = iVar.g;
                int c2 = iVar.r.c();
                w[] wVarArr = iVar.e;
                r2.m b10 = (c2 >= wVarArr.length || c2 == -1) ? null : dVar.b(wVarArr[iVar.r.l()].c(), true);
                if (b10 != null) {
                    i0 i0Var = b10.r;
                    if (!i0Var.isEmpty()) {
                        long j11 = b10.h - dVar.J;
                        long j12 = j10 - j11;
                        int d = n0.d(i0Var, Long.valueOf(j12), true);
                        long j13 = ((r2.j) i0Var.get(d)).e;
                        return t1Var.a(j12, j13, (!b10.c || d == i0Var.size() - 1) ? j13 : ((r2.j) i0Var.get(d + 1)).e) + j11;
                    }
                }
            } else {
                i3++;
            }
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0120, code lost:
    
        if (r44 != r3.g0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // w2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        d1[] d1VarArr2;
        int[] iArr;
        boolean z10;
        ?? r9;
        i iVar;
        int i3;
        int i10;
        d1[] d1VarArr3;
        int i11;
        int[] iArr2;
        q[] qVarArr;
        q qVar;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        boolean z13;
        ?? r10;
        int i15;
        int i16;
        z2.p[] pVarArr2;
        int[] iArr3 = new int[pVarArr.length];
        int[] iArr4 = new int[pVarArr.length];
        int i17 = 0;
        while (true) {
            int length = pVarArr.length;
            identityHashMap = this.s;
            if (i17 >= length) {
                break;
            }
            d1 d1Var = d1VarArr[i17];
            iArr3[i17] = d1Var == null ? -1 : ((Integer) identityHashMap.get(d1Var)).intValue();
            iArr4[i17] = -1;
            z2.p pVar = pVarArr[i17];
            if (pVar != null) {
                o1 b10 = pVar.b();
                int i18 = 0;
                while (true) {
                    q[] qVarArr2 = this.K;
                    if (i18 < qVarArr2.length) {
                        q qVar2 = qVarArr2[i18];
                        qVar2.m();
                        if (qVar2.Z.b(b10) != -1) {
                            iArr4[i17] = i18;
                            break;
                        }
                        i18++;
                    }
                }
            }
            i17++;
        }
        identityHashMap.clear();
        int length2 = pVarArr.length;
        d1[] d1VarArr4 = new d1[length2];
        int length3 = pVarArr.length;
        d1[] d1VarArr5 = new d1[length3];
        int length4 = pVarArr.length;
        z2.p[] pVarArr3 = new z2.p[length4];
        boolean z14 = false;
        q[] qVarArr3 = new q[this.K.length];
        int i19 = length3;
        int i20 = 0;
        int i21 = 0;
        boolean z15 = false;
        while (i20 < this.K.length) {
            int i22 = length2;
            ?? r72 = z14;
            while (true) {
                d1VarArr2 = d1VarArr4;
                if (r72 >= pVarArr.length) {
                    break;
                }
                d1VarArr5[r72] = iArr3[r72] == i20 ? d1VarArr[r72] : null;
                pVarArr3[r72] = iArr4[r72] == i20 ? pVarArr[r72] : null;
                d1VarArr4 = d1VarArr2;
                r72++;
            }
            q qVar3 = this.K[i20];
            a3.q qVar4 = qVar3.s;
            int i23 = i20;
            i iVar2 = qVar3.d;
            w[] wVarArr = iVar2.e;
            r2.d dVar = iVar2.g;
            ArrayList arrayList = qVar3.E;
            qVar3.m();
            int i24 = qVar3.V;
            ?? r29 = d1VarArr5;
            ?? r73 = z14;
            while (r73 < length4) {
                m mVar = (m) r29[r73];
                if (mVar == null || (pVarArr3[r73] != null && zArr[r73])) {
                    i16 = r73;
                    pVarArr2 = pVarArr3;
                } else {
                    i16 = r73;
                    qVar3.V--;
                    pVarArr2 = pVarArr3;
                    if (mVar.c != -1) {
                        q qVar5 = mVar.b;
                        int i25 = mVar.a;
                        qVar5.m();
                        qVar5.b0.getClass();
                        int i26 = qVar5.b0[i25];
                        if (i26 >= 0) {
                            zb.p(qVar5.e0[i26]);
                            qVar5.e0[i26] = z14;
                        }
                        mVar.c = -1;
                    }
                    r29[i16] = 0;
                }
                pVarArr3 = pVarArr2;
                r73 = i16 + 1;
            }
            z2.p[] pVarArr4 = pVarArr3;
            boolean z16 = true;
            if (!z15) {
                if (!qVar3.j0) {
                    iArr = iArr3;
                } else if (i24 != 0) {
                    iArr = iArr3;
                }
                z10 = z14;
                z2.p pVar2 = iVar2.r;
                boolean z17 = z10;
                z2.p pVar3 = pVar2;
                r9 = z14;
                while (r9 < length4) {
                    int i27 = r9;
                    z2.p pVar4 = pVarArr4[i27];
                    if (pVar4 == null) {
                        i15 = length4;
                    } else {
                        i15 = length4;
                        boolean z18 = z17;
                        int b11 = qVar3.Z.b(pVar4.b());
                        if (b11 == qVar3.c0) {
                            Uri c2 = wVarArr[iVar2.r.l()].c();
                            r2.c cVar = (r2.c) dVar.d.get(c2);
                            if (cVar != null) {
                                r2.b bVar = (r2.b) f1.p(cVar.b, c2, c2);
                                bVar.getClass();
                                bVar.x = z14;
                            }
                            iVar2.r = pVar4;
                            pVar3 = pVar4;
                        }
                        if (r29[i27] == 0) {
                            qVar3.V++;
                            m mVar2 = new m(qVar3, b11);
                            r29[i27] = mVar2;
                            zArr2[i27] = z16;
                            if (qVar3.b0 != null) {
                                mVar2.b();
                                int i28 = qVar3.b0[b11];
                                if (!z18 && i28 >= 0) {
                                    p pVar5 = qVar3.M[i28];
                                    z17 = (pVar5.v() == 0 || pVar5.J(j10, z16)) ? false : true;
                                }
                            }
                        }
                        z17 = z18;
                    }
                    length4 = i15;
                    z14 = false;
                    z16 = true;
                    r9 = i27 + 1;
                }
                int i29 = length4;
                boolean z19 = z17;
                if (qVar3.V != 0) {
                    Uri c10 = wVarArr[iVar2.r.l()].c();
                    r2.c cVar2 = (r2.c) dVar.d.get(c10);
                    if (cVar2 != null) {
                        r2.b bVar2 = (r2.b) f1.p(cVar2.b, c10, c10);
                        bVar2.getClass();
                        bVar2.x = false;
                    }
                    iVar2.n = null;
                    qVar3.X = null;
                    qVar3.i0 = true;
                    arrayList.clear();
                    if (qVar4.d()) {
                        if (qVar3.T) {
                            for (p pVar6 : qVar3.M) {
                                pVar6.l();
                            }
                        }
                        qVar4.b();
                    } else {
                        qVar3.E();
                    }
                    iVar = iVar2;
                    i12 = i19;
                    i10 = i22;
                    d1VarArr3 = d1VarArr2;
                    i11 = i23;
                    z12 = z19;
                    iArr2 = iArr4;
                    qVarArr = qVarArr3;
                    qVar = qVar3;
                } else {
                    boolean z20 = true;
                    if (arrayList.isEmpty() || Objects.equals(pVar3, pVar2)) {
                        iVar = iVar2;
                        i3 = i19;
                        i10 = i22;
                        d1VarArr3 = d1VarArr2;
                        i11 = i23;
                        iArr2 = iArr4;
                        qVarArr = qVarArr3;
                        qVar = qVar3;
                    } else {
                        if (qVar3.j0) {
                            iVar = iVar2;
                            i3 = i19;
                            i10 = i22;
                            d1VarArr3 = d1VarArr2;
                            i11 = i23;
                            iArr2 = iArr4;
                            qVarArr = qVarArr3;
                            qVar = qVar3;
                        } else {
                            long j11 = j10 < 0 ? -j10 : 0L;
                            j y9 = qVar3.y();
                            long j12 = j11;
                            x2.m[] b12 = iVar2.b(y9, j10);
                            iVar = iVar2;
                            List list = qVar3.F;
                            i3 = i19;
                            i10 = i22;
                            d1VarArr3 = d1VarArr2;
                            i11 = i23;
                            iArr2 = iArr4;
                            qVarArr = qVarArr3;
                            qVar = qVar3;
                            z2.p pVar7 = pVar3;
                            pVar7.d(j10, j12, -9223372036854775807L, list, b12);
                            if (pVar7.l() != iVar.h.a(y9.d)) {
                                z20 = true;
                            } else {
                                z20 = true;
                            }
                        }
                        qVar.i0 = z20;
                        z11 = z20;
                        z12 = z11;
                        if (z12) {
                            i12 = i3;
                        } else {
                            qVar.F(j10, z11);
                            i12 = i3;
                            int i30 = 0;
                            while (i30 < i12) {
                                if (r29[i30] != 0) {
                                    zArr2[i30] = z20;
                                }
                                i30++;
                                z20 = true;
                            }
                        }
                    }
                    z11 = z15;
                    z12 = z19;
                    if (z12) {
                    }
                }
                ArrayList arrayList2 = qVar.J;
                arrayList2.clear();
                for (i13 = 0; i13 < i12; i13++) {
                    ?? r82 = r29[i13];
                    if (r82 != 0) {
                        arrayList2.add((m) r82);
                    }
                }
                qVar.j0 = true;
                i14 = 0;
                z13 = false;
                while (i14 < pVarArr.length) {
                    ?? r83 = r29[i14];
                    int i31 = i11;
                    if (iArr2[i14] == i31) {
                        r83.getClass();
                        r10 = d1VarArr3;
                        r10[i14] = r83;
                        identityHashMap.put(r83, Integer.valueOf(i31));
                        z13 = true;
                    } else {
                        r10 = d1VarArr3;
                        if (iArr[i14] == i31) {
                            zb.p(r83 == 0);
                        }
                    }
                    i14++;
                    d1VarArr3 = r10;
                    i11 = i31;
                }
                d1[] d1VarArr6 = d1VarArr3;
                int i32 = i11;
                int i33 = i21;
                if (!z13) {
                    qVarArr[i33] = qVar;
                    i21 = i33 + 1;
                    if (i33 == 0) {
                        iVar.l = true;
                        if (!z12) {
                            q[] qVarArr4 = this.L;
                            if (qVarArr4.length != 0 && qVar == qVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.w.b).clear();
                        z15 = true;
                    } else {
                        iVar.l = i32 < this.M;
                    }
                }
                i20 = i32 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                qVarArr3 = qVarArr;
                d1VarArr5 = r29;
                pVarArr3 = pVarArr4;
                length2 = i10;
                z14 = false;
                i19 = i12;
                d1VarArr4 = d1VarArr6;
                length4 = i29;
            }
            iArr = iArr3;
            z10 = true;
            z2.p pVar22 = iVar2.r;
            boolean z172 = z10;
            z2.p pVar32 = pVar22;
            r9 = z14;
            while (r9 < length4) {
            }
            int i292 = length4;
            boolean z192 = z172;
            if (qVar3.V != 0) {
            }
            ArrayList arrayList22 = qVar.J;
            arrayList22.clear();
            while (i13 < i12) {
            }
            qVar.j0 = true;
            i14 = 0;
            z13 = false;
            while (i14 < pVarArr.length) {
            }
            d1[] d1VarArr62 = d1VarArr3;
            int i322 = i11;
            int i332 = i21;
            if (!z13) {
            }
            i20 = i322 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            qVarArr3 = qVarArr;
            d1VarArr5 = r29;
            pVarArr3 = pVarArr4;
            length2 = i10;
            z14 = false;
            i19 = i12;
            d1VarArr4 = d1VarArr62;
            length4 = i292;
        }
        boolean z21 = z14;
        System.arraycopy(d1VarArr4, z21 ? 1 : 0, d1VarArr, z21 ? 1 : 0, length2);
        q[] qVarArr5 = (q[]) n0.U(i21, qVarArr3);
        this.L = qVarArr5;
        s1 r5 = i0.r(qVarArr5);
        AbstractList y10 = g9.o.y(r5, new org.telegram.utils.twidget.a());
        this.x.getClass();
        this.N = new w2.n(r5, y10);
        return j10;
    }

    @Override // w2.f1
    public final void t(long j10) {
        this.N.t(j10);
    }
}
