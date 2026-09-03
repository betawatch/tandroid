package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum z1 extends a2 {
    public z1() {
        super("EndTagOpen", 8);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        boolean j10 = aVar.j();
        v vVar = a2.a;
        if (j10) {
            kVar.l(this);
            kVar.g("</");
            kVar.c = vVar;
        } else if (aVar.o()) {
            kVar.d(false);
            kVar.c = a2.r;
        } else if (aVar.m('>')) {
            kVar.m(this);
            kVar.a(vVar);
        } else {
            kVar.m(this);
            kVar.a(a2.c0);
        }
    }
}
