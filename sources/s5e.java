// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class s5e extends ese {
    private static final s5e zzd;
    private static volatile u0f zze;
    private bue zzc = l1f.d;

    static {
        s5e s5eVar = new s5e();
        zzd = s5eVar;
        ese.g(s5e.class, s5eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new s5e();
            case 2:
                return new p5e(zzd);
            case 3:
                return new j1f(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", k6e.class});
            case 4:
                return zzd;
            case 5:
                u0f u0fVar2 = zze;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (s5e.class) {
                    u0f u0fVar3 = zze;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zze = zreVar;
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
