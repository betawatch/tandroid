// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class s96 {
    public final Uri a;
    public final String b;

    public s96(Uri uri) {
        this(uri, uri.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s96)) {
            return false;
        }
        s96 s96Var = (s96) obj;
        return Objects.equals(this.a, s96Var.a) && Objects.equals(this.b, s96Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public s96(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
