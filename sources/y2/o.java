package y2;

import java.util.Set;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
