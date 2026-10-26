package s9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l implements oa.b, oa.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(c2.i iVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(m9.b.class)) {
                    this.a.put(m9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(m9.b.class)).put(iVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
