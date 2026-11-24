// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zpe extends c2e {
    private static final zpe zzb;
    private int zzd;
    private fje zze;
    private long zzf;

    static {
        zpe zpeVar = new zpe();
        zzb = zpeVar;
        c2e.k(zpe.class, zpeVar);
    }

    public static /* synthetic */ void n(zpe zpeVar, fje fjeVar) {
        zpeVar.zze = fjeVar;
        zpeVar.zzd |= 1;
    }

    public static /* synthetic */ void o(zpe zpeVar, long j) {
        zpeVar.zzd |= 2;
        zpeVar.zzf = j;
    }

    public static ope p() {
        return (ope) zzb.f();
    }

    @Override // c2e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vae(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zpe();
        }
        if (i2 == 4) {
            return new ope(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
