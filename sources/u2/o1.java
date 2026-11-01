package u2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.d1
    public final int i(long j10) {
        return this.a.i(j10 - this.b);
    }

    @Override // u2.d1
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        int r10 = this.a.r(bVar, hVar, i10);
        if (r10 == -4) {
            hVar.e += this.b;
        }
        return r10;
    }
}
