package s9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o implements ra.b {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add(((ra.b) it.next()).get());
            }
            this.a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ra.b
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }
}
