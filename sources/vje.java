// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vje extends c2e {
    private static final vje zzb;

    static {
        vje vjeVar = new vje();
        zzb = vjeVar;
        c2e.k(vje.class, vjeVar);
    }

    public static vje n() {
        return zzb;
    }

    @Override // c2e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vae(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new vje();
        }
        if (i2 == 4) {
            return new epd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
