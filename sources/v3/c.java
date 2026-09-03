package v3;

import cb.e;
import h5.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c extends e {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable L(int i10, w wVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(wVar.o()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(wVar.u() == 1);
        }
        if (i10 == 2) {
            return N(wVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return M(wVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(wVar.o()));
                wVar.G(2);
                return date;
            }
            int x10 = wVar.x();
            ArrayList arrayList = new ArrayList(x10);
            for (int i11 = 0; i11 < x10; i11++) {
                Serializable L = L(wVar.u(), wVar);
                if (L != null) {
                    arrayList.add(L);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String N = N(wVar);
            int u10 = wVar.u();
            if (u10 == 9) {
                return hashMap;
            }
            Serializable L2 = L(u10, wVar);
            if (L2 != null) {
                hashMap.put(N, L2);
            }
        }
    }

    public static HashMap M(w wVar) {
        int x10 = wVar.x();
        HashMap hashMap = new HashMap(x10);
        for (int i10 = 0; i10 < x10; i10++) {
            String N = N(wVar);
            Serializable L = L(wVar.u(), wVar);
            if (L != null) {
                hashMap.put(N, L);
            }
        }
        return hashMap;
    }

    public static String N(w wVar) {
        int z4 = wVar.z();
        int i10 = wVar.b;
        wVar.G(z4);
        return new String(wVar.a, i10, z4);
    }
}
