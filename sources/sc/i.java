package sc;

import bd.p;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // sc.h
    public final f get(g key) {
        j.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // sc.h
    public final h minusKey(g key) {
        j.e(key, "key");
        return this;
    }

    @Override // sc.h
    public final h plus(h context) {
        j.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // sc.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
