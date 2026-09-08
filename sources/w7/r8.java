package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class r8 {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", s8.e(aVar.a));
        hashMap2.put("cvc", s8.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", s8.e(aVar.e));
        hashMap2.put("currency", s8.e(aVar.n));
        hashMap2.put("address_line1", s8.e(aVar.f));
        hashMap2.put("address_line2", s8.e(aVar.g));
        hashMap2.put("address_city", s8.e(aVar.h));
        hashMap2.put("address_zip", s8.e(aVar.j));
        hashMap2.put("address_state", s8.e(aVar.i));
        hashMap2.put("address_country", s8.e(aVar.k));
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
