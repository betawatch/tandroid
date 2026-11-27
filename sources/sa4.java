// default package

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sa4 {
    public final String a;
    public final Map b;

    public sa4(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static lh2 a(String str) {
        return new lh2(str);
    }

    public static sa4 c(String str) {
        return new sa4(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa4)) {
            return false;
        }
        sa4 sa4Var = (sa4) obj;
        return this.a.equals(sa4Var.a) && this.b.equals(sa4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
