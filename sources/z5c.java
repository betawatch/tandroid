// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class z5c extends av7 {
    public final mm5 c;

    public z5c(String str, w59 w59Var) {
        super(str, null, false, 1);
        this.c = mm5.q(w59Var);
    }

    @Override // av7, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        mm5 mm5Var = this.c;
        if (mm5Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + mm5Var;
    }
}
