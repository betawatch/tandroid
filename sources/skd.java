// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class skd implements xmd {
    public final short a;

    /* JADX WARN: Multi-variable type inference failed */
    public skd(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return xmd.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmd)) {
            return false;
        }
        xmd xmdVar = (xmd) obj;
        return this.a == xmdVar.zza() && rmd.a.equals(xmdVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (rmd.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + rmd.a + ')';
    }

    @Override // xmd
    public final int zza() {
        return this.a;
    }

    @Override // xmd
    public final rmd zzb() {
        return rmd.a;
    }
}
