package qa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class u0 extends na.u {
    public static na.i a(va.a aVar, int i10) {
        int b10 = m1.j.b(i10);
        if (b10 == 5) {
            return new na.m(aVar.v());
        }
        if (b10 == 6) {
            return new na.m(new pa.h(aVar.v()));
        }
        if (b10 == 7) {
            return new na.m(Boolean.valueOf(aVar.n()));
        }
        if (b10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(u3.c.m(i10)));
        }
        aVar.t();
        return na.k.a;
    }

    public static void b(na.i iVar, va.b bVar) {
        if (iVar == null || (iVar instanceof na.k)) {
            bVar.i();
            return;
        }
        boolean z10 = iVar instanceof na.m;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            na.m mVar = (na.m) iVar;
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
        boolean z11 = iVar instanceof na.h;
        if (!z11) {
            if (!(iVar instanceof na.l)) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            bVar.c();
            Iterator it = ((pa.j) iVar.i().a.entrySet()).iterator();
            while (((pa.i) it).hasNext()) {
                pa.k b10 = ((pa.i) it).b();
                bVar.g((String) b10.getKey());
                b((na.i) b10.getValue(), bVar);
            }
            bVar.f();
            return;
        }
        bVar.b();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Array: " + iVar);
        }
        ArrayList arrayList = ((na.h) iVar).a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b((na.i) obj, bVar);
        }
        bVar.e();
    }

    @Override // na.u
    public final Object read(va.a aVar) {
        na.i hVar;
        na.i hVar2;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x4 = lVar.x();
            if (x4 != 5 && x4 != 2 && x4 != 4 && x4 != 10) {
                na.i iVar = (na.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + u3.c.m(x4) + " when reading a JsonElement.");
        }
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 == 0) {
            aVar.a();
            hVar = new na.h();
        } else if (b10 != 2) {
            hVar = null;
        } else {
            aVar.b();
            hVar = new na.l();
        }
        if (hVar == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r6 = hVar instanceof na.l ? aVar.r() : null;
                int x11 = aVar.x();
                int b11 = m1.j.b(x11);
                if (b11 == 0) {
                    aVar.a();
                    hVar2 = new na.h();
                } else if (b11 != 2) {
                    hVar2 = null;
                } else {
                    aVar.b();
                    hVar2 = new na.l();
                }
                boolean z10 = hVar2 != null;
                if (hVar2 == null) {
                    hVar2 = a(aVar, x11);
                }
                if (hVar instanceof na.h) {
                    ((na.h) hVar).a.add(hVar2);
                } else {
                    ((na.l) hVar).o(r6, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof na.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (na.i) arrayDeque.removeLast();
            }
        }
    }

    @Override // na.u
    public final /* bridge */ /* synthetic */ void write(va.b bVar, Object obj) {
        b((na.i) obj, bVar);
    }
}
