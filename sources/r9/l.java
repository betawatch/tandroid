package r9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class l implements na.b, na.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(c3.m mVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(l9.b.class)) {
                    this.a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(l9.b.class)).put(mVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
