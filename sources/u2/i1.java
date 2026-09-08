package u2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i1 implements b1 {
    public int a;
    public boolean b;
    public final /* synthetic */ k1 c;

    public i1(k1 k1Var) {
        this.c = k1Var;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        k1 k1Var = this.c;
        k1Var.e.j(b2.r0.h(k1Var.s.r), k1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.b1
    public final void b() {
        k1 k1Var = this.c;
        if (k1Var.v) {
            return;
        }
        k1Var.r.b();
    }

    @Override // u2.b1
    public final boolean e() {
        return this.c.w;
    }

    @Override // u2.b1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        a();
        k1 k1Var = this.c;
        boolean z10 = k1Var.w;
        if (z10 && k1Var.x == null) {
            this.a = 2;
        }
        int i11 = this.a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            yVar.c = k1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        k1Var.x.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i10 & 4) == 0) {
            hVar.b(k1Var.y);
            hVar.c.put(k1Var.x, 0, k1Var.y);
        }
        if ((i10 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // u2.b1
    public final int m(long j3) {
        a();
        if (j3 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
