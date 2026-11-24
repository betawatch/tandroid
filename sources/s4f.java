// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s4f extends wgf {
    private static final ahf zzb = new jed();
    private static final s4f zzd;
    private int zze;
    private k5f zzf;
    private gaf zzg;
    private ehf zzh = sif.d;
    private zgf zzi = xgf.d;

    static {
        s4f s4fVar = new s4f();
        zzd = s4fVar;
        wgf.e(s4f.class, s4fVar);
    }

    public static p4f l() {
        return (p4f) zzd.j();
    }

    public static /* synthetic */ void m(s4f s4fVar, k5f k5fVar) {
        s4fVar.zzf = k5fVar;
        s4fVar.zze |= 1;
    }

    public static void n(s4f s4fVar, ArrayList arrayList) {
        ehf ehfVar = s4fVar.zzi;
        if (!((mff) ehfVar).a) {
            int size = ehfVar.size();
            int i = size == 0 ? 10 : size << 1;
            xgf xgfVar = (xgf) ehfVar;
            if (i < xgfVar.c) {
                i98.g();
                return;
            }
            s4fVar.zzi = new xgf(Arrays.copyOf(xgfVar.b, i), xgfVar.c, true);
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            ((xgf) s4fVar.zzi).zzh(((m3f) obj).a);
        }
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", aaf.class, "zzi", k1f.E});
        }
        if (i2 == 3) {
            return new s4f();
        }
        if (i2 == 4) {
            return new p4f(zzd);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
