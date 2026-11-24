// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class t41 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t41(String str, s41 s41Var) {
        super(r2.toString());
        StringBuilder k = b10.k(str, ", frames: ");
        k.append(s41Var.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t41(String str, s41 s41Var, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder k = b10.k(str, ", frames: ");
        k.append(s41Var.a());
    }
}
