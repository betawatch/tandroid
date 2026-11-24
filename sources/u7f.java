// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u7f extends wgf {
    private static final u7f zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        u7f u7fVar = new u7f();
        zzb = u7fVar;
        wgf.e(u7f.class, u7fVar);
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", k4f.r, "zzf", f8e.h});
        }
        if (i2 == 3) {
            return new u7f();
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
