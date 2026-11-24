// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zb7 {
    public long a;
    public long b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zb7)) {
            return false;
        }
        zb7 zb7Var = (zb7) obj;
        return this.a == zb7Var.a && this.b == zb7Var.b && Arrays.equals(this.c, zb7Var.c);
    }
}
