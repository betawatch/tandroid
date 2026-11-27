// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
