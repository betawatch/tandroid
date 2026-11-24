// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z76 {
    public final Object a;
    public m41 b = new m41();
    public boolean c;
    public boolean d;

    public z76(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z76.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((z76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
