package pb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = this.a;
            bVar.getClass();
            hashMap.put(a.class, bVar.a);
        }
    }

    public void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.a.remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void b() {
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    public c() {
    }
}
