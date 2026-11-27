// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class s53 {
    public final i09 a;
    public final boolean b;

    public s53(i09 i09Var, boolean z) {
        this.a = i09Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s53) {
            s53 s53Var = (s53) obj;
            if (s53Var.a.equals(this.a) && s53Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
