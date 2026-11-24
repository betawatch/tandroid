// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tpe implements gwe {
    public static final tpe b = new tpe(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ tpe(byte b2) {
        this.a = b2;
    }

    @Override // gwe
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return qpe.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // gwe
    public final uye zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!qpe.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (uye) qpe.f(cls.asSubclass(qpe.class)).d(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
