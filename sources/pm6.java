// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pm6 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public pm6(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != pm6.class) {
            return false;
        }
        pm6 pm6Var = (pm6) obj;
        return TextUtils.equals(this.a, pm6Var.a) && this.b == pm6Var.b && this.c == pm6Var.c;
    }

    public final int hashCode() {
        return ((ts2.j(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
