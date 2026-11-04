package q2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b8.kg;
import b8.zb;
import d2.o1;
import d2.s0;
import d2.u;
import d2.u0;
import d2.v;
import e3.b0;
import g2.l0;
import g2.n0;
import g2.y;
import g9.f0;
import g9.i0;
import g9.s1;
import i2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import k2.p1;
import k2.v0;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;
import r2.w;
import w2.b1;
import w2.f1;
import w2.r1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q implements a3.k, a3.n, f1, e3.q, b1 {
    public static final Set q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final n G;
    public final n H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public x2.f L;
    public p[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public o Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public v W;
    public v X;
    public boolean Y;
    public r1 Z;
    public final String a;
    public Set a0;
    public final int b;
    public int[] b0;
    public final nh c;
    public int c0;
    public final i d;
    public boolean d0;
    public final a0 e;
    public boolean[] e0;
    public final v f;
    public boolean[] f0;
    public long g0;
    public final p2.m h;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final p2.j n;
    public long n0;
    public d2.s o0;
    public j p0;
    public final kb.a r;
    public final a3.q s;
    public final kg w;
    public final int x;
    public final androidx.activity.n y;

    /* JADX WARN: Type inference failed for: r2v13, types: [q2.n] */
    /* JADX WARN: Type inference failed for: r2v14, types: [q2.n] */
    public q(String str, int i3, nh nhVar, i iVar, Map map, a0 a0Var, long j10, v vVar, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar, int i10, b3.a aVar2) {
        this.a = str;
        this.b = i3;
        this.c = nhVar;
        this.d = iVar;
        this.K = map;
        this.e = a0Var;
        this.f = vVar;
        this.h = mVar;
        this.n = jVar;
        this.r = aVar;
        this.w = kgVar;
        this.x = i10;
        this.s = aVar2 != null ? new a3.q(aVar2) : new a3.q("Loader:HlsSampleStreamWrapper");
        androidx.activity.n nVar = new androidx.activity.n(5);
        nVar.c = null;
        final int i11 = 0;
        nVar.b = false;
        nVar.d = null;
        this.y = nVar;
        this.N = new int[0];
        Set set = q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new p[0];
        this.f0 = new boolean[0];
        this.e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) { // from class: q2.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.B();
                        break;
                    default:
                        q qVar = this.b;
                        for (p pVar : qVar.M) {
                            pVar.K(qVar.l0);
                        }
                        qVar.T = true;
                        qVar.B();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.H = new Runnable(this) { // from class: q2.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.B();
                        break;
                    default:
                        q qVar = this.b;
                        for (p pVar : qVar.M) {
                            pVar.K(qVar.l0);
                        }
                        qVar.T = true;
                        qVar.B();
                        break;
                }
            }
        };
        this.I = n0.q(null);
        this.g0 = j10;
        this.h0 = j10;
        this.l0 = Long.MIN_VALUE;
    }

    public static e3.n u(int i3, int i10) {
        g2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i3 + " of type " + i10);
        return new e3.n();
    }

    public static v w(v vVar, v vVar2, boolean z10) {
        String b10;
        if (vVar == null) {
            return vVar2;
        }
        String str = vVar.k;
        String str2 = vVar2.s;
        int h = u0.h(str2);
        if (n0.v(h, str) == 1) {
            b10 = n0.w(h, str);
            str2 = u0.d(b10);
        } else {
            b10 = u0.b(str, str2);
        }
        vVar2.n = vVar.n;
        vVar2.o = vVar.o;
        vVar2.p = vVar.p;
        vVar2.q = vVar.q;
        u a10 = vVar2.a();
        a10.a = vVar.a;
        a10.b = vVar.b;
        a10.c = i0.q(vVar.c);
        a10.d = vVar.d;
        a10.e = vVar.e;
        a10.f = vVar.f;
        a10.h = z10 ? vVar.h : -1;
        a10.i = z10 ? vVar.i : -1;
        a10.j = b10;
        a10.p = vVar.p;
        a10.n = vVar.o;
        a10.m = vVar.n;
        a10.o = vVar.q;
        if (h == 2) {
            a10.y = vVar.z;
            a10.z = vVar.A;
            a10.C = vVar.D;
        }
        if (str2 != null) {
            a10.r = u0.n(str2);
        }
        int i3 = vVar.K;
        if (i3 != -1 && h == 1) {
            a10.J = i3;
        }
        s0 s0Var = vVar.l;
        if (s0Var != null) {
            s0 s0Var2 = vVar2.l;
            if (s0Var2 != null) {
                s0Var = s0Var2.b(s0Var);
            }
            a10.k = s0Var;
        }
        return new v(a10);
    }

    public static int z(int i3) {
        if (i3 == 1) {
            return 2;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final boolean A() {
        return this.h0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        int i3;
        if (!this.Y && this.b0 == null && this.T) {
            int i10 = 0;
            for (p pVar : this.M) {
                if (pVar.y() == null) {
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
                        p[] pVarArr = this.M;
                        if (i13 < pVarArr.length) {
                            v y9 = pVarArr[i13].y();
                            y9.getClass();
                            v vVar = this.Z.a(i12).d[0];
                            String str = y9.s;
                            String str2 = vVar.s;
                            int h = u0.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y9.P == vVar.P) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                            } else if (h == u0.h(str2)) {
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
                    ((m) obj).b();
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
                v y10 = this.M[i14].y();
                y10.getClass();
                String str3 = y10.s;
                if (u0.m(str3)) {
                    i17 = 2;
                } else if (!u0.i(str3)) {
                    i17 = u0.l(str3) ? 3 : -2;
                }
                if (z(i17) > z(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            o1 o1Var = this.d.h;
            int i18 = o1Var.a;
            this.c0 = -1;
            this.b0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.b0[i19] = i19;
            }
            o1[] o1VarArr = new o1[length];
            int i20 = 0;
            while (i20 < length) {
                v y11 = this.M[i20].y();
                y11.getClass();
                v vVar2 = this.f;
                String str4 = this.a;
                if (i20 == i15) {
                    v[] vVarArr = new v[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        v vVar3 = o1Var.d[i21];
                        if (i16 == 1 && vVar2 != null) {
                            vVar3 = vVar3.d(vVar2);
                        }
                        vVarArr[i21] = i18 == 1 ? y11.d(vVar3) : w(vVar3, y11, true);
                    }
                    o1VarArr[i20] = new o1(str4, vVarArr);
                    this.c0 = i20;
                    i3 = 0;
                } else {
                    if (i16 != 2 || !u0.i(y11.s)) {
                        vVar2 = null;
                    }
                    StringBuilder h7 = t4.c.h(str4, ":muxed:");
                    h7.append(i20 < i15 ? i20 : i20 - 1);
                    String sb2 = h7.toString();
                    i3 = 0;
                    u a10 = w(vVar2, y11, false).a();
                    a10.l = str4;
                    o1VarArr[i20] = new o1(sb2, new v(a10));
                }
                i20++;
                i10 = i3;
            }
            int i22 = i10;
            this.Z = v(o1VarArr);
            zb.p(this.a0 == null ? 1 : i22);
            this.a0 = Collections.EMPTY_SET;
            this.U = true;
            this.c.B();
        }
    }

    public final void C() {
        this.s.a();
        i iVar = this.d;
        w2.b bVar = iVar.n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.o;
        if (uri == null || !uri.equals(iVar.p)) {
            return;
        }
        iVar.g.i(iVar.o);
    }

    public final void D(o1[] o1VarArr, int... iArr) {
        this.Z = v(o1VarArr);
        this.a0 = new HashSet();
        for (int i3 : iArr) {
            this.a0.add(this.Z.a(i3));
        }
        this.c0 = 0;
        this.I.post(new d4(this.c, 27));
        this.U = true;
    }

    public final void E() {
        for (p pVar : this.M) {
            pVar.G(this.i0);
        }
        this.i0 = false;
    }

    public final boolean F(long j10, boolean z10) {
        j jVar;
        boolean z11;
        boolean J;
        this.g0 = j10;
        if (A()) {
            this.h0 = j10;
            return true;
        }
        boolean z12 = this.d.q;
        ArrayList arrayList = this.E;
        if (z12) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                jVar = (j) arrayList.get(i3);
                if (jVar.h == j10) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.T && !z10 && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (int i10 = 0; i10 < length; i10++) {
                p pVar = this.M[i10];
                if (jVar != null) {
                    J = pVar.I(jVar.f(i10));
                } else {
                    long e10 = e();
                    J = pVar.J(j10, e10 == Long.MIN_VALUE || j10 < e10);
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
        this.h0 = j10;
        this.k0 = false;
        arrayList.clear();
        a3.q qVar = this.s;
        if (!qVar.d()) {
            qVar.c = null;
            E();
            return true;
        }
        if (this.T) {
            for (p pVar2 : this.M) {
                pVar2.l();
            }
        }
        qVar.b();
        return true;
    }

    @Override // e3.q
    public final void L() {
        this.m0 = true;
        this.I.post(this.H);
    }

    @Override // a3.k
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        w2.u uVar;
        x2.f fVar = (x2.f) mVar;
        if (i3 == 0) {
            long j12 = fVar.a;
            uVar = new w2.u(fVar.b, j10);
        } else {
            long j13 = fVar.a;
            i2.n nVar = fVar.b;
            c0 c0Var = fVar.r;
            uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        }
        this.w.u(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i3);
    }

    @Override // w2.b1
    public final void a() {
        this.I.post(this.G);
    }

    @Override // a3.n
    public final void b() {
        for (p pVar : this.M) {
            pVar.G(true);
            p2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.b(pVar.e);
                pVar.h = null;
                pVar.g = null;
            }
        }
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
    @Override // w2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(v0 v0Var) {
        long max;
        long j10;
        List list;
        long j11;
        int a10;
        v0 v0Var2;
        y00 y00Var;
        long j12;
        i iVar;
        boolean z10;
        Uri c2;
        long j13;
        long j14;
        long j15;
        j jVar;
        i iVar2;
        h f10;
        long j16;
        boolean z11;
        androidx.activity.n nVar;
        boolean z12;
        c cVar;
        boolean z13;
        y00 y00Var2;
        byte[] bArr;
        a3.q qVar;
        boolean z14;
        byte[] bArr2;
        i2.h hVar;
        r2.j jVar2;
        l2.k kVar;
        i2.n nVar2;
        i2.h hVar2;
        boolean z15;
        s3.h hVar3;
        y yVar;
        b bVar;
        l0 l0Var;
        byte[] bArr3;
        i2.h hVar4;
        String str;
        boolean z16;
        r2.c cVar2;
        if (!this.k0) {
            a3.q qVar2 = this.s;
            if (!qVar2.d() && !qVar2.c()) {
                if (A()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.h0;
                    for (p pVar : this.M) {
                        pVar.t = this.h0;
                    }
                    list = list2;
                    j10 = max;
                } else {
                    j y9 = y();
                    boolean z17 = y9.Y;
                    long j17 = y9.h;
                    if (z17 && y9.g()) {
                        long j18 = y9.b0;
                        max = j18 != -9223372036854775807L ? j17 + j18 : -9223372036854775807L;
                    } else {
                        max = Math.max(this.g0, j17);
                    }
                    long j19 = this.g0;
                    boolean z18 = this.T;
                    List list3 = this.F;
                    if (z18) {
                        for (p pVar2 : this.M) {
                            j19 = Math.max(j19, pVar2.t());
                        }
                    }
                    j10 = j19;
                    list = list3;
                }
                androidx.activity.n nVar3 = this.y;
                nVar3.c = null;
                nVar3.b = false;
                nVar3.d = null;
                boolean z19 = this.U || !list.isEmpty();
                i iVar3 = this.d;
                y00 y00Var3 = iVar3.j;
                w[] wVarArr = iVar3.e;
                r2.d dVar = iVar3.g;
                j jVar3 = list.isEmpty() ? null : (j) g9.o.n(list);
                if (jVar3 == null) {
                    j11 = -9223372036854775807L;
                    a10 = -1;
                    y00Var = y00Var3;
                    v0Var2 = v0Var;
                } else {
                    j11 = -9223372036854775807L;
                    a10 = iVar3.h.a(jVar3.d);
                    v0Var2 = v0Var;
                    y00Var = y00Var3;
                }
                long j20 = v0Var2.a;
                long j21 = max - j20;
                long j22 = iVar3.s;
                long j23 = j22 != j11 ? j22 - j20 : j11;
                if (jVar3 == null || iVar3.q) {
                    j12 = j23;
                    iVar = iVar3;
                } else {
                    iVar = iVar3;
                    j12 = j23;
                    long j24 = jVar3.n - jVar3.h;
                    j21 = Math.max(0L, j21 - j24);
                    if (j12 != j11) {
                        j12 = Math.max(0L, j12 - j24);
                    }
                }
                x2.m[] b10 = iVar.b(jVar3, max);
                if (a10 != -1) {
                    z2.p pVar3 = iVar.r;
                    if (pVar3.a(pVar3.u(a10), SystemClock.elapsedRealtime())) {
                        z10 = true;
                        long j25 = max;
                        j jVar4 = jVar3;
                        iVar.r.d(j20, j21, j12, list, b10);
                        int l10 = iVar.r.l();
                        boolean z20 = a10 == l10;
                        c2 = wVarArr[l10].c();
                        if (dVar.f(c2)) {
                            nVar3.d = c2;
                            iVar.p = c2;
                            qVar = qVar2;
                            nVar = nVar3;
                        } else {
                            r2.m b11 = dVar.b(c2, true);
                            b11.getClass();
                            long j26 = b11.h;
                            iVar.q = b11.c;
                            if (b11.o) {
                                j13 = j26;
                                j14 = j11;
                            } else {
                                j13 = j26;
                                j14 = (j13 + b11.u) - dVar.J;
                            }
                            iVar.s = j14;
                            long j27 = j13 - dVar.J;
                            i iVar4 = iVar;
                            Pair e10 = iVar4.e(jVar4, z20, b11, j27, j25);
                            boolean z21 = z10;
                            long longValue = ((Long) e10.first).longValue();
                            int intValue = ((Integer) e10.second).intValue();
                            if (!z20 || z21 || jVar4 == null) {
                                j15 = j27;
                            } else {
                                j15 = j27;
                                if (longValue < b11.k || ((f10 = i.f(b11, longValue, intValue)) != null && j15 + f10.a.e < j10)) {
                                    c2 = wVarArr[a10].c();
                                    b11 = dVar.b(c2, true);
                                    b11.getClass();
                                    long j28 = b11.h - dVar.J;
                                    Pair e11 = iVar4.e(jVar4, false, b11, j28, j25);
                                    jVar = jVar4;
                                    long longValue2 = ((Long) e11.first).longValue();
                                    intValue = ((Integer) e11.second).intValue();
                                    l10 = a10;
                                    j15 = j28;
                                    iVar2 = iVar4;
                                    longValue = longValue2;
                                    String str2 = b11.a;
                                    boolean z22 = b11.c;
                                    j16 = b11.k;
                                    i0 i0Var = b11.r;
                                    if (l10 == a10) {
                                        if (a10 != -1) {
                                            Uri c10 = wVarArr[a10].c();
                                            r2.c cVar3 = (r2.c) dVar.d.get(c10);
                                            if (cVar3 != null) {
                                                r2.b bVar2 = (r2.b) org.telegram.ui.Cells.f1.p(cVar3.b, c10, c10);
                                                bVar2.getClass();
                                                bVar2.x = false;
                                            }
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    if (longValue >= j16) {
                                        iVar2.n = new w2.b();
                                        qVar = qVar2;
                                        nVar = nVar3;
                                    } else {
                                        h f11 = i.f(b11, longValue, intValue);
                                        if (f11 == null) {
                                            if (b11.o) {
                                                nVar = nVar3;
                                                if (z19 || i0Var.isEmpty()) {
                                                    nVar.b = z11;
                                                } else {
                                                    f11 = new h((r2.k) g9.o.n(i0Var), (j16 + i0Var.size()) - 1, -1);
                                                }
                                            } else {
                                                nVar = nVar3;
                                                nVar.d = c2;
                                                iVar2.p = c2;
                                            }
                                            qVar = qVar2;
                                        } else {
                                            nVar = nVar3;
                                        }
                                        boolean z23 = f11.d;
                                        r2.k kVar2 = f11.a;
                                        iVar2.p = null;
                                        SystemClock.elapsedRealtime();
                                        r2.j jVar5 = kVar2.b;
                                        long j29 = kVar2.e;
                                        Uri g7 = (jVar5 == null || (str = jVar5.h) == null) ? null : g2.f.g(str2, str);
                                        e g10 = iVar2.g(g7, l10, true);
                                        nVar.c = g10;
                                        if (g10 == null) {
                                            String str3 = kVar2.h;
                                            Uri g11 = str3 == null ? null : g2.f.g(str2, str3);
                                            e g12 = iVar2.g(g11, l10, false);
                                            nVar.c = g12;
                                            if (g12 == null) {
                                                boolean z24 = kVar2 instanceof r2.h ? ((r2.h) kVar2).x || (f11.c == 0 && z22) : z22;
                                                if (jVar == null) {
                                                    AtomicInteger atomicInteger = j.d0;
                                                } else if (!c2.equals(jVar.y) || !jVar.Y) {
                                                    long j30 = j15 + j29;
                                                    if (!z24 || j30 < j25) {
                                                        z12 = true;
                                                        if (z12 || !z23) {
                                                            c cVar4 = iVar2.a;
                                                            i2.h hVar5 = iVar2.b;
                                                            v vVar = iVar2.f[l10];
                                                            List list4 = iVar2.i;
                                                            int o10 = iVar2.r.o();
                                                            Object r5 = iVar2.r.r();
                                                            boolean z25 = iVar2.l;
                                                            i9 i9Var = iVar2.d;
                                                            if (g11 != null) {
                                                                y00Var.getClass();
                                                                cVar = cVar4;
                                                                z13 = z25;
                                                                y00Var2 = y00Var;
                                                                bArr = null;
                                                            } else {
                                                                cVar = cVar4;
                                                                z13 = z25;
                                                                y00Var2 = y00Var;
                                                                bArr = (byte[]) ((d) y00Var2.a).get(g11);
                                                            }
                                                            byte[] bArr4 = g7 != null ? null : (byte[]) ((d) y00Var2.a).get(g7);
                                                            l2.k kVar3 = iVar2.k;
                                                            AtomicInteger atomicInteger2 = j.d0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri g13 = g2.f.g(str2, kVar2.a);
                                                            qVar = qVar2;
                                                            long j31 = kVar2.r;
                                                            long j32 = kVar2.s;
                                                            int i3 = !z23 ? 8 : 0;
                                                            zb.k(g13, "The uri must be set.");
                                                            i2.n nVar4 = new i2.n(g13, 1, null, map, j31, j32, null, i3);
                                                            z14 = bArr == null;
                                                            if (z14) {
                                                                bArr2 = null;
                                                            } else {
                                                                String str4 = kVar2.n;
                                                                str4.getClass();
                                                                bArr2 = j.e(str4);
                                                            }
                                                            if (bArr == null) {
                                                                bArr2.getClass();
                                                                hVar = new a(hVar5, bArr, bArr2);
                                                            } else {
                                                                hVar = hVar5;
                                                            }
                                                            jVar2 = kVar2.b;
                                                            if (jVar2 == null) {
                                                                boolean z26 = bArr4 != null;
                                                                if (z26) {
                                                                    String str5 = jVar2.n;
                                                                    str5.getClass();
                                                                    bArr3 = j.e(str5);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z27 = z26;
                                                                Uri g14 = g2.f.g(str2, jVar2.a);
                                                                kVar = kVar3;
                                                                long j33 = jVar2.r;
                                                                long j34 = jVar2.s;
                                                                zb.k(g14, "The uri must be set.");
                                                                i2.n nVar5 = new i2.n(g14, 1, null, map, j33, j34, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    hVar4 = new a(hVar5, bArr4, bArr3);
                                                                } else {
                                                                    hVar4 = hVar5;
                                                                }
                                                                hVar2 = hVar4;
                                                                z15 = z27;
                                                                nVar2 = nVar5;
                                                            } else {
                                                                kVar = kVar3;
                                                                nVar2 = null;
                                                                hVar2 = null;
                                                                z15 = false;
                                                            }
                                                            long j35 = j15 + j29;
                                                            long j36 = j35 + kVar2.c;
                                                            int i10 = b11.j + kVar2.d;
                                                            if (jVar == null) {
                                                                i2.n nVar6 = jVar.H;
                                                                boolean z28 = nVar2 == nVar6 || (nVar2 != null && nVar6 != null && nVar2.a.equals(nVar6.a) && nVar2.e == nVar6.e);
                                                                boolean z29 = c2.equals(jVar.y) && jVar.Y;
                                                                hVar3 = jVar.P;
                                                                yVar = jVar.Q;
                                                                bVar = (z28 && z29 && !jVar.a0 && jVar.x == i10) ? jVar.T : null;
                                                            } else {
                                                                hVar3 = new s3.h(null);
                                                                yVar = new y(10);
                                                                bVar = null;
                                                            }
                                                            s3.h hVar6 = hVar3;
                                                            y yVar2 = yVar;
                                                            long j37 = f11.b;
                                                            int i11 = f11.c;
                                                            boolean z30 = !z23;
                                                            boolean z31 = kVar2.w;
                                                            SparseArray sparseArray = (SparseArray) i9Var.b;
                                                            l0Var = (l0) sparseArray.get(i10);
                                                            if (l0Var == null) {
                                                                l0Var = new l0(9223372036854775806L);
                                                                sparseArray.put(i10, l0Var);
                                                            }
                                                            nVar.c = new j(cVar, hVar, nVar4, vVar, z14, hVar2, nVar2, z15, c2, list4, o10, r5, j35, j36, j37, i11, z30, i10, z31, z13, l0Var, kVar2.f, bVar, hVar6, yVar2, z12, z24, kVar);
                                                        }
                                                    }
                                                }
                                                z12 = false;
                                                if (z12) {
                                                }
                                                c cVar42 = iVar2.a;
                                                i2.h hVar52 = iVar2.b;
                                                v vVar2 = iVar2.f[l10];
                                                List list42 = iVar2.i;
                                                int o102 = iVar2.r.o();
                                                Object r52 = iVar2.r.r();
                                                boolean z252 = iVar2.l;
                                                i9 i9Var2 = iVar2.d;
                                                if (g11 != null) {
                                                }
                                                if (g7 != null) {
                                                }
                                                l2.k kVar32 = iVar2.k;
                                                AtomicInteger atomicInteger22 = j.d0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri g132 = g2.f.g(str2, kVar2.a);
                                                qVar = qVar2;
                                                long j312 = kVar2.r;
                                                long j322 = kVar2.s;
                                                if (!z23) {
                                                }
                                                zb.k(g132, "The uri must be set.");
                                                i2.n nVar42 = new i2.n(g132, 1, null, map2, j312, j322, null, i3);
                                                if (bArr == null) {
                                                }
                                                if (z14) {
                                                }
                                                if (bArr == null) {
                                                }
                                                jVar2 = kVar2.b;
                                                if (jVar2 == null) {
                                                }
                                                long j352 = j15 + j29;
                                                long j362 = j352 + kVar2.c;
                                                int i102 = b11.j + kVar2.d;
                                                if (jVar == null) {
                                                }
                                                s3.h hVar62 = hVar3;
                                                y yVar22 = yVar;
                                                long j372 = f11.b;
                                                int i112 = f11.c;
                                                boolean z302 = !z23;
                                                boolean z312 = kVar2.w;
                                                SparseArray sparseArray2 = (SparseArray) i9Var2.b;
                                                l0Var = (l0) sparseArray2.get(i102);
                                                if (l0Var == null) {
                                                }
                                                nVar.c = new j(cVar, hVar, nVar42, vVar2, z14, hVar2, nVar2, z15, c2, list42, o102, r52, j352, j362, j372, i112, z302, i102, z312, z13, l0Var, kVar2.f, bVar, hVar62, yVar22, z12, z24, kVar);
                                            }
                                        }
                                        qVar = qVar2;
                                    }
                                }
                            }
                            jVar = jVar4;
                            iVar2 = iVar4;
                            String str22 = b11.a;
                            boolean z222 = b11.c;
                            j16 = b11.k;
                            i0 i0Var2 = b11.r;
                            if (l10 == a10) {
                            }
                            if (longValue >= j16) {
                            }
                        }
                        z16 = nVar.b;
                        x2.f fVar = (x2.f) nVar.c;
                        Uri uri = (Uri) nVar.d;
                        if (!z16) {
                            this.h0 = j11;
                            this.k0 = true;
                            return true;
                        }
                        if (fVar == null) {
                            if (uri == null || (cVar2 = (r2.c) ((k) this.c.b).b.d.get(uri)) == null) {
                                return false;
                            }
                            r2.c.b(cVar2, uri, true);
                            return false;
                        }
                        if (fVar instanceof j) {
                            j jVar6 = (j) fVar;
                            ArrayList arrayList = this.E;
                            if (!arrayList.isEmpty()) {
                                if (!y().g()) {
                                    x(arrayList.size() - 1);
                                }
                                if (jVar6.E && jVar6.c0) {
                                    int size = arrayList.size() - 1;
                                    while (true) {
                                        if (size < 0) {
                                            break;
                                        }
                                        long j38 = ((j) arrayList.get(size)).h;
                                        long j39 = jVar6.h;
                                        if (j38 < j39) {
                                            break;
                                        }
                                        if (j38 == j39 && o(size)) {
                                            x(size);
                                            jVar6.c0 = false;
                                            break;
                                        }
                                        size--;
                                    }
                                }
                            }
                            this.p0 = jVar6;
                            this.W = jVar6.d;
                            this.h0 = -9223372036854775807L;
                            arrayList.add(jVar6);
                            f0 p10 = i0.p();
                            for (p pVar4 : this.M) {
                                p10.c(Integer.valueOf(pVar4.q + pVar4.p));
                            }
                            s1 f12 = p10.f();
                            jVar6.U = this;
                            jVar6.Z = f12;
                            for (p pVar5 : this.M) {
                                pVar5.getClass();
                                pVar5.E = jVar6.w;
                                if (jVar6.c0) {
                                    pVar5.I = true;
                                }
                            }
                        }
                        this.L = fVar;
                        qVar.f(fVar, this, this.r.F4(fVar.c));
                        return true;
                    }
                }
                z10 = false;
                long j252 = max;
                j jVar42 = jVar3;
                iVar.r.d(j20, j21, j12, list, b10);
                int l102 = iVar.r.l();
                if (a10 == l102) {
                }
                c2 = wVarArr[l102].c();
                if (dVar.f(c2)) {
                }
                z16 = nVar.b;
                x2.f fVar2 = (x2.f) nVar.c;
                Uri uri2 = (Uri) nVar.d;
                if (!z16) {
                }
            }
        }
        return false;
    }

    @Override // w2.f1
    public final boolean d() {
        return this.s.d();
    }

    @Override // w2.f1
    public final long e() {
        if (A()) {
            return this.h0;
        }
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        return y().n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a3.k
    public final void h(a3.m mVar, long j10, long j11) {
        x2.f fVar = (x2.f) mVar;
        this.L = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.s;
            i iVar = this.d;
            iVar.m = bArr;
            y00 y00Var = iVar.j;
            Uri uri = eVar.b.a;
            byte[] bArr2 = eVar.x;
            bArr2.getClass();
            d dVar = (d) y00Var.a;
            uri.getClass();
        }
        long j12 = fVar.a;
        i2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        w2.u uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.r.getClass();
        this.w.q(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (this.U) {
            this.c.k(this);
            return;
        }
        k2.u0 u0Var = new k2.u0();
        u0Var.a = this.g0;
        c(new v0(u0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [q2.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q2.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [e3.i0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [q2.p, w2.c1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [e3.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // e3.q
    public final e3.i0 i0(int i3, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = q0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            zb.f(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.N[i11] = i3;
                }
                r5 = this.N[i11] == i3 ? this.M[i11] : u(i3, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.M;
                if (i12 >= r12.length) {
                    break;
                }
                if (this.N[i12] == i3) {
                    r5 = r12[i12];
                    break;
                }
                i12++;
            }
        }
        if (r5 == 0) {
            if (this.m0) {
                return u(i3, i10);
            }
            int length = this.M.length;
            boolean z10 = i10 == 1 || i10 == 2;
            r5 = new p(this.e, this.h, this.n, this.K);
            r5.t = this.g0;
            if (z10) {
                r5.K = this.o0;
                r5.B = true;
            }
            long j10 = this.n0;
            if (r5.H != j10) {
                r5.H = j10;
                r5.B = true;
            }
            if (this.p0 != null) {
                r5.E = r6.w;
            }
            r5.f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i13);
            this.N = copyOf;
            copyOf[length] = i3;
            p[] pVarArr = this.M;
            String str = n0.a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r5;
            this.M = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f0, i13);
            this.f0 = copyOf3;
            copyOf3[length] = z10;
            this.d0 |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (z(i10) > z(this.R)) {
                this.S = length;
                this.R = i10;
            }
            this.e0 = Arrays.copyOf(this.e0, i13);
        }
        if (i10 != 5) {
            return r5;
        }
        if (this.Q == null) {
            this.Q = new o(r5, this.x);
        }
        return this.Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    @Override // a3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        boolean c2;
        boolean z10;
        int u10;
        a3.i iVar;
        boolean a10;
        int i10;
        x2.f fVar = (x2.f) mVar;
        boolean z11 = fVar instanceof j;
        if (z11 && !((j) fVar).g() && (iOException instanceof i2.y) && ((i10 = ((i2.y) iOException).c) == 410 || i10 == 404)) {
            return a3.q.d;
        }
        long j12 = fVar.r.b;
        i2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        w2.u uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, j12);
        n0.h0(fVar.h);
        n0.h0(fVar.n);
        e5.u uVar2 = new e5.u(iOException, i3, 1);
        boolean z12 = fVar instanceof j;
        i iVar2 = this.d;
        a3.h a11 = z12 ? iVar2.a(((j) fVar).y) : new a3.h(1, 0, iVar2.r.length(), iVar2.d(SystemClock.elapsedRealtime()));
        this.r.getClass();
        a3.i D4 = kb.a.D4(a11, uVar2);
        if (D4 != null) {
            int i11 = D4.a;
            long j13 = D4.b;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException(p1.i(i11, "Invalid fallback selection type: "));
                }
                int a12 = iVar2.h.a(fVar.d);
                if (a12 != -1 && (u10 = iVar2.r.u(a12)) != -1) {
                    c2 = iVar2.r.p(u10, j13);
                    z10 = c2;
                }
            } else if (z12) {
                r2.d dVar = iVar2.g;
                Uri uri = ((j) fVar).y;
                r2.c cVar = (r2.c) dVar.d.get(uri);
                c2 = cVar != null ? r2.c.c(cVar, uri, j13) : false;
                z10 = c2;
            }
            if (z10) {
                long G4 = kb.a.G4(uVar2);
                iVar = G4 != -9223372036854775807L ? new a3.i(0, G4, false) : a3.q.f;
            } else {
                if (z11 && j12 == 0) {
                    ArrayList arrayList = this.E;
                    zb.p(((j) org.telegram.ui.Cells.f1.o(1, arrayList)) == fVar);
                    if (arrayList.isEmpty()) {
                        this.h0 = this.g0;
                    } else {
                        ((j) g9.o.n(arrayList)).a0 = true;
                    }
                }
                iVar = a3.q.e;
            }
            a3.i iVar3 = iVar;
            a10 = iVar3.a();
            this.w.r(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
            if (!a10) {
                this.L = null;
            }
            if (z10) {
                if (!this.U) {
                    k2.u0 u0Var = new k2.u0();
                    u0Var.a = this.g0;
                    c(new v0(u0Var));
                    return iVar3;
                }
                this.c.k(this);
            }
            return iVar3;
        }
        z10 = false;
        if (z10) {
        }
        a3.i iVar32 = iVar;
        a10 = iVar32.a();
        this.w.r(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a10);
        if (!a10) {
        }
        if (z10) {
        }
        return iVar32;
    }

    public final void m() {
        zb.p(this.U);
        this.Z.getClass();
        this.a0.getClass();
    }

    public final boolean o(int i3) {
        int i10 = i3;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 >= arrayList.size()) {
                j jVar = (j) arrayList.get(i3);
                for (int i11 = 0; i11 < this.M.length; i11++) {
                    if (this.M[i11].v() > jVar.f(i11)) {
                        return false;
                    }
                }
                return true;
            }
            if (((j) arrayList.get(i10)).c0) {
                return false;
            }
            i10++;
        }
    }

    @Override // w2.f1
    public final long q() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.h0;
        }
        long j10 = this.g0;
        j y9 = y();
        if (!y9.Y) {
            ArrayList arrayList = this.E;
            y9 = arrayList.size() > 1 ? (j) p1.h(2, arrayList) : null;
        }
        if (y9 != null) {
            j10 = Math.max(j10, y9.n);
        }
        if (this.T) {
            for (p pVar : this.M) {
                j10 = Math.max(j10, pVar.s());
            }
        }
        return j10;
    }

    @Override // a3.k
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        x2.f fVar = (x2.f) mVar;
        this.L = null;
        long j12 = fVar.a;
        i2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        w2.u uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.r.getClass();
        this.w.p(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (A() || this.V == 0) {
            E();
        }
        if (this.V > 0) {
            this.c.k(this);
        }
    }

    @Override // w2.f1
    public final void t(long j10) {
        a3.q qVar = this.s;
        if (qVar.c() || A()) {
            return;
        }
        boolean d = qVar.d();
        boolean z10 = false;
        int i3 = 0;
        z10 = false;
        i iVar = this.d;
        List list = this.F;
        if (d) {
            this.L.getClass();
            if (iVar.n == null ? iVar.r.m(j10, this.L, list) : false) {
                qVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.c((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            x(size);
        }
        int size2 = (iVar.n != null || iVar.r.length() < 2) ? list.size() : iVar.r.j(j10, list);
        if (size2 < this.E.size()) {
            x(size2);
        }
        if (this.T && this.l0 != Long.MIN_VALUE) {
            boolean z11 = true;
            while (true) {
                p[] pVarArr = this.M;
                if (i3 >= pVarArr.length) {
                    break;
                }
                if (this.e0[i3] && (this.f0[i3] || !this.d0)) {
                    z11 &= pVarArr[i3].z();
                }
                i3++;
            }
            z10 = z11;
        }
        if (z10) {
            this.k0 = true;
        }
    }

    public final r1 v(o1[] o1VarArr) {
        for (int i3 = 0; i3 < o1VarArr.length; i3++) {
            o1 o1Var = o1VarArr[i3];
            v[] vVarArr = new v[o1Var.a];
            for (int i10 = 0; i10 < o1Var.a; i10++) {
                v vVar = o1Var.d[i10];
                int u10 = this.h.u(vVar);
                u a10 = vVar.a();
                a10.S = u10;
                vVarArr[i10] = new v(a10);
            }
            o1VarArr[i3] = new o1(o1Var.b, vVarArr);
        }
        return new r1(o1VarArr);
    }

    public final void x(int i3) {
        ArrayList arrayList;
        zb.p(!this.s.d());
        while (true) {
            arrayList = this.E;
            if (i3 >= arrayList.size()) {
                i3 = -1;
                break;
            } else if (o(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        long j10 = y().n;
        j jVar = (j) arrayList.get(i3);
        n0.X(i3, arrayList.size(), arrayList);
        for (int i10 = 0; i10 < this.M.length; i10++) {
            this.M[i10].o(jVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.h0 = this.g0;
        } else {
            ((j) g9.o.n(arrayList)).a0 = true;
        }
        this.k0 = false;
        this.w.B(jVar.h, this.R, j10);
    }

    public final j y() {
        return (j) p1.h(1, this.E);
    }

    @Override // e3.q
    public final void f(b0 b0Var) {
    }
}
