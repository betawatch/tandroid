package u9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
