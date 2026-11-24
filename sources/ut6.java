// default package

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ut6 extends vt6 {
    public final Object a = new Object();
    public Executor b;
    public pj4 c;
    public zs6 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(zs6 zs6Var, ArrayList arrayList) {
        if (zs6Var == null) {
            fvc.f("groupRoute must not be null");
            return;
        }
        synchronized (this.a) {
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new st6(this, this.c, zs6Var, arrayList, (byte) 1));
            } else {
                this.d = zs6Var;
                this.e = new ArrayList(arrayList);
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
