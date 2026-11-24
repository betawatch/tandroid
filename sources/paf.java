// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class paf extends vef {
    private static final paf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private b3f zzg;

    static {
        paf pafVar = new paf();
        zzb = pafVar;
        vef.e(paf.class, pafVar);
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", eef.w, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new paf();
        }
        if (i2 == 4) {
            return new v8f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
