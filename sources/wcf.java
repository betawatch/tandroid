// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wcf extends wgf {
    private static final wcf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private ehf zzg;
    private ehf zzh;
    private int zzi;

    static {
        wcf wcfVar = new wcf();
        zzb = wcfVar;
        wgf.e(wcf.class, wcfVar);
    }

    public wcf() {
        sif sifVar = sif.d;
        this.zzg = sifVar;
        this.zzh = sifVar;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", jk2.y, "zzf", nf5.y, "zzg", j8f.class, "zzh", j8f.class, "zzi", jk2.r});
        }
        if (i2 == 3) {
            return new wcf();
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
