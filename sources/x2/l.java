package x2;

import a8.ja;
import a8.xa;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

    public abstract f0 u(Object obj, f0 f0Var);

    public abstract void x(Object obj, a aVar, e2.l1 l1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [x2.g0, x2.i] */
    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        ja.f(!hashMap.containsKey(num));
        ?? r12 = new g0() { // from class: x2.i
            @Override // x2.g0
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
        i0 i0Var = new i0();
        i0Var.a = handler;
        i0Var.b = jVar;
        copyOnWriteArrayList.add(i0Var);
        Handler handler2 = this.i;
        handler2.getClass();
        q2.k kVar = aVar.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = kVar.c;
        q2.j jVar2 = new q2.j();
        jVar2.a = handler2;
        jVar2.b = jVar;
        copyOnWriteArrayList2.add(jVar2);
        j2.c0 c0Var = this.j;
        m2.j jVar3 = this.g;
        jVar3.getClass();
        aVar.l(r12, c0Var, jVar3);
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
