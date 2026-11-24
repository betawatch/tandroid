// default package

import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
