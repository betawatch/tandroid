// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t8f extends vef {
    private static final t8f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        t8f t8fVar = new t8f();
        zzb = t8fVar;
        vef.e(t8f.class, t8fVar);
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new t8f();
        }
        if (i2 == 4) {
            return new v8e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
