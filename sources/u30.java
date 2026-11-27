// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
