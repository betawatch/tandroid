package u2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o1 implements d1 {
    public final d1 a;
    public final long b;

    public o1(d1 d1Var, long j10) {
        this.a = d1Var;
        this.b = j10;
    }

    @Override // u2.d1
    public final void d() {
        this.a.d();
    }

    @Override // u2.d1
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.d1
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        int f7 = this.a.f(sVar, hVar, i10);
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
