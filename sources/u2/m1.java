package u2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class m1 implements f1 {
    public int a;
    public boolean b;
    public final /* synthetic */ o1 c;

    public m1(o1 o1Var) {
        this.c = o1Var;
    }

    @Override // u2.f1
    public final void a() {
        o1 o1Var = this.c;
        if (o1Var.v) {
            return;
        }
        o1Var.r.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        o1 o1Var = this.c;
        o1Var.e.m(b2.v0.h(o1Var.s.s), o1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.f1
    public final boolean f() {
        return this.c.w;
    }

    @Override // u2.f1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        b();
        o1 o1Var = this.c;
        boolean z10 = o1Var.w;
        if (z10 && o1Var.x == null) {
            this.a = 2;
        }
        int i11 = this.a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            bVar.c = o1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        o1Var.x.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i10 & 4) == 0) {
            hVar.b(o1Var.y);
            hVar.c.put(o1Var.x, 0, o1Var.y);
        }
        if ((i10 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // u2.f1
    public final int m(long j10) {
        b();
        if (j10 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
