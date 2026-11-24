// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vx implements et8 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public vx(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return et8.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et8)) {
            return false;
        }
        et8 et8Var = (et8) obj;
        return this.a == et8Var.tag() && dt8.a.equals(et8Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (dt8.a.hashCode() ^ 2041407134);
    }

    @Override // et8
    public final dt8 intEncoding() {
        return dt8.a;
    }

    @Override // et8
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + dt8.a + ')';
    }
}
