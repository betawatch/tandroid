package x7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class e implements q {
    public transient a a;
    public transient e9.d b;

    public final Map a() {
        e9.d dVar = this.b;
        if (dVar != null) {
            return dVar;
        }
        f fVar = (f) this;
        e9.d dVar2 = new e9.d(fVar, fVar.c, 1);
        this.b = dVar2;
        return dVar2;
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
        return ((e9.d) a()).b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).b.toString();
    }
}
