// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class um8 {
    public final String a;
    public final String b;
    public final int c;

    public um8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof um8)) {
            return false;
        }
        um8 um8Var = (um8) obj;
        return this.a.equals(um8Var.a) && this.b.equals(um8Var.b);
    }

    public final int hashCode() {
        return this.c;
    }
}
