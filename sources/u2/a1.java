package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ho0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class a1 implements c3.h0 {
    public b2.s A;
    public b2.s B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final ho0 a;
    public final n2.m d;
    public final n2.j e;
    public Object f;
    public b2.s g;
    public n2.g h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final j5.b b = new j5.b();
    public int i = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public long[] j = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] k = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] n = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] m = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] l = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public c3.g0[] o = new c3.g0[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public final a5.a c = new a5.a(new org.telegram.ui.web.n(2));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public a1(y2.d dVar, n2.m mVar, n2.j jVar) {
        this.d = mVar;
        this.e = jVar;
        this.a = new ho0(dVar);
    }

    public final void A(b2.s sVar, n4.y yVar) {
        b2.s sVar2;
        b2.s sVar3 = this.g;
        boolean z10 = sVar3 == null;
        b2.o oVar = sVar3 == null ? null : sVar3.v;
        this.g = sVar;
        b2.o oVar2 = sVar.v;
        n2.m mVar = this.d;
        if (mVar != null) {
            int H0 = mVar.H0(sVar);
            b2.r a2 = sVar.a();
            a2.R = H0;
            sVar2 = new b2.s(a2);
        } else {
            sVar2 = sVar;
        }
        yVar.c = sVar2;
        yVar.b = this.h;
        if (mVar == null) {
            return;
        }
        if (z10 || !Objects.equals(oVar, oVar2)) {
            n2.g gVar = this.h;
            n2.j jVar = this.e;
            n2.g T0 = mVar.T0(jVar, sVar);
            this.h = T0;
            yVar.b = T0;
            if (gVar != null) {
                gVar.a(jVar);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.s != this.p ? this.j[u(this.s)] : this.C;
    }

    public final int C(n4.y yVar, h2.h hVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        j5.b bVar = this.b;
        synchronized (this) {
            try {
                hVar.d = false;
                i11 = -3;
                if (this.s != this.p) {
                    b2.s sVar = ((y0) this.c.l(t())).a;
                    if (!z11 && sVar == this.g) {
                        int u10 = u(this.s);
                        if (y(u10)) {
                            hVar.setFlags(this.m[u10]);
                            if (this.s == this.p - 1 && (z10 || this.w)) {
                                hVar.addFlag(TLObject.FLAG_29);
                            }
                            hVar.e = this.n[u10];
                            bVar.b = this.l[u10];
                            bVar.a = this.k[u10];
                            bVar.c = this.o[u10];
                            i11 = -4;
                        } else {
                            hVar.d = true;
                        }
                    }
                    A(sVar, yVar);
                    i11 = -5;
                } else {
                    if (!z10 && !this.w) {
                        b2.s sVar2 = this.B;
                        if (sVar2 == null || (!z11 && sVar2 == this.g)) {
                        }
                        A(sVar2, yVar);
                        i11 = -5;
                    }
                    hVar.setFlags(4);
                    hVar.e = Long.MIN_VALUE;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !hVar.isEndOfStream()) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    ho0 ho0Var = this.a;
                    ho0.f((x0) ho0Var.f, hVar, this.b, (e2.v) ho0Var.d);
                } else {
                    ho0 ho0Var2 = this.a;
                    ho0Var2.f = ho0.f((x0) ho0Var2.f, hVar, this.b, (e2.v) ho0Var2.d);
                }
            }
            if (!z12) {
                this.s++;
            }
        }
        return i11;
    }

    public final void D(boolean z10) {
        ho0 ho0Var = this.a;
        ho0Var.a((x0) ho0Var.e);
        x0 x0Var = (x0) ho0Var.e;
        int i10 = ho0Var.a;
        e2.d.g(((y2.a) x0Var.c) == null);
        x0Var.a = 0L;
        x0Var.b = i10;
        x0 x0Var2 = (x0) ho0Var.e;
        ho0Var.f = x0Var2;
        ho0Var.g = x0Var2;
        ho0Var.b = 0L;
        ((y2.d) ho0Var.c).b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        a5.a aVar = this.c;
        SparseArray sparseArray = (SparseArray) aVar.c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((org.telegram.ui.web.n) aVar.d).accept(sparseArray.valueAt(i11));
        }
        aVar.b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized void E() {
        this.s = 0;
        ho0 ho0Var = this.a;
        ho0Var.f = (x0) ho0Var.e;
    }

    public final synchronized boolean F(int i10) {
        E();
        int i11 = this.q;
        if (i10 >= i11 && i10 <= this.p + i11) {
            this.t = Long.MIN_VALUE;
            this.s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean G(long j3, boolean z10) {
        Throwable th2;
        a1 a1Var;
        long j10;
        int o9;
        try {
            try {
                E();
                int u10 = u(this.s);
                int i10 = this.s;
                int i11 = this.p;
                if (!(i10 != i11) || j3 < this.n[u10] || (j3 > this.v && !z10)) {
                    return false;
                }
                if (this.D) {
                    int i12 = i11 - i10;
                    int i13 = 0;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                if (this.n[u10] >= j3) {
                                    i12 = i13;
                                    break;
                                }
                                u10++;
                                if (u10 == this.i) {
                                    u10 = 0;
                                }
                                i13++;
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        } else if (!z10) {
                            i12 = -1;
                        }
                    }
                    j10 = j3;
                    o9 = i12;
                    a1Var = this;
                } else {
                    int i14 = i11 - i10;
                    a1Var = this;
                    j10 = j3;
                    o9 = a1Var.o(j10, u10, i14, true);
                }
                if (o9 == -1) {
                    return false;
                }
                a1Var.t = j10;
                a1Var.s += o9;
                return true;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized void H(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.s + i10 <= this.p) {
                    z10 = true;
                    e2.d.b(z10);
                    this.s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        e2.d.b(z10);
        this.s += i10;
    }

    @Override // c3.h0
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, u2.z0] */
    @Override // c3.h0
    public final void b(b2.s sVar) {
        b2.s p5 = p(sVar);
        boolean z10 = false;
        this.z = false;
        this.A = sVar;
        synchronized (this) {
            try {
                this.y = false;
                if (!Objects.equals(p5, this.B)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((y0) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(p5)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            this.B = ((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            boolean z11 = this.D;
                            b2.s sVar2 = this.B;
                            this.D = z11 & b2.r0.a(sVar2.r, sVar2.k);
                            this.E = false;
                            z10 = true;
                        }
                    }
                    this.B = p5;
                    boolean z112 = this.D;
                    b2.s sVar22 = this.B;
                    this.D = z112 & b2.r0.a(sVar22.r, sVar22.k);
                    this.E = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r52 = this.f;
        if (r52 == 0 || !z10) {
            return;
        }
        r52.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // c3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(long j3, int i10, int i11, int i12, c3.g0 g0Var) {
        int i13;
        if (this.z) {
            b2.s sVar = this.A;
            e2.d.h(sVar);
            b(sVar);
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.x) {
            if (!z10) {
                return;
            } else {
                this.x = false;
            }
        }
        long j10 = this.F + j3;
        if (this.D) {
            if (j10 < this.t) {
                return;
            }
            if (i14 == 0) {
                if (!this.E) {
                    e2.a.n("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i13 = i10 | 1;
                if (this.G) {
                    if (!z10) {
                        return;
                    }
                    synchronized (this) {
                        if (this.p == 0) {
                            r3 = j10 > this.u;
                        } else if (r() >= j10) {
                            r3 = false;
                        } else {
                            m(this.q + h(j10));
                        }
                    }
                    if (!r3) {
                        return;
                    } else {
                        this.G = false;
                    }
                }
                g(j10, i13, (this.a.b - i11) - i12, i11, g0Var);
            }
        }
        i13 = i10;
        if (this.G) {
        }
        g(j10, i13, (this.a.b - i11) - i12, i11, g0Var);
    }

    @Override // c3.h0
    public final /* synthetic */ void d(int i10, e2.v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override // c3.h0
    public final int e(b2.k kVar, int i10, boolean z10) {
        ho0 ho0Var = this.a;
        int c10 = ho0Var.c(i10);
        x0 x0Var = (x0) ho0Var.g;
        y2.a aVar = (y2.a) x0Var.c;
        int read = kVar.read(aVar.a, ((int) (ho0Var.b - x0Var.a)) + aVar.b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = ho0Var.b + read;
        ho0Var.b = j3;
        x0 x0Var2 = (x0) ho0Var.g;
        if (j3 == x0Var2.b) {
            ho0Var.g = (x0) x0Var2.d;
        }
        return read;
    }

    @Override // c3.h0
    public final void f(e2.v vVar, int i10, int i11) {
        while (true) {
            ho0 ho0Var = this.a;
            if (i10 <= 0) {
                ho0Var.getClass();
                return;
            }
            int c10 = ho0Var.c(i10);
            x0 x0Var = (x0) ho0Var.g;
            y2.a aVar = (y2.a) x0Var.c;
            vVar.h(((int) (ho0Var.b - x0Var.a)) + aVar.b, c10, aVar.a);
            i10 -= c10;
            long j3 = ho0Var.b + c10;
            ho0Var.b = j3;
            x0 x0Var2 = (x0) ho0Var.g;
            if (j3 == x0Var2.b) {
                ho0Var.g = (x0) x0Var2.d;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (((u2.y0) r9.valueAt(r9.size() - 1)).a.equals(r8.B) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(long j3, int i10, long j10, int i11, c3.g0 g0Var) {
        try {
            int i12 = this.p;
            if (i12 > 0) {
                int u10 = u(i12 - 1);
                e2.d.b(this.k[u10] + ((long) this.l[u10]) <= j10);
            }
            this.w = (536870912 & i10) != 0;
            this.v = Math.max(this.v, j3);
            int u11 = u(this.p);
            this.n[u11] = j3;
            this.k[u11] = j10;
            this.l[u11] = i11;
            this.m[u11] = i10;
            this.o[u11] = g0Var;
            this.j[u11] = this.C;
            if (!(((SparseArray) this.c.c).size() == 0)) {
                SparseArray sparseArray = (SparseArray) this.c.c;
            }
            b2.s sVar = this.B;
            sVar.getClass();
            n2.m mVar = this.d;
            n2.l h02 = mVar != null ? mVar.h0(this.e, sVar) : n2.l.u;
            a5.a aVar = this.c;
            int i13 = this.q + this.p;
            y0 y0Var = new y0(sVar, h02);
            SparseArray sparseArray2 = (SparseArray) aVar.c;
            if (aVar.b == -1) {
                e2.d.g(sparseArray2.size() == 0);
                aVar.b = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                e2.d.b(i13 >= keyAt);
                if (keyAt == i13) {
                    ((org.telegram.ui.web.n) aVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i13, y0Var);
            int i14 = this.p + 1;
            this.p = i14;
            int i15 = this.i;
            if (i14 == i15) {
                int i16 = i15 + MediaDataController.MAX_STYLE_RUNS_COUNT;
                long[] jArr = new long[i16];
                long[] jArr2 = new long[i16];
                long[] jArr3 = new long[i16];
                int[] iArr = new int[i16];
                int[] iArr2 = new int[i16];
                c3.g0[] g0VarArr = new c3.g0[i16];
                int i17 = this.r;
                int i18 = i15 - i17;
                System.arraycopy(this.k, i17, jArr2, 0, i18);
                System.arraycopy(this.n, this.r, jArr3, 0, i18);
                System.arraycopy(this.m, this.r, iArr, 0, i18);
                System.arraycopy(this.l, this.r, iArr2, 0, i18);
                System.arraycopy(this.o, this.r, g0VarArr, 0, i18);
                System.arraycopy(this.j, this.r, jArr, 0, i18);
                int i19 = this.r;
                System.arraycopy(this.k, 0, jArr2, i18, i19);
                System.arraycopy(this.n, 0, jArr3, i18, i19);
                System.arraycopy(this.m, 0, iArr, i18, i19);
                System.arraycopy(this.l, 0, iArr2, i18, i19);
                System.arraycopy(this.o, 0, g0VarArr, i18, i19);
                System.arraycopy(this.j, 0, jArr, i18, i19);
                this.k = jArr2;
                this.n = jArr3;
                this.m = iArr;
                this.l = iArr2;
                this.o = g0VarArr;
                this.j = jArr;
                this.r = 0;
                this.i = i16;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int h(long j3) {
        int i10 = this.p;
        int u10 = u(i10 - 1);
        while (i10 > this.s && this.n[u10] >= j3) {
            i10--;
            u10--;
            if (u10 == -1) {
                u10 = this.i - 1;
            }
        }
        return i10;
    }

    public final long i(int i10) {
        this.u = Math.max(this.u, s(i10));
        this.p -= i10;
        int i11 = this.q + i10;
        this.q = i11;
        int i12 = this.r + i10;
        this.r = i12;
        int i13 = this.i;
        if (i12 >= i13) {
            this.r = i12 - i13;
        }
        int i14 = this.s - i10;
        this.s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.s = 0;
        }
        a5.a aVar = this.c;
        SparseArray sparseArray = (SparseArray) aVar.c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((org.telegram.ui.web.n) aVar.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = aVar.b;
            if (i17 > 0) {
                aVar.b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i18 = this.r;
        if (i18 == 0) {
            i18 = this.i;
        }
        return this.k[i18 - 1] + this.l[r7];
    }

    public final void j(long j3, boolean z10) {
        Throwable th2;
        ho0 ho0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.p;
                    long j10 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.n;
                        int i11 = this.r;
                        if (j3 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int o9 = o(j3, i11, i10, false);
                            if (o9 != -1) {
                                j10 = i(o9);
                            }
                            ho0Var.b(j10);
                        }
                    }
                    ho0Var.b(j10);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void k() {
        long i10;
        ho0 ho0Var = this.a;
        synchronized (this) {
            int i11 = this.p;
            i10 = i11 == 0 ? -1L : i(i11);
        }
        ho0Var.b(i10);
    }

    public final void l(long j3) {
        if (this.p == 0) {
            return;
        }
        e2.d.b(j3 > r());
        n(this.q + h(j3));
    }

    public final long m(int i10) {
        int i11 = this.q;
        int i12 = this.p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        e2.d.b(i13 >= 0 && i13 <= i12 - this.s);
        int i14 = this.p - i13;
        this.p = i14;
        this.v = Math.max(this.u, s(i14));
        if (i13 == 0 && this.w) {
            z10 = true;
        }
        this.w = z10;
        a5.a aVar = this.c;
        SparseArray sparseArray = (SparseArray) aVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((org.telegram.ui.web.n) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        aVar.b = sparseArray.size() > 0 ? Math.min(aVar.b, sparseArray.size() - 1) : -1;
        int i15 = this.p;
        if (i15 == 0) {
            return 0L;
        }
        return this.k[u(i15 - 1)] + this.l[r9];
    }

    public final void n(int i10) {
        long m10 = m(i10);
        ho0 ho0Var = this.a;
        int i11 = ho0Var.a;
        e2.d.b(m10 <= ho0Var.b);
        ho0Var.b = m10;
        if (m10 != 0) {
            x0 x0Var = (x0) ho0Var.e;
            if (m10 != x0Var.a) {
                while (ho0Var.b > x0Var.b) {
                    x0Var = (x0) x0Var.d;
                }
                x0 x0Var2 = (x0) x0Var.d;
                x0Var2.getClass();
                ho0Var.a(x0Var2);
                x0 x0Var3 = new x0(x0Var.b, i11);
                x0Var.d = x0Var3;
                if (ho0Var.b == x0Var.b) {
                    x0Var = x0Var3;
                }
                ho0Var.g = x0Var;
                if (((x0) ho0Var.f) == x0Var2) {
                    ho0Var.f = x0Var3;
                    return;
                }
                return;
            }
        }
        ho0Var.a((x0) ho0Var.e);
        x0 x0Var4 = new x0(ho0Var.b, i11);
        ho0Var.e = x0Var4;
        ho0Var.f = x0Var4;
        ho0Var.g = x0Var4;
    }

    public final int o(long j3, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = this.n[i10];
            if (j10 > j3) {
                break;
            }
            if (!z10 || (this.m[i10] & 1) != 0) {
                if (j10 == j3) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.s p(b2.s sVar) {
        if (this.F == 0 || sVar.w == Long.MAX_VALUE) {
            return sVar;
        }
        b2.r a2 = sVar.a();
        a2.v = sVar.w + this.F;
        return new b2.s(a2);
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.u, s(this.s));
    }

    public final long s(int i10) {
        long j3 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int u10 = u(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = Math.max(j3, this.n[u10]);
            if ((this.m[u10] & 1) != 0) {
                return j3;
            }
            u10--;
            if (u10 == -1) {
                u10 = this.i - 1;
            }
        }
        return j3;
    }

    public final int t() {
        return this.q + this.s;
    }

    public final int u(int i10) {
        int i11 = this.r + i10;
        int i12 = this.i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int v(long j3, boolean z10) {
        try {
            try {
                int u10 = u(this.s);
                int i10 = this.s;
                int i11 = this.p;
                if (!(i10 != i11) || j3 < this.n[u10]) {
                    return 0;
                }
                if (j3 > this.v && z10) {
                    return i11 - i10;
                }
                int o9 = o(j3, u10, i11 - i10, true);
                if (o9 == -1) {
                    return 0;
                }
                return o9;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized b2.s w() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean x(boolean z10) {
        b2.s sVar;
        boolean z11 = false;
        if (this.s != this.p) {
            if (((y0) this.c.l(t())).a != this.g) {
                return true;
            }
            return y(u(this.s));
        }
        if (z10 || this.w || ((sVar = this.B) != null && sVar != this.g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean y(int i10) {
        n2.g gVar = this.h;
        if (gVar == null || gVar.e() == 4) {
            return true;
        }
        return (this.m[i10] & TLObject.FLAG_30) == 0 && this.h.d();
    }

    public final void z() {
        n2.g gVar = this.h;
        if (gVar == null || gVar.e() != 1) {
            return;
        }
        n2.f g10 = this.h.g();
        g10.getClass();
        throw g10;
    }
}
