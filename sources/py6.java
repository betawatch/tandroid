// default package

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class py6 {
    public final String a;
    public final int b;
    public final int c;

    public py6(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py6)) {
            return false;
        }
        py6 py6Var = (py6) obj;
        int i = py6Var.c;
        String str = py6Var.a;
        int i2 = py6Var.b;
        int i3 = this.c;
        String str2 = this.a;
        int i4 = this.b;
        return (i4 < 0 || i2 < 0) ? TextUtils.equals(str2, str) && i3 == i : TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
