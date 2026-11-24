// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v1e extends nne {
    private static final v1e zzh;
    private static volatile dwe zzi;
    private int zzc;
    private c1e zzd;
    private int zze;
    private m1e zzf;
    private b1e zzg;

    static {
        v1e v1eVar = new v1e();
        zzh = v1eVar;
        nne.g(v1e.class, v1eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new v1e();
            case 2:
                return new z0e(zzh);
            case 3:
                return new swe(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                dwe dweVar2 = zzi;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (v1e.class) {
                    dwe dweVar3 = zzi;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zzi = ineVar;
                        dweVar = ineVar;
                    }
                }
                return dweVar;
            case 6:
                return (byte) 1;
            default:
                fvc.b();
            case 7:
                return null;
        }
    }
}
