package u2;

import com.google.android.gms.internal.cast.w4;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o0 extends l {
    public static final b2.p0 s;
    public final a[] k;
    public final ArrayList l;
    public final b2.p1[] m;
    public final ArrayList n;
    public final pa.d o;
    public int p;
    public long[][] q;
    public w4 r;

    static {
        b2.d0 d0Var = new b2.d0();
        f9.g0 g0Var = f9.i0.b;
        f9.s1 s1Var = f9.s1.e;
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var2 = f9.s1.e;
        b2.i0 i0Var = new b2.i0();
        s = new b2.p0("MergingMediaSource", new b2.f0(d0Var), null, new b2.j0(i0Var), b2.s0.L, b2.l0.d);
    }

    public o0(a... aVarArr) {
        pa.d dVar = new pa.d();
        this.k = aVarArr;
        this.o = dVar;
        this.n = new ArrayList(Arrays.asList(aVarArr));
        this.p = -1;
        this.l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.l.add(new ArrayList());
        }
        this.m = new b2.p1[aVarArr.length];
        this.q = new long[0][];
        new HashMap();
        f9.o.f(8, "expectedKeys");
        f9.o.f(2, "expectedValuesPerKey");
        new f9.k1(f9.s.b(8)).h = new f9.j1();
    }

    @Override // u2.a
    public final boolean a(b2.p0 p0Var) {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 && aVarArr[0].a(p0Var);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.p1[] p1VarArr = this.m;
        int b10 = p1VarArr[0].b(g0Var.a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(p1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, h0Var, j10 - this.q[b10][i10]);
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
        w4 w4Var = this.r;
        if (w4Var != null) {
            throw w4Var;
        }
        super.k();
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.j = c0Var;
        this.i = e2.n0.q(null);
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
    public final void x(Object obj, a aVar, b2.p1 p1Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = p1Var.h();
        } else if (p1Var.h() != this.p) {
            this.r = new w4();
            return;
        }
        int length = this.q.length;
        b2.p1[] p1VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, p1VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(aVar);
        p1VarArr[num.intValue()] = p1Var;
        if (arrayList.isEmpty()) {
            n(p1VarArr[0]);
        }
    }
}
