package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
