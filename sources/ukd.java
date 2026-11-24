// default package

/* loaded from: classes.dex */
public final class ukd implements ssd {
    public static final ukd b = new ukd(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ ukd(byte b2) {
        this.a = b2;
    }

    @Override // ssd
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return xkd.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // ssd
    public final iwd zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!xkd.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (iwd) xkd.d(cls.asSubclass(xkd.class)).a(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
