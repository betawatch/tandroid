// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p1b implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ g2b c;

    public p1b(g2b g2bVar, long j, p8c p8cVar) {
        this.c = g2bVar;
        this.a = j;
        this.b = p8cVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new mx8((Object) this, (Object) tLObject, this.a, (Object) this.b, (byte) 12));
    }
}
