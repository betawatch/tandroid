package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class o9 {
    public static HashMap a(wc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", p9.e(aVar.a));
        hashMap2.put("cvc", p9.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", p9.e(aVar.e));
        hashMap2.put("currency", p9.e(aVar.n));
        hashMap2.put("address_line1", p9.e(aVar.f));
        hashMap2.put("address_line2", p9.e(aVar.g));
        hashMap2.put("address_city", p9.e(aVar.h));
        hashMap2.put("address_zip", p9.e(aVar.j));
        hashMap2.put("address_state", p9.e(aVar.i));
        hashMap2.put("address_country", p9.e(aVar.k));
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
