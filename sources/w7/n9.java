package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class n9 {
    public static HashMap a(wc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", o9.e(aVar.a));
        hashMap2.put("cvc", o9.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", o9.e(aVar.e));
        hashMap2.put("currency", o9.e(aVar.n));
        hashMap2.put("address_line1", o9.e(aVar.f));
        hashMap2.put("address_line2", o9.e(aVar.g));
        hashMap2.put("address_city", o9.e(aVar.h));
        hashMap2.put("address_zip", o9.e(aVar.j));
        hashMap2.put("address_state", o9.e(aVar.i));
        hashMap2.put("address_country", o9.e(aVar.k));
        Iterator it = new HashSet(hashMap2.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashMap2.get(str) == null) {
                hashMap2.remove(str);
            }
        }
        hashMap.put("card", hashMap2);
        return hashMap;
    }
}
