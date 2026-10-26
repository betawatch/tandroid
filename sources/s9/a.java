package s9;

import b2.n0;
import com.google.android.gms.internal.play_billing.s1;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.ui.Components.voip.j1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    public static n0 b(r rVar) {
        r[] rVarArr = new r[0];
        n0 n0Var = new n0();
        n0Var.d = null;
        HashSet hashSet = new HashSet();
        n0Var.c = hashSet;
        n0Var.e = new HashSet();
        n0Var.a = 0;
        n0Var.b = 0;
        n0Var.g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            s1.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) n0Var.c, rVarArr);
        return n0Var;
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            s1.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new j1(obj, 10), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
