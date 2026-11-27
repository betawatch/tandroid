// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class up extends uo4 {
    public final /* synthetic */ dq s;
    public final /* synthetic */ gq w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(gq gqVar, gq gqVar2, dq dqVar) {
        super(gqVar2);
        this.w = gqVar;
        this.s = dqVar;
    }

    @Override // uo4
    public final oka b() {
        return this.s;
    }

    @Override // uo4
    public final boolean c() {
        gq gqVar = this.w;
        if (gqVar.getInternalPopup().a()) {
            return true;
        }
        gqVar.f.l(xp.b(gqVar), xp.a(gqVar));
        return true;
    }
}
