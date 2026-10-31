package u2;

import i2.v1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m1 implements e0, y2.g {
    public int D;
    public final g2.n a;
    public final g2.g b;
    public final g2.d0 c;
    public final hb.a d;
    public final a5.a e;
    public final r1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final y2.l r;
    public final b2.x s;
    public final boolean w;
    public boolean x;
    public byte[] y;

    public m1(g2.n nVar, g2.g gVar, g2.d0 d0Var, b2.x xVar, long j10, hb.a aVar, a5.a aVar2, boolean z10, z2.a aVar3) {
        this.a = nVar;
        this.b = gVar;
        this.c = d0Var;
        this.s = xVar;
        this.n = j10;
        this.d = aVar;
        this.e = aVar2;
        this.w = z10;
        this.f = new r1(new b2.p1("", xVar));
        this.r = aVar3 != null ? new y2.l(aVar3) : new y2.l("SingleSampleMediaPeriod");
    }

    @Override // y2.g
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) iVar;
        g2.c0 c0Var = l1Var.b;
        u uVar = new u(l1Var.a, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // u2.f1
    public final long c() {
        return (this.x || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.f1
    public final boolean d() {
        return this.r.d();
    }

    @Override // u2.e0
    public final long g(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return j10;
            }
            k1 k1Var = (k1) arrayList.get(i10);
            if (k1Var.a == 2) {
                k1Var.a = 1;
            }
            i10++;
        }
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j10) {
        d0Var.e(this);
    }

    @Override // u2.e0
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // y2.g
    public final k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        IOException iOException2;
        k4.d dVar;
        l1 l1Var = (l1) iVar;
        g2.c0 c0Var = l1Var.b;
        u uVar = new u(l1Var.a, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        String str = e2.l0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.v) || (th2 instanceof y2.k) || ((th2 instanceof g2.k) && ((g2.k) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        boolean z10 = min == -9223372036854775807L || i10 >= 3;
        if (this.w && z10) {
            iOException2 = iOException;
            e2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.x = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            dVar = min != -9223372036854775807L ? new k4.d(0, min, false) : y2.l.f;
        }
        this.e.r(uVar, 1, -1, this.s, 0, null, 0L, this.n, iOException2, !dVar.a());
        return dVar;
    }

    @Override // u2.f1
    public final boolean m(i2.w0 w0Var) {
        if (this.x) {
            return false;
        }
        y2.l lVar = this.r;
        if (lVar.d() || lVar.c()) {
            return false;
        }
        g2.h createDataSource = this.b.createDataSource();
        g2.d0 d0Var = this.c;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        l1 l1Var = new l1(createDataSource, this.a);
        this.d.getClass();
        lVar.f(l1Var, this, 3);
        return true;
    }

    @Override // y2.g
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        l1 l1Var = (l1) iVar;
        g2.c0 c0Var = l1Var.b;
        this.e.u(i10 == 0 ? new u(l1Var.a, j10) : new u(l1Var.a, c0Var.c, c0Var.d, j10, j11, c0Var.b), 1, -1, this.s, 0, null, 0L, this.n, i10);
    }

    @Override // y2.g
    public final void o(y2.i iVar, long j10, long j11) {
        l1 l1Var = (l1) iVar;
        this.D = (int) l1Var.b.b;
        byte[] bArr = l1Var.c;
        bArr.getClass();
        this.y = bArr;
        this.x = true;
        g2.c0 c0Var = l1Var.b;
        u uVar = new u(l1Var.a, c0Var.c, c0Var.d, j10, j11, this.D);
        this.d.getClass();
        this.e.q(uVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // u2.e0
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            ArrayList arrayList = this.h;
            if (d1Var != null && (qVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(d1Var);
                d1VarArr[i10] = null;
            }
            if (d1VarArr[i10] == null && qVarArr[i10] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i10] = k1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // u2.e0
    public final r1 q() {
        return this.f;
    }

    @Override // u2.f1
    public final long s() {
        return this.x ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.e0
    public final void f() {
    }

    @Override // u2.e0
    public final void h(long j10) {
    }

    @Override // u2.f1
    public final void u(long j10) {
    }

    @Override // u2.e0
    public final long t(long j10, v1 v1Var) {
        return j10;
    }
}
