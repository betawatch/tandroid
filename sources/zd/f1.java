package zd;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f1 extends m {
    public final n1 r;

    public f1(id.c cVar, n1 n1Var) {
        super(1, cVar);
        this.r = n1Var;
    }

    @Override // zd.m
    public final Throwable q(n1 n1Var) {
        Throwable c10;
        n1 n1Var2 = this.r;
        n1Var2.getClass();
        Object obj = n1.a.get(n1Var2);
        return (!(obj instanceof h1) || (c10 = ((h1) obj).c()) == null) ? obj instanceof v ? ((v) obj).a : n1Var.getCancellationException() : c10;
    }

    @Override // zd.m
    public final String z() {
        return "AwaitContinuation";
    }
}
