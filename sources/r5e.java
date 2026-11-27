// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class r5e extends ese {
    private static final r5e zzg;
    private static volatile u0f zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        r5e r5eVar = new r5e();
        zzg = r5eVar;
        ese.g(r5e.class, r5eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new r5e();
            case 2:
                return new p5e(zzg);
            case 3:
                return new j1f(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", r7e.h, "zze", r7e.i, "zzf"});
            case 4:
                return zzg;
            case 5:
                u0f u0fVar2 = zzh;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (r5e.class) {
                    u0f u0fVar3 = zzh;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zzh = zreVar;
                        u0fVar = zreVar;
                    }
                }
                return u0fVar;
            case 6:
                return (byte) 1;
            default:
                p3d.a();
            case 7:
                return null;
        }
    }
}
