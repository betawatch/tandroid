package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class ra {
    public final qa a;
    public final Integer b;

    public /* synthetic */ ra(n2.e eVar) {
        this.a = (qa) eVar.b;
        this.b = (Integer) eVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return n6.l.l(this.a, raVar.a) && n6.l.l(this.b, raVar.b) && n6.l.l(null, null) && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
