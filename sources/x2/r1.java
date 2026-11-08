package x2;

import h9.t1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r1 extends e2.t0 {
    public final h9.i0 c;

    public r1(String str, t1 t1Var) {
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
