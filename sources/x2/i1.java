package x2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class i1 implements b1 {
    public int a;
    public boolean b;
    public final /* synthetic */ k1 c;

    public i1(k1 k1Var) {
        this.c = k1Var;
    }

    @Override // x2.b1
    public final void a() {
        k1 k1Var = this.c;
        if (k1Var.w) {
            return;
        }
        k1Var.r.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        k1 k1Var = this.c;
        k1Var.e.i(e2.s0.h(k1Var.s.s), k1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // x2.b1
    public final boolean f() {
        return this.c.x;
    }

    @Override // x2.b1
    public final int n(long j3) {
        b();
        if (j3 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // x2.b1
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        b();
        k1 k1Var = this.c;
        boolean z10 = k1Var.x;
        if (z10 && k1Var.y == null) {
            this.a = 2;
        }
        int i10 = this.a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i7 & 2) != 0 || i10 == 0) {
            aVar.c = k1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        k1Var.y.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i7 & 4) == 0) {
            hVar.b(k1Var.E);
            hVar.c.put(k1Var.y, 0, k1Var.E);
        }
        if ((i7 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }
}
