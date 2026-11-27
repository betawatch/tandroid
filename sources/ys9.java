// default package

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ys9 implements x1c {
    public boolean C;
    public ko4 D;
    public ko4 E;
    public long F;
    public boolean H;
    public long I;
    public boolean J;
    public final us9 a;
    public final pr3 d;
    public final mr3 e;
    public xs9 f;
    public ko4 g;
    public jr3 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean z;
    public final sd1 b = new sd1();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public w1c[] o = new w1c[1000];
    public final lp c = new lp(new vr9((byte) 4));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean B = true;
    public boolean A = true;
    public boolean G = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;
    public int y = -1;

    public ys9(rx6 rx6Var, pr3 pr3Var, mr3 mr3Var) {
        this.d = pr3Var;
        this.e = mr3Var;
        this.a = new us9(rx6Var);
    }

    public final synchronized boolean A(boolean z) {
        ko4 ko4Var;
        int v = v();
        int i = this.x;
        boolean z2 = true;
        if (i != -1 && v >= i) {
            return true;
        }
        if (this.s != this.p) {
            if (!(i == -1 && this.y != -1 && v() >= this.y)) {
                if (((ws9) this.c.l(v)).a != this.g) {
                    return true;
                }
                return B(w(this.s));
            }
        }
        if (!z && !this.z && ((ko4Var = this.E) == null || ko4Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean B(int i) {
        jr3 jr3Var = this.h;
        if (jr3Var == null || jr3Var.e() == 4) {
            return true;
        }
        return (this.m[i] & TLObject.FLAG_30) == 0 && this.h.b();
    }

    public final void C() {
        jr3 jr3Var = this.h;
        if (jr3Var == null || jr3Var.e() != 1) {
            return;
        }
        ir3 g = this.h.g();
        g.getClass();
        throw g;
    }

    public final void D(ko4 ko4Var, ym4 ym4Var) {
        hr3 hr3Var;
        boolean z;
        ko4 ko4Var2;
        ko4 ko4Var3 = this.g;
        if (ko4Var3 == null) {
            z = true;
            hr3Var = null;
        } else {
            hr3Var = ko4Var3.x;
            z = false;
        }
        this.g = ko4Var;
        hr3 hr3Var2 = ko4Var.x;
        pr3 pr3Var = this.d;
        if (pr3Var != null) {
            int x = pr3Var.x(ko4Var);
            jo4 a = ko4Var.a();
            a.W = x;
            ko4Var2 = new ko4(a);
        } else {
            ko4Var2 = ko4Var;
        }
        ym4Var.c = ko4Var2;
        ym4Var.b = this.h;
        if (pr3Var != null) {
            if (z || !Objects.equals(hr3Var, hr3Var2)) {
                jr3 jr3Var = this.h;
                mr3 mr3Var = this.e;
                jr3 c = pr3Var.c(mr3Var, ko4Var);
                this.h = c;
                ym4Var.b = c;
                if (jr3Var != null) {
                    jr3Var.c(mr3Var);
                }
            }
        }
    }

    public final synchronized long E() {
        return this.s != this.p ? this.j[w(this.s)] : this.F;
    }

    public final int F(ym4 ym4Var, s93 s93Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        sd1 sd1Var = this.b;
        synchronized (this) {
            s93Var.d = false;
            int v = v();
            int i3 = this.x;
            boolean z3 = i3 != -1 && v >= i3;
            i2 = -5;
            if (this.s != this.p) {
                if (!(i3 == -1 && this.y != -1 && v() >= this.y) && !z3) {
                    ko4 ko4Var = ((ws9) this.c.l(v)).a;
                    if (z2 || ko4Var != this.g) {
                        D(ko4Var, ym4Var);
                    } else {
                        int w = w(this.s);
                        if (B(w)) {
                            s93Var.setFlags(this.m[w]);
                            if (this.s == this.p - 1 && (z || this.z)) {
                                s93Var.addFlag(TLObject.FLAG_29);
                            }
                            s93Var.e = this.n[w];
                            sd1Var.a = this.l[w];
                            sd1Var.b = this.k[w];
                            sd1Var.c = this.o[w];
                            i2 = -4;
                        } else {
                            s93Var.d = true;
                            i2 = -3;
                        }
                    }
                }
            }
            if (z || this.z || z3) {
                s93Var.setFlags(4);
                s93Var.e = Long.MIN_VALUE;
                i2 = -4;
            } else {
                ko4 ko4Var2 = this.E;
                if (ko4Var2 == null || (!z2 && ko4Var2 == this.g)) {
                    i2 = -3;
                } else {
                    D(ko4Var2, ym4Var);
                }
            }
        }
        if (i2 == -4 && !s93Var.isEndOfStream()) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                us9 us9Var = this.a;
                sd1 sd1Var2 = this.b;
                if (z4) {
                    us9.f(us9Var.e, s93Var, sd1Var2, us9Var.c);
                } else {
                    us9Var.e = us9.f(us9Var.e, s93Var, sd1Var2, us9Var.c);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }

    public final void G(boolean z) {
        us9 us9Var = this.a;
        ty0 ty0Var = us9Var.d;
        if (((nj) ty0Var.c) != null) {
            rx6 rx6Var = us9Var.a;
            synchronized (rx6Var) {
                ((ec3) rx6Var.d).c.z(ty0Var);
                ty0 ty0Var2 = ty0Var;
                while (ty0Var2 != null) {
                    nj njVar = (nj) ty0Var2.c;
                    njVar.getClass();
                    rx6Var.h0(njVar);
                    ty0Var2 = (ty0) ty0Var2.d;
                    if (ty0Var2 == null || ((nj) ty0Var2.c) == null) {
                        ty0Var2 = null;
                    }
                }
            }
            ty0Var.c = null;
            ty0Var.d = null;
        }
        ty0 ty0Var3 = us9Var.d;
        int i = us9Var.b;
        yve.p(((nj) ty0Var3.c) == null);
        ty0Var3.a = 0L;
        ty0Var3.b = i;
        ty0 ty0Var4 = us9Var.d;
        us9Var.e = ty0Var4;
        us9Var.f = ty0Var4;
        us9Var.g = 0L;
        us9Var.a.y0();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.y = -1;
        this.A = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.z = false;
        lp lpVar = this.c;
        SparseArray sparseArray = (SparseArray) lpVar.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((vr9) lpVar.d).accept(sparseArray.valueAt(i2));
        }
        lpVar.b = -1;
        sparseArray.clear();
        if (z) {
            this.D = null;
            this.E = null;
            this.B = true;
            this.G = true;
        }
    }

    public final synchronized void H() {
        this.s = 0;
        us9 us9Var = this.a;
        us9Var.e = us9Var.d;
    }

    public final synchronized boolean I(int i) {
        H();
        int i2 = this.q;
        if (i < i2 || i > this.p + i2) {
            return false;
        }
        int i3 = this.x;
        if (i3 != -1 && i >= i3) {
            return false;
        }
        int i4 = this.y;
        if (i4 != -1 && i >= i4) {
            return false;
        }
        this.t = Long.MIN_VALUE;
        this.s = i - i2;
        return true;
    }

    public final synchronized boolean J(long j, boolean z) {
        ys9 ys9Var;
        Throwable th;
        int w;
        long j2;
        ys9 ys9Var2;
        long j3;
        int p;
        try {
            try {
                H();
                w = w(this.s);
                long j4 = this.u;
                j2 = this.w;
                if (j4 != Long.MIN_VALUE) {
                    try {
                        j2 = Math.min(j2, j4);
                    } catch (Throwable th2) {
                        th = th2;
                        ys9Var = this;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
            try {
                int i = this.s;
                int i2 = this.p;
                if ((i != i2) && j >= this.n[w] && (j <= j2 || z)) {
                    if (this.G) {
                        int i3 = i2 - i;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (this.n[w] >= j) {
                                    i3 = i4;
                                    break;
                                }
                                w++;
                                if (w == this.i) {
                                    w = 0;
                                }
                                i4++;
                            } else if (!z) {
                                i3 = -1;
                            }
                        }
                        int i5 = i3;
                        ys9Var2 = this;
                        p = i5;
                        j3 = j;
                    } else {
                        int i6 = i2 - i;
                        ys9Var2 = this;
                        j3 = j;
                        p = ys9Var2.p(w, i6, j3, true);
                    }
                    if (p == -1) {
                        return false;
                    }
                    ys9Var2.t = j3;
                    ys9Var2.s += p;
                    return true;
                }
            } catch (Throwable th4) {
                ys9Var = this;
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            ys9Var = this;
            th = th;
            throw th;
        }
        return false;
    }

    public final synchronized void K(long j) {
        if (j == this.u) {
            return;
        }
        this.u = j;
        this.x = -1;
        this.y = -1;
        if (j != Long.MIN_VALUE && j <= this.w) {
            for (int i = 0; i < this.p; i++) {
                int w = w(i);
                M(this.q + i, this.m[w], this.n[w]);
                if (this.x != -1) {
                    break;
                }
            }
        }
    }

    public final synchronized void L(int i) {
        boolean z;
        if (i >= 0) {
            if (this.s + i <= this.p) {
                z = true;
                yve.f(z);
                this.s += i;
            }
        }
        z = false;
        yve.f(z);
        this.s += i;
    }

    public final void M(int i, int i2, long j) {
        int i3;
        long j2 = this.u;
        if (j2 == Long.MIN_VALUE || this.x != -1) {
            return;
        }
        if (j < j2) {
            this.y = -1;
            return;
        }
        int i4 = this.y;
        if (i4 == -1) {
            this.y = i;
            i4 = i;
        }
        int i5 = (i - i4) + 1;
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & TLObject.FLAG_29) != 0;
        ko4 ko4Var = this.E;
        if (ko4Var == null || (i3 = ko4Var.v) == -1) {
            i3 = 16;
        }
        if (i5 >= i3 + 1 || z || z2) {
            this.x = i4;
            this.y = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // x1c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
        int i4;
        if (this.C) {
            ko4 ko4Var = this.D;
            ko4Var.getClass();
            g(ko4Var);
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.A) {
            if (!z) {
                return;
            } else {
                this.A = false;
            }
        }
        long j2 = this.I + j;
        if (this.G) {
            if (j2 < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.H) {
                    efd.f("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.E);
                    this.H = true;
                }
                i4 = i | 1;
                if (this.J) {
                    if (!z) {
                        return;
                    }
                    synchronized (this) {
                        if (this.p == 0) {
                            r3 = j2 > this.v;
                        } else if (t() >= j2) {
                            r3 = false;
                        } else {
                            n(this.q + i(j2));
                        }
                    }
                    if (!r3) {
                        return;
                    } else {
                        this.J = false;
                    }
                }
                h(j2, i4, (this.a.g - i2) - i3, i2, w1cVar);
            }
        }
        i4 = i;
        if (this.J) {
        }
        h(j2, i4, (this.a.g - i2) - i3, i2, w1cVar);
    }

    @Override // x1c
    public final void b(ey7 ey7Var, int i, int i2) {
        while (i > 0) {
            us9 us9Var = this.a;
            int c = us9Var.c(i);
            ty0 ty0Var = us9Var.f;
            nj njVar = (nj) ty0Var.c;
            ey7Var.k(((int) (us9Var.g - ty0Var.a)) + njVar.b, c, njVar.a);
            i -= c;
            long j = us9Var.g + c;
            us9Var.g = j;
            ty0 ty0Var2 = us9Var.f;
            if (j == ty0Var2.b) {
                us9Var.f = (ty0) ty0Var2.d;
            }
        }
    }

    @Override // x1c
    public final int c(z63 z63Var, int i, boolean z) {
        us9 us9Var = this.a;
        int c = us9Var.c(i);
        ty0 ty0Var = us9Var.f;
        nj njVar = (nj) ty0Var.c;
        int read = z63Var.read(njVar.a, ((int) (us9Var.g - ty0Var.a)) + njVar.b, c);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = us9Var.g + read;
        us9Var.g = j;
        ty0 ty0Var2 = us9Var.f;
        if (j == ty0Var2.b) {
            us9Var.f = (ty0) ty0Var2.d;
        }
        return read;
    }

    @Override // x1c
    public final /* synthetic */ void e(int i, ey7 ey7Var) {
        xnb.b(this, ey7Var, i);
    }

    @Override // x1c
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override // x1c
    public final void g(ko4 ko4Var) {
        ko4 q = q(ko4Var);
        boolean z = false;
        this.C = false;
        this.D = ko4Var;
        synchronized (this) {
            this.B = false;
            if (!Objects.equals(q, this.E)) {
                if (!(((SparseArray) this.c.c).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.c.c;
                    if (((ws9) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(q)) {
                        SparseArray sparseArray2 = (SparseArray) this.c.c;
                        q = ((ws9) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        this.E = q;
                        boolean z2 = this.G;
                        String str = q.t;
                        this.G = z2 & (eg7.h(str) != 1 && eg7.a(str, q.l));
                        this.H = false;
                        z = true;
                    }
                }
                this.E = q;
                boolean z22 = this.G;
                String str2 = q.t;
                this.G = z22 & (eg7.h(str2) != 1 && eg7.a(str2, q.l));
                this.H = false;
                z = true;
            }
        }
        xs9 xs9Var = this.f;
        if (xs9Var == null || !z) {
            return;
        }
        xs9Var.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (((ws9) r9.valueAt(r9.size() - 1)).a.equals(r8.E) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(long j, int i, long j2, int i2, w1c w1cVar) {
        int i3 = this.p;
        if (i3 > 0) {
            int w = w(i3 - 1);
            yve.f(this.k[w] + ((long) this.l[w]) <= j2);
        }
        this.z = (536870912 & i) != 0;
        this.w = Math.max(this.w, j);
        M(z(), i, j);
        int w2 = w(this.p);
        this.n[w2] = j;
        this.k[w2] = j2;
        this.l[w2] = i2;
        this.m[w2] = i;
        this.o[w2] = w1cVar;
        this.j[w2] = this.F;
        if (!(((SparseArray) this.c.c).size() == 0)) {
            SparseArray sparseArray = (SparseArray) this.c.c;
        }
        ko4 ko4Var = this.E;
        ko4Var.getClass();
        pr3 pr3Var = this.d;
        or3 f = pr3Var != null ? pr3Var.f(this.e, ko4Var) : or3.t;
        lp lpVar = this.c;
        int z = z();
        ws9 ws9Var = new ws9(ko4Var, f);
        SparseArray sparseArray2 = (SparseArray) lpVar.c;
        if (lpVar.b == -1) {
            yve.p(sparseArray2.size() == 0);
            lpVar.b = 0;
        }
        if (sparseArray2.size() > 0) {
            int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
            yve.f(z >= keyAt);
            if (keyAt == z) {
                ((vr9) lpVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        sparseArray2.append(z, ws9Var);
        int i4 = this.p + 1;
        this.p = i4;
        int i5 = this.i;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            w1c[] w1cVarArr = new w1c[i6];
            int i7 = this.r;
            int i8 = i5 - i7;
            System.arraycopy(this.k, i7, jArr2, 0, i8);
            System.arraycopy(this.n, this.r, jArr3, 0, i8);
            System.arraycopy(this.m, this.r, iArr, 0, i8);
            System.arraycopy(this.l, this.r, iArr2, 0, i8);
            System.arraycopy(this.o, this.r, w1cVarArr, 0, i8);
            System.arraycopy(this.j, this.r, jArr, 0, i8);
            int i9 = this.r;
            System.arraycopy(this.k, 0, jArr2, i8, i9);
            System.arraycopy(this.n, 0, jArr3, i8, i9);
            System.arraycopy(this.m, 0, iArr, i8, i9);
            System.arraycopy(this.l, 0, iArr2, i8, i9);
            System.arraycopy(this.o, 0, w1cVarArr, i8, i9);
            System.arraycopy(this.j, 0, jArr, i8, i9);
            this.k = jArr2;
            this.n = jArr3;
            this.m = iArr;
            this.l = iArr2;
            this.o = w1cVarArr;
            this.j = jArr;
            this.r = 0;
            this.i = i6;
        }
    }

    public final int i(long j) {
        int i = this.p;
        int w = w(i - 1);
        while (i > this.s && this.n[w] >= j) {
            i--;
            w--;
            if (w == -1) {
                w = this.i - 1;
            }
        }
        return i;
    }

    public final long j(int i) {
        this.v = Math.max(this.v, u(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        lp lpVar = this.c;
        SparseArray sparseArray = (SparseArray) lpVar.c;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((vr9) lpVar.d).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = lpVar.b;
            if (i8 > 0) {
                lpVar.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        return this.k[i9 - 1] + this.l[r7];
    }

    public final void k(long j, boolean z) {
        Throwable th;
        ys9 ys9Var;
        long j2;
        us9 us9Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    j2 = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    ys9Var = this;
                                    throw th;
                                }
                            }
                            int p = p(i2, i, j, false);
                            if (p != -1) {
                                j2 = j(p);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ys9Var = this;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        us9Var.b(j2);
    }

    public final void l() {
        long j;
        us9 us9Var = this.a;
        synchronized (this) {
            int i = this.p;
            j = i == 0 ? -1L : j(i);
        }
        us9Var.b(j);
    }

    public final void m(long j) {
        if (this.p == 0) {
            return;
        }
        yve.f(j > t());
        o(this.q + i(j));
    }

    public final long n(int i) {
        int z = z() - i;
        boolean z2 = false;
        yve.f(z >= 0 && z <= this.p - this.s);
        int i2 = this.p - z;
        this.p = i2;
        this.w = Math.max(this.v, u(i2));
        if (z == 0 && this.z) {
            z2 = true;
        }
        this.z = z2;
        int i3 = this.x;
        if (i3 != -1 && i < i3) {
            this.x = -1;
        }
        int i4 = this.y;
        if (i4 != -1 && i < i4) {
            this.y = -1;
        }
        lp lpVar = this.c;
        SparseArray sparseArray = (SparseArray) lpVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((vr9) lpVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        lpVar.b = sparseArray.size() > 0 ? Math.min(lpVar.b, sparseArray.size() - 1) : -1;
        int i5 = this.p;
        if (i5 == 0) {
            return 0L;
        }
        return this.k[w(i5 - 1)] + this.l[r9];
    }

    public final void o(int i) {
        ty0 ty0Var;
        us9 us9Var = this.a;
        long n = n(i);
        int i2 = us9Var.b;
        yve.f(n <= us9Var.g);
        us9Var.g = n;
        if (n != 0) {
            ty0 ty0Var2 = us9Var.d;
            if (n != ty0Var2.a) {
                while (true) {
                    long j = us9Var.g;
                    long j2 = ty0Var2.b;
                    ty0Var = (ty0) ty0Var2.d;
                    if (j <= j2) {
                        break;
                    } else {
                        ty0Var2 = ty0Var;
                    }
                }
                ty0Var.getClass();
                if (((nj) ty0Var.c) != null) {
                    rx6 rx6Var = us9Var.a;
                    synchronized (rx6Var) {
                        ((ec3) rx6Var.d).c.z(ty0Var);
                        ty0 ty0Var3 = ty0Var;
                        while (ty0Var3 != null) {
                            nj njVar = (nj) ty0Var3.c;
                            njVar.getClass();
                            rx6Var.h0(njVar);
                            ty0Var3 = (ty0) ty0Var3.d;
                            if (ty0Var3 == null || ((nj) ty0Var3.c) == null) {
                                ty0Var3 = null;
                            }
                        }
                    }
                    ty0Var.c = null;
                    ty0Var.d = null;
                }
                ty0 ty0Var4 = new ty0(ty0Var2.b, i2);
                ty0Var2.d = ty0Var4;
                if (us9Var.g == ty0Var2.b) {
                    ty0Var2 = ty0Var4;
                }
                us9Var.f = ty0Var2;
                if (us9Var.e == ty0Var) {
                    us9Var.e = ty0Var4;
                    return;
                }
                return;
            }
        }
        us9Var.a(us9Var.d);
        ty0 ty0Var5 = new ty0(us9Var.g, i2);
        us9Var.d = ty0Var5;
        us9Var.e = ty0Var5;
        us9Var.f = ty0Var5;
    }

    public final int p(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public ko4 q(ko4 ko4Var) {
        if (this.I == 0 || ko4Var.y == Long.MAX_VALUE) {
            return ko4Var;
        }
        jo4 a = ko4Var.a();
        a.x = ko4Var.y + this.I;
        return new ko4(a);
    }

    public final synchronized long r() {
        return this.p == 0 ? Long.MIN_VALUE : this.n[this.r];
    }

    public final synchronized long s() {
        return this.w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.s));
    }

    public final long u(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int w = w(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[w]);
            if ((this.m[w] & 1) != 0) {
                return j;
            }
            w--;
            if (w == -1) {
                w = this.i - 1;
            }
        }
        return j;
    }

    public final int v() {
        return this.q + this.s;
    }

    public final int w(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int x(long j, boolean z) {
        try {
            try {
                int w = w(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[w]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int p = p(w, i2 - i, j, true);
                if (p == -1) {
                    return 0;
                }
                return p;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized ko4 y() {
        return this.B ? null : this.E;
    }

    public final int z() {
        return this.q + this.p;
    }

    @Override // x1c
    public final void d(long j) {
    }
}
