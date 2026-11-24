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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ue5 implements sr6, mf5 {
    public final boolean E;
    public final uc8 F;
    public final gi3 G = new gi3(this);
    public rr6 H;
    public int I;
    public txb J;
    public tf5[] K;
    public tf5[] L;
    public int M;
    public lq2 N;
    public final long O;
    public final pa3 a;
    public final ta3 b;
    public final l69 c;
    public final vyb d;
    public final yq3 e;
    public final vq3 f;
    public final i2f h;
    public final kp n;
    public final mv6 r;
    public final IdentityHashMap s;
    public final g29 w;
    public final ie7 x;
    public final boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public ue5(pa3 pa3Var, ta3 ta3Var, l69 l69Var, vyb vybVar, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, mv6 mv6Var, ie7 ie7Var, boolean z, int i, uc8 uc8Var) {
        this.a = pa3Var;
        this.b = ta3Var;
        this.c = l69Var;
        this.d = vybVar;
        this.e = yq3Var;
        this.f = vq3Var;
        this.h = i2fVar;
        this.n = kpVar;
        this.r = mv6Var;
        this.x = ie7Var;
        this.y = z;
        this.E = i;
        this.F = uc8Var;
        ie7Var.getClass();
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        this.N = new lq2(w59Var, w59Var);
        this.s = new IdentityHashMap();
        this.w = new g29((byte) 18);
        this.K = new tf5[0];
        this.L = new tf5[0];
        this.O = Long.MIN_VALUE;
    }

    public static fm4 h(fm4 fm4Var, fm4 fm4Var2, boolean z) {
        ld7 ld7Var;
        int i;
        String str;
        String str2;
        mm5 mm5Var;
        int i2;
        int i3;
        String str3;
        int i4;
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        int i5 = -1;
        if (fm4Var2 != null) {
            str2 = fm4Var2.l;
            ld7Var = fm4Var2.m;
            i2 = fm4Var2.N;
            i = fm4Var2.e;
            i3 = fm4Var2.f;
            str = fm4Var2.d;
            str3 = fm4Var2.b;
            mm5Var = fm4Var2.c;
        } else {
            String w = g8c.w(1, fm4Var.l);
            ld7Var = fm4Var.m;
            if (z) {
                i2 = fm4Var.N;
                i = fm4Var.e;
                i3 = fm4Var.f;
                str = fm4Var.d;
                str3 = fm4Var.b;
                str2 = w;
                mm5Var = fm4Var.c;
            } else {
                i = 0;
                str = null;
                str2 = w;
                mm5Var = w59Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String d = ud7.d(str2);
        if (z) {
            int i6 = fm4Var.i;
            i5 = fm4Var.j;
            i4 = i6;
        } else {
            i4 = -1;
        }
        em4 em4Var = new em4();
        em4Var.a = fm4Var.a;
        em4Var.b = str3;
        em4Var.c = mm5.q(mm5Var);
        em4Var.r = ud7.n(fm4Var.s);
        em4Var.s = ud7.n(d);
        em4Var.k = str2;
        em4Var.l = ld7Var;
        em4Var.i = i4;
        em4Var.j = i5;
        em4Var.M = i2;
        em4Var.e = i;
        em4Var.f = i3;
        em4Var.d = str;
        return new fm4(em4Var);
    }

    @Override // mf5
    public final void a() {
        for (tf5 tf5Var : this.K) {
            mv6 mv6Var = tf5Var.s;
            re5 re5Var = tf5Var.d;
            ArrayList arrayList = tf5Var.E;
            if (!arrayList.isEmpty()) {
                te5 te5Var = (te5) jle.b(arrayList);
                int c = re5Var.c(te5Var);
                int i = te5Var.F;
                if (c == 1) {
                    if (!te5Var.h()) {
                        gre.p(i != -1);
                        df5 b = re5Var.g.b(te5Var.y, false);
                        b.getClass();
                        mm5 mm5Var = b.r;
                        int i2 = (int) (te5Var.s - b.k);
                        te5Var.b0 = i2 < 0 ? 0L : ((ye5) (i2 < mm5Var.size() ? ((af5) mm5Var.get(i2)).y : b.s).get(i)).c;
                    }
                } else if (c == 0) {
                    tf5Var.I.post(new hb5(tf5Var, te5Var, (byte) 4));
                } else if (c == 2 && !tf5Var.k0 && mv6Var.W()) {
                    mv6Var.p();
                }
            }
        }
        this.H.b(this);
    }

    @Override // mf5
    public final boolean b(Uri uri, dd ddVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        d86 d86Var;
        int v;
        tf5[] tf5VarArr = this.K;
        int length = tf5VarArr.length;
        int i2 = 0;
        boolean z4 = false;
        while (i2 < length) {
            tf5 tf5Var = tf5VarArr[i2];
            re5 re5Var = tf5Var.d;
            of5[] of5VarArr = re5Var.e;
            HashMap hashMap = re5Var.g.d;
            int length2 = of5VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                of5 of5Var = of5VarArr[i3];
                sa3 sa3Var = (sa3) hashMap.get(uri);
                if (of5Var.equals(sa3Var != null ? sa3Var.a : null)) {
                    if (z) {
                        d86Var = null;
                    } else {
                        c86 a = re5Var.a(uri);
                        tf5Var.r.getClass();
                        d86Var = i2f.u3(a, ddVar);
                    }
                    re5Var.p = uri;
                    if (d86Var != null) {
                        byte b = d86Var.a;
                        se5 se5Var = re5Var.h;
                        if (se5Var == null || !se5Var.k) {
                            se5Var = null;
                        }
                        i = i2;
                        boolean z5 = false;
                        long j = d86Var.b;
                        if (b == 1) {
                            z2 = false;
                            if (se5Var != null) {
                                re5Var.s.f();
                                z3 = se5Var.a(j);
                            } else {
                                sa3 sa3Var2 = (sa3) hashMap.get(uri);
                                if (sa3Var2 != null) {
                                    z3 = sa3Var2.a(j, uri, null);
                                }
                            }
                        } else {
                            if (b != 2) {
                                sc8.j(de9.k(b, "Invalid fallback selection type: "));
                                return false;
                            }
                            int i4 = 0;
                            while (true) {
                                if (i4 >= of5VarArr.length) {
                                    z2 = z5;
                                    i4 = -1;
                                    break;
                                }
                                of5 of5Var2 = of5VarArr[i4];
                                z2 = z5;
                                sa3 sa3Var3 = (sa3) hashMap.get(uri);
                                if (of5Var2.equals(sa3Var3 != null ? sa3Var3.a : null)) {
                                    break;
                                }
                                i4++;
                                z5 = z2;
                            }
                            if (i4 != -1 && (v = re5Var.s.v(i4)) != -1 && re5Var.s.q(v, j)) {
                                sa3 sa3Var4 = (sa3) hashMap.get(uri);
                                if (sa3Var4 != null ? sa3Var4.a(j, uri, null) : z2) {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tf5 c(String str, int i, of5[] of5VarArr, fm4[] fm4VarArr, fm4 fm4Var, List list, Map map, long j) {
        boolean z;
        tf5 tf5Var = new tf5(str, i, this.G, new re5(this.a, this.b, of5VarArr, fm4VarArr, this.c, this.d, this.w, list, this.F), map, this.r, j, fm4Var, this.e, this.f, this.h, this.n, this.E ? 1 : 0, null);
        boolean z2 = tf5Var.k0;
        long j2 = this.O;
        if (z2) {
            long j3 = tf5Var.l0;
            if (j3 != Long.MIN_VALUE && (j2 == Long.MIN_VALUE || j2 > j3)) {
                z = true;
                tf5Var.l0 = j2;
                if (tf5Var.T) {
                    for (sf5 sf5Var : tf5Var.M) {
                        sf5Var.K(j2);
                    }
                }
                if (z) {
                    tf5Var.k0 = false;
                    tf5Var.c.b(tf5Var);
                }
                return tf5Var;
            }
        }
        z = false;
        tf5Var.l0 = j2;
        if (tf5Var.T) {
        }
        if (z) {
        }
        return tf5Var;
    }

    @Override // q4a
    public final boolean d() {
        return this.N.d();
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
    @Override // sr6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        ip9[] ip9VarArr2;
        int[] iArr;
        boolean z;
        ?? r9;
        re5 re5Var;
        int i;
        int i2;
        ip9[] ip9VarArr3;
        int i3;
        int[] iArr2;
        tf5[] tf5VarArr;
        tf5 tf5Var;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        ?? r10;
        int i7;
        k64[] k64VarArr2;
        int[] iArr3 = new int[k64VarArr.length];
        int[] iArr4 = new int[k64VarArr.length];
        int i8 = 0;
        while (true) {
            int length = k64VarArr.length;
            identityHashMap = this.s;
            if (i8 >= length) {
                break;
            }
            ip9 ip9Var = ip9VarArr[i8];
            iArr3[i8] = ip9Var == null ? -1 : ((Integer) identityHashMap.get(ip9Var)).intValue();
            iArr4[i8] = -1;
            k64 k64Var = k64VarArr[i8];
            if (k64Var != null) {
                sxb c = k64Var.c();
                int i9 = 0;
                while (true) {
                    tf5[] tf5VarArr2 = this.K;
                    if (i9 < tf5VarArr2.length) {
                        tf5 tf5Var2 = tf5VarArr2[i9];
                        tf5Var2.b();
                        if (tf5Var2.Z.b(c) != -1) {
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
        int length2 = k64VarArr.length;
        ip9[] ip9VarArr4 = new ip9[length2];
        int length3 = k64VarArr.length;
        ip9[] ip9VarArr5 = new ip9[length3];
        int length4 = k64VarArr.length;
        k64[] k64VarArr3 = new k64[length4];
        boolean z5 = false;
        tf5[] tf5VarArr3 = new tf5[this.K.length];
        int i10 = length3;
        int i11 = 0;
        int i12 = 0;
        boolean z6 = false;
        while (i11 < this.K.length) {
            int i13 = length2;
            ?? r7 = z5;
            while (true) {
                ip9VarArr2 = ip9VarArr4;
                if (r7 >= k64VarArr.length) {
                    break;
                }
                ip9VarArr5[r7] = iArr3[r7] == i11 ? ip9VarArr[r7] : null;
                k64VarArr3[r7] = iArr4[r7] == i11 ? k64VarArr[r7] : null;
                ip9VarArr4 = ip9VarArr2;
                r7++;
            }
            tf5 tf5Var3 = this.K[i11];
            mv6 mv6Var = tf5Var3.s;
            int i14 = i11;
            re5 re5Var2 = tf5Var3.d;
            of5[] of5VarArr = re5Var2.e;
            ta3 ta3Var = re5Var2.g;
            ArrayList arrayList = tf5Var3.E;
            tf5Var3.b();
            int i15 = tf5Var3.V;
            ?? r29 = ip9VarArr5;
            ?? r72 = z5;
            while (r72 < length4) {
                pf5 pf5Var = (pf5) r29[r72];
                if (pf5Var == null || (k64VarArr3[r72] != null && zArr[r72])) {
                    i7 = r72;
                    k64VarArr2 = k64VarArr3;
                } else {
                    i7 = r72;
                    tf5Var3.V--;
                    k64VarArr2 = k64VarArr3;
                    if (pf5Var.c != -1) {
                        tf5 tf5Var4 = pf5Var.b;
                        int i16 = pf5Var.a;
                        tf5Var4.b();
                        tf5Var4.b0.getClass();
                        int i17 = tf5Var4.b0[i16];
                        if (i17 >= 0) {
                            gre.p(tf5Var4.e0[i17]);
                            tf5Var4.e0[i17] = z5;
                        }
                        pf5Var.c = -1;
                    }
                    r29[i7] = 0;
                }
                k64VarArr3 = k64VarArr2;
                r72 = i7 + 1;
            }
            k64[] k64VarArr4 = k64VarArr3;
            boolean z7 = true;
            if (!z6) {
                if (!tf5Var3.j0) {
                    iArr = iArr3;
                } else if (i15 != 0) {
                    iArr = iArr3;
                }
                z = z5;
                k64 k64Var2 = re5Var2.s;
                boolean z8 = z;
                k64 k64Var3 = k64Var2;
                r9 = z5;
                while (r9 < length4) {
                    int i18 = r9;
                    k64 k64Var4 = k64VarArr4[i18];
                    int i19 = length4;
                    if (k64Var4 != null) {
                        boolean z9 = z8;
                        int b = tf5Var3.Z.b(k64Var4.c());
                        if (b == tf5Var3.c0) {
                            Uri b2 = of5VarArr[re5Var2.s.n()].b();
                            sa3 sa3Var = (sa3) ta3Var.d.get(b2);
                            if (sa3Var != null) {
                                HashMap hashMap = sa3Var.b;
                                gre.p(hashMap.containsKey(b2));
                                ra3 ra3Var = (ra3) hashMap.get(b2);
                                ra3Var.getClass();
                                ra3Var.x = z5;
                            }
                            re5Var2.s = k64Var4;
                            k64Var3 = k64Var4;
                        }
                        if (r29[i18] == 0) {
                            tf5Var3.V++;
                            pf5 pf5Var2 = new pf5(tf5Var3, b);
                            r29[i18] = pf5Var2;
                            zArr2[i18] = z7;
                            if (tf5Var3.b0 != null) {
                                pf5Var2.c();
                                int i20 = tf5Var3.b0[b];
                                if (!z9 && i20 >= 0) {
                                    sf5 sf5Var = tf5Var3.M[i20];
                                    z8 = (sf5Var.v() == 0 || sf5Var.J(j, z7)) ? false : true;
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
                if (tf5Var3.V != 0) {
                    Uri b3 = of5VarArr[re5Var2.s.n()].b();
                    sa3 sa3Var2 = (sa3) ta3Var.d.get(b3);
                    if (sa3Var2 != null) {
                        HashMap hashMap2 = sa3Var2.b;
                        gre.p(hashMap2.containsKey(b3));
                        ra3 ra3Var2 = (ra3) hashMap2.get(b3);
                        ra3Var2.getClass();
                        ra3Var2.x = false;
                    }
                    re5Var2.o = null;
                    tf5Var3.X = null;
                    tf5Var3.i0 = true;
                    arrayList.clear();
                    if (mv6Var.W()) {
                        if (tf5Var3.T) {
                            for (sf5 sf5Var2 : tf5Var3.M) {
                                sf5Var2.l();
                            }
                        }
                        mv6Var.p();
                    } else {
                        tf5Var3.E();
                    }
                    re5Var = re5Var2;
                    i4 = i10;
                    i2 = i13;
                    ip9VarArr3 = ip9VarArr2;
                    i3 = i14;
                    z2 = z10;
                    iArr2 = iArr4;
                    tf5VarArr = tf5VarArr3;
                    tf5Var = tf5Var3;
                } else {
                    boolean z11 = true;
                    if (arrayList.isEmpty() || Objects.equals(k64Var3, k64Var2)) {
                        re5Var = re5Var2;
                        i = i10;
                        i2 = i13;
                        ip9VarArr3 = ip9VarArr2;
                        i3 = i14;
                        iArr2 = iArr4;
                        tf5VarArr = tf5VarArr3;
                        tf5Var = tf5Var3;
                    } else {
                        if (tf5Var3.j0) {
                            re5Var = re5Var2;
                            i = i10;
                            i2 = i13;
                            ip9VarArr3 = ip9VarArr2;
                            i3 = i14;
                            iArr2 = iArr4;
                            tf5VarArr = tf5VarArr3;
                            tf5Var = tf5Var3;
                        } else {
                            long j2 = j < 0 ? -j : 0L;
                            te5 x = tf5Var3.x();
                            long j3 = j2;
                            bk6[] b4 = re5Var2.b(x, j);
                            re5Var = re5Var2;
                            List list = tf5Var3.F;
                            i = i10;
                            i2 = i13;
                            ip9VarArr3 = ip9VarArr2;
                            i3 = i14;
                            iArr2 = iArr4;
                            tf5VarArr = tf5VarArr3;
                            tf5Var = tf5Var3;
                            k64 k64Var5 = k64Var3;
                            k64Var5.b(j, j3, -9223372036854775807L, list, b4);
                            z11 = true;
                        }
                        tf5Var.i0 = z11;
                        z3 = z11;
                        z2 = z3;
                        if (z2) {
                            i4 = i;
                        } else {
                            tf5Var.F(j, z3);
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
                ArrayList arrayList2 = tf5Var.J;
                arrayList2.clear();
                for (i5 = 0; i5 < i4; i5++) {
                    ?? r8 = r29[i5];
                    if (r8 != 0) {
                        arrayList2.add((pf5) r8);
                    }
                }
                tf5Var.j0 = true;
                i6 = 0;
                z4 = false;
                while (i6 < k64VarArr.length) {
                    ?? r82 = r29[i6];
                    int i23 = i3;
                    if (iArr2[i6] == i23) {
                        r82.getClass();
                        r10 = ip9VarArr3;
                        r10[i6] = r82;
                        identityHashMap.put(r82, Integer.valueOf(i23));
                        z4 = true;
                    } else {
                        r10 = ip9VarArr3;
                        if (iArr[i6] == i23) {
                            gre.p(r82 == 0);
                        }
                    }
                    i6++;
                    ip9VarArr3 = r10;
                    i3 = i23;
                }
                ip9[] ip9VarArr6 = ip9VarArr3;
                int i24 = i3;
                if (!z4) {
                    int i25 = i12;
                    tf5VarArr[i25] = tf5Var;
                    i12 = i25 + 1;
                    if (i25 == 0) {
                        re5Var.m = true;
                        if (!z2) {
                            tf5[] tf5VarArr4 = this.L;
                            if (tf5VarArr4.length != 0 && tf5Var == tf5VarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.w.b).clear();
                        z6 = true;
                    } else {
                        re5Var.m = i24 < this.M;
                    }
                }
                i11 = i24 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                tf5VarArr3 = tf5VarArr;
                ip9VarArr5 = r29;
                k64VarArr3 = k64VarArr4;
                length2 = i2;
                z5 = false;
                i10 = i4;
                ip9VarArr4 = ip9VarArr6;
                length4 = i21;
            }
            iArr = iArr3;
            z = true;
            k64 k64Var22 = re5Var2.s;
            boolean z82 = z;
            k64 k64Var32 = k64Var22;
            r9 = z5;
            while (r9 < length4) {
            }
            int i212 = length4;
            boolean z102 = z82;
            if (tf5Var3.V != 0) {
            }
            ArrayList arrayList22 = tf5Var.J;
            arrayList22.clear();
            while (i5 < i4) {
            }
            tf5Var.j0 = true;
            i6 = 0;
            z4 = false;
            while (i6 < k64VarArr.length) {
            }
            ip9[] ip9VarArr62 = ip9VarArr3;
            int i242 = i3;
            if (!z4) {
            }
            i11 = i242 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            tf5VarArr3 = tf5VarArr;
            ip9VarArr5 = r29;
            k64VarArr3 = k64VarArr4;
            length2 = i2;
            z5 = false;
            i10 = i4;
            ip9VarArr4 = ip9VarArr62;
            length4 = i212;
        }
        boolean z12 = z5;
        System.arraycopy(ip9VarArr4, z12 ? 1 : 0, ip9VarArr, z12 ? 1 : 0, length2);
        tf5[] tf5VarArr5 = (tf5[]) g8c.V(i12, tf5VarArr3);
        this.L = tf5VarArr5;
        w59 r = mm5.r(tf5VarArr5);
        AbstractList b5 = tne.b(r, new g31((byte) 8));
        this.x.getClass();
        this.N = new lq2(r, b5);
        return j;
    }

    @Override // q4a
    public final long g() {
        return this.N.g();
    }

    @Override // sr6
    public final long i(long j, gv9 gv9Var) {
        tf5[] tf5VarArr = this.L;
        int length = tf5VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            tf5 tf5Var = tf5VarArr[i];
            if (tf5Var.R == 2) {
                re5 re5Var = tf5Var.d;
                ta3 ta3Var = re5Var.g;
                int d = re5Var.s.d();
                of5[] of5VarArr = re5Var.e;
                df5 b = (d >= of5VarArr.length || d == -1) ? null : ta3Var.b(of5VarArr[re5Var.s.n()].b(), true);
                if (b != null) {
                    mm5 mm5Var = b.r;
                    if (!mm5Var.isEmpty()) {
                        long j2 = b.h - ta3Var.M;
                        long j3 = j - j2;
                        int d2 = g8c.d(mm5Var, Long.valueOf(j3), true);
                        long j4 = ((af5) mm5Var.get(d2)).e;
                        return gv9Var.a(j3, j4, (!b.c || d2 == mm5Var.size() - 1) ? j4 : ((af5) mm5Var.get(d2 + 1)).e) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // sr6
    public final void k() {
        for (tf5 tf5Var : this.K) {
            tf5Var.C();
            if (tf5Var.k0 && !tf5Var.U) {
                throw av7.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // sr6
    public final long l(long j) {
        tf5[] tf5VarArr = this.L;
        if (tf5VarArr.length > 0) {
            boolean F = tf5VarArr[0].F(j, false);
            int i = 1;
            while (true) {
                tf5[] tf5VarArr2 = this.L;
                if (i >= tf5VarArr2.length) {
                    break;
                }
                tf5VarArr2[i].F(j, F);
                i++;
            }
            if (F) {
                ((SparseArray) this.w.b).clear();
            }
        }
        return j;
    }

    @Override // sr6
    public final void m(long j) {
        for (tf5 tf5Var : this.L) {
            if (tf5Var.T && !tf5Var.A()) {
                int length = tf5Var.M.length;
                for (int i = 0; i < length; i++) {
                    tf5Var.M[i].k(j, tf5Var.e0[i]);
                }
            }
        }
    }

    @Override // sr6
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // sr6
    public final void p(rr6 rr6Var, long j) {
        String str;
        pa3 pa3Var;
        boolean z;
        Map map;
        tf5[] tf5VarArr;
        int i;
        ArrayList arrayList;
        int i2;
        mm5 mm5Var;
        Map map2;
        ArrayList arrayList2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        int i3;
        List list;
        this.H = rr6Var;
        ta3 ta3Var = this.b;
        ta3Var.e.add(this);
        hf5 hf5Var = ta3Var.w;
        hf5Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        mm5 c = ta3Var.c(0);
        c.getClass();
        mm5 c2 = ta3Var.c(2);
        c2.getClass();
        mm5 c3 = ta3Var.c(3);
        c3.getClass();
        boolean isEmpty = c.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        pa3 pa3Var2 = this.a;
        boolean z4 = this.y;
        if (isEmpty) {
            str = "ID3";
            pa3Var = pa3Var2;
            z = z4;
            map = map3;
        } else {
            fm4 fm4Var = hf5Var.j;
            List list2 = hf5Var.k;
            int size = c.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < c.size(); i6++) {
                fm4 fm4Var2 = ((of5) c.get(i6)).a.a;
                int i7 = fm4Var2.B;
                String str2 = fm4Var2.l;
                if (i7 > 0 || g8c.w(2, str2) != null) {
                    iArr[i6] = 2;
                    i4++;
                    i5 = i5;
                } else if (g8c.w(1, str2) != null) {
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
            of5[] of5VarArr = new of5[i3];
            fm4[] fm4VarArr = new fm4[i3];
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
                    of5 of5Var = (of5) c.get(i11);
                    of5VarArr[i10] = of5Var;
                    fm4VarArr[i10] = of5Var.a.a;
                    i10++;
                }
                i11++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = fm4VarArr[0].l;
            int v = g8c.v(2, str3);
            int v2 = g8c.v(1, str3);
            boolean z6 = (v2 == 1 || (v2 == 0 && c2.isEmpty())) && v <= 1 && v2 + v > 0;
            z = z4;
            tf5 c4 = c("main", (z5 || v2 <= 0) ? 0 : 1, of5VarArr, fm4VarArr, fm4Var, list3, map3, j);
            arrayList3.add(c4);
            if (z && z6) {
                ArrayList arrayList4 = new ArrayList();
                if (v > 0) {
                    fm4[] fm4VarArr2 = new fm4[i3];
                    int i12 = 0;
                    while (i12 < i3) {
                        fm4 fm4Var3 = fm4VarArr[i12];
                        fm4[] fm4VarArr3 = fm4VarArr;
                        String w = g8c.w(2, fm4Var3.l);
                        String d = ud7.d(w);
                        em4 em4Var = new em4();
                        em4Var.a = fm4Var3.a;
                        em4Var.b = fm4Var3.b;
                        em4Var.c = mm5.q(fm4Var3.c);
                        em4Var.r = ud7.n(fm4Var3.s);
                        em4Var.s = ud7.n(d);
                        em4Var.k = w;
                        em4Var.l = fm4Var3.m;
                        em4Var.i = fm4Var3.i;
                        em4Var.j = fm4Var3.j;
                        em4Var.z = fm4Var3.A;
                        em4Var.A = fm4Var3.B;
                        em4Var.a(fm4Var3.F);
                        em4Var.e = fm4Var3.e;
                        em4Var.f = fm4Var3.f;
                        em4Var.K = fm4Var3.L;
                        fm4VarArr2[i12] = new fm4(em4Var);
                        i12++;
                        fm4VarArr = fm4VarArr3;
                        map3 = map3;
                    }
                    fm4[] fm4VarArr4 = fm4VarArr;
                    map = map3;
                    arrayList4.add(new sxb("main", fm4VarArr2));
                    if (v2 > 0 && (fm4Var != null || c2.isEmpty())) {
                        em4 a = h(fm4VarArr4[0], fm4Var, false).a();
                        a.m = "main";
                        arrayList4.add(new sxb("main:audio", new fm4(a)));
                    }
                    if (list3 != null) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            String k = de9.k(i13, "main:cc:");
                            em4 a2 = pa3Var2.e((fm4) list3.get(i13)).a();
                            a2.m = "main";
                            arrayList4.add(new sxb(k, new fm4(a2)));
                        }
                    }
                    pa3Var = pa3Var2;
                } else {
                    map = map3;
                    pa3Var = pa3Var2;
                    fm4[] fm4VarArr5 = new fm4[i3];
                    for (int i14 = 0; i14 < i3; i14++) {
                        fm4VarArr5[i14] = h(fm4VarArr[i14], fm4Var, true);
                    }
                    arrayList4.add(new sxb("main", fm4VarArr5));
                }
                em4 em4Var2 = new em4();
                str = "ID3";
                em4Var2.a = str;
                em4Var2.s = ud7.n("application/id3");
                em4Var2.m = "main";
                sxb sxbVar = new sxb("main:id3", new fm4(em4Var2));
                arrayList4.add(sxbVar);
                c4.D((sxb[]) arrayList4.toArray(new sxb[0]), arrayList4.indexOf(sxbVar));
            } else {
                map = map3;
                str = "ID3";
                pa3Var = pa3Var2;
            }
        }
        ArrayList arrayList5 = new ArrayList(c2.size());
        ArrayList arrayList6 = new ArrayList(c2.size());
        HashSet hashSet2 = new HashSet();
        int i15 = 0;
        while (i15 < c2.size()) {
            String str4 = ((of5) c2.get(i15)).a.c;
            str4.getClass();
            if (hashSet2.add(str4)) {
                arrayList5.clear();
                arrayList6.clear();
                boolean z7 = true;
                for (int i16 = 0; i16 < c2.size(); i16++) {
                    if (str4.equals(((of5) c2.get(i16)).a.c)) {
                        of5 of5Var2 = (of5) c2.get(i16);
                        fm4 fm4Var4 = of5Var2.a.a;
                        arrayList5.add(of5Var2);
                        arrayList6.add(fm4Var4);
                        z7 &= g8c.v(1, fm4Var4.l) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = g8c.a;
                arrayList = arrayList5;
                i2 = i15;
                mm5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
                tf5 c5 = c(concat, 1, (of5[]) arrayList5.toArray(new of5[0]), (fm4[]) arrayList6.toArray(new fm4[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(c5);
                if (z && z7) {
                    String concat2 = concat.concat(":id3");
                    em4 em4Var3 = new em4();
                    em4Var3.a = str;
                    em4Var3.s = ud7.n("application/id3");
                    em4Var3.m = concat;
                    c5.D(new sxb[]{new sxb(concat, (fm4[]) arrayList2.toArray(new fm4[0])), new sxb(concat2, new fm4(em4Var3))}, 1);
                }
            } else {
                arrayList = arrayList5;
                i2 = i15;
                mm5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
            }
            i15 = i2 + 1;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
            c2 = mm5Var;
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
            String str6 = ((of5) c3.get(i17)).a.c;
            str6.getClass();
            if (hashSet3.add(str6)) {
                arrayList7.clear();
                arrayList8.clear();
                for (int i18 = 0; i18 < c3.size(); i18++) {
                    if (str6.equals(((of5) c3.get(i18)).a.c)) {
                        of5 of5Var3 = (of5) c3.get(i18);
                        arrayList7.add(of5Var3);
                        arrayList8.add(of5Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                fm4[] fm4VarArr6 = (fm4[]) arrayList8.toArray(new fm4[0]);
                String str7 = g8c.a;
                of5[] of5VarArr2 = (of5[]) arrayList7.toArray(new of5[0]);
                km5 km5Var = mm5.b;
                i = i17;
                tf5 c6 = c(concat3, 3, of5VarArr2, fm4VarArr6, null, w59.e, map4, j);
                arrayList3.add(c6);
                int length = fm4VarArr6.length;
                fm4[] fm4VarArr7 = new fm4[length];
                for (int i19 = 0; i19 < length; i19++) {
                    fm4VarArr7[i19] = pa3Var.e(fm4VarArr6[i19]);
                }
                c6.D(new sxb[]{new sxb(concat3, fm4VarArr7)}, new int[0]);
            } else {
                i = i17;
            }
            i17 = i + 1;
        }
        tf5[] tf5VarArr2 = (tf5[]) arrayList3.toArray(new tf5[0]);
        this.K = tf5VarArr2;
        this.I = tf5VarArr2.length;
        int i20 = 0;
        while (true) {
            int i21 = this.M;
            tf5VarArr = this.K;
            if (i20 >= i21) {
                break;
            }
            tf5VarArr[i20].d.m = true;
            i20++;
        }
        for (tf5 tf5Var : tf5VarArr) {
            if (!tf5Var.U) {
                s86 s86Var = new s86();
                s86Var.a = tf5Var.g0;
                tf5Var.r(new t86(s86Var));
            }
        }
        this.L = this.K;
    }

    @Override // sr6
    public final txb q() {
        txb txbVar = this.J;
        txbVar.getClass();
        return txbVar;
    }

    @Override // q4a
    public final boolean r(t86 t86Var) {
        if (this.J != null) {
            return this.N.r(t86Var);
        }
        for (tf5 tf5Var : this.K) {
            if (!tf5Var.U) {
                s86 s86Var = new s86();
                s86Var.a = tf5Var.g0;
                tf5Var.r(new t86(s86Var));
            }
        }
        return false;
    }

    @Override // q4a
    public final long s() {
        return this.N.s();
    }

    @Override // q4a
    public final void t(long j) {
        this.N.t(j);
    }

    @Override // sr6
    public final void f() {
    }
}
