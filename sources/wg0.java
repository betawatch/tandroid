// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wg0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public wg0(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        return this.c == wg0Var.c && this.d == wg0Var.d && Objects.equals(this.a, wg0Var.a) && Objects.equals(this.b, wg0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
