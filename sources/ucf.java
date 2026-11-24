// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
