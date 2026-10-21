package u2;

import com.google.android.gms.internal.cast.z4;
import e9.x1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class p0 extends m {
    public static final b2.o0 s;
    public final a[] k;
    public final ArrayList l;
    public final b2.o1[] m;
    public final ArrayList n;
    public final oa.d o;
    public int p;
    public long[][] q;
    public z4 r;

    static {
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.h0 h0Var = new b2.h0();
        s = new b2.o0("MergingMediaSource", new b2.e0(c0Var), null, new b2.i0(h0Var), b2.r0.L, b2.k0.d);
    }

    public p0(a... aVarArr) {
        oa.d dVar = new oa.d(24);
        this.k = aVarArr;
        this.o = dVar;
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
    public final boolean a(b2.o0 o0Var) {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 && aVarArr[0].a(o0Var);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.o1[] o1VarArr = this.m;
        int b10 = o1VarArr[0].b(g0Var.a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(o1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, eVar, j10 - this.q[b10][i10]);
            ((List) this.l.get(i10)).add(new o0(a2, e0VarArr[i10]));
        }
        return new n0(this.o, this.q[b10], e0VarArr);
    }

    @Override // u2.a
    public final b2.o0 i() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].i() : s;
    }

    @Override // u2.m, u2.a
    public final void k() {
        z4 z4Var = this.r;
        if (z4Var != null) {
            throw z4Var;
        }
        super.k();
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.j = c0Var;
        this.i = e2.m0.q(null);
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
        n0 n0Var = (n0) e0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i10 >= aVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i10);
            e0[] e0VarArr = n0Var.a;
            boolean[] zArr = n0Var.b;
            e0 e0Var2 = zArr[i10] ? ((q1) e0VarArr[i10]).a : e0VarArr[i10];
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((o0) list.get(i11)).b.equals(e0Var2)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            a aVar = aVarArr[i10];
            e0[] e0VarArr2 = n0Var.a;
            aVar.o(zArr[i10] ? ((q1) e0VarArr2[i10]).a : e0VarArr2[i10]);
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
    public final void t(b2.o0 o0Var) {
        this.k[0].t(o0Var);
    }

    @Override // u2.m
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((o0) list.get(i10)).a.equals(g0Var)) {
                return ((o0) ((List) arrayList.get(0)).get(i10)).a;
            }
        }
        return null;
    }

    @Override // u2.m
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = o1Var.h();
        } else if (o1Var.h() != this.p) {
            this.r = new z4();
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
