// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wy implements fv8 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public wy(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return fv8.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv8)) {
            return false;
        }
        fv8 fv8Var = (fv8) obj;
        return this.a == fv8Var.tag() && ev8.a.equals(fv8Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (ev8.a.hashCode() ^ 2041407134);
    }

    @Override // fv8
    public final ev8 intEncoding() {
        return ev8.a;
    }

    @Override // fv8
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + ev8.a + ')';
    }
}
