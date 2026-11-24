// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qsd extends f4e {
    private static final qsd zzb;
    private int zzd;
    private String zze = "";

    static {
        qsd qsdVar = new qsd();
        zzb = qsdVar;
        f4e.k(qsd.class, qsdVar);
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new qsd();
        }
        if (i2 == 4) {
            return new hrd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
