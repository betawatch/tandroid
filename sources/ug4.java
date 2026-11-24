// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ug4 {
    public long a;
    public int b;

    public ug4(int i, long j) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ug4.class == obj.getClass()) {
            ug4 ug4Var = (ug4) obj;
            if (this.a == ug4Var.a && this.b == ug4Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
