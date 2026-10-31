package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
