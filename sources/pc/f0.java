package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum f0 extends a2 {
    public f0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            kVar.f((char) 65533);
        } else if (i10 == '-') {
            kVar.f(i10);
            kVar.a(a2.P);
        } else if (i10 == '<') {
            kVar.f(i10);
            kVar.a(a2.R);
        } else if (i10 != 65535) {
            kVar.g(aVar.g('-', '<', 0));
        } else {
            kVar.l(this);
            kVar.c = a2.a;
        }
    }
}
