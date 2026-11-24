// default package

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vq3 {
    public final int a;
    public final rx6 b;
    public final CopyOnWriteArrayList c;

    public vq3(CopyOnWriteArrayList copyOnWriteArrayList, int i, rx6 rx6Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = rx6Var;
    }

    public final void a(vi2 vi2Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            uq3 uq3Var = (uq3) it.next();
            g8c.X(uq3Var.a, new mg3(this, uq3Var.b, vi2Var, (byte) 12));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            uq3 uq3Var = (uq3) it.next();
            g8c.X(uq3Var.a, new tq3(this, uq3Var.b, (byte) 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            uq3 uq3Var = (uq3) it.next();
            g8c.X(uq3Var.a, new o94((Object) this, (Object) uq3Var.b, i, (byte) 2));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            uq3 uq3Var = (uq3) it.next();
            g8c.X(uq3Var.a, new mg3(this, uq3Var.b, exc, (byte) 11));
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            uq3 uq3Var = (uq3) it.next();
            g8c.X(uq3Var.a, new tq3(this, uq3Var.b, (byte) 0));
        }
    }
}
