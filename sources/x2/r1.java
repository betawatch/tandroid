package x2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class r1 extends e2.t0 {
    public final h9.i0 c;

    public r1(String str, h9.s1 s1Var) {
        super(str, null, false, 1);
        this.c = h9.i0.q(s1Var);
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
