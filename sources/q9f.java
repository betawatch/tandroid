// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class q9f extends vef {
    private static final q9f zzb;
    private int zzd;
    private dff zze;
    private dff zzf;
    private faf zzg;

    static {
        q9f q9fVar = new q9f();
        zzb = q9fVar;
        vef.e(q9f.class, q9fVar);
    }

    public q9f() {
        rgf rgfVar = rgf.d;
        this.zze = rgfVar;
        this.zzf = rgfVar;
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", paf.class, "zzf", c6f.class, "zzg"});
        }
        if (i2 == 3) {
            return new q9f();
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
