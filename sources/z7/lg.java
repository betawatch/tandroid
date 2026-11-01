package z7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class lg implements k {
    public transient ed a;
    public transient e9.e b;

    public final Map a() {
        e9.e eVar = this.b;
        if (eVar != null) {
            return eVar;
        }
        mg mgVar = (mg) this;
        e9.e eVar2 = new e9.e(mgVar, mgVar.c, 2);
        this.b = eVar2;
        return eVar2;
    }

    public final Set b() {
        ed edVar = this.a;
        if (edVar != null) {
            return edVar;
        }
        mg mgVar = (mg) this;
        ed edVar2 = new ed(mgVar, mgVar.c);
        this.a = edVar2;
        return edVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return a().equals(((lg) ((k) obj)).a());
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
