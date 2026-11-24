// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rse extends f4e {
    private static final rse zzb;
    private int zzd;
    private int zze;

    static {
        rse rseVar = new rse();
        zzb = rseVar;
        f4e.k(rse.class, rseVar);
    }

    public static rse n() {
        return zzb;
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", btd.i});
        }
        if (i2 == 3) {
            return new rse();
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
