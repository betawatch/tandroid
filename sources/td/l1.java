package td;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class l1 extends m {
    public final u1 r;

    public l1(cd.c cVar, u1 u1Var) {
        super(1, cVar);
        this.r = u1Var;
    }

    @Override // td.m
    public final Throwable q(u1 u1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof n1) || (b10 = ((n1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : u1Var.getCancellationException() : b10;
    }

    @Override // td.m
    public final String z() {
        return "AwaitContinuation";
    }
}
