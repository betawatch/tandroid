// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w3e extends qpe {
    private static final w3e zzf;
    private static volatile fye zzg;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        w3e w3eVar = new w3e();
        zzf = w3eVar;
        qpe.g(w3e.class, w3eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new w3e();
            case 2:
                return new c3e(zzf);
            case 3:
                return new uye(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                fye fyeVar2 = zzg;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (w3e.class) {
                    fye fyeVar3 = zzg;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzg = lpeVar;
                        fyeVar = lpeVar;
                    }
                }
                return fyeVar;
            case 6:
                return (byte) 1;
            default:
                gxc.b();
            case 7:
                return null;
        }
    }
}
