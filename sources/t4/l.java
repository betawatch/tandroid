package t4;

import android.net.Uri;
import android.util.SparseArray;
import b4.e0;
import g5.g0;
import g5.v0;
import h5.d0;
import j3.h2;
import j3.m0;
import j3.r1;
import j7.k7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k7.y7;
import o4.l0;
import o4.n0;
import o4.s0;
import o4.t0;
import oh.h4;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l implements o4.t, u4.q {
    public final k3.k B;
    public final f1 C = new f1(this, 19);
    public o4.s D;
    public int E;
    public t0 F;
    public r[] G;
    public r[] H;
    public int I;
    public z2.d J;
    public final j a;
    public final u4.c b;
    public final h4 c;
    public final v0 d;
    public final o3.o e;
    public final o3.l f;
    public final ab.a h;
    public final e0 n;
    public final g5.q r;
    public final IdentityHashMap s;
    public final ai v;
    public final z9.d w;
    public final boolean x;
    public final int y;

    public l(j jVar, u4.c cVar, h4 h4Var, v0 v0Var, o3.o oVar, o3.l lVar, ab.a aVar, e0 e0Var, g5.q qVar, z9.d dVar, boolean z4, int i10, k3.k kVar) {
        this.a = jVar;
        this.b = cVar;
        this.c = h4Var;
        this.d = v0Var;
        this.e = oVar;
        this.f = lVar;
        this.h = aVar;
        this.n = e0Var;
        this.r = qVar;
        this.w = dVar;
        this.x = z4;
        this.y = i10;
        this.B = kVar;
        dVar.getClass();
        this.J = new z2.d(new n0[0]);
        this.s = new IdentityHashMap();
        this.v = new ai(15);
        this.G = new r[0];
        this.H = new r[0];
    }

    public static j3.n0 l(j3.n0 n0Var, j3.n0 n0Var2, boolean z4) {
        String p10;
        e4.c cVar;
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        if (n0Var2 != null) {
            p10 = n0Var2.r;
            cVar = n0Var2.s;
            i11 = n0Var2.P;
            i10 = n0Var2.d;
            i12 = n0Var2.e;
            str = n0Var2.c;
            str2 = n0Var2.b;
        } else {
            p10 = d0.p(1, n0Var.r);
            cVar = n0Var.s;
            if (z4) {
                i11 = n0Var.P;
                i10 = n0Var.d;
                i12 = n0Var.e;
                str = n0Var.c;
                str2 = n0Var.b;
            } else {
                i10 = 0;
                str = null;
                str2 = null;
                i11 = -1;
                i12 = 0;
            }
        }
        String c3 = h5.o.c(p10);
        int i13 = z4 ? n0Var.f : -1;
        int i14 = z4 ? n0Var.h : -1;
        m0 m0Var = new m0();
        m0Var.a = n0Var.a;
        m0Var.b = str2;
        m0Var.n = n0Var.B;
        m0Var.o = c3;
        m0Var.h = p10;
        m0Var.i = cVar;
        m0Var.f = i13;
        m0Var.g = i14;
        m0Var.B = i11;
        m0Var.d = i10;
        m0Var.e = i12;
        m0Var.c = str;
        return new j3.n0(m0Var);
    }

    @Override // u4.q
    public final void a() {
        for (r rVar : this.G) {
            g5.m0 m0Var = rVar.s;
            ArrayList arrayList = rVar.y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) s8.l.h(arrayList);
                int b10 = rVar.d.b(kVar);
                if (b10 == 1) {
                    kVar.X = true;
                } else if (b10 == 2 && !rVar.g0 && m0Var.d()) {
                    m0Var.b();
                }
            }
        }
        this.D.s(this);
    }

    @Override // o4.n0
    public final boolean b() {
        return this.J.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if ((((u4.b) r9.g.d.get(r18)) != null ? !u4.b.a(r4, r13) : false) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056 A[SYNTHETIC] */
    @Override // u4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Uri uri, p2.v vVar, boolean z4) {
        long j10;
        int i10;
        int m9;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        for (r rVar : this.G) {
            i iVar = rVar.d;
            Uri[] uriArr = iVar.e;
            if (d0.j(uriArr, uri)) {
                if (!z4) {
                    ab.a aVar = rVar.r;
                    g0 a2 = k7.a(iVar.q);
                    aVar.getClass();
                    c4.e m32 = ab.a.m3(a2, vVar);
                    if (m32 != null && m32.a == 2) {
                        j10 = m32.b;
                        i10 = 0;
                        while (true) {
                            if (i10 < uriArr.length) {
                                i10 = -1;
                                break;
                            }
                            if (uriArr[i10].equals(uri)) {
                                break;
                            }
                            i10++;
                        }
                        if (i10 != -1 && (m9 = iVar.q.m(i10)) != -1) {
                            iVar.s |= uri.equals(iVar.o);
                            if (j10 != -9223372036854775807L) {
                                if (iVar.q.d(m9, j10)) {
                                }
                                z10 = false;
                                z11 = (z10 || j10 == -9223372036854775807L) ? false : true;
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    }
                }
                j10 = -9223372036854775807L;
                i10 = 0;
                while (true) {
                    if (i10 < uriArr.length) {
                    }
                    i10++;
                }
                if (i10 != -1) {
                    iVar.s |= uri.equals(iVar.o);
                    if (j10 != -9223372036854775807L) {
                    }
                }
                z10 = true;
                if (z10) {
                }
            } else {
                z11 = true;
            }
            z12 &= z11;
        }
        this.D.s(this);
        return z12;
    }

    @Override // o4.t
    public final long d(long j10, h2 h2Var) {
        r[] rVarArr = this.H;
        int length = rVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            r rVar = rVarArr[i10];
            if (rVar.N == 2) {
                i iVar = rVar.d;
                u4.c cVar = iVar.g;
                int h = iVar.q.h();
                Uri[] uriArr = iVar.e;
                u4.i a2 = (h >= uriArr.length || h == -1) ? null : cVar.a(uriArr[iVar.q.i()], true);
                if (a2 != null) {
                    s8.v vVar = a2.r;
                    if (!vVar.isEmpty() && a2.c) {
                        long j11 = a2.h - cVar.y;
                        long j12 = j10 - j11;
                        int c3 = d0.c(vVar, Long.valueOf(j12), true);
                        long j13 = ((u4.f) vVar.get(c3)).e;
                        return h2Var.a(j12, j13, c3 != vVar.size() - 1 ? ((u4.f) vVar.get(c3 + 1)).e : j13) + j11;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override // o4.n0
    public final long e() {
        return this.J.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    @Override // o4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(o4.s sVar, long j10) {
        boolean z4;
        List list;
        List list2;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int o10;
        r h;
        Uri[] uriArr;
        this.D = sVar;
        u4.c cVar = this.b;
        cVar.getClass();
        cVar.e.add(this);
        u4.l lVar = cVar.s;
        lVar.getClass();
        List list3 = lVar.g;
        List list4 = lVar.e;
        Map map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List list5 = lVar.h;
        int i13 = 0;
        this.E = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z13 = this.x;
        if (isEmpty) {
            z4 = z13;
            list = list3;
            list2 = list5;
        } else {
            j3.n0 n0Var = lVar.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                list2 = list5;
                if (i14 >= list4.size()) {
                    break;
                }
                j3.n0 n0Var2 = ((u4.k) list4.get(i14)).b;
                int i16 = n0Var2.I;
                String str = n0Var2.r;
                if (i16 > 0 || d0.p(2, str) != null) {
                    iArr[i14] = 2;
                    i15++;
                } else if (d0.p(1, str) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
                i14++;
                list5 = list2;
            }
            if (i15 > 0) {
                z10 = z13;
                i11 = i15;
                z11 = true;
            } else if (i13 < size) {
                z10 = z13;
                i11 = size - i13;
                z11 = false;
                z12 = true;
                Uri[] uriArr2 = new Uri[i11];
                boolean z14 = z11;
                j3.n0[] n0VarArr = new j3.n0[i11];
                int[] iArr2 = new int[i11];
                i12 = 0;
                int i17 = 0;
                while (i12 < list4.size()) {
                    if (z14) {
                        uriArr = uriArr2;
                        if (iArr[i12] != 2) {
                            i12++;
                            uriArr2 = uriArr;
                        }
                    } else {
                        uriArr = uriArr2;
                    }
                    if (!z12 || iArr[i12] != 1) {
                        u4.k kVar = (u4.k) list4.get(i12);
                        uriArr[i17] = kVar.a;
                        n0VarArr[i17] = kVar.b;
                        iArr2[i17] = i12;
                        i17++;
                    }
                    i12++;
                    uriArr2 = uriArr;
                }
                Uri[] uriArr3 = uriArr2;
                String str2 = n0VarArr[0].r;
                o10 = d0.o(2, str2);
                int o11 = d0.o(1, str2);
                boolean z15 = (o11 != 1 || (o11 == 0 && list3.isEmpty())) && o10 <= 1 && o11 + o10 > 0;
                z4 = z10;
                list = list3;
                h = h("main", (!z14 || o11 <= 0) ? 0 : 1, uriArr3, n0VarArr, lVar.j, lVar.k, map, j10);
                arrayList.add(h);
                arrayList2.add(iArr2);
                if (z4 && z15) {
                    ArrayList arrayList3 = new ArrayList();
                    if (o10 <= 0) {
                        j3.n0[] n0VarArr2 = new j3.n0[i11];
                        int i18 = 0;
                        while (i18 < i11) {
                            j3.n0 n0Var3 = n0VarArr[i18];
                            String p10 = d0.p(2, n0Var3.r);
                            String c3 = h5.o.c(p10);
                            m0 m0Var = new m0();
                            m0Var.a = n0Var3.a;
                            m0Var.b = n0Var3.b;
                            m0Var.n = n0Var3.B;
                            m0Var.o = c3;
                            m0Var.h = p10;
                            m0Var.i = n0Var3.s;
                            m0Var.f = n0Var3.f;
                            m0Var.g = n0Var3.h;
                            m0Var.t = n0Var3.H;
                            m0Var.u = n0Var3.I;
                            m0Var.v = n0Var3.J;
                            m0Var.d = n0Var3.d;
                            m0Var.e = n0Var3.e;
                            n0VarArr2[i18] = new j3.n0(m0Var);
                            i18++;
                            n0VarArr = n0VarArr;
                        }
                        j3.n0[] n0VarArr3 = n0VarArr;
                        arrayList3.add(new s0("main", n0VarArr2));
                        if (o11 > 0 && (n0Var != null || list.isEmpty())) {
                            arrayList3.add(new s0("main:audio", l(n0VarArr3[0], n0Var, false)));
                        }
                        List list6 = lVar.k;
                        if (list6 != null) {
                            for (int i19 = 0; i19 < list6.size(); i19++) {
                                arrayList3.add(new s0(l.d.j(i19, "main:cc:"), (j3.n0) list6.get(i19)));
                            }
                        }
                    } else {
                        j3.n0[] n0VarArr4 = new j3.n0[i11];
                        for (int i20 = 0; i20 < i11; i20++) {
                            n0VarArr4[i20] = l(n0VarArr[i20], n0Var, true);
                        }
                        arrayList3.add(new s0("main", n0VarArr4));
                    }
                    m0 m0Var2 = new m0();
                    m0Var2.a = "ID3";
                    m0Var2.o = "application/id3";
                    s0 s0Var = new s0("main:id3", new j3.n0(m0Var2));
                    arrayList3.add(s0Var);
                    h.C((s0[]) arrayList3.toArray(new s0[0]), arrayList3.indexOf(s0Var));
                }
            } else {
                z10 = z13;
                i11 = size;
                z11 = false;
            }
            z12 = false;
            Uri[] uriArr22 = new Uri[i11];
            boolean z142 = z11;
            j3.n0[] n0VarArr5 = new j3.n0[i11];
            int[] iArr22 = new int[i11];
            i12 = 0;
            int i172 = 0;
            while (i12 < list4.size()) {
            }
            Uri[] uriArr32 = uriArr22;
            String str22 = n0VarArr5[0].r;
            o10 = d0.o(2, str22);
            int o112 = d0.o(1, str22);
            if (o112 != 1) {
            }
            z4 = z10;
            list = list3;
            h = h("main", (!z142 || o112 <= 0) ? 0 : 1, uriArr32, n0VarArr5, lVar.j, lVar.k, map, j10);
            arrayList.add(h);
            arrayList2.add(iArr22);
            if (z4) {
                ArrayList arrayList32 = new ArrayList();
                if (o10 <= 0) {
                }
                m0 m0Var22 = new m0();
                m0Var22.a = "ID3";
                m0Var22.o = "application/id3";
                s0 s0Var2 = new s0("main:id3", new j3.n0(m0Var22));
                arrayList32.add(s0Var2);
                h.C((s0[]) arrayList32.toArray(new s0[0]), arrayList32.indexOf(s0Var2));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i21 = 0;
        while (i21 < list.size()) {
            List list7 = list;
            String str3 = ((u4.j) list7.get(i21)).c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z16 = true;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    String str4 = ((u4.j) list7.get(i22)).c;
                    int i23 = d0.a;
                    if (str3.equals(str4)) {
                        u4.j jVar = (u4.j) list7.get(i22);
                        arrayList6.add(Integer.valueOf(i22));
                        Uri uri = jVar.a;
                        j3.n0 n0Var4 = jVar.b;
                        arrayList4.add(uri);
                        arrayList5.add(n0Var4);
                        z16 &= d0.o(1, n0Var4.r) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                int i24 = d0.a;
                list = list7;
                i10 = i21;
                r h9 = h(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (j3.n0[]) arrayList5.toArray(new j3.n0[0]), null, Collections.EMPTY_LIST, map, j10);
                arrayList2.add(y7.d(arrayList6));
                arrayList.add(h9);
                if (z4 && z16) {
                    h9.C(new s0[]{new s0(concat, (j3.n0[]) arrayList5.toArray(new j3.n0[0]))}, new int[0]);
                }
            } else {
                i10 = i21;
                list = list7;
            }
            i21 = i10 + 1;
        }
        this.I = arrayList.size();
        for (int i25 = 0; i25 < list2.size(); i25++) {
            u4.j jVar2 = (u4.j) list2.get(i25);
            StringBuilder m9 = l.d.m(i25, "subtitle:", ":");
            String str5 = jVar2.c;
            j3.n0 n0Var5 = jVar2.b;
            m9.append(str5);
            String sb = m9.toString();
            r h10 = h(sb, 3, new Uri[]{jVar2.a}, new j3.n0[]{n0Var5}, null, Collections.EMPTY_LIST, map, j10);
            arrayList2.add(new int[]{i25});
            arrayList.add(h10);
            h10.C(new s0[]{new s0(sb, n0Var5)}, new int[0]);
        }
        this.G = (r[]) arrayList.toArray(new r[0]);
        this.E = this.G.length;
        for (int i26 = 0; i26 < this.I; i26++) {
            this.G[i26].d.l = true;
        }
        for (r rVar : this.G) {
            if (!rVar.Q) {
                rVar.m(rVar.c0);
            }
        }
        this.H = this.G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0110, code lost:
    
        if (r42 != r3.c0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // o4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        l0[] l0VarArr2;
        i iVar;
        i iVar2;
        boolean z4;
        int i10;
        int[] iArr;
        r[] rVarArr;
        int i11;
        int i12;
        l0[] l0VarArr3;
        int i13;
        i iVar3;
        int[] iArr2;
        r rVar;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        int i16;
        boolean z12;
        ?? r82;
        int i17;
        f5.c[] cVarArr2;
        int i18;
        g5.m0 m0Var;
        int[] iArr3 = new int[cVarArr.length];
        int[] iArr4 = new int[cVarArr.length];
        int i19 = 0;
        while (true) {
            int length = cVarArr.length;
            identityHashMap = this.s;
            if (i19 >= length) {
                break;
            }
            l0 l0Var = l0VarArr[i19];
            iArr3[i19] = l0Var == null ? -1 : ((Integer) identityHashMap.get(l0Var)).intValue();
            iArr4[i19] = -1;
            f5.c cVar = cVarArr[i19];
            if (cVar != null) {
                s0 l10 = cVar.l();
                int i20 = 0;
                while (true) {
                    r[] rVarArr2 = this.G;
                    if (i20 < rVarArr2.length) {
                        r rVar2 = rVarArr2[i20];
                        rVar2.h();
                        if (rVar2.V.b(l10) != -1) {
                            iArr4[i19] = i20;
                            break;
                        }
                        i20++;
                    }
                }
            }
            i19++;
        }
        identityHashMap.clear();
        int length2 = cVarArr.length;
        l0[] l0VarArr4 = new l0[length2];
        int length3 = cVarArr.length;
        l0[] l0VarArr5 = new l0[length3];
        int length4 = cVarArr.length;
        f5.c[] cVarArr3 = new f5.c[length4];
        r[] rVarArr3 = new r[this.G.length];
        int i21 = length3;
        int i22 = 0;
        int i23 = 0;
        boolean z13 = false;
        while (i22 < this.G.length) {
            int i24 = length2;
            int i25 = 0;
            while (true) {
                l0VarArr2 = l0VarArr4;
                if (i25 >= cVarArr.length) {
                    break;
                }
                l0VarArr5[i25] = iArr3[i25] == i22 ? l0VarArr[i25] : null;
                cVarArr3[i25] = iArr4[i25] == i22 ? cVarArr[i25] : null;
                i25++;
                l0VarArr4 = l0VarArr2;
            }
            r rVar3 = this.G[i22];
            g5.m0 m0Var2 = rVar3.s;
            int i26 = i22;
            i iVar4 = rVar3.d;
            ArrayList arrayList = rVar3.y;
            rVar3.h();
            int i27 = rVar3.R;
            ?? r27 = l0VarArr5;
            int i28 = 0;
            while (i28 < length4) {
                n nVar = (n) r27[i28];
                if (nVar == null || (cVarArr3[i28] != null && zArr[i28])) {
                    i18 = i28;
                    m0Var = m0Var2;
                } else {
                    i18 = i28;
                    rVar3.R--;
                    m0Var = m0Var2;
                    if (nVar.c != -1) {
                        r rVar4 = nVar.b;
                        int i29 = nVar.a;
                        rVar4.h();
                        rVar4.X.getClass();
                        int i30 = rVar4.X[i29];
                        h5.a.i(rVar4.a0[i30]);
                        rVar4.a0[i30] = false;
                        nVar.c = -1;
                    }
                    r27[i18] = 0;
                }
                i28 = i18 + 1;
                m0Var2 = m0Var;
            }
            g5.m0 m0Var3 = m0Var2;
            boolean z14 = true;
            if (!z13) {
                if (!rVar3.f0) {
                    iVar = iVar4;
                } else if (i27 != 0) {
                    iVar = iVar4;
                }
                iVar2 = iVar;
                z4 = false;
                f5.c cVar2 = iVar2.q;
                boolean z15 = z4;
                f5.c cVar3 = cVar2;
                i10 = 0;
                while (i10 < length4) {
                    int i31 = i10;
                    f5.c cVar4 = cVarArr3[i31];
                    if (cVar4 == null) {
                        i17 = length4;
                        cVarArr2 = cVarArr3;
                    } else {
                        i17 = length4;
                        cVarArr2 = cVarArr3;
                        int b10 = rVar3.V.b(cVar4.l());
                        if (b10 == rVar3.Y) {
                            iVar2.q = cVar4;
                            cVar3 = cVar4;
                        }
                        if (r27[i31] == 0) {
                            rVar3.R++;
                            n nVar2 = new n(rVar3, b10);
                            r27[i31] = nVar2;
                            zArr2[i31] = z14;
                            if (rVar3.X != null) {
                                nVar2.b();
                                if (!z15) {
                                    q qVar = rVar3.I[rVar3.X[b10]];
                                    z15 = (qVar.D(j10, true) || qVar.q() == 0) ? false : true;
                                }
                            }
                        }
                    }
                    i10 = i31 + 1;
                    length4 = i17;
                    cVarArr3 = cVarArr2;
                    z14 = true;
                }
                int i32 = length4;
                f5.c[] cVarArr4 = cVarArr3;
                if (rVar3.R != 0) {
                    iVar2.n = null;
                    rVar3.T = null;
                    rVar3.e0 = true;
                    arrayList.clear();
                    if (m0Var3.d()) {
                        if (rVar3.P) {
                            for (q qVar2 : rVar3.I) {
                                qVar2.i();
                            }
                        }
                        m0Var3.b();
                    } else {
                        rVar3.D();
                    }
                    int[] iArr5 = iArr4;
                    rVar = rVar3;
                    i14 = i21;
                    iArr2 = iArr5;
                    iArr = iArr3;
                    rVarArr = rVarArr3;
                    i12 = i24;
                    l0VarArr3 = l0VarArr2;
                    i13 = i26;
                    iVar3 = iVar2;
                } else {
                    boolean z16 = true;
                    if (arrayList.isEmpty() || d0.a(cVar3, cVar2)) {
                        iArr = iArr3;
                        rVarArr = rVarArr3;
                        i11 = i21;
                        i12 = i24;
                        l0VarArr3 = l0VarArr2;
                        i13 = i26;
                        iVar3 = iVar2;
                        iArr2 = iArr4;
                        rVar = rVar3;
                    } else {
                        if (rVar3.f0) {
                            iArr = iArr3;
                            rVarArr = rVarArr3;
                            i11 = i21;
                            i12 = i24;
                            l0VarArr3 = l0VarArr2;
                            i13 = i26;
                            iVar3 = iVar2;
                            iArr2 = iArr4;
                            rVar = rVar3;
                        } else {
                            long j11 = j10 < 0 ? -j10 : 0L;
                            k w10 = rVar3.w();
                            f5.c cVar5 = cVar3;
                            iArr = iArr3;
                            rVarArr = rVarArr3;
                            i11 = i21;
                            i12 = i24;
                            l0VarArr3 = l0VarArr2;
                            i13 = i26;
                            iVar3 = iVar2;
                            iArr2 = iArr4;
                            rVar = rVar3;
                            cVar5.v(j10, j11, -9223372036854775807L, rVar3.B, iVar2.a(w10, j10));
                            if (cVar5.i() != iVar3.h.a(w10.d)) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                        }
                        rVar.e0 = z16;
                        z10 = true;
                        z11 = true;
                        if (z11) {
                            i14 = i11;
                        } else {
                            rVar.E(j10, z10);
                            i14 = i11;
                            int i33 = 0;
                            while (i33 < i14) {
                                if (r27[i33] != 0) {
                                    zArr2[i33] = z16;
                                }
                                i33++;
                                z16 = true;
                            }
                        }
                        z15 = z11;
                    }
                    z10 = z13;
                    z11 = z15;
                    if (z11) {
                    }
                    z15 = z11;
                }
                ArrayList arrayList2 = rVar.F;
                arrayList2.clear();
                for (i15 = 0; i15 < i14; i15++) {
                    ?? r83 = r27[i15];
                    if (r83 != 0) {
                        arrayList2.add((n) r83);
                    }
                }
                rVar.f0 = true;
                i16 = 0;
                z12 = false;
                while (i16 < cVarArr.length) {
                    ?? r72 = r27[i16];
                    int i34 = i13;
                    if (iArr2[i16] == i34) {
                        r72.getClass();
                        r82 = l0VarArr3;
                        r82[i16] = r72;
                        identityHashMap.put(r72, Integer.valueOf(i34));
                        z12 = true;
                    } else {
                        r82 = l0VarArr3;
                        if (iArr[i16] == i34) {
                            h5.a.i(r72 == 0);
                        }
                    }
                    i16++;
                    l0VarArr3 = r82;
                    i13 = i34;
                }
                l0[] l0VarArr6 = l0VarArr3;
                int i35 = i13;
                int i36 = i23;
                if (!z12) {
                    rVarArr[i36] = rVar;
                    i23 = i36 + 1;
                    if (i36 == 0) {
                        iVar3.l = true;
                        if (!z15) {
                            r[] rVarArr4 = this.H;
                            if (rVarArr4.length != 0 && rVar == rVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.v.b).clear();
                        z13 = true;
                    } else {
                        iVar3.l = i35 < this.I;
                    }
                }
                i22 = i35 + 1;
                l0VarArr4 = l0VarArr6;
                iArr4 = iArr2;
                rVarArr3 = rVarArr;
                l0VarArr5 = r27;
                iArr3 = iArr;
                length4 = i32;
                cVarArr3 = cVarArr4;
                i21 = i14;
                length2 = i12;
            }
            iVar = iVar4;
            iVar2 = iVar;
            z4 = true;
            f5.c cVar22 = iVar2.q;
            boolean z152 = z4;
            f5.c cVar32 = cVar22;
            i10 = 0;
            while (i10 < length4) {
            }
            int i322 = length4;
            f5.c[] cVarArr42 = cVarArr3;
            if (rVar3.R != 0) {
            }
            ArrayList arrayList22 = rVar.F;
            arrayList22.clear();
            while (i15 < i14) {
            }
            rVar.f0 = true;
            i16 = 0;
            z12 = false;
            while (i16 < cVarArr.length) {
            }
            l0[] l0VarArr62 = l0VarArr3;
            int i352 = i13;
            int i362 = i23;
            if (!z12) {
            }
            i22 = i352 + 1;
            l0VarArr4 = l0VarArr62;
            iArr4 = iArr2;
            rVarArr3 = rVarArr;
            l0VarArr5 = r27;
            iArr3 = iArr;
            length4 = i322;
            cVarArr3 = cVarArr42;
            i21 = i14;
            length2 = i12;
        }
        System.arraycopy(l0VarArr4, 0, l0VarArr, 0, length2);
        r[] rVarArr5 = (r[]) d0.I(i23, rVarArr3);
        this.H = rVarArr5;
        this.w.getClass();
        this.J = new z2.d(rVarArr5);
        return j10;
    }

    public final r h(String str, int i10, Uri[] uriArr, j3.n0[] n0VarArr, j3.n0 n0Var, List list, Map map, long j10) {
        return new r(str, i10, this.C, new i(this.a, this.b, uriArr, n0VarArr, this.c, this.d, this.v, list, this.B), map, this.r, j10, n0Var, this.e, this.f, this.h, this.n, this.y);
    }

    @Override // o4.t
    public final void i() {
        for (r rVar : this.G) {
            rVar.B();
            if (rVar.g0 && !rVar.Q) {
                throw r1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // o4.t
    public final long j(long j10) {
        r[] rVarArr = this.H;
        if (rVarArr.length > 0) {
            boolean E = rVarArr[0].E(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.H;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].E(j10, E);
                i10++;
            }
            if (E) {
                ((SparseArray) this.v.b).clear();
            }
        }
        return j10;
    }

    @Override // o4.t
    public final void k(long j10) {
        for (r rVar : this.H) {
            if (rVar.P && !rVar.z()) {
                int length = rVar.I.length;
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.I[i10].h(j10, rVar.a0[i10]);
                }
            }
        }
    }

    @Override // o4.n0
    public final boolean m(long j10) {
        if (this.F != null) {
            return this.J.m(j10);
        }
        for (r rVar : this.G) {
            if (!rVar.Q) {
                rVar.m(rVar.c0);
            }
        }
        return false;
    }

    @Override // o4.t
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // o4.t
    public final t0 o() {
        t0 t0Var = this.F;
        t0Var.getClass();
        return t0Var;
    }

    @Override // o4.n0
    public final long r() {
        return this.J.r();
    }

    @Override // o4.n0
    public final void t(long j10) {
        this.J.t(j10);
    }
}
