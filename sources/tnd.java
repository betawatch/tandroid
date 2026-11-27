// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class tnd implements bpd {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public tnd(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return bpd.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpd)) {
            return false;
        }
        bpd bpdVar = (bpd) obj;
        return this.a == bpdVar.zza() && vod.a.equals(bpdVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (vod.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + vod.a + ')';
    }

    @Override // bpd
    public final int zza() {
        return this.a;
    }

    @Override // bpd
    public final vod zzb() {
        return vod.a;
    }
}
