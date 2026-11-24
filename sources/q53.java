// default package

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q53 extends qg0 {
    public final HashMap A;
    public mm5 B;
    public s96 C;
    public final Uri D;
    public o63 E;
    public mv6 F;
    public vyb G;
    public IOException H;
    public Handler I;
    public h53 J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public int O;
    public long P;
    public int Q;
    public br6 R;
    public wq6 S;
    public final boolean i;
    public final m63 j;
    public final lv6 k;
    public final ie7 l;
    public final yq3 m;
    public final i2f n;
    public final c5a o;
    public final short p;
    public final int q;
    public final kp r;
    public final bv7 s;
    public final qx4 t;
    public final Object u;
    public final SparseArray v;
    public final m53 w;
    public final m53 x;
    public final lj9 y;
    public final n86 z;

    static {
        cr6.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [m53] */
    /* JADX WARN: Type inference failed for: r2v9, types: [m53] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, short] */
    public q53(br6 br6Var, m63 m63Var, bv7 bv7Var, lv6 lv6Var, ie7 ie7Var, yq3 yq3Var, i2f i2fVar, long j, long j2) {
        this.R = br6Var;
        this.S = br6Var.c;
        Uri uri = br6Var.b.a;
        this.D = uri;
        this.J = null;
        this.j = m63Var;
        this.s = bv7Var;
        this.k = lv6Var;
        this.m = yq3Var;
        this.n = i2fVar;
        this.p = (int) j;
        this.q = (int) j2;
        this.l = ie7Var;
        this.o = new c5a((byte) 3);
        final byte b = 0;
        this.i = false;
        this.r = b(null);
        this.u = new Object();
        this.B = mm5.u(new s96(uri));
        this.A = new HashMap();
        this.v = new SparseArray();
        this.y = new lj9(this, (byte) 25);
        this.P = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.t = new qx4(this);
        this.z = new l69(this, (byte) 25);
        this.w = new Runnable(this) { // from class: m53
            public final /* synthetic */ q53 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                q53 q53Var = this.b;
                switch (b2) {
                    case 0:
                        q53Var.D();
                        break;
                    default:
                        try {
                            q53Var.z(false);
                            break;
                        } catch (Exception e) {
                            q53Var.H = new IOException(e);
                        }
                }
            }
        };
        final byte b2 = 1;
        this.x = new Runnable(this) { // from class: m53
            public final /* synthetic */ q53 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                q53 q53Var = this.b;
                switch (b22) {
                    case 0:
                        q53Var.D();
                        break;
                    default:
                        try {
                            q53Var.z(false);
                            break;
                        } catch (Exception e) {
                            q53Var.H = new IOException(e);
                        }
                }
            }
        };
    }

    public static boolean v(f38 f38Var) {
        List list = f38Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((ea) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(ce3 ce3Var, bv7 bv7Var) {
        o63 o63Var = this.E;
        Uri parse = Uri.parse(ce3Var.c);
        Map map = Collections.EMPTY_MAP;
        gre.l(parse, "The uri must be set.");
        this.F.r0(new cv7(o63Var, new u63(parse, 1, null, map, 0L, -1L, null, 1), 5, bv7Var), new n53(this), 1);
    }

    public final s96 B() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.A;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getValue()).longValue() <= elapsedRealtime) {
                it.remove();
            }
        }
        s96 s96Var = this.C;
        if (s96Var != null && !hashMap.containsKey(s96Var.b)) {
            for (int i = 0; i < this.B.size(); i++) {
                s96 s96Var2 = (s96) this.B.get(i);
                if (s96Var2.b.equals(this.C.b)) {
                    this.C = s96Var2;
                    return s96Var2;
                }
            }
        }
        s96 s96Var3 = (s96) this.B.get(0);
        s96Var3.getClass();
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            s96 s96Var4 = (s96) this.B.get(i2);
            Long l = (Long) hashMap.get(s96Var4.b);
            if (l == null) {
                this.C = s96Var4;
                return s96Var4;
            }
            if (l.longValue() < j) {
                j = l.longValue();
                s96Var3 = s96Var4;
            }
        }
        this.C = s96Var3;
        return s96Var3;
    }

    public final synchronized void C(wq6 wq6Var) {
        this.S = wq6Var;
    }

    public final void D() {
        s96 B;
        this.I.removeCallbacks(this.w);
        if (this.F.S()) {
            return;
        }
        if (this.F.W()) {
            this.K = true;
            return;
        }
        synchronized (this.u) {
            B = B();
        }
        Uri uri = B.a;
        this.K = false;
        Map map = Collections.EMPTY_MAP;
        gre.l(uri, "The uri must be set.");
        cv7 cv7Var = new cv7(this.E, new u63(uri, 1, null, map, 0L, -1L, null, 1), 4, this.s);
        qx4 qx4Var = this.t;
        this.n.getClass();
        this.F.r0(cv7Var, qx4Var, 3);
    }

    @Override // qg0
    public final boolean a(br6 br6Var) {
        xq6 xq6Var = i().b;
        xq6Var.getClass();
        xq6 xq6Var2 = br6Var.b;
        return xq6Var2 != null && xq6Var2.a.equals(xq6Var.a) && xq6Var2.e.equals(xq6Var.e) && Objects.equals(xq6Var2.c, xq6Var.c);
    }

    @Override // qg0
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        int intValue = ((Integer) rx6Var.a).intValue() - this.Q;
        kp b = b(rx6Var);
        vq3 vq3Var = new vq3(this.d.c, 0, rx6Var);
        int i = this.Q + intValue;
        h53 h53Var = this.J;
        vyb vybVar = this.G;
        long j2 = this.N;
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        l53 l53Var = new l53(i, h53Var, this.o, intValue, this.k, vybVar, this.m, vq3Var, this.n, b, j2, this.z, mv6Var, this.l, this.y, uc8Var);
        this.v.put(i, l53Var);
        return l53Var;
    }

    @Override // qg0
    public final synchronized br6 i() {
        return this.R;
    }

    @Override // qg0
    public final void k() {
        this.z.b();
    }

    @Override // qg0
    public final void m(vyb vybVar) {
        this.G = vybVar;
        Looper myLooper = Looper.myLooper();
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        yq3 yq3Var = this.m;
        yq3Var.u(myLooper, uc8Var);
        yq3Var.a();
        if (this.i) {
            z(false);
            return;
        }
        this.E = this.j.createDataSource();
        this.F = new mv6("DashMediaSource");
        this.I = g8c.q(null);
        D();
    }

    @Override // qg0
    public final void o(sr6 sr6Var) {
        l53 l53Var = (l53) sr6Var;
        rc8 rc8Var = l53Var.y;
        rc8Var.r = true;
        rc8Var.d.removeCallbacksAndMessages(null);
        for (eh2 eh2Var : l53Var.I) {
            eh2Var.C(l53Var);
        }
        l53Var.H = null;
        this.v.remove(l53Var.a);
    }

    @Override // qg0
    public final void q() {
        this.K = false;
        this.E = null;
        mv6 mv6Var = this.F;
        if (mv6Var != null) {
            mv6Var.b0(null);
            this.F = null;
        }
        C(i().c);
        this.L = 0L;
        this.M = 0L;
        synchronized (this.u) {
            this.B = mm5.u(new s96(this.D));
            this.A.clear();
            this.C = null;
        }
        this.H = null;
        Handler handler = this.I;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.I = null;
        }
        this.N = -9223372036854775807L;
        this.O = 0;
        this.P = -9223372036854775807L;
        this.v.clear();
        c5a c5aVar = this.o;
        ((HashMap) c5aVar.b).clear();
        ((HashMap) c5aVar.c).clear();
        ((HashMap) c5aVar.d).clear();
        this.m.release();
    }

    @Override // qg0
    public final synchronized void t(br6 br6Var) {
        this.R = br6Var;
        this.S = br6Var.c;
    }

    public final synchronized wq6 u() {
        return this.S;
    }

    public final void w() {
        boolean z;
        mv6 mv6Var = this.F;
        n53 n53Var = new n53(this);
        synchronized (ycd.b) {
            z = ycd.c;
        }
        if (z) {
            n53Var.a();
            return;
        }
        if (mv6Var == null) {
            mv6Var = new mv6("SntpClient");
        }
        mv6Var.r0(new pd5((byte) 26), new v39(n53Var, (byte) 11), 1);
    }

    public final void x(cv7 cv7Var, long j, long j2) {
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.n.getClass();
        this.r.o(f86Var, cv7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        lad.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.N = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(boolean z) {
        f38 f38Var;
        long j;
        long j2;
        q53 q53Var;
        long j3;
        boolean z2;
        long j4;
        h53 h53Var;
        boolean z3;
        long j5;
        long j6;
        f38 f38Var2;
        long j7;
        int i;
        long j8;
        wq6 wq6Var;
        float f;
        long j9;
        float f2;
        long j10;
        SparseArray sparseArray;
        int i2;
        boolean z4;
        SparseArray sparseArray2;
        eh2[] eh2VarArr;
        m53 m53Var = this.x;
        long j11 = this.q;
        SparseArray sparseArray3 = this.v;
        boolean z5 = false;
        int i3 = 0;
        while (i3 < sparseArray3.size()) {
            int keyAt = sparseArray3.keyAt(i3);
            if (keyAt >= this.Q) {
                l53 l53Var = (l53) sparseArray3.valueAt(i3);
                h53 h53Var2 = this.J;
                int i4 = keyAt - this.Q;
                l53Var.L = h53Var2;
                l53Var.M = i4;
                rc8 rc8Var = l53Var.y;
                rc8Var.n = z5;
                rc8Var.f = h53Var2;
                Iterator it = rc8Var.e.entrySet().iterator();
                while (it.hasNext()) {
                    int i5 = i3;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < rc8Var.f.h) {
                        it.remove();
                    }
                    i3 = i5;
                }
                i2 = i3;
                eh2[] eh2VarArr2 = l53Var.I;
                if (eh2VarArr2 != null) {
                    int length = eh2VarArr2.length;
                    int i6 = 0;
                    while (i6 < length) {
                        w93 w93Var = eh2VarArr2[i6].e;
                        u93[] u93VarArr = w93Var.h;
                        try {
                            w93Var.j = h53Var2;
                            w93Var.k = i4;
                            long d = h53Var2.d(i4);
                            ArrayList a = w93Var.a();
                            sparseArray2 = sparseArray3;
                            eh2VarArr = eh2VarArr2;
                            int i7 = 0;
                            while (i7 < u93VarArr.length) {
                                try {
                                    u93[] u93VarArr2 = u93VarArr;
                                    u93VarArr2[i7] = u93VarArr2[i7].a(d, (i89) a.get(w93Var.i.k(i7)));
                                    i7++;
                                    u93VarArr = u93VarArr2;
                                } catch (jh0 e) {
                                    e = e;
                                    w93Var.l = e;
                                    i6++;
                                    sparseArray3 = sparseArray2;
                                    eh2VarArr2 = eh2VarArr;
                                }
                            }
                        } catch (jh0 e2) {
                            e = e2;
                            sparseArray2 = sparseArray3;
                            eh2VarArr = eh2VarArr2;
                        }
                        i6++;
                        sparseArray3 = sparseArray2;
                        eh2VarArr2 = eh2VarArr;
                    }
                    sparseArray = sparseArray3;
                    z4 = true;
                    l53Var.H.b(l53Var);
                } else {
                    sparseArray = sparseArray3;
                    z4 = true;
                }
                l53Var.N = h53Var2.b(i4).d;
                for (l44 l44Var : l53Var.J) {
                    Iterator it2 = l53Var.N.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            m44 m44Var = (m44) it2.next();
                            if (m44Var.a().equals(l44Var.e.a())) {
                                l44Var.c(m44Var, (h53Var2.d && i4 == h53Var2.l.size() + (-1)) ? z4 : false);
                            }
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i2 = i3;
            }
            i3 = i2 + 1;
            sparseArray3 = sparseArray;
            z5 = false;
        }
        int i8 = 1;
        f38 b = this.J.b(0);
        int size = this.J.l.size() - 1;
        f38 b2 = this.J.b(size);
        long d2 = this.J.d(size);
        long T = g8c.T(g8c.E(this.N));
        long d3 = this.J.d(0);
        long j12 = b.b;
        List list = b.c;
        long T2 = g8c.T(j12);
        boolean v = v(b);
        int i9 = 0;
        while (true) {
            f38Var = b;
            if (i9 >= list.size()) {
                j = 0;
                break;
            }
            ea eaVar = (ea) list.get(i9);
            j = 0;
            List list2 = eaVar.c;
            int i10 = eaVar.b;
            boolean z6 = (i10 == i8 || i10 == 2) ? false : true;
            if ((!v || !z6) && !list2.isEmpty()) {
                r53 b3 = ((i89) list2.get(0)).b();
                if (b3 == null || b3.h0(d3, T) == 0) {
                    break;
                } else {
                    T2 = Math.max(T2, b3.e(b3.r(d3, T)) + T2);
                }
            }
            i9++;
            i8 = 1;
            b = f38Var;
        }
        long j13 = b2.b;
        List list3 = b2.c;
        long T3 = g8c.T(j13);
        boolean v2 = v(b2);
        long j14 = Long.MAX_VALUE;
        int i11 = 0;
        while (true) {
            if (i11 >= list3.size()) {
                j2 = T2;
                q53Var = this;
                j3 = j14;
                break;
            }
            ea eaVar2 = (ea) list3.get(i11);
            long j15 = T3;
            List list4 = eaVar2.c;
            int i12 = eaVar2.b;
            boolean z7 = (i12 == 1 || i12 == 2) ? false : true;
            if ((v2 && z7) || list4.isEmpty()) {
                j10 = T2;
            } else {
                r53 b4 = ((i89) list4.get(0)).b();
                if (b4 == null) {
                    j3 = j15 + d2;
                    q53Var = this;
                    j2 = T2;
                    break;
                }
                long h0 = b4.h0(d2, T);
                if (h0 == j) {
                    q53Var = this;
                    j2 = T2;
                    j3 = j15;
                    break;
                } else {
                    j10 = T2;
                    long r = (b4.r(d2, T) + h0) - 1;
                    j14 = Math.min(j14, b4.k(r, d2) + b4.e(r) + j15);
                }
            }
            i11++;
            T3 = j15;
            T2 = j10;
        }
        if (q53Var.J.d) {
            for (int i13 = 0; i13 < list3.size(); i13++) {
                r53 b5 = ((i89) ((ea) list3.get(i13)).c.get(0)).b();
                if (b5 != null && !b5.V()) {
                }
            }
            z2 = true;
            if (z2) {
                long j16 = q53Var.J.f;
                if (j16 != -9223372036854775807L) {
                    j4 = Math.max(j2, j3 - g8c.T(j16));
                    long j17 = j3 - j4;
                    h53Var = q53Var.J;
                    if (h53Var.d) {
                        gre.p(h53Var.a != -9223372036854775807L);
                        long T4 = (T - g8c.T(q53Var.J.a)) - j4;
                        wq6 wq6Var2 = q53Var.i().c;
                        long i0 = g8c.i0(T4);
                        j5 = -9223372036854775807L;
                        long j18 = wq6Var2.c;
                        if (j18 != -9223372036854775807L) {
                            j8 = Math.min(i0, j18);
                        } else {
                            vq6 vq6Var = q53Var.J.j;
                            if (vq6Var != null) {
                                long j19 = vq6Var.c;
                                if (j19 != -9223372036854775807L) {
                                    j8 = Math.min(i0, j19);
                                }
                            }
                            j8 = i0;
                        }
                        long i02 = g8c.i0(T4 - j17);
                        if (i02 < j && j8 > j) {
                            i02 = j;
                        }
                        boolean z8 = z2;
                        long j20 = q53Var.J.c;
                        if (j20 != -9223372036854775807L) {
                            i02 = Math.min(i02 + j20, i0);
                        }
                        long j21 = i02;
                        long j22 = wq6Var2.b;
                        if (j22 != -9223372036854775807L) {
                            j21 = g8c.j(j22, j21, i0);
                        } else {
                            vq6 vq6Var2 = q53Var.J.j;
                            if (vq6Var2 != null) {
                                long j23 = vq6Var2.b;
                                if (j23 != -9223372036854775807L) {
                                    j21 = g8c.j(j23, j21, i0);
                                }
                            }
                        }
                        long j24 = j21;
                        long j25 = j24 > j8 ? j24 : j8;
                        synchronized (this) {
                            wq6Var = q53Var.S;
                        }
                        long j26 = wq6Var.a;
                        if (j26 == -9223372036854775807L) {
                            h53 h53Var3 = q53Var.J;
                            vq6 vq6Var3 = h53Var3.j;
                            if (vq6Var3 != null) {
                                long j27 = vq6Var3.a;
                                if (j27 != -9223372036854775807L) {
                                    j26 = j27;
                                }
                            }
                            j26 = h53Var3.g;
                            if (j26 == -9223372036854775807L) {
                                j26 = q53Var.p;
                            }
                        }
                        if (j26 < j24) {
                            j26 = j24;
                        }
                        if (j26 > j25) {
                            j26 = g8c.j(g8c.i0(T4 - Math.min(j11, j17 / 2)), j24, j25);
                        }
                        long j28 = j25;
                        float f3 = wq6Var2.d;
                        if (f3 == -3.4028235E38f) {
                            vq6 vq6Var4 = q53Var.J.j;
                            f3 = vq6Var4 != null ? vq6Var4.d : -3.4028235E38f;
                        }
                        float f4 = wq6Var2.e;
                        if (f4 == -3.4028235E38f) {
                            vq6 vq6Var5 = q53Var.J.j;
                            f4 = vq6Var5 != null ? vq6Var5.e : -3.4028235E38f;
                        }
                        if (f3 == -3.4028235E38f && f4 == -3.4028235E38f) {
                            f = f4;
                            vq6 vq6Var6 = q53Var.J.j;
                            j9 = T4;
                            z3 = z8;
                            if (vq6Var6 == null || vq6Var6.a == -9223372036854775807L) {
                                f3 = 1.0f;
                                f2 = 1.0f;
                                vq6 vq6Var7 = new vq6();
                                vq6Var7.a = j26;
                                vq6Var7.b = j24;
                                vq6Var7.c = j28;
                                vq6Var7.d = f3;
                                vq6Var7.e = f2;
                                q53Var.C(new wq6(vq6Var7));
                                long i03 = g8c.i0(j4) + q53Var.J.a;
                                long T5 = j9 - g8c.T(q53Var.u().a);
                                long min = Math.min(j11, j17 / 2);
                                j7 = T5 >= min ? min : T5;
                                j6 = i03;
                                f38Var2 = f38Var;
                            }
                        } else {
                            f = f4;
                            j9 = T4;
                            z3 = z8;
                        }
                        f2 = f;
                        vq6 vq6Var72 = new vq6();
                        vq6Var72.a = j26;
                        vq6Var72.b = j24;
                        vq6Var72.c = j28;
                        vq6Var72.d = f3;
                        vq6Var72.e = f2;
                        q53Var.C(new wq6(vq6Var72));
                        long i032 = g8c.i0(j4) + q53Var.J.a;
                        long T52 = j9 - g8c.T(q53Var.u().a);
                        long min2 = Math.min(j11, j17 / 2);
                        if (T52 >= min2) {
                        }
                        j6 = i032;
                        f38Var2 = f38Var;
                    } else {
                        z3 = z2;
                        j5 = -9223372036854775807L;
                        j6 = -9223372036854775807L;
                        f38Var2 = f38Var;
                        j7 = j;
                    }
                    long T6 = j4 - g8c.T(f38Var2.b);
                    h53 h53Var4 = q53Var.J;
                    q53Var.n(new o53(h53Var4.a, j6, q53Var.N, q53Var.Q, T6, j17, j7, h53Var4, q53Var.i(), q53Var.J.d ? q53Var.u() : null));
                    if (q53Var.i) {
                        return;
                    }
                    q53Var.I.removeCallbacks(m53Var);
                    if (z3) {
                        Handler handler = q53Var.I;
                        h53 h53Var5 = q53Var.J;
                        long E = g8c.E(q53Var.N);
                        int size2 = h53Var5.l.size() - 1;
                        f38 b6 = h53Var5.b(size2);
                        long j29 = b6.b;
                        List list5 = b6.c;
                        long T7 = g8c.T(j29);
                        long d4 = h53Var5.d(size2);
                        long T8 = g8c.T(E);
                        long T9 = g8c.T(h53Var5.a);
                        long T10 = g8c.T(h53Var5.e);
                        if (T10 == j5 || T10 >= 5000000) {
                            T10 = 5000000;
                        }
                        int i14 = 0;
                        while (i14 < list5.size()) {
                            List list6 = ((ea) list5.get(i14)).c;
                            if (list6.isEmpty()) {
                                i = i14;
                            } else {
                                i = i14;
                                r53 b7 = ((i89) list6.get(0)).b();
                                if (b7 != null) {
                                    long v3 = (b7.v(d4, T8) + (T9 + T7)) - T8;
                                    if (v3 > j && (v3 < T10 - 100000 || (v3 > T10 && v3 < T10 + 100000))) {
                                        T10 = v3;
                                    }
                                }
                            }
                            i14 = i + 1;
                        }
                        handler.postDelayed(m53Var, yne.b(T10, 1000L, RoundingMode.CEILING));
                    }
                    if (q53Var.K) {
                        q53Var.D();
                        return;
                    }
                    if (z) {
                        h53 h53Var6 = q53Var.J;
                        if (h53Var6.d) {
                            long j30 = h53Var6.e;
                            if (j30 != j5) {
                                if (j30 == j) {
                                    j30 = 5000;
                                }
                                q53Var.I.postDelayed(q53Var.w, Math.max(j, (q53Var.L + j30) - SystemClock.elapsedRealtime()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            j4 = j2;
            long j172 = j3 - j4;
            h53Var = q53Var.J;
            if (h53Var.d) {
            }
            long T62 = j4 - g8c.T(f38Var2.b);
            h53 h53Var42 = q53Var.J;
            q53Var.n(new o53(h53Var42.a, j6, q53Var.N, q53Var.Q, T62, j172, j7, h53Var42, q53Var.i(), q53Var.J.d ? q53Var.u() : null));
            if (q53Var.i) {
            }
        }
        z2 = false;
        if (z2) {
        }
        j4 = j2;
        long j1722 = j3 - j4;
        h53Var = q53Var.J;
        if (h53Var.d) {
        }
        long T622 = j4 - g8c.T(f38Var2.b);
        h53 h53Var422 = q53Var.J;
        q53Var.n(new o53(h53Var422.a, j6, q53Var.N, q53Var.Q, T622, j1722, j7, h53Var422, q53Var.i(), q53Var.J.d ? q53Var.u() : null));
        if (q53Var.i) {
        }
    }
}
