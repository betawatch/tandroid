// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
