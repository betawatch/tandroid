// default package

import android.net.Uri;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ss6 {
    public static final String b;
    public final Uri a;

    static {
        String str = gcc.a;
        b = "0";
    }

    public ss6(xh4 xh4Var) {
        this.a = (Uri) xh4Var.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ss6) && this.a.equals(((ss6) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
