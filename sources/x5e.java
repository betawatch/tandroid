// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x5e extends ese {
    private static final x5e zzl;
    private static volatile u0f zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private bue zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private bue zzk;

    static {
        x5e x5eVar = new x5e();
        zzl = x5eVar;
        ese.g(x5e.class, x5eVar);
    }

    public x5e() {
        l1f l1fVar = l1f.d;
        this.zzf = l1fVar;
        this.zzh = "";
        this.zzk = l1fVar;
    }

    public static w5e m() {
        return (w5e) ((ase) zzl.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new x5e();
            case 2:
                return new w5e(zzl);
            case 3:
                return new j1f(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", r7e.c, "zzh", "zzi", "zzj", "zzk", l6e.class});
            case 4:
                return zzl;
            case 5:
                u0f u0fVar2 = zzm;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (x5e.class) {
                    u0f u0fVar3 = zzm;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zzm = zreVar;
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

    public final void j(long j) {
        this.zzc |= 16;
        this.zzi = j;
    }

    public final void k(List list) {
        bue bueVar = this.zzk;
        if (!bueVar.zza()) {
            int size = bueVar.size();
            this.zzk = bueVar.zza(size == 0 ? 10 : size << 1);
        }
        hie.a(list, this.zzk);
    }

    public final void l(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final void n(long j) {
        this.zzc |= 32;
        this.zzj = j;
    }
}
