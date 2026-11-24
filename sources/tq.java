// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tq extends qo4 {
    public final /* synthetic */ cr s;
    public final /* synthetic */ fr w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(fr frVar, fr frVar2, cr crVar) {
        super(frVar2);
        this.w = frVar;
        this.s = crVar;
    }

    @Override // qo4
    public final xia b() {
        return this.s;
    }

    @Override // qo4
    public final boolean c() {
        fr frVar = this.w;
        if (frVar.getInternalPopup().a()) {
            return true;
        }
        frVar.f.l(wq.b(frVar), wq.a(frVar));
        return true;
    }
}
