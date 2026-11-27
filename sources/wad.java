// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wad implements zbd {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public wad(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zbd.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return this.a == zbdVar.zza() && rbd.a.equals(zbdVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (rbd.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + rbd.a + ')';
    }

    @Override // zbd
    public final int zza() {
        return this.a;
    }

    @Override // zbd
    public final rbd zzb() {
        return rbd.a;
    }
}
