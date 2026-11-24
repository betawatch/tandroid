// default package

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yq6 {
    public static final yq6 d = new yq6(new xl3((byte) 16, false));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = g8c.a;
        e = "0";
        f = "1";
        g = "2";
    }

    public yq6(xl3 xl3Var) {
        this.a = (Uri) xl3Var.b;
        this.b = (String) xl3Var.c;
        this.c = (Bundle) xl3Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq6)) {
            return false;
        }
        yq6 yq6Var = (yq6) obj;
        if (Objects.equals(this.a, yq6Var.a) && Objects.equals(this.b, yq6Var.b)) {
            if ((this.c == null) == (yq6Var.c == null)) {
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
