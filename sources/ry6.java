// default package

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ry6 {
    public uy6 a;

    public ry6(String str, int i, int i2) {
        if (str == null) {
            p3d.h("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            lq5.j("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new ty6(str, i, i2);
        } else {
            this.a = new uy6(str, i, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ry6) {
            return this.a.equals(((ry6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
