// default package

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class p23 implements sr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p23(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // sr4
    public final Object invoke() {
        String[] names;
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ur4) obj2).invoke(((p89) obj).a);
                return f9cVar;
            case 1:
                ((ur4) obj2).invoke(((p89) obj).a);
                return f9cVar;
            default:
                o8a o8aVar = (o8a) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                dfd.a((qw5) obj, o8aVar);
                int f = o8aVar.f();
                for (int i = 0; i < f; i++) {
                    List h = o8aVar.h(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : h) {
                        if (obj3 instanceof zw5) {
                            arrayList.add(obj3);
                        }
                    }
                    zw5 zw5Var = (zw5) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (zw5Var != null && (names = zw5Var.names()) != null) {
                        for (String str : names) {
                            String str2 = ur5.a(o8aVar.e(), q8a.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new yw5("The suggested name '" + str + "' for " + str2 + ' ' + o8aVar.g(i) + " is already one of the names for " + str2 + ' ' + o8aVar.g(((Number) uk6.a(linkedHashMap, str)).intValue()) + " in " + o8aVar);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? y24.a : linkedHashMap;
        }
    }
}
