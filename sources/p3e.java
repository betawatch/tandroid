// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p3e extends qpe {
    private static final p3e zzj;
    private static volatile fye zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    static {
        p3e p3eVar = new p3e();
        zzj = p3eVar;
        qpe.g(p3e.class, p3eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new p3e();
            case 2:
                return new c3e(zzj);
            case 3:
                return new uye(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                fye fyeVar2 = zzk;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (p3e.class) {
                    fye fyeVar3 = zzk;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzk = lpeVar;
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
