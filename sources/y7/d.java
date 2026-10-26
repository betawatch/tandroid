package y7;

import a8.pb;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class d implements p {
    public transient a a;
    public transient pb b;

    public final Map a() {
        pb pbVar = this.b;
        if (pbVar != null) {
            return pbVar;
        }
        e eVar = (e) this;
        pb pbVar2 = new pb(eVar, eVar.c, 2);
        this.b = pbVar2;
        return pbVar2;
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
        return ((pb) a()).b.hashCode();
    }

    public final String toString() {
        return ((pb) a()).b.toString();
    }
}
