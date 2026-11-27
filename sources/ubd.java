// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
