// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tp extends pm4 {
    public final /* synthetic */ cq s;
    public final /* synthetic */ fq w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(fq fqVar, fq fqVar2, cq cqVar) {
        super(fqVar2);
        this.w = fqVar;
        this.s = cqVar;
    }

    @Override // pm4
    public final vga b() {
        return this.s;
    }

    @Override // pm4
    public final boolean c() {
        fq fqVar = this.w;
        if (fqVar.getInternalPopup().a()) {
            return true;
        }
        fqVar.f.m(wp.b(fqVar), wp.a(fqVar));
        return true;
    }
}
