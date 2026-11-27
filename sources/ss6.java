// default package

import android.net.Uri;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
