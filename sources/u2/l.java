package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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

    public abstract void x(Object obj, a aVar, b2.o1 o1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [u2.g0, u2.i] */
    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        u6.g(!hashMap.containsKey(num));
        ?? r12 = new g0() { // from class: u2.i
            @Override // u2.g0
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
        i0 i0Var = new i0();
        i0Var.a = handler;
        i0Var.b = jVar;
        copyOnWriteArrayList.add(i0Var);
        Handler handler2 = this.i;
        handler2.getClass();
        n2.k kVar = aVar.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = kVar.c;
        n2.j jVar2 = new n2.j();
        jVar2.a = handler2;
        jVar2.b = jVar;
        copyOnWriteArrayList2.add(jVar2);
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
