package qc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
