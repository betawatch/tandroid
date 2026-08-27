package w2;

import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
