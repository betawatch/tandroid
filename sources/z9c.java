// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class z9c extends hy7 {
    public final po5 c;

    public z9c(String str, j99 j99Var) {
        super(str, null, false, 1);
        this.c = po5.q(j99Var);
    }

    @Override // hy7, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        po5 po5Var = this.c;
        if (po5Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + po5Var;
    }
}
