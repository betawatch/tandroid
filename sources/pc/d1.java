package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.g0;
        if (d == 0) {
            kVar.m(this);
            StringBuilder sb = eVar.c;
            sb.append("--!");
            sb.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '-') {
            eVar.c.append("--!");
            kVar.c = a2.h0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.i();
            kVar.c = vVar;
        } else if (d == 65535) {
            kVar.l(this);
            kVar.i();
            kVar.c = vVar;
        } else {
            StringBuilder sb2 = eVar.c;
            sb2.append("--!");
            sb2.append(d);
            kVar.c = z0Var;
        }
    }
}
