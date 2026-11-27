// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ph5 {
    public final ko4 a;
    public final String b;
    public final String c;

    public ph5(ko4 ko4Var, String str, String str2) {
        jo4 a = ko4Var.a();
        a.a = null;
        a.l = null;
        this.a = new ko4(a);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph5)) {
            return false;
        }
        ph5 ph5Var = (ph5) obj;
        return this.a.equals(ph5Var.a) && Objects.equals(this.b, ph5Var.b) && Objects.equals(this.c, ph5Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
