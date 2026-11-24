// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wqe extends f4e {
    private static final wqe zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private nne zzg;
    private zne zzh;

    static {
        wqe wqeVar = new wqe();
        zzb = wqeVar;
        f4e.k(wqe.class, wqeVar);
    }

    public static /* synthetic */ void n(wqe wqeVar, gje gjeVar) {
        wqeVar.zzf = gjeVar;
        wqeVar.zze = 2;
    }

    public static /* synthetic */ void o(wqe wqeVar, gke gkeVar) {
        wqeVar.zzf = gkeVar;
        wqeVar.zze = 3;
    }

    public static /* synthetic */ void p(wqe wqeVar, xle xleVar) {
        xleVar.getClass();
        wqeVar.zzf = xleVar;
        wqeVar.zze = 7;
    }

    public static /* synthetic */ void q(wqe wqeVar, nne nneVar) {
        nneVar.getClass();
        wqeVar.zzg = nneVar;
        wqeVar.zzd |= 1;
    }

    public static /* synthetic */ void r(wqe wqeVar, cse cseVar) {
        wqeVar.zzf = cseVar;
        wqeVar.zze = 8;
    }

    public static /* synthetic */ void s(wqe wqeVar, rse rseVar) {
        wqeVar.zzf = rseVar;
        wqeVar.zze = 4;
    }

    public static nqe t() {
        return (nqe) zzb.f();
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", gje.class, gke.class, rse.class, xme.class, "zzh", xle.class, cse.class});
        }
        if (i2 == 3) {
            return new wqe();
        }
        if (i2 == 4) {
            return new nqe(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
