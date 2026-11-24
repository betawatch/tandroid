// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ygb {
    public final int a;
    public final int b;

    public ygb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ygb.class != obj.getClass()) {
            return false;
        }
        ygb ygbVar = (ygb) obj;
        return this.b == ygbVar.b && this.a == ygbVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
