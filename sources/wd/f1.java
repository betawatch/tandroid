package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f1 extends m {
    public final n1 r;

    public f1(fd.c cVar, n1 n1Var) {
        super(1, cVar);
        this.r = n1Var;
    }

    @Override // wd.m
    public final Throwable q(n1 n1Var) {
        Throwable c2;
        n1 n1Var2 = this.r;
        n1Var2.getClass();
        Object obj = n1.a.get(n1Var2);
        return (!(obj instanceof h1) || (c2 = ((h1) obj).c()) == null) ? obj instanceof v ? ((v) obj).a : n1Var.getCancellationException() : c2;
    }

    @Override // wd.m
    public final String z() {
        return "AwaitContinuation";
    }
}
