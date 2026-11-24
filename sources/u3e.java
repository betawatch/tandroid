// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u3e extends qpe {
    private static final u3e zzi;
    private static volatile fye zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        u3e u3eVar = new u3e();
        zzi = u3eVar;
        qpe.g(u3e.class, u3eVar);
    }

    public static t3e j() {
        return (t3e) ((mpe) zzi.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new u3e();
            case 2:
                return new t3e(zzi);
            case 3:
                return new uye(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", e5e.g, "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                fye fyeVar2 = zzj;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (u3e.class) {
                    fye fyeVar3 = zzj;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzj = lpeVar;
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

    public final void k(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    public final void l(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    public final void m(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    public final void n(long j) {
        this.zzc |= 16;
        this.zzh = j;
    }
}
