package wb;

import java.util.Arrays;
import q6.m;
import r1.f;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        return getClass().equals(cVar.getClass()) && Float.compare(this.a, cVar.a) == 0 && m.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.a), null});
    }
}
