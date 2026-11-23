package s2;

import a8.ma;
import a8.p0;
import android.net.Uri;
import e2.t0;
import h9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class x {
    public final w a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public x(w wVar, String str, Uri uri, int i7) {
        this.a = wVar;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i7 != -1) {
            arrayList.add(Integer.valueOf(i7));
        }
    }

    public static i0 a(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i7 = 0; i7 < list.size(); i7++) {
            o oVar = (o) list.get(i7);
            Uri uri = oVar.a;
            try {
                d(oVar.a, null, i7, arrayList, new w(oVar.b, oVar.d, oVar.c), hashMap, hashMap2);
            } catch (t0 unused) {
            }
        }
        return i0.q(arrayList);
    }

    public static i0 b(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i7 = 0; i7 < list.size(); i7++) {
            p pVar = (p) list.get(i7);
            d(pVar.a, pVar.g, i7, arrayList, new w(pVar.b, pVar.h, null), hashMap, hashMap2);
        }
        return i0.q(arrayList);
    }

    public static void d(Uri uri, String str, int i7, ArrayList arrayList, w wVar, HashMap hashMap, HashMap hashMap2) {
        int i10;
        String str2;
        Integer num = (Integer) hashMap.get(wVar);
        int i11 = 1;
        if (num == null) {
            hashMap2.put(wVar, 0);
            if (str == null) {
                hashMap2.put(wVar, 1);
                str = ".";
            }
            x xVar = new x(wVar, str, uri, i7);
            hashMap.put(wVar, Integer.valueOf(arrayList.size()));
            arrayList.add(xVar);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) hashMap2.get(wVar);
            num2.getClass();
            int intValue = num2.intValue() + 1;
            if (intValue <= 1) {
                ma.c(intValue, "invalid count: %s", intValue >= 0);
                str2 = intValue == 0 ? "" : ".";
            } else {
                long j3 = 1 * intValue;
                int i12 = (int) j3;
                if (i12 != j3) {
                    throw new ArrayIndexOutOfBoundsException(p0.o(j3, "Required array size too large: "));
                }
                char[] cArr = new char[i12];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i10 = i12 - i11;
                    if (i11 >= i10) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i11, i11);
                    i11 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i11, i10);
                str2 = new String(cArr);
            }
            hashMap2.put(wVar, Integer.valueOf(intValue));
            str = str2;
        }
        x xVar2 = (x) arrayList.get(num.intValue());
        Uri uri2 = (Uri) xVar2.b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw t0.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }
        xVar2.b.put(str, uri);
        if (i7 != -1) {
            xVar2.c.add(Integer.valueOf(i7));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
