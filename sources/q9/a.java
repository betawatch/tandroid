package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ji.k5;
import w7.o6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final d f;
    public final Set g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f = dVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static i0 a(Class cls) {
        return new i0(cls, new Class[0]);
    }

    public static i0 b(r rVar) {
        r[] rVarArr = new r[0];
        i0 i0Var = new i0();
        i0Var.d = null;
        HashSet hashSet = new HashSet();
        i0Var.c = hashSet;
        i0Var.e = new HashSet();
        i0Var.a = 0;
        i0Var.b = 0;
        i0Var.g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            o6.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) i0Var.c, rVarArr);
        return i0Var;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            o6.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new k5(obj, 16), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
