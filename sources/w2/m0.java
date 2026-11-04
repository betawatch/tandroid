package w2;

import b8.zb;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 implements e0, d0 {
    public final e0[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ra.e d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public d0 h;
    public r1 n;
    public e0[] r;
    public n s;

    public m0(ra.e eVar, long[] jArr, e0... e0VarArr) {
        this.d = eVar;
        this.a = e0VarArr;
        eVar.getClass();
        g9.g0 g0Var = g9.i0.b;
        g9.s1 s1Var = g9.s1.e;
        this.s = new n(s1Var, s1Var);
        this.c = new IdentityHashMap();
        this.r = new e0[0];
        this.b = new boolean[e0VarArr.length];
        for (int i3 = 0; i3 < e0VarArr.length; i3++) {
            long j10 = jArr[i3];
            if (j10 != 0) {
                this.b[i3] = true;
                this.a[i3] = new p1(e0VarArr[i3], j10);
            }
        }
    }

    @Override // w2.d0
    public final void b(e0 e0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(e0Var);
        if (arrayList.isEmpty()) {
            e0[] e0VarArr = this.a;
            int i3 = 0;
            for (e0 e0Var2 : e0VarArr) {
                i3 += e0Var2.p().a;
            }
            d2.o1[] o1VarArr = new d2.o1[i3];
            int i10 = 0;
            for (int i11 = 0; i11 < e0VarArr.length; i11++) {
                r1 p10 = e0VarArr[i11].p();
                int i12 = p10.a;
                int i13 = 0;
                while (i13 < i12) {
                    d2.o1 a10 = p10.a(i13);
                    int i14 = a10.a;
                    d2.v[] vVarArr = new d2.v[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        d2.v vVar = a10.d[i15];
                        d2.u a11 = vVar.a();
                        String str = vVar.m;
                        e0[] e0VarArr2 = e0VarArr;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i11);
                        sb2.append(":");
                        String str2 = vVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb2.append(str2);
                        a11.a = sb2.toString();
                        if (str != null) {
                            a11.l = i11 + ":" + str;
                        }
                        vVarArr[i15] = new d2.v(a11);
                        i15++;
                        e0VarArr = e0VarArr2;
                    }
                    e0[] e0VarArr3 = e0VarArr;
                    d2.o1 o1Var = new d2.o1(i11 + ":" + a10.b, vVarArr);
                    this.f.put(o1Var, a10);
                    o1VarArr[i10] = o1Var;
                    i13++;
                    i10++;
                    e0VarArr = e0VarArr3;
                }
            }
            this.n = new r1(o1VarArr);
            d0 d0Var = this.h;
            d0Var.getClass();
            d0Var.b(this);
        }
    }

    @Override // w2.f1
    public final boolean c(k2.v0 v0Var) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.s.c(v0Var);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((e0) arrayList.get(i3)).c(v0Var);
        }
        return false;
    }

    @Override // w2.f1
    public final boolean d() {
        return this.s.d();
    }

    @Override // w2.f1
    public final long e() {
        return this.s.e();
    }

    @Override // w2.e0
    public final void g() {
        for (e0 e0Var : this.a) {
            e0Var.g();
        }
    }

    @Override // w2.e0
    public final void i(d0 d0Var, long j10) {
        this.h = d0Var;
        ArrayList arrayList = this.e;
        e0[] e0VarArr = this.a;
        Collections.addAll(arrayList, e0VarArr);
        for (e0 e0Var : e0VarArr) {
            e0Var.i(this, j10);
        }
    }

    @Override // w2.e0
    public final long j(long j10) {
        long j11 = this.r[0].j(j10);
        int i3 = 1;
        while (true) {
            e0[] e0VarArr = this.r;
            if (i3 >= e0VarArr.length) {
                return j11;
            }
            if (e0VarArr[i3].j(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i3++;
        }
    }

    @Override // w2.e1
    public final void k(f1 f1Var) {
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.k(this);
    }

    @Override // w2.e0
    public final void l(long j10) {
        for (e0 e0Var : this.r) {
            e0Var.l(j10);
        }
    }

    @Override // w2.e0
    public final long n() {
        long j10 = -9223372036854775807L;
        for (e0 e0Var : this.r) {
            long n4 = e0Var.n();
            if (n4 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (e0 e0Var2 : this.r) {
                        if (e0Var2 == e0Var) {
                            break;
                        }
                        if (e0Var2.j(n4) != n4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = n4;
                } else if (n4 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && e0Var.j(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // w2.e0
    public final r1 p() {
        r1 r1Var = this.n;
        r1Var.getClass();
        return r1Var;
    }

    @Override // w2.f1
    public final long q() {
        return this.s.q();
    }

    @Override // w2.e0
    public final long r(long j10, k2.t1 t1Var) {
        e0[] e0VarArr = this.r;
        return (e0VarArr.length > 0 ? e0VarArr[0] : this.a[0]).r(j10, t1Var);
    }

    @Override // w2.e0
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[pVarArr.length];
        int[] iArr3 = new int[pVarArr.length];
        int i3 = 0;
        int i10 = 0;
        while (true) {
            int length = pVarArr.length;
            identityHashMap = this.c;
            if (i10 >= length) {
                break;
            }
            d1 d1Var = d1VarArr[i10];
            Integer num = d1Var == null ? null : (Integer) identityHashMap.get(d1Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            z2.p pVar = pVarArr[i10];
            if (pVar != null) {
                String str = pVar.b().b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = pVarArr.length;
        d1[] d1VarArr2 = new d1[length2];
        d1[] d1VarArr3 = new d1[pVarArr.length];
        z2.p[] pVarArr2 = new z2.p[pVarArr.length];
        e0[] e0VarArr = this.a;
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < e0VarArr.length) {
            int i12 = i3;
            while (i12 < pVarArr.length) {
                d1VarArr3[i12] = iArr2[i12] == i11 ? d1VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    z2.p pVar2 = pVarArr[i12];
                    pVar2.getClass();
                    iArr = iArr2;
                    d2.o1 o1Var = (d2.o1) this.f.get(pVar2.b());
                    o1Var.getClass();
                    pVarArr2[i12] = new l0(pVar2, o1Var);
                } else {
                    iArr = iArr2;
                    pVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            e0[] e0VarArr2 = e0VarArr;
            int i13 = i11;
            long s6 = e0VarArr2[i11].s(pVarArr2, zArr, d1VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = s6;
            } else if (s6 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < pVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    d1 d1Var2 = d1VarArr3[i14];
                    d1Var2.getClass();
                    d1VarArr2[i14] = d1VarArr3[i14];
                    identityHashMap.put(d1Var2, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    zb.p(d1VarArr3[i14] == null);
                }
            }
            if (z10) {
                arrayList.add(e0VarArr2[i13]);
            }
            i11 = i13 + 1;
            e0VarArr = e0VarArr2;
            iArr2 = iArr4;
            i3 = 0;
        }
        int i15 = i3;
        System.arraycopy(d1VarArr2, i15, d1VarArr, i15, length2);
        this.r = (e0[]) arrayList.toArray(new e0[i15]);
        AbstractList y9 = g9.o.y(arrayList, new u9.j(13));
        this.d.getClass();
        this.s = new n(arrayList, y9);
        return j11;
    }

    @Override // w2.f1
    public final void t(long j10) {
        this.s.t(j10);
    }
}
