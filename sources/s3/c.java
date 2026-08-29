package s3;

import ab.e;
import f5.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends e {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable Q(int i10, w wVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(wVar.l()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(wVar.r() == 1);
        }
        if (i10 == 2) {
            return S(wVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return R(wVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(wVar.l()));
                wVar.D(2);
                return date;
            }
            int u10 = wVar.u();
            ArrayList arrayList = new ArrayList(u10);
            for (int i11 = 0; i11 < u10; i11++) {
                Serializable Q = Q(wVar.r(), wVar);
                if (Q != null) {
                    arrayList.add(Q);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String S = S(wVar);
            int r6 = wVar.r();
            if (r6 == 9) {
                return hashMap;
            }
            Serializable Q2 = Q(r6, wVar);
            if (Q2 != null) {
                hashMap.put(S, Q2);
            }
        }
    }

    public static HashMap R(w wVar) {
        int u10 = wVar.u();
        HashMap hashMap = new HashMap(u10);
        for (int i10 = 0; i10 < u10; i10++) {
            String S = S(wVar);
            Serializable Q = Q(wVar.r(), wVar);
            if (Q != null) {
                hashMap.put(S, Q);
            }
        }
        return hashMap;
    }

    public static String S(w wVar) {
        int w10 = wVar.w();
        int i10 = wVar.b;
        wVar.D(w10);
        return new String(wVar.a, i10, w10);
    }
}
