// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y3e extends qpe {
    private static final y3e zzh;
    private static volatile fye zzi;
    private int zzc;
    private f3e zzd;
    private int zze;
    private p3e zzf;
    private e3e zzg;

    static {
        y3e y3eVar = new y3e();
        zzh = y3eVar;
        qpe.g(y3e.class, y3eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new y3e();
            case 2:
                return new c3e(zzh);
            case 3:
                return new uye(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                fye fyeVar2 = zzi;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (y3e.class) {
                    fye fyeVar3 = zzi;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzi = lpeVar;
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
