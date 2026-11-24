// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r3a implements RequestDelegate {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ s3a b;

    public r3a(s3a s3aVar, Runnable runnable) {
        this.b = s3aVar;
        this.a = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new q3a((Object) this, (Object) tLObject, (Object) this.a, (byte) 0));
    }
}
