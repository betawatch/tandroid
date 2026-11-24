// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z34 {
    public final d44 a;
    public final byte[] b;

    public z34(d44 d44Var, byte[] bArr) {
        if (d44Var == null) {
            gxc.d("encoding is null");
            throw null;
        }
        if (bArr == null) {
            gxc.d("bytes is null");
            throw null;
        }
        this.a = d44Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z34)) {
            return false;
        }
        z34 z34Var = (z34) obj;
        if (this.a.equals(z34Var.a)) {
            return Arrays.equals(this.b, z34Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
