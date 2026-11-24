// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tef implements dgf {
    public static final tef b = new tef(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ tef(byte b2) {
        this.a = b2;
    }

    @Override // dgf
    public final sgf zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!vef.class.isAssignableFrom(cls)) {
                    w26.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (sgf) vef.k(cls.asSubclass(vef.class)).h(3, null);
                } catch (Exception e) {
                    fyb.j("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // dgf
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return vef.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
