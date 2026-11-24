// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t1e extends nne {
    private static final t1e zzf;
    private static volatile dwe zzg;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        t1e t1eVar = new t1e();
        zzf = t1eVar;
        nne.g(t1e.class, t1eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new t1e();
            case 2:
                return new z0e(zzf);
            case 3:
                return new swe(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                dwe dweVar2 = zzg;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (t1e.class) {
                    dwe dweVar3 = zzg;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zzg = ineVar;
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
