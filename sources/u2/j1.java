package u2;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        l1Var.e.k(b2.r0.h(l1Var.s.r), l1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.c1
    public final boolean e() {
        return this.c.w;
    }

    @Override // u2.c1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
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
            yVar.c = l1Var.s;
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
    public final int j(long j3) {
        b();
        if (j3 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
