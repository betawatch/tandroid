// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class w44 implements feb, cy8 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public w44(Executor executor) {
        this.c = executor;
    }

    public final void a(xi4 xi4Var) {
        Executor executor = this.c;
        synchronized (this) {
            executor.getClass();
            if (!this.a.containsKey(r63.class)) {
                this.a.put(r63.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(r63.class)).put(xi4Var, executor);
        }
    }
}
