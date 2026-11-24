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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tg5 implements tt6, lh5 {
    public final boolean E;
    public final we8 F;
    public final lj4 G = new lj4(this);
    public st6 H;
    public int I;
    public vzb J;
    public sh5[] K;
    public sh5[] L;
    public int M;
    public wr2 N;
    public final long O;
    public final bc3 a;
    public final fc3 b;
    public final k6d c;
    public final w0c d;
    public final is3 e;
    public final fs3 f;
    public final k4f h;
    public final kq n;
    public final mx6 r;
    public final IdentityHashMap s;
    public final et8 w;
    public final kg7 x;
    public final boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public tg5(bc3 bc3Var, fc3 fc3Var, k6d k6dVar, w0c w0cVar, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, mx6 mx6Var, kg7 kg7Var, boolean z, int i, we8 we8Var) {
        this.a = bc3Var;
        this.b = fc3Var;
        this.c = k6dVar;
        this.d = w0cVar;
        this.e = is3Var;
        this.f = fs3Var;
        this.h = k4fVar;
        this.n = kqVar;
        this.r = mx6Var;
        this.x = kg7Var;
        this.y = z;
        this.E = i;
        this.F = we8Var;
        kg7Var.getClass();
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        this.N = new wr2(y79Var, y79Var);
        this.s = new IdentityHashMap();
        this.w = new et8();
        this.K = new sh5[0];
        this.L = new sh5[0];
        this.O = Long.MIN_VALUE;
    }

    public static go4 i(go4 go4Var, go4 go4Var2, boolean z) {
        nf7 nf7Var;
        int i;
        String str;
        String str2;
        mo5 mo5Var;
        int i2;
        int i3;
        String str3;
        int i4;
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        int i5 = -1;
        if (go4Var2 != null) {
            str2 = go4Var2.l;
            nf7Var = go4Var2.m;
            i2 = go4Var2.N;
            i = go4Var2.e;
            i3 = go4Var2.f;
            str = go4Var2.d;
            str3 = go4Var2.b;
            mo5Var = go4Var2.c;
        } else {
            String w = hac.w(1, go4Var.l);
            nf7Var = go4Var.m;
            if (z) {
                i2 = go4Var.N;
                i = go4Var.e;
                i3 = go4Var.f;
                str = go4Var.d;
                str3 = go4Var.b;
                str2 = w;
                mo5Var = go4Var.c;
            } else {
                i = 0;
                str = null;
                str2 = w;
                mo5Var = y79Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String d = wf7.d(str2);
        if (z) {
            int i6 = go4Var.i;
            i5 = go4Var.j;
            i4 = i6;
        } else {
            i4 = -1;
        }
        fo4 fo4Var = new fo4();
        fo4Var.a = go4Var.a;
        fo4Var.b = str3;
        fo4Var.c = mo5.q(mo5Var);
        fo4Var.r = wf7.n(go4Var.s);
        fo4Var.s = wf7.n(d);
        fo4Var.k = str2;
        fo4Var.l = nf7Var;
        fo4Var.i = i4;
        fo4Var.j = i5;
        fo4Var.M = i2;
        fo4Var.e = i;
        fo4Var.f = i3;
        fo4Var.d = str;
        return new go4(fo4Var);
    }

    @Override // lh5
    public final void a() {
        for (sh5 sh5Var : this.K) {
            mx6 mx6Var = sh5Var.s;
            qg5 qg5Var = sh5Var.d;
            ArrayList arrayList = sh5Var.E;
            if (!arrayList.isEmpty()) {
                sg5 sg5Var = (sg5) lne.b(arrayList);
                int c = qg5Var.c(sg5Var);
                int i = sg5Var.F;
                if (c == 1) {
                    if (!sg5Var.h()) {
                        jte.p(i != -1);
                        ch5 b = qg5Var.g.b(sg5Var.y, false);
                        b.getClass();
                        mo5 mo5Var = b.r;
                        int i2 = (int) (sg5Var.s - b.k);
                        sg5Var.b0 = i2 < 0 ? 0L : ((xg5) (i2 < mo5Var.size() ? ((zg5) mo5Var.get(i2)).y : b.s).get(i)).c;
                    }
                } else if (c == 0) {
                    sh5Var.I.post(new fd5(sh5Var, sg5Var, (byte) 5));
                } else if (c == 2 && !sh5Var.k0 && mx6Var.Y()) {
                    mx6Var.v();
                }
            }
        }
        this.H.b(this);
    }

    @Override // lh5
    public final boolean b(Uri uri, de deVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        ca6 ca6Var;
        int v;
        sh5[] sh5VarArr = this.K;
        int length = sh5VarArr.length;
        int i2 = 0;
        boolean z4 = false;
        while (i2 < length) {
            sh5 sh5Var = sh5VarArr[i2];
            qg5 qg5Var = sh5Var.d;
            nh5[] nh5VarArr = qg5Var.e;
            HashMap hashMap = qg5Var.g.d;
            int length2 = nh5VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                nh5 nh5Var = nh5VarArr[i3];
                ec3 ec3Var = (ec3) hashMap.get(uri);
                if (nh5Var.equals(ec3Var != null ? ec3Var.a : null)) {
                    if (z) {
                        ca6Var = null;
                    } else {
                        ba6 a = qg5Var.a(uri);
                        sh5Var.r.getClass();
                        ca6Var = k4f.u3(a, deVar);
                    }
                    qg5Var.p = uri;
                    if (ca6Var != null) {
                        byte b = ca6Var.a;
                        rg5 rg5Var = qg5Var.h;
                        if (rg5Var == null || !rg5Var.k) {
                            rg5Var = null;
                        }
                        i = i2;
                        boolean z5 = false;
                        long j = ca6Var.b;
                        if (b == 1) {
                            z2 = false;
                            if (rg5Var != null) {
                                qg5Var.s.f();
                                z3 = rg5Var.a(j);
                            } else {
                                ec3 ec3Var2 = (ec3) hashMap.get(uri);
                                if (ec3Var2 != null) {
                                    z3 = ec3Var2.a(j, uri, null);
                                }
                            }
                        } else {
                            if (b != 2) {
                                dq9.m(hg9.j(b, "Invalid fallback selection type: "));
                                return false;
                            }
                            int i4 = 0;
                            while (true) {
                                if (i4 >= nh5VarArr.length) {
                                    z2 = z5;
                                    i4 = -1;
                                    break;
                                }
                                nh5 nh5Var2 = nh5VarArr[i4];
                                z2 = z5;
                                ec3 ec3Var3 = (ec3) hashMap.get(uri);
                                if (nh5Var2.equals(ec3Var3 != null ? ec3Var3.a : null)) {
                                    break;
                                }
                                i4++;
                                z5 = z2;
                            }
                            if (i4 != -1 && (v = qg5Var.s.v(i4)) != -1 && qg5Var.s.q(v, j)) {
                                ec3 ec3Var4 = (ec3) hashMap.get(uri);
                                if (ec3Var4 != null ? ec3Var4.a(j, uri, null) : z2) {
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
        this.H.b(this);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0272, code lost:
    
        if (r3.n() != r12.i.a(r6.d)) goto L116;
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
    @Override // tt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(t74[] t74VarArr, boolean[] zArr, jr9[] jr9VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        jr9[] jr9VarArr2;
        int[] iArr;
        boolean z;
        ?? r9;
        qg5 qg5Var;
        int i;
        int i2;
        jr9[] jr9VarArr3;
        int i3;
        int[] iArr2;
        sh5[] sh5VarArr;
        sh5 sh5Var;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        ?? r10;
        int i7;
        t74[] t74VarArr2;
        int[] iArr3 = new int[t74VarArr.length];
        int[] iArr4 = new int[t74VarArr.length];
        int i8 = 0;
        while (true) {
            int length = t74VarArr.length;
            identityHashMap = this.s;
            if (i8 >= length) {
                break;
            }
            jr9 jr9Var = jr9VarArr[i8];
            iArr3[i8] = jr9Var == null ? -1 : ((Integer) identityHashMap.get(jr9Var)).intValue();
            iArr4[i8] = -1;
            t74 t74Var = t74VarArr[i8];
            if (t74Var != null) {
                uzb c = t74Var.c();
                int i9 = 0;
                while (true) {
                    sh5[] sh5VarArr2 = this.K;
                    if (i9 < sh5VarArr2.length) {
                        sh5 sh5Var2 = sh5VarArr2[i9];
                        sh5Var2.d();
                        if (sh5Var2.Z.b(c) != -1) {
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
        int length2 = t74VarArr.length;
        jr9[] jr9VarArr4 = new jr9[length2];
        int length3 = t74VarArr.length;
        jr9[] jr9VarArr5 = new jr9[length3];
        int length4 = t74VarArr.length;
        t74[] t74VarArr3 = new t74[length4];
        boolean z5 = false;
        sh5[] sh5VarArr3 = new sh5[this.K.length];
        int i10 = length3;
        int i11 = 0;
        int i12 = 0;
        boolean z6 = false;
        while (i11 < this.K.length) {
            int i13 = length2;
            ?? r7 = z5;
            while (true) {
                jr9VarArr2 = jr9VarArr4;
                if (r7 >= t74VarArr.length) {
                    break;
                }
                jr9VarArr5[r7] = iArr3[r7] == i11 ? jr9VarArr[r7] : null;
                t74VarArr3[r7] = iArr4[r7] == i11 ? t74VarArr[r7] : null;
                jr9VarArr4 = jr9VarArr2;
                r7++;
            }
            sh5 sh5Var3 = this.K[i11];
            mx6 mx6Var = sh5Var3.s;
            int i14 = i11;
            qg5 qg5Var2 = sh5Var3.d;
            nh5[] nh5VarArr = qg5Var2.e;
            fc3 fc3Var = qg5Var2.g;
            ArrayList arrayList = sh5Var3.E;
            sh5Var3.d();
            int i15 = sh5Var3.V;
            ?? r29 = jr9VarArr5;
            ?? r72 = z5;
            while (r72 < length4) {
                oh5 oh5Var = (oh5) r29[r72];
                if (oh5Var == null || (t74VarArr3[r72] != null && zArr[r72])) {
                    i7 = r72;
                    t74VarArr2 = t74VarArr3;
                } else {
                    i7 = r72;
                    sh5Var3.V--;
                    t74VarArr2 = t74VarArr3;
                    if (oh5Var.c != -1) {
                        sh5 sh5Var4 = oh5Var.b;
                        int i16 = oh5Var.a;
                        sh5Var4.d();
                        sh5Var4.b0.getClass();
                        int i17 = sh5Var4.b0[i16];
                        if (i17 >= 0) {
                            jte.p(sh5Var4.e0[i17]);
                            sh5Var4.e0[i17] = z5;
                        }
                        oh5Var.c = -1;
                    }
                    r29[i7] = 0;
                }
                t74VarArr3 = t74VarArr2;
                r72 = i7 + 1;
            }
            t74[] t74VarArr4 = t74VarArr3;
            boolean z7 = true;
            if (!z6) {
                if (!sh5Var3.j0) {
                    iArr = iArr3;
                } else if (i15 != 0) {
                    iArr = iArr3;
                }
                z = z5;
                t74 t74Var2 = qg5Var2.s;
                boolean z8 = z;
                t74 t74Var3 = t74Var2;
                r9 = z5;
                while (r9 < length4) {
                    int i18 = r9;
                    t74 t74Var4 = t74VarArr4[i18];
                    int i19 = length4;
                    if (t74Var4 != null) {
                        boolean z9 = z8;
                        int b = sh5Var3.Z.b(t74Var4.c());
                        if (b == sh5Var3.c0) {
                            Uri b2 = nh5VarArr[qg5Var2.s.n()].b();
                            ec3 ec3Var = (ec3) fc3Var.d.get(b2);
                            if (ec3Var != null) {
                                HashMap hashMap = ec3Var.b;
                                jte.p(hashMap.containsKey(b2));
                                dc3 dc3Var = (dc3) hashMap.get(b2);
                                dc3Var.getClass();
                                dc3Var.x = z5;
                            }
                            qg5Var2.s = t74Var4;
                            t74Var3 = t74Var4;
                        }
                        if (r29[i18] == 0) {
                            sh5Var3.V++;
                            oh5 oh5Var2 = new oh5(sh5Var3, b);
                            r29[i18] = oh5Var2;
                            zArr2[i18] = z7;
                            if (sh5Var3.b0 != null) {
                                oh5Var2.b();
                                int i20 = sh5Var3.b0[b];
                                if (!z9 && i20 >= 0) {
                                    rh5 rh5Var = sh5Var3.M[i20];
                                    z8 = (rh5Var.v() == 0 || rh5Var.J(j, z7)) ? false : true;
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
                if (sh5Var3.V != 0) {
                    Uri b3 = nh5VarArr[qg5Var2.s.n()].b();
                    ec3 ec3Var2 = (ec3) fc3Var.d.get(b3);
                    if (ec3Var2 != null) {
                        HashMap hashMap2 = ec3Var2.b;
                        jte.p(hashMap2.containsKey(b3));
                        dc3 dc3Var2 = (dc3) hashMap2.get(b3);
                        dc3Var2.getClass();
                        dc3Var2.x = false;
                    }
                    qg5Var2.o = null;
                    sh5Var3.X = null;
                    sh5Var3.i0 = true;
                    arrayList.clear();
                    if (mx6Var.Y()) {
                        if (sh5Var3.T) {
                            for (rh5 rh5Var2 : sh5Var3.M) {
                                rh5Var2.l();
                            }
                        }
                        mx6Var.v();
                    } else {
                        sh5Var3.E();
                    }
                    qg5Var = qg5Var2;
                    i4 = i10;
                    i2 = i13;
                    jr9VarArr3 = jr9VarArr2;
                    i3 = i14;
                    z2 = z10;
                    iArr2 = iArr4;
                    sh5VarArr = sh5VarArr3;
                    sh5Var = sh5Var3;
                } else {
                    boolean z11 = true;
                    if (arrayList.isEmpty() || Objects.equals(t74Var3, t74Var2)) {
                        qg5Var = qg5Var2;
                        i = i10;
                        i2 = i13;
                        jr9VarArr3 = jr9VarArr2;
                        i3 = i14;
                        iArr2 = iArr4;
                        sh5VarArr = sh5VarArr3;
                        sh5Var = sh5Var3;
                    } else {
                        if (sh5Var3.j0) {
                            qg5Var = qg5Var2;
                            i = i10;
                            i2 = i13;
                            jr9VarArr3 = jr9VarArr2;
                            i3 = i14;
                            iArr2 = iArr4;
                            sh5VarArr = sh5VarArr3;
                            sh5Var = sh5Var3;
                        } else {
                            long j2 = j < 0 ? -j : 0L;
                            sg5 x = sh5Var3.x();
                            long j3 = j2;
                            em6[] b4 = qg5Var2.b(x, j);
                            qg5Var = qg5Var2;
                            List list = sh5Var3.F;
                            i = i10;
                            i2 = i13;
                            jr9VarArr3 = jr9VarArr2;
                            i3 = i14;
                            iArr2 = iArr4;
                            sh5VarArr = sh5VarArr3;
                            sh5Var = sh5Var3;
                            t74 t74Var5 = t74Var3;
                            t74Var5.b(j, j3, -9223372036854775807L, list, b4);
                            z11 = true;
                        }
                        sh5Var.i0 = z11;
                        z3 = z11;
                        z2 = z3;
                        if (z2) {
                            i4 = i;
                        } else {
                            sh5Var.F(j, z3);
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
                ArrayList arrayList2 = sh5Var.J;
                arrayList2.clear();
                for (i5 = 0; i5 < i4; i5++) {
                    ?? r8 = r29[i5];
                    if (r8 != 0) {
                        arrayList2.add((oh5) r8);
                    }
                }
                sh5Var.j0 = true;
                i6 = 0;
                z4 = false;
                while (i6 < t74VarArr.length) {
                    ?? r82 = r29[i6];
                    int i23 = i3;
                    if (iArr2[i6] == i23) {
                        r82.getClass();
                        r10 = jr9VarArr3;
                        r10[i6] = r82;
                        identityHashMap.put(r82, Integer.valueOf(i23));
                        z4 = true;
                    } else {
                        r10 = jr9VarArr3;
                        if (iArr[i6] == i23) {
                            jte.p(r82 == 0);
                        }
                    }
                    i6++;
                    jr9VarArr3 = r10;
                    i3 = i23;
                }
                jr9[] jr9VarArr6 = jr9VarArr3;
                int i24 = i3;
                if (!z4) {
                    int i25 = i12;
                    sh5VarArr[i25] = sh5Var;
                    i12 = i25 + 1;
                    if (i25 == 0) {
                        qg5Var.m = true;
                        if (!z2) {
                            sh5[] sh5VarArr4 = this.L;
                            if (sh5VarArr4.length != 0 && sh5Var == sh5VarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.w.b).clear();
                        z6 = true;
                    } else {
                        qg5Var.m = i24 < this.M;
                    }
                }
                i11 = i24 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                sh5VarArr3 = sh5VarArr;
                jr9VarArr5 = r29;
                t74VarArr3 = t74VarArr4;
                length2 = i2;
                z5 = false;
                i10 = i4;
                jr9VarArr4 = jr9VarArr6;
                length4 = i21;
            }
            iArr = iArr3;
            z = true;
            t74 t74Var22 = qg5Var2.s;
            boolean z82 = z;
            t74 t74Var32 = t74Var22;
            r9 = z5;
            while (r9 < length4) {
            }
            int i212 = length4;
            boolean z102 = z82;
            if (sh5Var3.V != 0) {
            }
            ArrayList arrayList22 = sh5Var.J;
            arrayList22.clear();
            while (i5 < i4) {
            }
            sh5Var.j0 = true;
            i6 = 0;
            z4 = false;
            while (i6 < t74VarArr.length) {
            }
            jr9[] jr9VarArr62 = jr9VarArr3;
            int i242 = i3;
            if (!z4) {
            }
            i11 = i242 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            sh5VarArr3 = sh5VarArr;
            jr9VarArr5 = r29;
            t74VarArr3 = t74VarArr4;
            length2 = i2;
            z5 = false;
            i10 = i4;
            jr9VarArr4 = jr9VarArr62;
            length4 = i212;
        }
        boolean z12 = z5;
        System.arraycopy(jr9VarArr4, z12 ? 1 : 0, jr9VarArr, z12 ? 1 : 0, length2);
        sh5[] sh5VarArr5 = (sh5[]) hac.V(i12, sh5VarArr3);
        this.L = sh5VarArr5;
        y79 r = mo5.r(sh5VarArr5);
        AbstractList b5 = wpe.b(r, new o41((byte) 8));
        this.x.getClass();
        this.N = new wr2(r, b5);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sh5 d(String str, int i, nh5[] nh5VarArr, go4[] go4VarArr, go4 go4Var, List list, Map map, long j) {
        boolean z;
        sh5 sh5Var = new sh5(str, i, this.G, new qg5(this.a, this.b, nh5VarArr, go4VarArr, this.c, this.d, this.w, list, this.F), map, this.r, j, go4Var, this.e, this.f, this.h, this.n, this.E ? 1 : 0, null);
        boolean z2 = sh5Var.k0;
        long j2 = this.O;
        if (z2) {
            long j3 = sh5Var.l0;
            if (j3 != Long.MIN_VALUE && (j2 == Long.MIN_VALUE || j2 > j3)) {
                z = true;
                sh5Var.l0 = j2;
                if (sh5Var.T) {
                    for (rh5 rh5Var : sh5Var.M) {
                        rh5Var.K(j2);
                    }
                }
                if (z) {
                    sh5Var.k0 = false;
                    sh5Var.c.b(sh5Var);
                }
                return sh5Var;
            }
        }
        z = false;
        sh5Var.l0 = j2;
        if (sh5Var.T) {
        }
        if (z) {
        }
        return sh5Var;
    }

    @Override // s6a
    public final boolean f() {
        return this.N.f();
    }

    @Override // s6a
    public final long g() {
        return this.N.g();
    }

    @Override // tt6
    public final long h(long j, jx9 jx9Var) {
        sh5[] sh5VarArr = this.L;
        int length = sh5VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            sh5 sh5Var = sh5VarArr[i];
            if (sh5Var.R == 2) {
                qg5 qg5Var = sh5Var.d;
                fc3 fc3Var = qg5Var.g;
                int d = qg5Var.s.d();
                nh5[] nh5VarArr = qg5Var.e;
                ch5 b = (d >= nh5VarArr.length || d == -1) ? null : fc3Var.b(nh5VarArr[qg5Var.s.n()].b(), true);
                if (b != null) {
                    mo5 mo5Var = b.r;
                    if (!mo5Var.isEmpty()) {
                        long j2 = b.h - fc3Var.M;
                        long j3 = j - j2;
                        int d2 = hac.d(mo5Var, Long.valueOf(j3), true);
                        long j4 = ((zg5) mo5Var.get(d2)).e;
                        return jx9Var.a(j3, j4, (!b.c || d2 == mo5Var.size() - 1) ? j4 : ((zg5) mo5Var.get(d2 + 1)).e) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // tt6
    public final void j() {
        for (sh5 sh5Var : this.K) {
            sh5Var.C();
            if (sh5Var.k0 && !sh5Var.U) {
                throw bx7.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // tt6
    public final long k(long j) {
        sh5[] sh5VarArr = this.L;
        if (sh5VarArr.length > 0) {
            boolean F = sh5VarArr[0].F(j, false);
            int i = 1;
            while (true) {
                sh5[] sh5VarArr2 = this.L;
                if (i >= sh5VarArr2.length) {
                    break;
                }
                sh5VarArr2[i].F(j, F);
                i++;
            }
            if (F) {
                ((SparseArray) this.w.b).clear();
            }
        }
        return j;
    }

    @Override // tt6
    public final void l(long j) {
        for (sh5 sh5Var : this.L) {
            if (sh5Var.T && !sh5Var.z()) {
                int length = sh5Var.M.length;
                for (int i = 0; i < length; i++) {
                    sh5Var.M[i].k(j, sh5Var.e0[i]);
                }
            }
        }
    }

    @Override // tt6
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // tt6
    public final void o(st6 st6Var, long j) {
        String str;
        bc3 bc3Var;
        boolean z;
        Map map;
        sh5[] sh5VarArr;
        int i;
        ArrayList arrayList;
        int i2;
        mo5 mo5Var;
        Map map2;
        ArrayList arrayList2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        int i3;
        List list;
        this.H = st6Var;
        fc3 fc3Var = this.b;
        fc3Var.e.add(this);
        gh5 gh5Var = fc3Var.w;
        gh5Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        mo5 c = fc3Var.c(0);
        c.getClass();
        mo5 c2 = fc3Var.c(2);
        c2.getClass();
        mo5 c3 = fc3Var.c(3);
        c3.getClass();
        boolean isEmpty = c.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        bc3 bc3Var2 = this.a;
        boolean z4 = this.y;
        if (isEmpty) {
            str = "ID3";
            bc3Var = bc3Var2;
            z = z4;
            map = map3;
        } else {
            go4 go4Var = gh5Var.j;
            List list2 = gh5Var.k;
            int size = c.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < c.size(); i6++) {
                go4 go4Var2 = ((nh5) c.get(i6)).a.a;
                int i7 = go4Var2.B;
                String str2 = go4Var2.l;
                if (i7 > 0 || hac.w(2, str2) != null) {
                    iArr[i6] = 2;
                    i4++;
                    i5 = i5;
                } else if (hac.w(1, str2) != null) {
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
            nh5[] nh5VarArr = new nh5[i3];
            go4[] go4VarArr = new go4[i3];
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
                    nh5 nh5Var = (nh5) c.get(i11);
                    nh5VarArr[i10] = nh5Var;
                    go4VarArr[i10] = nh5Var.a.a;
                    i10++;
                }
                i11++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = go4VarArr[0].l;
            int v = hac.v(2, str3);
            int v2 = hac.v(1, str3);
            boolean z6 = (v2 == 1 || (v2 == 0 && c2.isEmpty())) && v <= 1 && v2 + v > 0;
            z = z4;
            sh5 d = d("main", (z5 || v2 <= 0) ? 0 : 1, nh5VarArr, go4VarArr, go4Var, list3, map3, j);
            arrayList3.add(d);
            if (z && z6) {
                ArrayList arrayList4 = new ArrayList();
                if (v > 0) {
                    go4[] go4VarArr2 = new go4[i3];
                    int i12 = 0;
                    while (i12 < i3) {
                        go4 go4Var3 = go4VarArr[i12];
                        go4[] go4VarArr3 = go4VarArr;
                        String w = hac.w(2, go4Var3.l);
                        String d2 = wf7.d(w);
                        fo4 fo4Var = new fo4();
                        fo4Var.a = go4Var3.a;
                        fo4Var.b = go4Var3.b;
                        fo4Var.c = mo5.q(go4Var3.c);
                        fo4Var.r = wf7.n(go4Var3.s);
                        fo4Var.s = wf7.n(d2);
                        fo4Var.k = w;
                        fo4Var.l = go4Var3.m;
                        fo4Var.i = go4Var3.i;
                        fo4Var.j = go4Var3.j;
                        fo4Var.z = go4Var3.A;
                        fo4Var.A = go4Var3.B;
                        fo4Var.a(go4Var3.F);
                        fo4Var.e = go4Var3.e;
                        fo4Var.f = go4Var3.f;
                        fo4Var.K = go4Var3.L;
                        go4VarArr2[i12] = new go4(fo4Var);
                        i12++;
                        go4VarArr = go4VarArr3;
                        map3 = map3;
                    }
                    go4[] go4VarArr4 = go4VarArr;
                    map = map3;
                    arrayList4.add(new uzb("main", go4VarArr2));
                    if (v2 > 0 && (go4Var != null || c2.isEmpty())) {
                        fo4 a = i(go4VarArr4[0], go4Var, false).a();
                        a.m = "main";
                        arrayList4.add(new uzb("main:audio", new go4(a)));
                    }
                    if (list3 != null) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            String j2 = hg9.j(i13, "main:cc:");
                            fo4 a2 = bc3Var2.e((go4) list3.get(i13)).a();
                            a2.m = "main";
                            arrayList4.add(new uzb(j2, new go4(a2)));
                        }
                    }
                    bc3Var = bc3Var2;
                } else {
                    map = map3;
                    bc3Var = bc3Var2;
                    go4[] go4VarArr5 = new go4[i3];
                    for (int i14 = 0; i14 < i3; i14++) {
                        go4VarArr5[i14] = i(go4VarArr[i14], go4Var, true);
                    }
                    arrayList4.add(new uzb("main", go4VarArr5));
                }
                fo4 fo4Var2 = new fo4();
                str = "ID3";
                fo4Var2.a = str;
                fo4Var2.s = wf7.n("application/id3");
                fo4Var2.m = "main";
                uzb uzbVar = new uzb("main:id3", new go4(fo4Var2));
                arrayList4.add(uzbVar);
                d.D((uzb[]) arrayList4.toArray(new uzb[0]), arrayList4.indexOf(uzbVar));
            } else {
                map = map3;
                str = "ID3";
                bc3Var = bc3Var2;
            }
        }
        ArrayList arrayList5 = new ArrayList(c2.size());
        ArrayList arrayList6 = new ArrayList(c2.size());
        HashSet hashSet2 = new HashSet();
        int i15 = 0;
        while (i15 < c2.size()) {
            String str4 = ((nh5) c2.get(i15)).a.c;
            str4.getClass();
            if (hashSet2.add(str4)) {
                arrayList5.clear();
                arrayList6.clear();
                boolean z7 = true;
                for (int i16 = 0; i16 < c2.size(); i16++) {
                    if (str4.equals(((nh5) c2.get(i16)).a.c)) {
                        nh5 nh5Var2 = (nh5) c2.get(i16);
                        go4 go4Var4 = nh5Var2.a.a;
                        arrayList5.add(nh5Var2);
                        arrayList6.add(go4Var4);
                        z7 &= hac.v(1, go4Var4.l) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = hac.a;
                arrayList = arrayList5;
                i2 = i15;
                mo5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
                sh5 d3 = d(concat, 1, (nh5[]) arrayList5.toArray(new nh5[0]), (go4[]) arrayList6.toArray(new go4[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(d3);
                if (z && z7) {
                    String concat2 = concat.concat(":id3");
                    fo4 fo4Var3 = new fo4();
                    fo4Var3.a = str;
                    fo4Var3.s = wf7.n("application/id3");
                    fo4Var3.m = concat;
                    d3.D(new uzb[]{new uzb(concat, (go4[]) arrayList2.toArray(new go4[0])), new uzb(concat2, new go4(fo4Var3))}, 1);
                }
            } else {
                arrayList = arrayList5;
                i2 = i15;
                mo5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
            }
            i15 = i2 + 1;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
            c2 = mo5Var;
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
            String str6 = ((nh5) c3.get(i17)).a.c;
            str6.getClass();
            if (hashSet3.add(str6)) {
                arrayList7.clear();
                arrayList8.clear();
                for (int i18 = 0; i18 < c3.size(); i18++) {
                    if (str6.equals(((nh5) c3.get(i18)).a.c)) {
                        nh5 nh5Var3 = (nh5) c3.get(i18);
                        arrayList7.add(nh5Var3);
                        arrayList8.add(nh5Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                go4[] go4VarArr6 = (go4[]) arrayList8.toArray(new go4[0]);
                String str7 = hac.a;
                nh5[] nh5VarArr2 = (nh5[]) arrayList7.toArray(new nh5[0]);
                ko5 ko5Var = mo5.b;
                i = i17;
                sh5 d4 = d(concat3, 3, nh5VarArr2, go4VarArr6, null, y79.e, map4, j);
                arrayList3.add(d4);
                int length = go4VarArr6.length;
                go4[] go4VarArr7 = new go4[length];
                for (int i19 = 0; i19 < length; i19++) {
                    go4VarArr7[i19] = bc3Var.e(go4VarArr6[i19]);
                }
                d4.D(new uzb[]{new uzb(concat3, go4VarArr7)}, new int[0]);
            } else {
                i = i17;
            }
            i17 = i + 1;
        }
        sh5[] sh5VarArr2 = (sh5[]) arrayList3.toArray(new sh5[0]);
        this.K = sh5VarArr2;
        this.I = sh5VarArr2.length;
        int i20 = 0;
        while (true) {
            int i21 = this.M;
            sh5VarArr = this.K;
            if (i20 >= i21) {
                break;
            }
            sh5VarArr[i20].d.m = true;
            i20++;
        }
        for (sh5 sh5Var : sh5VarArr) {
            if (!sh5Var.U) {
                ra6 ra6Var = new ra6();
                ra6Var.a = sh5Var.g0;
                sh5Var.r(new sa6(ra6Var));
            }
        }
        this.L = this.K;
    }

    @Override // tt6
    public final vzb q() {
        vzb vzbVar = this.J;
        vzbVar.getClass();
        return vzbVar;
    }

    @Override // s6a
    public final boolean r(sa6 sa6Var) {
        if (this.J != null) {
            return this.N.r(sa6Var);
        }
        for (sh5 sh5Var : this.K) {
            if (!sh5Var.U) {
                ra6 ra6Var = new ra6();
                ra6Var.a = sh5Var.g0;
                sh5Var.r(new sa6(ra6Var));
            }
        }
        return false;
    }

    @Override // s6a
    public final long s() {
        return this.N.s();
    }

    @Override // s6a
    public final void t(long j) {
        this.N.t(j);
    }

    @Override // tt6
    public final void e() {
    }
}
