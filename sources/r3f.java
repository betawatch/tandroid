// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class r3f extends vef {
    private static final r3f zzb;
    private int zzd;
    private int zze;

    static {
        r3f r3fVar = new r3f();
        zzb = r3fVar;
        vef.e(r3f.class, r3fVar);
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", cff.r});
        }
        if (i2 == 3) {
            return new r3f();
        }
        if (i2 == 4) {
            return new v8e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
