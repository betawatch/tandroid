package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum h0 extends a2 {
    public h0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        f0 f0Var = a2.O;
        if (d == 0) {
            kVar.m(this);
            kVar.f((char) 65533);
            kVar.c = f0Var;
        } else if (d == '-') {
            kVar.f(d);
            kVar.c = a2.Q;
        } else if (d == '<') {
            kVar.f(d);
            kVar.c = a2.R;
        } else if (d != 65535) {
            kVar.f(d);
            kVar.c = f0Var;
        } else {
            kVar.l(this);
            kVar.c = a2.a;
        }
    }
}
