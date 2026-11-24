// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x1e extends nne {
    private static final x1e zzi;
    private static volatile dwe zzj;
    private int zzc;
    private e1e zzd;
    private s1e zze;
    private o1e zzf;
    private int zzg;
    private boolean zzh;

    static {
        x1e x1eVar = new x1e();
        zzi = x1eVar;
        nne.g(x1e.class, x1eVar);
    }

    public static w1e k() {
        return (w1e) ((jne) zzi.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new x1e();
            case 2:
                return new w1e(zzi);
            case 3:
                return new swe(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                dwe dweVar2 = zzj;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (x1e.class) {
                    dwe dweVar3 = zzj;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zzj = ineVar;
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

    public final void j(o1e o1eVar) {
        this.zzf = o1eVar;
        this.zzc |= 4;
    }
}
