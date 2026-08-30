package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e implements Serializable {
    public final Throwable a;

    public e(Throwable exception) {
        j.e(exception, "exception");
        this.a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.a, ((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
