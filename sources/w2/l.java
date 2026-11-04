package w2;

import android.os.Handler;
import b8.kg;
import b8.zb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public i2.d0 j;

    @Override // w2.a
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.a.d(kVar.b);
        }
    }

    @Override // w2.a
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.a.f(kVar.b);
        }
    }

    @Override // w2.a
    public void k() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).a.k();
        }
    }

    @Override // w2.a
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.a;
            j jVar = kVar.c;
            aVar.p(kVar.b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, d2.n1 n1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [w2.h0, w2.i] */
    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        zb.f(!hashMap.containsKey(num));
        ?? r12 = new h0() { // from class: w2.i
            @Override // w2.h0
            public final void a(a aVar2, d2.n1 n1Var) {
                l.this.x(num, aVar2, n1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        kg kgVar = aVar.c;
        kgVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) kgVar.d;
        j0 j0Var = new j0();
        j0Var.a = handler;
        j0Var.b = jVar;
        copyOnWriteArrayList.add(j0Var);
        Handler handler2 = this.i;
        handler2.getClass();
        p2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = jVar2.c;
        p2.i iVar = new p2.i();
        iVar.a = handler2;
        iVar.b = jVar;
        copyOnWriteArrayList2.add(iVar);
        i2.d0 d0Var = this.j;
        l2.k kVar = this.g;
        kVar.getClass();
        aVar.l(r12, d0Var, kVar);
        if (this.b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(Object obj, long j10) {
        return j10;
    }

    public int w(int i3, Object obj) {
        return i3;
    }
}
