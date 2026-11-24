// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r3e extends qpe {
    private static final r3e zzg;
    private static volatile fye zzh;
    private int zzc;
    private u3e zzd;
    private w3e zze;
    private nre zzf = wye.d;

    static {
        r3e r3eVar = new r3e();
        zzg = r3eVar;
        qpe.g(r3e.class, r3eVar);
    }

    public static q3e l() {
        return (q3e) ((mpe) zzg.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new r3e();
            case 2:
                return new q3e(zzg);
            case 3:
                return new uye(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", k3e.class});
            case 4:
                return zzg;
            case 5:
                fye fyeVar2 = zzh;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (r3e.class) {
                    fye fyeVar3 = zzh;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzh = lpeVar;
                        fyeVar = lpeVar;
                    }
                }
                return fyeVar;
            case 6:
                return (byte) 1;
            default:
                gxc.b();
            case 7:
                return null;
        }
    }

    public final void j(u3e u3eVar) {
        this.zzd = u3eVar;
        this.zzc |= 1;
    }

    public final void k(ArrayList arrayList) {
        nre nreVar = this.zzf;
        if (!nreVar.zza()) {
            int size = nreVar.size();
            this.zzf = nreVar.zza(size == 0 ? 10 : size << 1);
        }
        rfe.a(arrayList, this.zzf);
    }
}
