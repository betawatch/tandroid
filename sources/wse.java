// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wse extends s6e {
    private static final wse zzb;
    private int zzd;
    private q7e zze = ffe.e;
    private String zzf = "";
    private boolean zzg;

    static {
        wse wseVar = new wse();
        zzb = wseVar;
        s6e.k(wse.class, wseVar);
    }

    public static /* synthetic */ void n(wse wseVar, boolean z) {
        wseVar.zzd |= 2;
        wseVar.zzg = z;
    }

    public static wse o() {
        return zzb;
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", mse.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new wse();
        }
        if (i2 == 4) {
            return new wre(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
