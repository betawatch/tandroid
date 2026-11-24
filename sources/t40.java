// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t40 extends Exception {
    public final boolean a;
    public final go4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t40(int i, int i2, int i3, int i4, go4 go4Var, boolean z, p10 p10Var) {
        super(r3.toString(), p10Var);
        StringBuilder o = ts2.o("AudioTrack init failed 0 Config(", i, ", ", i2, ", ");
        ts2.v(o, i3, ", ", i4, ") ");
        o.append(go4Var);
        o.append(z ? " (recoverable)" : "");
        this.a = z;
        this.b = go4Var;
    }
}
