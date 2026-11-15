package x2;

import a8.ja;
import a8.xa;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final xa c = new xa(new CopyOnWriteArrayList(), 0, (f0) null);
    public final q2.k d = new q2.k(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public e2.l1 f;
    public m2.j g;

    public boolean a(e2.l0 l0Var) {
        return false;
    }

    public final xa b(f0 f0Var) {
        return new xa((CopyOnWriteArrayList) this.c.d, 0, f0Var);
    }

    public abstract d0 c(f0 f0Var, h6.m mVar, long j3);

    public final void d(g0 g0Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(g0Var);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        e();
    }

    public final void f(g0 g0Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(g0Var);
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

    public final void l(g0 g0Var, j2.c0 c0Var, m2.j jVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        ja.f(looper == null || looper == myLooper);
        this.g = jVar;
        e2.l1 l1Var = this.f;
        this.a.add(g0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(g0Var);
            m(c0Var);
        } else if (l1Var != null) {
            f(g0Var);
            g0Var.a(this, l1Var);
        }
    }

    public abstract void m(j2.c0 c0Var);

    public final void n(e2.l1 l1Var) {
        this.f = l1Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((g0) obj).a(this, l1Var);
        }
    }

    public abstract void o(d0 d0Var);

    public final void p(g0 g0Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(g0Var);
        if (!arrayList.isEmpty()) {
            d(g0Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        q();
    }

    public abstract void q();

    public final void r(q2.l lVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q2.j jVar = (q2.j) it.next();
            if (jVar.b == lVar) {
                copyOnWriteArrayList.remove(jVar);
            }
        }
    }

    public final void s(j0 j0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            if (i0Var.b == j0Var) {
                copyOnWriteArrayList.remove(i0Var);
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
