package u2;

import e9.x1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s1 extends b2.w0 {
    public final e9.n0 c;

    public s1(String str, x1 x1Var) {
        super(str, null, false, 1);
        this.c = e9.n0.u(x1Var);
    }

    @Override // b2.w0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        e9.n0 n0Var = this.c;
        if (n0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + n0Var;
    }
}
