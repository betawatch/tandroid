// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u9f extends wgf {
    private static final u9f zzb;
    private int zzd;
    private ehf zze = sif.d;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        u9f u9fVar = new u9f();
        zzb = u9fVar;
        wgf.e(u9f.class, u9fVar);
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"zzd", "zze", x8f.class, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new u9f();
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
