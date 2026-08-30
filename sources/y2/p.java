package y2;

import java.util.HashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p {
    public final i a;
    public final String b;
    public final v2.c c;
    public final v2.e d;
    public final q e;

    public p(i iVar, String str, v2.c cVar, v2.e eVar, q qVar) {
        this.a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = qVar;
    }

    public final void a(v2.a aVar, v2.g gVar) {
        v2.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        q qVar = this.e;
        d3.b bVar = qVar.c;
        i b10 = this.a.b(aVar.c);
        a9.a aVar2 = new a9.a();
        aVar2.f = new HashMap();
        aVar2.d = Long.valueOf(qVar.a.X());
        aVar2.e = Long.valueOf(qVar.b.X());
        aVar2.b = this.b;
        aVar2.c = new l(this.c, (byte[]) eVar.apply(aVar.b));
        aVar2.a = aVar.a;
        d3.a aVar3 = (d3.a) bVar;
        aVar3.b.execute(new androidx.car.app.utils.c(aVar3, b10, gVar, aVar2.j(), 1));
    }
}
