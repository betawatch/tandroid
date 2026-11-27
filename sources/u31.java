// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
