package z7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class lg implements k {
    public transient fd a;
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
        fd fdVar = this.a;
        if (fdVar != null) {
            return fdVar;
        }
        mg mgVar = (mg) this;
        fd fdVar2 = new fd(mgVar, mgVar.c);
        this.a = fdVar2;
        return fdVar2;
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
