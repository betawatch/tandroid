// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tef extends ljf {
    private static final tef zzb;
    private int zzd;
    private String zze = "";
    private tjf zzf;
    private tjf zzg;
    private boolean zzh;

    static {
        tef tefVar = new tef();
        zzb = tefVar;
        ljf.e(tef.class, tefVar);
    }

    public tef() {
        hlf hlfVar = hlf.d;
        this.zzf = hlfVar;
        this.zzg = hlfVar;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", vbf.class, "zzg", yaf.class, "zzh"});
        }
        if (i2 == 3) {
            return new tef();
        }
        if (i2 == 4) {
            return new mdf(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
