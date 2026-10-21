package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class sa {
    public final ra a;
    public final Integer b;

    public /* synthetic */ sa(qa qaVar) {
        this.a = (ra) qaVar.a;
        this.b = (Integer) qaVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return n6.l.l(this.a, saVar.a) && n6.l.l(this.b, saVar.b) && n6.l.l(null, null) && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
