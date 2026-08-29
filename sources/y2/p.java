package y2;

import bg.c2;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        c2 c2Var = new c2();
        c2Var.f = new HashMap();
        c2Var.d = Long.valueOf(qVar.a.e());
        c2Var.e = Long.valueOf(qVar.b.e());
        c2Var.a = this.b;
        c2Var.c = new l(this.c, (byte[]) eVar.apply(aVar.b));
        c2Var.b = aVar.a;
        d3.a aVar2 = (d3.a) bVar;
        aVar2.b.execute(new androidx.car.app.utils.c(aVar2, b10, gVar, c2Var.i(), 3));
    }
}
