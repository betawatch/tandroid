// default package

import android.net.Uri;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class os6 {
    public static final String b;
    public final Uri a;

    static {
        String str = hac.a;
        b = "0";
    }

    public os6(ai4 ai4Var) {
        this.a = (Uri) ai4Var.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof os6) && this.a.equals(((os6) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
