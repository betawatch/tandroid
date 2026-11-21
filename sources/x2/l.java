package x2;

import a8.la;
import a8.xa;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public j2.c0 j;

    @Override // x2.a
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.a.d(kVar.b);
        }
    }

    @Override // x2.a
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.a.f(kVar.b);
        }
    }

    @Override // x2.a
    public void k() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).a.k();
        }
    }

    @Override // x2.a
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

    public abstract void x(Object obj, a aVar, e2.l1 l1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [x2.h0, x2.i] */
    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        la.f(!hashMap.containsKey(num));
        ?? r12 = new h0() { // from class: x2.i
            @Override // x2.h0
            public final void a(a aVar2, e2.l1 l1Var) {
                l.this.x(num, aVar2, l1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        xa xaVar = aVar.c;
        xaVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) xaVar.d;
        j0 j0Var = new j0();
        j0Var.a = handler;
        j0Var.b = jVar;
        copyOnWriteArrayList.add(j0Var);
        Handler handler2 = this.i;
        handler2.getClass();
        q2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = jVar2.c;
        q2.i iVar = new q2.i();
        iVar.a = handler2;
        iVar.b = jVar;
        copyOnWriteArrayList2.add(iVar);
        j2.c0 c0Var = this.j;
        m2.i iVar2 = this.g;
        iVar2.getClass();
        aVar.l(r12, c0Var, iVar2);
        if (this.b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(Object obj, long j3) {
        return j3;
    }

    public int w(int i7, Object obj) {
        return i7;
    }
}
