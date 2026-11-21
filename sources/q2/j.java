package q2;

import h2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.j01;
import x2.g0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final g0 b;
    public final CopyOnWriteArrayList c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, g0 g0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i7;
        this.b = g0Var;
    }

    public final void a(nb.a aVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new es0(this, iVar.b, aVar, 25));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q2.k] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new h(this, iVar.b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new j01(this, iVar.b, i7, 25));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new es0((Object) this, iVar.b, (Object) exc, 24));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q2.k] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new h(this, iVar.b, 0));
        }
    }
}
