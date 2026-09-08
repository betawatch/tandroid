package zd;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l1 extends m {
    public final u1 r;

    public l1(id.c cVar, u1 u1Var) {
        super(1, cVar);
        this.r = u1Var;
    }

    @Override // zd.m
    public final Throwable q(u1 u1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof n1) || (b10 = ((n1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : u1Var.getCancellationException() : b10;
    }

    @Override // zd.m
    public final String z() {
        return "AwaitContinuation";
    }
}
