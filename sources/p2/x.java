package p2;

import android.net.Uri;
import b2.w0;
import e9.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class x {
    public final w a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public x(w wVar, String str, Uri uri, int i10) {
        this.a = wVar;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i10 != -1) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public static n0 a(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            o oVar = (o) list.get(i10);
            Uri uri = oVar.a;
            try {
                d(oVar.a, null, i10, arrayList, new w(oVar.b, oVar.d, oVar.c), hashMap, hashMap2);
            } catch (w0 unused) {
            }
        }
        return n0.u(arrayList);
    }

    public static n0 b(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            p pVar = (p) list.get(i10);
            d(pVar.a, pVar.g, i10, arrayList, new w(pVar.b, pVar.h, null), hashMap, hashMap2);
        }
        return n0.u(arrayList);
    }

    public static void d(Uri uri, String str, int i10, ArrayList arrayList, w wVar, HashMap hashMap, HashMap hashMap2) {
        int i11;
        String str2;
        Integer num = (Integer) hashMap.get(wVar);
        int i12 = 1;
        if (num == null) {
            hashMap2.put(wVar, 0);
            if (str == null) {
                hashMap2.put(wVar, 1);
                str = ".";
            }
            x xVar = new x(wVar, str, uri, i10);
            hashMap.put(wVar, Integer.valueOf(arrayList.size()));
            arrayList.add(xVar);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) hashMap2.get(wVar);
            num2.getClass();
            int intValue = num2.intValue() + 1;
            if (intValue <= 1) {
                u6.b(intValue, "invalid count: %s", intValue >= 0);
                str2 = intValue == 0 ? "" : ".";
            } else {
                long j10 = 1 * intValue;
                int i13 = (int) j10;
                if (i13 != j10) {
                    throw new ArrayIndexOutOfBoundsException(a1.g.o(j10, "Required array size too large: "));
                }
                char[] cArr = new char[i13];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i11 = i13 - i12;
                    if (i12 >= i11) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i12, i12);
                    i12 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i12, i11);
                str2 = new String(cArr);
            }
            hashMap2.put(wVar, Integer.valueOf(intValue));
            str = str2;
        }
        x xVar2 = (x) arrayList.get(num.intValue());
        Uri uri2 = (Uri) xVar2.b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw w0.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }
        xVar2.b.put(str, uri);
        if (i10 != -1) {
            xVar2.c.add(Integer.valueOf(i10));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
