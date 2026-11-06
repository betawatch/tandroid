package x2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j1 implements c1 {
    public int a;
    public boolean b;
    public final /* synthetic */ l1 c;

    public j1(l1 l1Var) {
        this.c = l1Var;
    }

    @Override // x2.c1
    public final void a() {
        l1 l1Var = this.c;
        if (l1Var.w) {
            return;
        }
        l1Var.r.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        l1 l1Var = this.c;
        l1Var.e.j(e2.s0.h(l1Var.s.s), l1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // x2.c1
    public final boolean f() {
        return this.c.x;
    }

    @Override // x2.c1
    public final int l(long j3) {
        b();
        if (j3 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // x2.c1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        b();
        l1 l1Var = this.c;
        boolean z9 = l1Var.x;
        if (z9 && l1Var.y == null) {
            this.a = 2;
        }
        int i10 = this.a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i7 & 2) != 0 || i10 == 0) {
            bVar.c = l1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z9) {
            return -3;
        }
        l1Var.y.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i7 & 4) == 0) {
            hVar.b(l1Var.D);
            hVar.c.put(l1Var.y, 0, l1Var.D);
        }
        if ((i7 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }
}
