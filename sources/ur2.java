// default package

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ur2 extends rh0 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override // rh0
    public final void e() {
        for (tr2 tr2Var : this.i.values()) {
            tr2Var.a.d(tr2Var.b);
        }
    }

    @Override // rh0
    public final void g() {
        for (tr2 tr2Var : this.i.values()) {
            tr2Var.a.f(tr2Var.b);
        }
    }

    @Override // rh0
    public void k() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((tr2) it.next()).a.k();
        }
    }

    @Override // rh0
    public void q() {
        HashMap hashMap = this.i;
        for (tr2 tr2Var : hashMap.values()) {
            rh0 rh0Var = tr2Var.a;
            sr2 sr2Var = tr2Var.c;
            rh0Var.p(tr2Var.b);
            rh0Var.s(sr2Var);
            rh0Var.r(sr2Var);
        }
        hashMap.clear();
    }

    public abstract rz6 u(Integer num, rz6 rz6Var);

    public abstract void x(Integer num, rh0 rh0Var, bqb bqbVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [rr2, sz6] */
    public final void y(final Integer num, rh0 rh0Var) {
        HashMap hashMap = this.i;
        jte.f(!hashMap.containsKey(num));
        ?? r1 = new sz6() { // from class: rr2
            @Override // sz6
            public final void a(rh0 rh0Var2, bqb bqbVar) {
                ur2.this.x(num, rh0Var2, bqbVar);
            }
        };
        sr2 sr2Var = new sr2(this, num);
        hashMap.put(num, new tr2(rh0Var, r1, sr2Var));
        Handler handler = this.j;
        handler.getClass();
        rh0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) rh0Var.c.d;
        uz6 uz6Var = new uz6();
        uz6Var.a = handler;
        uz6Var.b = sr2Var;
        copyOnWriteArrayList.add(uz6Var);
        Handler handler2 = this.j;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = rh0Var.d.c;
        es3 es3Var = new es3();
        es3Var.a = handler2;
        es3Var.b = sr2Var;
        copyOnWriteArrayList2.add(es3Var);
        we8 we8Var = this.g;
        we8Var.getClass();
        eb3 eb3Var = this.h;
        eb3Var.getClass();
        rh0Var.l(r1, we8Var, eb3Var);
        if (this.b.isEmpty()) {
            rh0Var.d(r1);
        }
    }

    public long v(long j, Integer num) {
        return j;
    }

    public int w(int i, Integer num) {
        return i;
    }
}
