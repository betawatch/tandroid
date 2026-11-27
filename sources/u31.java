// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
