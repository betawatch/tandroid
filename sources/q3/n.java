package q3;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
