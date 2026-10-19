package u2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class m1 implements e0, y2.g {
    public final g2.m a;
    public final g2.g b;
    public final g2.c0 c;
    public final oa.d d;
    public final a5.a e;
    public final r1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final y2.l r;
    public final b2.w s;
    public final boolean v;
    public boolean w;
    public byte[] x;
    public int y;

    public m1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.w wVar, long j10, oa.d dVar, a5.a aVar, boolean z10, z2.a aVar2) {
        this.a = mVar;
        this.b = gVar;
        this.c = c0Var;
        this.s = wVar;
        this.n = j10;
        this.d = dVar;
        this.e = aVar;
        this.v = z10;
        this.f = new r1(new b2.p1("", wVar));
        this.r = aVar2 != null ? new y2.l(aVar2) : new y2.l("SingleSampleMediaPeriod");
    }

    @Override // y2.g
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // u2.f1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.f1
    public final long d() {
        return (this.w || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // y2.g
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        IOException iOException2;
        k4.d dVar;
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b);
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
    public final void h(y2.i iVar, long j10, long j11, int i10) {
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.b;
        this.e.v(i10 == 0 ? new u(l1Var.a, j10) : new u(l1Var.a, b0Var.c, b0Var.d, j10, j11, b0Var.b), 1, -1, this.s, 0, null, 0L, this.n, i10);
    }

    @Override // u2.e0
    public final long j(long j10) {
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

    @Override // y2.g
    public final void k(y2.i iVar, long j10, long j11) {
        l1 l1Var = (l1) iVar;
        this.y = (int) l1Var.b.b;
        byte[] bArr = l1Var.c;
        bArr.getClass();
        this.x = bArr;
        this.w = true;
        g2.b0 b0Var = l1Var.b;
        u uVar = new u(l1Var.a, b0Var.c, b0Var.d, j10, j11, this.y);
        this.d.getClass();
        this.e.r(uVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // u2.e0
    public final void n(d0 d0Var, long j10) {
        d0Var.a(this);
    }

    @Override // u2.e0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // u2.f1
    public final boolean p(i2.v0 v0Var) {
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
        l1 l1Var = new l1(createDataSource, this.a);
        this.d.getClass();
        lVar.f(l1Var, this, 3);
        return true;
    }

    @Override // u2.e0
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            ArrayList arrayList = this.h;
            if (d1Var != null && (pVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(d1Var);
                d1VarArr[i10] = null;
            }
            if (d1VarArr[i10] == null && pVarArr[i10] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i10] = k1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // u2.e0
    public final r1 r() {
        return this.f;
    }

    @Override // u2.f1
    public final long s() {
        return this.w ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.e0
    public final void i() {
    }

    @Override // u2.e0
    public final void l(long j10) {
    }

    @Override // u2.f1
    public final void u(long j10) {
    }

    @Override // u2.e0
    public final long t(long j10, i2.s1 s1Var) {
        return j10;
    }
}
