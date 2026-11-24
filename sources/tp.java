// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
