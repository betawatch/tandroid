package y1;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class d {
    public final String a;
    public final int b;
    public final int c;

    public d(String str, int i10, int i11) {
        this.a = str;
        this.b = i10;
        this.c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.c;
        String str = dVar.a;
        int i11 = dVar.b;
        int i12 = this.c;
        String str2 = this.a;
        int i13 = this.b;
        return (i13 < 0 || i11 < 0) ? TextUtils.equals(str2, str) && i12 == i10 : TextUtils.equals(str2, str) && i13 == i11 && i12 == i10;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
