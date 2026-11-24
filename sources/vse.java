// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vse implements due {
    public due[] a;

    @Override // due
    public final boolean zza(Class cls) {
        for (due dueVar : this.a) {
            if (dueVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // due
    public final swe zzb(Class cls) {
        for (due dueVar : this.a) {
            if (dueVar.zza(cls)) {
                return dueVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
