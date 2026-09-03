package y2;

import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o implements v2.f {
    public final Set a;
    public final i b;
    public final q c;

    public o(Set set, i iVar, q qVar) {
        this.a = set;
        this.b = iVar;
        this.c = qVar;
    }

    public final p a(String str, v2.c cVar, v2.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new p(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
