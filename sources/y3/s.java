package y3;

import android.text.TextUtils;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s {
    public final String a;
    public final boolean b;
    public final boolean c;

    public s(String str, boolean z10, boolean z11) {
        this.a = str;
        this.b = z10;
        this.c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != s.class) {
            return false;
        }
        s sVar = (s) obj;
        return TextUtils.equals(this.a, sVar.a) && this.b == sVar.b && this.c == sVar.c;
    }

    public final int hashCode() {
        return ((i0.a.g(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
