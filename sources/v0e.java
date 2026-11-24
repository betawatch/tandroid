// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v0e extends u1f {
    public final v8b a = new v8b((byte) 16);

    @Override // u1f
    public final void a(Exception exc) {
        exc.printStackTrace();
        v8b v8bVar = this.a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) v8bVar.b;
        ReferenceQueue referenceQueue = (ReferenceQueue) v8bVar.c;
        for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
            concurrentHashMap.remove(poll);
        }
        List<Throwable> list = (List) concurrentHashMap.get(new k0e(exc));
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
