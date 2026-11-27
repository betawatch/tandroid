// default package

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class uy6 {
    public final String a;
    public final int b;
    public final int c;

    public uy6(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy6)) {
            return false;
        }
        uy6 uy6Var = (uy6) obj;
        int i = uy6Var.c;
        String str = uy6Var.a;
        int i2 = uy6Var.b;
        int i3 = this.c;
        String str2 = this.a;
        int i4 = this.b;
        return (i4 < 0 || i2 < 0) ? TextUtils.equals(str2, str) && i3 == i : TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
