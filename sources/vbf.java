// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vbf extends wgf {
    private static final vbf zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        vbf vbfVar = new vbf();
        zzb = vbfVar;
        wgf.e(vbf.class, vbfVar);
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            nf5 nf5Var = nf5.w;
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", nf5Var, "zzf", nf5Var});
        }
        if (i2 == 3) {
            return new vbf();
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
