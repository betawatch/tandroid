package w2;

import b8.kg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m1 implements e0, a3.k {
    public int E;
    public final i2.n a;
    public final i2.g b;
    public final i2.d0 c;
    public final kb.a d;
    public final kg e;
    public final r1 f;
    public final ArrayList h = new ArrayList();
    public final long n;
    public final a3.q r;
    public final d2.v s;
    public final boolean w;
    public boolean x;
    public byte[] y;

    public m1(i2.n nVar, i2.g gVar, i2.d0 d0Var, d2.v vVar, long j10, kb.a aVar, kg kgVar, boolean z10, b3.a aVar2) {
        this.a = nVar;
        this.b = gVar;
        this.c = d0Var;
        this.s = vVar;
        this.n = j10;
        this.d = aVar;
        this.e = kgVar;
        this.w = z10;
        this.f = new r1(new d2.o1("", vVar));
        this.r = aVar2 != null ? new a3.q(aVar2) : new a3.q("SingleSampleMediaPeriod");
    }

    @Override // a3.k
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        l1 l1Var = (l1) mVar;
        i2.c0 c0Var = l1Var.b;
        this.e.u(i3 == 0 ? new u(l1Var.a, j10) : new u(l1Var.a, c0Var.c, c0Var.d, j10, j11, c0Var.b), 1, -1, this.s, 0, null, 0L, this.n, i3);
    }

    @Override // w2.f1
    public final boolean c(k2.v0 v0Var) {
        if (this.x) {
            return false;
        }
        a3.q qVar = this.r;
        if (qVar.d() || qVar.c()) {
            return false;
        }
        i2.h createDataSource = this.b.createDataSource();
        i2.d0 d0Var = this.c;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        l1 l1Var = new l1(createDataSource, this.a);
        this.d.getClass();
        qVar.f(l1Var, this, 3);
        return true;
    }

    @Override // w2.f1
    public final boolean d() {
        return this.r.d();
    }

    @Override // w2.f1
    public final long e() {
        return (this.x || this.r.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // a3.k
    public final void h(a3.m mVar, long j10, long j11) {
        l1 l1Var = (l1) mVar;
        this.E = (int) l1Var.b.b;
        byte[] bArr = l1Var.c;
        bArr.getClass();
        this.y = bArr;
        this.x = true;
        i2.c0 c0Var = l1Var.b;
        u uVar = new u(l1Var.a, c0Var.c, c0Var.d, j10, j11, this.E);
        this.d.getClass();
        this.e.q(uVar, 1, -1, this.s, 0, null, 0L, this.n);
    }

    @Override // w2.e0
    public final void i(d0 d0Var, long j10) {
        d0Var.b(this);
    }

    @Override // w2.e0
    public final long j(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 >= arrayList.size()) {
                return j10;
            }
            k1 k1Var = (k1) arrayList.get(i3);
            if (k1Var.a == 2) {
                k1Var.a = 1;
            }
            i3++;
        }
    }

    @Override // a3.k
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        long min;
        IOException iOException2;
        a3.i iVar;
        l1 l1Var = (l1) mVar;
        i2.c0 c0Var = l1Var.b;
        u uVar = new u(l1Var.a, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        String str = g2.n0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof d2.v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof i2.v) || (th2 instanceof a3.p) || ((th2 instanceof i2.k) && ((i2.k) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i3 - 1) * 1000, 5000);
        boolean z10 = min == -9223372036854775807L || i3 >= 3;
        if (this.w && z10) {
            iOException2 = iOException;
            g2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.x = true;
            iVar = a3.q.e;
        } else {
            iOException2 = iOException;
            iVar = min != -9223372036854775807L ? new a3.i(0, min, false) : a3.q.f;
        }
        this.e.r(uVar, 1, -1, this.s, 0, null, 0L, this.n, iOException2, !iVar.a());
        return iVar;
    }

    @Override // w2.e0
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // w2.e0
    public final r1 p() {
        return this.f;
    }

    @Override // w2.f1
    public final long q() {
        return this.x ? Long.MIN_VALUE : 0L;
    }

    @Override // a3.k
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) mVar;
        i2.c0 c0Var = l1Var.b;
        u uVar = new u(l1Var.a, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, 0L, this.n);
    }

    @Override // w2.e0
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        for (int i3 = 0; i3 < pVarArr.length; i3++) {
            d1 d1Var = d1VarArr[i3];
            ArrayList arrayList = this.h;
            if (d1Var != null && (pVarArr[i3] == null || !zArr[i3])) {
                arrayList.remove(d1Var);
                d1VarArr[i3] = null;
            }
            if (d1VarArr[i3] == null && pVarArr[i3] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i3] = k1Var;
                zArr2[i3] = true;
            }
        }
        return j10;
    }

    @Override // w2.e0
    public final void g() {
    }

    @Override // w2.e0
    public final void l(long j10) {
    }

    @Override // w2.f1
    public final void t(long j10) {
    }

    @Override // w2.e0
    public final long r(long j10, k2.t1 t1Var) {
        return j10;
    }
}
