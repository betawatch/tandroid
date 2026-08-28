package y1;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class d {
    public final String a;
    public final int b;
    public final int c;

    public d(String str, int i9, int i10) {
        this.a = str;
        this.b = i9;
        this.c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i9 = dVar.c;
        String str = dVar.a;
        int i10 = dVar.b;
        int i11 = this.c;
        String str2 = this.a;
        int i12 = this.b;
        return (i12 < 0 || i10 < 0) ? TextUtils.equals(str2, str) && i11 == i9 : TextUtils.equals(str2, str) && i12 == i10 && i11 == i9;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
