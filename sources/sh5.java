// default package

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sh5 implements ga6, ka6, s6a, u84, gr9 {
    public static final Set q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final ph5 G;
    public final ph5 H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public ni2 L;
    public rh5[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public qh5 Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public go4 W;
    public go4 X;
    public boolean Y;
    public vzb Z;
    public final String a;
    public Set a0;
    public final byte b;
    public int[] b0;
    public final lj4 c;
    public int c0;
    public final qg5 d;
    public boolean d0;
    public final mx6 e;
    public boolean[] e0;
    public final go4 f;
    public boolean[] f0;
    public long g0;
    public final is3 h;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final fs3 n;
    public long n0;
    public as3 o0;
    public sg5 p0;
    public final k4f r;
    public final mx6 s;
    public final kq w;
    public final boolean x;
    public final ry y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [ph5] */
    /* JADX WARN: Type inference failed for: r2v14, types: [ph5] */
    public sh5(String str, int i, lj4 lj4Var, qg5 qg5Var, Map map, mx6 mx6Var, long j, go4 go4Var, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, int i2, g89 g89Var) {
        this.a = str;
        this.b = i;
        this.c = lj4Var;
        this.d = qg5Var;
        this.K = map;
        this.e = mx6Var;
        this.f = go4Var;
        this.h = is3Var;
        this.n = fs3Var;
        this.r = k4fVar;
        this.w = kqVar;
        this.x = i2;
        this.s = g89Var != null ? new mx6((Object) g89Var, (byte) 5) : new mx6("Loader:HlsSampleStreamWrapper");
        ry ryVar = new ry();
        ryVar.c = null;
        final byte b = 0;
        ryVar.b = false;
        ryVar.d = null;
        this.y = ryVar;
        this.N = new int[0];
        Set set = q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new rh5[0];
        this.f0 = new boolean[0];
        this.e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) { // from class: ph5
            public final /* synthetic */ sh5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                sh5 sh5Var = this.b;
                switch (b2) {
                    case 0:
                        sh5Var.A();
                        break;
                    default:
                        for (rh5 rh5Var : sh5Var.M) {
                            rh5Var.K(sh5Var.l0);
                        }
                        sh5Var.T = true;
                        sh5Var.A();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.H = new Runnable(this) { // from class: ph5
            public final /* synthetic */ sh5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                sh5 sh5Var = this.b;
                switch (b22) {
                    case 0:
                        sh5Var.A();
                        break;
                    default:
                        for (rh5 rh5Var : sh5Var.M) {
                            rh5Var.K(sh5Var.l0);
                        }
                        sh5Var.T = true;
                        sh5Var.A();
                        break;
                }
            }
        };
        this.I = hac.q(null);
        this.g0 = j;
        this.h0 = j;
        this.l0 = Long.MIN_VALUE;
    }

    public static ip3 m(int i, int i2) {
        ncd.f("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new ip3();
    }

    public static go4 u(go4 go4Var, go4 go4Var2, boolean z) {
        String b;
        if (go4Var == null) {
            return go4Var2;
        }
        String str = go4Var.l;
        String str2 = go4Var2.t;
        int h = wf7.h(str2);
        if (hac.v(h, str) == 1) {
            b = hac.w(h, str);
            str2 = wf7.d(b);
        } else {
            b = wf7.b(str, str2);
        }
        go4Var2.o = go4Var.o;
        go4Var2.p = go4Var.p;
        go4Var2.q = go4Var.q;
        go4Var2.r = go4Var.r;
        fo4 a = go4Var2.a();
        a.a = go4Var.a;
        a.b = go4Var.b;
        a.c = mo5.q(go4Var.c);
        a.d = go4Var.d;
        a.e = go4Var.e;
        a.f = go4Var.f;
        a.i = z ? go4Var.i : -1;
        a.j = z ? go4Var.j : -1;
        a.k = b;
        a.q = go4Var.q;
        a.o = go4Var.p;
        a.n = go4Var.o;
        a.p = go4Var.r;
        if (h == 2) {
            a.z = go4Var.A;
            a.A = go4Var.B;
            a.a(go4Var.F);
        }
        if (str2 != null) {
            a.s = wf7.n(str2);
        }
        int i = go4Var.N;
        if (i != -1 && h == 1) {
            a.M = i;
        }
        nf7 nf7Var = go4Var.m;
        if (nf7Var != null) {
            nf7 nf7Var2 = go4Var2.m;
            if (nf7Var2 != null) {
                nf7Var = nf7Var2.b(nf7Var);
            }
            a.l = nf7Var;
        }
        return new go4(a);
    }

    public static int y(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        int i;
        if (!this.Y && this.b0 == null && this.T) {
            int i2 = 0;
            for (rh5 rh5Var : this.M) {
                if (rh5Var.y() == null) {
                    return;
                }
            }
            vzb vzbVar = this.Z;
            if (vzbVar != null) {
                int i3 = vzbVar.a;
                int[] iArr = new int[i3];
                this.b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        rh5[] rh5VarArr = this.M;
                        if (i5 < rh5VarArr.length) {
                            go4 y = rh5VarArr[i5].y();
                            y.getClass();
                            go4 go4Var = this.Z.a(i4).d[0];
                            String str = y.t;
                            String str2 = go4Var.t;
                            int h = wf7.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y.T == go4Var.T) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i5++;
                            } else if (h == wf7.h(str2)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.b0[i4] = i5;
                }
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((oh5) obj).b();
                }
                return;
            }
            int length = this.M.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                go4 y2 = this.M[i6].y();
                y2.getClass();
                String str3 = y2.t;
                if (wf7.m(str3)) {
                    i9 = 2;
                } else if (!wf7.i(str3)) {
                    i9 = wf7.l(str3) ? 3 : -2;
                }
                if (y(i9) > y(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            uzb uzbVar = this.d.i;
            int i10 = uzbVar.a;
            this.c0 = -1;
            this.b0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.b0[i11] = i11;
            }
            uzb[] uzbVarArr = new uzb[length];
            int i12 = 0;
            while (i12 < length) {
                go4 y3 = this.M[i12].y();
                y3.getClass();
                go4 go4Var2 = this.f;
                String str4 = this.a;
                if (i12 == i7) {
                    go4[] go4VarArr = new go4[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        go4 go4Var3 = uzbVar.d[i13];
                        if (i8 == 1 && go4Var2 != null) {
                            go4Var3 = go4Var3.d(go4Var2);
                        }
                        go4VarArr[i13] = i10 == 1 ? y3.d(go4Var3) : u(go4Var3, y3, true);
                    }
                    uzbVarArr[i12] = new uzb(str4, go4VarArr);
                    this.c0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !wf7.i(y3.t)) {
                        go4Var2 = null;
                    }
                    StringBuilder k = b10.k(str4, ":muxed:");
                    k.append(i12 < i7 ? i12 : i12 - 1);
                    String sb = k.toString();
                    i = 0;
                    fo4 a = u(go4Var2, y3, false).a();
                    a.m = str4;
                    uzbVarArr[i12] = new uzb(sb, new go4(a));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.Z = p(uzbVarArr);
            jte.p(this.a0 == null ? 1 : i14);
            this.a0 = Collections.EMPTY_SET;
            this.U = true;
            this.c.A();
        }
    }

    @Override // u84
    public final void B() {
        this.m0 = true;
        this.I.post(this.H);
    }

    public final void C() {
        this.s.d();
        qg5 qg5Var = this.d;
        ji0 ji0Var = qg5Var.o;
        if (ji0Var != null) {
            throw ji0Var;
        }
        Uri uri = qg5Var.p;
        if (uri == null || !uri.equals(qg5Var.q)) {
            return;
        }
        qg5Var.g.i(qg5Var.p);
    }

    public final void D(uzb[] uzbVarArr, int... iArr) {
        this.Z = p(uzbVarArr);
        this.a0 = new HashSet();
        for (int i : iArr) {
            this.a0.add(this.Z.a(i));
        }
        this.c0 = 0;
        this.I.post(new kg5(this.c, (byte) 1));
        this.U = true;
    }

    public final void E() {
        for (rh5 rh5Var : this.M) {
            rh5Var.G(this.i0);
        }
        this.i0 = false;
    }

    public final boolean F(long j, boolean z) {
        sg5 sg5Var;
        int i;
        boolean J;
        this.g0 = j;
        if (z()) {
            this.h0 = j;
            return true;
        }
        boolean z2 = this.d.r;
        ArrayList arrayList = this.E;
        if (z2) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sg5Var = (sg5) arrayList.get(i2);
                if (sg5Var.h == j) {
                    break;
                }
            }
        }
        sg5Var = null;
        if (this.T && !z && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (0; i < length; i + 1) {
                rh5 rh5Var = this.M[i];
                if (sg5Var != null) {
                    J = rh5Var.I(sg5Var.g(i));
                } else {
                    long g = g();
                    J = rh5Var.J(j, g == Long.MIN_VALUE || j < g);
                }
                i = (J || (!this.f0[i] && this.d0)) ? i + 1 : 0;
            }
            return false;
        }
        this.h0 = j;
        this.k0 = false;
        arrayList.clear();
        mx6 mx6Var = this.s;
        if (!mx6Var.Y()) {
            mx6Var.d = null;
            E();
            return true;
        }
        if (this.T) {
            for (rh5 rh5Var2 : this.M) {
                rh5Var2.l();
            }
        }
        mx6Var.v();
        return true;
    }

    @Override // ga6
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        ni2 ni2Var = (ni2) ja6Var;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        if (i != 0) {
            c0b c0bVar = ni2Var.r;
            da6Var.d = c0bVar.c;
            da6Var.e = c0bVar.d;
            da6Var.f = j2;
            da6Var.g = c0bVar.b;
        }
        this.w.u(new ea6(da6Var), ni2Var.c, this.b, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, i);
    }

    @Override // gr9
    public final void a() {
        this.I.post(this.G);
    }

    @Override // ka6
    public final void b() {
        for (rh5 rh5Var : this.M) {
            rh5Var.G(true);
            cs3 cs3Var = rh5Var.h;
            if (cs3Var != null) {
                cs3Var.c(rh5Var.e);
                rh5Var.h = null;
                rh5Var.g = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [rh5[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rh5[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [yzb] */
    /* JADX WARN: Type inference failed for: r5v4, types: [hr9, rh5] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ip3] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // u84
    public final yzb c0(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set set = q0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            jte.f(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.N[i3] = i;
                }
                r5 = this.N[i3] == i ? this.M[i3] : m(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.M;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.N[i4] == i) {
                    r5 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (r5 == 0) {
            if (this.m0) {
                return m(i, i2);
            }
            int length = this.M.length;
            boolean z = i2 == 1 || i2 == 2;
            r5 = new rh5(this.e, this.h, this.n, this.K);
            r5.t = this.g0;
            if (z) {
                r5.L = this.o0;
                r5.C = true;
            }
            long j = this.n0;
            if (r5.I != j) {
                r5.I = j;
                r5.C = true;
            }
            if (this.p0 != null) {
                r5.F = r6.w;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i5);
            this.N = copyOf;
            copyOf[length] = i;
            rh5[] rh5VarArr = this.M;
            String str = hac.a;
            ?? copyOf2 = Arrays.copyOf(rh5VarArr, rh5VarArr.length + 1);
            copyOf2[rh5VarArr.length] = r5;
            this.M = (rh5[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f0, i5);
            this.f0 = copyOf3;
            copyOf3[length] = z;
            this.d0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (y(i2) > y(this.R)) {
                this.S = length;
                this.R = i2;
            }
            this.e0 = Arrays.copyOf(this.e0, i5);
        }
        if (i2 != 5) {
            return r5;
        }
        qh5 qh5Var = this.Q;
        if (qh5Var != null) {
            return qh5Var;
        }
        qh5 qh5Var2 = new qh5(r5, this.x ? 1 : 0);
        this.Q = qh5Var2;
        return qh5Var2;
    }

    public final void d() {
        jte.p(this.U);
        this.Z.getClass();
        this.a0.getClass();
    }

    @Override // s6a
    public final boolean f() {
        return this.s.Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    @Override // ga6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        ba6 ba6Var;
        boolean z;
        long j3;
        boolean a;
        boolean z2;
        int v;
        ha6 ha6Var;
        boolean a2;
        int i2;
        ni2 ni2Var = (ni2) ja6Var;
        qg5 qg5Var = this.d;
        rg5 rg5Var = qg5Var.h;
        boolean z3 = ni2Var instanceof sg5;
        if (z3 && !((sg5) ni2Var).h() && (iOException instanceof ki5) && ((i2 = ((ki5) iOException).c) == 410 || i2 == 404)) {
            return mx6.x;
        }
        long j4 = ni2Var.r.b;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = j4;
        ea6 ea6Var = new ea6(da6Var);
        hac.i0(ni2Var.h);
        hac.i0(ni2Var.n);
        de deVar = new de((Object) iOException, i, (byte) 8);
        boolean z4 = ni2Var instanceof sg5;
        if (z4) {
            ba6Var = qg5Var.a(((sg5) ni2Var).y);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int length = qg5Var.s.length();
            boolean z5 = rg5Var != null && rg5Var.k;
            ba6Var = new ba6(z5, 1, 0, length, qg5Var.d(elapsedRealtime, z5));
        }
        this.r.getClass();
        ca6 u3 = k4f.u3(ba6Var, deVar);
        if (u3 != null) {
            byte b = u3.a;
            if (rg5Var == null || !rg5Var.k) {
                rg5Var = null;
            }
            int i3 = u3.b;
            z = z3;
            j3 = j4;
            long j5 = i3;
            if (b == 1) {
                if (rg5Var != null) {
                    qg5Var.s.f();
                    a = rg5Var.a(j5);
                } else if (z4) {
                    fc3 fc3Var = qg5Var.g;
                    Uri uri = ((sg5) ni2Var).y;
                    ec3 ec3Var = (ec3) fc3Var.d.get(uri);
                    a = ec3Var != null ? ec3Var.a(j5, uri, null) : false;
                }
                z2 = a;
            } else {
                if (b != 2) {
                    dq9.m(hg9.j(b, "Invalid fallback selection type: "));
                    return null;
                }
                int a3 = qg5Var.i.a(ni2Var.d);
                if (a3 != -1 && (v = qg5Var.s.v(a3)) != -1) {
                    a = qg5Var.s.q(v, j5);
                    z2 = a;
                }
            }
            if (z2) {
                long w3 = k4f.w3(deVar);
                ha6Var = w3 != -9223372036854775807L ? new ha6(0, w3) : mx6.E;
            } else {
                if (z && j3 == 0) {
                    ArrayList arrayList = this.E;
                    jte.p(((sg5) td4.m(1, arrayList)) == ni2Var);
                    if (arrayList.isEmpty()) {
                        this.h0 = this.g0;
                    } else {
                        ((sg5) lne.b(arrayList)).a0 = true;
                    }
                }
                ha6Var = mx6.y;
            }
            ha6 ha6Var2 = ha6Var;
            a2 = ha6Var2.a();
            this.w.r(ea6Var, ni2Var.c, this.b, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, iOException, !a2);
            if (!a2) {
                this.L = null;
            }
            if (z2) {
                if (!this.U) {
                    ra6 ra6Var = new ra6();
                    ra6Var.a = this.g0;
                    r(new sa6(ra6Var));
                    return ha6Var2;
                }
                this.c.b(this);
            }
            return ha6Var2;
        }
        z = z3;
        j3 = j4;
        z2 = false;
        if (z2) {
        }
        ha6 ha6Var22 = ha6Var;
        a2 = ha6Var22.a();
        this.w.r(ea6Var, ni2Var.c, this.b, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, iOException, !a2);
        if (!a2) {
        }
        if (z2) {
        }
        return ha6Var22;
    }

    @Override // s6a
    public final long g() {
        if (z()) {
            return this.h0;
        }
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        return x().n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ga6
    public final void g0(ja6 ja6Var, long j, long j2) {
        ni2 ni2Var = (ni2) ja6Var;
        this.L = null;
        if (ni2Var instanceof mg5) {
            mg5 mg5Var = (mg5) ni2Var;
            byte[] bArr = mg5Var.s;
            qg5 qg5Var = this.d;
            qg5Var.n = bArr;
            k44 k44Var = qg5Var.k;
            Uri uri = mg5Var.b.a;
            byte[] bArr2 = mg5Var.x;
            bArr2.getClass();
            or4 or4Var = (or4) k44Var.b;
            uri.getClass();
        }
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.r.getClass();
        this.w.q(ea6Var, ni2Var.c, this.b, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n);
        if (this.U) {
            this.c.b(this);
            return;
        }
        ra6 ra6Var = new ra6();
        ra6Var.a = this.g0;
        r(new sa6(ra6Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.E;
            if (i2 >= arrayList.size()) {
                sg5 sg5Var = (sg5) arrayList.get(i);
                for (int i3 = 0; i3 < this.M.length; i3++) {
                    if (this.M[i3].v() <= sg5Var.g(i3)) {
                    }
                }
                return true;
            }
            if (((sg5) arrayList.get(i2)).c0) {
                break;
            }
            i2++;
        }
    }

    public final vzb p(uzb[] uzbVarArr) {
        for (int i = 0; i < uzbVarArr.length; i++) {
            uzb uzbVar = uzbVarArr[i];
            go4[] go4VarArr = new go4[uzbVar.a];
            for (int i2 = 0; i2 < uzbVar.a; i2++) {
                go4 go4Var = uzbVar.d[i2];
                int x = this.h.x(go4Var);
                fo4 a = go4Var.a();
                a.W = x;
                go4VarArr[i2] = new go4(a);
            }
            uzbVarArr[i] = new uzb(uzbVar.b, go4VarArr);
        }
        return new vzb(uzbVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x049d  */
    @Override // s6a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(sa6 sa6Var) {
        long max;
        long j;
        List list;
        long j2;
        int a;
        sa6 sa6Var2;
        or4 or4Var;
        long j3;
        qg5 qg5Var;
        boolean z;
        Uri b;
        long j4;
        qg5 qg5Var2;
        sg5 sg5Var;
        long j5;
        ry ryVar;
        boolean z2;
        byte[] bArr;
        mx6 mx6Var;
        boolean z3;
        byte[] bArr2;
        a83 a83Var;
        zg5 zg5Var;
        we8 we8Var;
        g83 g83Var;
        a83 a83Var2;
        boolean z4;
        sl5 sl5Var;
        yw7 yw7Var;
        p41 p41Var;
        vqb vqbVar;
        byte[] bArr3;
        a83 a83Var3;
        String str;
        ec3 ec3Var;
        pg5 f;
        boolean z5;
        ni2 ni2Var;
        boolean z6;
        long j6;
        ec3 ec3Var2;
        if (!this.k0) {
            mx6 mx6Var2 = this.s;
            if (!mx6Var2.Y() && !mx6Var2.U()) {
                if (z()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.h0;
                    for (rh5 rh5Var : this.M) {
                        rh5Var.t = this.h0;
                    }
                    list = list2;
                    j = max;
                } else {
                    sg5 x = x();
                    boolean z7 = x.Y;
                    long j7 = x.h;
                    if (z7 && x.h()) {
                        long j8 = x.b0;
                        max = j8 != -9223372036854775807L ? j7 + j8 : -9223372036854775807L;
                    } else {
                        max = Math.max(this.g0, j7);
                    }
                    long j9 = this.g0;
                    boolean z8 = this.T;
                    List list3 = this.F;
                    if (z8) {
                        for (rh5 rh5Var2 : this.M) {
                            j9 = Math.max(j9, rh5Var2.t());
                        }
                    }
                    j = j9;
                    list = list3;
                }
                ry ryVar2 = this.y;
                ryVar2.c = null;
                ryVar2.b = false;
                ryVar2.d = null;
                boolean z9 = this.U || !list.isEmpty();
                qg5 qg5Var3 = this.d;
                or4 or4Var2 = (or4) qg5Var3.k.b;
                nh5[] nh5VarArr = qg5Var3.e;
                fc3 fc3Var = qg5Var3.g;
                sg5 sg5Var2 = list.isEmpty() ? null : (sg5) lne.b(list);
                if (sg5Var2 == null) {
                    j2 = -9223372036854775807L;
                    a = -1;
                    or4Var = or4Var2;
                    sa6Var2 = sa6Var;
                } else {
                    j2 = -9223372036854775807L;
                    a = qg5Var3.i.a(sg5Var2.d);
                    sa6Var2 = sa6Var;
                    or4Var = or4Var2;
                }
                long j10 = sa6Var2.a;
                long j11 = max - j10;
                long j12 = qg5Var3.t;
                long j13 = j12 != j2 ? j12 - j10 : j2;
                if (sg5Var2 == null || qg5Var3.r) {
                    j3 = j13;
                    qg5Var = qg5Var3;
                } else {
                    qg5Var = qg5Var3;
                    j3 = j13;
                    long j14 = sg5Var2.n - sg5Var2.h;
                    j11 = Math.max(0L, j11 - j14);
                    if (j3 != j2) {
                        j3 = Math.max(0L, j3 - j14);
                    }
                }
                em6[] b2 = qg5Var.b(sg5Var2, max);
                if (a != -1) {
                    t74 t74Var = qg5Var.s;
                    if (t74Var.a(t74Var.v(a), SystemClock.elapsedRealtime())) {
                        z = true;
                        long j15 = max;
                        sg5 sg5Var3 = sg5Var2;
                        qg5Var.s.b(j10, j11, j3, list, b2);
                        int n = qg5Var.s.n();
                        boolean z10 = a == n;
                        b = nh5VarArr[n].b();
                        rg5 rg5Var = qg5Var.h;
                        String str2 = (rg5Var == null && rg5Var.k) ? nh5VarArr[n].d : null;
                        if (fc3Var.g(b)) {
                            ryVar2.d = b;
                            qg5Var.q = b;
                            mx6Var = mx6Var2;
                            ryVar = ryVar2;
                        } else {
                            ch5 b3 = fc3Var.b(b, true);
                            b3.getClass();
                            long j16 = b3.h;
                            qg5Var.r = b3.c;
                            qg5Var.t = b3.o ? j2 : (j16 + b3.u) - fc3Var.M;
                            long j17 = j16 - fc3Var.M;
                            or4 or4Var3 = or4Var;
                            qg5 qg5Var4 = qg5Var;
                            Pair e = qg5Var4.e(sg5Var3, z10, b3, j17, j15);
                            boolean z11 = z;
                            long longValue = ((Long) e.first).longValue();
                            int intValue = ((Integer) e.second).intValue();
                            if (!z10 || z11 || sg5Var3 == null) {
                                j4 = j17;
                            } else {
                                j4 = j17;
                                if (longValue < b3.k || ((f = qg5.f(b3, longValue, intValue)) != null && j4 + f.a.e < j)) {
                                    b = nh5VarArr[a].b();
                                    b3 = fc3Var.b(b, true);
                                    b3.getClass();
                                    long j18 = b3.h - fc3Var.M;
                                    Pair e2 = qg5Var4.e(sg5Var3, false, b3, j18, j15);
                                    sg5Var = sg5Var3;
                                    long longValue2 = ((Long) e2.first).longValue();
                                    intValue = ((Integer) e2.second).intValue();
                                    n = a;
                                    j4 = j18;
                                    qg5Var2 = qg5Var4;
                                    longValue = longValue2;
                                    String str3 = b3.a;
                                    boolean z12 = b3.c;
                                    j5 = b3.k;
                                    mo5 mo5Var = b3.r;
                                    if (n != a && a != -1) {
                                        Uri b4 = nh5VarArr[a].b();
                                        ec3Var = (ec3) fc3Var.d.get(b4);
                                        if (ec3Var != null) {
                                            HashMap hashMap = ec3Var.b;
                                            jte.p(hashMap.containsKey(b4));
                                            dc3 dc3Var = (dc3) hashMap.get(b4);
                                            dc3Var.getClass();
                                            dc3Var.x = false;
                                        }
                                    }
                                    if (longValue >= j5) {
                                        qg5Var2.o = new ji0();
                                        mx6Var = mx6Var2;
                                        ryVar = ryVar2;
                                    } else {
                                        pg5 f2 = qg5.f(b3, longValue, intValue);
                                        if (f2 == null) {
                                            ryVar = ryVar2;
                                            if (!b3.o) {
                                                ryVar.d = b;
                                                qg5Var2.q = b;
                                            } else if (z9 || mo5Var.isEmpty()) {
                                                ryVar.b = true;
                                            } else {
                                                f2 = new pg5((ah5) lne.b(mo5Var), (j5 + mo5Var.size()) - 1, -1);
                                            }
                                            mx6Var = mx6Var2;
                                        } else {
                                            ryVar = ryVar2;
                                        }
                                        boolean z13 = f2.d;
                                        ah5 ah5Var = f2.a;
                                        qg5Var2.q = null;
                                        SystemClock.elapsedRealtime();
                                        zg5 zg5Var2 = ah5Var.b;
                                        long j19 = ah5Var.e;
                                        Uri d = (zg5Var2 == null || (str = zg5Var2.h) == null) ? null : lze.d(str3, str);
                                        mg5 g = qg5Var2.g(d, n, true);
                                        ryVar.c = g;
                                        if (g == null) {
                                            String str4 = ah5Var.h;
                                            Uri d2 = str4 == null ? null : lze.d(str3, str4);
                                            mg5 g2 = qg5Var2.g(d2, n, false);
                                            ryVar.c = g2;
                                            if (g2 == null) {
                                                boolean z14 = ah5Var instanceof xg5 ? ((xg5) ah5Var).x || (f2.c == 0 && z12) : z12;
                                                if (sg5Var == null) {
                                                    AtomicInteger atomicInteger = sg5.d0;
                                                } else if (!b.equals(sg5Var.y) || !sg5Var.Y) {
                                                    long j20 = j4 + j19;
                                                    if (!z14 || j20 < j15) {
                                                        z2 = true;
                                                        if (z2 || !z13) {
                                                            bc3 bc3Var = qg5Var2.a;
                                                            a83 a83Var4 = qg5Var2.b;
                                                            go4 go4Var = qg5Var2.f[n];
                                                            List list4 = qg5Var2.j;
                                                            int p = qg5Var2.s.p();
                                                            Object s = qg5Var2.s.s();
                                                            boolean z15 = qg5Var2.m;
                                                            et8 et8Var = qg5Var2.d;
                                                            bArr = d2 != null ? null : (byte[]) or4Var3.get(d2);
                                                            byte[] bArr4 = d != null ? null : (byte[]) or4Var3.get(d);
                                                            we8 we8Var2 = qg5Var2.l;
                                                            AtomicInteger atomicInteger2 = sg5.d0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri d3 = lze.d(str3, ah5Var.a);
                                                            mx6Var = mx6Var2;
                                                            long j21 = ah5Var.r;
                                                            long j22 = ah5Var.s;
                                                            int i = !z13 ? 8 : 0;
                                                            jte.l(d3, "The uri must be set.");
                                                            g83 g83Var2 = new g83(d3, 1, null, map, j21, j22, null, i);
                                                            z3 = bArr == null;
                                                            if (z3) {
                                                                bArr2 = null;
                                                            } else {
                                                                String str5 = ah5Var.n;
                                                                str5.getClass();
                                                                bArr2 = sg5.f(str5);
                                                            }
                                                            if (bArr == null) {
                                                                bArr2.getClass();
                                                                a83Var = new mb(a83Var4, bArr, bArr2);
                                                            } else {
                                                                a83Var = a83Var4;
                                                            }
                                                            zg5Var = ah5Var.b;
                                                            if (zg5Var == null) {
                                                                boolean z16 = bArr4 != null;
                                                                if (z16) {
                                                                    String str6 = zg5Var.n;
                                                                    str6.getClass();
                                                                    bArr3 = sg5.f(str6);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z17 = z16;
                                                                Uri d4 = lze.d(str3, zg5Var.a);
                                                                we8Var = we8Var2;
                                                                long j23 = zg5Var.r;
                                                                long j24 = zg5Var.s;
                                                                jte.l(d4, "The uri must be set.");
                                                                g83 g83Var3 = new g83(d4, 1, null, map, j23, j24, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    a83Var3 = new mb(a83Var4, bArr4, bArr3);
                                                                } else {
                                                                    a83Var3 = a83Var4;
                                                                }
                                                                a83Var2 = a83Var3;
                                                                z4 = z17;
                                                                g83Var = g83Var3;
                                                            } else {
                                                                we8Var = we8Var2;
                                                                g83Var = null;
                                                                a83Var2 = null;
                                                                z4 = false;
                                                            }
                                                            long j25 = j4 + j19;
                                                            long j26 = j25 + ah5Var.c;
                                                            int i2 = b3.j + ah5Var.d;
                                                            if (sg5Var == null) {
                                                                g83 g83Var4 = sg5Var.H;
                                                                boolean z18 = g83Var == g83Var4 || (g83Var != null && g83Var4 != null && g83Var.a.equals(g83Var4.a) && g83Var.e == g83Var4.e);
                                                                boolean z19 = b.equals(sg5Var.y) && sg5Var.Y;
                                                                sl5Var = sg5Var.P;
                                                                yw7Var = sg5Var.Q;
                                                                p41Var = (z18 && z19 && !sg5Var.a0 && sg5Var.x == i2) ? sg5Var.T : null;
                                                            } else {
                                                                sl5Var = new sl5(null);
                                                                yw7Var = new yw7(10);
                                                                p41Var = null;
                                                            }
                                                            sl5 sl5Var2 = sl5Var;
                                                            yw7 yw7Var2 = yw7Var;
                                                            long j27 = f2.b;
                                                            int i3 = f2.c;
                                                            boolean z20 = !z13;
                                                            boolean z21 = ah5Var.w;
                                                            SparseArray sparseArray = (SparseArray) et8Var.b;
                                                            vqbVar = (vqb) sparseArray.get(i2);
                                                            if (vqbVar == null) {
                                                                vqbVar = new vqb(9223372036854775806L);
                                                                sparseArray.put(i2, vqbVar);
                                                            }
                                                            ryVar.c = new sg5(bc3Var, a83Var, g83Var2, go4Var, z3, a83Var2, g83Var, z4, b, list4, p, s, j25, j26, j27, i3, z20, i2, z21, z15, vqbVar, ah5Var.f, p41Var, sl5Var2, yw7Var2, z2, z14, we8Var, str2);
                                                        }
                                                    }
                                                }
                                                z2 = false;
                                                if (z2) {
                                                }
                                                bc3 bc3Var2 = qg5Var2.a;
                                                a83 a83Var42 = qg5Var2.b;
                                                go4 go4Var2 = qg5Var2.f[n];
                                                List list42 = qg5Var2.j;
                                                int p2 = qg5Var2.s.p();
                                                Object s2 = qg5Var2.s.s();
                                                boolean z152 = qg5Var2.m;
                                                et8 et8Var2 = qg5Var2.d;
                                                if (d2 != null) {
                                                }
                                                if (d != null) {
                                                }
                                                we8 we8Var22 = qg5Var2.l;
                                                AtomicInteger atomicInteger22 = sg5.d0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri d32 = lze.d(str3, ah5Var.a);
                                                mx6Var = mx6Var2;
                                                long j212 = ah5Var.r;
                                                long j222 = ah5Var.s;
                                                if (!z13) {
                                                }
                                                jte.l(d32, "The uri must be set.");
                                                g83 g83Var22 = new g83(d32, 1, null, map2, j212, j222, null, i);
                                                if (bArr == null) {
                                                }
                                                if (z3) {
                                                }
                                                if (bArr == null) {
                                                }
                                                zg5Var = ah5Var.b;
                                                if (zg5Var == null) {
                                                }
                                                long j252 = j4 + j19;
                                                long j262 = j252 + ah5Var.c;
                                                int i22 = b3.j + ah5Var.d;
                                                if (sg5Var == null) {
                                                }
                                                sl5 sl5Var22 = sl5Var;
                                                yw7 yw7Var22 = yw7Var;
                                                long j272 = f2.b;
                                                int i32 = f2.c;
                                                boolean z202 = !z13;
                                                boolean z212 = ah5Var.w;
                                                SparseArray sparseArray2 = (SparseArray) et8Var2.b;
                                                vqbVar = (vqb) sparseArray2.get(i22);
                                                if (vqbVar == null) {
                                                }
                                                ryVar.c = new sg5(bc3Var2, a83Var, g83Var22, go4Var2, z3, a83Var2, g83Var, z4, b, list42, p2, s2, j252, j262, j272, i32, z202, i22, z212, z152, vqbVar, ah5Var.f, p41Var, sl5Var22, yw7Var22, z2, z14, we8Var, str2);
                                            }
                                        }
                                        mx6Var = mx6Var2;
                                    }
                                }
                            }
                            sg5Var = sg5Var3;
                            qg5Var2 = qg5Var4;
                            String str32 = b3.a;
                            boolean z122 = b3.c;
                            j5 = b3.k;
                            mo5 mo5Var2 = b3.r;
                            if (n != a) {
                                Uri b42 = nh5VarArr[a].b();
                                ec3Var = (ec3) fc3Var.d.get(b42);
                                if (ec3Var != null) {
                                }
                            }
                            if (longValue >= j5) {
                            }
                        }
                        z5 = ryVar.b;
                        ni2Var = (ni2) ryVar.c;
                        Uri uri = (Uri) ryVar.d;
                        if (ni2Var != null) {
                            long j28 = this.l0;
                            if (j28 != Long.MIN_VALUE && ni2Var.h >= j28) {
                                z6 = true;
                                if (z5) {
                                    j6 = -9223372036854775807L;
                                } else {
                                    if (!z6) {
                                        if (ni2Var == null) {
                                            if (uri == null || (ec3Var2 = (ec3) ((tg5) this.c.a).b.d.get(uri)) == null) {
                                                return false;
                                            }
                                            ec3Var2.e(uri, true);
                                            return false;
                                        }
                                        if (ni2Var instanceof sg5) {
                                            sg5 sg5Var4 = (sg5) ni2Var;
                                            ArrayList arrayList = this.E;
                                            if (!arrayList.isEmpty()) {
                                                if (!x().h()) {
                                                    v(arrayList.size() - 1);
                                                }
                                                if (sg5Var4.E && sg5Var4.c0) {
                                                    int size = arrayList.size() - 1;
                                                    while (true) {
                                                        if (size < 0) {
                                                            break;
                                                        }
                                                        long j29 = ((sg5) arrayList.get(size)).h;
                                                        long j30 = sg5Var4.h;
                                                        if (j29 < j30) {
                                                            break;
                                                        }
                                                        if (j29 == j30 && i(size)) {
                                                            v(size);
                                                            sg5Var4.c0 = false;
                                                            break;
                                                        }
                                                        size--;
                                                    }
                                                }
                                            }
                                            this.p0 = sg5Var4;
                                            this.W = sg5Var4.d;
                                            this.h0 = j2;
                                            arrayList.add(sg5Var4);
                                            jo5 p3 = mo5.p();
                                            for (rh5 rh5Var3 : this.M) {
                                                p3.c(Integer.valueOf(rh5Var3.z()));
                                            }
                                            y79 f3 = p3.f();
                                            sg5Var4.U = this;
                                            sg5Var4.Z = f3;
                                            for (rh5 rh5Var4 : this.M) {
                                                rh5Var4.getClass();
                                                rh5Var4.F = sg5Var4.w;
                                                if (sg5Var4.c0) {
                                                    rh5Var4.J = true;
                                                }
                                            }
                                        }
                                        this.L = ni2Var;
                                        mx6Var.v0(ni2Var, this, this.r.v3(ni2Var.c));
                                        return true;
                                    }
                                    j6 = j2;
                                }
                                this.h0 = j6;
                                this.k0 = true;
                                return true;
                            }
                        }
                        z6 = false;
                        if (z5) {
                        }
                        this.h0 = j6;
                        this.k0 = true;
                        return true;
                    }
                }
                z = false;
                long j152 = max;
                sg5 sg5Var32 = sg5Var2;
                qg5Var.s.b(j10, j11, j3, list, b2);
                int n2 = qg5Var.s.n();
                if (a == n2) {
                }
                b = nh5VarArr[n2].b();
                rg5 rg5Var2 = qg5Var.h;
                if (rg5Var2 == null) {
                }
                if (fc3Var.g(b)) {
                }
                z5 = ryVar.b;
                ni2Var = (ni2) ryVar.c;
                Uri uri2 = (Uri) ryVar.d;
                if (ni2Var != null) {
                }
                z6 = false;
                if (z5) {
                }
                this.h0 = j6;
                this.k0 = true;
                return true;
            }
        }
        return false;
    }

    @Override // s6a
    public final long s() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.h0;
        }
        long j = this.g0;
        sg5 x = x();
        if (!x.Y) {
            ArrayList arrayList = this.E;
            x = arrayList.size() > 1 ? (sg5) b10.f(2, arrayList) : null;
        }
        if (x != null) {
            j = Math.max(j, x.n);
        }
        if (this.T) {
            for (rh5 rh5Var : this.M) {
                j = Math.max(j, rh5Var.s());
            }
        }
        return j;
    }

    @Override // s6a
    public final void t(long j) {
        mx6 mx6Var = this.s;
        if (mx6Var.U() || z()) {
            return;
        }
        boolean Y = mx6Var.Y();
        qg5 qg5Var = this.d;
        ArrayList arrayList = this.E;
        List list = this.F;
        if (Y) {
            ni2 ni2Var = this.L;
            ni2Var.getClass();
            if (!(ni2Var instanceof sg5) || i(arrayList.size() - 1)) {
                long j2 = this.l0;
                if (j2 == Long.MIN_VALUE || ni2Var.h < j2) {
                    if (!(qg5Var.o == null ? qg5Var.s.g(j, ni2Var, list) : false)) {
                        return;
                    }
                }
                mx6Var.v();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && qg5Var.c((sg5) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            v(size);
        }
        int min = Math.min(arrayList.size(), (qg5Var.o != null || qg5Var.s.length() < 2) ? list.size() : qg5Var.s.l(j, list));
        if (this.l0 != Long.MIN_VALUE) {
            while (min > 0 && ((sg5) arrayList.get(min - 1)).h >= this.l0) {
                min--;
                r2 = true;
            }
        }
        if (min < arrayList.size()) {
            v(min);
        }
        if (r2) {
            this.h0 = -9223372036854775807L;
            this.k0 = true;
        }
    }

    public final void v(int i) {
        ArrayList arrayList;
        jte.p(!this.s.Y());
        while (true) {
            arrayList = this.E;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (i(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = x().n;
        sg5 sg5Var = (sg5) arrayList.get(i);
        hac.Y(i, arrayList.size(), arrayList);
        for (int i2 = 0; i2 < this.M.length; i2++) {
            this.M[i2].o(sg5Var.g(i2));
        }
        if (arrayList.isEmpty()) {
            this.h0 = Math.max(this.g0, sg5Var.h);
        } else {
            ((sg5) lne.b(arrayList)).a0 = true;
        }
        this.k0 = false;
        this.w.A(sg5Var.h, this.R, j);
    }

    @Override // ga6
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        ni2 ni2Var = (ni2) ja6Var;
        this.L = null;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.r.getClass();
        this.w.o(ea6Var, ni2Var.c, this.b, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n);
        if (z) {
            return;
        }
        if (z() || this.V == 0) {
            E();
        }
        if (this.V > 0) {
            this.c.b(this);
        }
    }

    public final sg5 x() {
        return (sg5) b10.f(1, this.E);
    }

    public final boolean z() {
        return this.h0 != -9223372036854775807L;
    }

    @Override // u84
    public final void f0(ix9 ix9Var) {
    }
}
