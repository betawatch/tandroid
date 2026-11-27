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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vh5 implements la6, pa6, i8a, g84, xs9 {
    public static final Set q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final sh5 G;
    public final sh5 H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public rh2 L;
    public uh5[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public th5 Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public ko4 W;
    public ko4 X;
    public boolean Y;
    public u1c Z;
    public final String a;
    public Set a0;
    public final byte b;
    public int[] b0;
    public final kj4 c;
    public int c0;
    public final sg5 d;
    public boolean d0;
    public final rx6 e;
    public boolean[] e0;
    public final ko4 f;
    public boolean[] f0;
    public long g0;
    public final pr3 h;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final mr3 n;
    public long n0;
    public hr3 o0;
    public vg5 p0;
    public final z6f r;
    public final rx6 s;
    public final lp w;
    public final boolean x;
    public final rx y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [sh5] */
    /* JADX WARN: Type inference failed for: r2v14, types: [sh5] */
    public vh5(String str, int i, kj4 kj4Var, sg5 sg5Var, Map map, rx6 rx6Var, long j, ko4 ko4Var, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, int i2, r99 r99Var) {
        this.a = str;
        this.b = i;
        this.c = kj4Var;
        this.d = sg5Var;
        this.K = map;
        this.e = rx6Var;
        this.f = ko4Var;
        this.h = pr3Var;
        this.n = mr3Var;
        this.r = z6fVar;
        this.w = lpVar;
        this.x = i2;
        this.s = r99Var != null ? new rx6((Object) r99Var, (byte) 5) : new rx6("Loader:HlsSampleStreamWrapper");
        rx rxVar = new rx();
        rxVar.c = null;
        final byte b = 0;
        rxVar.b = false;
        rxVar.d = null;
        this.y = rxVar;
        this.N = new int[0];
        Set set = q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new uh5[0];
        this.f0 = new boolean[0];
        this.e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) { // from class: sh5
            public final /* synthetic */ vh5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                vh5 vh5Var = this.b;
                switch (b2) {
                    case 0:
                        vh5Var.A();
                        break;
                    default:
                        for (uh5 uh5Var : vh5Var.M) {
                            uh5Var.K(vh5Var.l0);
                        }
                        vh5Var.T = true;
                        vh5Var.A();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.H = new Runnable(this) { // from class: sh5
            public final /* synthetic */ vh5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                vh5 vh5Var = this.b;
                switch (b22) {
                    case 0:
                        vh5Var.A();
                        break;
                    default:
                        for (uh5 uh5Var : vh5Var.M) {
                            uh5Var.K(vh5Var.l0);
                        }
                        vh5Var.T = true;
                        vh5Var.A();
                        break;
                }
            }
        };
        this.I = gcc.q(null);
        this.g0 = j;
        this.h0 = j;
        this.l0 = Long.MIN_VALUE;
    }

    public static po3 k(int i, int i2) {
        efd.f("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new po3();
    }

    public static ko4 v(ko4 ko4Var, ko4 ko4Var2, boolean z) {
        String b;
        if (ko4Var == null) {
            return ko4Var2;
        }
        String str = ko4Var.l;
        String str2 = ko4Var2.t;
        int h = eg7.h(str2);
        if (gcc.v(h, str) == 1) {
            b = gcc.w(h, str);
            str2 = eg7.d(b);
        } else {
            b = eg7.b(str, str2);
        }
        ko4Var2.o = ko4Var.o;
        ko4Var2.p = ko4Var.p;
        ko4Var2.q = ko4Var.q;
        ko4Var2.r = ko4Var.r;
        jo4 a = ko4Var2.a();
        a.a = ko4Var.a;
        a.b = ko4Var.b;
        a.c = po5.q(ko4Var.c);
        a.d = ko4Var.d;
        a.e = ko4Var.e;
        a.f = ko4Var.f;
        a.i = z ? ko4Var.i : -1;
        a.j = z ? ko4Var.j : -1;
        a.k = b;
        a.q = ko4Var.q;
        a.o = ko4Var.p;
        a.n = ko4Var.o;
        a.p = ko4Var.r;
        if (h == 2) {
            a.z = ko4Var.A;
            a.A = ko4Var.B;
            a.a(ko4Var.F);
        }
        if (str2 != null) {
            a.s = eg7.n(str2);
        }
        int i = ko4Var.N;
        if (i != -1 && h == 1) {
            a.M = i;
        }
        vf7 vf7Var = ko4Var.m;
        if (vf7Var != null) {
            vf7 vf7Var2 = ko4Var2.m;
            if (vf7Var2 != null) {
                vf7Var = vf7Var2.b(vf7Var);
            }
            a.l = vf7Var;
        }
        return new ko4(a);
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
            for (uh5 uh5Var : this.M) {
                if (uh5Var.y() == null) {
                    return;
                }
            }
            u1c u1cVar = this.Z;
            if (u1cVar != null) {
                int i3 = u1cVar.a;
                int[] iArr = new int[i3];
                this.b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        uh5[] uh5VarArr = this.M;
                        if (i5 < uh5VarArr.length) {
                            ko4 y = uh5VarArr[i5].y();
                            y.getClass();
                            ko4 ko4Var = this.Z.a(i4).d[0];
                            String str = y.t;
                            String str2 = ko4Var.t;
                            int h = eg7.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y.T == ko4Var.T) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i5++;
                            } else if (h == eg7.h(str2)) {
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
                    ((rh5) obj).b();
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
                ko4 y2 = this.M[i6].y();
                y2.getClass();
                String str3 = y2.t;
                if (eg7.m(str3)) {
                    i9 = 2;
                } else if (!eg7.i(str3)) {
                    i9 = eg7.l(str3) ? 3 : -2;
                }
                if (y(i9) > y(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            t1c t1cVar = this.d.i;
            int i10 = t1cVar.a;
            this.c0 = -1;
            this.b0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.b0[i11] = i11;
            }
            t1c[] t1cVarArr = new t1c[length];
            int i12 = 0;
            while (i12 < length) {
                ko4 y3 = this.M[i12].y();
                y3.getClass();
                ko4 ko4Var2 = this.f;
                String str4 = this.a;
                if (i12 == i7) {
                    ko4[] ko4VarArr = new ko4[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        ko4 ko4Var3 = t1cVar.d[i13];
                        if (i8 == 1 && ko4Var2 != null) {
                            ko4Var3 = ko4Var3.d(ko4Var2);
                        }
                        ko4VarArr[i13] = i10 == 1 ? y3.d(ko4Var3) : v(ko4Var3, y3, true);
                    }
                    t1cVarArr[i12] = new t1c(str4, ko4VarArr);
                    this.c0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !eg7.i(y3.t)) {
                        ko4Var2 = null;
                    }
                    StringBuilder l = c00.l(str4, ":muxed:");
                    l.append(i12 < i7 ? i12 : i12 - 1);
                    String sb = l.toString();
                    i = 0;
                    jo4 a = v(ko4Var2, y3, false).a();
                    a.m = str4;
                    t1cVarArr[i12] = new t1c(sb, new ko4(a));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.Z = o(t1cVarArr);
            yve.p(this.a0 == null ? 1 : i14);
            this.a0 = Collections.EMPTY_SET;
            this.U = true;
            this.c.Y();
        }
    }

    public final void B() {
        this.s.g();
        sg5 sg5Var = this.d;
        kh0 kh0Var = sg5Var.o;
        if (kh0Var != null) {
            throw kh0Var;
        }
        Uri uri = sg5Var.p;
        if (uri == null || !uri.equals(sg5Var.q)) {
            return;
        }
        sg5Var.g.j(sg5Var.p);
    }

    public final void C(t1c[] t1cVarArr, int... iArr) {
        this.Z = o(t1cVarArr);
        this.a0 = new HashSet();
        for (int i : iArr) {
            this.a0.add(this.Z.a(i));
        }
        this.c0 = 0;
        this.I.post(new ea5(this.c, (byte) 9));
        this.U = true;
    }

    @Override // g84
    public final void D() {
        this.m0 = true;
        this.I.post(this.H);
    }

    public final void E() {
        for (uh5 uh5Var : this.M) {
            uh5Var.G(this.i0);
        }
        this.i0 = false;
    }

    public final boolean F(long j, boolean z) {
        vg5 vg5Var;
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
                vg5Var = (vg5) arrayList.get(i2);
                if (vg5Var.h == j) {
                    break;
                }
            }
        }
        vg5Var = null;
        if (this.T && !z && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (0; i < length; i + 1) {
                uh5 uh5Var = this.M[i];
                if (vg5Var != null) {
                    J = uh5Var.I(vg5Var.g(i));
                } else {
                    long h = h();
                    J = uh5Var.J(j, h == Long.MIN_VALUE || j < h);
                }
                i = (J || (!this.f0[i] && this.d0)) ? i + 1 : 0;
            }
            return false;
        }
        this.h0 = j;
        this.k0 = false;
        arrayList.clear();
        rx6 rx6Var = this.s;
        if (!rx6Var.Z()) {
            rx6Var.d = null;
            E();
            return true;
        }
        if (this.T) {
            for (uh5 uh5Var2 : this.M) {
                uh5Var2.l();
            }
        }
        rx6Var.u();
        return true;
    }

    @Override // la6
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
        rh2 rh2Var = (rh2) oa6Var;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        if (i != 0) {
            b2b b2bVar = rh2Var.r;
            ia6Var.d = b2bVar.c;
            ia6Var.e = b2bVar.d;
            ia6Var.f = j2;
            ia6Var.g = b2bVar.b;
        }
        this.w.v(new ja6(ia6Var), rh2Var.c, this.b, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, i);
    }

    @Override // xs9
    public final void a() {
        this.I.post(this.G);
    }

    @Override // pa6
    public final void b() {
        for (uh5 uh5Var : this.M) {
            uh5Var.G(true);
            jr3 jr3Var = uh5Var.h;
            if (jr3Var != null) {
                jr3Var.c(uh5Var.e);
                uh5Var.h = null;
                uh5Var.g = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    @Override // la6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        ga6 ga6Var;
        boolean z;
        long j3;
        boolean a;
        boolean z2;
        int u;
        ma6 ma6Var;
        boolean a2;
        int i2;
        rh2 rh2Var = (rh2) oa6Var;
        sg5 sg5Var = this.d;
        ug5 ug5Var = sg5Var.h;
        boolean z3 = rh2Var instanceof vg5;
        if (z3 && !((vg5) rh2Var).h() && (iOException instanceof ni5) && ((i2 = ((ni5) iOException).c) == 410 || i2 == 404)) {
            return rx6.x;
        }
        long j4 = rh2Var.r.b;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = j4;
        ja6 ja6Var = new ja6(ia6Var);
        gcc.i0(rh2Var.h);
        gcc.i0(rh2Var.n);
        ed edVar = new ed((Object) iOException, i, (byte) 8);
        boolean z4 = rh2Var instanceof vg5;
        if (z4) {
            ga6Var = sg5Var.a(((vg5) rh2Var).y);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int length = sg5Var.s.length();
            boolean z5 = ug5Var != null && ug5Var.k;
            ga6Var = new ga6(z5, 1, 0, length, sg5Var.d(elapsedRealtime, z5));
        }
        this.r.getClass();
        ha6 u3 = z6f.u3(ga6Var, edVar);
        if (u3 != null) {
            byte b = u3.a;
            if (ug5Var == null || !ug5Var.k) {
                ug5Var = null;
            }
            int i3 = u3.b;
            z = z3;
            j3 = j4;
            long j5 = i3;
            if (b == 1) {
                if (ug5Var != null) {
                    sg5Var.s.f();
                    a = ug5Var.a(j5);
                } else if (z4) {
                    mb3 mb3Var = sg5Var.g;
                    Uri uri = ((vg5) rh2Var).y;
                    lb3 lb3Var = (lb3) mb3Var.d.get(uri);
                    a = lb3Var != null ? lb3Var.a(j5, uri, null) : false;
                }
                z2 = a;
            } else {
                if (b != 2) {
                    grb.i(uh9.k(b, "Invalid fallback selection type: "));
                    return null;
                }
                int a3 = sg5Var.i.a(rh2Var.d);
                if (a3 != -1 && (u = sg5Var.s.u(a3)) != -1) {
                    a = sg5Var.s.p(u, j5);
                    z2 = a;
                }
            }
            if (z2) {
                long w3 = z6f.w3(edVar);
                ma6Var = w3 != -9223372036854775807L ? new ma6(0, w3) : rx6.E;
            } else {
                if (z && j3 == 0) {
                    ArrayList arrayList = this.E;
                    yve.p(((vg5) qd4.l(1, arrayList)) == rh2Var);
                    if (arrayList.isEmpty()) {
                        this.h0 = this.g0;
                    } else {
                        ((vg5) dqe.b(arrayList)).a0 = true;
                    }
                }
                ma6Var = rx6.y;
            }
            ma6 ma6Var2 = ma6Var;
            a2 = ma6Var2.a();
            this.w.r(ja6Var, rh2Var.c, this.b, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, iOException, !a2);
            if (!a2) {
                this.L = null;
            }
            if (z2) {
                if (!this.U) {
                    wa6 wa6Var = new wa6();
                    wa6Var.a = this.g0;
                    s(new xa6(wa6Var));
                    return ma6Var2;
                }
                this.c.f(this);
            }
            return ma6Var2;
        }
        z = z3;
        j3 = j4;
        z2 = false;
        if (z2) {
        }
        ma6 ma6Var22 = ma6Var;
        a2 = ma6Var22.a();
        this.w.r(ja6Var, rh2Var.c, this.b, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, iOException, !a2);
        if (!a2) {
        }
        if (z2) {
        }
        return ma6Var22;
    }

    @Override // i8a
    public final boolean e() {
        return this.s.Z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [uh5[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [uh5[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [x1c] */
    /* JADX WARN: Type inference failed for: r5v4, types: [uh5, ys9] */
    /* JADX WARN: Type inference failed for: r5v6, types: [po3] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // g84
    public final x1c e0(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set set = q0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            yve.f(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.N[i3] = i;
                }
                r5 = this.N[i3] == i ? this.M[i3] : k(i, i2);
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
                return k(i, i2);
            }
            int length = this.M.length;
            boolean z = i2 == 1 || i2 == 2;
            r5 = new uh5(this.e, this.h, this.n, this.K);
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
            uh5[] uh5VarArr = this.M;
            String str = gcc.a;
            ?? copyOf2 = Arrays.copyOf(uh5VarArr, uh5VarArr.length + 1);
            copyOf2[uh5VarArr.length] = r5;
            this.M = (uh5[]) copyOf2;
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
        th5 th5Var = this.Q;
        if (th5Var != null) {
            return th5Var;
        }
        th5 th5Var2 = new th5(r5, this.x ? 1 : 0);
        this.Q = th5Var2;
        return th5Var2;
    }

    @Override // la6
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        rh2 rh2Var = (rh2) oa6Var;
        this.L = null;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.r.getClass();
        this.w.o(ja6Var, rh2Var.c, this.b, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n);
        if (z) {
            return;
        }
        if (z() || this.V == 0) {
            E();
        }
        if (this.V > 0) {
            this.c.f(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // la6
    public final void f0(oa6 oa6Var, long j, long j2) {
        rh2 rh2Var = (rh2) oa6Var;
        this.L = null;
        if (rh2Var instanceof og5) {
            og5 og5Var = (og5) rh2Var;
            byte[] bArr = og5Var.s;
            sg5 sg5Var = this.d;
            sg5Var.n = bArr;
            v34 v34Var = sg5Var.k;
            Uri uri = og5Var.b.a;
            byte[] bArr2 = og5Var.x;
            bArr2.getClass();
            rr4 rr4Var = (rr4) v34Var.b;
            uri.getClass();
        }
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.r.getClass();
        this.w.q(ja6Var, rh2Var.c, this.b, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n);
        if (this.U) {
            this.c.f(this);
            return;
        }
        wa6 wa6Var = new wa6();
        wa6Var.a = this.g0;
        s(new xa6(wa6Var));
    }

    public final void g() {
        yve.p(this.U);
        this.Z.getClass();
        this.a0.getClass();
    }

    @Override // i8a
    public final long h() {
        if (z()) {
            return this.h0;
        }
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        return x().n;
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
                vg5 vg5Var = (vg5) arrayList.get(i);
                for (int i3 = 0; i3 < this.M.length; i3++) {
                    if (this.M[i3].v() <= vg5Var.g(i3)) {
                    }
                }
                return true;
            }
            if (((vg5) arrayList.get(i2)).c0) {
                break;
            }
            i2++;
        }
    }

    public final u1c o(t1c[] t1cVarArr) {
        for (int i = 0; i < t1cVarArr.length; i++) {
            t1c t1cVar = t1cVarArr[i];
            ko4[] ko4VarArr = new ko4[t1cVar.a];
            for (int i2 = 0; i2 < t1cVar.a; i2++) {
                ko4 ko4Var = t1cVar.d[i2];
                int x = this.h.x(ko4Var);
                jo4 a = ko4Var.a();
                a.W = x;
                ko4VarArr[i2] = new ko4(a);
            }
            t1cVarArr[i] = new t1c(t1cVar.b, ko4VarArr);
        }
        return new u1c(t1cVarArr);
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
    @Override // i8a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(xa6 xa6Var) {
        long max;
        long j;
        List list;
        long j2;
        int a;
        xa6 xa6Var2;
        rr4 rr4Var;
        long j3;
        sg5 sg5Var;
        boolean z;
        Uri b;
        long j4;
        sg5 sg5Var2;
        vg5 vg5Var;
        long j5;
        rx rxVar;
        boolean z2;
        byte[] bArr;
        rx6 rx6Var;
        boolean z3;
        byte[] bArr2;
        h73 h73Var;
        ch5 ch5Var;
        ig8 ig8Var;
        n73 n73Var;
        h73 h73Var2;
        boolean z4;
        vl5 vl5Var;
        ey7 ey7Var;
        q31 q31Var;
        usb usbVar;
        byte[] bArr3;
        h73 h73Var3;
        String str;
        lb3 lb3Var;
        rg5 f;
        boolean z5;
        rh2 rh2Var;
        boolean z6;
        long j6;
        lb3 lb3Var2;
        if (!this.k0) {
            rx6 rx6Var2 = this.s;
            if (!rx6Var2.Z() && !rx6Var2.U()) {
                if (z()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.h0;
                    for (uh5 uh5Var : this.M) {
                        uh5Var.t = this.h0;
                    }
                    list = list2;
                    j = max;
                } else {
                    vg5 x = x();
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
                        for (uh5 uh5Var2 : this.M) {
                            j9 = Math.max(j9, uh5Var2.t());
                        }
                    }
                    j = j9;
                    list = list3;
                }
                rx rxVar2 = this.y;
                rxVar2.c = null;
                rxVar2.b = false;
                rxVar2.d = null;
                boolean z9 = this.U || !list.isEmpty();
                sg5 sg5Var3 = this.d;
                rr4 rr4Var2 = (rr4) sg5Var3.k.b;
                qh5[] qh5VarArr = sg5Var3.e;
                mb3 mb3Var = sg5Var3.g;
                vg5 vg5Var2 = list.isEmpty() ? null : (vg5) dqe.b(list);
                if (vg5Var2 == null) {
                    j2 = -9223372036854775807L;
                    a = -1;
                    rr4Var = rr4Var2;
                    xa6Var2 = xa6Var;
                } else {
                    j2 = -9223372036854775807L;
                    a = sg5Var3.i.a(vg5Var2.d);
                    xa6Var2 = xa6Var;
                    rr4Var = rr4Var2;
                }
                long j10 = xa6Var2.a;
                long j11 = max - j10;
                long j12 = sg5Var3.t;
                long j13 = j12 != j2 ? j12 - j10 : j2;
                if (vg5Var2 == null || sg5Var3.r) {
                    j3 = j13;
                    sg5Var = sg5Var3;
                } else {
                    sg5Var = sg5Var3;
                    j3 = j13;
                    long j14 = vg5Var2.n - vg5Var2.h;
                    j11 = Math.max(0L, j11 - j14);
                    if (j3 != j2) {
                        j3 = Math.max(0L, j3 - j14);
                    }
                }
                gm6[] b2 = sg5Var.b(vg5Var2, max);
                if (a != -1) {
                    e74 e74Var = sg5Var.s;
                    if (e74Var.a(e74Var.u(a), SystemClock.elapsedRealtime())) {
                        z = true;
                        long j15 = max;
                        vg5 vg5Var3 = vg5Var2;
                        sg5Var.s.b(j10, j11, j3, list, b2);
                        int m = sg5Var.s.m();
                        boolean z10 = a == m;
                        b = qh5VarArr[m].b();
                        ug5 ug5Var = sg5Var.h;
                        String str2 = (ug5Var == null && ug5Var.k) ? qh5VarArr[m].d : null;
                        if (mb3Var.h(b)) {
                            rxVar2.d = b;
                            sg5Var.q = b;
                            rx6Var = rx6Var2;
                            rxVar = rxVar2;
                        } else {
                            fh5 b3 = mb3Var.b(b, true);
                            b3.getClass();
                            long j16 = b3.h;
                            sg5Var.r = b3.c;
                            sg5Var.t = b3.o ? j2 : (j16 + b3.u) - mb3Var.M;
                            long j17 = j16 - mb3Var.M;
                            rr4 rr4Var3 = rr4Var;
                            sg5 sg5Var4 = sg5Var;
                            Pair e = sg5Var4.e(vg5Var3, z10, b3, j17, j15);
                            boolean z11 = z;
                            long longValue = ((Long) e.first).longValue();
                            int intValue = ((Integer) e.second).intValue();
                            if (!z10 || z11 || vg5Var3 == null) {
                                j4 = j17;
                            } else {
                                j4 = j17;
                                if (longValue < b3.k || ((f = sg5.f(b3, longValue, intValue)) != null && j4 + f.a.e < j)) {
                                    b = qh5VarArr[a].b();
                                    b3 = mb3Var.b(b, true);
                                    b3.getClass();
                                    long j18 = b3.h - mb3Var.M;
                                    Pair e2 = sg5Var4.e(vg5Var3, false, b3, j18, j15);
                                    vg5Var = vg5Var3;
                                    long longValue2 = ((Long) e2.first).longValue();
                                    intValue = ((Integer) e2.second).intValue();
                                    m = a;
                                    j4 = j18;
                                    sg5Var2 = sg5Var4;
                                    longValue = longValue2;
                                    String str3 = b3.a;
                                    boolean z12 = b3.c;
                                    j5 = b3.k;
                                    po5 po5Var = b3.r;
                                    if (m != a && a != -1) {
                                        Uri b4 = qh5VarArr[a].b();
                                        lb3Var = (lb3) mb3Var.d.get(b4);
                                        if (lb3Var != null) {
                                            HashMap hashMap = lb3Var.b;
                                            yve.p(hashMap.containsKey(b4));
                                            kb3 kb3Var = (kb3) hashMap.get(b4);
                                            kb3Var.getClass();
                                            kb3Var.x = false;
                                        }
                                    }
                                    if (longValue >= j5) {
                                        sg5Var2.o = new kh0();
                                        rx6Var = rx6Var2;
                                        rxVar = rxVar2;
                                    } else {
                                        rg5 f2 = sg5.f(b3, longValue, intValue);
                                        if (f2 == null) {
                                            rxVar = rxVar2;
                                            if (!b3.o) {
                                                rxVar.d = b;
                                                sg5Var2.q = b;
                                            } else if (z9 || po5Var.isEmpty()) {
                                                rxVar.b = true;
                                            } else {
                                                f2 = new rg5((dh5) dqe.b(po5Var), (j5 + po5Var.size()) - 1, -1);
                                            }
                                            rx6Var = rx6Var2;
                                        } else {
                                            rxVar = rxVar2;
                                        }
                                        boolean z13 = f2.d;
                                        dh5 dh5Var = f2.a;
                                        sg5Var2.q = null;
                                        SystemClock.elapsedRealtime();
                                        ch5 ch5Var2 = dh5Var.b;
                                        long j19 = dh5Var.e;
                                        Uri d = (ch5Var2 == null || (str = ch5Var2.h) == null) ? null : d2f.d(str3, str);
                                        og5 g = sg5Var2.g(d, m, true);
                                        rxVar.c = g;
                                        if (g == null) {
                                            String str4 = dh5Var.h;
                                            Uri d2 = str4 == null ? null : d2f.d(str3, str4);
                                            og5 g2 = sg5Var2.g(d2, m, false);
                                            rxVar.c = g2;
                                            if (g2 == null) {
                                                boolean z14 = dh5Var instanceof ah5 ? ((ah5) dh5Var).x || (f2.c == 0 && z12) : z12;
                                                if (vg5Var == null) {
                                                    AtomicInteger atomicInteger = vg5.d0;
                                                } else if (!b.equals(vg5Var.y) || !vg5Var.Y) {
                                                    long j20 = j4 + j19;
                                                    if (!z14 || j20 < j15) {
                                                        z2 = true;
                                                        if (z2 || !z13) {
                                                            ib3 ib3Var = sg5Var2.a;
                                                            h73 h73Var4 = sg5Var2.b;
                                                            ko4 ko4Var = sg5Var2.f[m];
                                                            List list4 = sg5Var2.j;
                                                            int o = sg5Var2.s.o();
                                                            Object r = sg5Var2.s.r();
                                                            boolean z15 = sg5Var2.m;
                                                            pq8 pq8Var = sg5Var2.d;
                                                            bArr = d2 != null ? null : (byte[]) rr4Var3.get(d2);
                                                            byte[] bArr4 = d != null ? null : (byte[]) rr4Var3.get(d);
                                                            ig8 ig8Var2 = sg5Var2.l;
                                                            AtomicInteger atomicInteger2 = vg5.d0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri d3 = d2f.d(str3, dh5Var.a);
                                                            rx6Var = rx6Var2;
                                                            long j21 = dh5Var.r;
                                                            long j22 = dh5Var.s;
                                                            int i = !z13 ? 8 : 0;
                                                            yve.l(d3, "The uri must be set.");
                                                            n73 n73Var2 = new n73(d3, 1, null, map, j21, j22, null, i);
                                                            z3 = bArr == null;
                                                            if (z3) {
                                                                bArr2 = null;
                                                            } else {
                                                                String str5 = dh5Var.n;
                                                                str5.getClass();
                                                                bArr2 = vg5.f(str5);
                                                            }
                                                            if (bArr == null) {
                                                                bArr2.getClass();
                                                                h73Var = new nb(h73Var4, bArr, bArr2);
                                                            } else {
                                                                h73Var = h73Var4;
                                                            }
                                                            ch5Var = dh5Var.b;
                                                            if (ch5Var == null) {
                                                                boolean z16 = bArr4 != null;
                                                                if (z16) {
                                                                    String str6 = ch5Var.n;
                                                                    str6.getClass();
                                                                    bArr3 = vg5.f(str6);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z17 = z16;
                                                                Uri d4 = d2f.d(str3, ch5Var.a);
                                                                ig8Var = ig8Var2;
                                                                long j23 = ch5Var.r;
                                                                long j24 = ch5Var.s;
                                                                yve.l(d4, "The uri must be set.");
                                                                n73 n73Var3 = new n73(d4, 1, null, map, j23, j24, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    h73Var3 = new nb(h73Var4, bArr4, bArr3);
                                                                } else {
                                                                    h73Var3 = h73Var4;
                                                                }
                                                                h73Var2 = h73Var3;
                                                                z4 = z17;
                                                                n73Var = n73Var3;
                                                            } else {
                                                                ig8Var = ig8Var2;
                                                                n73Var = null;
                                                                h73Var2 = null;
                                                                z4 = false;
                                                            }
                                                            long j25 = j4 + j19;
                                                            long j26 = j25 + dh5Var.c;
                                                            int i2 = b3.j + dh5Var.d;
                                                            if (vg5Var == null) {
                                                                n73 n73Var4 = vg5Var.H;
                                                                boolean z18 = n73Var == n73Var4 || (n73Var != null && n73Var4 != null && n73Var.a.equals(n73Var4.a) && n73Var.e == n73Var4.e);
                                                                boolean z19 = b.equals(vg5Var.y) && vg5Var.Y;
                                                                vl5Var = vg5Var.P;
                                                                ey7Var = vg5Var.Q;
                                                                q31Var = (z18 && z19 && !vg5Var.a0 && vg5Var.x == i2) ? vg5Var.T : null;
                                                            } else {
                                                                vl5Var = new vl5(null);
                                                                ey7Var = new ey7(10);
                                                                q31Var = null;
                                                            }
                                                            vl5 vl5Var2 = vl5Var;
                                                            ey7 ey7Var2 = ey7Var;
                                                            long j27 = f2.b;
                                                            int i3 = f2.c;
                                                            boolean z20 = !z13;
                                                            boolean z21 = dh5Var.w;
                                                            SparseArray sparseArray = (SparseArray) pq8Var.b;
                                                            usbVar = (usb) sparseArray.get(i2);
                                                            if (usbVar == null) {
                                                                usbVar = new usb(9223372036854775806L);
                                                                sparseArray.put(i2, usbVar);
                                                            }
                                                            rxVar.c = new vg5(ib3Var, h73Var, n73Var2, ko4Var, z3, h73Var2, n73Var, z4, b, list4, o, r, j25, j26, j27, i3, z20, i2, z21, z15, usbVar, dh5Var.f, q31Var, vl5Var2, ey7Var2, z2, z14, ig8Var, str2);
                                                        }
                                                    }
                                                }
                                                z2 = false;
                                                if (z2) {
                                                }
                                                ib3 ib3Var2 = sg5Var2.a;
                                                h73 h73Var42 = sg5Var2.b;
                                                ko4 ko4Var2 = sg5Var2.f[m];
                                                List list42 = sg5Var2.j;
                                                int o2 = sg5Var2.s.o();
                                                Object r2 = sg5Var2.s.r();
                                                boolean z152 = sg5Var2.m;
                                                pq8 pq8Var2 = sg5Var2.d;
                                                if (d2 != null) {
                                                }
                                                if (d != null) {
                                                }
                                                ig8 ig8Var22 = sg5Var2.l;
                                                AtomicInteger atomicInteger22 = vg5.d0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri d32 = d2f.d(str3, dh5Var.a);
                                                rx6Var = rx6Var2;
                                                long j212 = dh5Var.r;
                                                long j222 = dh5Var.s;
                                                if (!z13) {
                                                }
                                                yve.l(d32, "The uri must be set.");
                                                n73 n73Var22 = new n73(d32, 1, null, map2, j212, j222, null, i);
                                                if (bArr == null) {
                                                }
                                                if (z3) {
                                                }
                                                if (bArr == null) {
                                                }
                                                ch5Var = dh5Var.b;
                                                if (ch5Var == null) {
                                                }
                                                long j252 = j4 + j19;
                                                long j262 = j252 + dh5Var.c;
                                                int i22 = b3.j + dh5Var.d;
                                                if (vg5Var == null) {
                                                }
                                                vl5 vl5Var22 = vl5Var;
                                                ey7 ey7Var22 = ey7Var;
                                                long j272 = f2.b;
                                                int i32 = f2.c;
                                                boolean z202 = !z13;
                                                boolean z212 = dh5Var.w;
                                                SparseArray sparseArray2 = (SparseArray) pq8Var2.b;
                                                usbVar = (usb) sparseArray2.get(i22);
                                                if (usbVar == null) {
                                                }
                                                rxVar.c = new vg5(ib3Var2, h73Var, n73Var22, ko4Var2, z3, h73Var2, n73Var, z4, b, list42, o2, r2, j252, j262, j272, i32, z202, i22, z212, z152, usbVar, dh5Var.f, q31Var, vl5Var22, ey7Var22, z2, z14, ig8Var, str2);
                                            }
                                        }
                                        rx6Var = rx6Var2;
                                    }
                                }
                            }
                            vg5Var = vg5Var3;
                            sg5Var2 = sg5Var4;
                            String str32 = b3.a;
                            boolean z122 = b3.c;
                            j5 = b3.k;
                            po5 po5Var2 = b3.r;
                            if (m != a) {
                                Uri b42 = qh5VarArr[a].b();
                                lb3Var = (lb3) mb3Var.d.get(b42);
                                if (lb3Var != null) {
                                }
                            }
                            if (longValue >= j5) {
                            }
                        }
                        z5 = rxVar.b;
                        rh2Var = (rh2) rxVar.c;
                        Uri uri = (Uri) rxVar.d;
                        if (rh2Var != null) {
                            long j28 = this.l0;
                            if (j28 != Long.MIN_VALUE && rh2Var.h >= j28) {
                                z6 = true;
                                if (z5) {
                                    j6 = -9223372036854775807L;
                                } else {
                                    if (!z6) {
                                        if (rh2Var == null) {
                                            if (uri == null || (lb3Var2 = (lb3) ((wg5) this.c.b).b.d.get(uri)) == null) {
                                                return false;
                                            }
                                            lb3Var2.e(uri, true);
                                            return false;
                                        }
                                        if (rh2Var instanceof vg5) {
                                            vg5 vg5Var4 = (vg5) rh2Var;
                                            ArrayList arrayList = this.E;
                                            if (!arrayList.isEmpty()) {
                                                if (!x().h()) {
                                                    w(arrayList.size() - 1);
                                                }
                                                if (vg5Var4.E && vg5Var4.c0) {
                                                    int size = arrayList.size() - 1;
                                                    while (true) {
                                                        if (size < 0) {
                                                            break;
                                                        }
                                                        long j29 = ((vg5) arrayList.get(size)).h;
                                                        long j30 = vg5Var4.h;
                                                        if (j29 < j30) {
                                                            break;
                                                        }
                                                        if (j29 == j30 && i(size)) {
                                                            w(size);
                                                            vg5Var4.c0 = false;
                                                            break;
                                                        }
                                                        size--;
                                                    }
                                                }
                                            }
                                            this.p0 = vg5Var4;
                                            this.W = vg5Var4.d;
                                            this.h0 = j2;
                                            arrayList.add(vg5Var4);
                                            mo5 p = po5.p();
                                            for (uh5 uh5Var3 : this.M) {
                                                p.c(Integer.valueOf(uh5Var3.z()));
                                            }
                                            j99 f3 = p.f();
                                            vg5Var4.U = this;
                                            vg5Var4.Z = f3;
                                            for (uh5 uh5Var4 : this.M) {
                                                uh5Var4.getClass();
                                                uh5Var4.F = vg5Var4.w;
                                                if (vg5Var4.c0) {
                                                    uh5Var4.J = true;
                                                }
                                            }
                                        }
                                        this.L = rh2Var;
                                        rx6Var.w0(rh2Var, this, this.r.v3(rh2Var.c));
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
                vg5 vg5Var32 = vg5Var2;
                sg5Var.s.b(j10, j11, j3, list, b2);
                int m2 = sg5Var.s.m();
                if (a == m2) {
                }
                b = qh5VarArr[m2].b();
                ug5 ug5Var2 = sg5Var.h;
                if (ug5Var2 == null) {
                }
                if (mb3Var.h(b)) {
                }
                z5 = rxVar.b;
                rh2Var = (rh2) rxVar.c;
                Uri uri2 = (Uri) rxVar.d;
                if (rh2Var != null) {
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

    @Override // i8a
    public final long t() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.h0;
        }
        long j = this.g0;
        vg5 x = x();
        if (!x.Y) {
            ArrayList arrayList = this.E;
            x = arrayList.size() > 1 ? (vg5) c00.g(2, arrayList) : null;
        }
        if (x != null) {
            j = Math.max(j, x.n);
        }
        if (this.T) {
            for (uh5 uh5Var : this.M) {
                j = Math.max(j, uh5Var.s());
            }
        }
        return j;
    }

    @Override // i8a
    public final void u(long j) {
        rx6 rx6Var = this.s;
        if (rx6Var.U() || z()) {
            return;
        }
        boolean Z = rx6Var.Z();
        sg5 sg5Var = this.d;
        ArrayList arrayList = this.E;
        List list = this.F;
        if (Z) {
            rh2 rh2Var = this.L;
            rh2Var.getClass();
            if (!(rh2Var instanceof vg5) || i(arrayList.size() - 1)) {
                long j2 = this.l0;
                if (j2 == Long.MIN_VALUE || rh2Var.h < j2) {
                    if (!(sg5Var.o == null ? sg5Var.s.g(j, rh2Var, list) : false)) {
                        return;
                    }
                }
                rx6Var.u();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && sg5Var.c((vg5) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            w(size);
        }
        int min = Math.min(arrayList.size(), (sg5Var.o != null || sg5Var.s.length() < 2) ? list.size() : sg5Var.s.k(j, list));
        if (this.l0 != Long.MIN_VALUE) {
            while (min > 0 && ((vg5) arrayList.get(min - 1)).h >= this.l0) {
                min--;
                r2 = true;
            }
        }
        if (min < arrayList.size()) {
            w(min);
        }
        if (r2) {
            this.h0 = -9223372036854775807L;
            this.k0 = true;
        }
    }

    public final void w(int i) {
        ArrayList arrayList;
        yve.p(!this.s.Z());
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
        vg5 vg5Var = (vg5) arrayList.get(i);
        gcc.Y(i, arrayList.size(), arrayList);
        for (int i2 = 0; i2 < this.M.length; i2++) {
            this.M[i2].o(vg5Var.g(i2));
        }
        if (arrayList.isEmpty()) {
            this.h0 = Math.max(this.g0, vg5Var.h);
        } else {
            ((vg5) dqe.b(arrayList)).a0 = true;
        }
        this.k0 = false;
        this.w.B(vg5Var.h, this.R, j);
    }

    public final vg5 x() {
        return (vg5) c00.g(1, this.E);
    }

    public final boolean z() {
        return this.h0 != -9223372036854775807L;
    }

    @Override // g84
    public final void m0(zy9 zy9Var) {
    }
}
