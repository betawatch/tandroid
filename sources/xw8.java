// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xw8 {
    public final Class a;
    public final Class b;

    public xw8(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static xw8 a(Class cls) {
        return new xw8(ww8.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xw8.class != obj.getClass()) {
            return false;
        }
        xw8 xw8Var = (xw8) obj;
        if (this.b.equals(xw8Var.b)) {
            return this.a.equals(xw8Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == ww8.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
