// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yeb {
    public final int a;
    public final int b;

    public yeb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yeb.class != obj.getClass()) {
            return false;
        }
        yeb yebVar = (yeb) obj;
        return this.b == yebVar.b && this.a == yebVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
