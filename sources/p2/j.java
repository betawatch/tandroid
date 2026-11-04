package p2;

import g2.n0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.rw;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final g0 b;
    public final CopyOnWriteArrayList c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i3, g0 g0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i3;
        this.b = g0Var;
    }

    public final void a(v7.s sVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new iv0(this, iVar.b, sVar, 18));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p2.k] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new h(this, iVar.b, 1));
        }
    }

    public final void c(int i3) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new rw(this, iVar.b, i3, 22));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new iv0(this, iVar.b, exc, 17));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p2.k] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new h(this, iVar.b, 0));
        }
    }
}
