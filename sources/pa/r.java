package pa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r extends ma.u {
    public static final p c = new p(ma.t.a, 1);
    public final ma.g a;
    public final ma.t b;

    public r(ma.g gVar, ma.t tVar) {
        this.a = gVar;
        this.b = tVar;
    }

    public final Serializable a(ua.a aVar, int i10) {
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
            throw new IllegalStateException("Unexpected token: ".concat(s3.c.n(i10)));
        }
        aVar.t();
        return null;
    }

    @Override // ma.u
    public final Object read(ua.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int x8 = aVar.x();
        int b10 = m1.j.b(x8);
        if (b10 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (b10 != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new oa.l(true);
        }
        if (arrayList == null) {
            return a(aVar, x8);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = arrayList instanceof Map ? aVar.r() : null;
                int x10 = aVar.x();
                int b11 = m1.j.b(x10);
                if (b11 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (b11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new oa.l(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, x10);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(r10, arrayList2);
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

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        ma.g gVar = this.a;
        gVar.getClass();
        ma.u b10 = gVar.b(new ta.a(cls));
        if (!(b10 instanceof r)) {
            b10.write(bVar, obj);
        } else {
            bVar.c();
            bVar.f();
        }
    }
}
