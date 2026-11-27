// default package

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
