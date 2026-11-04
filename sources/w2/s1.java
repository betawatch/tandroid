package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s1 extends d2.v0 {
    public final g9.i0 c;

    public s1(String str, g9.s1 s1Var) {
        super(str, null, false, 1);
        this.c = g9.i0.q(s1Var);
    }

    @Override // d2.v0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        g9.i0 i0Var = this.c;
        if (i0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i0Var;
    }
}
