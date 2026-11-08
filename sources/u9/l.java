package u9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l implements ra.b, ra.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(a3.l lVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(o9.b.class)) {
                    this.a.put(o9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(o9.b.class)).put(lVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
