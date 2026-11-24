// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wgd implements Serializable {
    public final Object a;

    public wgd(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wgd) {
            return x1f.a(this.a, ((wgd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return kt6.o("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
