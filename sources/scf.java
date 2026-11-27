// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class scf extends ljf {
    private static final scf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        scf scfVar = new scf();
        zzb = scfVar;
        ljf.e(scf.class, scfVar);
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", qf5.s, "zzf", "zzg", sjf.F});
        }
        if (i2 == 3) {
            return new scf();
        }
        if (i2 == 4) {
            return new lde(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = ljfVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
