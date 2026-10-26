package u2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
