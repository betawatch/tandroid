// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vaf extends vef {
    private static final vaf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private dff zzg;
    private dff zzh;
    private int zzi;

    static {
        vaf vafVar = new vaf();
        zzb = vafVar;
        vef.e(vaf.class, vafVar);
    }

    public vaf() {
        rgf rgfVar = rgf.d;
        this.zzg = rgfVar;
        this.zzh = rgfVar;
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", vi2.y, "zzf", pd5.y, "zzg", h6f.class, "zzh", h6f.class, "zzi", vi2.r});
        }
        if (i2 == 3) {
            return new vaf();
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
