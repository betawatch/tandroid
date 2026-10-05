package u2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class n1 implements c1 {
    public final c1 a;
    public final long b;

    public n1(c1 c1Var, long j3) {
        this.a = c1Var;
        this.b = j3;
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
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.b;
        }
        return f7;
    }

    @Override // u2.c1
    public final int j(long j3) {
        return this.a.j(j3 - this.b);
    }
}
