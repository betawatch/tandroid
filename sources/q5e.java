// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class q5e extends ese {
    private static final lte zzd = new s9d((byte) 2);
    private static final q5e zze;
    private static volatile u0f zzf;
    private qte zzc = ese.i();

    /* JADX WARN: Type inference failed for: r0v0, types: [lte, s9d] */
    static {
        q5e q5eVar = new q5e();
        zze = q5eVar;
        ese.g(q5e.class, q5eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new q5e();
            case 2:
                return new p5e(zze);
            case 3:
                return new j1f(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", r7e.h});
            case 4:
                return zze;
            case 5:
                u0f u0fVar2 = zzf;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (q5e.class) {
                    u0f u0fVar3 = zzf;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zzf = zreVar;
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
