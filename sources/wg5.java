// default package

import android.net.Uri;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wg5 implements xt6, oh5 {
    public final boolean E;
    public final ig8 F;
    public final kj4 G = new kj4((Object) this, (byte) 7);
    public wt6 H;
    public int I;
    public u1c J;
    public vh5[] K;
    public vh5[] L;
    public int M;
    public er2 N;
    public final long O;
    public final ib3 a;
    public final mb3 b;
    public final z8d c;
    public final v2c d;
    public final pr3 e;
    public final mr3 f;
    public final z6f h;
    public final lp n;
    public final rx6 r;
    public final IdentityHashMap s;
    public final pq8 w;
    public final sg7 x;
    public final boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public wg5(ib3 ib3Var, mb3 mb3Var, z8d z8dVar, v2c v2cVar, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, rx6 rx6Var, sg7 sg7Var, boolean z, int i, ig8 ig8Var) {
        this.a = ib3Var;
        this.b = mb3Var;
        this.c = z8dVar;
        this.d = v2cVar;
        this.e = pr3Var;
        this.f = mr3Var;
        this.h = z6fVar;
        this.n = lpVar;
        this.r = rx6Var;
        this.x = sg7Var;
        this.y = z;
        this.E = i;
        this.F = ig8Var;
        sg7Var.getClass();
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        this.N = new er2(j99Var, j99Var);
        this.s = new IdentityHashMap();
        this.w = new pq8((byte) 22);
        this.K = new vh5[0];
        this.L = new vh5[0];
        this.O = Long.MIN_VALUE;
    }

    public static ko4 g(ko4 ko4Var, ko4 ko4Var2, boolean z) {
        vf7 vf7Var;
        int i;
        String str;
        String str2;
        po5 po5Var;
        int i2;
        int i3;
        String str3;
        int i4;
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        int i5 = -1;
        if (ko4Var2 != null) {
            str2 = ko4Var2.l;
            vf7Var = ko4Var2.m;
            i2 = ko4Var2.N;
            i = ko4Var2.e;
            i3 = ko4Var2.f;
            str = ko4Var2.d;
            str3 = ko4Var2.b;
            po5Var = ko4Var2.c;
        } else {
            String w = gcc.w(1, ko4Var.l);
            vf7Var = ko4Var.m;
            if (z) {
                i2 = ko4Var.N;
                i = ko4Var.e;
                i3 = ko4Var.f;
                str = ko4Var.d;
                str3 = ko4Var.b;
                str2 = w;
                po5Var = ko4Var.c;
            } else {
                i = 0;
                str = null;
                str2 = w;
                po5Var = j99Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String d = eg7.d(str2);
        if (z) {
            int i6 = ko4Var.i;
            i5 = ko4Var.j;
            i4 = i6;
        } else {
            i4 = -1;
        }
        jo4 jo4Var = new jo4();
        jo4Var.a = ko4Var.a;
        jo4Var.b = str3;
        jo4Var.c = po5.q(po5Var);
        jo4Var.r = eg7.n(ko4Var.s);
        jo4Var.s = eg7.n(d);
        jo4Var.k = str2;
        jo4Var.l = vf7Var;
        jo4Var.i = i4;
        jo4Var.j = i5;
        jo4Var.M = i2;
        jo4Var.e = i;
        jo4Var.f = i3;
        jo4Var.d = str;
        return new ko4(jo4Var);
    }

    @Override // oh5
    public final void a() {
        for (vh5 vh5Var : this.K) {
            rx6 rx6Var = vh5Var.s;
            sg5 sg5Var = vh5Var.d;
            ArrayList arrayList = vh5Var.E;
            if (!arrayList.isEmpty()) {
                vg5 vg5Var = (vg5) dqe.b(arrayList);
                int c = sg5Var.c(vg5Var);
                int i = vg5Var.F;
                char c2 = 1;
                if (c == 1) {
                    if (!vg5Var.h()) {
                        yve.p(i != -1);
                        fh5 b = sg5Var.g.b(vg5Var.y, false);
                        b.getClass();
                        po5 po5Var = b.r;
                        int i2 = (int) (vg5Var.s - b.k);
                        vg5Var.b0 = i2 < 0 ? 0L : ((ah5) (i2 < po5Var.size() ? ((ch5) po5Var.get(i2)).y : b.s).get(i)).c;
                    }
                } else if (c == 0) {
                    vh5Var.I.post(new tg5(vh5Var, vg5Var, c2 == true ? 1 : 0));
                } else if (c == 2 && !vh5Var.k0 && rx6Var.Z()) {
                    rx6Var.u();
                }
            }
        }
        this.H.f(this);
    }

    @Override // oh5
    public final boolean b(Uri uri, ed edVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        ha6 ha6Var;
        int u;
        vh5[] vh5VarArr = this.K;
        int length = vh5VarArr.length;
        int i2 = 0;
        boolean z4 = false;
        while (i2 < length) {
            vh5 vh5Var = vh5VarArr[i2];
            sg5 sg5Var = vh5Var.d;
            qh5[] qh5VarArr = sg5Var.e;
            HashMap hashMap = sg5Var.g.d;
            int length2 = qh5VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                qh5 qh5Var = qh5VarArr[i3];
                lb3 lb3Var = (lb3) hashMap.get(uri);
                if (qh5Var.equals(lb3Var != null ? lb3Var.a : null)) {
                    if (z) {
                        ha6Var = null;
                    } else {
                        ga6 a = sg5Var.a(uri);
                        vh5Var.r.getClass();
                        ha6Var = z6f.u3(a, edVar);
                    }
                    sg5Var.p = uri;
                    if (ha6Var != null) {
                        byte b = ha6Var.a;
                        ug5 ug5Var = sg5Var.h;
                        if (ug5Var == null || !ug5Var.k) {
                            ug5Var = null;
                        }
                        i = i2;
                        boolean z5 = false;
                        long j = ha6Var.b;
                        if (b == 1) {
                            z2 = false;
                            if (ug5Var != null) {
                                sg5Var.s.f();
                                z3 = ug5Var.a(j);
                            } else {
                                lb3 lb3Var2 = (lb3) hashMap.get(uri);
                                if (lb3Var2 != null) {
                                    z3 = lb3Var2.a(j, uri, null);
                                }
                            }
                        } else {
                            if (b != 2) {
                                grb.i(uh9.k(b, "Invalid fallback selection type: "));
                                return false;
                            }
                            int i4 = 0;
                            while (true) {
                                if (i4 >= qh5VarArr.length) {
                                    z2 = z5;
                                    i4 = -1;
                                    break;
                                }
                                qh5 qh5Var2 = qh5VarArr[i4];
                                z2 = z5;
                                lb3 lb3Var3 = (lb3) hashMap.get(uri);
                                if (qh5Var2.equals(lb3Var3 != null ? lb3Var3.a : null)) {
                                    break;
                                }
                                i4++;
                                z5 = z2;
                            }
                            if (i4 != -1 && (u = sg5Var.s.u(i4)) != -1 && sg5Var.s.p(u, j)) {
                                lb3 lb3Var4 = (lb3) hashMap.get(uri);
                                if (lb3Var4 != null ? lb3Var4.a(j, uri, null) : z2) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
            i = i2;
            z2 = false;
            z3 = z2;
            z4 |= z3;
            i2 = i + 1;
        }
        this.H.f(this);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0272, code lost:
    
        if (r3.m() != r12.i.a(r6.d)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x011a, code lost:
    
        if (r45 == r3.g0) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x032d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // xt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(e74[] e74VarArr, boolean[] zArr, at9[] at9VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        at9[] at9VarArr2;
        int[] iArr;
        boolean z;
        ?? r9;
        sg5 sg5Var;
        int i;
        int i2;
        at9[] at9VarArr3;
        int i3;
        int[] iArr2;
        vh5[] vh5VarArr;
        vh5 vh5Var;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        ?? r10;
        int i7;
        e74[] e74VarArr2;
        int[] iArr3 = new int[e74VarArr.length];
        int[] iArr4 = new int[e74VarArr.length];
        int i8 = 0;
        while (true) {
            int length = e74VarArr.length;
            identityHashMap = this.s;
            if (i8 >= length) {
                break;
            }
            at9 at9Var = at9VarArr[i8];
            iArr3[i8] = at9Var == null ? -1 : ((Integer) identityHashMap.get(at9Var)).intValue();
            iArr4[i8] = -1;
            e74 e74Var = e74VarArr[i8];
            if (e74Var != null) {
                t1c c = e74Var.c();
                int i9 = 0;
                while (true) {
                    vh5[] vh5VarArr2 = this.K;
                    if (i9 < vh5VarArr2.length) {
                        vh5 vh5Var2 = vh5VarArr2[i9];
                        vh5Var2.g();
                        if (vh5Var2.Z.b(c) != -1) {
                            iArr4[i8] = i9;
                            break;
                        }
                        i9++;
                    }
                }
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = e74VarArr.length;
        at9[] at9VarArr4 = new at9[length2];
        int length3 = e74VarArr.length;
        at9[] at9VarArr5 = new at9[length3];
        int length4 = e74VarArr.length;
        e74[] e74VarArr3 = new e74[length4];
        boolean z5 = false;
        vh5[] vh5VarArr3 = new vh5[this.K.length];
        int i10 = length3;
        int i11 = 0;
        int i12 = 0;
        boolean z6 = false;
        while (i11 < this.K.length) {
            int i13 = length2;
            ?? r7 = z5;
            while (true) {
                at9VarArr2 = at9VarArr4;
                if (r7 >= e74VarArr.length) {
                    break;
                }
                at9VarArr5[r7] = iArr3[r7] == i11 ? at9VarArr[r7] : null;
                e74VarArr3[r7] = iArr4[r7] == i11 ? e74VarArr[r7] : null;
                at9VarArr4 = at9VarArr2;
                r7++;
            }
            vh5 vh5Var3 = this.K[i11];
            rx6 rx6Var = vh5Var3.s;
            int i14 = i11;
            sg5 sg5Var2 = vh5Var3.d;
            qh5[] qh5VarArr = sg5Var2.e;
            mb3 mb3Var = sg5Var2.g;
            ArrayList arrayList = vh5Var3.E;
            vh5Var3.g();
            int i15 = vh5Var3.V;
            ?? r29 = at9VarArr5;
            ?? r72 = z5;
            while (r72 < length4) {
                rh5 rh5Var = (rh5) r29[r72];
                if (rh5Var == null || (e74VarArr3[r72] != null && zArr[r72])) {
                    i7 = r72;
                    e74VarArr2 = e74VarArr3;
                } else {
                    i7 = r72;
                    vh5Var3.V--;
                    e74VarArr2 = e74VarArr3;
                    if (rh5Var.c != -1) {
                        vh5 vh5Var4 = rh5Var.b;
                        int i16 = rh5Var.a;
                        vh5Var4.g();
                        vh5Var4.b0.getClass();
                        int i17 = vh5Var4.b0[i16];
                        if (i17 >= 0) {
                            yve.p(vh5Var4.e0[i17]);
                            vh5Var4.e0[i17] = z5;
                        }
                        rh5Var.c = -1;
                    }
                    r29[i7] = 0;
                }
                e74VarArr3 = e74VarArr2;
                r72 = i7 + 1;
            }
            e74[] e74VarArr4 = e74VarArr3;
            boolean z7 = true;
            if (!z6) {
                if (!vh5Var3.j0) {
                    iArr = iArr3;
                } else if (i15 != 0) {
                    iArr = iArr3;
                }
                z = z5;
                e74 e74Var2 = sg5Var2.s;
                boolean z8 = z;
                e74 e74Var3 = e74Var2;
                r9 = z5;
                while (r9 < length4) {
                    int i18 = r9;
                    e74 e74Var4 = e74VarArr4[i18];
                    int i19 = length4;
                    if (e74Var4 != null) {
                        boolean z9 = z8;
                        int b = vh5Var3.Z.b(e74Var4.c());
                        if (b == vh5Var3.c0) {
                            Uri b2 = qh5VarArr[sg5Var2.s.m()].b();
                            lb3 lb3Var = (lb3) mb3Var.d.get(b2);
                            if (lb3Var != null) {
                                HashMap hashMap = lb3Var.b;
                                yve.p(hashMap.containsKey(b2));
                                kb3 kb3Var = (kb3) hashMap.get(b2);
                                kb3Var.getClass();
                                kb3Var.x = z5;
                            }
                            sg5Var2.s = e74Var4;
                            e74Var3 = e74Var4;
                        }
                        if (r29[i18] == 0) {
                            vh5Var3.V++;
                            rh5 rh5Var2 = new rh5(vh5Var3, b);
                            r29[i18] = rh5Var2;
                            zArr2[i18] = z7;
                            if (vh5Var3.b0 != null) {
                                rh5Var2.b();
                                int i20 = vh5Var3.b0[b];
                                if (!z9 && i20 >= 0) {
                                    uh5 uh5Var = vh5Var3.M[i20];
                                    z8 = (uh5Var.v() == 0 || uh5Var.J(j, z7)) ? false : true;
                                }
                            }
                        }
                        z8 = z9;
                    }
                    length4 = i19;
                    z5 = false;
                    z7 = true;
                    r9 = i18 + 1;
                }
                int i21 = length4;
                boolean z10 = z8;
                if (vh5Var3.V != 0) {
                    Uri b3 = qh5VarArr[sg5Var2.s.m()].b();
                    lb3 lb3Var2 = (lb3) mb3Var.d.get(b3);
                    if (lb3Var2 != null) {
                        HashMap hashMap2 = lb3Var2.b;
                        yve.p(hashMap2.containsKey(b3));
                        kb3 kb3Var2 = (kb3) hashMap2.get(b3);
                        kb3Var2.getClass();
                        kb3Var2.x = false;
                    }
                    sg5Var2.o = null;
                    vh5Var3.X = null;
                    vh5Var3.i0 = true;
                    arrayList.clear();
                    if (rx6Var.Z()) {
                        if (vh5Var3.T) {
                            for (uh5 uh5Var2 : vh5Var3.M) {
                                uh5Var2.l();
                            }
                        }
                        rx6Var.u();
                    } else {
                        vh5Var3.E();
                    }
                    sg5Var = sg5Var2;
                    i4 = i10;
                    i2 = i13;
                    at9VarArr3 = at9VarArr2;
                    i3 = i14;
                    z2 = z10;
                    iArr2 = iArr4;
                    vh5VarArr = vh5VarArr3;
                    vh5Var = vh5Var3;
                } else {
                    boolean z11 = true;
                    if (arrayList.isEmpty() || Objects.equals(e74Var3, e74Var2)) {
                        sg5Var = sg5Var2;
                        i = i10;
                        i2 = i13;
                        at9VarArr3 = at9VarArr2;
                        i3 = i14;
                        iArr2 = iArr4;
                        vh5VarArr = vh5VarArr3;
                        vh5Var = vh5Var3;
                    } else {
                        if (vh5Var3.j0) {
                            sg5Var = sg5Var2;
                            i = i10;
                            i2 = i13;
                            at9VarArr3 = at9VarArr2;
                            i3 = i14;
                            iArr2 = iArr4;
                            vh5VarArr = vh5VarArr3;
                            vh5Var = vh5Var3;
                        } else {
                            long j2 = j < 0 ? -j : 0L;
                            vg5 x = vh5Var3.x();
                            long j3 = j2;
                            gm6[] b4 = sg5Var2.b(x, j);
                            sg5Var = sg5Var2;
                            List list = vh5Var3.F;
                            i = i10;
                            i2 = i13;
                            at9VarArr3 = at9VarArr2;
                            i3 = i14;
                            iArr2 = iArr4;
                            vh5VarArr = vh5VarArr3;
                            vh5Var = vh5Var3;
                            e74 e74Var5 = e74Var3;
                            e74Var5.b(j, j3, -9223372036854775807L, list, b4);
                            z11 = true;
                        }
                        vh5Var.i0 = z11;
                        z3 = z11;
                        z2 = z3;
                        if (z2) {
                            i4 = i;
                        } else {
                            vh5Var.F(j, z3);
                            i4 = i;
                            int i22 = 0;
                            while (i22 < i4) {
                                if (r29[i22] != 0) {
                                    zArr2[i22] = z11;
                                }
                                i22++;
                                z11 = true;
                            }
                        }
                    }
                    z3 = z6;
                    z2 = z10;
                    if (z2) {
                    }
                }
                ArrayList arrayList2 = vh5Var.J;
                arrayList2.clear();
                for (i5 = 0; i5 < i4; i5++) {
                    ?? r8 = r29[i5];
                    if (r8 != 0) {
                        arrayList2.add((rh5) r8);
                    }
                }
                vh5Var.j0 = true;
                i6 = 0;
                z4 = false;
                while (i6 < e74VarArr.length) {
                    ?? r82 = r29[i6];
                    int i23 = i3;
                    if (iArr2[i6] == i23) {
                        r82.getClass();
                        r10 = at9VarArr3;
                        r10[i6] = r82;
                        identityHashMap.put(r82, Integer.valueOf(i23));
                        z4 = true;
                    } else {
                        r10 = at9VarArr3;
                        if (iArr[i6] == i23) {
                            yve.p(r82 == 0);
                        }
                    }
                    i6++;
                    at9VarArr3 = r10;
                    i3 = i23;
                }
                at9[] at9VarArr6 = at9VarArr3;
                int i24 = i3;
                if (!z4) {
                    int i25 = i12;
                    vh5VarArr[i25] = vh5Var;
                    i12 = i25 + 1;
                    if (i25 == 0) {
                        sg5Var.m = true;
                        if (!z2) {
                            vh5[] vh5VarArr4 = this.L;
                            if (vh5VarArr4.length != 0 && vh5Var == vh5VarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.w.b).clear();
                        z6 = true;
                    } else {
                        sg5Var.m = i24 < this.M;
                    }
                }
                i11 = i24 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                vh5VarArr3 = vh5VarArr;
                at9VarArr5 = r29;
                e74VarArr3 = e74VarArr4;
                length2 = i2;
                z5 = false;
                i10 = i4;
                at9VarArr4 = at9VarArr6;
                length4 = i21;
            }
            iArr = iArr3;
            z = true;
            e74 e74Var22 = sg5Var2.s;
            boolean z82 = z;
            e74 e74Var32 = e74Var22;
            r9 = z5;
            while (r9 < length4) {
            }
            int i212 = length4;
            boolean z102 = z82;
            if (vh5Var3.V != 0) {
            }
            ArrayList arrayList22 = vh5Var.J;
            arrayList22.clear();
            while (i5 < i4) {
            }
            vh5Var.j0 = true;
            i6 = 0;
            z4 = false;
            while (i6 < e74VarArr.length) {
            }
            at9[] at9VarArr62 = at9VarArr3;
            int i242 = i3;
            if (!z4) {
            }
            i11 = i242 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            vh5VarArr3 = vh5VarArr;
            at9VarArr5 = r29;
            e74VarArr3 = e74VarArr4;
            length2 = i2;
            z5 = false;
            i10 = i4;
            at9VarArr4 = at9VarArr62;
            length4 = i212;
        }
        boolean z12 = z5;
        System.arraycopy(at9VarArr4, z12 ? 1 : 0, at9VarArr, z12 ? 1 : 0, length2);
        vh5[] vh5VarArr5 = (vh5[]) gcc.V(i12, vh5VarArr3);
        this.L = vh5VarArr5;
        j99 r = po5.r(vh5VarArr5);
        AbstractList b5 = ose.b(r, new p31((byte) 8));
        this.x.getClass();
        this.N = new er2(r, b5);
        return j;
    }

    @Override // i8a
    public final boolean e() {
        return this.N.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vh5 f(String str, int i, qh5[] qh5VarArr, ko4[] ko4VarArr, ko4 ko4Var, List list, Map map, long j) {
        boolean z;
        vh5 vh5Var = new vh5(str, i, this.G, new sg5(this.a, this.b, qh5VarArr, ko4VarArr, this.c, this.d, this.w, list, this.F), map, this.r, j, ko4Var, this.e, this.f, this.h, this.n, this.E ? 1 : 0, null);
        boolean z2 = vh5Var.k0;
        long j2 = this.O;
        if (z2) {
            long j3 = vh5Var.l0;
            if (j3 != Long.MIN_VALUE && (j2 == Long.MIN_VALUE || j2 > j3)) {
                z = true;
                vh5Var.l0 = j2;
                if (vh5Var.T) {
                    for (uh5 uh5Var : vh5Var.M) {
                        uh5Var.K(j2);
                    }
                }
                if (z) {
                    vh5Var.k0 = false;
                    vh5Var.c.f(vh5Var);
                }
                return vh5Var;
            }
        }
        z = false;
        vh5Var.l0 = j2;
        if (vh5Var.T) {
        }
        if (z) {
        }
        return vh5Var;
    }

    @Override // i8a
    public final long h() {
        return this.N.h();
    }

    @Override // xt6
    public final long j(long j, az9 az9Var) {
        vh5[] vh5VarArr = this.L;
        int length = vh5VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            vh5 vh5Var = vh5VarArr[i];
            if (vh5Var.R == 2) {
                sg5 sg5Var = vh5Var.d;
                mb3 mb3Var = sg5Var.g;
                int d = sg5Var.s.d();
                qh5[] qh5VarArr = sg5Var.e;
                fh5 b = (d >= qh5VarArr.length || d == -1) ? null : mb3Var.b(qh5VarArr[sg5Var.s.m()].b(), true);
                if (b != null) {
                    po5 po5Var = b.r;
                    if (!po5Var.isEmpty()) {
                        long j2 = b.h - mb3Var.M;
                        long j3 = j - j2;
                        int d2 = gcc.d(po5Var, Long.valueOf(j3), true);
                        long j4 = ((ch5) po5Var.get(d2)).e;
                        return az9Var.a(j3, j4, (!b.c || d2 == po5Var.size() - 1) ? j4 : ((ch5) po5Var.get(d2 + 1)).e) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // xt6
    public final void l() {
        for (vh5 vh5Var : this.K) {
            vh5Var.B();
            if (vh5Var.k0 && !vh5Var.U) {
                throw hy7.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // xt6
    public final long m(long j) {
        vh5[] vh5VarArr = this.L;
        if (vh5VarArr.length > 0) {
            boolean F = vh5VarArr[0].F(j, false);
            int i = 1;
            while (true) {
                vh5[] vh5VarArr2 = this.L;
                if (i >= vh5VarArr2.length) {
                    break;
                }
                vh5VarArr2[i].F(j, F);
                i++;
            }
            if (F) {
                ((SparseArray) this.w.b).clear();
            }
        }
        return j;
    }

    @Override // xt6
    public final void n(long j) {
        for (vh5 vh5Var : this.L) {
            if (vh5Var.T && !vh5Var.z()) {
                int length = vh5Var.M.length;
                for (int i = 0; i < length; i++) {
                    vh5Var.M[i].k(j, vh5Var.e0[i]);
                }
            }
        }
    }

    @Override // xt6
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // xt6
    public final void q(wt6 wt6Var, long j) {
        String str;
        ib3 ib3Var;
        boolean z;
        Map map;
        vh5[] vh5VarArr;
        int i;
        ArrayList arrayList;
        int i2;
        po5 po5Var;
        Map map2;
        ArrayList arrayList2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        int i3;
        List list;
        this.H = wt6Var;
        mb3 mb3Var = this.b;
        mb3Var.e.add(this);
        jh5 jh5Var = mb3Var.w;
        jh5Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        po5 c = mb3Var.c(0);
        c.getClass();
        po5 c2 = mb3Var.c(2);
        c2.getClass();
        po5 c3 = mb3Var.c(3);
        c3.getClass();
        boolean isEmpty = c.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        ib3 ib3Var2 = this.a;
        boolean z4 = this.y;
        if (isEmpty) {
            str = "ID3";
            ib3Var = ib3Var2;
            z = z4;
            map = map3;
        } else {
            ko4 ko4Var = jh5Var.j;
            List list2 = jh5Var.k;
            int size = c.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < c.size(); i6++) {
                ko4 ko4Var2 = ((qh5) c.get(i6)).a.a;
                int i7 = ko4Var2.B;
                String str2 = ko4Var2.l;
                if (i7 > 0 || gcc.w(2, str2) != null) {
                    iArr[i6] = 2;
                    i4++;
                    i5 = i5;
                } else if (gcc.w(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i8 = i5;
            if (i4 > 0) {
                z3 = false;
                i3 = i4;
                z2 = true;
            } else if (i8 < size) {
                int i9 = size - i8;
                z2 = false;
                i3 = i9;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
                i3 = size;
            }
            qh5[] qh5VarArr = new qh5[i3];
            ko4[] ko4VarArr = new ko4[i3];
            int i10 = 0;
            boolean z5 = z2;
            int i11 = 0;
            while (i11 < c.size()) {
                if (z5) {
                    list = list2;
                    if (iArr[i11] != 2) {
                        i11++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z3 || iArr[i11] != 1) {
                    qh5 qh5Var = (qh5) c.get(i11);
                    qh5VarArr[i10] = qh5Var;
                    ko4VarArr[i10] = qh5Var.a.a;
                    i10++;
                }
                i11++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = ko4VarArr[0].l;
            int v = gcc.v(2, str3);
            int v2 = gcc.v(1, str3);
            boolean z6 = (v2 == 1 || (v2 == 0 && c2.isEmpty())) && v <= 1 && v2 + v > 0;
            z = z4;
            vh5 f = f("main", (z5 || v2 <= 0) ? 0 : 1, qh5VarArr, ko4VarArr, ko4Var, list3, map3, j);
            arrayList3.add(f);
            if (z && z6) {
                ArrayList arrayList4 = new ArrayList();
                if (v > 0) {
                    ko4[] ko4VarArr2 = new ko4[i3];
                    int i12 = 0;
                    while (i12 < i3) {
                        ko4 ko4Var3 = ko4VarArr[i12];
                        ko4[] ko4VarArr3 = ko4VarArr;
                        String w = gcc.w(2, ko4Var3.l);
                        String d = eg7.d(w);
                        jo4 jo4Var = new jo4();
                        jo4Var.a = ko4Var3.a;
                        jo4Var.b = ko4Var3.b;
                        jo4Var.c = po5.q(ko4Var3.c);
                        jo4Var.r = eg7.n(ko4Var3.s);
                        jo4Var.s = eg7.n(d);
                        jo4Var.k = w;
                        jo4Var.l = ko4Var3.m;
                        jo4Var.i = ko4Var3.i;
                        jo4Var.j = ko4Var3.j;
                        jo4Var.z = ko4Var3.A;
                        jo4Var.A = ko4Var3.B;
                        jo4Var.a(ko4Var3.F);
                        jo4Var.e = ko4Var3.e;
                        jo4Var.f = ko4Var3.f;
                        jo4Var.K = ko4Var3.L;
                        ko4VarArr2[i12] = new ko4(jo4Var);
                        i12++;
                        ko4VarArr = ko4VarArr3;
                        map3 = map3;
                    }
                    ko4[] ko4VarArr4 = ko4VarArr;
                    map = map3;
                    arrayList4.add(new t1c("main", ko4VarArr2));
                    if (v2 > 0 && (ko4Var != null || c2.isEmpty())) {
                        jo4 a = g(ko4VarArr4[0], ko4Var, false).a();
                        a.m = "main";
                        arrayList4.add(new t1c("main:audio", new ko4(a)));
                    }
                    if (list3 != null) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            String k = uh9.k(i13, "main:cc:");
                            jo4 a2 = ib3Var2.e((ko4) list3.get(i13)).a();
                            a2.m = "main";
                            arrayList4.add(new t1c(k, new ko4(a2)));
                        }
                    }
                    ib3Var = ib3Var2;
                } else {
                    map = map3;
                    ib3Var = ib3Var2;
                    ko4[] ko4VarArr5 = new ko4[i3];
                    for (int i14 = 0; i14 < i3; i14++) {
                        ko4VarArr5[i14] = g(ko4VarArr[i14], ko4Var, true);
                    }
                    arrayList4.add(new t1c("main", ko4VarArr5));
                }
                jo4 jo4Var2 = new jo4();
                str = "ID3";
                jo4Var2.a = str;
                jo4Var2.s = eg7.n("application/id3");
                jo4Var2.m = "main";
                t1c t1cVar = new t1c("main:id3", new ko4(jo4Var2));
                arrayList4.add(t1cVar);
                f.C((t1c[]) arrayList4.toArray(new t1c[0]), arrayList4.indexOf(t1cVar));
            } else {
                map = map3;
                str = "ID3";
                ib3Var = ib3Var2;
            }
        }
        ArrayList arrayList5 = new ArrayList(c2.size());
        ArrayList arrayList6 = new ArrayList(c2.size());
        HashSet hashSet2 = new HashSet();
        int i15 = 0;
        while (i15 < c2.size()) {
            String str4 = ((qh5) c2.get(i15)).a.c;
            str4.getClass();
            if (hashSet2.add(str4)) {
                arrayList5.clear();
                arrayList6.clear();
                boolean z7 = true;
                for (int i16 = 0; i16 < c2.size(); i16++) {
                    if (str4.equals(((qh5) c2.get(i16)).a.c)) {
                        qh5 qh5Var2 = (qh5) c2.get(i16);
                        ko4 ko4Var4 = qh5Var2.a.a;
                        arrayList5.add(qh5Var2);
                        arrayList6.add(ko4Var4);
                        z7 &= gcc.v(1, ko4Var4.l) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = gcc.a;
                arrayList = arrayList5;
                i2 = i15;
                po5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
                vh5 f2 = f(concat, 1, (qh5[]) arrayList5.toArray(new qh5[0]), (ko4[]) arrayList6.toArray(new ko4[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(f2);
                if (z && z7) {
                    String concat2 = concat.concat(":id3");
                    jo4 jo4Var3 = new jo4();
                    jo4Var3.a = str;
                    jo4Var3.s = eg7.n("application/id3");
                    jo4Var3.m = concat;
                    f2.C(new t1c[]{new t1c(concat, (ko4[]) arrayList2.toArray(new ko4[0])), new t1c(concat2, new ko4(jo4Var3))}, 1);
                }
            } else {
                arrayList = arrayList5;
                i2 = i15;
                po5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
            }
            i15 = i2 + 1;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
            c2 = po5Var;
            hashSet2 = hashSet;
            map = map2;
        }
        Map map4 = map;
        this.M = arrayList3.size();
        ArrayList arrayList7 = new ArrayList(c3.size());
        ArrayList arrayList8 = new ArrayList(c3.size());
        HashSet hashSet3 = new HashSet();
        int i17 = 0;
        while (i17 < c3.size()) {
            String str6 = ((qh5) c3.get(i17)).a.c;
            str6.getClass();
            if (hashSet3.add(str6)) {
                arrayList7.clear();
                arrayList8.clear();
                for (int i18 = 0; i18 < c3.size(); i18++) {
                    if (str6.equals(((qh5) c3.get(i18)).a.c)) {
                        qh5 qh5Var3 = (qh5) c3.get(i18);
                        arrayList7.add(qh5Var3);
                        arrayList8.add(qh5Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                ko4[] ko4VarArr6 = (ko4[]) arrayList8.toArray(new ko4[0]);
                String str7 = gcc.a;
                qh5[] qh5VarArr2 = (qh5[]) arrayList7.toArray(new qh5[0]);
                no5 no5Var = po5.b;
                i = i17;
                vh5 f3 = f(concat3, 3, qh5VarArr2, ko4VarArr6, null, j99.e, map4, j);
                arrayList3.add(f3);
                int length = ko4VarArr6.length;
                ko4[] ko4VarArr7 = new ko4[length];
                for (int i19 = 0; i19 < length; i19++) {
                    ko4VarArr7[i19] = ib3Var.e(ko4VarArr6[i19]);
                }
                f3.C(new t1c[]{new t1c(concat3, ko4VarArr7)}, new int[0]);
            } else {
                i = i17;
            }
            i17 = i + 1;
        }
        vh5[] vh5VarArr2 = (vh5[]) arrayList3.toArray(new vh5[0]);
        this.K = vh5VarArr2;
        this.I = vh5VarArr2.length;
        int i20 = 0;
        while (true) {
            int i21 = this.M;
            vh5VarArr = this.K;
            if (i20 >= i21) {
                break;
            }
            vh5VarArr[i20].d.m = true;
            i20++;
        }
        for (vh5 vh5Var : vh5VarArr) {
            if (!vh5Var.U) {
                wa6 wa6Var = new wa6();
                wa6Var.a = vh5Var.g0;
                vh5Var.s(new xa6(wa6Var));
            }
        }
        this.L = this.K;
    }

    @Override // xt6
    public final u1c r() {
        u1c u1cVar = this.J;
        u1cVar.getClass();
        return u1cVar;
    }

    @Override // i8a
    public final boolean s(xa6 xa6Var) {
        if (this.J != null) {
            return this.N.s(xa6Var);
        }
        for (vh5 vh5Var : this.K) {
            if (!vh5Var.U) {
                wa6 wa6Var = new wa6();
                wa6Var.a = vh5Var.g0;
                vh5Var.s(new xa6(wa6Var));
            }
        }
        return false;
    }

    @Override // i8a
    public final long t() {
        return this.N.t();
    }

    @Override // i8a
    public final void u(long j) {
        this.N.u(j);
    }

    @Override // xt6
    public final void d() {
    }
}
