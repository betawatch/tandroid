// default package

import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class utc implements RequestTimeDelegate {
    public final /* synthetic */ wtc a;
    public final /* synthetic */ vtc b;

    public /* synthetic */ utc(wtc wtcVar, vtc vtcVar) {
        this.a = wtcVar;
        this.b = vtcVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(long j) {
        gl.d3(new d2b((Object) this.a, (Object) this.b, j, (byte) 14));
    }
}
