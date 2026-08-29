package p5;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d0 {
    public final /* synthetic */ c a;

    public d0(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a();
        }
    }

    public final void b(int i10) {
        c cVar = this.a;
        c.g(cVar, i10);
        cVar.d(i10);
        Iterator it = new HashSet(cVar.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).b(i10);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f();
        }
    }
}
