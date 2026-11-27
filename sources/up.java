// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
