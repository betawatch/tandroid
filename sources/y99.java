// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y99 {
    public final HashMap a;

    public y99(Set set) {
        this.a = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            x99 x99Var = (x99) it.next();
            HashMap hashMap = this.a;
            x99Var.getClass();
            hashMap.put(n53.class, x99Var.a);
        }
    }

    public final void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.a.remove(runnable);
        if (runnable2 != null) {
            hl.r(runnable2);
        }
    }

    public final void b() {
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            hl.r((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    public y99(byte b) {
        switch (b) {
            case 2:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }
}
