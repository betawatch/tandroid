// default package

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uhf {
    public final /* synthetic */ ed1 a;

    public uhf(ed1 ed1Var) {
        this.a = ed1Var;
    }

    public final void a() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((uhf) it.next()).a();
        }
    }

    public final void b(int i) {
        ed1 ed1Var = this.a;
        ed1.g(ed1Var, i);
        ed1Var.d(i);
        Iterator it = new HashSet(ed1Var.d).iterator();
        while (it.hasNext()) {
            ((uhf) it.next()).b(i);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((uhf) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((uhf) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((uhf) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((uhf) it.next()).f();
        }
    }
}
