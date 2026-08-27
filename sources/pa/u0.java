package pa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class u0 extends ma.u {
    public static ma.i a(ua.a aVar, int i10) {
        int b10 = m1.j.b(i10);
        if (b10 == 5) {
            return new ma.m(aVar.v());
        }
        if (b10 == 6) {
            return new ma.m(new oa.h(aVar.v()));
        }
        if (b10 == 7) {
            return new ma.m(Boolean.valueOf(aVar.n()));
        }
        if (b10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(s3.c.n(i10)));
        }
        aVar.t();
        return ma.k.a;
    }

    public static void b(ma.i iVar, ua.b bVar) {
        if (iVar == null || (iVar instanceof ma.k)) {
            bVar.i();
            return;
        }
        boolean z10 = iVar instanceof ma.m;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            ma.m mVar = (ma.m) iVar;
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
        boolean z11 = iVar instanceof ma.h;
        if (!z11) {
            if (!(iVar instanceof ma.l)) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            bVar.c();
            Iterator it = ((oa.j) iVar.i().a.entrySet()).iterator();
            while (((oa.i) it).hasNext()) {
                oa.k b10 = ((oa.i) it).b();
                bVar.g((String) b10.getKey());
                b((ma.i) b10.getValue(), bVar);
            }
            bVar.f();
            return;
        }
        bVar.b();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Array: " + iVar);
        }
        ArrayList arrayList = ((ma.h) iVar).a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b((ma.i) obj, bVar);
        }
        bVar.e();
    }

    @Override // ma.u
    public final Object read(ua.a aVar) {
        ma.i hVar;
        ma.i hVar2;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x8 = lVar.x();
            if (x8 != 5 && x8 != 2 && x8 != 4 && x8 != 10) {
                ma.i iVar = (ma.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + s3.c.n(x8) + " when reading a JsonElement.");
        }
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 == 0) {
            aVar.a();
            hVar = new ma.h();
        } else if (b10 != 2) {
            hVar = null;
        } else {
            aVar.b();
            hVar = new ma.l();
        }
        if (hVar == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = hVar instanceof ma.l ? aVar.r() : null;
                int x11 = aVar.x();
                int b11 = m1.j.b(x11);
                if (b11 == 0) {
                    aVar.a();
                    hVar2 = new ma.h();
                } else if (b11 != 2) {
                    hVar2 = null;
                } else {
                    aVar.b();
                    hVar2 = new ma.l();
                }
                boolean z10 = hVar2 != null;
                if (hVar2 == null) {
                    hVar2 = a(aVar, x11);
                }
                if (hVar instanceof ma.h) {
                    ((ma.h) hVar).a.add(hVar2);
                } else {
                    ((ma.l) hVar).o(r10, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof ma.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (ma.i) arrayDeque.removeLast();
            }
        }
    }

    @Override // ma.u
    public final /* bridge */ /* synthetic */ void write(ua.b bVar, Object obj) {
        b((ma.i) obj, bVar);
    }
}
