// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y97 {
    public long a;
    public long b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof y97)) {
            return false;
        }
        y97 y97Var = (y97) obj;
        return this.a == y97Var.a && this.b == y97Var.b && Arrays.equals(this.c, y97Var.c);
    }
}
