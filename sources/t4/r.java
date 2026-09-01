package t4;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b4.e0;
import g5.g0;
import g5.h0;
import g5.k0;
import g5.m0;
import h5.c0;
import h5.d0;
import h5.w;
import j$.util.DesugarCollections;
import j7.k7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import o4.j0;
import o4.n0;
import o4.s0;
import o4.t0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ai;
import qh.v9;
import s8.i0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class r implements h0, k0, n0, r3.m, j0 {
    public static final Set l0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List B;
    public final o C;
    public final o D;
    public final Handler E;
    public final ArrayList F;
    public final Map G;
    public q4.e H;
    public q[] I;
    public int[] J;
    public final HashSet K;
    public final SparseIntArray L;
    public p M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public j3.n0 S;
    public j3.n0 T;
    public boolean U;
    public t0 V;
    public Set W;
    public int[] X;
    public int Y;
    public boolean Z;
    public final String a;
    public boolean[] a0;
    public final int b;
    public boolean[] b0;
    public final f1 c;
    public long c0;
    public final i d;
    public long d0;
    public final g5.q e;
    public boolean e0;
    public final j3.n0 f;
    public boolean f0;
    public boolean g0;
    public final o3.o h;
    public boolean h0;
    public long i0;
    public o3.g j0;
    public k k0;
    public final o3.l n;
    public final ab.a r;
    public final m0 s = new m0("Loader:HlsSampleStreamWrapper");
    public final e0 v;
    public final int w;
    public final androidx.activity.o x;
    public final ArrayList y;

    /* JADX WARN: Type inference failed for: r1v12, types: [t4.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [t4.o] */
    public r(String str, int i10, f1 f1Var, i iVar, Map map, g5.q qVar, long j10, j3.n0 n0Var, o3.o oVar, o3.l lVar, ab.a aVar, e0 e0Var, int i11) {
        this.a = str;
        this.b = i10;
        this.c = f1Var;
        this.d = iVar;
        this.G = map;
        this.e = qVar;
        this.f = n0Var;
        this.h = oVar;
        this.n = lVar;
        this.r = aVar;
        this.v = e0Var;
        this.w = i11;
        androidx.activity.o oVar2 = new androidx.activity.o();
        oVar2.b = null;
        final int i12 = 0;
        oVar2.a = false;
        oVar2.c = null;
        this.x = oVar2;
        this.J = new int[0];
        Set set = l0;
        this.K = new HashSet(set.size());
        this.L = new SparseIntArray(set.size());
        this.I = new q[0];
        this.b0 = new boolean[0];
        this.a0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        this.B = DesugarCollections.unmodifiableList(arrayList);
        this.F = new ArrayList();
        this.C = new Runnable(this) { // from class: t4.o
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.A();
                        break;
                    default:
                        r rVar = this.b;
                        rVar.P = true;
                        rVar.A();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.D = new Runnable(this) { // from class: t4.o
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.A();
                        break;
                    default:
                        r rVar = this.b;
                        rVar.P = true;
                        rVar.A();
                        break;
                }
            }
        };
        this.E = d0.l(null);
        this.c0 = j10;
        this.d0 = j10;
    }

    public static r3.j l(int i10, int i11) {
        h5.a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new r3.j();
    }

    public static j3.n0 s(j3.n0 n0Var, j3.n0 n0Var2, boolean z4) {
        String a2;
        if (n0Var == null) {
            return n0Var2;
        }
        String str = n0Var.r;
        String str2 = n0Var2.C;
        int g10 = h5.o.g(str2);
        if (d0.o(g10, str) == 1) {
            a2 = d0.p(g10, str);
            str2 = h5.o.c(a2);
        } else {
            a2 = h5.o.a(str, str2);
        }
        n0Var2.v = n0Var.v;
        n0Var2.w = n0Var.w;
        n0Var2.x = n0Var.x;
        n0Var2.y = n0Var.y;
        j3.m0 a10 = n0Var2.a();
        a10.a = n0Var.a;
        a10.b = n0Var.b;
        a10.c = n0Var.c;
        a10.d = n0Var.d;
        a10.e = n0Var.e;
        a10.f = z4 ? n0Var.f : -1;
        a10.g = z4 ? n0Var.h : -1;
        a10.h = a2;
        a10.m = n0Var.x;
        a10.k = n0Var.w;
        a10.j = n0Var.v;
        a10.l = n0Var.y;
        if (g10 == 2) {
            a10.t = n0Var.H;
            a10.u = n0Var.I;
            a10.v = n0Var.J;
        }
        if (str2 != null) {
            a10.o = str2;
        }
        int i10 = n0Var.P;
        if (i10 != -1 && g10 == 1) {
            a10.B = i10;
        }
        e4.c cVar = n0Var.s;
        if (cVar != null) {
            e4.c cVar2 = n0Var2.s;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar.a);
            }
            a10.i = cVar;
        }
        return new j3.n0(a10);
    }

    public static int y(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A() {
        if (!this.U && this.X == null && this.P) {
            int i10 = 0;
            for (q qVar : this.I) {
                if (qVar.t() == null) {
                    return;
                }
            }
            t0 t0Var = this.V;
            if (t0Var != null) {
                int i11 = t0Var.a;
                int[] iArr = new int[i11];
                this.X = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        q[] qVarArr = this.I;
                        if (i13 < qVarArr.length) {
                            j3.n0 t6 = qVarArr[i13].t();
                            h5.a.j(t6);
                            j3.n0 n0Var = this.V.a(i12).d[0];
                            String str = t6.C;
                            String str2 = n0Var.C;
                            int g10 = h5.o.g(str);
                            if (g10 == 3) {
                                if (d0.a(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || t6.U == n0Var.U) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                            } else if (g10 == h5.o.g(str2)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.X[i12] = i13;
                }
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((n) obj).b();
                }
                return;
            }
            int length = this.I.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                j3.n0 t9 = this.I[i14].t();
                h5.a.j(t9);
                String str3 = t9.C;
                if (h5.o.j(str3)) {
                    i17 = 2;
                } else if (!h5.o.h(str3)) {
                    i17 = h5.o.i(str3) ? 3 : -2;
                }
                if (y(i17) > y(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            s0 s0Var = this.d.h;
            int i18 = s0Var.a;
            this.Y = -1;
            this.X = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.X[i19] = i19;
            }
            s0[] s0VarArr = new s0[length];
            int i20 = 0;
            while (i20 < length) {
                j3.n0 t10 = this.I[i20].t();
                h5.a.j(t10);
                String str4 = this.a;
                j3.n0 n0Var2 = this.f;
                if (i20 == i16) {
                    j3.n0[] n0VarArr = new j3.n0[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        j3.n0 n0Var3 = s0Var.d[i21];
                        if (i15 == 1 && n0Var2 != null) {
                            n0Var3 = n0Var3.c(n0Var2);
                        }
                        n0VarArr[i21] = i18 == 1 ? t10.c(n0Var3) : s(n0Var3, t10, true);
                    }
                    s0VarArr[i20] = new s0(str4, n0VarArr);
                    this.Y = i20;
                } else {
                    if (i15 != 2 || !h5.o.h(t10.C)) {
                        n0Var2 = null;
                    }
                    StringBuilder f10 = w.c.f(str4, ":muxed:");
                    f10.append(i20 < i16 ? i20 : i20 - 1);
                    s0VarArr[i20] = new s0(f10.toString(), s(n0Var2, t10, false));
                }
                i20++;
            }
            this.V = p(s0VarArr);
            h5.a.i(this.W == null);
            this.W = Collections.EMPTY_SET;
            this.Q = true;
            this.c.v();
        }
    }

    public final void B() {
        this.s.a();
        i iVar = this.d;
        o4.b bVar = iVar.n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.o;
        if (uri == null || !iVar.s) {
            return;
        }
        u4.b bVar2 = (u4.b) iVar.g.d.get(uri);
        bVar2.b.a();
        IOException iOException = bVar2.s;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void C(s0[] s0VarArr, int... iArr) {
        this.V = p(s0VarArr);
        this.W = new HashSet();
        for (int i10 : iArr) {
            this.W.add(this.V.a(i10));
        }
        this.Y = 0;
        this.E.post(new v9(this.c, 16));
        this.Q = true;
    }

    public final void D() {
        for (q qVar : this.I) {
            qVar.A(this.e0);
        }
        this.e0 = false;
    }

    public final boolean E(long j10, boolean z4) {
        int i10;
        this.c0 = j10;
        if (z()) {
            this.d0 = j10;
            return true;
        }
        if (this.P && !z4) {
            int length = this.I.length;
            while (i10 < length) {
                i10 = (this.I[i10].D(j10, false) || (!this.b0[i10] && this.Z)) ? i10 + 1 : 0;
            }
            return false;
        }
        this.d0 = j10;
        this.g0 = false;
        this.y.clear();
        m0 m0Var = this.s;
        if (!m0Var.d()) {
            m0Var.c = null;
            D();
            return true;
        }
        if (this.P) {
            for (q qVar : this.I) {
                qVar.i();
            }
        }
        m0Var.b();
        return true;
    }

    @Override // o4.j0
    public final void a() {
        this.E.post(this.C);
    }

    @Override // o4.n0
    public final boolean b() {
        return this.s.d();
    }

    @Override // g5.k0
    public final void c() {
        for (q qVar : this.I) {
            qVar.A(true);
            o3.i iVar = qVar.h;
            if (iVar != null) {
                iVar.c(qVar.e);
                qVar.h = null;
                qVar.g = null;
            }
        }
    }

    @Override // o4.n0
    public final long e() {
        if (z()) {
            return this.d0;
        }
        if (this.g0) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    public final void h() {
        h5.a.i(this.Q);
        this.V.getClass();
        this.W.getClass();
    }

    @Override // r3.m
    public final void i1() {
        this.h0 = true;
        this.E.post(this.D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [t4.q[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t4.q[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r3.v] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o4.k0, t4.q] */
    /* JADX WARN: Type inference failed for: r5v6, types: [r3.j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // r3.m
    public final r3.v i2(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Set set = l0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.K;
        SparseIntArray sparseIntArray = this.L;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            h5.a.f(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.J[i12] = i10;
                }
                r52 = this.J[i12] == i10 ? this.I[i12] : l(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.I;
                if (i13 >= r12.length) {
                    break;
                }
                if (this.J[i13] == i10) {
                    r52 = r12[i13];
                    break;
                }
                i13++;
            }
        }
        if (r52 == 0) {
            if (this.h0) {
                return l(i10, i11);
            }
            int length = this.I.length;
            boolean z4 = i11 == 1 || i11 == 2;
            r52 = new q(this.e, this.h, this.n, this.G);
            r52.t = this.c0;
            if (z4) {
                r52.I = this.j0;
                r52.z = true;
            }
            long j10 = this.i0;
            if (r52.F != j10) {
                r52.F = j10;
                r52.z = true;
            }
            if (this.k0 != null) {
                r52.C = r6.v;
            }
            r52.f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.J, i14);
            this.J = copyOf;
            copyOf[length] = i10;
            q[] qVarArr = this.I;
            int i15 = d0.a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r52;
            this.I = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.b0, i14);
            this.b0 = copyOf3;
            copyOf3[length] = z4;
            this.Z |= z4;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (y(i11) > y(this.N)) {
                this.O = length;
                this.N = i11;
            }
            this.a0 = Arrays.copyOf(this.a0, i14);
        }
        if (i11 != 5) {
            return r52;
        }
        if (this.M == null) {
            this.M = new p(r52, this.w);
        }
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04ad  */
    @Override // o4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(long j10) {
        long max;
        List list;
        long j11;
        androidx.activity.o oVar;
        int i10;
        androidx.activity.o oVar2;
        k kVar;
        long j12;
        i iVar;
        int i11;
        int i12;
        Uri uri;
        h hVar;
        e d;
        boolean z4;
        List list2;
        boolean z10;
        org.telegram.ui.web.e0 e0Var;
        byte[] bArr;
        m0 m0Var;
        boolean z11;
        byte[] bArr2;
        g5.m mVar;
        u4.f fVar;
        k3.k kVar2;
        ai aiVar;
        Uri uri2;
        g5.p pVar;
        g5.m mVar2;
        boolean z12;
        Uri uri3;
        j4.i iVar2;
        w wVar;
        b bVar;
        c0 c0Var;
        byte[] bArr3;
        g5.m mVar3;
        String str;
        boolean z13;
        if (this.g0) {
            return false;
        }
        m0 m0Var2 = this.s;
        if (m0Var2.d() || m0Var2.c()) {
            return false;
        }
        if (z()) {
            list = Collections.EMPTY_LIST;
            max = this.d0;
            for (q qVar : this.I) {
                qVar.t = this.d0;
            }
        } else {
            k w10 = w();
            max = w10.U ? w10.n : Math.max(this.c0, w10.h);
            list = this.B;
        }
        List list3 = list;
        androidx.activity.o oVar3 = this.x;
        oVar3.b = null;
        oVar3.a = false;
        oVar3.c = null;
        boolean z14 = this.Q || !list3.isEmpty();
        i iVar3 = this.d;
        org.telegram.ui.web.e0 e0Var2 = iVar3.j;
        Uri[] uriArr = iVar3.e;
        u4.c cVar = iVar3.g;
        k kVar3 = list3.isEmpty() ? null : (k) s8.l.h(list3);
        int a2 = kVar3 == null ? -1 : iVar3.h.a(kVar3.d);
        long j13 = max - j10;
        long j14 = iVar3.r;
        long j15 = j14 != -9223372036854775807L ? j14 - j10 : -9223372036854775807L;
        if (kVar3 == null) {
            j11 = max;
            oVar = oVar3;
            i10 = a2;
        } else if (iVar3.p) {
            j11 = max;
            i10 = a2;
            oVar = oVar3;
        } else {
            i10 = a2;
            oVar = oVar3;
            long j16 = kVar3.n - kVar3.h;
            j11 = max;
            j13 = Math.max(0L, j13 - j16);
            if (j15 != -9223372036854775807L) {
                j15 = Math.max(0L, j15 - j16);
            }
        }
        long j17 = j11;
        k kVar4 = kVar3;
        int i13 = i10;
        iVar3.q.v(j10, j13, j15, list3, iVar3.a(kVar3, j17));
        int i14 = iVar3.q.i();
        boolean z15 = i13 != i14;
        Uri uri4 = uriArr[i14];
        if (cVar.c(uri4)) {
            oVar2 = oVar;
            u4.i a10 = cVar.a(uri4, true);
            a10.getClass();
            long j18 = a10.h;
            iVar3.p = a10.c;
            if (a10.o) {
                kVar = kVar4;
                j12 = -9223372036854775807L;
            } else {
                kVar = kVar4;
                j12 = (a10.u + j18) - cVar.y;
            }
            iVar3.r = j12;
            boolean z16 = z15;
            long j19 = j18 - cVar.y;
            k kVar5 = kVar;
            Pair c3 = iVar3.c(kVar5, z16, a10, j19, j17);
            long longValue = ((Long) c3.first).longValue();
            int intValue = ((Integer) c3.second).intValue();
            if (longValue >= a10.k || kVar5 == null || !z16) {
                iVar = iVar3;
                i11 = i14;
                i12 = intValue;
                uri = uri4;
            } else {
                uri = uriArr[i13];
                a10 = cVar.a(uri, true);
                a10.getClass();
                j19 = a10.h - cVar.y;
                iVar = iVar3;
                Pair c10 = iVar.c(kVar5, false, a10, j19, j17);
                longValue = ((Long) c10.first).longValue();
                i12 = ((Integer) c10.second).intValue();
                i11 = i13;
            }
            long j20 = j19;
            long j21 = longValue;
            String str2 = a10.a;
            boolean z17 = a10.c;
            long j22 = a10.k;
            s8.v vVar = a10.r;
            if (j21 < j22) {
                iVar.n = new o4.b();
            } else {
                s8.v vVar2 = a10.s;
                boolean z18 = z17;
                int i15 = (int) (j21 - j22);
                if (i15 == vVar.size()) {
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    if (i12 < vVar2.size()) {
                        hVar = new h((u4.g) vVar2.get(i12), j21, i12);
                        if (hVar == null) {
                            if (!a10.o) {
                                oVar2.c = uri;
                                iVar.s &= uri.equals(iVar.o);
                                iVar.o = uri;
                            } else if (z14 || vVar.isEmpty()) {
                                oVar2.a = true;
                            } else {
                                hVar = new h((u4.g) s8.l.h(vVar), (j22 + vVar.size()) - 1, -1);
                            }
                        }
                        boolean z19 = hVar.d;
                        u4.g gVar = hVar.a;
                        iVar.s = false;
                        iVar.o = null;
                        u4.f fVar2 = gVar.b;
                        long j23 = gVar.e;
                        Uri H = (fVar2 != null || (str = fVar2.h) == null) ? null : h5.a.H(str2, str);
                        d = iVar.d(i11, H, true);
                        oVar2.b = d;
                        if (d == null) {
                            String str3 = gVar.h;
                            Uri H2 = str3 == null ? null : h5.a.H(str2, str3);
                            e d10 = iVar.d(i11, H2, false);
                            oVar2.b = d10;
                            if (d10 == null) {
                                if (kVar5 == null) {
                                    AtomicInteger atomicInteger = k.Y;
                                } else if (!uri.equals(kVar5.x) || !kVar5.U) {
                                    long j24 = j20 + j23;
                                    if (gVar instanceof u4.d) {
                                        z18 = ((u4.d) gVar).w || (hVar.c == 0 && z18);
                                    }
                                    if (!z18 || j24 < kVar5.n) {
                                        z4 = true;
                                        if (z4 || !z19) {
                                            j jVar = iVar.a;
                                            g5.m mVar4 = iVar.b;
                                            j3.n0 n0Var = iVar.f[i11];
                                            List list4 = iVar.i;
                                            int k10 = iVar.q.k();
                                            Object j25 = iVar.q.j();
                                            boolean z20 = iVar.l;
                                            ai aiVar2 = iVar.d;
                                            if (H2 != null) {
                                                e0Var2.getClass();
                                                list2 = list4;
                                                z10 = z20;
                                                e0Var = e0Var2;
                                                bArr = null;
                                            } else {
                                                list2 = list4;
                                                z10 = z20;
                                                e0Var = e0Var2;
                                                bArr = (byte[]) ((d) e0Var.b).get(H2);
                                            }
                                            byte[] bArr4 = H != null ? null : (byte[]) ((d) e0Var.b).get(H);
                                            k3.k kVar6 = iVar.k;
                                            AtomicInteger atomicInteger2 = k.Y;
                                            Map map = Collections.EMPTY_MAP;
                                            Uri H3 = h5.a.H(str2, gVar.a);
                                            m0Var = m0Var2;
                                            long j26 = gVar.r;
                                            long j27 = gVar.s;
                                            int i16 = !z19 ? 8 : 0;
                                            h5.a.k(H3, "The uri must be set.");
                                            s8.n0 n0Var2 = s8.n0.h;
                                            g5.p pVar2 = new g5.p(H3, 1, null, n0Var2, j26, j27, null, i16);
                                            z11 = bArr == null;
                                            if (z11) {
                                                bArr2 = null;
                                            } else {
                                                String str4 = gVar.n;
                                                str4.getClass();
                                                bArr2 = k.e(str4);
                                            }
                                            if (bArr == null) {
                                                bArr2.getClass();
                                                mVar = new a(mVar4, bArr, bArr2);
                                            } else {
                                                mVar = mVar4;
                                            }
                                            fVar = gVar.b;
                                            if (fVar == null) {
                                                boolean z21 = bArr4 != null;
                                                if (z21) {
                                                    String str5 = fVar.n;
                                                    str5.getClass();
                                                    bArr3 = k.e(str5);
                                                } else {
                                                    bArr3 = null;
                                                }
                                                kVar2 = kVar6;
                                                Uri H4 = h5.a.H(str2, fVar.a);
                                                aiVar = aiVar2;
                                                uri2 = uri;
                                                long j28 = fVar.r;
                                                long j29 = fVar.s;
                                                h5.a.k(H4, "The uri must be set.");
                                                g5.p pVar3 = new g5.p(H4, 1, null, n0Var2, j28, j29, null, 0);
                                                if (bArr4 != null) {
                                                    bArr3.getClass();
                                                    mVar3 = new a(mVar4, bArr4, bArr3);
                                                } else {
                                                    mVar3 = mVar4;
                                                }
                                                mVar2 = mVar3;
                                                z12 = z21;
                                                pVar = pVar3;
                                            } else {
                                                kVar2 = kVar6;
                                                aiVar = aiVar2;
                                                uri2 = uri;
                                                pVar = null;
                                                mVar2 = null;
                                                z12 = false;
                                            }
                                            long j30 = j20 + j23;
                                            long j31 = j30 + gVar.c;
                                            int i17 = a10.j + gVar.d;
                                            if (kVar5 == null) {
                                                g5.p pVar4 = kVar5.D;
                                                boolean z22 = pVar == pVar4 || (pVar != null && pVar4 != null && pVar.a.equals(pVar4.a) && pVar.e == pVar4.e);
                                                uri3 = uri2;
                                                boolean z23 = uri3.equals(kVar5.x) && kVar5.U;
                                                iVar2 = kVar5.L;
                                                w wVar2 = kVar5.M;
                                                bVar = (z22 && z23 && !kVar5.W && kVar5.w == i17) ? kVar5.P : null;
                                                wVar = wVar2;
                                            } else {
                                                uri3 = uri2;
                                                iVar2 = new j4.i(null);
                                                wVar = new w(10);
                                                bVar = null;
                                            }
                                            j4.i iVar4 = iVar2;
                                            long j32 = hVar.b;
                                            int i18 = hVar.c;
                                            boolean z24 = !z19;
                                            boolean z25 = gVar.v;
                                            SparseArray sparseArray = (SparseArray) aiVar.b;
                                            c0Var = (c0) sparseArray.get(i17);
                                            if (c0Var == null) {
                                                c0Var = new c0(9223372036854775806L);
                                                sparseArray.put(i17, c0Var);
                                            }
                                            oVar2.b = new k(jVar, mVar, pVar2, n0Var, z11, mVar2, pVar, z12, uri3, list2, k10, j25, j30, j31, j32, i18, z24, i17, z25, z10, c0Var, gVar.f, bVar, iVar4, wVar, z4, kVar2);
                                            z13 = oVar2.a;
                                            q4.e eVar = (q4.e) oVar2.b;
                                            Uri uri5 = (Uri) oVar2.c;
                                            if (z13) {
                                                this.d0 = -9223372036854775807L;
                                                this.g0 = true;
                                                return true;
                                            }
                                            if (eVar == null) {
                                                if (uri5 == null) {
                                                    return false;
                                                }
                                                u4.b bVar2 = (u4.b) ((l) this.c.b).b.d.get(uri5);
                                                bVar2.c(bVar2.a);
                                                return false;
                                            }
                                            if (eVar instanceof k) {
                                                k kVar7 = (k) eVar;
                                                this.k0 = kVar7;
                                                this.S = kVar7.d;
                                                this.d0 = -9223372036854775807L;
                                                this.y.add(kVar7);
                                                s8.t tVar = s8.v.b;
                                                s8.l.c(4, "initialCapacity");
                                                Object[] objArr = new Object[4];
                                                q[] qVarArr = this.I;
                                                int length = qVarArr.length;
                                                int i19 = 0;
                                                boolean z26 = false;
                                                int i20 = 0;
                                                while (i20 < length) {
                                                    q qVar2 = qVarArr[i20];
                                                    Integer valueOf = Integer.valueOf(qVar2.q + qVar2.p);
                                                    int i21 = i19 + 1;
                                                    if (objArr.length < i21) {
                                                        objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i21));
                                                    } else if (z26) {
                                                        objArr = (Object[]) objArr.clone();
                                                    } else {
                                                        objArr[i19] = valueOf;
                                                        i20++;
                                                        i19++;
                                                    }
                                                    z26 = false;
                                                    objArr[i19] = valueOf;
                                                    i20++;
                                                    i19++;
                                                }
                                                i0 s6 = s8.v.s(i19, objArr);
                                                kVar7.Q = this;
                                                kVar7.V = s6;
                                                for (q qVar3 : this.I) {
                                                    qVar3.getClass();
                                                    qVar3.C = kVar7.v;
                                                    if (kVar7.y) {
                                                        qVar3.G = true;
                                                    }
                                                }
                                            }
                                            this.H = eVar;
                                            m0Var.f(eVar, this, this.r.n3(eVar.c));
                                            this.v.u(new o4.j(eVar.b), eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
                                            return true;
                                        }
                                    }
                                }
                                z4 = false;
                                if (z4) {
                                }
                                j jVar2 = iVar.a;
                                g5.m mVar42 = iVar.b;
                                j3.n0 n0Var3 = iVar.f[i11];
                                List list42 = iVar.i;
                                int k102 = iVar.q.k();
                                Object j252 = iVar.q.j();
                                boolean z202 = iVar.l;
                                ai aiVar22 = iVar.d;
                                if (H2 != null) {
                                }
                                if (H != null) {
                                }
                                k3.k kVar62 = iVar.k;
                                AtomicInteger atomicInteger22 = k.Y;
                                Map map2 = Collections.EMPTY_MAP;
                                Uri H32 = h5.a.H(str2, gVar.a);
                                m0Var = m0Var2;
                                long j262 = gVar.r;
                                long j272 = gVar.s;
                                if (!z19) {
                                }
                                h5.a.k(H32, "The uri must be set.");
                                s8.n0 n0Var22 = s8.n0.h;
                                g5.p pVar22 = new g5.p(H32, 1, null, n0Var22, j262, j272, null, i16);
                                if (bArr == null) {
                                }
                                if (z11) {
                                }
                                if (bArr == null) {
                                }
                                fVar = gVar.b;
                                if (fVar == null) {
                                }
                                long j302 = j20 + j23;
                                long j312 = j302 + gVar.c;
                                int i172 = a10.j + gVar.d;
                                if (kVar5 == null) {
                                }
                                j4.i iVar42 = iVar2;
                                long j322 = hVar.b;
                                int i182 = hVar.c;
                                boolean z242 = !z19;
                                boolean z252 = gVar.v;
                                SparseArray sparseArray2 = (SparseArray) aiVar.b;
                                c0Var = (c0) sparseArray2.get(i172);
                                if (c0Var == null) {
                                }
                                oVar2.b = new k(jVar2, mVar, pVar22, n0Var3, z11, mVar2, pVar, z12, uri3, list2, k102, j252, j302, j312, j322, i182, z242, i172, z252, z10, c0Var, gVar.f, bVar, iVar42, wVar, z4, kVar2);
                                z13 = oVar2.a;
                                q4.e eVar2 = (q4.e) oVar2.b;
                                Uri uri52 = (Uri) oVar2.c;
                                if (z13) {
                                }
                            }
                        }
                    }
                    hVar = null;
                    if (hVar == null) {
                    }
                    boolean z192 = hVar.d;
                    u4.g gVar2 = hVar.a;
                    iVar.s = false;
                    iVar.o = null;
                    u4.f fVar22 = gVar2.b;
                    long j232 = gVar2.e;
                    if (fVar22 != null) {
                    }
                    d = iVar.d(i11, H, true);
                    oVar2.b = d;
                    if (d == null) {
                    }
                } else {
                    u4.f fVar3 = (u4.f) vVar.get(i15);
                    if (i12 == -1) {
                        hVar = new h(fVar3, j21, -1);
                    } else if (i12 < fVar3.x.size()) {
                        hVar = new h((u4.g) fVar3.x.get(i12), j21, i12);
                    } else {
                        int i22 = i15 + 1;
                        if (i22 < vVar.size()) {
                            hVar = new h((u4.g) vVar.get(i22), j21 + 1, -1);
                        } else {
                            if (!vVar2.isEmpty()) {
                                hVar = new h((u4.g) vVar2.get(0), j21 + 1, 0);
                            }
                            hVar = null;
                        }
                    }
                    if (hVar == null) {
                    }
                    boolean z1922 = hVar.d;
                    u4.g gVar22 = hVar.a;
                    iVar.s = false;
                    iVar.o = null;
                    u4.f fVar222 = gVar22.b;
                    long j2322 = gVar22.e;
                    if (fVar222 != null) {
                    }
                    d = iVar.d(i11, H, true);
                    oVar2.b = d;
                    if (d == null) {
                    }
                }
            }
        } else {
            oVar2 = oVar;
            oVar2.c = uri4;
            iVar3.s &= uri4.equals(iVar3.o);
            iVar3.o = uri4;
        }
        m0Var = m0Var2;
        z13 = oVar2.a;
        q4.e eVar22 = (q4.e) oVar2.b;
        Uri uri522 = (Uri) oVar2.c;
        if (z13) {
        }
    }

    public final t0 p(s0[] s0VarArr) {
        for (int i10 = 0; i10 < s0VarArr.length; i10++) {
            s0 s0Var = s0VarArr[i10];
            j3.n0[] n0VarArr = new j3.n0[s0Var.a];
            for (int i11 = 0; i11 < s0Var.a; i11++) {
                j3.n0 n0Var = s0Var.d[i11];
                int b10 = this.h.b(n0Var);
                j3.m0 a2 = n0Var.a();
                a2.J = b10;
                n0VarArr[i11] = new j3.n0(a2);
            }
            s0VarArr[i10] = new s0(s0Var.b, n0VarArr);
        }
        return new t0(s0VarArr);
    }

    @Override // g5.h0
    public final c4.e q(g5.j0 j0Var, IOException iOException, int i10) {
        boolean z4;
        c4.e eVar;
        int i11;
        q4.e eVar2 = (q4.e) j0Var;
        boolean z10 = eVar2 instanceof k;
        if (z10 && !((k) eVar2).X && (iOException instanceof g5.e0) && ((i11 = ((g5.e0) iOException).d) == 410 || i11 == 404)) {
            return m0.d;
        }
        long j10 = eVar2.r.b;
        Uri uri = eVar2.r.c;
        o4.j jVar = new o4.j();
        d0.S(eVar2.h);
        d0.S(eVar2.n);
        p2.v vVar = new p2.v(iOException, i10, 4);
        i iVar = this.d;
        g0 a2 = k7.a(iVar.q);
        this.r.getClass();
        c4.e m32 = ab.a.m3(a2, vVar);
        if (m32 == null || m32.a != 2) {
            z4 = false;
        } else {
            long j11 = m32.b;
            f5.c cVar = iVar.q;
            z4 = cVar.d(cVar.m(iVar.h.a(eVar2.d)), j11);
        }
        if (z4) {
            if (z10 && j10 == 0) {
                ArrayList arrayList = this.y;
                h5.a.i(((k) e2.c.g(1, arrayList)) == eVar2);
                if (arrayList.isEmpty()) {
                    this.d0 = this.c0;
                } else {
                    ((k) s8.l.h(arrayList)).W = true;
                }
            }
            eVar = m0.e;
        } else {
            long o32 = ab.a.o3(vVar);
            eVar = o32 != -9223372036854775807L ? new c4.e(0, o32, false) : m0.f;
        }
        c4.e eVar3 = eVar;
        boolean a10 = eVar3.a();
        this.v.r(jVar, eVar2.c, this.b, eVar2.d, eVar2.e, eVar2.f, eVar2.h, eVar2.n, iOException, !a10);
        if (!a10) {
            this.H = null;
        }
        if (z4) {
            if (!this.Q) {
                m(this.c0);
                return eVar3;
            }
            this.c.s(this);
        }
        return eVar3;
    }

    @Override // o4.n0
    public final long r() {
        if (this.g0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.d0;
        }
        long j10 = this.c0;
        k w10 = w();
        if (!w10.U) {
            ArrayList arrayList = this.y;
            w10 = arrayList.size() > 1 ? (k) l.d.i(2, arrayList) : null;
        }
        if (w10 != null) {
            j10 = Math.max(j10, w10.n);
        }
        if (this.P) {
            for (q qVar : this.I) {
                j10 = Math.max(j10, qVar.n());
            }
        }
        return j10;
    }

    @Override // o4.n0
    public final void t(long j10) {
        m0 m0Var = this.s;
        if (m0Var.c() || z()) {
            return;
        }
        boolean d = m0Var.d();
        i iVar = this.d;
        List list = this.B;
        if (d) {
            this.H.getClass();
            if (iVar.n != null ? false : iVar.q.u(j10, this.H, list)) {
                m0Var.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            v(size);
        }
        int size2 = (iVar.n != null || iVar.q.p() < 2) ? list.size() : iVar.q.c(j10, list);
        if (size2 < this.y.size()) {
            v(size2);
        }
    }

    @Override // g5.h0
    public final void u(g5.j0 j0Var, long j10, long j11, boolean z4) {
        q4.e eVar = (q4.e) j0Var;
        this.H = null;
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        o4.j jVar = new o4.j();
        this.r.getClass();
        this.v.m(jVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z4) {
            return;
        }
        if (z() || this.R == 0) {
            D();
        }
        if (this.R > 0) {
            this.c.s(this);
        }
    }

    public final void v(int i10) {
        ArrayList arrayList;
        h5.a.i(!this.s.d());
        int i11 = i10;
        loop0: while (true) {
            arrayList = this.y;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            }
            int i12 = i11;
            while (true) {
                if (i12 >= arrayList.size()) {
                    k kVar = (k) arrayList.get(i11);
                    for (int i13 = 0; i13 < this.I.length; i13++) {
                        if (this.I[i13].q() > kVar.f(i13)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((k) arrayList.get(i12)).y) {
                    break;
                } else {
                    i12++;
                }
            }
            i11++;
        }
        if (i11 == -1) {
            return;
        }
        long j10 = w().n;
        k kVar2 = (k) arrayList.get(i11);
        d0.L(i11, arrayList.size(), arrayList);
        for (int i14 = 0; i14 < this.I.length; i14++) {
            this.I[i14].k(kVar2.f(i14));
        }
        if (arrayList.isEmpty()) {
            this.d0 = this.c0;
        } else {
            ((k) s8.l.h(arrayList)).W = true;
        }
        this.g0 = false;
        this.v.B(new o4.r(1, this.N, null, 3, null, d0.S(kVar2.h), d0.S(j10)));
    }

    public final k w() {
        return (k) l.d.i(1, this.y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g5.h0
    public final void x(g5.j0 j0Var, long j10, long j11) {
        q4.e eVar = (q4.e) j0Var;
        this.H = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.s;
            i iVar = this.d;
            iVar.m = bArr;
            org.telegram.ui.web.e0 e0Var = iVar.j;
            Uri uri = eVar2.b.a;
            byte[] bArr2 = eVar2.w;
            bArr2.getClass();
            d dVar = (d) e0Var.b;
            uri.getClass();
        }
        long j12 = eVar.a;
        Uri uri2 = eVar.r.c;
        o4.j jVar = new o4.j();
        this.r.getClass();
        this.v.p(jVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (this.Q) {
            this.c.s(this);
        } else {
            m(this.c0);
        }
    }

    public final boolean z() {
        return this.d0 != -9223372036854775807L;
    }

    @Override // r3.m
    public final void m2(r3.s sVar) {
    }
}
