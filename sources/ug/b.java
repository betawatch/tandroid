package ug;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h7.v8;
import java.util.Collections;
import java.util.HashSet;
import z8.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            v8.a(cls2, "Null interface");
            ((HashSet) this.d).add(q.a(cls2));
        }
    }

    public void a(z8.i iVar) {
        if (((HashSet) this.d).contains(iVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(iVar);
    }

    public z8.a b() {
        if (((z8.d) this.f) != null) {
            return new z8.a((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a, this.b, (z8.d) this.f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        if (!(this.a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.a = i10;
    }

    public b(q qVar, q[] qVarArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            v8.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, qVarArr);
    }

    public b() {
        this.c = new RectF();
        this.f = new Path();
        this.d = new RectF();
        this.e = new RectF();
        this.g = new PointF();
    }
}
