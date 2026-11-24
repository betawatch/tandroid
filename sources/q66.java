// default package

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q66 implements cx5 {
    public final cx5 a;
    public final p66 b;

    public q66(cx5 cx5Var) {
        ebb ebbVar = ebb.a;
        this.a = cx5Var;
        this.b = new p66(ebb.b, cx5Var.d());
    }

    @Override // cx5
    public final void b(c40 c40Var, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        map.size();
        p66 p66Var = this.b;
        c40 a = c40Var.a(p66Var);
        Map map2 = (Map) obj;
        map2.getClass();
        int i = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            a.i(p66Var, i, ebb.a, key);
            i += 2;
            a.i(p66Var, i2, this.a, value);
        }
        a.l(p66Var);
    }

    @Override // cx5
    public final Object c(jif jifVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = linkedHashMap.size() << 1;
        jif a = jifVar.a(d());
        while (true) {
            int b = a.b(d());
            if (b == -1) {
                a.o(d());
                return linkedHashMap;
            }
            int i = b + size;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            ebb ebbVar = ebb.a;
            p66 p66Var = this.b;
            Object k = a.k(p66Var, i, ebbVar, null);
            int b2 = a.b(p66Var);
            if (b2 == i + 1) {
                boolean containsKey = linkedHashMap2.containsKey(k);
                cx5 cx5Var = this.a;
                linkedHashMap2.put(k, (!containsKey || (cx5Var.d().e() instanceof dl8)) ? a.k(p66Var, b2, cx5Var, null) : a.k(p66Var, b2, cx5Var, sk6.a(linkedHashMap2, k)));
            } else {
                c1b.a(b10.g(i, b2, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            }
        }
    }

    @Override // cx5
    public final y6a d() {
        return this.b;
    }
}
