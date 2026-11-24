// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y0e extends nne {
    private static final y0e zzf;
    private static volatile dwe zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        y0e y0eVar = new y0e();
        zzf = y0eVar;
        nne.g(y0e.class, y0eVar);
    }

    public static x0e k() {
        return (x0e) ((jne) zzf.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new y0e();
            case 2:
                return new x0e(zzf);
            case 3:
                return new swe(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                dwe dweVar2 = zzg;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (y0e.class) {
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

    public final void j(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final void m(String str) {
        this.zzc |= 2;
        this.zze = str;
    }
}
