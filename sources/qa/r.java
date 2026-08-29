package qa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r extends na.u {
    public static final p c = new p(na.t.a, 1);
    public final na.g a;
    public final na.t b;

    public r(na.g gVar, na.t tVar) {
        this.a = gVar;
        this.b = tVar;
    }

    public final Serializable a(va.a aVar, int i10) {
        int b10 = m1.j.b(i10);
        if (b10 == 5) {
            return aVar.v();
        }
        if (b10 == 6) {
            return this.b.a(aVar);
        }
        if (b10 == 7) {
            return Boolean.valueOf(aVar.n());
        }
        if (b10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(u3.c.m(i10)));
        }
        aVar.t();
        return null;
    }

    @Override // na.u
    public final Object read(va.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int x4 = aVar.x();
        int b10 = m1.j.b(x4);
        if (b10 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (b10 != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new pa.l(true);
        }
        if (arrayList == null) {
            return a(aVar, x4);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r6 = arrayList instanceof Map ? aVar.r() : null;
                int x10 = aVar.x();
                int b11 = m1.j.b(x10);
                if (b11 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (b11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new pa.l(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, x10);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(r6, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        na.g gVar = this.a;
        gVar.getClass();
        na.u b10 = gVar.b(new ua.a(cls));
        if (!(b10 instanceof r)) {
            b10.write(bVar, obj);
        } else {
            bVar.c();
            bVar.f();
        }
    }
}
