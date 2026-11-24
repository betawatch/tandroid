// default package

/* loaded from: classes.dex */
public final class sid implements pqd {
    public static final sid b = new sid(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ sid(byte b2) {
        this.a = b2;
    }

    @Override // pqd
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return vid.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // pqd
    public final fud zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!vid.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (fud) vid.d(cls.asSubclass(vid.class)).a(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
