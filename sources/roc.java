// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class roc implements wn {
    public final byte a;

    public roc(e00 e00Var) {
        this.a = e00Var.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof roc) || !vue.a(Integer.valueOf(this.a), Integer.valueOf(((roc) obj).a)) || !vue.a(1, 1) || !vue.a(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return vue.a(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
