package u2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class q1 implements f1 {
    public final f1 a;
    public final long b;

    public q1(f1 f1Var, long j10) {
        this.a = f1Var;
        this.b = j10;
    }

    @Override // u2.f1
    public final void a() {
        this.a.a();
    }

    @Override // u2.f1
    public final boolean f() {
        return this.a.f();
    }

    @Override // u2.f1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        int g10 = this.a.g(bVar, hVar, i10);
        if (g10 == -4) {
            hVar.e += this.b;
        }
        return g10;
    }

    @Override // u2.f1
    public final int m(long j10) {
        return this.a.m(j10 - this.b);
    }
}
