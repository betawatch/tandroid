// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tu8 {
    public final int a;
    public final boolean b;

    public tu8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tu8.class != obj.getClass()) {
            return false;
        }
        tu8 tu8Var = (tu8) obj;
        return this.a == tu8Var.a && this.b == tu8Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
