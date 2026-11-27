// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uve extends s6e {
    private static final uve zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        uve uveVar = new uve();
        zzb = uveVar;
        s6e.k(uve.class, uveVar);
    }

    public static /* synthetic */ void n(uve uveVar, boolean z) {
        uveVar.zzd |= 8;
        uveVar.zzh = z;
    }

    public static /* synthetic */ void o(uve uveVar) {
        uveVar.zzd |= 16;
        uveVar.zzi = 0;
    }

    public static /* synthetic */ void p(uve uveVar, long j) {
        uveVar.zzd |= 4;
        uveVar.zzg = j;
    }

    public static /* synthetic */ void q(uve uveVar) {
        uveVar.zzd |= 2;
        uveVar.zzf = true;
    }

    public static mve r() {
        return (mve) zzb.f();
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new uve();
        }
        if (i2 == 4) {
            return new mve(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
