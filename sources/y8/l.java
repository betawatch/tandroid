package y8;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements u9.b, u9.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(a9.b bVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(s8.b.class)) {
                    this.a.put(s8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(s8.b.class)).put(bVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
