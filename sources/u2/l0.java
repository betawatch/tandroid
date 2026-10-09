package u2;

import i2.q1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l0 implements d0, c0 {
    public final d0[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final t7.t d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public c0 h;
    public o1 n;
    public d0[] r;
    public n s;

    public l0(t7.t tVar, long[] jArr, d0... d0VarArr) {
        this.d = tVar;
        this.a = d0VarArr;
        tVar.getClass();
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

    @Override // u2.c1
    public final void D(d1 d1Var) {
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.D(this);
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

    @Override // u2.d0
    public final long l() {
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.r) {
            long l4 = d0Var.l();
            if (l4 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.r) {
                        if (d0Var2 == d0Var) {
                            break;
                        }
                        if (d0Var2.h(l4) != l4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = l4;
                } else if (l4 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.h(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override // u2.c0
    public final void m(d0 d0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(d0Var);
        if (arrayList.isEmpty()) {
            d0[] d0VarArr = this.a;
            int i10 = 0;
            for (d0 d0Var2 : d0VarArr) {
                i10 += d0Var2.p().a;
            }
            b2.l1[] l1VarArr = new b2.l1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < d0VarArr.length; i12++) {
                o1 p5 = d0VarArr[i12].p();
                int i13 = p5.a;
                int i14 = 0;
                while (i14 < i13) {
                    b2.l1 a2 = p5.a(i14);
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
            c0Var.m(this);
        }
    }

    @Override // u2.d1
    public final boolean n(i2.s0 s0Var) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.s.n(s0Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d0) arrayList.get(i10)).n(s0Var);
        }
        return false;
    }

    @Override // u2.d0
    public final long o(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.c;
            if (i11 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i11];
            Integer num = b1Var == null ? null : (Integer) identityHashMap.get(b1Var);
            iArr2[i11] = num == null ? -1 : num.intValue();
            x2.r rVar = rVarArr[i11];
            if (rVar != null) {
                String str = rVar.b().b;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[rVarArr.length];
        x2.r[] rVarArr2 = new x2.r[rVarArr.length];
        d0[] d0VarArr = this.a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i12 = 0;
        while (i12 < d0VarArr.length) {
            int i13 = i10;
            while (i13 < rVarArr.length) {
                b1VarArr3[i13] = iArr2[i13] == i12 ? b1VarArr[i13] : null;
                if (iArr3[i13] == i12) {
                    x2.r rVar2 = rVarArr[i13];
                    rVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f.get(rVar2.b());
                    l1Var.getClass();
                    rVarArr2[i13] = new k0(rVar2, l1Var);
                } else {
                    iArr = iArr2;
                    rVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i14 = i12;
            long o9 = d0VarArr2[i12].o(rVarArr2, zArr, b1VarArr3, zArr2, j10);
            if (i14 == 0) {
                j10 = o9;
            } else if (o9 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                if (iArr3[i15] == i14) {
                    b1 b1Var2 = b1VarArr3[i15];
                    b1Var2.getClass();
                    b1VarArr2[i15] = b1VarArr3[i15];
                    identityHashMap.put(b1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    e2.d.g(b1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(d0VarArr2[i14]);
            }
            i12 = i14 + 1;
            d0VarArr = d0VarArr2;
            iArr2 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(b1VarArr2, i16, b1VarArr, i16, length2);
        this.r = (d0[]) arrayList.toArray(new d0[i16]);
        AbstractList w10 = e9.q.w(arrayList, new s0.b(15));
        this.d.getClass();
        this.s = new n(arrayList, w10);
        return j10;
    }

    @Override // u2.d0
    public final o1 p() {
        o1 o1Var = this.n;
        o1Var.getClass();
        return o1Var;
    }

    @Override // u2.d1
    public final long q() {
        return this.s.q();
    }

    @Override // u2.d0
    public final long r(long j3, q1 q1Var) {
        d0[] d0VarArr = this.r;
        return (d0VarArr.length > 0 ? d0VarArr[0] : this.a[0]).r(j3, q1Var);
    }

    @Override // u2.d1
    public final void s(long j3) {
        this.s.s(j3);
    }
}
