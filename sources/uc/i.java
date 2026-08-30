package uc;

import dd.p;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // uc.h
    public final f get(g key) {
        j.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // uc.h
    public final h minusKey(g key) {
        j.e(key, "key");
        return this;
    }

    @Override // uc.h
    public final h plus(h context) {
        j.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // uc.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
