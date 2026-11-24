// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y2e extends w3f {
    public final xab a = new xab((byte) 16);

    @Override // w3f
    public final void a(Exception exc) {
        exc.printStackTrace();
        xab xabVar = this.a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) xabVar.b;
        ReferenceQueue referenceQueue = (ReferenceQueue) xabVar.c;
        for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
            concurrentHashMap.remove(poll);
        }
        List<Throwable> list = (List) concurrentHashMap.get(new n2e(exc));
        if (list == null) {
            return;
        }
        synchronized (list) {
            for (Throwable th : list) {
                System.err.print("Suppressed: ");
                th.printStackTrace();
            }
        }
    }
}
