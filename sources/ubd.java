// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ubd implements bdd {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ubd(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return bdd.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdd)) {
            return false;
        }
        bdd bddVar = (bdd) obj;
        return this.a == bddVar.zza() && vcd.a.equals(bddVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (vcd.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + vcd.a + ')';
    }

    @Override // bdd
    public final int zza() {
        return this.a;
    }

    @Override // bdd
    public final vcd zzb() {
        return vcd.a;
    }
}
