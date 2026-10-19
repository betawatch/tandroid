package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ep0;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class c1 implements c3.j0 {
    public boolean B;
    public b2.w C;
    public b2.w D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final ep0 a;
    public final n2.n d;
    public final n2.k e;
    public Object f;
    public b2.w g;
    public n2.h h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean y;
    public final j5.c b = new j5.c();
    public int i = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public long[] j = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] k = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] n = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] m = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] l = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public c3.i0[] o = new c3.i0[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public final a5.a c = new a5.a(new sg.y(9));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean z = true;
    public boolean F = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;

    public c1(androidx.biometric.e eVar, n2.n nVar, n2.k kVar) {
        this.d = nVar;
        this.e = kVar;
        this.a = new ep0(eVar);
    }

    public final synchronized boolean A(boolean z10) {
        b2.w wVar;
        int v = v();
        int i10 = this.x;
        boolean z11 = true;
        if (i10 != -1 && v >= i10) {
            return true;
        }
        if (this.s != this.p) {
            if (((a1) this.c.o(v)).a != this.g) {
                return true;
            }
            return B(w(this.s));
        }
        if (!z10 && !this.y && ((wVar = this.D) == null || wVar == this.g)) {
            z11 = false;
        }
        return z11;
    }

    public final boolean B(int i10) {
        n2.h hVar = this.h;
        if (hVar == null || hVar.e() == 4) {
            return true;
        }
        return (this.m[i10] & TLObject.FLAG_30) == 0 && this.h.d();
    }

    public final void C() {
        n2.h hVar = this.h;
        if (hVar == null || hVar.e() != 1) {
            return;
        }
        n2.g g10 = this.h.g();
        g10.getClass();
        throw g10;
    }

    public final void D(b2.w wVar, qf.b bVar) {
        b2.w wVar2;
        b2.w wVar3 = this.g;
        boolean z10 = wVar3 == null;
        b2.s sVar = wVar3 == null ? null : wVar3.w;
        this.g = wVar;
        b2.s sVar2 = wVar.w;
        n2.n nVar = this.d;
        if (nVar != null) {
            int I0 = nVar.I0(wVar);
            b2.v a2 = wVar.a();
            a2.S = I0;
            wVar2 = new b2.w(a2);
        } else {
            wVar2 = wVar;
        }
        bVar.c = wVar2;
        bVar.b = this.h;
        if (nVar == null) {
            return;
        }
        if (z10 || !Objects.equals(sVar, sVar2)) {
            n2.h hVar = this.h;
            n2.k kVar = this.e;
            n2.h U0 = nVar.U0(kVar, wVar);
            this.h = U0;
            bVar.b = U0;
            if (hVar != null) {
                hVar.a(kVar);
            }
        }
    }

    public final synchronized long E() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.s != this.p ? this.j[w(this.s)] : this.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0090, code lost:
    
        if (r11.y != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0092, code lost:
    
        if (r5 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        r15 = r11.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0097, code lost:
    
        if (r15 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0099, code lost:
    
        if (r0 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009d, code lost:
    
        if (r15 == r11.g) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009f, code lost:
    
        D(r15, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F(qf.b bVar, h2.h hVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        j5.c cVar = this.b;
        synchronized (this) {
            hVar.d = false;
            int v = v();
            int i12 = this.x;
            boolean z12 = i12 != -1 && v >= i12;
            i11 = -5;
            if ((this.s != this.p) && !z12) {
                b2.w wVar = ((a1) this.c.o(v)).a;
                if (!z11 && wVar == this.g) {
                    int w9 = w(this.s);
                    if (B(w9)) {
                        hVar.setFlags(this.m[w9]);
                        if (this.s == this.p - 1 && (z10 || this.y)) {
                            hVar.addFlag(TLObject.FLAG_29);
                        }
                        hVar.e = this.n[w9];
                        cVar.b = this.l[w9];
                        cVar.a = this.k[w9];
                        cVar.c = this.o[w9];
                        i11 = -4;
                    } else {
                        hVar.d = true;
                        i11 = -3;
                    }
                }
                D(wVar, bVar);
            }
            hVar.setFlags(4);
            hVar.e = Long.MIN_VALUE;
            i11 = -4;
        }
        if (i11 == -4 && !hVar.isEndOfStream()) {
            boolean z13 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z13) {
                    ep0 ep0Var = this.a;
                    ep0.f((z0) ep0Var.f, hVar, this.b, (e2.x) ep0Var.d);
                } else {
                    ep0 ep0Var2 = this.a;
                    ep0Var2.f = ep0.f((z0) ep0Var2.f, hVar, this.b, (e2.x) ep0Var2.d);
                }
            }
            if (!z13) {
                this.s++;
            }
        }
        return i11;
    }

    public final void G(boolean z10) {
        ep0 ep0Var = this.a;
        z0 z0Var = (z0) ep0Var.e;
        if (((y2.a) z0Var.c) != null) {
            androidx.biometric.e eVar = (androidx.biometric.e) ep0Var.c;
            synchronized (eVar) {
                ((i2.j) eVar.d).c.b(z0Var);
                z0 z0Var2 = z0Var;
                while (z0Var2 != null) {
                    y2.a aVar = (y2.a) z0Var2.c;
                    aVar.getClass();
                    eVar.t(aVar);
                    z0Var2 = (z0) z0Var2.d;
                    if (z0Var2 == null || ((y2.a) z0Var2.c) == null) {
                        z0Var2 = null;
                    }
                }
            }
            z0Var.c = null;
            z0Var.d = null;
        }
        z0 z0Var3 = (z0) ep0Var.e;
        int i10 = ep0Var.a;
        u6.p(((y2.a) z0Var3.c) == null);
        z0Var3.a = 0L;
        z0Var3.b = i10;
        z0 z0Var4 = (z0) ep0Var.e;
        ep0Var.f = z0Var4;
        ep0Var.g = z0Var4;
        ep0Var.b = 0L;
        ((androidx.biometric.e) ep0Var.c).w();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.z = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.y = false;
        a5.a aVar2 = this.c;
        SparseArray sparseArray = (SparseArray) aVar2.c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((sg.y) aVar2.d).accept(sparseArray.valueAt(i11));
        }
        aVar2.b = -1;
        sparseArray.clear();
        if (z10) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized void H() {
        this.s = 0;
        ep0 ep0Var = this.a;
        ep0Var.f = (z0) ep0Var.e;
    }

    public final synchronized boolean I(int i10) {
        H();
        int i11 = this.q;
        if (i10 >= i11 && i10 <= this.p + i11) {
            int i12 = this.x;
            if (i12 != -1 && i10 >= i12) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j10, boolean z10) {
        Throwable th2;
        long min;
        c1 c1Var;
        long j11;
        int q6;
        try {
            try {
                H();
                int w9 = w(this.s);
                long j12 = this.u;
                if (j12 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.w, j12);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.w;
                }
                int i10 = this.s;
                int i11 = this.p;
                if (!(i10 != i11) || j10 < this.n[w9] || (j10 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q6 = p(j10, w9, i11 - i10, z10);
                    c1Var = this;
                    j11 = j10;
                } else {
                    int i12 = i11 - i10;
                    c1Var = this;
                    j11 = j10;
                    q6 = c1Var.q(j11, w9, i12, true);
                }
                if (q6 == -1) {
                    return false;
                }
                c1Var.t = j11;
                c1Var.s += q6;
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

    public final synchronized void K(long j10) {
        Throwable th2;
        c1 c1Var;
        long j11;
        int i10;
        try {
            try {
                if (j10 == this.u) {
                    return;
                }
                int i11 = -1;
                if (j10 == Long.MIN_VALUE) {
                    try {
                        this.x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j10 <= this.w) {
                    c1Var = this;
                    j11 = j10;
                    i10 = c1Var.p(j11, this.r, this.p, false);
                } else {
                    c1Var = this;
                    j11 = j10;
                    i10 = -1;
                }
                if (i10 != -1) {
                    i11 = c1Var.q + i10;
                }
                c1Var.x = i11;
                c1Var.u = j11;
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

    public final synchronized void L(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.s + i10 <= this.p) {
                    z10 = true;
                    u6.g(z10);
                    this.s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        u6.g(z10);
        this.s += i10;
    }

    @Override // c3.j0
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, u2.b1] */
    @Override // c3.j0
    public final void b(b2.w wVar) {
        b2.w r10 = r(wVar);
        boolean z10 = false;
        this.B = false;
        this.C = wVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r10, this.D)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((a1) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            this.D = ((a1) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            boolean z11 = this.F;
                            b2.w wVar2 = this.D;
                            String str = wVar2.s;
                            this.F = z11 & (b2.v0.h(str) != 1 && b2.v0.a(str, wVar2.k));
                            this.G = false;
                            z10 = true;
                        }
                    }
                    this.D = r10;
                    boolean z112 = this.F;
                    b2.w wVar22 = this.D;
                    String str2 = wVar22.s;
                    this.F = z112 & (b2.v0.h(str2) != 1 && b2.v0.a(str2, wVar22.k));
                    this.G = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r62 = this.f;
        if (r62 == 0 || !z10) {
            return;
        }
        r62.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // c3.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(long j10, int i10, int i11, int i12, c3.i0 i0Var) {
        int i13;
        if (this.B) {
            b2.w wVar = this.C;
            wVar.getClass();
            b(wVar);
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.z) {
            if (!z10) {
                return;
            } else {
                this.z = false;
            }
        }
        long j11 = this.H + j10;
        if (this.F) {
            if (j11 < this.t) {
                return;
            }
            if (i14 == 0) {
                if (!this.G) {
                    e2.a.l("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.D);
                    this.G = true;
                }
                i13 = i10 | 1;
                if (this.I) {
                    if (!z10) {
                        return;
                    }
                    synchronized (this) {
                        if (this.p == 0) {
                            r3 = j11 > this.v;
                        } else if (t() >= j11) {
                            r3 = false;
                        } else {
                            n(this.q + i(j11));
                        }
                    }
                    if (!r3) {
                        return;
                    } else {
                        this.I = false;
                    }
                }
                h(j11, i13, (this.a.b - i11) - i12, i11, i0Var);
            }
        }
        i13 = i10;
        if (this.I) {
        }
        h(j11, i13, (this.a.b - i11) - i12, i11, i0Var);
    }

    @Override // c3.j0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override // c3.j0
    public final int f(b2.o oVar, int i10, boolean z10) {
        ep0 ep0Var = this.a;
        int c10 = ep0Var.c(i10);
        z0 z0Var = (z0) ep0Var.g;
        y2.a aVar = (y2.a) z0Var.c;
        int read = oVar.read(aVar.a, ((int) (ep0Var.b - z0Var.a)) + aVar.b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = ep0Var.b + read;
        ep0Var.b = j10;
        z0 z0Var2 = (z0) ep0Var.g;
        if (j10 == z0Var2.b) {
            ep0Var.g = (z0) z0Var2.d;
        }
        return read;
    }

    @Override // c3.j0
    public final void g(e2.x xVar, int i10, int i11) {
        while (true) {
            ep0 ep0Var = this.a;
            if (i10 <= 0) {
                ep0Var.getClass();
                return;
            }
            int c10 = ep0Var.c(i10);
            z0 z0Var = (z0) ep0Var.g;
            y2.a aVar = (y2.a) z0Var.c;
            xVar.k(((int) (ep0Var.b - z0Var.a)) + aVar.b, c10, aVar.a);
            i10 -= c10;
            long j10 = ep0Var.b + c10;
            ep0Var.b = j10;
            z0 z0Var2 = (z0) ep0Var.g;
            if (j10 == z0Var2.b) {
                ep0Var.g = (z0) z0Var2.d;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (((u2.a1) r9.valueAt(r9.size() - 1)).a.equals(r8.D) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(long j10, int i10, long j11, int i11, c3.i0 i0Var) {
        try {
            int i12 = this.p;
            if (i12 > 0) {
                int w9 = w(i12 - 1);
                u6.g(this.k[w9] + ((long) this.l[w9]) <= j11);
            }
            this.y = (536870912 & i10) != 0;
            this.w = Math.max(this.w, j10);
            long j12 = this.u;
            if (j12 != Long.MIN_VALUE && this.x == -1 && j10 >= j12) {
                this.x = this.q + this.p;
            }
            int w10 = w(this.p);
            this.n[w10] = j10;
            this.k[w10] = j11;
            this.l[w10] = i11;
            this.m[w10] = i10;
            this.o[w10] = i0Var;
            this.j[w10] = this.E;
            if (!(((SparseArray) this.c.c).size() == 0)) {
                SparseArray sparseArray = (SparseArray) this.c.c;
            }
            b2.w wVar = this.D;
            wVar.getClass();
            n2.n nVar = this.d;
            n2.m j02 = nVar != null ? nVar.j0(this.e, wVar) : n2.m.u;
            a5.a aVar = this.c;
            int i13 = this.q + this.p;
            a1 a1Var = new a1(wVar, j02);
            SparseArray sparseArray2 = (SparseArray) aVar.c;
            if (aVar.b == -1) {
                u6.p(sparseArray2.size() == 0);
                aVar.b = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                u6.g(i13 >= keyAt);
                if (keyAt == i13) {
                    ((sg.y) aVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i13, a1Var);
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
                c3.i0[] i0VarArr = new c3.i0[i16];
                int i17 = this.r;
                int i18 = i15 - i17;
                System.arraycopy(this.k, i17, jArr2, 0, i18);
                System.arraycopy(this.n, this.r, jArr3, 0, i18);
                System.arraycopy(this.m, this.r, iArr, 0, i18);
                System.arraycopy(this.l, this.r, iArr2, 0, i18);
                System.arraycopy(this.o, this.r, i0VarArr, 0, i18);
                System.arraycopy(this.j, this.r, jArr, 0, i18);
                int i19 = this.r;
                System.arraycopy(this.k, 0, jArr2, i18, i19);
                System.arraycopy(this.n, 0, jArr3, i18, i19);
                System.arraycopy(this.m, 0, iArr, i18, i19);
                System.arraycopy(this.l, 0, iArr2, i18, i19);
                System.arraycopy(this.o, 0, i0VarArr, i18, i19);
                System.arraycopy(this.j, 0, jArr, i18, i19);
                this.k = jArr2;
                this.n = jArr3;
                this.m = iArr;
                this.l = iArr2;
                this.o = i0VarArr;
                this.j = jArr;
                this.r = 0;
                this.i = i16;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int i(long j10) {
        int i10 = this.p;
        int w9 = w(i10 - 1);
        while (i10 > this.s && this.n[w9] >= j10) {
            i10--;
            w9--;
            if (w9 == -1) {
                w9 = this.i - 1;
            }
        }
        return i10;
    }

    public final long j(int i10) {
        this.v = Math.max(this.v, u(i10));
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
            ((sg.y) aVar.d).accept(sparseArray.valueAt(i15));
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

    public final void k(long j10, boolean z10) {
        Throwable th2;
        ep0 ep0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.n;
                        int i11 = this.r;
                        if (j10 >= jArr[i11]) {
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
                            int q6 = q(j10, i11, i10, false);
                            if (q6 != -1) {
                                j11 = j(q6);
                            }
                            ep0Var.b(j11);
                        }
                    }
                    ep0Var.b(j11);
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

    public final void l() {
        long j10;
        ep0 ep0Var = this.a;
        synchronized (this) {
            int i10 = this.p;
            j10 = i10 == 0 ? -1L : j(i10);
        }
        ep0Var.b(j10);
    }

    public final void m(long j10) {
        if (this.p == 0) {
            return;
        }
        u6.g(j10 > t());
        o(this.q + i(j10));
    }

    public final long n(int i10) {
        int i11 = this.q;
        int i12 = this.p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        u6.g(i13 >= 0 && i13 <= i12 - this.s);
        int i14 = this.p - i13;
        this.p = i14;
        this.w = Math.max(this.v, u(i14));
        if (i13 == 0 && this.y) {
            z10 = true;
        }
        this.y = z10;
        int i15 = this.x;
        if (i15 != -1 && i10 < i15) {
            this.x = -1;
        }
        a5.a aVar = this.c;
        SparseArray sparseArray = (SparseArray) aVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((sg.y) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        aVar.b = sparseArray.size() > 0 ? Math.min(aVar.b, sparseArray.size() - 1) : -1;
        int i16 = this.p;
        if (i16 == 0) {
            return 0L;
        }
        return this.k[w(i16 - 1)] + this.l[r9];
    }

    public final void o(int i10) {
        ep0 ep0Var = this.a;
        long n10 = n(i10);
        int i11 = ep0Var.a;
        u6.g(n10 <= ep0Var.b);
        ep0Var.b = n10;
        if (n10 != 0) {
            z0 z0Var = (z0) ep0Var.e;
            if (n10 != z0Var.a) {
                while (ep0Var.b > z0Var.b) {
                    z0Var = (z0) z0Var.d;
                }
                z0 z0Var2 = (z0) z0Var.d;
                z0Var2.getClass();
                if (((y2.a) z0Var2.c) != null) {
                    androidx.biometric.e eVar = (androidx.biometric.e) ep0Var.c;
                    synchronized (eVar) {
                        ((i2.j) eVar.d).c.b(z0Var2);
                        z0 z0Var3 = z0Var2;
                        while (z0Var3 != null) {
                            y2.a aVar = (y2.a) z0Var3.c;
                            aVar.getClass();
                            eVar.t(aVar);
                            z0Var3 = (z0) z0Var3.d;
                            if (z0Var3 == null || ((y2.a) z0Var3.c) == null) {
                                z0Var3 = null;
                            }
                        }
                    }
                    z0Var2.c = null;
                    z0Var2.d = null;
                }
                z0 z0Var4 = new z0(z0Var.b, i11);
                z0Var.d = z0Var4;
                if (ep0Var.b == z0Var.b) {
                    z0Var = z0Var4;
                }
                ep0Var.g = z0Var;
                if (((z0) ep0Var.f) == z0Var2) {
                    ep0Var.f = z0Var4;
                    return;
                }
                return;
            }
        }
        ep0Var.a((z0) ep0Var.e);
        z0 z0Var5 = new z0(ep0Var.b, i11);
        ep0Var.e = z0Var5;
        ep0Var.f = z0Var5;
        ep0Var.g = z0Var5;
    }

    public final int p(long j10, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    public final int q(long j10, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.m[i10] & 1) != 0) {
                if (j11 == j10) {
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

    public b2.w r(b2.w wVar) {
        if (this.H == 0 || wVar.x == Long.MAX_VALUE) {
            return wVar;
        }
        b2.v a2 = wVar.a();
        a2.w = wVar.x + this.H;
        return new b2.w(a2);
    }

    public final synchronized long s() {
        return this.w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.s));
    }

    public final long u(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int w9 = w(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.n[w9]);
            if ((this.m[w9] & 1) != 0) {
                return j10;
            }
            w9--;
            if (w9 == -1) {
                w9 = this.i - 1;
            }
        }
        return j10;
    }

    public final int v() {
        return this.q + this.s;
    }

    public final int w(int i10) {
        int i11 = this.r + i10;
        int i12 = this.i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int x(long j10, boolean z10) {
        try {
            try {
                int w9 = w(this.s);
                int i10 = this.s;
                int i11 = this.p;
                if (!(i10 != i11) || j10 < this.n[w9]) {
                    return 0;
                }
                if (j10 > this.w && z10) {
                    return i11 - i10;
                }
                int q6 = q(j10, w9, i11 - i10, true);
                if (q6 == -1) {
                    return 0;
                }
                return q6;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized b2.w y() {
        return this.A ? null : this.D;
    }

    public final synchronized boolean z() {
        return this.x != -1;
    }

    @Override // c3.j0
    public final /* synthetic */ void e(long j10) {
    }
}
