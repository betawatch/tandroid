// default package

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
