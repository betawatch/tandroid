package u2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class n0 implements d0, c0 {
    public final d0[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ob.a d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public c0 h;
    public p1 n;
    public d0[] r;
    public n s;

    public n0(ob.a aVar, long[] jArr, d0... d0VarArr) {
        this.d = aVar;
        this.a = d0VarArr;
        aVar.getClass();
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
                this.a[i10] = new o1(d0VarArr[i10], j3);
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
                i10 += d0Var2.s().a;
            }
            b2.l1[] l1VarArr = new b2.l1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < d0VarArr.length; i12++) {
                p1 s10 = d0VarArr[i12].s();
                int i13 = s10.a;
                int i14 = 0;
                while (i14 < i13) {
                    b2.l1 a2 = s10.a(i14);
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
            this.n = new p1(l1VarArr);
            c0 c0Var = this.h;
            c0Var.getClass();
            c0Var.a(this);
        }
    }

    @Override // u2.e1
    public final boolean c() {
        return this.s.c();
    }

    @Override // u2.e1
    public final long d() {
        return this.s.d();
    }

    @Override // u2.d0
    public final void g() {
        for (d0 d0Var : this.a) {
            d0Var.g();
        }
    }

    @Override // u2.d0
    public final long h(long j3) {
        long h = this.r[0].h(j3);
        int i10 = 1;
        while (true) {
            d0[] d0VarArr = this.r;
            if (i10 >= d0VarArr.length) {
                return h;
            }
            if (d0VarArr[i10].h(h) != h) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // u2.d0
    public final void i(long j3) {
        for (d0 d0Var : this.r) {
            d0Var.i(j3);
        }
    }

    @Override // u2.d0
    public final void k(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.e;
        d0[] d0VarArr = this.a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.k(this, j3);
        }
    }

    @Override // u2.d1
    public final void l(e1 e1Var) {
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.l(this);
    }

    @Override // u2.d0
    public final long m() {
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.r) {
            long m10 = d0Var.m();
            if (m10 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.r) {
                        if (d0Var2 == d0Var) {
                            break;
                        }
                        if (d0Var2.h(m10) != m10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = m10;
                } else if (m10 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.h(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override // u2.e1
    public final boolean q(i2.r0 r0Var) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.s.q(r0Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d0) arrayList.get(i10)).q(r0Var);
        }
        return false;
    }

    @Override // u2.d0
    public final long r(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[sVarArr.length];
        int[] iArr3 = new int[sVarArr.length];
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.c;
            if (i10 >= length) {
                break;
            }
            c1 c1Var = c1VarArr[i10];
            Integer num = c1Var == null ? null : (Integer) identityHashMap.get(c1Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            x2.s sVar = sVarArr[i10];
            if (sVar != null) {
                String str = sVar.b().b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        c1[] c1VarArr2 = new c1[length2];
        c1[] c1VarArr3 = new c1[sVarArr.length];
        x2.s[] sVarArr2 = new x2.s[sVarArr.length];
        d0[] d0VarArr = this.a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < d0VarArr.length) {
            int i12 = 0;
            while (i12 < sVarArr.length) {
                c1VarArr3[i12] = iArr2[i12] == i11 ? c1VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    x2.s sVar2 = sVarArr[i12];
                    sVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f.get(sVar2.b());
                    l1Var.getClass();
                    sVarArr2[i12] = new m0(sVar2, l1Var);
                } else {
                    iArr = iArr2;
                    sVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i13 = i11;
            long r10 = d0VarArr2[i11].r(sVarArr2, zArr, c1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = r10;
            } else if (r10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < sVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    c1 c1Var2 = c1VarArr3[i14];
                    c1Var2.getClass();
                    c1VarArr2[i14] = c1VarArr3[i14];
                    identityHashMap.put(c1Var2, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    e2.d.g(c1VarArr3[i14] == null);
                }
            }
            if (z10) {
                arrayList.add(d0VarArr2[i13]);
            }
            i11 = i13 + 1;
            d0VarArr = d0VarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(c1VarArr2, 0, c1VarArr, 0, length2);
        this.r = (d0[]) arrayList.toArray(new d0[0]);
        AbstractList w10 = e9.q.w(arrayList, new s0.b(17));
        this.d.getClass();
        this.s = new n(arrayList, w10);
        return j10;
    }

    @Override // u2.d0
    public final p1 s() {
        p1 p1Var = this.n;
        p1Var.getClass();
        return p1Var;
    }

    @Override // u2.e1
    public final long t() {
        return this.s.t();
    }

    @Override // u2.d0
    public final long u(long j3, i2.p1 p1Var) {
        d0[] d0VarArr = this.r;
        return (d0VarArr.length > 0 ? d0VarArr[0] : this.a[0]).u(j3, p1Var);
    }

    @Override // u2.e1
    public final void v(long j3) {
        this.s.v(j3);
    }
}
