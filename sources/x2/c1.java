package x2;

import a8.la;
import a8.xa;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dn0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class c1 implements f3.i0 {
    public boolean B;
    public e2.u C;
    public e2.u D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final dn0 a;
    public final q2.m d;
    public final q2.j e;
    public Object f;
    public e2.u g;
    public q2.g h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean y;
    public final m5.b b = new m5.b();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public f3.h0[] o = new f3.h0[1000];
    public final xa c = new xa(new z0(0));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean z = true;
    public boolean F = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;

    public c1(h6.m mVar, q2.m mVar2, q2.j jVar) {
        this.d = mVar2;
        this.e = jVar;
        this.a = new dn0(mVar);
    }

    public final synchronized boolean A(boolean z10) {
        e2.u uVar;
        int v = v();
        int i7 = this.x;
        boolean z11 = true;
        if (i7 != -1 && v >= i7) {
            return true;
        }
        if (this.s != this.p) {
            if (((a1) this.c.l(v)).a != this.g) {
                return true;
            }
            return B(w(this.s));
        }
        if (!z10 && !this.y && ((uVar = this.D) == null || uVar == this.g)) {
            z11 = false;
        }
        return z11;
    }

    public final boolean B(int i7) {
        q2.g gVar = this.h;
        if (gVar == null || gVar.e() == 4) {
            return true;
        }
        return (this.m[i7] & TLObject.FLAG_30) == 0 && this.h.d();
    }

    public final void C() {
        q2.g gVar = this.h;
        if (gVar == null || gVar.e() != 1) {
            return;
        }
        q2.f g10 = this.h.g();
        g10.getClass();
        throw g10;
    }

    public final void D(e2.u uVar, k8.a aVar) {
        e2.u uVar2;
        e2.u uVar3 = this.g;
        boolean z10 = uVar3 == null;
        e2.r rVar = uVar3 == null ? null : uVar3.w;
        this.g = uVar;
        e2.r rVar2 = uVar.w;
        q2.m mVar = this.d;
        if (mVar != null) {
            int E1 = mVar.E1(uVar);
            e2.t a10 = uVar.a();
            a10.S = E1;
            uVar2 = new e2.u(a10);
        } else {
            uVar2 = uVar;
        }
        aVar.c = uVar2;
        aVar.b = this.h;
        if (mVar == null) {
            return;
        }
        if (z10 || !Objects.equals(rVar, rVar2)) {
            q2.g gVar = this.h;
            q2.j jVar = this.e;
            q2.g r10 = mVar.r(jVar, uVar);
            this.h = r10;
            aVar.b = r10;
            if (gVar != null) {
                gVar.c(jVar);
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
    public final int F(k8.a aVar, k2.h hVar, int i7, boolean z10) {
        int i10;
        boolean z11 = (i7 & 2) != 0;
        m5.b bVar = this.b;
        synchronized (this) {
            hVar.d = false;
            int v = v();
            int i11 = this.x;
            boolean z12 = i11 != -1 && v >= i11;
            i10 = -5;
            if ((this.s != this.p) && !z12) {
                e2.u uVar = ((a1) this.c.l(v)).a;
                if (!z11 && uVar == this.g) {
                    int w10 = w(this.s);
                    if (B(w10)) {
                        hVar.setFlags(this.m[w10]);
                        if (this.s == this.p - 1 && (z10 || this.y)) {
                            hVar.addFlag(TLObject.FLAG_29);
                        }
                        hVar.e = this.n[w10];
                        bVar.b = this.l[w10];
                        bVar.a = this.k[w10];
                        bVar.c = this.o[w10];
                        i10 = -4;
                    } else {
                        hVar.d = true;
                        i10 = -3;
                    }
                }
                D(uVar, aVar);
            }
            hVar.setFlags(4);
            hVar.e = Long.MIN_VALUE;
            i10 = -4;
        }
        if (i10 == -4 && !hVar.isEndOfStream()) {
            boolean z13 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                if (z13) {
                    dn0 dn0Var = this.a;
                    dn0.f((a4.c) dn0Var.f, hVar, this.b, (h2.x) dn0Var.d);
                } else {
                    dn0 dn0Var2 = this.a;
                    dn0Var2.f = dn0.f((a4.c) dn0Var2.f, hVar, this.b, (h2.x) dn0Var2.d);
                }
            }
            if (!z13) {
                this.s++;
            }
        }
        return i10;
    }

    public final void G(boolean z10) {
        dn0 dn0Var = this.a;
        a4.c cVar = (a4.c) dn0Var.e;
        if (((b3.a) cVar.c) != null) {
            h6.m mVar = (h6.m) dn0Var.c;
            synchronized (mVar) {
                ((l2.h) mVar.d).c.b(cVar);
                a4.c cVar2 = cVar;
                while (cVar2 != null) {
                    b3.a aVar = (b3.a) cVar2.c;
                    aVar.getClass();
                    mVar.H(aVar);
                    cVar2 = (a4.c) cVar2.d;
                    if (cVar2 == null || ((b3.a) cVar2.c) == null) {
                        cVar2 = null;
                    }
                }
            }
            cVar.c = null;
            cVar.d = null;
        }
        a4.c cVar3 = (a4.c) dn0Var.e;
        int i7 = dn0Var.a;
        la.p(((b3.a) cVar3.c) == null);
        cVar3.a = 0L;
        cVar3.b = i7;
        a4.c cVar4 = (a4.c) dn0Var.e;
        dn0Var.f = cVar4;
        dn0Var.g = cVar4;
        dn0Var.b = 0L;
        ((h6.m) dn0Var.c).J();
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
        xa xaVar = this.c;
        SparseArray sparseArray = (SparseArray) xaVar.c;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((z0) xaVar.d).accept(sparseArray.valueAt(i10));
        }
        xaVar.b = -1;
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
        dn0 dn0Var = this.a;
        dn0Var.f = (a4.c) dn0Var.e;
    }

    public final synchronized boolean I(int i7) {
        H();
        int i10 = this.q;
        if (i7 >= i10 && i7 <= this.p + i10) {
            int i11 = this.x;
            if (i11 != -1 && i7 >= i11) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i7 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j3, boolean z10) {
        Throwable th2;
        long min;
        c1 c1Var;
        long j10;
        int q10;
        try {
            try {
                H();
                int w10 = w(this.s);
                long j11 = this.u;
                if (j11 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.w, j11);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.w;
                }
                int i7 = this.s;
                int i10 = this.p;
                if (!(i7 != i10) || j3 < this.n[w10] || (j3 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q10 = p(w10, i10 - i7, j3, z10);
                    c1Var = this;
                    j10 = j3;
                } else {
                    int i11 = i10 - i7;
                    c1Var = this;
                    j10 = j3;
                    q10 = c1Var.q(w10, i11, j10, true);
                }
                if (q10 == -1) {
                    return false;
                }
                c1Var.t = j10;
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

    public final synchronized void K(long j3) {
        Throwable th2;
        c1 c1Var;
        long j10;
        int i7;
        try {
            try {
                if (j3 == this.u) {
                    return;
                }
                int i10 = -1;
                if (j3 == Long.MIN_VALUE) {
                    try {
                        this.x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j3 <= this.w) {
                    c1Var = this;
                    j10 = j3;
                    i7 = c1Var.p(this.r, this.p, j10, false);
                } else {
                    c1Var = this;
                    j10 = j3;
                    i7 = -1;
                }
                if (i7 != -1) {
                    i10 = c1Var.q + i7;
                }
                c1Var.x = i10;
                c1Var.u = j10;
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

    public final synchronized void L(int i7) {
        boolean z10;
        if (i7 >= 0) {
            try {
                if (this.s + i7 <= this.p) {
                    z10 = true;
                    la.f(z10);
                    this.s += i7;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        la.f(z10);
        this.s += i7;
    }

    @Override // f3.i0
    public final void a(h2.x xVar, int i7, int i10) {
        while (true) {
            dn0 dn0Var = this.a;
            if (i7 <= 0) {
                dn0Var.getClass();
                return;
            }
            int c10 = dn0Var.c(i7);
            a4.c cVar = (a4.c) dn0Var.g;
            b3.a aVar = (b3.a) cVar.c;
            xVar.k(((int) (dn0Var.b - cVar.a)) + aVar.b, c10, aVar.a);
            i7 -= c10;
            long j3 = dn0Var.b + c10;
            dn0Var.b = j3;
            a4.c cVar2 = (a4.c) dn0Var.g;
            if (j3 == cVar2.b) {
                dn0Var.g = (a4.c) cVar2.d;
            }
        }
    }

    @Override // f3.i0
    public final /* synthetic */ void b(int i7, h2.x xVar) {
        e2.a(this, xVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // f3.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(long j3, int i7, int i10, int i11, f3.h0 h0Var) {
        int i12;
        if (this.B) {
            e2.u uVar = this.C;
            uVar.getClass();
            g(uVar);
        }
        int i13 = i7 & 1;
        boolean z10 = i13 != 0;
        if (this.z) {
            if (!z10) {
                return;
            } else {
                this.z = false;
            }
        }
        long j10 = this.H + j3;
        if (this.F) {
            if (j10 < this.t) {
                return;
            }
            if (i13 == 0) {
                if (!this.G) {
                    h2.a.l("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.D);
                    this.G = true;
                }
                i12 = i7 | 1;
                if (this.I) {
                    if (!z10) {
                        return;
                    }
                    synchronized (this) {
                        if (this.p == 0) {
                            r3 = j10 > this.v;
                        } else if (t() >= j10) {
                            r3 = false;
                        } else {
                            n(this.q + i(j10));
                        }
                    }
                    if (!r3) {
                        return;
                    } else {
                        this.I = false;
                    }
                }
                h(j10, i12, (this.a.b - i10) - i11, i10, h0Var);
            }
        }
        i12 = i7;
        if (this.I) {
        }
        h(j10, i12, (this.a.b - i10) - i11, i10, h0Var);
    }

    @Override // f3.i0
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override // f3.i0
    public final int f(e2.n nVar, int i7, boolean z10) {
        dn0 dn0Var = this.a;
        int c10 = dn0Var.c(i7);
        a4.c cVar = (a4.c) dn0Var.g;
        b3.a aVar = (b3.a) cVar.c;
        int read = nVar.read(aVar.a, ((int) (dn0Var.b - cVar.a)) + aVar.b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = dn0Var.b + read;
        dn0Var.b = j3;
        a4.c cVar2 = (a4.c) dn0Var.g;
        if (j3 == cVar2.b) {
            dn0Var.g = (a4.c) cVar2.d;
        }
        return read;
    }

    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, x2.b1] */
    @Override // f3.i0
    public final void g(e2.u uVar) {
        e2.u r10 = r(uVar);
        boolean z10 = false;
        this.B = false;
        this.C = uVar;
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
                            e2.u uVar2 = this.D;
                            String str = uVar2.s;
                            this.F = z11 & (e2.s0.h(str) != 1 && e2.s0.a(str, uVar2.k));
                            this.G = false;
                            z10 = true;
                        }
                    }
                    this.D = r10;
                    boolean z112 = this.F;
                    e2.u uVar22 = this.D;
                    String str2 = uVar22.s;
                    this.F = z112 & (e2.s0.h(str2) != 1 && e2.s0.a(str2, uVar22.k));
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
    
        if (((x2.a1) r9.valueAt(r9.size() - 1)).a.equals(r8.D) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(long j3, int i7, long j10, int i10, f3.h0 h0Var) {
        try {
            int i11 = this.p;
            if (i11 > 0) {
                int w10 = w(i11 - 1);
                la.f(this.k[w10] + ((long) this.l[w10]) <= j10);
            }
            this.y = (536870912 & i7) != 0;
            this.w = Math.max(this.w, j3);
            long j11 = this.u;
            if (j11 != Long.MIN_VALUE && this.x == -1 && j3 >= j11) {
                this.x = this.q + this.p;
            }
            int w11 = w(this.p);
            this.n[w11] = j3;
            this.k[w11] = j10;
            this.l[w11] = i10;
            this.m[w11] = i7;
            this.o[w11] = h0Var;
            this.j[w11] = this.E;
            if (!(((SparseArray) this.c.c).size() == 0)) {
                SparseArray sparseArray = (SparseArray) this.c.c;
            }
            e2.u uVar = this.D;
            uVar.getClass();
            q2.m mVar = this.d;
            q2.l M = mVar != null ? mVar.M(this.e, uVar) : q2.l.z;
            xa xaVar = this.c;
            int i12 = this.q + this.p;
            a1 a1Var = new a1(uVar, M);
            SparseArray sparseArray2 = (SparseArray) xaVar.c;
            if (xaVar.b == -1) {
                la.p(sparseArray2.size() == 0);
                xaVar.b = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                la.f(i12 >= keyAt);
                if (keyAt == i12) {
                    ((z0) xaVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
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
                f3.h0[] h0VarArr = new f3.h0[i15];
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

    public final int i(long j3) {
        int i7 = this.p;
        int w10 = w(i7 - 1);
        while (i7 > this.s && this.n[w10] >= j3) {
            i7--;
            w10--;
            if (w10 == -1) {
                w10 = this.i - 1;
            }
        }
        return i7;
    }

    public final long j(int i7) {
        this.v = Math.max(this.v, u(i7));
        this.p -= i7;
        int i10 = this.q + i7;
        this.q = i10;
        int i11 = this.r + i7;
        this.r = i11;
        int i12 = this.i;
        if (i11 >= i12) {
            this.r = i11 - i12;
        }
        int i13 = this.s - i7;
        this.s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.s = 0;
        }
        xa xaVar = this.c;
        SparseArray sparseArray = (SparseArray) xaVar.c;
        while (i14 < sparseArray.size() - 1) {
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((z0) xaVar.d).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = xaVar.b;
            if (i16 > 0) {
                xaVar.b = i16 - 1;
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

    public final void k(long j3, boolean z10) {
        Throwable th2;
        dn0 dn0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i7 = this.p;
                    long j10 = -1;
                    if (i7 != 0) {
                        long[] jArr = this.n;
                        int i10 = this.r;
                        if (j3 >= jArr[i10]) {
                            if (z10) {
                                try {
                                    int i11 = this.s;
                                    if (i11 != i7) {
                                        i7 = i11 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int q10 = q(i10, i7, j3, false);
                            if (q10 != -1) {
                                j10 = j(q10);
                            }
                            dn0Var.b(j10);
                        }
                    }
                    dn0Var.b(j10);
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
        long j3;
        dn0 dn0Var = this.a;
        synchronized (this) {
            int i7 = this.p;
            j3 = i7 == 0 ? -1L : j(i7);
        }
        dn0Var.b(j3);
    }

    public final void m(long j3) {
        if (this.p == 0) {
            return;
        }
        la.f(j3 > t());
        o(this.q + i(j3));
    }

    public final long n(int i7) {
        int i10 = this.q;
        int i11 = this.p;
        int i12 = (i10 + i11) - i7;
        boolean z10 = false;
        la.f(i12 >= 0 && i12 <= i11 - this.s);
        int i13 = this.p - i12;
        this.p = i13;
        this.w = Math.max(this.v, u(i13));
        if (i12 == 0 && this.y) {
            z10 = true;
        }
        this.y = z10;
        int i14 = this.x;
        if (i14 != -1 && i7 < i14) {
            this.x = -1;
        }
        xa xaVar = this.c;
        SparseArray sparseArray = (SparseArray) xaVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((z0) xaVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        xaVar.b = sparseArray.size() > 0 ? Math.min(xaVar.b, sparseArray.size() - 1) : -1;
        int i15 = this.p;
        if (i15 == 0) {
            return 0L;
        }
        return this.k[w(i15 - 1)] + this.l[r9];
    }

    public final void o(int i7) {
        dn0 dn0Var = this.a;
        long n10 = n(i7);
        int i10 = dn0Var.a;
        la.f(n10 <= dn0Var.b);
        dn0Var.b = n10;
        if (n10 != 0) {
            a4.c cVar = (a4.c) dn0Var.e;
            if (n10 != cVar.a) {
                while (dn0Var.b > cVar.b) {
                    cVar = (a4.c) cVar.d;
                }
                a4.c cVar2 = (a4.c) cVar.d;
                cVar2.getClass();
                if (((b3.a) cVar2.c) != null) {
                    h6.m mVar = (h6.m) dn0Var.c;
                    synchronized (mVar) {
                        ((l2.h) mVar.d).c.b(cVar2);
                        a4.c cVar3 = cVar2;
                        while (cVar3 != null) {
                            b3.a aVar = (b3.a) cVar3.c;
                            aVar.getClass();
                            mVar.H(aVar);
                            cVar3 = (a4.c) cVar3.d;
                            if (cVar3 == null || ((b3.a) cVar3.c) == null) {
                                cVar3 = null;
                            }
                        }
                    }
                    cVar2.c = null;
                    cVar2.d = null;
                }
                a4.c cVar4 = new a4.c(cVar.b, i10);
                cVar.d = cVar4;
                if (dn0Var.b == cVar.b) {
                    cVar = cVar4;
                }
                dn0Var.g = cVar;
                if (((a4.c) dn0Var.f) == cVar2) {
                    dn0Var.f = cVar4;
                    return;
                }
                return;
            }
        }
        dn0Var.a((a4.c) dn0Var.e);
        a4.c cVar5 = new a4.c(dn0Var.b, i10);
        dn0Var.e = cVar5;
        dn0Var.f = cVar5;
        dn0Var.g = cVar5;
    }

    public final int p(int i7, int i10, long j3, boolean z10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.n[i7] >= j3) {
                return i11;
            }
            i7++;
            if (i7 == this.i) {
                i7 = 0;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    public final int q(int i7, int i10, long j3, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.n[i7];
            if (j10 > j3) {
                break;
            }
            if (!z10 || (this.m[i7] & 1) != 0) {
                if (j10 == j3) {
                    return i12;
                }
                i11 = i12;
            }
            i7++;
            if (i7 == this.i) {
                i7 = 0;
            }
        }
        return i11;
    }

    public e2.u r(e2.u uVar) {
        if (this.H == 0 || uVar.x == Long.MAX_VALUE) {
            return uVar;
        }
        e2.t a10 = uVar.a();
        a10.w = uVar.x + this.H;
        return new e2.u(a10);
    }

    public final synchronized long s() {
        return this.w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.s));
    }

    public final long u(int i7) {
        long j3 = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int w10 = w(i7 - 1);
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = Math.max(j3, this.n[w10]);
            if ((this.m[w10] & 1) != 0) {
                return j3;
            }
            w10--;
            if (w10 == -1) {
                w10 = this.i - 1;
            }
        }
        return j3;
    }

    public final int v() {
        return this.q + this.s;
    }

    public final int w(int i7) {
        int i10 = this.r + i7;
        int i11 = this.i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int x(long j3, boolean z10) {
        try {
            try {
                int w10 = w(this.s);
                int i7 = this.s;
                int i10 = this.p;
                if (!(i7 != i10) || j3 < this.n[w10]) {
                    return 0;
                }
                if (j3 > this.w && z10) {
                    return i10 - i7;
                }
                int q10 = q(w10, i10 - i7, j3, true);
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

    public final synchronized e2.u y() {
        return this.A ? null : this.D;
    }

    public final synchronized boolean z() {
        return this.x != -1;
    }

    @Override // f3.i0
    public final /* synthetic */ void d(long j3) {
    }
}
