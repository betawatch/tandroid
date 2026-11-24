// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ucf extends y4f {
    public final /* synthetic */ ief n;

    public ucf(ief iefVar) {
        this.n = iefVar;
    }

    @Override // y4f
    public final String a() {
        h7f h7fVar = (h7f) this.n.a.get();
        return h7fVar == null ? "Completer object has been garbage collected, future will fail soon" : tb4.y("tag=[", String.valueOf(h7fVar.a), "]");
    }
}
