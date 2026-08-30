package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g implements c, Serializable {
    public dd.a a;
    public volatile Object b;
    public final Object c;

    public g(dd.a initializer) {
        j.e(initializer, "initializer");
        this.a = initializer;
        this.b = h.a;
        this.c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        h hVar = h.a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == hVar) {
                dd.a aVar = this.a;
                j.b(aVar);
                obj = aVar.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.b != h.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
