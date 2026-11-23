package x2;

import a8.xa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class m1 implements e0, b3.k {
    public int E;
    public final j2.m a;
    public final j2.g b;
    public final j2.c0 c;
    public final qb.a d;
    public final xa e;
    public final r1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final b3.p r;
    public final e2.u s;
    public final boolean w;
    public boolean x;
    public byte[] y;

    public m1(j2.m mVar, j2.g gVar, j2.c0 c0Var, e2.u uVar, long j3, qb.a aVar, xa xaVar, boolean z10, c3.a aVar2) {
        this.a = mVar;
        this.b = gVar;
        this.c = c0Var;
        this.s = uVar;
        this.n = j3;
        this.d = aVar;
        this.e = xaVar;
        this.w = z10;
        this.f = new r1(new e2.m1("", uVar));
        this.r = aVar2 != null ? new b3.p(aVar2) : new b3.p("SingleSampleMediaPeriod");
    }

    @Override // x2.e0
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            d1 d1Var = d1VarArr[i7];
            ArrayList arrayList = this.h;
            if (d1Var != null && (uVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(d1Var);
                d1VarArr[i7] = null;
            }
            if (d1VarArr[i7] == null && uVarArr[i7] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i7] = k1Var;
                zArr2[i7] = true;
            }
        }
        return j3;
    }

    @Override // x2.f1
    public final boolean c(l2.s0 s0Var) {
        if (this.x) {
            return false;
        }
        b3.p pVar = this.r;
        if (pVar.d() || pVar.c()) {
            return false;
        }
        j2.h createDataSource = this.b.createDataSource();
        j2.c0 c0Var = this.c;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        l1 l1Var = new l1(createDataSource, this.a);
        this.d.getClass();
        pVar.f(l1Var, this, 3);
        return true;
    }

    @Override // x2.f1
    public final long e() {
        return (this.x || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // x2.f1
    public final boolean g() {
        return this.r.d();
    }

    @Override // x2.e0
    public final long k(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return j3;
            }
            k1 k1Var = (k1) arrayList.get(i7);
            if (k1Var.a == 2) {
                k1Var.a = 1;
            }
            i7++;
        }
    }

    @Override // b3.k
    public final b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        IOException iOException2;
        b3.i iVar;
        l1 l1Var = (l1) mVar;
        j2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        String str = h2.l0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        boolean z10 = min == -9223372036854775807L || i7 >= 3;
        if (this.w && z10) {
            iOException2 = iOException;
            h2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.x = true;
            iVar = b3.p.e;
        } else {
            iOException2 = iOException;
            iVar = min != -9223372036854775807L ? new b3.i(0, min, false) : b3.p.f;
        }
        this.e.q(uVar, 1, -1, this.s, 0, null, 0L, this.n, iOException2, !iVar.a());
        return iVar;
    }

    @Override // x2.e0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // b3.k
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        l1 l1Var = (l1) mVar;
        j2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.d.getClass();
        this.e.o(uVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // x2.e0
    public final r1 q() {
        return this.f;
    }

    @Override // x2.f1
    public final long r() {
        return this.x ? Long.MIN_VALUE : 0L;
    }

    @Override // b3.k
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        l1 l1Var = (l1) mVar;
        j2.b0 b0Var = l1Var.b;
        this.e.u(i7 == 0 ? new u(l1Var.a, j3) : new u(l1Var.a, b0Var.c, b0Var.d, j3, j10, b0Var.b), 1, -1, this.s, 0, null, 0L, this.n, i7);
    }

    @Override // x2.e0
    public final void t(d0 d0Var, long j3) {
        d0Var.m(this);
    }

    @Override // b3.k
    public final void z(b3.m mVar, long j3, long j10) {
        l1 l1Var = (l1) mVar;
        this.E = (int) l1Var.b.b;
        byte[] bArr = l1Var.c;
        bArr.getClass();
        this.y = bArr;
        this.x = true;
        j2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j3, j10, this.E);
        this.d.getClass();
        this.e.p(uVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // x2.e0
    public final void i() {
    }

    @Override // x2.e0
    public final void n(long j3) {
    }

    @Override // x2.f1
    public final void u(long j3) {
    }

    @Override // x2.e0
    public final long f(long j3, l2.p1 p1Var) {
        return j3;
    }
}
