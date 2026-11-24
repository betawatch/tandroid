// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ss8 {
    public final int a;
    public final boolean b;

    public ss8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ss8.class != obj.getClass()) {
            return false;
        }
        ss8 ss8Var = (ss8) obj;
        return this.a == ss8Var.a && this.b == ss8Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
