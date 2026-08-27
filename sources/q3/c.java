package q3;

import d5.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends b8.a {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable Q(int i10, z zVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(zVar.l()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(zVar.r() == 1);
        }
        if (i10 == 2) {
            return S(zVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return R(zVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(zVar.l()));
                zVar.D(2);
                return date;
            }
            int u10 = zVar.u();
            ArrayList arrayList = new ArrayList(u10);
            for (int i11 = 0; i11 < u10; i11++) {
                Serializable Q = Q(zVar.r(), zVar);
                if (Q != null) {
                    arrayList.add(Q);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String S = S(zVar);
            int r10 = zVar.r();
            if (r10 == 9) {
                return hashMap;
            }
            Serializable Q2 = Q(r10, zVar);
            if (Q2 != null) {
                hashMap.put(S, Q2);
            }
        }
    }

    public static HashMap R(z zVar) {
        int u10 = zVar.u();
        HashMap hashMap = new HashMap(u10);
        for (int i10 = 0; i10 < u10; i10++) {
            String S = S(zVar);
            Serializable Q = Q(zVar.r(), zVar);
            if (Q != null) {
                hashMap.put(S, Q);
            }
        }
        return hashMap;
    }

    public static String S(z zVar) {
        int w10 = zVar.w();
        int i10 = zVar.b;
        zVar.D(w10);
        return new String(zVar.a, i10, w10);
    }
}
