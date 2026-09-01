package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public enum y1 extends a2 {
    public y1() {
        super("TagOpen", 7);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == '!') {
            kVar.a(a2.d0);
            return;
        }
        if (i10 == '/') {
            kVar.a(a2.n);
            return;
        }
        if (i10 == '?') {
            kVar.a(a2.c0);
            return;
        }
        if (aVar.o()) {
            kVar.d(true);
            kVar.c = a2.r;
        } else {
            kVar.m(this);
            kVar.f('<');
            kVar.c = a2.a;
        }
    }
}
