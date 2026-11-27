// default package

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
