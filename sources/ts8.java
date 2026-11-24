// default package

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ts8 implements sr6, l74, h86, l86, fp9 {
    public static final Map l0;
    public static final fm4 m0;
    public final mv6 E;
    public final vq2 F;
    public final ns8 G;
    public final ns8 H;
    public final Handler I;
    public rr6 J;
    public pj5 K;
    public ps8[] L;
    public gp9[] M;
    public ss8[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public wtc S;
    public fv9 T;
    public long U;
    public boolean V;
    public byte W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri a;
    public boolean a0;
    public final o63 b;
    public boolean b0;
    public final yq3 c;
    public int c0;
    public final i2f d;
    public final ArrayList d0;
    public final kp e;
    public boolean e0;
    public final vq3 f;
    public long f0;
    public long g0;
    public final vs8 h;
    public boolean h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final mv6 n;
    public final String r;
    public final long s;
    public final fm4 w;
    public final long x;
    public final mv6 y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        l0 = DesugarCollections.unmodifiableMap(hashMap);
        em4 em4Var = new em4();
        em4Var.a = "icy";
        em4Var.s = ud7.n("application/x-icy");
        m0 = new fm4(em4Var);
    }

    public ts8(Uri uri, o63 o63Var, mv6 mv6Var, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, vs8 vs8Var, mv6 mv6Var2, String str, int i, fm4 fm4Var, long j, e69 e69Var) {
        this.a = uri;
        this.b = o63Var;
        this.c = yq3Var;
        this.f = vq3Var;
        this.d = i2fVar;
        this.e = kpVar;
        this.h = vs8Var;
        this.n = mv6Var2;
        this.r = str;
        this.s = i;
        this.w = fm4Var;
        this.y = e69Var != null ? new mv6((Object) e69Var, (byte) 5) : new mv6("ProgressiveMediaPeriod");
        this.E = mv6Var;
        this.x = j;
        this.F = new vq2();
        this.G = new ns8(this, (byte) 1);
        this.H = new ns8(this, (byte) 2);
        this.I = g8c.q(null);
        this.N = new ss8[0];
        this.M = new gp9[0];
        this.L = new ps8[0];
        this.d0 = new ArrayList();
        this.g0 = -9223372036854775807L;
        this.W = (byte) 1;
    }

    public final void A() {
        qs8 qs8Var = new qs8(this, this.a, this.b, this.E, this, this.F);
        if (this.P) {
            gre.p(n());
            long j = this.X;
            if (j == Long.MIN_VALUE) {
                j = this.U;
            }
            if (j != -9223372036854775807L && this.g0 > j) {
                this.j0 = true;
                this.g0 = -9223372036854775807L;
                return;
            }
            fv9 fv9Var = this.T;
            fv9Var.getClass();
            long j2 = fv9Var.f(this.g0).a.b;
            long j3 = this.g0;
            qs8Var.h.a = j2;
            qs8Var.s = j3;
            qs8Var.r = true;
            qs8Var.y = false;
            for (gp9 gp9Var : this.M) {
                gp9Var.t = this.g0;
            }
            this.g0 = -9223372036854775807L;
        }
        this.i0 = h();
        this.y.r0(qs8Var, this, this.d.v3(this.W));
    }

    @Override // l74
    public final void B() {
        this.O = true;
        this.I.post(this.G);
    }

    public final boolean C() {
        return this.Z || n();
    }

    @Override // h86
    public final void C0(k86 k86Var, long j, long j2, int i) {
        qs8 qs8Var = (qs8) k86Var;
        zxa zxaVar = qs8Var.c;
        e86 e86Var = new e86(qs8Var.a, qs8Var.w, j);
        if (i != 0) {
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        this.e.u(new f86(e86Var), 1, -1, null, 0, null, qs8Var.s, this.U, i);
    }

    @Override // l74
    public final wxb T(int i, int i2) {
        return y(new ss8(i, false));
    }

    @Override // h86
    public final void Z(k86 k86Var, long j, long j2) {
        qs8 qs8Var = (qs8) k86Var;
        if (this.U == -9223372036854775807L && this.T != null) {
            long j3 = j(true);
            long j4 = j3 == Long.MIN_VALUE ? 0L : j3 + 10000;
            this.U = j4;
            this.h.v(j4, this.T, this.V);
        }
        zxa zxaVar = qs8Var.c;
        e86 e86Var = new e86(qs8Var.a, qs8Var.w, j);
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.d.getClass();
        this.e.q(f86Var, 1, -1, null, 0, null, qs8Var.s, this.U);
        this.j0 = true;
        rr6 rr6Var = this.J;
        rr6Var.getClass();
        rr6Var.b(this);
    }

    @Override // fp9
    public final void a() {
        this.I.post(this.G);
    }

    public final void b() {
        gre.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override // l86
    public final void c() {
        for (gp9 gp9Var : this.M) {
            gp9Var.G(true);
            sq3 sq3Var = gp9Var.h;
            if (sq3Var != null) {
                sq3Var.c(gp9Var.e);
                gp9Var.h = null;
                gp9Var.g = null;
            }
        }
        mv6 mv6Var = this.E;
        j74 j74Var = (j74) mv6Var.c;
        if (j74Var != null) {
            j74Var.release();
            mv6Var.c = null;
        }
        mv6Var.d = null;
    }

    @Override // q4a
    public final boolean d() {
        boolean z;
        if (this.j0 || !this.y.W()) {
            return false;
        }
        vq2 vq2Var = this.F;
        synchronized (vq2Var) {
            z = vq2Var.b;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18, types: [c17, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // sr6
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        int i;
        ?? r9;
        ArrayList arrayList;
        boolean[] zArr3;
        txb txbVar;
        k64 k64Var;
        k64[] k64VarArr2 = k64VarArr;
        long j2 = j;
        b();
        wtc wtcVar = this.S;
        txb txbVar2 = (txb) wtcVar.a;
        boolean[] zArr4 = (boolean[]) wtcVar.c;
        int i2 = this.c0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= k64VarArr2.length) {
                r9 = false;
                break;
            }
            k64 k64Var2 = k64VarArr2[i4];
            if (k64Var2 != null && Objects.equals(txbVar2.a(txbVar2.b(k64Var2.c())).d[0].t, "application/x-itut-t35")) {
                r9 = true;
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            int length = k64VarArr2.length;
            arrayList = this.d0;
            if (i5 >= length) {
                break;
            }
            ip9 ip9Var = ip9VarArr[i5];
            if (ip9Var != null && (k64VarArr2[i5] == null || !zArr[i5] || (r9 != false && (ip9Var instanceof c17)))) {
                if (ip9Var instanceof c17) {
                    c17 c17Var = (c17) ip9Var;
                    arrayList.remove(c17Var);
                    int i6 = c17Var.a.a;
                    gre.p(zArr4[i6]);
                    this.c0--;
                    zArr4[i6] = false;
                    int i7 = c17Var.b.a;
                    gre.p(zArr4[i7]);
                    this.c0--;
                    zArr4[i7] = false;
                } else {
                    int i8 = ((rs8) ip9Var).a;
                    gre.p(zArr4[i8]);
                    this.c0--;
                    zArr4[i8] = false;
                }
                ip9VarArr[i5] = null;
            }
            i5++;
        }
        boolean z = !this.Y ? j2 == 0 || this.R : i2 != 0;
        int i9 = 0;
        boolean z2 = false;
        while (i9 < k64VarArr2.length) {
            if (ip9VarArr[i9] != null || (k64Var = k64VarArr2[i9]) == null) {
                zArr3 = zArr4;
                txbVar = txbVar2;
            } else {
                gre.p(k64Var.length() == i ? i : i3);
                gre.p(k64Var.k(i3) == 0 ? i : i3);
                int b = txbVar2.b(k64Var.c());
                gre.p(!zArr4[b]);
                boolean z3 = i;
                this.c0++;
                zArr4[b] = z3;
                z2 |= k64Var.o().z;
                int i10 = i3;
                rs8 rs8Var = new rs8(this, b, k64Var.o().z);
                if (Build.VERSION.SDK_INT >= 37 && r9 == false && ud7.m(k64Var.o().t)) {
                    int i11 = i10;
                    while (i11 < txbVar2.a) {
                        if (wj2.e(txbVar2.a(i11).d[i10])) {
                            gre.p(!zArr4[i11]);
                            this.c0++;
                            zArr4[i11] = z3;
                            zArr3 = zArr4;
                            txbVar = txbVar2;
                            ?? c17Var2 = new c17(rs8Var, new rs8(this, i11, i10), k64Var.o());
                            arrayList.add(c17Var2);
                            rs8Var = c17Var2;
                            break;
                        }
                        i11++;
                        i10 = 0;
                    }
                }
                zArr3 = zArr4;
                txbVar = txbVar2;
                ip9VarArr[i9] = rs8Var;
                zArr2[i9] = z3;
                if (!z) {
                    gp9 gp9Var = this.M[b];
                    z = (gp9Var.v() == 0 || gp9Var.J(j2, z3)) ? false : true;
                }
            }
            i9++;
            k64VarArr2 = k64VarArr;
            zArr4 = zArr3;
            txbVar2 = txbVar;
            i3 = 0;
            i = 1;
        }
        if (this.a0 || !this.Y) {
            this.a0 = z2;
        }
        if (this.c0 == 0) {
            this.h0 = false;
            this.Z = false;
            this.a0 = false;
            mv6 mv6Var = this.y;
            if (mv6Var.W()) {
                for (gp9 gp9Var2 : this.M) {
                    gp9Var2.l();
                }
                mv6Var.p();
            } else {
                boolean z4 = false;
                this.j0 = false;
                gp9[] gp9VarArr = this.M;
                int length2 = gp9VarArr.length;
                int i12 = 0;
                while (i12 < length2) {
                    gp9VarArr[i12].G(z4);
                    i12++;
                    z4 = false;
                }
            }
        } else if (z) {
            j2 = l(j2);
            for (int i13 = 0; i13 < ip9VarArr.length; i13++) {
                ip9 ip9Var2 = ip9VarArr[i13];
                if (ip9Var2 != null) {
                    zArr2[i13] = true;
                    if (ip9Var2 instanceof c17) {
                        c17 c17Var3 = (c17) ip9Var2;
                        c17Var3.e.clear();
                        c17Var3.h = null;
                        c17Var3.n = -9223372036854775807L;
                        c17Var3.r = false;
                        c17Var3.s = false;
                        c17Var3.d.clear();
                    }
                }
            }
        }
        this.Y = true;
        return j2;
    }

    @Override // sr6
    public final void f() {
        this.b0 = true;
    }

    @Override // l74
    public final void f0(fv9 fv9Var) {
        this.I.post(new ll8(this, fv9Var, (byte) 19));
    }

    @Override // q4a
    public final long g() {
        return s();
    }

    public final int h() {
        int i = 0;
        for (gp9 gp9Var : this.M) {
            i += gp9Var.z();
        }
        return i;
    }

    @Override // sr6
    public final long i(long j, gv9 gv9Var) {
        b();
        if (!this.T.c()) {
            return 0L;
        }
        ev9 f = this.T.f(j);
        return gv9Var.a(j, f.a.a, f.b.a);
    }

    public final long j(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (i < this.M.length) {
            if (!z) {
                wtc wtcVar = this.S;
                wtcVar.getClass();
                i = ((boolean[]) wtcVar.c)[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.M[i].s());
        }
        return j;
    }

    @Override // sr6
    public final void k() {
        int v3 = this.d.v3(this.W);
        mv6 mv6Var = this.y;
        IOException iOException = (IOException) mv6Var.d;
        if (iOException != null) {
            throw iOException;
        }
        j86 j86Var = (j86) mv6Var.c;
        if (j86Var != null) {
            if (v3 == Integer.MIN_VALUE) {
                v3 = j86Var.a;
            }
            IOException iOException2 = j86Var.e;
            if (iOException2 != null && j86Var.f > v3) {
                throw iOException2;
            }
        }
        if (this.j0 && !this.P) {
            throw av7.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // sr6
    public final long l(long j) {
        int i;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            c17 c17Var = (c17) obj;
            c17Var.e.clear();
            c17Var.h = null;
            c17Var.n = -9223372036854775807L;
            c17Var.r = false;
            c17Var.s = false;
            c17Var.d.clear();
        }
        b();
        boolean[] zArr = (boolean[]) this.S.b;
        if (!this.T.c()) {
            j = 0;
        }
        this.Z = false;
        boolean z = this.f0 == j;
        this.f0 = j;
        if (n()) {
            this.g0 = j;
            return j;
        }
        byte b = this.W;
        mv6 mv6Var = this.y;
        if (b != 7 && (this.j0 || mv6Var.W())) {
            int length = this.M.length;
            for (int i3 = 0; i3 < length; i3++) {
                gp9 gp9Var = this.M[i3];
                if (!this.L[i3].d.get()) {
                    if (this.R) {
                        gp9Var.I(gp9Var.q);
                    } else {
                        long r = gp9Var.r();
                        if (r != Long.MIN_VALUE && j <= r && (i = gp9Var.q) == 0 && z) {
                            gp9Var.I(i);
                        } else if (gp9Var.J(j, this.j0)) {
                            continue;
                        } else if (!zArr[i3] && this.Q) {
                        }
                    }
                }
            }
            return j;
        }
        this.h0 = false;
        this.g0 = j;
        this.j0 = false;
        this.a0 = false;
        if (mv6Var.W()) {
            for (gp9 gp9Var2 : this.M) {
                gp9Var2.l();
            }
            mv6Var.p();
            return j;
        }
        mv6Var.d = null;
        for (gp9 gp9Var3 : this.M) {
            gp9Var3.G(false);
        }
        return j;
    }

    @Override // sr6
    public final void m(long j) {
        if (this.R) {
            return;
        }
        b();
        if (n()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.S.c;
        int length = this.M.length;
        for (int i = 0; i < length; i++) {
            this.M[i].k(j, zArr[i]);
        }
    }

    public final boolean n() {
        return this.g0 != -9223372036854775807L;
    }

    @Override // sr6
    public final long o() {
        if (!this.b0 && this.a0) {
            this.a0 = false;
            return this.f0;
        }
        if (!this.Z) {
            return -9223372036854775807L;
        }
        if (!this.j0 && h() <= this.i0) {
            return -9223372036854775807L;
        }
        this.Z = false;
        return this.f0;
    }

    @Override // sr6
    public final void p(rr6 rr6Var, long j) {
        this.J = rr6Var;
        fm4 fm4Var = this.w;
        if (fm4Var == null) {
            this.F.e();
            A();
        } else {
            T(0, 3).g(fm4Var);
            z(new in5(-9223372036854775807L, new long[]{0}, new long[]{0}));
            B();
            this.g0 = j;
        }
    }

    @Override // sr6
    public final txb q() {
        b();
        return (txb) this.S.a;
    }

    @Override // q4a
    public final boolean r(t86 t86Var) {
        if (this.j0) {
            return false;
        }
        mv6 mv6Var = this.y;
        if (mv6Var.S() || this.h0) {
            return false;
        }
        if ((this.P || this.w != null) && this.c0 == 0) {
            return false;
        }
        boolean e = this.F.e();
        if (mv6Var.W()) {
            return e;
        }
        A();
        return true;
    }

    @Override // q4a
    public final long s() {
        long j;
        boolean z;
        b();
        if (this.j0 || this.c0 == 0) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.g0;
        }
        if (this.Q) {
            int length = this.M.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                wtc wtcVar = this.S;
                if (((boolean[]) wtcVar.b)[i] && ((boolean[]) wtcVar.c)[i]) {
                    gp9 gp9Var = this.M[i];
                    synchronized (gp9Var) {
                        z = gp9Var.z;
                    }
                    if (!z) {
                        j = Math.min(j, this.M[i].s());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        return j == Long.MIN_VALUE ? this.f0 : j;
    }

    @Override // q4a
    public final void t(long j) {
        boolean z;
        if (this.c0 <= 0 || n()) {
            return;
        }
        boolean z2 = false;
        if (this.X != Long.MIN_VALUE) {
            b();
            boolean z3 = true;
            int i = 0;
            while (true) {
                gp9[] gp9VarArr = this.M;
                if (i >= gp9VarArr.length) {
                    break;
                }
                wtc wtcVar = this.S;
                if (((boolean[]) wtcVar.c)[i] && (((boolean[]) wtcVar.b)[i] || !this.Q)) {
                    gp9 gp9Var = gp9VarArr[i];
                    synchronized (gp9Var) {
                        z = gp9Var.x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.j0 = true;
        }
    }

    public final void u() {
        ld7 a;
        long j = this.x;
        if (this.k0 || this.P || !this.O || this.T == null) {
            return;
        }
        boolean z = false;
        for (gp9 gp9Var : this.M) {
            if (gp9Var.y() == null) {
                return;
            }
        }
        vq2 vq2Var = this.F;
        synchronized (vq2Var) {
            vq2Var.b = false;
        }
        int length = this.M.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c = 1;
            if (i2 >= length) {
                break;
            }
            fm4 y = this.M[i2].y();
            y.getClass();
            int h = ud7.h(y.t);
            char c2 = h != 1 ? h != 2 ? h != 3 ? h != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i == 1) {
                c = 3;
            } else if (i == 2) {
                c = 4;
            } else if (i != 3) {
                c = i != 4 ? (char) 0 : (char) 2;
            }
            if (c2 > c) {
                i3 = i2;
                i = h;
            }
            i2++;
        }
        sxb[] sxbVarArr = new sxb[length];
        boolean[] zArr = new boolean[length];
        int i4 = 0;
        while (i4 < length) {
            fm4 y2 = this.M[i4].y();
            y2.getClass();
            String str = y2.t;
            boolean i5 = ud7.i(str);
            boolean z2 = (i5 || ud7.m(str)) ? true : z;
            zArr[i4] = z2;
            boolean z3 = z;
            this.Q |= z2;
            this.R = (j != -9223372036854775807L && length == 1 && ud7.k(str)) ? true : z3 ? 1 : 0;
            pj5 pj5Var = this.K;
            if (pj5Var != null) {
                int i6 = pj5Var.a;
                if (i5 || this.N[i4].b) {
                    ld7 ld7Var = y2.m;
                    if (ld7Var == null) {
                        jd7[] jd7VarArr = new jd7[1];
                        jd7VarArr[z3 ? 1 : 0] = pj5Var;
                        a = new ld7(jd7VarArr);
                    } else {
                        jd7[] jd7VarArr2 = new jd7[1];
                        jd7VarArr2[z3 ? 1 : 0] = pj5Var;
                        a = ld7Var.a(jd7VarArr2);
                    }
                    em4 a2 = y2.a();
                    a2.l = a;
                    y2 = new fm4(a2);
                }
                if (i5 && y2.i == -1 && y2.j == -1 && i6 != -1) {
                    em4 a3 = y2.a();
                    a3.i = i6;
                    y2 = new fm4(a3);
                }
            }
            int w = this.c.w(y2);
            em4 a4 = y2.a();
            a4.W = w;
            fm4 fm4Var = new fm4(a4);
            if (i4 != i3) {
                em4 a5 = fm4Var.a();
                a5.m = Integer.toString(i3);
                fm4Var = new fm4(a5);
            }
            String num = Integer.toString(i4);
            fm4[] fm4VarArr = new fm4[1];
            fm4VarArr[z3 ? 1 : 0] = fm4Var;
            sxbVarArr[i4] = new sxb(num, fm4VarArr);
            this.M[i4].K(this.X);
            i4++;
            z = z3 ? 1 : 0;
        }
        txb txbVar = new txb(sxbVarArr);
        wtc wtcVar = new wtc();
        wtcVar.a = txbVar;
        wtcVar.b = zArr;
        int i7 = txbVar.a;
        wtcVar.c = new boolean[i7];
        wtcVar.d = new boolean[i7];
        this.S = wtcVar;
        if (this.R && this.U == -9223372036854775807L) {
            this.U = j;
            this.T = new os8(this, this.T);
        }
        this.h.v(this.U, this.T, this.V);
        this.P = true;
        rr6 rr6Var = this.J;
        rr6Var.getClass();
        rr6Var.a(this);
    }

    @Override // h86
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        qs8 qs8Var = (qs8) k86Var;
        zxa zxaVar = qs8Var.c;
        e86 e86Var = new e86(qs8Var.a, qs8Var.w, j);
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.d.getClass();
        this.e.o(f86Var, 1, -1, null, 0, null, qs8Var.s, this.U);
        if (z) {
            return;
        }
        for (gp9 gp9Var : this.M) {
            gp9Var.G(false);
        }
        if (this.c0 > 0) {
            rr6 rr6Var = this.J;
            rr6Var.getClass();
            rr6Var.b(this);
        }
    }

    public final void w(int i) {
        b();
        wtc wtcVar = this.S;
        boolean[] zArr = (boolean[]) wtcVar.d;
        if (zArr[i]) {
            return;
        }
        fm4 fm4Var = ((txb) wtcVar.a).a(i).d[0];
        this.e.i(ud7.h(fm4Var.t), fm4Var, 0, null, this.f0);
        zArr[i] = true;
    }

    @Override // h86
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        long min;
        i86 i86Var;
        fv9 fv9Var;
        qs8 qs8Var = (qs8) k86Var;
        zxa zxaVar = qs8Var.c;
        e86 e86Var = new e86(qs8Var.a, qs8Var.w, j);
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        String str = g8c.a;
        this.d.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof av7) || (th instanceof FileNotFoundException) || (th instanceof ig5) || (th instanceof m86) || ((th instanceof r63) && ((r63) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            i86Var = mv6.E;
        } else {
            int h = h();
            int i2 = h > this.i0 ? 1 : 0;
            if (this.e0 || !((fv9Var = this.T) == null || fv9Var.h() == -9223372036854775807L)) {
                this.i0 = h;
            } else if (!this.P || C()) {
                this.Z = this.P;
                this.f0 = 0L;
                this.i0 = 0;
                for (gp9 gp9Var : this.M) {
                    gp9Var.G(false);
                }
                qs8Var.h.a = 0L;
                qs8Var.s = 0L;
                qs8Var.r = true;
                qs8Var.y = false;
            } else {
                this.h0 = true;
                i86Var = mv6.y;
            }
            i86Var = new i86(i2, min);
        }
        this.e.r(f86Var, 1, -1, null, 0, null, qs8Var.s, this.U, iOException, !i86Var.a());
        return i86Var;
    }

    public final void x(int i) {
        b();
        if (this.h0) {
            if ((!this.Q || ((boolean[]) this.S.b)[i]) && !this.M[i].A(false)) {
                this.g0 = 0L;
                this.h0 = false;
                this.Z = true;
                this.f0 = 0L;
                this.i0 = 0;
                for (gp9 gp9Var : this.M) {
                    gp9Var.G(false);
                }
                rr6 rr6Var = this.J;
                rr6Var.getClass();
                rr6Var.b(this);
            }
        }
    }

    public final wxb y(ss8 ss8Var) {
        int length = this.M.length;
        for (int i = 0; i < length; i++) {
            if (ss8Var.equals(this.N[i])) {
                return this.M[i];
            }
        }
        if (this.O) {
            lad.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + ss8Var.a + ") after finishing tracks.");
            return new yn3();
        }
        gp9 gp9Var = new gp9(this.n, this.c, this.f);
        ps8 ps8Var = new ps8(gp9Var);
        gp9Var.f = this;
        int i2 = length + 1;
        ss8[] ss8VarArr = (ss8[]) Arrays.copyOf(this.N, i2);
        ss8VarArr[length] = ss8Var;
        String str = g8c.a;
        this.N = ss8VarArr;
        gp9[] gp9VarArr = (gp9[]) Arrays.copyOf(this.M, i2);
        gp9VarArr[length] = gp9Var;
        this.M = gp9VarArr;
        ps8[] ps8VarArr = (ps8[]) Arrays.copyOf(this.L, i2);
        ps8VarArr[length] = ps8Var;
        this.L = ps8VarArr;
        return ps8Var;
    }

    public final void z(fv9 fv9Var) {
        this.T = this.K == null ? fv9Var : new oc0(-9223372036854775807L);
        this.U = fv9Var.h();
        boolean z = !this.e0 && fv9Var.h() == -9223372036854775807L;
        this.V = z;
        this.W = z ? (byte) 7 : (byte) 1;
        if (this.P) {
            this.h.v(this.U, fv9Var, z);
        } else {
            u();
        }
    }
}
