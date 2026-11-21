package x2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class s1 extends e2.t0 {
    public final h9.i0 c;

    public s1(String str, h9.t1 t1Var) {
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
