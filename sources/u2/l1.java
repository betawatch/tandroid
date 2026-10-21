package u2;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class l1 implements e1 {
    public int a;
    public boolean b;
    public final /* synthetic */ n1 c;

    public l1(n1 n1Var) {
        this.c = n1Var;
    }

    @Override // u2.e1
    public final void a() {
        n1 n1Var = this.c;
        if (n1Var.v) {
            return;
        }
        n1Var.r.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        n1 n1Var = this.c;
        n1Var.e.m(b2.v0.h(n1Var.s.s), n1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.e1
    public final boolean f() {
        return this.c.w;
    }

    @Override // u2.e1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        b();
        n1 n1Var = this.c;
        boolean z10 = n1Var.w;
        if (z10 && n1Var.x == null) {
            this.a = 2;
        }
        int i11 = this.a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            bVar.c = n1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        n1Var.x.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i10 & 4) == 0) {
            hVar.b(n1Var.y);
            hVar.c.put(n1Var.x, 0, n1Var.y);
        }
        if ((i10 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // u2.e1
    public final int m(long j10) {
        b();
        if (j10 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
