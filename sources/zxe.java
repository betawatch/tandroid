// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zxe {
    public static rxe a(Object obj, Object obj2) {
        rxe rxeVar = (rxe) obj;
        rxe rxeVar2 = (rxe) obj2;
        if (!rxeVar2.isEmpty()) {
            if (!rxeVar.a) {
                if (rxeVar.isEmpty()) {
                    rxeVar = new rxe();
                } else {
                    rxe rxeVar3 = new rxe(rxeVar);
                    rxeVar3.a = true;
                    rxeVar = rxeVar3;
                }
            }
            rxeVar.c();
            if (!rxeVar2.isEmpty()) {
                rxeVar.putAll(rxeVar2);
            }
        }
        return rxeVar;
    }

    public static void b(Object obj, Object obj2) {
        rxe rxeVar = (rxe) obj;
        if (obj2 != null) {
            grb.o();
            return;
        }
        if (rxeVar.isEmpty()) {
            return;
        }
        Iterator it = rxeVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }
}
