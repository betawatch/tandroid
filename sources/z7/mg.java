package z7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class mg implements k {
    public transient gd a;
    public transient e9.e b;

    public final Map a() {
        e9.e eVar = this.b;
        if (eVar != null) {
            return eVar;
        }
        ng ngVar = (ng) this;
        e9.e eVar2 = new e9.e(ngVar, ngVar.c, 2);
        this.b = eVar2;
        return eVar2;
    }

    public final Set b() {
        gd gdVar = this.a;
        if (gdVar != null) {
            return gdVar;
        }
        ng ngVar = (ng) this;
        gd gdVar2 = new gd(ngVar, ngVar.c);
        this.a = gdVar2;
        return gdVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return a().equals(((mg) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((e9.e) a()).b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).b.toString();
    }
}
