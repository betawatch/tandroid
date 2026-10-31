package q3;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n extends j {
    public final String b;
    public final byte[] c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.b, nVar.b) && Arrays.equals(this.c, nVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // q3.j
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
