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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ut6 {
    public final hl6 a;
    public final Object b;
    public final jr9[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public vt6 g;
    public final boolean[] h;
    public final boolean[] i;
    public final uh0[] j;
    public final fe3 k;
    public final e07 l;
    public ut6 m;
    public vzb n;
    public e0c o;
    public long p;

    public ut6(uh0[] uh0VarArr, long j, fe3 fe3Var, mx6 mx6Var, e07 e07Var, vt6 vt6Var, e0c e0cVar) {
        this.j = uh0VarArr;
        this.p = j;
        this.k = fe3Var;
        this.l = e07Var;
        rz6 rz6Var = vt6Var.a;
        Object obj = rz6Var.a;
        this.b = obj;
        this.g = vt6Var;
        this.n = vzb.d;
        this.o = e0cVar;
        this.c = new jr9[uh0VarArr.length];
        this.h = new boolean[uh0VarArr.length];
        this.i = new boolean[uh0VarArr.length];
        long j2 = vt6Var.b;
        e07Var.getClass();
        int i = ff8.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        rz6 a = rz6Var.a(pair.second);
        d07 d07Var = (d07) e07Var.e.get(obj2);
        d07Var.getClass();
        e07Var.h.add(d07Var);
        c07 c07Var = (c07) e07Var.g.get(d07Var);
        if (c07Var != null) {
            c07Var.a.f(c07Var.b);
        }
        d07Var.c.add(a);
        hl6 c = d07Var.a.c(a, mx6Var, j2);
        e07Var.d.put(c, d07Var);
        e07Var.c();
        this.a = c;
    }

    public final long a(e0c e0cVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        uh0[] uh0VarArr;
        boolean[] zArr3;
        jr9[] jr9VarArr;
        t74[] t74VarArr = (t74[]) e0cVar.d;
        int i = 0;
        while (true) {
            int i2 = e0cVar.b;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !e0cVar.p(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            uh0VarArr = this.j;
            int length = uh0VarArr.length;
            zArr3 = zArr2;
            jr9VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (uh0VarArr[i3].b == -2) {
                jr9VarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = e0cVar;
        c();
        long c = this.a.c(t74VarArr, zArr3, jr9VarArr, zArr, j);
        for (int i4 = 0; i4 < uh0VarArr.length; i4++) {
            if (uh0VarArr[i4].b == -2 && this.o.q(i4)) {
                jr9VarArr[i4] = new p34();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < jr9VarArr.length; i5++) {
            if (jr9VarArr[i5] != null) {
                jte.p(e0cVar.q(i5));
                if (uh0VarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                jte.p(t74VarArr[i5] == null);
            }
        }
        return c;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            e0c e0cVar = this.o;
            if (i >= e0cVar.b) {
                return;
            }
            boolean q = e0cVar.q(i);
            t74 t74Var = ((t74[]) this.o.d)[i];
            if (q && t74Var != null) {
                t74Var.m();
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
            e0c e0cVar = this.o;
            if (i >= e0cVar.b) {
                return;
            }
            boolean q = e0cVar.q(i);
            t74 t74Var = ((t74[]) this.o.d)[i];
            if (q && t74Var != null) {
                t74Var.j();
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

    public final void f(float f, bqb bqbVar, boolean z) {
        this.e = true;
        this.n = this.a.q();
        e0c j = j(f, bqbVar, z);
        vt6 vt6Var = this.g;
        long j2 = vt6Var.b;
        long j3 = vt6Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        vt6 vt6Var2 = this.g;
        this.p = (vt6Var2.b - a) + j4;
        this.g = vt6Var2.b(a, vt6Var2.c);
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
        e07 e07Var = this.l;
        hl6 hl6Var = this.a;
        try {
            IdentityHashMap identityHashMap = e07Var.d;
            d07 d07Var = (d07) identityHashMap.remove(hl6Var);
            d07Var.getClass();
            d07Var.a.o(hl6Var);
            d07Var.c.remove(hl6Var.a);
            if (!identityHashMap.isEmpty()) {
                e07Var.c();
            }
            e07Var.d(d07Var);
        } catch (RuntimeException e) {
            ncd.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final e0c j(float f, bqb bqbVar, boolean z) {
        int i;
        ae3 ae3Var;
        int i2;
        boolean z2;
        int[] iArr;
        Context context;
        String str;
        ae3 ae3Var2;
        int i3;
        s74[] s74VarArr;
        String str2;
        int[] iArr2;
        vzb[] vzbVarArr;
        int[][][] iArr3;
        int i4;
        int i5;
        int[] iArr4;
        eb3 eb3Var;
        y79 f2;
        y79 y79Var;
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
        fe3 fe3Var = this.k;
        uh0[] uh0VarArr = this.j;
        vzb vzbVar = this.n;
        fe3Var.getClass();
        int i8 = 1;
        int[] iArr7 = new int[uh0VarArr.length + 1];
        int length = uh0VarArr.length + 1;
        uzb[][] uzbVarArr = new uzb[length][];
        int[][][] iArr8 = new int[uh0VarArr.length + 1][][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = vzbVar.a;
            uzbVarArr[i9] = new uzb[i10];
            iArr8[i9] = new int[i10][];
        }
        int length2 = uh0VarArr.length;
        int[] iArr9 = new int[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            iArr9[i11] = uh0VarArr[i11].H();
        }
        int i12 = 0;
        while (i12 < vzbVar.a) {
            uzb a = vzbVar.a(i12);
            int i13 = a.c == 5 ? i8 : 0;
            int length3 = uh0VarArr.length;
            int i14 = i8;
            int i15 = 0;
            int i16 = 0;
            while (i16 < uh0VarArr.length) {
                uh0 uh0Var = uh0VarArr[i16];
                vzb vzbVar2 = vzbVar;
                int[] iArr10 = iArr7;
                int i17 = i8;
                int i18 = 0;
                for (int i19 = 0; i19 < a.a; i19++) {
                    i18 = Math.max(i18, uh0Var.G(a.d[i19]) & 7);
                }
                int i20 = iArr10[i16] == 0 ? i17 : 0;
                if (i18 > i15 || (i18 == i15 && i13 != 0 && i14 == 0 && i20 != 0)) {
                    i15 = i18;
                    i14 = i20;
                    length3 = i16;
                }
                i16++;
                vzbVar = vzbVar2;
                iArr7 = iArr10;
                i8 = i17;
            }
            vzb vzbVar3 = vzbVar;
            int[] iArr11 = iArr7;
            int i21 = i8;
            if (length3 == uh0VarArr.length) {
                iArr6 = new int[a.a];
            } else {
                uh0 uh0Var2 = uh0VarArr[length3];
                int[] iArr12 = new int[a.a];
                for (int i22 = 0; i22 < a.a; i22++) {
                    iArr12[i22] = uh0Var2.G(a.d[i22]);
                }
                iArr6 = iArr12;
            }
            int i23 = iArr11[length3];
            uzbVarArr[length3][i23] = a;
            iArr8[length3][i23] = iArr6;
            iArr11[length3] = i23 + 1;
            i12++;
            vzbVar = vzbVar3;
            iArr7 = iArr11;
            i8 = i21;
        }
        int[] iArr13 = iArr7;
        int i24 = i8;
        vzb[] vzbVarArr2 = new vzb[uh0VarArr.length];
        String[] strArr = new String[uh0VarArr.length];
        int[] iArr14 = new int[uh0VarArr.length];
        for (int i25 = 0; i25 < uh0VarArr.length; i25++) {
            int i26 = iArr13[i25];
            vzbVarArr2[i25] = new vzb((uzb[]) hac.V(i26, uzbVarArr[i25]));
            iArr8[i25] = (int[][]) hac.V(i26, iArr8[i25]);
            strArr[i25] = uh0VarArr[i25].l();
            iArr14[i25] = uh0VarArr[i25].b;
        }
        int[] iArr15 = iArr14;
        kp kpVar = new kp(iArr15, vzbVarArr2, iArr9, iArr8, new vzb((uzb[]) hac.V(iArr13[uh0VarArr.length], uzbVarArr[uh0VarArr.length])));
        fe3Var.h = Thread.currentThread();
        Boolean bool = fe3Var.k;
        if (bool == null && (context2 = fe3Var.d) != null) {
            bool = Boolean.valueOf(hac.Q(context2));
            fe3Var.k = bool;
        }
        if (fe3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && fe3Var.i == null) {
            fe3Var.i = new tma(fe3Var.d, new xf2(fe3Var, (byte) 27), bool);
        }
        int i27 = kpVar.a;
        s74[] s74VarArr2 = new s74[i27];
        fe3.c(kpVar, fe3Var.g, s74VarArr2);
        fe3.a(kpVar, fe3Var.g, s74VarArr2);
        fe3.b(kpVar, fe3Var.g, s74VarArr2);
        ae3 ae3Var3 = fe3Var.g;
        Context context3 = fe3Var.d;
        int i28 = kpVar.a;
        Pair e = fe3.e(s74VarArr2, i24);
        if (e == null) {
            int i29 = 0;
            while (true) {
                if (i29 >= i28) {
                    i7 = 2;
                    z3 = false;
                    break;
                }
                if (2 == iArr15[i29] && vzbVarArr2[i29].a > 0) {
                    i7 = 2;
                    z3 = true;
                    break;
                }
                i29++;
            }
            i = i28;
            ae3Var = ae3Var3;
            i2 = i7;
            context = context3;
            wg wgVar = new wg((Object) fe3Var, (Object) ae3Var, z3, (Object) iArr9, (byte) 3);
            z2 = 7;
            iArr = iArr9;
            e = fe3.l(1, kpVar, iArr8, wgVar, new x03((byte) 7));
            if (e != null) {
                s74VarArr2[((Integer) e.second).intValue()] = (s74) e.first;
            }
        } else {
            i = i28;
            ae3Var = ae3Var3;
            i2 = 2;
            z2 = 7;
            iArr = iArr9;
            context = context3;
        }
        if (e == null) {
            str = null;
        } else {
            s74 s74Var = (s74) e.first;
            str = s74Var.a.d[s74Var.b[0]].d;
        }
        Pair e2 = fe3.e(s74VarArr2, i2);
        Pair e3 = fe3.e(s74VarArr2, 4);
        if (e2 == null && e3 == null) {
            if (ae3Var.w.a == i2) {
                int i30 = i;
                ae3Var2 = ae3Var;
                i3 = i30;
                s74VarArr = s74VarArr2;
                str2 = str;
                l2 = null;
            } else {
                Point y = (!ae3Var.k || context == null) ? null : hac.y(context);
                s74VarArr = s74VarArr2;
                int i31 = i;
                ae3Var2 = ae3Var;
                i3 = i31;
                str2 = str;
                l2 = fe3.l(i2, kpVar, iArr8, new lu((Object) ae3Var2, (Object) str, (Object) iArr, (Object) y, (byte) 11), new x03((byte) 6));
            }
            Pair l3 = ((ae3Var2.E || l2 == null) && ae3Var2.w.a != i2) ? fe3.l(4, kpVar, iArr8, new wm2(ae3Var2, (byte) 21), new x03((byte) 5)) : null;
            if (l3 != null) {
                s74VarArr[((Integer) l3.second).intValue()] = (s74) l3.first;
            } else if (l2 != null) {
                s74VarArr[((Integer) l2.second).intValue()] = (s74) l2.first;
            }
        } else {
            int i32 = i;
            ae3Var2 = ae3Var;
            i3 = i32;
            s74VarArr = s74VarArr2;
            str2 = str;
        }
        if (fe3.e(s74VarArr, 3) == null) {
            if (ae3Var2.w.a == 2) {
                l = null;
            } else {
                if (!ae3Var2.B || context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = hac.a;
                    str3 = locale.toLanguageTag();
                }
                l = fe3.l(3, kpVar, iArr8, new wu2((Object) ae3Var2, (Object) str2, (Object) str3, (byte) 5), new x03((byte) 8));
            }
            if (l != null) {
                s74VarArr[((Integer) l.second).intValue()] = (s74) l.first;
            }
        }
        int a2 = kt6.a(0, 0, 0, 0);
        if (ae3Var2.w.a == 2) {
            iArr2 = iArr15;
            vzbVarArr = vzbVarArr2;
            iArr3 = iArr8;
        } else {
            int i33 = yo5.c;
            xo5 xo5Var = new xo5(4);
            int i34 = 0;
            while (i34 < i27) {
                s74 s74Var2 = s74VarArr[i34];
                if (s74Var2 != null) {
                    uzb uzbVar = s74Var2.a;
                    if (!ae3Var2.E0.get(i34)) {
                        i5 = i34;
                        if (!ae3Var2.I.contains(Integer.valueOf(uzbVar.c))) {
                            xo5Var.f(uzbVar.b);
                            int i35 = 0;
                            while (true) {
                                int[] iArr16 = s74Var2.b;
                                iArr4 = iArr15;
                                if (i35 < iArr16.length) {
                                    String str5 = uzbVar.d[iArr16[i35]].n;
                                    if (str5 != null) {
                                        xo5Var.c(str5);
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
            yo5 g = xo5Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i36 = 0;
            while (i36 < i3) {
                if (iArr2[i36] != 5) {
                    i4 = i36;
                } else {
                    vzb vzbVar4 = vzbVarArr2[i36];
                    i4 = i36;
                    int i37 = 0;
                    while (i37 < vzbVar4.a) {
                        uzb a3 = vzbVar4.a(i37);
                        arrayList.add(a3);
                        vzb[] vzbVarArr3 = vzbVarArr2;
                        int[] iArr17 = (int[]) iArr8[i4][i37].clone();
                        vzb vzbVar5 = vzbVar4;
                        int[][][] iArr18 = iArr8;
                        for (int i38 = 0; i38 < iArr17.length; i38++) {
                            String str6 = a3.d[i38].n;
                            if (str6 != null && !g.contains(str6)) {
                                iArr17[i38] = a2;
                            }
                        }
                        arrayList2.add(iArr17);
                        i37++;
                        vzbVar4 = vzbVar5;
                        vzbVarArr2 = vzbVarArr3;
                        iArr8 = iArr18;
                    }
                }
                i36 = i4 + 1;
                vzbVarArr2 = vzbVarArr2;
                iArr8 = iArr8;
            }
            vzbVarArr = vzbVarArr2;
            iArr3 = iArr8;
            int size = arrayList.size();
            uzb[] uzbVarArr2 = new uzb[size];
            jte.p(arrayList.size() == size);
            arrayList.toArray(uzbVarArr2);
            vzb vzbVar6 = new vzb(uzbVarArr2);
            int size2 = arrayList2.size();
            int[][] iArr19 = new int[size2][];
            jte.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr19);
            for (int i39 = 0; i39 < i3; i39++) {
                if (iArr2[i39] == 5) {
                    s74 k = fe3.k(vzbVar6, iArr19, ae3Var2);
                    s74VarArr[i39] = k;
                    if (k == null) {
                        break;
                    }
                    Arrays.fill(iArr19[vzbVar6.b(k.a)], a2);
                }
            }
        }
        for (int i40 = 0; i40 < i3; i40++) {
            int i41 = iArr2[i40];
            if (i41 != 2 && i41 != 1 && i41 != 3 && i41 != 4 && i41 != 5 && s74VarArr[i40] == null) {
                s74VarArr[i40] = fe3.k(vzbVarArr[i40], iArr3[i40], ae3Var2);
            }
        }
        fe3.c(kpVar, fe3Var.g, s74VarArr);
        fe3.a(kpVar, fe3Var.g, s74VarArr);
        fe3.b(kpVar, fe3Var.g, s74VarArr);
        q7f q7fVar = fe3Var.e;
        eb3 eb3Var2 = fe3Var.b;
        eb3Var2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (s74 s74Var3 : s74VarArr) {
            if (s74Var3 == null || s74Var3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                jo5 p = mo5.p();
                p.c(new la(0L, 0L));
                arrayList3.add(p);
            }
        }
        int length4 = s74VarArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i42 = 0; i42 < s74VarArr.length; i42++) {
            s74 s74Var4 = s74VarArr[i42];
            if (s74Var4 == null) {
                jArr2[i42] = new long[0];
            } else {
                int[] iArr20 = s74Var4.b;
                jArr2[i42] = new long[iArr20.length];
                for (int i43 = 0; i43 < iArr20.length; i43++) {
                    long j = s74Var4.a.d[iArr20[i43]].k;
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
        ntd.b(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(jk7.b);
        yi7 yi7Var = new yi7();
        ntd.b(2, "expectedValuesPerKey");
        zi7 zi7Var = new zi7(treeMap);
        zi7Var.h = yi7Var;
        int i45 = 0;
        loop13: while (true) {
            if (i45 < length4) {
                long[] jArr6 = jArr2[i45];
                if (jArr6.length <= 1) {
                    eb3Var = eb3Var2;
                    i6 = length4;
                    iArr5 = iArr21;
                    jArr = jArr2;
                } else {
                    int length5 = jArr6.length;
                    double[] dArr = new double[length5];
                    eb3Var = eb3Var2;
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
                        Map map = zi7Var.e;
                        double d4 = d2;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            Collection m = zi7Var.m();
                            if (!m.add(valueOf2)) {
                                bh7.j("New Collection violated the Collection spec");
                                f2 = null;
                                break loop13;
                            }
                            zi7Var.f++;
                            map.put(valueOf, m);
                        } else if (collection.add(valueOf2)) {
                            zi7Var.f++;
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
                eb3Var2 = eb3Var;
            } else {
                eb3Var = eb3Var2;
                int[] iArr22 = iArr21;
                long[][] jArr11 = jArr2;
                Collection collection2 = zi7Var.c;
                if (collection2 == null) {
                    collection2 = new p3(zi7Var, (byte) 1);
                    zi7Var.c = collection2;
                }
                mo5 q = mo5.q(collection2);
                for (int i50 = 0; i50 < q.size(); i50++) {
                    int intValue = ((Integer) q.get(i50)).intValue();
                    int i51 = iArr22[intValue] + 1;
                    iArr22[intValue] = i51;
                    jArr4[intValue] = jArr11[intValue][i51];
                    ma.w(arrayList3, jArr4);
                }
                for (int i52 = 0; i52 < s74VarArr.length; i52++) {
                    if (arrayList3.get(i52) != null) {
                        jArr4[i52] = jArr4[i52] << 1;
                    }
                }
                ma.w(arrayList3, jArr4);
                jo5 p2 = mo5.p();
                for (int i53 = 0; i53 < arrayList3.size(); i53++) {
                    jo5 jo5Var = (jo5) arrayList3.get(i53);
                    p2.c(jo5Var == null ? y79.e : jo5Var.f());
                }
                f2 = p2.f();
            }
        }
        t74[] t74VarArr = new t74[s74VarArr.length];
        for (int i54 = 0; i54 < s74VarArr.length; i54++) {
            s74 s74Var5 = s74VarArr[i54];
            if (s74Var5 != null) {
                int[] iArr23 = s74Var5.b;
                if (iArr23.length != 0) {
                    int length6 = iArr23.length;
                    uzb uzbVar2 = s74Var5.a;
                    t74VarArr[i54] = length6 == 1 ? new ck4(0, uzbVar2, new int[]{iArr23[0]}) : new ma(uzbVar2, iArr23, eb3Var, 10000L, 25000L, 25000L, (mo5) f2.get(i54));
                }
            }
        }
        f99[] f99VarArr = new f99[i27];
        for (int i55 = 0; i55 < i27; i55++) {
            f99VarArr[i55] = (fe3Var.g.E0.get(i55) || fe3Var.g.I.contains(Integer.valueOf(((int[]) kpVar.b)[i55])) || (((int[]) kpVar.b)[i55] != -2 && t74VarArr[i55] == null)) ? null : f99.c;
        }
        fe3Var.g.getClass();
        ae3 ae3Var4 = fe3Var.g;
        if (ae3Var4.w.a != 0) {
            int i56 = 0;
            int i57 = 0;
            int i58 = -1;
            while (true) {
                if (i56 < kpVar.a) {
                    int i59 = ((int[]) kpVar.b)[i56];
                    t74 t74Var = t74VarArr[i56];
                    if (i59 != 1) {
                        if (t74Var != null) {
                            break;
                        }
                    } else if (t74Var != null && t74Var.length() == 1) {
                        if (fe3.j(ae3Var4, iArr3[i56][((vzb[]) kpVar.c)[i56].b(t74Var.c())][t74Var.k(0)], t74Var.o())) {
                            i57++;
                            i58 = i56;
                        }
                    }
                    i56++;
                } else if (i57 == 1) {
                    int i60 = ae3Var4.w.b ? 1 : 2;
                    f99 f99Var = f99VarArr[i58];
                    f99VarArr[i58] = new f99(i60, f99Var != null && f99Var.b);
                }
            }
        }
        Pair create = Pair.create(f99VarArr, t74VarArr);
        t74[] t74VarArr2 = (t74[]) create.second;
        int length7 = t74VarArr2.length;
        List[] listArr = new List[length7];
        for (int i61 = 0; i61 < t74VarArr2.length; i61++) {
            t74 t74Var2 = t74VarArr2[i61];
            if (t74Var2 != null) {
                y79Var = mo5.u(t74Var2);
            } else {
                ko5 ko5Var = mo5.b;
                y79Var = y79.e;
            }
            listArr[i61] = y79Var;
        }
        jo5 jo5Var2 = new jo5(4);
        int i62 = 0;
        while (true) {
            int i63 = kpVar.a;
            vzb[] vzbVarArr4 = (vzb[]) kpVar.c;
            if (i62 >= i63) {
                break;
            }
            vzb vzbVar7 = vzbVarArr4[i62];
            int i64 = 0;
            while (i64 < vzbVar7.a) {
                uzb a4 = vzbVar7.a(i64);
                int i65 = vzbVarArr4[i62].a(i64).a;
                int[] iArr24 = new int[i65];
                int i66 = 0;
                int i67 = 0;
                while (i67 < i65) {
                    List[] listArr2 = listArr;
                    if ((((int[][][]) kpVar.e)[i62][i64][i67] & 7) == 4) {
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
                    String str8 = vzbVarArr4[i69].a(i64).d[copyOf[i70]].t;
                    int i72 = i71 + 1;
                    if (i71 == 0) {
                        str7 = str8;
                    } else {
                        z4 |= !Objects.equals(str7, str8);
                    }
                    i68 = Math.min(i68, ((int[][][]) kpVar.e)[i69][i64][i70] & 24);
                    i70++;
                    i71 = i72;
                    copyOf = iArr25;
                }
                if (z4) {
                    i68 = Math.min(i68, ((int[]) kpVar.d)[i69]);
                }
                boolean z5 = i68 != 0;
                int i73 = a4.a;
                int[] iArr26 = new int[i73];
                boolean[] zArr = new boolean[i73];
                int i74 = 0;
                while (i74 < a4.a) {
                    iArr26[i74] = ((int[][][]) kpVar.e)[i69][i64][i74] & 7;
                    int i75 = 0;
                    boolean z6 = false;
                    while (i75 < length7) {
                        List list = listArr3[i75];
                        int i76 = length7;
                        vzb vzbVar8 = vzbVar7;
                        int i77 = 0;
                        while (true) {
                            if (i77 < list.size()) {
                                t74 t74Var3 = (t74) list.get(i77);
                                int i78 = i77;
                                if (t74Var3.c().equals(a4) && t74Var3.v(i74) != -1) {
                                    z6 = true;
                                    break;
                                }
                                i77 = i78 + 1;
                            }
                        }
                        i75++;
                        length7 = i76;
                        vzbVar7 = vzbVar8;
                    }
                    zArr[i74] = z6;
                    i74++;
                    vzbVar7 = vzbVar7;
                }
                jo5Var2.c(new f0c(a4, z5, iArr26, zArr));
                i64++;
                listArr = listArr3;
                i62 = i69;
                length7 = length7;
                vzbVar7 = vzbVar7;
            }
            i62++;
        }
        vzb vzbVar9 = (vzb) kpVar.f;
        for (int i79 = 0; i79 < vzbVar9.a; i79++) {
            uzb a5 = vzbVar9.a(i79);
            int[] iArr27 = new int[a5.a];
            Arrays.fill(iArr27, 0);
            jo5Var2.c(new f0c(a5, false, iArr27, new boolean[a5.a]));
        }
        e0c e0cVar = new e0c((f99[]) create.first, (t74[]) create.second, new g0c(jo5Var2.f()), kpVar);
        for (int i80 = 0; i80 < e0cVar.b; i80++) {
            boolean q2 = e0cVar.q(i80);
            t74[] t74VarArr3 = (t74[]) e0cVar.d;
            if (q2) {
                jte.p(t74VarArr3[i80] != null || this.j[i80].b == -2);
            } else {
                jte.p(t74VarArr3[i80] == null);
            }
        }
        for (t74 t74Var4 : (t74[]) e0cVar.d) {
            if (t74Var4 != null) {
                t74Var4.r(f);
                t74Var4.h(z);
            }
        }
        return e0cVar;
    }
}
