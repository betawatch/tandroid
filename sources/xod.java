// default package

/* loaded from: classes.dex */
public final class xod implements pqd {
    public pqd[] a;

    @Override // pqd
    public final boolean zza(Class cls) {
        for (pqd pqdVar : this.a) {
            if (pqdVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // pqd
    public final fud zzb(Class cls) {
        for (pqd pqdVar : this.a) {
            if (pqdVar.zza(cls)) {
                return pqdVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
