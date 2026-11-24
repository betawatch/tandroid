// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yka {
    public static final yka c = new yka(-1, -1);
    public final int a;
    public final int b;

    static {
        new yka(0, 0);
        String str = hac.a;
    }

    public yka(int i, int i2) {
        jte.f((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof yka) {
            yka ykaVar = (yka) obj;
            if (this.a == ykaVar.a && this.b == ykaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i << 16) | (i >>> 16));
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
