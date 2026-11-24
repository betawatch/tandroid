// default package

import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tc9 implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof sc9) {
            return ((sc9) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tc9) {
            return rr5.a(this.a, ((tc9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof sc9) {
            return ((sc9) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
