package t9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l implements qa.b, qa.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(z9.j jVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(n9.b.class)) {
                    this.a.put(n9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(n9.b.class)).put(jVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
