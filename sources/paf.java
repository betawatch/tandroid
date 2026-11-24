// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class paf extends wgf {
    private static final paf zzb;
    private int zzd;
    private long zze;
    private chf zzf;
    private chf zzg;

    static {
        paf pafVar = new paf();
        zzb = pafVar;
        wgf.e(paf.class, pafVar);
    }

    public paf() {
        aif aifVar = aif.d;
        this.zzf = aifVar;
        this.zzg = aifVar;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new paf();
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
