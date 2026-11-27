// default package

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wh2 implements at9, i8a, la6, pa6 {
    public final ys9[] E;
    public final lh2 F;
    public rh2 G;
    public ko4 H;
    public d63 I;
    public long J;
    public long K;
    public int L;
    public pg0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public final int a;
    public final int[] b;
    public final ko4[] c;
    public final boolean[] d;
    public final pa3 e;
    public final d63 f;
    public final lp h;
    public final z6f n;
    public final rx6 r;
    public final n31 s;
    public final ArrayList w;
    public final List x;
    public final ys9 y;

    public wh2(int i, int[] iArr, ko4[] ko4VarArr, pa3 pa3Var, d63 d63Var, rx6 rx6Var, long j, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, boolean z, long j2, r99 r99Var) {
        this.a = i;
        this.b = iArr;
        this.c = ko4VarArr;
        this.e = pa3Var;
        this.f = d63Var;
        this.h = lpVar;
        this.n = z6fVar;
        this.r = r99Var != null ? new rx6((Object) r99Var, (byte) 5) : new rx6("ChunkSampleStream");
        this.s = new n31((byte) 2);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new ys9[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        ys9[] ys9VarArr = new ys9[i2];
        pr3Var.getClass();
        ys9 ys9Var = new ys9(rx6Var, pr3Var, mr3Var);
        this.y = ys9Var;
        iArr2[0] = i;
        ys9VarArr[0] = ys9Var;
        int i3 = 0;
        while (i3 < length) {
            ys9 ys9Var2 = new ys9(rx6Var, null, null);
            this.E[i3] = ys9Var2;
            int i4 = i3 + 1;
            ys9VarArr[i4] = ys9Var2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.F = new lh2(iArr2, ys9VarArr, (byte) 8);
        this.J = j;
        this.K = j;
        this.R = Long.MIN_VALUE;
        this.N = z;
        if (!z || j2 == -9223372036854775807L) {
            return;
        }
        this.N = false;
        this.O = j2 < j;
    }

    public final void A() {
        int B = B(this.y.v(), this.L - 1);
        while (true) {
            int i = this.L;
            if (i > B) {
                return;
            }
            this.L = i + 1;
            pg0 pg0Var = (pg0) this.w.get(i);
            ko4 ko4Var = pg0Var.d;
            if (!ko4Var.equals(this.H)) {
                this.h.i(this.a, ko4Var, pg0Var.e, pg0Var.f, pg0Var.h);
            }
            this.H = ko4Var;
        }
    }

    public final int B(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.w;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((pg0) arrayList.get(i2)).e(0) <= i);
        return i2 - 1;
    }

    public final void C(d63 d63Var) {
        this.I = d63Var;
        ys9 ys9Var = this.y;
        ys9Var.l();
        jr3 jr3Var = ys9Var.h;
        if (jr3Var != null) {
            jr3Var.c(ys9Var.e);
            ys9Var.h = null;
            ys9Var.g = null;
        }
        for (ys9 ys9Var2 : this.E) {
            ys9Var2.l();
            jr3 jr3Var2 = ys9Var2.h;
            if (jr3Var2 != null) {
                jr3Var2.c(ys9Var2.e);
                ys9Var2.h = null;
                ys9Var2.g = null;
            }
        }
        this.r.g0(this);
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
        this.h.v(new ja6(ia6Var), rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, i);
    }

    @Override // at9
    public final int a() {
        if (this.N) {
            return 2;
        }
        return this.O ? 4 : 0;
    }

    @Override // pa6
    public final void b() {
        ys9 ys9Var = this.y;
        ys9Var.G(true);
        jr3 jr3Var = ys9Var.h;
        if (jr3Var != null) {
            jr3Var.c(ys9Var.e);
            ys9Var.h = null;
            ys9Var.g = null;
        }
        for (ys9 ys9Var2 : this.E) {
            ys9Var2.G(true);
            jr3 jr3Var2 = ys9Var2.h;
            if (jr3Var2 != null) {
                jr3Var2.c(ys9Var2.e);
                ys9Var2.h = null;
                ys9Var2.g = null;
            }
        }
        for (na3 na3Var : this.e.h) {
            o31 o31Var = na3Var.a;
            if (o31Var != null) {
                o31Var.a.release();
            }
        }
        d63 d63Var = this.I;
        if (d63Var != null) {
            synchronized (d63Var) {
                fg8 fg8Var = (fg8) d63Var.E.remove(this);
                if (fg8Var != null) {
                    ys9 ys9Var3 = fg8Var.a;
                    ys9Var3.G(true);
                    jr3 jr3Var3 = ys9Var3.h;
                    if (jr3Var3 != null) {
                        jr3Var3.c(null);
                        ys9Var3.h = null;
                        ys9Var3.g = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0299  */
    @Override // la6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        z6f z6fVar;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        long j3;
        boolean z4;
        ma6 ma6Var;
        boolean a;
        rh2 rh2Var = (rh2) oa6Var;
        b2b b2bVar = rh2Var.r;
        ko4 ko4Var = rh2Var.d;
        long j4 = rh2Var.h;
        long j5 = b2bVar.b;
        boolean z5 = rh2Var instanceof pg0;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size() - 1;
        boolean z6 = (j5 != 0 && z5 && x(size)) ? false : true;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar2 = rh2Var.r;
        ia6Var.d = b2bVar2.c;
        ia6Var.e = b2bVar2.d;
        ia6Var.f = j2;
        ia6Var.g = j5;
        ja6 ja6Var = new ja6(ia6Var);
        gcc.i0(j4);
        gcc.i0(rh2Var.n);
        ed edVar = new ed(iOException, i, (byte) 8);
        pa3 pa3Var = this.e;
        na3[] na3VarArr = pa3Var.h;
        u8a u8aVar = pa3Var.b;
        z6f z6fVar2 = this.n;
        if (z6) {
            fg8 fg8Var = pa3Var.g;
            if (fg8Var != null) {
                long j6 = fg8Var.d;
                boolean z7 = j6 != -9223372036854775807L && j6 < j4;
                gg8 gg8Var = fg8Var.e;
                if (gg8Var.f.d) {
                    if (!gg8Var.n) {
                        if (z7) {
                            if (gg8Var.h) {
                                gg8Var.n = true;
                                gg8Var.h = false;
                                i63 i63Var = (i63) gg8Var.b.a;
                                i63Var.I.removeCallbacks(i63Var.x);
                                i63Var.D();
                            }
                        }
                    }
                    z2 = z5;
                    arrayList = arrayList2;
                    z6fVar = z6fVar2;
                    z = z6;
                    z3 = true;
                    z4 = true;
                    if (z4) {
                        if (z) {
                            ma6Var = rx6.y;
                            if (z2) {
                                yve.p(v(size) == rh2Var ? z3 : false);
                                if (arrayList.isEmpty()) {
                                    this.J = this.K;
                                }
                            }
                            if (ma6Var == null) {
                                z6fVar.getClass();
                                long w3 = z6f.w3(edVar);
                                ma6Var = w3 != -9223372036854775807L ? new ma6(0, w3) : rx6.E;
                            }
                            ma6 ma6Var2 = ma6Var;
                            a = ma6Var2.a();
                            this.h.r(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, iOException, !a);
                            if (!a) {
                                this.G = null;
                                z6fVar.getClass();
                                this.f.f(this);
                            }
                            return ma6Var2;
                        }
                        efd.f("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    ma6Var = null;
                    if (ma6Var == null) {
                    }
                    ma6 ma6Var22 = ma6Var;
                    a = ma6Var22.a();
                    this.h.r(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, iOException, !a);
                    if (!a) {
                    }
                    return ma6Var22;
                }
            }
            if (!pa3Var.j.d && (rh2Var instanceof fm6) && (iOException instanceof ni5) && ((ni5) iOException).c == 404) {
                na3 na3Var = na3VarArr[pa3Var.i.e(rh2Var.d)];
                long c = na3Var.c();
                if (c != -1 && c != 0) {
                    j63 j63Var = na3Var.d;
                    j63Var.getClass();
                    if (((fm6) rh2Var).b() > ((j63Var.V() + na3Var.f) + c) - 1) {
                        pa3Var.m = true;
                        z2 = z5;
                        arrayList = arrayList2;
                        z6fVar = z6fVar2;
                        z = z6;
                        z3 = true;
                        z4 = true;
                        if (z4) {
                        }
                        ma6Var = null;
                        if (ma6Var == null) {
                        }
                        ma6 ma6Var222 = ma6Var;
                        a = ma6Var222.a();
                        this.h.r(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, iOException, !a);
                        if (!a) {
                        }
                        return ma6Var222;
                    }
                }
            }
            na3 na3Var2 = na3VarArr[pa3Var.i.e(ko4Var)];
            ub9 ub9Var = na3Var2.b;
            xg0 xg0Var = na3Var2.c;
            xg0 G = u8aVar.G(ub9Var.b);
            if (G == null || xg0Var.equals(G)) {
                e74 e74Var = pa3Var.i;
                po5 po5Var = na3Var2.b.b;
                z6fVar = z6fVar2;
                z = z6;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                z2 = z5;
                int length = e74Var.length();
                arrayList = arrayList2;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (e74Var.a(i3, elapsedRealtime)) {
                        i2++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < po5Var.size(); i4++) {
                    hashSet.add(Integer.valueOf(((xg0) po5Var.get(i4)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList g = u8aVar.g(po5Var);
                for (int i5 = 0; i5 < g.size(); i5++) {
                    hashSet2.add(Integer.valueOf(((xg0) g.get(i5)).c));
                }
                ga6 ga6Var = new ga6(false, size2, size2 - hashSet2.size(), length, i2);
                if (ga6Var.a(2) || ga6Var.a(1)) {
                    z6fVar.getClass();
                    ha6 u3 = z6f.u3(ga6Var, edVar);
                    if (u3 != null) {
                        long j7 = u3.b;
                        byte b = u3.a;
                        if (ga6Var.a(b)) {
                            if (b == 2) {
                                e74 e74Var2 = pa3Var.i;
                                z4 = e74Var2.p(e74Var2.e(ko4Var), j7);
                                z3 = true;
                            } else {
                                z3 = true;
                                if (b == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j7;
                                    String str = xg0Var.b;
                                    HashMap hashMap = (HashMap) u8aVar.a;
                                    if (hashMap.containsKey(str)) {
                                        Long l = (Long) hashMap.get(str);
                                        String str2 = gcc.a;
                                        j3 = Math.max(elapsedRealtime2, l.longValue());
                                    } else {
                                        j3 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j3));
                                    int i6 = xg0Var.c;
                                    if (i6 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i6);
                                        HashMap hashMap2 = (HashMap) u8aVar.b;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l2 = (Long) hashMap2.get(valueOf);
                                            String str3 = gcc.a;
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                        }
                                        hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                    }
                                    z4 = true;
                                }
                                z4 = false;
                            }
                            if (z4) {
                            }
                            ma6Var = null;
                            if (ma6Var == null) {
                            }
                            ma6 ma6Var2222 = ma6Var;
                            a = ma6Var2222.a();
                            this.h.r(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, iOException, !a);
                            if (!a) {
                            }
                            return ma6Var2222;
                        }
                    }
                }
            }
            z2 = z5;
            arrayList = arrayList2;
            z6fVar = z6fVar2;
            z = z6;
            z3 = true;
            z4 = true;
            if (z4) {
            }
            ma6Var = null;
            if (ma6Var == null) {
            }
            ma6 ma6Var22222 = ma6Var;
            a = ma6Var22222.a();
            this.h.r(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, iOException, !a);
            if (!a) {
            }
            return ma6Var22222;
        }
        z2 = z5;
        arrayList = arrayList2;
        z6fVar = z6fVar2;
        z = z6;
        z3 = true;
        z4 = false;
        if (z4) {
        }
        ma6Var = null;
        if (ma6Var == null) {
        }
        ma6 ma6Var222222 = ma6Var;
        a = ma6Var222222.a();
        this.h.r(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, iOException, !a);
        if (!a) {
        }
        return ma6Var222222;
    }

    @Override // i8a
    public final boolean e() {
        return this.r.Z();
    }

    @Override // la6
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        rh2 rh2Var = (rh2) oa6Var;
        this.G = null;
        this.M = null;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.n.getClass();
        this.h.o(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n);
        if (z) {
            return;
        }
        if (y()) {
            this.y.G(false);
            for (ys9 ys9Var : this.E) {
                ys9Var.G(false);
            }
        } else if (rh2Var instanceof pg0) {
            ArrayList arrayList = this.w;
            v(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.J = this.K;
            }
        }
        this.f.f(this);
    }

    @Override // la6
    public final void f0(oa6 oa6Var, long j, long j2) {
        rh2 rh2Var = (rh2) oa6Var;
        this.G = null;
        pa3 pa3Var = this.e;
        na3[] na3VarArr = pa3Var.h;
        if (rh2Var instanceof rp5) {
            int e = pa3Var.i.e(((rp5) rh2Var).d);
            na3 na3Var = na3VarArr[e];
            if (na3Var.d == null) {
                o31 o31Var = na3Var.a;
                o31Var.getClass();
                sh2 a = o31Var.a();
                if (a != null) {
                    ub9 ub9Var = na3Var.b;
                    na3VarArr[e] = new na3(na3Var.e, ub9Var, na3Var.c, na3Var.a, na3Var.f, new zg2(a, ub9Var.c, (byte) 1));
                }
            }
        }
        fg8 fg8Var = pa3Var.g;
        if (fg8Var != null) {
            long j3 = fg8Var.d;
            if (j3 == -9223372036854775807L || rh2Var.n > j3) {
                fg8Var.d = rh2Var.n;
            }
            fg8Var.e.h = true;
        }
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.n.getClass();
        this.h.q(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n);
        this.f.f(this);
    }

    @Override // at9
    public final void g() {
        rx6 rx6Var = this.r;
        rx6Var.g();
        this.y.C();
        if (rx6Var.Z()) {
            return;
        }
        pa3 pa3Var = this.e;
        kh0 kh0Var = pa3Var.l;
        if (kh0Var != null) {
            throw kh0Var;
        }
        pa3Var.a.g();
    }

    @Override // i8a
    public final long h() {
        if (y()) {
            return this.J;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    @Override // at9
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        boolean z = !this.P && z();
        if (y() || z || this.Q) {
            return -3;
        }
        pg0 pg0Var = this.M;
        ys9 ys9Var = this.y;
        if (pg0Var != null && pg0Var.e(0) <= ys9Var.v()) {
            return -3;
        }
        A();
        return ys9Var.F(ym4Var, s93Var, i, this.S);
    }

    @Override // at9
    public final boolean k() {
        return !y() && this.y.A(this.S);
    }

    @Override // at9
    public final int o(long j) {
        boolean z = !this.P && z();
        if (y() || z || this.Q) {
            return 0;
        }
        boolean z2 = this.S;
        ys9 ys9Var = this.y;
        int x = ys9Var.x(j, z2);
        pg0 pg0Var = this.M;
        if (pg0Var != null) {
            x = Math.min(x, pg0Var.e(0) - ys9Var.v());
        }
        ys9Var.L(x);
        A();
        return x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0468  */
    @Override // i8a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(xa6 xa6Var) {
        long j;
        List list;
        n31 n31Var;
        long j2;
        boolean z;
        na3[] na3VarArr;
        long j3;
        rx6 rx6Var;
        n31 n31Var2;
        List list2;
        boolean z2;
        long j4;
        long j5;
        long j6;
        Object rv2Var;
        n29 n29Var;
        long j7;
        boolean z3;
        boolean z4;
        rh2 rh2Var;
        boolean z5;
        long j8;
        if (this.S) {
            return false;
        }
        rx6 rx6Var2 = this.r;
        if (rx6Var2.Z() || rx6Var2.U()) {
            return false;
        }
        boolean y = y();
        if (y) {
            list = Collections.EMPTY_LIST;
            j = this.J;
        } else {
            j = w().n;
            list = this.x;
        }
        List list3 = list;
        pa3 pa3Var = this.e;
        kh0 kh0Var = pa3Var.l;
        n31 n31Var3 = this.s;
        if (kh0Var == null) {
            n31Var = n31Var3;
            long j9 = xa6Var.a;
            long j10 = j - j9;
            j2 = -9223372036854775807L;
            z = y;
            long T = gcc.T(pa3Var.j.b(pa3Var.k).b) + gcc.T(pa3Var.j.a) + j;
            fg8 fg8Var = pa3Var.g;
            if (fg8Var != null) {
                gg8 gg8Var = fg8Var.e;
                z53 z53Var = gg8Var.f;
                wz4 wz4Var = gg8Var.b;
                if (!z53Var.d) {
                    z3 = false;
                } else if (gg8Var.n) {
                    z3 = true;
                } else {
                    Map.Entry ceilingEntry = gg8Var.e.ceilingEntry(Long.valueOf(z53Var.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= T) {
                        z3 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        i63 i63Var = (i63) wz4Var.a;
                        long j11 = i63Var.P;
                        if (j11 == -9223372036854775807L || j11 < longValue) {
                            i63Var.P = longValue;
                        }
                        z3 = true;
                    }
                    if (z3 && gg8Var.h) {
                        gg8Var.n = true;
                        gg8Var.h = false;
                        i63 i63Var2 = (i63) wz4Var.a;
                        i63Var2.I.removeCallbacks(i63Var2.x);
                        i63Var2.D();
                    }
                }
            }
            long T2 = gcc.T(gcc.E(pa3Var.f));
            z53 z53Var2 = pa3Var.j;
            long j12 = z53Var2.a;
            long T3 = j12 == -9223372036854775807L ? -9223372036854775807L : T2 - gcc.T(j12 + z53Var2.b(pa3Var.k).b);
            fm6 fm6Var = list3.isEmpty() ? null : (fm6) bp1.m(1, list3);
            int length = pa3Var.i.length();
            gm6[] gm6VarArr = new gm6[length];
            int i = 0;
            while (true) {
                na3VarArr = pa3Var.h;
                if (i >= length) {
                    break;
                }
                na3 na3Var = na3VarArr[i];
                j63 j63Var = na3Var.d;
                long j13 = T3;
                long j14 = na3Var.f;
                long j15 = na3Var.e;
                z6f z6fVar = gm6.z;
                if (j63Var == null) {
                    gm6VarArr[i] = z6fVar;
                } else {
                    j63Var.getClass();
                    long r = j63Var.r(j15, T2) + j14;
                    long b = na3Var.b(T2);
                    if (fm6Var != null) {
                        j7 = fm6Var.b();
                    } else {
                        j63 j63Var2 = na3Var.d;
                        j63Var2.getClass();
                        j7 = gcc.j(j63Var2.I(j, j15) + j14, r, b);
                    }
                    long j16 = j7;
                    if (j16 < r) {
                        gm6VarArr[i] = z6fVar;
                    } else {
                        gm6VarArr[i] = new oa3(pa3Var.b(i), j16, b);
                    }
                }
                i++;
                T3 = j13;
            }
            long j17 = T3;
            long j18 = 0;
            if (!pa3Var.j.d || na3VarArr[0].c() == 0) {
                j3 = -9223372036854775807L;
            } else {
                long d = na3VarArr[0].d(na3VarArr[0].b(T2));
                z53 z53Var3 = pa3Var.j;
                long j19 = z53Var3.a;
                long min = Math.min(j19 == -9223372036854775807L ? -9223372036854775807L : T2 - gcc.T(j19 + z53Var3.b(pa3Var.k).b), d) - j9;
                j18 = 0;
                j3 = Math.max(0L, min);
            }
            rx6Var = rx6Var2;
            n31Var2 = n31Var;
            long j20 = j18;
            pa3Var.i.b(j9, j10, j3, list3, gm6VarArr);
            int d2 = pa3Var.i.d();
            SystemClock.elapsedRealtime();
            na3 b2 = pa3Var.b(d2);
            long j21 = b2.e;
            long j22 = b2.f;
            j63 j63Var3 = b2.d;
            xg0 xg0Var = b2.c;
            o31 o31Var = b2.a;
            ub9 ub9Var = b2.b;
            if (o31Var != null) {
                n29 n29Var2 = o31Var.r == null ? ub9Var.e : null;
                if (j63Var3 == null) {
                    list2 = list3;
                    n29Var = ub9Var.c();
                } else {
                    list2 = list3;
                    n29Var = null;
                }
                if (n29Var2 != null || n29Var != null) {
                    h73 h73Var = pa3Var.e;
                    ko4 n = pa3Var.i.n();
                    int o = pa3Var.i.o();
                    Object r2 = pa3Var.i.r();
                    if (n29Var2 != null) {
                        n29 a = n29Var2.a(n29Var, xg0Var.a);
                        if (a != null) {
                            n29Var2 = a;
                        }
                    } else {
                        n29Var.getClass();
                        n29Var2 = n29Var;
                    }
                    n31Var2.c = new rp5(h73Var, bge.a(ub9Var, xg0Var.a, n29Var2, 0), n, o, r2, b2.a);
                    z4 = n31Var2.b;
                    rh2Var = (rh2) n31Var2.c;
                    n31Var2.c = null;
                    n31Var2.b = false;
                    if (rh2Var != null) {
                        long j23 = this.R;
                        if (j23 != Long.MIN_VALUE && rh2Var.h >= j23) {
                            z5 = true;
                            if (!z4) {
                                j8 = -9223372036854775807L;
                            } else {
                                if (!z5) {
                                    if (rh2Var == null) {
                                        return false;
                                    }
                                    this.G = rh2Var;
                                    boolean z6 = rh2Var instanceof pg0;
                                    lh2 lh2Var = this.F;
                                    if (z6) {
                                        pg0 pg0Var = (pg0) rh2Var;
                                        if (z) {
                                            long j24 = pg0Var.h;
                                            long j25 = this.J;
                                            if (j24 < j25) {
                                                this.y.t = j25;
                                                for (ys9 ys9Var : this.E) {
                                                    ys9Var.t = this.J;
                                                }
                                                this.O = this.N;
                                            }
                                            this.N = false;
                                            this.J = j2;
                                        }
                                        pg0Var.y = lh2Var;
                                        ys9[] ys9VarArr = (ys9[]) lh2Var.c;
                                        int[] iArr = new int[ys9VarArr.length];
                                        for (int i2 = 0; i2 < ys9VarArr.length; i2++) {
                                            iArr[i2] = ys9VarArr[i2].z();
                                        }
                                        pg0Var.E = iArr;
                                        this.w.add(pg0Var);
                                    } else if (rh2Var instanceof rp5) {
                                        ((rp5) rh2Var).w = lh2Var;
                                    }
                                    rx6Var.w0(rh2Var, this, this.n.v3(rh2Var.c));
                                    return true;
                                }
                                j8 = j2;
                            }
                            this.J = j8;
                            this.S = true;
                            return true;
                        }
                    }
                    z5 = false;
                    if (!z4) {
                    }
                    this.J = j8;
                    this.S = true;
                    return true;
                }
            } else {
                list2 = list3;
            }
            z53 z53Var4 = pa3Var.j;
            boolean z7 = z53Var4.d && pa3Var.k == z53Var4.l.size() + (-1);
            boolean z8 = (z7 && j21 == -9223372036854775807L) ? false : true;
            if (b2.c() == j20) {
                n31Var2.b = z8;
            } else {
                j63Var3.getClass();
                boolean z9 = z8;
                long r3 = j63Var3.r(j21, T2) + j22;
                long b3 = b2.b(T2);
                if (z7) {
                    long d3 = b2.d(b3);
                    z2 = z9 & ((d3 - b2.e(b3)) + d3 >= j21);
                } else {
                    z2 = z9;
                }
                if (fm6Var != null) {
                    j5 = fm6Var.b();
                    j4 = b3;
                } else {
                    j63Var3.getClass();
                    j4 = b3;
                    j5 = gcc.j(j63Var3.I(j, j21) + j22, r3, j4);
                }
                long j26 = j5;
                if (j26 < r3) {
                    pa3Var.l = new kh0();
                } else {
                    if (j26 <= j4) {
                        long j27 = j;
                        if (!pa3Var.m || j26 < j4) {
                            if (!z2 || b2.e(j26) < j21) {
                                long j28 = 1;
                                int min2 = (int) Math.min(1L, (j4 - j26) + 1);
                                if (j21 != -9223372036854775807L) {
                                    while (min2 > 1) {
                                        j6 = j28;
                                        if (b2.e((min2 + j26) - j6) < j21) {
                                            break;
                                        }
                                        min2--;
                                        j28 = j6;
                                    }
                                }
                                j6 = j28;
                                long j29 = list2.isEmpty() ? j27 : -9223372036854775807L;
                                h73 h73Var2 = pa3Var.e;
                                int i3 = pa3Var.d;
                                ko4 n2 = pa3Var.i.n();
                                int o2 = pa3Var.i.o();
                                Object r4 = pa3Var.i.r();
                                long e = b2.e(j26);
                                j63Var3.getClass();
                                n29 z10 = j63Var3.z(j26 - j22);
                                if (o31Var == null) {
                                    rv2Var = new mma(h73Var2, bge.a(ub9Var, xg0Var.a, z10, b2.f(j26, j17) ? 0 : 8), n2, o2, r4, e, b2.d(j26), j26, i3, n2);
                                } else {
                                    int i4 = 1;
                                    int i5 = 1;
                                    while (true) {
                                        n2 = n2;
                                        if (i4 >= min2) {
                                            break;
                                        }
                                        j63Var3.getClass();
                                        n29 a2 = z10.a(j63Var3.z((j26 + i4) - j22), xg0Var.a);
                                        if (a2 == null) {
                                            break;
                                        }
                                        i5++;
                                        i4++;
                                        z10 = a2;
                                    }
                                    long j30 = (j26 + i5) - j6;
                                    long d4 = b2.d(j30);
                                    rv2Var = new rv2(h73Var2, bge.a(ub9Var, xg0Var.a, z10, b2.f(j30, j17) ? 0 : 8), n2, o2, r4, e, d4, j29, (j21 == -9223372036854775807L || j21 > d4) ? -9223372036854775807L : j21, j26, i5, dg7.k(n2.t) ? e : -ub9Var.c, b2.a);
                                }
                                n31Var2.c = rv2Var;
                            } else {
                                n31Var2.b = true;
                            }
                        }
                    }
                    n31Var2.b = z2;
                }
            }
            z4 = n31Var2.b;
            rh2Var = (rh2) n31Var2.c;
            n31Var2.c = null;
            n31Var2.b = false;
            if (rh2Var != null) {
            }
            z5 = false;
            if (!z4) {
            }
            this.J = j8;
            this.S = true;
            return true;
        }
        z = y;
        n31Var = n31Var3;
        j2 = -9223372036854775807L;
        rx6Var = rx6Var2;
        n31Var2 = n31Var;
        z4 = n31Var2.b;
        rh2Var = (rh2) n31Var2.c;
        n31Var2.c = null;
        n31Var2.b = false;
        if (rh2Var != null) {
        }
        z5 = false;
        if (!z4) {
        }
        this.J = j8;
        this.S = true;
        return true;
    }

    @Override // i8a
    public final long t() {
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.J;
        }
        long j = this.K;
        pg0 w = w();
        if (!w.d()) {
            ArrayList arrayList = this.w;
            w = arrayList.size() > 1 ? (pg0) c00.g(2, arrayList) : null;
        }
        if (w != null) {
            j = Math.max(j, w.n);
        }
        return Math.max(j, this.y.s());
    }

    @Override // i8a
    public final void u(long j) {
        boolean z;
        rx6 rx6Var = this.r;
        if (rx6Var.U() || y()) {
            return;
        }
        boolean Z = rx6Var.Z();
        List list = this.x;
        pa3 pa3Var = this.e;
        ArrayList arrayList = this.w;
        if (Z) {
            rh2 rh2Var = this.G;
            rh2Var.getClass();
            boolean z2 = rh2Var instanceof pg0;
            if (z2 && x(arrayList.size() - 1)) {
                return;
            }
            long j2 = this.R;
            if (j2 == Long.MIN_VALUE || rh2Var.h < j2) {
                if (!(pa3Var.l == null ? pa3Var.i.g(j, rh2Var, list) : false)) {
                    return;
                }
            }
            rx6Var.u();
            if (z2) {
                this.M = (pg0) rh2Var;
                return;
            }
            return;
        }
        int min = Math.min(arrayList.size(), (pa3Var.l != null || pa3Var.i.length() < 2) ? list.size() : pa3Var.i.k(j, list));
        if (this.R != Long.MIN_VALUE) {
            z = false;
            while (min > 0 && ((pg0) arrayList.get(min - 1)).h >= this.R) {
                min--;
                z = true;
            }
        } else {
            z = false;
        }
        if (min < arrayList.size()) {
            yve.p(!rx6Var.Z());
            int size = arrayList.size();
            while (true) {
                if (min >= size) {
                    min = -1;
                    break;
                } else if (!x(min)) {
                    break;
                } else {
                    min++;
                }
            }
            if (min != -1) {
                long j3 = w().n;
                pg0 v = v(min);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
                this.S = false;
                this.h.B(v.h, this.a, j3);
            }
        }
        if (z) {
            this.J = -9223372036854775807L;
            this.S = true;
        }
    }

    public final pg0 v(int i) {
        ArrayList arrayList = this.w;
        pg0 pg0Var = (pg0) arrayList.get(i);
        gcc.Y(i, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i2 = 0;
        this.y.o(pg0Var.e(0));
        while (true) {
            ys9[] ys9VarArr = this.E;
            if (i2 >= ys9VarArr.length) {
                return pg0Var;
            }
            ys9 ys9Var = ys9VarArr[i2];
            i2++;
            ys9Var.o(pg0Var.e(i2));
        }
    }

    public final pg0 w() {
        return (pg0) c00.g(1, this.w);
    }

    public final boolean x(int i) {
        int v;
        pg0 pg0Var = (pg0) this.w.get(i);
        if (this.y.v() > pg0Var.e(0)) {
            return true;
        }
        int i2 = 0;
        do {
            ys9[] ys9VarArr = this.E;
            if (i2 >= ys9VarArr.length) {
                return false;
            }
            v = ys9VarArr[i2].v();
            i2++;
        } while (v <= pg0Var.e(i2));
        return true;
    }

    public final boolean y() {
        return this.J != -9223372036854775807L;
    }

    public final boolean z() {
        return ((!this.N && !this.O) || this.S || this.r.U()) ? false : true;
    }
}
