package u2;

import e9.x1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s1 extends b2.x0 {
    public final e9.n0 c;

    public s1(String str, x1 x1Var) {
        super(str, null, false, 1);
        this.c = e9.n0.u(x1Var);
    }

    @Override // b2.x0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        e9.n0 n0Var = this.c;
        if (n0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + n0Var;
    }
}
