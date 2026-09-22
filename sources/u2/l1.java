package u2;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class l1 implements d0, y2.h {
    public final g2.m a;
    public final g2.g b;
    public final g2.c0 c;
    public final qb.b d;
    public final a5.a e;
    public final p1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final y2.m r;
    public final b2.s s;
    public final boolean v;
    public boolean w;
    public byte[] x;
    public int y;

    public l1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, qb.b bVar, a5.a aVar, boolean z10, z2.a aVar2) {
        this.a = mVar;
        this.b = gVar;
        this.c = c0Var;
        this.s = sVar;
        this.n = j3;
        this.d = bVar;
        this.e = aVar;
        this.v = z10;
        this.f = new p1(new b2.l1("", sVar));
        this.r = aVar2 != null ? new y2.m(aVar2) : new y2.m("SingleSampleMediaPeriod");
    }

    @Override // y2.h
    public final void S(y2.j jVar, long j3, long j10, boolean z10) {
        Uri uri = ((k1) jVar).b.c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // u2.e1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.e1
    public final long d() {
        return (this.w || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.d0
    public final long h(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return j3;
            }
            j1 j1Var = (j1) arrayList.get(i10);
            if (j1Var.a == 2) {
                j1Var.a = 1;
            }
            i10++;
        }
    }

    @Override // u2.d0
    public final void k(c0 c0Var, long j3) {
        c0Var.a(this);
    }

    @Override // u2.d0
    public final long m() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    @Override // y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        k4.d dVar;
        Uri uri = ((k1) jVar).b.c;
        t tVar = new t(j10);
        String str = e2.d0.a;
        this.d.getClass();
        if (!(iOException instanceof b2.s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.l)) {
            int i11 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            boolean z10 = j11 != -9223372036854775807L || i10 >= 3;
            if (this.v || !z10) {
                dVar = j11 == -9223372036854775807L ? new k4.d(0, j11, false) : y2.m.f;
            } else {
                e2.a.o("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
                this.w = true;
                dVar = y2.m.e;
            }
            k4.d dVar2 = dVar;
            this.e.q(tVar, 1, -1, this.s, 0, null, 0L, this.n, iOException, !dVar2.a());
            return dVar2;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        if (this.v) {
        }
        if (j11 == -9223372036854775807L) {
        }
        k4.d dVar22 = dVar;
        this.e.q(tVar, 1, -1, this.s, 0, null, 0L, this.n, iOException, !dVar22.a());
        return dVar22;
    }

    @Override // y2.h
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        k1 k1Var = (k1) jVar;
        g2.b0 b0Var = k1Var.b;
        if (i10 == 0) {
            tVar = new t(k1Var.a);
        } else {
            Uri uri = b0Var.c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, this.s, 0, null, 0L, this.n, i10);
    }

    @Override // y2.h
    public final void p(y2.j jVar, long j3, long j10) {
        k1 k1Var = (k1) jVar;
        this.y = (int) k1Var.b.b;
        byte[] bArr = k1Var.c;
        bArr.getClass();
        this.x = bArr;
        this.w = true;
        Uri uri = k1Var.b.c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // u2.e1
    public final boolean q(i2.r0 r0Var) {
        if (this.w) {
            return false;
        }
        y2.m mVar = this.r;
        if (mVar.d() || mVar.c()) {
            return false;
        }
        g2.h createDataSource = this.b.createDataSource();
        g2.c0 c0Var = this.c;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        k1 k1Var = new k1(createDataSource, this.a);
        this.d.getClass();
        mVar.f(k1Var, this, 3);
        return true;
    }

    @Override // u2.d0
    public final long r(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            c1 c1Var = c1VarArr[i10];
            ArrayList arrayList = this.h;
            if (c1Var != null && (sVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(c1Var);
                c1VarArr[i10] = null;
            }
            if (c1VarArr[i10] == null && sVarArr[i10] != null) {
                j1 j1Var = new j1(this);
                arrayList.add(j1Var);
                c1VarArr[i10] = j1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override // u2.d0
    public final p1 s() {
        return this.f;
    }

    @Override // u2.e1
    public final long t() {
        return this.w ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.d0
    public final void g() {
    }

    @Override // u2.d0
    public final void i(long j3) {
    }

    @Override // u2.e1
    public final void v(long j3) {
    }

    @Override // u2.d0
    public final long u(long j3, i2.p1 p1Var) {
        return j3;
    }
}
