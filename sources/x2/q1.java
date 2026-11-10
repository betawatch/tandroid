package x2;

import h9.t1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class q1 extends e2.t0 {
    public final h9.i0 c;

    public q1(String str, t1 t1Var) {
        super(str, null, false, 1);
        this.c = h9.i0.q(t1Var);
    }

    @Override // e2.t0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        h9.i0 i0Var = this.c;
        if (i0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i0Var;
    }
}
