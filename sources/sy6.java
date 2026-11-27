// default package

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sy6 {
    public wy6 a;

    public sy6(String str, int i, int i2) {
        if (str == null) {
            p3d.h("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            lq5.j("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new wy6(str, i, i2);
            return;
        }
        vy6 vy6Var = new vy6(str, i, i2);
        l35.b(i, i2, str);
        this.a = vy6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sy6) {
            return this.a.equals(((sy6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
