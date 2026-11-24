// default package

import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x63 implements tt6, r6a {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final kq F;
    public final fs3 G;
    public st6 H;
    public wr2 K;
    public t63 L;
    public int M;
    public List N;
    public boolean P;
    public long Q;
    public final long R;
    public boolean S;
    public final int a;
    public final hi2 b;
    public final w0c c;
    public final is3 d;
    public final k4f e;
    public final e7a f;
    public final long h;
    public final ma6 n;
    public final mx6 r;
    public final vzb s;
    public final w63[] w;
    public final kg7 x;
    public final ue8 y;
    public boolean O = true;
    public si2[] I = new si2[0];
    public w54[] J = new w54[0];
    public final IdentityHashMap E = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public x63(int i, t63 t63Var, e7a e7aVar, int i2, hi2 hi2Var, w0c w0cVar, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, long j, ma6 ma6Var, mx6 mx6Var, kg7 kg7Var, sz4 sz4Var, we8 we8Var) {
        int i3;
        int[][] iArr;
        boolean[] zArr;
        go4[][] go4VarArr;
        go4[] go4VarArr2;
        lf3 i4;
        Integer num;
        hi2 hi2Var2 = hi2Var;
        is3 is3Var2 = is3Var;
        this.a = i;
        this.L = t63Var;
        this.f = e7aVar;
        this.M = i2;
        this.b = hi2Var2;
        this.c = w0cVar;
        this.d = is3Var2;
        this.G = fs3Var;
        this.e = k4fVar;
        this.F = kqVar;
        this.h = j;
        this.n = ma6Var;
        this.r = mx6Var;
        this.x = kg7Var;
        boolean z = true;
        this.y = new ue8(t63Var, sz4Var, mx6Var);
        int i5 = 0;
        kg7Var.getClass();
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        this.K = new wr2(y79Var, y79Var);
        h58 b = t63Var.b(i2);
        List list = b.d;
        this.N = list;
        List list2 = b.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(fqe.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            hashMap.put(Long.valueOf(((ea) list2.get(i6)).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            ea eaVar = (ea) list2.get(i7);
            List list3 = eaVar.e;
            List list4 = eaVar.f;
            boolean z2 = z;
            lf3 i8 = i("http://dashif.org/guidelines/trickmode", list3);
            i8 = i8 == null ? i("http://dashif.org/guidelines/trickmode", list4) : i8;
            int intValue = (i8 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(i8.b)))) == null || !d(eaVar, (ea) list2.get(num.intValue()))) ? i7 : num.intValue();
            if (intValue == i7 && (i4 = i("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = i4.b;
                String str2 = hac.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i9 = i5; i9 < length; i9++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i9])));
                    if (num2 != null && d(eaVar, (ea) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
            i7++;
            z = z2;
            i5 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] e = ine.e((Collection) arrayList.get(i10));
            iArr2[i10] = e;
            Arrays.sort(e);
        }
        boolean[] zArr2 = new boolean[size2];
        go4[][] go4VarArr3 = new go4[size2][];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int[] iArr3 = iArr2[i11];
            int length2 = iArr3.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((ea) list2.get(iArr3[i13])).c;
                iArr = iArr2;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (!((ka9) list7.get(i14)).d.isEmpty()) {
                        zArr2[i11] = z3;
                        i12++;
                        break;
                    }
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i11];
            int length3 = iArr4.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    zArr = zArr2;
                    go4VarArr = go4VarArr3;
                    go4VarArr2 = new go4[0];
                    break;
                }
                int i16 = iArr4[i15];
                ea eaVar2 = (ea) list2.get(i16);
                List list8 = ((ea) list2.get(i16)).d;
                int[] iArr5 = iArr4;
                int i17 = 0;
                while (i17 < list8.size()) {
                    lf3 lf3Var = (lf3) list8.get(i17);
                    zArr = zArr2;
                    go4VarArr = go4VarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(lf3Var.a)) {
                        fo4 fo4Var = new fo4();
                        fo4Var.s = wf7.n("application/cea-608");
                        fo4Var.a = kt6.q(new StringBuilder(), eaVar2.a, ":cea608");
                        go4VarArr2 = u(lf3Var, T, new go4(fo4Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(lf3Var.a)) {
                        fo4 fo4Var2 = new fo4();
                        fo4Var2.s = wf7.n("application/cea-708");
                        fo4Var2.a = kt6.q(new StringBuilder(), eaVar2.a, ":cea708");
                        go4VarArr2 = u(lf3Var, U, new go4(fo4Var2));
                        break;
                    }
                    i17++;
                    go4VarArr3 = go4VarArr;
                    zArr2 = zArr;
                }
                i15++;
                iArr4 = iArr5;
            }
            go4VarArr[i11] = go4VarArr2;
            i12 += go4VarArr2.length;
            i11++;
            go4VarArr3 = go4VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        go4[][] go4VarArr4 = go4VarArr3;
        int size3 = list.size() + i12 + size2;
        uzb[] uzbVarArr = new uzb[size3];
        w63[] w63VarArr = new w63[size3];
        int i18 = 0;
        int i19 = 0;
        while (i19 < size2) {
            int[] iArr7 = iArr6[i19];
            ArrayList arrayList3 = new ArrayList();
            for (int i20 : iArr7) {
                arrayList3.addAll(((ea) list2.get(i20)).c);
            }
            int size4 = arrayList3.size();
            go4[] go4VarArr5 = new go4[size4];
            int i21 = 0;
            while (i21 < size4) {
                int i22 = size2;
                go4 go4Var = ((ka9) arrayList3.get(i21)).a;
                int i23 = i18;
                fo4 a = go4Var.a();
                a.W = is3Var2.x(go4Var);
                go4VarArr5[i21] = new go4(a);
                i21++;
                size2 = i22;
                i18 = i23;
            }
            int i24 = size2;
            int i25 = i18;
            ea eaVar3 = (ea) list2.get(iArr7[0]);
            long j2 = eaVar3.a;
            String l = j2 != -1 ? Long.toString(j2) : hg9.j(i19, "unset:");
            int i26 = i25 + 1;
            if (zArr3[i19]) {
                i3 = i25 + 2;
            } else {
                i3 = i26;
                i26 = -1;
            }
            int i27 = go4VarArr4[i19].length != 0 ? i3 : -1;
            p(hi2Var2, go4VarArr5);
            List list9 = list2;
            uzbVarArr[i25] = new uzb(l, go4VarArr5);
            int i28 = i25;
            w63VarArr[i28] = new w63(eaVar3.b, 0, iArr7, i25, i26, i27, go4VarArr4[i19].length, -1, null);
            int i29 = -1;
            if (i26 != -1) {
                String p = td4.p(l, ":emsg");
                fo4 fo4Var3 = new fo4();
                fo4Var3.a = p;
                fo4Var3.s = wf7.n("application/x-emsg");
                fo4Var3.m = l;
                go4[] go4VarArr6 = new go4[z3];
                go4VarArr6[0] = new go4(fo4Var3);
                uzbVarArr[i26] = new uzb(p, go4VarArr6);
                w63 w63Var = new w63(5, 1, iArr7, i28, -1, -1, -1, -1, null);
                i28 = i28;
                w63VarArr[i26] = w63Var;
                i29 = -1;
            }
            if (i27 != i29) {
                go4[] go4VarArr7 = go4VarArr4[i19];
                p(hi2Var2, go4VarArr7);
                int i30 = 0;
                while (i30 < go4VarArr7.length) {
                    go4 go4Var2 = go4VarArr7[i30];
                    go4[] go4VarArr8 = go4VarArr4[i19];
                    fo4 a2 = go4Var2.a();
                    a2.m = l;
                    int i31 = i28;
                    go4VarArr8[i30] = new go4(a2);
                    w63VarArr[i27] = new w63(3, 1, iArr7, i31, -1, -1, -1, -1, go4Var2);
                    uzbVarArr[i27] = new uzb(l + ":cc:" + i30, go4VarArr4[i19][i30]);
                    i27++;
                    i30++;
                    i28 = i31;
                }
                i3 += go4VarArr7.length;
            }
            i18 = i3;
            i19++;
            size2 = i24;
            hi2Var2 = hi2Var;
            is3Var2 = is3Var;
            list2 = list9;
            z3 = true;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            x54 x54Var = (x54) list.get(i32);
            fo4 fo4Var4 = new fo4();
            fo4Var4.a = x54Var.a();
            fo4Var4.s = wf7.n("application/x-emsg");
            uzbVarArr[i18] = new uzb(x54Var.a() + ":" + i32, new go4(fo4Var4));
            w63VarArr[i18] = new w63(5, 2, new int[0], -1, -1, -1, -1, i32, null);
            i32++;
            i18++;
        }
        Pair create = Pair.create(new vzb(uzbVarArr), w63VarArr);
        this.s = (vzb) create.first;
        this.w = (w63[]) create.second;
        this.R = Long.MIN_VALUE;
    }

    public static boolean d(ea eaVar, ea eaVar2) {
        int i = eaVar.b;
        List list = eaVar.c;
        int i2 = eaVar2.b;
        List list2 = eaVar2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            go4 go4Var = ((ka9) list.get(0)).a;
            go4 go4Var2 = ((ka9) list2.get(0)).a;
            int i3 = go4Var.f & (-16385);
            int i4 = go4Var2.f & (-16385);
            if (Objects.equals(go4Var.d, go4Var2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static lf3 i(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            lf3 lf3Var = (lf3) list.get(i);
            if (str.equals(lf3Var.a)) {
                return lf3Var;
            }
        }
        return null;
    }

    public static void p(hi2 hi2Var, go4[] go4VarArr) {
        for (int i = 0; i < go4VarArr.length; i++) {
            go4 go4Var = go4VarArr[i];
            m41 m41Var = (m41) hi2Var.c;
            if (m41Var.b && ((fgf) m41Var.c).h(go4Var)) {
                fo4 a = go4Var.a();
                String str = go4Var.l;
                a.s = wf7.n("application/x-media3-cues");
                a.T = ((fgf) m41Var.c).C(go4Var);
                StringBuilder sb = new StringBuilder();
                sb.append(go4Var.t);
                sb.append(str != null ? " ".concat(str) : "");
                a.k = sb.toString();
                a.x = Long.MAX_VALUE;
                go4Var = new go4(a);
            }
            go4VarArr[i] = go4Var;
        }
    }

    public static go4[] u(lf3 lf3Var, Pattern pattern, go4 go4Var) {
        String str = lf3Var.b;
        if (str == null) {
            return new go4[]{go4Var};
        }
        String str2 = hac.a;
        String[] split = str.split(";", -1);
        go4[] go4VarArr = new go4[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new go4[]{go4Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            fo4 a = go4Var.a();
            a.a = go4Var.a + ":" + parseInt;
            a.S = parseInt;
            a.d = matcher.group(2);
            go4VarArr[i] = new go4(a);
        }
        return go4VarArr;
    }

    @Override // r6a
    public final void b(s6a s6aVar) {
        this.H.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0278 A[LOOP:10: B:137:0x0276->B:138:0x0278, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // tt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(t74[] t74VarArr, boolean[] zArr, jr9[] jr9VarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        uzb uzbVar;
        int i5;
        te8 te8Var;
        int[] iArr3;
        long j2;
        ?? r13;
        boolean z2;
        boolean z3;
        t74[] t74VarArr2 = t74VarArr;
        int[] iArr4 = new int[t74VarArr2.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= t74VarArr2.length) {
                break;
            }
            t74 t74Var = t74VarArr2[i7];
            if (t74Var != null) {
                iArr4[i7] = this.s.b(t74Var.c());
            } else {
                iArr4[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < t74VarArr2.length; i8++) {
            if (t74VarArr2[i8] == null || !zArr[i8]) {
                ?? r4 = jr9VarArr[i8];
                if (r4 instanceof si2) {
                    ((si2) r4).C(this);
                } else if (r4 instanceof ri2) {
                    ri2 ri2Var = (ri2) r4;
                    boolean[] zArr3 = ri2Var.e.d;
                    int i9 = ri2Var.c;
                    jte.p(zArr3[i9]);
                    zArr3[i9] = false;
                }
                jr9VarArr[i8] = null;
            }
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= t74VarArr2.length) {
                break;
            }
            ?? r42 = jr9VarArr[i10];
            if ((r42 instanceof p34) || (r42 instanceof ri2)) {
                int m = m(iArr4, i10);
                if (m == -1) {
                    z3 = jr9VarArr[i10] instanceof p34;
                } else {
                    ?? r10 = jr9VarArr[i10];
                    z3 = (r10 instanceof ri2) && ((ri2) r10).a == jr9VarArr[m];
                }
                if (!z3) {
                    ?? r43 = jr9VarArr[i10];
                    if (r43 instanceof ri2) {
                        ri2 ri2Var2 = (ri2) r43;
                        boolean[] zArr4 = ri2Var2.e.d;
                        int i11 = ri2Var2.c;
                        jte.p(zArr4[i11]);
                        zArr4[i11] = false;
                    }
                    jr9VarArr[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < t74VarArr2.length) {
            t74 t74Var2 = t74VarArr2[i12];
            if (t74Var2 == null) {
                iArr2 = iArr4;
                i2 = i6;
                i3 = i12;
            } else {
                ?? r12 = jr9VarArr[i12];
                if (r12 == null) {
                    zArr2[i12] = z;
                    w63 w63Var = this.w[iArr4[i12]];
                    byte b = w63Var.c;
                    if (b == 0) {
                        int i13 = w63Var.f;
                        ?? r29 = i13 != i ? z ? 1 : 0 : i6;
                        if (r29 != 0) {
                            uzbVar = this.s.a(i13);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            uzbVar = null;
                        }
                        jo5 p = mo5.p();
                        int i14 = i6;
                        if (w63Var.g != i) {
                            int i15 = i14;
                            z = z;
                            while (i15 < w63Var.h) {
                                w63[] w63VarArr = this.w;
                                boolean z4 = z == true ? 1 : 0;
                                go4 go4Var = w63VarArr[w63Var.g + i15].i;
                                if (go4Var != null) {
                                    p.c(go4Var);
                                }
                                i15++;
                                z = z4 ? 1 : 0;
                            }
                        }
                        int i16 = z;
                        y79 f = p.f();
                        int i17 = i4 + f.d;
                        int i18 = i12;
                        go4[] go4VarArr = new go4[i17];
                        int[] iArr5 = new int[i17];
                        if (r29 != 0) {
                            go4VarArr[i14] = uzbVar.d[i14];
                            iArr5[i14] = 5;
                            i5 = i16;
                        } else {
                            i5 = i14;
                        }
                        jo5 p2 = mo5.p();
                        for (int i19 = i14; i19 < f.d; i19++) {
                            go4 go4Var2 = (go4) f.get(i19);
                            go4VarArr[i5] = go4Var2;
                            iArr5[i5] = 3;
                            p2.c(go4Var2);
                            i5++;
                        }
                        y79 f2 = p2.f();
                        if (!this.L.d || r29 == 0) {
                            te8Var = null;
                        } else {
                            ue8 ue8Var = this.y;
                            te8Var = new te8(ue8Var, ue8Var.a);
                        }
                        t63 t63Var = this.L;
                        int i20 = this.M;
                        int[] iArr6 = w63Var.a;
                        long d = t63Var.d(i20);
                        List list = t63Var.b(i20).c;
                        int i21 = i14;
                        while (true) {
                            if (i21 >= iArr6.length) {
                                iArr3 = iArr4;
                                j2 = -9223372036854775807L;
                                break;
                            }
                            List list2 = ((ea) list.get(iArr6[i21])).c;
                            iArr3 = iArr4;
                            for (int i22 = i14; i22 < list2.size(); i22++) {
                                d73 b2 = ((ka9) list2.get(i22)).b();
                                if (b2 != null && b2.X(d) != 0) {
                                    j2 = b2.e(b2.J(j, d));
                                    break;
                                }
                            }
                            i21++;
                            iArr4 = iArr3;
                        }
                        long j3 = j2;
                        if (this.O) {
                            t63 t63Var2 = this.L;
                            int i23 = this.M;
                            int[] iArr7 = w63Var.a;
                            List list3 = t63Var2.b(i23).c;
                            jo5 p3 = mo5.p();
                            int length = iArr7.length;
                            for (int i24 = i14; i24 < length; i24++) {
                                p3.d(((ea) list3.get(iArr7[i24])).c);
                            }
                            y79 f3 = p3.f();
                            for (int i25 = i14; i25 < t74Var2.length(); i25++) {
                                go4 go4Var3 = ((ka9) f3.get(t74Var2.k(i25))).a;
                                if (!wf7.a(go4Var3.t, go4Var3.l)) {
                                    r13 = i16;
                                    break;
                                }
                            }
                        }
                        r13 = i14;
                        hi2 hi2Var = this.b;
                        ma6 ma6Var = this.n;
                        t63 t63Var3 = this.L;
                        e7a e7aVar = this.f;
                        int i26 = this.M;
                        int[] iArr8 = w63Var.a;
                        int i27 = w63Var.b;
                        long j4 = this.h;
                        w0c w0cVar = this.c;
                        a83 createDataSource = ((y73) hi2Var.b).createDataSource();
                        if (w0cVar != null) {
                            createDataSource.addTransferListener(w0cVar);
                        }
                        i3 = i18;
                        te8 te8Var2 = te8Var;
                        iArr2 = iArr3;
                        si2 si2Var = new si2(w63Var.b, iArr5, go4VarArr, new ib3((m41) hi2Var.c, ma6Var, t63Var3, e7aVar, i26, iArr8, t74Var2, i27, createDataSource, j4, r29, f2, te8Var), this, this.r, j, this.d, this.G, this.e, this.F, r13, j3, null);
                        long j5 = this.R;
                        if (si2Var.S) {
                            long j6 = si2Var.R;
                            if (j6 != Long.MIN_VALUE && (j5 == Long.MIN_VALUE || j5 > j6)) {
                                z2 = true;
                                si2Var.R = j5;
                                si2Var.y.K(j5);
                                for (hr9 hr9Var : si2Var.E) {
                                    hr9Var.K(j5);
                                }
                                i2 = 0;
                                if (z2) {
                                    si2Var.S = false;
                                    si2Var.f.b(si2Var);
                                }
                                synchronized (this) {
                                    this.E.put(si2Var, te8Var2);
                                }
                                jr9VarArr[i3] = si2Var;
                            }
                        }
                        z2 = false;
                        si2Var.R = j5;
                        si2Var.y.K(j5);
                        while (r9 < r6) {
                        }
                        i2 = 0;
                        if (z2) {
                        }
                        synchronized (this) {
                        }
                    } else {
                        iArr2 = iArr4;
                        i2 = i6;
                        i3 = i12;
                        if (b == 2) {
                            jr9VarArr[i3] = new w54((x54) this.N.get(w63Var.d), t74Var2.c().d[i2], this.L.d);
                        }
                    }
                } else {
                    iArr2 = iArr4;
                    i2 = i6;
                    i3 = i12;
                    if (r12 instanceof si2) {
                        ((si2) r12).e.i = t74Var2;
                    }
                }
            }
            i12 = i3 + 1;
            t74VarArr2 = t74VarArr;
            i6 = i2;
            iArr4 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr9 = iArr4;
        ?? r1 = i6;
        int i28 = r1;
        while (i28 < t74VarArr.length) {
            if (jr9VarArr[i28] != null || t74VarArr[i28] == null) {
                iArr = iArr9;
            } else {
                iArr = iArr9;
                w63 w63Var2 = this.w[iArr[i28]];
                if (w63Var2.c != 1) {
                    continue;
                } else {
                    int m2 = m(iArr, i28);
                    if (m2 != -1) {
                        si2 si2Var2 = (si2) jr9VarArr[m2];
                        int i29 = w63Var2.b;
                        boolean[] zArr5 = si2Var2.d;
                        hr9[] hr9VarArr = si2Var2.E;
                        for (int i30 = r1; i30 < hr9VarArr.length; i30++) {
                            if (si2Var2.b[i30] == i29) {
                                jte.p(!zArr5[i30]);
                                zArr5[i30] = true;
                                hr9VarArr[i30].J(j, true);
                                jr9VarArr[i28] = new ri2(si2Var2, si2Var2, hr9VarArr[i30], i30);
                            }
                        }
                        rjb.h();
                        return 0L;
                    }
                    jr9VarArr[i28] = new p34();
                }
            }
            i28++;
            iArr9 = iArr;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length2 = jr9VarArr.length;
        for (int i31 = r1; i31 < length2; i31++) {
            ?? r9 = jr9VarArr[i31];
            if (r9 instanceof si2) {
                si2 si2Var3 = (si2) r9;
                if (this.P) {
                    si2Var3.P = true;
                }
                arrayList.add(si2Var3);
            } else if (r9 instanceof w54) {
                arrayList2.add((w54) r9);
            }
        }
        si2[] si2VarArr = new si2[arrayList.size()];
        this.I = si2VarArr;
        arrayList.toArray(si2VarArr);
        w54[] w54VarArr = new w54[arrayList2.size()];
        this.J = w54VarArr;
        arrayList2.toArray(w54VarArr);
        kg7 kg7Var = this.x;
        AbstractList b3 = wpe.b(arrayList, new o41((byte) 4));
        kg7Var.getClass();
        this.K = new wr2(arrayList, b3);
        if (this.O) {
            this.O = r1;
            this.Q = j;
            if (!this.P) {
                si2[] si2VarArr2 = this.I;
                int length3 = si2VarArr2.length;
                int i32 = r1;
                while (true) {
                    if (i32 >= length3) {
                        break;
                    }
                    if (si2VarArr2[i32].z()) {
                        this.S = true;
                        si2[] si2VarArr3 = this.I;
                        int length4 = si2VarArr3.length;
                        for (int i33 = r1; i33 < length4; i33++) {
                            si2VarArr3[i33].Q = true;
                        }
                    } else {
                        i32++;
                    }
                }
            }
        }
        return j;
    }

    @Override // tt6
    public final void e() {
        this.P = true;
    }

    @Override // s6a
    public final boolean f() {
        return this.K.f();
    }

    @Override // s6a
    public final long g() {
        return this.K.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r3 < (((r9.V() + r7) + r10) - 1)) goto L18;
     */
    @Override // tt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j, jx9 jx9Var) {
        long j2;
        long j3 = j;
        si2[] si2VarArr = this.I;
        int length = si2VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            si2 si2Var = si2VarArr[i2];
            if (si2Var.a == 2) {
                gb3[] gb3VarArr = si2Var.e.h;
                int length2 = gb3VarArr.length;
                while (i < length2) {
                    gb3 gb3Var = gb3VarArr[i];
                    d73 d73Var = gb3Var.d;
                    long j4 = gb3Var.f;
                    d73 d73Var2 = gb3Var.d;
                    if (d73Var != null) {
                        long c = gb3Var.c();
                        if (c != 0) {
                            d73Var2.getClass();
                            long J = d73Var2.J(j3, gb3Var.e) + j4;
                            long e = gb3Var.e(J);
                            if (e < j3) {
                                if (c != -1) {
                                    d73Var2.getClass();
                                }
                                j2 = gb3Var.e(J + 1);
                                return jx9Var.a(j3, e, j2);
                            }
                            j2 = e;
                            return jx9Var.a(j3, e, j2);
                        }
                    }
                    i++;
                    j3 = j;
                }
            } else {
                i2++;
                j3 = j;
            }
        }
        return j;
    }

    @Override // tt6
    public final void j() {
        this.n.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // tt6
    public final long k(long j) {
        int i;
        ph0 ph0Var;
        boolean J;
        int i2;
        boolean z;
        ph0 ph0Var2;
        si2[] si2VarArr = this.I;
        int length = si2VarArr.length;
        boolean z2 = false;
        int i3 = 0;
        while (i3 < length) {
            si2 si2Var = si2VarArr[i3];
            hr9[] hr9VarArr = si2Var.E;
            hr9 hr9Var = si2Var.y;
            mx6 mx6Var = si2Var.r;
            ?? r14 = si2Var.w;
            si2Var.K = j;
            si2Var.N = z2;
            si2Var.O = z2;
            if (si2Var.y()) {
                si2Var.J = j;
                z = z2;
                i = i3;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 >= r14.size()) {
                        i = i3;
                        break;
                    }
                    ph0Var = (ph0) r14.get(r15);
                    long j2 = ph0Var.h;
                    i = i3;
                    if (j2 == j && ph0Var.w == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    r15++;
                    i3 = i;
                }
                ph0Var = null;
                if (ph0Var != null) {
                    J = hr9Var.I(ph0Var.d(0));
                } else {
                    long g = si2Var.g();
                    J = hr9Var.J(j, g == Long.MIN_VALUE || j < g);
                }
                if (!J || (ph0Var2 = si2Var.M) == null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    if (ph0Var2.d(0) <= hr9Var.v()) {
                        J = false;
                    }
                }
                if (J) {
                    si2Var.L = si2Var.B(hr9Var.v(), i2);
                    for (hr9 hr9Var2 : hr9VarArr) {
                        hr9Var2.J(j, true);
                    }
                } else {
                    si2Var.J = j;
                    si2Var.S = false;
                    r14.clear();
                    si2Var.L = 0;
                    if (mx6Var.Y()) {
                        hr9Var.l();
                        for (hr9 hr9Var3 : hr9VarArr) {
                            hr9Var3.l();
                        }
                        mx6Var.v();
                    } else {
                        mx6Var.d = null;
                        z = false;
                        hr9Var.G(false);
                        for (hr9 hr9Var4 : si2Var.E) {
                            hr9Var4.G(false);
                        }
                    }
                }
                z = false;
            }
            i3 = i + 1;
            z2 = z;
        }
        w54[] w54VarArr = this.J;
        int length2 = w54VarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            w54 w54Var = w54VarArr[r5];
            int b = hac.b(w54Var.c, j, true);
            w54Var.h = b;
            w54Var.n = (w54Var.d && b == w54Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // tt6
    public final void l(long j) {
        for (si2 si2Var : this.I) {
            hr9 hr9Var = si2Var.y;
            if (!si2Var.y()) {
                int i = hr9Var.q;
                hr9Var.k(j, true);
                int i2 = hr9Var.q;
                if (i2 > i) {
                    long r = hr9Var.r();
                    int i3 = 0;
                    while (true) {
                        hr9[] hr9VarArr = si2Var.E;
                        if (i3 >= hr9VarArr.length) {
                            break;
                        }
                        hr9VarArr[i3].k(r, si2Var.d[i3]);
                        i3++;
                    }
                }
                int min = Math.min(si2Var.B(i2, 0), si2Var.L);
                if (min > 0) {
                    hac.Y(0, min, si2Var.w);
                    si2Var.L -= min;
                }
            }
        }
    }

    public final int m(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 != -1) {
            w63[] w63VarArr = this.w;
            int i3 = w63VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && w63VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // tt6
    public final long n() {
        if (!this.S) {
            return -9223372036854775807L;
        }
        boolean z = false;
        for (si2 si2Var : this.I) {
            si2Var.getClass();
            try {
                boolean z2 = si2Var.O;
                si2Var.O = false;
                z |= z2;
            } catch (Throwable th) {
                si2Var.O = false;
                throw th;
            }
        }
        si2[] si2VarArr = this.I;
        int length = si2VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                this.S = false;
                for (si2 si2Var2 : this.I) {
                    si2Var2.Q = false;
                }
            } else {
                if (si2VarArr[i].z()) {
                    break;
                }
                i++;
            }
        }
        if (z) {
            return this.Q;
        }
        return -9223372036854775807L;
    }

    @Override // tt6
    public final void o(st6 st6Var, long j) {
        this.H = st6Var;
        st6Var.a(this);
    }

    @Override // tt6
    public final vzb q() {
        return this.s;
    }

    @Override // s6a
    public final boolean r(sa6 sa6Var) {
        return this.K.r(sa6Var);
    }

    @Override // s6a
    public final long s() {
        return this.K.s();
    }

    @Override // s6a
    public final void t(long j) {
        int i;
        si2[] si2VarArr = this.I;
        int length = si2VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            si2 si2Var = si2VarArr[i2];
            if (!si2Var.r.Y()) {
                long d = this.L.d(this.M);
                hr9 hr9Var = si2Var.y;
                jte.p(!si2Var.r.Y());
                if (!si2Var.y() && d != -9223372036854775807L && !si2Var.w.isEmpty()) {
                    ph0 v = si2Var.v();
                    long j2 = v.x;
                    if (j2 == -9223372036854775807L) {
                        j2 = v.n;
                    }
                    if (j2 > d) {
                        long s = hr9Var.s();
                        if (s > d) {
                            hr9Var.m(Math.max(d, hr9Var.t() + 1));
                            hr9[] hr9VarArr = si2Var.E;
                            int length2 = hr9VarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                hr9 hr9Var2 = hr9VarArr[i3];
                                hr9Var2.m(Math.max(d, hr9Var2.t() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            si2Var.h.A(d, si2Var.a, s);
                            i2 = i + 1;
                        }
                    }
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.K.t(j);
    }
}
