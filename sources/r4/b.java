package r4;

import android.util.Pair;
import android.util.SparseArray;
import b4.e0;
import g5.n0;
import g5.q;
import g5.v0;
import h5.d0;
import j3.h2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.y7;
import o4.k0;
import o4.l0;
import o4.m0;
import o4.s;
import o4.s0;
import o4.t;
import o4.t0;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements t, m0, q4.g {
    public static final Pattern K = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern L = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final e0 B;
    public final o3.l C;
    public s D;
    public z2.d G;
    public s4.c H;
    public int I;
    public List J;
    public final int a;
    public final f1 b;
    public final v0 c;
    public final o3.o d;
    public final ab.a e;
    public final com.google.firebase.messaging.s f;
    public final long h;
    public final n0 n;
    public final q r;
    public final t0 s;
    public final a[] v;
    public final z9.d w;
    public final o x;
    public q4.h[] E = new q4.h[0];
    public l[] F = new l[0];
    public final IdentityHashMap y = new IdentityHashMap();

    public b(int i10, s4.c cVar, com.google.firebase.messaging.s sVar, int i11, f1 f1Var, v0 v0Var, o3.o oVar, o3.l lVar, ab.a aVar, e0 e0Var, long j10, n0 n0Var, q qVar, z9.d dVar, f1 f1Var2, k3.k kVar) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        j3.n0[] n0VarArr;
        s4.f c3;
        Integer num;
        o3.o oVar2 = oVar;
        this.a = i10;
        this.H = cVar;
        this.f = sVar;
        this.I = i11;
        this.b = f1Var;
        this.c = v0Var;
        this.d = oVar2;
        this.C = lVar;
        this.e = aVar;
        this.B = e0Var;
        this.h = j10;
        this.n = n0Var;
        this.r = qVar;
        this.w = dVar;
        this.x = new o(cVar, f1Var2, qVar);
        q4.h[] hVarArr = this.E;
        dVar.getClass();
        this.G = new z2.d(hVarArr);
        s4.h b10 = cVar.b(i11);
        List list = b10.d;
        this.J = list;
        List list2 = b10.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(s8.l.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((s4.a) list2.get(i14)).a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            s4.a aVar2 = (s4.a) list2.get(i15);
            List list3 = aVar2.e;
            List list4 = aVar2.f;
            s4.f c10 = c("http://dashif.org/guidelines/trickmode", list3);
            c10 = c10 == null ? c("http://dashif.org/guidelines/trickmode", list4) : c10;
            int intValue = (c10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(c10.b)))) == null) ? i15 : num.intValue();
            if (intValue == i15 && (c3 = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = c3.b;
                int i16 = d0.a;
                for (String str2 : str.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str2)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] d = y7.d((Collection) arrayList.get(i17));
            iArr2[i17] = d;
            Arrays.sort(d);
        }
        boolean[] zArr2 = new boolean[size2];
        j3.n0[][] n0VarArr2 = new j3.n0[size2][];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr3 = iArr2[i18];
            int length = iArr3.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    break;
                }
                List list7 = ((s4.a) list2.get(iArr3[i20])).c;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    if (!((s4.m) list7.get(i21)).d.isEmpty()) {
                        zArr2[i18] = true;
                        i19++;
                        break;
                    }
                }
                i20++;
            }
            int[] iArr4 = iArr2[i18];
            int length2 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length2) {
                    iArr = iArr2;
                    zArr = zArr2;
                    n0VarArr = new j3.n0[0];
                    break;
                }
                int i23 = iArr4[i22];
                s4.a aVar3 = (s4.a) list2.get(i23);
                List list8 = ((s4.a) list2.get(i23)).d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list8.size()) {
                    s4.f fVar = (s4.f) list8.get(i24);
                    iArr = iArr2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.a)) {
                        j3.m0 m0Var = new j3.m0();
                        m0Var.o = "application/cea-608";
                        m0Var.a = android.support.v4.media.a.q(new StringBuilder(), aVar3.a, ":cea608");
                        n0VarArr = l(fVar, K, new j3.n0(m0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.a)) {
                        j3.m0 m0Var2 = new j3.m0();
                        m0Var2.o = "application/cea-708";
                        m0Var2.a = android.support.v4.media.a.q(new StringBuilder(), aVar3.a, ":cea708");
                        n0VarArr = l(fVar, L, new j3.n0(m0Var2));
                        break;
                    }
                    i24++;
                    iArr2 = iArr;
                    zArr2 = zArr;
                }
                i22++;
                iArr4 = iArr5;
            }
            n0VarArr2[i18] = n0VarArr;
            if (n0VarArr.length != 0) {
                i19++;
            }
            i18++;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i19 + size2;
        s0[] s0VarArr = new s0[size3];
        a[] aVarArr = new a[size3];
        int i25 = 0;
        int i26 = 0;
        while (i26 < size2) {
            int[] iArr7 = iArr6[i26];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr7) {
                arrayList3.addAll(((s4.a) list2.get(i27)).c);
            }
            int size4 = arrayList3.size();
            j3.n0[] n0VarArr3 = new j3.n0[size4];
            int i28 = 0;
            while (i28 < size4) {
                int i29 = size2;
                j3.n0 n0Var2 = ((s4.m) arrayList3.get(i28)).a;
                int i30 = i25;
                int b11 = oVar2.b(n0Var2);
                j3.m0 a2 = n0Var2.a();
                a2.J = b11;
                n0VarArr3[i28] = new j3.n0(a2);
                i28++;
                size2 = i29;
                i25 = i30;
            }
            int i31 = size2;
            int i32 = i25;
            s4.a aVar4 = (s4.a) list2.get(iArr7[0]);
            long j11 = aVar4.a;
            String l10 = j11 != -1 ? Long.toString(j11) : l.d.j(i26, "unset:");
            int i33 = i32 + 1;
            if (zArr3[i26]) {
                i12 = i32 + 2;
            } else {
                i12 = i33;
                i33 = -1;
            }
            if (n0VarArr2[i26].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            List list9 = list2;
            s0VarArr[i32] = new s0(l10, n0VarArr3);
            int i34 = i32;
            aVarArr[i34] = new a(aVar4.b, 0, iArr7, i32, i33, i12, -1);
            int i35 = -1;
            if (i33 != -1) {
                String e6 = w.c.e(l10, ":emsg");
                j3.m0 m0Var3 = new j3.m0();
                m0Var3.a = e6;
                m0Var3.o = "application/x-emsg";
                s0VarArr[i33] = new s0(e6, new j3.n0(m0Var3));
                a aVar5 = new a(5, 1, iArr7, i34, -1, -1, -1);
                i34 = i34;
                aVarArr[i33] = aVar5;
                i35 = -1;
            }
            if (i12 != i35) {
                s0VarArr[i12] = new s0(w.c.e(l10, ":cc"), n0VarArr2[i26]);
                aVarArr[i12] = new a(3, 1, iArr7, i34, -1, -1, -1);
            }
            i26++;
            size2 = i31;
            oVar2 = oVar;
            i25 = i13;
            list2 = list9;
        }
        int i36 = 0;
        while (i36 < list.size()) {
            s4.g gVar = (s4.g) list.get(i36);
            j3.m0 m0Var4 = new j3.m0();
            m0Var4.a = gVar.a();
            m0Var4.o = "application/x-emsg";
            s0VarArr[i25] = new s0(gVar.a() + ":" + i36, new j3.n0(m0Var4));
            aVarArr[i25] = new a(5, 2, new int[0], -1, -1, -1, i36);
            i36++;
            i25++;
        }
        Pair create = Pair.create(new t0(s0VarArr), aVarArr);
        this.s = (t0) create.first;
        this.v = (a[]) create.second;
    }

    public static s4.f c(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            s4.f fVar = (s4.f) list.get(i10);
            if (str.equals(fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public static j3.n0[] l(s4.f fVar, Pattern pattern, j3.n0 n0Var) {
        String str = fVar.b;
        if (str == null) {
            return new j3.n0[]{n0Var};
        }
        int i10 = d0.a;
        String[] split = str.split(";", -1);
        j3.n0[] n0VarArr = new j3.n0[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new j3.n0[]{n0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            j3.m0 a2 = n0Var.a();
            a2.a = n0Var.a + ":" + parseInt;
            a2.G = parseInt;
            a2.c = matcher.group(2);
            n0VarArr[i11] = new j3.n0(a2);
        }
        return n0VarArr;
    }

    @Override // o4.n0
    public final boolean b() {
        return this.G.b();
    }

    @Override // o4.t
    public final long d(long j10, h2 h2Var) {
        long j11 = j10;
        q4.h[] hVarArr = this.E;
        int length = hVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            q4.h hVar = hVarArr[i11];
            if (hVar.a == 2) {
                i[] iVarArr = hVar.e.h;
                int length2 = iVarArr.length;
                while (i10 < length2) {
                    i iVar = iVarArr[i10];
                    h hVar2 = iVar.d;
                    long j12 = iVar.f;
                    h hVar3 = iVar.d;
                    long j13 = iVar.e;
                    if (hVar2 != null) {
                        long F = hVar2.F(j13);
                        if (F != 0) {
                            long t6 = hVar3.t(j11, j13) + j12;
                            long d = iVar.d(t6);
                            return h2Var.a(j11, d, (d >= j11 || (F != -1 && t6 >= ((hVar3.C() + j12) + F) - 1)) ? d : iVar.d(t6 + 1));
                        }
                    }
                    i10++;
                    j11 = j10;
                }
            } else {
                i11++;
                j11 = j10;
            }
        }
        return j10;
    }

    @Override // o4.n0
    public final long e() {
        return this.G.e();
    }

    @Override // o4.t
    public final void f(s sVar, long j10) {
        this.D = sVar;
        sVar.a(this);
    }

    @Override // o4.t
    public final long g(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z4;
        int[] iArr;
        int i11;
        int[] iArr2;
        s0 s0Var;
        int i12;
        s0 s0Var2;
        int i13;
        n nVar;
        boolean z10;
        int[] iArr3 = new int[cVarArr.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= cVarArr.length) {
                break;
            }
            f5.c cVar = cVarArr[i14];
            if (cVar != null) {
                iArr3[i14] = this.s.b(cVar.l());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < cVarArr.length; i15++) {
            if (cVarArr[i15] == null || !zArr[i15]) {
                l0 l0Var = l0VarArr[i15];
                if (l0Var instanceof q4.h) {
                    ((q4.h) l0Var).B(this);
                } else if (l0Var instanceof q4.f) {
                    q4.f fVar = (q4.f) l0Var;
                    q4.h hVar = fVar.e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.c;
                    h5.a.i(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                l0VarArr[i15] = null;
            }
        }
        int i17 = 0;
        while (true) {
            if (i17 >= cVarArr.length) {
                break;
            }
            l0 l0Var2 = l0VarArr[i17];
            if ((l0Var2 instanceof o4.g) || (l0Var2 instanceof q4.f)) {
                int h = h(i17, iArr3);
                if (h == -1) {
                    z10 = l0VarArr[i17] instanceof o4.g;
                } else {
                    l0 l0Var3 = l0VarArr[i17];
                    z10 = (l0Var3 instanceof q4.f) && ((q4.f) l0Var3).a == l0VarArr[h];
                }
                if (!z10) {
                    l0 l0Var4 = l0VarArr[i17];
                    if (l0Var4 instanceof q4.f) {
                        q4.f fVar2 = (q4.f) l0Var4;
                        q4.h hVar2 = fVar2.e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.c;
                        h5.a.i(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    l0VarArr[i17] = null;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < cVarArr.length) {
            f5.c cVar2 = cVarArr[i19];
            if (cVar2 == null) {
                i11 = i19;
                iArr2 = iArr3;
            } else {
                l0 l0Var5 = l0VarArr[i19];
                if (l0Var5 == null) {
                    zArr2[i19] = z4;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.c;
                    if (i20 == 0) {
                        int i21 = aVar.f;
                        boolean z11 = i21 != i10;
                        if (z11) {
                            s0Var = this.s.a(i21);
                            i12 = 1;
                        } else {
                            s0Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.g;
                        boolean z12 = i22 != i10;
                        if (z12) {
                            s0Var2 = this.s.a(i22);
                            i12 += s0Var2.a;
                        } else {
                            s0Var2 = null;
                        }
                        j3.n0[] n0VarArr = new j3.n0[i12];
                        int[] iArr4 = new int[i12];
                        if (z11) {
                            n0VarArr[0] = s0Var.d[0];
                            iArr4[0] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z12) {
                            for (int i23 = 0; i23 < s0Var2.a; i23++) {
                                j3.n0 n0Var = s0Var2.d[i23];
                                n0VarArr[i13] = n0Var;
                                iArr4[i13] = 3;
                                arrayList.add(n0Var);
                                i13++;
                            }
                        }
                        if (this.H.d && z11) {
                            o oVar = this.x;
                            nVar = new n(oVar, oVar.a);
                        } else {
                            nVar = null;
                        }
                        f1 f1Var = this.b;
                        n0 n0Var2 = this.n;
                        s4.c cVar3 = this.H;
                        com.google.firebase.messaging.s sVar = this.f;
                        int i24 = this.I;
                        int[] iArr5 = aVar.a;
                        int i25 = aVar.b;
                        long j11 = this.h;
                        i11 = i19;
                        v0 v0Var = this.c;
                        g5.m createDataSource = ((g5.l) f1Var.b).createDataSource();
                        if (v0Var != null) {
                            createDataSource.addTransferListener(v0Var);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr3;
                        q4.h hVar3 = new q4.h(aVar.b, iArr4, n0VarArr, new k(n0Var2, cVar3, sVar, i24, iArr5, cVar2, i25, createDataSource, j11, z11, arrayList, nVar), this, this.r, j10, this.d, this.C, this.e, this.B);
                        synchronized (this) {
                            this.y.put(hVar3, nVar2);
                        }
                        l0VarArr[i11] = hVar3;
                    } else {
                        i11 = i19;
                        iArr2 = iArr3;
                        if (i20 == 2) {
                            l0VarArr[i11] = new l((s4.g) this.J.get(aVar.d), cVar2.l().d[0], this.H.d);
                        }
                    }
                } else {
                    i11 = i19;
                    iArr2 = iArr3;
                    if (l0Var5 instanceof q4.h) {
                        ((q4.h) l0Var5).e.i = cVar2;
                    }
                }
            }
            i19 = i11 + 1;
            iArr3 = iArr2;
            i10 = -1;
            z4 = true;
        }
        int[] iArr6 = iArr3;
        int i26 = 0;
        while (i26 < cVarArr.length) {
            if (l0VarArr[i26] == null && cVarArr[i26] != null) {
                a aVar2 = this.v[iArr6[i26]];
                if (aVar2.c == 1) {
                    iArr = iArr6;
                    int h9 = h(i26, iArr);
                    if (h9 != -1) {
                        q4.h hVar4 = (q4.h) l0VarArr[h9];
                        int i27 = aVar2.b;
                        boolean[] zArr5 = hVar4.d;
                        k0[] k0VarArr = hVar4.y;
                        for (int i28 = 0; i28 < k0VarArr.length; i28++) {
                            if (hVar4.b[i28] == i27) {
                                h5.a.i(!zArr5[i28]);
                                zArr5[i28] = true;
                                k0VarArr[i28].D(j10, true);
                                l0VarArr[i26] = new q4.f(hVar4, hVar4, k0VarArr[i28], i28);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    l0VarArr[i26] = new o4.g();
                    i26++;
                    iArr6 = iArr;
                }
            }
            iArr = iArr6;
            i26++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (l0 l0Var6 : l0VarArr) {
            if (l0Var6 instanceof q4.h) {
                arrayList2.add((q4.h) l0Var6);
            } else if (l0Var6 instanceof l) {
                arrayList3.add((l) l0Var6);
            }
        }
        q4.h[] hVarArr = new q4.h[arrayList2.size()];
        this.E = hVarArr;
        arrayList2.toArray(hVarArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.F = lVarArr;
        arrayList3.toArray(lVarArr);
        z9.d dVar = this.w;
        q4.h[] hVarArr2 = this.E;
        dVar.getClass();
        this.G = new z2.d(hVarArr2);
        return j10;
    }

    public final int h(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override // o4.t
    public final void i() {
        this.n.a();
    }

    @Override // o4.t
    public final long j(long j10) {
        q4.a aVar;
        boolean D;
        for (q4.h hVar : this.E) {
            hVar.G = j10;
            if (hVar.y()) {
                hVar.F = j10;
            } else {
                for (int i10 = 0; i10 < hVar.v.size(); i10++) {
                    aVar = (q4.a) hVar.v.get(i10);
                    long j11 = aVar.h;
                    if (j11 == j10 && aVar.v == -9223372036854775807L) {
                        break;
                    }
                    if (j11 > j10) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    k0 k0Var = hVar.x;
                    int d = aVar.d(0);
                    synchronized (k0Var) {
                        k0Var.B();
                        int i11 = k0Var.q;
                        if (d >= i11 && d <= k0Var.p + i11) {
                            k0Var.t = Long.MIN_VALUE;
                            k0Var.s = d - i11;
                            D = true;
                        }
                        D = false;
                    }
                } else {
                    D = hVar.x.D(j10, j10 < hVar.e());
                }
                if (D) {
                    hVar.H = hVar.A(hVar.x.q(), 0);
                    k0[] k0VarArr = hVar.y;
                    for (k0 k0Var2 : k0VarArr) {
                        k0Var2.D(j10, true);
                    }
                } else {
                    hVar.F = j10;
                    hVar.J = false;
                    hVar.v.clear();
                    hVar.H = 0;
                    if (hVar.r.d()) {
                        hVar.x.i();
                        for (k0 k0Var3 : hVar.y) {
                            k0Var3.i();
                        }
                        hVar.r.b();
                    } else {
                        hVar.r.c = null;
                        hVar.x.A(false);
                        for (k0 k0Var4 : hVar.y) {
                            k0Var4.A(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.F) {
            int b10 = d0.b(lVar.c, j10, true);
            lVar.h = b10;
            lVar.n = (lVar.d && b10 == lVar.c.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    @Override // o4.t
    public final void k(long j10) {
        long j11;
        for (q4.h hVar : this.E) {
            if (!hVar.y()) {
                k0 k0Var = hVar.x;
                int i10 = k0Var.q;
                k0Var.h(j10, true);
                k0 k0Var2 = hVar.x;
                int i11 = k0Var2.q;
                if (i11 > i10) {
                    synchronized (k0Var2) {
                        j11 = k0Var2.p == 0 ? Long.MIN_VALUE : k0Var2.n[k0Var2.r];
                    }
                    int i12 = 0;
                    while (true) {
                        k0[] k0VarArr = hVar.y;
                        if (i12 >= k0VarArr.length) {
                            break;
                        }
                        k0VarArr[i12].h(j11, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.A(i11, 0), hVar.H);
                if (min > 0) {
                    d0.L(0, min, hVar.v);
                    hVar.H -= min;
                }
            }
        }
    }

    @Override // o4.n0
    public final boolean m(long j10) {
        return this.G.m(j10);
    }

    @Override // o4.t
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // o4.t
    public final t0 o() {
        return this.s;
    }

    @Override // o4.n0
    public final long r() {
        return this.G.r();
    }

    @Override // o4.m0
    public final void s(o4.n0 n0Var) {
        this.D.s(this);
    }

    @Override // o4.n0
    public final void t(long j10) {
        this.G.t(j10);
    }
}
