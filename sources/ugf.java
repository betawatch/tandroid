// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ugf implements eif {
    public static final ugf b = new ugf(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ ugf(byte b2) {
        this.a = b2;
    }

    @Override // eif
    public final tif zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!wgf.class.isAssignableFrom(cls)) {
                    u36.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (tif) wgf.k(cls.asSubclass(wgf.class)).h(3, null);
                } catch (Exception e) {
                    rjb.k("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // eif
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return wgf.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
