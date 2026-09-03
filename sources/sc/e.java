package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
