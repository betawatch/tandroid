package q9;

import b2.i0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k2.v;
import w7.s6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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

    public static i0 b(s sVar) {
        s[] sVarArr = new s[0];
        i0 i0Var = new i0();
        i0Var.d = null;
        HashSet hashSet = new HashSet();
        i0Var.c = hashSet;
        i0Var.e = new HashSet();
        i0Var.a = 0;
        i0Var.b = 0;
        i0Var.g = new HashSet();
        hashSet.add(sVar);
        for (s sVar2 : sVarArr) {
            s6.a(sVar2, "Null interface");
        }
        Collections.addAll((HashSet) i0Var.c, sVarArr);
        return i0Var;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(s.a(cls));
        for (Class cls2 : clsArr) {
            s6.a(cls2, "Null interface");
            hashSet.add(s.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v(obj, 18), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
