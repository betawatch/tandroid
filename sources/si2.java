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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class si2 implements jr9, s6a, ga6, ka6 {
    public final hr9[] E;
    public final lx6 F;
    public ni2 G;
    public go4 H;
    public x63 I;
    public long J;
    public long K;
    public int L;
    public ph0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public final int a;
    public final int[] b;
    public final go4[] c;
    public final boolean[] d;
    public final ib3 e;
    public final x63 f;
    public final kq h;
    public final k4f n;
    public final mx6 r;
    public final m41 s;
    public final ArrayList w;
    public final List x;
    public final hr9 y;

    public si2(int i, int[] iArr, go4[] go4VarArr, ib3 ib3Var, x63 x63Var, mx6 mx6Var, long j, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, boolean z, long j2, g89 g89Var) {
        this.a = i;
        this.b = iArr;
        this.c = go4VarArr;
        this.e = ib3Var;
        this.f = x63Var;
        this.h = kqVar;
        this.n = k4fVar;
        this.r = g89Var != null ? new mx6((Object) g89Var, (byte) 5) : new mx6("ChunkSampleStream");
        this.s = new m41((byte) 2);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new hr9[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        hr9[] hr9VarArr = new hr9[i2];
        is3Var.getClass();
        hr9 hr9Var = new hr9(mx6Var, is3Var, fs3Var);
        this.y = hr9Var;
        iArr2[0] = i;
        hr9VarArr[0] = hr9Var;
        int i3 = 0;
        while (i3 < length) {
            hr9 hr9Var2 = new hr9(mx6Var, null, null);
            this.E[i3] = hr9Var2;
            int i4 = i3 + 1;
            hr9VarArr[i4] = hr9Var2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.F = new lx6(iArr2, hr9VarArr, (byte) 7);
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
            ph0 ph0Var = (ph0) this.w.get(i);
            go4 go4Var = ph0Var.d;
            if (!go4Var.equals(this.H)) {
                this.h.i(this.a, go4Var, ph0Var.e, ph0Var.f, ph0Var.h);
            }
            this.H = go4Var;
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
        } while (((ph0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void C(x63 x63Var) {
        this.I = x63Var;
        hr9 hr9Var = this.y;
        hr9Var.l();
        cs3 cs3Var = hr9Var.h;
        if (cs3Var != null) {
            cs3Var.c(hr9Var.e);
            hr9Var.h = null;
            hr9Var.g = null;
        }
        for (hr9 hr9Var2 : this.E) {
            hr9Var2.l();
            cs3 cs3Var2 = hr9Var2.h;
            if (cs3Var2 != null) {
                cs3Var2.c(hr9Var2.e);
                hr9Var2.h = null;
                hr9Var2.g = null;
            }
        }
        this.r.e0(this);
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
        this.h.u(new ea6(da6Var), ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, i);
    }

    @Override // jr9
    public final int a() {
        if (this.N) {
            return 2;
        }
        return this.O ? 4 : 0;
    }

    @Override // ka6
    public final void b() {
        hr9 hr9Var = this.y;
        hr9Var.G(true);
        cs3 cs3Var = hr9Var.h;
        if (cs3Var != null) {
            cs3Var.c(hr9Var.e);
            hr9Var.h = null;
            hr9Var.g = null;
        }
        for (hr9 hr9Var2 : this.E) {
            hr9Var2.G(true);
            cs3 cs3Var2 = hr9Var2.h;
            if (cs3Var2 != null) {
                cs3Var2.c(hr9Var2.e);
                hr9Var2.h = null;
                hr9Var2.g = null;
            }
        }
        for (gb3 gb3Var : this.e.h) {
            n41 n41Var = gb3Var.a;
            if (n41Var != null) {
                n41Var.a.release();
            }
        }
        x63 x63Var = this.I;
        if (x63Var != null) {
            synchronized (x63Var) {
                te8 te8Var = (te8) x63Var.E.remove(this);
                if (te8Var != null) {
                    hr9 hr9Var3 = te8Var.a;
                    hr9Var3.G(true);
                    cs3 cs3Var3 = hr9Var3.h;
                    if (cs3Var3 != null) {
                        cs3Var3.c(null);
                        hr9Var3.h = null;
                        hr9Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // jr9
    public final void d() {
        mx6 mx6Var = this.r;
        mx6Var.d();
        this.y.C();
        if (mx6Var.Y()) {
            return;
        }
        ib3 ib3Var = this.e;
        ji0 ji0Var = ib3Var.l;
        if (ji0Var != null) {
            throw ji0Var;
        }
        ib3Var.a.d();
    }

    @Override // s6a
    public final boolean f() {
        return this.r.Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0299  */
    @Override // ga6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        k4f k4fVar;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        long j3;
        boolean z4;
        ha6 ha6Var;
        boolean a;
        ni2 ni2Var = (ni2) ja6Var;
        c0b c0bVar = ni2Var.r;
        go4 go4Var = ni2Var.d;
        long j4 = ni2Var.h;
        long j5 = c0bVar.b;
        boolean z5 = ni2Var instanceof ph0;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size() - 1;
        boolean z6 = (j5 != 0 && z5 && x(size)) ? false : true;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar2 = ni2Var.r;
        da6Var.d = c0bVar2.c;
        da6Var.e = c0bVar2.d;
        da6Var.f = j2;
        da6Var.g = j5;
        ea6 ea6Var = new ea6(da6Var);
        hac.i0(j4);
        hac.i0(ni2Var.n);
        de deVar = new de(iOException, i, (byte) 8);
        ib3 ib3Var = this.e;
        gb3[] gb3VarArr = ib3Var.h;
        e7a e7aVar = ib3Var.b;
        k4f k4fVar2 = this.n;
        if (z6) {
            te8 te8Var = ib3Var.g;
            if (te8Var != null) {
                long j6 = te8Var.d;
                boolean z7 = j6 != -9223372036854775807L && j6 < j4;
                ue8 ue8Var = te8Var.e;
                if (ue8Var.f.d) {
                    if (!ue8Var.n) {
                        if (z7) {
                            if (ue8Var.h) {
                                ue8Var.n = true;
                                ue8Var.h = false;
                                c73 c73Var = (c73) ue8Var.b.a;
                                c73Var.I.removeCallbacks(c73Var.x);
                                c73Var.D();
                            }
                        }
                    }
                    z2 = z5;
                    arrayList = arrayList2;
                    k4fVar = k4fVar2;
                    z = z6;
                    z3 = true;
                    z4 = true;
                    if (z4) {
                        if (z) {
                            ha6Var = mx6.y;
                            if (z2) {
                                jte.p(u(size) == ni2Var ? z3 : false);
                                if (arrayList.isEmpty()) {
                                    this.J = this.K;
                                }
                            }
                            if (ha6Var == null) {
                                k4fVar.getClass();
                                long w3 = k4f.w3(deVar);
                                ha6Var = w3 != -9223372036854775807L ? new ha6(0, w3) : mx6.E;
                            }
                            ha6 ha6Var2 = ha6Var;
                            a = ha6Var2.a();
                            this.h.r(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, iOException, !a);
                            if (!a) {
                                this.G = null;
                                k4fVar.getClass();
                                this.f.b(this);
                            }
                            return ha6Var2;
                        }
                        ncd.f("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    ha6Var = null;
                    if (ha6Var == null) {
                    }
                    ha6 ha6Var22 = ha6Var;
                    a = ha6Var22.a();
                    this.h.r(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, iOException, !a);
                    if (!a) {
                    }
                    return ha6Var22;
                }
            }
            if (!ib3Var.j.d && (ni2Var instanceof dm6) && (iOException instanceof ki5) && ((ki5) iOException).c == 404) {
                gb3 gb3Var = gb3VarArr[ib3Var.i.e(ni2Var.d)];
                long c = gb3Var.c();
                if (c != -1 && c != 0) {
                    d73 d73Var = gb3Var.d;
                    d73Var.getClass();
                    if (((dm6) ni2Var).b() > ((d73Var.V() + gb3Var.f) + c) - 1) {
                        ib3Var.m = true;
                        z2 = z5;
                        arrayList = arrayList2;
                        k4fVar = k4fVar2;
                        z = z6;
                        z3 = true;
                        z4 = true;
                        if (z4) {
                        }
                        ha6Var = null;
                        if (ha6Var == null) {
                        }
                        ha6 ha6Var222 = ha6Var;
                        a = ha6Var222.a();
                        this.h.r(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, iOException, !a);
                        if (!a) {
                        }
                        return ha6Var222;
                    }
                }
            }
            gb3 gb3Var2 = gb3VarArr[ib3Var.i.e(go4Var)];
            ka9 ka9Var = gb3Var2.b;
            wh0 wh0Var = gb3Var2.c;
            wh0 G = e7aVar.G(ka9Var.b);
            if (G == null || wh0Var.equals(G)) {
                t74 t74Var = ib3Var.i;
                mo5 mo5Var = gb3Var2.b.b;
                k4fVar = k4fVar2;
                z = z6;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                z2 = z5;
                int length = t74Var.length();
                arrayList = arrayList2;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (t74Var.a(i3, elapsedRealtime)) {
                        i2++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < mo5Var.size(); i4++) {
                    hashSet.add(Integer.valueOf(((wh0) mo5Var.get(i4)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList h = e7aVar.h(mo5Var);
                for (int i5 = 0; i5 < h.size(); i5++) {
                    hashSet2.add(Integer.valueOf(((wh0) h.get(i5)).c));
                }
                ba6 ba6Var = new ba6(false, size2, size2 - hashSet2.size(), length, i2);
                if (ba6Var.a(2) || ba6Var.a(1)) {
                    k4fVar.getClass();
                    ca6 u3 = k4f.u3(ba6Var, deVar);
                    if (u3 != null) {
                        long j7 = u3.b;
                        byte b = u3.a;
                        if (ba6Var.a(b)) {
                            if (b == 2) {
                                t74 t74Var2 = ib3Var.i;
                                z4 = t74Var2.q(t74Var2.e(go4Var), j7);
                                z3 = true;
                            } else {
                                z3 = true;
                                if (b == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j7;
                                    String str = wh0Var.b;
                                    HashMap hashMap = (HashMap) e7aVar.a;
                                    if (hashMap.containsKey(str)) {
                                        Long l = (Long) hashMap.get(str);
                                        String str2 = hac.a;
                                        j3 = Math.max(elapsedRealtime2, l.longValue());
                                    } else {
                                        j3 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j3));
                                    int i6 = wh0Var.c;
                                    if (i6 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i6);
                                        HashMap hashMap2 = (HashMap) e7aVar.b;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l2 = (Long) hashMap2.get(valueOf);
                                            String str3 = hac.a;
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
                            ha6Var = null;
                            if (ha6Var == null) {
                            }
                            ha6 ha6Var2222 = ha6Var;
                            a = ha6Var2222.a();
                            this.h.r(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, iOException, !a);
                            if (!a) {
                            }
                            return ha6Var2222;
                        }
                    }
                }
            }
            z2 = z5;
            arrayList = arrayList2;
            k4fVar = k4fVar2;
            z = z6;
            z3 = true;
            z4 = true;
            if (z4) {
            }
            ha6Var = null;
            if (ha6Var == null) {
            }
            ha6 ha6Var22222 = ha6Var;
            a = ha6Var22222.a();
            this.h.r(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, iOException, !a);
            if (!a) {
            }
            return ha6Var22222;
        }
        z2 = z5;
        arrayList = arrayList2;
        k4fVar = k4fVar2;
        z = z6;
        z3 = true;
        z4 = false;
        if (z4) {
        }
        ha6Var = null;
        if (ha6Var == null) {
        }
        ha6 ha6Var222222 = ha6Var;
        a = ha6Var222222.a();
        this.h.r(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, iOException, !a);
        if (!a) {
        }
        return ha6Var222222;
    }

    @Override // s6a
    public final long g() {
        if (y()) {
            return this.J;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return v().n;
    }

    @Override // ga6
    public final void g0(ja6 ja6Var, long j, long j2) {
        ni2 ni2Var = (ni2) ja6Var;
        this.G = null;
        ib3 ib3Var = this.e;
        gb3[] gb3VarArr = ib3Var.h;
        if (ni2Var instanceof op5) {
            int e = ib3Var.i.e(((op5) ni2Var).d);
            gb3 gb3Var = gb3VarArr[e];
            if (gb3Var.d == null) {
                n41 n41Var = gb3Var.a;
                n41Var.getClass();
                oi2 a = n41Var.a();
                if (a != null) {
                    ka9 ka9Var = gb3Var.b;
                    gb3VarArr[e] = new gb3(gb3Var.e, ka9Var, gb3Var.c, gb3Var.a, gb3Var.f, new vh2(a, ka9Var.c, (byte) 1));
                }
            }
        }
        te8 te8Var = ib3Var.g;
        if (te8Var != null) {
            long j3 = te8Var.d;
            if (j3 == -9223372036854775807L || ni2Var.n > j3) {
                te8Var.d = ni2Var.n;
            }
            te8Var.e.h = true;
        }
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.n.getClass();
        this.h.q(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n);
        this.f.b(this);
    }

    @Override // jr9
    public final boolean i() {
        return !y() && this.y.A(this.S);
    }

    @Override // jr9
    public final int m(long j) {
        boolean z = !this.P && z();
        if (y() || z || this.Q) {
            return 0;
        }
        boolean z2 = this.S;
        hr9 hr9Var = this.y;
        int x = hr9Var.x(j, z2);
        ph0 ph0Var = this.M;
        if (ph0Var != null) {
            x = Math.min(x, ph0Var.d(0) - hr9Var.v());
        }
        hr9Var.L(x);
        A();
        return x;
    }

    @Override // jr9
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        boolean z = !this.P && z();
        if (y() || z || this.Q) {
            return -3;
        }
        ph0 ph0Var = this.M;
        hr9 hr9Var = this.y;
        if (ph0Var != null && ph0Var.d(0) <= hr9Var.v()) {
            return -3;
        }
        A();
        return hr9Var.F(mj4Var, la3Var, i, this.S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0468  */
    @Override // s6a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(sa6 sa6Var) {
        long j;
        List list;
        m41 m41Var;
        long j2;
        boolean z;
        gb3[] gb3VarArr;
        long j3;
        mx6 mx6Var;
        m41 m41Var2;
        List list2;
        boolean z2;
        long j4;
        long j5;
        long j6;
        Object hw2Var;
        b19 b19Var;
        long j7;
        boolean z3;
        boolean z4;
        ni2 ni2Var;
        boolean z5;
        long j8;
        if (this.S) {
            return false;
        }
        mx6 mx6Var2 = this.r;
        if (mx6Var2.Y() || mx6Var2.U()) {
            return false;
        }
        boolean y = y();
        if (y) {
            list = Collections.EMPTY_LIST;
            j = this.J;
        } else {
            j = v().n;
            list = this.x;
        }
        List list3 = list;
        ib3 ib3Var = this.e;
        ji0 ji0Var = ib3Var.l;
        m41 m41Var3 = this.s;
        if (ji0Var == null) {
            m41Var = m41Var3;
            long j9 = sa6Var.a;
            long j10 = j - j9;
            j2 = -9223372036854775807L;
            z = y;
            long T = hac.T(ib3Var.j.b(ib3Var.k).b) + hac.T(ib3Var.j.a) + j;
            te8 te8Var = ib3Var.g;
            if (te8Var != null) {
                ue8 ue8Var = te8Var.e;
                t63 t63Var = ue8Var.f;
                sz4 sz4Var = ue8Var.b;
                if (!t63Var.d) {
                    z3 = false;
                } else if (ue8Var.n) {
                    z3 = true;
                } else {
                    Map.Entry ceilingEntry = ue8Var.e.ceilingEntry(Long.valueOf(t63Var.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= T) {
                        z3 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        c73 c73Var = (c73) sz4Var.a;
                        long j11 = c73Var.P;
                        if (j11 == -9223372036854775807L || j11 < longValue) {
                            c73Var.P = longValue;
                        }
                        z3 = true;
                    }
                    if (z3 && ue8Var.h) {
                        ue8Var.n = true;
                        ue8Var.h = false;
                        c73 c73Var2 = (c73) sz4Var.a;
                        c73Var2.I.removeCallbacks(c73Var2.x);
                        c73Var2.D();
                    }
                }
            }
            long T2 = hac.T(hac.E(ib3Var.f));
            t63 t63Var2 = ib3Var.j;
            long j12 = t63Var2.a;
            long T3 = j12 == -9223372036854775807L ? -9223372036854775807L : T2 - hac.T(j12 + t63Var2.b(ib3Var.k).b);
            dm6 dm6Var = list3.isEmpty() ? null : (dm6) aq1.m(1, list3);
            int length = ib3Var.i.length();
            em6[] em6VarArr = new em6[length];
            int i = 0;
            while (true) {
                gb3VarArr = ib3Var.h;
                if (i >= length) {
                    break;
                }
                gb3 gb3Var = gb3VarArr[i];
                d73 d73Var = gb3Var.d;
                long j13 = T3;
                long j14 = gb3Var.f;
                long j15 = gb3Var.e;
                k4f k4fVar = em6.z;
                if (d73Var == null) {
                    em6VarArr[i] = k4fVar;
                } else {
                    d73Var.getClass();
                    long m = d73Var.m(j15, T2) + j14;
                    long b = gb3Var.b(T2);
                    if (dm6Var != null) {
                        j7 = dm6Var.b();
                    } else {
                        d73 d73Var2 = gb3Var.d;
                        d73Var2.getClass();
                        j7 = hac.j(d73Var2.J(j, j15) + j14, m, b);
                    }
                    long j16 = j7;
                    if (j16 < m) {
                        em6VarArr[i] = k4fVar;
                    } else {
                        em6VarArr[i] = new hb3(ib3Var.b(i), j16, b);
                    }
                }
                i++;
                T3 = j13;
            }
            long j17 = T3;
            long j18 = 0;
            if (!ib3Var.j.d || gb3VarArr[0].c() == 0) {
                j3 = -9223372036854775807L;
            } else {
                long d = gb3VarArr[0].d(gb3VarArr[0].b(T2));
                t63 t63Var3 = ib3Var.j;
                long j19 = t63Var3.a;
                long min = Math.min(j19 == -9223372036854775807L ? -9223372036854775807L : T2 - hac.T(j19 + t63Var3.b(ib3Var.k).b), d) - j9;
                j18 = 0;
                j3 = Math.max(0L, min);
            }
            mx6Var = mx6Var2;
            m41Var2 = m41Var;
            long j20 = j18;
            ib3Var.i.b(j9, j10, j3, list3, em6VarArr);
            int d2 = ib3Var.i.d();
            SystemClock.elapsedRealtime();
            gb3 b2 = ib3Var.b(d2);
            long j21 = b2.e;
            long j22 = b2.f;
            d73 d73Var3 = b2.d;
            wh0 wh0Var = b2.c;
            n41 n41Var = b2.a;
            ka9 ka9Var = b2.b;
            if (n41Var != null) {
                b19 b19Var2 = n41Var.r == null ? ka9Var.e : null;
                if (d73Var3 == null) {
                    list2 = list3;
                    b19Var = ka9Var.c();
                } else {
                    list2 = list3;
                    b19Var = null;
                }
                if (b19Var2 != null || b19Var != null) {
                    a83 a83Var = ib3Var.e;
                    go4 o = ib3Var.i.o();
                    int p = ib3Var.i.p();
                    Object s = ib3Var.i.s();
                    if (b19Var2 != null) {
                        b19 a = b19Var2.a(b19Var, wh0Var.a);
                        if (a != null) {
                            b19Var2 = a;
                        }
                    } else {
                        b19Var.getClass();
                        b19Var2 = b19Var;
                    }
                    m41Var2.c = new op5(a83Var, mde.a(ka9Var, wh0Var.a, b19Var2, 0), o, p, s, b2.a);
                    z4 = m41Var2.b;
                    ni2Var = (ni2) m41Var2.c;
                    m41Var2.c = null;
                    m41Var2.b = false;
                    if (ni2Var != null) {
                        long j23 = this.R;
                        if (j23 != Long.MIN_VALUE && ni2Var.h >= j23) {
                            z5 = true;
                            if (!z4) {
                                j8 = -9223372036854775807L;
                            } else {
                                if (!z5) {
                                    if (ni2Var == null) {
                                        return false;
                                    }
                                    this.G = ni2Var;
                                    boolean z6 = ni2Var instanceof ph0;
                                    lx6 lx6Var = this.F;
                                    if (z6) {
                                        ph0 ph0Var = (ph0) ni2Var;
                                        if (z) {
                                            long j24 = ph0Var.h;
                                            long j25 = this.J;
                                            if (j24 < j25) {
                                                this.y.t = j25;
                                                for (hr9 hr9Var : this.E) {
                                                    hr9Var.t = this.J;
                                                }
                                                this.O = this.N;
                                            }
                                            this.N = false;
                                            this.J = j2;
                                        }
                                        ph0Var.y = lx6Var;
                                        hr9[] hr9VarArr = (hr9[]) lx6Var.c;
                                        int[] iArr = new int[hr9VarArr.length];
                                        for (int i2 = 0; i2 < hr9VarArr.length; i2++) {
                                            iArr[i2] = hr9VarArr[i2].z();
                                        }
                                        ph0Var.E = iArr;
                                        this.w.add(ph0Var);
                                    } else if (ni2Var instanceof op5) {
                                        ((op5) ni2Var).w = lx6Var;
                                    }
                                    mx6Var.v0(ni2Var, this, this.n.v3(ni2Var.c));
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
            t63 t63Var4 = ib3Var.j;
            boolean z7 = t63Var4.d && ib3Var.k == t63Var4.l.size() + (-1);
            boolean z8 = (z7 && j21 == -9223372036854775807L) ? false : true;
            if (b2.c() == j20) {
                m41Var2.b = z8;
            } else {
                d73Var3.getClass();
                boolean z9 = z8;
                long m2 = d73Var3.m(j21, T2) + j22;
                long b3 = b2.b(T2);
                if (z7) {
                    long d3 = b2.d(b3);
                    z2 = z9 & ((d3 - b2.e(b3)) + d3 >= j21);
                } else {
                    z2 = z9;
                }
                if (dm6Var != null) {
                    j5 = dm6Var.b();
                    j4 = b3;
                } else {
                    d73Var3.getClass();
                    j4 = b3;
                    j5 = hac.j(d73Var3.J(j, j21) + j22, m2, j4);
                }
                long j26 = j5;
                if (j26 < m2) {
                    ib3Var.l = new ji0();
                } else {
                    if (j26 <= j4) {
                        long j27 = j;
                        if (!ib3Var.m || j26 < j4) {
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
                                a83 a83Var2 = ib3Var.e;
                                int i3 = ib3Var.d;
                                go4 o2 = ib3Var.i.o();
                                int p2 = ib3Var.i.p();
                                Object s2 = ib3Var.i.s();
                                long e = b2.e(j26);
                                d73Var3.getClass();
                                b19 w = d73Var3.w(j26 - j22);
                                if (n41Var == null) {
                                    hw2Var = new tka(a83Var2, mde.a(ka9Var, wh0Var.a, w, b2.f(j26, j17) ? 0 : 8), o2, p2, s2, e, b2.d(j26), j26, i3, o2);
                                } else {
                                    int i4 = 1;
                                    int i5 = 1;
                                    while (true) {
                                        o2 = o2;
                                        if (i4 >= min2) {
                                            break;
                                        }
                                        d73Var3.getClass();
                                        b19 a2 = w.a(d73Var3.w((j26 + i4) - j22), wh0Var.a);
                                        if (a2 == null) {
                                            break;
                                        }
                                        i5++;
                                        i4++;
                                        w = a2;
                                    }
                                    long j30 = (j26 + i5) - j6;
                                    long d4 = b2.d(j30);
                                    hw2Var = new hw2(a83Var2, mde.a(ka9Var, wh0Var.a, w, b2.f(j30, j17) ? 0 : 8), o2, p2, s2, e, d4, j29, (j21 == -9223372036854775807L || j21 > d4) ? -9223372036854775807L : j21, j26, i5, wf7.k(o2.t) ? e : -ka9Var.c, b2.a);
                                }
                                m41Var2.c = hw2Var;
                            } else {
                                m41Var2.b = true;
                            }
                        }
                    }
                    m41Var2.b = z2;
                }
            }
            z4 = m41Var2.b;
            ni2Var = (ni2) m41Var2.c;
            m41Var2.c = null;
            m41Var2.b = false;
            if (ni2Var != null) {
            }
            z5 = false;
            if (!z4) {
            }
            this.J = j8;
            this.S = true;
            return true;
        }
        z = y;
        m41Var = m41Var3;
        j2 = -9223372036854775807L;
        mx6Var = mx6Var2;
        m41Var2 = m41Var;
        z4 = m41Var2.b;
        ni2Var = (ni2) m41Var2.c;
        m41Var2.c = null;
        m41Var2.b = false;
        if (ni2Var != null) {
        }
        z5 = false;
        if (!z4) {
        }
        this.J = j8;
        this.S = true;
        return true;
    }

    @Override // s6a
    public final long s() {
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.J;
        }
        long j = this.K;
        ph0 v = v();
        if (!v.c()) {
            ArrayList arrayList = this.w;
            v = arrayList.size() > 1 ? (ph0) b10.f(2, arrayList) : null;
        }
        if (v != null) {
            j = Math.max(j, v.n);
        }
        return Math.max(j, this.y.s());
    }

    @Override // s6a
    public final void t(long j) {
        boolean z;
        mx6 mx6Var = this.r;
        if (mx6Var.U() || y()) {
            return;
        }
        boolean Y = mx6Var.Y();
        List list = this.x;
        ib3 ib3Var = this.e;
        ArrayList arrayList = this.w;
        if (Y) {
            ni2 ni2Var = this.G;
            ni2Var.getClass();
            boolean z2 = ni2Var instanceof ph0;
            if (z2 && x(arrayList.size() - 1)) {
                return;
            }
            long j2 = this.R;
            if (j2 == Long.MIN_VALUE || ni2Var.h < j2) {
                if (!(ib3Var.l == null ? ib3Var.i.g(j, ni2Var, list) : false)) {
                    return;
                }
            }
            mx6Var.v();
            if (z2) {
                this.M = (ph0) ni2Var;
                return;
            }
            return;
        }
        int min = Math.min(arrayList.size(), (ib3Var.l != null || ib3Var.i.length() < 2) ? list.size() : ib3Var.i.l(j, list));
        if (this.R != Long.MIN_VALUE) {
            z = false;
            while (min > 0 && ((ph0) arrayList.get(min - 1)).h >= this.R) {
                min--;
                z = true;
            }
        } else {
            z = false;
        }
        if (min < arrayList.size()) {
            jte.p(!mx6Var.Y());
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
                long j3 = v().n;
                ph0 u = u(min);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
                this.S = false;
                this.h.A(u.h, this.a, j3);
            }
        }
        if (z) {
            this.J = -9223372036854775807L;
            this.S = true;
        }
    }

    public final ph0 u(int i) {
        ArrayList arrayList = this.w;
        ph0 ph0Var = (ph0) arrayList.get(i);
        hac.Y(i, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i2 = 0;
        this.y.o(ph0Var.d(0));
        while (true) {
            hr9[] hr9VarArr = this.E;
            if (i2 >= hr9VarArr.length) {
                return ph0Var;
            }
            hr9 hr9Var = hr9VarArr[i2];
            i2++;
            hr9Var.o(ph0Var.d(i2));
        }
    }

    public final ph0 v() {
        return (ph0) b10.f(1, this.w);
    }

    @Override // ga6
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        ni2 ni2Var = (ni2) ja6Var;
        this.G = null;
        this.M = null;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.n.getClass();
        this.h.o(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n);
        if (z) {
            return;
        }
        if (y()) {
            this.y.G(false);
            for (hr9 hr9Var : this.E) {
                hr9Var.G(false);
            }
        } else if (ni2Var instanceof ph0) {
            ArrayList arrayList = this.w;
            u(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.J = this.K;
            }
        }
        this.f.b(this);
    }

    public final boolean x(int i) {
        int v;
        ph0 ph0Var = (ph0) this.w.get(i);
        if (this.y.v() > ph0Var.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            hr9[] hr9VarArr = this.E;
            if (i2 >= hr9VarArr.length) {
                return false;
            }
            v = hr9VarArr[i2].v();
            i2++;
        } while (v <= ph0Var.d(i2));
        return true;
    }

    public final boolean y() {
        return this.J != -9223372036854775807L;
    }

    public final boolean z() {
        return ((!this.N && !this.O) || this.S || this.r.U()) ? false : true;
    }
}
