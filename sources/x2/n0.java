package x2;

import h9.t1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class n0 extends l {
    public static final e2.l0 s;
    public final a[] k;
    public final ArrayList l;
    public final e2.l1[] m;
    public final ArrayList n;
    public final sa.d o;
    public int p;
    public long[][] q;
    public androidx.datastore.preferences.protobuf.l r;

    static {
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.b;
        t1 t1Var = t1.e;
        List list = Collections.EMPTY_LIST;
        t1 t1Var2 = t1.e;
        e2.e0 e0Var = new e2.e0();
        s = new e2.l0("MergingMediaSource", new e2.b0(zVar), null, new e2.f0(e0Var), e2.o0.L, e2.h0.d);
    }

    public n0(a... aVarArr) {
        sa.d dVar = new sa.d(27);
        this.k = aVarArr;
        this.o = dVar;
        this.n = new ArrayList(Arrays.asList(aVarArr));
        this.p = -1;
        this.l = new ArrayList(aVarArr.length);
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            this.l.add(new ArrayList());
        }
        this.m = new e2.l1[aVarArr.length];
        this.q = new long[0][];
        new HashMap();
        h9.o.g(8, "expectedKeys");
        h9.o.g(2, "expectedValuesPerKey");
        new h9.l1(h9.s.c(8)).h = new h9.k1();
    }

    @Override // x2.a
    public final boolean a(e2.l0 l0Var) {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 && aVarArr[0].a(l0Var);
    }

    @Override // x2.a
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        e2.l1[] l1VarArr = this.m;
        int b10 = l1VarArr[0].b(f0Var.a);
        for (int i7 = 0; i7 < length; i7++) {
            f0 a10 = f0Var.a(l1VarArr[i7].l(b10));
            d0VarArr[i7] = aVarArr[i7].c(a10, mVar, j3 - this.q[b10][i7]);
            ((List) this.l.get(i7)).add(new m0(a10, d0VarArr[i7]));
        }
        return new l0(this.o, this.q[b10], d0VarArr);
    }

    @Override // x2.a
    public final e2.l0 i() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].i() : s;
    }

    @Override // x2.l, x2.a
    public final void k() {
        androidx.datastore.preferences.protobuf.l lVar = this.r;
        if (lVar != null) {
            throw lVar;
        }
        super.k();
    }

    @Override // x2.a
    public final void m(j2.d0 d0Var) {
        this.j = d0Var;
        this.i = h2.m0.q(null);
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i7 >= aVarArr.length) {
                return;
            }
            y(Integer.valueOf(i7), aVarArr[i7]);
            i7++;
        }
    }

    @Override // x2.a
    public final void o(d0 d0Var) {
        l0 l0Var = (l0) d0Var;
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i7 >= aVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i7);
            d0[] d0VarArr = l0Var.a;
            boolean[] zArr = l0Var.b;
            d0 d0Var2 = zArr[i7] ? ((n1) d0VarArr[i7]).a : d0VarArr[i7];
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((m0) list.get(i10)).b.equals(d0Var2)) {
                    list.remove(i10);
                    break;
                }
                i10++;
            }
            a aVar = aVarArr[i7];
            d0[] d0VarArr2 = l0Var.a;
            aVar.o(zArr[i7] ? ((n1) d0VarArr2[i7]).a : d0VarArr2[i7]);
            i7++;
        }
    }

    @Override // x2.l, x2.a
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // x2.a
    public final void t(e2.l0 l0Var) {
        this.k[0].t(l0Var);
    }

    @Override // x2.l
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((m0) list.get(i7)).a.equals(f0Var)) {
                return ((m0) ((List) arrayList.get(0)).get(i7)).a;
            }
        }
        return null;
    }

    @Override // x2.l
    public final void x(Object obj, a aVar, e2.l1 l1Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = l1Var.h();
        } else if (l1Var.h() != this.p) {
            this.r = new androidx.datastore.preferences.protobuf.l();
            return;
        }
        int length = this.q.length;
        e2.l1[] l1VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, l1VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(aVar);
        l1VarArr[num.intValue()] = l1Var;
        if (arrayList.isEmpty()) {
            n(l1VarArr[0]);
        }
    }
}
