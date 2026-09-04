package u2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        a();
        k1 k1Var = this.c;
        boolean z10 = k1Var.w;
        if (z10 && k1Var.x == null) {
            this.a = 2;
        }
        int i11 = this.a;
        if (i11 == 2) {
            gVar.a(4);
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
        gVar.a(1);
        gVar.h = 0L;
        if ((i10 & 4) == 0) {
            gVar.l(k1Var.y);
            gVar.e.put(k1Var.x, 0, k1Var.y);
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
