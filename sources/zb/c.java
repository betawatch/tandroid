package zb;

import java.util.Arrays;
import o6.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class c {
    public final float a;

    public c(ac.a aVar) {
        this.a = aVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return getClass().equals(cVar.getClass()) && Float.compare(this.a, cVar.a) == 0 && l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.a), null});
    }
}
