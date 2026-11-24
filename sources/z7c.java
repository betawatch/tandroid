// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z7c extends bx7 {
    public final mo5 c;

    public z7c(String str, y79 y79Var) {
        super(str, null, false, 1);
        this.c = mo5.q(y79Var);
    }

    @Override // bx7, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        mo5 mo5Var = this.c;
        if (mo5Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + mo5Var;
    }
}
