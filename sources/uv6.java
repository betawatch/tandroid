// default package

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class uv6 extends vv6 {
    public final Object a = new Object();
    public Executor b;
    public k44 c;
    public zu6 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(zu6 zu6Var, ArrayList arrayList) {
        if (zu6Var == null) {
            gxc.d("groupRoute must not be null");
            return;
        }
        synchronized (this.a) {
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new sv6(this, this.c, zu6Var, arrayList, (byte) 1));
            } else {
                this.d = zu6Var;
                this.e = new ArrayList(arrayList);
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
