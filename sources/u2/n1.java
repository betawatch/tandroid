package u2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class n1 implements e0, y2.g {
    public final g2.m a;
    public final g2.g b;
    public final g2.c0 c;
    public final oa.d d;
    public final a5.a e;
    public final s1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final y2.l r;
    public final b2.w s;
    public final boolean v;
    public boolean w;
    public byte[] x;
    public int y;

    public n1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.w wVar, long j10, oa.d dVar, a5.a aVar, boolean z10, z2.a aVar2) {
        this.a = mVar;
        this.b = gVar;
        this.c = c0Var;
        this.s = wVar;
        this.n = j10;
        this.d = dVar;
        this.e = aVar;
        this.v = z10;
        this.f = new s1(new b2.p1("", wVar));
        this.r = aVar2 != null ? new y2.l(aVar2) : new y2.l("SingleSampleMediaPeriod");
    }

    @Override // y2.g
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        m1 m1Var = (m1) iVar;
        g2.b0 b0Var = m1Var.b;
        u uVar = new u(m1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // u2.g1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.g1
    public final long d() {
        return (this.w || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.e0
    public final long i(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return j10;
            }
            l1 l1Var = (l1) arrayList.get(i10);
            if (l1Var.a == 2) {
                l1Var.a = 1;
            }
            i10++;
        }
    }

    @Override // y2.g
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        IOException iOException2;
        k4.d dVar;
        m1 m1Var = (m1) iVar;
        g2.b0 b0Var = m1Var.b;
        u uVar = new u(m1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        String str = e2.m0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
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
        this.e.s(uVar, 1, -1, this.s, 0, null, 0L, this.n, iOException2, !dVar.a());
        return dVar;
    }

    @Override // y2.g
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        m1 m1Var = (m1) iVar;
        g2.b0 b0Var = m1Var.b;
        this.e.v(i10 == 0 ? new u(m1Var.a, j10) : new u(m1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b), 1, -1, this.s, 0, null, 0L, this.n, i10);
    }

    @Override // u2.e0
    public final void m(d0 d0Var, long j10) {
        d0Var.h(this);
    }

    @Override // y2.g
    public final void n(y2.i iVar, long j10, long j11) {
        m1 m1Var = (m1) iVar;
        this.y = (int) m1Var.b.b;
        byte[] bArr = m1Var.c;
        bArr.getClass();
        this.x = bArr;
        this.w = true;
        g2.b0 b0Var = m1Var.b;
        u uVar = new u(m1Var.a, b0Var.c, b0Var.d, j10, j11, this.y);
        this.d.getClass();
        this.e.r(uVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // u2.e0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // u2.g1
    public final boolean p(i2.u0 u0Var) {
        if (this.w) {
            return false;
        }
        y2.l lVar = this.r;
        if (lVar.d() || lVar.c()) {
            return false;
        }
        g2.h createDataSource = this.b.createDataSource();
        g2.c0 c0Var = this.c;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        m1 m1Var = new m1(createDataSource, this.a);
        this.d.getClass();
        lVar.f(m1Var, this, 3);
        return true;
    }

    @Override // u2.e0
    public final long q(x2.p[] pVarArr, boolean[] zArr, e1[] e1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            e1 e1Var = e1VarArr[i10];
            ArrayList arrayList = this.h;
            if (e1Var != null && (pVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(e1Var);
                e1VarArr[i10] = null;
            }
            if (e1VarArr[i10] == null && pVarArr[i10] != null) {
                l1 l1Var = new l1(this);
                arrayList.add(l1Var);
                e1VarArr[i10] = l1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // u2.e0
    public final s1 r() {
        return this.f;
    }

    @Override // u2.g1
    public final long s() {
        return this.w ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.e0
    public final void g() {
    }

    @Override // u2.e0
    public final void k(long j10) {
    }

    @Override // u2.g1
    public final void u(long j10) {
    }

    @Override // u2.e0
    public final long t(long j10, i2.r1 r1Var) {
        return j10;
    }
}
