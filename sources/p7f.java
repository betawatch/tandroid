// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p7f extends wgf {
    private static final p7f zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        p7f p7fVar = new p7f();
        zzb = p7fVar;
        wgf.e(p7f.class, p7fVar);
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new p7f();
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
