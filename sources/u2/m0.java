package u2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m0 implements d0, c0 {
    public final d0[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final qb.b d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public c0 h;
    public o1 n;
    public d0[] r;
    public n s;

    public m0(qb.b bVar, long[] jArr, d0... d0VarArr) {
        this.d = bVar;
        this.a = d0VarArr;
        bVar.getClass();
        e9.g0 g0Var = e9.i0.b;
        e9.a1 a1Var = e9.a1.e;
        this.s = new n(a1Var, a1Var);
        this.c = new IdentityHashMap();
        this.r = new d0[0];
        this.b = new boolean[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.b[i10] = true;
                this.a[i10] = new n1(d0VarArr[i10], j3);
            }
        }
    }

    @Override // u2.c0
    public final void a(d0 d0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(d0Var);
        if (arrayList.isEmpty()) {
            d0[] d0VarArr = this.a;
            int i10 = 0;
            for (d0 d0Var2 : d0VarArr) {
                i10 += d0Var2.r().a;
            }
            b2.l1[] l1VarArr = new b2.l1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < d0VarArr.length; i12++) {
                o1 r10 = d0VarArr[i12].r();
                int i13 = r10.a;
                int i14 = 0;
                while (i14 < i13) {
                    b2.l1 a2 = r10.a(i14);
                    int i15 = a2.a;
                    b2.s[] sVarArr = new b2.s[i15];
                    for (int i16 = 0; i16 < i15; i16++) {
                        b2.s sVar = a2.d[i16];
                        b2.r a10 = sVar.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        sb2.append(":");
                        String str = sVar.a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        a10.a = sb2.toString();
                        sVarArr[i16] = new b2.s(a10);
                    }
                    b2.l1 l1Var = new b2.l1(i12 + ":" + a2.b, sVarArr);
                    this.f.put(l1Var, a2);
                    l1VarArr[i11] = l1Var;
                    i14++;
                    i11++;
                }
            }
            this.n = new o1(l1VarArr);
            c0 c0Var = this.h;
            c0Var.getClass();
            c0Var.a(this);
        }
    }

    @Override // u2.c1
    public final void b(d1 d1Var) {
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override // u2.d1
    public final boolean c() {
        return this.s.c();
    }

    @Override // u2.d1
    public final long d() {
        return this.s.d();
    }

    @Override // u2.d0
    public final void j() {
        for (d0 d0Var : this.a) {
            d0Var.j();
        }
    }

    @Override // u2.d0
    public final long k(long j3) {
        long k10 = this.r[0].k(j3);
        int i10 = 1;
        while (true) {
            d0[] d0VarArr = this.r;
            if (i10 >= d0VarArr.length) {
                return k10;
            }
            if (d0VarArr[i10].k(k10) != k10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // u2.d0
    public final void l(long j3) {
        for (d0 d0Var : this.r) {
            d0Var.l(j3);
        }
    }

    @Override // u2.d0
    public final void n(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.e;
        d0[] d0VarArr = this.a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.n(this, j3);
        }
    }

    @Override // u2.d0
    public final long o() {
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.r) {
            long o9 = d0Var.o();
            if (o9 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.r) {
                        if (d0Var2 == d0Var) {
                            break;
                        }
                        if (d0Var2.k(o9) != o9) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = o9;
                } else if (o9 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.k(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override // u2.d1
    public final boolean p(i2.r0 r0Var) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.s.p(r0Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d0) arrayList.get(i10)).p(r0Var);
        }
        return false;
    }

    @Override // u2.d0
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.c;
            if (i10 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i10];
            Integer num = b1Var == null ? null : (Integer) identityHashMap.get(b1Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            x2.r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.b().b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[rVarArr.length];
        x2.r[] rVarArr2 = new x2.r[rVarArr.length];
        d0[] d0VarArr = this.a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < d0VarArr.length) {
            int i12 = 0;
            while (i12 < rVarArr.length) {
                b1VarArr3[i12] = iArr2[i12] == i11 ? b1VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    x2.r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f.get(rVar2.b());
                    l1Var.getClass();
                    rVarArr2[i12] = new l0(rVar2, l1Var);
                } else {
                    iArr = iArr2;
                    rVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i13 = i11;
            long q6 = d0VarArr2[i11].q(rVarArr2, zArr, b1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = q6;
            } else if (q6 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    b1 b1Var2 = b1VarArr3[i14];
                    b1Var2.getClass();
                    b1VarArr2[i14] = b1VarArr3[i14];
                    identityHashMap.put(b1Var2, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    e2.d.g(b1VarArr3[i14] == null);
                }
            }
            if (z10) {
                arrayList.add(d0VarArr2[i13]);
            }
            i11 = i13 + 1;
            d0VarArr = d0VarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(b1VarArr2, 0, b1VarArr, 0, length2);
        this.r = (d0[]) arrayList.toArray(new d0[0]);
        AbstractList w10 = e9.q.w(arrayList, new t0.a(3));
        this.d.getClass();
        this.s = new n(arrayList, w10);
        return j10;
    }

    @Override // u2.d0
    public final o1 r() {
        o1 o1Var = this.n;
        o1Var.getClass();
        return o1Var;
    }

    @Override // u2.d1
    public final long s() {
        return this.s.s();
    }

    @Override // u2.d0
    public final long t(long j3, i2.p1 p1Var) {
        d0[] d0VarArr = this.r;
        return (d0VarArr.length > 0 ? d0VarArr[0] : this.a[0]).t(j3, p1Var);
    }

    @Override // u2.d1
    public final void u(long j3) {
        this.s.u(j3);
    }
}
