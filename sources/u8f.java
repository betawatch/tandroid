// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class u8f extends ljf {
    private static final u8f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        u8f u8fVar = new u8f();
        zzb = u8fVar;
        ljf.e(u8f.class, u8fVar);
    }

    public static s8f l() {
        return (s8f) zzb.j();
    }

    public static /* synthetic */ void m(u8f u8fVar, int i) {
        u8fVar.zzd |= 2;
        u8fVar.zzf = i;
    }

    public static /* synthetic */ void n(u8f u8fVar, int i) {
        u8fVar.zzd |= 4;
        u8fVar.zzg = i;
    }

    public static /* synthetic */ void o(u8f u8fVar, int i) {
        u8fVar.zzd |= 8;
        u8fVar.zzh = i;
    }

    public static /* synthetic */ void p(u8f u8fVar, int i) {
        u8fVar.zzd |= 16;
        u8fVar.zzi = i;
    }

    public static /* synthetic */ void q(u8f u8fVar, int i) {
        u8fVar.zze = i - 1;
        u8fVar.zzd |= 1;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", sjf.y, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new u8f();
        }
        if (i2 == 4) {
            return new s8f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
