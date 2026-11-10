package q2;

import h2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.r31;
import org.telegram.ui.h10;
import x2.f0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final f0 b;
    public final CopyOnWriteArrayList c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i7, f0 f0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i7;
        this.b = f0Var;
    }

    public final void a(qb.a aVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.a, new r31(this, iVar.b, aVar, 16));
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
            m0.W(iVar.a, new h10(this, iVar.b, i7, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.a, new r31(this, iVar.b, exc, 15));
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
