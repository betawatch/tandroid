package z7;

import b8.mb;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d implements p {
    public transient a a;
    public transient mb b;

    public final Map a() {
        mb mbVar = this.b;
        if (mbVar != null) {
            return mbVar;
        }
        e eVar = (e) this;
        mb mbVar2 = new mb(eVar, eVar.c, 2);
        this.b = mbVar2;
        return mbVar2;
    }

    public final Set b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        e eVar = (e) this;
        a aVar2 = new a(eVar, eVar.c);
        this.a = aVar2;
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return a().equals(((d) ((p) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((mb) a()).b.hashCode();
    }

    public final String toString() {
        return ((mb) a()).b.toString();
    }
}
