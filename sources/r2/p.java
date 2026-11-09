package r2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.t;
import e2.u;
import f3.j0;
import h2.k0;
import h2.m0;
import h2.x;
import h9.f0;
import h9.i0;
import h9.t1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.c0;
import j2.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l2.u0;
import l2.v0;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;
import org.telegram.utils.twidget.v;
import s2.w;
import x2.a1;
import x2.e1;
import x2.q1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class p implements b3.j, b3.m, e1, f3.q, a1 {
    public static final Set p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList D;
    public final List E;
    public final m F;
    public final m G;
    public final Handler H;
    public final ArrayList I;
    public final Map J;
    public y2.f K;
    public o[] L;
    public int[] M;
    public final HashSet N;
    public final SparseIntArray O;
    public n P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public u V;
    public u W;
    public boolean X;
    public q1 Y;
    public Set Z;
    public final String a;
    public int[] a0;
    public final int b;
    public int b0;
    public final rt c;
    public boolean c0;
    public final h d;
    public boolean[] d0;
    public final h6.m e;
    public boolean[] e0;
    public final u f;
    public long f0;
    public long g0;
    public final q2.m h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public long k0;
    public boolean l0;
    public long m0;
    public final q2.j n;
    public e2.r n0;
    public i o0;
    public final pb.b r;
    public final b3.o s;
    public final wa w;
    public final int x;
    public final androidx.activity.n y;

    /* JADX WARN: Type inference failed for: r2v13, types: [r2.m] */
    /* JADX WARN: Type inference failed for: r2v14, types: [r2.m] */
    public p(String str, int i7, rt rtVar, h hVar, Map map, h6.m mVar, long j3, u uVar, q2.m mVar2, q2.j jVar, pb.b bVar, wa waVar, int i10, c3.a aVar) {
        this.a = str;
        this.b = i7;
        this.c = rtVar;
        this.d = hVar;
        this.J = map;
        this.e = mVar;
        this.f = uVar;
        this.h = mVar2;
        this.n = jVar;
        this.r = bVar;
        this.w = waVar;
        this.x = i10;
        this.s = aVar != null ? new b3.o(aVar) : new b3.o("Loader:HlsSampleStreamWrapper");
        androidx.activity.n nVar = new androidx.activity.n(5);
        nVar.c = null;
        final int i11 = 0;
        nVar.b = false;
        nVar.d = null;
        this.y = nVar;
        this.M = new int[0];
        Set set = p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new o[0];
        this.e0 = new boolean[0];
        this.d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) { // from class: r2.m
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.z();
                        break;
                    default:
                        p pVar = this.b;
                        for (o oVar : pVar.L) {
                            oVar.K(pVar.k0);
                        }
                        pVar.S = true;
                        pVar.z();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.G = new Runnable(this) { // from class: r2.m
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.z();
                        break;
                    default:
                        p pVar = this.b;
                        for (o oVar : pVar.L) {
                            oVar.K(pVar.k0);
                        }
                        pVar.S = true;
                        pVar.z();
                        break;
                }
            }
        };
        this.H = m0.q(null);
        this.f0 = j3;
        this.g0 = j3;
        this.k0 = Long.MIN_VALUE;
    }

    public static f3.n s(int i7, int i10) {
        h2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i10);
        return new f3.n();
    }

    public static u u(u uVar, u uVar2, boolean z9) {
        String b10;
        if (uVar == null) {
            return uVar2;
        }
        String str = uVar.k;
        String str2 = uVar2.s;
        int h = s0.h(str2);
        if (m0.v(h, str) == 1) {
            b10 = m0.w(h, str);
            str2 = s0.d(b10);
        } else {
            b10 = s0.b(str, str2);
        }
        uVar2.n = uVar.n;
        uVar2.o = uVar.o;
        uVar2.p = uVar.p;
        uVar2.q = uVar.q;
        t a10 = uVar2.a();
        a10.a = uVar.a;
        a10.b = uVar.b;
        a10.c = i0.q(uVar.c);
        a10.d = uVar.d;
        a10.e = uVar.e;
        a10.f = uVar.f;
        a10.h = z9 ? uVar.h : -1;
        a10.i = z9 ? uVar.i : -1;
        a10.j = b10;
        a10.p = uVar.p;
        a10.n = uVar.o;
        a10.m = uVar.n;
        a10.o = uVar.q;
        if (h == 2) {
            a10.y = uVar.z;
            a10.z = uVar.A;
            a10.C = uVar.D;
        }
        if (str2 != null) {
            a10.r = s0.n(str2);
        }
        int i7 = uVar.K;
        if (i7 != -1 && h == 1) {
            a10.J = i7;
        }
        q0 q0Var = uVar.l;
        if (q0Var != null) {
            q0 q0Var2 = uVar2.l;
            if (q0Var2 != null) {
                q0Var = q0Var2.b(q0Var);
            }
            a10.k = q0Var;
        }
        return new u(a10);
    }

    public static int x(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A() {
        this.s.a();
        h hVar = this.d;
        x2.b bVar = hVar.n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = hVar.o;
        if (uri == null || !uri.equals(hVar.p)) {
            return;
        }
        hVar.g.h(hVar.o);
    }

    public final void B(m1[] m1VarArr, int... iArr) {
        this.Y = t(m1VarArr);
        this.Z = new HashSet();
        for (int i7 : iArr) {
            this.Z.add(this.Y.a(i7));
        }
        this.b0 = 0;
        this.H.post(new o5(this.c, 21));
        this.T = true;
    }

    public final void C() {
        for (o oVar : this.L) {
            oVar.G(this.h0);
        }
        this.h0 = false;
    }

    public final boolean D(long j3, boolean z9) {
        i iVar;
        boolean z10;
        boolean J;
        this.f0 = j3;
        if (y()) {
            this.g0 = j3;
            return true;
        }
        boolean z11 = this.d.q;
        ArrayList arrayList = this.D;
        if (z11) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iVar = (i) arrayList.get(i7);
                if (iVar.h == j3) {
                    break;
                }
            }
        }
        iVar = null;
        if (this.S && !z9 && !arrayList.isEmpty()) {
            int length = this.L.length;
            for (int i10 = 0; i10 < length; i10++) {
                o oVar = this.L[i10];
                if (iVar != null) {
                    J = oVar.I(iVar.f(i10));
                } else {
                    long e10 = e();
                    J = oVar.J(j3, e10 == Long.MIN_VALUE || j3 < e10);
                }
                if (!J && (this.e0[i10] || !this.c0)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return false;
            }
        }
        this.g0 = j3;
        this.j0 = false;
        arrayList.clear();
        b3.o oVar2 = this.s;
        if (!oVar2.d()) {
            oVar2.c = null;
            C();
            return true;
        }
        if (this.S) {
            for (o oVar3 : this.L) {
                oVar3.l();
            }
        }
        oVar2.b();
        return true;
    }

    @Override // b3.j
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        y2.f fVar = (y2.f) lVar;
        if (i7 == 0) {
            long j11 = fVar.a;
            uVar = new x2.u(fVar.b, j3);
        } else {
            long j12 = fVar.a;
            j2.m mVar = fVar.b;
            c0 c0Var = fVar.r;
            uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        }
        this.w.t(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [r2.o[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r2.o[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f3.j0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [r2.o, x2.b1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [f3.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // f3.q
    public final j0 O1(int i7, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = p0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            ia.f(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.M[i11] = i7;
                }
                r52 = this.M[i11] == i7 ? this.L[i11] : s(i7, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.L;
                if (i12 >= r12.length) {
                    break;
                }
                if (this.M[i12] == i7) {
                    r52 = r12[i12];
                    break;
                }
                i12++;
            }
        }
        if (r52 == 0) {
            if (this.l0) {
                return s(i7, i10);
            }
            int length = this.L.length;
            boolean z9 = i10 == 1 || i10 == 2;
            r52 = new o(this.e, this.h, this.n, this.J);
            r52.t = this.f0;
            if (z9) {
                r52.K = this.n0;
                r52.B = true;
            }
            long j3 = this.m0;
            if (r52.H != j3) {
                r52.H = j3;
                r52.B = true;
            }
            if (this.o0 != null) {
                r52.E = r6.w;
            }
            r52.f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i13);
            this.M = copyOf;
            copyOf[length] = i7;
            o[] oVarArr = this.L;
            String str = m0.a;
            ?? copyOf2 = Arrays.copyOf(oVarArr, oVarArr.length + 1);
            copyOf2[oVarArr.length] = r52;
            this.L = (o[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.e0, i13);
            this.e0 = copyOf3;
            copyOf3[length] = z9;
            this.c0 |= z9;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (x(i10) > x(this.Q)) {
                this.R = length;
                this.Q = i10;
            }
            this.d0 = Arrays.copyOf(this.d0, i13);
        }
        if (i10 != 5) {
            return r52;
        }
        if (this.P == null) {
            this.P = new n(r52, this.x);
        }
        return this.P;
    }

    @Override // f3.q
    public final void U0() {
        this.l0 = true;
        this.H.post(this.G);
    }

    @Override // x2.a1
    public final void a() {
        this.H.post(this.F);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04a2  */
    @Override // x2.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(v0 v0Var) {
        long max;
        long j3;
        List list;
        long j10;
        int a10;
        v0 v0Var2;
        vy vyVar;
        long j11;
        h hVar;
        boolean z9;
        Uri c10;
        long j12;
        long j13;
        long j14;
        i iVar;
        h hVar2;
        g f10;
        long j15;
        boolean z10;
        androidx.activity.n nVar;
        boolean z11;
        c cVar;
        boolean z12;
        vy vyVar2;
        byte[] bArr;
        b3.o oVar;
        boolean z13;
        byte[] bArr2;
        j2.h hVar3;
        s2.j jVar;
        m2.j jVar2;
        j2.m mVar;
        j2.h hVar4;
        boolean z14;
        t3.h hVar5;
        x xVar;
        b bVar;
        k0 k0Var;
        byte[] bArr3;
        j2.h hVar6;
        String str;
        boolean z15;
        s2.c cVar2;
        if (!this.j0) {
            b3.o oVar2 = this.s;
            if (!oVar2.d() && !oVar2.c()) {
                if (y()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.g0;
                    for (o oVar3 : this.L) {
                        oVar3.t = this.g0;
                    }
                    list = list2;
                    j3 = max;
                } else {
                    i w10 = w();
                    boolean z16 = w10.X;
                    long j16 = w10.h;
                    if (z16 && w10.g()) {
                        long j17 = w10.a0;
                        max = j17 != -9223372036854775807L ? j16 + j17 : -9223372036854775807L;
                    } else {
                        max = Math.max(this.f0, j16);
                    }
                    long j18 = this.f0;
                    boolean z17 = this.S;
                    List list3 = this.E;
                    if (z17) {
                        for (o oVar4 : this.L) {
                            j18 = Math.max(j18, oVar4.t());
                        }
                    }
                    j3 = j18;
                    list = list3;
                }
                androidx.activity.n nVar2 = this.y;
                nVar2.c = null;
                nVar2.b = false;
                nVar2.d = null;
                boolean z18 = this.T || !list.isEmpty();
                h hVar7 = this.d;
                vy vyVar3 = hVar7.j;
                w[] wVarArr = hVar7.e;
                s2.d dVar = hVar7.g;
                i iVar2 = list.isEmpty() ? null : (i) h9.o.n(list);
                if (iVar2 == null) {
                    j10 = -9223372036854775807L;
                    a10 = -1;
                    vyVar = vyVar3;
                    v0Var2 = v0Var;
                } else {
                    j10 = -9223372036854775807L;
                    a10 = hVar7.h.a(iVar2.d);
                    v0Var2 = v0Var;
                    vyVar = vyVar3;
                }
                long j19 = v0Var2.a;
                long j20 = max - j19;
                long j21 = hVar7.s;
                long j22 = j21 != j10 ? j21 - j19 : j10;
                if (iVar2 == null || hVar7.q) {
                    j11 = j22;
                    hVar = hVar7;
                } else {
                    hVar = hVar7;
                    j11 = j22;
                    long j23 = iVar2.n - iVar2.h;
                    j20 = Math.max(0L, j20 - j23);
                    if (j11 != j10) {
                        j11 = Math.max(0L, j11 - j23);
                    }
                }
                y2.m[] b10 = hVar.b(iVar2, max);
                if (a10 != -1) {
                    a3.u uVar = hVar.r;
                    if (uVar.a(uVar.u(a10), SystemClock.elapsedRealtime())) {
                        z9 = true;
                        long j24 = max;
                        i iVar3 = iVar2;
                        hVar.r.e(j19, j20, j11, list, b10);
                        int m10 = hVar.r.m();
                        boolean z19 = a10 == m10;
                        c10 = wVarArr[m10].c();
                        if (dVar.f(c10)) {
                            nVar2.d = c10;
                            hVar.p = c10;
                            oVar = oVar2;
                            nVar = nVar2;
                        } else {
                            s2.m b11 = dVar.b(c10, true);
                            b11.getClass();
                            long j25 = b11.h;
                            hVar.q = b11.c;
                            if (b11.o) {
                                j12 = j25;
                                j13 = j10;
                            } else {
                                j12 = j25;
                                j13 = (j12 + b11.u) - dVar.I;
                            }
                            hVar.s = j13;
                            long j26 = j12 - dVar.I;
                            h hVar8 = hVar;
                            Pair e10 = hVar8.e(iVar3, z19, b11, j26, j24);
                            boolean z20 = z9;
                            long longValue = ((Long) e10.first).longValue();
                            int intValue = ((Integer) e10.second).intValue();
                            if (!z19 || z20 || iVar3 == null) {
                                j14 = j26;
                            } else {
                                j14 = j26;
                                if (longValue < b11.k || ((f10 = h.f(b11, longValue, intValue)) != null && j14 + f10.a.e < j3)) {
                                    c10 = wVarArr[a10].c();
                                    b11 = dVar.b(c10, true);
                                    b11.getClass();
                                    long j27 = b11.h - dVar.I;
                                    Pair e11 = hVar8.e(iVar3, false, b11, j27, j24);
                                    iVar = iVar3;
                                    long longValue2 = ((Long) e11.first).longValue();
                                    intValue = ((Integer) e11.second).intValue();
                                    m10 = a10;
                                    j14 = j27;
                                    hVar2 = hVar8;
                                    longValue = longValue2;
                                    String str2 = b11.a;
                                    boolean z21 = b11.c;
                                    j15 = b11.k;
                                    i0 i0Var = b11.r;
                                    if (m10 == a10) {
                                        if (a10 != -1) {
                                            Uri c11 = wVarArr[a10].c();
                                            s2.c cVar3 = (s2.c) dVar.d.get(c11);
                                            if (cVar3 != null) {
                                                s2.b bVar2 = (s2.b) f1.l(cVar3.b, c11, c11);
                                                bVar2.getClass();
                                                bVar2.x = false;
                                            }
                                        }
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    if (longValue >= j15) {
                                        hVar2.n = new x2.b();
                                        oVar = oVar2;
                                        nVar = nVar2;
                                    } else {
                                        g f11 = h.f(b11, longValue, intValue);
                                        if (f11 == null) {
                                            if (b11.o) {
                                                nVar = nVar2;
                                                if (z18 || i0Var.isEmpty()) {
                                                    nVar.b = z10;
                                                } else {
                                                    f11 = new g((s2.k) h9.o.n(i0Var), (j15 + i0Var.size()) - 1, -1);
                                                }
                                            } else {
                                                nVar = nVar2;
                                                nVar.d = c10;
                                                hVar2.p = c10;
                                            }
                                            oVar = oVar2;
                                        } else {
                                            nVar = nVar2;
                                        }
                                        boolean z22 = f11.d;
                                        s2.k kVar = f11.a;
                                        hVar2.p = null;
                                        SystemClock.elapsedRealtime();
                                        s2.j jVar3 = kVar.b;
                                        long j28 = kVar.e;
                                        Uri g10 = (jVar3 == null || (str = jVar3.h) == null) ? null : h2.e.g(str2, str);
                                        d g11 = hVar2.g(g10, m10, true);
                                        nVar.c = g11;
                                        if (g11 == null) {
                                            String str3 = kVar.h;
                                            Uri g12 = str3 == null ? null : h2.e.g(str2, str3);
                                            d g13 = hVar2.g(g12, m10, false);
                                            nVar.c = g13;
                                            if (g13 == null) {
                                                boolean z23 = kVar instanceof s2.h ? ((s2.h) kVar).x || (f11.c == 0 && z21) : z21;
                                                if (iVar == null) {
                                                    AtomicInteger atomicInteger = i.c0;
                                                } else if (!c10.equals(iVar.y) || !iVar.X) {
                                                    long j29 = j14 + j28;
                                                    if (!z23 || j29 < j24) {
                                                        z11 = true;
                                                        if (z11 || !z22) {
                                                            c cVar4 = hVar2.a;
                                                            j2.h hVar9 = hVar2.b;
                                                            u uVar2 = hVar2.f[m10];
                                                            List list4 = hVar2.i;
                                                            int o4 = hVar2.r.o();
                                                            Object r10 = hVar2.r.r();
                                                            boolean z24 = hVar2.l;
                                                            org.telegram.ui.Components.n nVar3 = hVar2.d;
                                                            if (g12 != null) {
                                                                vyVar.getClass();
                                                                cVar = cVar4;
                                                                z12 = z24;
                                                                vyVar2 = vyVar;
                                                                bArr = null;
                                                            } else {
                                                                cVar = cVar4;
                                                                z12 = z24;
                                                                vyVar2 = vyVar;
                                                                bArr = (byte[]) ((v) vyVar2.b).get(g12);
                                                            }
                                                            byte[] bArr4 = g10 != null ? null : (byte[]) ((v) vyVar2.b).get(g10);
                                                            m2.j jVar4 = hVar2.k;
                                                            AtomicInteger atomicInteger2 = i.c0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri g14 = h2.e.g(str2, kVar.a);
                                                            oVar = oVar2;
                                                            long j30 = kVar.r;
                                                            long j31 = kVar.s;
                                                            int i7 = !z22 ? 8 : 0;
                                                            ia.k(g14, "The uri must be set.");
                                                            j2.m mVar2 = new j2.m(g14, 1, null, map, j30, j31, null, i7);
                                                            z13 = bArr == null;
                                                            if (z13) {
                                                                bArr2 = null;
                                                            } else {
                                                                String str4 = kVar.n;
                                                                str4.getClass();
                                                                bArr2 = i.e(str4);
                                                            }
                                                            if (bArr == null) {
                                                                bArr2.getClass();
                                                                hVar3 = new a(hVar9, bArr, bArr2);
                                                            } else {
                                                                hVar3 = hVar9;
                                                            }
                                                            jVar = kVar.b;
                                                            if (jVar == null) {
                                                                boolean z25 = bArr4 != null;
                                                                if (z25) {
                                                                    String str5 = jVar.n;
                                                                    str5.getClass();
                                                                    bArr3 = i.e(str5);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z26 = z25;
                                                                Uri g15 = h2.e.g(str2, jVar.a);
                                                                jVar2 = jVar4;
                                                                long j32 = jVar.r;
                                                                long j33 = jVar.s;
                                                                ia.k(g15, "The uri must be set.");
                                                                j2.m mVar3 = new j2.m(g15, 1, null, map, j32, j33, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    hVar6 = new a(hVar9, bArr4, bArr3);
                                                                } else {
                                                                    hVar6 = hVar9;
                                                                }
                                                                hVar4 = hVar6;
                                                                z14 = z26;
                                                                mVar = mVar3;
                                                            } else {
                                                                jVar2 = jVar4;
                                                                mVar = null;
                                                                hVar4 = null;
                                                                z14 = false;
                                                            }
                                                            long j34 = j14 + j28;
                                                            long j35 = j34 + kVar.c;
                                                            int i10 = b11.j + kVar.d;
                                                            if (iVar == null) {
                                                                j2.m mVar4 = iVar.G;
                                                                boolean z27 = mVar == mVar4 || (mVar != null && mVar4 != null && mVar.a.equals(mVar4.a) && mVar.e == mVar4.e);
                                                                boolean z28 = c10.equals(iVar.y) && iVar.X;
                                                                hVar5 = iVar.O;
                                                                xVar = iVar.P;
                                                                bVar = (z27 && z28 && !iVar.Z && iVar.x == i10) ? iVar.S : null;
                                                            } else {
                                                                hVar5 = new t3.h(null);
                                                                xVar = new x(10);
                                                                bVar = null;
                                                            }
                                                            t3.h hVar10 = hVar5;
                                                            x xVar2 = xVar;
                                                            long j36 = f11.b;
                                                            int i11 = f11.c;
                                                            boolean z29 = !z22;
                                                            boolean z30 = kVar.w;
                                                            SparseArray sparseArray = (SparseArray) nVar3.a;
                                                            k0Var = (k0) sparseArray.get(i10);
                                                            if (k0Var == null) {
                                                                k0Var = new k0(9223372036854775806L);
                                                                sparseArray.put(i10, k0Var);
                                                            }
                                                            nVar.c = new i(cVar, hVar3, mVar2, uVar2, z13, hVar4, mVar, z14, c10, list4, o4, r10, j34, j35, j36, i11, z29, i10, z30, z12, k0Var, kVar.f, bVar, hVar10, xVar2, z11, z23, jVar2);
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                if (z11) {
                                                }
                                                c cVar42 = hVar2.a;
                                                j2.h hVar92 = hVar2.b;
                                                u uVar22 = hVar2.f[m10];
                                                List list42 = hVar2.i;
                                                int o42 = hVar2.r.o();
                                                Object r102 = hVar2.r.r();
                                                boolean z242 = hVar2.l;
                                                org.telegram.ui.Components.n nVar32 = hVar2.d;
                                                if (g12 != null) {
                                                }
                                                if (g10 != null) {
                                                }
                                                m2.j jVar42 = hVar2.k;
                                                AtomicInteger atomicInteger22 = i.c0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri g142 = h2.e.g(str2, kVar.a);
                                                oVar = oVar2;
                                                long j302 = kVar.r;
                                                long j312 = kVar.s;
                                                if (!z22) {
                                                }
                                                ia.k(g142, "The uri must be set.");
                                                j2.m mVar22 = new j2.m(g142, 1, null, map2, j302, j312, null, i7);
                                                if (bArr == null) {
                                                }
                                                if (z13) {
                                                }
                                                if (bArr == null) {
                                                }
                                                jVar = kVar.b;
                                                if (jVar == null) {
                                                }
                                                long j342 = j14 + j28;
                                                long j352 = j342 + kVar.c;
                                                int i102 = b11.j + kVar.d;
                                                if (iVar == null) {
                                                }
                                                t3.h hVar102 = hVar5;
                                                x xVar22 = xVar;
                                                long j362 = f11.b;
                                                int i112 = f11.c;
                                                boolean z292 = !z22;
                                                boolean z302 = kVar.w;
                                                SparseArray sparseArray2 = (SparseArray) nVar32.a;
                                                k0Var = (k0) sparseArray2.get(i102);
                                                if (k0Var == null) {
                                                }
                                                nVar.c = new i(cVar, hVar3, mVar22, uVar22, z13, hVar4, mVar, z14, c10, list42, o42, r102, j342, j352, j362, i112, z292, i102, z302, z12, k0Var, kVar.f, bVar, hVar102, xVar22, z11, z23, jVar2);
                                            }
                                        }
                                        oVar = oVar2;
                                    }
                                }
                            }
                            iVar = iVar3;
                            hVar2 = hVar8;
                            String str22 = b11.a;
                            boolean z212 = b11.c;
                            j15 = b11.k;
                            i0 i0Var2 = b11.r;
                            if (m10 == a10) {
                            }
                            if (longValue >= j15) {
                            }
                        }
                        z15 = nVar.b;
                        y2.f fVar = (y2.f) nVar.c;
                        Uri uri = (Uri) nVar.d;
                        if (!z15) {
                            this.g0 = j10;
                            this.j0 = true;
                            return true;
                        }
                        if (fVar == null) {
                            if (uri == null || (cVar2 = (s2.c) ((j) this.c.b).b.d.get(uri)) == null) {
                                return false;
                            }
                            s2.c.b(cVar2, uri, true);
                            return false;
                        }
                        if (fVar instanceof i) {
                            i iVar4 = (i) fVar;
                            ArrayList arrayList = this.D;
                            if (!arrayList.isEmpty()) {
                                if (!w().g()) {
                                    v(arrayList.size() - 1);
                                }
                                if (iVar4.D && iVar4.b0) {
                                    int size = arrayList.size() - 1;
                                    while (true) {
                                        if (size < 0) {
                                            break;
                                        }
                                        long j37 = ((i) arrayList.get(size)).h;
                                        long j38 = iVar4.h;
                                        if (j37 < j38) {
                                            break;
                                        }
                                        if (j37 == j38 && m(size)) {
                                            v(size);
                                            iVar4.b0 = false;
                                            break;
                                        }
                                        size--;
                                    }
                                }
                            }
                            this.o0 = iVar4;
                            this.V = iVar4.d;
                            this.g0 = -9223372036854775807L;
                            arrayList.add(iVar4);
                            f0 p10 = i0.p();
                            for (o oVar5 : this.L) {
                                p10.c(Integer.valueOf(oVar5.q + oVar5.p));
                            }
                            t1 f12 = p10.f();
                            iVar4.T = this;
                            iVar4.Y = f12;
                            for (o oVar6 : this.L) {
                                oVar6.getClass();
                                oVar6.E = iVar4.w;
                                if (iVar4.b0) {
                                    oVar6.I = true;
                                }
                            }
                        }
                        this.K = fVar;
                        oVar.f(fVar, this, this.r.X0(fVar.c));
                        return true;
                    }
                }
                z9 = false;
                long j242 = max;
                i iVar32 = iVar2;
                hVar.r.e(j19, j20, j11, list, b10);
                int m102 = hVar.r.m();
                if (a10 == m102) {
                }
                c10 = wVarArr[m102].c();
                if (dVar.f(c10)) {
                }
                z15 = nVar.b;
                y2.f fVar2 = (y2.f) nVar.c;
                Uri uri2 = (Uri) nVar.d;
                if (!z15) {
                }
            }
        }
        return false;
    }

    @Override // b3.m
    public final void d() {
        for (o oVar : this.L) {
            oVar.G(true);
            q2.g gVar = oVar.h;
            if (gVar != null) {
                gVar.c(oVar.e);
                oVar.h = null;
                oVar.g = null;
            }
        }
    }

    @Override // x2.e1
    public final long e() {
        if (y()) {
            return this.g0;
        }
        if (this.j0) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    @Override // x2.e1
    public final boolean g() {
        return this.s.d();
    }

    public final void l() {
        ia.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean m(int i7) {
        int i10 = i7;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                i iVar = (i) arrayList.get(i7);
                for (int i11 = 0; i11 < this.L.length; i11++) {
                    if (this.L[i11].v() > iVar.f(i11)) {
                        return false;
                    }
                }
                return true;
            }
            if (((i) arrayList.get(i10)).b0) {
                return false;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    @Override // b3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        boolean c10;
        boolean z9;
        int u10;
        b3.i iVar;
        boolean a10;
        int i10;
        y2.f fVar = (y2.f) lVar;
        boolean z10 = fVar instanceof i;
        if (z10 && !((i) fVar).g() && (iOException instanceof y) && ((i10 = ((y) iOException).c) == 410 || i10 == 404)) {
            return b3.o.d;
        }
        long j11 = fVar.r.b;
        j2.m mVar = fVar.b;
        c0 c0Var = fVar.r;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, j11);
        m0.h0(fVar.h);
        m0.h0(fVar.n);
        f5.u uVar2 = new f5.u(iOException, i7, 2);
        boolean z11 = fVar instanceof i;
        h hVar = this.d;
        b3.h a11 = z11 ? hVar.a(((i) fVar).y) : new b3.h(1, 0, hVar.r.length(), hVar.d(SystemClock.elapsedRealtime()));
        this.r.getClass();
        b3.i V0 = pb.b.V0(a11, uVar2);
        if (V0 != null) {
            int i11 = V0.a;
            long j12 = V0.b;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException(jg.g.j(i11, "Invalid fallback selection type: "));
                }
                int a12 = hVar.h.a(fVar.d);
                if (a12 != -1 && (u10 = hVar.r.u(a12)) != -1) {
                    c10 = hVar.r.p(u10, j12);
                    z9 = c10;
                }
            } else if (z11) {
                s2.d dVar = hVar.g;
                Uri uri = ((i) fVar).y;
                s2.c cVar = (s2.c) dVar.d.get(uri);
                c10 = cVar != null ? s2.c.c(cVar, uri, j12) : false;
                z9 = c10;
            }
            if (z9) {
                long a13 = pb.b.a1(uVar2);
                iVar = a13 != -9223372036854775807L ? new b3.i(0, a13, false) : b3.o.f;
            } else {
                if (z10 && j11 == 0) {
                    ArrayList arrayList = this.D;
                    ia.p(((i) f1.k(1, arrayList)) == fVar);
                    if (arrayList.isEmpty()) {
                        this.g0 = this.f0;
                    } else {
                        ((i) h9.o.n(arrayList)).Z = true;
                    }
                }
                iVar = b3.o.e;
            }
            b3.i iVar2 = iVar;
            a10 = iVar2.a();
            this.w.q(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
            if (!a10) {
                this.K = null;
            }
            if (z9) {
                if (!this.T) {
                    u0 u0Var = new u0();
                    u0Var.a = this.f0;
                    c(new v0(u0Var));
                    return iVar2;
                }
                this.c.d(this);
            }
            return iVar2;
        }
        z9 = false;
        if (z9) {
        }
        b3.i iVar22 = iVar;
        a10 = iVar22.a();
        this.w.q(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
        if (!a10) {
        }
        if (z9) {
        }
        return iVar22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b3.j
    public final void o1(b3.l lVar, long j3, long j10) {
        y2.f fVar = (y2.f) lVar;
        this.K = null;
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            byte[] bArr = dVar.s;
            h hVar = this.d;
            hVar.m = bArr;
            vy vyVar = hVar.j;
            Uri uri = dVar.b.a;
            byte[] bArr2 = dVar.x;
            bArr2.getClass();
            v vVar = (v) vyVar.b;
            uri.getClass();
        }
        long j11 = fVar.a;
        j2.m mVar = fVar.b;
        c0 c0Var = fVar.r;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.r.getClass();
        this.w.p(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (this.T) {
            this.c.d(this);
            return;
        }
        u0 u0Var = new u0();
        u0Var.a = this.f0;
        c(new v0(u0Var));
    }

    @Override // x2.e1
    public final long p() {
        if (this.j0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.g0;
        }
        long j3 = this.f0;
        i w10 = w();
        if (!w10.X) {
            ArrayList arrayList = this.D;
            w10 = arrayList.size() > 1 ? (i) jg.g.i(2, arrayList) : null;
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.n);
        }
        if (this.S) {
            for (o oVar : this.L) {
                j3 = Math.max(j3, oVar.s());
            }
        }
        return j3;
    }

    @Override // b3.j
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        y2.f fVar = (y2.f) lVar;
        this.K = null;
        long j11 = fVar.a;
        j2.m mVar = fVar.b;
        c0 c0Var = fVar.r;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.r.getClass();
        this.w.o(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z9) {
            return;
        }
        if (y() || this.U == 0) {
            C();
        }
        if (this.U > 0) {
            this.c.d(this);
        }
    }

    @Override // x2.e1
    public final void r(long j3) {
        b3.o oVar = this.s;
        if (oVar.c() || y()) {
            return;
        }
        boolean d = oVar.d();
        boolean z9 = false;
        int i7 = 0;
        z9 = false;
        h hVar = this.d;
        List list = this.E;
        if (d) {
            this.K.getClass();
            if (hVar.n == null ? hVar.r.k(j3, this.K, list) : false) {
                oVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && hVar.c((i) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            v(size);
        }
        int size2 = (hVar.n != null || hVar.r.length() < 2) ? list.size() : hVar.r.j(j3, list);
        if (size2 < this.D.size()) {
            v(size2);
        }
        if (this.S && this.k0 != Long.MIN_VALUE) {
            boolean z10 = true;
            while (true) {
                o[] oVarArr = this.L;
                if (i7 >= oVarArr.length) {
                    break;
                }
                if (this.d0[i7] && (this.e0[i7] || !this.c0)) {
                    z10 &= oVarArr[i7].z();
                }
                i7++;
            }
            z9 = z10;
        }
        if (z9) {
            this.j0 = true;
        }
    }

    public final q1 t(m1[] m1VarArr) {
        for (int i7 = 0; i7 < m1VarArr.length; i7++) {
            m1 m1Var = m1VarArr[i7];
            u[] uVarArr = new u[m1Var.a];
            for (int i10 = 0; i10 < m1Var.a; i10++) {
                u uVar = m1Var.d[i10];
                int F = this.h.F(uVar);
                t a10 = uVar.a();
                a10.S = F;
                uVarArr[i10] = new u(a10);
            }
            m1VarArr[i7] = new m1(m1Var.b, uVarArr);
        }
        return new q1(m1VarArr);
    }

    public final void v(int i7) {
        ArrayList arrayList;
        ia.p(!this.s.d());
        while (true) {
            arrayList = this.D;
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            } else if (m(i7)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        long j3 = w().n;
        i iVar = (i) arrayList.get(i7);
        m0.X(i7, arrayList.size(), arrayList);
        for (int i10 = 0; i10 < this.L.length; i10++) {
            this.L[i10].o(iVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.g0 = this.f0;
        } else {
            ((i) h9.o.n(arrayList)).Z = true;
        }
        this.j0 = false;
        this.w.A(iVar.h, this.Q, j3);
    }

    public final i w() {
        return (i) jg.g.i(1, this.D);
    }

    public final boolean y() {
        return this.g0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z() {
        int i7;
        if (!this.X && this.a0 == null && this.S) {
            int i10 = 0;
            for (o oVar : this.L) {
                if (oVar.y() == null) {
                    return;
                }
            }
            q1 q1Var = this.Y;
            if (q1Var != null) {
                int i11 = q1Var.a;
                int[] iArr = new int[i11];
                this.a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        o[] oVarArr = this.L;
                        if (i13 < oVarArr.length) {
                            u y10 = oVarArr[i13].y();
                            y10.getClass();
                            u uVar = this.Y.a(i12).d[0];
                            String str = y10.s;
                            String str2 = uVar.s;
                            int h = s0.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y10.P == uVar.P) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                            } else if (h == s0.h(str2)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.a0[i12] = i13;
                }
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((l) obj).b();
                }
                return;
            }
            int length = this.L.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                u y11 = this.L[i14].y();
                y11.getClass();
                String str3 = y11.s;
                if (s0.m(str3)) {
                    i17 = 2;
                } else if (!s0.i(str3)) {
                    i17 = s0.l(str3) ? 3 : -2;
                }
                if (x(i17) > x(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            m1 m1Var = this.d.h;
            int i18 = m1Var.a;
            this.b0 = -1;
            this.a0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.a0[i19] = i19;
            }
            m1[] m1VarArr = new m1[length];
            int i20 = 0;
            while (i20 < length) {
                u y12 = this.L[i20].y();
                y12.getClass();
                u uVar2 = this.f;
                String str4 = this.a;
                if (i20 == i15) {
                    u[] uVarArr = new u[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        u uVar3 = m1Var.d[i21];
                        if (i16 == 1 && uVar2 != null) {
                            uVar3 = uVar3.d(uVar2);
                        }
                        uVarArr[i21] = i18 == 1 ? y12.d(uVar3) : u(uVar3, y12, true);
                    }
                    m1VarArr[i20] = new m1(str4, uVarArr);
                    this.b0 = i20;
                    i7 = 0;
                } else {
                    if (i16 != 2 || !s0.i(y12.s)) {
                        uVar2 = null;
                    }
                    StringBuilder j3 = rf.b.j(str4, ":muxed:");
                    j3.append(i20 < i15 ? i20 : i20 - 1);
                    String sb2 = j3.toString();
                    i7 = 0;
                    t a10 = u(uVar2, y12, false).a();
                    a10.l = str4;
                    m1VarArr[i20] = new m1(sb2, new u(a10));
                }
                i20++;
                i10 = i7;
            }
            int i22 = i10;
            this.Y = t(m1VarArr);
            ia.p(this.Z == null ? 1 : i22);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.c.m0();
        }
    }

    @Override // f3.q
    public final void f(f3.c0 c0Var) {
    }
}
