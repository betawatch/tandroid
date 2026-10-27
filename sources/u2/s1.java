package u2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s1 extends b2.x0 {
    public final f9.i0 c;

    public s1(String str, f9.s1 s1Var) {
        super(str, null, false, 1);
        this.c = f9.i0.u(s1Var);
    }

    @Override // b2.x0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        f9.i0 i0Var = this.c;
        if (i0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i0Var;
    }
}
