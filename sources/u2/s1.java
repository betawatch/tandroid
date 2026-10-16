package u2;

import e9.x1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
