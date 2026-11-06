package q2;

import h2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.l31;
import org.telegram.ui.d10;
import x2.g0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    public final void a(qb.a aVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.a, new l31(this, iVar.b, aVar, 16));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q2.k] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.a, new h(this, iVar.b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.a, new d10(this, iVar.b, i7, 22));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.a, new l31(this, iVar.b, exc, 15));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q2.k] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.a, new h(this, iVar.b, 0));
        }
    }
}
