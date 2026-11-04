package x7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c5 {
    public static HashMap a(rc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", d5.e(aVar.a));
        hashMap2.put("cvc", d5.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", d5.e(aVar.e));
        hashMap2.put("currency", d5.e(aVar.n));
        hashMap2.put("address_line1", d5.e(aVar.f));
        hashMap2.put("address_line2", d5.e(aVar.g));
        hashMap2.put("address_city", d5.e(aVar.h));
        hashMap2.put("address_zip", d5.e(aVar.j));
        hashMap2.put("address_state", d5.e(aVar.i));
        hashMap2.put("address_country", d5.e(aVar.k));
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
