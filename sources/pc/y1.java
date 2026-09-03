package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
