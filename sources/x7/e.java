package x7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
