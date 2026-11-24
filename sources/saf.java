// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class saf extends vef {
    private static final saf zzb;
    private int zzd;
    private int zze;
    private dff zzf;
    private dff zzg;
    private int zzh;

    static {
        saf safVar = new saf();
        zzb = safVar;
        vef.e(saf.class, safVar);
    }

    public saf() {
        rgf rgfVar = rgf.d;
        this.zzf = rgfVar;
        this.zzg = rgfVar;
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", eef.x, "zzf", x8f.class, "zzg", x8f.class, "zzh"});
        }
        if (i2 == 3) {
            return new saf();
        }
        if (i2 == 4) {
            return new v8f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
