// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class z7f extends ljf {
    private static final z7f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        z7f z7fVar = new z7f();
        zzb = z7fVar;
        ljf.e(z7f.class, z7fVar);
    }

    public static x7f l() {
        return (x7f) zzb.j();
    }

    public static /* synthetic */ void m(z7f z7fVar, String str) {
        str.getClass();
        z7fVar.zzd |= 1;
        z7fVar.zze = str;
    }

    public static /* synthetic */ void n(z7f z7fVar, String str) {
        str.getClass();
        z7fVar.zzd |= 2;
        z7fVar.zzf = str;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new z7f();
        }
        if (i2 == 4) {
            return new x7f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
