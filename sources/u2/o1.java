package u2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class o1 implements d1 {
    public final d1 a;
    public final long b;

    public o1(d1 d1Var, long j10) {
        this.a = d1Var;
        this.b = j10;
    }

    @Override // u2.d1
    public final void b() {
        this.a.b();
    }

    @Override // u2.d1
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.d1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        int f7 = this.a.f(bVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.b;
        }
        return f7;
    }

    @Override // u2.d1
    public final int j(long j10) {
        return this.a.j(j10 - this.b);
    }
}
