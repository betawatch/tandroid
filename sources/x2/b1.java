package x2;

import a8.ia;
import a8.wa;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.om0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class b1 implements f3.j0 {
    public boolean B;
    public e2.u C;
    public e2.u D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final om0 a;
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
    public final li.z b = new li.z();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public f3.i0[] o = new f3.i0[1000];
    public final wa c = new wa(new v0.j(23));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean z = true;
    public boolean F = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;

    public b1(h6.m mVar, q2.m mVar2, q2.j jVar) {
        this.d = mVar2;
        this.e = jVar;
        this.a = new om0(mVar);
    }

    public final synchronized boolean A(boolean z9) {
        e2.u uVar;
        int v = v();
        int i7 = this.x;
        boolean z10 = true;
        if (i7 != -1 && v >= i7) {
            return true;
        }
        if (this.s != this.p) {
            if (((z0) this.c.l(v)).a != this.g) {
                return true;
            }
            return B(w(this.s));
        }
        if (!z9 && !this.y && ((uVar = this.D) == null || uVar == this.g)) {
            z10 = false;
        }
        return z10;
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

    public final void D(e2.u uVar, wf.b bVar) {
        e2.u uVar2;
        e2.u uVar3 = this.g;
        boolean z9 = uVar3 == null;
        e2.r rVar = uVar3 == null ? null : uVar3.w;
        this.g = uVar;
        e2.r rVar2 = uVar.w;
        q2.m mVar = this.d;
        if (mVar != null) {
            int F = mVar.F(uVar);
            e2.t a10 = uVar.a();
            a10.S = F;
            uVar2 = new e2.u(a10);
        } else {
            uVar2 = uVar;
        }
        bVar.c = uVar2;
        bVar.b = this.h;
        if (mVar == null) {
            return;
        }
        if (z9 || !Objects.equals(rVar, rVar2)) {
            q2.g gVar = this.h;
            q2.j jVar = this.e;
            q2.g i7 = mVar.i(jVar, uVar);
            this.h = i7;
            bVar.b = i7;
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
    public final int F(wf.b bVar, k2.h hVar, int i7, boolean z9) {
        int i10;
        boolean z10 = (i7 & 2) != 0;
        li.z zVar = this.b;
        synchronized (this) {
            hVar.d = false;
            int v = v();
            int i11 = this.x;
            boolean z11 = i11 != -1 && v >= i11;
            i10 = -5;
            if ((this.s != this.p) && !z11) {
                e2.u uVar = ((z0) this.c.l(v)).a;
                if (!z10 && uVar == this.g) {
                    int w10 = w(this.s);
                    if (B(w10)) {
                        hVar.setFlags(this.m[w10]);
                        if (this.s == this.p - 1 && (z9 || this.y)) {
                            hVar.addFlag(TLObject.FLAG_29);
                        }
                        hVar.e = this.n[w10];
                        zVar.a = this.l[w10];
                        zVar.b = this.k[w10];
                        zVar.c = this.o[w10];
                        i10 = -4;
                    } else {
                        hVar.d = true;
                        i10 = -3;
                    }
                }
                D(uVar, bVar);
            }
            hVar.setFlags(4);
            hVar.e = Long.MIN_VALUE;
            i10 = -4;
        }
        if (i10 == -4 && !hVar.isEndOfStream()) {
            boolean z12 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                if (z12) {
                    om0 om0Var = this.a;
                    om0.f((a4.c) om0Var.f, hVar, this.b, (h2.x) om0Var.d);
                } else {
                    om0 om0Var2 = this.a;
                    om0Var2.f = om0.f((a4.c) om0Var2.f, hVar, this.b, (h2.x) om0Var2.d);
                }
            }
            if (!z12) {
                this.s++;
            }
        }
        return i10;
    }

    public final void G(boolean z9) {
        om0 om0Var = this.a;
        a4.c cVar = (a4.c) om0Var.e;
        if (((b3.a) cVar.c) != null) {
            h6.m mVar = (h6.m) om0Var.c;
            synchronized (mVar) {
                ((l2.h) mVar.d).c.b(cVar);
                a4.c cVar2 = cVar;
                while (cVar2 != null) {
                    b3.a aVar = (b3.a) cVar2.c;
                    aVar.getClass();
                    mVar.D(aVar);
                    cVar2 = (a4.c) cVar2.d;
                    if (cVar2 == null || ((b3.a) cVar2.c) == null) {
                        cVar2 = null;
                    }
                }
            }
            cVar.c = null;
            cVar.d = null;
        }
        a4.c cVar3 = (a4.c) om0Var.e;
        int i7 = om0Var.a;
        ia.p(((b3.a) cVar3.c) == null);
        cVar3.a = 0L;
        cVar3.b = i7;
        a4.c cVar4 = (a4.c) om0Var.e;
        om0Var.f = cVar4;
        om0Var.g = cVar4;
        om0Var.b = 0L;
        ((h6.m) om0Var.c).G();
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
        wa waVar = this.c;
        SparseArray sparseArray = (SparseArray) waVar.c;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((v0.j) waVar.d).accept(sparseArray.valueAt(i10));
        }
        waVar.b = -1;
        sparseArray.clear();
        if (z9) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized void H() {
        this.s = 0;
        om0 om0Var = this.a;
        om0Var.f = (a4.c) om0Var.e;
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

    public final synchronized boolean J(long j3, boolean z9) {
        Throwable th2;
        long min;
        b1 b1Var;
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
                if (!(i7 != i10) || j3 < this.n[w10] || (j3 > min && !z9)) {
                    return false;
                }
                if (this.F) {
                    q10 = p(w10, i10 - i7, j3, z9);
                    b1Var = this;
                    j10 = j3;
                } else {
                    int i11 = i10 - i7;
                    b1Var = this;
                    j10 = j3;
                    q10 = b1Var.q(w10, i11, j10, true);
                }
                if (q10 == -1) {
                    return false;
                }
                b1Var.t = j10;
                b1Var.s += q10;
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
        b1 b1Var;
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
                    b1Var = this;
                    j10 = j3;
                    i7 = b1Var.p(this.r, this.p, j10, false);
                } else {
                    b1Var = this;
                    j10 = j3;
                    i7 = -1;
                }
                if (i7 != -1) {
                    i10 = b1Var.q + i7;
                }
                b1Var.x = i10;
                b1Var.u = j10;
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
        boolean z9;
        if (i7 >= 0) {
            try {
                if (this.s + i7 <= this.p) {
                    z9 = true;
                    ia.f(z9);
                    this.s += i7;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z9 = false;
        ia.f(z9);
        this.s += i7;
    }

    @Override // f3.j0
    public final void a(h2.x xVar, int i7, int i10) {
        while (true) {
            om0 om0Var = this.a;
            if (i7 <= 0) {
                om0Var.getClass();
                return;
            }
            int c10 = om0Var.c(i7);
            a4.c cVar = (a4.c) om0Var.g;
            b3.a aVar = (b3.a) cVar.c;
            xVar.k(((int) (om0Var.b - cVar.a)) + aVar.b, c10, aVar.a);
            i7 -= c10;
            long j3 = om0Var.b + c10;
            om0Var.b = j3;
            a4.c cVar2 = (a4.c) om0Var.g;
            if (j3 == cVar2.b) {
                om0Var.g = (a4.c) cVar2.d;
            }
        }
    }

    @Override // f3.j0
    public final /* synthetic */ void b(int i7, h2.x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // f3.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(long j3, int i7, int i10, int i11, f3.i0 i0Var) {
        int i12;
        if (this.B) {
            e2.u uVar = this.C;
            uVar.getClass();
            g(uVar);
        }
        int i13 = i7 & 1;
        boolean z9 = i13 != 0;
        if (this.z) {
            if (!z9) {
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
                    if (!z9) {
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
                h(j10, i12, (this.a.b - i10) - i11, i10, i0Var);
            }
        }
        i12 = i7;
        if (this.I) {
        }
        h(j10, i12, (this.a.b - i10) - i11, i10, i0Var);
    }

    @Override // f3.j0
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override // f3.j0
    public final int f(e2.n nVar, int i7, boolean z9) {
        om0 om0Var = this.a;
        int c10 = om0Var.c(i7);
        a4.c cVar = (a4.c) om0Var.g;
        b3.a aVar = (b3.a) cVar.c;
        int read = nVar.read(aVar.a, ((int) (om0Var.b - cVar.a)) + aVar.b, c10);
        if (read == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = om0Var.b + read;
        om0Var.b = j3;
        a4.c cVar2 = (a4.c) om0Var.g;
        if (j3 == cVar2.b) {
            om0Var.g = (a4.c) cVar2.d;
        }
        return read;
    }

    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, x2.a1] */
    @Override // f3.j0
    public final void g(e2.u uVar) {
        e2.u r10 = r(uVar);
        boolean z9 = false;
        this.B = false;
        this.C = uVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r10, this.D)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((z0) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            this.D = ((z0) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            boolean z10 = this.F;
                            e2.u uVar2 = this.D;
                            String str = uVar2.s;
                            this.F = z10 & (e2.s0.h(str) != 1 && e2.s0.a(str, uVar2.k));
                            this.G = false;
                            z9 = true;
                        }
                    }
                    this.D = r10;
                    boolean z102 = this.F;
                    e2.u uVar22 = this.D;
                    String str2 = uVar22.s;
                    this.F = z102 & (e2.s0.h(str2) != 1 && e2.s0.a(str2, uVar22.k));
                    this.G = false;
                    z9 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r62 = this.f;
        if (r62 == 0 || !z9) {
            return;
        }
        r62.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (((x2.z0) r9.valueAt(r9.size() - 1)).a.equals(r8.D) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(long j3, int i7, long j10, int i10, f3.i0 i0Var) {
        try {
            int i11 = this.p;
            if (i11 > 0) {
                int w10 = w(i11 - 1);
                ia.f(this.k[w10] + ((long) this.l[w10]) <= j10);
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
            this.o[w11] = i0Var;
            this.j[w11] = this.E;
            if (!(((SparseArray) this.c.c).size() == 0)) {
                SparseArray sparseArray = (SparseArray) this.c.c;
            }
            e2.u uVar = this.D;
            uVar.getClass();
            q2.m mVar = this.d;
            q2.l m10 = mVar != null ? mVar.m(this.e, uVar) : q2.l.z;
            wa waVar = this.c;
            int i12 = this.q + this.p;
            z0 z0Var = new z0(uVar, m10);
            SparseArray sparseArray2 = (SparseArray) waVar.c;
            if (waVar.b == -1) {
                ia.p(sparseArray2.size() == 0);
                waVar.b = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                ia.f(i12 >= keyAt);
                if (keyAt == i12) {
                    ((v0.j) waVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i12, z0Var);
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
                f3.i0[] i0VarArr = new f3.i0[i15];
                int i16 = this.r;
                int i17 = i14 - i16;
                System.arraycopy(this.k, i16, jArr2, 0, i17);
                System.arraycopy(this.n, this.r, jArr3, 0, i17);
                System.arraycopy(this.m, this.r, iArr, 0, i17);
                System.arraycopy(this.l, this.r, iArr2, 0, i17);
                System.arraycopy(this.o, this.r, i0VarArr, 0, i17);
                System.arraycopy(this.j, this.r, jArr, 0, i17);
                int i18 = this.r;
                System.arraycopy(this.k, 0, jArr2, i17, i18);
                System.arraycopy(this.n, 0, jArr3, i17, i18);
                System.arraycopy(this.m, 0, iArr, i17, i18);
                System.arraycopy(this.l, 0, iArr2, i17, i18);
                System.arraycopy(this.o, 0, i0VarArr, i17, i18);
                System.arraycopy(this.j, 0, jArr, i17, i18);
                this.k = jArr2;
                this.n = jArr3;
                this.m = iArr;
                this.l = iArr2;
                this.o = i0VarArr;
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
        wa waVar = this.c;
        SparseArray sparseArray = (SparseArray) waVar.c;
        while (i14 < sparseArray.size() - 1) {
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((v0.j) waVar.d).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = waVar.b;
            if (i16 > 0) {
                waVar.b = i16 - 1;
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

    public final void k(long j3, boolean z9) {
        Throwable th2;
        om0 om0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i7 = this.p;
                    long j10 = -1;
                    if (i7 != 0) {
                        long[] jArr = this.n;
                        int i10 = this.r;
                        if (j3 >= jArr[i10]) {
                            if (z9) {
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
                            om0Var.b(j10);
                        }
                    }
                    om0Var.b(j10);
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
        om0 om0Var = this.a;
        synchronized (this) {
            int i7 = this.p;
            j3 = i7 == 0 ? -1L : j(i7);
        }
        om0Var.b(j3);
    }

    public final void m(long j3) {
        if (this.p == 0) {
            return;
        }
        ia.f(j3 > t());
        o(this.q + i(j3));
    }

    public final long n(int i7) {
        int i10 = this.q;
        int i11 = this.p;
        int i12 = (i10 + i11) - i7;
        boolean z9 = false;
        ia.f(i12 >= 0 && i12 <= i11 - this.s);
        int i13 = this.p - i12;
        this.p = i13;
        this.w = Math.max(this.v, u(i13));
        if (i12 == 0 && this.y) {
            z9 = true;
        }
        this.y = z9;
        int i14 = this.x;
        if (i14 != -1 && i7 < i14) {
            this.x = -1;
        }
        wa waVar = this.c;
        SparseArray sparseArray = (SparseArray) waVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((v0.j) waVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        waVar.b = sparseArray.size() > 0 ? Math.min(waVar.b, sparseArray.size() - 1) : -1;
        int i15 = this.p;
        if (i15 == 0) {
            return 0L;
        }
        return this.k[w(i15 - 1)] + this.l[r9];
    }

    public final void o(int i7) {
        om0 om0Var = this.a;
        long n10 = n(i7);
        int i10 = om0Var.a;
        ia.f(n10 <= om0Var.b);
        om0Var.b = n10;
        if (n10 != 0) {
            a4.c cVar = (a4.c) om0Var.e;
            if (n10 != cVar.a) {
                while (om0Var.b > cVar.b) {
                    cVar = (a4.c) cVar.d;
                }
                a4.c cVar2 = (a4.c) cVar.d;
                cVar2.getClass();
                if (((b3.a) cVar2.c) != null) {
                    h6.m mVar = (h6.m) om0Var.c;
                    synchronized (mVar) {
                        ((l2.h) mVar.d).c.b(cVar2);
                        a4.c cVar3 = cVar2;
                        while (cVar3 != null) {
                            b3.a aVar = (b3.a) cVar3.c;
                            aVar.getClass();
                            mVar.D(aVar);
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
                if (om0Var.b == cVar.b) {
                    cVar = cVar4;
                }
                om0Var.g = cVar;
                if (((a4.c) om0Var.f) == cVar2) {
                    om0Var.f = cVar4;
                    return;
                }
                return;
            }
        }
        om0Var.a((a4.c) om0Var.e);
        a4.c cVar5 = new a4.c(om0Var.b, i10);
        om0Var.e = cVar5;
        om0Var.f = cVar5;
        om0Var.g = cVar5;
    }

    public final int p(int i7, int i10, long j3, boolean z9) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.n[i7] >= j3) {
                return i11;
            }
            i7++;
            if (i7 == this.i) {
                i7 = 0;
            }
        }
        if (z9) {
            return i10;
        }
        return -1;
    }

    public final int q(int i7, int i10, long j3, boolean z9) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.n[i7];
            if (j10 > j3) {
                break;
            }
            if (!z9 || (this.m[i7] & 1) != 0) {
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

    public final synchronized int x(long j3, boolean z9) {
        try {
            try {
                int w10 = w(this.s);
                int i7 = this.s;
                int i10 = this.p;
                if (!(i7 != i10) || j3 < this.n[w10]) {
                    return 0;
                }
                if (j3 > this.w && z9) {
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

    @Override // f3.j0
    public final /* synthetic */ void d(long j3) {
    }
}
