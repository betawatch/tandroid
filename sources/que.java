// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class que extends s6e {
    private static final que zzb;
    private int zzd;
    private wne zze;
    private long zzf;

    static {
        que queVar = new que();
        zzb = queVar;
        s6e.k(que.class, queVar);
    }

    public static /* synthetic */ void n(que queVar, wne wneVar) {
        queVar.zze = wneVar;
        queVar.zzd |= 1;
    }

    public static /* synthetic */ void o(que queVar, long j) {
        queVar.zzd |= 2;
        queVar.zzf = j;
    }

    public static fue p() {
        return (fue) zzb.f();
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new que();
        }
        if (i2 == 4) {
            return new fue(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
