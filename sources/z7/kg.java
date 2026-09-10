package z7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class kg implements k {
    public transient ed a;
    public transient e9.d b;

    public final Map a() {
        e9.d dVar = this.b;
        if (dVar != null) {
            return dVar;
        }
        lg lgVar = (lg) this;
        e9.d dVar2 = new e9.d(lgVar, lgVar.c, 2);
        this.b = dVar2;
        return dVar2;
    }

    public final Set b() {
        ed edVar = this.a;
        if (edVar != null) {
            return edVar;
        }
        lg lgVar = (lg) this;
        ed edVar2 = new ed(lgVar, lgVar.c);
        this.a = edVar2;
        return edVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return a().equals(((kg) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((e9.d) a()).b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).b.toString();
    }
}
