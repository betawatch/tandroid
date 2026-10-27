package u2;

import a8.ng;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m1 implements e0, y2.g {
    public final g2.m a;
    public final g2.g b;
    public final g2.c0 c;
    public final u7.s d;
    public final ng e;
    public final r1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final y2.l r;
    public final b2.x s;
    public final boolean v;
    public boolean w;
    public byte[] x;
    public int y;

    public m1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.x xVar, long j10, u7.s sVar, ng ngVar, boolean z10, z2.a aVar) {
        this.a = mVar;
        this.b = gVar;
        this.c = c0Var;
        this.s = xVar;
        this.n = j10;
        this.d = sVar;
        this.e = ngVar;
        this.v = z10;
        this.f = new r1(new b2.q1("", xVar));
        this.r = aVar != null ? new y2.l(aVar) : new y2.l("SingleSampleMediaPeriod");
    }

    @Override // y2.g
    public final void B(y2.i iVar, long j10, long j11) {
        l1 l1Var = (l1) iVar;
        this.y = (int) l1Var.b.b;
        byte[] bArr = l1Var.c;
        bArr.getClass();
        this.x = bArr;
        this.w = true;
        g2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j10, j11, this.y);
        this.d.getClass();
        this.e.q(uVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // u2.f1
    public final long b() {
        return (this.w || this.r.c()) ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.f1
    public final boolean c() {
        return this.r.c();
    }

    @Override // u2.e0
    public final long h(long j10) {
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
    public final void k(d0 d0Var, long j10) {
        d0Var.n(this);
    }

    @Override // u2.e0
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // y2.g
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // u2.f1
    public final boolean m(i2.w0 w0Var) {
        if (this.w) {
            return false;
        }
        y2.l lVar = this.r;
        if (lVar.c() || lVar.b()) {
            return false;
        }
        g2.h createDataSource = this.b.createDataSource();
        g2.c0 c0Var = this.c;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        l1 l1Var = new l1(createDataSource, this.a);
        this.d.getClass();
        lVar.f(l1Var, this, 3);
        return true;
    }

    @Override // u2.e0
    public final long o(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
    public final r1 p() {
        return this.f;
    }

    @Override // u2.f1
    public final long q() {
        return this.w ? Long.MIN_VALUE : 0L;
    }

    @Override // y2.g
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        IOException iOException2;
        k4.d dVar;
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        String str = e2.n0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
        boolean z10 = min == -9223372036854775807L || i10 >= 3;
        if (this.v && z10) {
            iOException2 = iOException;
            e2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.w = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            dVar = min != -9223372036854775807L ? new k4.d(0, min, false) : y2.l.f;
        }
        this.e.r(uVar, 1, -1, this.s, 0, null, 0L, this.n, iOException2, !dVar.a());
        return dVar;
    }

    @Override // y2.g
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.b;
        this.e.u(i10 == 0 ? new u(l1Var.a, j10) : new u(l1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b), 1, -1, this.s, 0, null, 0L, this.n, i10);
    }

    @Override // u2.e0
    public final void g() {
    }

    @Override // u2.e0
    public final void i(long j10) {
    }

    @Override // u2.f1
    public final void s(long j10) {
    }

    @Override // u2.e0
    public final long r(long j10, i2.t1 t1Var) {
        return j10;
    }
}
