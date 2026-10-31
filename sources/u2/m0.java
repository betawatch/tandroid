package u2;

import e9.x1;
import i2.v1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m0 implements e0, d0 {
    public final e0[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final kb.a d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public d0 h;
    public r1 n;
    public e0[] r;
    public n s;

    public m0(kb.a aVar, long[] jArr, e0... e0VarArr) {
        this.d = aVar;
        this.a = e0VarArr;
        aVar.getClass();
        e9.l0 l0Var = e9.n0.b;
        x1 x1Var = x1.e;
        this.s = new n(x1Var, x1Var);
        this.c = new IdentityHashMap();
        this.r = new e0[0];
        this.b = new boolean[e0VarArr.length];
        for (int i10 = 0; i10 < e0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.b[i10] = true;
                this.a[i10] = new p1(e0VarArr[i10], j10);
            }
        }
    }

    @Override // u2.f1
    public final long c() {
        return this.s.c();
    }

    @Override // u2.f1
    public final boolean d() {
        return this.s.d();
    }

    @Override // u2.d0
    public final void e(e0 e0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(e0Var);
        if (arrayList.isEmpty()) {
            e0[] e0VarArr = this.a;
            int i10 = 0;
            for (e0 e0Var2 : e0VarArr) {
                i10 += e0Var2.q().a;
            }
            b2.p1[] p1VarArr = new b2.p1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < e0VarArr.length; i12++) {
                r1 q6 = e0VarArr[i12].q();
                int i13 = q6.a;
                int i14 = 0;
                while (i14 < i13) {
                    b2.p1 a2 = q6.a(i14);
                    int i15 = a2.a;
                    b2.x[] xVarArr = new b2.x[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        b2.x xVar = a2.d[i16];
                        b2.w a10 = xVar.a();
                        String str = xVar.m;
                        e0[] e0VarArr2 = e0VarArr;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        sb2.append(":");
                        String str2 = xVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb2.append(str2);
                        a10.a = sb2.toString();
                        if (str != null) {
                            a10.l = i12 + ":" + str;
                        }
                        xVarArr[i16] = new b2.x(a10);
                        i16++;
                        e0VarArr = e0VarArr2;
                    }
                    e0[] e0VarArr3 = e0VarArr;
                    b2.p1 p1Var = new b2.p1(i12 + ":" + a2.b, xVarArr);
                    this.f.put(p1Var, a2);
                    p1VarArr[i11] = p1Var;
                    i14++;
                    i11++;
                    e0VarArr = e0VarArr3;
                }
            }
            this.n = new r1(p1VarArr);
            d0 d0Var = this.h;
            d0Var.getClass();
            d0Var.e(this);
        }
    }

    @Override // u2.e0
    public final void f() {
        for (e0 e0Var : this.a) {
            e0Var.f();
        }
    }

    @Override // u2.e0
    public final long g(long j10) {
        long g10 = this.r[0].g(j10);
        int i10 = 1;
        while (true) {
            e0[] e0VarArr = this.r;
            if (i10 >= e0VarArr.length) {
                return g10;
            }
            if (e0VarArr[i10].g(g10) != g10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // u2.e0
    public final void h(long j10) {
        for (e0 e0Var : this.r) {
            e0Var.h(j10);
        }
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j10) {
        this.h = d0Var;
        ArrayList arrayList = this.e;
        e0[] e0VarArr = this.a;
        Collections.addAll(arrayList, e0VarArr);
        for (e0 e0Var : e0VarArr) {
            e0Var.j(this, j10);
        }
    }

    @Override // u2.e0
    public final long k() {
        long j10 = -9223372036854775807L;
        for (e0 e0Var : this.r) {
            long k10 = e0Var.k();
            if (k10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (e0 e0Var2 : this.r) {
                        if (e0Var2 == e0Var) {
                            break;
                        }
                        if (e0Var2.g(k10) != k10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = k10;
                } else if (k10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && e0Var.g(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // u2.f1
    public final boolean m(i2.w0 w0Var) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.s.m(w0Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e0) arrayList.get(i10)).m(w0Var);
        }
        return false;
    }

    @Override // u2.e0
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[qVarArr.length];
        int[] iArr3 = new int[qVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.c;
            if (i11 >= length) {
                break;
            }
            d1 d1Var = d1VarArr[i11];
            Integer num = d1Var == null ? null : (Integer) identityHashMap.get(d1Var);
            iArr2[i11] = num == null ? -1 : num.intValue();
            x2.q qVar = qVarArr[i11];
            if (qVar != null) {
                String str = qVar.b().b;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        d1[] d1VarArr2 = new d1[length2];
        d1[] d1VarArr3 = new d1[qVarArr.length];
        x2.q[] qVarArr2 = new x2.q[qVarArr.length];
        e0[] e0VarArr = this.a;
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < e0VarArr.length) {
            int i13 = i10;
            while (i13 < qVarArr.length) {
                d1VarArr3[i13] = iArr2[i13] == i12 ? d1VarArr[i13] : null;
                if (iArr3[i13] == i12) {
                    x2.q qVar2 = qVarArr[i13];
                    qVar2.getClass();
                    iArr = iArr2;
                    b2.p1 p1Var = (b2.p1) this.f.get(qVar2.b());
                    p1Var.getClass();
                    qVarArr2[i13] = new l0(qVar2, p1Var);
                } else {
                    iArr = iArr2;
                    qVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            e0[] e0VarArr2 = e0VarArr;
            int i14 = i12;
            long p5 = e0VarArr2[i12].p(qVarArr2, zArr, d1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = p5;
            } else if (p5 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < qVarArr.length; i15++) {
                if (iArr3[i15] == i14) {
                    d1 d1Var2 = d1VarArr3[i15];
                    d1Var2.getClass();
                    d1VarArr2[i15] = d1VarArr3[i15];
                    identityHashMap.put(d1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    t6.p(d1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(e0VarArr2[i14]);
            }
            i12 = i14 + 1;
            e0VarArr = e0VarArr2;
            iArr2 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(d1VarArr2, i16, d1VarArr, i16, length2);
        this.r = (e0[]) arrayList.toArray(new e0[i16]);
        AbstractList x10 = e9.s.x(arrayList, new th.m1(2));
        this.d.getClass();
        this.s = new n(arrayList, x10);
        return j11;
    }

    @Override // u2.e0
    public final r1 q() {
        r1 r1Var = this.n;
        r1Var.getClass();
        return r1Var;
    }

    @Override // u2.e1
    public final void r(f1 f1Var) {
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.r(this);
    }

    @Override // u2.f1
    public final long s() {
        return this.s.s();
    }

    @Override // u2.e0
    public final long t(long j10, v1 v1Var) {
        e0[] e0VarArr = this.r;
        return (e0VarArr.length > 0 ? e0VarArr[0] : this.a[0]).t(j10, v1Var);
    }

    @Override // u2.f1
    public final void u(long j10) {
        this.s.u(j10);
    }
}
