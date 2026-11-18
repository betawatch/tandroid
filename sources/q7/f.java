package q7;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class f implements Serializable {
    public final Object a;

    public f(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return a8.p0.p("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
