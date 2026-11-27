// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class u30 extends Exception {
    public final boolean a;
    public final ko4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u30(int i, int i2, int i3, int i4, ko4 ko4Var, boolean z, q00 q00Var) {
        super(r3.toString(), q00Var);
        StringBuilder p = bs2.p("AudioTrack init failed 0 Config(", i, ", ", i2, ", ");
        bs2.w(p, i3, ", ", i4, ") ");
        p.append(ko4Var);
        p.append(z ? " (recoverable)" : "");
        this.a = z;
        this.b = ko4Var;
    }
}
