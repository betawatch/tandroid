package u2;

import e9.x1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class u1 extends b2.w0 {
    public final e9.n0 c;

    public u1(String str, x1 x1Var) {
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
