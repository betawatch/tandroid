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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tf5 implements h86, l86, q4a, l74, fp9 {
    public static final Set q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final qf5 G;
    public final qf5 H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public zg2 L;
    public sf5[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public rf5 Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public fm4 W;
    public fm4 X;
    public boolean Y;
    public txb Z;
    public final String a;
    public Set a0;
    public final byte b;
    public int[] b0;
    public final gi3 c;
    public int c0;
    public final re5 d;
    public boolean d0;
    public final mv6 e;
    public boolean[] e0;
    public final fm4 f;
    public boolean[] f0;
    public long g0;
    public final yq3 h;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final vq3 n;
    public long n0;
    public qq3 o0;
    public te5 p0;
    public final i2f r;
    public final mv6 s;
    public final kp w;
    public final boolean x;
    public final qx y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [qf5] */
    /* JADX WARN: Type inference failed for: r2v14, types: [qf5] */
    public tf5(String str, int i, gi3 gi3Var, re5 re5Var, Map map, mv6 mv6Var, long j, fm4 fm4Var, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, int i2, e69 e69Var) {
        this.a = str;
        this.b = i;
        this.c = gi3Var;
        this.d = re5Var;
        this.K = map;
        this.e = mv6Var;
        this.f = fm4Var;
        this.h = yq3Var;
        this.n = vq3Var;
        this.r = i2fVar;
        this.w = kpVar;
        this.x = i2;
        this.s = e69Var != null ? new mv6((Object) e69Var, (byte) 5) : new mv6("Loader:HlsSampleStreamWrapper");
        qx qxVar = new qx();
        qxVar.c = null;
        final byte b = 0;
        qxVar.b = false;
        qxVar.d = null;
        this.y = qxVar;
        this.N = new int[0];
        Set set = q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new sf5[0];
        this.f0 = new boolean[0];
        this.e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) { // from class: qf5
            public final /* synthetic */ tf5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                tf5 tf5Var = this.b;
                switch (b2) {
                    case 0:
                        tf5Var.B();
                        break;
                    default:
                        for (sf5 sf5Var : tf5Var.M) {
                            sf5Var.K(tf5Var.l0);
                        }
                        tf5Var.T = true;
                        tf5Var.B();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.H = new Runnable(this) { // from class: qf5
            public final /* synthetic */ tf5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                tf5 tf5Var = this.b;
                switch (b22) {
                    case 0:
                        tf5Var.B();
                        break;
                    default:
                        for (sf5 sf5Var : tf5Var.M) {
                            sf5Var.K(tf5Var.l0);
                        }
                        tf5Var.T = true;
                        tf5Var.B();
                        break;
                }
            }
        };
        this.I = g8c.q(null);
        this.g0 = j;
        this.h0 = j;
        this.l0 = Long.MIN_VALUE;
    }

    public static yn3 j(int i, int i2) {
        lad.f("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new yn3();
    }

    public static fm4 u(fm4 fm4Var, fm4 fm4Var2, boolean z) {
        String b;
        if (fm4Var == null) {
            return fm4Var2;
        }
        String str = fm4Var.l;
        String str2 = fm4Var2.t;
        int h = ud7.h(str2);
        if (g8c.v(h, str) == 1) {
            b = g8c.w(h, str);
            str2 = ud7.d(b);
        } else {
            b = ud7.b(str, str2);
        }
        fm4Var2.o = fm4Var.o;
        fm4Var2.p = fm4Var.p;
        fm4Var2.q = fm4Var.q;
        fm4Var2.r = fm4Var.r;
        em4 a = fm4Var2.a();
        a.a = fm4Var.a;
        a.b = fm4Var.b;
        a.c = mm5.q(fm4Var.c);
        a.d = fm4Var.d;
        a.e = fm4Var.e;
        a.f = fm4Var.f;
        a.i = z ? fm4Var.i : -1;
        a.j = z ? fm4Var.j : -1;
        a.k = b;
        a.q = fm4Var.q;
        a.o = fm4Var.p;
        a.n = fm4Var.o;
        a.p = fm4Var.r;
        if (h == 2) {
            a.z = fm4Var.A;
            a.A = fm4Var.B;
            a.a(fm4Var.F);
        }
        if (str2 != null) {
            a.s = ud7.n(str2);
        }
        int i = fm4Var.N;
        if (i != -1 && h == 1) {
            a.M = i;
        }
        ld7 ld7Var = fm4Var.m;
        if (ld7Var != null) {
            ld7 ld7Var2 = fm4Var2.m;
            if (ld7Var2 != null) {
                ld7Var = ld7Var2.b(ld7Var);
            }
            a.l = ld7Var;
        }
        return new fm4(a);
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

    public final boolean A() {
        return this.h0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        int i;
        if (!this.Y && this.b0 == null && this.T) {
            int i2 = 0;
            for (sf5 sf5Var : this.M) {
                if (sf5Var.y() == null) {
                    return;
                }
            }
            txb txbVar = this.Z;
            if (txbVar != null) {
                int i3 = txbVar.a;
                int[] iArr = new int[i3];
                this.b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        sf5[] sf5VarArr = this.M;
                        if (i5 < sf5VarArr.length) {
                            fm4 y = sf5VarArr[i5].y();
                            y.getClass();
                            fm4 fm4Var = this.Z.a(i4).d[0];
                            String str = y.t;
                            String str2 = fm4Var.t;
                            int h = ud7.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y.T == fm4Var.T) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i5++;
                            } else if (h == ud7.h(str2)) {
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
                    ((pf5) obj).c();
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
                fm4 y2 = this.M[i6].y();
                y2.getClass();
                String str3 = y2.t;
                if (ud7.m(str3)) {
                    i9 = 2;
                } else if (!ud7.i(str3)) {
                    i9 = ud7.l(str3) ? 3 : -2;
                }
                if (y(i9) > y(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            sxb sxbVar = this.d.i;
            int i10 = sxbVar.a;
            this.c0 = -1;
            this.b0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.b0[i11] = i11;
            }
            sxb[] sxbVarArr = new sxb[length];
            int i12 = 0;
            while (i12 < length) {
                fm4 y3 = this.M[i12].y();
                y3.getClass();
                fm4 fm4Var2 = this.f;
                String str4 = this.a;
                if (i12 == i7) {
                    fm4[] fm4VarArr = new fm4[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        fm4 fm4Var3 = sxbVar.d[i13];
                        if (i8 == 1 && fm4Var2 != null) {
                            fm4Var3 = fm4Var3.d(fm4Var2);
                        }
                        fm4VarArr[i13] = i10 == 1 ? y3.d(fm4Var3) : u(fm4Var3, y3, true);
                    }
                    sxbVarArr[i12] = new sxb(str4, fm4VarArr);
                    this.c0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !ud7.i(y3.t)) {
                        fm4Var2 = null;
                    }
                    StringBuilder k = b00.k(str4, ":muxed:");
                    k.append(i12 < i7 ? i12 : i12 - 1);
                    String sb = k.toString();
                    i = 0;
                    em4 a = u(fm4Var2, y3, false).a();
                    a.m = str4;
                    sxbVarArr[i12] = new sxb(sb, new fm4(a));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.Z = n(sxbVarArr);
            gre.p(this.a0 == null ? 1 : i14);
            this.a0 = Collections.EMPTY_SET;
            this.U = true;
            this.c.x();
        }
    }

    public final void C() {
        this.s.b();
        re5 re5Var = this.d;
        jh0 jh0Var = re5Var.o;
        if (jh0Var != null) {
            throw jh0Var;
        }
        Uri uri = re5Var.p;
        if (uri == null || !uri.equals(re5Var.q)) {
            return;
        }
        re5Var.g.i(re5Var.p);
    }

    @Override // h86
    public final void C0(k86 k86Var, long j, long j2, int i) {
        zg2 zg2Var = (zg2) k86Var;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        if (i != 0) {
            zxa zxaVar = zg2Var.r;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        this.w.u(new f86(e86Var), zg2Var.c, this.b, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, i);
    }

    public final void D(sxb[] sxbVarArr, int... iArr) {
        this.Z = n(sxbVarArr);
        this.a0 = new HashSet();
        for (int i : iArr) {
            this.a0.add(this.Z.a(i));
        }
        this.c0 = 0;
        this.I.post(new iu4(this.c, (byte) 24));
        this.U = true;
    }

    public final void E() {
        for (sf5 sf5Var : this.M) {
            sf5Var.G(this.i0);
        }
        this.i0 = false;
    }

    public final boolean F(long j, boolean z) {
        te5 te5Var;
        int i;
        boolean J;
        this.g0 = j;
        if (A()) {
            this.h0 = j;
            return true;
        }
        boolean z2 = this.d.r;
        ArrayList arrayList = this.E;
        if (z2) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                te5Var = (te5) arrayList.get(i2);
                if (te5Var.h == j) {
                    break;
                }
            }
        }
        te5Var = null;
        if (this.T && !z && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (0; i < length; i + 1) {
                sf5 sf5Var = this.M[i];
                if (te5Var != null) {
                    J = sf5Var.I(te5Var.g(i));
                } else {
                    long g = g();
                    J = sf5Var.J(j, g == Long.MIN_VALUE || j < g);
                }
                i = (J || (!this.f0[i] && this.d0)) ? i + 1 : 0;
            }
            return false;
        }
        this.h0 = j;
        this.k0 = false;
        arrayList.clear();
        mv6 mv6Var = this.s;
        if (!mv6Var.W()) {
            mv6Var.d = null;
            E();
            return true;
        }
        if (this.T) {
            for (sf5 sf5Var2 : this.M) {
                sf5Var2.l();
            }
        }
        mv6Var.p();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [sf5[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sf5[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wxb] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gp9, sf5] */
    /* JADX WARN: Type inference failed for: r5v6, types: [yn3] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // l74
    public final wxb S(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set set = q0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            gre.f(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.N[i3] = i;
                }
                r5 = this.N[i3] == i ? this.M[i3] : j(i, i2);
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
                return j(i, i2);
            }
            int length = this.M.length;
            boolean z = i2 == 1 || i2 == 2;
            r5 = new sf5(this.e, this.h, this.n, this.K);
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
            sf5[] sf5VarArr = this.M;
            String str = g8c.a;
            ?? copyOf2 = Arrays.copyOf(sf5VarArr, sf5VarArr.length + 1);
            copyOf2[sf5VarArr.length] = r5;
            this.M = (sf5[]) copyOf2;
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
        rf5 rf5Var = this.Q;
        if (rf5Var != null) {
            return rf5Var;
        }
        rf5 rf5Var2 = new rf5(r5, this.x ? 1 : 0);
        this.Q = rf5Var2;
        return rf5Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h86
    public final void U(k86 k86Var, long j, long j2) {
        zg2 zg2Var = (zg2) k86Var;
        this.L = null;
        if (zg2Var instanceof ne5) {
            ne5 ne5Var = (ne5) zg2Var;
            byte[] bArr = ne5Var.s;
            re5 re5Var = this.d;
            re5Var.n = bArr;
            pj4 pj4Var = re5Var.k;
            Uri uri = ne5Var.b.a;
            byte[] bArr2 = ne5Var.x;
            bArr2.getClass();
            np4 np4Var = (np4) pj4Var.b;
            uri.getClass();
        }
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.r.getClass();
        this.w.q(f86Var, zg2Var.c, this.b, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n);
        if (this.U) {
            this.c.b(this);
            return;
        }
        s86 s86Var = new s86();
        s86Var.a = this.g0;
        r(new t86(s86Var));
    }

    @Override // fp9
    public final void a() {
        this.I.post(this.G);
    }

    public final void b() {
        gre.p(this.U);
        this.Z.getClass();
        this.a0.getClass();
    }

    @Override // l86
    public final void c() {
        for (sf5 sf5Var : this.M) {
            sf5Var.G(true);
            sq3 sq3Var = sf5Var.h;
            if (sq3Var != null) {
                sq3Var.c(sf5Var.e);
                sf5Var.h = null;
                sf5Var.g = null;
            }
        }
    }

    @Override // q4a
    public final boolean d() {
        return this.s.W();
    }

    @Override // q4a
    public final long g() {
        if (A()) {
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
    public final boolean h(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.E;
            if (i2 >= arrayList.size()) {
                te5 te5Var = (te5) arrayList.get(i);
                for (int i3 = 0; i3 < this.M.length; i3++) {
                    if (this.M[i3].v() <= te5Var.g(i3)) {
                    }
                }
                return true;
            }
            if (((te5) arrayList.get(i2)).c0) {
                break;
            }
            i2++;
        }
    }

    public final txb n(sxb[] sxbVarArr) {
        for (int i = 0; i < sxbVarArr.length; i++) {
            sxb sxbVar = sxbVarArr[i];
            fm4[] fm4VarArr = new fm4[sxbVar.a];
            for (int i2 = 0; i2 < sxbVar.a; i2++) {
                fm4 fm4Var = sxbVar.d[i2];
                int w = this.h.w(fm4Var);
                em4 a = fm4Var.a();
                a.W = w;
                fm4VarArr[i2] = new fm4(a);
            }
            sxbVarArr[i] = new sxb(sxbVar.b, fm4VarArr);
        }
        return new txb(sxbVarArr);
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
    @Override // q4a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(t86 t86Var) {
        long max;
        long j;
        List list;
        long j2;
        int a;
        t86 t86Var2;
        np4 np4Var;
        long j3;
        re5 re5Var;
        boolean z;
        Uri b;
        long j4;
        re5 re5Var2;
        te5 te5Var;
        long j5;
        qx qxVar;
        boolean z2;
        byte[] bArr;
        mv6 mv6Var;
        boolean z3;
        byte[] bArr2;
        o63 o63Var;
        af5 af5Var;
        uc8 uc8Var;
        u63 u63Var;
        o63 o63Var2;
        boolean z4;
        tj5 tj5Var;
        xu7 xu7Var;
        h31 h31Var;
        uob uobVar;
        byte[] bArr3;
        o63 o63Var3;
        String str;
        sa3 sa3Var;
        qe5 f;
        boolean z5;
        zg2 zg2Var;
        boolean z6;
        long j6;
        sa3 sa3Var2;
        if (!this.k0) {
            mv6 mv6Var2 = this.s;
            if (!mv6Var2.W() && !mv6Var2.S()) {
                if (A()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.h0;
                    for (sf5 sf5Var : this.M) {
                        sf5Var.t = this.h0;
                    }
                    list = list2;
                    j = max;
                } else {
                    te5 x = x();
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
                        for (sf5 sf5Var2 : this.M) {
                            j9 = Math.max(j9, sf5Var2.t());
                        }
                    }
                    j = j9;
                    list = list3;
                }
                qx qxVar2 = this.y;
                qxVar2.c = null;
                qxVar2.b = false;
                qxVar2.d = null;
                boolean z9 = this.U || !list.isEmpty();
                re5 re5Var3 = this.d;
                np4 np4Var2 = (np4) re5Var3.k.b;
                of5[] of5VarArr = re5Var3.e;
                ta3 ta3Var = re5Var3.g;
                te5 te5Var2 = list.isEmpty() ? null : (te5) jle.b(list);
                if (te5Var2 == null) {
                    j2 = -9223372036854775807L;
                    a = -1;
                    np4Var = np4Var2;
                    t86Var2 = t86Var;
                } else {
                    j2 = -9223372036854775807L;
                    a = re5Var3.i.a(te5Var2.d);
                    t86Var2 = t86Var;
                    np4Var = np4Var2;
                }
                long j10 = t86Var2.a;
                long j11 = max - j10;
                long j12 = re5Var3.t;
                long j13 = j12 != j2 ? j12 - j10 : j2;
                if (te5Var2 == null || re5Var3.r) {
                    j3 = j13;
                    re5Var = re5Var3;
                } else {
                    re5Var = re5Var3;
                    j3 = j13;
                    long j14 = te5Var2.n - te5Var2.h;
                    j11 = Math.max(0L, j11 - j14);
                    if (j3 != j2) {
                        j3 = Math.max(0L, j3 - j14);
                    }
                }
                bk6[] b2 = re5Var.b(te5Var2, max);
                if (a != -1) {
                    k64 k64Var = re5Var.s;
                    if (k64Var.a(k64Var.v(a), SystemClock.elapsedRealtime())) {
                        z = true;
                        long j15 = max;
                        te5 te5Var3 = te5Var2;
                        re5Var.s.b(j10, j11, j3, list, b2);
                        int n = re5Var.s.n();
                        boolean z10 = a == n;
                        b = of5VarArr[n].b();
                        se5 se5Var = re5Var.h;
                        String str2 = (se5Var == null && se5Var.k) ? of5VarArr[n].d : null;
                        if (ta3Var.g(b)) {
                            qxVar2.d = b;
                            re5Var.q = b;
                            mv6Var = mv6Var2;
                            qxVar = qxVar2;
                        } else {
                            df5 b3 = ta3Var.b(b, true);
                            b3.getClass();
                            long j16 = b3.h;
                            re5Var.r = b3.c;
                            re5Var.t = b3.o ? j2 : (j16 + b3.u) - ta3Var.M;
                            long j17 = j16 - ta3Var.M;
                            np4 np4Var3 = np4Var;
                            re5 re5Var4 = re5Var;
                            Pair e = re5Var4.e(te5Var3, z10, b3, j17, j15);
                            boolean z11 = z;
                            long longValue = ((Long) e.first).longValue();
                            int intValue = ((Integer) e.second).intValue();
                            if (!z10 || z11 || te5Var3 == null) {
                                j4 = j17;
                            } else {
                                j4 = j17;
                                if (longValue < b3.k || ((f = re5.f(b3, longValue, intValue)) != null && j4 + f.a.e < j)) {
                                    b = of5VarArr[a].b();
                                    b3 = ta3Var.b(b, true);
                                    b3.getClass();
                                    long j18 = b3.h - ta3Var.M;
                                    Pair e2 = re5Var4.e(te5Var3, false, b3, j18, j15);
                                    te5Var = te5Var3;
                                    long longValue2 = ((Long) e2.first).longValue();
                                    intValue = ((Integer) e2.second).intValue();
                                    n = a;
                                    j4 = j18;
                                    re5Var2 = re5Var4;
                                    longValue = longValue2;
                                    String str3 = b3.a;
                                    boolean z12 = b3.c;
                                    j5 = b3.k;
                                    mm5 mm5Var = b3.r;
                                    if (n != a && a != -1) {
                                        Uri b4 = of5VarArr[a].b();
                                        sa3Var = (sa3) ta3Var.d.get(b4);
                                        if (sa3Var != null) {
                                            HashMap hashMap = sa3Var.b;
                                            gre.p(hashMap.containsKey(b4));
                                            ra3 ra3Var = (ra3) hashMap.get(b4);
                                            ra3Var.getClass();
                                            ra3Var.x = false;
                                        }
                                    }
                                    if (longValue >= j5) {
                                        re5Var2.o = new jh0();
                                        mv6Var = mv6Var2;
                                        qxVar = qxVar2;
                                    } else {
                                        qe5 f2 = re5.f(b3, longValue, intValue);
                                        if (f2 == null) {
                                            qxVar = qxVar2;
                                            if (!b3.o) {
                                                qxVar.d = b;
                                                re5Var2.q = b;
                                            } else if (z9 || mm5Var.isEmpty()) {
                                                qxVar.b = true;
                                            } else {
                                                f2 = new qe5((bf5) jle.b(mm5Var), (j5 + mm5Var.size()) - 1, -1);
                                            }
                                            mv6Var = mv6Var2;
                                        } else {
                                            qxVar = qxVar2;
                                        }
                                        boolean z13 = f2.d;
                                        bf5 bf5Var = f2.a;
                                        re5Var2.q = null;
                                        SystemClock.elapsedRealtime();
                                        af5 af5Var2 = bf5Var.b;
                                        long j19 = bf5Var.e;
                                        Uri d = (af5Var2 == null || (str = af5Var2.h) == null) ? null : jxe.d(str3, str);
                                        ne5 g = re5Var2.g(d, n, true);
                                        qxVar.c = g;
                                        if (g == null) {
                                            String str4 = bf5Var.h;
                                            Uri d2 = str4 == null ? null : jxe.d(str3, str4);
                                            ne5 g2 = re5Var2.g(d2, n, false);
                                            qxVar.c = g2;
                                            if (g2 == null) {
                                                boolean z14 = bf5Var instanceof ye5 ? ((ye5) bf5Var).x || (f2.c == 0 && z12) : z12;
                                                if (te5Var == null) {
                                                    AtomicInteger atomicInteger = te5.d0;
                                                } else if (!b.equals(te5Var.y) || !te5Var.Y) {
                                                    long j20 = j4 + j19;
                                                    if (!z14 || j20 < j15) {
                                                        z2 = true;
                                                        if (z2 || !z13) {
                                                            pa3 pa3Var = re5Var2.a;
                                                            o63 o63Var4 = re5Var2.b;
                                                            fm4 fm4Var = re5Var2.f[n];
                                                            List list4 = re5Var2.j;
                                                            int p = re5Var2.s.p();
                                                            Object s = re5Var2.s.s();
                                                            boolean z15 = re5Var2.m;
                                                            g29 g29Var = re5Var2.d;
                                                            bArr = d2 != null ? null : (byte[]) np4Var3.get(d2);
                                                            byte[] bArr4 = d != null ? null : (byte[]) np4Var3.get(d);
                                                            uc8 uc8Var2 = re5Var2.l;
                                                            AtomicInteger atomicInteger2 = te5.d0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri d3 = jxe.d(str3, bf5Var.a);
                                                            mv6Var = mv6Var2;
                                                            long j21 = bf5Var.r;
                                                            long j22 = bf5Var.s;
                                                            int i = !z13 ? 8 : 0;
                                                            gre.l(d3, "The uri must be set.");
                                                            u63 u63Var2 = new u63(d3, 1, null, map, j21, j22, null, i);
                                                            z3 = bArr == null;
                                                            if (z3) {
                                                                bArr2 = null;
                                                            } else {
                                                                String str5 = bf5Var.n;
                                                                str5.getClass();
                                                                bArr2 = te5.f(str5);
                                                            }
                                                            if (bArr == null) {
                                                                bArr2.getClass();
                                                                o63Var = new mb(o63Var4, bArr, bArr2);
                                                            } else {
                                                                o63Var = o63Var4;
                                                            }
                                                            af5Var = bf5Var.b;
                                                            if (af5Var == null) {
                                                                boolean z16 = bArr4 != null;
                                                                if (z16) {
                                                                    String str6 = af5Var.n;
                                                                    str6.getClass();
                                                                    bArr3 = te5.f(str6);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z17 = z16;
                                                                Uri d4 = jxe.d(str3, af5Var.a);
                                                                uc8Var = uc8Var2;
                                                                long j23 = af5Var.r;
                                                                long j24 = af5Var.s;
                                                                gre.l(d4, "The uri must be set.");
                                                                u63 u63Var3 = new u63(d4, 1, null, map, j23, j24, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    o63Var3 = new mb(o63Var4, bArr4, bArr3);
                                                                } else {
                                                                    o63Var3 = o63Var4;
                                                                }
                                                                o63Var2 = o63Var3;
                                                                z4 = z17;
                                                                u63Var = u63Var3;
                                                            } else {
                                                                uc8Var = uc8Var2;
                                                                u63Var = null;
                                                                o63Var2 = null;
                                                                z4 = false;
                                                            }
                                                            long j25 = j4 + j19;
                                                            long j26 = j25 + bf5Var.c;
                                                            int i2 = b3.j + bf5Var.d;
                                                            if (te5Var == null) {
                                                                u63 u63Var4 = te5Var.H;
                                                                boolean z18 = u63Var == u63Var4 || (u63Var != null && u63Var4 != null && u63Var.a.equals(u63Var4.a) && u63Var.e == u63Var4.e);
                                                                boolean z19 = b.equals(te5Var.y) && te5Var.Y;
                                                                tj5Var = te5Var.P;
                                                                xu7Var = te5Var.Q;
                                                                h31Var = (z18 && z19 && !te5Var.a0 && te5Var.x == i2) ? te5Var.T : null;
                                                            } else {
                                                                tj5Var = new tj5(null);
                                                                xu7Var = new xu7(10);
                                                                h31Var = null;
                                                            }
                                                            tj5 tj5Var2 = tj5Var;
                                                            xu7 xu7Var2 = xu7Var;
                                                            long j27 = f2.b;
                                                            int i3 = f2.c;
                                                            boolean z20 = !z13;
                                                            boolean z21 = bf5Var.w;
                                                            SparseArray sparseArray = (SparseArray) g29Var.b;
                                                            uobVar = (uob) sparseArray.get(i2);
                                                            if (uobVar == null) {
                                                                uobVar = new uob(9223372036854775806L);
                                                                sparseArray.put(i2, uobVar);
                                                            }
                                                            qxVar.c = new te5(pa3Var, o63Var, u63Var2, fm4Var, z3, o63Var2, u63Var, z4, b, list4, p, s, j25, j26, j27, i3, z20, i2, z21, z15, uobVar, bf5Var.f, h31Var, tj5Var2, xu7Var2, z2, z14, uc8Var, str2);
                                                        }
                                                    }
                                                }
                                                z2 = false;
                                                if (z2) {
                                                }
                                                pa3 pa3Var2 = re5Var2.a;
                                                o63 o63Var42 = re5Var2.b;
                                                fm4 fm4Var2 = re5Var2.f[n];
                                                List list42 = re5Var2.j;
                                                int p2 = re5Var2.s.p();
                                                Object s2 = re5Var2.s.s();
                                                boolean z152 = re5Var2.m;
                                                g29 g29Var2 = re5Var2.d;
                                                if (d2 != null) {
                                                }
                                                if (d != null) {
                                                }
                                                uc8 uc8Var22 = re5Var2.l;
                                                AtomicInteger atomicInteger22 = te5.d0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri d32 = jxe.d(str3, bf5Var.a);
                                                mv6Var = mv6Var2;
                                                long j212 = bf5Var.r;
                                                long j222 = bf5Var.s;
                                                if (!z13) {
                                                }
                                                gre.l(d32, "The uri must be set.");
                                                u63 u63Var22 = new u63(d32, 1, null, map2, j212, j222, null, i);
                                                if (bArr == null) {
                                                }
                                                if (z3) {
                                                }
                                                if (bArr == null) {
                                                }
                                                af5Var = bf5Var.b;
                                                if (af5Var == null) {
                                                }
                                                long j252 = j4 + j19;
                                                long j262 = j252 + bf5Var.c;
                                                int i22 = b3.j + bf5Var.d;
                                                if (te5Var == null) {
                                                }
                                                tj5 tj5Var22 = tj5Var;
                                                xu7 xu7Var22 = xu7Var;
                                                long j272 = f2.b;
                                                int i32 = f2.c;
                                                boolean z202 = !z13;
                                                boolean z212 = bf5Var.w;
                                                SparseArray sparseArray2 = (SparseArray) g29Var2.b;
                                                uobVar = (uob) sparseArray2.get(i22);
                                                if (uobVar == null) {
                                                }
                                                qxVar.c = new te5(pa3Var2, o63Var, u63Var22, fm4Var2, z3, o63Var2, u63Var, z4, b, list42, p2, s2, j252, j262, j272, i32, z202, i22, z212, z152, uobVar, bf5Var.f, h31Var, tj5Var22, xu7Var22, z2, z14, uc8Var, str2);
                                            }
                                        }
                                        mv6Var = mv6Var2;
                                    }
                                }
                            }
                            te5Var = te5Var3;
                            re5Var2 = re5Var4;
                            String str32 = b3.a;
                            boolean z122 = b3.c;
                            j5 = b3.k;
                            mm5 mm5Var2 = b3.r;
                            if (n != a) {
                                Uri b42 = of5VarArr[a].b();
                                sa3Var = (sa3) ta3Var.d.get(b42);
                                if (sa3Var != null) {
                                }
                            }
                            if (longValue >= j5) {
                            }
                        }
                        z5 = qxVar.b;
                        zg2Var = (zg2) qxVar.c;
                        Uri uri = (Uri) qxVar.d;
                        if (zg2Var != null) {
                            long j28 = this.l0;
                            if (j28 != Long.MIN_VALUE && zg2Var.h >= j28) {
                                z6 = true;
                                if (z5) {
                                    j6 = -9223372036854775807L;
                                } else {
                                    if (!z6) {
                                        if (zg2Var == null) {
                                            if (uri == null || (sa3Var2 = (sa3) ((ue5) this.c.a).b.d.get(uri)) == null) {
                                                return false;
                                            }
                                            sa3Var2.e(uri, true);
                                            return false;
                                        }
                                        if (zg2Var instanceof te5) {
                                            te5 te5Var4 = (te5) zg2Var;
                                            ArrayList arrayList = this.E;
                                            if (!arrayList.isEmpty()) {
                                                if (!x().h()) {
                                                    w(arrayList.size() - 1);
                                                }
                                                if (te5Var4.E && te5Var4.c0) {
                                                    int size = arrayList.size() - 1;
                                                    while (true) {
                                                        if (size < 0) {
                                                            break;
                                                        }
                                                        long j29 = ((te5) arrayList.get(size)).h;
                                                        long j30 = te5Var4.h;
                                                        if (j29 < j30) {
                                                            break;
                                                        }
                                                        if (j29 == j30 && h(size)) {
                                                            w(size);
                                                            te5Var4.c0 = false;
                                                            break;
                                                        }
                                                        size--;
                                                    }
                                                }
                                            }
                                            this.p0 = te5Var4;
                                            this.W = te5Var4.d;
                                            this.h0 = j2;
                                            arrayList.add(te5Var4);
                                            jm5 p3 = mm5.p();
                                            for (sf5 sf5Var3 : this.M) {
                                                p3.c(Integer.valueOf(sf5Var3.z()));
                                            }
                                            w59 f3 = p3.f();
                                            te5Var4.U = this;
                                            te5Var4.Z = f3;
                                            for (sf5 sf5Var4 : this.M) {
                                                sf5Var4.getClass();
                                                sf5Var4.F = te5Var4.w;
                                                if (te5Var4.c0) {
                                                    sf5Var4.J = true;
                                                }
                                            }
                                        }
                                        this.L = zg2Var;
                                        mv6Var.r0(zg2Var, this, this.r.v3(zg2Var.c));
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
                te5 te5Var32 = te5Var2;
                re5Var.s.b(j10, j11, j3, list, b2);
                int n2 = re5Var.s.n();
                if (a == n2) {
                }
                b = of5VarArr[n2].b();
                se5 se5Var2 = re5Var.h;
                if (se5Var2 == null) {
                }
                if (ta3Var.g(b)) {
                }
                z5 = qxVar.b;
                zg2Var = (zg2) qxVar.c;
                Uri uri2 = (Uri) qxVar.d;
                if (zg2Var != null) {
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

    @Override // q4a
    public final long s() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.h0;
        }
        long j = this.g0;
        te5 x = x();
        if (!x.Y) {
            ArrayList arrayList = this.E;
            x = arrayList.size() > 1 ? (te5) b00.f(2, arrayList) : null;
        }
        if (x != null) {
            j = Math.max(j, x.n);
        }
        if (this.T) {
            for (sf5 sf5Var : this.M) {
                j = Math.max(j, sf5Var.s());
            }
        }
        return j;
    }

    @Override // q4a
    public final void t(long j) {
        mv6 mv6Var = this.s;
        if (mv6Var.S() || A()) {
            return;
        }
        boolean W = mv6Var.W();
        re5 re5Var = this.d;
        ArrayList arrayList = this.E;
        List list = this.F;
        if (W) {
            zg2 zg2Var = this.L;
            zg2Var.getClass();
            if (!(zg2Var instanceof te5) || h(arrayList.size() - 1)) {
                long j2 = this.l0;
                if (j2 == Long.MIN_VALUE || zg2Var.h < j2) {
                    if (!(re5Var.o == null ? re5Var.s.g(j, zg2Var, list) : false)) {
                        return;
                    }
                }
                mv6Var.p();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && re5Var.c((te5) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            w(size);
        }
        int min = Math.min(arrayList.size(), (re5Var.o != null || re5Var.s.length() < 2) ? list.size() : re5Var.s.l(j, list));
        if (this.l0 != Long.MIN_VALUE) {
            while (min > 0 && ((te5) arrayList.get(min - 1)).h >= this.l0) {
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

    @Override // h86
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        zg2 zg2Var = (zg2) k86Var;
        this.L = null;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.r.getClass();
        this.w.o(f86Var, zg2Var.c, this.b, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n);
        if (z) {
            return;
        }
        if (A() || this.V == 0) {
            E();
        }
        if (this.V > 0) {
            this.c.b(this);
        }
    }

    public final void w(int i) {
        ArrayList arrayList;
        gre.p(!this.s.W());
        while (true) {
            arrayList = this.E;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (h(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = x().n;
        te5 te5Var = (te5) arrayList.get(i);
        g8c.Y(i, arrayList.size(), arrayList);
        for (int i2 = 0; i2 < this.M.length; i2++) {
            this.M[i2].o(te5Var.g(i2));
        }
        if (arrayList.isEmpty()) {
            this.h0 = Math.max(this.g0, te5Var.h);
        } else {
            ((te5) jle.b(arrayList)).a0 = true;
        }
        this.k0 = false;
        this.w.A(te5Var.h, this.R, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    @Override // h86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        c86 c86Var;
        boolean z;
        long j3;
        boolean a;
        boolean z2;
        int v;
        i86 i86Var;
        boolean a2;
        int i2;
        zg2 zg2Var = (zg2) k86Var;
        re5 re5Var = this.d;
        se5 se5Var = re5Var.h;
        boolean z3 = zg2Var instanceof te5;
        if (z3 && !((te5) zg2Var).h() && (iOException instanceof lg5) && ((i2 = ((lg5) iOException).c) == 410 || i2 == 404)) {
            return mv6.x;
        }
        long j4 = zg2Var.r.b;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = j4;
        f86 f86Var = new f86(e86Var);
        g8c.i0(zg2Var.h);
        g8c.i0(zg2Var.n);
        dd ddVar = new dd((Object) iOException, i, (byte) 8);
        boolean z4 = zg2Var instanceof te5;
        if (z4) {
            c86Var = re5Var.a(((te5) zg2Var).y);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int length = re5Var.s.length();
            boolean z5 = se5Var != null && se5Var.k;
            c86Var = new c86(z5, 1, 0, length, re5Var.d(elapsedRealtime, z5));
        }
        this.r.getClass();
        d86 u3 = i2f.u3(c86Var, ddVar);
        if (u3 != null) {
            byte b = u3.a;
            if (se5Var == null || !se5Var.k) {
                se5Var = null;
            }
            int i3 = u3.b;
            z = z3;
            j3 = j4;
            long j5 = i3;
            if (b == 1) {
                if (se5Var != null) {
                    re5Var.s.f();
                    a = se5Var.a(j5);
                } else if (z4) {
                    ta3 ta3Var = re5Var.g;
                    Uri uri = ((te5) zg2Var).y;
                    sa3 sa3Var = (sa3) ta3Var.d.get(uri);
                    a = sa3Var != null ? sa3Var.a(j5, uri, null) : false;
                }
                z2 = a;
            } else {
                if (b != 2) {
                    sc8.j(de9.k(b, "Invalid fallback selection type: "));
                    return null;
                }
                int a3 = re5Var.i.a(zg2Var.d);
                if (a3 != -1 && (v = re5Var.s.v(a3)) != -1) {
                    a = re5Var.s.q(v, j5);
                    z2 = a;
                }
            }
            if (z2) {
                long w3 = i2f.w3(ddVar);
                i86Var = w3 != -9223372036854775807L ? new i86(0, w3) : mv6.E;
            } else {
                if (z && j3 == 0) {
                    ArrayList arrayList = this.E;
                    gre.p(((te5) tb4.l(1, arrayList)) == zg2Var);
                    if (arrayList.isEmpty()) {
                        this.h0 = this.g0;
                    } else {
                        ((te5) jle.b(arrayList)).a0 = true;
                    }
                }
                i86Var = mv6.y;
            }
            i86 i86Var2 = i86Var;
            a2 = i86Var2.a();
            this.w.r(f86Var, zg2Var.c, this.b, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, iOException, !a2);
            if (!a2) {
                this.L = null;
            }
            if (z2) {
                if (!this.U) {
                    s86 s86Var = new s86();
                    s86Var.a = this.g0;
                    r(new t86(s86Var));
                    return i86Var2;
                }
                this.c.b(this);
            }
            return i86Var2;
        }
        z = z3;
        j3 = j4;
        z2 = false;
        if (z2) {
        }
        i86 i86Var22 = i86Var;
        a2 = i86Var22.a();
        this.w.r(f86Var, zg2Var.c, this.b, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, iOException, !a2);
        if (!a2) {
        }
        if (z2) {
        }
        return i86Var22;
    }

    public final te5 x() {
        return (te5) b00.f(1, this.E);
    }

    @Override // l74
    public final void z() {
        this.m0 = true;
        this.I.post(this.H);
    }

    @Override // l74
    public final void g0(fv9 fv9Var) {
    }
}
