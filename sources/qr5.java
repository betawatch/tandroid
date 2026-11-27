// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qr5 extends wl5 {
    public final String b;
    public final String c;
    public final String d;

    public qr5(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qr5.class != obj.getClass()) {
            return false;
        }
        qr5 qr5Var = (qr5) obj;
        return this.c.equals(qr5Var.c) && this.b.equals(qr5Var.b) && this.d.equals(qr5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bs2.j(bs2.j(527, 31, this.b), 31, this.c);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
