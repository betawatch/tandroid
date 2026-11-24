// default package

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x13 implements op4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x13(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // op4
    public final Object invoke() {
        String[] names;
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((qp4) obj2).invoke(((c59) obj).a);
                return g5cVar;
            case 1:
                ((qp4) obj2).invoke(((c59) obj).a);
                return g5cVar;
            default:
                w4a w4aVar = (w4a) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                kad.a((lu5) obj, w4aVar);
                int f = w4aVar.f();
                for (int i = 0; i < f; i++) {
                    List h = w4aVar.h(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : h) {
                        if (obj3 instanceof uu5) {
                            arrayList.add(obj3);
                        }
                    }
                    uu5 uu5Var = (uu5) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (uu5Var != null && (names = uu5Var.names()) != null) {
                        for (String str : names) {
                            String str2 = rp5.a(w4aVar.e(), y4a.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new tu5("The suggested name '" + str + "' for " + str2 + ' ' + w4aVar.g(i) + " is already one of the names for " + str2 + ' ' + w4aVar.g(((Number) qi6.a(linkedHashMap, str)).intValue()) + " in " + w4aVar);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? d24.a : linkedHashMap;
        }
    }
}
