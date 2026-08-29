package q4;

import ag.j2;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import f5.c0;
import f5.d0;
import h7.x6;
import j$.util.DesugarCollections;
import j3.s0;
import j3.t0;
import j7.l1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l4.a1;
import l4.e1;
import l4.g0;
import l4.j1;
import l4.k1;
import l4.x;
import nh.d6;
import o3.w;
import org.telegram.ui.web.t1;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r implements l0, o0, e1, o3.m, a1 {
    public static final Set k0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List A;
    public final o B;
    public final o C;
    public final Handler D;
    public final ArrayList E;
    public final Map F;
    public n4.e G;
    public q[] H;
    public int[] I;
    public final HashSet J;
    public final SparseIntArray K;
    public p L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public int Q;
    public t0 R;
    public t0 S;
    public boolean T;
    public k1 U;
    public Set V;
    public int[] W;
    public int X;
    public boolean Y;
    public boolean[] Z;
    public final String a;
    public boolean[] a0;
    public final int b;
    public long b0;
    public final org.telegram.ui.Components.n c;
    public long c0;
    public final i d;
    public boolean d0;
    public final com.google.android.exoplayer2.upstream.r e;
    public boolean e0;
    public final t0 f;
    public boolean f0;
    public boolean g0;
    public final n3.i h;
    public long h0;
    public n3.c i0;
    public k j0;
    public final j2 n;
    public final f7.v r;
    public final q0 s = new q0("Loader:HlsSampleStreamWrapper");
    public final g0 v;
    public final int w;
    public final androidx.activity.n x;
    public final ArrayList y;

    /* JADX WARN: Type inference failed for: r1v12, types: [q4.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [q4.o] */
    public r(String str, int i10, org.telegram.ui.Components.n nVar, i iVar, Map map, com.google.android.exoplayer2.upstream.r rVar, long j10, t0 t0Var, n3.i iVar2, j2 j2Var, f7.v vVar, g0 g0Var, int i11) {
        this.a = str;
        this.b = i10;
        this.c = nVar;
        this.d = iVar;
        this.F = map;
        this.e = rVar;
        this.f = t0Var;
        this.h = iVar2;
        this.n = j2Var;
        this.r = vVar;
        this.v = g0Var;
        this.w = i11;
        androidx.activity.n nVar2 = new androidx.activity.n();
        nVar2.b = null;
        final int i12 = 0;
        nVar2.a = false;
        nVar2.c = null;
        this.x = nVar2;
        this.I = new int[0];
        Set set = k0;
        this.J = new HashSet(set.size());
        this.K = new SparseIntArray(set.size());
        this.H = new q[0];
        this.a0 = new boolean[0];
        this.Z = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        this.A = DesugarCollections.unmodifiableList(arrayList);
        this.E = new ArrayList();
        this.B = new Runnable(this) { // from class: q4.o
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.v();
                        break;
                    default:
                        r rVar2 = this.b;
                        rVar2.O = true;
                        rVar2.v();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.C = new Runnable(this) { // from class: q4.o
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.v();
                        break;
                    default:
                        r rVar2 = this.b;
                        rVar2.O = true;
                        rVar2.v();
                        break;
                }
            }
        };
        this.D = d0.k(null);
        this.b0 = j10;
        this.c0 = j10;
    }

    public static o3.j e(int i10, int i11) {
        f5.a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new o3.j();
    }

    public static t0 k(t0 t0Var, t0 t0Var2, boolean z10) {
        String a2;
        if (t0Var == null) {
            return t0Var2;
        }
        String str = t0Var.r;
        String str2 = t0Var2.B;
        int g10 = f5.o.g(str2);
        if (d0.n(g10, str) == 1) {
            a2 = d0.o(g10, str);
            str2 = f5.o.c(a2);
        } else {
            a2 = f5.o.a(str, str2);
        }
        t0Var2.v = t0Var.v;
        t0Var2.w = t0Var.w;
        t0Var2.x = t0Var.x;
        t0Var2.y = t0Var.y;
        s0 a10 = t0Var2.a();
        a10.a = t0Var.a;
        a10.b = t0Var.b;
        a10.c = t0Var.c;
        a10.d = t0Var.d;
        a10.e = t0Var.e;
        a10.f = z10 ? t0Var.f : -1;
        a10.g = z10 ? t0Var.h : -1;
        a10.h = a2;
        a10.m = t0Var.x;
        a10.k = t0Var.w;
        a10.j = t0Var.v;
        a10.l = t0Var.y;
        if (g10 == 2) {
            a10.t = t0Var.G;
            a10.u = t0Var.H;
            a10.v = t0Var.I;
        }
        if (str2 != null) {
            a10.o = str2;
        }
        int i10 = t0Var.O;
        if (i10 != -1 && g10 == 1) {
            a10.B = i10;
        }
        b4.c cVar = t0Var.s;
        if (cVar != null) {
            b4.c cVar2 = t0Var2.s;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar);
            }
            a10.i = cVar;
        }
        return new t0(a10);
    }

    public static int t(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // l4.e1
    public final long L() {
        if (this.f0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.c0;
        }
        long j10 = this.b0;
        k q6 = q();
        if (!q6.T) {
            ArrayList arrayList = this.y;
            q6 = arrayList.size() > 1 ? (k) l1.i(2, arrayList) : null;
        }
        if (q6 != null) {
            j10 = Math.max(j10, q6.n);
        }
        if (this.O) {
            for (q qVar : this.H) {
                j10 = Math.max(j10, qVar.n());
            }
        }
        return j10;
    }

    @Override // l4.e1
    public final void U(long j10) {
        q0 q0Var = this.s;
        if (q0Var.c() || u()) {
            return;
        }
        boolean d = q0Var.d();
        i iVar = this.d;
        List list = this.A;
        if (d) {
            this.G.getClass();
            if (iVar.n != null ? false : iVar.q.p(j10, this.G, list)) {
                q0Var.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            l(size);
        }
        int size2 = (iVar.n != null || iVar.q.length() < 2) ? list.size() : iVar.q.j(j10, list);
        if (size2 < this.y.size()) {
            l(size2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [q4.q[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q4.q[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o3.w] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l4.b1, q4.q] */
    /* JADX WARN: Type inference failed for: r5v6, types: [o3.j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // o3.m
    public final w Z1(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Set set = k0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.J;
        SparseIntArray sparseIntArray = this.K;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            f5.a.f(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.I[i12] = i10;
                }
                r52 = this.I[i12] == i10 ? this.H[i12] : e(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.H;
                if (i13 >= r12.length) {
                    break;
                }
                if (this.I[i13] == i10) {
                    r52 = r12[i13];
                    break;
                }
                i13++;
            }
        }
        if (r52 == 0) {
            if (this.g0) {
                return e(i10, i11);
            }
            int length = this.H.length;
            boolean z10 = i11 == 1 || i11 == 2;
            r52 = new q(this.e, this.h, this.n, this.F);
            r52.t = this.b0;
            if (z10) {
                r52.I = this.i0;
                r52.z = true;
            }
            long j10 = this.h0;
            if (r52.F != j10) {
                r52.F = j10;
                r52.z = true;
            }
            k kVar = this.j0;
            if (kVar != null) {
                r52.C = kVar.v;
            }
            r52.f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.I, i14);
            this.I = copyOf;
            copyOf[length] = i10;
            q[] qVarArr = this.H;
            int i15 = d0.a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r52;
            this.H = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.a0, i14);
            this.a0 = copyOf3;
            copyOf3[length] = z10;
            this.Y |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (t(i11) > t(this.M)) {
                this.N = length;
                this.M = i11;
            }
            this.Z = Arrays.copyOf(this.Z, i14);
        }
        if (i11 != 5) {
            return r52;
        }
        if (this.L == null) {
            this.L = new p(r52, this.w);
        }
        return this.L;
    }

    @Override // l4.a1
    public final void a() {
        this.D.post(this.B);
    }

    @Override // l4.e1
    public final boolean b() {
        return this.s.d();
    }

    @Override // com.google.android.exoplayer2.upstream.o0
    public final void c() {
        for (q qVar : this.H) {
            qVar.A(true);
            n3.e eVar = qVar.h;
            if (eVar != null) {
                eVar.p(qVar.e);
                qVar.h = null;
                qVar.g = null;
            }
        }
    }

    public final void d() {
        f5.a.i(this.P);
        this.U.getClass();
        this.V.getClass();
    }

    @Override // o3.m
    public final void e1() {
        this.g0 = true;
        this.D.post(this.C);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void g(n0 n0Var, long j10, long j11, boolean z10) {
        n4.e eVar = (n4.e) n0Var;
        this.G = null;
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        l4.p pVar = new l4.p();
        this.r.getClass();
        this.v.d(pVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z10) {
            return;
        }
        if (u() || this.Q == 0) {
            y();
        }
        if (this.Q > 0) {
            this.c.a(this);
        }
    }

    @Override // l4.e1
    public final long h() {
        if (u()) {
            return this.c0;
        }
        if (this.f0) {
            return Long.MIN_VALUE;
        }
        return q().n;
    }

    public final k1 i(j1[] j1VarArr) {
        for (int i10 = 0; i10 < j1VarArr.length; i10++) {
            j1 j1Var = j1VarArr[i10];
            t0[] t0VarArr = new t0[j1Var.a];
            for (int i11 = 0; i11 < j1Var.a; i11++) {
                t0 t0Var = j1Var.d[i11];
                int b10 = this.h.b(t0Var);
                s0 a2 = t0Var.a();
                a2.J = b10;
                t0VarArr[i11] = new t0(a2);
            }
            j1VarArr[i10] = new j1(j1Var.b, t0VarArr);
        }
        return new k1(j1VarArr);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final k0 j(n0 n0Var, IOException iOException, int i10) {
        boolean z10;
        k0 k0Var;
        int i11;
        n4.e eVar = (n4.e) n0Var;
        boolean z11 = eVar instanceof k;
        if (z11 && !((k) eVar).W && (iOException instanceof h0) && ((i11 = ((h0) iOException).d) == 410 || i11 == 404)) {
            return q0.d;
        }
        long j10 = eVar.r.b;
        Uri uri = eVar.r.c;
        l4.p pVar = new l4.p();
        d0.S(eVar.h);
        d0.S(eVar.n);
        p2.u uVar = new p2.u(iOException, i10, 2);
        i iVar = this.d;
        j0 a2 = x6.a(iVar.q);
        this.r.getClass();
        k0 z12 = f7.v.z(a2, uVar);
        if (z12 == null || z12.a != 2) {
            z10 = false;
        } else {
            long j11 = z12.b;
            d5.r rVar = iVar.q;
            z10 = rVar.d(rVar.u(iVar.h.a(eVar.d)), j11);
        }
        if (z10) {
            if (z11 && j10 == 0) {
                ArrayList arrayList = this.y;
                f5.a.i(((k) com.google.android.recaptcha.internal.a.j(1, arrayList)) == eVar);
                if (arrayList.isEmpty()) {
                    this.c0 = this.b0;
                } else {
                    ((k) q8.l.g(arrayList)).V = true;
                }
            }
            k0Var = q0.e;
        } else {
            long D = f7.v.D(uVar);
            k0Var = D != -9223372036854775807L ? new k0(0, D, false) : q0.f;
        }
        k0 k0Var2 = k0Var;
        boolean a10 = k0Var2.a();
        this.v.h(pVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a10);
        if (!a10) {
            this.G = null;
        }
        if (z10) {
            if (!this.P) {
                s(this.b0);
                return k0Var2;
            }
            this.c.a(this);
        }
        return k0Var2;
    }

    public final void l(int i10) {
        ArrayList arrayList;
        f5.a.i(!this.s.d());
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
                    for (int i13 = 0; i13 < this.H.length; i13++) {
                        if (this.H[i13].q() > kVar.f(i13)) {
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
        long j10 = q().n;
        k kVar2 = (k) arrayList.get(i11);
        d0.N(i11, arrayList.size(), arrayList);
        for (int i14 = 0; i14 < this.H.length; i14++) {
            this.H[i14].k(kVar2.f(i14));
        }
        if (arrayList.isEmpty()) {
            this.c0 = this.b0;
        } else {
            ((k) q8.l.g(arrayList)).V = true;
        }
        this.f0 = false;
        int i15 = this.M;
        long j11 = kVar2.h;
        g0 g0Var = this.v;
        g0Var.m(new x(1, i15, null, 3, null, g0Var.a(j11), g0Var.a(j10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.upstream.l0
    public final void m(n0 n0Var, long j10, long j11) {
        n4.e eVar = (n4.e) n0Var;
        this.G = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.s;
            i iVar = this.d;
            iVar.m = bArr;
            o4.g gVar = iVar.j;
            Uri uri = eVar2.b.a;
            byte[] bArr2 = eVar2.w;
            bArr2.getClass();
            d dVar = (d) gVar.b;
            uri.getClass();
        }
        long j12 = eVar.a;
        Uri uri2 = eVar.r.c;
        l4.p pVar = new l4.p();
        this.r.getClass();
        this.v.f(pVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (this.P) {
            this.c.a(this);
        } else {
            s(this.b0);
        }
    }

    public final k q() {
        return (k) l1.i(1, this.y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x02e1, code lost:
    
        if (r27 < r4.n) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0237  */
    @Override // l4.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j10) {
        long max;
        List list;
        long j11;
        androidx.activity.n nVar;
        int i10;
        androidx.activity.n nVar2;
        k kVar;
        long j12;
        i iVar;
        int i11;
        int i12;
        Uri uri;
        h hVar;
        e d;
        long j13;
        boolean z10;
        List list2;
        boolean z11;
        o4.g gVar;
        byte[] bArr;
        q0 q0Var;
        boolean z12;
        byte[] bArr2;
        com.google.android.exoplayer2.upstream.m mVar;
        r4.g gVar2;
        androidx.activity.n nVar3;
        com.google.android.exoplayer2.upstream.q qVar;
        com.google.android.exoplayer2.upstream.m mVar2;
        boolean z13;
        g4.i iVar2;
        f5.w wVar;
        b bVar;
        c0 c0Var;
        byte[] bArr3;
        String str;
        boolean z14;
        if (this.f0) {
            return false;
        }
        q0 q0Var2 = this.s;
        if (q0Var2.d() || q0Var2.c()) {
            return false;
        }
        if (u()) {
            list = Collections.EMPTY_LIST;
            max = this.c0;
            for (q qVar2 : this.H) {
                qVar2.t = this.c0;
            }
        } else {
            k q6 = q();
            max = q6.T ? q6.n : Math.max(this.b0, q6.h);
            list = this.A;
        }
        List list3 = list;
        androidx.activity.n nVar4 = this.x;
        nVar4.b = null;
        nVar4.a = false;
        nVar4.c = null;
        boolean z15 = this.P || !list3.isEmpty();
        i iVar3 = this.d;
        o4.g gVar3 = iVar3.j;
        Uri[] uriArr = iVar3.e;
        r4.c cVar = iVar3.g;
        k kVar2 = list3.isEmpty() ? null : (k) q8.l.g(list3);
        int a2 = kVar2 == null ? -1 : iVar3.h.a(kVar2.d);
        long j14 = max - j10;
        long j15 = iVar3.r;
        long j16 = j15 != -9223372036854775807L ? j15 - j10 : -9223372036854775807L;
        if (kVar2 == null) {
            j11 = max;
            nVar = nVar4;
            i10 = a2;
        } else if (iVar3.p) {
            j11 = max;
            i10 = a2;
            nVar = nVar4;
        } else {
            i10 = a2;
            nVar = nVar4;
            long j17 = kVar2.n - kVar2.h;
            j11 = max;
            j14 = Math.max(0L, j14 - j17);
            if (j16 != -9223372036854775807L) {
                j16 = Math.max(0L, j16 - j17);
            }
        }
        long j18 = j11;
        k kVar3 = kVar2;
        int i13 = i10;
        iVar3.q.b(j10, j14, j16, list3, iVar3.a(kVar2, j18));
        int l10 = iVar3.q.l();
        boolean z16 = i13 != l10;
        Uri uri2 = uriArr[l10];
        if (cVar.c(uri2)) {
            nVar2 = nVar;
            r4.j a10 = cVar.a(uri2, true);
            a10.getClass();
            long j19 = a10.h;
            iVar3.p = a10.c;
            if (a10.o) {
                kVar = kVar3;
                j12 = -9223372036854775807L;
            } else {
                kVar = kVar3;
                j12 = (a10.u + j19) - cVar.y;
            }
            iVar3.r = j12;
            boolean z17 = z16;
            long j20 = j19 - cVar.y;
            k kVar4 = kVar;
            Pair c3 = iVar3.c(kVar4, z17, a10, j20, j18);
            long longValue = ((Long) c3.first).longValue();
            int intValue = ((Integer) c3.second).intValue();
            if (longValue >= a10.k || kVar4 == null || !z17) {
                iVar = iVar3;
                i11 = l10;
                i12 = intValue;
                uri = uri2;
            } else {
                uri = uriArr[i13];
                a10 = cVar.a(uri, true);
                a10.getClass();
                j20 = a10.h - cVar.y;
                iVar = iVar3;
                Pair c6 = iVar.c(kVar4, false, a10, j20, j18);
                longValue = ((Long) c6.first).longValue();
                i12 = ((Integer) c6.second).intValue();
                i11 = i13;
            }
            long j21 = j20;
            long j22 = longValue;
            String str2 = a10.a;
            boolean z18 = a10.c;
            long j23 = a10.k;
            z zVar = a10.r;
            if (j22 < j23) {
                iVar.n = new l4.b();
            } else {
                z zVar2 = a10.s;
                boolean z19 = z18;
                int i14 = (int) (j22 - j23);
                if (i14 == zVar.size()) {
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    if (i12 < zVar2.size()) {
                        hVar = new h((r4.h) zVar2.get(i12), j22, i12);
                        if (hVar == null) {
                            if (!a10.o) {
                                nVar2.c = uri;
                                iVar.s &= uri.equals(iVar.o);
                                iVar.o = uri;
                            } else if (z15 || zVar.isEmpty()) {
                                nVar2.a = true;
                            } else {
                                hVar = new h((r4.h) q8.l.g(zVar), (j23 + zVar.size()) - 1, -1);
                            }
                        }
                        boolean z20 = hVar.d;
                        r4.h hVar2 = hVar.a;
                        iVar.s = false;
                        iVar.o = null;
                        r4.g gVar4 = hVar2.b;
                        long j24 = hVar2.e;
                        Uri H = (gVar4 != null || (str = gVar4.h) == null) ? null : f5.a.H(str2, str);
                        d = iVar.d(H, i11);
                        nVar2.b = d;
                        if (d == null) {
                            String str3 = hVar2.h;
                            Uri H2 = str3 == null ? null : f5.a.H(str2, str3);
                            e d10 = iVar.d(H2, i11);
                            nVar2.b = d10;
                            if (d10 == null) {
                                if (kVar4 == null) {
                                    AtomicInteger atomicInteger = k.X;
                                } else if (!uri.equals(kVar4.x) || !kVar4.T) {
                                    long j25 = j21 + j24;
                                    if (hVar2 instanceof r4.e) {
                                        z19 = ((r4.e) hVar2).w || (hVar.c == 0 && z19);
                                    }
                                    if (z19) {
                                        j13 = j24;
                                    } else {
                                        j13 = j24;
                                    }
                                    z10 = true;
                                    if (z10 || !z20) {
                                        j jVar = iVar.a;
                                        com.google.android.exoplayer2.upstream.m mVar3 = iVar.b;
                                        t0 t0Var = iVar.f[i11];
                                        List list4 = iVar.i;
                                        int o10 = iVar.q.o();
                                        Object r6 = iVar.q.r();
                                        boolean z21 = iVar.l;
                                        d6 d6Var = iVar.d;
                                        if (H2 != null) {
                                            gVar3.getClass();
                                            list2 = list4;
                                            z11 = z21;
                                            gVar = gVar3;
                                            bArr = null;
                                        } else {
                                            list2 = list4;
                                            z11 = z21;
                                            gVar = gVar3;
                                            bArr = (byte[]) ((d) gVar.b).get(H2);
                                        }
                                        byte[] bArr4 = H != null ? null : (byte[]) ((d) gVar.b).get(H);
                                        k3.k kVar5 = iVar.k;
                                        AtomicInteger atomicInteger2 = k.X;
                                        Map map = Collections.EMPTY_MAP;
                                        Uri H3 = f5.a.H(str2, hVar2.a);
                                        q0Var = q0Var2;
                                        long j26 = hVar2.r;
                                        long j27 = hVar2.s;
                                        int i15 = !z20 ? 8 : 0;
                                        f5.a.k(H3, "The uri must be set.");
                                        com.google.android.exoplayer2.upstream.q qVar3 = new com.google.android.exoplayer2.upstream.q(H3, 1, null, map, j26, j27, null, i15);
                                        z12 = bArr == null;
                                        if (z12) {
                                            bArr2 = null;
                                        } else {
                                            String str4 = hVar2.n;
                                            str4.getClass();
                                            bArr2 = k.e(str4);
                                        }
                                        if (bArr == null) {
                                            bArr2.getClass();
                                            mVar = new a(mVar3, bArr, bArr2);
                                        } else {
                                            mVar = mVar3;
                                        }
                                        gVar2 = hVar2.b;
                                        if (gVar2 == null) {
                                            boolean z22 = bArr4 != null;
                                            if (z22) {
                                                String str5 = gVar2.n;
                                                str5.getClass();
                                                bArr3 = k.e(str5);
                                            } else {
                                                bArr3 = null;
                                            }
                                            nVar3 = nVar2;
                                            boolean z23 = z22;
                                            com.google.android.exoplayer2.upstream.q qVar4 = new com.google.android.exoplayer2.upstream.q(f5.a.H(str2, gVar2.a), 1, null, map, gVar2.r, gVar2.s, null, 0);
                                            if (bArr4 != null) {
                                                bArr3.getClass();
                                                mVar3 = new a(mVar3, bArr4, bArr3);
                                            }
                                            z13 = z23;
                                            mVar2 = mVar3;
                                            qVar = qVar4;
                                        } else {
                                            nVar3 = nVar2;
                                            qVar = null;
                                            mVar2 = null;
                                            z13 = false;
                                        }
                                        long j28 = j21 + j13;
                                        long j29 = j28 + hVar2.c;
                                        int i16 = a10.j + hVar2.d;
                                        if (kVar4 == null) {
                                            com.google.android.exoplayer2.upstream.q qVar5 = kVar4.C;
                                            boolean z24 = qVar == qVar5 || (qVar != null && qVar5 != null && qVar.a.equals(qVar5.a) && qVar.e == qVar5.e);
                                            boolean z25 = uri.equals(kVar4.x) && kVar4.T;
                                            iVar2 = kVar4.K;
                                            wVar = kVar4.L;
                                            bVar = (z24 && z25 && !kVar4.V && kVar4.w == i16) ? kVar4.O : null;
                                        } else {
                                            iVar2 = new g4.i(null);
                                            wVar = new f5.w(10);
                                            bVar = null;
                                        }
                                        g4.i iVar4 = iVar2;
                                        f5.w wVar2 = wVar;
                                        long j30 = hVar.b;
                                        int i17 = hVar.c;
                                        boolean z26 = !z20;
                                        boolean z27 = hVar2.v;
                                        SparseArray sparseArray = (SparseArray) d6Var.b;
                                        c0Var = (c0) sparseArray.get(i16);
                                        if (c0Var == null) {
                                            c0Var = new c0(9223372036854775806L);
                                            sparseArray.put(i16, c0Var);
                                        }
                                        nVar2 = nVar3;
                                        nVar2.b = new k(jVar, mVar, qVar3, t0Var, z12, mVar2, qVar, z13, uri, list2, o10, r6, j28, j29, j30, i17, z26, i16, z27, z11, c0Var, hVar2.f, bVar, iVar4, wVar2, z10, kVar5);
                                        z14 = nVar2.a;
                                        n4.e eVar = (n4.e) nVar2.b;
                                        Uri uri3 = (Uri) nVar2.c;
                                        if (z14) {
                                            this.c0 = -9223372036854775807L;
                                            this.f0 = true;
                                            return true;
                                        }
                                        if (eVar == null) {
                                            if (uri3 == null) {
                                                return false;
                                            }
                                            r4.b bVar2 = (r4.b) ((l) this.c.b).b.d.get(uri3);
                                            bVar2.c(bVar2.a);
                                            return false;
                                        }
                                        if (eVar instanceof k) {
                                            k kVar6 = (k) eVar;
                                            this.j0 = kVar6;
                                            this.R = kVar6.d;
                                            this.c0 = -9223372036854775807L;
                                            this.y.add(kVar6);
                                            q8.x xVar = z.b;
                                            q8.l.a(4, "initialCapacity");
                                            Object[] objArr = new Object[4];
                                            q[] qVarArr = this.H;
                                            int length = qVarArr.length;
                                            int i18 = 0;
                                            int i19 = 0;
                                            while (i19 < length) {
                                                q qVar6 = qVarArr[i19];
                                                Integer valueOf = Integer.valueOf(qVar6.q + qVar6.p);
                                                int i20 = i18 + 1;
                                                if (objArr.length < i20) {
                                                    objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i20));
                                                }
                                                objArr[i18] = valueOf;
                                                i19++;
                                                i18 = i20;
                                            }
                                            q8.l0 s10 = z.s(i18, objArr);
                                            kVar6.P = this;
                                            kVar6.U = s10;
                                            for (q qVar7 : this.H) {
                                                qVar7.getClass();
                                                qVar7.C = kVar6.v;
                                                if (kVar6.y) {
                                                    qVar7.G = true;
                                                }
                                            }
                                        }
                                        this.G = eVar;
                                        q0Var.f(eVar, this, this.r.B(eVar.c));
                                        this.v.k(new l4.p(eVar.b), eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
                                        return true;
                                    }
                                }
                                j13 = j24;
                                z10 = false;
                                if (z10) {
                                }
                                j jVar2 = iVar.a;
                                com.google.android.exoplayer2.upstream.m mVar32 = iVar.b;
                                t0 t0Var2 = iVar.f[i11];
                                List list42 = iVar.i;
                                int o102 = iVar.q.o();
                                Object r62 = iVar.q.r();
                                boolean z212 = iVar.l;
                                d6 d6Var2 = iVar.d;
                                if (H2 != null) {
                                }
                                if (H != null) {
                                }
                                k3.k kVar52 = iVar.k;
                                AtomicInteger atomicInteger22 = k.X;
                                Map map2 = Collections.EMPTY_MAP;
                                Uri H32 = f5.a.H(str2, hVar2.a);
                                q0Var = q0Var2;
                                long j262 = hVar2.r;
                                long j272 = hVar2.s;
                                if (!z20) {
                                }
                                f5.a.k(H32, "The uri must be set.");
                                com.google.android.exoplayer2.upstream.q qVar32 = new com.google.android.exoplayer2.upstream.q(H32, 1, null, map2, j262, j272, null, i15);
                                if (bArr == null) {
                                }
                                if (z12) {
                                }
                                if (bArr == null) {
                                }
                                gVar2 = hVar2.b;
                                if (gVar2 == null) {
                                }
                                long j282 = j21 + j13;
                                long j292 = j282 + hVar2.c;
                                int i162 = a10.j + hVar2.d;
                                if (kVar4 == null) {
                                }
                                g4.i iVar42 = iVar2;
                                f5.w wVar22 = wVar;
                                long j302 = hVar.b;
                                int i172 = hVar.c;
                                boolean z262 = !z20;
                                boolean z272 = hVar2.v;
                                SparseArray sparseArray2 = (SparseArray) d6Var2.b;
                                c0Var = (c0) sparseArray2.get(i162);
                                if (c0Var == null) {
                                }
                                nVar2 = nVar3;
                                nVar2.b = new k(jVar2, mVar, qVar32, t0Var2, z12, mVar2, qVar, z13, uri, list2, o102, r62, j282, j292, j302, i172, z262, i162, z272, z11, c0Var, hVar2.f, bVar, iVar42, wVar22, z10, kVar52);
                                z14 = nVar2.a;
                                n4.e eVar2 = (n4.e) nVar2.b;
                                Uri uri32 = (Uri) nVar2.c;
                                if (z14) {
                                }
                            }
                        }
                    }
                    hVar = null;
                    if (hVar == null) {
                    }
                    boolean z202 = hVar.d;
                    r4.h hVar22 = hVar.a;
                    iVar.s = false;
                    iVar.o = null;
                    r4.g gVar42 = hVar22.b;
                    long j242 = hVar22.e;
                    if (gVar42 != null) {
                    }
                    d = iVar.d(H, i11);
                    nVar2.b = d;
                    if (d == null) {
                    }
                } else {
                    r4.g gVar5 = (r4.g) zVar.get(i14);
                    if (i12 == -1) {
                        hVar = new h(gVar5, j22, -1);
                    } else if (i12 < gVar5.x.size()) {
                        hVar = new h((r4.h) gVar5.x.get(i12), j22, i12);
                    } else {
                        int i21 = i14 + 1;
                        if (i21 < zVar.size()) {
                            hVar = new h((r4.h) zVar.get(i21), j22 + 1, -1);
                        } else {
                            if (!zVar2.isEmpty()) {
                                hVar = new h((r4.h) zVar2.get(0), j22 + 1, 0);
                            }
                            hVar = null;
                        }
                    }
                    if (hVar == null) {
                    }
                    boolean z2022 = hVar.d;
                    r4.h hVar222 = hVar.a;
                    iVar.s = false;
                    iVar.o = null;
                    r4.g gVar422 = hVar222.b;
                    long j2422 = hVar222.e;
                    if (gVar422 != null) {
                    }
                    d = iVar.d(H, i11);
                    nVar2.b = d;
                    if (d == null) {
                    }
                }
            }
        } else {
            nVar2 = nVar;
            nVar2.c = uri2;
            iVar3.s &= uri2.equals(iVar3.o);
            iVar3.o = uri2;
        }
        q0Var = q0Var2;
        z14 = nVar2.a;
        n4.e eVar22 = (n4.e) nVar2.b;
        Uri uri322 = (Uri) nVar2.c;
        if (z14) {
        }
    }

    public final boolean u() {
        return this.c0 != -9223372036854775807L;
    }

    public final void v() {
        if (!this.T && this.W == null && this.O) {
            int i10 = 0;
            for (q qVar : this.H) {
                if (qVar.t() == null) {
                    return;
                }
            }
            k1 k1Var = this.U;
            if (k1Var != null) {
                int i11 = k1Var.a;
                int[] iArr = new int[i11];
                this.W = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        q[] qVarArr = this.H;
                        if (i13 < qVarArr.length) {
                            t0 t10 = qVarArr[i13].t();
                            f5.a.j(t10);
                            t0 t0Var = this.U.a(i12).d[0];
                            String str = t10.B;
                            String str2 = t0Var.B;
                            int g10 = f5.o.g(str);
                            if (g10 == 3) {
                                if (d0.a(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || t10.T == t0Var.T) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                            } else if (g10 == f5.o.g(str2)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.W[i12] = i13;
                }
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((n) obj).b();
                }
                return;
            }
            int length = this.H.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                t0 t11 = this.H[i14].t();
                f5.a.j(t11);
                String str3 = t11.B;
                if (f5.o.j(str3)) {
                    i17 = 2;
                } else if (!f5.o.h(str3)) {
                    i17 = f5.o.i(str3) ? 3 : -2;
                }
                if (t(i17) > t(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            j1 j1Var = this.d.h;
            int i18 = j1Var.a;
            this.X = -1;
            this.W = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.W[i19] = i19;
            }
            j1[] j1VarArr = new j1[length];
            int i20 = 0;
            while (i20 < length) {
                t0 t12 = this.H[i20].t();
                f5.a.j(t12);
                String str4 = this.a;
                t0 t0Var2 = this.f;
                if (i20 == i16) {
                    t0[] t0VarArr = new t0[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        t0 t0Var3 = j1Var.d[i21];
                        if (i15 == 1 && t0Var2 != null) {
                            t0Var3 = t0Var3.c(t0Var2);
                        }
                        t0VarArr[i21] = i18 == 1 ? t12.c(t0Var3) : k(t0Var3, t12, true);
                    }
                    j1VarArr[i20] = new j1(str4, t0VarArr);
                    this.X = i20;
                } else {
                    if (i15 != 2 || !f5.o.h(t12.B)) {
                        t0Var2 = null;
                    }
                    StringBuilder f9 = u3.c.f(str4, ":muxed:");
                    f9.append(i20 < i16 ? i20 : i20 - 1);
                    j1VarArr[i20] = new j1(f9.toString(), k(t0Var2, t12, false));
                }
                i20++;
            }
            this.U = i(j1VarArr);
            f5.a.i(this.V == null);
            this.V = Collections.EMPTY_SET;
            this.P = true;
            this.c.k();
        }
    }

    public final void w() {
        this.s.a();
        i iVar = this.d;
        l4.b bVar = iVar.n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.o;
        if (uri == null || !iVar.s) {
            return;
        }
        r4.b bVar2 = (r4.b) iVar.g.d.get(uri);
        bVar2.b.a();
        IOException iOException = bVar2.s;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void x(j1[] j1VarArr, int... iArr) {
        this.U = i(j1VarArr);
        this.V = new HashSet();
        for (int i10 : iArr) {
            this.V.add(this.U.a(i10));
        }
        this.X = 0;
        this.D.post(new t1(this.c, 12));
        this.P = true;
    }

    public final void y() {
        for (q qVar : this.H) {
            qVar.A(this.d0);
        }
        this.d0 = false;
    }

    public final boolean z(long j10, boolean z10) {
        int i10;
        this.b0 = j10;
        if (u()) {
            this.c0 = j10;
            return true;
        }
        if (this.O && !z10) {
            int length = this.H.length;
            while (i10 < length) {
                i10 = (this.H[i10].D(j10, false) || (!this.a0[i10] && this.Y)) ? i10 + 1 : 0;
            }
            return false;
        }
        this.c0 = j10;
        this.f0 = false;
        this.y.clear();
        q0 q0Var = this.s;
        if (!q0Var.d()) {
            q0Var.c = null;
            y();
            return true;
        }
        if (this.O) {
            for (q qVar : this.H) {
                qVar.i();
            }
        }
        q0Var.b();
        return true;
    }

    @Override // o3.m
    public final void D1(o3.t tVar) {
    }
}
