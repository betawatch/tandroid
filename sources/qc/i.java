package qc;

import java.io.Serializable;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // qc.h
    public final f get(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // qc.h
    public final h minusKey(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this;
    }

    @Override // qc.h
    public final h plus(h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // qc.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
