package t9;

import d2.l0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.ui.ActionBar.e3;
import x7.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final d f;
    public final Set g;

    public a(String str, Set set, Set set2, int i3, int i10, d dVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i3;
        this.e = i10;
        this.f = dVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static l0 a(Class cls) {
        return new l0(cls, new Class[0]);
    }

    public static l0 b(r rVar) {
        r[] rVarArr = new r[0];
        l0 l0Var = new l0();
        l0Var.d = null;
        HashSet hashSet = new HashSet();
        l0Var.c = hashSet;
        l0Var.e = new HashSet();
        l0Var.a = 0;
        l0Var.b = 0;
        l0Var.g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            b0.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) l0Var.c, rVarArr);
        return l0Var;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            b0.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new e3(obj, 15), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
