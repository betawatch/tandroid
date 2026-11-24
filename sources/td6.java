// default package

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class td6 {
    public final String a;
    public final LocusId b;

    public td6(String str) {
        if (TextUtils.isEmpty(str)) {
            u36.j("id cannot be empty");
            throw null;
        }
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = rs.c(str);
        } else {
            this.b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || td6.class != obj.getClass()) {
            return false;
        }
        String str = ((td6) obj).a;
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
