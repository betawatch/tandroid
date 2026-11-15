package wb;

import java.util.Arrays;
import q6.m;
import r1.f;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
