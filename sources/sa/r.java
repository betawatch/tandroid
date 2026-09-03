package sa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r extends pa.u {
    public static final p c = new p(pa.t.a, 1);
    public final pa.g a;
    public final pa.t b;

    public r(pa.g gVar, pa.t tVar) {
        this.a = gVar;
        this.b = tVar;
    }

    public final Serializable a(xa.a aVar, int i10) {
        int c3 = m1.j.c(i10);
        if (c3 == 5) {
            return aVar.v();
        }
        if (c3 == 6) {
            return this.b.a(aVar);
        }
        if (c3 == 7) {
            return Boolean.valueOf(aVar.n());
        }
        if (c3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(w.c.m(i10)));
        }
        aVar.t();
        return null;
    }

    @Override // pa.u
    public final Object read(xa.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int x10 = aVar.x();
        int c3 = m1.j.c(x10);
        if (c3 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (c3 != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new ra.l(true);
        }
        if (arrayList == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = arrayList instanceof Map ? aVar.r() : null;
                int x11 = aVar.x();
                int c10 = m1.j.c(x11);
                if (c10 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (c10 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new ra.l(true);
                }
                boolean z4 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, x11);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(r10, arrayList2);
                }
                if (z4) {
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

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        pa.g gVar = this.a;
        gVar.getClass();
        pa.u b10 = gVar.b(new wa.a(cls));
        if (!(b10 instanceof r)) {
            b10.write(bVar, obj);
        } else {
            bVar.c();
            bVar.f();
        }
    }
}
