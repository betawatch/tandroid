package s9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m implements oa.b, oa.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public m(Executor executor) {
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
