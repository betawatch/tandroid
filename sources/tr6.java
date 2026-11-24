// default package

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tr6 {
    public final ej6 a;
    public final Object b;
    public final ip9[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ur6 g;
    public final boolean[] h;
    public final boolean[] i;
    public final ug0[] j;
    public final sc3 k;
    public final ey6 l;
    public tr6 m;
    public txb n;
    public cyb o;
    public long p;

    public tr6(ug0[] ug0VarArr, long j, sc3 sc3Var, mv6 mv6Var, ey6 ey6Var, ur6 ur6Var, cyb cybVar) {
        this.j = ug0VarArr;
        this.p = j;
        this.k = sc3Var;
        this.l = ey6Var;
        rx6 rx6Var = ur6Var.a;
        Object obj = rx6Var.a;
        this.b = obj;
        this.g = ur6Var;
        this.n = txb.d;
        this.o = cybVar;
        this.c = new ip9[ug0VarArr.length];
        this.h = new boolean[ug0VarArr.length];
        this.i = new boolean[ug0VarArr.length];
        long j2 = ur6Var.b;
        ey6Var.getClass();
        int i = dd8.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        rx6 a = rx6Var.a(pair.second);
        dy6 dy6Var = (dy6) ey6Var.e.get(obj2);
        dy6Var.getClass();
        ey6Var.h.add(dy6Var);
        cy6 cy6Var = (cy6) ey6Var.g.get(dy6Var);
        if (cy6Var != null) {
            cy6Var.a.f(cy6Var.b);
        }
        dy6Var.c.add(a);
        ej6 c = dy6Var.a.c(a, mv6Var, j2);
        ey6Var.d.put(c, dy6Var);
        ey6Var.c();
        this.a = c;
    }

    public final long a(cyb cybVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        ug0[] ug0VarArr;
        boolean[] zArr3;
        ip9[] ip9VarArr;
        k64[] k64VarArr = (k64[]) cybVar.d;
        int i = 0;
        while (true) {
            int i2 = cybVar.b;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !cybVar.p(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            ug0VarArr = this.j;
            int length = ug0VarArr.length;
            zArr3 = zArr2;
            ip9VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (ug0VarArr[i3].b == -2) {
                ip9VarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = cybVar;
        c();
        long e = this.a.e(k64VarArr, zArr3, ip9VarArr, zArr, j);
        for (int i4 = 0; i4 < ug0VarArr.length; i4++) {
            if (ug0VarArr[i4].b == -2 && this.o.q(i4)) {
                ip9VarArr[i4] = new e24();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < ip9VarArr.length; i5++) {
            if (ip9VarArr[i5] != null) {
                gre.p(cybVar.q(i5));
                if (ug0VarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                gre.p(k64VarArr[i5] == null);
            }
        }
        return e;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            cyb cybVar = this.o;
            if (i >= cybVar.b) {
                return;
            }
            boolean q = cybVar.q(i);
            k64 k64Var = ((k64[]) this.o.d)[i];
            if (q && k64Var != null) {
                k64Var.m();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            cyb cybVar = this.o;
            if (i >= cybVar.b) {
                return;
            }
            boolean q = cybVar.q(i);
            k64 k64Var = ((k64[]) this.o.d)[i];
            if (q && k64Var != null) {
                k64Var.j();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long s = this.f ? this.a.s() : Long.MIN_VALUE;
        return s == Long.MIN_VALUE ? this.g.e : s;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, aob aobVar, boolean z) {
        this.e = true;
        this.n = this.a.q();
        cyb j = j(f, aobVar, z);
        ur6 ur6Var = this.g;
        long j2 = ur6Var.b;
        long j3 = ur6Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        ur6 ur6Var2 = this.g;
        this.p = (ur6Var2.b - a) + j4;
        this.g = ur6Var2.b(a, ur6Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.s() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        ey6 ey6Var = this.l;
        ej6 ej6Var = this.a;
        try {
            IdentityHashMap identityHashMap = ey6Var.d;
            dy6 dy6Var = (dy6) identityHashMap.remove(ej6Var);
            dy6Var.getClass();
            dy6Var.a.o(ej6Var);
            dy6Var.c.remove(ej6Var.a);
            if (!identityHashMap.isEmpty()) {
                ey6Var.c();
            }
            ey6Var.d(dy6Var);
        } catch (RuntimeException e) {
            lad.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final cyb j(float f, aob aobVar, boolean z) {
        int i;
        nc3 nc3Var;
        int i2;
        boolean z2;
        int[] iArr;
        Context context;
        String str;
        nc3 nc3Var2;
        int i3;
        j64[] j64VarArr;
        String str2;
        int[] iArr2;
        txb[] txbVarArr;
        int[][][] iArr3;
        int i4;
        int i5;
        int[] iArr4;
        s93 s93Var;
        w59 f2;
        w59 w59Var;
        int i6;
        int[] iArr5;
        long[][] jArr;
        String str3;
        Pair l;
        CaptioningManager captioningManager;
        Locale locale;
        Pair l2;
        int i7;
        boolean z3;
        Context context2;
        int[] iArr6;
        sc3 sc3Var = this.k;
        ug0[] ug0VarArr = this.j;
        txb txbVar = this.n;
        sc3Var.getClass();
        int i8 = 1;
        int[] iArr7 = new int[ug0VarArr.length + 1];
        int length = ug0VarArr.length + 1;
        sxb[][] sxbVarArr = new sxb[length][];
        int[][][] iArr8 = new int[ug0VarArr.length + 1][][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = txbVar.a;
            sxbVarArr[i9] = new sxb[i10];
            iArr8[i9] = new int[i10][];
        }
        int length2 = ug0VarArr.length;
        int[] iArr9 = new int[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            iArr9[i11] = ug0VarArr[i11].H();
        }
        int i12 = 0;
        while (i12 < txbVar.a) {
            sxb a = txbVar.a(i12);
            int i13 = a.c == 5 ? i8 : 0;
            int length3 = ug0VarArr.length;
            int i14 = i8;
            int i15 = 0;
            int i16 = 0;
            while (i16 < ug0VarArr.length) {
                ug0 ug0Var = ug0VarArr[i16];
                txb txbVar2 = txbVar;
                int[] iArr10 = iArr7;
                int i17 = i8;
                int i18 = 0;
                for (int i19 = 0; i19 < a.a; i19++) {
                    i18 = Math.max(i18, ug0Var.G(a.d[i19]) & 7);
                }
                int i20 = iArr10[i16] == 0 ? i17 : 0;
                if (i18 > i15 || (i18 == i15 && i13 != 0 && i14 == 0 && i20 != 0)) {
                    i15 = i18;
                    i14 = i20;
                    length3 = i16;
                }
                i16++;
                txbVar = txbVar2;
                iArr7 = iArr10;
                i8 = i17;
            }
            txb txbVar3 = txbVar;
            int[] iArr11 = iArr7;
            int i21 = i8;
            if (length3 == ug0VarArr.length) {
                iArr6 = new int[a.a];
            } else {
                ug0 ug0Var2 = ug0VarArr[length3];
                int[] iArr12 = new int[a.a];
                for (int i22 = 0; i22 < a.a; i22++) {
                    iArr12[i22] = ug0Var2.G(a.d[i22]);
                }
                iArr6 = iArr12;
            }
            int i23 = iArr11[length3];
            sxbVarArr[length3][i23] = a;
            iArr8[length3][i23] = iArr6;
            iArr11[length3] = i23 + 1;
            i12++;
            txbVar = txbVar3;
            iArr7 = iArr11;
            i8 = i21;
        }
        int[] iArr13 = iArr7;
        int i24 = i8;
        txb[] txbVarArr2 = new txb[ug0VarArr.length];
        String[] strArr = new String[ug0VarArr.length];
        int[] iArr14 = new int[ug0VarArr.length];
        for (int i25 = 0; i25 < ug0VarArr.length; i25++) {
            int i26 = iArr13[i25];
            txbVarArr2[i25] = new txb((sxb[]) g8c.V(i26, sxbVarArr[i25]));
            iArr8[i25] = (int[][]) g8c.V(i26, iArr8[i25]);
            strArr[i25] = ug0VarArr[i25].l();
            iArr14[i25] = ug0VarArr[i25].b;
        }
        int[] iArr15 = iArr14;
        ko koVar = new ko(iArr15, txbVarArr2, iArr9, iArr8, new txb((sxb[]) g8c.V(iArr13[ug0VarArr.length], sxbVarArr[ug0VarArr.length])));
        sc3Var.h = Thread.currentThread();
        Boolean bool = sc3Var.k;
        if (bool == null && (context2 = sc3Var.d) != null) {
            bool = Boolean.valueOf(g8c.Q(context2));
            sc3Var.k = bool;
        }
        if (sc3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && sc3Var.i == null) {
            sc3Var.i = new ska(sc3Var.d, new mk2(sc3Var, (byte) 22), bool);
        }
        int i27 = koVar.a;
        j64[] j64VarArr2 = new j64[i27];
        sc3.c(koVar, sc3Var.g, j64VarArr2);
        sc3.a(koVar, sc3Var.g, j64VarArr2);
        sc3.b(koVar, sc3Var.g, j64VarArr2);
        nc3 nc3Var3 = sc3Var.g;
        Context context3 = sc3Var.d;
        int i28 = koVar.a;
        Pair e = sc3.e(j64VarArr2, i24);
        if (e == null) {
            int i29 = 0;
            while (true) {
                if (i29 >= i28) {
                    i7 = 2;
                    z3 = false;
                    break;
                }
                if (2 == iArr15[i29] && txbVarArr2[i29].a > 0) {
                    i7 = 2;
                    z3 = true;
                    break;
                }
                i29++;
            }
            i = i28;
            nc3Var = nc3Var3;
            i2 = i7;
            context = context3;
            xf xfVar = new xf((Object) sc3Var, (Object) nc3Var, z3, (Object) iArr9, (byte) 3);
            z2 = 7;
            iArr = iArr9;
            e = sc3.l(1, koVar, iArr8, xfVar, new mz2((byte) 7));
            if (e != null) {
                j64VarArr2[((Integer) e.second).intValue()] = (j64) e.first;
            }
        } else {
            i = i28;
            nc3Var = nc3Var3;
            i2 = 2;
            z2 = 7;
            iArr = iArr9;
            context = context3;
        }
        if (e == null) {
            str = null;
        } else {
            j64 j64Var = (j64) e.first;
            str = j64Var.a.d[j64Var.b[0]].d;
        }
        Pair e2 = sc3.e(j64VarArr2, i2);
        Pair e3 = sc3.e(j64VarArr2, 4);
        if (e2 == null && e3 == null) {
            if (nc3Var.w.a == i2) {
                int i30 = i;
                nc3Var2 = nc3Var;
                i3 = i30;
                j64VarArr = j64VarArr2;
                str2 = str;
                l2 = null;
            } else {
                Point y = (!nc3Var.k || context == null) ? null : g8c.y(context);
                j64VarArr = j64VarArr2;
                int i31 = i;
                nc3Var2 = nc3Var;
                i3 = i31;
                str2 = str;
                l2 = sc3.l(i2, koVar, iArr8, new lt((Object) nc3Var2, (Object) str, (Object) iArr, (Object) y, (byte) 11), new mz2((byte) 6));
            }
            Pair l3 = ((nc3Var2.E || l2 == null) && nc3Var2.w.a != i2) ? sc3.l(4, koVar, iArr8, new vu2(nc3Var2, (byte) 18), new mz2((byte) 5)) : null;
            if (l3 != null) {
                j64VarArr[((Integer) l3.second).intValue()] = (j64) l3.first;
            } else if (l2 != null) {
                j64VarArr[((Integer) l2.second).intValue()] = (j64) l2.first;
            }
        } else {
            int i32 = i;
            nc3Var2 = nc3Var;
            i3 = i32;
            j64VarArr = j64VarArr2;
            str2 = str;
        }
        if (sc3.e(j64VarArr, 3) == null) {
            if (nc3Var2.w.a == 2) {
                l = null;
            } else {
                if (!nc3Var2.B || context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = g8c.a;
                    str3 = locale.toLanguageTag();
                }
                l = sc3.l(3, koVar, iArr8, new lt2((Object) nc3Var2, (Object) str2, (Object) str3, (byte) 5), new mz2((byte) 8));
            }
            if (l != null) {
                j64VarArr[((Integer) l.second).intValue()] = (j64) l.first;
            }
        }
        int a2 = ls6.a(0, 0, 0, 0);
        if (nc3Var2.w.a == 2) {
            iArr2 = iArr15;
            txbVarArr = txbVarArr2;
            iArr3 = iArr8;
        } else {
            int i33 = ym5.c;
            xm5 xm5Var = new xm5(4);
            int i34 = 0;
            while (i34 < i27) {
                j64 j64Var2 = j64VarArr[i34];
                if (j64Var2 != null) {
                    sxb sxbVar = j64Var2.a;
                    if (!nc3Var2.E0.get(i34)) {
                        i5 = i34;
                        if (!nc3Var2.I.contains(Integer.valueOf(sxbVar.c))) {
                            xm5Var.f(sxbVar.b);
                            int i35 = 0;
                            while (true) {
                                int[] iArr16 = j64Var2.b;
                                iArr4 = iArr15;
                                if (i35 < iArr16.length) {
                                    String str5 = sxbVar.d[iArr16[i35]].n;
                                    if (str5 != null) {
                                        xm5Var.c(str5);
                                    }
                                    i35++;
                                    iArr15 = iArr4;
                                }
                            }
                            i34 = i5 + 1;
                            iArr15 = iArr4;
                        }
                        iArr4 = iArr15;
                        i34 = i5 + 1;
                        iArr15 = iArr4;
                    }
                }
                i5 = i34;
                iArr4 = iArr15;
                i34 = i5 + 1;
                iArr15 = iArr4;
            }
            iArr2 = iArr15;
            ym5 g = xm5Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i36 = 0;
            while (i36 < i3) {
                if (iArr2[i36] != 5) {
                    i4 = i36;
                } else {
                    txb txbVar4 = txbVarArr2[i36];
                    i4 = i36;
                    int i37 = 0;
                    while (i37 < txbVar4.a) {
                        sxb a3 = txbVar4.a(i37);
                        arrayList.add(a3);
                        txb[] txbVarArr3 = txbVarArr2;
                        int[] iArr17 = (int[]) iArr8[i4][i37].clone();
                        txb txbVar5 = txbVar4;
                        int[][][] iArr18 = iArr8;
                        for (int i38 = 0; i38 < iArr17.length; i38++) {
                            String str6 = a3.d[i38].n;
                            if (str6 != null && !g.contains(str6)) {
                                iArr17[i38] = a2;
                            }
                        }
                        arrayList2.add(iArr17);
                        i37++;
                        txbVar4 = txbVar5;
                        txbVarArr2 = txbVarArr3;
                        iArr8 = iArr18;
                    }
                }
                i36 = i4 + 1;
                txbVarArr2 = txbVarArr2;
                iArr8 = iArr8;
            }
            txbVarArr = txbVarArr2;
            iArr3 = iArr8;
            int size = arrayList.size();
            sxb[] sxbVarArr2 = new sxb[size];
            gre.p(arrayList.size() == size);
            arrayList.toArray(sxbVarArr2);
            txb txbVar6 = new txb(sxbVarArr2);
            int size2 = arrayList2.size();
            int[][] iArr19 = new int[size2][];
            gre.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr19);
            for (int i39 = 0; i39 < i3; i39++) {
                if (iArr2[i39] == 5) {
                    j64 k = sc3.k(txbVar6, iArr19, nc3Var2);
                    j64VarArr[i39] = k;
                    if (k == null) {
                        break;
                    }
                    Arrays.fill(iArr19[txbVar6.b(k.a)], a2);
                }
            }
        }
        for (int i40 = 0; i40 < i3; i40++) {
            int i41 = iArr2[i40];
            if (i41 != 2 && i41 != 1 && i41 != 3 && i41 != 4 && i41 != 5 && j64VarArr[i40] == null) {
                j64VarArr[i40] = sc3.k(txbVarArr[i40], iArr3[i40], nc3Var2);
            }
        }
        sc3.c(koVar, sc3Var.g, j64VarArr);
        sc3.a(koVar, sc3Var.g, j64VarArr);
        sc3.b(koVar, sc3Var.g, j64VarArr);
        o5f o5fVar = sc3Var.e;
        s93 s93Var2 = sc3Var.b;
        s93Var2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (j64 j64Var3 : j64VarArr) {
            if (j64Var3 == null || j64Var3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                jm5 p = mm5.p();
                p.c(new la(0L, 0L));
                arrayList3.add(p);
            }
        }
        int length4 = j64VarArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i42 = 0; i42 < j64VarArr.length; i42++) {
            j64 j64Var4 = j64VarArr[i42];
            if (j64Var4 == null) {
                jArr2[i42] = new long[0];
            } else {
                int[] iArr20 = j64Var4.b;
                jArr2[i42] = new long[iArr20.length];
                for (int i43 = 0; i43 < iArr20.length; i43++) {
                    long j = j64Var4.a.d[iArr20[i43]].k;
                    long[] jArr3 = jArr2[i42];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i43] = j;
                }
                Arrays.sort(jArr2[i42]);
            }
        }
        int[] iArr21 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i44 = 0; i44 < length4; i44++) {
            long[] jArr5 = jArr2[i44];
            jArr4[i44] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        ma.w(arrayList3, jArr4);
        krd.b(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(hi7.b);
        vg7 vg7Var = new vg7();
        krd.b(2, "expectedValuesPerKey");
        wg7 wg7Var = new wg7(treeMap);
        wg7Var.h = vg7Var;
        int i45 = 0;
        loop13: while (true) {
            if (i45 < length4) {
                long[] jArr6 = jArr2[i45];
                if (jArr6.length <= 1) {
                    s93Var = s93Var2;
                    i6 = length4;
                    iArr5 = iArr21;
                    jArr = jArr2;
                } else {
                    int length5 = jArr6.length;
                    double[] dArr = new double[length5];
                    s93Var = s93Var2;
                    int i46 = 0;
                    while (true) {
                        long[] jArr7 = jArr2[i45];
                        i6 = length4;
                        double d = 0.0d;
                        iArr5 = iArr21;
                        if (i46 >= jArr7.length) {
                            break;
                        }
                        long[][] jArr8 = jArr2;
                        long j2 = jArr7[i46];
                        if (j2 != -1) {
                            d = Math.log(j2);
                        }
                        dArr[i46] = d;
                        i46++;
                        jArr2 = jArr8;
                        length4 = i6;
                        iArr21 = iArr5;
                    }
                    long[][] jArr9 = jArr2;
                    int i47 = length5 - 1;
                    double d2 = dArr[i47] - dArr[0];
                    int i48 = 0;
                    while (i48 < i47) {
                        double d3 = dArr[i48];
                        int i49 = i48 + 1;
                        Double valueOf = Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i49]) * 0.5d) - dArr[0]) / d2);
                        Integer valueOf2 = Integer.valueOf(i45);
                        long[][] jArr10 = jArr9;
                        Map map = wg7Var.e;
                        double d4 = d2;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            Collection m = wg7Var.m();
                            if (!m.add(valueOf2)) {
                                fi7.g("New Collection violated the Collection spec");
                                f2 = null;
                                break loop13;
                            }
                            wg7Var.f++;
                            map.put(valueOf, m);
                        } else if (collection.add(valueOf2)) {
                            wg7Var.f++;
                        }
                        i48 = i49;
                        jArr9 = jArr10;
                        d2 = d4;
                    }
                    jArr = jArr9;
                }
                i45++;
                length4 = i6;
                iArr21 = iArr5;
                jArr2 = jArr;
                s93Var2 = s93Var;
            } else {
                s93Var = s93Var2;
                int[] iArr22 = iArr21;
                long[][] jArr11 = jArr2;
                Collection collection2 = wg7Var.c;
                if (collection2 == null) {
                    collection2 = new p3(wg7Var, (byte) 1);
                    wg7Var.c = collection2;
                }
                mm5 q = mm5.q(collection2);
                for (int i50 = 0; i50 < q.size(); i50++) {
                    int intValue = ((Integer) q.get(i50)).intValue();
                    int i51 = iArr22[intValue] + 1;
                    iArr22[intValue] = i51;
                    jArr4[intValue] = jArr11[intValue][i51];
                    ma.w(arrayList3, jArr4);
                }
                for (int i52 = 0; i52 < j64VarArr.length; i52++) {
                    if (arrayList3.get(i52) != null) {
                        jArr4[i52] = jArr4[i52] << 1;
                    }
                }
                ma.w(arrayList3, jArr4);
                jm5 p2 = mm5.p();
                for (int i53 = 0; i53 < arrayList3.size(); i53++) {
                    jm5 jm5Var = (jm5) arrayList3.get(i53);
                    p2.c(jm5Var == null ? w59.e : jm5Var.f());
                }
                f2 = p2.f();
            }
        }
        k64[] k64VarArr = new k64[j64VarArr.length];
        for (int i54 = 0; i54 < j64VarArr.length; i54++) {
            j64 j64Var5 = j64VarArr[i54];
            if (j64Var5 != null) {
                int[] iArr23 = j64Var5.b;
                if (iArr23.length != 0) {
                    int length6 = iArr23.length;
                    sxb sxbVar2 = j64Var5.a;
                    k64VarArr[i54] = length6 == 1 ? new yh4(0, sxbVar2, new int[]{iArr23[0]}) : new ma(sxbVar2, iArr23, s93Var, 10000L, 25000L, 25000L, (mm5) f2.get(i54));
                }
            }
        }
        d79[] d79VarArr = new d79[i27];
        for (int i55 = 0; i55 < i27; i55++) {
            d79VarArr[i55] = (sc3Var.g.E0.get(i55) || sc3Var.g.I.contains(Integer.valueOf(((int[]) koVar.b)[i55])) || (((int[]) koVar.b)[i55] != -2 && k64VarArr[i55] == null)) ? null : d79.c;
        }
        sc3Var.g.getClass();
        nc3 nc3Var4 = sc3Var.g;
        if (nc3Var4.w.a != 0) {
            int i56 = 0;
            int i57 = 0;
            int i58 = -1;
            while (true) {
                if (i56 < koVar.a) {
                    int i59 = ((int[]) koVar.b)[i56];
                    k64 k64Var = k64VarArr[i56];
                    if (i59 != 1) {
                        if (k64Var != null) {
                            break;
                        }
                    } else if (k64Var != null && k64Var.length() == 1) {
                        if (sc3.j(nc3Var4, iArr3[i56][((txb[]) koVar.c)[i56].b(k64Var.c())][k64Var.k(0)], k64Var.o())) {
                            i57++;
                            i58 = i56;
                        }
                    }
                    i56++;
                } else if (i57 == 1) {
                    int i60 = nc3Var4.w.b ? 1 : 2;
                    d79 d79Var = d79VarArr[i58];
                    d79VarArr[i58] = new d79(i60, d79Var != null && d79Var.b);
                }
            }
        }
        Pair create = Pair.create(d79VarArr, k64VarArr);
        k64[] k64VarArr2 = (k64[]) create.second;
        int length7 = k64VarArr2.length;
        List[] listArr = new List[length7];
        for (int i61 = 0; i61 < k64VarArr2.length; i61++) {
            k64 k64Var2 = k64VarArr2[i61];
            if (k64Var2 != null) {
                w59Var = mm5.u(k64Var2);
            } else {
                km5 km5Var = mm5.b;
                w59Var = w59.e;
            }
            listArr[i61] = w59Var;
        }
        jm5 jm5Var2 = new jm5(4);
        int i62 = 0;
        while (true) {
            int i63 = koVar.a;
            txb[] txbVarArr4 = (txb[]) koVar.c;
            if (i62 >= i63) {
                break;
            }
            txb txbVar7 = txbVarArr4[i62];
            int i64 = 0;
            while (i64 < txbVar7.a) {
                sxb a4 = txbVar7.a(i64);
                int i65 = txbVarArr4[i62].a(i64).a;
                int[] iArr24 = new int[i65];
                int i66 = 0;
                int i67 = 0;
                while (i67 < i65) {
                    List[] listArr2 = listArr;
                    if ((((int[][][]) koVar.e)[i62][i64][i67] & 7) == 4) {
                        iArr24[i66] = i67;
                        i66++;
                    }
                    i67++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr24, i66);
                int i68 = 16;
                int i69 = i62;
                String str7 = null;
                int i70 = 0;
                boolean z4 = false;
                int i71 = 0;
                while (i70 < copyOf.length) {
                    int[] iArr25 = copyOf;
                    String str8 = txbVarArr4[i69].a(i64).d[copyOf[i70]].t;
                    int i72 = i71 + 1;
                    if (i71 == 0) {
                        str7 = str8;
                    } else {
                        z4 |= !Objects.equals(str7, str8);
                    }
                    i68 = Math.min(i68, ((int[][][]) koVar.e)[i69][i64][i70] & 24);
                    i70++;
                    i71 = i72;
                    copyOf = iArr25;
                }
                if (z4) {
                    i68 = Math.min(i68, ((int[]) koVar.d)[i69]);
                }
                boolean z5 = i68 != 0;
                int i73 = a4.a;
                int[] iArr26 = new int[i73];
                boolean[] zArr = new boolean[i73];
                int i74 = 0;
                while (i74 < a4.a) {
                    iArr26[i74] = ((int[][][]) koVar.e)[i69][i64][i74] & 7;
                    int i75 = 0;
                    boolean z6 = false;
                    while (i75 < length7) {
                        List list = listArr3[i75];
                        int i76 = length7;
                        txb txbVar8 = txbVar7;
                        int i77 = 0;
                        while (true) {
                            if (i77 < list.size()) {
                                k64 k64Var3 = (k64) list.get(i77);
                                int i78 = i77;
                                if (k64Var3.c().equals(a4) && k64Var3.v(i74) != -1) {
                                    z6 = true;
                                    break;
                                }
                                i77 = i78 + 1;
                            }
                        }
                        i75++;
                        length7 = i76;
                        txbVar7 = txbVar8;
                    }
                    zArr[i74] = z6;
                    i74++;
                    txbVar7 = txbVar7;
                }
                jm5Var2.c(new dyb(a4, z5, iArr26, zArr));
                i64++;
                listArr = listArr3;
                i62 = i69;
                length7 = length7;
                txbVar7 = txbVar7;
            }
            i62++;
        }
        txb txbVar9 = (txb) koVar.f;
        for (int i79 = 0; i79 < txbVar9.a; i79++) {
            sxb a5 = txbVar9.a(i79);
            int[] iArr27 = new int[a5.a];
            Arrays.fill(iArr27, 0);
            jm5Var2.c(new dyb(a5, false, iArr27, new boolean[a5.a]));
        }
        cyb cybVar = new cyb((d79[]) create.first, (k64[]) create.second, new eyb(jm5Var2.f()), koVar);
        for (int i80 = 0; i80 < cybVar.b; i80++) {
            boolean q2 = cybVar.q(i80);
            k64[] k64VarArr3 = (k64[]) cybVar.d;
            if (q2) {
                gre.p(k64VarArr3[i80] != null || this.j[i80].b == -2);
            } else {
                gre.p(k64VarArr3[i80] == null);
            }
        }
        for (k64 k64Var4 : (k64[]) cybVar.d) {
            if (k64Var4 != null) {
                k64Var4.r(f);
                k64Var4.h(z);
            }
        }
        return cybVar;
    }
}
