package zd;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
