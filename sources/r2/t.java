package r2;

import android.text.TextUtils;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class t {
    public final String a;
    public final boolean b;
    public final boolean c;

    public t(String str, boolean z10, boolean z11) {
        this.a = str;
        this.b = z10;
        this.c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.a, tVar.a) && this.b == tVar.b && this.c == tVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((a4.a.h(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
