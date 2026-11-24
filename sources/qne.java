// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qne implements due {
    public static final qne b = new qne(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ qne(byte b2) {
        this.a = b2;
    }

    @Override // due
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return nne.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // due
    public final swe zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!nne.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (swe) nne.f(cls.asSubclass(nne.class)).d(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
