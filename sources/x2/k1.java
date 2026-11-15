package x2;

import a8.xa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k1 implements d0, b3.j {
    public int E;
    public final j2.m a;
    public final j2.g b;
    public final j2.c0 c;
    public final qb.a d;
    public final xa e;
    public final q1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final b3.o r;
    public final e2.u s;
    public final boolean w;
    public boolean x;
    public byte[] y;

    public k1(j2.m mVar, j2.g gVar, j2.c0 c0Var, e2.u uVar, long j3, qb.a aVar, xa xaVar, boolean z10, c3.a aVar2) {
        this.a = mVar;
        this.b = gVar;
        this.c = c0Var;
        this.s = uVar;
        this.n = j3;
        this.d = aVar;
        this.e = xaVar;
        this.w = z10;
        this.f = new q1(new e2.m1("", uVar));
        this.r = aVar2 != null ? new b3.o(aVar2) : new b3.o("SingleSampleMediaPeriod");
    }

    @Override // x2.d0
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            b1 b1Var = b1VarArr[i7];
            ArrayList arrayList = this.h;
            if (b1Var != null && (uVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(b1Var);
                b1VarArr[i7] = null;
            }
            if (b1VarArr[i7] == null && uVarArr[i7] != null) {
                i1 i1Var = new i1(this);
                arrayList.add(i1Var);
                b1VarArr[i7] = i1Var;
                zArr2[i7] = true;
            }
        }
        return j3;
    }

    @Override // x2.d1
    public final boolean c(l2.s0 s0Var) {
        if (this.x) {
            return false;
        }
        b3.o oVar = this.r;
        if (oVar.d() || oVar.c()) {
            return false;
        }
        j2.h createDataSource = this.b.createDataSource();
        j2.c0 c0Var = this.c;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        j1 j1Var = new j1(createDataSource, this.a);
        this.d.getClass();
        oVar.f(j1Var, this, 3);
        return true;
    }

    @Override // x2.d1
    public final long e() {
        return (this.x || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // x2.d1
    public final boolean g() {
        return this.r.d();
    }

    @Override // x2.d0
    public final long j(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return j3;
            }
            i1 i1Var = (i1) arrayList.get(i7);
            if (i1Var.a == 2) {
                i1Var.a = 1;
            }
            i7++;
        }
    }

    @Override // b3.j
    public final b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        IOException iOException2;
        b3.i iVar;
        j1 j1Var = (j1) lVar;
        j2.b0 b0Var = j1Var.b;
        t tVar = new t(j1Var.a, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        String str = h2.l0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
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
            iVar = b3.o.e;
        } else {
            iOException2 = iOException;
            iVar = min != -9223372036854775807L ? new b3.i(0, min, false) : b3.o.f;
        }
        this.e.p(tVar, 1, -1, this.s, 0, null, 0L, this.n, iOException2, !iVar.a());
        return iVar;
    }

    @Override // b3.j
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        j1 j1Var = (j1) lVar;
        j2.b0 b0Var = j1Var.b;
        t tVar = new t(j1Var.a, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.d.getClass();
        this.e.n(tVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // x2.d0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // x2.d0
    public final q1 p() {
        return this.f;
    }

    @Override // b3.j
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        j1 j1Var = (j1) lVar;
        j2.b0 b0Var = j1Var.b;
        this.e.s(i7 == 0 ? new t(j1Var.a, j3) : new t(j1Var.a, b0Var.c, b0Var.d, j3, j10, b0Var.b), 1, -1, this.s, 0, null, 0L, this.n, i7);
    }

    @Override // x2.d1
    public final long s() {
        return this.x ? Long.MIN_VALUE : 0L;
    }

    @Override // x2.d0
    public final void t(c0 c0Var, long j3) {
        c0Var.k(this);
    }

    @Override // b3.j
    public final void w(b3.l lVar, long j3, long j10) {
        j1 j1Var = (j1) lVar;
        this.E = (int) j1Var.b.b;
        byte[] bArr = j1Var.c;
        bArr.getClass();
        this.y = bArr;
        this.x = true;
        j2.b0 b0Var = j1Var.b;
        t tVar = new t(j1Var.a, b0Var.c, b0Var.d, j3, j10, this.E);
        this.d.getClass();
        this.e.o(tVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // x2.d0
    public final void i() {
    }

    @Override // x2.d0
    public final void l(long j3) {
    }

    @Override // x2.d1
    public final void u(long j3) {
    }

    @Override // x2.d0
    public final long h(long j3, l2.p1 p1Var) {
        return j3;
    }
}
