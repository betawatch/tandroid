package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    public abstract void x(Object obj, a aVar, b2.p1 p1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [u2.h0, u2.j] */
    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        u6.g(!hashMap.containsKey(num));
        ?? r12 = new h0() { // from class: u2.j
            @Override // u2.h0
            public final void a(a aVar2, b2.p1 p1Var) {
                m.this.x(num, aVar2, p1Var);
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
        j0 j0Var = new j0();
        j0Var.a = handler;
        j0Var.b = kVar;
        copyOnWriteArrayList.add(j0Var);
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
        kVar2.getClass();
        aVar.l(r12, c0Var, kVar2);
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
