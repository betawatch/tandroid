package u9;

import c8.tc;
import e2.j0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final d f;
    public final Set g;

    public a(String str, Set set, Set set2, int i7, int i10, d dVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i7;
        this.e = i10;
        this.f = dVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static j0 a(Class cls) {
        return new j0(cls, new Class[0]);
    }

    public static j0 b(q qVar) {
        q[] qVarArr = new q[0];
        j0 j0Var = new j0();
        j0Var.d = null;
        HashSet hashSet = new HashSet();
        j0Var.c = hashSet;
        j0Var.e = new HashSet();
        j0Var.a = 0;
        j0Var.b = 0;
        j0Var.g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            tc.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) j0Var.c, qVarArr);
        return j0Var;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            tc.a(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new u5.e(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
