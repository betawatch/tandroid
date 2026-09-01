package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public enum b1 extends a2 {
    public b1() {
        super("CommentEnd", 48);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.g0;
        if (d == 0) {
            kVar.m(this);
            StringBuilder sb = eVar.c;
            sb.append("--");
            sb.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '!') {
            kVar.m(this);
            kVar.c = a2.j0;
            return;
        }
        if (d == '-') {
            kVar.m(this);
            eVar.c.append('-');
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
            kVar.m(this);
            StringBuilder sb2 = eVar.c;
            sb2.append("--");
            sb2.append(d);
            kVar.c = z0Var;
        }
    }
}
