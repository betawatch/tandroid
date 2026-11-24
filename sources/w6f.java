// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w6f extends wgf {
    private static final w6f zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        w6f w6fVar = new w6f();
        zzb = w6fVar;
        wgf.e(w6f.class, w6fVar);
    }

    public static u6f l() {
        return (u6f) zzb.j();
    }

    public static /* synthetic */ void m(w6f w6fVar, int i) {
        w6fVar.zzd |= 2;
        w6fVar.zzf = i;
    }

    public static /* synthetic */ void n(w6f w6fVar, int i) {
        w6fVar.zze = i - 1;
        w6fVar.zzd |= 1;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", q7f.y, "zzf"});
        }
        if (i2 == 3) {
            return new w6f();
        }
        if (i2 == 4) {
            return new u6f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
