// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rb6 {
    public final Uri a;
    public final String b;

    public rb6(Uri uri) {
        this(uri, uri.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb6)) {
            return false;
        }
        rb6 rb6Var = (rb6) obj;
        return Objects.equals(this.a, rb6Var.a) && Objects.equals(this.b, rb6Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public rb6(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
