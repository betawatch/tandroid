// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x3e extends qpe {
    private static final x3e zzf;
    private static volatile fye zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        x3e x3eVar = new x3e();
        zzf = x3eVar;
        qpe.g(x3e.class, x3eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new x3e();
            case 2:
                return new c3e(zzf);
            case 3:
                return new uye(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                fye fyeVar2 = zzg;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (x3e.class) {
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
