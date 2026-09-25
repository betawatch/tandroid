package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class o implements pa.b {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add(((pa.b) it.next()).get());
            }
            this.a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // pa.b
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
