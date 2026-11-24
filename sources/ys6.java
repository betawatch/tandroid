// default package

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ys6 {
    public static final ys6 d = new ys6(new in3((byte) 16, false));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = hac.a;
        e = "0";
        f = "1";
        g = "2";
    }

    public ys6(in3 in3Var) {
        this.a = (Uri) in3Var.b;
        this.b = (String) in3Var.c;
        this.c = (Bundle) in3Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys6)) {
            return false;
        }
        ys6 ys6Var = (ys6) obj;
        if (Objects.equals(this.a, ys6Var.a) && Objects.equals(this.b, ys6Var.b)) {
            if ((this.c == null) == (ys6Var.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
