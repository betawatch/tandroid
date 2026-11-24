// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z7f extends wgf {
    private static final z7f zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;

    static {
        z7f z7fVar = new z7f();
        zzb = z7fVar;
        wgf.e(z7f.class, z7fVar);
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zzf", "zze", "zzd", "zzg"});
        }
        if (i2 == 3) {
            return new z7f();
        }
        if (i2 == 4) {
            return new wae(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
