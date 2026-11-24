// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p4f extends vef {
    private static final p4f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        p4f p4fVar = new p4f();
        zzb = p4fVar;
        vef.e(p4f.class, p4fVar);
    }

    public static n4f l() {
        return (n4f) zzb.j();
    }

    public static /* synthetic */ void m(p4f p4fVar, int i) {
        p4fVar.zzd |= 2;
        p4fVar.zzf = i;
    }

    public static /* synthetic */ void n(p4f p4fVar, int i) {
        p4fVar.zzd |= 4;
        p4fVar.zzg = i;
    }

    public static /* synthetic */ void o(p4f p4fVar, int i) {
        p4fVar.zzd |= 8;
        p4fVar.zzh = i;
    }

    public static /* synthetic */ void p(p4f p4fVar, int i) {
        p4fVar.zze = i - 1;
        p4fVar.zzd |= 1;
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", pd5.x, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new p4f();
        }
        if (i2 == 4) {
            return new n4f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
