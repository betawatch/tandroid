package qb;

import java.util.Arrays;
import n6.l;
import o1.i;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class c {
    public final float a;

    public c(i iVar) {
        this.a = iVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return getClass().equals(cVar.getClass()) && Float.compare(this.a, cVar.a) == 0 && l.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.a), null});
    }
}
