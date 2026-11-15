package q2;

import h2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.u11;
import x2.f0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k {
    public final int a;
    public final f0 b;
    public final CopyOnWriteArrayList c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i7, f0 f0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i7;
        this.b = f0Var;
    }

    public final void a(nb.a aVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.a, new lv0(this, jVar.b, aVar, 20));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q2.l] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.a, new i(this, jVar.b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.a, new u11(this, jVar.b, i7, 24));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.a, new lv0(this, jVar.b, exc, 19));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q2.l] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            l0.W(jVar.a, new i(this, jVar.b, 0));
        }
    }
}
