package r2;

import a8.la;
import a8.xa;
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
import h2.k0;
import h2.l0;
import h2.x;
import h9.f0;
import h9.i0;
import h9.t1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l2.r0;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.of;
import org.telegram.ui.web.z0;
import s2.w;
import x2.b1;
import x2.f1;
import x2.r1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class p implements b3.k, b3.n, f1, f3.q, b1 {
    public static final Set q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final m G;
    public final m H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public y2.f L;
    public o[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public n Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public u W;
    public u X;
    public boolean Y;
    public r1 Z;
    public final String a;
    public Set a0;
    public final int b;
    public int[] b0;
    public final of c;
    public int c0;
    public final h d;
    public boolean d0;
    public final h6.m e;
    public boolean[] e0;
    public final u f;
    public boolean[] f0;
    public long g0;
    public final q2.m h;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final q2.j n;
    public long n0;
    public e2.r o0;
    public i p0;
    public final qb.a r;
    public final b3.p s;
    public final xa w;
    public final int x;
    public final androidx.activity.n y;

    /* JADX WARN: Type inference failed for: r2v13, types: [r2.m] */
    /* JADX WARN: Type inference failed for: r2v14, types: [r2.m] */
    public p(String str, int i7, of ofVar, h hVar, Map map, h6.m mVar, long j3, u uVar, q2.m mVar2, q2.j jVar, qb.a aVar, xa xaVar, int i10, c3.a aVar2) {
        this.a = str;
        this.b = i7;
        this.c = ofVar;
        this.d = hVar;
        this.K = map;
        this.e = mVar;
        this.f = uVar;
        this.h = mVar2;
        this.n = jVar;
        this.r = aVar;
        this.w = xaVar;
        this.x = i10;
        this.s = aVar2 != null ? new b3.p(aVar2) : new b3.p("Loader:HlsSampleStreamWrapper");
        androidx.activity.n nVar = new androidx.activity.n(6);
        nVar.c = null;
        final int i11 = 0;
        nVar.b = false;
        nVar.d = null;
        this.y = nVar;
        this.N = new int[0];
        Set set = q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new o[0];
        this.f0 = new boolean[0];
        this.e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) { // from class: r2.m
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.D();
                        break;
                    default:
                        p pVar = this.b;
                        for (o oVar : pVar.M) {
                            oVar.K(pVar.l0);
                        }
                        pVar.T = true;
                        pVar.D();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.H = new Runnable(this) { // from class: r2.m
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.D();
                        break;
                    default:
                        p pVar = this.b;
                        for (o oVar : pVar.M) {
                            oVar.K(pVar.l0);
                        }
                        pVar.T = true;
                        pVar.D();
                        break;
                }
            }
        };
        this.I = l0.q(null);
        this.g0 = j3;
        this.h0 = j3;
        this.l0 = Long.MIN_VALUE;
    }

    public static int B(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static f3.n v(int i7, int i10) {
        h2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i10);
        return new f3.n();
    }

    public static u x(u uVar, u uVar2, boolean z10) {
        String b10;
        if (uVar == null) {
            return uVar2;
        }
        String str = uVar.k;
        String str2 = uVar2.s;
        int h = s0.h(str2);
        if (l0.v(h, str) == 1) {
            b10 = l0.w(h, str);
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
        a10.h = z10 ? uVar.h : -1;
        a10.i = z10 ? uVar.i : -1;
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

    public final i A() {
        return (i) i5.c.h(1, this.E);
    }

    public final boolean C() {
        return this.h0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        int i7;
        if (!this.Y && this.b0 == null && this.T) {
            int i10 = 0;
            for (o oVar : this.M) {
                if (oVar.y() == null) {
                    return;
                }
            }
            r1 r1Var = this.Z;
            if (r1Var != null) {
                int i11 = r1Var.a;
                int[] iArr = new int[i11];
                this.b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        o[] oVarArr = this.M;
                        if (i13 < oVarArr.length) {
                            u y10 = oVarArr[i13].y();
                            y10.getClass();
                            u uVar = this.Z.a(i12).d[0];
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
                    this.b0[i12] = i13;
                }
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((l) obj).b();
                }
                return;
            }
            int length = this.M.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                u y11 = this.M[i14].y();
                y11.getClass();
                String str3 = y11.s;
                if (s0.m(str3)) {
                    i17 = 2;
                } else if (!s0.i(str3)) {
                    i17 = s0.l(str3) ? 3 : -2;
                }
                if (B(i17) > B(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            m1 m1Var = this.d.h;
            int i18 = m1Var.a;
            this.c0 = -1;
            this.b0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.b0[i19] = i19;
            }
            m1[] m1VarArr = new m1[length];
            int i20 = 0;
            while (i20 < length) {
                u y12 = this.M[i20].y();
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
                        uVarArr[i21] = i18 == 1 ? y12.d(uVar3) : x(uVar3, y12, true);
                    }
                    m1VarArr[i20] = new m1(str4, uVarArr);
                    this.c0 = i20;
                    i7 = 0;
                } else {
                    if (i16 != 2 || !s0.i(y12.s)) {
                        uVar2 = null;
                    }
                    StringBuilder n10 = p5.c.n(str4, ":muxed:");
                    n10.append(i20 < i15 ? i20 : i20 - 1);
                    String sb2 = n10.toString();
                    i7 = 0;
                    t a10 = x(uVar2, y12, false).a();
                    a10.l = str4;
                    m1VarArr[i20] = new m1(sb2, new u(a10));
                }
                i20++;
                i10 = i7;
            }
            int i22 = i10;
            this.Z = w(m1VarArr);
            la.p(this.a0 == null ? 1 : i22);
            this.a0 = Collections.EMPTY_SET;
            this.U = true;
            this.c.v0();
        }
    }

    public final void E() {
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

    public final void F(m1[] m1VarArr, int... iArr) {
        this.Z = w(m1VarArr);
        this.a0 = new HashSet();
        for (int i7 : iArr) {
            this.a0.add(this.Z.a(i7));
        }
        this.c0 = 0;
        this.I.post(new z0(this.c, 6));
        this.U = true;
    }

    public final void G() {
        for (o oVar : this.M) {
            oVar.G(this.i0);
        }
        this.i0 = false;
    }

    public final boolean H(long j3, boolean z10) {
        i iVar;
        boolean z11;
        boolean J;
        this.g0 = j3;
        if (C()) {
            this.h0 = j3;
            return true;
        }
        boolean z12 = this.d.q;
        ArrayList arrayList = this.E;
        if (z12) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iVar = (i) arrayList.get(i7);
                if (iVar.h == j3) {
                    break;
                }
            }
        }
        iVar = null;
        if (this.T && !z10 && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (int i10 = 0; i10 < length; i10++) {
                o oVar = this.M[i10];
                if (iVar != null) {
                    J = oVar.I(iVar.f(i10));
                } else {
                    long e10 = e();
                    J = oVar.J(j3, e10 == Long.MIN_VALUE || j3 < e10);
                }
                if (!J && (this.f0[i10] || !this.d0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.h0 = j3;
        this.k0 = false;
        arrayList.clear();
        b3.p pVar = this.s;
        if (!pVar.d()) {
            pVar.c = null;
            G();
            return true;
        }
        if (this.T) {
            for (o oVar2 : this.M) {
                oVar2.l();
            }
        }
        pVar.b();
        return true;
    }

    @Override // x2.b1
    public final void a() {
        this.I.post(this.G);
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
    @Override // x2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(l2.s0 s0Var) {
        long max;
        long j3;
        List list;
        long j10;
        int a10;
        l2.s0 s0Var2;
        hn hnVar;
        long j11;
        h hVar;
        boolean z10;
        Uri c10;
        long j12;
        long j13;
        long j14;
        i iVar;
        h hVar2;
        g f10;
        long j15;
        boolean z11;
        androidx.activity.n nVar;
        boolean z12;
        c cVar;
        boolean z13;
        hn hnVar2;
        byte[] bArr;
        b3.p pVar;
        boolean z14;
        byte[] bArr2;
        j2.h hVar3;
        s2.j jVar;
        m2.i iVar2;
        j2.m mVar;
        j2.h hVar4;
        boolean z15;
        t3.h hVar5;
        x xVar;
        b bVar;
        k0 k0Var;
        byte[] bArr3;
        j2.h hVar6;
        String str;
        boolean z16;
        s2.c cVar2;
        if (!this.k0) {
            b3.p pVar2 = this.s;
            if (!pVar2.d() && !pVar2.c()) {
                if (C()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.h0;
                    for (o oVar : this.M) {
                        oVar.t = this.h0;
                    }
                    list = list2;
                    j3 = max;
                } else {
                    i A = A();
                    boolean z17 = A.Y;
                    long j16 = A.h;
                    if (z17 && A.g()) {
                        long j17 = A.b0;
                        max = j17 != -9223372036854775807L ? j16 + j17 : -9223372036854775807L;
                    } else {
                        max = Math.max(this.g0, j16);
                    }
                    long j18 = this.g0;
                    boolean z18 = this.T;
                    List list3 = this.F;
                    if (z18) {
                        for (o oVar2 : this.M) {
                            j18 = Math.max(j18, oVar2.t());
                        }
                    }
                    j3 = j18;
                    list = list3;
                }
                androidx.activity.n nVar2 = this.y;
                nVar2.c = null;
                nVar2.b = false;
                nVar2.d = null;
                boolean z19 = this.U || !list.isEmpty();
                h hVar7 = this.d;
                hn hnVar3 = hVar7.j;
                w[] wVarArr = hVar7.e;
                s2.d dVar = hVar7.g;
                i iVar3 = list.isEmpty() ? null : (i) h9.o.n(list);
                if (iVar3 == null) {
                    j10 = -9223372036854775807L;
                    a10 = -1;
                    hnVar = hnVar3;
                    s0Var2 = s0Var;
                } else {
                    j10 = -9223372036854775807L;
                    a10 = hVar7.h.a(iVar3.d);
                    s0Var2 = s0Var;
                    hnVar = hnVar3;
                }
                long j19 = s0Var2.a;
                long j20 = max - j19;
                long j21 = hVar7.s;
                long j22 = j21 != j10 ? j21 - j19 : j10;
                if (iVar3 == null || hVar7.q) {
                    j11 = j22;
                    hVar = hVar7;
                } else {
                    hVar = hVar7;
                    j11 = j22;
                    long j23 = iVar3.n - iVar3.h;
                    j20 = Math.max(0L, j20 - j23);
                    if (j11 != j10) {
                        j11 = Math.max(0L, j11 - j23);
                    }
                }
                y2.m[] b10 = hVar.b(iVar3, max);
                if (a10 != -1) {
                    a3.u uVar = hVar.r;
                    if (uVar.a(uVar.u(a10), SystemClock.elapsedRealtime())) {
                        z10 = true;
                        long j24 = max;
                        i iVar4 = iVar3;
                        hVar.r.e(j19, j20, j11, list, b10);
                        int m10 = hVar.r.m();
                        boolean z20 = a10 == m10;
                        c10 = wVarArr[m10].c();
                        if (dVar.f(c10)) {
                            nVar2.d = c10;
                            hVar.p = c10;
                            pVar = pVar2;
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
                                j13 = (j12 + b11.u) - dVar.J;
                            }
                            hVar.s = j13;
                            long j26 = j12 - dVar.J;
                            h hVar8 = hVar;
                            Pair e10 = hVar8.e(iVar4, z20, b11, j26, j24);
                            boolean z21 = z10;
                            long longValue = ((Long) e10.first).longValue();
                            int intValue = ((Integer) e10.second).intValue();
                            if (!z20 || z21 || iVar4 == null) {
                                j14 = j26;
                            } else {
                                j14 = j26;
                                if (longValue < b11.k || ((f10 = h.f(b11, longValue, intValue)) != null && j14 + f10.a.e < j3)) {
                                    c10 = wVarArr[a10].c();
                                    b11 = dVar.b(c10, true);
                                    b11.getClass();
                                    long j27 = b11.h - dVar.J;
                                    Pair e11 = hVar8.e(iVar4, false, b11, j27, j24);
                                    iVar = iVar4;
                                    long longValue2 = ((Long) e11.first).longValue();
                                    intValue = ((Integer) e11.second).intValue();
                                    m10 = a10;
                                    j14 = j27;
                                    hVar2 = hVar8;
                                    longValue = longValue2;
                                    String str2 = b11.a;
                                    boolean z22 = b11.c;
                                    j15 = b11.k;
                                    i0 i0Var = b11.r;
                                    if (m10 == a10) {
                                        if (a10 != -1) {
                                            Uri c11 = wVarArr[a10].c();
                                            s2.c cVar3 = (s2.c) dVar.d.get(c11);
                                            if (cVar3 != null) {
                                                s2.b bVar2 = (s2.b) p5.c.i(cVar3.b, c11, c11);
                                                bVar2.getClass();
                                                bVar2.x = false;
                                            }
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    if (longValue >= j15) {
                                        hVar2.n = new x2.b();
                                        pVar = pVar2;
                                        nVar = nVar2;
                                    } else {
                                        g f11 = h.f(b11, longValue, intValue);
                                        if (f11 == null) {
                                            if (b11.o) {
                                                nVar = nVar2;
                                                if (z19 || i0Var.isEmpty()) {
                                                    nVar.b = z11;
                                                } else {
                                                    f11 = new g((s2.k) h9.o.n(i0Var), (j15 + i0Var.size()) - 1, -1);
                                                }
                                            } else {
                                                nVar = nVar2;
                                                nVar.d = c10;
                                                hVar2.p = c10;
                                            }
                                            pVar = pVar2;
                                        } else {
                                            nVar = nVar2;
                                        }
                                        boolean z23 = f11.d;
                                        s2.k kVar = f11.a;
                                        hVar2.p = null;
                                        SystemClock.elapsedRealtime();
                                        s2.j jVar2 = kVar.b;
                                        long j28 = kVar.e;
                                        Uri g10 = (jVar2 == null || (str = jVar2.h) == null) ? null : h2.e.g(str2, str);
                                        d g11 = hVar2.g(g10, m10, true);
                                        nVar.c = g11;
                                        if (g11 == null) {
                                            String str3 = kVar.h;
                                            Uri g12 = str3 == null ? null : h2.e.g(str2, str3);
                                            d g13 = hVar2.g(g12, m10, false);
                                            nVar.c = g13;
                                            if (g13 == null) {
                                                boolean z24 = kVar instanceof s2.h ? ((s2.h) kVar).x || (f11.c == 0 && z22) : z22;
                                                if (iVar == null) {
                                                    AtomicInteger atomicInteger = i.d0;
                                                } else if (!c10.equals(iVar.y) || !iVar.Y) {
                                                    long j29 = j14 + j28;
                                                    if (!z24 || j29 < j24) {
                                                        z12 = true;
                                                        if (z12 || !z23) {
                                                            c cVar4 = hVar2.a;
                                                            j2.h hVar9 = hVar2.b;
                                                            u uVar2 = hVar2.f[m10];
                                                            List list4 = hVar2.i;
                                                            int o4 = hVar2.r.o();
                                                            Object r10 = hVar2.r.r();
                                                            boolean z25 = hVar2.l;
                                                            b5 b5Var = hVar2.d;
                                                            if (g12 != null) {
                                                                hnVar.getClass();
                                                                cVar = cVar4;
                                                                z13 = z25;
                                                                hnVar2 = hnVar;
                                                                bArr = null;
                                                            } else {
                                                                cVar = cVar4;
                                                                z13 = z25;
                                                                hnVar2 = hnVar;
                                                                bArr = (byte[]) ((org.telegram.utils.twidget.w) hnVar2.b).get(g12);
                                                            }
                                                            byte[] bArr4 = g10 != null ? null : (byte[]) ((org.telegram.utils.twidget.w) hnVar2.b).get(g10);
                                                            m2.i iVar5 = hVar2.k;
                                                            AtomicInteger atomicInteger2 = i.d0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri g14 = h2.e.g(str2, kVar.a);
                                                            pVar = pVar2;
                                                            long j30 = kVar.r;
                                                            long j31 = kVar.s;
                                                            int i7 = !z23 ? 8 : 0;
                                                            la.k(g14, "The uri must be set.");
                                                            j2.m mVar2 = new j2.m(g14, 1, null, map, j30, j31, null, i7);
                                                            z14 = bArr == null;
                                                            if (z14) {
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
                                                                boolean z26 = bArr4 != null;
                                                                if (z26) {
                                                                    String str5 = jVar.n;
                                                                    str5.getClass();
                                                                    bArr3 = i.e(str5);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z27 = z26;
                                                                Uri g15 = h2.e.g(str2, jVar.a);
                                                                iVar2 = iVar5;
                                                                long j32 = jVar.r;
                                                                long j33 = jVar.s;
                                                                la.k(g15, "The uri must be set.");
                                                                j2.m mVar3 = new j2.m(g15, 1, null, map, j32, j33, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    hVar6 = new a(hVar9, bArr4, bArr3);
                                                                } else {
                                                                    hVar6 = hVar9;
                                                                }
                                                                hVar4 = hVar6;
                                                                z15 = z27;
                                                                mVar = mVar3;
                                                            } else {
                                                                iVar2 = iVar5;
                                                                mVar = null;
                                                                hVar4 = null;
                                                                z15 = false;
                                                            }
                                                            long j34 = j14 + j28;
                                                            long j35 = j34 + kVar.c;
                                                            int i10 = b11.j + kVar.d;
                                                            if (iVar == null) {
                                                                j2.m mVar4 = iVar.H;
                                                                boolean z28 = mVar == mVar4 || (mVar != null && mVar4 != null && mVar.a.equals(mVar4.a) && mVar.e == mVar4.e);
                                                                boolean z29 = c10.equals(iVar.y) && iVar.Y;
                                                                hVar5 = iVar.P;
                                                                xVar = iVar.Q;
                                                                bVar = (z28 && z29 && !iVar.a0 && iVar.x == i10) ? iVar.T : null;
                                                            } else {
                                                                hVar5 = new t3.h(null);
                                                                xVar = new x(10);
                                                                bVar = null;
                                                            }
                                                            t3.h hVar10 = hVar5;
                                                            x xVar2 = xVar;
                                                            long j36 = f11.b;
                                                            int i11 = f11.c;
                                                            boolean z30 = !z23;
                                                            boolean z31 = kVar.w;
                                                            SparseArray sparseArray = (SparseArray) b5Var.a;
                                                            k0Var = (k0) sparseArray.get(i10);
                                                            if (k0Var == null) {
                                                                k0Var = new k0(9223372036854775806L);
                                                                sparseArray.put(i10, k0Var);
                                                            }
                                                            nVar.c = new i(cVar, hVar3, mVar2, uVar2, z14, hVar4, mVar, z15, c10, list4, o4, r10, j34, j35, j36, i11, z30, i10, z31, z13, k0Var, kVar.f, bVar, hVar10, xVar2, z12, z24, iVar2);
                                                        }
                                                    }
                                                }
                                                z12 = false;
                                                if (z12) {
                                                }
                                                c cVar42 = hVar2.a;
                                                j2.h hVar92 = hVar2.b;
                                                u uVar22 = hVar2.f[m10];
                                                List list42 = hVar2.i;
                                                int o42 = hVar2.r.o();
                                                Object r102 = hVar2.r.r();
                                                boolean z252 = hVar2.l;
                                                b5 b5Var2 = hVar2.d;
                                                if (g12 != null) {
                                                }
                                                if (g10 != null) {
                                                }
                                                m2.i iVar52 = hVar2.k;
                                                AtomicInteger atomicInteger22 = i.d0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri g142 = h2.e.g(str2, kVar.a);
                                                pVar = pVar2;
                                                long j302 = kVar.r;
                                                long j312 = kVar.s;
                                                if (!z23) {
                                                }
                                                la.k(g142, "The uri must be set.");
                                                j2.m mVar22 = new j2.m(g142, 1, null, map2, j302, j312, null, i7);
                                                if (bArr == null) {
                                                }
                                                if (z14) {
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
                                                boolean z302 = !z23;
                                                boolean z312 = kVar.w;
                                                SparseArray sparseArray2 = (SparseArray) b5Var2.a;
                                                k0Var = (k0) sparseArray2.get(i102);
                                                if (k0Var == null) {
                                                }
                                                nVar.c = new i(cVar, hVar3, mVar22, uVar22, z14, hVar4, mVar, z15, c10, list42, o42, r102, j342, j352, j362, i112, z302, i102, z312, z13, k0Var, kVar.f, bVar, hVar102, xVar22, z12, z24, iVar2);
                                            }
                                        }
                                        pVar = pVar2;
                                    }
                                }
                            }
                            iVar = iVar4;
                            hVar2 = hVar8;
                            String str22 = b11.a;
                            boolean z222 = b11.c;
                            j15 = b11.k;
                            i0 i0Var2 = b11.r;
                            if (m10 == a10) {
                            }
                            if (longValue >= j15) {
                            }
                        }
                        z16 = nVar.b;
                        y2.f fVar = (y2.f) nVar.c;
                        Uri uri = (Uri) nVar.d;
                        if (!z16) {
                            this.h0 = j10;
                            this.k0 = true;
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
                            i iVar6 = (i) fVar;
                            ArrayList arrayList = this.E;
                            if (!arrayList.isEmpty()) {
                                if (!A().g()) {
                                    y(arrayList.size() - 1);
                                }
                                if (iVar6.E && iVar6.c0) {
                                    int size = arrayList.size() - 1;
                                    while (true) {
                                        if (size < 0) {
                                            break;
                                        }
                                        long j37 = ((i) arrayList.get(size)).h;
                                        long j38 = iVar6.h;
                                        if (j37 < j38) {
                                            break;
                                        }
                                        if (j37 == j38 && m(size)) {
                                            y(size);
                                            iVar6.c0 = false;
                                            break;
                                        }
                                        size--;
                                    }
                                }
                            }
                            this.p0 = iVar6;
                            this.W = iVar6.d;
                            this.h0 = -9223372036854775807L;
                            arrayList.add(iVar6);
                            f0 p10 = i0.p();
                            for (o oVar3 : this.M) {
                                p10.c(Integer.valueOf(oVar3.q + oVar3.p));
                            }
                            t1 f12 = p10.f();
                            iVar6.U = this;
                            iVar6.Z = f12;
                            for (o oVar4 : this.M) {
                                oVar4.getClass();
                                oVar4.E = iVar6.w;
                                if (iVar6.c0) {
                                    oVar4.I = true;
                                }
                            }
                        }
                        this.L = fVar;
                        pVar.f(fVar, this, this.r.R4(fVar.c));
                        return true;
                    }
                }
                z10 = false;
                long j242 = max;
                i iVar42 = iVar3;
                hVar.r.e(j19, j20, j11, list, b10);
                int m102 = hVar.r.m();
                if (a10 == m102) {
                }
                c10 = wVarArr[m102].c();
                if (dVar.f(c10)) {
                }
                z16 = nVar.b;
                y2.f fVar2 = (y2.f) nVar.c;
                Uri uri2 = (Uri) nVar.d;
                if (!z16) {
                }
            }
        }
        return false;
    }

    @Override // b3.n
    public final void d() {
        for (o oVar : this.M) {
            oVar.G(true);
            q2.g gVar = oVar.h;
            if (gVar != null) {
                gVar.c(oVar.e);
                oVar.h = null;
                oVar.g = null;
            }
        }
    }

    @Override // f3.q
    public final void d1() {
        this.m0 = true;
        this.I.post(this.H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [r2.o[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r2.o[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f3.i0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [r2.o, x2.c1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [f3.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // f3.q
    public final f3.i0 d2(int i7, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = q0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            la.f(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.N[i11] = i7;
                }
                r52 = this.N[i11] == i7 ? this.M[i11] : v(i7, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.M;
                if (i12 >= r12.length) {
                    break;
                }
                if (this.N[i12] == i7) {
                    r52 = r12[i12];
                    break;
                }
                i12++;
            }
        }
        if (r52 == 0) {
            if (this.m0) {
                return v(i7, i10);
            }
            int length = this.M.length;
            boolean z10 = i10 == 1 || i10 == 2;
            r52 = new o(this.e, this.h, this.n, this.K);
            r52.t = this.g0;
            if (z10) {
                r52.K = this.o0;
                r52.B = true;
            }
            long j3 = this.n0;
            if (r52.H != j3) {
                r52.H = j3;
                r52.B = true;
            }
            if (this.p0 != null) {
                r52.E = r6.w;
            }
            r52.f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i13);
            this.N = copyOf;
            copyOf[length] = i7;
            o[] oVarArr = this.M;
            String str = l0.a;
            ?? copyOf2 = Arrays.copyOf(oVarArr, oVarArr.length + 1);
            copyOf2[oVarArr.length] = r52;
            this.M = (o[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f0, i13);
            this.f0 = copyOf3;
            copyOf3[length] = z10;
            this.d0 |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (B(i10) > B(this.R)) {
                this.S = length;
                this.R = i10;
            }
            this.e0 = Arrays.copyOf(this.e0, i13);
        }
        if (i10 != 5) {
            return r52;
        }
        if (this.Q == null) {
            this.Q = new n(r52, this.x);
        }
        return this.Q;
    }

    @Override // x2.f1
    public final long e() {
        if (C()) {
            return this.h0;
        }
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        return A().n;
    }

    @Override // x2.f1
    public final boolean g() {
        return this.s.d();
    }

    public final void h() {
        la.p(this.U);
        this.Z.getClass();
        this.a0.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    @Override // b3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        boolean c10;
        boolean z10;
        int u10;
        b3.i iVar;
        boolean a10;
        int i10;
        y2.f fVar = (y2.f) mVar;
        boolean z11 = fVar instanceof i;
        if (z11 && !((i) fVar).g() && (iOException instanceof j2.x) && ((i10 = ((j2.x) iOException).c) == 410 || i10 == 404)) {
            return b3.p.d;
        }
        long j11 = fVar.r.b;
        j2.m mVar2 = fVar.b;
        b0 b0Var = fVar.r;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, j11);
        l0.h0(fVar.h);
        l0.h0(fVar.n);
        b3.j jVar = new b3.j(iOException, i7, 0);
        boolean z12 = fVar instanceof i;
        h hVar = this.d;
        b3.h a11 = z12 ? hVar.a(((i) fVar).y) : new b3.h(1, 0, hVar.r.length(), hVar.d(SystemClock.elapsedRealtime()));
        this.r.getClass();
        b3.i Q4 = qb.a.Q4(a11, jVar);
        if (Q4 != null) {
            int i11 = Q4.a;
            long j12 = Q4.b;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException(i5.c.i(i11, "Invalid fallback selection type: "));
                }
                int a12 = hVar.h.a(fVar.d);
                if (a12 != -1 && (u10 = hVar.r.u(a12)) != -1) {
                    c10 = hVar.r.p(u10, j12);
                    z10 = c10;
                }
            } else if (z12) {
                s2.d dVar = hVar.g;
                Uri uri = ((i) fVar).y;
                s2.c cVar = (s2.c) dVar.d.get(uri);
                c10 = cVar != null ? s2.c.c(cVar, uri, j12) : false;
                z10 = c10;
            }
            if (z10) {
                long S4 = qb.a.S4(jVar);
                iVar = S4 != -9223372036854775807L ? new b3.i(0, S4, false) : b3.p.f;
            } else {
                if (z11 && j11 == 0) {
                    ArrayList arrayList = this.E;
                    la.p(((i) p5.c.g(1, arrayList)) == fVar);
                    if (arrayList.isEmpty()) {
                        this.h0 = this.g0;
                    } else {
                        ((i) h9.o.n(arrayList)).a0 = true;
                    }
                }
                iVar = b3.p.e;
            }
            b3.i iVar2 = iVar;
            a10 = iVar2.a();
            this.w.q(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
            if (!a10) {
                this.L = null;
            }
            if (z10) {
                if (!this.U) {
                    r0 r0Var = new r0();
                    r0Var.a = this.g0;
                    c(new l2.s0(r0Var));
                    return iVar2;
                }
                this.c.c0(this);
            }
            return iVar2;
        }
        z10 = false;
        if (z10) {
        }
        b3.i iVar22 = iVar;
        a10 = iVar22.a();
        this.w.q(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
        if (!a10) {
        }
        if (z10) {
        }
        return iVar22;
    }

    public final boolean m(int i7) {
        int i10 = i7;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 >= arrayList.size()) {
                i iVar = (i) arrayList.get(i7);
                for (int i11 = 0; i11 < this.M.length; i11++) {
                    if (this.M[i11].v() > iVar.f(i11)) {
                        return false;
                    }
                }
                return true;
            }
            if (((i) arrayList.get(i10)).c0) {
                return false;
            }
            i10++;
        }
    }

    @Override // b3.k
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        y2.f fVar = (y2.f) mVar;
        this.L = null;
        long j11 = fVar.a;
        j2.m mVar2 = fVar.b;
        b0 b0Var = fVar.r;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.r.getClass();
        this.w.o(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (C() || this.V == 0) {
            G();
        }
        if (this.V > 0) {
            this.c.c0(this);
        }
    }

    @Override // x2.f1
    public final long r() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.h0;
        }
        long j3 = this.g0;
        i A = A();
        if (!A.Y) {
            ArrayList arrayList = this.E;
            A = arrayList.size() > 1 ? (i) i5.c.h(2, arrayList) : null;
        }
        if (A != null) {
            j3 = Math.max(j3, A.n);
        }
        if (this.T) {
            for (o oVar : this.M) {
                j3 = Math.max(j3, oVar.s());
            }
        }
        return j3;
    }

    @Override // b3.k
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        y2.f fVar = (y2.f) mVar;
        if (i7 == 0) {
            long j11 = fVar.a;
            uVar = new x2.u(fVar.b, j3);
        } else {
            long j12 = fVar.a;
            j2.m mVar2 = fVar.b;
            b0 b0Var = fVar.r;
            uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        }
        this.w.u(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i7);
    }

    @Override // x2.f1
    public final void u(long j3) {
        b3.p pVar = this.s;
        if (pVar.c() || C()) {
            return;
        }
        boolean d = pVar.d();
        boolean z10 = false;
        int i7 = 0;
        z10 = false;
        h hVar = this.d;
        List list = this.F;
        if (d) {
            this.L.getClass();
            if (hVar.n == null ? hVar.r.k(j3, this.L, list) : false) {
                pVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && hVar.c((i) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            y(size);
        }
        int size2 = (hVar.n != null || hVar.r.length() < 2) ? list.size() : hVar.r.j(j3, list);
        if (size2 < this.E.size()) {
            y(size2);
        }
        if (this.T && this.l0 != Long.MIN_VALUE) {
            boolean z11 = true;
            while (true) {
                o[] oVarArr = this.M;
                if (i7 >= oVarArr.length) {
                    break;
                }
                if (this.e0[i7] && (this.f0[i7] || !this.d0)) {
                    z11 &= oVarArr[i7].z();
                }
                i7++;
            }
            z10 = z11;
        }
        if (z10) {
            this.k0 = true;
        }
    }

    public final r1 w(m1[] m1VarArr) {
        for (int i7 = 0; i7 < m1VarArr.length; i7++) {
            m1 m1Var = m1VarArr[i7];
            u[] uVarArr = new u[m1Var.a];
            for (int i10 = 0; i10 < m1Var.a; i10++) {
                u uVar = m1Var.d[i10];
                int E1 = this.h.E1(uVar);
                t a10 = uVar.a();
                a10.S = E1;
                uVarArr[i10] = new u(a10);
            }
            m1VarArr[i7] = new m1(m1Var.b, uVarArr);
        }
        return new r1(m1VarArr);
    }

    public final void y(int i7) {
        ArrayList arrayList;
        la.p(!this.s.d());
        while (true) {
            arrayList = this.E;
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
        long j3 = A().n;
        i iVar = (i) arrayList.get(i7);
        l0.X(i7, arrayList.size(), arrayList);
        for (int i10 = 0; i10 < this.M.length; i10++) {
            this.M[i10].o(iVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.h0 = this.g0;
        } else {
            ((i) h9.o.n(arrayList)).a0 = true;
        }
        this.k0 = false;
        this.w.B(iVar.h, this.R, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b3.k
    public final void z(b3.m mVar, long j3, long j10) {
        y2.f fVar = (y2.f) mVar;
        this.L = null;
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            byte[] bArr = dVar.s;
            h hVar = this.d;
            hVar.m = bArr;
            hn hnVar = hVar.j;
            Uri uri = dVar.b.a;
            byte[] bArr2 = dVar.x;
            bArr2.getClass();
            org.telegram.utils.twidget.w wVar = (org.telegram.utils.twidget.w) hnVar.b;
            uri.getClass();
        }
        long j11 = fVar.a;
        j2.m mVar2 = fVar.b;
        b0 b0Var = fVar.r;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.r.getClass();
        this.w.p(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (this.U) {
            this.c.c0(this);
            return;
        }
        r0 r0Var = new r0();
        r0Var.a = this.g0;
        c(new l2.s0(r0Var));
    }

    @Override // f3.q
    public final void j(f3.b0 b0Var) {
    }
}
