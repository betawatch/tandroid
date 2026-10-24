package u2;

import e9.x1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
