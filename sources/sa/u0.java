package sa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class u0 extends pa.u {
    public static pa.i a(xa.a aVar, int i10) {
        int b10 = m1.j.b(i10);
        if (b10 == 5) {
            return new pa.m(aVar.v());
        }
        if (b10 == 6) {
            return new pa.m(new ra.h(aVar.v()));
        }
        if (b10 == 7) {
            return new pa.m(Boolean.valueOf(aVar.n()));
        }
        if (b10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(v2.m(i10)));
        }
        aVar.t();
        return pa.k.a;
    }

    public static void b(pa.i iVar, xa.b bVar) {
        if (iVar == null || (iVar instanceof pa.k)) {
            bVar.i();
            return;
        }
        boolean z4 = iVar instanceof pa.m;
        if (z4) {
            if (!z4) {
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            pa.m mVar = (pa.m) iVar;
            Serializable serializable = mVar.a;
            if (serializable instanceof Number) {
                bVar.q(mVar.r());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.s(mVar.p());
                return;
            } else {
                bVar.r(mVar.n());
                return;
            }
        }
        boolean z10 = iVar instanceof pa.h;
        if (!z10) {
            if (!(iVar instanceof pa.l)) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            bVar.c();
            Iterator it = ((ra.j) iVar.i().a.entrySet()).iterator();
            while (((ra.i) it).hasNext()) {
                ra.k b10 = ((ra.i) it).b();
                bVar.g((String) b10.getKey());
                b((pa.i) b10.getValue(), bVar);
            }
            bVar.f();
            return;
        }
        bVar.b();
        if (!z10) {
            throw new IllegalStateException("Not a JSON Array: " + iVar);
        }
        ArrayList arrayList = ((pa.h) iVar).a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b((pa.i) obj, bVar);
        }
        bVar.e();
    }

    @Override // pa.u
    public final Object read(xa.a aVar) {
        pa.i hVar;
        pa.i hVar2;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x10 = lVar.x();
            if (x10 != 5 && x10 != 2 && x10 != 4 && x10 != 10) {
                pa.i iVar = (pa.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + v2.m(x10) + " when reading a JsonElement.");
        }
        int x11 = aVar.x();
        int b10 = m1.j.b(x11);
        if (b10 == 0) {
            aVar.a();
            hVar = new pa.h();
        } else if (b10 != 2) {
            hVar = null;
        } else {
            aVar.b();
            hVar = new pa.l();
        }
        if (hVar == null) {
            return a(aVar, x11);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = hVar instanceof pa.l ? aVar.r() : null;
                int x12 = aVar.x();
                int b11 = m1.j.b(x12);
                if (b11 == 0) {
                    aVar.a();
                    hVar2 = new pa.h();
                } else if (b11 != 2) {
                    hVar2 = null;
                } else {
                    aVar.b();
                    hVar2 = new pa.l();
                }
                boolean z4 = hVar2 != null;
                if (hVar2 == null) {
                    hVar2 = a(aVar, x12);
                }
                if (hVar instanceof pa.h) {
                    ((pa.h) hVar).a.add(hVar2);
                } else {
                    ((pa.l) hVar).o(r10, hVar2);
                }
                if (z4) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof pa.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (pa.i) arrayDeque.removeLast();
            }
        }
    }

    @Override // pa.u
    public final /* bridge */ /* synthetic */ void write(xa.b bVar, Object obj) {
        b((pa.i) obj, bVar);
    }
}
