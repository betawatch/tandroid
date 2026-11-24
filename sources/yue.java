// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yue implements gwe {
    public gwe[] a;

    @Override // gwe
    public final boolean zza(Class cls) {
        for (gwe gweVar : this.a) {
            if (gweVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // gwe
    public final uye zzb(Class cls) {
        for (gwe gweVar : this.a) {
            if (gweVar.zza(cls)) {
                return gweVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
