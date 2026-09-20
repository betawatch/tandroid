package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class t8 {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", u8.e(aVar.a));
        hashMap2.put("cvc", u8.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", u8.e(aVar.e));
        hashMap2.put("currency", u8.e(aVar.n));
        hashMap2.put("address_line1", u8.e(aVar.f));
        hashMap2.put("address_line2", u8.e(aVar.g));
        hashMap2.put("address_city", u8.e(aVar.h));
        hashMap2.put("address_zip", u8.e(aVar.j));
        hashMap2.put("address_state", u8.e(aVar.i));
        hashMap2.put("address_country", u8.e(aVar.k));
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
