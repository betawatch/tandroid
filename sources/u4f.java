// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class u4f extends vef {
    private static final u4f zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        u4f u4fVar = new u4f();
        zzb = u4fVar;
        vef.e(u4f.class, u4fVar);
    }

    public static s4f l() {
        return (s4f) zzb.j();
    }

    public static /* synthetic */ void m(u4f u4fVar, int i) {
        u4fVar.zzd |= 2;
        u4fVar.zzf = i;
    }

    public static /* synthetic */ void n(u4f u4fVar, int i) {
        u4fVar.zze = i - 1;
        u4fVar.zzd |= 1;
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", o5f.y, "zzf"});
        }
        if (i2 == 3) {
            return new u4f();
        }
        if (i2 == 4) {
            return new s4f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
