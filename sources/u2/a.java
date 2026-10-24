package u2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final a5.a c = new a5.a(new CopyOnWriteArrayList(), 0, null, 21);
    public final n2.k d = new n2.k(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public b2.o1 f;
    public j2.j g;

    public boolean a(b2.o0 o0Var) {
        return false;
    }

    public final a5.a b(h0 h0Var) {
        return new a5.a((CopyOnWriteArrayList) this.c.d, 0, h0Var, 21);
    }

    public abstract f0 c(h0 h0Var, androidx.biometric.e eVar, long j10);

    public final void d(i0 i0Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(i0Var);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        e();
    }

    public final void f(i0 i0Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(i0Var);
        if (isEmpty) {
            g();
        }
    }

    public b2.o1 h() {
        return null;
    }

    public abstract b2.o0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(i0 i0Var, g2.c0 c0Var, j2.j jVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        u6.g(looper == null || looper == myLooper);
        this.g = jVar;
        b2.o1 o1Var = this.f;
        this.a.add(i0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(i0Var);
            m(c0Var);
        } else if (o1Var != null) {
            f(i0Var);
            i0Var.a(this, o1Var);
        }
    }

    public abstract void m(g2.c0 c0Var);

    public final void n(b2.o1 o1Var) {
        this.f = o1Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i0) obj).a(this, o1Var);
        }
    }

    public abstract void o(f0 f0Var);

    public final void p(i0 i0Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(i0Var);
        if (!arrayList.isEmpty()) {
            d(i0Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        q();
    }

    public abstract void q();

    public final void r(n2.l lVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n2.j jVar = (n2.j) it.next();
            if (jVar.b == lVar) {
                copyOnWriteArrayList.remove(jVar);
            }
        }
    }

    public final void s(m0 m0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (l0Var.b == m0Var) {
                copyOnWriteArrayList.remove(l0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void t(b2.o0 o0Var) {
    }
}
