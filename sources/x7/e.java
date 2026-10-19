package x7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class e implements q {
    public transient a a;
    public transient e9.e b;

    public final Map a() {
        e9.e eVar = this.b;
        if (eVar != null) {
            return eVar;
        }
        f fVar = (f) this;
        e9.e eVar2 = new e9.e(fVar, fVar.c, 1);
        this.b = eVar2;
        return eVar2;
    }

    public final Set b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        f fVar = (f) this;
        a aVar2 = new a(fVar, fVar.c);
        this.a = aVar2;
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return a().equals(((e) ((q) obj)).a());
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
