package uc;

import dd.p;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
