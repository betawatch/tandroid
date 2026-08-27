package rc;

import ad.p;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // rc.h
    public final f get(g key) {
        j.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // rc.h
    public final h minusKey(g key) {
        j.e(key, "key");
        return this;
    }

    @Override // rc.h
    public final h plus(h context) {
        j.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // rc.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
