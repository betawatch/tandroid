package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum r0 extends a2 {
    public r0() {
        super("Rcdata", 2);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            kVar.f((char) 65533);
        } else {
            if (i10 == '&') {
                kVar.a(a2.d);
                return;
            }
            if (i10 == '<') {
                kVar.a(a2.s);
            } else if (i10 != 65535) {
                kVar.g(aVar.g('&', '<', 0));
            } else {
                kVar.h(new g());
            }
        }
    }
}
