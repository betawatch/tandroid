package w2;

import android.os.Looper;
import b8.kg;
import b8.zb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final kg c = new kg(new CopyOnWriteArrayList(), 0, (g0) null);
    public final p2.j d = new p2.j(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public d2.n1 f;
    public l2.k g;

    public boolean a(d2.n0 n0Var) {
        return false;
    }

    public final kg b(g0 g0Var) {
        return new kg((CopyOnWriteArrayList) this.c.d, 0, g0Var);
    }

    public abstract e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10);

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

    public d2.n1 h() {
        return null;
    }

    public abstract d2.n0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(h0 h0Var, i2.d0 d0Var, l2.k kVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        zb.f(looper == null || looper == myLooper);
        this.g = kVar;
        d2.n1 n1Var = this.f;
        this.a.add(h0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(h0Var);
            m(d0Var);
        } else if (n1Var != null) {
            f(h0Var);
            h0Var.a(this, n1Var);
        }
    }

    public abstract void m(i2.d0 d0Var);

    public final void n(d2.n1 n1Var) {
        this.f = n1Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((h0) obj).a(this, n1Var);
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

    public final void r(p2.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p2.i iVar = (p2.i) it.next();
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

    public void t(d2.n0 n0Var) {
    }
}
