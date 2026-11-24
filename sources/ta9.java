// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ta9 implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof sa9) {
            return ((sa9) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ta9) {
            return rp5.a(this.a, ((ta9) obj).a);
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
        if (obj instanceof sa9) {
            return ((sa9) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
