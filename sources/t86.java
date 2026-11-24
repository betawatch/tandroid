// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t86 {
    public final long a;
    public final float b;
    public final long c;

    public t86(s86 s86Var) {
        this.a = s86Var.a;
        this.b = s86Var.b;
        this.c = s86Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t86)) {
            return false;
        }
        t86 t86Var = (t86) obj;
        return this.a == t86Var.a && this.b == t86Var.b && this.c == t86Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
