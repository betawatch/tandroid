// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class q2f extends vef {
    private static final zef zzb = new hcd();
    private static final q2f zzd;
    private int zze;
    private i3f zzf;
    private e8f zzg;
    private dff zzh = rgf.d;
    private yef zzi = wef.d;

    static {
        q2f q2fVar = new q2f();
        zzd = q2fVar;
        vef.e(q2f.class, q2fVar);
    }

    public static n2f l() {
        return (n2f) zzd.j();
    }

    public static /* synthetic */ void m(q2f q2fVar, i3f i3fVar) {
        q2fVar.zzf = i3fVar;
        q2fVar.zze |= 1;
    }

    public static void n(q2f q2fVar, ArrayList arrayList) {
        List list = q2fVar.zzi;
        if (!((ldf) list).a) {
            int size = list.size();
            int i = size == 0 ? 10 : size << 1;
            wef wefVar = (wef) list;
            if (i < wefVar.c) {
                sc8.e();
                return;
            }
            q2fVar.zzi = new wef(Arrays.copyOf(wefVar.b, i), wefVar.c, true);
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            ((wef) q2fVar.zzi).zzh(((k1f) obj).a);
        }
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", y7f.class, "zzi", ize.E});
        }
        if (i2 == 3) {
            return new q2f();
        }
        if (i2 == 4) {
            return new n2f(zzd);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
