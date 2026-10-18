package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class j1 implements c1 {
    public int a;
    public boolean b;
    public final /* synthetic */ l1 c;

    public j1(l1 l1Var) {
        this.c = l1Var;
    }

    @Override // u2.c1
    public final void a() {
        l1 l1Var = this.c;
        if (l1Var.v) {
            return;
        }
        l1Var.r.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        l1 l1Var = this.c;
        l1Var.e.m(b2.v0.h(l1Var.s.s), l1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.c1
    public final boolean e() {
        return this.c.w;
    }

    @Override // u2.c1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        b();
        l1 l1Var = this.c;
        boolean z10 = l1Var.w;
        if (z10 && l1Var.x == null) {
            this.a = 2;
        }
        int i11 = this.a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            bVar.c = l1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        l1Var.x.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i10 & 4) == 0) {
            hVar.b(l1Var.y);
            hVar.c.put(l1Var.x, 0, l1Var.y);
        }
        if ((i10 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // u2.c1
    public final int h(long j10) {
        b();
        if (j10 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
