// default package

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ub6 {
    public final String a;
    public final LocusId b;

    public ub6(String str) {
        if (TextUtils.isEmpty(str)) {
            w26.j("id cannot be empty");
            throw null;
        }
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = rr.c(str);
        } else {
            this.b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ub6.class != obj.getClass()) {
            return false;
        }
        String str = ((ub6) obj).a;
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
