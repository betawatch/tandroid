package u2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class o1 implements d1 {
    public final d1 a;
    public final long b;

    public o1(d1 d1Var, long j10) {
        this.a = d1Var;
        this.b = j10;
    }

    @Override // u2.d1
    public final void a() {
        this.a.a();
    }

    @Override // u2.d1
    public final boolean f() {
        return this.a.f();
    }

    @Override // u2.d1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        int g10 = this.a.g(bVar, hVar, i10);
        if (g10 == -4) {
            hVar.e += this.b;
        }
        return g10;
    }

    @Override // u2.d1
    public final int m(long j10) {
        return this.a.m(j10 - this.b);
    }
}
