// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zk8 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public zk8(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk8)) {
            return false;
        }
        zk8 zk8Var = (zk8) obj;
        return this.a.equals(zk8Var.a) && this.b == zk8Var.b && this.c == zk8Var.c && this.d == zk8Var.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
