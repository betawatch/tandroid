package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public g2.d0 j;

    @Override // u2.a
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.a.d(kVar.b);
        }
    }

    @Override // u2.a
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.a.f(kVar.b);
        }
    }

    @Override // u2.a
    public void k() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).a.k();
        }
    }

    @Override // u2.a
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

    public abstract void x(Object obj, a aVar, b2.o1 o1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [u2.h0, u2.i] */
    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        t6.f(!hashMap.containsKey(num));
        ?? r12 = new h0() { // from class: u2.i
            @Override // u2.h0
            public final void a(a aVar2, b2.o1 o1Var) {
                l.this.x(num, aVar2, o1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.c;
        aVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) aVar2.d;
        j0 j0Var = new j0();
        j0Var.a = handler;
        j0Var.b = jVar;
        copyOnWriteArrayList.add(j0Var);
        Handler handler2 = this.i;
        handler2.getClass();
        n2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = jVar2.c;
        n2.i iVar = new n2.i();
        iVar.a = handler2;
        iVar.b = jVar;
        copyOnWriteArrayList2.add(iVar);
        g2.d0 d0Var = this.j;
        j2.l lVar = this.g;
        lVar.getClass();
        aVar.l(r12, d0Var, lVar);
        if (this.b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(Object obj, long j10) {
        return j10;
    }

    public int w(int i10, Object obj) {
        return i10;
    }
}
