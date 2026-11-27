// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
