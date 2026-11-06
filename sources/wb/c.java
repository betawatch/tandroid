package wb;

import java.util.Arrays;
import q6.m;
import r1.f;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class c {
    public final float a;

    public c(f fVar) {
        this.a = fVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return getClass().equals(cVar.getClass()) && Float.compare(this.a, cVar.a) == 0 && m.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.a), null});
    }
}
