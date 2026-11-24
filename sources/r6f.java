// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r6f extends wgf {
    private static final r6f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        r6f r6fVar = new r6f();
        zzb = r6fVar;
        wgf.e(r6f.class, r6fVar);
    }

    public static p6f l() {
        return (p6f) zzb.j();
    }

    public static /* synthetic */ void m(r6f r6fVar, int i) {
        r6fVar.zzd |= 2;
        r6fVar.zzf = i;
    }

    public static /* synthetic */ void n(r6f r6fVar, int i) {
        r6fVar.zzd |= 4;
        r6fVar.zzg = i;
    }

    public static /* synthetic */ void o(r6f r6fVar, int i) {
        r6fVar.zzd |= 8;
        r6fVar.zzh = i;
    }

    public static /* synthetic */ void p(r6f r6fVar, int i) {
        r6fVar.zze = i - 1;
        r6fVar.zzd |= 1;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", nf5.x, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new r6f();
        }
        if (i2 == 4) {
            return new p6f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
