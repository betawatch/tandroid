package w2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o0 extends l {
    public static final d2.n0 s;
    public final a[] k;
    public final ArrayList l;
    public final d2.n1[] m;
    public final ArrayList n;
    public final ra.e o;
    public int p;
    public long[][] q;
    public androidx.datastore.preferences.protobuf.l r;

    static {
        d2.b0 b0Var = new d2.b0();
        g9.g0 g0Var = g9.i0.b;
        g9.s1 s1Var = g9.s1.e;
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var2 = g9.s1.e;
        d2.g0 g0Var2 = new d2.g0();
        s = new d2.n0("MergingMediaSource", new d2.d0(b0Var), null, new d2.h0(g0Var2), d2.q0.L, d2.j0.d);
    }

    public o0(a... aVarArr) {
        ra.e eVar = new ra.e(26);
        this.k = aVarArr;
        this.o = eVar;
        this.n = new ArrayList(Arrays.asList(aVarArr));
        this.p = -1;
        this.l = new ArrayList(aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            this.l.add(new ArrayList());
        }
        this.m = new d2.n1[aVarArr.length];
        this.q = new long[0][];
        new HashMap();
        g9.o.g(8, "expectedKeys");
        g9.o.g(2, "expectedValuesPerKey");
        new g9.k1(g9.s.c(8)).h = new g9.j1();
    }

    @Override // w2.a
    public final boolean a(d2.n0 n0Var) {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 && aVarArr[0].a(n0Var);
    }

    @Override // w2.a
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        d2.n1[] n1VarArr = this.m;
        int b10 = n1VarArr[0].b(g0Var.a);
        for (int i3 = 0; i3 < length; i3++) {
            g0 a10 = g0Var.a(n1VarArr[i3].l(b10));
            e0VarArr[i3] = aVarArr[i3].c(a10, a0Var, j10 - this.q[b10][i3]);
            ((List) this.l.get(i3)).add(new n0(a10, e0VarArr[i3]));
        }
        return new m0(this.o, this.q[b10], e0VarArr);
    }

    @Override // w2.a
    public final d2.n0 i() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].i() : s;
    }

    @Override // w2.l, w2.a
    public final void k() {
        androidx.datastore.preferences.protobuf.l lVar = this.r;
        if (lVar != null) {
            throw lVar;
        }
        super.k();
    }

    @Override // w2.a
    public final void m(i2.d0 d0Var) {
        this.j = d0Var;
        this.i = g2.n0.q(null);
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i3 >= aVarArr.length) {
                return;
            }
            y(Integer.valueOf(i3), aVarArr[i3]);
            i3++;
        }
    }

    @Override // w2.a
    public final void o(e0 e0Var) {
        m0 m0Var = (m0) e0Var;
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i3 >= aVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i3);
            e0[] e0VarArr = m0Var.a;
            boolean[] zArr = m0Var.b;
            e0 e0Var2 = zArr[i3] ? ((p1) e0VarArr[i3]).a : e0VarArr[i3];
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((n0) list.get(i10)).b.equals(e0Var2)) {
                    list.remove(i10);
                    break;
                }
                i10++;
            }
            a aVar = aVarArr[i3];
            e0[] e0VarArr2 = m0Var.a;
            aVar.o(zArr[i3] ? ((p1) e0VarArr2[i3]).a : e0VarArr2[i3]);
            i3++;
        }
    }

    @Override // w2.l, w2.a
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // w2.a
    public final void t(d2.n0 n0Var) {
        this.k[0].t(n0Var);
    }

    @Override // w2.l
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((n0) list.get(i3)).a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i3)).a;
            }
        }
        return null;
    }

    @Override // w2.l
    public final void x(Object obj, a aVar, d2.n1 n1Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = n1Var.h();
        } else if (n1Var.h() != this.p) {
            this.r = new androidx.datastore.preferences.protobuf.l();
            return;
        }
        int length = this.q.length;
        d2.n1[] n1VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, n1VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(aVar);
        n1VarArr[num.intValue()] = n1Var;
        if (arrayList.isEmpty()) {
            n(n1VarArr[0]);
        }
    }
}
