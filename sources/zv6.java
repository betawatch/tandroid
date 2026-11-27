// default package

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class zv6 extends aw6 {
    public final Object a = new Object();
    public Executor b;
    public v34 c;
    public ev6 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(ev6 ev6Var, ArrayList arrayList) {
        if (ev6Var == null) {
            p3d.h("groupRoute must not be null");
            return;
        }
        synchronized (this.a) {
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new xv6(this, this.c, ev6Var, arrayList, (byte) 1));
            } else {
                this.d = ev6Var;
                this.e = new ArrayList(arrayList);
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
