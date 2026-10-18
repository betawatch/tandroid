package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class n1 implements c1 {
    public final c1 a;
    public final long b;

    public n1(c1 c1Var, long j10) {
        this.a = c1Var;
        this.b = j10;
    }

    @Override // u2.c1
    public final void a() {
        this.a.a();
    }

    @Override // u2.c1
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.c1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        int f7 = this.a.f(bVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.b;
        }
        return f7;
    }

    @Override // u2.c1
    public final int h(long j10) {
        return this.a.h(j10 - this.b);
    }
}
