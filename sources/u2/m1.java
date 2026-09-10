package u2;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m1 implements e0, y2.i {
    public final g2.m a;
    public final g2.g b;
    public final g2.c0 c;
    public final rb.a d;
    public final a5.a e;
    public final q1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final y2.n r;
    public final b2.s s;
    public final boolean v;
    public boolean w;
    public byte[] x;
    public int y;

    public m1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, rb.a aVar, a5.a aVar2, boolean z10, z2.a aVar3) {
        this.a = mVar;
        this.b = gVar;
        this.c = c0Var;
        this.s = sVar;
        this.n = j3;
        this.d = aVar;
        this.e = aVar2;
        this.v = z10;
        this.f = new q1(new b2.l1("", sVar));
        this.r = aVar3 != null ? new y2.n(aVar3) : new y2.n("SingleSampleMediaPeriod");
    }

    @Override // y2.i
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        Uri uri = ((l1) kVar).b.c;
        u uVar = new u(j10);
        this.d.getClass();
        this.e.m(uVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // u2.f1
    public final boolean c() {
        return this.r.d();
    }

    @Override // u2.f1
    public final long d() {
        return (this.w || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.e0
    public final long h(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return j3;
            }
            k1 k1Var = (k1) arrayList.get(i10);
            if (k1Var.a == 2) {
                k1Var.a = 1;
            }
            i10++;
        }
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j3) {
        d0Var.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    @Override // y2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        k4.d dVar;
        Uri uri = ((l1) kVar).b.c;
        u uVar = new u(j10);
        String str = e2.d0.a;
        this.d.getClass();
        if (!(iOException instanceof b2.s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.m)) {
            int i11 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            boolean z10 = j11 != -9223372036854775807L || i10 >= 3;
            if (this.v || !z10) {
                dVar = j11 == -9223372036854775807L ? new k4.d(0, j11, false) : y2.n.f;
            } else {
                e2.a.o("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
                this.w = true;
                dVar = y2.n.e;
            }
            k4.d dVar2 = dVar;
            this.e.p(uVar, 1, -1, this.s, 0, null, 0L, this.n, iOException, !dVar2.a());
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
        this.e.p(uVar, 1, -1, this.s, 0, null, 0L, this.n, iOException, !dVar22.a());
        return dVar22;
    }

    @Override // y2.i
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        l1 l1Var = (l1) kVar;
        g2.b0 b0Var = l1Var.b;
        if (i10 == 0) {
            uVar = new u(l1Var.a);
        } else {
            Uri uri = b0Var.c;
            uVar = new u(j10);
        }
        this.e.r(uVar, 1, -1, this.s, 0, null, 0L, this.n, i10);
    }

    @Override // u2.e0
    public final long m() {
        return -9223372036854775807L;
    }

    @Override // u2.f1
    public final boolean n(i2.q0 q0Var) {
        if (this.w) {
            return false;
        }
        y2.n nVar = this.r;
        if (nVar.d() || nVar.c()) {
            return false;
        }
        g2.h createDataSource = this.b.createDataSource();
        g2.c0 c0Var = this.c;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        l1 l1Var = new l1(createDataSource, this.a);
        this.d.getClass();
        nVar.f(l1Var, this, 3);
        return true;
    }

    @Override // u2.e0
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            ArrayList arrayList = this.h;
            if (d1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(d1Var);
                d1VarArr[i10] = null;
            }
            if (d1VarArr[i10] == null && rVarArr[i10] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i10] = k1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override // y2.i
    public final void p(y2.k kVar, long j3, long j10) {
        l1 l1Var = (l1) kVar;
        this.y = (int) l1Var.b.b;
        byte[] bArr = l1Var.c;
        bArr.getClass();
        this.x = bArr;
        this.w = true;
        Uri uri = l1Var.b.c;
        u uVar = new u(j10);
        this.d.getClass();
        this.e.o(uVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // u2.e0
    public final q1 q() {
        return this.f;
    }

    @Override // u2.f1
    public final long r() {
        return this.w ? Long.MIN_VALUE : 0L;
    }

    @Override // u2.e0
    public final void f() {
    }

    @Override // u2.e0
    public final void i(long j3) {
    }

    @Override // u2.f1
    public final void u(long j3) {
    }

    @Override // u2.e0
    public final long s(long j3, i2.o1 o1Var) {
        return j3;
    }
}
