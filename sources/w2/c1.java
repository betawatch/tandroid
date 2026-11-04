package w2;

import android.util.SparseArray;
import b8.kg;
import b8.zb;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class c1 implements e3.i0 {
    public boolean B;
    public d2.v C;
    public d2.v D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final rm0 a;
    public final p2.m d;
    public final p2.j e;
    public Object f;
    public d2.v g;
    public p2.g h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean y;
    public final l5.c b = new l5.c();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public e3.h0[] o = new e3.h0[1000];
    public final kg c = new kg(new u9.j(14));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean z = true;
    public boolean F = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;

    public c1(android.support.v4.media.session.a0 a0Var, p2.m mVar, p2.j jVar) {
        this.d = mVar;
        this.e = jVar;
        this.a = new rm0(a0Var);
    }

    public final synchronized boolean A(boolean z10) {
        d2.v vVar;
        int v = v();
        int i3 = this.x;
        boolean z11 = true;
        if (i3 != -1 && v >= i3) {
            return true;
        }
        if (this.s != this.p) {
            if (((a1) this.c.m(v)).a != this.g) {
                return true;
            }
            return B(w(this.s));
        }
        if (!z10 && !this.y && ((vVar = this.D) == null || vVar == this.g)) {
            z11 = false;
        }
        return z11;
    }

    public final boolean B(int i3) {
        p2.g gVar = this.h;
        if (gVar == null || gVar.d() == 4) {
            return true;
        }
        return (this.m[i3] & TLObject.FLAG_30) == 0 && this.h.c();
    }

    public final void C() {
        p2.g gVar = this.h;
        if (gVar == null || gVar.d() != 1) {
            return;
        }
        p2.f g7 = this.h.g();
        g7.getClass();
        throw g7;
    }

    public final void D(d2.v vVar, tf.b bVar) {
        d2.v vVar2;
        d2.v vVar3 = this.g;
        boolean z10 = vVar3 == null;
        d2.s sVar = vVar3 == null ? null : vVar3.w;
        this.g = vVar;
        d2.s sVar2 = vVar.w;
        p2.m mVar = this.d;
        if (mVar != null) {
            int u10 = mVar.u(vVar);
            d2.u a10 = vVar.a();
            a10.S = u10;
            vVar2 = new d2.v(a10);
        } else {
            vVar2 = vVar;
        }
        bVar.b = vVar2;
        bVar.a = this.h;
        if (mVar == null) {
            return;
        }
        if (z10 || !Objects.equals(sVar, sVar2)) {
            p2.g gVar = this.h;
            p2.j jVar = this.e;
            p2.g A = mVar.A(jVar, vVar);
            this.h = A;
            bVar.a = A;
            if (gVar != null) {
                gVar.b(jVar);
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
    public final int F(tf.b bVar, j2.h hVar, int i3, boolean z10) {
        int i10;
        boolean z11 = (i3 & 2) != 0;
        l5.c cVar = this.b;
        synchronized (this) {
            hVar.d = false;
            int v = v();
            int i11 = this.x;
            boolean z12 = i11 != -1 && v >= i11;
            i10 = -5;
            if ((this.s != this.p) && !z12) {
                d2.v vVar = ((a1) this.c.m(v)).a;
                if (!z11 && vVar == this.g) {
                    int w10 = w(this.s);
                    if (B(w10)) {
                        hVar.setFlags(this.m[w10]);
                        if (this.s == this.p - 1 && (z10 || this.y)) {
                            hVar.addFlag(TLObject.FLAG_29);
                        }
                        hVar.e = this.n[w10];
                        cVar.b = this.l[w10];
                        cVar.a = this.k[w10];
                        cVar.c = this.o[w10];
                        i10 = -4;
                    } else {
                        hVar.d = true;
                        i10 = -3;
                    }
                }
                D(vVar, bVar);
            }
            hVar.setFlags(4);
            hVar.e = Long.MIN_VALUE;
            i10 = -4;
        }
        if (i10 == -4 && !hVar.isEndOfStream()) {
            boolean z13 = (i3 & 1) != 0;
            if ((i3 & 4) == 0) {
                if (z13) {
                    rm0 rm0Var = this.a;
                    rm0.f((z0) rm0Var.f, hVar, this.b, (g2.y) rm0Var.d);
                } else {
                    rm0 rm0Var2 = this.a;
                    rm0Var2.f = rm0.f((z0) rm0Var2.f, hVar, this.b, (g2.y) rm0Var2.d);
                }
            }
            if (!z13) {
                this.s++;
            }
        }
        return i10;
    }

    public final void G(boolean z10) {
        rm0 rm0Var = this.a;
        z0 z0Var = (z0) rm0Var.e;
        if (((a3.a) z0Var.c) != null) {
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) rm0Var.c;
            synchronized (a0Var) {
                ((k2.h) a0Var.d).c.c(z0Var);
                z0 z0Var2 = z0Var;
                while (z0Var2 != null) {
                    a3.a aVar = (a3.a) z0Var2.c;
                    aVar.getClass();
                    a0Var.p(aVar);
                    z0Var2 = (z0) z0Var2.d;
                    if (z0Var2 == null || ((a3.a) z0Var2.c) == null) {
                        z0Var2 = null;
                    }
                }
            }
            z0Var.c = null;
            z0Var.d = null;
        }
        z0 z0Var3 = (z0) rm0Var.e;
        int i3 = rm0Var.a;
        zb.p(((a3.a) z0Var3.c) == null);
        z0Var3.a = 0L;
        z0Var3.b = i3;
        z0 z0Var4 = (z0) rm0Var.e;
        rm0Var.f = z0Var4;
        rm0Var.g = z0Var4;
        rm0Var.b = 0L;
        ((android.support.v4.media.session.a0) rm0Var.c).x();
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
        kg kgVar = this.c;
        SparseArray sparseArray = (SparseArray) kgVar.c;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((u9.j) kgVar.d).accept(sparseArray.valueAt(i10));
        }
        kgVar.b = -1;
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
        rm0 rm0Var = this.a;
        rm0Var.f = (z0) rm0Var.e;
    }

    public final synchronized boolean I(int i3) {
        H();
        int i10 = this.q;
        if (i3 >= i10 && i3 <= this.p + i10) {
            int i11 = this.x;
            if (i11 != -1 && i3 >= i11) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i3 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j10, boolean z10) {
        Throwable th2;
        long min;
        c1 c1Var;
        long j11;
        int q10;
        try {
            try {
                H();
                int w10 = w(this.s);
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
                int i3 = this.s;
                int i10 = this.p;
                if (!(i3 != i10) || j10 < this.n[w10] || (j10 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q10 = p(w10, i10 - i3, j10, z10);
                    c1Var = this;
                    j11 = j10;
                } else {
                    int i11 = i10 - i3;
                    c1Var = this;
                    j11 = j10;
                    q10 = c1Var.q(w10, i11, j11, true);
                }
                if (q10 == -1) {
                    return false;
                }
                c1Var.t = j11;
                c1Var.s += q10;
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
        int i3;
        try {
            try {
                if (j10 == this.u) {
                    return;
                }
                int i10 = -1;
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
                    i3 = c1Var.p(this.r, this.p, j11, false);
                } else {
                    c1Var = this;
                    j11 = j10;
                    i3 = -1;
                }
                if (i3 != -1) {
                    i10 = c1Var.q + i3;
                }
                c1Var.x = i10;
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

    public final synchronized void L(int i3) {
        boolean z10;
        if (i3 >= 0) {
            try {
                if (this.s + i3 <= this.p) {
                    z10 = true;
                    zb.f(z10);
                    this.s += i3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        zb.f(z10);
        this.s += i3;
    }

    @Override // e3.i0
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override // e3.i0
    public final int c(d2.o oVar, int i3, boolean z10) {
        rm0 rm0Var = this.a;
        int c2 = rm0Var.c(i3);
        z0 z0Var = (z0) rm0Var.g;
        a3.a aVar = (a3.a) z0Var.c;
        int read = oVar.read(aVar.a, ((int) (rm0Var.b - z0Var.a)) + aVar.b, c2);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = rm0Var.b + read;
        rm0Var.b = j10;
        z0 z0Var2 = (z0) rm0Var.g;
        if (j10 == z0Var2.b) {
            rm0Var.g = (z0) z0Var2.d;
        }
        return read;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // e3.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(long j10, int i3, int i10, int i11, e3.h0 h0Var) {
        int i12;
        if (this.B) {
            d2.v vVar = this.C;
            vVar.getClass();
            g(vVar);
        }
        int i13 = i3 & 1;
        boolean z10 = i13 != 0;
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
            if (i13 == 0) {
                if (!this.G) {
                    g2.a.l("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.D);
                    this.G = true;
                }
                i12 = i3 | 1;
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
                h(j11, i12, (this.a.b - i10) - i11, i10, h0Var);
            }
        }
        i12 = i3;
        if (this.I) {
        }
        h(j11, i12, (this.a.b - i10) - i11, i10, h0Var);
    }

    @Override // e3.i0
    public final /* synthetic */ void e(int i3, g2.y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override // e3.i0
    public final void f(g2.y yVar, int i3, int i10) {
        while (true) {
            rm0 rm0Var = this.a;
            if (i3 <= 0) {
                rm0Var.getClass();
                return;
            }
            int c2 = rm0Var.c(i3);
            z0 z0Var = (z0) rm0Var.g;
            a3.a aVar = (a3.a) z0Var.c;
            yVar.k(((int) (rm0Var.b - z0Var.a)) + aVar.b, c2, aVar.a);
            i3 -= c2;
            long j10 = rm0Var.b + c2;
            rm0Var.b = j10;
            z0 z0Var2 = (z0) rm0Var.g;
            if (j10 == z0Var2.b) {
                rm0Var.g = (z0) z0Var2.d;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, w2.b1] */
    @Override // e3.i0
    public final void g(d2.v vVar) {
        d2.v r5 = r(vVar);
        boolean z10 = false;
        this.B = false;
        this.C = vVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r5, this.D)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((a1) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(r5)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            this.D = ((a1) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            boolean z11 = this.F;
                            d2.v vVar2 = this.D;
                            String str = vVar2.s;
                            this.F = z11 & (d2.u0.h(str) != 1 && d2.u0.a(str, vVar2.k));
                            this.G = false;
                            z10 = true;
                        }
                    }
                    this.D = r5;
                    boolean z112 = this.F;
                    d2.v vVar22 = this.D;
                    String str2 = vVar22.s;
                    this.F = z112 & (d2.u0.h(str2) != 1 && d2.u0.a(str2, vVar22.k));
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (((w2.a1) r9.valueAt(r9.size() - 1)).a.equals(r8.D) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(long j10, int i3, long j11, int i10, e3.h0 h0Var) {
        try {
            int i11 = this.p;
            if (i11 > 0) {
                int w10 = w(i11 - 1);
                zb.f(this.k[w10] + ((long) this.l[w10]) <= j11);
            }
            this.y = (536870912 & i3) != 0;
            this.w = Math.max(this.w, j10);
            long j12 = this.u;
            if (j12 != Long.MIN_VALUE && this.x == -1 && j10 >= j12) {
                this.x = this.q + this.p;
            }
            int w11 = w(this.p);
            this.n[w11] = j10;
            this.k[w11] = j11;
            this.l[w11] = i10;
            this.m[w11] = i3;
            this.o[w11] = h0Var;
            this.j[w11] = this.E;
            if (!(((SparseArray) this.c.c).size() == 0)) {
                SparseArray sparseArray = (SparseArray) this.c.c;
            }
            d2.v vVar = this.D;
            vVar.getClass();
            p2.m mVar = this.d;
            p2.l f10 = mVar != null ? mVar.f(this.e, vVar) : p2.l.v;
            kg kgVar = this.c;
            int i12 = this.q + this.p;
            a1 a1Var = new a1(vVar, f10);
            SparseArray sparseArray2 = (SparseArray) kgVar.c;
            if (kgVar.b == -1) {
                zb.p(sparseArray2.size() == 0);
                kgVar.b = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                zb.f(i12 >= keyAt);
                if (keyAt == i12) {
                    ((u9.j) kgVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i12, a1Var);
            int i13 = this.p + 1;
            this.p = i13;
            int i14 = this.i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                e3.h0[] h0VarArr = new e3.h0[i15];
                int i16 = this.r;
                int i17 = i14 - i16;
                System.arraycopy(this.k, i16, jArr2, 0, i17);
                System.arraycopy(this.n, this.r, jArr3, 0, i17);
                System.arraycopy(this.m, this.r, iArr, 0, i17);
                System.arraycopy(this.l, this.r, iArr2, 0, i17);
                System.arraycopy(this.o, this.r, h0VarArr, 0, i17);
                System.arraycopy(this.j, this.r, jArr, 0, i17);
                int i18 = this.r;
                System.arraycopy(this.k, 0, jArr2, i17, i18);
                System.arraycopy(this.n, 0, jArr3, i17, i18);
                System.arraycopy(this.m, 0, iArr, i17, i18);
                System.arraycopy(this.l, 0, iArr2, i17, i18);
                System.arraycopy(this.o, 0, h0VarArr, i17, i18);
                System.arraycopy(this.j, 0, jArr, i17, i18);
                this.k = jArr2;
                this.n = jArr3;
                this.m = iArr;
                this.l = iArr2;
                this.o = h0VarArr;
                this.j = jArr;
                this.r = 0;
                this.i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int i(long j10) {
        int i3 = this.p;
        int w10 = w(i3 - 1);
        while (i3 > this.s && this.n[w10] >= j10) {
            i3--;
            w10--;
            if (w10 == -1) {
                w10 = this.i - 1;
            }
        }
        return i3;
    }

    public final long j(int i3) {
        this.v = Math.max(this.v, u(i3));
        this.p -= i3;
        int i10 = this.q + i3;
        this.q = i10;
        int i11 = this.r + i3;
        this.r = i11;
        int i12 = this.i;
        if (i11 >= i12) {
            this.r = i11 - i12;
        }
        int i13 = this.s - i3;
        this.s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.s = 0;
        }
        kg kgVar = this.c;
        SparseArray sparseArray = (SparseArray) kgVar.c;
        while (i14 < sparseArray.size() - 1) {
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((u9.j) kgVar.d).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = kgVar.b;
            if (i16 > 0) {
                kgVar.b = i16 - 1;
            }
            i14 = i15;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i17 = this.r;
        if (i17 == 0) {
            i17 = this.i;
        }
        return this.k[i17 - 1] + this.l[r7];
    }

    public final void k(long j10, boolean z10) {
        Throwable th2;
        rm0 rm0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i3 = this.p;
                    long j11 = -1;
                    if (i3 != 0) {
                        long[] jArr = this.n;
                        int i10 = this.r;
                        if (j10 >= jArr[i10]) {
                            if (z10) {
                                try {
                                    int i11 = this.s;
                                    if (i11 != i3) {
                                        i3 = i11 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int q10 = q(i10, i3, j10, false);
                            if (q10 != -1) {
                                j11 = j(q10);
                            }
                            rm0Var.b(j11);
                        }
                    }
                    rm0Var.b(j11);
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
        rm0 rm0Var = this.a;
        synchronized (this) {
            int i3 = this.p;
            j10 = i3 == 0 ? -1L : j(i3);
        }
        rm0Var.b(j10);
    }

    public final void m(long j10) {
        if (this.p == 0) {
            return;
        }
        zb.f(j10 > t());
        o(this.q + i(j10));
    }

    public final long n(int i3) {
        int i10 = this.q;
        int i11 = this.p;
        int i12 = (i10 + i11) - i3;
        boolean z10 = false;
        zb.f(i12 >= 0 && i12 <= i11 - this.s);
        int i13 = this.p - i12;
        this.p = i13;
        this.w = Math.max(this.v, u(i13));
        if (i12 == 0 && this.y) {
            z10 = true;
        }
        this.y = z10;
        int i14 = this.x;
        if (i14 != -1 && i3 < i14) {
            this.x = -1;
        }
        kg kgVar = this.c;
        SparseArray sparseArray = (SparseArray) kgVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i3 < sparseArray.keyAt(size); size--) {
            ((u9.j) kgVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        kgVar.b = sparseArray.size() > 0 ? Math.min(kgVar.b, sparseArray.size() - 1) : -1;
        int i15 = this.p;
        if (i15 == 0) {
            return 0L;
        }
        return this.k[w(i15 - 1)] + this.l[r9];
    }

    public final void o(int i3) {
        rm0 rm0Var = this.a;
        long n4 = n(i3);
        int i10 = rm0Var.a;
        zb.f(n4 <= rm0Var.b);
        rm0Var.b = n4;
        if (n4 != 0) {
            z0 z0Var = (z0) rm0Var.e;
            if (n4 != z0Var.a) {
                while (rm0Var.b > z0Var.b) {
                    z0Var = (z0) z0Var.d;
                }
                z0 z0Var2 = (z0) z0Var.d;
                z0Var2.getClass();
                if (((a3.a) z0Var2.c) != null) {
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) rm0Var.c;
                    synchronized (a0Var) {
                        ((k2.h) a0Var.d).c.c(z0Var2);
                        z0 z0Var3 = z0Var2;
                        while (z0Var3 != null) {
                            a3.a aVar = (a3.a) z0Var3.c;
                            aVar.getClass();
                            a0Var.p(aVar);
                            z0Var3 = (z0) z0Var3.d;
                            if (z0Var3 == null || ((a3.a) z0Var3.c) == null) {
                                z0Var3 = null;
                            }
                        }
                    }
                    z0Var2.c = null;
                    z0Var2.d = null;
                }
                z0 z0Var4 = new z0(z0Var.b, i10);
                z0Var.d = z0Var4;
                if (rm0Var.b == z0Var.b) {
                    z0Var = z0Var4;
                }
                rm0Var.g = z0Var;
                if (((z0) rm0Var.f) == z0Var2) {
                    rm0Var.f = z0Var4;
                    return;
                }
                return;
            }
        }
        rm0Var.a((z0) rm0Var.e);
        z0 z0Var5 = new z0(rm0Var.b, i10);
        rm0Var.e = z0Var5;
        rm0Var.f = z0Var5;
        rm0Var.g = z0Var5;
    }

    public final int p(int i3, int i10, long j10, boolean z10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.n[i3] >= j10) {
                return i11;
            }
            i3++;
            if (i3 == this.i) {
                i3 = 0;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    public final int q(int i3, int i10, long j10, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j11 = this.n[i3];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.m[i3] & 1) != 0) {
                if (j11 == j10) {
                    return i12;
                }
                i11 = i12;
            }
            i3++;
            if (i3 == this.i) {
                i3 = 0;
            }
        }
        return i11;
    }

    public d2.v r(d2.v vVar) {
        if (this.H == 0 || vVar.x == Long.MAX_VALUE) {
            return vVar;
        }
        d2.u a10 = vVar.a();
        a10.w = vVar.x + this.H;
        return new d2.v(a10);
    }

    public final synchronized long s() {
        return this.w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.s));
    }

    public final long u(int i3) {
        long j10 = Long.MIN_VALUE;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int w10 = w(i3 - 1);
        for (int i10 = 0; i10 < i3; i10++) {
            j10 = Math.max(j10, this.n[w10]);
            if ((this.m[w10] & 1) != 0) {
                return j10;
            }
            w10--;
            if (w10 == -1) {
                w10 = this.i - 1;
            }
        }
        return j10;
    }

    public final int v() {
        return this.q + this.s;
    }

    public final int w(int i3) {
        int i10 = this.r + i3;
        int i11 = this.i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int x(long j10, boolean z10) {
        try {
            try {
                int w10 = w(this.s);
                int i3 = this.s;
                int i10 = this.p;
                if (!(i3 != i10) || j10 < this.n[w10]) {
                    return 0;
                }
                if (j10 > this.w && z10) {
                    return i10 - i3;
                }
                int q10 = q(w10, i10 - i3, j10, true);
                if (q10 == -1) {
                    return 0;
                }
                return q10;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized d2.v y() {
        return this.A ? null : this.D;
    }

    public final synchronized boolean z() {
        return this.x != -1;
    }

    @Override // e3.i0
    public final /* synthetic */ void b(long j10) {
    }
}
