package q4;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class t {
    public final String a;
    public final int b;
    public final int c;

    public t(String str, int i7, int i10) {
        this.a = str;
        this.b = i7;
        this.c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i7 = tVar.c;
        String str = tVar.a;
        int i10 = tVar.b;
        int i11 = this.c;
        String str2 = this.a;
        int i12 = this.b;
        return (i12 < 0 || i10 < 0) ? TextUtils.equals(str2, str) && i11 == i7 : TextUtils.equals(str2, str) && i12 == i10 && i11 == i7;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
