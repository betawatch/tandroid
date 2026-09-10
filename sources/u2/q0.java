package u2;

import com.google.android.gms.internal.cast.b5;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class q0 extends m {
    public static final b2.k0 s;
    public final a[] k;
    public final ArrayList l;
    public final b2.k1[] m;
    public final ArrayList n;
    public final ob.a o;
    public int p;
    public long[][] q;
    public b5 r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        s = new b2.k0("MergingMediaSource", new b2.a0(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public q0(a... aVarArr) {
        ob.a aVar = new ob.a(23);
        this.k = aVarArr;
        this.o = aVar;
        this.n = new ArrayList(Arrays.asList(aVarArr));
        this.p = -1;
        this.l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.l.add(new ArrayList());
        }
        this.m = new b2.k1[aVarArr.length];
        this.q = new long[0][];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f = new e9.u0();
    }

    @Override // u2.a
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 && aVarArr[0].a(k0Var);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.k1[] k1VarArr = this.m;
        int b10 = k1VarArr[0].b(g0Var.a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(k1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.q[b10][i10]);
            ((List) this.l.get(i10)).add(new p0(a2, e0VarArr[i10]));
        }
        return new o0(this.o, this.q[b10], e0VarArr);
    }

    @Override // u2.a
    public final b2.k0 i() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].i() : s;
    }

    @Override // u2.m, u2.a
    public final void k() {
        b5 b5Var = this.r;
        if (b5Var != null) {
            throw b5Var;
        }
        super.k();
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.j = c0Var;
        this.i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i10 >= aVarArr.length) {
                return;
            }
            y(Integer.valueOf(i10), aVarArr[i10]);
            i10++;
        }
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        o0 o0Var = (o0) e0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i10 >= aVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i10);
            e0[] e0VarArr = o0Var.a;
            boolean[] zArr = o0Var.b;
            e0 e0Var2 = zArr[i10] ? ((p1) e0VarArr[i10]).a : e0VarArr[i10];
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((p0) list.get(i11)).b.equals(e0Var2)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            a aVar = aVarArr[i10];
            e0[] e0VarArr2 = o0Var.a;
            aVar.o(zArr[i10] ? ((p1) e0VarArr2[i10]).a : e0VarArr2[i10]);
            i10++;
        }
    }

    @Override // u2.m, u2.a
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // u2.a
    public final void t(b2.k0 k0Var) {
        this.k[0].t(k0Var);
    }

    @Override // u2.m
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((p0) list.get(i10)).a.equals(g0Var)) {
                return ((p0) ((List) arrayList.get(0)).get(i10)).a;
            }
        }
        return null;
    }

    @Override // u2.m
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = k1Var.h();
        } else if (k1Var.h() != this.p) {
            this.r = new b5();
            return;
        }
        int length = this.q.length;
        b2.k1[] k1VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, k1VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(aVar);
        k1VarArr[num.intValue()] = k1Var;
        if (arrayList.isEmpty()) {
            n(k1VarArr[0]);
        }
    }
}
