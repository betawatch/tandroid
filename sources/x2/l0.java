package x2;

import a8.ia;
import h9.t1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class l0 implements d0, c0 {
    public final d0[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final sa.d d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public c0 h;
    public p1 n;
    public d0[] r;
    public n s;

    public l0(sa.d dVar, long[] jArr, d0... d0VarArr) {
        this.d = dVar;
        this.a = d0VarArr;
        dVar.getClass();
        h9.g0 g0Var = h9.i0.b;
        t1 t1Var = t1.e;
        this.s = new n(t1Var, t1Var);
        this.c = new IdentityHashMap();
        this.r = new d0[0];
        this.b = new boolean[d0VarArr.length];
        for (int i7 = 0; i7 < d0VarArr.length; i7++) {
            long j3 = jArr[i7];
            if (j3 != 0) {
                this.b[i7] = true;
                this.a[i7] = new n1(d0VarArr[i7], j3);
            }
        }
    }

    @Override // x2.c0
    public final void a(d0 d0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(d0Var);
        if (arrayList.isEmpty()) {
            d0[] d0VarArr = this.a;
            int i7 = 0;
            for (d0 d0Var2 : d0VarArr) {
                i7 += d0Var2.o().a;
            }
            e2.m1[] m1VarArr = new e2.m1[i7];
            int i10 = 0;
            for (int i11 = 0; i11 < d0VarArr.length; i11++) {
                p1 o4 = d0VarArr[i11].o();
                int i12 = o4.a;
                int i13 = 0;
                while (i13 < i12) {
                    e2.m1 a10 = o4.a(i13);
                    int i14 = a10.a;
                    e2.u[] uVarArr = new e2.u[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        e2.u uVar = a10.d[i15];
                        e2.t a11 = uVar.a();
                        String str = uVar.m;
                        d0[] d0VarArr2 = d0VarArr;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i11);
                        sb2.append(":");
                        String str2 = uVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb2.append(str2);
                        a11.a = sb2.toString();
                        if (str != null) {
                            a11.l = i11 + ":" + str;
                        }
                        uVarArr[i15] = new e2.u(a11);
                        i15++;
                        d0VarArr = d0VarArr2;
                    }
                    d0[] d0VarArr3 = d0VarArr;
                    e2.m1 m1Var = new e2.m1(i11 + ":" + a10.b, uVarArr);
                    this.f.put(m1Var, a10);
                    m1VarArr[i10] = m1Var;
                    i13++;
                    i10++;
                    d0VarArr = d0VarArr3;
                }
            }
            this.n = new p1(m1VarArr);
            c0 c0Var = this.h;
            c0Var.getClass();
            c0Var.a(this);
        }
    }

    @Override // x2.d0
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[uVarArr.length];
        int[] iArr3 = new int[uVarArr.length];
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int length = uVarArr.length;
            identityHashMap = this.c;
            if (i10 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i10];
            Integer num = b1Var == null ? null : (Integer) identityHashMap.get(b1Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            a3.u uVar = uVarArr[i10];
            if (uVar != null) {
                String str = uVar.c().b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = uVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[uVarArr.length];
        a3.u[] uVarArr2 = new a3.u[uVarArr.length];
        d0[] d0VarArr = this.a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < d0VarArr.length) {
            int i12 = i7;
            while (i12 < uVarArr.length) {
                b1VarArr3[i12] = iArr2[i12] == i11 ? b1VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    a3.u uVar2 = uVarArr[i12];
                    uVar2.getClass();
                    iArr = iArr2;
                    e2.m1 m1Var = (e2.m1) this.f.get(uVar2.c());
                    m1Var.getClass();
                    uVarArr2[i12] = new k0(uVar2, m1Var);
                } else {
                    iArr = iArr2;
                    uVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i13 = i11;
            long b10 = d0VarArr2[i11].b(uVarArr2, zArr, b1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = b10;
            } else if (b10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z9 = false;
            for (int i14 = 0; i14 < uVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    b1 b1Var2 = b1VarArr3[i14];
                    b1Var2.getClass();
                    b1VarArr2[i14] = b1VarArr3[i14];
                    identityHashMap.put(b1Var2, Integer.valueOf(i13));
                    z9 = true;
                } else if (iArr4[i14] == i13) {
                    ia.p(b1VarArr3[i14] == null);
                }
            }
            if (z9) {
                arrayList.add(d0VarArr2[i13]);
            }
            i11 = i13 + 1;
            d0VarArr = d0VarArr2;
            iArr2 = iArr4;
            i7 = 0;
        }
        int i15 = i7;
        System.arraycopy(b1VarArr2, i15, b1VarArr, i15, length2);
        this.r = (d0[]) arrayList.toArray(new d0[i15]);
        AbstractList y10 = h9.o.y(arrayList, new v0.j(23));
        this.d.getClass();
        this.s = new n(arrayList, y10);
        return j10;
    }

    @Override // x2.d1
    public final boolean c(l2.v0 v0Var) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.s.c(v0Var);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((d0) arrayList.get(i7)).c(v0Var);
        }
        return false;
    }

    @Override // x2.c1
    public final void d(d1 d1Var) {
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.d(this);
    }

    @Override // x2.d1
    public final long e() {
        return this.s.e();
    }

    @Override // x2.d1
    public final boolean g() {
        return this.s.g();
    }

    @Override // x2.d0
    public final long h(long j3, l2.t1 t1Var) {
        d0[] d0VarArr = this.r;
        return (d0VarArr.length > 0 ? d0VarArr[0] : this.a[0]).h(j3, t1Var);
    }

    @Override // x2.d0
    public final void i() {
        for (d0 d0Var : this.a) {
            d0Var.i();
        }
    }

    @Override // x2.d0
    public final long j(long j3) {
        long j10 = this.r[0].j(j3);
        int i7 = 1;
        while (true) {
            d0[] d0VarArr = this.r;
            if (i7 >= d0VarArr.length) {
                return j10;
            }
            if (d0VarArr[i7].j(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // x2.d0
    public final void k(long j3) {
        for (d0 d0Var : this.r) {
            d0Var.k(j3);
        }
    }

    @Override // x2.d0
    public final long n() {
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.r) {
            long n10 = d0Var.n();
            if (n10 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.r) {
                        if (d0Var2 == d0Var) {
                            break;
                        }
                        if (d0Var2.j(n10) != n10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = n10;
                } else if (n10 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.j(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override // x2.d0
    public final p1 o() {
        p1 p1Var = this.n;
        p1Var.getClass();
        return p1Var;
    }

    @Override // x2.d1
    public final long p() {
        return this.s.p();
    }

    @Override // x2.d0
    public final void q(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.e;
        d0[] d0VarArr = this.a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.q(this, j3);
        }
    }

    @Override // x2.d1
    public final void r(long j3) {
        this.s.r(j3);
    }
}
