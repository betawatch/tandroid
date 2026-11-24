// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
