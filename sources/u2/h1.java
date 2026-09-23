package u2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class h1 implements a1 {
    public int a;
    public boolean b;
    public final /* synthetic */ j1 c;

    public h1(j1 j1Var) {
        this.c = j1Var;
    }

    @Override // u2.a1
    public final void a() {
        j1 j1Var = this.c;
        if (j1Var.v) {
            return;
        }
        j1Var.r.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        j1 j1Var = this.c;
        j1Var.e.k(b2.r0.h(j1Var.s.r), j1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.a1
    public final boolean e() {
        return this.c.w;
    }

    @Override // u2.a1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        j1 j1Var = this.c;
        boolean z10 = j1Var.w;
        if (z10 && j1Var.x == null) {
            this.a = 2;
        }
        int i11 = this.a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            yVar.c = j1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        j1Var.x.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i10 & 4) == 0) {
            hVar.b(j1Var.y);
            hVar.c.put(j1Var.x, 0, j1Var.y);
        }
        if ((i10 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // u2.a1
    public final int j(long j3) {
        b();
        if (j3 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
