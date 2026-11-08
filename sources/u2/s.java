package u2;

import android.text.TextUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class s {
    public final String a;
    public final boolean b;
    public final boolean c;

    public s(String str, boolean z9, boolean z10) {
        this.a = str;
        this.b = z9;
        this.c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.a, sVar.a) && this.b == sVar.b && this.c == sVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((com.google.android.recaptcha.internal.a.h(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
