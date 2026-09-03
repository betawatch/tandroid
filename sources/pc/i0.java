package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum i0 extends a2 {
    public i0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        f0 f0Var = a2.O;
        if (d == 0) {
            kVar.m(this);
            kVar.f((char) 65533);
            kVar.c = f0Var;
            return;
        }
        if (d == '-') {
            kVar.f(d);
            return;
        }
        if (d == '<') {
            kVar.f(d);
            kVar.c = a2.R;
        } else if (d == '>') {
            kVar.f(d);
            kVar.c = a2.f;
        } else if (d != 65535) {
            kVar.f(d);
            kVar.c = f0Var;
        } else {
            kVar.l(this);
            kVar.c = a2.a;
        }
    }
}
