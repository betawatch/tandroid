// default package

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sn4 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn4)) {
            return false;
        }
        sn4 sn4Var = (sn4) obj;
        return Objects.equals(this.a, sn4Var.a) && Objects.equals(this.b, sn4Var.b) && Objects.equals(this.c, sn4Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
