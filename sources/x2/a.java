package x2;

import a8.ia;
import a8.wa;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final wa c = new wa(new CopyOnWriteArrayList(), 0, (g0) null);
    public final q2.j d = new q2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public e2.l1 f;
    public m2.j g;

    public boolean a(e2.l0 l0Var) {
        return false;
    }

    public final wa b(g0 g0Var) {
        return new wa((CopyOnWriteArrayList) this.c.d, 0, g0Var);
    }

    public abstract e0 c(g0 g0Var, h6.m mVar, long j3);

    public final void d(h0 h0Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(h0Var);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        e();
    }

    public final void f(h0 h0Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(h0Var);
        if (isEmpty) {
            g();
        }
    }

    public e2.l1 h() {
        return null;
    }

    public abstract e2.l0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(h0 h0Var, j2.d0 d0Var, m2.j jVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        ia.f(looper == null || looper == myLooper);
        this.g = jVar;
        e2.l1 l1Var = this.f;
        this.a.add(h0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(h0Var);
            m(d0Var);
        } else if (l1Var != null) {
            f(h0Var);
            h0Var.a(this, l1Var);
        }
    }

    public abstract void m(j2.d0 d0Var);

    public final void n(e2.l1 l1Var) {
        this.f = l1Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((h0) obj).a(this, l1Var);
        }
    }

    public abstract void o(e0 e0Var);

    public final void p(h0 h0Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(h0Var);
        if (!arrayList.isEmpty()) {
            d(h0Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        q();
    }

    public abstract void q();

    public final void r(q2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q2.i iVar = (q2.i) it.next();
            if (iVar.b == kVar) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    public final void s(k0 k0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.b == k0Var) {
                copyOnWriteArrayList.remove(j0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void t(e2.l0 l0Var) {
    }
}
