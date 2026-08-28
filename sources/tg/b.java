package tg;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import g7.t8;
import java.util.Collections;
import java.util.HashSet;
import y8.j;
import y8.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b {
    public int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;

    public b(Class cls, Class[] clsArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            t8.a(cls2, "Null interface");
            ((HashSet) this.d).add(r.a(cls2));
        }
    }

    public void a(j jVar) {
        if (((HashSet) this.d).contains(jVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(jVar);
    }

    public y8.a b() {
        if (((y8.d) this.f) != null) {
            return new y8.a((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a, this.b, (y8.d) this.f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i9) {
        if (!(this.a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.a = i9;
    }

    public b(r rVar, r[] rVarArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            t8.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, rVarArr);
    }

    public b() {
        this.c = new RectF();
        this.f = new Path();
        this.d = new RectF();
        this.e = new RectF();
        this.g = new PointF();
    }
}
