// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x8f extends vef {
    private static final x8f zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        x8f x8fVar = new x8f();
        zzb = x8fVar;
        vef.e(x8f.class, x8fVar);
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new x8f();
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
