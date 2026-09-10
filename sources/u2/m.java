package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class m extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public g2.c0 j;

    @Override // u2.a
    public final void e() {
        for (l lVar : this.h.values()) {
            lVar.a.d(lVar.b);
        }
    }

    @Override // u2.a
    public final void g() {
        for (l lVar : this.h.values()) {
            lVar.a.f(lVar.b);
        }
    }

    @Override // u2.a
    public void k() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).a.k();
        }
    }

    @Override // u2.a
    public void q() {
        HashMap hashMap = this.h;
        for (l lVar : hashMap.values()) {
            a aVar = lVar.a;
            k kVar = lVar.c;
            aVar.p(lVar.b);
            aVar.s(kVar);
            aVar.r(kVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, b2.k1 k1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [u2.h0, u2.j] */
    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        e2.d.b(!hashMap.containsKey(num));
        ?? r12 = new h0() { // from class: u2.j
            @Override // u2.h0
            public final void a(a aVar2, b2.k1 k1Var) {
                m.this.x(num, aVar2, k1Var);
            }
        };
        k kVar = new k(this, num);
        hashMap.put(num, new l(aVar, r12, kVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.c;
        aVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) aVar2.d;
        l0 l0Var = new l0();
        l0Var.a = handler;
        l0Var.b = kVar;
        copyOnWriteArrayList.add(l0Var);
        Handler handler2 = this.i;
        handler2.getClass();
        n2.j jVar = aVar.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = jVar.c;
        n2.i iVar = new n2.i();
        iVar.a = handler2;
        iVar.b = kVar;
        copyOnWriteArrayList2.add(iVar);
        g2.c0 c0Var = this.j;
        j2.k kVar2 = this.g;
        e2.d.h(kVar2);
        aVar.l(r12, c0Var, kVar2);
        if (this.b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(Object obj, long j3) {
        return j3;
    }

    public int w(int i10, Object obj) {
        return i10;
    }
}
