package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o1 implements d1 {
    public final d1 a;
    public final long b;

    public o1(d1 d1Var, long j3) {
        this.a = d1Var;
        this.b = j3;
    }

    @Override // u2.d1
    public final void a() {
        this.a.a();
    }

    @Override // u2.d1
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.d1
    public final int g(long j3) {
        return this.a.g(j3 - this.b);
    }

    @Override // u2.d1
    public final int t(of.b bVar, h2.h hVar, int i10) {
        int t10 = this.a.t(bVar, hVar, i10);
        if (t10 == -4) {
            hVar.e += this.b;
        }
        return t10;
    }
}
