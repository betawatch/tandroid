package s9;

import b2.n0;
import com.google.android.gms.internal.play_billing.s1;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.ui.Components.voip.j1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    public static n0 a(Class cls) {
        return new n0(cls, new Class[0]);
    }

    public static n0 b(s sVar) {
        s[] sVarArr = new s[0];
        n0 n0Var = new n0();
        n0Var.d = null;
        HashSet hashSet = new HashSet();
        n0Var.c = hashSet;
        n0Var.e = new HashSet();
        n0Var.a = 0;
        n0Var.b = 0;
        n0Var.g = new HashSet();
        hashSet.add(sVar);
        for (s sVar2 : sVarArr) {
            s1.a(sVar2, "Null interface");
        }
        Collections.addAll((HashSet) n0Var.c, sVarArr);
        return n0Var;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(s.a(cls));
        for (Class cls2 : clsArr) {
            s1.a(cls2, "Null interface");
            hashSet.add(s.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new j1(obj, 10), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
