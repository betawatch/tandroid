package u2;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class k1 implements d0, y2.h {
    public final g2.m a;
    public final g2.g b;
    public final g2.c0 c;
    public final rb.a d;
    public final a5.a e;
    public final o1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final y2.m r;
    public final b2.s s;
    public final boolean v;
    public boolean w;
    public byte[] x;
    public int y;

    public k1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, rb.a aVar, a5.a aVar2, boolean z10, z2.a aVar3) {
        this.a = mVar;
        this.b = gVar;
        this.c = c0Var;
        this.s = sVar;
        this.n = j3;
        this.d = aVar;
        this.e = aVar2;
        this.v = z10;
        this.f = new o1(new b2.l1("", sVar));
        this.r = aVar3 != null ? new y2.m(aVar3) : new y2.m("SingleSampleMediaPeriod");
    }

    @Override // u2.d1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.d1
    public final long d() {
        return (this.w || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    @Override // y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d g(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        k4.d dVar;
        Uri uri = ((j1) jVar).b.c;
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
            this.e.p(tVar, 1, -1, this.s, 0, null, 0L, this.n, iOException, !dVar2.a());
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
        this.e.p(tVar, 1, -1, this.s, 0, null, 0L, this.n, iOException, !dVar22.a());
        return dVar22;
    }

    @Override // y2.h
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        j1 j1Var = (j1) jVar;
        g2.b0 b0Var = j1Var.b;
        if (i10 == 0) {
            tVar = new t(j1Var.a);
        } else {
            Uri uri = b0Var.c;
            tVar = new t(j10);
        }
        this.e.r(tVar, 1, -1, this.s, 0, null, 0L, this.n, i10);
    }

    @Override // y2.h
    public final void i(y2.j jVar, long j3, long j10) {
        j1 j1Var = (j1) jVar;
        this.y = (int) j1Var.b.b;
        byte[] bArr = j1Var.c;
        bArr.getClass();
        this.x = bArr;
        this.w = true;
        Uri uri = j1Var.b.c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // u2.d0
    public final long k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return j3;
            }
            i1 i1Var = (i1) arrayList.get(i10);
            if (i1Var.a == 2) {
                i1Var.a = 1;
            }
            i10++;
        }
    }

    @Override // u2.d0
    public final void n(c0 c0Var, long j3) {
        c0Var.a(this);
    }

    @Override // u2.d0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // u2.d1
    public final boolean p(i2.r0 r0Var) {
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
        j1 j1Var = new j1(createDataSource, this.a);
        this.d.getClass();
        mVar.f(j1Var, this, 3);
        return true;
    }

    @Override // u2.d0
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            b1 b1Var = b1VarArr[i10];
            ArrayList arrayList = this.h;
            if (b1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(b1Var);
                b1VarArr[i10] = null;
            }
            if (b1VarArr[i10] == null && rVarArr[i10] != null) {
                i1 i1Var = new i1(this);
                arrayList.add(i1Var);
                b1VarArr[i10] = i1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override // u2.d0
    public final o1 r() {
        return this.f;
    }

    @Override // u2.d1
    public final long s() {
        return this.w ? Long.MIN_VALUE : 0L;
    }

    @Override // y2.h
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        Uri uri = ((j1) jVar).b.c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.n(tVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // u2.d0
    public final void j() {
    }

    @Override // u2.d0
    public final void l(long j3) {
    }

    @Override // u2.d1
    public final void u(long j3) {
    }

    @Override // u2.d0
    public final long t(long j3, i2.p1 p1Var) {
        return j3;
    }
}
