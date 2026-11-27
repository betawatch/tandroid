// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ym8 extends wl5 {
    public final String b;
    public final byte[] c;

    public ym8(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ym8.class != obj.getClass()) {
            return false;
        }
        ym8 ym8Var = (ym8) obj;
        return this.b.equals(ym8Var.b) && Arrays.equals(this.c, ym8Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + bs2.j(527, 31, this.b);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
