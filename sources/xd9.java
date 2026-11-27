// default package

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xd9 {
    public final Resources a;
    public final Resources.Theme b;

    public xd9(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xd9.class == obj.getClass()) {
            xd9 xd9Var = (xd9) obj;
            if (this.a.equals(xd9Var.a) && Objects.equals(this.b, xd9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
