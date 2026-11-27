// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t63 {
    public final s63 a;
    public final s63 b;
    public final double c;

    public t63(s63 s63Var, s63 s63Var2, double d) {
        this.a = s63Var;
        this.b = s63Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t63)) {
            return false;
        }
        t63 t63Var = (t63) obj;
        return this.a == t63Var.a && this.b == t63Var.b && Double.compare(this.c, t63Var.c) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
