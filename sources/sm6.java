// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sm6 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public sm6(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != sm6.class) {
            return false;
        }
        sm6 sm6Var = (sm6) obj;
        return TextUtils.equals(this.a, sm6Var.a) && this.b == sm6Var.b && this.c == sm6Var.c;
    }

    public final int hashCode() {
        return ((bs2.j(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
