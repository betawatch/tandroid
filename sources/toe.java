// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class toe extends c2e {
    private static final toe zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private lle zzg;
    private xle zzh;

    static {
        toe toeVar = new toe();
        zzb = toeVar;
        c2e.k(toe.class, toeVar);
    }

    public static /* synthetic */ void n(toe toeVar, fhe fheVar) {
        toeVar.zzf = fheVar;
        toeVar.zze = 2;
    }

    public static /* synthetic */ void o(toe toeVar, fie fieVar) {
        toeVar.zzf = fieVar;
        toeVar.zze = 3;
    }

    public static /* synthetic */ void p(toe toeVar, vje vjeVar) {
        vjeVar.getClass();
        toeVar.zzf = vjeVar;
        toeVar.zze = 7;
    }

    public static /* synthetic */ void q(toe toeVar, lle lleVar) {
        lleVar.getClass();
        toeVar.zzg = lleVar;
        toeVar.zzd |= 1;
    }

    public static /* synthetic */ void r(toe toeVar, zpe zpeVar) {
        toeVar.zzf = zpeVar;
        toeVar.zze = 8;
    }

    public static /* synthetic */ void s(toe toeVar, oqe oqeVar) {
        toeVar.zzf = oqeVar;
        toeVar.zze = 4;
    }

    public static koe t() {
        return (koe) zzb.f();
    }

    @Override // c2e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vae(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", fhe.class, fie.class, oqe.class, vke.class, "zzh", vje.class, zpe.class});
        }
        if (i2 == 3) {
            return new toe();
        }
        if (i2 == 4) {
            return new koe(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
