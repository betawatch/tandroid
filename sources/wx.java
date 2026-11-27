// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wx implements nw8 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public wx(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return nw8.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw8)) {
            return false;
        }
        nw8 nw8Var = (nw8) obj;
        return this.a == nw8Var.tag() && mw8.a.equals(nw8Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (mw8.a.hashCode() ^ 2041407134);
    }

    @Override // nw8
    public final mw8 intEncoding() {
        return mw8.a;
    }

    @Override // nw8
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + mw8.a + ')';
    }
}
