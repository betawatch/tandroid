package r4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b4.e0;
import b7.y0;
import com.google.firebase.messaging.s;
import g5.m0;
import g5.n0;
import g5.o0;
import g5.p0;
import g5.q;
import g5.v0;
import h5.d0;
import j3.c1;
import j3.l0;
import j3.x0;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o4.t;
import o4.v;
import oh.h4;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends o4.a {
    public g5.m A;
    public m0 B;
    public v0 C;
    public y0 D;
    public Handler E;
    public x0 F;
    public Uri G;
    public final Uri H;
    public s4.c I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long O;
    public int P;
    public final c1 h;
    public final boolean i;
    public final g5.l j;
    public final f1 k;
    public final z9.d l;
    public final o3.o m;
    public final ab.a n;
    public final s o;
    public final long p;
    public final long q;
    public final e0 r;
    public final o0 s;
    public final ai t;
    public final Object u;
    public final SparseArray v;
    public final c w;
    public final c x;
    public final f1 y;
    public final n0 z;

    static {
        l0.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [r4.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [r4.c] */
    public g(c1 c1Var, g5.l lVar, o0 o0Var, f1 f1Var, z9.d dVar, o3.o oVar, ab.a aVar, long j10, long j11) {
        this.h = c1Var;
        this.F = c1Var.c;
        j3.y0 y0Var = c1Var.b;
        y0Var.getClass();
        Uri uri = y0Var.a;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.j = lVar;
        this.s = o0Var;
        this.k = f1Var;
        this.m = oVar;
        this.n = aVar;
        this.p = j10;
        this.q = j11;
        this.l = dVar;
        this.o = new s(13);
        this.i = false;
        this.r = a(null);
        this.u = new Object();
        this.v = new SparseArray();
        this.y = new f1(this, 13);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.t = new ai(this, 10);
        this.z = new h4(this, 13);
        final int i10 = 0;
        this.w = new Runnable(this) { // from class: r4.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.v();
                        break;
                    default:
                        this.b.u(false);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.x = new Runnable(this) { // from class: r4.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.v();
                        break;
                    default:
                        this.b.u(false);
                        break;
                }
            }
        };
    }

    public static boolean s(s4.h hVar) {
        List list = hVar.c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((s4.a) list.get(i10)).b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // o4.a
    public final t b(v vVar, q qVar, long j10) {
        int intValue = ((Integer) vVar.a).intValue() - this.P;
        e0 a2 = a(vVar);
        o3.l lVar = new o3.l(this.d.c, 0, vVar);
        int i10 = this.P + intValue;
        s4.c cVar = this.I;
        v0 v0Var = this.C;
        long j11 = this.M;
        k3.k kVar = this.g;
        h5.a.j(kVar);
        b bVar = new b(i10, cVar, this.o, intValue, this.k, v0Var, this.m, lVar, this.n, a2, j11, this.z, qVar, this.l, this.y, kVar);
        this.v.put(i10, bVar);
        return bVar;
    }

    @Override // o4.a
    public final c1 h() {
        return this.h;
    }

    @Override // o4.a
    public final void j() {
        this.z.a();
    }

    @Override // o4.a
    public final void l(v0 v0Var) {
        this.C = v0Var;
        Looper myLooper = Looper.myLooper();
        k3.k kVar = this.g;
        h5.a.j(kVar);
        o3.o oVar = this.m;
        oVar.h(myLooper, kVar);
        oVar.a();
        if (this.i) {
            u(false);
            return;
        }
        this.A = this.j.createDataSource();
        this.B = new m0("DashMediaSource");
        this.E = d0.l(null);
        v();
    }

    @Override // o4.a
    public final void n(t tVar) {
        b bVar = (b) tVar;
        o oVar = bVar.x;
        oVar.r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (q4.h hVar : bVar.E) {
            hVar.B(bVar);
        }
        bVar.D = null;
        this.v.remove(bVar.a);
    }

    @Override // o4.a
    public final void p() {
        this.J = false;
        this.A = null;
        m0 m0Var = this.B;
        if (m0Var != null) {
            m0Var.e(null);
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        this.I = this.i ? this.I : null;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.v.clear();
        s sVar = this.o;
        ((HashMap) sVar.a).clear();
        ((HashMap) sVar.b).clear();
        ((HashMap) sVar.c).clear();
        this.m.release();
    }

    public final void t() {
        boolean z4;
        m0 m0Var = this.B;
        d dVar = new d(this);
        synchronized (h5.a.i) {
            z4 = h5.a.j;
        }
        if (z4) {
            dVar.a();
            return;
        }
        if (m0Var == null) {
            m0Var = new m0("SntpClient");
        }
        m0Var.f(new ab.a(8), new ja.c(dVar), 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x049c, code lost:
    
        if (r8 > r21) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x049f, code lost:
    
        if (r11 > 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04a2, code lost:
    
        if (r11 < 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016f, code lost:
    
        r11 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(boolean z4) {
        long j10;
        long j11;
        long j12;
        boolean z10;
        s4.c cVar;
        long j13;
        long j14;
        long j15;
        h c3;
        long j16;
        long j17;
        float f10;
        float f11;
        boolean z11;
        h c10;
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.v;
            if (i10 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i10);
            if (keyAt >= this.P) {
                b bVar = (b) sparseArray.valueAt(i10);
                s4.c cVar2 = this.I;
                int i11 = keyAt - this.P;
                bVar.H = cVar2;
                bVar.I = i11;
                o oVar = bVar.x;
                oVar.n = z12;
                oVar.f = cVar2;
                Iterator it = oVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < oVar.f.h) {
                        it.remove();
                    }
                }
                q4.h[] hVarArr = bVar.E;
                if (hVarArr != null) {
                    for (q4.h hVar : hVarArr) {
                        k kVar = hVar.e;
                        i[] iVarArr = kVar.h;
                        try {
                            kVar.j = cVar2;
                            kVar.k = i11;
                            long d = cVar2.d(i11);
                            ArrayList a2 = kVar.a();
                            for (int i12 = 0; i12 < iVarArr.length; i12++) {
                                try {
                                    iVarArr[i12] = iVarArr[i12].a(d, (s4.m) a2.get(kVar.i.f(i12)));
                                } catch (o4.b e6) {
                                    e = e6;
                                    kVar.l = e;
                                }
                            }
                        } catch (o4.b e10) {
                            e = e10;
                        }
                    }
                    bVar.D.s(bVar);
                }
                bVar.J = cVar2.b(i11).d;
                for (l lVar : bVar.F) {
                    Iterator it2 = bVar.J.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            s4.g gVar = (s4.g) it2.next();
                            if (gVar.a().equals(lVar.e.a())) {
                                lVar.b(gVar, cVar2.d && i11 == cVar2.m.size() + (-1));
                            }
                        }
                    }
                }
            }
            i10++;
            z12 = false;
        }
        s4.h b10 = this.I.b(0);
        int size = this.I.m.size() - 1;
        s4.h b11 = this.I.b(size);
        long d10 = this.I.d(size);
        long G = d0.G(d0.u(this.M));
        long d11 = this.I.d(0);
        long j18 = b10.b;
        List list = b10.c;
        long G2 = d0.G(j18);
        boolean s6 = s(b10);
        long j19 = G2;
        int i13 = 0;
        while (true) {
            long j20 = G2;
            if (i13 >= list.size()) {
                j10 = 0;
                j11 = j19;
                break;
            }
            s4.a aVar = (s4.a) list.get(i13);
            j10 = 0;
            List list2 = aVar.c;
            int i14 = aVar.b;
            boolean z13 = (i14 == 1 || i14 == 2) ? false : true;
            if ((!s6 || !z13) && !list2.isEmpty()) {
                h c11 = ((s4.m) list2.get(0)).c();
                if (c11 != null && c11.I(d11, G) != 0) {
                    j19 = Math.max(j19, c11.a(c11.m(d11, G)) + j20);
                }
            }
            i13++;
            G2 = j20;
        }
        long j21 = b11.b;
        List list3 = b11.c;
        long G3 = d0.G(j21);
        boolean s9 = s(b11);
        long j22 = Long.MAX_VALUE;
        int i15 = 0;
        while (true) {
            if (i15 >= list3.size()) {
                j12 = j22;
                break;
            }
            s4.a aVar2 = (s4.a) list3.get(i15);
            boolean z14 = s9;
            List list4 = aVar2.c;
            int i16 = aVar2.b;
            long j23 = G3;
            if (i16 != 1 && i16 != 2) {
                z11 = true;
                if ((z14 || !z11) && !list4.isEmpty()) {
                    c10 = ((s4.m) list4.get(0)).c();
                    if (c10 != null) {
                        j12 = j23 + d10;
                        break;
                    }
                    long I = c10.I(d10, G);
                    if (I == j10) {
                        j12 = j23;
                        break;
                    } else {
                        long m9 = (c10.m(d10, G) + I) - 1;
                        j22 = Math.min(j22, c10.h(m9, d10) + c10.a(m9) + j23);
                    }
                }
                i15++;
                s9 = z14;
                G3 = j23;
            }
            z11 = false;
            if (z14) {
            }
            c10 = ((s4.m) list4.get(0)).c();
            if (c10 != null) {
            }
        }
        if (this.I.d) {
            for (int i17 = 0; i17 < list3.size(); i17++) {
                h c12 = ((s4.m) ((s4.a) list3.get(i17)).c.get(0)).c();
                if (c12 != null && !c12.A()) {
                }
            }
            z10 = true;
            if (z10) {
                long j24 = this.I.f;
                if (j24 != -9223372036854775807L) {
                    j11 = Math.max(j11, j12 - d0.G(j24));
                }
            }
            long j25 = j12 - j11;
            cVar = this.I;
            if (cVar.d) {
                j13 = -9223372036854775807L;
                j14 = -9223372036854775807L;
                j15 = j10;
            } else {
                h5.a.i(cVar.a != -9223372036854775807L);
                long G4 = (G - d0.G(this.I.a)) - j11;
                long S = d0.S(G4);
                x0 x0Var = this.h.c;
                long j26 = x0Var.c;
                if (j26 != -9223372036854775807L) {
                    j16 = Math.min(S, j26);
                } else {
                    s4.t tVar = this.I.j;
                    if (tVar != null) {
                        long j27 = tVar.c;
                        if (j27 != -9223372036854775807L) {
                            j16 = Math.min(S, j27);
                        }
                    }
                    j16 = S;
                }
                long S2 = d0.S(G4 - j25);
                if (S2 < j10 && j16 > j10) {
                    S2 = j10;
                }
                j13 = -9223372036854775807L;
                long j28 = this.I.c;
                if (j28 != -9223372036854775807L) {
                    S2 = Math.min(S2 + j28, S);
                }
                long j29 = S2;
                long j30 = x0Var.b;
                if (j30 != -9223372036854775807L) {
                    j29 = d0.i(j30, j29, S);
                } else {
                    s4.t tVar2 = this.I.j;
                    if (tVar2 != null) {
                        long j31 = tVar2.b;
                        if (j31 != -9223372036854775807L) {
                            j29 = d0.i(j31, j29, S);
                        }
                    }
                }
                long j32 = j29;
                long j33 = j32 > j16 ? j32 : j16;
                long j34 = this.F.a;
                if (j34 == -9223372036854775807L) {
                    s4.c cVar3 = this.I;
                    s4.t tVar3 = cVar3.j;
                    if (tVar3 != null) {
                        long j35 = tVar3.a;
                        if (j35 != -9223372036854775807L) {
                            j34 = j35;
                        }
                    }
                    j34 = cVar3.g;
                    if (j34 == -9223372036854775807L) {
                        j34 = this.p;
                    }
                }
                if (j34 < j32) {
                    j34 = j32;
                }
                long j36 = this.q;
                if (j34 > j33) {
                    j34 = d0.i(d0.S(G4 - Math.min(j36, j25 / 2)), j32, j33);
                }
                long j37 = j34;
                float f12 = x0Var.d;
                if (f12 == -3.4028235E38f) {
                    s4.t tVar4 = this.I.j;
                    f12 = tVar4 != null ? tVar4.d : -3.4028235E38f;
                }
                float f13 = x0Var.e;
                if (f13 == -3.4028235E38f) {
                    s4.t tVar5 = this.I.j;
                    f13 = tVar5 != null ? tVar5.e : -3.4028235E38f;
                }
                if (f12 == -3.4028235E38f && f13 == -3.4028235E38f) {
                    s4.t tVar6 = this.I.j;
                    j17 = 2;
                    if (tVar6 == null || tVar6.a == -9223372036854775807L) {
                        f11 = 1.0f;
                        f10 = 1.0f;
                        this.F = new x0(j37, j32, j33, f11, f10);
                        long S3 = d0.S(j11) + this.I.a;
                        long G5 = G4 - d0.G(this.F.a);
                        long min = Math.min(j36, j25 / j17);
                        j15 = G5 >= min ? min : G5;
                        j14 = S3;
                    }
                } else {
                    j17 = 2;
                }
                f11 = f12;
                f10 = f13;
                this.F = new x0(j37, j32, j33, f11, f10);
                long S32 = d0.S(j11) + this.I.a;
                long G52 = G4 - d0.G(this.F.a);
                long min2 = Math.min(j36, j25 / j17);
                if (G52 >= min2) {
                }
                j14 = S32;
            }
            long G6 = j11 - d0.G(b10.b);
            s4.c cVar4 = this.I;
            m(new e(cVar4.a, j14, this.M, this.P, G6, j25, j15, cVar4, this.h, !cVar4.d ? this.F : null));
            if (this.i) {
                Handler handler = this.E;
                c cVar5 = this.x;
                handler.removeCallbacks(cVar5);
                if (z10) {
                    Handler handler2 = this.E;
                    s4.c cVar6 = this.I;
                    long u10 = d0.u(this.M);
                    int size2 = cVar6.m.size() - 1;
                    s4.h b12 = cVar6.b(size2);
                    long j38 = b12.b;
                    List list5 = b12.c;
                    long G7 = d0.G(j38);
                    long d12 = cVar6.d(size2);
                    long G8 = d0.G(u10);
                    long G9 = d0.G(cVar6.a);
                    long G10 = d0.G(5000L);
                    for (int i18 = 0; i18 < list5.size(); i18++) {
                        List list6 = ((s4.a) list5.get(i18)).c;
                        if (!list6.isEmpty() && (c3 = ((s4.m) list6.get(0)).c()) != null) {
                            long n10 = (c3.n(d12, G8) + (G9 + G7)) - G8;
                            if (n10 < G10 - 100000 || (n10 > G10 && n10 < G10 + 100000)) {
                                G10 = n10;
                            }
                        }
                    }
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    long j39 = G10 / 1000;
                    long j40 = G10 - (1000 * j39);
                    if (j40 != j10) {
                        int i19 = ((int) ((G10 ^ 1000) >> 63)) | 1;
                        switch (t8.c.a[roundingMode.ordinal()]) {
                            case 1:
                                if (j40 != j10) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                j39 += i19;
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                                long abs = Math.abs(j40);
                                long abs2 = abs - (Math.abs(1000L) - abs);
                                if (abs2 == j10) {
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                    break;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    handler2.postDelayed(cVar5, j39);
                }
                if (this.J) {
                    v();
                    return;
                }
                if (z4) {
                    s4.c cVar7 = this.I;
                    if (cVar7.d) {
                        long j41 = cVar7.e;
                        if (j41 != j13) {
                            this.E.postDelayed(this.w, Math.max(j10, (this.K + (j41 == j10 ? 5000L : j41)) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z10 = false;
        if (z10) {
        }
        long j252 = j12 - j11;
        cVar = this.I;
        if (cVar.d) {
        }
        long G62 = j11 - d0.G(b10.b);
        s4.c cVar42 = this.I;
        m(new e(cVar42.a, j14, this.M, this.P, G62, j252, j15, cVar42, this.h, !cVar42.d ? this.F : null));
        if (this.i) {
        }
    }

    public final void v() {
        Uri uri;
        this.E.removeCallbacks(this.w);
        if (this.B.c()) {
            return;
        }
        if (this.B.d()) {
            this.J = true;
            return;
        }
        synchronized (this.u) {
            uri = this.G;
        }
        this.J = false;
        p0 p0Var = new p0(this.A, uri, 4, this.s);
        ai aiVar = this.t;
        this.n.getClass();
        this.B.f(p0Var, aiVar, 3);
        this.r.u(new o4.j(p0Var.b), p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
