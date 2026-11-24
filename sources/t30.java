// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t30 extends Exception {
    public final boolean a;
    public final fm4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t30(int i, int i2, int i3, int i4, fm4 fm4Var, boolean z, p00 p00Var) {
        super(r3.toString(), p00Var);
        StringBuilder p = ir2.p("AudioTrack init failed 0 Config(", i, ", ", i2, ", ");
        ir2.w(p, i3, ", ", i4, ") ");
        p.append(fm4Var);
        p.append(z ? " (recoverable)" : "");
        this.a = z;
        this.b = fm4Var;
    }
}
