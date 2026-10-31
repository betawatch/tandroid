package u2;

import com.google.android.gms.internal.cast.x4;
import e9.x1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o0 extends l {
    public static final b2.p0 s;
    public final a[] k;
    public final ArrayList l;
    public final b2.o1[] m;
    public final ArrayList n;
    public final kb.a o;
    public int p;
    public long[][] q;
    public x4 r;

    static {
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.i0 i0Var = new b2.i0();
        s = new b2.p0("MergingMediaSource", new b2.f0(d0Var), null, new b2.j0(i0Var), b2.s0.L, b2.l0.d);
    }

    public o0(a... aVarArr) {
        kb.a aVar = new kb.a(21);
        this.k = aVarArr;
        this.o = aVar;
        this.n = new ArrayList(Arrays.asList(aVarArr));
        this.p = -1;
        this.l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.l.add(new ArrayList());
        }
        this.m = new b2.o1[aVarArr.length];
        this.q = new long[0][];
        new HashMap();
        e9.s.f(8, "expectedKeys");
        e9.s.f(2, "expectedValuesPerKey");
        new e9.p1(e9.x.b(8)).h = new e9.o1();
    }

    @Override // u2.a
    public final boolean a(b2.p0 p0Var) {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 && aVarArr[0].a(p0Var);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.o1[] o1VarArr = this.m;
        int b10 = o1VarArr[0].b(g0Var.a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(o1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, a0Var, j10 - this.q[b10][i10]);
            ((List) this.l.get(i10)).add(new n0(a2, e0VarArr[i10]));
        }
        return new m0(this.o, this.q[b10], e0VarArr);
    }

    @Override // u2.a
    public final b2.p0 i() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].i() : s;
    }

    @Override // u2.l, u2.a
    public final void k() {
        x4 x4Var = this.r;
        if (x4Var != null) {
            throw x4Var;
        }
        super.k();
    }

    @Override // u2.a
    public final void m(g2.d0 d0Var) {
        this.j = d0Var;
        this.i = e2.l0.q(null);
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
        m0 m0Var = (m0) e0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i10 >= aVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i10);
            e0[] e0VarArr = m0Var.a;
            boolean[] zArr = m0Var.b;
            e0 e0Var2 = zArr[i10] ? ((p1) e0VarArr[i10]).a : e0VarArr[i10];
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((n0) list.get(i11)).b.equals(e0Var2)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            a aVar = aVarArr[i10];
            e0[] e0VarArr2 = m0Var.a;
            aVar.o(zArr[i10] ? ((p1) e0VarArr2[i10]).a : e0VarArr2[i10]);
            i10++;
        }
    }

    @Override // u2.l, u2.a
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
    public final void t(b2.p0 p0Var) {
        this.k[0].t(p0Var);
    }

    @Override // u2.l
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((n0) list.get(i10)).a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i10)).a;
            }
        }
        return null;
    }

    @Override // u2.l
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = o1Var.h();
        } else if (o1Var.h() != this.p) {
            this.r = new x4();
            return;
        }
        int length = this.q.length;
        b2.o1[] o1VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, o1VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(aVar);
        o1VarArr[num.intValue()] = o1Var;
        if (arrayList.isEmpty()) {
            n(o1VarArr[0]);
        }
    }
}
