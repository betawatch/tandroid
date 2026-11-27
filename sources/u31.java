// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class u31 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u31(String str, t31 t31Var) {
        super(r2.toString());
        StringBuilder l = c00.l(str, ", frames: ");
        l.append(t31Var.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u31(String str, t31 t31Var, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder l = c00.l(str, ", frames: ");
        l.append(t31Var.a());
    }
}
