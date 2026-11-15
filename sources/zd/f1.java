package zd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
