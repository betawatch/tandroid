// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xle extends f4e {
    private static final xle zzb;

    static {
        xle xleVar = new xle();
        zzb = xleVar;
        f4e.k(xle.class, xleVar);
    }

    public static xle n() {
        return zzb;
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new xle();
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
