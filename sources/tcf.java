// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tcf extends wgf {
    private static final tcf zzb;
    private int zzd;
    private int zze;
    private ehf zzf;
    private ehf zzg;
    private int zzh;

    static {
        tcf tcfVar = new tcf();
        zzb = tcfVar;
        wgf.e(tcf.class, tcfVar);
    }

    public tcf() {
        sif sifVar = sif.d;
        this.zzf = sifVar;
        this.zzg = sifVar;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", fgf.x, "zzf", zaf.class, "zzg", zaf.class, "zzh"});
        }
        if (i2 == 3) {
            return new tcf();
        }
        if (i2 == 4) {
            return new xaf(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
