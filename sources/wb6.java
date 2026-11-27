// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wb6 {
    public final Uri a;
    public final String b;

    public wb6(Uri uri) {
        this(uri, uri.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb6)) {
            return false;
        }
        wb6 wb6Var = (wb6) obj;
        return Objects.equals(this.a, wb6Var.a) && Objects.equals(this.b, wb6Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public wb6(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
