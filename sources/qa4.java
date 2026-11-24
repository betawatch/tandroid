// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qa4 {
    public final HashMap a;

    public qa4(byte b) {
        switch (b) {
            case 1:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public final void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.a.remove(runnable);
        if (runnable2 != null) {
            gm.r(runnable2);
        }
    }

    public final void b() {
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            gm.r((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }
}
