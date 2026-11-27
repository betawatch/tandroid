// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y8f extends ljf {
    private static final y8f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        y8f y8fVar = new y8f();
        zzb = y8fVar;
        ljf.e(y8f.class, y8fVar);
    }

    public static w8f l() {
        return (w8f) zzb.j();
    }

    public static /* synthetic */ void m(y8f y8fVar, int i) {
        y8fVar.zzd |= 2;
        y8fVar.zzf = i;
    }

    public static /* synthetic */ void n(y8f y8fVar, int i) {
        y8fVar.zzd |= 4;
        y8fVar.zzg = i;
    }

    public static /* synthetic */ void o(y8f y8fVar, boolean z) {
        y8fVar.zzd |= 8;
        y8fVar.zzh = z;
    }

    public static /* synthetic */ void p(y8f y8fVar, int i) {
        y8fVar.zze = i - 1;
        y8fVar.zzd |= 1;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", rj2.x, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new y8f();
        }
        if (i2 == 4) {
            return new w8f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
