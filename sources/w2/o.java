package w2;

import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o implements t2.f {
    public final Set a;
    public final i b;
    public final q c;

    public o(Set set, i iVar, q qVar) {
        this.a = set;
        this.b = iVar;
        this.c = qVar;
    }

    public final p a(String str, t2.c cVar, t2.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new p(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
