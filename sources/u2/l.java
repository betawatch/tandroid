package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public g2.c0 j;

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

    public abstract f0 u(Object obj, f0 f0Var);

    public abstract void x(Object obj, a aVar, b2.k1 k1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [u2.g0, u2.i] */
    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        e2.d.b(!hashMap.containsKey(num));
        ?? r12 = new g0() { // from class: u2.i
            @Override // u2.g0
            public final void a(a aVar2, b2.k1 k1Var) {
                l.this.x(num, aVar2, k1Var);
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
        g2.c0 c0Var = this.j;
        j2.k kVar = this.g;
        e2.d.h(kVar);
        aVar.l(r12, c0Var, kVar);
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
