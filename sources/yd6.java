// default package

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yd6 {
    public final String a;
    public final LocusId b;

    public yd6(String str) {
        if (TextUtils.isEmpty(str)) {
            lq5.j("id cannot be empty");
            throw null;
        }
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = sr.c(str);
        } else {
            this.b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yd6.class != obj.getClass()) {
            return false;
        }
        String str = ((yd6) obj).a;
        String str2 = this.a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
