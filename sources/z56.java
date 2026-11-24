// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class z56 {
    public final Object a;
    public e31 b = new e31();
    public boolean c;
    public boolean d;

    public z56(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z56.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((z56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
